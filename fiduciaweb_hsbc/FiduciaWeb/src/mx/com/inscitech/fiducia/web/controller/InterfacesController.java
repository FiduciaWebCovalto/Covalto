package mx.com.inscitech.fiducia.web.controller;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.common.beans.GenericResponseBean;
import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.dml.GenericDML;
import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;

import org.springframework.web.servlet.ModelAndView;

//TODO: Mover logica de negocio fuera del controller
public class InterfacesController extends JsonActionController {

    private static final String ARCHIVOS_PLANOS_SQL = "INSERT INTO ARCHIVOS_PLANOS (ARP_SECUENCIAL, ARP_FECHA, ARP_NOM_ARCHIVO, ARP_DESCRIPCION) VALUES (?, ?, ?, ?)";

    private static final String[] PS_Lines;

    private String peopleSoftFile = null;
    private String sibFile = null;
    
    private static boolean configSet = false;
    
    static {
        PS_Lines = new String[] {
            "301801051510001110202000000_14100001     20000     1103230010492A      MXNMX40040001IFRS492202011121000000005209620934201011010                    ASF29     \n",
            "301805011111001610100000000_13300002     20000     5102310038492A      MXNMX40040001IFRS492202011120000000005209620934201011010                    ASF29     \n",
            "TO20201112000000000200000000052096209300000000052096209300000000010000000001                                                                                 \n"
        };
    }
    
    private void setConfig() {
        if(configSet) return;
        ConfigurationService cfg = ConfigurationService.getInstance();
        this.peopleSoftFile = cfg.getProperty("975");
        this.sibFile = cfg.getProperty("974");
        
        if(peopleSoftFile == null) {
            this.peopleSoftFile = cfg.getProperty("peopleSoftFile");            
        }

        if(sibFile == null) {
            this.sibFile = cfg.getProperty("sibFile");
        }
        
        configSet = true;
    }
    
    public InterfacesController() {
        super();
    }
    
    public ModelAndView validaListasNegras(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return null;   
    }
    
    public ModelAndView getClienteUnico(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return null;   
    }
    
    public ModelAndView getPriceVectorData(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return null;   
    }

    public ModelAndView doPeopleSoft(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String fecha = request.getParameter("fecha");
        setConfig();
            
        try {

            File thePeopleSoftFile = new File(peopleSoftFile);
            DataOutputStream fileOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(thePeopleSoftFile)));
            
            for(int i = 0; i < PS_Lines.length; i++) {
                fileOut.writeUTF(PS_Lines[i]);
            }
            
            fileOut.flush();
            fileOut.close();
            
            return respondObject(response, new GenericResponseBean(GenericResponseBean.SUCCESS, "PS-000", null));

        //} catch(BusinessException b) {
        //    return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, b.getErrorCode(), b.getErrorMessage()));
        } catch (Exception e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, "PS-001", e.getMessage()));
        }
    }

    public ModelAndView doSib(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String fecha = request.getParameter("fecha");
        setConfig();
        
        try {
            
            File theSibFile = new File(sibFile);
            if(!theSibFile.exists()) throw new BusinessException("SIB-LOAD-001", "The SIB File does not exists. SIB File: " + sibFile);
            if(!theSibFile.canRead()) throw new BusinessException("SIB-LOAD-002", "Unable to read SIB file. SIB File: " + sibFile);
            
            GenericDML dml = new GenericDML();
            
            String line = null;
            long sequence = 0L;
            BufferedReader br = new BufferedReader(new FileReader(theSibFile));            
            while((line = br.readLine()) != null) {
                sequence++;
                dml.executeUpdate(ARCHIVOS_PLANOS_SQL, new Object[]{sequence, fecha, theSibFile.getName(), line});
            }
            
            //dml.executeUpdate("CALL INTERFASES.INTERFASES_TFS(1, ?, null, 1, , 999)", new Object[]{ fecha });
            //dml.executeCall(strSQL, values, outKeys)
            
            /*HashMap exitData = new HashMap();
            String FUNCION_SQL = "{? = CALL INTERFASES.INTERFASES_TFS(1, ?, null, 1, , 999)}"; //Fecha y Fideicomiso
            dml.executeCall(FUNCION_SQL, new Object[] { fecha }, exitData);*/
            
            return respondObject(response, new GenericResponseBean(GenericResponseBean.SUCCESS, "SIB-LOAD-003", null));

        } catch(BusinessException b) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, b.getErrorCode(), b.getErrorMessage()));
        } catch (Exception e) {
            return respondObject(response, new GenericResponseBean(GenericResponseBean.ERROR, "SIB-LOAD-003", e.getMessage()));
        }
    }
        
}
