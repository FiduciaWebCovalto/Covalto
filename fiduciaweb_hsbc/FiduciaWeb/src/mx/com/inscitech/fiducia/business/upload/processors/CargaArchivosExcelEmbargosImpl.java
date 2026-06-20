package  mx.com.inscitech.fiducia.business.upload.processors;

import java.io.File;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mx.com.inscitech.fiducia.business.upload.UploadProcessor;
import mx.com.inscitech.fiducia.common.beans.ParametroQueryBean;
import mx.com.inscitech.fiducia.common.util.ExcelDataReader;
import mx.com.inscitech.fiducia.common.util.ExcelDataReader.InvalidRowException;
import mx.com.inscitech.fiducia.common.util.XLSDataReader;
import mx.com.inscitech.fiducia.common.util.XLSXDataReader;
import mx.com.inscitech.fiducia.domain.FjuEmbargos;

import org.apache.commons.fileupload.FileItem;
import org.apache.poi.ss.usermodel.DataFormatter;
//import mx.com.inscitech.fiducia.domain.ArchivosPlanos;

public class CargaArchivosExcelEmbargosImpl extends UploadProcessor {

    /*** Variable que tiene la informacion del header del archivo del TAS*/
    private static List headerInfo;

    /*** Variable que tiene la informacion del cuerpo del archivo del TAS*/
    private static List bodyInfo; /*** Variable para el uso del ORM de Oracle Toplink*/

    /*** Metodo utilizado para conectarse a la base de datos*/
    static {
        headerInfo = new ArrayList();
        bodyInfo = new ArrayList();
    }

    public CargaArchivosExcelEmbargosImpl() {
        super();
    }

    public void run() {

        FileItem file = null;
        String fileName = null;
        Date date = null;    
        FjuEmbargos FjuEmbargos = null;
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

            parametrosQuery.add(new ParametroQueryBean("result", "NUMBER", new Integer(0), true));
            parametrosQuery.add(new ParametroQueryBean("TIPO_FOLIO", "NUMBER", 2));

            Object resultadoFuncion = ejecutaProcedimiento(sql, parametrosQuery).get("result");
            BigDecimal dFolio=new BigDecimal(0);
            dFolio = new BigDecimal(((BigDecimal) resultadoFuncion ).doubleValue());


            parametrosQuery = null;            
            int secuencial = 1, col = 0, rowCount = excelReader.getRowCount();
            long lValor=0;
            int numColXls=6;
            sValores = new String[numColXls];
            for(int i = 1; i < rowCount; i++) {
                //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Linea: " + String.valueOf(i));                
                //setPercent(new BigDecimal((i * 90)/rowCount).intValue() + 10);
                
                String line = "";
                //System.out.println("linea no.:"+String.valueOf(i));
                if(i==2)
                    i=2;
                try {
                    
                    for(col = 0; col < numColXls; col++) {
                        System.out.println("col no.:"+String.valueOf(col));
                      //if(col!=0)  {
                        excelReader.setCurrentCell(i, col);
                        System.out.println("Valor: "+excelReader.getStringCellValue(false, "0"));
                        sValores[col] =excelReader.getStringCellValue(false, "0");
                        
                       // Cell cell1 = excelReader.get .getRow(i).getCell(0);
                        /*switch(excelReader){
                        }*/
                        /*if(col==0||col==1){//valores numericos
                            sValores[col] =String.valueOf(excelReader.getNumericCellValue(false, "0").longValue());
                        }    
                        else if(col==9||col==27||col==34){//valores date
                            date = excelReader.getDateCellValue (false, "0");
                            sValores[col] =date.toString();
                        }
                        else//valores string
                            sValores[col] =excelReader.getStringCellValue(false, "0");
                        }*/
                    }
                        
                } catch(InvalidRowException ire) {
                    //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Rows ended at: " + i);
                    break;
                }
                /*
                "FEM_ID_FIDEICOMISO"
                "FEM_TIPO_DE_EMBARGO"
                "FEM_MONTO_EMBARGADO"
                "FEM_DESCRIPCION_INMUEBLE"
                "FEM_NO_DE_OFICIO"
                "FEM_DICTAMEN_LEGAL"
                */
                FjuEmbargos = new FjuEmbargos();
                FjuEmbargos.setFemIdFideicomiso ( sValores[0]);
                FjuEmbargos.setFemTipoDeEmbargo ( sValores[1]);
                FjuEmbargos.setFemMontoEmbargado ( sValores[2]);
                FjuEmbargos.setFemDescripcionInmueble ( sValores[3]);
                FjuEmbargos.setFemNoDeOficio (sValores[4]);
                FjuEmbargos.setFemDictamenLegal (sValores[5]);
                FjuEmbargos.setFemFolioWf(dFolio);
                if (!FjuEmbargos.doInsert()) {
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
