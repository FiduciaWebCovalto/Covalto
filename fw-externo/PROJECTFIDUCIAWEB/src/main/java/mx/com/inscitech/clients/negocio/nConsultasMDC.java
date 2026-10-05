package mx.com.inscitech.clients.negocio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.*;
import mx.com.inscitech.clients.util.*;
/**
 * Autor:  inscitech Mxico
 * mail: eminguer@inscitechmexico.com
 * Fecha: 29/06/2009
 **/
public class nConsultasMDC extends nDatos{
    private static final Logger LOGGER = LoggerFactory.getLogger(nConsultasMDC.class);

    
    ResultSet rsDatos;
    public void querySelect( int opc) 
    {
        uConsultasMDC  consulta= new uConsultasMDC ();
        DatosBD db = new DatosBD ();
        try {
            switch (opc)
            			{
            			
            		 case 1://Pendientes con instrucciones no monetarios
                      db.setDataBO ( getVtrIntDato1 () ); //CTO_NUM_CONTRATO
                      //db.setDataBO ( getVtrIntDato2 () ); //CTO_NUM_CONTRATO
                      rsDatos = consulta.getResultSet ( opc , db);
                break;
                case 2://detalle Instrucciones no monetarias
                      db.setDataBO ( getVtrIntDato1 () ); //dpo_folio_opera			       
                      db.setDataBO ( getVtrIntDato2 () ); //dpo_num_contrato			       
                      rsDatos = consulta.getResultSet ( opc , db);
                      
                case 3://Obtener etapa
                      db.setDataBO ( getVtrIntDato1 () ); //numero de usuario			       
                      rsDatos = consulta.getResultSet ( opc , db);                      
						   break;   

                case 4://Obtener DOCUMENTOS
                      db.setDataBO ( getVtrStrDato1 () ); //numero de OPERACION			       
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
                   case 1://Pendientes con instrucciones no monetarios
                        setVtrIntDato1( rsDatos.getInt("FOLIO"));
                        setVtrStrDato2( rsDatos.getString("FECHA"));						
                        setVtrStrDato3( rsDatos.getString("INSTRUCCION"));
                        setVtrIntDato4( rsDatos.getInt("TIPO"));
                        setVtrDoubleDato5(rsDatos.getDouble("IMPORTEDPO"));
                        setVtrDoubleDato6(rsDatos.getDouble("IMPORTEDEL"));
                        intContador++;
                  break;
                  case 2://
                       setVtrStrDato1(rsDatos.getString("TXT_COMENTARIO"));
                       setVtrStrDato2(rsDatos.getString("FECHA"));
                       intContador++;
                  break;
                  case 3://
                       setVtrStrDato1(rsDatos.getString("ETAPA"));
                       intContador++;
                  break; 
                  case 4://
                       setVtrStrDato1(rsDatos.getString("DOCUMENTO"));
                       intContador++;
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
