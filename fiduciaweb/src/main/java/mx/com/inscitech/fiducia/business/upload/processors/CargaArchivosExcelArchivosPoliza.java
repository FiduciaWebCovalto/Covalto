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
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.common.util.ExcelDataReader;
import mx.com.inscitech.fiducia.common.util.ExcelDataReader.InvalidRowException;
import mx.com.inscitech.fiducia.common.util.XLSDataReader;
import mx.com.inscitech.fiducia.common.util.XLSXDataReader;
import mx.com.inscitech.fiducia.domain.ArchivosPlanosPolizas;

import org.apache.commons.fileupload.FileItem;
import org.apache.poi.ss.usermodel.DataFormatter;
//import mx.com.inscitech.fiducia.domain.ArchivosPlanos;
public class CargaArchivosExcelArchivosPoliza extends UploadProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(CargaArchivosExcelArchivosPoliza.class);


    /*** Variable que tiene la informacion del header del archivo del TAS*/
    private static List headerInfo;

    /*** Variable que tiene la informacion del cuerpo del archivo del TAS*/
    private static List bodyInfo; /*** Variable para el uso del ORM de Oracle Toplink*/

    /*** Metodo utilizado para conectarse a la base de datos*/
    static {
        headerInfo = new ArrayList();
        bodyInfo = new ArrayList();
    }

    public CargaArchivosExcelArchivosPoliza() {
        super();
    }

    public void run() {

        FileItem file = null;
        String fileName = null;
        Date date = null;    
        ArchivosPlanosPolizas archivosPlanos = null;
        ExcelDataReader excelReader = null;
        DataFormatter formatter = new DataFormatter();
        String val=null;
        String sql = null;
        
        try {


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
            
            excelReader.openWorkBook(theExcelFile);
            
            excelReader.setActiveSheetByNumber(0);
            
            excelReader.setCurrentCell(1, 0);
            
            double cellValue = excelReader.getNumericCellValue(false, "");//  .getStringCellValue(false, "");            
            
            int secuencial = 1, col = 0, rowCount = excelReader.getRowCount();
            for(int i = 1; i < rowCount; i++) {
                
                String line = "";
                //LOGGER.debug("linea no.:"+String.valueOf(i));
                if(i==2)
                    i=2;
                try {
                    
                    for(col = 0; col < 12; col++) {
                      //if(col!=10&col!=8&col!=9&col!=3)  {
                        excelReader.setCurrentCell(i, col);
                       // Cell cell1 = excelReader.get .getRow(i).getCell(0);
                        /*switch(excelReader){
                        }*/
                        if(col==9 )//valores numericos
                            line += excelReader.getNumericCellValue(false, "0").longValue() + ",";
                       // else if(col==1||col==2){//valores date
                       ////     date = excelReader.getDateCellValue (false, "0");
                       //     line += (date.getDate() + "/" + (date.getMonth() + 1) + "/" + (1900 + date.getYear())).toString() + ",";
                       // }    
                        else//valores string
                            line += excelReader.getStringCellValue(false, "0") + ",";
                     //   }
                    }
                    line = line.substring(0, line.length()-1);
                        
                }  catch ( Exception e) {
                    //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Rows ended at: " + i);
                    break;
                }
                
                archivosPlanos = new ArchivosPlanosPolizas();
                archivosPlanos.setArpSecuencial(new BigDecimal(secuencial++));
                archivosPlanos.setArpFecha("01/01/2021");
                archivosPlanos.setArpNomArchivo("POLIZAS");
                archivosPlanos.setArpDescripcion(line);

                if (!archivosPlanos.doInsert()) {
                    throw new Exception("Error al registrar el archivo en Base de Datos. Curent Row: " + i + " Seq: " + secuencial);
                }                
            }
                //se invoca la funcion de carga masiva
                            sql = "{? = call INTERFASES.F_OPERACIONESCONT_MASIVAS(?,?)}";

                            List parametrosQuery = new ArrayList();

                            parametrosQuery.add(new ParametroQueryBean("result", "NUMBER", Integer.valueOf(0), true));
                            parametrosQuery.add(new ParametroQueryBean("TIPO", "NUMBER", 1));
                            parametrosQuery.add(new ParametroQueryBean("FECHA_ARCH", "VARCHAR", ""));
            

                            Object resultadoFuncion = ejecutaProcedimiento(sql, parametrosQuery).get("result");
                            BigDecimal dResultado=new BigDecimal(0);
                            dResultado = new BigDecimal(((BigDecimal) resultadoFuncion ).doubleValue());          
            
            } catch (Exception e) {
                LOGGER.debug("Error "+e);
                //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.ERROR, "Error en la carga de archivos.", e);
            } finally {
                if(excelReader != null) excelReader.closeWorkBook();
                excelReader = null;
            }

    }

    public Object getStateInfo() {
        return null;
    }
}
