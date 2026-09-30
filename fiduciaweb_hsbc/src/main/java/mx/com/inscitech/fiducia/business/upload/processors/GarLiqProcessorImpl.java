package mx.com.inscitech.fiducia.business.upload.processors;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import mx.com.inscitech.fiducia.domain.ArchivosPlanos;

import mx.com.inscitech.fiducia.business.upload.UploadProcessor;
import mx.com.inscitech.fiducia.common.beans.ParametroQueryBean;

import org.apache.commons.fileupload.FileItem;
import org.apache.log4j.Level;


/**
 * Clase encargada de procesar los archivos recibidos para la interfaz del TAS
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class GarLiqProcessorImpl extends UploadProcessor {

    /**
     * Variable que tiene la informacion del header del archivo del TAS
     */
    private static List headerInfo;

    /**
     * Variable que tiene la informacion del cuerpo del archivo del TAS
     */
    private static List bodyInfo;

    static {
        headerInfo = new ArrayList();
        bodyInfo = new ArrayList();
    }

    public GarLiqProcessorImpl() {
        super();
    }

    public void run() {

        // TODO: Si la fecha del archivo no coincide con la especificada por el cliente mandar error
        FileItem file = null;
        String fileName = null;

        BufferedReader tasFileReader = null;
        ArchivosPlanos archivosPlanos = null;

        String line = null;

        logSrv.log(this, Thread.currentThread(), Level.INFO, "Procesando Archivo");

        try {

            file = (FileItem) this.files.get(0);
            fileName = file.getName();

            if (fileName.indexOf("\\") != -1)
                fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
            if (fileName.indexOf("/") != -1)
                fileName = fileName.substring(fileName.lastIndexOf("/") + 1);

            tasFileReader = new BufferedReader(new InputStreamReader(file.getInputStream()));

            String sql = null;

            int fiso = 0, secuencial = 1;

            String tipo = null;
            String nombre = null;
            String fecha = null;
            String separador = null;

            fiso = Integer.parseInt((String) this.getParameters().get("fiso"));
            tipo = (String) this.getParameters().get("tipo");

            nombre = fileName;

            fecha = (String) this.getParameters().get("fecha");

            separador = (String) this.getParameters().get("separador");

            while (tasFileReader.ready()) {
                line = tasFileReader.readLine();

                archivosPlanos = new ArchivosPlanos();

                archivosPlanos.setArpSecuencial(new BigDecimal(secuencial++));
                archivosPlanos.setArpFecha(fecha);
                archivosPlanos.setArpNomArchivo(nombre);
                archivosPlanos.setArpDescripcion(line);

                //if(!archivosPlanos.validate())
                if (!archivosPlanos.doInsert())
                    throw new Exception("Error al cargar la informacion de archivo a base de datos!");

            }

            sql = "{? = call GARLIQUIDAS.CARGA_GARANTIAS_LIQUIDAS(?, ?, ?, ?, ?)}";

            List parametrosQuery = new ArrayList();

            parametrosQuery.add(new ParametroQueryBean("result", "NUMBER", new Integer(0), true));
            parametrosQuery.add(new ParametroQueryBean("Fiso", "NUMBER", new Integer(fiso)));
            parametrosQuery.add(new ParametroQueryBean("Tipo", "VARCHAR", tipo));
            parametrosQuery.add(new ParametroQueryBean("Nombre", "VARCHAR", nombre));
            parametrosQuery.add(new ParametroQueryBean("Fecha", "VARCHAR", fecha));
            parametrosQuery.add(new ParametroQueryBean("Separador", "VARCHAR", separador));


            Object resultadoFuncion = ejecutaProcedimiento(sql, parametrosQuery).get("result");
            logger.info("El resultado de la funcion Transferencia: " + resultadoFuncion + " Clase: " + resultadoFuncion.getClass());

            parametrosQuery = null;

        } catch (Exception e) {

            logger.error("Error al pricesar archivo GarLiq", e);

        } finally {

        }
    }

    public Object getStateInfo() {
        return null;
    }
}
