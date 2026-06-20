package com.bancomext.negocio;
import java.sql.*;
import com.bancomext.util.*;

public class nSeguridad extends nDatos{
    
    ResultSet rsDatos;
    public void querySelect( int opc) 
    {
        uSeguridad  consulta= new uSeguridad ();
        DatosBD db = new DatosBD ();
        try {
            switch (opc)
            			{
            				
            			case 1://FUNCIONES ASIGNADOS AL PERFIL DEL USUARIO				
            				db.setDataBO ( getVtrIntDato1 () ); //ID USUARIO		       
                    db.setDataBO ( getVtrIntDato2 () ); //ID MENU	
                    db.setDataBO ( getVtrIntDato3 () ); //FILTRO TIPO DE FUNCION: INTERNOS(0),CLIENTE GENERICAS(1),CLIENTE NORMALES(2) 0 CLIENTE PRESUPUESTALES(3)
						        
						        break;
		                default:
		                	break;				
            			}
      rsDatos = consulta.getResultSet ( opc , db);            
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
                
                	case 1://FUNCIONES ASIGNADOS AL PERFIL DEL USUARIO	
                    
                    	setVtrStrDato1( rsDatos.getString("funcion"));//nombre de la funcion						
					            setVtrStrDato2( rsDatos.getString("jsp"));//jsp asignado			
                    
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
            System.out.println(this.getClass()+"->"+e+"<-> opcionRecupera :"+ opc );
        			}
        consulta.dbConnClose();
     }	
}
