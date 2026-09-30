package mx.com.inscitech.cuentas.individuales.util;

 import mx.com.inscitech.cuentas.individuales.lib.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class uReporte extends queryReportes{    
    private boolean blnDebug = true;
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
    public synchronized  ResultSet getResultSet ( int opc , DatosBD db, String tabla) 
     throws Exception, SQLException
    {
        int i = 0;
        Conexion  c = null;	
        try{
            c = new Conexion();
            dbConn = c.conectarBD ( );				
            if (dbConn == null)	{	
                System.out.println (this.getClass()+"-Error es nula la conexion");
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
            	
            	//BALANCE GENERAL
                  case 1:
                    System.out.println("this.getStrQueryBalance(tabla): " + this.getStrQueryBalance(tabla) + " tabla: " + tabla);
                        prepared = dbConn.prepareStatement (this.getStrQueryBalance(tabla));
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO	
                        
                        if(tabla.trim().toUpperCase().equals("SALDOSH")) {
                          prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//SAL_MES_MOVTO
                          prepared.setInt (3,((Integer)db.getDatoBD(2)).intValue());//SAL_ANO_MOVTO
                        }
                        
                        rs = prepared.executeQuery ( );
                        break;
                        
                  //ESTADO DE RESULTADOS      
                   case 2:
                        //System.out.println ("strQueryEdoRes->" + strQueryEdoRes);
                        prepared = dbConn.prepareStatement (this.getStrQueryEdoRes(tabla));
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO	
                        
                        if(tabla.trim().toUpperCase().equals("SALDOSH")) {
                          prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//SAL_MES_MOVTO
                          prepared.setInt (3,((Integer)db.getDatoBD(2)).intValue());//SAL_ANO_MOVTO
                        }
                        
                        rs = prepared.executeQuery ( );
                        break;    
                        
                  //ESTADO DE RESULTADOS POR MES
                   case 3:
                        //System.out.println ("strQueryEdoRes->" + getStrQueryEdoResMes);
                        prepared = dbConn.prepareStatement (this.getStrQueryEdoResMes(tabla));
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO	
                        
                        if(tabla.trim().toUpperCase().equals("SALDOSH")) {
                          prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//SAL_MES_MOVTO
                          prepared.setInt (3,((Integer)db.getDatoBD(2)).intValue());//SAL_ANO_MOVTO
                        }
                        
                        rs = prepared.executeQuery ( );
                        break;                          
                   		
                   		
                    //TIPO DE ADMINISTRACION
                   case 10:
                        prepared = dbConn.prepareStatement (this.getStrTipoAdmon());
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO(NUMERO DE FISO)	
					    rs = prepared.executeQuery ( );
                        break;
                        
                         
				   //AVISOS INTERNET
                   case 11:
                        prepared = dbConn.prepareStatement (this.getStrQueryAvisos());
                        rs = prepared.executeQuery ( );
                        break;
                        

                 
                 //VALIDA MES CERRADO
                 case 12:
                 System.out.println("this.getStrValidaCerrrado(tabla): " + tabla);
                 prepared = dbConn.prepareStatement (this.getStrValidaCerrrado());
                 rs = prepared.executeQuery ( );
                 break;


                 //Variacion Patrimonio
                 case 13:
                 System.out.println("this.getStrValidaCerrrado(tabla): " + tabla);
                 prepared = dbConn.prepareStatement (this.getStrVariacionPatrimonio());
                 prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO    
                 rs = prepared.executeQuery ( );
                 break;

                          		
                default:
                        break;
             }			
             return rs;
        } catch (SQLException e ) {
          e.printStackTrace();
                System.out.println (this.getClass()+"->" + e+"<->opcion:"+ opc);
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