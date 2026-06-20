package mx.com.inscitech.fiducia.business.upload.processors;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import mx.com.inscitech.fiducia.domain.ArchivosPlanos;

import mx.com.inscitech.fiducia.business.upload.UploadProcessor;

import org.apache.commons.fileupload.FileItem;


/**
 *
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ConciliacionDiaria extends UploadProcessor {

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

    public ConciliacionDiaria() {
        super();
    }

    public void run() {

        FileItem file = null;
        String fileName = null;

        BufferedReader tasFileReader = null;
        ArchivosPlanos archivosPlanos = null;

        String line = null;

        try {

            file = (FileItem) this.files.get(0);
            fileName = file.getName();

            if (fileName.indexOf("\\") != -1)
                fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
            if (fileName.indexOf("/") != -1)
                fileName = fileName.substring(fileName.lastIndexOf("/") + 1);

            tasFileReader = new BufferedReader(new InputStreamReader(file.getInputStream()));

            archivosPlanos = null;

            int secuencial = 1, idBanco = 0, idInterfase = 0, idArchivoBanco = 0;

            while (tasFileReader.ready()) {

                line = tasFileReader.readLine();

                archivosPlanos = new ArchivosPlanos();

                archivosPlanos.setArpSecuencial(new BigDecimal(secuencial++));
                archivosPlanos.setArpFecha((String) this.getParameters().get("fechaConciliacion"));

                idBanco = Integer.parseInt((String) this.getParameters().get("idBanco"));
                idInterfase = Integer.parseInt((String) this.getParameters().get("idInterfase"));
                idArchivoBanco = (idBanco * 1000) + idInterfase;

                archivosPlanos.setArpNomArchivo((String) this.getParameters().get("nombreConciliacion") + String.valueOf(idArchivoBanco));
                archivosPlanos.setArpDescripcion(line);

                //if(!archivosPlanos.validate())
                if (!archivosPlanos.doInsert())
                    throw new Exception("Error al cargar la informacion de archivo de Conciliacion Diaria a base de datos!");

            }

        } catch (Exception e) {

            logger.error("Error al pricesar archivo de Conciliacion Diaria", e);

        } finally {

        }
    }

    public Object getStateInfo() {
        return null;
    }
}
