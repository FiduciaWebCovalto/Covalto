package mx.com.inscitech.clients.util;

/**
 * Autor:  inscitech México
 * mail: eminguer@inscitechmexico.com
 * Fecha: 29/06/2009
 **/
 
public class queryConsultasMDC {

public String strQueryInstruccEsperaConNoMonetarios = "SELECT /*+ use_nl(INSTRUCC,DEPOSIT,DETLIQUI)*/ "+
       "I.INS_NUM_FOLIO_INST AS FOLIO, "+
       "TO_CHAR(TO_DATE(I.INS_DIA_ALTA_REG || '/' || I.INS_MES_ALTA_REG || '/' || "+
                       "I.INS_ANO_ALTA_REG, "+
                       "'dd/mm/yyyy'), "+
               "'dd/mm/yyyy') as FECHA, "+
       "DECODE(I.INS_CVE_TIPO_INSTR, "+
              "'RECEPCION INTERNET', "+
              "'DEPOSITO', "+
              "'LIQUIDACION INTERNET', "+
              "'RETIRO', "+
              "'TRASPASO INTERNET', "+
              "'TRASPASO', "+
              "'HONORARIOS INTERNET', "+
              "'PAGO DE HONORARIOS') AS INSTRUCCION, "+
       "DECODE(I.INS_CVE_TIPO_INSTR, "+
              "'RECEPCION INTERNET', "+
              "1, "+
              "'LIQUIDACION INTERNET', "+
              "2, "+
              "'TRASPASO INTERNET', "+
              "3, "+
              "'HONORARIOS INTERNET', "+
              "4) AS TIPO, "+
      "DECODE(INS_CVE_TIPO_INSTR, "+
              "+ 'HONORARIOS INTERNET', "+
              "NVL((select hon_importe_total "+
                    "from det_honorarios "+
                   "where hon_num_contrato = I.INS_NUM_CONTRATO "+
                     "and hon_folio_instrucc = I.INS_NUM_FOLIO_INST), "+
                  "0), "+
              "+DPO_IMP_DEPOSITO) AS IMPORTEDPO, "+
       "DEL_IMP_LIQUIDAR AS IMPORTEDEL "+
        "FROM INSTRUCC I, DEPOSIT, DETLIQUI, F_BITACORA_SOL B "+
       "WHERE I.INS_NUM_FOLIO_INST=B.INS_MUM_FOLIO_INST AND ((B.FBIS_NUM_ETAPA= 5 AND I. INS_CVE_TIPO_INSTR='RECEPCION INTERNET') OR " +
       " (B.FBIS_NUM_ETAPA= 4 AND I. INS_CVE_TIPO_INSTR<>'RECEPCION INTERNET')) AND I.INS_NUM_CONTRATO = ? "+
         "AND I.INS_CVE_ST_INSTRUC IN ('ACTIVO','APROBADA','VALIDADA', 'ACEPTADA') "+
         "AND I. INS_CVE_TIPO_INSTR IN ('RECEPCION INTERNET', 'LIQUIDACION INTERNET', "+
              "'TRASPASO INTERNET', 'HONORARIOS INTERNET') "+
         "AND DPO_FOLIO_OPERA(+) = I.INS_NUM_FOLIO_INST "+
         "AND DEL_FOLIO_OPERA(+) = I.INS_NUM_FOLIO_INST " +
                "ORDER BY 4, FOLIO ASC ";
   

public String strQueryGetDescrInstNoMonet = "SELECT K.INS_TXT_COMENTARIO TXT_COMENTARIO, "+
        "TO_CHAR(TO_DATE(k.INS_DIA_ALTA_REG || '/' || k.INS_MES_ALTA_REG || '/' || "+
                        "k.INS_ANO_ALTA_REG, "+
                        "'dd/mm/yyyy'), "+
                "'dd/mm/yyyy') as FECHA "+
       "FROM INSTRUCC K "+
      "WHERE K.INS_NUM_FOLIO_INST = ?"+
      "AND  K.INS_NUM_CONTRATO = ?";

public String strQueryEtapaSol = "SELECT DISTINCT TO_CHAR(E.FETA_SEC_ETAPA) AS ETAPA " +
  " FROM F_ETAPA E, F_USUARIO_PERFILES U,F_PERFIL P "+
  " WHERE U.FUSU_NUM_USUARIO = ? AND "+
  " U.FPER_ID_PERFIL=P.FPER_ID_PERFIL AND " +
  " P.FPER_INTERNO=1 AND E.FPER_ID_PERFIL=U.FPER_ID_PERFIL";
  
public String strQueryDocxEtapa = "SELECT DISTINCT D.FDOC_NOMBRE AS DOCUMENTO FROM F_DOCUMENTO D,f_cat_doc_x_etapa E,F_ETAPA T "+
"WHERE D.FDOC_ID_DOCUMENTO=E.FDOC_ID_DOCUMENTO AND E.FETA_ID_ETAPA=0 AND "+
"E.FETA_ID_ETAPA=T.FETA_ID_ETAPA AND FETA_TIPO_SOL='N' AND E.FTOP_NUM_OPER=?";
	}

