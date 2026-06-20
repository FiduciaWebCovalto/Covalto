/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package com.bancomext.util;
import com.bancomext.lib.*;
import java.sql.*;

public class uConsultas extends queryConsultas{    
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
            	
                  case 1:
                  		query=queryCaptura;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FOLIO DE OPERACION
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
                        prepared.setString (2,(String)db.getDatoBD(1));//FECHA INICIAL
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
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//NUMERO DE FIDEICOMISO
                     break;
                     
                    case 45: //CONSULTA DE usuario que captura cuenta
                    
                     query=queryCapturaCuentas;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//PFD_FOLIO
                     break;                     

                    case 46: //CONSULTA DE CUENTA POR CLABE
                    
                     query=queryDetalleCuentaClabe;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//PFD_FOLIO
                     prepared.setString (2,(String)db.getDatoBD(1));//PFD_FOLIO
                     break;                     

                    case 47: //CONSULTA DE TERCEROS
                    
                     query=queryDetalleTerceros;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FIDEICOMISO
                     break;                     

                    case 48: //CONSULTA DE MONEDAS  MEDIANTE CLAVE
                    
                     query=querynomMoneda;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//Numero de moneda
                     break;                     

                    case 49: //CONSULTA DE MONEDAS MEDIANTE NOMBRE
                    
                     query=queryCveMoneda;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setString (1,(String)db.getDatoBD(0));//Numero de moneda
                     break;                     

                    case 50: //CONSULTA DE CUENTA DE TERCEROS PARA BANCOMER CIE
                    
                     query=queryConvenioTerceros;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//Fideicomiso
                     prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//Numero de Persona (Tercero)
                     break;                     

                    case 51: //CONSULTA DE FICHA UNICA POR FOLIO
                    
                     query=strQueryInstruccFichaUnicaFolio;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FOLIO
                     break;                     


                    case 52: //CONSULTA DE FICHA UNICA POR FECHA
                    
                     query=strQueryInstruccFichaUnicaFecha;
                     prepared = dbConn.prepareStatement (query);
                      prepared.setString (1,(String)db.getDatoBD(0));//FECHA
                      break;                     

                    case 53: //CONSULTA DE DETALLE RETIRO FICHA UNICA
                    
                     query=queryDetalleRetiroFichaUnica;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FOLIO
                      break;                     


                    case 54: //CONSULTA DE DETALLE DEPOSITO FICHA UNICA
                    
                     query=queryDetalleDepositoFichaUnica;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FOLIO
                      break;                     


                  case 55://DETALLE RETIRO SWIFT FICHA UNICA
                  
                  		query=queryDetalleRetiroSWIFTFichaUnica;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//del_folio_opera	
                        break;

                  case 56://USUARIOS QUE AUTORIZAN LA INSTRUCCION
                  
                  		query=queryUsuariosAutorizaInstrucc;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//del_folio_opera	
                        break;


                  case 57://DETALLE DE MOVIMIENTOS ESTADO DE CUENTA
                  
                  		query=queryMovMesEdoCta;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setString (1,(String)db.getDatoBD(0));//FECHA
                        prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//CONTRATO DE INVERSION
                        break;

                  case 58://RESUMEN DE MOVIMIENTOS ESTADO DE CUENTA
                  
                  		query=queryResumMovEdoCta;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setString (1,(String)db.getDatoBD(0));//FECHA
                        prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//CONTRATO DE INVERSION
                        break;

                  case 59://VALOR VIGENTE ESTADO DE CUENTA
                  
                  		query=queryValorVigEdoCta;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setString (1,(String)db.getDatoBD(0));//FECHA
                        prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//CONTRATO DE INVERSION
                        break;

                  case 60://DETALLE DE MOVIMIENTOS ESTADO DE CUENTA MON EXT
                  
                  		query=queryMovMesEdoCtaMonExt;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setString (1,(String)db.getDatoBD(0));//FECHA
                        prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//CONTRATO DE INVERSION
                        break;

                  case 61://RESUMEN DE MOVIMIENTOS ESTADO DE CUENTA MON EXT
                  
                  		query=queryResumMovEdoCtaMonExt;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(1)).intValue());//CONTRATO DE INVERSION
                        prepared.setString (2,(String)db.getDatoBD(0));//FECHA
                        
                        break;


                  case 62://VERIFICA SI EL CONTRATO ES MONEDA NACIONAL
                  
                  		query=queryVerificaMonedaNacional;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CONTRATO DE INVERSION
                        
                        break;

                  case 63://VERIFICA SI EL CONTRATO ES MONEDA EXTRANJERA
                  
                  		query=queryVerificaMonedaExtranjera;
                        prepared = dbConn.prepareStatement (query);
                        prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CONTRATO DE INVERSION
                        
                        break;

                    case 64: //CONSULTA DE CUENTA POR CLABE
                    
                     query=queryDetalleCuentaClabe2;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setString (1,(String)db.getDatoBD(0));//PFD_FOLIO
                     break;                     

                    case 65: //HORARIO DE LA BASE
                    
                     query=queryHorarioBase;
                     prepared = dbConn.prepareStatement (query);
                     break;  
                     
                     case 66: //CONSULTA DEL NOMBRE DE LA SUBCUENTA
                     query=qryGetNomSubCta;
                     prepared = dbConn.prepareStatement (query);
                     prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//CPR_NUM_CONTRATO
                     prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//CPR_CONTRATO_INTER
                     break;
 
                      case 200: //MDC
                    
                     query=queryTipoOperacionesMDC;
                     prepared = dbConn.prepareStatement (query);
                     break;  

                    case 201: //DETALLE MDC
                    
                    query=querydetOperacionesMDC;
                    prepared = dbConn.prepareStatement (query);
                    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FIDEICOMISO
                    prepared.setInt (2,((Integer)db.getDatoBD(1)).intValue());//FIDEICOMISO                
                    break;  
            
                    case 202: //PARAMETRIZACION
                    
                    query=queryTipoOperacionesParam;
                    prepared = dbConn.prepareStatement (query);
                    prepared.setString (1,(String)db.getDatoBD(0));//SOLICITUD
                    break;            

                    case 203: //BIENES
                    
                    query=queryTipoOperacionesBienes;
                    prepared = dbConn.prepareStatement (query);
                    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FIDEICOMISO
                    break;            

                    case 204: //QUERqueryTipoOperacionesQuerysYS
                    
                    query=queryTipoOperacionesQuerys;
                    prepared = dbConn.prepareStatement (query);
                    prepared.setString (1,(String)db.getDatoBD(0));//INDICE
                    break;      
            
                    case 205: //PARAMETRIZACION HIJOS
             			    
             			    query=queryTipoOperacionesParamHijo;
             			    prepared = dbConn.prepareStatement (query);
             			//    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());// FTOP_NUM_OPER
             			    prepared.setString (1,(String)db.getDatoBD(0));//FTOP_NUM_OPER
             			    prepared.setString (2,(String)db.getDatoBD(1));//CONP_NOMBRE
             			    break;
            
                    case 206: //PATRIMONIO
             			    
             			    query=queryTipoPatrimonio;
             			    prepared = dbConn.prepareStatement (query);
             			    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FIDEICOMISO
             			    break; 
            
                    case 207: //honorario 
             			                    
                                    query=queryTipoHonorario;
                                    prepared = dbConn.prepareStatement (query);
                                    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FIDEICOMISO
                                    break; 
                  
                    case 208: //VALORES Y CONTABLE
             			                                    
                                    query=queryTipoContable;
                                    prepared = dbConn.prepareStatement (query);
                                    prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FIDEICOMISO
                                    break;
            
            
                    case 209: //RDC
             			                                                    
                                query=queryTipoRDC;
                                prepared = dbConn.prepareStatement (query);
                                prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FIDEICOMISO
                                break;
            
                    case 210: //EMBARGO
             			                                                                    
                                query=queryTipoEmbargo;
                                prepared = dbConn.prepareStatement (query);
                                prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FIDEICOMISO
                                break;
                    
                    case 211: //FISCAL
             			                                                                                    
                               query=queryTipoFiscal;
                               prepared = dbConn.prepareStatement (query);
                               prepared.setInt (1,((Integer)db.getDatoBD(0)).intValue());//FIDEICOMISO
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