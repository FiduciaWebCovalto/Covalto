package mx.com.inscitech.fiducia.business;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.fiducia.common.util.DatosBD;
import mx.com.inscitech.fiducia.common.util.Reporte;

import java.sql.ResultSet;

public class nReporte extends nDatos {
    private static final Logger LOGGER = LoggerFactory.getLogger(nReporte.class);


    ResultSet rsDatos;

    public void querySelect(int opc, String tabla) {
        Reporte reportes = new Reporte();
        DatosBD db = new DatosBD();
        try {
            switch (opc) {
                //BALANCE GENERAL  Y BALANCE GENERAL REEXPRESADO
            case 1:
            case 5:

                db.setDataBO(getVtrIntDato1()); //CTO_NUM_CONTRATO			
                db.setDataBO(getVtrIntDato2()); //SAL_MES_MOVTO
                db.setDataBO(getVtrIntDato3()); //SAL_ANO_MOVTO	    			
                rsDatos = reportes.getResultSet(opc, db, tabla);
                break;
                //ESTADO DE RESULTADOS Y ESTADO DE RESULTADOS REEXPRESADO
            case 2:
            case 6:

                db.setDataBO(getVtrIntDato1()); //CTO_NUM_CONTRATO			
                db.setDataBO(getVtrIntDato2()); //SAL_MES_MOVTO
                db.setDataBO(getVtrIntDato3()); //SAL_ANO_MOVTO	    			
                rsDatos = reportes.getResultSet(opc, db, tabla);
                break;
            case 3: //ESTADO DE RESULTADO POR MES

                db.setDataBO(getVtrIntDato1()); //CTO_NUM_CONTRATO			
                db.setDataBO(getVtrIntDato2()); //SAL_MES_MOVTO
                db.setDataBO(getVtrIntDato3()); //SAL_ANO_MOVTO	    			
                rsDatos = reportes.getResultSet(opc, db, tabla);
                break;


                //TIPO DE ADMINISTRACION

            case 10:
                db.setDataBO(getVtrIntDato1()); //CTO_NUM_CONTRATO(NUMERO DE FISO)				    			
                rsDatos = reportes.getResultSet(opc, db, tabla);
                break;


                // AVISOS
            case 11:
                rsDatos = reportes.getResultSet(opc, db, tabla);
                break;

            default:
                break;
            }
        } catch (Exception e) {
            LOGGER.debug(this.getClass() + "->" + e + "<->opcion:" + opc);
        }
        removerValores();
        intContador = 0;
        try {
            blnDatos = false;
            while (rsDatos.next()) {
                blnDatos = true;
                switch (opc) {

                    //BALANCE GENERAL  Y BALANCE GENERAL REEXPRESADO
                case 1:
                case 5:

                    setVtrIntDato1(rsDatos.getInt("numContrato"));
                    setVtrStrDato2(rsDatos.getString("nomContrato"));
                    setVtrStrDato3(rsDatos.getString("periodo"));
                    setVtrIntDato4(rsDatos.getInt("ctam"));
                    setVtrIntDato5(rsDatos.getInt("scta"));
                    setVtrIntDato6(rsDatos.getInt("sscta"));
                    setVtrIntDato7(rsDatos.getInt("ssscta"));
                    setVtrIntDato8(rsDatos.getInt("sssscta"));
                    setVtrIntDato9(rsDatos.getInt("ssssscta"));
                    setVtrIntDato10(rsDatos.getInt("aux1"));
                    setVtrDoubleDato11(rsDatos.getDouble("aux2"));
                    setVtrDoubleDato12(rsDatos.getDouble("aux3"));
                    setVtrDoubleDato13(rsDatos.getDouble("saldoAct"));
                    intContador++;
                    break;

                    // ESTADO DE RESULTADOS  Y ESTADO DE RESULTADOS  REEXPRESADO (6)
                case 2:
                case 3:
                case 6:
                    setVtrIntDato1(rsDatos.getInt("numContrato"));
                    setVtrStrDato2(rsDatos.getString("nomContrato"));
                    setVtrStrDato3(rsDatos.getString("fechaAper"));
                    setVtrStrDato4(rsDatos.getString("fechaAl"));
                    setVtrIntDato5(rsDatos.getInt("ctam"));
                    setVtrIntDato6(rsDatos.getInt("scta"));
                    setVtrIntDato7(rsDatos.getInt("sscta"));
                    setVtrIntDato8(rsDatos.getInt("ssscta"));
                    setVtrIntDato9(rsDatos.getInt("sssscta"));
                    setVtrIntDato10(rsDatos.getInt("ssssscta"));
                    setVtrIntDato11(rsDatos.getInt("aux1"));
                    setVtrDoubleDato12(rsDatos.getDouble("aux2"));
                    setVtrDoubleDato13(rsDatos.getDouble("aux3"));
                    setVtrDoubleDato14(rsDatos.getDouble("saldoAct"));
                    intContador++;
                    break;


                    //TIPO DE ADMINISTRACION

                case 10:
                    setVtrStrDato1(rsDatos.getString("contrato")); //CTO_TIPO_ADMON
                    intContador++;
                    break;

                    //PUBLICACION DE AVISOS	
                case 11:
                    setVtrStrDato1(rsDatos.getString("aviso")); //CTO_TIPO_ADMON
                    intContador++;
                    break;

                default:
                    break;
                }
            }
        } catch (Exception e) {
            blnDatos = false;
            LOGGER.debug(this.getClass() + "->" + e + "<->opcion:" + opc);
        }
        reportes.dbConnClose();
    }
}
