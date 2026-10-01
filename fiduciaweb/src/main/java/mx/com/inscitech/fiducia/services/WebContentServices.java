package mx.com.inscitech.fiducia.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedInputStream;
import java.io.BufferedReader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import java.net.UnknownServiceException;

import mx.com.inscitech.fiducia.common.services.LoggingService;

public class WebContentServices {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebContentServices.class);


    protected LoggingService logger = null;

    private String baseURL = "";
    private String[][] requestProperties = new String[][] { };

    private URL url = null;
    private URLConnection conn = null;

    private String[] property = null;

    private int contentLength = 0;

    private void init() {
        logger = LoggingService.getNewInstance();
    }

    public WebContentServices() {
        super();
        init();
    }

    public WebContentServices(String baseURL) {
        super();
        this.baseURL = baseURL;
        init();
    }

    private InputStream getConnection(String theURL) {

        InputStream result = null;

        try {

            url = new URL(baseURL + theURL);

            conn = url.openConnection();

            for (int i = 0; i < requestProperties.length; i++) {
                property = requestProperties[i];
                conn.setRequestProperty(property[0], property[1]);
            }

            contentLength = conn.getContentLength();
            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "contentLength: " + contentLength);

            result = conn.getInputStream();

        } catch (MalformedURLException me) {

            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "La URL especificada no es valida! URL: " + theURL, me);

        } catch (UnknownServiceException ue) {

            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "El tipo de servicio solicitado no es soportado.", ue);

        } catch (IOException ie) {

            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Error al leer la informacion recibida.", ie);

        } finally {

        }

        return result;
    }

    public byte[] retrieveBinary(String theURL) {
        ByteArrayOutputStream binaryData = null;

        InputStream theReader = null;

        byte[] buffer = null, result = null;

        int bytesRead = -1, offset = 0;

        try {

            //buffer = new byte[contentLength];
            buffer = new byte[1024];

            theReader = getConnection(theURL);

            binaryData = new ByteArrayOutputStream();

            while ((bytesRead = theReader.read(buffer)) > -1) {
                binaryData.write(buffer, 0, bytesRead);
            }

            theReader.close();

            result = binaryData.toByteArray();

            binaryData.close();

            if (result.length != contentLength) {
                LOGGER.debug("Only read " + result.length + " bytes; Expected " + contentLength + " bytes");
                //throw new IOException("Only read " + offset + " bytes; Expected " + contentLength + " bytes");
            }

        } catch (IOException ie) {

            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "", ie);

        } catch (Exception e) {

            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "", e);

        } finally {

            url = null;
            conn = null;

            theReader = null;
            binaryData = null;
        }

        return result;
    }

    public StringBuffer retrieveHTML(String theURL) {

        StringBuffer result = new StringBuffer();

        String inputLine = "";

        BufferedReader reader = null;

        try {

            reader = new BufferedReader(new InputStreamReader(getConnection(theURL)));

            while ((inputLine = reader.readLine()) != null) {
                result.append(inputLine);
            }

            reader.close();

        } catch (IOException ie) {

            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "", ie);

        } catch (Exception e) {

            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "", e);

        } finally {

            url = null;
            conn = null;
            inputLine = null;
            reader = null;

        }

        return result;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void setRequestProperties(String[][] requestProperties) {
        this.requestProperties = requestProperties;
    }

    public String[][] getRequestProperties() {
        return requestProperties;
    }

}

/*
  public static String excutePost(String targetURL, String urlParameters)
  {
    URL url;
    HttpURLConnection connection = null;  
    try {
      //Create connection
      url = new URL(targetURL);
      connection = (HttpURLConnection)url.openConnection();
      connection.setRequestMethod("POST");
      connection.setRequestProperty("Content-Type", 
           "application/x-www-form-urlencoded");
			
      connection.setRequestProperty("Content-Length", "" + 
               Integer.toString(urlParameters.getBytes().length));
      connection.setRequestProperty("Content-Language", "en-US");  
			
      connection.setUseCaches (false);
      connection.setDoInput(true);
      connection.setDoOutput(true);

      //Send request
      DataOutputStream wr = new DataOutputStream (
                  connection.getOutputStream ());
      wr.writeBytes (urlParameters);
      wr.flush ();
      wr.close ();

      //Get Response	
      InputStream is = connection.getInputStream();
      BufferedReader rd = new BufferedReader(new InputStreamReader(is));
      String line;
      StringBuffer response = new StringBuffer(); 
      while((line = rd.readLine()) != null) {
        response.append(line);
        response.append('\r');
      }
      rd.close();
      return response.toString();

    } catch (Exception e) {

      LOGGER.error("Exception: ", e);
      return null;

    } finally {

      if(connection != null) {
        connection.disconnect(); 
      }
    }
  }

String urlParameters =
        "fName=" + URLEncoder.encode("???", "UTF-8") +
        "&lName=" + URLEncoder.encode("???", "UTF-8")
 */