package  mx.com.inscitech.fiducia.business.upload.processors;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import mx.com.inscitech.fiducia.domain.FjuPoderes;

import org.apache.commons.fileupload.FileItem;
import org.apache.poi.ss.usermodel.DataFormatter;

public class CargaArchivosExcelPoderesImpl extends UploadProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(CargaArchivosExcelPoderesImpl.class);


    /*** Variable que tiene la informacion del header del archivo del TAS*/
    private static List headerInfo;

    /*** Variable que tiene la informacion del cuerpo del archivo del TAS*/
    private static List bodyInfo; /*** Variable para el uso del ORM de Oracle Toplink*/

    /*** Metodo utilizado para conectarse a la base de datos*/
    static {
        headerInfo = new ArrayList();
        bodyInfo = new ArrayList();
    }

    public CargaArchivosExcelPoderesImpl() {
        super();
    }

    public void run() {

        FileItem file = null;
        String fileName = null;
        Date date = null;    
        FjuPoderes FjuPoderes = null;
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
            LOGGER.debug("Valor de fileName Excel"+fileName);
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
            LOGGER.debug("dFolio: "+dFolio);

            parametrosQuery = null;            
            int secuencial = 1, col = 0, rowCount = excelReader.getRowCount();
            long lValor=0;
            int numColXls=9;
            sValores = new String[numColXls];
            for(int i = 1; i < rowCount; i++) {
                //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Linea: " + String.valueOf(i));                
                //setPercent(new BigDecimal((i * 90)/rowCount).intValue() + 10);
                
                String line = "";
                //LOGGER.debug("linea no.:"+String.valueOf(i));
                if(i==2)
                    i=2;
                try {
                    
                    for(col = 0; col < numColXls; col++) {
                        LOGGER.debug("col no.:"+String.valueOf(col));
                      //if(col!=0)  {
                        excelReader.setCurrentCell(i, col);
                        //LOGGER.debug("Valor: "+excelReader.getStringCellValue(false, "0"));
                        sValores[col] =excelReader.getStringCellValue(false, "0");
                        
                       // Cell cell1 = excelReader.get .getRow(i).getCell(0);
                        /*switch(excelReader){
                        }*/
                        /*if(col==0||col==4){//valores numericos FpoIdFideicomiso,FpoNoDeNot
                            sValores[col] =String.valueOf(excelReader.getNumericCellValue(false, "0").longValue());
                        }    
                        /*else if(col==2){//valores date
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
             
                FjuPoderes = new FjuPoderes();
                FjuPoderes.setFpoIdFideicomiso ( sValores[0]);
                FjuPoderes.setFpoApoderado ( sValores[1]);
                FjuPoderes.setFpoFechaEscritura ( sValores[2]);
                FjuPoderes.setFpoEscritura ( sValores[3]);
                FjuPoderes.setFpoNoDeNot (  sValores[4]);
                FjuPoderes.setFpoVigPoder ( sValores[5]);
                FjuPoderes.setFpoPeriodicidad ( sValores[6]);
                FjuPoderes.setFpoFacultad ( sValores[7]);
                FjuPoderes.setFpoEstaRevocado ( sValores[8]);
                FjuPoderes.setFpoFolioWf(dFolio);  
               
                
             //   FjuPoderes = new FjuPoderes();
              //  FjuPoderes.setFpoIdFideicomiso ( new BigDecimal ( sValores[0]));
             //   FjuPoderes.setFpoBase ( sValores[1]);
            //  FjuPoderes.setFpoEnSist ( sValores[2]);
             //   FjuPoderes.setFpoImagen ( sValores[3]);
             //   FjuPoderes.setFpoFsoCobranza ( sValores[4]);
             //   FjuPoderes.setFpoIdFidei ( new BigDecimal ( sValores[5]));
             //   FjuPoderes.setFpoFideiNombre ( sValores[6]);
             //   FjuPoderes.setFpoFideiVige ( sValores[7]);
             //   FjuPoderes.setFpoEsaPoderdante ( sValores[8]);
             //   FjuPoderes.setFpoReprs ( sValores[9]);
             //   FjuPoderes.setFpoNombre ( sValores[10]);
             //   FjuPoderes.setFpoApellidos ( sValores[11]);
             //   FjuPoderes.setFpoDomicilio ( sValores[12]);
             //   FjuPoderes.setFpoEscritura ( sValores[13]);
             //   FjuPoderes.setFpoFechaEscritura ( sValores[14]);
             //   FjuPoderes.setFpoTipo ( sValores[15]);
             //   FjuPoderes.setFpoCartaDeAcept ( sValores[16]);
             //   FjuPoderes.setFpoFechaCarta ( sValores[17]);
             //   FjuPoderes.setFpoFolioSocUltiRdcl ( sValores[18]);
             //   FjuPoderes.setFpoFeUltiRdcl ( sValores[19]);
             //   FjuPoderes.setFpoDescRdcl ( sValores[20]);
             //   FjuPoderes.setFpoVigPoder ( sValores[21]);
             //   FjuPoderes.setFpoFinPoder ( sValores[22]);
             //   FjuPoderes.setFpoEstatPoder ( sValores[23]);
             //   FjuPoderes.setFpoEstaRevocado ( sValores[24]);
             //   FjuPoderes.setFpoAlertaVenc ( sValores[25]);
             //   FjuPoderes.setFpoEscrituraRevoca ( sValores[26]);
             //   FjuPoderes.setFpoHistRevoca ( sValores[27]);
             //   FjuPoderes.setFpoNoDeNot ( new BigDecimal ( sValores[28]));
             //   FjuPoderes.setFpoNotario ( sValores[29]);
             //   FjuPoderes.setFpoLocalidadNot ( sValores[30]);
             //   FjuPoderes.setFpoEstadoNot ( sValores[31]);
             //   FjuPoderes.setFpoPlaza ( sValores[32]);
             //   FjuPoderes.setFpoFacultad ( sValores[33]);
             //   FjuPoderes.setFpoAsuntoLim ( sValores[34]);
             //   FjuPoderes.setFpoTipoPoder ( sValores[35]);
             //   FjuPoderes.setFpoRendicionCts ( sValores[36]);
             //   FjuPoderes.setFpoFolioSolPoder ( sValores[37]);
             //   FjuPoderes.setFpoFolioOAgenda ( sValores[38]);
             //   FjuPoderes.setFpoNuConsecTest ( sValores[39]);
             //   FjuPoderes.setFpoNoTest ( sValores[40]);
             //   FjuPoderes.setFpoContacto ( sValores[41]);
             //   FjuPoderes.setFpoComentarios ( sValores[42]);
             //   FjuPoderes.setFpoFolioWf(dFolio);   
                if (!FjuPoderes.doInsert()) {
                    throw new Exception("Error al registrar el archivo en Base de Datos. Curent Row: " + i + " Seq: " + secuencial);
                }                
            }

            //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Total de Registros Cargados: " + secuencial);
            //setMessage("Operacion realizada con exito! Registros Procesados: " + secuencial);        
            
        } catch (Exception e) {
            LOGGER.debug("Error "+e);
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
