package mx.com.inscitech.fiducia.business.upload.processors;

import java.io.File;

import mx.com.inscitech.fiducia.business.upload.UploadProcessor;
import mx.com.inscitech.fiducia.dml.GenericDML;

public class LoadEstadoCuentaProcessor extends UploadProcessor {
    
    private static final String INSERT_EDO_CTA = "INSERT INTO F_ESTADOS_DE_CUENTAS VALUES (?, ?, ? , ?, ?, NULL, 'PENDIENTE', ?)";
    
    public LoadEstadoCuentaProcessor() {
        super();
    }
    
    public void run() {
        Integer noFiso = Integer.valueOf(this.getParameter("fisoId", "0"));
        String noCta = this.getParameter("noCta", "0");
        String year = this.getParameter("year", "0");
        String month = this.getParameter("month", "0");
        String user = this.getParameter("fecUsuario", "0");
        File thePDF = this.getFiles().get(0);
                                                
        GenericDML dml = new GenericDML();
        dml.executeUpdate(INSERT_EDO_CTA, new Object[]{ noFiso, noCta, year, month, user, thePDF });
    }

    @Override
    public Object getStateInfo() {
        // TODO Implement this method
        return null;
    }
}
