package mx.com.inscitech.fiducia.business.upload.processors;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import mx.com.inscitech.fiducia.domain.ArchivosPlanos;

import mx.com.inscitech.fiducia.business.upload.UploadProcessor;

import org.apache.commons.fileupload.FileItem;


/**** @author Inscitech México inscitech@inscitechmexico.com*/
public class CargaArchivosPlanosGeneralProcessorImpl extends UploadProcessor {

    /*** Variable que tiene la informacion del header del archivo del TAS*/

    private static List headerInfo;

    /*** Variable que tiene la informacion del cuerpo del archivo del TAS*/
    private static List bodyInfo; /*** Variable para el uso del ORM de Oracle Toplink*/

    /*** Metodo utilizado para conectarse a la base de datos*/
    static {
        headerInfo = new ArrayList();
        bodyInfo = new ArrayList();
    }

    public CargaArchivosPlanosGeneralProcessorImpl() {
        super();
    }

    public void run() {

        FileItem file = null;
        String fileName = null;
        String line = null;

        BufferedReader tasFileReader = null;
        ArchivosPlanos archivosPlanos = null;

        try {

            file = (FileItem) this.files.get(0);
            fileName = file.getName();

            if (fileName.indexOf("\\") != -1) {
                fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
            }

            if (fileName.indexOf("/") != -1) {
                fileName = fileName.substring(fileName.lastIndexOf("/") + 1);
            }

            tasFileReader = new BufferedReader(new InputStreamReader(file.getInputStream()));

            int secuencial = 1;

            archivosPlanos = new ArchivosPlanos();
            archivosPlanos.setArpFecha((String) this.getParameters().get("Fecha"));
            archivosPlanos.setArpNomArchivo((String) this.getParameters().get("NombreArchivo"));
            archivosPlanos.doDeleteAll();

            while (tasFileReader.ready()) {

                line = tasFileReader.readLine();

                archivosPlanos = new ArchivosPlanos();
                archivosPlanos.setArpSecuencial(new BigDecimal(secuencial++));
                archivosPlanos.setArpFecha((String) this.getParameters().get("Fecha"));
                archivosPlanos.setArpNomArchivo((String) this.getParameters().get("NombreArchivo"));
                archivosPlanos.setArpDescripcion(line);

                //if(archivosPlanos.validate())
                if (!archivosPlanos.doInsert())
                    throw new Exception("Error al registrar el archivo en Base de Datos.");
            }

        } catch (Exception e) {
            logger.log(ERROR, "Error en la carga de archivos planos.", e);
        } finally {
        }
    }

    public Object getStateInfo() {
        return null;
    }
}
