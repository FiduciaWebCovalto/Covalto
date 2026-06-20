package mx.com.inscitech.fiducia.business.upload.processors;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;

import java.io.FileOutputStream;

import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import mx.com.inscitech.fiducia.business.upload.UploadProcessor;

import org.apache.commons.fileupload.FileItem;


public class LiquidadoresProcessor extends UploadProcessor {

    public LiquidadoresProcessor() {
        super();
    }

    public void run() {

        FileItem file = null;
        String fileName = null;
        String archivosLocation = "";

        try {

            file = (FileItem) this.files.get(0);
            fileName = file.getName();

            if (fileName.indexOf("\\") != -1)
                fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
            if (fileName.indexOf("/") != -1)
                fileName = fileName.substring(fileName.lastIndexOf("/") + 1);

            archivosLocation = this.servletContext.getRealPath("/Archivos");

            logger.debug("Archivo: " + fileName + " FileItem: " + file.getName() + " Archivos Loc: " + archivosLocation);

            int procesoPM = Integer.parseInt(parameters.get("procesoPM").toString());

            switch (procesoPM) {
            case 4:

                ZipInputStream zin = null;
                ZipEntry entry = null;

                FileOutputStream fileOut = null;
                BufferedOutputStream dest = null;

                int BUFFER = 2048, count = 0;
                byte data[] = null;

                archivosLocation = this.servletContext.getRealPath("/Archivos/EnvioEdoCta");

                File carpetaEnvio = new File(archivosLocation);
                if (carpetaEnvio.exists() && carpetaEnvio.canWrite()) {

                    zin = new ZipInputStream(new BufferedInputStream(file.getInputStream()));

                    while ((entry = zin.getNextEntry()) != null) {

                        fileOut = new FileOutputStream(archivosLocation + File.separator + entry.getName());

                        data = new byte[BUFFER];

                        dest = new BufferedOutputStream(fileOut, BUFFER);

                        while ((count = zin.read(data, 0, BUFFER)) != -1) {
                            dest.write(data, 0, count);
                        }

                        dest.flush();
                        dest.close();
                    }
                    zin.close();
                }

                break;
            default:
                //file.write(new File(archivosLocation + "/" + file.getName()));
                file.write(new File(archivosLocation + "/ProcesoLiquidadores.txt"));
                file.delete();
                file = null;
            }
            //File.pathSeparator

        } catch (Exception e) {

            logger.error("Error al pricesar archivo Imagen", e);

        } finally {

            file = null;

        }
    }

    public Object getStateInfo() {
        return null;
    }
}
