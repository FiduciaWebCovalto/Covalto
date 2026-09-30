package  mx.com.inscitech.fiducia.business.upload.processors;



import java.io.File;



import java.io.InputStreamReader;



import java.math.BigDecimal;



import java.util.ArrayList;

import java.util.Date;

import java.util.List;



import java.util.Map;



import mx.com.inscitech.fiducia.business.upload.UploadProcessor;

import mx.com.inscitech.fiducia.common.beans.ParametroQueryBean;

import mx.com.inscitech.fiducia.common.services.LoggingService;

//import mx.com.inscitech.fiducia.domain.ArchivosPlanos;

import mx.com.inscitech.fiducia.common.util.ExcelDataReader;

import mx.com.inscitech.fiducia.common.util.ExcelDataReader.InvalidRowException;

import mx.com.inscitech.fiducia.common.util.XLSDataReader;

import mx.com.inscitech.fiducia.common.util.XLSXDataReader;





import mx.com.inscitech.fiducia.domain.FCondato;



import org.apache.commons.fileupload.FileItem;



import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.ss.usermodel.DateUtil;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class CargaArchivosMoralExtranjera extends UploadProcessor {



    /*** Variable que tiene la informacion del header del archivo del TAS*/

    private static List headerInfo;



    /*** Variable que tiene la informacion del cuerpo del archivo del TAS*/

    private static List bodyInfo; /*** Variable para el uso del ORM de Oracle Toplink*/



    /*** Metodo utilizado para conectarse a la base de datos*/

    static {

        headerInfo = new ArrayList();

        bodyInfo = new ArrayList();

    }



    public CargaArchivosMoralExtranjera() {

        super();

    }



    public void run() {



        FileItem file = null;

        String fileName = null;

        Date date = null;    

        FCondato FCondato = null;

        ExcelDataReader excelReader = null;

        DataFormatter formatter = new DataFormatter();

        String val=null;

        String sValores []=null;

        String sql = null;

        String secuencia = null;   

        String sValor=null;

        

        try {



            //setStarted(true);



            file = (FileItem) this.files.get(0);

            fileName = file.getName();



            if (fileName.indexOf("\\") != -1) {

                fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);

            }



            if (fileName.indexOf("/") != -1) {

                fileName = fileName.substring(fileName.lastIndexOf("/") + 1);

            }



            if(fileName.toLowerCase().indexOf(".xlsx") != -1) {

                excelReader = new XLSXDataReader();

            } else {

                excelReader = new XLSDataReader();

            }

            System.out.println("Valor de fileName Excel"+fileName);

            File theExcelFile = new File(fileName);

            file.write(theExcelFile);

            //setPercent(5);

            

            //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "About to open the Excel File: [" + theExcelFile.getAbsolutePath() + "]");

            excelReader.openWorkBook(theExcelFile);

            //setPercent(10);

            

            //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Excel File Opened Succesfully! Sheets: " + excelReader.getSheetCount());

            excelReader.setActiveSheetByNumber(0);

            

            //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Test cellValue: " + cellValue);

            sql = "{? = call HONORARIOS.F_Pro_Asigna_Folio(?)}";



            List parametrosQuery = new ArrayList();



            parametrosQuery.add(new ParametroQueryBean("result", "NUMBER", Integer.valueOf(0), true));

            parametrosQuery.add(new ParametroQueryBean("TIPO_FOLIO", "NUMBER", 2));



            Object resultadoFuncion = ejecutaProcedimiento(sql, parametrosQuery).get("result");

            BigDecimal dFolio=new BigDecimal(0);

            dFolio = new BigDecimal(((BigDecimal) resultadoFuncion ).doubleValue());





            parametrosQuery = null;            

            int secuencial = 1, col = 0, rowCount = excelReader.getRowCount();

            long lValor=0;

            sValores = new String[36];

            for(int i = 1; i < rowCount; i++) {

                //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Linea: " + String.valueOf(i));                

                //setPercent(new BigDecimal((i * 90)/rowCount).intValue() + 10);

                

                String line = "";

                //System.out.println("linea no.:"+String.valueOf(i));

                if(i==2)

                    i=2;

                try {

                    

                    for(col = 0; col < 36; col++) {

                        System.out.println("col no.:"+String.valueOf(col));

                      //if(col!=0)  {

                        excelReader.setCurrentCell(i, col);

                        

                       // Cell cell1 = excelReader.get .getRow(i).getCell(0);

                        /*switch(excelReader){

                        }*/

                        if(col==0||col==1||col==2||col==3||col==5||col==6||col==7){//valores numericos

                            sValores[col] =String.valueOf(excelReader.getNumericCellValue(false, "0").longValue());

                        }    

                        /*else if(col==9||col==27||col==34){//valores date

                            date = excelReader.getDateCellValue (false, "0");

                            sValores[col] =date.toString();

                        }*/

                        else//valores string

                            sValores[col] =excelReader.getStringCellValue(false, "0");

                        //}

                    }

                        

                } catch(InvalidRowException ire) {

                    //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Rows ended at: " + i);

                    break;

                }

                FCondato = new FCondato();

                FCondato.setCondIdPersona(sValores[0]); // ESTE CAMPO NO VIENE EN EL LAYOUT PERO ES REQUERIDO, se contempla que se agregará en el layout

                FCondato.setCondIdFideicomiso(new BigDecimal (sValores[1]));

                FCondato.setCondIdTipo(new BigDecimal (sValores[2]));

                FCondato.setCondIdNumTipo(new BigDecimal (sValores[3]));

                FCondato.setCondIdConcepto(new BigDecimal (sValores[5]));

                FCondato.setCondIdSconcepto(new BigDecimal (sValores[6]));

                FCondato.setCondIdSsconcepto(new BigDecimal (sValores[7]));

                FCondato.setCondValor(sValores[10]);

                /*FCondato.setCondExisteDoc();

                FCondato.setCondUnicacion();

                FCondato.setCondEstatus();*/

                if (!FCondato.doInsert()) {

                    throw new Exception("Error al registrar el archivo en Base de Datos. Curent Row: " + i + " Seq: " + secuencial);

                }                

            }



            //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Total de Registros Cargados: " + secuencial);

            //setMessage("Operacion realizada con exito! Registros Procesados: " + secuencial);        

            

        } catch (Exception e) {

            System.out.println("Error "+e);

            //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.ERROR, "Error en la carga de archivos.", e);

        } finally {

            if(excelReader != null) excelReader.closeWorkBook();

            excelReader = null;

        }

        

        //setPercent(100);

        //setFinished(true);

    }



    public Object getStateInfo() {

        return null;

    }

}

