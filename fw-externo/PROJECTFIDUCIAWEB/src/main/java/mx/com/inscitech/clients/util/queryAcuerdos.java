/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.util;
 
public class queryAcuerdos 
   {

   	public String strExisteComiteTecnico = "select 0 from dual where 1=?";
   	
   	
    public String strInsertSesion  = "INSERT INTO sesiones_ct"
						            + "(ses_num_contrato,"
						            + " ses_fecha,"
						            + " ses_tipo,"
						            + " ses_tema,"
						            + " ses_fecha_alta,"
						            + " ses_fecha_ult_mod"
						            + " )"
						            + " VALUES ("
						            + "  ?,"
						            + "  to_date(?,'dd/mm/yyyy'),"
						            + "  ?,"
						            + "  ?,"
						            + "  (SELECT to_date(trim(FCO_DIA_DIA || '/' ||FCO_MES_DIA|| '/' || FCO_ANO_DIA),'dd/mm/yyyy') FROM FECCONT),"
						            + "  (SELECT to_date(trim(FCO_DIA_DIA || '/' ||FCO_MES_DIA|| '/' || FCO_ANO_DIA),'dd/mm/yyyy') FROM FECCONT))";
						           
    public String strDeleteSesion  = "DELETE FROM sesiones_ct WHERE "
						            + "ses_num_contrato=? AND"
						            + " ses_fecha=to_date(?,'dd/mm/yyyy') AND"
						            + " ses_tipo=? ";
						            
						           
				            				            
				            
    public String strUpdateSesion  = " Update Sesiones_ct"
						            + " set "
						            + " ses_fecha=?,"
						            + " ses_tipo=?,"
						            + " ses_asunto,"
						            + " ses_status=?,"
						            + " ses_fecha_ult_mod=(SELECT to_date(trim(FCO_DIA_DIA || '/' ||FCO_MES_DIA|| '/' || FCO_ANO_DIA),'dd/mm/yyyy') FROM FECCONT)"
						            + " where"
						            + " ses_num_contrato=?"
						            + " and "
						            + " ses_fecha=to_date(?,'dd/mm/yyyy')";
						         			            

    public String strQuerySesion = "select r.ses_num_contrato as num_contrato,"
							          + "to_char (r.ses_fecha,'dd/mm/yyyy') as fecha,"
							          + "r.ses_tipo as tipo,"
							          + "r.ses_tema as tema,"
							          + "to_char (r.ses_fecha_alta,'dd/mm/yyyy') as fecha_alta,"
							          + "to_char (r.ses_fecha_ult_mod,'dd/mm/yyyy') as fecha_mod,"
							          + "(select count(a.acu_id) from acuerdos_ct a where a.ses_num_contrato = r.ses_num_contrato and a.ses_fecha = r.ses_fecha and a.ses_tipo = r.ses_tipo) as no_acuerdos"
							          + " from sesiones_ct r"
								      + " where"
	      							  + " r.ses_num_contrato=?";
	      
	      

	      public String sAndFecha  = " and"
								      + " r.ses_fecha=to_date(?,'dd/mm/yyyy')";
								      
		  public String sAndTipo  = " and"
								      + " r.ses_tipo=?";
								      						      
								      
		  public String sAndAsunto = " and"
								       + " upper(r.ses_tema) like ";

		
		
		//Acuerdos Comite T�cnico
	public String strInsertAcuerdo 	 = "INSERT INTO "
									 + " acuerdos_ct ("
							         + " ses_num_contrato,"
							         + " ses_fecha,"
							         + " ses_tipo,"
							         + " acu_id,"
							         + " acu_descripcion,"
							         + " acu_monto_autorizado,"
							         + " acu_monto_disponible,"
							         + " acu_monto_ejercido,"
							         + " acu_fecha_alta,"
							         + " acu_fecha_ult_mod,"
							         + " acu_status)"
							         + " VALUES ("
							         + "  ?,"
						             + "  to_date(?,'dd/mm/yyyy'),"
						             + "  ?,"
						             + "  ?,"
						             + "  ?,"
						             + "  ?,"
						             + "  ?,"
						             + "  0,"
						             + "  (SELECT to_date(trim(FCO_DIA_DIA || '/' ||FCO_MES_DIA|| '/' || FCO_ANO_DIA),'dd/mm/yyyy') FROM FECCONT),"
						             + "  (SELECT to_date(trim(FCO_DIA_DIA || '/' ||FCO_MES_DIA|| '/' || FCO_ANO_DIA),'dd/mm/yyyy') FROM FECCONT),"
						             + " 'AUTORIZADO')";
							
	public String strUpdateAcuerdo 	 = "UPDATE  "
									 + " acuerdos_ct "
									 + " SET "
									 + " acu_status=?,"
									 + " acu_fecha_ult_mod=(SELECT to_date(trim(FCO_DIA_DIA || '/' ||FCO_MES_DIA|| '/' || FCO_ANO_DIA),'dd/mm/yyyy') FROM FECCONT)"
									 + " WHERE "
							         + " ses_num_contrato=? AND"
							         + " ses_fecha=to_date(?,'dd/mm/yyyy') AND"
							         + " ses_tipo=? AND"
							         + " acu_id=? "
							         + " AND acu_monto_ejercido>0 ";
							        
							 						             
						             								         
	public String strDeleteAcuerdo 	 = "DELETE FROM  "
									 + " acuerdos_ct "
									 + " WHERE "
							         + " ses_num_contrato=? AND"
							         + " ses_fecha=to_date(?,'dd/mm/yyyy') AND"
							         + " ses_tipo=? AND"
							         + " acu_id=? AND"
							         + " acu_monto_ejercido=0 AND"
							         + " acu_monto_disponible=acu_monto_autorizado";
							         						         
	public String strQueryAcuerdo   = "SELECT a.ses_num_contrato     AS num_contrato, "
									+ " TO_CHAR(a.ses_fecha,'dd/mm/yyyy')    AS sesion_fecha,"
									+ " decode(a.ses_tipo,'O','ORDINARIA','E','EXTRAORDINARIA') AS sesion_tipo,"
									+ " a.acu_id               AS acuerdo_id,"
									+ " a.acu_descripcion      AS acuerdo_descripcion,"
									+ " a.acu_monto_autorizado AS monto_autorizado,"
									+ " a.acu_monto_disponible AS monto_disponible,"
									+ " a.acu_monto_ejercido AS monto_ejercido ,"
							      	+ " TO_CHAR(a.acu_fecha_alta,'dd/mm/yyyy') AS fecha_alta,"
							      	+ " TO_CHAR(a.acu_fecha_ult_mod,'dd/mm/yyyy') AS fecha_ult_mod,"
							       	+ " a.acu_status AS estatus,"									
							       	+ " s.ses_tema AS no_sesion "
									+ " FROM acuerdos_ct a,sesiones_ct s"
									+ " WHERE "
									+ " a.ses_num_contrato = ? "
									+ " AND "
									+ " s.ses_num_contrato=a.ses_num_contrato "
									+ " AND "
									+ " s.ses_fecha=a.ses_fecha "
									+ " AND "
									+ " s.ses_tipo=a.ses_tipo ";
									
	public String strQueryBitacora   ="SELECT TO_CHAR(FBIT_FECHA,'dd/mm/yyyy') AS FECHA,FUSU_NOMBRE_USUARIO AS USUARIO, FBIT_DESCRIPCION AS DESCRIPCION"
					+" FROM F_BITACORA,F_USUARIO"
          +" WHERE F_BITACORA.FUSU_ID_USUARIO=F_USUARIO.FUSU_ID_USUARIO";

  public String sAndFechaU = " and"
								   + " fbit_fecha=to_date(?,'dd/mm/yyyy')";
            
        public String sAndNombreU  = " and"
								      + " fusu_nombre_usuario=?";
				
	      public String sAndFechaA = " and"
								   + " a.ses_fecha=to_date(?,'dd/mm/yyyy')";
		  public String sAndTipoA  = " and"
								      + " a.ses_tipo=?";								   									
				      								     
	      public String sAndIdA = " and"
								      + " upper(a.acu_id) like ";	
	      public String sAndStatusA = " and"
								      + " a.acu_status=?";
								      		
	      public String sAndStatusDif = " and "
								      + " a.acu_status not in (?) ";								      
								      
          public String strAcuerdosOrder 	= " order by a.ses_fecha, a.ses_tipo, a.acu_id asc";							      							      			      								      						      								      
          
          public String strIdAcuerdosOrder 	= " order by a.acu_id asc";							      							      			      								      						      								      
          
          
          public String  queryBitacora  = "INSERT INTO BITACORA ("
										+ " BIT_ANO_TRANSAC,"
										+ " BIT_MES_TRANSAC,"
										+ " BIT_DIA_TRANSAC,"
										+ " BIT_HORA_TRANSAC,"
										+ " BIT_MIN_TRANSAC,"
										+ " BIT_SEG_TRANSAC,"
										+ " BIT_ID_TERMINAL,"
										+ " BIT_NUM_USUARIO,"
										+ " BIT_NOM_PGM,"
										+ " BIT_CVE_FUNCION,"
										+ " BIT_DET_BITACORA,"
										+ " BIT_ANO_ALTA_REG,"
										+ " BIT_MES_ALTA_REG,"
										+ " BIT_DIA_ALTA_REG,"
										+ " BIT_ANO_ULT_MOD,"
										+ " BIT_MES_ULT_MOD,"
										+ " BIT_DIA_ULT_MOD,"
										+ " BIT_CVE_ST_BITACOR)"
										+ "  VALUES ("
										+ "(SELECT FCO_ANO_DIA FROM FECCONT),"
										+ "(SELECT FCO_MES_DIA FROM FECCONT),"
										+ "(SELECT FCO_DIA_DIA FROM FECCONT),"
										+ "TO_NUMBER(TO_CHAR(sysdate,'HH24')),"
										+ "TO_NUMBER(TO_CHAR(sysdate,'MI')),"
										+ "TO_NUMBER(TO_CHAR(sysdate,'SS')),"
										+ "'INTERNET',"
										+ "?," //numUsuario
										+ "'COMITE TECNICO',"
										+ "?,"
										+ "?," //detalle
										+ "(SELECT FCO_ANO_DIA FROM FECCONT),"
										+ "(SELECT FCO_MES_DIA FROM FECCONT),"
										+ "(SELECT FCO_DIA_DIA FROM FECCONT),"
										+ "(SELECT FCO_ANO_DIA FROM FECCONT),"
										+ "(SELECT FCO_MES_DIA FROM FECCONT),"
										+ "(SELECT FCO_DIA_DIA FROM FECCONT),"
										+ "'ACTIVO')";
			          
 

	}

