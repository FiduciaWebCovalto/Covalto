package mx.com.inscitech.clients.negocio;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.clients.util.*;
import mx.com.inscitech.clients.lib.MasterServices;
public class nServicios extends nDatos{
    private static final Logger LOGGER = LoggerFactory.getLogger(nServicios.class);

    public void querySelect( int opc) 
    {
        String[] resultado={null},sArreglo={null};
        MasterServices serv = new MasterServices();
         //removerValores();
         intContador=0;
        try {
            switch (opc)
            {

                case 4:
                        //DOCUMENTOS POR OPERACION
                        resultado=serv.consumo(43,getVtrStrDato1()); 
                        for (String item : resultado) {
                            blnDatos= true;
                            LOGGER.debug("Documentos devueltos: "+item);
                            setVtrStrDato2 ( item);
                            intContador++;
                        } 
                    break;
                case 11:
                        //PUBLICACION DE AVISOS    
                        resultado=serv.consumo(4,"2");          
                        setVtrStrDato1 ( resultado[0]);
                        intContador++;
                    break;            
                case 49:
                        //MONEDA POR DESCRIPCION/NOMBRE 
                        LOGGER.debug("Monedas por Nombre nservicios: "+getVtrStrDato1());
                        resultado=serv.consumo(18,getVtrStrDato1()); 
                        LOGGER.debug("Salids Monedas por Nombre nservicios: "+resultado[0]);
                        setVtrIntDato1 ( Integer.valueOf(resultado[0]).intValue());
                        intContador++;
                    break;               
                case 202:
                        //PARAMETRIZACION NO MONETARIAS
                        //se recuperan los parametros operacion y nombre
                        //getVtrStrDato1 () operacion
                        //getVtrStrDato2 () nombre
                        /*
                          item.id.conpIdConcepto+"-"+item.conpBase+"-"+
                                        item.conpComentario+"-"+item.conpEstatus+"-"+item.conpNombre+"-"+
                                        item.conpObligatorio+"-"+item.conpPadre+"-"+item.conpTabla+"-"+
                                        item.conpTipoDato
                         */

                        resultado=serv.consumo(22,getVtrStrDato1()); 
                        for (String item : resultado) {
                            blnDatos= true;
                            sArreglo= new String[item.split("-").length];
                            sArreglo=item.toString().split("-");
                            LOGGER.debug("Queryselect 202 "+item);
                            setVtrIntDato1(Integer.valueOf(sArreglo[0]).intValue());//setVtrIntDato1(rsDatos.getInt("CONP_ID_CONCEPTO"));
                            LOGGER.debug("Etiqueta :"+sArreglo[4]);
                            setVtrStrDato5(sArreglo[4]);//setVtrStrDato1(rsDatos.getString("CONP_NOMBRE"));//ETIQUETA
                            setVtrIntDato2(Integer.valueOf(sArreglo[1]).intValue());//setVtrIntDato2(rsDatos.getInt("CONP_BASE"));//SI VIENE 1 SE FORMA UN COMBO
                            setVtrStrDato2(sArreglo[7]);//setVtrStrDato2(rsDatos.getString("CONP_TABLA"));//QUERY EN CASO DE QUE SEA UN COMBO                    
                            setVtrStrDato3(sArreglo[2]);//setVtrStrDato3(rsDatos.getString("CONP_COMENTARIO"));//SI VIENE FIDEICOMISO ES QUE COMO PARAMETRO ES EL FISO
                            setVtrStrDato4(sArreglo[8]);//setVtrStrDato4(rsDatos.getString("CONP_TIPO_DATO"));//TIPO DE DATO   ALFANUMERICO FECHA
                            setVtrIntDato5(Integer.valueOf(sArreglo[6]).intValue());//setVtrIntDato5(rsDatos.getInt("CONP_PADRE"));
                            setVtrIntDato6(Integer.valueOf(sArreglo[5].replaceAll("true","1").replaceAll("false","0")).intValue());
                            intContador++;
                        }                        
                    break;  
                case 205:
                        //se recuperan los datos parametrizados de la solicitud
                        //se recuperan los parametros operacion y nombre
                        //getVtrStrDato1 () operacion
                        //getVtrStrDato2 () nombre
                        /*
                          item.id.conpIdConcepto+"-"+item.conpBase+"-"+
                                        item.conpComentario+"-"+item.conpEstatus+"-"+item.conpNombre+"-"+
                                        item.conpObligatorio+"-"+item.conpPadre+"-"+item.conpTabla+"-"+
                                        item.conpTipoDato
                         */
                        resultado=serv.consumo(21,"id="+getVtrStrDato2 ()+"&id2="+getVtrStrDato1 ()); 
                        for (String item : resultado) {
                            sArreglo= new String[item.split("-").length];
                            sArreglo=item.toString().split("-");
                            LOGGER.debug("Queryselect 205 "+item);
                            setVtrIntDato1(Integer.valueOf(sArreglo[0]).intValue());//setVtrIntDato1(rsDatos.getInt("CONP_ID_CONCEPTO"));
                            setVtrStrDato1(sArreglo[4]);//setVtrStrDato1(rsDatos.getString("CONP_NOMBRE"));//ETIQUETA
                            setVtrIntDato2(Integer.valueOf(sArreglo[1]).intValue());//setVtrIntDato2(rsDatos.getInt("CONP_BASE"));//SI VIENE 1 SE FORMA UN COMBO
                            setVtrStrDato2(sArreglo[7]);//setVtrStrDato2(rsDatos.getString("CONP_TABLA"));//QUERY EN CASO DE QUE SEA UN COMBO                    
                            setVtrStrDato3(sArreglo[2]);//setVtrStrDato3(rsDatos.getString("CONP_COMENTARIO"));//SI VIENE FIDEICOMISO ES QUE COMO PARAMETRO ES EL FISO
                            setVtrStrDato4(sArreglo[8]);//setVtrStrDato4(rsDatos.getString("CONP_TIPO_DATO"));//TIPO DE DATO   ALFANUMERICO FECHA
                            setVtrIntDato5(Integer.valueOf(sArreglo[6]).intValue());//setVtrIntDato5(rsDatos.getInt("CONP_PADRE"));
                            intContador++;
                        }                        
                    break;       
                case 200:
                        //OPERACIONES NO MONETARIAS
                        /*
                         * item.ftopNumOper+"-"+item.ftopBienes+"-"+
                                item.ftopNombreTipoper+"-"+item.ftopAtencionDias;
                         * */
                        resultado=serv.consumo(24,""); 
                        sArreglo= new String[resultado.length];
                        for (String item : resultado) {
                            LOGGER.debug("case 200 "+item);
                            sArreglo= new String[item.split("-").length];
                            sArreglo=item.toString().split("-");
                            setVtrStrDato1(sArreglo[0]);//setVtrStrDato1(rsDatos.getString("FTOP_NUM_OPER"));
                            setVtrStrDato2(sArreglo[2]);//setVtrStrDato2(rsDatos.getString("FTOP_NOMBRE_TIPOPER"));
                            setVtrStrDato3(sArreglo[3]);//setVtrStrDato3(rsDatos.getString("FTOP_ATENCION_DIAS"));
                            LOGGER.debug("case 200 sArreglo[1] "+sArreglo[1]);
                            setVtrIntDato1(Integer.
                                            valueOf(sArreglo[1].replaceAll("true","1").replaceAll("false","0")).intValue());//setVtrIntDato1(rsDatos.getInt("FTOP_BIENES"));
                            intContador++;
                        }
                        break;  
                    case 203:
                            /*
                             *                      case 203://BIENES
                                     
                                     intContador++;
                            item.id.funiIdSubcuenta+"-"+item.funiTipo+"-"+
                                                            item.id.funiIdBien+"-"+item.id.funiIdEdificio+"-"+item.id.funiIdDepto;
                             * */
                            resultado=serv.consumo(25,String.valueOf(getVtrIntDato1())); 
                            sArreglo= new String[resultado.length];
                            for (String item : resultado) {
                                sArreglo= new String[item.split("-").length];
                                sArreglo=item.toString().split("-");
                                setVtrIntDato1(Integer.valueOf(sArreglo[0]).intValue());//setVtrIntDato1(rsDatos.getInt("FUNI_ID_SUBCUENTA"));//SUBCUENTA
                                setVtrStrDato1(sArreglo[1]);//TIPO
                                setVtrIntDato2(Integer.valueOf(sArreglo[2]).intValue());//IDENTIFICADOR DEL BIEN
                                setVtrStrDato2(sArreglo[3]);//EDIFICIO
                                setVtrStrDato3(sArreglo[4]);//DEPARTAMENTO
                                intContador++;
                            }
                            break;
                case 204:
                        //INDICES  
                        intContador=0;
                        resultado=serv.consumo(26,getVtrStrDato1()); 
                        LOGGER.debug("nServicios 204: "+resultado[0]);
                        setVtrStrDato2 ( resultado[0]);
                        intContador++;
                    break;             
                case 12://Se recupera secuencial de clave por nombre y clave 128
                        //INDICES  
                        intContador=0;
                        resultado=serv.consumo(28,"id=128"+"&id2="+getVtrStrDato1()); 
                        for (String item : resultado) {
                            sArreglo= new String[item.split("-").length];
                            sArreglo=item.toString().split("-");
                            setVtrStrDato2(sArreglo[1]);//setVtrIntDato1(rsDatos.getInt("FUNI_ID_SUBCUENTA"));//SUBCUENTA
                        }                
                        intContador++;
                    break;
                case 206:
                        //vista1   patrimonio
                        resultado=serv.consumo(44,String.valueOf(getVtrIntDato1()));          
                        setVtrStrDato1 ( resultado[0]);
                        intContador++;
                    break;              
                case 207:
                        //vista2  honorarios
                        resultado=serv.consumo(45,String.valueOf(getVtrIntDato1()));          
                        setVtrStrDato1 ( resultado[0]);
                        intContador++;
                    break;              
                case 208:
                        //vista3 contable
                        resultado=serv.consumo(46,String.valueOf(getVtrIntDato1()));          
                        setVtrStrDato1 ( resultado[0]);
                        intContador++;
                    break;              
                case 209:
                        //vista4 rdc
                        resultado=serv.consumo(47,String.valueOf(getVtrIntDato1()));          
                        setVtrStrDato1 ( resultado[0]);
                        intContador++;
                    break;   
                case 210:
                        //vista5 embargos
                        resultado=serv.consumo(48,String.valueOf(getVtrIntDato1()));          
                        setVtrStrDato1 ( resultado[0]);
                        intContador++;
                    break;   
                case 211:
                        //vista6 fiscal
                        resultado=serv.consumo(49,String.valueOf(getVtrIntDato1()));          
                        setVtrStrDato1 ( resultado[0]);
                        intContador++;
                    break;   

                default:
                        break;                          
            }
        }
        catch (Exception e)
        {  
            LOGGER.debug(this.getClass()+"->" + e +"<->opcion:"+opc);
            removerValores();
            intContador=0;
            blnDatos= false;
        }
     }  
}
