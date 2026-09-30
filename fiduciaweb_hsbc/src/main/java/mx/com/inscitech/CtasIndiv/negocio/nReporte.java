package mx.com.inscitech.CtasIndiv.negocio;

import mx.com.inscitech.CtasIndiv.util.DatosBD;
import mx.com.inscitech.CtasIndiv.util.uReporte;

import java.sql.ResultSet;

public class nReporte extends nDatos{
    
    ResultSet rsDatos;
    public void querySelect(int opc, String tabla) 
    {
        uReporte  reportes= new uReporte ();
        DatosBD db = new DatosBD ();
        try {
            switch (opc)
            			{
            			//BALANCE GENERAL	
		                case 1: 
		                	  
						    db.setDataBO ( getVtrIntDato1 () ); //CTO_NUM_CONTRATO			    
						    db.setDataBO ( getVtrIntDato2 () ); //SAL_MES_MOVTO
						    db.setDataBO ( getVtrIntDato3 () );	//SAL_ANO_MOVTO	    			    
						    rsDatos = reportes.getResultSet ( opc , db, tabla);					
						    break;
		                 //ESTADO DE RESULTADOS   
		                 case 2: 
		                	  
						    db.setDataBO ( getVtrIntDato1 () ); //CTO_NUM_CONTRATO			    
						    db.setDataBO ( getVtrIntDato2 () ); //SAL_MES_MOVTO
						    db.setDataBO ( getVtrIntDato3 () );	//SAL_ANO_MOVTO	    			    
						    rsDatos = reportes.getResultSet ( opc , db, tabla);					
						    break; 
		                 case 3: //ESTADO DE RESULTADO POR MES
		                	  
						    db.setDataBO ( getVtrIntDato1 () ); //CTO_NUM_CONTRATO			    
						    db.setDataBO ( getVtrIntDato2 () ); //SAL_MES_MOVTO
						    db.setDataBO ( getVtrIntDato3 () );	//SAL_ANO_MOVTO	    			    
						    rsDatos = reportes.getResultSet ( opc , db, tabla);					
						    break; 
						    
						    					    
						//TIPO DE ADMINISTRACION
						     
						case 10:
                     		db.setDataBO ( getVtrIntDato1 () ); //CTO_NUM_CONTRATO(NUMERO DE FISO)				    			           
						    rsDatos = reportes.getResultSet ( opc , db, tabla);					
						    break; 
						
						
						// AVISOS
						case 11:
							rsDatos = reportes.getResultSet ( opc , db, tabla);					
						    break; 

            			    // valida mes cerrado
            			    case 12:
            			            rsDatos = reportes.getResultSet ( opc , db, tabla);                                     
            			        break; 

            			    // variacion patrimonio
            			    case 13:
									db.setDataBO ( getVtrIntDato1 () ); //CTO_NUM_CONTRATO(NUMERO DE FISO)				    			           							
            			            rsDatos = reportes.getResultSet ( opc , db, tabla);                                     
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
		            while (rsDatos.next()) {
		               blnDatos= true;		
		                switch ( opc){	
		                			
                //BALANCE GENERAL
                    case 1:
                        
                    	setVtrIntDato1( rsDatos.getInt("numContrato") );
						setVtrStrDato2( rsDatos.getString("nomContrato") );
						setVtrStrDato3( rsDatos.getString("periodo") );
						setVtrIntDato4( rsDatos.getInt("ctam") );
						setVtrIntDato5( rsDatos.getInt("scta") );
						setVtrIntDato6( rsDatos.getInt("sscta") );
						setVtrIntDato7( rsDatos.getInt("ssscta") );
						setVtrIntDato8( rsDatos.getInt("sssscta") );
						setVtrIntDato9( rsDatos.getInt("ssssscta") );
						setVtrIntDato10( rsDatos.getInt("aux1") );
						setVtrDoubleDato11( rsDatos.getDouble("aux2") );
						setVtrDoubleDato12( rsDatos.getDouble("aux3") );
						setVtrDoubleDato13( rsDatos.getDouble("saldoAct") );
                        intContador++;
                        break;
                        
                   // ESTADO DE RESULTADOS     
                      case 2: case 3:
                    	setVtrIntDato1( rsDatos.getInt("numContrato") );
						setVtrStrDato2( rsDatos.getString("nomContrato") );
						setVtrStrDato3( rsDatos.getString("fechaAper") );
						setVtrStrDato4( rsDatos.getString("fechaAl") );
						setVtrIntDato5( rsDatos.getInt("ctam") );
						setVtrIntDato6( rsDatos.getInt("scta") );
						setVtrIntDato7( rsDatos.getInt("sscta") );
						setVtrIntDato8( rsDatos.getInt("ssscta") );
						setVtrIntDato9( rsDatos.getInt("sssscta") );
						setVtrIntDato10( rsDatos.getInt("ssssscta") );
						setVtrIntDato11( rsDatos.getInt("aux1") );
						setVtrDoubleDato12( rsDatos.getDouble("aux2") );
						setVtrDoubleDato13( rsDatos.getDouble("aux3") );
						setVtrDoubleDato14( rsDatos.getDouble("saldoAct") );
                        intContador++;
                        break;                          

                     
                     //TIPO DE ADMINISTRACION
                     	
                     case 10:
                     	setVtrStrDato1 ( rsDatos.getString("contrato"));//CTO_TIPO_ADMON
                     	intContador++;
                     	break;	
                     	
                     //PUBLICACION DE AVISOS	
                     case 11:
                     	setVtrStrDato1 ( rsDatos.getString("aviso"));//CTO_TIPO_ADMON
                     	intContador++;
                     	break;	                     	

                     //VALIDA MES CERRADO
                     case 12:
                        setVtrIntDato1 ( rsDatos.getInt("datos"));//CTO_TIPO_ADMON
                        intContador++;
                        break;                          


                     //Variacion Patrimonio
                     case 13:
                        setVtrStrDato1 ( rsDatos.getString(20));            
                        setVtrStrDato2 ( rsDatos.getString(4));            
                        setVtrStrDato3 ( rsDatos.getString(7));            
                                    
                        setVtrIntDato1 ( rsDatos.getInt(8));
                        setVtrIntDato2 ( rsDatos.getInt(19));
                        setVtrIntDato3 ( rsDatos.getInt(3));
                                    
                        setVtrDoubleDato1 ( rsDatos.getDouble(9));
                        setVtrDoubleDato2 ( rsDatos.getDouble(10));
                        setVtrDoubleDato3 ( rsDatos.getDouble(11));
                        setVtrDoubleDato4 ( rsDatos.getDouble(12));
                        setVtrDoubleDato5 ( rsDatos.getDouble(13));
                        setVtrDoubleDato6 ( rsDatos.getDouble(14));
                        setVtrDoubleDato7 ( rsDatos.getDouble(15));
                        setVtrDoubleDato8 ( rsDatos.getDouble(16));
                        setVtrDoubleDato9 ( rsDatos.getDouble(17));
                        setVtrDoubleDato10 ( rsDatos.getDouble(18));
                                    
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
            System.out.println(this.getClass()+"->"+e+"<->opcion:"+ opc );
        			}
        reportes.dbConnClose();
     }	
}
