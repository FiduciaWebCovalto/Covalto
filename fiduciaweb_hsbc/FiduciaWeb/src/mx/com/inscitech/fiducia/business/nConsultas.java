//nConsultas.java
package mx.com.inscitech.fiducia.business;

import mx.com.inscitech.fiducia.common.util.DatosBD;
import mx.com.inscitech.fiducia.common.util.Consultas;

import java.sql.ResultSet;

public class nConsultas extends nDatos {

    ResultSet rsDatos;

    public void querySelect(int opc) {
        Consultas consulta = new Consultas();
        DatosBD db = new DatosBD();
        try {
            switch (opc) {

            case 1: //captura
                db.setDataBO(getVtrIntDato1()); //BIT_SEG_TRANSAC(Folio de la instruccion)			
                rsDatos = consulta.getResultSet(opc, db);
                break;

            case 2: //firmas mancomunadas
                db.setDataBO(getVtrIntDato1()); //FIR_FOLIO
                db.setDataBO(getVtrIntDato2()); //FIR_NUM_CONTRATO
                rsDatos = consulta.getResultSet(opc, db);
                break;

                //INSTRUCCIONES
            case 11: //Pendientes 	
                db.setDataBO(getVtrIntDato1()); //CTO_NUM_CONTRATO			
                rsDatos = consulta.getResultSet(opc, db);

                break;

            case 12: //activas o aceptadas
                db.setDataBO(getVtrIntDato1()); //CTO_NUM_CONTRATO			
                db.setDataBO(getVtrStrDato2()); //FECHA INICIAL		
                db.setDataBO(getVtrStrDato3()); //FECHA FINAL
                rsDatos = consulta.getResultSet(opc, db);

                break;

                //Detalle de instrucciones
            case 21: //detalle Deposito 	
            case 22: //detalle Retiro
            case 32: //detalle SWIFT
            case 23: //detalle Traspaso
                db.setDataBO(getVtrIntDato1()); //dpo_folio_opera			
                db.setDataBO(getVtrIntDato2()); //dpo_num_contrato			
                rsDatos = consulta.getResultSet(opc, db);

                break;

                //CONSULTA DE SALDOS POR CONTRATO DE INVERSION    	
            case 30: // CONSULTA DE SALDOS POR CONTRATO DE INVERSION
                db.setDataBO(getVtrIntDato1()); //NUM_CONTRATO
                rsDatos = consulta.getResultSet(opc, db);
                break;


            case 40: // CONSULTA DE CUENTAS PENDIENTES POR FIDEICOMISO
            case 44:
            case 45:
            case 42: //CONSULTA DE DESCRIPCION DE BANCOS
                db.setDataBO(getVtrIntDato1()); //CDP_CVE_CUENDEP
                rsDatos = consulta.getResultSet(opc, db);
                break;
            case 41: // CONSULTA DE CUENTAS PENDIENTES POR CLAVE
            case 47: //consulta de correo de rechazo de cuentas
                db.setDataBO(getVtrIntDato1()); //PFD_FOLIO
                db.setDataBO(getVtrIntDato2()); //PFD_NUM_CONTRATO
                rsDatos = consulta.getResultSet(opc, db);
                break;
            case 43: //CONSULTA DE NUMERO DE USUARIO
                db.setDataBO(getVtrStrDato1()); //CDP_CVE_CUENDEP
                rsDatos = consulta.getResultSet(opc, db);
                break;

            case 46: //CONSULTA DE NOMBRE DE FIDEICOMISO O CONTRATO
                db.setDataBO(getVtrIntDato1()); //CTO_NOM_CONTRATO
                rsDatos = consulta.getResultSet(opc, db);
                break;

                // CASES PROTEGO

            case 99: //CORREO USUARIO IN
                db.setDataBO(getVtrIntDato1()); //CORREO
                rsDatos = consulta.getResultSet(opc, db);
                break;
            case 117://Resumen Estado de Cuenta
                db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
                System.out.println("Dato Fideicomiso:"+getVtrIntDato1());
                rsDatos = consulta.getResultSet(opc, db);
                break;
            case 118://Resumen Estado de Cuenta
                db.setDataBO( getVtrIntDato1()); //Seq Edo Cuenta
                db.setDataBO( getVtrIntDato2()); //Seq Edo Cuenta
                    rsDatos = consulta.getResultSet(opc, db);
                break;  
            default:
                break;
            }
        } catch (Exception e) {
            System.out.println(this.getClass() + "->" + e + "<->opcion:" + opc);
        }
        removerValores();
        intContador = 0;
        try {
            blnDatos = false;
            while (rsDatos.next()) {
                blnDatos = true;

                switch (opc) {

                case 1:

                    setVtrStrDato1(rsDatos.getString("nomUsuario"));
                    intContador++;
                    break;

                case 2:

                    setVtrStrDato1(rsDatos.getString("captura"));
                    setVtrStrDato2(rsDatos.getString("fechaCaptura"));
                    setVtrStrDato3(rsDatos.getString("firma1"));
                    setVtrStrDato4(rsDatos.getString("fechaFirma1"));
                    setVtrStrDato5(rsDatos.getString("stFirma1"));
                    setVtrStrDato6(rsDatos.getString("firma2"));
                    setVtrStrDato7(rsDatos.getString("fechaFirma2"));
                    setVtrStrDato8(rsDatos.getString("stFirma2"));


                    intContador++;
                    break;

                    //instrucciones(RETIRO,DEPOSITO Y TRASPASO)
                case 11: //pendientes
                case 12: //activas o aceptadas

                    setVtrIntDato1(rsDatos.getInt("FOLIO"));
                    setVtrStrDato2(rsDatos.getString("FECHA"));
                    setVtrStrDato3(rsDatos.getString("INSTRUCCION"));
                    setVtrIntDato4(rsDatos.getInt("TIPO"));
                    setVtrDoubleDato5(rsDatos.getDouble("IMPORTEDPO"));
                    setVtrDoubleDato6(rsDatos.getDouble("IMPORTEDEL"));
                    intContador++;
                    break;

                case 21: //Detalle Deposito


                    setVtrStrDato2(rsDatos.getString("fecha"));
                    setVtrStrDato4(rsDatos.getString("nomcuenta"));
                    setVtrDoubleDato5(rsDatos.getDouble("importe"));
                    setVtrStrDato7(rsDatos.getString("concepto"));
                    setVtrIntDato8(rsDatos.getInt("contrato"));
                    setVtrStrDato9(rsDatos.getString("instrumento"));
                    setVtrStrDato10(rsDatos.getString("persona"));
                    intContador++;
                    break;


                case 22: //Detalle Retiro

                    setVtrStrDato1(rsDatos.getString("fecha"));
                    setVtrIntDato2(rsDatos.getInt("contrato"));
                    setVtrDoubleDato3(rsDatos.getDouble("importe"));
                    setVtrStrDato4(rsDatos.getString("concepto"));
                    setVtrIntDato5(rsDatos.getInt("claveLiquid"));
                    setVtrStrDato6(rsDatos.getString("formaLiq"));
                    setVtrStrDato7(rsDatos.getString("banco"));
                    setVtrStrDato8(rsDatos.getString("numCta"));
                    setVtrStrDato9(rsDatos.getString("numCtaBanxico"));
                    setVtrStrDato10(rsDatos.getString("beneficiario"));
                    setVtrStrDato11(rsDatos.getString("plaza"));
                    setVtrStrDato12(rsDatos.getString("rfcTEF"));
                    setVtrStrDato13(rsDatos.getString("fechaSesion"));
                    setVtrStrDato14(rsDatos.getString("tipoSesion"));
                    setVtrStrDato15(rsDatos.getString("noAcuerdo"));

                    intContador++;
                    break;

                case 32: //Detalle Retiro SWIFT

                    setVtrStrDato1(rsDatos.getString("paisDSWIFT"));
                    setVtrStrDato2(rsDatos.getString("ciudadDSWIFT"));
                    setVtrStrDato3(rsDatos.getString("bancoDSWIFT"));
                    setVtrStrDato4(rsDatos.getString("plazaDSWIFT"));
                    setVtrStrDato5(rsDatos.getString("sucursalDSWIFT"));
                    setVtrStrDato6(rsDatos.getString("ctaDSWIFT"));
                    setVtrStrDato7(rsDatos.getString("codigoBranch"));
                    setVtrStrDato8(rsDatos.getString("monedaSWIFT"));
                    setVtrDoubleDato9(rsDatos.getDouble("importe"));
                    setVtrStrDato10(rsDatos.getString("codigoSWIFT"));
                    setVtrStrDato11(rsDatos.getString("nombreBSWIFT"));
                    setVtrStrDato12(rsDatos.getString("paisBSWIFT"));
                    setVtrStrDato13(rsDatos.getString("ciudadBSWIFT"));
                    setVtrStrDato14(rsDatos.getString("domicilioBswift"));
                    setVtrStrDato15(rsDatos.getString("telBSWIFT"));
                    setVtrStrDato16(rsDatos.getString("fechaSesion"));
                    setVtrStrDato17(rsDatos.getString("tipoSesion"));
                    setVtrStrDato18(rsDatos.getString("noAcuerdo"));
                    intContador++;
                    break;


                case 23: //Detalle Traspaso


                    setVtrStrDato1(rsDatos.getString("fecha"));
                    setVtrIntDato2(rsDatos.getInt("ctoOrigen"));
                    setVtrIntDato3(rsDatos.getInt("ctoDestino"));
                    setVtrDoubleDato4(rsDatos.getDouble("importe"));
                    setVtrStrDato5(rsDatos.getString("instrumento"));


                    intContador++;
                    break;

                case 30: //Detalle Traspaso


                    setVtrDoubleDato1(rsDatos.getDouble("num_contrato"));
                    setVtrDoubleDato2(rsDatos.getDouble("saldo"));
                    setVtrIntDato3(rsDatos.getInt("clave_moneda"));
                    setVtrStrDato4(rsDatos.getString("sigla_moneda"));


                    intContador++;
                    break;

                case 40: //Detalle Cuentas

                    setVtrIntDato1(rsDatos.getInt("clave"));
                    ;
                    setVtrIntDato2(rsDatos.getInt("CDP_CVE_BANCO"));
                    setVtrStrDato1(rsDatos.getString("CDP_NUM_CUENTA"));
                    setVtrStrDato2(rsDatos.getString("CDP_PLAZA"));
                    setVtrStrDato3(rsDatos.getString("CDP_SUCURSAL"));
                    setVtrStrDato4(rsDatos.getString("CDP_TITULAR"));
                    setVtrStrDato5(rsDatos.getString("CDP_RFC"));
                    setVtrStrDato6(rsDatos.getString("FECHA"));

                    intContador++;
                    break;

                case 41: //recupera informacion de cuenta por folio y fiso
                    setVtrIntDato1(rsDatos.getInt("clave"));
                    ;
                    setVtrIntDato2(rsDatos.getInt("CDP_CVE_BANCO"));
                    setVtrStrDato1(rsDatos.getString("CDP_NUM_CUENTA"));
                    setVtrStrDato2(rsDatos.getString("CDP_PLAZA"));
                    setVtrStrDato3(rsDatos.getString("CDP_SUCURSAL"));
                    setVtrStrDato4(rsDatos.getString("CDP_TITULAR"));
                    setVtrStrDato5(rsDatos.getString("CDP_RFC"));
                    setVtrStrDato6(rsDatos.getString("FECHA"));
                    setVtrStrDato7(rsDatos.getString("CDP_CVE_CUENDEP"));
                    intContador++;
                    break;


                case 42: //CONSULTA DE DESCRIPCION DE BANCOS
                    setVtrStrDato1(rsDatos.getString("CVE_DESC_CLAVE"));
                    intContador++;
                    break;

                case 43: //CONSULTA DE NUMERO DE USUARIO
                    setVtrIntDato1(rsDatos.getInt("USU_NUM_USUARIO"));
                    intContador++;
                    break;

                case 44: //detalle cuenta

                    setVtrIntDato1(rsDatos.getInt("clave"));
                    setVtrIntDato2(rsDatos.getInt("CDP_CVE_BANCO"));
                    setVtrStrDato1(rsDatos.getString("CDP_NUM_CUENTA"));
                    setVtrStrDato2(rsDatos.getString("CDP_PLAZA"));
                    setVtrStrDato3(rsDatos.getString("CDP_SUCURSAL"));
                    setVtrStrDato4(rsDatos.getString("CDP_TITULAR"));
                    setVtrStrDato5(rsDatos.getString("CDP_RFC"));

                    intContador++;
                    break;

                case 45: //CONSULTA DE nombre de usuario que capturo cuenta
                    setVtrStrDato1(rsDatos.getString("nomUsuario"));
                    intContador++;
                    break;

                case 46: //CONSULTA DE NOMBRE DE FIDEICOMISO O CONTRATO
                    setVtrStrDato1(rsDatos.getString("ctoNomContrato"));
                    intContador++;
                    break;

                case 47: //detalle cuenta para mail de rechazo

                    setVtrIntDato1(rsDatos.getInt("ATE_NUM_CONTRATO"));
                    setVtrIntDato2(rsDatos.getInt("USU_NUM_USUARIO"));
                    setVtrStrDato1(rsDatos.getString("PER_NIVEL_ESTUDIOS")); //direccion de correo para enviar el mail
                    setVtrStrDato2(rsDatos.getString("PER_NOM_USUARIO"));
                    setVtrStrDato3(rsDatos.getString("CDP_NUM_CUENTA"));
                    setVtrIntDato3(rsDatos.getInt("CDP_CVE_CUENDEP"));
                    setVtrIntDato4(rsDatos.getInt("FOLIO"));

                    intContador++;
                    break;
                    // Cases PROTEGO
                case 99: //CORREO USUARIO2

                    setVtrStrDato1(rsDatos.getString("PER_NIVEL_ESTUDIOS")); //direccion de correo para enviar el mail

                    intContador++;
                    break;
                    case 117: //Resumen Estado de Cuenta
                        setVtrStrDato1(rsDatos.getString("ID"));
                        setVtrStrDato2(rsDatos.getString("SAL_CLAVE_INV"));
                        setVtrDoubleDato1(rsDatos.getDouble("SAL_TRABAJADOR"));
                        setVtrDoubleDato2(rsDatos.getDouble("SAL_AYUNTAMIENTO"));
                        setVtrDoubleDato3(rsDatos.getDouble("SAL_TOTAL"));
                        setVtrStrDato3(rsDatos.getString("NPORCENTAJE"));
                        setVtrDoubleDato4(rsDatos.getDouble("ANIOS_LABORADOS"));
                        
                         setVtrStrDato4(rsDatos.getString("VALOR1"));
                         setVtrStrDato5(rsDatos.getString("VALOR2"));
                         setVtrStrDato6(rsDatos.getString("VALOR3"));
                         setVtrStrDato7(rsDatos.getString("VALOR4"));
                         setVtrStrDato8(rsDatos.getString("VALOR5"));
                         setVtrStrDato9(rsDatos.getString("VALOR6"));
                            setVtrStrDato10(rsDatos.getString("VALOR7"));
                            setVtrStrDato11(rsDatos.getString("VALOR8"));                    
                        intContador++;
                    break;

                     case 118: //Resumen Estado de Cuenta
                         setVtrStrDato1(rsDatos.getString("DAT_FEC_ULT_MOD"));
                         System.out.print("Fecha Ingreso "+rsDatos.getString("DAT_FEC_ULT_MOD"));
                         setVtrStrDato2(rsDatos.getString("DAT_FEC_ALTA"));
                         setVtrStrDato3(rsDatos.getString("DIRECCION"));
                         setVtrStrDato4(rsDatos.getString("DAT_FEC_BAJA"));
                     
                         intContador++;
                     break;              

                default:
                    break;
                }
            }

        } catch (Exception e) {
            blnDatos = false;
            System.out.println(this.getClass() + "->" + e + "<-> opcionG :" + opc);
        }
        consulta.dbConnClose();
    }
}
