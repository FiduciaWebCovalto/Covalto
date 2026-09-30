package mx.com.inscitech.cuentas.individuales.util;

import java.util.Vector;

import mx.com.inscitech.fiducia.common.services.LoggingService;

public class DatosBD {

    private LoggingService logger = null;
    
    public Vector vtrDatos = new Vector(1, 1);

    public DatosBD() {
        super();  
        logger = LoggingService.getNewInstance();
    }
    
    public void setDataBO(double dblDato) {
        vtrDatos.add(Double.valueOf(dblDato));
    }

    public void setDataBO(String strDato) {
        vtrDatos.add(strDato);
    }

    public void setDataBO(int intDato) {
        vtrDatos.add(Integer.valueOf(intDato));
    }

    public Object getDatoBD(int intPosicion) {
        return vtrDatos.elementAt(intPosicion);
    }

    public void verDatos() {
        for (int a = 0; a < vtrDatos.size(); a++) {
            //logger.log(this, Thread.currentThread(), LoggingService.LEVEL.DEBUG, "Dato " + a + " - " + vtrDatos.elementAt(a));
            System.out.println("Dato: " + vtrDatos.elementAt(a));
        }
    }

    public void limpiarDatos() {
        vtrDatos.clear();
    }
}
