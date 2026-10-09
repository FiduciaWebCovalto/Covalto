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
import mx.com.inscitech.fiducia.domain.FjuJuicios;

import org.apache.commons.fileupload.FileItem;
import org.apache.poi.ss.usermodel.DataFormatter;

public class CargaArchivosExcelJuiciosImpl extends UploadProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(CargaArchivosExcelJuiciosImpl.class);


    /*** Variable que tiene la informacion del header del archivo del TAS*/
    private static List headerInfo;

    /*** Variable que tiene la informacion del cuerpo del archivo del TAS*/
    private static List bodyInfo; /*** Variable para el uso del ORM de Oracle Toplink*/

    /*** Metodo utilizado para conectarse a la base de datos*/
    static {
        headerInfo = new ArrayList();
        bodyInfo = new ArrayList();
    }

    public CargaArchivosExcelJuiciosImpl() {
        super();
    }

    public void run() {

        FileItem file = null;
        String fileName = null;
        Date date = null;    
        FjuJuicios FjuJuicios = null;
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
            
            //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Sheet Data { Column Count: " + excelReader.getColumnCount() + ", Row Count: " + excelReader.getRowCount() + " }");
            //excelReader.setCurrentCell(1, 0);
            
            //double cellValue = excelReader.getNumericCellValue(false, "");//  .getStringCellValue(false, "");            
            //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Test cellValue: " + cellValue);
            sql = "{? = call HONORARIOS.F_Pro_Asigna_Folio(?)}";

            List parametrosQuery = new ArrayList();

            parametrosQuery.add(new ParametroQueryBean("result", "NUMBER", Integer.valueOf(0), true));
            parametrosQuery.add(new ParametroQueryBean("TIPO_FOLIO", "NUMBER", 2));

            Object resultadoFuncion = ejecutaProcedimiento(sql, parametrosQuery).get("result");
            BigDecimal dFolio=new BigDecimal(0);
            dFolio = new BigDecimal(((BigDecimal) resultadoFuncion ).doubleValue());
            //int iFolio=(int)resultadoFuncion;

            parametrosQuery = null;            
            int secuencial = 1, col = 0, rowCount = excelReader.getRowCount();
            long lValor=0;
            int numColXls=48;
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
                        LOGGER.debug("Valor: "+excelReader.getStringCellValue(false, "0"));
                        sValores[col] =excelReader.getStringCellValue(false, "0");
                        
                       // Cell cell1 = excelReader.get .getRow(i).getCell(0);
                        /*switch(excelReader){
                        }*/
                        /*if(col==1||col==2||col==19||col==41||col==42 ){//valores numericos
                            lValor=excelReader.getNumericCellValue(false, "0").longValue();
                            sValores[col] =String.valueOf(excelReader.getNumericCellValue(false, "0").longValue());
                        }    
                        else if(col==18||col==20||col==21||col==40||col==47){//valores date
                            date = excelReader.getDateCellValue (false, "0");
                            sValores[col] =date.toString();
                        }  
                        else{//valores string
                            sValores[col] =excelReader.getStringCellValue(false, "0");
                        }*/
                        //}
                    }
                        
                } catch(InvalidRowException ire) {
                    //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Rows ended at: " + i);
                    break;
                }
                
                FjuJuicios = new FjuJuicios();
                FjuJuicios.setFjuFideicomiso ( sValores[0]);
                FjuJuicios.setFjuJuicio ( sValores[1]);
                FjuJuicios.setFjuNo ( sValores[2]);
                FjuJuicios.setFjuAno ( sValores[3]);
                FjuJuicios.setFjuMes ( sValores[4]);
                FjuJuicios.setFjuFolioRdcl ( sValores[5]);
                FjuJuicios.setFjuOrigNot ( sValores[6]);
                FjuJuicios.setFjuAgregPor ( sValores[7]);
                FjuJuicios.setFjuFsoConPoder ( sValores[8]);
                FjuJuicios.setFjuMaestro ( sValores[9]);
                FjuJuicios.setFjuCobranza ( sValores[10]);
                FjuJuicios.setFjuAdmonOPrestador ( sValores[11]);
                FjuJuicios.setFjuTipoDeFid ( sValores[12]);
                FjuJuicios.setFjuLtgNumero ( sValores[13]);
                FjuJuicios.setFjuCtlInt ( sValores[14]);
                FjuJuicios.setFjuEstatus ( sValores[15]);
                FjuJuicios.setFjuEstJuicioVigConcl ( sValores[16]);
                FjuJuicios.setFjuObservParaMesaDeCntrl ( sValores[17]);
                FjuJuicios.setFjuFechaConocimiento ( sValores[18]);
                FjuJuicios.setFjuAnoRecepcion ( sValores[19]);
                FjuJuicios.setFjuFechaDeInicio ( sValores[20]);
                FjuJuicios.setFjuFechaEmplaza ( sValores[21]);
                FjuJuicios.setFjuParte ( sValores[22]);
                FjuJuicios.setFjuNombreActDmtQuejoso ( sValores[23]);
                FjuJuicios.setFjuDmtTerceroDemandado ( sValores[24]);
                FjuJuicios.setFjuTipoDeExp ( sValores[25]);
                FjuJuicios.setFjuExpediente ( sValores[26]);
                FjuJuicios.setFjuFuero ( sValores[27]);
                FjuJuicios.setFjuJuzgado ( sValores[28]);
                FjuJuicios.setFjuTipoJuzgado ( sValores[29]);
                FjuJuicios.setFjuTipoJuicio ( sValores[30]);
                FjuJuicios.setFjuEstado ( sValores[31]);
                FjuJuicios.setFjuLocalidad ( sValores[32]);
                FjuJuicios.setFjuPrestReclamadas ( sValores[33]);
                FjuJuicios.setFjuCausales ( sValores[34]);
                FjuJuicios.setFjuRptProyectoMah1020 ( sValores[35]);
                FjuJuicios.setFjuEstatEdoProcJuicio ( sValores[36]);
                FjuJuicios.setFjuDfsaACargoDe ( sValores[37]);
                FjuJuicios.setFjuObservGrals ( sValores[38]);
                FjuJuicios.setFjuDescripUltAct ( sValores[39]);
                FjuJuicios.setFjuFechaUltAct ( sValores[40]);
                FjuJuicios.setFjuImpDemandadoMxn ( sValores[41]);
                FjuJuicios.setFjuImpDemandadoUsd ( sValores[42]);
                FjuJuicios.setFjuCalifDeRiesgo ( sValores[43]);
                FjuJuicios.setFjuComCalifDeRiesg ( sValores[44]);
                FjuJuicios.setFjuEstrategia ( sValores[45]);
                FjuJuicios.setFjuOutstandingLitigation ( sValores[46]);
                FjuJuicios.setFjuFechaInfoDelClt ( sValores[47]);
                FjuJuicios.setFjuFolioWf(dFolio);

                if (!FjuJuicios.doInsert()) {
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
