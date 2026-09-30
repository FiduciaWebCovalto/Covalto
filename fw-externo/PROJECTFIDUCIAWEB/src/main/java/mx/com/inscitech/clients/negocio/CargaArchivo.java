/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.negocio;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.io.FileNotFoundException;
import java.io.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.*; 

import javax.mail.*;
import javax.mail.internet.*;

import mx.com.inscitech.clients.lib.conexion;

import mx.com.inscitech.clients.negocio.nConsultas;
import mx.com.inscitech.clients.negocio.nFiducia;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.io.*;
import java.sql.Date;
import java.text.*;
import java.util.*;
import javax.servlet.*; 
import javax.servlet.http.*;
import java.sql.Types;

import javax.naming.NamingException;
import mx.com.inscitech.clients.negocio.RetirosDB;

public class CargaArchivo extends FiduciaBD
{
  Connection connection = null;
  Statement statement = null;
  Statement statement2 = null;
  Statement stCuentaClabe = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;
  String secArch="";
  nConsultas secNombreArchivo = new nConsultas();  
  int secArchivo=0;
  String secfecha="";



public void leeArchivo(String rutaArchivo,String sFolio,String sImporte, HttpServletRequest request, HttpServletResponse response ) 
       throws IOException, ServletException {//String filename 
      StringBuffer sb = new StringBuffer();
      String datos1="";   
      nConsultas dato = new nConsultas();   
      String nombreDato="";
      StringBuffer sbTabla = new StringBuffer();
      StringBuffer stringBufferSQL = new StringBuffer();
      String estado, clabe="";
      int value = 0,iRows=0;
      String squery="";
      String sRespuesta="";
     nConsultas archivo = new nConsultas();
     boolean eof = false;
     String line = null; 
     HttpSession session = request.getSession ( true ) ; 
     String datos[][]=new String [10000][100];
     int renglon=0, columna=0,ubicaclabe=0,ubicamotivo=0;
     int renglonaux=0;
     String separador="";
   try{ 
       FileInputStream file = new FileInputStream(rutaArchivo);
       BufferedReader br = new BufferedReader(new InputStreamReader(file));
       for(int g=0;g<datos.length;g++){ 
        for(int h=0;h<datos[g].length;h++){ 
         datos[g][h]= new String (""+"");
        }
       }
      while (br.ready()) {
        line = br.readLine();
        String sDatTempo[]=line.split(";");
        for(int j=0;j<sDatTempo.length;j++)
          datos[renglon][j]=sDatTempo[j];          
        renglon++;
      }
      
      br.close(); 
      //Se crea una instancia de la clase que se conecta hacia la base de datos
      nFiducia fiduciaConnection = new nFiducia();
      //Manda llamar al metodo que crea la conexion
      fiduciaConnection.conectarBD();
      //Asigna el valor de la conexion a la variable declarada
      connection = fiduciaConnection.conBD;
      //Crea un statement
      statement = connection.createStatement();       
      stringBufferSQL= new  StringBuffer(); 
      stringBufferSQL.append(""); 
      stringBufferSQL.append("DELETE FROM F_RETIROS_MASIVOS");
      stringBufferSQL.append(" WHERE FRMA_FOLIO="+sFolio);
      iRows = statement.executeUpdate(stringBufferSQL.toString()); 
      
      if(rutaArchivo.indexOf(".xls")==-1){  
       while(renglonaux<renglon)
       {
            //se recuperan datos de cuenta clabe
            stringBufferSQL= new  StringBuffer();
            stringBufferSQL.append("");
            stringBufferSQL.append("INSERT INTO F_RETIROS_MASIVOS VALUES(");
            stringBufferSQL.append(sFolio+",NULL,NULL,(SELECT NVL(MAX(FRMA_SECUENCIAL),0)+1 FROM F_RETIROS_MASIVOS WHERE FRMA_FOLIO="+sFolio+"),");
            stringBufferSQL.append("'"+datos[renglonaux][0]+"','"+datos[renglonaux][1]+"','");
            stringBufferSQL.append(datos[renglonaux][2]+"',"+datos[renglonaux][3].replaceAll(",","")+",");
            stringBufferSQL.append(datos[renglonaux][4].replaceAll(",","")+","+datos[renglonaux][5].replaceAll(",","")+",");
            stringBufferSQL.append(datos[renglonaux][6].replaceAll(",","")+","+datos[renglonaux][7].replaceAll(",","")+",");
            stringBufferSQL.append(datos[renglonaux][8].replaceAll(",","")+","+datos[renglonaux][9].replaceAll(",","")+")");

            //Ejecuta el query
            iRows = statement.executeUpdate(stringBufferSQL.toString());    

            renglonaux++;
       }
        session.setAttribute("bRetiroMultiple","0"); 
        session.setAttribute("AlertaRetiroMultiple","");        
      } 
      else
      {
        session.setAttribute("bRetiroMultiple","1"); 
        session.setAttribute("AlertaRetiroMultiple","SE PRODUJO UN ERROR DURANTE LA LECTURA DEL ARCHIVO, VERIFIQUE EL FORMATO."); 
      }
      fiduciaConnection.CloseBD();      
      if (statement != null)
        statement.close();
      if (resultSet != null)
        resultSet.close();
      if (connection != null)
        connection.close();       
    } catch (FileNotFoundException fnfe){ 
          System.out.println("No ha sido posible encontrar el archivo "+ rutaArchivo +" "); 
   } 
   catch (IOException ioe){ 
       System.out.println("Se ha producido un error durante la lectura del archivo "+ rutaArchivo +" "); 
    } 
    catch (SQLException e){ 
       System.out.println(stringBufferSQL.toString());     
      }   
    catch (Exception e){ 
       session.setAttribute("bRetiroMultiple","1"); 
       session.setAttribute("AlertaRetiroMultiple","SE PRODUJO UN ERROR DURANTE LA LECTURA DEL ARCHIVO, VERIFIQUE EL FORMATO."); 
       System.out.println("Se ha producido un error durante la lectura del archivo ");     
      }    

}

public String leeArchivo(String rutaArchivo,String sFolio){//String filename 
      StringBuffer sb = new StringBuffer();
      String datos1="";   
      nConsultas dato = new nConsultas();   
      String nombreDato="";
      StringBuffer sbTabla = new StringBuffer();
      StringBuffer stringBufferSQL = new StringBuffer();
      String estado, clabe="";
      int value = 0,iRows=0;
      String squery="";
      String sRespuesta="";
     nConsultas archivo = new nConsultas();
     boolean eof = false;
     String line = null; 

     String datos[][]=new String [10000][100];
     int renglon=0, columna=0,ubicaclabe=0,ubicamotivo=0;
     int renglonaux=0;
     String separador="";
   try{ 
       FileInputStream file = new FileInputStream(rutaArchivo);
       BufferedReader br = new BufferedReader(new InputStreamReader(file));
       for(int g=0;g<datos.length;g++){ 
        for(int h=0;h<datos[g].length;h++){ 
         datos[g][h]= new String (""+"");
        }
       }
      while (br.ready()) {
        line = br.readLine();
        String sDatTempo[]=line.split(";");
        for(int j=0;j<sDatTempo.length;j++)
          datos[renglon][j]=sDatTempo[j];          
        renglon++;
      }                    
       br.close(); 
       
       while(renglonaux<renglon)
       {
            //se recuperan datos de cuenta clabe
            stringBufferSQL= new  StringBuffer();
            stringBufferSQL.append("INSERT INTO F_DEPOSITOS_MASIVOS VALUES(");
            stringBufferSQL.append(sFolio+","+sFolio+",(SELECT NVL(MAX(FDMA_SECUENCIAL),0)+1 FROM F_DEPOSITOS_MASIVOS WHERE FDMA_FOLIO="+sFolio+"),");
            stringBufferSQL.append("'"+datos[renglonaux][0]+"','"+datos[renglonaux][1]+"',");
            stringBufferSQL.append(datos[renglonaux][2]+",'"+datos[renglonaux][3]+"',");
            stringBufferSQL.append("'"+datos[renglonaux][4]+"',"+datos[renglonaux][5]+")");
            //Se crea una instancia de la clase que se conecta hacia la base de datos
            nFiducia fiduciaConnection = new nFiducia();
            //Manda llamar al metodo que crea la conexion
            fiduciaConnection.conectarBD();
            //Asigna el valor de la conexion a la variable declarada
            connection = fiduciaConnection.conBD;
            //Crea un statement
            statement = connection.createStatement();
            //Ejecuta el query
            iRows = statement.executeUpdate(stringBufferSQL.toString());    
            fiduciaConnection.CloseBD();
            renglonaux++;
       }
       sbTabla.append("<input type=\"HIDDEN\" name=\"txtFolio\" value=\""+sFolio+"\">");
       
      if (statement != null)
        statement.close();
      if (resultSet != null)
        resultSet.close();
      if (connection != null)
        connection.close();       
    } catch (FileNotFoundException fnfe){ 
          System.out.println("No ha sido posible encontrar el archivo "+ rutaArchivo +" "); 
   } 
   catch (IOException ioe){ 
       System.out.println("Se ha producido un error durante la lectura del archivo "+ rutaArchivo +" "); 
    } 
    catch (SQLException e){ 
       System.out.println(stringBufferSQL.toString());     
      }   
    catch (NamingException e){ 
       System.out.println("Se ha producido un error durante la lectura del archivo ");     
      }    
      
  return sbTabla.toString();
} 

public boolean iValidaCarga(String sFolioDef,String sFolio,double dImporte){//String filename 
      StringBuffer sb = new StringBuffer();
      String datos1="";   
      nConsultas dato = new nConsultas();   
      String nombreDato="";
      StringBuffer sbTabla = new StringBuffer();
      StringBuffer stringBufferSQL = new StringBuffer();
      String estado, clabe="";
      int value = 0,iRows=0;
      String squery="";
      String sRespuesta="";
     nConsultas archivo = new nConsultas();
     boolean eof = false;
     String line = null; 
     boolean bresultado=false;
     int renglon=0, columna=0,ubicaclabe=0,ubicamotivo=0;
     int renglonaux=0;
     double dImporteTotal=0;
     String separador="";
   try{ 
        //se recuperan datos de cuenta clabe
        stringBufferSQL= new  StringBuffer();
        stringBufferSQL.append("SELECT SUM(NVL(FDMA_IMPORTE,0)) FROM F_DEPOSITOS_MASIVOS");
        stringBufferSQL.append(" WHERE FDMA_FOLIO_TEMP="+sFolio);
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        nFiducia fiduciaConnection = new nFiducia();
        //Manda llamar al metodo que crea la conexion
        fiduciaConnection.conectarBD();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conBD;
        //Crea un statement
        statement = connection.createStatement();
        //Ejecuta el query
        resultSet = statement.executeQuery(stringBufferSQL.toString());    
        if(resultSet.next())
        {
          dImporteTotal=resultSet.getDouble(1);
        }
        resultSet.close();
        if(dImporteTotal==dImporte){
          stringBufferSQL= new  StringBuffer();
          stringBufferSQL.append("UPDATE F_DEPOSITOS_MASIVOS SET FDMA_FOLIO="+sFolioDef);
          stringBufferSQL.append(" WHERE FDMA_FOLIO_TEMP="+sFolio);
          //Ejecuta el query
          iRows = statement.executeUpdate(stringBufferSQL.toString());    
          bresultado=true;
        }  
        fiduciaConnection.CloseBD();
       
      if (statement != null)
        statement.close();
      if (resultSet != null)
        resultSet.close();
      if (connection != null)
        connection.close();       
    }
    catch (SQLException e){ 
       System.out.println(stringBufferSQL.toString());     
      }   
    catch (NamingException e){ 
       System.out.println("Se ha producido un error durante la lectura del archivo ");     
      }    
      
  return bresultado;
} 
	private DecimalFormat num = new DecimalFormat("############0.00");

	public synchronized String getDatosDetalleCarga( String sFolio, String sFideicomiso)
	{
		String queryFinal="";
    StringBuffer stringBufferSQL = new StringBuffer();
    StringBuffer sTexto = new StringBuffer("");		
		try
		{
			int i=0,h=0,j=0,tempo=0,cont_saldo=0;
      		String sQueryTemp=null,sQueryOrdena=null;
      		String[][] scad_cuentas;
      		String[][] scad_conceptos;
			DecimalFormat dfFormat = new DecimalFormat("###,##0.00");
      		DecimalFormat dfFormat2 = new DecimalFormat("0.00");
			i=0;						
			sTexto.append("<title>DETALLE DE CARGA, Fideicomiso:  \""+ sFideicomiso +"\" Folio Instruccion: "  
			 +  sFolio +"\" "  
			 +  "</title>"   
			 +  "</head>"   
			 +  "<body onLoad=\"Opcion();\">"  
  			 +  "<table width=\"100%\" border=\"0\">"  
			 +  "<tr> "
			 +  "<td  rowspan=\"4\" >&nbsp;</td>"
			 +  "<td  rowspan=\"4\" colspan=4><img src=\"imagenes/logo_bn.jpg\" ></td>"
       +  "<td colspan=14  align=\"center\"  style=\"font-family: Arial;	font-size: 16px;color: #000000;font-weight: bold;\">Banco</td>"
       +  "</tr>"
        +  "<tr>" 
        +  "<td  align=center colspan=14 style=\"font-family: Verdana, Arial, Helvetica;	font-size: 12px;color: #000000;font-weight: bold;\">Direcci�n  Fiduciaria</td>"
        +  "</tr>"
  			 +  "<tr> "
    		 +  "<td align=center style=\"font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;\" colspan=14> FIDEICOMISO&nbsp;&nbsp;"+sFideicomiso+"&nbsp;</td>"
			 + "</tr>"
      		 +  "<tr class=tituloRP9  bgcolor=\"#CCCCCC\"> "  
      		 +  "<td align=center  bgcolor=\"#FFFFFF\"> &nbsp;</td>"
      		 +  "<td rowspan=\"2\" align=center>INSTITUCION</td>"  
      		 +  "<td rowspan=\"2\" align=center>CUENTA</td>"  
      		 +  "<td rowspan=\"2\" align=center>IMPORTE</td>"  
      		 +  "<td rowspan=\"2\" align=center>COMENTARIO</td>"  
      		 +  "<td rowspan=\"2\" align=center width=\"180\">REFERENCIA</td>"  
      		 +  "</tr>");
      
        stringBufferSQL= new  StringBuffer();
        stringBufferSQL.append("SELECT FDMA_INSTITUCION,FDMA_CUENTA,FDMA_IMPORTE,FDMA_COMENTARIO,FDMA_REFERENCIA FROM F_DEPOSITOS_MASIVOS");
        stringBufferSQL.append(" WHERE FDMA_FOLIO="+sFolio);
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        nFiducia fiduciaConnection = new nFiducia();
        //Manda llamar al metodo que crea la conexion
        fiduciaConnection.conectarBD();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conBD;
        //Crea un statement
        statement = connection.createStatement();
        //Ejecuta el query
        resultSet = statement.executeQuery(stringBufferSQL.toString());    
        if(resultSet.next())
        {
	          sTexto.append("<tr class=\"textoRP\"> ");	         
	          sTexto.append("<td align=center> &nbsp;</td>");
	          sTexto.append("<td align=center>"+resultSet.getString(1)+"</td>");
	          sTexto.append("<td align=center>"+resultSet.getString(2)+"</td>");
	          sTexto.append("<td align=center>"+String.valueOf(resultSet.getInt(3))+"</td>");
	          sTexto.append("<td align=center>"+resultSet.getString(4)+"</td>");
            sTexto.append("<td align=center>"+resultSet.getString(5)+"</td>");
	          sTexto.append("</tr>");                    
        }
        resultSet.close();
        fiduciaConnection.CloseBD();

			sTexto.append("</table>");		    

      if (statement != null)
        statement.close();
      if (resultSet != null)
        resultSet.close();
      if (connection != null)
        connection.close();       
		}
    catch (SQLException e){ 
       System.out.println(stringBufferSQL.toString());     
      }   
    catch (NamingException e){ 
       System.out.println("Se ha producido un error durante la lectura del archivo ");     
      }    
    finally
    {
      return  sTexto.toString() ;
    }  
	}//getPresupuestal
  
  
  
  public boolean bancosValidos(String Folio) 
{//String filename 
     
      StringBuffer stringBufferSQL = new StringBuffer();
      StringBuffer stringBufferSQL2 = new StringBuffer();
      boolean resultado=false;
      ResultSet resultSet2 = null;
   try{ 
        //se recuperan datos de cuenta clabe
        stringBufferSQL= new  StringBuffer();
        stringBufferSQL2= new  StringBuffer();
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        nFiducia fiduciaConnection = new nFiducia();
        //Manda llamar al metodo que crea la conexion
        fiduciaConnection.conectarBD();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conBD;
        //Crea un statement
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        stringBufferSQL.append("SELECT distinct frma_cuenta from f_retiros_masivos where frma_folio="+Folio); 
        resultSet = statement.executeQuery(stringBufferSQL.toString()); 
	String nomBanco="vacio";
	int numBanco=0;

  if(resultSet.next()){
    resultSet.first();
    do
    {
      nomBanco=resultSet.getString(1);  
      stringBufferSQL2 = new StringBuffer();
      stringBufferSQL2.append("SELECT count(1) FROM claves WHERE cve_num_clave=27 AND cve_desc_clave like '%"+nomBanco+"%'"); 
      statement2 = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
      resultSet2=statement2.executeQuery(stringBufferSQL2.toString());  
     
      if(resultSet2.next())
        {
          int nBancos=resultSet2.getInt(1);
          if(nBancos>0){
            resultado=true;
          }
          else
          {
            resultado=false;
            break;
          }          
        }
       statement2.close(); 
       resultSet2.close(); 
    }while(resultSet.next());
  } 
  resultSet.close();
  stringBufferSQL = new StringBuffer();
  stringBufferSQL.append("SELECT count(distinct frma_cuenta) from f_retiros_masivos r where  r.frma_folio="+Folio); 
  resultSet = statement.executeQuery(stringBufferSQL.toString()); 
  if(resultSet.next())
    if(resultSet.getInt(1)>1)
      resultado=false;
  resultSet.close();        
      if (statement != null)
        statement.close();
      if (connection != null)
        connection.close();       
    }
    catch (SQLException e){ 
       System.out.println(e);     
      }   
    catch (Exception e){ 
       System.out.println("Se ha producido un error durante la lectura del archivo ");     
      }    

  return resultado;

}


public String iValidaCarga(String sFolio,String sImporte,int sFideicomiso) 
       {//String filename 
      StringBuffer sb = new StringBuffer();
      String datos1="";   
      nConsultas dato = new nConsultas();   
      String nombreDato="";
      StringBuffer sbTabla = new StringBuffer();
      StringBuffer stringBufferSQL = new StringBuffer();
      StringBuffer stringBufferSQL2 = new StringBuffer();
      String estado, clabe="";
      int value = 0,iRows=0;
      String squery="";
      String sRespuesta="";
      int icontreg=0;
     nConsultas archivo = new nConsultas();
     boolean eof = false;
     String line = null; 
     String bresultado="1";
     int renglon=0, columna=0,ubicaclabe=0,ubicamotivo=0;
     int renglonaux=0;
     double dImporteTotal=0;
     String separador="";
    
     int sSubcuenta = 0;
     int sGarantia = 0;
     int sBien = 0;
   try{ 
        //se recuperan datos de cuenta clabe
        stringBufferSQL= new  StringBuffer();
        stringBufferSQL2= new  StringBuffer();
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        nFiducia fiduciaConnection = new nFiducia();
        //Manda llamar al metodo que crea la conexion
        fiduciaConnection.conectarBD();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conBD;
        //Crea un statement
        statement = connection.createStatement();

        //stringBufferSQL.append("SELECT COUNT(1) FROM F_RETIROS_MASIVOS");
        stringBufferSQL.append("SELECT FRMA_SUBCTO,FRMA_NUM_GARANTIA,FRMA_NUM_BIEN_GAR FROM F_RETIROS_MASIVOS");
        stringBufferSQL.append(" WHERE FRMA_FOLIO="+sFolio);
        resultSet = statement.executeQuery(stringBufferSQL.toString());    
        if(resultSet.next())
        {
          //icontreg=resultSet.getInt(1);
          
          sSubcuenta = resultSet.getInt(1);
          sGarantia = resultSet.getInt(2);
          sBien = resultSet.getInt(3);
          
          icontreg=1;
        }
        resultSet.close();
        
        
        if(icontreg!=0){
          stringBufferSQL2.append(""); 
          stringBufferSQL2.append("SELECT SUM(NVL(FRMA_IMPORTE,0)) FROM F_RETIROS_MASIVOS");
          stringBufferSQL2.append(" WHERE FRMA_FOLIO="+sFolio);  
          //Ejecuta el query
          resultSet = statement.executeQuery(stringBufferSQL2.toString());    
          if(resultSet.next())
          {
            dImporteTotal=resultSet.getDouble(1);
          }
          resultSet.close();
          if(dImporteTotal==Double.valueOf(sImporte).doubleValue()){
            bresultado="0";
          }  
        }
        else
          bresultado="1";
 
      fiduciaConnection.CloseBD(); 
      if (statement != null)
        statement.close();
      if (resultSet != null)
        resultSet.close();
      if (connection != null)
        connection.close();       
    }
    catch (SQLException e){ 
       System.out.println(stringBufferSQL.toString());     
      }   
    catch (Exception e){ 
       System.out.println("Se ha producido un error durante la lectura del archivo ");     
      }    
  return bresultado;
} 
	

// VALIDACION CARGA RETIROS MASIVOS GARANTIA --------------------------------------------
// --------------------------------------------------------------------------------------
  
public String iValidaCargaGarantiasRetiro(String sFolio,String sImporte,int sFideicomiso) 
       {//String filename 
      StringBuffer sb = new StringBuffer();
      String datos1="";   
      nConsultas dato = new nConsultas();   
      String nombreDato="";
      StringBuffer sbTabla = new StringBuffer();
      StringBuffer stringBufferSQL = new StringBuffer();
      String estado, clabe="";
      int value = 0,iRows=0;
      String squery="";
      String sRespuesta="";
      int icontgar=0;
     nConsultas archivo = new nConsultas();
     boolean eof = false;
     String line = null; 
     String bresultado="1";
     int renglon=0, columna=0,ubicaclabe=0,ubicamotivo=0;
     int renglonaux=0;
     double dImporteTotal=0;
     BigDecimal dImporteIndividual = new BigDecimal(0);
     BigDecimal dImporteIndividualValida = new BigDecimal(0);
     String separador="";
    
     int sSubcuenta = 0;
     int sGarantia = 0;
     int sBien = 0;
   try{ 
        //se recuperan datos de cuenta clabe
        stringBufferSQL= new  StringBuffer();
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        nFiducia fiduciaConnection = new nFiducia();
        //Manda llamar al metodo que crea la conexion
        fiduciaConnection.conectarBD();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conBD;
        //Crea un statement
        statement = connection.createStatement();

        // datos bien en garantia-----
        stringBufferSQL = new  StringBuffer();
        stringBufferSQL.append("SELECT FRMA_SUBCTO,FRMA_NUM_GARANTIA,FRMA_NUM_BIEN_GAR FROM F_RETIROS_MASIVOS");
        stringBufferSQL.append(" WHERE FRMA_FOLIO="+sFolio);
        resultSet = statement.executeQuery(stringBufferSQL.toString());
        
        if(resultSet.next())
        {
          sSubcuenta = resultSet.getInt(1);
          sGarantia = resultSet.getInt(2);
          sBien = resultSet.getInt(3);
        }
        resultSet.close();
      
        // bienes gar ---
        stringBufferSQL = new  StringBuffer();
        stringBufferSQL.append("SELECT COUNT(1) FROM F_BIENESGAR");
        stringBufferSQL.append("  WHERE FGRS_ID_FIDEICOMISO = "+sFideicomiso);
        stringBufferSQL.append("    AND FGRS_ID_SUBCUENTA = "+sSubcuenta);
        stringBufferSQL.append("    AND FORS_ID_GARANTIA = "+sBien);
        stringBufferSQL.append("    AND FORS_CVE_TIPO_GARANTIA = "+sGarantia);
        resultSet = statement.executeQuery(stringBufferSQL.toString());    
        if(resultSet.next())
        {
          icontgar=resultSet.getInt(1);
        }
        resultSet.close();
       
        if(icontgar!=0)
        {
          // --------------------------
          bresultado="0";
          stringBufferSQL = new  StringBuffer();
          stringBufferSQL.append("SELECT NVL(SUM(FRMA_IMPORTE),0), FRMA_NUM_GARANTIA, FRMA_NUM_BIEN_GAR");
          stringBufferSQL.append(" FROM F_RETIROS_MASIVOS");
          stringBufferSQL.append(" WHERE FRMA_FOLIO="+sFolio);
          stringBufferSQL.append("  GROUP BY FRMA_NUM_GARANTIA,FRMA_NUM_BIEN_GAR");
          
          resultSet = statement.executeQuery(stringBufferSQL.toString());    
          
          while(resultSet.next())
          {
            dImporteIndividual = new BigDecimal(resultSet.getString(1));
            dImporteIndividualValida = new BigDecimal(iValidaGarantiasRetiro(sFideicomiso,sSubcuenta,sGarantia,sBien));
            
            if(dImporteIndividual.compareTo(dImporteIndividualValida)>0)
            {
              bresultado="1;"+sGarantia+"-"+sBien;
            }
          }
          resultSet.close();
        // ------------------------------
          
        }
        else
          bresultado="1";
          
      if(bresultado.indexOf("1,")==0){
        stringBufferSQL= new  StringBuffer();
        stringBufferSQL.append(""); 
        stringBufferSQL.append("DELETE FROM F_RETIROS_MASIVOS");
        stringBufferSQL.append(" WHERE FRMA_FOLIO="+sFolio);
        iRows = statement.executeUpdate(stringBufferSQL.toString()); 
      }  
      fiduciaConnection.CloseBD(); 
      if (statement != null)
        statement.close();
      if (resultSet != null)
        resultSet.close();
      if (connection != null)
        connection.close();       
    }
    catch (SQLException e){ 
       System.out.println(stringBufferSQL.toString());     
      }   
    catch (Exception e){ 
       System.out.println("Se ha producido un error durante la lectura del archivo ");     
      }    
  return bresultado;
} 

public double iValidaGarantiasRetiro(int sFideicomiso,int sSubcuenta,int sGarantia,int sBien) 
{//String filename
    StringBuffer sb = new StringBuffer();
    String datos1="";   
    nConsultas dato = new nConsultas();   
    String nombreDato="";
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    String estado, clabe="";
    int value = 0,iRows=0;
    String squery="";
    String sRespuesta="";
    int icontreg=0;
    int icontgar=0;
    nConsultas archivo = new nConsultas();
    boolean eof = false;
    String line = null; 
    String bresultado="1";
    int renglon=0, columna=0,ubicaclabe=0,ubicamotivo=0;
    int renglonaux=0;
    double dImporteIndividualRetiros =0;
    double dImporteIndividualDepositos =0;
    double dImporteIndividualDisponible =0;
    String separador="";
    
    Connection connectionG = null;
    Statement statementG = null;
    ResultSet resultSetG = null;
    
    
   try
   { 
      //se recuperan datos de cuenta clabe
      stringBufferSQL= new  StringBuffer();
      //Se crea una instancia de la clase que se conecta hacia la base de datos
      nFiducia fiduciaConnection = new nFiducia();
      //Manda llamar al metodo que crea la conexion
      fiduciaConnection.conectarBD();
      //Asigna el valor de la conexion a la variable declarada
      connectionG = fiduciaConnection.conBD;
      //Crea un statement
      statementG = connectionG.createStatement();
        
      // retiros masivos  
      stringBufferSQL = new  StringBuffer();
      stringBufferSQL.append("SELECT NVL(SUM(FPB_IMPORTE_EXT),0) ");
      stringBufferSQL.append(" FROM F_PAGOS_BIENES ");
      stringBufferSQL.append("   WHERE FPB_ID_FIDEICOMISO = "+sFideicomiso);
      stringBufferSQL.append("     AND FPB_ID_SUBCUENTA = "+sSubcuenta);
      stringBufferSQL.append("     AND FPB_ID_BIEN_GARANTIA = "+sBien);
      stringBufferSQL.append("     AND FPB_ID_GARANTIA = "+sGarantia);
      resultSetG = statementG.executeQuery(stringBufferSQL.toString());    
      
      if(resultSetG.next())
      {
        dImporteIndividualRetiros = resultSetG.getDouble(1);
      }
      
      // depositos masivos
      stringBufferSQL = new  StringBuffer();
      stringBufferSQL.append("SELECT NVL(SUM(FLB_IMPORTE_EXT),0) ");
      stringBufferSQL.append(" FROM F_LIQUIDACIONES_BIENES ");
      stringBufferSQL.append("   WHERE FLB_ID_FIDEICOMISO = "+sFideicomiso);
      stringBufferSQL.append("     AND FLB_ID_SUBCUENTA = "+sSubcuenta);
      stringBufferSQL.append("     AND FLB_ID_BIEN_GARANTIA = "+sBien);
      stringBufferSQL.append("     AND FLB_ID_GARANTIA = "+sGarantia);
      resultSetG = statementG.executeQuery(stringBufferSQL.toString()); 
      
      if(resultSetG.next())
      {
        dImporteIndividualDepositos = resultSetG.getDouble(1);
      }
      
      dImporteIndividualDisponible =  dImporteIndividualRetiros-dImporteIndividualDepositos;
      
      resultSetG.close();
       
      fiduciaConnection.CloseBD(); 
      if (statementG != null)
        statementG.close();
      if (resultSetG != null)
        resultSetG.close();
      if (connectionG != null)
        connectionG.close();       
    }
    catch (SQLException e){ 
       System.out.println(stringBufferSQL.toString());     
      }   
    catch (Exception e){ 
       System.out.println("Se ha producido un error durante la lectura del archivo ");     
      }    
  return dImporteIndividualDisponible;
}   

// --------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------

// VALIDACION CARGA DEPOSITOS MASIVOS GARANTIA --------------------------------------------
// --------------------------------------------------------------------------------------
 
public String iValidaCargaGarantiasDeposito(String sFolio,String sImporte,int sFideicomiso) 
       {//String filename 
      StringBuffer sb = new StringBuffer();
      String datos1="";   
      nConsultas dato = new nConsultas();   
      String nombreDato="";
      StringBuffer sbTabla = new StringBuffer();
      StringBuffer stringBufferSQL = new StringBuffer();
      String estado, clabe="";
      int value = 0,iRows=0;
      String squery="";
      String sRespuesta="";
      int icontgar=0;
     nConsultas archivo = new nConsultas();
     boolean eof = false;
     String line = null; 
     String bresultado="1";
     int renglon=0, columna=0,ubicaclabe=0,ubicamotivo=0;
     int renglonaux=0;
     double dImporteTotal=0;
     BigDecimal dImporteIndividual = new BigDecimal(0);
     BigDecimal dImporteIndividualValida = new BigDecimal(0);
     String separador="";
     int iTemporal=0;
     int sSubcuenta = 0;
     int sGarantia = 0;
     int sBien = 0;
   try{ 
        //se recuperan datos de cuenta clabe
        stringBufferSQL= new  StringBuffer();
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        nFiducia fiduciaConnection = new nFiducia();
        //Manda llamar al metodo que crea la conexion
        fiduciaConnection.conectarBD();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conBD;
        //Crea un statement
        statement = connection.createStatement();

        // datos bien en garantia-----
        stringBufferSQL = new  StringBuffer();
        stringBufferSQL.append("SELECT FRMA_SUBCTO,FRMA_NUM_GARANTIA,FRMA_NUM_BIEN_GAR FROM F_RETIROS_MASIVOS");
        stringBufferSQL.append(" WHERE FRMA_FOLIO="+sFolio);
        resultSet = statement.executeQuery(stringBufferSQL.toString());
        
        if(resultSet.next())
        {
          sSubcuenta = resultSet.getInt(1);
          sGarantia = resultSet.getInt(2);
          sBien = resultSet.getInt(3);
        }
        resultSet.close();
      
        // bienes gar ---
        stringBufferSQL = new  StringBuffer();
        stringBufferSQL.append("SELECT COUNT(1) FROM F_BIENESGAR");
        stringBufferSQL.append("  WHERE FGRS_ID_FIDEICOMISO = "+sFideicomiso);
        stringBufferSQL.append("    AND FGRS_ID_SUBCUENTA = "+sSubcuenta);
        stringBufferSQL.append("    AND FORS_ID_GARANTIA = "+sBien);
        stringBufferSQL.append("    AND FORS_CVE_TIPO_GARANTIA = "+sGarantia);
        resultSet = statement.executeQuery(stringBufferSQL.toString());    
        if(resultSet.next())
        {
          icontgar=resultSet.getInt(1);
        }
        resultSet.close();
       
        if(icontgar!=0)
        {
          // --------------------------
          bresultado="0";
          stringBufferSQL = new  StringBuffer();
          stringBufferSQL.append("SELECT NVL(SUM(FRMA_IMPORTE),0), FRMA_NUM_GARANTIA, FRMA_NUM_BIEN_GAR");
          stringBufferSQL.append(" FROM F_RETIROS_MASIVOS");
          stringBufferSQL.append(" WHERE FRMA_FOLIO="+sFolio);
          stringBufferSQL.append("  GROUP BY FRMA_NUM_GARANTIA,FRMA_NUM_BIEN_GAR");
          
          resultSet = statement.executeQuery(stringBufferSQL.toString());    
          
          while(resultSet.next())
          {
            dImporteIndividual = new BigDecimal(resultSet.getString(1));
            dImporteIndividualValida = new BigDecimal(iValidaGarantiasDeposito(sFideicomiso,sSubcuenta,sGarantia,sBien));
            
            if(dImporteIndividual.compareTo(dImporteIndividualValida)>0)
            {
              bresultado="1;"+sGarantia+"-"+sBien;
            }
          }
          resultSet.close();
        // ------------------------------
          
        }
        else
          bresultado="1";
      iTemporal=    bresultado.indexOf("1;");
      if(bresultado.indexOf("1;")==0){
        stringBufferSQL= new  StringBuffer();
        stringBufferSQL.append(""); 
        stringBufferSQL.append("DELETE FROM F_RETIROS_MASIVOS");
        stringBufferSQL.append(" WHERE FRMA_FOLIO="+sFolio);
        iRows = statement.executeUpdate(stringBufferSQL.toString()); 
      }  
      fiduciaConnection.CloseBD(); 
      if (statement != null)
        statement.close();
      if (resultSet != null)
        resultSet.close();
      if (connection != null)
        connection.close();       
    }
    catch (SQLException e){ 
       System.out.println(stringBufferSQL.toString());     
      }   
    catch (Exception e){ 
       System.out.println("Se ha producido un error durante la lectura del archivo ");     
      }    
  return bresultado;
}  
 

public double iValidaGarantiasDeposito(int sFideicomiso,int sSubcuenta,int sGarantia,int sBien) 
{//String filename
    StringBuffer sb = new StringBuffer();
    String datos1="";   
    nConsultas dato = new nConsultas();   
    String nombreDato="";
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    String estado, clabe="";
    int value = 0,iRows=0;
    String squery="";
    String sRespuesta="";
    int icontreg=0;
    int icontgar=0;
    nConsultas archivo = new nConsultas();
    boolean eof = false;
    String line = null; 
    String bresultado="1";
    int renglon=0, columna=0,ubicaclabe=0,ubicamotivo=0;
    int renglonaux=0;
    double dImporteIndividual =0;
    String separador="";
    
    Connection connectionG = null;
    Statement statementG = null;
    ResultSet resultSetG = null;
    
    
   try
   { 
      //se recuperan datos de cuenta clabe
      stringBufferSQL= new  StringBuffer();
      //Se crea una instancia de la clase que se conecta hacia la base de datos
      nFiducia fiduciaConnection = new nFiducia();
      //Manda llamar al metodo que crea la conexion
      fiduciaConnection.conectarBD();
      //Asigna el valor de la conexion a la variable declarada
      connectionG = fiduciaConnection.conBD;
      //Crea un statement
      statementG = connectionG.createStatement();
        
      stringBufferSQL = new  StringBuffer();
      stringBufferSQL.append("SELECT FORS_IMP_BIEN - ");
      stringBufferSQL.append("       (SELECT NVL(SUM(FPB_IMPORTE_EXT),0) FROM F_PAGOS_BIENES ");
      stringBufferSQL.append("           WHERE FPB_ID_FIDEICOMISO = FGRS_ID_FIDEICOMISO ");
      stringBufferSQL.append("           AND FPB_ID_SUBCUENTA = FGRS_ID_SUBCUENTA ");
      stringBufferSQL.append("           AND FPB_ID_GARANTIA = FORS_CVE_TIPO_GARANTIA ");
      stringBufferSQL.append("            AND FPB_ID_BIEN_GARANTIA = FORS_ID_GARANTIA) DISPONIBLE_BIEN ");
      stringBufferSQL.append(" FROM F_BIENESGAR ");
      stringBufferSQL.append("   WHERE FGRS_ID_FIDEICOMISO = "+sFideicomiso);
      stringBufferSQL.append("     AND FGRS_ID_SUBCUENTA = "+sSubcuenta);
      stringBufferSQL.append("     AND FORS_ID_GARANTIA = "+sBien);
      stringBufferSQL.append("     AND FORS_CVE_TIPO_GARANTIA = "+sGarantia);
      resultSetG = statementG.executeQuery(stringBufferSQL.toString());    
      
      if(resultSetG.next())
      {
        dImporteIndividual = resultSetG.getDouble(1);
      }
      resultSetG.close();
       
      fiduciaConnection.CloseBD(); 
      if (statementG != null)
        statementG.close();
      if (resultSetG != null)
        resultSetG.close();
      if (connectionG != null)
        connectionG.close();       
    }
    catch (SQLException e){ 
       System.out.println(stringBufferSQL.toString());     
      }   
    catch (Exception e){ 
       System.out.println("Se ha producido un error durante la lectura del archivo ");     
      }    
  return dImporteIndividual;
}   
  
// --------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------
     
	
public String[] sValidaCLABES(String sFolio,String sImporte) 
{//String filename 
      StringBuffer sb = new StringBuffer();
      String datos1="";   
      nConsultas dato = new nConsultas();   
      String nombreDato="";
      StringBuffer sbTabla = new StringBuffer();
      StringBuffer stringBufferSQL = new StringBuffer();
      StringBuffer stringBufferSQL2 = new StringBuffer();
      String estado, clabe="";
      int value = 0,iRows=0;
      String squery="";
      String sRespuesta="";
      int icontreg=0;
     nConsultas archivo = new nConsultas();
     boolean eof = false;
     String line = null; 
     String bresultado="1";
     int renglon=0, columna=0,ubicaclabe=0,ubicamotivo=0;
     int renglonaux=0;
     double dImporteTotal=0;
     String separador="";
     String[] sRegresoValidaRFC=null;
   try{ 
        //se recuperan datos de cuenta clabe
        stringBufferSQL= new  StringBuffer();
        stringBufferSQL2= new  StringBuffer();
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        nFiducia fiduciaConnection = new nFiducia();
        //Manda llamar al metodo que crea la conexion
        fiduciaConnection.conectarBD();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conBD;
        //Crea un statement
        statement = connection.createStatement();

        CallableStatement spValidaRFC;

        spValidaRFC = connection.prepareCall( "{? = call INTERFASES.F_VALIDA_RFC_MASIVOS(?)}" );
        spValidaRFC.clearParameters();  
        spValidaRFC.registerOutParameter(1, Types.VARCHAR);         
        spValidaRFC.setInt(2, Integer.valueOf(sFolio).intValue());          
           
        spValidaRFC.execute();
        
        sRegresoValidaRFC=spValidaRFC.getString(1).split("-");  
			  bresultado=sRegresoValidaRFC[0];
        if(bresultado.equals("1")||bresultado.equals("2")){
            stringBufferSQL.append(""); 
            stringBufferSQL.append("DELETE FROM F_RETIROS_MASIVOS");
            stringBufferSQL.append(" WHERE FRMA_FOLIO="+sFolio);
            iRows = statement.executeUpdate(stringBufferSQL.toString());            
        }    
        
      if (statement != null)
        statement.close();
      if (connection != null)
        connection.close();       
    }
    catch (SQLException e){ 
       System.out.println(e);     
      }   
    catch (Exception e){ 
       System.out.println("Se ha producido un error durante la lectura del archivo ");     
      }    
  return sRegresoValidaRFC;
} 

}