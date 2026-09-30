/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.util;
import mx.com.inscitech.clients.lib.*;
import java.sql.*;

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
                        prepared = dbConn.prepareStatement (strQueryBalance);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO	
						prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//SAL_MES_MOVTO
						prepared.setInt (3,((Integer)db.getDatoBD(2)).intValue());//SAL_ANO_MOVTO
						
                        rs = prepared.executeQuery ( );
                        break;
                        
                  //ESTADO DE RESULTADOS      
                   case 2:
                        prepared = dbConn.prepareStatement (strQueryEdoRes);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO	
						prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//SAL_MES_MOVTO
						prepared.setInt (3,((Integer)db.getDatoBD(2)).intValue());//SAL_ANO_MOVTO
                        rs = prepared.executeQuery ( );
                        break;    
                        
                        
                   case 3://DATOS DE LA TABLA DINAMICA DE ESTADOS FINANCIEROS
                          //DONDE SE ENCUENTRA LA INFORMACION A IMPRIMIR

                        prepared = dbConn.prepareStatement (strDatosEdoFin);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FIDEICOMISO	
                        prepared.setString (2,(String)db.getDatoBD(1));//NOMBRE DE GRUPO                        
                        rs = prepared.executeQuery ( );
                        break;    

                   case 4://NUMERO DE COLUMNAS DE UN GRUPO

                        prepared = dbConn.prepareStatement (strNumColEdoFin);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//NUMERO DE REPORTE	
                        prepared.setString (2,(String)db.getDatoBD(1));//NOMBRE DE GRUPO
                        rs = prepared.executeQuery ( );
                        break;    

                   case 5://DATOS DE LA TABLA DINAMICA DE ESTADOS FINANCIEROS
                          //DONDE SE ENCUENTRA LA INFORMACION A IMPRIMIR
                          //ESTADO DE RESULTADOS

                        prepared = dbConn.prepareStatement (strDatosEdoFinEdoRes);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FIDEICOMISO	
                        prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//NUMERO DE REPORTE	                        
                        rs = prepared.executeQuery ( );
                        break;    
                   		
                   		
                    //TIPO DE ADMINISTRACION
                   case 10:
                        prepared = dbConn.prepareStatement (strTipoAdmon);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO(NUMERO DE FISO)	
					    rs = prepared.executeQuery ( );
                        break;
                        
                         
				   //AVISOS INTERNET
                   case 11:
                        prepared = dbConn.prepareStatement (strQueryAvisos);
                        rs = prepared.executeQuery ( );
                        break;
                        
                          		
                default:
                        break;
             }			
             return rs;
        } catch (SQLException e ) {
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