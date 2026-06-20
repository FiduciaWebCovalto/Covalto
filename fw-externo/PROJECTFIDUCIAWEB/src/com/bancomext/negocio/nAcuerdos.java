/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package com.bancomext.negocio;
import java.sql.*;
import com.bancomext.util.*;

public class nAcuerdos extends nDatos
	{
   	ResultSet rsDatos=null;	
 	uAcuerdos acuerdos= new uAcuerdos();
 	DatosBD db = new DatosBD ();
 
 
     public boolean 	aplica(int numContrato)
    	{
    	boolean bExisteComiteTecnico=false;
		try{		
			db.setDataBO (numContrato);	
    		rsDatos = acuerdos.getResultSet (0 , db);
    		
			while (rsDatos.next()) 
				{
				 if(rsDatos.getInt("existe")==1)
				  	bExisteComiteTecnico=true;			
 				}
					
			if(rsDatos!=null) rsDatos.close();	

			}
			catch(Exception e)
				{
				blnDatos= false;
				System.out.println("Error:"+e+"--"+ 201 );
				}
			finally
			      {
				  acuerdos.dbConnClose();	
				  removerValores();
				  db.limpiarDatos();			
				  return bExisteComiteTecnico;
				  }		
				
    	}
	
 
 
    public boolean 	aplica(int numContrato,String nomPerfil)
    	{
    	boolean bExisteComiteTecnico=false;
		try{		
      bExisteComiteTecnico=false;
      if (nomPerfil.equalsIgnoreCase("OPERATIVO CON ACUERDOS")  ||nomPerfil.equalsIgnoreCase("CAPTURA CON ACUERDOS"))
        bExisteComiteTecnico=true;			
			}
			catch(Exception e)
				{
				blnDatos= false;
				System.out.println("Error:"+e+"--"+ 201 );
				}
			finally
			      {
				  acuerdos.dbConnClose();	
				  removerValores();
				  db.limpiarDatos();			
				  return bExisteComiteTecnico;
				  }		
				
    	}
	
	public  int queryUpdate ( int opc)
	{  
		
		int intRows=0;
		
		try
		{
			switch (opc)
			{	    
			    //SESIONES COMITE TECNICO
				case 1://Registro
				
					   
				    db.setDataBO ( getVtrIntDato1 () );//NUM_CONTRATO	
					db.setDataBO ( getVtrStrDato2 () );//FECHA
					db.setDataBO ( getVtrStrDato3 () );//TIPO DE SESION
					db.setDataBO ( getVtrStrDato4 () );//TEMA DE SESION
					db.setDataBO ( getVtrIntDato5 () );//NUM_USUARIO					    					
					break;
					
				case 4://Eliminar
				
					   
				    db.setDataBO ( getVtrIntDato1 () );//NUM_CONTRATO	
					db.setDataBO ( getVtrStrDato2 () );//FECHA
					db.setDataBO ( getVtrStrDato3 () );//TIPO DE SESION
					db.setDataBO ( getVtrIntDato4 () );//NUM_USUARIO
				    					
					break;					

			    //ACUERDOS POR SESION DEL COMITE TECNICO
				case 11://Registro
				
					   
				    db.setDataBO ( getVtrIntDato1 () );//NUM_CONTRATO	
					db.setDataBO ( getVtrStrDato2 () );//FECHA
					db.setDataBO ( getVtrStrDato3 () );//TIPO DE SESION
					db.setDataBO ( getVtrStrDato4 () );//ID ACUERDO
					db.setDataBO ( getVtrStrDato5 () );//DESCRIPCION ACUERDO
					db.setDataBO ( getVtrDoubleDato6 () );//MONTO AUTORIZADO
					db.setDataBO ( getVtrDoubleDato7 () );//MONTO DISPONIBLE
					db.setDataBO ( getVtrIntDato8 () );//NUM_USUARIO
				    					
					break;
					
				case 14://DELETE
				
					   
				    db.setDataBO ( getVtrIntDato1 () );//NUM_CONTRATO	
					db.setDataBO ( getVtrStrDato2 () );//FECHA
					db.setDataBO ( getVtrStrDato3 () );//TIPO DE SESION
					db.setDataBO ( getVtrStrDato4 () );//ID ACUERDO					
					db.setDataBO ( getVtrIntDato5 () );//NUM_USUARIO
					break;
					
				case 15://Update
				
					   
				    db.setDataBO ( getVtrIntDato1 () );//NUM_CONTRATO	
					db.setDataBO ( getVtrStrDato2 () );//FECHA
					db.setDataBO ( getVtrStrDato3 () );//TIPO DE SESION
					db.setDataBO ( getVtrStrDato4 () );//ID ACUERDO					
					db.setDataBO ( getVtrStrDato5 () );//ESTATUS
					db.setDataBO ( getVtrIntDato6 () );//NUM_USUARIO
					break;					
				    						
//Se comenta el simbolo ;
			 }	
	   intRows = acuerdos.executeUpdate ( opc , db);	 	 	
	   return intRows;
	   }
	   catch (Exception error)
	   		{  
	   		System.out.println ("error->" + error);
	   		}
	   		
	   acuerdos.dbConnClose();	
	   return 0;
	   
	}
	
	
//query select	
	
    public void querySelect( int opc) 
    {	
        
		try
		{
		switch (opc)
			{
			//CALENDARIO DE SESIONES DEL COMITE TECNICO
			
			case 1: // TODAS
				    
				    db.setDataBO ( getVtrIntDato1 () );//NUM_CONTRATO	   
				      
					break;
			case 2://Fecha
			case 3://Tipo
			case 4://Tema
			
					db.setDataBO ( getVtrIntDato1 () );//NUM_CONTRATO	
					db.setDataBO ( getVtrStrDato2 () );//FECHA
	
			
			   		break;				    
			case 5://Fecha,Tipo (PK)
					db.setDataBO ( getVtrIntDato1 () );//NUM_CONTRATO	
					db.setDataBO ( getVtrStrDato2 () );//FECHA
					db.setDataBO ( getVtrStrDato3 () );//TIPO DE SESION
			
			   		break;	
			   		
			//acuerdos
			case 10://Fecha,Tipo (PK sesion)
			
					db.setDataBO ( getVtrIntDato1 () );//NUM_CONTRATO	
					db.setDataBO ( getVtrStrDato2 () );//FECHA
					db.setDataBO ( getVtrStrDato3 () );//TIPO DE SESION
			
			   		break;				
			case 11://todas
			
					db.setDataBO ( getVtrIntDato1 () );//NUM_CONTRATO	

			
			   		break;				
			case 12://fecha
			case 13://tipo
			case 14://acuerdo
			case 15://estatus
			case 101://estatus != cumplidos
			
					db.setDataBO ( getVtrIntDato1 () );//NUM_CONTRATO	
					db.setDataBO ( getVtrStrDato2 () );
			   		break;	
      case 106:
        break;
	
      case 107://consulta de bitacora por fecha
      case 108://consulta de bitacora por nombre de usuario
					db.setDataBO ( getVtrStrDato1 () );        
        break;

			
			}
			
		    rsDatos = acuerdos.getResultSet ( opc , db);					
		}
		catch (Exception error)
			{  
			System.out.println ("error->" + error);
			}
		removerValores();
		intContador=0;
		try{		
			blnDatos= false;				
			while (rsDatos.next()) 
				{
				blnDatos= true;				
				switch ( opc)				
					{
						
				   //CALENDARIO DE REUNIONES DEL COMITE TECNICO			
				
				   case 1://todas
				   case 2://fecha
				   case 3://tipo
				   case 4://asunto
				   case 5://fecha, tipo de sesion
				   
				   		setVtrIntDato1( rsDatos.getInt("num_contrato") );
				   		setVtrStrDato2( rsDatos.getString("fecha") );
				   		setVtrStrDato3( rsDatos.getString("tipo") );
				   		setVtrStrDato4( rsDatos.getString("tema") );
				   		setVtrStrDato5( rsDatos.getString("fecha_alta") );
				   		setVtrStrDato6( rsDatos.getString("fecha_mod") );
				   		setVtrIntDato7( rsDatos.getInt("no_acuerdos") );
				   		intContador++;
						break;
						
				   case 10://detalle sesion		
				   case 11://fecha, tipo de sesion
				   case 12://fecha
				   case 13://tipo
				   case 14://asunto
				   case 15://estatus
				   case 16://fecha, tipo de sesion
				   case 101://acuerdos vigentes
				   	   
				   		setVtrIntDato1( rsDatos.getInt("num_contrato") );
				   		setVtrStrDato2( rsDatos.getString("sesion_fecha") );
				   		setVtrStrDato3( rsDatos.getString("sesion_tipo") );
				   		setVtrStrDato4( rsDatos.getString("acuerdo_id") );
				   		setVtrStrDato5( rsDatos.getString("acuerdo_descripcion") );
				   		setVtrDoubleDato6( rsDatos.getDouble("monto_autorizado") );
				   		setVtrDoubleDato7(rsDatos.getDouble("monto_disponible"));
				   		setVtrDoubleDato8( rsDatos.getDouble("monto_ejercido"));
				   		setVtrStrDato9( rsDatos.getString("fecha_alta") );
				   		setVtrStrDato10( rsDatos.getString("fecha_ult_mod") );
				   		setVtrStrDato11( rsDatos.getString("estatus") );
				   		setVtrStrDato12( rsDatos.getString("no_sesion") );
						intContador++;
						break;		
						
           case 106:// BITACORA
           case 107://fecha
           case 108://usuario
              setVtrStrDato1(rsDatos.getString("fecha"));
              setVtrStrDato2(rsDatos.getString("usuario"));
              setVtrStrDato3(rsDatos.getString("descripcion"));   
						 intContador++;
						 break;	
											
				    
					}
				
				}
				
			if(rsDatos!=null)
				rsDatos.close();		
				
			}
			catch(Exception e)
				{
				blnDatos= false;
				System.out.println("Error:"+e+"--"+ opc );
				}
			finally
			      {
				   acuerdos.dbConnClose();		
				  }	
			
			
			}	
			
						
}
