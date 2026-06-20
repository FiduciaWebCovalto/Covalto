/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package com.bancomext.negocio;
import java.sql.*;
import com.bancomext.util.*;
import com.bancomext.lib.servicios;

public class nReporte extends nDatos{
    
    ResultSet rsDatos;
    String[] resultado={null};
    public void querySelect( int opc) 
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
						    rsDatos = reportes.getResultSet ( opc , db);					
						    break;
		                 //ESTADO DE RESULTADOS   
		                 case 2: 
		                	  
						    db.setDataBO ( getVtrIntDato1 () ); //CTO_NUM_CONTRATO			    
						    db.setDataBO ( getVtrIntDato2 () ); //SAL_MES_MOVTO
						    db.setDataBO ( getVtrIntDato3 () );	//SAL_ANO_MOVTO	    			    
						    rsDatos = reportes.getResultSet ( opc , db);					
						    break; 
						    
                //DATOS DE LA TABLA DINAMICA DE ESTADOS FINANCIEROS
                //DONDE SE ENCUENTRA LA INFORMACION A IMPRIMIR
                case 3: 
                  
                db.setDataBO ( getVtrIntDato1 () ); //FIDEICOMISO			    
                db.setDataBO ( getVtrStrDato1 () ); //SUBGRUPO
                rsDatos = reportes.getResultSet ( opc , db);					
                break; 

                //DATOS DE LA TABLA DINAMICA DE ESTADOS FINANCIEROS
                //DONDE SE ENCUENTRA LA INFORMACION A IMPRIMIR
                //ESTADO DE RESULTADOS
                case 5: 
                  
                db.setDataBO ( getVtrIntDato1 () ); //FIDEICOMISO			    
                db.setDataBO ( getVtrIntDato2 () ); //NUMERO DE REPORTE			    
                rsDatos = reportes.getResultSet ( opc , db);					
                break; 

						    					    
						//TIPO DE ADMINISTRACION
						     
						case 10:
                     		db.setDataBO ( getVtrIntDato1 () ); //CTO_NUM_CONTRATO(NUMERO DE FISO)				    			           
						    rsDatos = reportes.getResultSet ( opc , db);					
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
                      case 2:
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

                  //DATOS DE LA TABLA DINAMICA DE ESTADOS FINANCIEROS
                  //DONDE SE ENCUENTRA LA INFORMACION A IMPRIMIR
                  //APLICA PARA POSICION FINANCIERA Y ESTADO DE RESULTADOS
                    case 3:
                    case 5:
                        setVtrIntDato1( rsDatos.getInt("REP_NUM_SUBCONT") );  
                        setVtrIntDato2( rsDatos.getInt("REP_NUM_ORDEN") );  
                        setVtrIntDato3( rsDatos.getInt("REP_NUM_GRUPO") );  
                        setVtrIntDato4( rsDatos.getInt("REP_NUM_CONCEPTO") );  
                        setVtrStrDato1( rsDatos.getString("REP_NOM_CONCEPTO") );            
                        setVtrDoubleDato1( rsDatos.getDouble("REP_IMP_SALDO_ACT") );            
                        setVtrIntDato5( rsDatos.getInt("REP_NUM_COL") );  
                        setVtrStrDato2( rsDatos.getString("GPO_SUBREPORTE") );            
                        setVtrIntDato6( rsDatos.getInt("GPO_TIPO_GRUPO") );  
                        intContador++;
                        break;                          

                    case 4://NUMERO DE COLUMNAS QUE IMPRIME UN GRUPO
                        setVtrIntDato1( rsDatos.getInt("NCOLUMNA") );  
                        intContador++;
                        break;                          

                                         
                     //TIPO DE ADMINISTRACION
                     	
                     case 10:
                     	setVtrStrDato1 ( rsDatos.getString("contrato"));//CTO_TIPO_ADMON
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
