package mx.com.inscitech.fiducia.common.util;

public class QueryConsultas {

    public String queryCaptura =
        " SELECT per_nom_usuario nomUsuario" + " FROM personal,bitacora" + " WHERE " + " bit_seg_transac=?" + " AND" + " bit_id_terminal='INTERNET'" +
        " AND bit_num_usuario=per_num_usuario" +
        " ORDER BY TO_DATE(BIT_DIA_TRANSAC||'/'||BIT_MES_TRANSAC||'/'||BIT_ANO_TRANSAC||' '||BIT_HORA_TRANSAC||':'||BIT_MIN_TRANSAC,'dd/mm/yyyy hh24:mi') ASC";


    //Detalle de Firmas Mancomunadas
    public String queryfirmas =
        " select " + " FIR_FOLIO as folio," + " FIR_NUM_CONTRATO as fideicomiso," +
        " DECODE(FIR_USUARIO_CAPTURA,0,'CAPTURA',(select PER_NOM_USUARIO from personal where PER_NUM_USUARIO=FIR_USUARIO_CAPTURA)) as captura," +
        " to_char(FIR_FECHA_CAPTURA,'dd/mm/yyyy') as fechaCaptura," +
        " DECODE(FIR_USUARIO_FIRMA1,0,'ESPERA1',(select PER_NOM_USUARIO from personal where PER_NUM_USUARIO=FIR_USUARIO_FIRMA1)) as firma1," +
        " to_char(FIR_FECHA_FIRMA1,'dd/mm/yyyy') as fechaFirma1," +
        " DECODE(FIR_USUARIO_FIRMA2,0,'ESPERA2',(select PER_NOM_USUARIO from personal where PER_NUM_USUARIO=FIR_USUARIO_FIRMA2)) as firma2," +
        " to_char(FIR_FECHA_FIRMA2,'dd/mm/yyyy') as fechaFirma2," + " FIR_ST_FIRMA1 as stFirma1, " + " FIR_ST_FIRMA2 as stFirma2 " + " from " + " FIRMAS " + " where " +
        " FIR_FOLIO=? " + " and " + " FIR_NUM_CONTRATO=? ";


    //Instrucciones Pendientes de Fisos Normales
    public String strQueryInstruccEspera =
        " SELECT " + " INS_NUM_FOLIO_INST AS FOLIO, " + " TO_CHAR(TO_DATE(INS_DIA_ALTA_REG||'/'||INS_MES_ALTA_REG||'/'||INS_ANO_ALTA_REG,'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA," +
        " DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET','DEPOSITO','LIQUIDACION INTERNET','RETIRO'," + " 'TRASPASO INTERNET','TRASPASO') AS INSTRUCCION," +
        " DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET',1,'LIQUIDACION INTERNET',2," + " 'TRASPASO INTERNET',3) AS TIPO," + " DPO_IMP_DEPOSITO AS IMPORTEDPO," +
        " DEL_IMP_LIQUIDAR AS IMPORTEDEL" + " FROM" + " INSTRUCC,DEPOSIT,DETLIQUI" + " WHERE" + " INS_NUM_CONTRATO = ? " + " AND " + " INS_CVE_ST_INSTRUC='ESPERA' " + " AND " +
        " INS_CVE_TIPO_INSTR IN ('RECEPCION INTERNET','LIQUIDACION INTERNET','TRASPASO INTERNET') " + " AND " + " DPO_FOLIO_OPERA(+)=INS_NUM_FOLIO_INST " + " AND " +
        " DEL_FOLIO_OPERA(+)=INS_NUM_FOLIO_INST " + " ORDER BY 4,FOLIO ASC ";


    //Instrucciones de Fisos Normales
    public String strQueryInstrucc =
        " SELECT " + " INS_NUM_FOLIO_INST AS FOLIO, " + " TO_CHAR(TO_DATE(INS_DIA_ALTA_REG||'/'||INS_MES_ALTA_REG||'/'||INS_ANO_ALTA_REG,'dd/mm/yyyy'),'dd/mm/yyyy') as FECHA," +
        " DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET','DEPOSITO','LIQUIDACION INTERNET','RETIRO'," + " 'TRASPASO INTERNET','TRASPASO') AS INSTRUCCION," +
        " DECODE(INS_CVE_TIPO_INSTR,'RECEPCION INTERNET',1,'LIQUIDACION INTERNET',2," + " 'TRASPASO INTERNET',3) AS TIPO," + " DPO_IMP_DEPOSITO AS IMPORTEDPO," +
        " DEL_IMP_LIQUIDAR AS IMPORTEDEL" + " FROM" + " INSTRUCC,DEPOSIT,DETLIQUI" + " WHERE" + " INS_NUM_CONTRATO = ? " + " AND " +
        " INS_CVE_ST_INSTRUC IN ('ACTIVO','ACEPTADA','APLICADA') " + " AND " + " INS_CVE_TIPO_INSTR IN ('RECEPCION INTERNET','LIQUIDACION INTERNET','TRASPASO INTERNET') " +
        " AND " + " DPO_FOLIO_OPERA(+)=INS_NUM_FOLIO_INST " + " AND " + " DEL_FOLIO_OPERA(+)=INS_NUM_FOLIO_INST " + " AND " +
        " TO_DATE(INS_DIA_ALTA_REG||'/'||INS_MES_ALTA_REG||'/'||INS_ANO_ALTA_REG,'dd/mm/yyyy') " + " BETWEEN " + " TO_DATE(?,'dd/mm/yyyy') " + " AND " +
        " TO_DATE(?,'dd/mm/yyyy') ";


    public String strQueryInstruccPKAacuerdo = " AND " + " ses_fecha=TO_DATE('?','dd/mm/yyyy') " + " AND" + " ses_tipo=? " + " AND" + " acu_id=?";


    public String strQueryInstruccOrderBy = " ORDER BY 4,FOLIO ASC ";


    //DETALLE DEPOSITO
    public String queryDetalleDeposito =
        " SELECT " + " LTRIM(TO_CHAR(dpo_dia_alta_reg,'00'))||'/'||LTRIM(TO_CHAR(dpo_mes_alta_reg,'00'))||'/'||LTRIM(TO_CHAR(dpo_ano_alta_reg,'0000')) as fecha, " +
        " DECODE(dpo_rubro,0,'NO','SI') as rutinaria," + " dpo_concepto as concepto," + " dpo_folio_opera as folio," + " dpo_contrato_inter as contrato," +
        " dpo_imp_deposito as importe," + " dpo_num_cuenta As numCuenta, "
        //+ " ctn_cuenta as nomcuenta,"
        + " cve_303.cve_desc_clave as nomcuenta, " + " dpo_cve_tipo_cta as instrumento, " + " dpo_nom_pers_fid as persona "
        //+ " FROM deposit,ctasnafin,claves "
        + " FROM deposit,claves cve_303, claves cve_300 " + " where " + " dpo_folio_opera= ? " + " AND " + " dpo_num_contrato= ? "
        //+ " AND "
        //+ " ctn_num_contrato= dpo_num_contrato "
        + " AND " + " TO_NUMBER(cve_300.CVE_LIMSUP_CLAVE)=DPO_NUM_CUENTA " + " AND " + " TO_NUMBER(cve_303.CVE_PARAM1)= cve_300.cve_num_sec_clave " + " AND " +
        "  cve_300.cve_num_clave = 300 " + " AND " + "  cve_303.cve_num_clave = 303 ";
    //+ " AND ctn_cuenta LIKE '%'||dpo_num_cuenta||'%' ";


    public String queryDetalleRetiro =
        " SELECT " + " LTRIM(TO_CHAR(del_dia_alta_reg,'00'))||'/'||LTRIM(TO_CHAR(del_mes_alta_reg,'00'))||'/'||LTRIM(TO_CHAR(del_ano_alta_reg,'0000')) as fecha, " +
        " del_contrato_inter as contrato," + " del_imp_liquidar as importe," + " DECODE(del_rubro,0,'NO','SI') as rutinaria," + " del_concepto AS concepto," +
        " DECODE(del_cve_tipo_liq,3,'CHEQUE',5,'SPEUA',18,'BANXICO',19,'TBC-BANCOMER',20,'TEF',21,'SWIFT',22,'PV',23,'SPEI',9,'TRASPASO INTERNO','OTRA') as formaLiq," +
        " del_cve_tipo_liq AS claveLiquid," + " del_nom_banco AS banco," + " del_num_cuenta AS numCta," + " del_cta_banxico AS numCtaBanxico," + " del_nom_pers_fid AS beneficiario," //titular
        + " del_nom_plaza AS plaza," + " del_dir_aper_cta AS rfcTEF, " + " to_char(ses_fecha,'dd/mm/yyyy')  As fechaSesion," + " ses_tipo As tipoSesion," + " acu_id As noAcuerdo" +
        " FROM " + " detliqui,instrucc " + " WHERE " + " del_folio_opera= ? " + " AND " + " del_num_contrato= ? " + " AND " + "	ins_num_folio_inst=del_folio_opera " + " AND " +
        " ins_num_contrato=del_num_contrato ";


    public String queryDetalleRetiroSWIFT =
        " SELECT " + " DECODE(l.del_num_pers_fid,0,'0',(select PAI_NOM_PAIS from paises where PAI_NUM_PAIS=l.del_num_pais)) AS paisDSWIFT," +
        " l.del_nom_area	AS ciudadDSWIFT," + " l.del_nom_banco	AS bancoDSWIFT," + " s.SWI_NOM_PLAZA  AS plazaDSWIFT," + " l.del_num_sucursal AS sucursalDSWIFT," +
        " l.del_num_cuenta	AS ctaDSWIFT," + " s.SWI_BRANCH   AS codigoBranch,"
        //+ " DECODE(l.del_num_moneda,0,'MONEDA NACIONAL',(select MON_NOM_MONEDA from MONEDAS where MON_NUM_PAIS=l.del_num_moneda))	AS monedaSWIFT,"
        + " l.del_dir_aper_cta AS monedaSWIFT," + " l.del_imp_liquidar  AS importe," + " l.del_codigo_trans AS codigoSWIFT," + " l.del_nom_pers_fid AS nombreBSWIFT," +
        " DECODE(l.del_num_pais,0,'0',(select PAI_NOM_PAIS from paises where PAI_NUM_PAIS=l.del_num_pais)) AS paisBSWIFT," + " l.del_nom_plaza	AS ciudadBSWIFT," +
        " s.SWI_DOMICILIO  AS domicilioBswift," + " l.del_cve_tipo_cta AS telBSWIFT," + " to_char(ses_fecha,'dd/mm/yyyy') As fechaSesion," + " ses_tipo As tipoSesion," +
        " acu_id As noAcuerdo" + " from detliqui l,detswift  s,instrucc i" + " where" + " l.del_cve_tipo_liq=21 " + " and" + " l.del_folio_opera=? " + " and" +
        " l.del_num_contrato=? " + " and" + " s.del_folio_opera=l.del_folio_opera" + " AND " + "	i.ins_num_folio_inst=l.del_folio_opera " + " AND " +
        " i.ins_num_contrato=l.del_num_contrato ";


    //DETALLE TRASPASO
    public String queryDetalleTraspaso =
        " SELECT " + " LTRIM(TO_CHAR(dpo_dia_alta_reg,'00'))||'/'||LTRIM(TO_CHAR(dpo_mes_alta_reg,'00'))||'/'||LTRIM(TO_CHAR(dpo_ano_alta_reg,'0000')) as fecha, " +
        " del_contrato_inter as ctoOrigen," + " dpo_contrato_inter as ctoDestino," + " dpo_imp_deposito as importe," + " dpo_cve_tipo_cta as instrumento " +
        " FROM deposit,detliqui " + " where " + " dpo_folio_opera= ? " + " AND " + " dpo_num_contrato= ? " + " AND " + " del_folio_opera= dpo_folio_opera " + " AND " +
        " del_num_contrato= dpo_num_contrato ";


    //CONSULTA DE SALDOS POR CONTRATOS DE INVERSION	
    public String querySaldosPorContrato =
        " SELECT DISTINCT cpr_contrato_inter as num_contrato," + " ((SELECT NVL(SUM(pos_costo_historic), 0)" + "    FROM posicion" +
        "   WHERE pos_num_contrato = cpr_num_contrato AND " + "         pos_contrato_inter = cpr_contrato_inter) + " + " (SELECT NVL(SUM(cre_imp_reporto), 0)" +
        "    FROM conrepor" + "   WHERE cre_num_contrato = cpr_num_contrato AND" + "         cre_contrato_inter = cpr_contrato_inter AND" +
        "         cre_cve_st_conrepo = 'ACTIVO'                  )) as saldo," + " cpr_num_pais as clave_moneda," + " mon_sigla as sigla_moneda " + " FROM continte, monedas " +
        " WHERE cpr_num_contrato = ? AND cpr_contrato_inter <> 1000 AND " + " cpr_cve_st_contint = 'ACTIVO' AND mon_num_pais = cpr_num_pais " +
        " ORDER BY NVL(cpr_num_pais, 0), cpr_contrato_inter ASC ";


    //CONSULTA DE CUENTAS PENDIENTES
    public String queryCuentasPendientes =
        " SELECT PFD_FOLIO  as clave," + "CDP_CVE_BANCO,CDP_NUM_CUENTA,CDP_PLAZA,CDP_SUCURSAL," + "CDP_TITULAR,CDP_RFC,TO_CHAR(PFD_FECHA_ALTA,'DD/MM/YYYY') AS FECHA" +
        " FROM PERFIRDI,CUENDEP WHERE " + " PFD_ST='CAPTURADA' AND" + " PFD_NUM_CONTRATO=?  AND" + " CDP_CVE_CUENDEP=PFD_CVE_CUENDEP" + " ORDER BY PFD_FOLIO,CDP_NUM_CUENTA ASC";


    public String queryCuentasPendientesporClave =
        " SELECT DISTINCT PFD_FOLIO as clave," + "CDP_CVE_BANCO," + "CDP_NUM_CUENTA," + "CDP_PLAZA," + "CDP_SUCURSAL," + "CDP_TITULAR," + "CDP_RFC," +
        "TO_CHAR(PFD_FECHA_ALTA,'DD/MM/YYYY') AS FECHA," + "to_char(nvl(CDP_CVE_CUENDEP,0)) as CDP_CVE_CUENDEP" + " FROM PERFIRDI,CUENDEP WHERE " + " PFD_ST='CAPTURADA' AND" +
        " PFD_FOLIO=? AND" + " PFD_NUM_CONTRATO=?  AND" + " CDP_CVE_CUENDEP=PFD_CVE_CUENDEP" + " ORDER BY PFD_FOLIO,CDP_NUM_CUENTA ASC";

    public String queryDetalleCuenta =
        " SELECT DISTINCT CDP_CVE_CUENDEP as clave," + "CDP_CVE_BANCO," + "CDP_NUM_CUENTA," + "CDP_PLAZA," + "CDP_SUCURSAL," + "CDP_TITULAR," + "CDP_RFC" + " FROM CUENDEP WHERE " +
        " CDP_CVE_CUENDEP=? " + " ORDER BY CDP_CVE_CUENDEP,CDP_NUM_CUENTA ASC";

    public String queryDescripcionBanco =
        " SELECT CVE_DESC_CLAVE " + " FROM CLAVES " + " WHERE CVE_NUM_CLAVE = 27 " + " AND CVE_NUM_SEC_CLAVE NOT IN( 169, 170 ) " + " AND CVE_NUM_SEC_CLAVE=?";

    public String querynumusuario = " SELECT USU_NUM_USUARIO " + " FROM USUARIOS " + " WHERE TIPO_USUARIO='INTERNET' " + " AND USU_NUM_USUARIO=? ";

    public String queryCapturaCuentas = " SELECT per_nom_usuario nomUsuario" + " FROM personal,perfirdi" + " WHERE " + " PFD_FOLIO=?" + " AND PFD_USU_SOLICIT=per_num_usuario";

    public String queryNombreFideicomiso = " SELECT CTO_NOM_CONTRATO as ctoNomContrato " + " FROM CONTRATO " + " WHERE CTO_NUM_CONTRATO = ? ";

    public String queryCorreoRechazoCuentas =
        " SELECT ATE_NUM_CONTRATO, " + "USU_NUM_USUARIO, " + "PER_NIVEL_ESTUDIOS, " + "PER_NOM_USUARIO, " + "CDP_NUM_CUENTA, " + "CDP_CVE_CUENDEP, " + "PFD_FOLIO as FOLIO " +
        "FROM USUARIOS " + "PERSONAL " + "ATENCION " + "CUENDEP " + "PERFIRDI " + "WHERE PERSONAL.PER_NUM_USUARIO = USUARIOS.USU_NUM_USUARIO " +
        "AND TO_NUMBER(NVL(PERFIRDI.PFD_USU_SOLICIT,'0'))   = USUARIOS.USU_NUM_USUARIO " + "AND ATENCION.ATE_NUM_CONTRATO  = PERFIRDI.PFD_NUM_CONTRATO " +
        "AND CUENDEP.CDP_CVE_CUENDEP    = PERFIRDI.PFD_CVE_CUENDEP " + "AND ATENCION.ATE_EJEC_ATENCION = USUARIOS.USU_NUM_USUARIO " +
        "AND USUARIOS.USU_TIPO_USUARIO  = 'INTERNET' " + "AND PERFIRDI.PFD_FOLIO = ? " + "AND PERFIRDI.PFD_NUM_CONTRATO =  ? " + "AND PERFIRDI.PFD_ST = 'RECHAZADA' ";

    public String queryAgenda = " SELECT DISTINCT PER_NIVEL_ESTUDIOS FROM PERSONAL " + "WHERE PER_NUM_USUARIO = ? ";


    public String queryResumenEstadoCuenta = "SELECT F.*,E.* FROM FID_RES_CTAS_IND_EC F,ENCABEZADO_ESTCUE E WHERE F.SAL_CONTRATO=E.CONTRATO" + 
    "        AND F.ANIOS_LABORADOS=E.USUARIO AND F.SAL_CONTRATO=?";
    public String queryResumenEstadoCuenta2 = "SELECT TO_CHAR(DAT_FEC_ULT_MOD,'DD/MM/YYYY') DAT_FEC_ULT_MOD, TO_CHAR(DAT_FEC_ALTA,'DD/MM/YYYY') DAT_FEC_ALTA,DAT_DESCRIPCION DIRECCION,TO_CHAR(DAT_FEC_BAJA,'DD/MM/YYYY') DAT_FEC_BAJA FROM fid_datos_est_ctas WHERE dat_clave=? AND DAT_CONTRATO=? AND DAT_NIVEL=2";
}
