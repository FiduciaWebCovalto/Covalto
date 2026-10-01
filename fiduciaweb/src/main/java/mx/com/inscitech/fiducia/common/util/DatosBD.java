package mx.com.inscitech.fiducia.common.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Vector;

public class DatosBD {
    private static final Logger LOGGER = LoggerFactory.getLogger(DatosBD.class);


    public Vector vtrDatos = new Vector(1, 1);

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
        for (int a = 0; a < vtrDatos.size(); a++)
            LOGGER.debug("dato " + a + " - " + vtrDatos.elementAt(a));
    }

    public void limpiarDatos() {
        vtrDatos.clear();
    }
}
