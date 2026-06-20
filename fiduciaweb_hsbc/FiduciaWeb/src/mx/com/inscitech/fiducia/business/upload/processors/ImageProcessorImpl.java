package mx.com.inscitech.fiducia.business.upload.processors;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.ArrayList;
import java.util.List;

import mx.com.inscitech.fiducia.business.upload.UploadProcessor;


/**** @author Inscitech México inscitech@inscitechmexico.com*/
public class ImageProcessorImpl extends UploadProcessor {

    /*** Variable que tiene la informacion del header del archivo del TAS*/
    private static List headerInfo;

    /*** Variable que tiene la informacion del cuerpo del archivo del TAS*/
    private static List bodyInfo;
    /*** Variable para el uso del ORM de Oracle Toplink*/

    static {
        headerInfo = new ArrayList();
        bodyInfo = new ArrayList();
    }

    public ImageProcessorImpl() {
        super();
    }

    public void run() {

        String ficheroOriginal = null;
        String ficheroCopia = null;

        FileInputStream fileInput = null;
        BufferedInputStream bufferedInput = null;

        FileOutputStream fileOutput = null;
        BufferedOutputStream bufferedOutput = null;

        try {

            ficheroOriginal = (String) this.getParameters().get("fileTest");
            ficheroCopia = "http://192.168.1.102:8990/Fiduciario/imagenes/imageProcessor.jpg";

            // Se abre el fichero original para lectura
            fileInput = new FileInputStream(ficheroOriginal);
            bufferedInput = new BufferedInputStream(fileInput);

            // Se abre el fichero donde se hará la copia
            fileOutput = new FileOutputStream(ficheroCopia);
            bufferedOutput = new BufferedOutputStream(fileOutput);

            // Bucle para leer de un fichero y escribir en el otro.
            byte[] array = new byte[1000];
            int leidos = bufferedInput.read(array);

            while (leidos > 0) {
                bufferedOutput.write(array, 0, leidos);
                leidos = bufferedInput.read(array);
            }

            // Cierre de los ficheros
            bufferedInput.close();
            bufferedOutput.close();

            /*FileItem file = (FileItem)this.files.get(0);
      String fileName = file.getName();
      if(fileName.indexOf("\\") != -1)
        fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
      if(fileName.indexOf("/") != -1)
        fileName = fileName.substring(fileName.lastIndexOf("/")+1);

      BufferedReader imageFileReader = new BufferedReader(new InputStreamReader(file.getInputStream()));
      login();
      int i = 0;
      int secuencial = 1;
      while(imageFileReader.ready())
      {
        String line = imageFileReader.readLine();
      }*/

        } catch (Exception e) {
            logger.error("Error al pricesar archivo Imagen", e);
        } finally {
        }
    }

    public Object getStateInfo() {
        return null;
    }
}
