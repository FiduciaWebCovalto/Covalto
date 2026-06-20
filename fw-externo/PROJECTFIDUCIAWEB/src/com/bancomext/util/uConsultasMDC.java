package com.bancomext.util;
import com.bancomext.lib.*;
import java.sql.*;
/**
 * Autor:  inscitech México
 * mail: eminguer@inscitechmexico.com
 * Fecha: 29/06/2009
 **/
public class uConsultasMDC extends queryConsultasMDC{    
    private boolean blnDebug = true;
    String query="";
    public Statement st=null;
    public ResultSet rs=null;
    private PreparedStatement prepared=null;
    Connection dbConn = null;
    public void dbConnClose()
    {
        try { if(st != null ) st.close(); } catch (Exception ex) { System.out.println("st"+ex); }
        try { if(rs != null ) rs.close(); } catch (Exception ex) { System.out.println("rt"+ex); }
        try { if(prepared != null ) prepared.close(); } catch (Exception ex) { System.out.println(ex); }
        try { 
            if(dbConn != null ) 
                    dbConn.close();
        } catch (Exception ex) { System.out.println(ex); }
    }
    public synchronized  ResultSet getResultSet ( int opc , DatosBD db) 
     throws Exception, SQLException
    {
        int i = 0;
        conexion  c = null;	
        try{
            c = new conexion();
            dbConn = c.conectarBD ( );				
            if (dbConn == null)	{	
                System.out.println (this.getClass()+"-Error es nula la conexion");
                System.out.println (query);
                throw new Exception ("0");
            }
            else						
                 st= dbConn.createStatement();

        } catch (SQLException e ) {
                System.out.println (this.getClass() +"->" +  e); 
                throw new Exception ("0");
        }catch (Exception e){
                System.out.println (this.getClass()+"->" +e); 
                throw new Exception ("2");
        }			
        try{
            switch (opc){
            	
                 case 1://PENDIENTES con instrucciones no moentarias
                  		query=strQueryInstruccEsperaConNoMonetarios;
                      prepared = dbConn.prepareStatement (query);
                      prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO
                     // prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//CTO_NUM_CONTRATO
                 break; 
                 case 2://OBTENER FECHA Y DESCRIPCION DE INST. NO MENET
                  		query=strQueryGetDescrInstNoMonet;
                      prepared = dbConn.prepareStatement (query);
                      prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//NUM_CONTRATO
                      prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//FOLIO
                break;
                 case 3://OBTENER LA ETAPA
                  		query=strQueryEtapaSol;
                      prepared = dbConn.prepareStatement (query);
                      prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//NUM USUARIO
                break;         
                 case 4://OBTENER DOCUMENTOS POR TIPO DE OPERACION Y ETAPA 1
                  		query=strQueryDocxEtapa;
                      prepared = dbConn.prepareStatement (query);
                      prepared.setString (1,(String)db.getDatoBD(0));//NUMERO DE OPERACION
                break;                  
                default:
                break;
         }	
          
             rs = prepared.executeQuery ( );
  
             return rs;
        } catch (SQLException e ) {
        		System.out.println(query);
                System.out.println (this.getClass()+"->" + e+"<-> opcion:"+ opc);
                try{
                    dbConn.close();
                } catch (Exception eCon){
                        throw new Exception ("1");
                }
                throw new Exception ("1");
        }catch (Exception e) {
                System.out.println (this.getClass()+"->" + e+"<->opcion:"+ opc);
                try{
                    dbConn.close();
                }catch (Exception eCon){
                        throw new Exception ("1");
                }
                throw new Exception ("3");
        }
    }
}