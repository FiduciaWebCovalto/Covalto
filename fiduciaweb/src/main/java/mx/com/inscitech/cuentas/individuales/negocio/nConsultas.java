//nConsultas.java
package mx.com.inscitech.cuentas.individuales.negocio;

import mx.com.inscitech.cuentas.individuales.util.DatosBD;
import mx.com.inscitech.cuentas.individuales.util.uConsultas;

import java.sql.ResultSet;

public class nConsultas extends nDatos{
    
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
                        case 47://consulta de correo de rechazo de cuentas
                            	db.setDataBO ( getVtrIntDato1 () ); //PFD_FOLIO
                            	db.setDataBO ( getVtrIntDato2 () ); //PFD_NUM_CONTRATO
                            	rsDatos = consulta.getResultSet ( opc , db);
                            	break;                                                  
                        case 43://CONSULTA DE NUMERO DE USUARIO
                         db.setDataBO ( getVtrStrDato1 () ); //CDP_CVE_CUENDEP
                         rsDatos = consulta.getResultSet ( opc , db);
                         break;    

                        case 46://CONSULTA DE NOMBRE DE FIDEICOMISO O CONTRATO
                         db.setDataBO ( getVtrIntDato1 () ); //CTO_NOM_CONTRATO
                         rsDatos = consulta.getResultSet ( opc , db);
                         break;    
                         
                        // CASES PROTEGO
                       
                        case 99://CORREO USUARIO IN
                         db.setDataBO ( getVtrIntDato1 () ); //CORREO
                         rsDatos = consulta.getResultSet ( opc , db);
                         break; 
  
            			    case 100://CORREO USUARIO IN
            			     rsDatos = consulta.getResultSet ( opc , db);
            			     break; 
            
            
            			    case 101://CARTA ACEPTACION
            			    db.setDataBO ( getVtrIntDato1 () ); //PROSPECTO
            			     rsDatos = consulta.getResultSet ( opc , db);
            			     break;
                        //Estados de Cuenta ACTINVER 2019/04/22
                        
                        case 102://Valor de Mercado
                        db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
                        rsDatos = consulta.getResultSet(opc, db);
                        break;
                        case 103://Instrumentos de Deuda
                        db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
                        rsDatos = consulta.getResultSet(opc, db);
                        break;
                        case 104://Mercado de Dinero
                        db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
                        rsDatos = consulta.getResultSet(opc, db);
                        break;
                        case 105: //Instrumentos Capitales
                        db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
                        rsDatos = consulta.getResultSet(opc, db);
                        break;
            			    case 106://Mercado de Capitales
            			    db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
            			    rsDatos = consulta.getResultSet(opc, db);
            			    break;
            			    case 107://Bienes Fideicomitidos
            			    db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
            			    rsDatos = consulta.getResultSet(opc, db);
            			    break;
            			    case 108://Movimientos del Mes del Contrato Moneda Nacional
            			    db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
            			    rsDatos = consulta.getResultSet(opc, db);
            			    break;
            			    case 109://Movimientos del Mes del Contrato Dolares
            			    db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
            			    rsDatos = consulta.getResultSet(opc, db);
            			    break;
            			    case 110://Situacion financiera
            			    db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
            			    rsDatos = consulta.getResultSet(opc, db);
            			    break;
            			    case 111://Situacion financiera dolares
            			    db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
            			    rsDatos = consulta.getResultSet(opc, db);
            			    break;
            			    case 112://Estado de Resultados
            			    db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
            			    rsDatos = consulta.getResultSet(opc, db);
            			    break;
            			    case 113://Estado de Resultados Dolares
            			    db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
            			    rsDatos = consulta.getResultSet(opc, db);
            			    break;
            			    case 114://Depositos en Efectivo
            			    db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
            			    rsDatos = consulta.getResultSet(opc, db);
            			    break;
            			    case 115://Comisiones Cobradas
            			    db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
            			    rsDatos = consulta.getResultSet(opc, db);
            			    break;
            			    case 116://Contenido EDO CUENTA
            			    db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
            			    rsDatos = consulta.getResultSet(opc, db);
            			    break;
            			    case 117://Resumen Estado de Cuenta
                                        db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
                                        db.setDataBO( getVtrStrDato1()); //Seq Edo Cuenta                
                                        rsDatos = consulta.getResultSet(opc, db);
            			    break;
            			    case 118://Resumen Estado de Cuenta
            			    db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
            			    db.setDataBO( getVtrIntDato2()); //Seq Edo Cuenta
            			        rsDatos = consulta.getResultSet(opc, db);
            			    break;            
            default:
		                	break;				
            			}
			}
	catch (Exception e)
			{  
            System.out.println (this.getClass()+"->" + e +"<->opcion:"+opc);
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
                        intContador++;
                        break;
                     	
                    case 21://Detalle Deposito
                    
                       	
						setVtrStrDato2( rsDatos.getString("fecha")); 			
						setVtrStrDato4( rsDatos.getString("nomcuenta"));
						setVtrDoubleDato5(rsDatos.getDouble("importe"));
						setVtrStrDato7( rsDatos.getString("concepto"));
						setVtrIntDato8( rsDatos.getInt("contrato"));
						setVtrStrDato9( rsDatos.getString("instrumento"));
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
					
		                intContador++;
                        break;
                     
                    case 32://Detalle Retiro SWIFT
                                           	
						setVtrStrDato1( rsDatos.getString("paisDSWIFT")); 			
						setVtrStrDato2( rsDatos.getString("ciudadDSWIFT")); 			
						setVtrStrDato3( rsDatos.getString("bancoDSWIFT")); 			
						setVtrStrDato4( rsDatos.getString("plazaDSWIFT")); 			
						setVtrStrDato5( rsDatos.getString("sucursalDSWIFT")); 			
						setVtrStrDato6( rsDatos.getString("ctaDSWIFT")); 			
						setVtrStrDato7( rsDatos.getString("codigoBranch")); 			
						setVtrStrDato8( rsDatos.getString("monedaSWIFT")); 			
						setVtrDoubleDato9( rsDatos.getDouble("importe")); 			
						setVtrStrDato10( rsDatos.getString("codigoSWIFT")); 			
						setVtrStrDato11( rsDatos.getString("nombreBSWIFT")); 			
						setVtrStrDato12( rsDatos.getString("paisBSWIFT")); 			
						setVtrStrDato13( rsDatos.getString("ciudadBSWIFT")); 			
						setVtrStrDato14( rsDatos.getString("domicilioBswift"));
						setVtrStrDato15( rsDatos.getString("telBSWIFT")); 
						setVtrStrDato16( rsDatos.getString("fechaSesion"));			    
						setVtrStrDato17( rsDatos.getString("tipoSesion"));
						setVtrStrDato18( rsDatos.getString("noAcuerdo"));			 			
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
					
						
					
		                intContador++;
                        break;                          

                        case 40://Detalle Cuentas
                        
                             setVtrIntDato1( rsDatos.getInt("clave")); ; 
                             setVtrIntDato2( rsDatos.getInt("CDP_CVE_BANCO")); 
                             setVtrStrDato1(rsDatos.getString("CDP_NUM_CUENTA"));   
                             setVtrStrDato2(rsDatos.getString("CDP_PLAZA"));
                             setVtrStrDato3(rsDatos.getString("CDP_SUCURSAL"));
                             setVtrStrDato4(rsDatos.getString("CDP_TITULAR"));
                             setVtrStrDato5(rsDatos.getString("CDP_RFC"));
                             setVtrStrDato6(rsDatos.getString("FECHA"));
                             
                        intContador++;
                        break;

                        case 41://recupera informacion de cuenta por folio y fiso
                             setVtrIntDato1( rsDatos.getInt("clave")); ; 
                             setVtrIntDato2( rsDatos.getInt("CDP_CVE_BANCO")); 
                             setVtrStrDato1(rsDatos.getString("CDP_NUM_CUENTA"));   
                             setVtrStrDato2(rsDatos.getString("CDP_PLAZA"));
                             setVtrStrDato3(rsDatos.getString("CDP_SUCURSAL"));
                             setVtrStrDato4(rsDatos.getString("CDP_TITULAR"));
                             setVtrStrDato5(rsDatos.getString("CDP_RFC"));
                             setVtrStrDato6(rsDatos.getString("FECHA"));
                             setVtrStrDato7(rsDatos.getString("CDP_CVE_CUENDEP"));  
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
                         
					    case 44://detalle cuenta
					    
                             setVtrIntDato1( rsDatos.getInt("clave")); 
                             setVtrIntDato2( rsDatos.getInt("CDP_CVE_BANCO"));                 
                             setVtrStrDato1(rsDatos.getString("CDP_NUM_CUENTA"));   
                             setVtrStrDato2(rsDatos.getString("CDP_PLAZA"));
                             setVtrStrDato3(rsDatos.getString("CDP_SUCURSAL"));
                             setVtrStrDato4(rsDatos.getString("CDP_TITULAR"));
                             setVtrStrDato5(rsDatos.getString("CDP_RFC"));
                         
                        intContador++;
                        break;

              case 45://CONSULTA DE nombre de usuario que capturo cuenta
                   setVtrStrDato1(rsDatos.getString("nomUsuario"));
                   intContador++;
              break;

              case 46://CONSULTA DE NOMBRE DE FIDEICOMISO O CONTRATO
                   setVtrStrDato1(rsDatos.getString("ctoNomContrato"));
                   intContador++;
              break;

					    case 47://detalle cuenta para mail de rechazo
					    
                             setVtrIntDato1( rsDatos.getInt("ATE_NUM_CONTRATO")); 
                             setVtrIntDato2( rsDatos.getInt("USU_NUM_USUARIO"));                 
                             setVtrStrDato1(rsDatos.getString("PER_NIVEL_ESTUDIOS"));   //direccion de correo para enviar el mail
                             setVtrStrDato2(rsDatos.getString("PER_NOM_USUARIO"));
                             setVtrStrDato3(rsDatos.getString("CDP_NUM_CUENTA"));
                             setVtrIntDato3( rsDatos.getInt("CDP_CVE_CUENDEP"));                 
                             setVtrIntDato4( rsDatos.getInt("FOLIO"));                 
                         
                        intContador++;
                        break;
             // Cases PROTEGO
             case 99://CORREO USUARIO2
					  
                            setVtrStrDato1(rsDatos.getString("PER_NIVEL_ESTUDIOS"));   //direccion de correo para enviar el mail
                         
                        intContador++;
                        break; 

                 case 100://CORREO USUARIO2
                                              
                                setVtrIntDato1(rsDatos.getInt("PER_NUM_USUARIO"));   //direccion de correo para enviar el mail
                             
                            intContador++;
                            break; 

                 case 101://CARTA ACEPTACION
                                              
                 setVtrStrDato1(rsDatos.getString("FID_CVE_PERSONA"));
                 setVtrStrDato2(rsDatos.getString("FID_NOM_PERSONA"));
                             
                            intContador++;
                            break;
                
                case 102: //Valor de Mercado
                    setVtrStrDato1(rsDatos.getString("FECVM_SEQ"));
                    setVtrStrDato2(rsDatos.getString("FECVM_RI_SI_EFE"));
                    setVtrStrDato3(rsDatos.getString("FECVM_RI_SI_DEUDA"));
                    setVtrStrDato4(rsDatos.getString("FECVM_RI_SI_MERCADODINE"));
                    setVtrStrDato5(rsDatos.getString("FECVM_RI_SI_RENTAVAR"));
                    setVtrStrDato6(rsDatos.getString("FECVM_RI_SI_MERCADOCAP"));
                    setVtrStrDato7(rsDatos.getString("FECVM_RI_SI_BIENFID"));
                    setVtrStrDato8(rsDatos.getString("FECVM_RI_SI_EFELIQ"));
                    setVtrStrDato9(rsDatos.getString("FECVM_RI_SI_TOTAL"));
                    setVtrStrDato10(rsDatos.getString("FECVM_RI_SF_EFE"));
                    setVtrStrDato11(rsDatos.getString("FECVM_RI_SF_DEUDA"));
                    setVtrStrDato12(rsDatos.getString("FECVM_RI_SF_MERCADODINE"));
                    setVtrStrDato13(rsDatos.getString("FECVM_RI_SF_RENTAVAR"));
                    setVtrStrDato14(rsDatos.getString("FECVM_RI_SF_MERCADOCAP"));
                    setVtrStrDato15(rsDatos.getString("FECVM_RI_SF_BIENFID"));
                    setVtrStrDato16(rsDatos.getString("FECVM_RI_SF_EFELIQ"));
                    setVtrStrDato17(rsDatos.getString("FECVM_RI_SF_TOTAL"));
                    setVtrStrDato18(rsDatos.getString("FECVM_RXM_P_EFE"));
                    setVtrStrDato19(rsDatos.getString("FECVM_RXM_P_DEUDA"));
                    setVtrStrDato20(rsDatos.getString("FECVM_RXM_P_MERCADINE"));
                    setVtrStrDato21(rsDatos.getString("FECVM_RXM_P_RENTAVAR"));
                    setVtrStrDato22(rsDatos.getString("FECVM_RXM_P_MERCADOCAP"));
                    setVtrStrDato23(rsDatos.getString("FECVM_RXM_P_BIENFID"));
                    setVtrStrDato24(rsDatos.getString("FECVM_RXM_P_EFELIQ"));
                    setVtrStrDato25(rsDatos.getString("FECVM_RXM_P_TOTAL"));
                    setVtrStrDato26(rsDatos.getString("FECVM_RXM_D_EFE"));
                    setVtrStrDato27(rsDatos.getString("FECVM_RXM_D_DEUDA"));
                    setVtrStrDato28(rsDatos.getString("FECVM_RXM_D_MERCADINE"));
                    setVtrStrDato29(rsDatos.getString("FECVM_RXM_D_RENTAVAR"));
                    setVtrStrDato30(rsDatos.getString("FECVM_RXM_D_MERCADOCAP"));
                    setVtrStrDato31(rsDatos.getString("FECVM_RXM_D_BIENFID"));
                    setVtrStrDato32(rsDatos.getString("FECVM_RXM_D_EFELIQ"));   
                    setVtrStrDato33(rsDatos.getString("FECVM_RXM_D_TOTAL"));
                    setVtrStrDato34(rsDatos.getString("FECVM_RXM_E_EFE"));
                    setVtrStrDato35(rsDatos.getString("FECVM_RXM_E_DEUDA"));
                    setVtrStrDato36(rsDatos.getString("FECVM_RXM_E_MERCADINE"));
                    setVtrStrDato37(rsDatos.getString("FECVM_RXM_E_RENTAVAR"));
                    setVtrStrDato38(rsDatos.getString("FECVM_RXM_E_MERCADOCAP"));
                    setVtrStrDato39(rsDatos.getString("FECVM_RXM_E_BIENFID"));
                    setVtrStrDato40(rsDatos.getString("FECVM_RXM_E_EFELIQ"));
                    setVtrStrDato41(rsDatos.getString("FECVM_RXM_E_TOTAL"));
                    intContador++;
                break;
                case 103: //Instrumentos de Deuda
                        setVtrStrDato1(rsDatos.getString("FECID_SEQ"));
                        setVtrStrDato2(rsDatos.getString("FECID_NUM"));
                        setVtrStrDato3(rsDatos.getString("FECID_PORCENT"));
                        setVtrStrDato4(rsDatos.getString("FECID_CONTRATO"));
                        setVtrStrDato5(rsDatos.getString("FECID_TIPOVAL"));
                        setVtrStrDato6(rsDatos.getString("FECID_EMISORA"));
                        setVtrStrDato7(rsDatos.getString("FECID_MESANTE"));
                        setVtrStrDato8(rsDatos.getString("FECID_MESACTU"));
                        setVtrStrDato9(rsDatos.getString("FECID_VALORLIB"));
                        setVtrStrDato10(rsDatos.getString("FECID_PRECIOAL"));
                        setVtrStrDato11(rsDatos.getString("FECID_VALORACT"));
                        setVtrStrDato12(rsDatos.getString("FECID_PLUSVINF"));
                        setVtrStrDato13(rsDatos.getString("FECID_PORCEPORT"));
                    intContador++;
                break;
                case 104: //Mercado Dinero
                     setVtrStrDato1(rsDatos.getString("FECMD_SEQ"));
                     setVtrStrDato2(rsDatos.getString("FECMD_CONTRATO"));
                     setVtrStrDato3(rsDatos.getString("FECMD_TIPOVAL"));
                     setVtrStrDato4(rsDatos.getString("FECMD_EMISORA"));
                     setVtrStrDato5(rsDatos.getString("FECMD_MESANTE"));
                     setVtrStrDato6(rsDatos.getString("FECMD_MESACTU"));
                     setVtrStrDato7(rsDatos.getString("FECMD_FADQUI"));
                     setVtrStrDato8(rsDatos.getString("FECMD_FVENCI"));
                     setVtrStrDato9(rsDatos.getString("FECMD_PRECIOAL"));
                     setVtrStrDato10(rsDatos.getString("FECMD_VALORACT"));
                     setVtrStrDato11(rsDatos.getString("FECMD_PORCTASA"));
                     setVtrStrDato12(rsDatos.getString("FECMD_DIASPORVEN"));
                     setVtrStrDato13(rsDatos.getString("FECMD_PORCGAT"));
                     setVtrStrDato14(rsDatos.getString("FECMD_PORCPORT"));
                 intContador++;
                break;
                 case 105: //Instrumentos Capitales
                      setVtrStrDato1(rsDatos.getString("FECIC_SEQ"));
                      setVtrStrDato2(rsDatos.getString("FECIC_NUM"));
                      setVtrStrDato3(rsDatos.getString("FECIC_PORCENT"));
                      setVtrStrDato4(rsDatos.getString("FECIC_CONTRATO"));
                      setVtrStrDato5(rsDatos.getString("FECIC_TIPOVAL"));
                      setVtrStrDato6(rsDatos.getString("FECIC_EMISORA"));
                      setVtrStrDato7(rsDatos.getString("FECIC_MESANTE"));
                      setVtrStrDato8(rsDatos.getString("FECIC_MESACTU"));
                      setVtrStrDato9(rsDatos.getString("FECIC_VALORLIB"));
                      setVtrStrDato10(rsDatos.getString("FECIC_PRECIOAL"));
                      setVtrStrDato11(rsDatos.getString("FECIC_VALORACT"));
                      setVtrStrDato12(rsDatos.getString("FECIC_PLUSVINF"));
                      setVtrStrDato13(rsDatos.getString("FECIC_PORCEPORT"));
                  intContador++;
                 break;
                 case 106: //Mercado Capital
                      setVtrStrDato1(rsDatos.getString("FECMC_SEQ"));
                      setVtrStrDato2(rsDatos.getString("FECMC_CONTRATO"));
                      setVtrStrDato3(rsDatos.getString("FECMC_TIPOVAL"));
                      setVtrStrDato4(rsDatos.getString("FECMC_EMISORA"));
                      setVtrStrDato5(rsDatos.getString("FECMC_MESANTE"));
                      setVtrStrDato6(rsDatos.getString("FECMC_MESACTU"));
                      setVtrStrDato7(rsDatos.getString("FECMC_VALORLIB"));
                      setVtrStrDato8(rsDatos.getString("FECMC_PRECIOAL"));
                      setVtrStrDato9(rsDatos.getString("FECMC_VALORACT"));
                      setVtrStrDato10(rsDatos.getString("FECIC_PLUSVINF"));
                      setVtrStrDato11(rsDatos.getString("FECMC_PORCPORT"));
                  intContador++;
                 break;
                 case 107: //Bienes Fideicomitidos
                      setVtrStrDato1(rsDatos.getString("FEC_B_SEQ"));
                      setVtrStrDato2(rsDatos.getString("FEC_B_TIPO"));
                      setVtrStrDato3(rsDatos.getString("FEC_B_DESC"));
                      setVtrStrDato4(rsDatos.getString("FEC_B_VALORMERCA"));
                      setVtrStrDato5(rsDatos.getString("FEC_B_PORCVM"));
                      setVtrStrDato6(rsDatos.getString("FEC_B_PLUSINFO"));
                  intContador++;
                 break;
                 case 108: //Movimientos del Mes del Contrato MN
                      setVtrStrDato1(rsDatos.getString("FEC_MMCMN_SEQ"));
                      setVtrStrDato2(rsDatos.getString("FEC_MMCMN_OPERLIQ"));
                      setVtrStrDato3(rsDatos.getString("FEC_MMCMN_FOLIO"));
                      setVtrStrDato4(rsDatos.getString("FEC_MMCMN_DESC"));
                      setVtrStrDato5(rsDatos.getString("FEC_MMCMN_CARGO"));
                      setVtrStrDato6(rsDatos.getString("FEC_MMCMN_ABONO"));
                      setVtrStrDato7(rsDatos.getString("FEC_MMCMN_SALDO"));
                  intContador++;
                 break;
                 case 109: //Movimientos del Mes del Contrato DLRS
                      setVtrStrDato1(rsDatos.getString("FEC_MMCDLRS_SEQ"));
                      setVtrStrDato2(rsDatos.getString("FEC_MMCDLRS_OPERLIQ"));
                      setVtrStrDato3(rsDatos.getString("FEC_MMCDLRS_FOLIO"));
                      setVtrStrDato4(rsDatos.getString("FEC_MMCDLRS_DESC"));
                      setVtrStrDato5(rsDatos.getString("FEC_MMCDLRS_CARGO"));
                      setVtrStrDato6(rsDatos.getString("FEC_MMCDLRS_ABONO"));
                      setVtrStrDato7(rsDatos.getString("FEC_MMCDLRS_SALDO"));
                  intContador++;
                 break;
                 case 110: //Situacion Financiera
                      setVtrStrDato1(rsDatos.getString("FEC_SF_SEQ"));
                      setVtrStrDato2(rsDatos.getString("FEC_SF_DESC"));
                      setVtrStrDato3(rsDatos.getString("FEC_SF_ACTIVOS"));
                      setVtrStrDato4(rsDatos.getString("FEC_SF_CAPITAL"));
                      setVtrStrDato5(rsDatos.getString("FEC_SF_TIPO"));
                  intContador++;
                 break;
                 case 111: //Situacion Financiera Dolares
                      setVtrStrDato1(rsDatos.getString("FEC_SFDLRS_SEQ"));
                      setVtrStrDato2(rsDatos.getString("FEC_SFDLRS_DESC"));
                      setVtrStrDato3(rsDatos.getString("FEC_SFDLRS_ACTIVOS"));
                      setVtrStrDato4(rsDatos.getString("FEC_SFDLRS_CAPITAL"));
                      setVtrStrDato5(rsDatos.getString("FEC_SFDLRS_TIPO"));
                  intContador++;
                 break;
                 case 112: //Estado de Resultados
                      setVtrStrDato1(rsDatos.getString("F_EC_EDORES_SEQ"));
                      setVtrStrDato2(rsDatos.getString("F_EC_EDORES_DESC"));
                      setVtrStrDato3(rsDatos.getString("F_EC_EDORES_ING"));
                      setVtrStrDato4(rsDatos.getString("F_EC_EDORES_EGR"));
                      setVtrStrDato5(rsDatos.getString("F_EC_EDORES_RESEJE"));
                      setVtrStrDato6(rsDatos.getString("F_EC_EDORES_TIPO"));
                  intContador++;
                 break;
                 case 113: //Estado de Resultados Dolares
                      setVtrStrDato1(rsDatos.getString("F_EC_EDORESDLRS_SEQ"));
                      setVtrStrDato2(rsDatos.getString("F_EC_EDORESDLRS_DESC"));
                      setVtrStrDato3(rsDatos.getString("F_EC_EDORESDLRS_ING"));
                      setVtrStrDato4(rsDatos.getString("F_EC_EDORESDLRS_EGR"));
                      setVtrStrDato5(rsDatos.getString("F_EC_EDORESDLRS_RESEJE"));
                      setVtrStrDato6(rsDatos.getString("F_EC_EDORESDLRS_TIPO"));
                  intContador++;
                 break;
                 case 114: //Despositos Efectivo
                      setVtrStrDato1(rsDatos.getString("F_EC_DEPEFE_SEQ"));
                      setVtrStrDato2(rsDatos.getString("F_EC_DEPEFE_PERIODO"));
                      setVtrStrDato3(rsDatos.getString("F_EC_DEPEFE_TOTALDEPOS"));
                  intContador++;
                 break;
                 case 115: //Comisiones Cobradas
                      setVtrStrDato1(rsDatos.getString("F_EC_COMICOB_SEQ"));
                      setVtrStrDato2(rsDatos.getString("F_EC_COMICOB_CONCEPTO"));
                      setVtrStrDato3(rsDatos.getString("F_EC_COMICOB_COMISION"));
                      setVtrStrDato4(rsDatos.getString("F_EC_COMICOB_IVA"));
                      setVtrStrDato5(rsDatos.getString("F_EC_COMICOB_TOTAL"));
                  intContador++;
                 break;
                 case 116: //Contenido EDO CUENTA
                      setVtrStrDato1(rsDatos.getString("FEC_CONT_SEQ"));
                      setVtrStrDato2(rsDatos.getString("FEC_VMERCADO"));
                      setVtrStrDato3(rsDatos.getString("FEC_INSDEUDA"));
                      setVtrStrDato4(rsDatos.getString("FEC_MERCADINE"));
                      setVtrStrDato5(rsDatos.getString("FEC_INSCAPI"));
                      setVtrStrDato6(rsDatos.getString("FEC_MERCAPI"));
                      setVtrStrDato7(rsDatos.getString("FEC_BIENFID"));
                      setVtrStrDato8(rsDatos.getString("FEC_MOVCONMN"));
                      setVtrStrDato9(rsDatos.getString("FEC_MOVCONDLR"));
                      setVtrStrDato10(rsDatos.getString("FEC_SITFIN"));
                      setVtrStrDato11(rsDatos.getString("FEC_SITFINDLR"));
                      setVtrStrDato12(rsDatos.getString("FEC_ESTRES"));
                      setVtrStrDato13(rsDatos.getString("FEC_ESTRESDLR"));
                      setVtrStrDato14(rsDatos.getString("FEC_DEPEFE"));
                      setVtrStrDato15(rsDatos.getString("FEC_COMCOB"));
                  intContador++;
                 break;
                case 117: //Resumen Estado de Cuenta
                    setVtrStrDato1(rsDatos.getString("ID"));
                    setVtrStrDato2(rsDatos.getString("SAL_CLAVE_INV"));
                    setVtrDoubleDato1(rsDatos.getDouble("SAL_TRABAJADOR"));
                    setVtrDoubleDato2(rsDatos.getDouble("SAL_AYUNTAMIENTO"));
                    setVtrDoubleDato3(rsDatos.getDouble("SAL_TOTAL"));
                    setVtrStrDato3(rsDatos.getString("NPORCENTAJE"));
                    setVtrDoubleDato4(rsDatos.getDouble("ANIOS_LABORADOS"));
                    intContador++;
                break;

                 case 118: //Resumen Estado de Cuenta
                     setVtrStrDato1(rsDatos.getString("DAT_FEC_ULT_MOD"));
                     System.out.print("Fecha Ingreso "+rsDatos.getString("DAT_FEC_ULT_MOD"));
                     setVtrStrDato2(rsDatos.getString("DAT_FEC_ALTA"));
                     setVtrStrDato3(rsDatos.getString("DIRECCION"));
                     setVtrStrDato4(rsDatos.getString("DAT_FEC_BAJA"));
                 
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
            System.out.println(this.getClass()+"->"+e+"<-> opcionG :"+ opc );
        			}
        consulta.dbConnClose();
     }	
}
