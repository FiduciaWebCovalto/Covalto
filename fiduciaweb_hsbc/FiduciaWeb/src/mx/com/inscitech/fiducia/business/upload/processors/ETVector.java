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
public class ETVector extends UploadProcessor {

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

    public ETVector() {
        super();
    }

    public void run() {

        FileItem file = null;
        String fileName = null;

        BufferedReader tasFileReader = null;
        ArchivosPlanos archivosPlanos = null;

        String line = null;
        String newline = null;

        try {

            file = (FileItem) this.files.get(0);
            fileName = file.getName();

            if (fileName.indexOf("\\") != -1)
                fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
            if (fileName.indexOf("/") != -1)
                fileName = fileName.substring(fileName.lastIndexOf("/") + 1);

            tasFileReader = new BufferedReader(new InputStreamReader(file.getInputStream()));

            archivosPlanos = null;

            int secuencial = 1;

            while (tasFileReader.ready()) {

                line = tasFileReader.readLine();
                newline = line.replaceAll("H MD", "");

                if (line.length() > newline.length()) {

                    newline = line.replaceAll("D2  ", "")
                                  .replaceAll("D1  ", "")
                                  .replaceAll("D1SP", "");

                    if (line.length() == newline.length()) {

                        archivosPlanos = new ArchivosPlanos();

                        archivosPlanos.setArpSecuencial(new BigDecimal(secuencial++));
                        archivosPlanos.setArpFecha((String) this.getParameters().get("fechaValuacion"));
                        archivosPlanos.setArpNomArchivo((String) this.getParameters().get("nombreValuacion") + "ET");
                        archivosPlanos.setArpDescripcion(line);

                        //if(!archivosPlanos.validate())
                        if (!archivosPlanos.doInsert())
                            throw new Exception("Error al cargar la informacion de archivo a base de datos!");

                    }
                }
            }

        } catch (Exception e) {

            logger.error("Error al pricesar archivo ETVector", e);

        } finally {

        }
    }

    public Object getStateInfo() {
        return null;
    }
}
