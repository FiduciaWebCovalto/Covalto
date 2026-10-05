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
import mx.com.inscitech.fiducia.domain.FjuRdcl;

import org.apache.commons.fileupload.FileItem;
import org.apache.poi.ss.usermodel.DataFormatter;
//import mx.com.inscitech.fiducia.domain.ArchivosPlanos;

public class CargaArchivosExcelRDCImp extends UploadProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(CargaArchivosExcelRDCImp.class);


    /*** Variable que tiene la informacion del header del archivo del TAS*/
    private static List headerInfo;

    /*** Variable que tiene la informacion del cuerpo del archivo del TAS*/
    private static List bodyInfo; /*** Variable para el uso del ORM de Oracle Toplink*/

    /*** Metodo utilizado para conectarse a la base de datos*/
    static {
        headerInfo = new ArrayList();
        bodyInfo = new ArrayList();
    }

    public CargaArchivosExcelRDCImp() {
        super();
    }

    public void run() {

        FileItem file = null;
        String fileName = null;
        Date date = null;    
        FjuRdcl FjuRdcl = null;
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

            parametrosQuery = null;            
            int secuencial = 1, col = 0, rowCount = excelReader.getRowCount();
            long lValor=0;
            int numColXls=8;
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
                          /*if(col==0){//valores numericos
                            sValores[col] =String.valueOf(excelReader.getNumericCellValue(false, "0").longValue());
                        }    
                        else if(col==1){//valores date
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
                
                FjuRdcl = new FjuRdcl();
                FjuRdcl.setFrdIdFideicomiso ( sValores[0]);
                FjuRdcl.setFrdFechaUltimaRdc ( sValores[1]);
                FjuRdcl.setFrdUltimaRdcRecib ( sValores[2]);
                FjuRdcl.setFrdEstadusRdc ( sValores[3]);
                FjuRdcl.setFrdComentariosLegales ( sValores[4]);
                FjuRdcl.setFrdEdoFinancierosPend ( sValores[5]);
                FjuRdcl.setFrdFechaUltimaOpinion ( sValores[6]);
                FjuRdcl.setFrdFechaUltimaCartaresp ( sValores[7]);
                LOGGER.debug("dFolio: "+dFolio);
                FjuRdcl.setFrdFolioWf(dFolio);
              


                

                
                
             //   FjuRdcl = new FjuRdcl();
             //   FjuRdcl.setFrdIdFideicomiso ( new BigDecimal ( sValores[0]));
             //   FjuRdcl.setFrdTipo ( sValores[1]);
             //   FjuRdcl.setFrdFolioRdcl ( sValores[2]);
             //   FjuRdcl.setFrdRequiereRdcl ( sValores[3]);
             //   FjuRdcl.setFrdSeguimientoRdcl ( sValores[4]);
             //   FjuRdcl.setFrdRdc ( sValores[5]);
             //   FjuRdcl.setFrdBase ( sValores[6]);
             //   FjuRdcl.setFrdFolioSocadi ( sValores[7]);
             //   FjuRdcl.setFrdFideicomiso ( sValores[8]);
             //   FjuRdcl.setFrdRelevantes ( sValores[9]);
             //   FjuRdcl.setFrdMesFolSocadi ( new BigDecimal ( sValores[10]));
             //   FjuRdcl.setFrdAnoFolSocadi ( new BigDecimal ( sValores[11]));
             //   FjuRdcl.setFrdClientMangrQueRecib ( sValores[12]);
             //   FjuRdcl.setFrdMedioDeNotifDelCm ( sValores[13]);
             //   FjuRdcl.setFrdMotivoDeLaRendicion ( sValores[14]);
             //   FjuRdcl.setFrdFeDeEntregaARdcl ( sValores[15]);
             //   FjuRdcl.setFrdTipoDeFormato ( sValores[16]);
             //   FjuRdcl.setFrdDivision ( sValores[17]);
             //   FjuRdcl.setFrdEstatus ( sValores[18]);
             //   FjuRdcl.setFrdObservaciones ( sValores[19]);
             //   FjuRdcl.setFrdRegistradoPor ( sValores[20]);
             //   FjuRdcl.setFrdMaesto ( sValores[21]);
             //   FjuRdcl.setFrdStatusFsoMto ( sValores[22]);
             //   FjuRdcl.setFrdCobranza ( sValores[23]);
             //   FjuRdcl.setFrdOrigen ( sValores[24]);
             //   FjuRdcl.setFrdRdclAdmonDelegPto ( sValores[25]);
             //   FjuRdcl.setFrdAdministradores ( sValores[26]);
             //   FjuRdcl.setFrdEnvioFiduciario ( sValores[27]);
             //   FjuRdcl.setFrdNotifDeOrigen ( sValores[28]);
             //   FjuRdcl.setFrdFecDeRen ( sValores[29]);
             //   FjuRdcl.setFrdMesRev ( new BigDecimal ( sValores[30]));
             //   FjuRdcl.setFrdAnoRev ( new BigDecimal ( sValores[31]));
             //   FjuRdcl.setFrdPerDeLaRend ( sValores[32]);
             //   FjuRdcl.setFrdDetDeRend ( sValores[33]);
             //   FjuRdcl.setFrdApodQueFmaRen ( sValores[34]);
             //   FjuRdcl.setFrdPodDeLaRen ( sValores[35]);
             //   FjuRdcl.setFrdComentarios ( sValores[36]);
             //   FjuRdcl.setFrdDocuAnexa ( sValores[37]);
             //   FjuRdcl.setFrdDocuFalPorRequerir ( sValores[38]);
             //   FjuRdcl.setFrdFecDeReqAFidPorIncts ( sValores[39]);
             //   FjuRdcl.setFrdFecDeComuACte ( sValores[40]);
             //   FjuRdcl.setFrdFecRdcComp ( sValores[41]);
             //   FjuRdcl.setFrdRendDeCtasOp ( sValores[42]);
             //   FjuRdcl.setFrdRendDeCtasLeg ( sValores[43]);
              //  FjuRdcl.setFrdRmnCartaInstDto ( sValores[44]);
             //   FjuRdcl.setFrdInmueble ( sValores[45]);
             //   FjuRdcl.setFrdFeCtaInstr ( sValores[46]);
             //   FjuRdcl.setFrdQInstYFmaCtaIns ( sValores[47]);
             //   FjuRdcl.setFrdEscritura ( sValores[48]);
             //   FjuRdcl.setFrdFechaDeEscritura ( sValores[49]);
             //   FjuRdcl.setFrdNotariaNo ( new BigDecimal ( sValores[50]));
             //   FjuRdcl.setFrdNotario ( sValores[51]);
             //   FjuRdcl.setFrdEntidad ( sValores[52]);
             //   FjuRdcl.setFrdTipoDePoder ( sValores[53]);
             //   FjuRdcl.setFrdFacultades ( sValores[54]);
             //   FjuRdcl.setFrdVigencia ( sValores[55]);
             //   FjuRdcl.setFrdApoderados ( sValores[56]);
             //   FjuRdcl.setFrdDomicilio ( sValores[57]);
             //   FjuRdcl.setFrdImagenDelPoder ( sValores[58]);
             //   FjuRdcl.setFrdNotasObv ( sValores[59]);
             //   FjuRdcl.setFrdJuiEnBaseDeJuicios ( sValores[60]);
             //   FjuRdcl.setFrdFideConJuicios ( sValores[61]);
             //   FjuRdcl.setFrdNombreActorDteQjo ( sValores[62]);
             //   FjuRdcl.setFrdDemandadoTroInt ( sValores[63]);
             //   FjuRdcl.setFrdExpediente ( sValores[64]);
             //   FjuRdcl.setFrdJuzgado ( sValores[65]);
             //   FjuRdcl.setFrdTipoJuzgado ( sValores[66]);
             //   FjuRdcl.setFrdTipoJuicio ( new BigDecimal ( sValores[67]));
             //   FjuRdcl.setFrdLocalidad ( sValores[68]);
             //   FjuRdcl.setFrdEstado ( sValores[69]);
             //   FjuRdcl.setFrdPrestReclamadas ( sValores[70]);
             //   FjuRdcl.setFrdEdoProcJuicio ( sValores[71]);
             //   FjuRdcl.setFrdDefACargoDe ( sValores[72]);
             //   FjuRdcl.setFrdConstProc ( sValores[73]);
             //   FjuRdcl.setFrdCtdaBaseDeJuicios ( sValores[74]);
             //   FjuRdcl.setFrdFolioJuicios ( sValores[75]);
                if (!FjuRdcl.doInsert()) {
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
