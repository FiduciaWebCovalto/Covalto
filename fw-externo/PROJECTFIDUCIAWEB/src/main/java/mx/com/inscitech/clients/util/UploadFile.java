package mx.com.inscitech.clients.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.sql.Connection;
import java.sql.*;



import mx.com.inscitech.clients.lib.conexion;


public class UploadFile  {
    private static final Logger LOGGER = LoggerFactory.getLogger(UploadFile.class);
   




    void depura(String cadena)
    {
        LOGGER.debug(cadena);
    }

    public boolean procesaArchivos( ) {
    Connection connection = null;
        try {
       
        		conexion connectionJDBC = new conexion();
            connection = connectionJDBC.conectarBD();

            long start = System.currentTimeMillis();

            //DiskFileUpload fu = new DiskFileUpload();
//            fu.setSizeMax(1024*1024*10); 
        
                String fileName = "C:/INSCITECH/BANCOS/INTERACCIONES/CARGA_RETMAS_PRUEBA.txt";
                //out.println("<br>Nombre del archivo leido: " + fileName);
                File archivo = new File(fileName);
                
                try {
                  BufferedReader in = new BufferedReader(new FileReader(archivo));
                  String str;
                  String sql = "DELETE FROM F_ARCHIVO_PLANO_RMAS";
                  PreparedStatement pstmt = connection.prepareStatement(sql);
                  pstmt = connection.prepareStatement(sql);
                  if(pstmt.execute()==true) 
                  {
                    LOGGER.debug("El contenido de la tabla ACRCHIVOS_PLANOS ha sido eliminado.");
                  }
                  pstmt.close();
                  
                  sql = "INSERT INTO F_ARCHIVO_PLANO_RMAS (ARP_SECUENCIAL, ARP_FECHA, ARP_NOM_ARCHIVO, ARP_DESCRIPCION) VALUES ( ?, ?, ?, ?) ";
                  pstmt = connection.prepareStatement(sql);
                  String sqlSequence = "";
                  PreparedStatement pstmtSequence =null;                  
                  ResultSet rs = null;
                  while ((str = in.readLine()) != null) {
                    sqlSequence = "SELECT MAX(ARP_SECUENCIAL) FROM F_ARCHIVO_PLANO_RMAS";
                    pstmtSequence = connection.prepareStatement(sqlSequence);                  
                    rs = pstmtSequence.executeQuery();
                    if (rs.next()) { 
                      pstmt.setInt(1, rs.getInt(1)+1);
                      pstmt.setDate(2, new java.sql.Date(System.currentTimeMillis()));
                      pstmt.setString(3, archivo.getName());
                      pstmt.setString(4, str);
                      pstmt.execute();
                      rs.close();
                      pstmtSequence.close();                    
                    }//if
                    //LOGGER.debug("linea " + j + " " + str);
                  }//while
                  in.close();
                  pstmt.close();
  
                  long end = System.currentTimeMillis();
                  LOGGER.debug("Time in seconds: " + ((end-start)/1000));
                  depura("\nTermino!");
                  
            } catch (IOException e) {
              LOGGER.error("Exception: ", e);
              connection.close();
            }
    
          
         connection.close(); 

        } catch(Exception e) {
          return false;
        }
        return true;
    }
}