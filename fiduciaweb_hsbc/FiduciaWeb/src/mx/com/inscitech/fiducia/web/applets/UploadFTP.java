package mx.com.inscitech.fiducia.web.applets;

import java.applet.Applet;

import java.awt.Label;
import java.awt.Rectangle;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.URL;
import java.net.URLConnection;

import java.awt.Dimension;

/**
 * Applet para transferencia de archivos server - cliente - server
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class UploadFTP extends Applet {

    private Label lblWait = new Label();

    public UploadFTP() {
    }

    public void init() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout(null);
        this.add(lblWait, null);

        lblWait.setText("Por favor espere, transfiriendo el archivo ...");
        lblWait.setBounds(new Rectangle(5, 10, 370, 25));

        URL fileUrl = null;
        URL ftpDestino = null;

        InputStream archivoServer = null;

        URLConnection ftpConnection = null;
        OutputStream out = null;

        int dato;

        String sourceURL = this.getParameter("fileURL"); // http://localhost/salida.txt
        String ftpServer = this.getParameter("ftpServer"); // servidor
        String ftpUsername = this.getParameter("username"); // anonymous
        String ftpPassword = this.getParameter("password"); // test.com
        String ftpFileName = this.getParameter("fileName"); // salida.txt
        String ftpPort = this.getParameter("ftpPort"); // salida.txt

        //String ftpURL = "ftp://anonymous:test.com@servidor/salida.txt;type=i"
        String ftpURL = "ftp://" + ftpUsername + ":" + ftpPassword + "@" + ftpServer + "/" + ftpFileName + ";type=i";
        this.setSize(new Dimension(400, 54));

        try {
            fileUrl = new URL(sourceURL);
            ftpDestino = new URL(ftpURL);

            archivoServer = fileUrl.openStream();

            ftpConnection = ftpDestino.openConnection();
            out = ftpConnection.getOutputStream();

            while ((dato = archivoServer.read()) != -1) {
                System.out.print((char) dato);
                out.write(dato);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (archivoServer != null)
                try {
                    archivoServer.close();
                } catch (Exception e) {
                }

            if (out != null) {
                try {
                    out.flush();
                    out.close();
                } catch (Exception e) {
                }
            }

            archivoServer = null;
            out = null;
        }

        System.out.println("\nDone.");

        lblWait.setText("El archivo se ha transferido satisfactoriamente!");
    }
}
