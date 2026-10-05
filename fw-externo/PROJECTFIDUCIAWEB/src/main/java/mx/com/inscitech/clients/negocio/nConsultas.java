/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.negocio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.*;
import mx.com.inscitech.clients.util.*;

public class nConsultas extends nDatos{
    private static final Logger LOGGER = LoggerFactory.getLogger(nConsultas.class);

    
    ResultSet rsDatos;
    public void querySelect( int opc) 
    {
        uConsultas  consulta= new uConsultas ();
        DatosBD db = new DatosBD ();
        try {
            switch (opc)
            			{
            			
            			case 1://captura
            				db.setDataBO ( getVtrIntDato1 () ); //BIT_SEG_TRANSAC(Folio de la instruccion)			       
						    rsDatos = consulta.getResultSet ( opc , db);
						    break;
						
						case 2://firmas mancomunadas
            				db.setDataBO ( getVtrIntDato1 () ); //FIR_FOLIO
            				db.setDataBO ( getVtrIntDato2 () ); //FIR_NUM_CONTRATO
						    rsDatos = consulta.getResultSet ( opc , db);
						    break;    
            				
            			//INSTRUCCIONES
		                case 11://Pendientes 	  
						    db.setDataBO ( getVtrIntDato1 () ); //CTO_NUM_CONTRATO
						    db.setDataBO ( getVtrStrDato1 () ); //FECHA INICIAL             
						    rsDatos = consulta.getResultSet ( opc , db);
						    
						    break;
						    
 		                case 12://activas o aceptadas
						    db.setDataBO ( getVtrIntDato1 () ); //CTO_NUM_CONTRATO			       
						    db.setDataBO ( getVtrStrDato2 () ); //FECHA INICIAL		
						    db.setDataBO ( getVtrStrDato3 () ); //FECHA FINAL
						    rsDatos = consulta.getResultSet ( opc , db);
						    
						    break;
   
						//Detalle de instrucciones
						case 21://detalle Deposito 	
						case 22://detalle Retiro
						case 32://detalle SWIFT
						case 23://detalle Traspaso  
						    	db.setDataBO ( getVtrIntDato1 () ); //dpo_folio_opera			       
						    	db.setDataBO ( getVtrIntDato2 () ); //dpo_num_contrato			       
						  	  	rsDatos = consulta.getResultSet ( opc , db);
						    	
						    	break;    
						    	
						//CONSULTA DE SALDOS POR CONTRATO DE INVERSION    	
						case 30:// CONSULTA DE SALDOS POR CONTRATO DE INVERSION       
								db.setDataBO ( getVtrIntDato1 () ); //NUM_CONTRATO
						    	rsDatos = consulta.getResultSet ( opc , db);
						    break;
						    

                        case 40:// CONSULTA DE CUENTAS PENDIENTES POR FIDEICOMISO    
                        case 44:
                        case 45:
                        case 42://CONSULTA DE DESCRIPCION DE BANCOS
		                         db.setDataBO ( getVtrIntDato1 () ); //CDP_CVE_CUENDEP
		                         rsDatos = consulta.getResultSet ( opc , db);
		                         break;    
                        case 41:// CONSULTA DE CUENTAS PENDIENTES POR CLAVE       
                            	db.setDataBO ( getVtrIntDato1 () ); //PFD_FOLIO
                            	db.setDataBO ( getVtrIntDato2 () ); //PFD_NUM_CONTRATO
                            	rsDatos = consulta.getResultSet ( opc , db);
                            	break;                                                  
                        case 43://CONSULTA DE NUMERO DE USUARIO
                         db.setDataBO ( getVtrStrDato1 () ); //CDP_CVE_CUENDEP
                         rsDatos = consulta.getResultSet ( opc , db);
                         break;    

                        case 46://CONSULTA DE CUENTA POR CLABE
                          db.setDataBO ( getVtrIntDato1 () ); //NUMERO DE FIDEICOMISO
                          db.setDataBO ( getVtrStrDato1 () ); //CLABE DE LA CUENTA
                          rsDatos = consulta.getResultSet ( opc , db);
                          break;    

                        case 47: case 48://CONSULTA DE TERCEROS Y MONEDAS
                          db.setDataBO ( getVtrIntDato1 () ); //NUMERO DE FIDEICOMISO
                          rsDatos = consulta.getResultSet ( opc , db);
                          break;    

                        case 49://CONSULTA DE NOMBRE DE MONEDA
                         db.setDataBO ( getVtrStrDato1 () ); //CDP_CVE_CUENDEP
                         rsDatos = consulta.getResultSet ( opc , db);
                         break;    

                        case 50://CONSULTA DE NOMBRE DE MONEDA
                          db.setDataBO ( getVtrIntDato1 () ); //NUMERO DE FIDEICOMISO
                          db.setDataBO ( getVtrIntDato2 () ); //NUMERO DE PERSONA (TERCERO)                          
                         rsDatos = consulta.getResultSet ( opc , db);
                         break;    

                        case 51://CONSULTA DE FICHA UNICA POR FOLIO
                        case 53://CONSULTA DETALLE RETIRO FICHA UNICA POR FOLIO
                        case 54: //detalle deposito ficha unica
                        case 55://DETALLE SWIFT FICHA UNICA
                        case 56://USUARIOS QUE AUTORIZAN INSTRUCCION
                         db.setDataBO ( getVtrIntDato1 () ); //NUMERO DE FOLIO
                         rsDatos = consulta.getResultSet ( opc , db);
                         break;    

                        case 52://CONSULTA DE FICHA UNICA POR FECHA
                         db.setDataBO ( getVtrStrDato1 () ); //FECHA
                         rsDatos = consulta.getResultSet ( opc , db);
                         break;    

                        case 57://DETALLE DE MOVIMIENTOS EDO CTA
                        case 58://RESUMEN DE MOVIMIENTOS EDO CTA
                        case 59://VALOR VIGENTE EDO CTA
                        case 60://DETALLE DE MOVIMIENTO MON EXT
                        case 61://RESUMEN DE MOVIMIENTOS MON EXT                
                         db.setDataBO ( getVtrStrDato1 () ); //FECHA
                         db.setDataBO ( getVtrIntDato1 () ); //CONTRATO DE INVERSION
                         rsDatos = consulta.getResultSet ( opc , db);
                         break;    


                        case 62://VERIFICA MN
                        case 63://VERIFICA ME
                         db.setDataBO ( getVtrIntDato1 () ); //CONTRATO DE INVERSION
                         rsDatos = consulta.getResultSet ( opc , db);
                         break;    

                        case 64:  
                         db.setDataBO ( getVtrStrDato1 () ); //CUENTA CLABE
                         rsDatos = consulta.getResultSet ( opc , db);
                         break;    
                        

                          case 65://HORARIOS DE LA BASE
                            rsDatos = consulta.getResultSet ( opc , db);
                            break;
                            
                            case 66://nombre subcuenta
                            db.setDataBO ( getVtrIntDato1 () ); //fiso
                            db.setDataBO ( getVtrIntDato2 () ); //CONTRATO DE INVERSION
                            rsDatos = consulta.getResultSet ( opc , db);
                            break;

                            case 200://MDC
                         rsDatos = consulta.getResultSet ( opc , db);
                         break;

                            case 201://DETALLE MDC
                            db.setDataBO ( getVtrIntDato1 () ); //fiso
                            db.setDataBO ( getVtrIntDato2 () ); //fiso              
                            rsDatos = consulta.getResultSet ( opc , db);
                            break;

                            case 202://PARAMETRIZACION
                            db.setDataBO ( getVtrStrDato1 () ); //NUM SOLICITUD
                            rsDatos = consulta.getResultSet ( opc , db);
                            break;

                            case 203://BIENES
                            db.setDataBO ( getVtrIntDato1 () ); //fiso
                            rsDatos = consulta.getResultSet ( opc , db);
                            break;

                            case 204://QUERYS
                            db.setDataBO ( getVtrStrDato1 () ); //NOMBRE DEL INDICE
                            rsDatos = consulta.getResultSet ( opc , db);
                            break;           

                            case 205://QUERYS
            			    db.setDataBO ( getVtrStrDato1 () ); //NOMBRE DEL INDICE
            			    db.setDataBO ( getVtrStrDato2 () ); //NOMBRE DEL INDICE
            			    rsDatos = consulta.getResultSet ( opc , db);
            			    break; 
                           
            			    case 206://PATRIMONIO
            			    db.setDataBO ( getVtrIntDato1 () ); //fiso
            			    rsDatos = consulta.getResultSet ( opc , db);
            			    break;
            			    case 207://HONORARIO
            			    db.setDataBO ( getVtrIntDato1 () ); //fiso
            			    rsDatos = consulta.getResultSet ( opc , db);
            			    break;
            			    case 208://VALORES Y CONTABLE
            			    db.setDataBO ( getVtrIntDato1 () ); //fiso
            			    rsDatos = consulta.getResultSet ( opc , db);
            			    break;
            			    case 209://RDC
            			    db.setDataBO ( getVtrIntDato1 () ); //fiso
            			    rsDatos = consulta.getResultSet ( opc , db);
            			    break;
            			    case 210://EMBARGO
            			    db.setDataBO ( getVtrIntDato1 () ); //fiso
            			    rsDatos = consulta.getResultSet ( opc , db);
            			    break;
            			    case 211://FISCAL
            			    db.setDataBO ( getVtrIntDato1 () ); //fiso
            			    rsDatos = consulta.getResultSet ( opc , db);
            			    break;
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
		                default:
		                	break;				
            			}
			}
	catch (Exception e)
			{  
            LOGGER.debug(this.getClass()+"->" + e +"<->opcion:"+opc);
			}
	removerValores();
	intContador=0;
	try{		
        blnDatos= false;				
        while (rsDatos.next()) 
        		{
	             blnDatos= true;	
               	 
                switch ( opc){	
                
                	case 1:
                    
                    	setVtrStrDato1( rsDatos.getString("nomUsuario"));						
						intContador++;
                        break;
                    
                    case 2:
                    
                    	setVtrStrDato1( rsDatos.getString("captura"));						
                    	setVtrStrDato2( rsDatos.getString("fechaCaptura"));						
                    	setVtrStrDato3( rsDatos.getString("firma1"));						
						setVtrStrDato4( rsDatos.getString("fechaFirma1"));
						setVtrStrDato5( rsDatos.getString("stFirma1"));
						setVtrStrDato6( rsDatos.getString("firma2"));
						setVtrStrDato7( rsDatos.getString("fechaFirma2"));
						setVtrStrDato8( rsDatos.getString("stFirma2"));
						
						
						intContador++;
                        break;    
                        			
                //instrucciones(RETIRO,DEPOSITO Y TRASPASO)
                    case 11://pendientes
                    case 12://activas o aceptadas
                    
                    	setVtrIntDato1( rsDatos.getInt("FOLIO"));
						setVtrStrDato2( rsDatos.getString("FECHA"));						
						setVtrStrDato3( rsDatos.getString("INSTRUCCION"));
						setVtrIntDato4( rsDatos.getInt("TIPO"));
						setVtrDoubleDato5(rsDatos.getDouble("IMPORTEDPO"));
						setVtrDoubleDato6(rsDatos.getDouble("IMPORTEDEL"));
						setVtrIntDato7(rsDatos.getInt("MONDEPOSITO"));
						setVtrIntDato8(rsDatos.getInt("MONRETIRO"));
            setVtrStrDato4( rsDatos.getString("STATUS"));
            
                        intContador++;

                        break;

                    case 51://ficha unica por folio
                    case 52://ficha unica por fecha
                    
                    	setVtrIntDato1( rsDatos.getInt("FOLIO"));
						setVtrStrDato2( rsDatos.getString("FECHA"));						
						setVtrStrDato3( rsDatos.getString("INSTRUCCION"));
						setVtrIntDato4( rsDatos.getInt("TIPO"));
						setVtrDoubleDato5(rsDatos.getDouble("IMPORTEDPO"));
						setVtrDoubleDato6(rsDatos.getDouble("IMPORTEDEL"));
						setVtrIntDato7(rsDatos.getInt("MONDEPOSITO"));
						setVtrIntDato8(rsDatos.getInt("MONRETIRO"));
            setVtrStrDato4( rsDatos.getString("STATUS"));
            setVtrStrDato5( rsDatos.getString("NOMFIDEICOMISO"));            
            setVtrIntDato9( rsDatos.getInt("NUMFIDEICOMISO"));            
            setVtrIntDato10( rsDatos.getInt("ORIGEN"));
            setVtrIntDato11( rsDatos.getInt("DESTINO"));
            setVtrDoubleDato7(rsDatos.getDouble("IMPORTET"));
            
                        intContador++;
                        break;
                     	
                    case 21://Detalle Deposito
                       	
						setVtrStrDato2( rsDatos.getString("fecha")); 			
						setVtrStrDato4( rsDatos.getString("nomcuenta"));
						setVtrDoubleDato5(rsDatos.getDouble("importe"));
						setVtrStrDato7( rsDatos.getString("concepto"));
						setVtrIntDato8( rsDatos.getInt("contrato"));
						setVtrStrDato9( rsDatos.getString("moneda"));
            setVtrStrDato10( rsDatos.getString("persona"));
		                intContador++;
                        break;	
                        
                    case 54: //detalle deposito ficha unica
                    
            setVtrStrDato1( rsDatos.getString("fideicomiso"));           	
						setVtrStrDato2( rsDatos.getString("fecha")); 			
						setVtrStrDato4( rsDatos.getString("nomcuenta"));
						setVtrDoubleDato5(rsDatos.getDouble("importe"));
						setVtrStrDato7( rsDatos.getString("concepto"));
						setVtrIntDato8( rsDatos.getInt("contrato"));
						setVtrStrDato9( rsDatos.getString("moneda"));
            setVtrStrDato10( rsDatos.getString("persona"));
            
		                intContador++;
                        break;	
					
					
				   case 22://Detalle Retiro
                                           	
						setVtrStrDato1( rsDatos.getString("fecha")); 			
						setVtrIntDato2( rsDatos.getInt("contrato"));
						setVtrDoubleDato3(rsDatos.getDouble("importe"));
						setVtrStrDato4( rsDatos.getString("concepto"));
						setVtrIntDato5( rsDatos.getInt("claveLiquid"));
						setVtrStrDato6( rsDatos.getString("formaLiq"));
						setVtrStrDato7( rsDatos.getString("banco"));
						setVtrStrDato8( rsDatos.getString("numCta"));
						setVtrStrDato9( rsDatos.getString("numCtaBanxico"));
						setVtrStrDato10( rsDatos.getString("beneficiario"));
						setVtrStrDato11( rsDatos.getString("plaza"));
					    setVtrStrDato12( rsDatos.getString("rfcTEF"));
						setVtrStrDato13( rsDatos.getString("fechaSesion"));			    
						setVtrStrDato14( rsDatos.getString("tipoSesion"));
						setVtrStrDato15( rsDatos.getString("noAcuerdo"));
            setVtrStrDato16( rsDatos.getString("REFERENCIA"));
            setVtrStrDato17( rsDatos.getString("CONVENIO"));
					
		                intContador++;
                        break;
                     
           case 53://detalle retiro ficha unica
                                           	
						setVtrStrDato1( rsDatos.getString("fecha")); 			
						setVtrIntDato2( rsDatos.getInt("contrato"));
						setVtrDoubleDato3(rsDatos.getDouble("importe"));
						setVtrStrDato4( rsDatos.getString("concepto"));
						setVtrIntDato5( rsDatos.getInt("claveLiquid"));
						setVtrStrDato6( rsDatos.getString("formaLiq"));
						setVtrStrDato7( rsDatos.getString("banco"));
						setVtrStrDato8( rsDatos.getString("numCta"));
						setVtrStrDato9( rsDatos.getString("numCtaBanxico"));
						setVtrStrDato10( rsDatos.getString("beneficiario"));
						setVtrStrDato11( rsDatos.getString("plaza"));
					    setVtrStrDato12( rsDatos.getString("rfcTEF"));
						setVtrStrDato13( rsDatos.getString("fechaSesion"));			    
						setVtrStrDato14( rsDatos.getString("tipoSesion"));
						setVtrStrDato15( rsDatos.getString("noAcuerdo"));
            setVtrStrDato16( rsDatos.getString("REFERENCIA"));
            setVtrStrDato17( rsDatos.getString("CONVENIO"));
            setVtrStrDato18( rsDatos.getString("fideicomiso"));
            
		                intContador++;
                        break;


                    case 32://Detalle Retiro SWIFT
                    case 55://DETALLE RETIRO SWIFT PARA FICHA UNICA
                                           	
						setVtrStrDato1( rsDatos.getString("PAISDOM")); 			
						setVtrStrDato2( rsDatos.getString("CIUDADDOM")); 			
						setVtrStrDato3( rsDatos.getString("BANCODOM")); 			
						setVtrStrDato4( rsDatos.getString("PLAZADOM")); 			
						setVtrStrDato5( rsDatos.getString("SUCURDOM")); 			
						setVtrStrDato6( rsDatos.getString("CTADOM")); 			
						setVtrStrDato7( rsDatos.getString("BRANCHDOM")); 			
						setVtrStrDato8( rsDatos.getString("MONEDADOM")); 			
						setVtrDoubleDato9( rsDatos.getDouble("IMPORTESWIFT")); 			
						setVtrStrDato10( rsDatos.getString("CODSAI")); 			
						setVtrStrDato11( rsDatos.getString("NOMBENE")); 			
						setVtrStrDato12( rsDatos.getString("PAISBENE")); 			
						setVtrStrDato13( rsDatos.getString("CIUDADBENE")); 			
						setVtrStrDato14( rsDatos.getString("DOMBENE"));
						setVtrStrDato15( rsDatos.getString("TELBENE")); 
		                intContador++;
                        break;    
                        
                        
					case 23://Detalle Traspaso
                    
                       	
						setVtrStrDato1( rsDatos.getString("fecha")); 
						setVtrIntDato2( rsDatos.getInt("ctoOrigen"));			
						setVtrIntDato3( rsDatos.getInt("ctoDestino"));
						setVtrDoubleDato4(rsDatos.getDouble("importe"));
						setVtrStrDato5( rsDatos.getString("instrumento"));
						
					
		                intContador++;
                        break;                        

					case 30://Detalle Traspaso
                    
                       	
						setVtrDoubleDato1( rsDatos.getDouble("num_contrato")); 
						setVtrDoubleDato2( rsDatos.getDouble("saldo"));			
						setVtrIntDato3( rsDatos.getInt("clave_moneda"));
						setVtrStrDato4(rsDatos.getString("sigla_moneda"));
						setVtrStrDato5(rsDatos.getString("nombrecont"));
            setVtrStrDato6(rsDatos.getString("moneda"));
            setVtrIntDato4( rsDatos.getInt("entidad"));
						
					
		                intContador++;
                        break;                          

                        case 40://Detalle Cuentas
                        
                             setVtrIntDato1( rsDatos.getInt("CUENTA")); ; 
                             setVtrIntDato2( rsDatos.getInt("BANCO")); 
                             setVtrStrDato1(rsDatos.getString("CLABE"));   
                             setVtrStrDato2(rsDatos.getString("PLAZA"));
                             setVtrStrDato3(rsDatos.getString("SUCURSAL"));
                             setVtrStrDato4(rsDatos.getString("TITULAR"));
                             setVtrStrDato5(rsDatos.getString("RFC"));
                             setVtrStrDato6(rsDatos.getString("FECHA"));
                             
                        intContador++;
                        break;

                        case 41://recupera informacion de cuenta por folio y fiso
                        
                             setVtrIntDato1( rsDatos.getInt("CUENTA")); ; 
                             setVtrIntDato2( rsDatos.getInt("BANCO")); 
                             setVtrStrDato1(rsDatos.getString("CLABE"));   
                             setVtrStrDato2(rsDatos.getString("PLAZA"));
                             setVtrStrDato3(rsDatos.getString("SUCURSAL"));
                             setVtrStrDato4(rsDatos.getString("TITULAR"));
                             setVtrStrDato5(rsDatos.getString("RFC"));
                             setVtrStrDato6(rsDatos.getString("FECHA"));
                             setVtrStrDato7(rsDatos.getString("CUENTA"));  
                        intContador++;
                        break;
                     
                     
                        case 42://CONSULTA DE DESCRIPCION DE BANCOS
                             setVtrStrDato1(rsDatos.getString("CVE_DESC_CLAVE"));
                             intContador++;
                        break;
    
                        case 43://CONSULTA DE NUMERO DE USUARIO
                              setVtrIntDato1(rsDatos.getInt("USU_NUM_USUARIO"));
                              intContador++;
                         break;
                         
					    case 44: case 46://detalle cuenta
					    
                             setVtrIntDato1( rsDatos.getInt("clave")); 
                             setVtrStrDato6( rsDatos.getString("BANCO"));                 
                             setVtrStrDato1(rsDatos.getString("CLABE"));   
                             setVtrStrDato2(rsDatos.getString("PLAZA"));
                             setVtrStrDato3(rsDatos.getString("SUCURSAL"));
                             setVtrStrDato4(rsDatos.getString("TITULAR"));
                             setVtrStrDato5(rsDatos.getString("RFC"));
                         
                        intContador++;
                        break;
              case 64://detalle cuenta 64
					    
                             setVtrStrDato1( rsDatos.getString("clave")); 
                             setVtrStrDato6( rsDatos.getString("BANCO"));                 
                             setVtrStrDato1(rsDatos.getString("CLABE"));   
                             setVtrStrDato2(rsDatos.getString("PLAZA"));
                             setVtrStrDato3(rsDatos.getString("SUCURSAL"));
                             setVtrStrDato4(rsDatos.getString("TITULAR"));
                             setVtrStrDato5(rsDatos.getString("RFC"));
                         
                        intContador++;
                        break;

                        case 45://CONSULTA DE nombre de usuario que capturo cuenta
                             setVtrStrDato1(rsDatos.getString("nomUsuario"));
                             intContador++;
                        break;

                        case 47://detalle TERCEROS
					    
                             setVtrIntDato1( rsDatos.getInt("TER_NUM_TERCERO")); 
                             setVtrStrDato6( rsDatos.getString("TER_NOM_TERCERO"));                 
                             setVtrStrDato1(rsDatos.getString("TER_RFC"));   
                             setVtrStrDato2(rsDatos.getString("TER_NUM_EXT_FAX"));//FOLIO DE LA OPERACION
                             setVtrStrDato3(rsDatos.getString("FECHA"));//FECHA DE CAPTURA
                             setVtrStrDato4(rsDatos.getString("USUARIO"));//NOMBRE DE USUARIO
                         
                        intContador++;
                        break;

                        case 48://CONSULTA DE NOMBRE DE MONEDA
                             setVtrStrDato1(rsDatos.getString("moneda"));
                             intContador++;
                            break;
                        
                        case 49:
                             setVtrIntDato1(rsDatos.getInt("moneda"));
                             intContador++;
                            break;
                            
                        case 50:
                             setVtrDoubleDato1( rsDatos.getDouble("CUENTA"));                  
                             intContador++;
                            break;

                        case 56://SECUENCIALES Y USUARIOS QUE AUTORIZAN UNA INSTRUCCION
                             setVtrStrDato1(rsDatos.getString("USUARIOS"));
                             intContador++;
                            break;


                        case 57://DETALLE DE MOVIMIENTOS EDO CTA
                             setVtrStrDato1(rsDatos.getString("FECHA"));
                             setVtrStrDato2(rsDatos.getString("FECVENCIM"));
                             setVtrStrDato3(rsDatos.getString("DESCR"));
                             setVtrStrDato4(rsDatos.getString("EMISORA"));
                             setVtrDoubleDato1( rsDatos.getDouble("TITULOS"));                  
                             setVtrDoubleDato2( rsDatos.getDouble("PRECIO"));
                             setVtrDoubleDato3( rsDatos.getDouble("IMPORTE"));
                             setVtrDoubleDato4( rsDatos.getDouble("TASA"));
                             setVtrIntDato1( rsDatos.getInt("PLAZO"));
                             setVtrDoubleDato5 ( rsDatos.getDouble("RENDIMIENTO"));
                             setVtrDoubleDato6( rsDatos.getDouble("ISR"));
                             setVtrDoubleDato7( rsDatos.getDouble("IMPNETO"));
                             setVtrDoubleDato8( rsDatos.getDouble("SALDO"));
                             setVtrStrDato5(rsDatos.getString("SERIE"));
                             setVtrIntDato2( rsDatos.getInt("PLAZO") );
                             setVtrStrDato6(rsDatos.getString("FECHA"));
                             setVtrIntDato3( rsDatos.getInt("PROGRESS") );
                             intContador++;
                            break;

                        case 58://RESUMEN DE MOVIMIENTOS EDO CTA
                             setVtrDoubleDato1(rsDatos.getDouble("MES"));
                             setVtrStrDato2(rsDatos.getString("VENTAS"));
                             setVtrStrDato3(rsDatos.getString("COMPRAS"));
                             setVtrDoubleDato4(rsDatos.getDouble("PREMIO"));
                             setVtrDoubleDato5(rsDatos.getDouble("ISR"));
                             setVtrDoubleDato6(rsDatos.getDouble("SALDO"));
                             setVtrDoubleDato7(rsDatos.getDouble("INVIG"));
                             setVtrDoubleDato8(rsDatos.getDouble("INVPROM"));
                             setVtrDoubleDato9(rsDatos.getDouble("DEPOSITOS"));
                             setVtrDoubleDato10(rsDatos.getDouble("RETIROS"));
                             setVtrDoubleDato11(rsDatos.getDouble("SALDOANT"));
                             setVtrDoubleDato12(rsDatos.getDouble("GARINI"));
                             setVtrDoubleDato13(rsDatos.getDouble("GARFIN"));
                             setVtrDoubleDato14(rsDatos.getDouble("SALDOGAR"));
                             setVtrIntDato1(rsDatos.getInt("CONTRATO"));
                             setVtrStrDato1(rsDatos.getString("FECHA"));
                             setVtrIntDato2( rsDatos.getInt("PROGRESS") );
                             
                             intContador++;
                            break;

                        case 59://VALOR VIGENTE EDO CTA
                             setVtrStrDato1(rsDatos.getString("FECINI"));
                             setVtrStrDato2(rsDatos.getString("FECVENCIM"));
                             setVtrStrDato3(rsDatos.getString("DESCR"));
                             setVtrStrDato4(rsDatos.getString("EMISORA"));
                             setVtrDoubleDato1( rsDatos.getDouble("TITULOS"));                  
                             setVtrDoubleDato2( rsDatos.getDouble("PRECIO"));
                             setVtrDoubleDato3( rsDatos.getDouble("IMPORTE"));
                             setVtrDoubleDato4( rsDatos.getDouble("TASA"));
                             setVtrIntDato1( rsDatos.getInt("PLAZO"));
                             setVtrDoubleDato5 ( rsDatos.getDouble("RENDIMIENTO"));
                             setVtrDoubleDato6( rsDatos.getDouble("ISR"));
                             setVtrDoubleDato7( rsDatos.getDouble("IMPNETO"));
                             setVtrDoubleDato8( rsDatos.getDouble("PREMIO"));
                             setVtrStrDato5(rsDatos.getString("SERIE"));
                             setVtrIntDato2( rsDatos.getInt("PLAZO") );
                             setVtrStrDato6(rsDatos.getString("FECHA"));
                             setVtrIntDato3( rsDatos.getInt("PROGRESS") );
                             intContador++;
                            break;


                        case 60://DETALLE MOVIMIENTOS MON EXT
                             setVtrStrDato1(rsDatos.getString("FECHA"));
                             setVtrStrDato2(rsDatos.getString("FECVENCIM"));
                             setVtrStrDato3(rsDatos.getString("DESCR"));
                             setVtrStrDato4( rsDatos.getString("DEBE"));                  
                             setVtrStrDato5( rsDatos.getString("HABER"));
                             setVtrStrDato6( rsDatos.getString("SALDO"));
                             setVtrIntDato1( rsDatos.getInt("PLAZODIAS"));
                             setVtrDoubleDato4( rsDatos.getDouble("TASA"));
                             setVtrDoubleDato5( rsDatos.getDouble("INTERES"));                             
                             setVtrDoubleDato6( rsDatos.getDouble("ISR"));                                                          
                             setVtrDoubleDato7( rsDatos.getDouble("TIPOCAMB"));
                             setVtrDoubleDato8( rsDatos.getDouble("ISRMXP"));                             
                             intContador++;                             
                             break;
                             
                        case 61://RESUMEN DE MOVIMIENTOS EDO CTA MON EXT
                             setVtrStrDato1(rsDatos.getString("SALDO"));
                             setVtrStrDato2(rsDatos.getString("RETIRO"));
                             setVtrStrDato3(rsDatos.getString("DEPOSITO"));
                             setVtrDoubleDato4(rsDatos.getDouble("INTERES"));
                             setVtrDoubleDato5(rsDatos.getDouble("ISRDLS"));
                             setVtrDoubleDato6(rsDatos.getDouble("ISRMON"));
                             setVtrDoubleDato7(rsDatos.getDouble("PROMEDIO"));
                             setVtrStrDato4(rsDatos.getString("SALDFINAL"));
                             intContador++;
                             break;

                        case 62://VERIFICA MN
                        case 63://VERIFICA ME
                             setVtrIntDato1(rsDatos.getInt("CONTRATO"));
                             intContador++;
                             break;

                        case 65://HORARIO DE LA BASE 
                             setVtrIntDato1(rsDatos.getInt(1));
                             intContador++;
                             break;

                          case 66://detalle cuenta
                         setVtrStrDato1(rsDatos.getString("SUBCUENTA"));
                        intContador++;
                        break;

                        case 200://MDC
                            setVtrStrDato1(rsDatos.getString("FTOP_NUM_OPER"));
                            setVtrStrDato2(rsDatos.getString("FTOP_NOMBRE_TIPOPER"));
                            setVtrStrDato3(rsDatos.getString("FTOP_ATENCION_DIAS")); 
                            setVtrIntDato1(rsDatos.getInt("FTOP_BIENES"));
                            intContador++;
                            break;   

                     case 201:// DETALLE MDC
                         setVtrStrDato1(rsDatos.getString("INS_MUM_FOLIO_INST"));
                         setVtrStrDato2(rsDatos.getString("INS_NUM_CONTRATO"));
                         setVtrStrDato3(rsDatos.getString("FBIS_FECHA_INI"));                    
                         setVtrStrDato4(rsDatos.getString("FBIS_FECHA_FIN"));                    
                         setVtrStrDato5(rsDatos.getString("FBIS_OBSERVACION"));                    
                         setVtrStrDato6(rsDatos.getString("FETA_NOMBRE_ETAPA")); 
                         setVtrStrDato7(rsDatos.getString("INS_NUM_OPER"));   
                         intContador++;
                         break;  
                
                     case 202://PARAMETRIZCION
                         setVtrIntDato1(rsDatos.getInt("CONP_ID_CONCEPTO"));
                         setVtrStrDato1(rsDatos.getString("CONP_NOMBRE"));//ETIQUETA
                         setVtrIntDato2(rsDatos.getInt("CONP_BASE"));//SI VIENE 1 SE FORMA UN COMBO
                         setVtrStrDato2(rsDatos.getString("CONP_TABLA"));//QUERY EN CASO DE QUE SEA UN COMBO                    
                         setVtrStrDato3(rsDatos.getString("CONP_COMENTARIO"));//SI VIENE FIDEICOMISO ES QUE COMO PARAMETRO ES EL FISO
                         setVtrStrDato4(rsDatos.getString("CONP_TIPO_DATO"));//TIPO DE DATO   ALFANUMERICO FECHA
                         setVtrIntDato5(rsDatos.getInt("CONP_PADRE"));
                         setVtrIntDato6(rsDatos.getInt("CONP_OBLIGATORIO"));
                         intContador++;
                         break;                   
                     case 203://BIENES
                         setVtrIntDato1(rsDatos.getInt("FUNI_ID_SUBCUENTA"));//SUBCUENTA
                         setVtrStrDato1(rsDatos.getString("FUNI_TIPO"));//TIPO
                         setVtrIntDato2(rsDatos.getInt("FUNI_ID_BIEN"));//IDENTIFICADOR DEL BIEN
                         setVtrStrDato2(rsDatos.getString("FUNI_ID_EDIFICIO"));//EDIFICIO
                         setVtrStrDato3(rsDatos.getString("FUNI_ID_DEPTO"));//DEPARTAMENTO
                         intContador++;
                         break;                   
                     case 204://QUERYS
                         setVtrStrDato1(rsDatos.getString("EIND_FORMA_EMP"));//QUERY A EJECUTAR PARA LLENAR COMBO
                         intContador++;
                         break;     
                
                     case 205://PARAMETRIZCION hijo
                         setVtrIntDato1(rsDatos.getInt("CONP_ID_CONCEPTO"));
                         setVtrStrDato1(rsDatos.getString("CONP_NOMBRE"));//ETIQUETA
                         setVtrIntDato2(rsDatos.getInt("CONP_BASE"));//SI VIENE 1 SE FORMA UN COMBO
                         setVtrStrDato2(rsDatos.getString("CONP_TABLA"));//QUERY EN CASO DE QUE SEA UN COMBO                    
                         setVtrStrDato3(rsDatos.getString("CONP_COMENTARIO"));//SI VIENE FIDEICOMISO ES QUE COMO PARAMETRO ES EL FISO
                         setVtrStrDato4(rsDatos.getString("CONP_TIPO_DATO"));//TIPO DE DATO   ALFANUMERICO FECHA
                         setVtrIntDato5(rsDatos.getInt("CONP_PADRE"));
                         intContador++;
                         break;   
                     case 206://tipo de patrimonio
                      setVtrStrDato1(rsDatos.getString("ESTADO"));//ESTADO
                      intContador++;
                      break;   
                      case 207://HONORARIO
                       setVtrStrDato1(rsDatos.getString("ESTADO"));//ESTADO        
                       intContador++;
                       break;   
                       case 208://VALROES Y CONATABLE 
                        setVtrStrDato1(rsDatos.getString("ESTADO"));//ESTADO 
                        intContador++;
                        break;   
                       case 209://RDC 
                         setVtrStrDato1(rsDatos.getString("ESTADO"));//ESTADO 
                         intContador++;
                         break;   
                      case 210://EMBARGO 
                          setVtrStrDato1(rsDatos.getString("ESTADO"));//ESTADO 
                          intContador++;
                          break;   
                      case 211://FISCAL
                          setVtrStrDato1(rsDatos.getString("ESTADO"));//ESTADO 
                          intContador++;
                          break;      
                     default:          
                          break;		
                 }
           }

        } 
     catch(Exception e) 
     				{
            blnDatos= false;
            LOGGER.debug(this.getClass()+"->"+e+"<-> opcionG :"+ opc);
        			}
        consulta.dbConnClose();
     }	
}
