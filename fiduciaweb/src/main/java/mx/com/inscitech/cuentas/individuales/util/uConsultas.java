package mx.com.inscitech.cuentas.individuales.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.cuentas.individuales.lib.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mx.com.inscitech.cuentas.individuales.lib.Conexion;
//import mx.com.inscitech.fiducia.common.util.Conexion;

public class uConsultas extends queryConsultas{
    private static final Logger LOGGER = LoggerFactory.getLogger(uConsultas.class);
    
    private boolean blnDebug = true;
    String query="";
    public Statement st=null;
    public ResultSet rs=null;
    private PreparedStatement prepared=null;
    Connection dbConn = null;
    public void dbConnClose()
    {
        try { if(st != null ) st.close(); } catch (Exception ex) { LOGGER.debug("st"+ex); }
        try { if(rs != null ) rs.close(); } catch (Exception ex) { LOGGER.debug("rt"+ex); }
        try { if(prepared != null ) prepared.close(); } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
        try { 
            if(dbConn != null ) 
                    dbConn.close();
        } catch (Exception ex) { LOGGER.error("Exception: ", ex); }
    }
    public synchronized  ResultSet getResultSet ( int opc , DatosBD db) 
     throws Exception, SQLException
    {
        int i = 0;
        Conexion  c = null;	
        try{
            c = new Conexion();
            dbConn = c.conectarBD ( );				
            if (dbConn == null)	{	
                LOGGER.debug(this.getClass()+"-Error es nula la conexion");
                LOGGER.debug(query);
                throw new Exception ("0");
            }
            else						
                 st= dbConn.createStatement();

        } catch (SQLException e ) {
                LOGGER.debug(this.getClass() +"->" +  e); 
                throw new Exception ("0");
        }catch (Exception e){
                LOGGER.debug(this.getClass()+"->" +e); 
                throw new Exception ("2");
        }			
        try{
            switch (opc){
            	
                  case 1:
                  		query=queryCaptura;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO												
                        break;   
                  
                  case 2:
                  
                  		query=queryfirmas;
                  		
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//dpo_folio_opera	
                        prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//dpo_num_contrato	
                        break;
                                    	
            	//INSTRUCCIONES 
                  case 11://PENDIENTES
                  		query=strQueryInstruccEspera;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO												
                        break;   
                  
                  case 12://ACTIVAS O ACEPTADAS
                  		query=strQueryInstrucc + strQueryInstruccOrderBy;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO												
                        prepared.setString (2,(String)db.getDatoBD(1));//FECHA INICIAL
                        prepared.setString (3,(String)db.getDatoBD(2));//FECHA FINAL

                        break;   
                       
                
                   case 13://ACTIVAS O ACEPTADAS POR ACUERDO
                  		query=strQueryInstrucc + strQueryInstruccPKAacuerdo+strQueryInstruccOrderBy;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO												
                        prepared.setString (2,(String)db.getDatoBD(1));//FECHA INICIAL
                        prepared.setString (3,(String)db.getDatoBD(2));//FECHA FINAL

                        break;  

                  
                  //DETALLE DE INSTRUCCIONES
                  case 21://DETALLE DEPOSITO
                  
                  		query=queryDetalleDeposito;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//dpo_folio_opera	
                        prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//dpo_num_contrato	
                        break;
                        
                  case 22://DETALLE RETIRO
                  
                  		query=queryDetalleRetiro;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//del_folio_opera	
                        prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//del_num_contrato	
                        break;
                        
                  case 32://DETALLE RETIRO SWIFT
                  
                  		query=queryDetalleRetiroSWIFT;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//del_folio_opera	
                        prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//del_num_contrato	
                        break;
                        
                              
                  case 23://DETALLE TRASPASO
                  
                  		query=queryDetalleTraspaso;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//dpo_folio_opera	
                        prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//dpo_num_contrato	
                        break;								     		
                      
                   //CONSULTA DE SALDOS POR CONTRATO DE INVERSION    	  
				  case 30:
                  		query=querySaldosPorContrato;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO												
                        break;     
                        
                        
                    case 40: //CONSULTA DE CUENTAS PENDIENTES
                     query=queryCuentasPendientes;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//PFD_NUM_CONTRATO
                     break;
                    
                    case 41: //CONSULTA DE CUENTAS PENDIENTES POR CLAVE Y POR FISO
                    case 47: //para envio de mail de rechazo de cuenta
                     query=queryCuentasPendientesporClave;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CDP_CVE_CUENDEP                       
                     prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//PFD_NUM_CONTRATO
                     break;

                    case 42: //CONSULTA DE DESCRIPCION DE BANCOS
                     query=queryDescripcionBanco;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CVE_NUM_SEC_CLAVE
                     break;

                    case 43: //CONSULTA DE NUMERO DE USUARIO A TRAVES DE LA CLAVE DE USUARIO
                     query=querynumusuario;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setString (1,(String)db.getDatoBD(0));//CLAVE DE USUARIO
                     break;
                     
                    case 44: //CONSULTA DE CUENTAS PENDIENTES
                    
                     query=queryDetalleCuenta;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//PFD_NUM_CONTRATO
                     break;
                     
                    case 45: //CONSULTA DE usuario que captura cuenta
                    
                     query=queryCapturaCuentas;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//PFD_FOLIO
                     break;                     

                    case 46: //CONSULTA DE NOMBRE DE FIDEICOMISO O CONTRATO
                    
                     query=queryNombreFideicomiso;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CTO_NUM_CONTRATO
                     break;
                     /// queries PROTEGO
                     case 99: //CONSULTA DE CORREO USUARIO
                    
                     query=queryAgenda;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
                     break;
                    case 100: //CONSULTA DE CORREO USUARIO
                    
                    query=queryUsuarioAgenda;
                    prepared = dbConn.prepareStatement (query);
                    break;
                    case 101: //CARTA ACEPTACION
                    
                    query=queryProsTipoPers;
                    prepared = dbConn.prepareStatement (query);
                    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
                    break;
             			    case 102: //Valor de Mercado
             			    
             			    query=queryECValorMercado;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 103: //Instrumentos de Deuda
             			    
             			    query=queryECInsDeuda;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 104: //Mercado de Dinero
             			    
             			    query=queryECMercaDin;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 105: //Instrumentos Capitales
             			    
             			    query=queryECInsCap;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 106: //Mercado de Capitales
             			    
             			    query=queryECMerCapi;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 107: //Bienes Fideicomitidos
             			    
             			    query=queryECBienFid;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 108: //Movimientos del Mes del Contrato Moneda Nacional
             			    
             			    query=queryECMovConMN;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 109: //Movimientos del Mes del Contrato Dolares
             			    
             			    query=queryECMovConDL;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 110: //Situacion financiera
             			    
             			    query=queryECSitFin;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 111: //Situacion financiera dolares
             			    
             			    query=queryECSitFinDL;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 112: //Estado de Resultados
             			    
             			    query=queryECEdoRes;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 113: //Estado de Resultados Dolares
             			    
             			    query=queryECEdoResDL;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 114: //Depositos en Efectivo
             			    
             			    query=queryECDepEfe;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 115: //Comisiones Cobradas
             			    
             			    query=queryECComCob;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 116: //Comisiones Cobradas
             			    
             			    query=queryECCont;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    break;
             			    case 117: //Resumen Estado de Cuenta                                        
                                        query = queryResumenEstadoCuenta;
                                        prepared = dbConn.prepareStatement(query);
                                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//Fideicomiso
                                        prepared.setString (2,((String)db.getDatoBD(1)));// Inversionista               
             			    break;
             			    case 118: //Resumen Estado de Cuenta                                        
             			        query = queryResumenEstadoCuenta2;
             			        prepared = dbConn.prepareStatement(query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//
             			    prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//
             			    break;            
            
            
                default:
                        break;
                        
             			}	
          
             rs = prepared.executeQuery ( );
             return rs;
        } catch (SQLException e ) {
        		LOGGER.debug(query);
                LOGGER.debug(this.getClass()+"->" + e+"<-> opcion:"+ opc);
                try{
                    dbConn.close();
                } catch (Exception eCon){
                        throw new Exception ("1");
                }
                throw new Exception ("1");
        }catch (Exception e) {
                LOGGER.debug(this.getClass()+"->" + e+"<->opcion:"+ opc);
                try{
                    dbConn.close();
                }catch (Exception eCon){
                        throw new Exception ("1");
                }
                throw new Exception ("3");
        }
    }
}