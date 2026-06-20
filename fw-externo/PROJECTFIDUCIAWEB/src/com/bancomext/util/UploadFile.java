package com.bancomext.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;
import com.bancomext.lib.conexion;


public class UploadFile  {   




    void depura(String cadena)
    {
        System.out.println(cadena);
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
                    System.out.println("El contenido de la tabla ACRCHIVOS_PLANOS ha sido eliminado.");
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
                    //System.out.println("linea " + j + " " + str);
                  }//while
                  in.close();
                  pstmt.close();
  
                  long end = System.currentTimeMillis();
                  System.out.print("Time in seconds: " + ((end-start)/1000));
                  depura("\nTermino!");
                  
            } catch (IOException e) {
              e.printStackTrace();
              connection.close();
            }
    
          
         connection.close(); 

        } catch(Exception e) {
          return false;
        }
        return true;
    }
}