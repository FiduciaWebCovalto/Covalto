/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.negocio;
import mx.com.inscitech.clients.lib.conexion;

import mx.com.inscitech.clients.lib.conexion;
import mx.com.inscitech.clients.lib.servicios;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.util.Hashtable;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class nFiducia 
	{
    public Connection conBD;
    PreparedStatement preparedStatement = null;

	public Statement stQuery;
	public ResultSet rsQuery;
	public ResultSet rsQuery_Secuen;
	public Statement stQuery_Secuen;	
	public Statement stInstrucc;
	public String sQuery;
	public String sInstrucc;
	public int iRows;		
	public ResourceBundle resBundle;
	public NumberFormat nfFormato;
  public Statement stSaldo;
  public DecimalFormat dfFormat;
  public String sMensaje;
  public PreparedStatement pstQuery;
  String resultado[]={null};
  servicios serv = new servicios();
	public nFiducia()
						{
							conBD = null;
							stQuery = null;
							stInstrucc = null;
							stQuery_Secuen = null;
							rsQuery_Secuen = null;
							rsQuery = null;
							sQuery = null;
							sInstrucc = null;
							//resBundle = "";//ResourceBundle.getBundle("FiduciaBDParams");
							nfFormato = NumberFormat.getCurrencyInstance(Locale.US);
							dfFormat = new DecimalFormat("###,###,###,##0.00");
							sMensaje = "";
							
							DriverIni();
						}


/*****************************CONEXION A BASE DE DATOS**********************************/

    private void DriverIni()
						    {
						    	try
						    	{
						    		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
						    	}
						    	catch(SQLException e)
						    	{
						    		System.out.print(e);
						    	}
						    }

    public boolean conectarBD() throws NamingException {
        try {
                
            conexion conecta = new conexion();
            conBD = conecta.conectarBD();
            System.out.println("Status conexion:"+conecta.conectarBD());
           
        } catch (Exception e) {
            System.out.print(e);
            return false;
            } 
        return true;

    }

		
	public void CloseBD() throws SQLException
							{
								try
								{
									if(conBD != null && conBD.isClosed() == false ) conBD.close();
								}
								catch (SQLException e)
								{
									System.out.print(e);
								}
							}
							
   /***************************** FIN METODOS DE CONEXION A BASE DE DATOS**************/							
		
		
		
							

	/**************************** METODOS DE FECHAS ***********************************/	


	public String getFecha()
		{
                        String sFecha="";
			try
			{
			    //servicios serv = new servicios();
			    resultado=serv.consumo(3,"");
			    System.out.println("resultado getFecha="+resultado[0]);
			    sFecha=resultado[0];			
			}
			catch (Exception ex)
			{
				System.out.println("Error de getFecha");
				System.out.println(ex);
				return null;
			}
                    return sFecha;
                }		

	public String fecha()
		{
                String sFecha="";
		try
			{
			    //servicios serv = new servicios();
			    resultado=serv.consumo(3,"");
			    System.out.println("resultado="+resultado[0]);
			    sFecha=resultado[0];
			
			}
			catch (Exception ex)
			{
				System.out.println("Error de getFecha");
				System.out.println(ex);
				return null;
			}
                return sFecha;
		}	
	
	    //regresa la hora de operaci�n
	public String getHora()
	{
		String HoraActual="";	
   		try
		{			
			if (conBD == null) if (!conectarBD()) return HoraActual;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return HoraActual;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);				
			sQuery = "SELECT TO_CHAR(CURRENT_TIMESTAMP, 'HH24:MI:SS')";
			rsQuery= stQuery.executeQuery(sQuery);
			if(rsQuery.next())
				{
				HoraActual=(rsQuery.getString(1)).trim();
				return HoraActual ;
				}
			else
				return HoraActual;	
		}
		catch(Exception ex)
		{
			System.out.println("Error de getHora");
			System.out.println(ex);
			return HoraActual;
		}
		finally
		{
			//System.out.println("Cerrando finally de la base de getHoraOperacion");
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}	
   	
	}

/*
	   @Objetivo: Metodo que se agrego para tener un mecanismo que permita controlar el acceso a internet
	   desde la aplicacion de fiducia. Valida que el acceso a internet este habilitado
	*/
	public boolean getAccesoInternet()
	{
		boolean bResult=false;
                String resultado[]={null};
		try
		{
                    
                        //servicios serv = new servicios();
                        resultado=serv.consumo(1,"1");
                        System.out.println("resultado="+resultado[0]);
                        if(Integer.valueOf(resultado[0])==1)
                            bResult=true;

		}
		catch(Exception ex)
		{
			System.out.println("getAccesoInternet: "+ex);
		
		}
			
		return bResult;	
	}
	
	public boolean getHorarioOperacion()
	{	
		boolean bandera=false;	
                try
		{
                                //servicios serv = new servicios();
                                resultado=serv.consumo(3,"");
                                System.out.println("resultado="+resultado[0]);
                                if(resultado.length>0)
                                    bandera=true;			
		}
		catch(Exception ex)
		{
			System.out.println("getHorarioOperacion: "+ex);
			
		}
                return bandera;
	}

	
	
	
	public String getFechaHabil(String sFechaHabil)
	{
		String[] sData = null;
		
		try
		{	
			//se procede a verificar si existe un fin de semana
			//posterior a la fecha de operacion
			//servicios serv = new servicios();
			resultado=serv.consumo(3,"");
			System.out.println("resultado="+resultado[0]);
                        sFechaHabil=resultado[0];
			
			
		}
		catch (Exception ex)
		{
				System.out.println("Error de getFechaHabil");
			System.out.println(ex);
			return null;
		}
		
		return sFechaHabil;	
		
	}

	private int getFeriados(String sFecha)
	{
		String[] sData = null;
		int dias_trans=0,dia_fecha=0,i=0;
		try
		{
			if (conBD == null) if (!conectarBD()) return 0;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return 0;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			//se recuperan las fechas que sean dias festivos
			//en el mes que corresponda a la fecha de operaci�n
			
			sQuery="SELECT LTRIM(to_char(FER_FEC_DIA,'00')) ||'/'|| LTRIM(to_char(FER_FEC_MES,'00')) ||'/'||" + sFecha.substring(6,10) + " FROM FERIADOS";
			sQuery+=" where FER_FEC_MES="+ sFecha.substring(3,5) +"";
			sQuery+=" order by FER_FEC_DIA desc";
			
			rsQuery=stQuery.executeQuery(sQuery); 
			
			if(rsQuery.next())
				{
				rsQuery.last();			
				sData = new String[rsQuery.getRow()];
				rsQuery.first();
				i=0;
				do{
					
					sData[i] = rsQuery.getString(1);
					i++;
				  }
				while(rsQuery.next());
				i--;
				
				dia_fecha=Integer.valueOf(sFecha.substring(0,2)).intValue();
				
				//se determina a partir de que d�a debe iniciar la revision
				//de los dias feriados
				
				while(i>=0)
				{
					//se verifica si existe algun dia festivo posterior
					//a la fecha de operacion	
					
					if(dia_fecha+1==Integer.valueOf(sData[i].substring(0,2)).intValue())
						break;
					i--;
				}
				while(i>=0)
				{
					//se verifica si existe algun dia festivo posterior
					//a la fecha de operacion	
					
					if(dia_fecha+1==Integer.valueOf(sData[i].substring(0,2)).intValue())
						{
						dias_trans++;
						dia_fecha++;
						}
					else
						break;
					i--;
				}
		}
			
			return dias_trans;
		}
		catch (Exception ex)
		{
			System.out.println("Error de getFeriados");
			System.out.println(ex);
			return 0;
		}
		finally
		{
			//System.out.println("Cerrando finally de la base de getFeriados");
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
	}

	
	private	String getCalcFecha(String sFecha,int dias)
			{
				try
				{
						if (conBD == null) if (!conectarBD()) return null;
						if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
						stInstrucc = conBD.createStatement();
						stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
						
						sQuery="SELECT TO_CHAR(to_date('"+sFecha+"','DD/MM/YYYY')+"+dias+",'DD/MM/YYYY') FROM DUAL";
						rsQuery=stQuery.executeQuery(sQuery); 
						
						rsQuery.next();			
						return rsQuery.getString(1);
				}
				catch (Exception ex)
				{
					System.out.println("Error de getCalcFecha");
					System.out.println(ex);
					return null;
				}
				finally
				{
					////System.out.println("Cerrando finally de la base de  getCalcFecha");
					try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
					try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
					try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
				}
				
			}

  
  public String getFolio(int iTipoFolio)
	{
  	String sNumFolio="";
		try
		{
		    resultado=serv.consumo(12,iTipoFolio+""); //se el folio
		    sNumFolio=resultado[0];
		}
		catch (Exception ex)
		{
			System.out.println("Error de getFolio");
			System.out.println(ex);
			return null;
		}
		finally
		{
                  return sNumFolio;
		}
	}

  public String getFolioUnchanged(int iTipoFolio)
	{
  	String sNumFolio="";
		try
		{
		    resultado=serv.consumo(12,iTipoFolio+""); 
		    sNumFolio=resultado[0];
		}
		catch (Exception ex)
		{
			System.out.println("Error de getFolioUnchanged");
			System.out.println(ex);
			return null;
		}
                  return sNumFolio;
		
	}

	/*
	Metodo: getFolioFOSEG
	Funcion:Obtiene el n�mero de folio para el movimiento de FOSEG
	*/
	public String getFolioFOSEG()
	{
		try
		{
			String sNumFolio;
			if (conBD == null) if (!conectarBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
			stInstrucc = conBD.createStatement();
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			sQuery="SELECT NVL(MAX(fol_num_folio),0) + 1 FROM folios WHERE fol_tipo_folio=10";
			rsQuery=stQuery.executeQuery(sQuery); 
			rsQuery.next();
			sNumFolio = rsQuery.getString(1);
			sInstrucc="UPDATE FOLIOS SET fol_num_folio=" + sNumFolio + " WHERE fol_tipo_folio=10";
			iRows = stInstrucc.executeUpdate(sInstrucc);
			if (iRows>0) return sNumFolio;
			else return null;
		}
		catch (Exception ex)
		{
			System.out.println("Error de getFolioFOSEG" + ex);
			return null;
		}
		finally
		{
			try { if(stInstrucc!= null ) stInstrucc.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
	}



	//Obtiene la clave de los catalogos
	
	public	String getKey(int iOpcion, String sCond)
	{
                int origen=0;
		try
		{
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			switch (iOpcion)
			{
				case 1: // Paises
				
					sQuery = "SELECT pai_num_pais FROM paises WHERE pai_nom_pais='" + sCond + "'"; 
					break;
					
				case 2: // Conceptos de retiro
				
					sQuery = "SELECT opf_num_operacion FROM operfid WHERE opf_descripcion='" + sCond+ "'";
					break;
					
				case 3: // Monedas
                                        origen=1;
                                        System.out.println("Monedas por Nombre nfiducia: "+sCond);
                                        resultado=serv.consumo(18,sCond); 
                                        
					sQuery = "SELECT mon_num_pais FROM monedas WHERE mon_nom_moneda='" + sCond+ "'";
					break;
				
				case 4: //Secuencial de la operacion rutinaria de retiro
					sQuery = "SELECT oaf_num_intermed FROM opasifir WHERE oaf_num_contrato=" + sCond;
					break;			
          
        case 5: //clave del banco
					sQuery = "SELECT cve_num_sec_clave FROM claves WHERE cve_num_clave=27 AND";
					sQuery+= " cve_desc_clave like '%" + sCond+ "%'";
					break;	   

			  case 6: // Obtener limite superior cve 303 - numero de cuenta
				   sQuery = " SELECT CVE_NUM_SEC_CLAVE "
                  + " FROM CLAVES "
                  + " WHERE CVE_NUM_CLAVE = 128 "
                  + " AND CVE_DESC_CLAVE = '" + sCond + "'"; 
           break;

			}
            if(origen==0){
                    System.out.println("sQuery getKey: "+sQuery);
                    rsQuery=stQuery.executeQuery(sQuery);
                    if(rsQuery.next())
                            return rsQuery.getString(1);
                    else
                            return null;    

            }else{
                    return resultado[0];
                }
		}
		catch (Exception ex)
			{
			System.out.println(ex);
			return null;
			}
		finally
		{
			//System.out.println("Cerrando base del  finally de getKey");
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
		}
	}

	
  public String getNumContrato(String sFiso,String origenRecursos)
	{
		 
		try
		{
			
			if (conBD == null) if (!conectarBD()) return null;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return null;
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			sQuery = "SELECT DISTINCT cpr_contrato_inter FROM continte "; 
			sQuery += "WHERE cpr_num_contrato = " + sFiso;
			sQuery += " AND  cpr_cve_orig_rec='"+origenRecursos+"'";
			sQuery += " AND cpr_contrato_inter <> 1000";
			//sQuery += " ORDER BY cpr_contrato_inter ASC";
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			rsQuery=stQuery.executeQuery(sQuery); 
			if(rsQuery.next())
			 {
			 return rsQuery.getString(1);
			}
		else
			return "";
			
		}
		catch (Exception ex)
		{
			System.out.println("Error de  getNumContrato" + ex);
			System.out.println(sQuery);
			return null;
		}
		finally
		{
		
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
	}
	

//verifica si existen rendimientos por asignar
   public boolean rendimientosPendientes(String sFiso,String sContrato)
		{
		 boolean bResultado=false;
		try
		{
			
			if (conBD == null) if (!conectarBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			sQuery = " SELECT SUM(REN_IMP_X_ASIGNAR) FROM rendimi_foseg "; 
			sQuery += " WHERE  REN_NUM_FID =" + sFiso;
			sQuery += " AND   REN_NUM_CONTRATO="+sContrato;
			sQuery += " group by REN_NUM_FID,REN_NUM_CONTRATO  ";
			

			rsQuery=stQuery.executeQuery(sQuery); 
			if(rsQuery.next())
			 if(rsQuery.getDouble(1)>0)
			 	bResultado=true;

			
		}
		catch (Exception ex)
		{
			System.out.println("Error de  rendimientosPendientes" + ex);
			bResultado= false;
		}
		finally
		{		
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
			return bResultado;
		}
	}
	
		


	public double getRendimientosContrato(String sFiso,String sEjercicio,String sContrato)
	{
		 
		try
		{
			
			System.out.println("entraaaa amet");
			if (conBD == null) if (!conectarBD()) return 0;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return 0;
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			sQuery = "SELECT REN_IMP_X_ASIGNAR FROM rendimi_foseg "; 
			sQuery += "WHERE  REN_NUM_FID =" + sFiso;
			sQuery += " AND   REN_NUM_CONTRATO="+sContrato;
			sQuery += " AND   REN_EJERCICIO="+sEjercicio;
		

			rsQuery=stQuery.executeQuery(sQuery); 
			if(rsQuery.next())
			 {
			 return rsQuery.getDouble(1);
			}
		else
			return 0;
			
		}
		catch (Exception ex)
		{
			System.out.println("Error de  getRendimientosContrato" + ex);
			return 0;
		}
		finally
		{		
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
	}



	/*
	FIRMAS MANCOMUNADAS
	Metodo: firmasMancomunadas
	Funcion: Determina si es un fiso con firmas mancomunadas
	*/
	
	public  boolean  firmasMancomunadas(String numFiso)
	{
		boolean firmas=false;
		try
		{
			if (conBD == null) if (!conectarBD()) return firmas;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return firmas;
			stQuery = conBD.createStatement();
			rsQuery=stQuery.executeQuery("select nvl(CTO_FIRMAS_MANCOMUNADAS,0) as firmas from CONTRATO where CTO_NUM_CONTRATO="+numFiso); 
			if(rsQuery.next())
				{
				if(rsQuery.getInt("firmas")==1)
					firmas=true;
				}
		
		}
		catch (Exception ex)
			{
			System.out.println("Funcion firmasMancomunadas, Error:");
			System.out.println(ex);
			}
		finally
			{
			//System.out.println("Cerrando finally de la base de  getFolio");
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
			return firmas;
			}
	}

  public int existeUsuario (String strUsuario, String strPassword)	
	{
		
                int numUsuario=-1;
                String cveUsuario="";

		/*
		 *numUsuario=-1 // el usuario no esta registrado en el sistema
		 *numUsuario=-2	// el usuario no se encuentra activo
		 *numUsuario=-3 // el usuario no tiene asignados fideicomisos
		 *numUsuario>0	// numero de usuario
		 **/
		try
		{      		
		
			// conectandose a la base
			/*servicios serv = new servicios();
			resultado=serv.consumo(2,strUsuario);
			System.out.println("resultado="+resultado[0]);
                        if(resultado==null)
                            numUsuario=-3;*/
			if (conBD == null) if (!conectarBD()) return -1;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return -1;

			//Validaci�n del usuario
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			sQuery = "SELECT id as numUsuario,FUSU_STATUS as st,FPER_ID_PERFIL as perfil FROM F_USUARIO WHERE email='"+ strUsuario +"'";
			
			rsQuery=stQuery.executeQuery(sQuery);			
			
			if (rsQuery.next())	
				{
                                cveUsuario = rsQuery.getString("numUsuario");          
				numUsuario = 1;
				if(!rsQuery.getString("st").equals("ACTIVO"))
					numUsuario=-2;						
				}         
                                if(rsQuery.getInt("perfil")==1)
                                    numUsuario = 1;
                                else if (numUsuario>0 && (rsQuery.getInt("perfil")!=7 && rsQuery.getInt("perfil")!=8 &&
                                rsQuery.getInt("perfil")!=9 && rsQuery.getInt("perfil")!=10))
                                {
                                    sQuery = "SELECT FFID_ID_FIDEICOMISO as fiso from F_USUFID WHERE FUSU_ID_USUARIO='"+ strUsuario +"'";
                                    rsQuery=stQuery.executeQuery(sQuery);   
                                    if(!rsQuery.next()){    
                                        numUsuario=-3;
                                    }
                                }
			}		
		catch (Exception ex)
			{
			System.out.println(ex);
			System.out.println(sQuery);
    		}
		finally
		{
			
			System.out.println("Cerrando finally de la base de existeUsuario");
			try{ if( rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex);  }
			try{ if( stQuery != null ) { stQuery.close(); } } catch (Exception ex) { System.out.println(ex); }
			try{ if( conBD != null)CloseBD(); } catch (Exception ex) { System.out.println(ex); } 
    	}
    	return numUsuario;		
	}//fin del m�todo de validar al usuario en el sistema


//Recupera el nombre, mail,tipo de usuario y los fideicomisos de un usuario	
	
	public String[] getDatosUsuario(String iNumUser)
	{
        String[] sData = null,sArreglo={null};
        int indice=4;
                String sNombrePerfil="",sNombreUsuario="",sCorreo="";
		try
		{
			int i;
			if (conBD == null) 
				{
				
			   	if (!conectarBD()) 
					{
					return sData;
					}
				}
			if (conBD != null && conBD.isClosed() == true)
				{
					
				 if (!conectarBD()) 
				 	{
				 	
				 	return sData;
				 	}
				 
				}
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			//Validando Perfil
			sQuery = " SELECT U.FPER_ID_PERFIL as perfil,P.FPER_NOMBRE_PERFIL nombre,";
                        sQuery += "U.FUSU_NOMBRE_USUARIO usuario,U.email correo";
			sQuery +=" FROM F_USUARIO U,F_PERFIL P WHERE U.email='";
                        sQuery += iNumUser +"'";
                        sQuery +=" AND U.FPER_ID_PERFIL=P.FPER_ID_PERFIL";
			
			
			rsQuery=stQuery.executeQuery(sQuery); 
			rsQuery.first();
                        sNombrePerfil=rsQuery.getString("nombre");
                        System.out.println("Perfil:"+sNombrePerfil);
                        sNombreUsuario=rsQuery.getString("usuario");
                        sCorreo=rsQuery.getString("correo");
                        System.out.println("IDPerfil: "+rsQuery.getInt("perfil"));
                          //perfiles sin establecimiento de fideicomiso
                          if( !(rsQuery.getInt("perfil")==7 || rsQuery.getInt("perfil")==8 ||
                          rsQuery.getInt("perfil")==9 || rsQuery.getInt("perfil")==10) )
                          {
                              //Recuperando los fideicomisos
                              sQuery = " SELECT U.FFID_ID_FIDEICOMISO "; 
                              sQuery +=" FROM F_USUFID U WHERE U.FUSU_ID_USUARIO=?";
                              sQuery += " ORDER BY 1";    
                              System.out.println("Recuperando fisos..:."+sQuery);   
                              preparedStatement = conBD.prepareStatement(sQuery.toString(), 
                                            ResultSet.TYPE_SCROLL_SENSITIVE, 
                                            ResultSet.CONCUR_UPDATABLE);
                              preparedStatement.setString(1, iNumUser);
                              rsQuery = preparedStatement.executeQuery();  
                              if(rsQuery.next())
                              {
                                  rsQuery.last(); 
                                  indice+=rsQuery.getRow();
                                  System.out.println("Indice con fisos "+indice);
                                  sData = new String[indice];
                                  sData[0] = sNombreUsuario;
                                  sData[1] = sCorreo;
                                  sData[2] = sNombrePerfil;
                                  sData[3] = "1";                        
                                  rsQuery.first();
                                  i=4;
                                  do
                                  {
                                      System.out.println("Fiso getDatosUsuario:"+rsQuery.getString(1));    
                                      resultado=serv.consumo(7,rsQuery.getString(1));
                                      for (String item : resultado) {
                                          //System.out.println("item"+item);
                                          sData[i] = rsQuery.getString(1)+"-"+item;
                                          break;
                                      } 

                                      /*sData[2] = rsQuery.getString(2);
                                      sData[3] = rsQuery.getString(3);*/
                                      i++;
                                  }while(rsQuery.next());
                              }
                              rsQuery.close();
                              preparedStatement.close();
                          }
                        
                        
                    if(indice==4){
                            rsQuery.close();
                            System.out.println("El usuario no tiene asignado fisos");
                            sData = new String[indice];
                            sData[0] = sNombreUsuario;
                            sData[1] = sCorreo;
                            sData[2] = sNombrePerfil;
                            sData[3] = "1";
                        }
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
		return sData;
	}


	public void actualizaUltimoAcceso(String sNumUser)
	{
		String fecha=getFecha();
		try
		{
				
			if (conectarBD())
				{
				
				stInstrucc = conBD.createStatement();
				
				sInstrucc = "UPDATE F_USUARIO SET FUSU_ULT_ACCESO=to_date('" +fecha + "','dd/mm/yyyy') WHERE FUSU_ID_USUARIO='"+ sNumUser + "'";
				
				iRows = stInstrucc.executeUpdate(sInstrucc);
				}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			
		}
		finally
		{

			try { if(stInstrucc != null ) stInstrucc.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}

	}


    /*
    Metodo:getTipoFiso
    Funcion:Determina si el fiso es un FOSEG
    
    */
	
	public boolean getTipoFiso(String numFid)
	{
		try
		{
				  return false;
		}
		catch(Exception ex)
		{
			System.out.println("getTipoFiso: "+ex);
			return false;
		}
		
	}
    
    
    	//Verifica si el fideicomiso maneja cuentas individuales
	public boolean ExistenCtasInd(String sNumFid)
	{
		try
		{	
		    return false;
                    /*
			if (conBD == null) if (!conectarBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
									
			sQuery = "SELECT COUNT(*)";
      sQuery += " FROM PARAM_FISOS";
      sQuery += " WHERE CTO_NUM_CONTRATO  = " +  sNumFid ;      
      sQuery += " AND   CTAS_INDIVIDUALES = 1";
      sQuery += " AND   ESTATUS           = 'ACTIVO'";
      
			rsQuery= stQuery.executeQuery(sQuery);
			rsQuery.next();
			if (rsQuery.getInt(1) > 0 )
				return true;
			else
				return false;*/
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			return false;
		}
		/*finally
		{
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}*/			
	}
  
 	//Da formato a un importe
	public String formatImporte(String Importe)
	{
    	char temp[]=Importe.toCharArray();
		int cont=0;	
		for(int i=(Importe.length()-1);i>=0;i--)
		{
			if(temp[i]==',')
		   	{
			   	for(int x=i;x>0;x--)  
			       temp[x]=temp[x-1]; 
		    	temp[cont]=' ';
		    	cont++;	
			}	
		}
		Importe=new String(temp);
		Importe=Importe.trim();
		return Importe;
	
	}
  
  	//Obtiene el saldo actual de un contrato
	public double getSaldoActual(String sNumFid, String sCtoInv)
	{

		String sFechasig=null,sFechaact=null;
                String []sProv={null};
		sFechaact=getFecha();
		sFechasig=getFechaHabil(sFechaact);
		int i;
		double dImp = 0, dTotal = 0;
				
		try
		{
                        resultado=serv.consumo(42,sNumFid+"&id2="+sCtoInv);
                        for(String item: resultado){
                            sProv=new String[2];
                            System.out.println("resultado item="+item);
                            sProv=item.split("-");
                            dImp+=Double.valueOf(sProv[1]);//se suma el costo historico
                        }
			return dImp; 
	            
		}
		catch (Exception ex)
		{
			System.out.println("Error de getSaldoActual");
			System.out.println(ex);
			System.out.println(sQuery);
			return 0;
		}
	}		
	
  //se obtiene saldo de la cuenta de cheques
	public double getSaldoActualCtaCheques(String sNumFid, String sCtaCheques,
  String sSubCuenta)
	{

		String sFechasig=null,sFechaact=null;
		
		int i;
		double dImp = 0, dTotal = 0;
				
		try
		{
				
			// conectandose a la base
			if (conBD == null) if (!conectarBD()) return 0;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return 0;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
      String temp[]=sSubCuenta.split("-");
			sQuery = "SELECT ABS(SAL_IMP_SALDO_ACT) FROM SALDOS";
			sQuery +=" WHERE SAL_NUM_AUX1=" + sNumFid ;
      if(!temp[0].equals("0")&&temp[0]!=null&& !temp[0].equals("Selecciona una Subcta"))
        sQuery +=" AND SAL_NUM_AUX2=" + temp[0];
      sQuery +=" AND SAL_NUM_AUX3=" + sCtaCheques;
      sQuery +=" AND sal_num_ctam=1103";
			
			rsQuery=stQuery.executeQuery(sQuery); 
			
			if(rsQuery.next())
				{
				dImp = rsQuery.getDouble(1);
				}
				
			return dImp; 
	            
		}
		catch (Exception ex)
		{
			System.out.println("Error de getSaldoActualCtaCheques");
			System.out.println(ex);
			System.out.println(sQuery);
			return 0;
		}
		finally
		{
			//System.out.println("Cerrando finally de la base de getSaldoActual");
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
	}
  
  
  
		//valida saldos(FEDERAL,ESTATAL Y RENDIMIENTO) de un FISO del FOSEG
	public double getSaldoRecursos(String sFiso,String Ejercicio,String Eje, String Programa,String Proyecto, String Accion,String Origen,int iTipo)
	{
		try
		{
			
			if (conBD == null) if (!conectarBD()) return 0;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return 0;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			sQuery = "SELECT ";
			switch(iTipo)	
			{
				case 1: //Disponible
					sQuery += " sal_imp_saldo_act";
					break;
				case 2: //Comprometido
					sQuery += " sal_cargos_per";
					break;
			}
			sQuery += " from  SALDOS";
			sQuery += " where SAL_NUM_CTAM=7000";
			sQuery += " and SAL_NUM_AUX1="+sFiso;
			sQuery += " and SAL_NUM_AUX2="+Ejercicio;
			sQuery += " and SAL_NUM_SCTA="+Eje;
			sQuery += " and SAL_NUM_SSCTA="+Programa;
			sQuery += " and SAL_NUM_SSSCTA="+Proyecto;
			sQuery += " and SAL_NUM_SSSSCTA="+Accion;
			sQuery += " and SAL_NUM_AUX3="+Origen;
			
			rsQuery=stQuery.executeQuery(sQuery); 
			
			if(rsQuery.next())
				return rsQuery.getDouble(1);
			else
				return 0;
		}
		catch(Exception ex)
		{
			System.out.println("getSaldoRecursos: "+ex);
			return 0;
		}
		finally
		{
			//System.out.println("Cerrando finally de la base de getSaldoRecursos");
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}		
	}
	
   
   public int obtenNumeroCliente(String sUser) {
      int iNumUser = 0;
     
      try { 
         if (conBD == null) if (!conectarBD()) throw new Exception();
         if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
         
         stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); 
         
         sQuery =  " SELECT USU_NUM_USUARIO ";
         sQuery += " FROM USUARIOS ";
         sQuery += " WHERE USU_NOM_USUARIO = '" + sUser + "'";   
         rsQuery = stQuery.executeQuery(sQuery);  
         
         if( rsQuery.next() ) {
            iNumUser = rsQuery.getInt(1);
         }
      }catch (Exception ex){ 
         System.out.println(ex); 
      }finally{
			     try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
           try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
           try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		    }
        return iNumUser;  
   } /*TERMINA METODO OBTEN NUMERO CLIENTE */


/*
    Metodo: esDeposito
    Funcion: valida si el folio pertenece a un deposito
    */
	public boolean esDeposito(String folio)
	{
		boolean bReturn= false;
		try
		{
			if (conBD == null) if (!conectarBD()) return false;
			if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return false;
			
			stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		
					sQuery  = "select "
									+ " NVL(COUNT(1),0) "
									+ " from  "
									+ " instrucc "
									+ " where " 
									+ "INS_NUM_FOLIO_INST="+folio
									+ " AND ins_cve_tipo_instr = 'RECEPCION INTERNET'";
				
			rsQuery=stQuery.executeQuery(sQuery); 
			
			if(rsQuery.next())
				if(rsQuery.getInt(1)>0)
					bReturn=true;
		
			
		}
		catch(Exception ex)
		{
			System.out.println("esDeposito: "+ex);
			
		}
		finally
		{
			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
			
		return bReturn;	
		}		
	}

  /* Obtiene los titulos y longitud de niveles para cuentas individuales **/
	public String[] getTitulosCtasInd(String sFid)
	{
		String[] sData = new String[8];
		int i;
		String sCve;
	try
		{			
		  // conectandose a la base
		  if (conBD == null) if (!conectarBD()) return sData;
	  	if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return sData;
		  
		  stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	  	
		  sQuery = "SELECT TRIM(EST_NOMBRE)";
		  sQuery += " FROM FID_ESTRUC_CTAS_IND";
		  sQuery += " WHERE EST_CONTRATO = " + sFid;
      sQuery += " ORDER BY EST_NIVEL ASC";
	  	
		  rsQuery=stQuery.executeQuery(sQuery); 
		  
      i = 1;
		  if(rsQuery.next())
		  {				
        do{					
					sData[i] = rsQuery.getString(1);
					i++;
				  }
				while(rsQuery.next());
		  }
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
		return sData;
	} /* Fin obtiene los titulos para niveles para cuentas individuales **/
  
	public int[] getLenCtasInd(String sFid)
	{
		int[] iData = new int[8];
		int i;
		String sCve;
	try
		{			
		  // conectandose a la base
		  if (conBD == null) if (!conectarBD()) return iData;
	  	if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return iData;
		  
		  stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	  	
		  sQuery = "SELECT EST_LONG_ID";
		  sQuery += " FROM FID_ESTRUC_CTAS_IND";
		  sQuery += " WHERE EST_CONTRATO = " + sFid ;
	  	sQuery += " ORDER BY EST_NIVEL ASC ";
		  rsQuery=stQuery.executeQuery(sQuery); 
		  
      i = 1;
		  if(rsQuery.next())
		  {				
        do{					
					iData[i] = rsQuery.getInt(1);
					i++;
				  }
				while(rsQuery.next());
		  }
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}    
    
  try
		{			
		  // conectandose a la base
		  if (conBD == null) if (!conectarBD()) return iData;
	  	if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) return iData;
		  
		  stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	  	
		  sQuery = "SELECT SUM(EST_LONG_ID)";
		  sQuery += " FROM FID_ESTRUC_CTAS_IND";
		  sQuery += " WHERE EST_CONTRATO = " + sFid ;
		  rsQuery=stQuery.executeQuery(sQuery); 
		  
		  if(rsQuery.next())
		  {
        iData[0] = rsQuery.getInt(1);
		  }
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{			
			try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
			try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		}
    
		return iData;
	}    
  /* Fin obtiene longitud de niveles para cuentas individuales **/
  
  public int obtenMoviIni(String sFiso, String sFecFidIni) {
      int iNumMovIni = 0;
     
      try { 
         if (conBD == null) if (!conectarBD()) throw new Exception();
         if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
         
         stQuery = conBD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); 
         
         sQuery =  " SELECT COUNT(*) ";
         sQuery += " FROM FID_MOV_CTAS_IND ";
         sQuery += " WHERE MOV_FEC_OPER = TO_DATE('" + sFecFidIni + "','DD/MM/YYYY')";   
         sQuery += " AND MOV_TIPO_OPER = 'I'"; 
         sQuery += " AND MOV_CONTRATO = " + sFiso;
         System.out.println(sQuery);
         rsQuery = stQuery.executeQuery(sQuery);  
         
         if( rsQuery.next() ) {
            iNumMovIni = rsQuery.getInt(1);
         }
      }catch (Exception ex){ 
         System.out.println(ex); 
      }finally{
			     try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
           try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
           try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		    }
        return iNumMovIni;  
   } /*TERMINA M�TODO OBTEN MOVI INI */

  //SE EFECTUA EL LLAMADO AL PROCEDIMIENTO ALMACENADO PARA ESTADOS FINANCIEROS
  public boolean generaEdosFinan(String sFiso, String Anio,String Mes,int nReporte,String nomTabla) {
     
      try { 
         if (conBD == null) if (!conectarBD()) throw new Exception();
         if (conBD != null && conBD.isClosed() == true) if (!conectarBD()) throw new Exception();
         
          CallableStatement spEdoFinan;
        
          spEdoFinan = conBD.prepareCall( "{CALL SP_EDOSFINANCIEROS(?,?,?,?,?)}" );
          spEdoFinan.clearParameters();
          
          spEdoFinan.setInt(1,Integer.valueOf(sFiso).intValue());
          spEdoFinan.setInt(2,nReporte);
          spEdoFinan.setInt(3,Integer.valueOf(Mes).intValue());
          spEdoFinan.setInt(4,Integer.valueOf(Anio).intValue());
          spEdoFinan.setString(5,nomTabla);
          
          spEdoFinan.execute();
                 
      }catch (Exception ex){ 
         System.out.println(ex); 
      }finally{
			     try { if(rsQuery != null ) rsQuery.close(); } catch (Exception ex) { System.out.println(ex); }
           try { if(stQuery != null ) stQuery.close(); } catch (Exception ex) { System.out.println(ex); }
           try { CloseBD(); } catch (Exception ex) { System.out.println(ex); }
		    }
        return true;  
   } /*TERMINA M�TODO OBTEN MOVI INI */  
  
  public String sEncuentraDescripcion(String []resultado,String patron){
      String sprovisional="";
      try{
            // Búsqueda para encontrar la descripcion
            for (String resul : resultado) {
                if (resul.contains(patron)) {
                    System.out.println("contenido: " + resul);
                    sprovisional = resul.replace(patron, "");
                    System.out.println("valor hallado: " + sprovisional);
                    break; // Detener la búsqueda al encontrarlo
                }
            }          
        }catch (Exception ex){ 
         System.out.println(ex); 
      }
        return sprovisional;
      }
}/*termina clase*/