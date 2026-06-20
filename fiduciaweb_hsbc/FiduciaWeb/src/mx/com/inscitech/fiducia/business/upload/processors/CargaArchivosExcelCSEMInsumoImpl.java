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
import mx.com.inscitech.fiducia.domain.CsemInsumo;

import org.apache.commons.fileupload.FileItem;
import org.apache.poi.ss.usermodel.DataFormatter;
//import mx.com.inscitech.fiducia.domain.ArchivosPlanos;

public class CargaArchivosExcelCSEMInsumoImpl extends UploadProcessor {

    /*** Variable que tiene la informacion del header del archivo del TAS*/
    private static List headerInfo;

    /*** Variable que tiene la informacion del cuerpo del archivo del TAS*/
    private static List bodyInfo; /*** Variable para el uso del ORM de Oracle Toplink*/

    /*** Metodo utilizado para conectarse a la base de datos*/
    static {
        headerInfo = new ArrayList();
        bodyInfo = new ArrayList();
    }

    public CargaArchivosExcelCSEMInsumoImpl() {
        super();
    }

    public void run() {

        FileItem file = null;
        String fileName = null;
        Date date = null;    
        CsemInsumo CSEMInsumo = null;
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
            int numColXls=18;
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
                        sValores[col] =excelReader.getStringCellValue(false, "0");
                        
                       // Cell cell1 = excelReader.get .getRow(i).getCell(0);
                        /*switch(excelReader){
                        }*/
                        /*if(col==0||col==1){//valores numericos
                            sValores[col] =String.valueOf(excelReader.getNumericCellValue(false, "0").longValue());
                        }    
                        /*else if(col==9||col==27||col==34){//valores date
                            date = excelReader.getDateCellValue (false, "0");
                            sValores[col] =date.toString();
                        }
                        else//valores string
                            sValores[col] =excelReader.getStringCellValue(false, "0");
                        //}*/
                    }
                        
                } catch(InvalidRowException ire) {
                    //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Rows ended at: " + i);
                    break;
                }
                /*
                "CSEM_NUM_CIS"
                "CSEM_NOM_CLIENTE_HOGAN"
                "CSEM_NOM_CLIENTE_HOGAN_2"
                "CSEM_CALLE_NUM"
                "CSEM_CALLE_NUM_COLONIA"
                "CSEM_COLONIA"
                "CSEM_CP_ESTADO"
                "CSEM_PAIS"
                "CSEM_RFC"
                "CSEM_FECHA_NAC"
                */
                CSEMInsumo = new CsemInsumo();
                CSEMInsumo.setCsemNumCis ( new BigDecimal ( sValores[0]));
                CSEMInsumo.setCsemNomClienteHogan (sValores[1]);
                CSEMInsumo.setCsemNomClienteHogan2 (sValores[2]);
                CSEMInsumo.setCsemCalleNum (sValores[3]);
                CSEMInsumo.setCsemCalleNumColonia (sValores[4]);
                CSEMInsumo.setCsemColonia (sValores[5]);
                CSEMInsumo.setCsemCpEstado (sValores[6]);
                CSEMInsumo.setCsemPais (sValores[7]);
                CSEMInsumo.setCsemRfc (sValores[8]);
                CSEMInsumo.setCsemFechaNac (sValores[9]);
                CSEMInsumo.setCsemPais2(sValores[10]);
                CSEMInsumo.setCsemCpEstadoProv(sValores[11]);
                CSEMInsumo.setCsemCalle(sValores[12]);
                CSEMInsumo.setCsemNumExt(sValores[13]);
                CSEMInsumo.setCsemNumInt(sValores[14]);
                CSEMInsumo.setCsemColoniaUrb(sValores[15]);
                CSEMInsumo.setCsemCp(sValores[16]);
                CSEMInsumo.setCsemNomClienteHogan3(sValores[17]);
                CSEMInsumo.setCsemFoliowf(dFolio);
                if (!CSEMInsumo.doInsert()) {
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
