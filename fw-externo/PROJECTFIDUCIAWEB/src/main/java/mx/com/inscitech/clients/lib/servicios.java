package mx.com.inscitech.clients.lib;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.clients.daos.FContratoDAO;
import mx.com.inscitech.clients.daos.FContratoDATODTO;
import mx.com.inscitech.clients.domain.ParamGlobal;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import mx.com.inscitech.clients.domain.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import java.net.URLEncoder;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.nio.charset.StandardCharsets;

public class servicios {
    private static final Logger LOGGER = LoggerFactory.getLogger(servicios.class);

    String apiUrl = ConfigLoader.getUrl();
    String url=apiUrl;
    //ObjectMapper objectMapper = new ObjectMapper();
    String secret = "dennis123456789phegon123456789den1234321"; // Ejemplo



    public String[] consumo(int caso,String param1) {
        
        String token = generateToken(secret, "Inmuebles@trustechcapitalmexico.com");
        String resultado[]={null};
        String param0="",param2="";
        int cont=0;        
        String urlfinal="";
        try{
            switch(caso){
                case 1://parametro por id
                    urlfinal = url+"/parametro/id/"+param1;
                    break;
                case 2:
                    urlfinal = url+"/usuario/buscar?id="+param1;
                    break;
                case 3:
                    urlfinal = url+"/feccont";
                    break;
                case 4://se recupera el valor2
                    urlfinal = url+"/parametro/id/"+param1;
                    break;            
                case 5://fisos
                    urlfinal = url+"/contrato";
                    break;   
                case 6: //se recupera conceptos
                    urlfinal = url+"/conceptos/buscar?id="+param1;
                    break;             
                case 7://datos del fiso
                    urlfinal = url+"/contrato/buscar?id="+param1;
                    break;   
                case 8: case 19://monedas
                    urlfinal = url+"/monedas";
                    break;   
                case 9://fideicom
                    urlfinal = url+"/fideicom/buscar?id="+param1;
                    break;             
                case 10://benefici
                    urlfinal = url+"/beneficiario/buscar?id="+param1;
                    break;             
                case 11:case 37://otros
                    urlfinal = url+"/Otros/buscar?id="+param1;
                    break;             
                case 12://folios
                    urlfinal = url+"/folios/siguiente/";
                    break;  
                case 13://cuentas inversion
                    urlfinal = url+"/cuentasinversion/buscar?id="+param1+"&id2=INVERSION";
                    break;  
                case 14:case 38://fiso x cuenta
                    urlfinal = url+"/cuentasinversion/buscar?id="+param1+"&id2=CHEQUES";
                    break; 
                case 15://subfiso
                    urlfinal = url+"/subfiso/buscar?id="+param1;
                    break;           
                case 16://personal
                    urlfinal = url+"/personal";
                    break;             
                case 17://monedas por id
                    urlfinal = url+"/monedas/id/"+param1;
                    break;   
                case 18://monedas por nombre
                    urlfinal = url+"/monedas/nombre/id?id="+URLEncoder.encode(param1, StandardCharsets.UTF_8.toString());                    
                    break;              
                case 20://parametro por nombre
                    urlfinal = url+"/parametro/nombre/"+param1;
                    break;

                case 21://busqueda por operacion y nombre
                    urlfinal = url+"/insno/buscarnombre?"+param1;
                    break;
                case 22://busqueda por operacion sin padre (padre=0)
                    urlfinal = url+"/insno/buscar/id?id="+param1;
                    break;            
                case 23://busqueda por operacion
                    urlfinal = url+"/insno/id/"+param1;
                    break; 
                case 24://TIPOS DE OPERACION NO MONETARIAS
                    urlfinal = url+"/operacion";
                    break; 

                case 25://UNIDADES
                    urlfinal = url+"/unidades/buscar?id="+param1;
                    break; 

                case 26://INDICES por descripcion
                    urlfinal = url+"/indices/id/"+param1;
                    break; 
                case 27://INDICES por clave
                    urlfinal = url+"/indices/buscar?id="+param1;
                    break; 
            case 28:case 32://CLAVES POR nombre
                    param0=param1.substring(0, param1.indexOf('&'));
                    param2=param1.substring(param1.indexOf("2=")+2, param1.length());
                    urlfinal = url+"/conceptos/nombre?"+param0+"&id2="+URLEncoder.encode(param2, StandardCharsets.UTF_8.toString());
                    break;
                case 29://benefici POR nombre
                    param0=param1.substring(0, param1.indexOf('&'));
                    param2=param1.substring(param1.indexOf("2=")+2, param1.length());
                    urlfinal = url+"/beneficiario/buscarnombre?"+param0+"&id2="+URLEncoder.encode(param2, StandardCharsets.UTF_8.toString());
                    break;
                case 30://fideicom POR nombre
                    param0=param1.substring(0, param1.indexOf('&'));
                    param2=param1.substring(param1.indexOf("2=")+2, param1.length());                
                    urlfinal = url+"/fideicom/buscarnombre?"+param0+"&id2="+URLEncoder.encode(param2, StandardCharsets.UTF_8.toString());
                    break;
                case 31://otros POR nombre
                    param0=param1.substring(0, param1.indexOf('&'));
                    param2=param1.substring(param1.indexOf("2=")+2, param1.length());                
                    urlfinal = url+"/Otros/buscarnombre?"+param0+"&id2="+URLEncoder.encode(param2, StandardCharsets.UTF_8.toString());
                    break;
                case 33://tipo de cambio por fecha
                    urlfinal = url+"/tipocamb/buscar?"+param1;
                    break;            
                case 34: //se recupera conceptos por secuencial
                    urlfinal = url+"/conceptos/id/sec?"+param1;
                    break;             
                case 35: //se recupera la posicion
                    urlfinal = url+"/posicion/buscar?id="+param1;
                    break;             
                case 36: //paises
                    urlfinal = url+"/paises";
                    break; 
                case 39://cuentas por titular
                    param0=param1.substring(0, param1.indexOf('&'));
                    param2=param1.substring(param1.indexOf("2=")+2, param1.length());
                    urlfinal = url+"/cuentasinversion/consultatitular/id?id="+param0+"&id2="+URLEncoder.encode(param2, StandardCharsets.UTF_8.toString());                
                    break;              
                case 40: //plazas por banco
                    urlfinal = url+"/plazas/buscar?id="+param1;
                    break;
                case 41://cuentas por cuenta y fiso
                    param0=param1.substring(0, param1.indexOf('&'));
                    param2=param1.substring(param1.indexOf("2=")+2, param1.length());
                    urlfinal = url+"/cuentasinversion/buscar/"+param0+"/buscar2/"+param2;                
                    break;              
                case 42: //se recupera la posicion por fiso y contrato de posicion
                    param0=param1.substring(0, param1.indexOf('&'));
                    param2=param1.substring(param1.indexOf("2=")+2, param1.length());                
                    urlfinal = url+"/posicion/buscar/id?id="+param0+"&id2="+URLEncoder.encode(param2, StandardCharsets.UTF_8.toString());                
                    break; 
                case 43: //se recuperan documentos por operacion
                    urlfinal = url+"/documento/buscar?id="+param1;
                    break; 
                case 44: //vista1
                    urlfinal = url+"/vistas/vista1?id="+param1;
                    break;
                case 45: //vista2
                    urlfinal = url+"/vistas/vista2?id2="+param1;
                    break; 
                case 46: //vista3
                    urlfinal = url+"/vistas/vista3?id3="+param1;
                    break; 
                case 47: //vista4
                    urlfinal = url+"/vistas/vista4?id4="+param1;
                    break; 
                case 48: //vista5
                    urlfinal = url+"/vistas/vista5?id5="+param1;
                    break; 
                case 49: //vista6
                    urlfinal = url+"/vistas/vista6?id6="+param1;
                    break;   
                case 50: //datos archivos para visualizar pasando el folio
                    urlfinal = url+"/api/documentos/buscar?id="+param1;
                    break;              
            }
               LOGGER.debug("url: " + urlfinal);

               HttpClient client = HttpClient.newHttpClient();
               
               HttpRequest request = HttpRequest.newBuilder()
                       .uri(URI.create(urlfinal))
                       .header("Authorization", "Bearer " + token) // PASO CLAVE
                       .header("Content-Type", "application/json")
                       .GET() // O .POST(BodyPublishers.ofString(jsonInput))
                       .build();
                
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                LOGGER.debug("Status Code: " + response.statusCode());
                LOGGER.debug("Response: " + response.body());                 

                ObjectMapper mapper = new ObjectMapper();

                String jsoncadena=response.body();
                // 2. Crear objeto Gson
                Gson gson = new GsonBuilder()
                    .serializeNulls() // Habilita la deserialización de campos nulos explícitos
                    .create();
            
                switch(caso){
                    case 1://ParamGlobal
                        // 3. Deserializar
                        jsoncadena=jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                    
                        ParamGlobal usuario = gson.fromJson(jsoncadena, ParamGlobal.class);                        
                        LOGGER.debug("GSON: "+usuario.paramValor); // Salida: Juan 
                        resultado[0]=String.valueOf(usuario.paramValor);
                        //resultado=DestructuraJSON(new String[]{"\"paramValor\":",""},response.body(),1);
                        break;
                    case 2://f_usufid
                        jsoncadena=jsoncadena.trim();
                        LOGGER.debug("jsoncadena:"+jsoncadena);


                        // Deserializar arreglo de objetos
                        Type listType = new TypeToken<List<FUsufidDTO>>(){}.getType();
                        List<FUsufidDTO> registros = gson.fromJson(jsoncadena, listType);
                        resultado = new String[registros.size()];
                        if(registros.size()>0)
                            resultado=registros.get(0).getContrato().toString().replaceAll("\\[","").split(",");
      
                        LOGGER.debug("Longitud resultado fusufid "+resultado.length);
                        // Resultado
                        for (String nombre : resultado) {
                            LOGGER.debug(nombre);
                        }
                        break;                
                    case 3://feccont
                        // 3. Deserializar
                        jsoncadena=jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                    
                        Feccont fecha = gson.fromJson(jsoncadena, Feccont.class);                        
                        LOGGER.debug("GSON: "+fecha.fcoFecha); // Salida: Juan 
                        resultado[0]=String.valueOf(fecha.fcoFecha);
                        //resultado=DestructuraJSON(new String[]{"\"paramValor\":",""},response.body(),1);
                        break;
                    case 4://ParamGlobal se recupera valor2
                        // 3. Deserializar
                        jsoncadena=jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                    
                        ParamGlobal valor2 = gson.fromJson(jsoncadena, ParamGlobal.class);                        
                        LOGGER.debug("GSON: "+valor2.paramValor2); 
                        resultado[0]=String.valueOf(valor2.paramValor2);
                        //resultado=DestructuraJSON(new String[]{"\"paramValor\":",""},response.body(),1);
                        break;
                case 5://fisos
                        jsoncadena=jsoncadena. trim();
                        LOGGER.debug("jsoncadena:"+jsoncadena);
        
        
                        // Deserializar arreglo de objetos
                        Type listFisos = new TypeToken<List<Contrato>>(){}.getType();
                        List<Contrato> fisos = gson.fromJson(jsoncadena, listFisos);
                        resultado = new String[fisos.size()];
                        resultado=fisos.toString().replaceAll("\\[","").split(",");
                        
                        LOGGER.debug("Longitud resultado fisos "+resultado.length);
                        // Resultado
                        /*for (String nombre : resultado) {
                            LOGGER.debug(nombre);
                        }*/
                        break;  
                case 6: case 28: case 34://conceptos
                            Gson gson2 = new Gson();
                            //jsoncadena=jsoncadena.replaceAll("\\]","").replaceAll("\\[","");
                    
                            LOGGER.debug("jsoncadena:"+jsoncadena);            
                            // Deserializar JSON a objeto Java
                            // 3. Definir el tipo de la lista (TypeToken)
                            Type typeclaves = new TypeToken<List<ClavesDTO>>(){}.getType();
                            // 4. Deserializar
                            List<ClavesDTO> claves = gson.fromJson(jsoncadena, typeclaves);
                            resultado = new String[claves.size()];
                            cont=0;
                            for (ClavesDTO item : claves) {
                                resultado[cont++]=item.toString();
                            }
                            LOGGER.debug("Longitud resultado claves "+resultado.length);
                            // Resultado
                            /*for (String nombre : resultado) {
                                LOGGER.debug(nombre);
                            }*/
                            break;                  
                        case 7://datos del fiso
                            jsoncadena=jsoncadena. trim();
                            LOGGER.debug("jsoncadena:"+jsoncadena);
                            
                            
                            // Deserializar arreglo de objetos
                            Type listFisosid = new TypeToken<List<Contrato>>(){}.getType();
                            List<Contrato> fisosid = gson.fromJson(jsoncadena, listFisosid);
                            resultado = new String[fisosid.size()];
                            resultado=fisosid.toString().replaceAll("\\]","").replaceAll("\\[","").substring(
                            fisosid.toString().indexOf('-')).split(",");
                            
                            LOGGER.debug("Longitud listFisosid "+resultado.length);
                            // Resultado
                            /*for (String nombre : resultado) {
                                LOGGER.debug("listFisosid:"+nombre);
                            }*/
                            break;  
                    case 8:
                            LOGGER.debug("jsoncadena:"+jsoncadena);
                            Type typemonedas = new TypeToken<List<Monedas>>(){}.getType();
                            // 4. Deserializar
                            List<Monedas> monedas = gson.fromJson(jsoncadena, typemonedas);
                            resultado = new String[monedas.size()];
                            cont=0;
                            for (Monedas item : monedas) {
                                resultado[cont++]=item.getMonNomMoneda();
                            }
                            //LOGGER.debug("Longitud resultado claves "+resultado.length);   
                            /*for (String nombre : resultado) {
                                LOGGER.debug("monedas:"+nombre);
                            }*/
                            break;
                    case 9:case 30://fideicomcase 29:
                            LOGGER.debug("jsoncadena:"+jsoncadena);
                            Type typefideicom = new TypeToken<List<FideicomDTO>>(){}.getType();
                            // 4. Deserializar
                            List<FideicomDTO> fideicom = gson.fromJson(jsoncadena, typefideicom);
                            resultado = new String[fideicom.size()];
                            cont=0;
                            for (FideicomDTO item : fideicom) {
                                resultado[cont++]=item.toString();
                            }
                            break;             
                    case 10:case 29://benefici
                            LOGGER.debug("jsoncadena:"+jsoncadena);
                            Type typebenefici = new TypeToken<List<BeneficiDTO>>(){}.getType();
                            // 4. Deserializar
                            List<BeneficiDTO> benefici = gson.fromJson(jsoncadena, typebenefici);
                            resultado = new String[benefici.size()];
                            cont=0;
                            for (BeneficiDTO item : benefici) {
                                resultado[cont++]=item.toString();
                            }
                            break;             
                    case 11:case 31://otros
                            LOGGER.debug("jsoncadena:"+jsoncadena);
                            Type typeterceros = new TypeToken<List<TercerosDTO>>(){}.getType();
                            // 4. Deserializar
                            List<TercerosDTO> terceros = gson.fromJson(jsoncadena, typeterceros);
                            resultado = new String[terceros.size()];
                            cont=0;
                            for (TercerosDTO item : terceros) {
                                resultado[cont++]=item.toString();
                            }
                            break;   
                    case 12://folios
                        // 3. Deserializar
                        jsoncadena=jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                    
                        //Folios folio = gson.fromJson(jsoncadena, Folios.class);                        
                        LOGGER.debug("folio asignado: "+jsoncadena); 
                        resultado[0]=jsoncadena;
                        //resultado=DestructuraJSON(new String[]{"\"paramValor\":",""},response.body(),1);
                        break;
                    case 13:
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                        Type typecueninv = new TypeToken<List<FCuentasInversion>>(){}.getType();
                        // 4. Deserializar
                        List<FCuentasInversion> inver = gson.fromJson(jsoncadena, typecueninv);
                        resultado = new String[inver.size()];
                        cont=0;
                        for (FCuentasInversion item : inver) {
                            //caso especial para recuperar el nombre de la moneda
                            HttpClient clientmon = HttpClient.newHttpClient();
                            urlfinal = url+"/monedas/id/"+item.getFciMoneda();//se envia el codigo de la moneda
                            LOGGER.debug("Moneda Cto Inver: "+urlfinal);
                            HttpRequest requestmon = HttpRequest.newBuilder()
                                    .uri(URI.create(urlfinal))
                                    .header("Authorization", "Bearer " + token) // PASO CLAVE
                                    .header("Content-Type", "application/json")
                                    .GET() // O .POST(BodyPublishers.ofString(jsonInput))
                                    .build();
                             
                                HttpResponse<String> response2 = client.send(requestmon, 
                                                                          HttpResponse.BodyHandlers.ofString());                
                                String jsoncadena2=response2.body();
                                String sNomMoneda="";
                                Type typecuenmon2 = new TypeToken<List<Monedas>>(){}.getType();
                                List<Monedas> monedasnombre = gson.fromJson(jsoncadena2, typecuenmon2);
                                for (Monedas item2 : monedasnombre) {
                                    sNomMoneda=item2.monNomMoneda;
                                }
                               resultado[cont++]=item.fciNumCta+"-"+item.fciNombreCta+"-"+sNomMoneda;
                        }
                        break;   

                    case 14:case 41:
                    
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                        Type typecueninv2 = new TypeToken<List<FCuentasInversion>>(){}.getType();
                        // 4. Deserializar
                        List<FCuentasInversion> inver2 = gson.fromJson(jsoncadena, typecueninv2);
                        resultado = new String[inver2.size()];
                        cont=0;
                        for (FCuentasInversion item : inver2) {
                            resultado[cont++]=item.fciNumCta+"";
                        }                    
                        /*LOGGER.debug("jsoncadena:"+jsoncadena);
                        Type typefisocuenta = new TypeToken<List<FFideicoCuebanDTO>>(){}.getType();
                        // 4. Deserializar
                        List<FFideicoCuebanDTO> ctaxfiso = gson.fromJson(jsoncadena, typefisocuenta);
                        resultado = new String[ctaxfiso.size()];
                        cont=0;
                        for (FFideicoCuebanDTO item : ctaxfiso) {
                            resultado[cont++]=item.toString();
                        }
                        /*for (String nombre : resultado) {
                                                    LOGGER.debug("FFideicoCuebanDTO:"+nombre);
                                                }*/
                        break;   

                    case 15://subfiso
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                        Type typesubfiso = new TypeToken<List<FSubcuentaDTO>>(){}.getType();
                        // 4. Deserializar
                        List<FSubcuentaDTO> subfiso = gson.fromJson(jsoncadena, typesubfiso);
                        resultado = new String[subfiso.size()];
                        cont=0;
                        for (FSubcuentaDTO item : subfiso) {
                            resultado[cont++]=item.toString();
                        }
                        break; 

                    case 16://personal
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                        Type typepersonal = new TypeToken<List<Personal>>(){}.getType();
                        // 4. Deserializar
                        List<Personal> personal = gson.fromJson(jsoncadena, typepersonal);
                        resultado = new String[personal.size()];
                        cont=0;
                        for (Personal item : personal) {
                            resultado[cont++]=item.toString();
                        }
                        break;
                    case 18://monedas por nombre
                                LOGGER.debug("jsoncadenaMoneda:"+jsoncadena);
                                Type typemonedasn = new TypeToken<List<Monedas>>(){}.getType();
                                // 4. Deserializar
                                List<Monedas> monedasn = gson.fromJson(jsoncadena, typemonedasn);
                                resultado = new String[monedasn.size()];
                                cont=0;
                                for (Monedas item : monedasn) {
                                    resultado[cont++]=item.monNumPais+"";
                                }
                                //LOGGER.debug("Longitud resultado claves "+resultado.length);   
                                for (String nombre : resultado) {
                                    LOGGER.debug("monedas por nombre:"+nombre);
                                }
                                break;
                    case 19://monedas y regresa el id y nombre
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                        Type typemonedas2 = new TypeToken<List<Monedas>>(){}.getType();
                        // 4. Deserializar
                        List<Monedas> monedas2 = gson.fromJson(jsoncadena, typemonedas2);
                        resultado = new String[monedas2.size()];
                        cont=0;
                        for (Monedas item : monedas2) {
                            resultado[cont++]=item.toString();
                        }
                        //LOGGER.debug("Longitud resultado claves "+resultado.length);   
                        /*for (String nombre : resultado) {
                            LOGGER.debug("monedas:"+nombre);
                        }*/
                        break;
                    case 20://ParamGlobal por nombre y regresa el paramvalor2
                        // 3. Deserializar
                        jsoncadena=jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                    
                        ParamGlobal param = gson.fromJson(jsoncadena, ParamGlobal.class);                        
                        LOGGER.debug("GSON: "+param.paramValor2); // Salida: Juan 
                        resultado[0]=String.valueOf(param.paramValor2);
                        //resultado=DestructuraJSON(new String[]{"\"paramValor\":",""},response.body(),1);
                        break;
                
                    case 21:case 22:case 23://parametrizacion no monetarias
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                        Type typeparamnom = new TypeToken<List<FConinsnomon>>(){}.getType();
                        // 4. Deserializar
                        List<FConinsnomon> insnomon = gson.fromJson(jsoncadena, typeparamnom);
                        resultado = new String[insnomon.size()];
                        cont=0;
                        for (FConinsnomon item : insnomon) {
                            resultado[cont++]=item.id.conpIdConcepto+"-"+item.conpBase+"-"+
                                item.conpComentario+"-"+item.conpEstatus+"-"+item.conpNombre+"-"+
                                item.conpObligatorio+"-"+item.conpPadre+"-"+item.conpTabla+"-"+
                                item.conpTipoDato;
                        }
                        //LOGGER.debug("Longitud resultado claves "+resultado.length);   
                        for (String nombre : resultado) {
                            LOGGER.debug("parametrizacion no monetarias:"+nombre);
                        }
                        break;
                    case 24://operaciones no monetarias
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                        Type typenomon = new TypeToken<List<FTipoper>>(){}.getType();
                        // 4. Deserializar
                        List<FTipoper> nomonetaria = gson.fromJson(jsoncadena, typenomon);
                        resultado = new String[nomonetaria.size()];
                        cont=0;
                        for (FTipoper item : nomonetaria) {
                            resultado[cont++]=item.ftopNumOper+"-"+
                                              (item.ftopBienes==null?0:item.ftopBienes)+"-"+
                                              item.ftopNombreTipoper+"-"+
                                              (item.ftopAtencionDias==null?"1":item.ftopAtencionDias);
                        }
                        //LOGGER.debug("Longitud resultado claves "+resultado.length);   
                        for (String nombre : resultado) {
                            LOGGER.debug("operaciones no monetarias:"+nombre);
                        }
                        break;
                    case 25://unidades
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                        Type typeunidades = new TypeToken<List<FUnidades>>(){}.getType();
                        // 4. Deserializar
                        List<FUnidades> unidades = gson.fromJson(jsoncadena, typeunidades);
                        resultado = new String[unidades.size()];
                        cont=0;
                        for (FUnidades item : unidades) {
                            resultado[cont++]=item.id.funiIdSubcuenta+"-"+item.funiTipo+"-"+
                                item.id.funiIdBien+"-"+item.id.funiIdEdificio+"-"+item.id.funiIdDepto;
                        }
                        //LOGGER.debug("Longitud resultado claves "+resultado.length);   
                        for (String nombre : resultado) {
                            LOGGER.debug("operaciones no monetarias:"+nombre);
                        }
                        break;
                    case 26://INDICES
                        // 3. Deserializar
                        jsoncadena=jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                    
                        FIndices indices = gson.fromJson(jsoncadena, FIndices.class);                        
                        LOGGER.debug("GSON: "+indices.eindFormaEmp); 
                        resultado[0]=String.valueOf(indices.eindFormaEmp);
                        //resultado=DestructuraJSON(new String[]{"\"paramValor\":",""},response.body(),1);
                        break;
                    case 27:
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                        Type typeindiceclave = new TypeToken<List<FIndices>>(){}.getType();
                        // 4. Deserializar
                        List<FIndices> indicesclave = gson.fromJson(jsoncadena, typeindiceclave);
                        resultado = new String[indicesclave.size()];
                        cont=0;
                        for (FIndices item : indicesclave) {
                            resultado[cont++]=item.id.eindIdSubindice+"-"+item.eindDescripcion;
                        }

                        break;
                    case 32://conceptos lim inf
                                //jsoncadena=jsoncadena.replaceAll("\\]","").replaceAll("\\[","");
                        
                                LOGGER.debug("jsoncadena:"+jsoncadena);            
                                // Deserializar JSON a objeto Java
                                // 3. Definir el tipo de la lista (TypeToken)
                                Type typeclaves2 = new TypeToken<List<ClavesDTO>>(){}.getType();
                                // 4. Deserializar
                                List<ClavesDTO> claves2 = gson.fromJson(jsoncadena, typeclaves2);
                                resultado = new String[claves2.size()];
                                cont=0;
                                for (ClavesDTO item : claves2) {
                                    resultado[cont++]=item.cveLiminfClave+"";
                                }
                                LOGGER.debug("Longitud resultado claves liminf "+resultado.length);
                        break;
                    case 33://tipocambio
                                LOGGER.debug("jsoncadena:"+jsoncadena);            
                                // Deserializar JSON a objeto Java
                                // 3. Definir el tipo de la lista (TypeToken)
                                Type typetipoc = new TypeToken<List<Tipocamb>>(){}.getType();
                                // 4. Deserializar
                                List<Tipocamb> tipocamb = gson.fromJson(jsoncadena, typetipoc);
                                resultado = new String[tipocamb.size()];
                                cont=0;
                                for (Tipocamb item : tipocamb) {
                                    resultado[cont++]=item.ticImpTipoCamb+"";
                                }
                                LOGGER.debug("Longitud resultado tipocamb "+resultado.length);
                        break;
                case 35: case 42://posicion por fiso y por fiso/ctoinver
                                LOGGER.debug("jsoncadena:"+jsoncadena);            
                                // Deserializar JSON a objeto Java
                                // 3. Definir el tipo de la lista (TypeToken)
                                Type typeposicion = new TypeToken<List<Posicion>>(){}.getType();
                                // 4. Deserializar
                                List<Posicion> posicion = gson.fromJson(jsoncadena, typeposicion);
                                resultado = new String[posicion.size()];
                                cont=0;
                                for (Posicion item : posicion) {
                                    resultado[cont++]=item.id.posContratoInter+"-"+item.posCostoHistoric;
                                }
                                LOGGER.debug("Longitud resultado posicion "+resultado.length);
                        break;                

                    case 36://paises
                            LOGGER.debug("jsoncadena:"+jsoncadena);
                            Type typepaises = new TypeToken<List<Paises>>(){}.getType();
                            // 4. Deserializar
                            List<Paises> paises = gson.fromJson(jsoncadena, typepaises);
                            resultado = new String[paises.size()];
                            cont=0;
                            for (Paises item : paises) {
                                resultado[cont++]=item.getPaiNomPais();
                            }
                            //LOGGER.debug("Longitud resultado claves "+resultado.length);   
                            /*for (String nombre : resultado) {
                                LOGGER.debug("monedas:"+nombre);
                            }*/
                            break;

                        case 37://otros
                            LOGGER.debug("jsoncadena:"+jsoncadena);
                            Type typetercerosnom = new TypeToken<List<TercerosDTO>>(){}.getType();
                            // 4. Deserializar
                            List<TercerosDTO> tercerosnom = gson.fromJson(jsoncadena, typetercerosnom);
                            resultado = new String[tercerosnom.size()];
                            cont=0;
                            for (TercerosDTO item : tercerosnom) {
                                resultado[cont++]=item.terNomTercero;
                            }
                            break;  
                        case 38:case 39://cuentas de forma liquidacion spei
                            LOGGER.debug("jsoncadena:"+jsoncadena);
                            Type typecueninv3 = new TypeToken<List<FCuentasInversion>>(){}.getType();
                            // 4. Deserializar
                            List<FCuentasInversion> inver3 = gson.fromJson(jsoncadena, typecueninv3);
                            resultado = new String[inver3.size()];
                            cont=0;
                            for (FCuentasInversion item : inver3) {
                                resultado[cont++]=item.fciNumCta+"|CUENTA CHEQUES|"+
                                                  (item.fciClabe!=null?item.fciClabe:"SINCUENTACLABE");
                            } 
                    
                    
                            /*LOGGER.debug("jsoncadena:"+jsoncadena);
                            Type typefisocuentaspei = new TypeToken<List<FFideicoCuebanDTO>>(){}.getType();
                            // 4. Deserializar
                            List<FFideicoCuebanDTO> ctaxfisospei = gson.fromJson(jsoncadena, typefisocuentaspei);
                            resultado = new String[ctaxfisospei.size()];
                            cont=0;
                            for (FFideicoCuebanDTO item : ctaxfisospei) {
                                resultado[cont++]=item.fcbaTitular+"|CUENTA CHEQUES|"+item.toString();
                            }
                            /*for (String nombre : resultado) {
                                                        LOGGER.debug("FFideicoCuebanDTO:"+nombre);
                                                    }*/
                            break;   
                    case 40://plazas por banco
                        LOGGER.debug("jsoncadena:"+jsoncadena);
                        Type typeplazas = new TypeToken<List<FPlazasBancoDTO>>(){}.getType();
                        // 4. Deserializar
                        List<FPlazasBancoDTO> plazas = gson.fromJson(jsoncadena, typeplazas);
                        resultado = new String[plazas.size()];
                        cont=0;
                        for (FPlazasBancoDTO item : plazas) {
                            resultado[cont++]=item.fplbNombrePlaza;
                        }
                        /*for (String nombre : resultado) {
                                                    LOGGER.debug("FFideicoCuebanDTO:"+nombre);
                                                }*/
                        break;                
                        case 43://documento por operacion
                                LOGGER.debug("jsoncadena:"+jsoncadena);            
                                // Deserializar JSON a objeto Java
                                // 3. Definir el tipo de la lista (TypeToken)
                                Type typedocumento = new TypeToken<List<VistaDocumento>>(){}.getType();
                                // 4. Deserializar
                                List<VistaDocumento> documento = gson.fromJson(jsoncadena, typedocumento);
                                resultado = new String[documento.size()];
                                cont=0;
                                for (VistaDocumento item : documento) {
                                    resultado[cont++]=item.documento;
                                }
                        break;
                    case 44://documento por operacion
                            LOGGER.debug("jsoncadena:"+jsoncadena);            
                            // Deserializar JSON a objeto Java
                            // 3. Definir el tipo de la lista (TypeToken)
                            Type typev1 = new TypeToken<List<Vista1>>(){}.getType();
                            // 4. Deserializar
                            List<Vista1> v1 = gson.fromJson(jsoncadena, typev1);
                            resultado = new String[v1.size()];
                            cont=0;
                            for (Vista1 item : v1) {
                                resultado[cont++]=item.estado;
                            }
                    break;
                    case 45://documento por operacion
                        LOGGER.debug("jsoncadena:"+jsoncadena);            
                        // Deserializar JSON a objeto Java
                        // 3. Definir el tipo de la lista (TypeToken)
                        Type typev2 = new TypeToken<List<Vista2>>(){}.getType();
                        // 4. Deserializar
                        List<Vista2> v2 = gson.fromJson(jsoncadena, typev2);
                        resultado = new String[v2.size()];
                        cont=0;
                        for (Vista2 item : v2) {
                            resultado[cont++]=item.estado;
                        }
                    break;  
                    case 46://documento por operacion
                        LOGGER.debug("jsoncadena:"+jsoncadena);            
                        // Deserializar JSON a objeto Java
                        // 3. Definir el tipo de la lista (TypeToken)
                        Type typev3 = new TypeToken<List<Vista3>>(){}.getType();
                        // 4. Deserializar
                        List<Vista3> v3 = gson.fromJson(jsoncadena, typev3);
                        resultado = new String[v3.size()];
                        cont=0;
                        for (Vista3 item : v3) {
                            resultado[cont++]=item.estado;
                        }
                    break;    
                    case 47://documento por operacion
                        LOGGER.debug("jsoncadena:"+jsoncadena);            
                        // Deserializar JSON a objeto Java
                        // 3. Definir el tipo de la lista (TypeToken)
                        Type typev4 = new TypeToken<List<Vista4>>(){}.getType();
                        // 4. Deserializar
                        List<Vista4> v4 = gson.fromJson(jsoncadena, typev4);
                        resultado = new String[v4.size()];
                        cont=0;
                        for (Vista4 item : v4) {
                            resultado[cont++]=item.estado;
                        }
                    break;                  
                    case 48://documento por operacion
                        LOGGER.debug("jsoncadena:"+jsoncadena);            
                        // Deserializar JSON a objeto Java
                        // 3. Definir el tipo de la lista (TypeToken)
                        Type typev5 = new TypeToken<List<Vista5>>(){}.getType();
                        // 4. Deserializar
                        List<Vista5> v5 = gson.fromJson(jsoncadena, typev5);
                        resultado = new String[v5.size()];
                        cont=0;
                        for (Vista5 item : v5) {
                            resultado[cont++]=item.estado;
                        }
                    break; 
                    case 49://documento por operacion
                        LOGGER.debug("jsoncadena:"+jsoncadena);            
                        // Deserializar JSON a objeto Java
                        // 3. Definir el tipo de la lista (TypeToken)
                        Type typev6 = new TypeToken<List<Vista6>>(){}.getType();
                        // 4. Deserializar
                        List<Vista6> v6 = gson.fromJson(jsoncadena, typev6);
                        resultado = new String[v6.size()];
                        cont=0;
                        for (Vista6 item : v6) {
                            resultado[cont++]=item.estado;
                        }
                    break; 
                    case 50://recuperacion de datos de documento a visualizar
                        LOGGER.debug("jsoncadena:"+jsoncadena);            
                        // Deserializar JSON a objeto Java
                        // 3. Definir el tipo de la lista (TypeToken)
                        Type typevdoc = new TypeToken<List<PdfDocument>>(){}.getType();
                        // 4. Deserializar
                        List<PdfDocument> datosdocumento = gson.fromJson(jsoncadena, typevdoc);
                        resultado = new String[datosdocumento.size()];
                        cont=0;
                        for (PdfDocument item : datosdocumento) {
                            resultado[cont++]=item.nombre+"-"+item.filePath+"-"+
                                item.contentType;
                        }
                    break;                 
                }
                
            }
            catch (Exception e) {
                        LOGGER.debug("Exception in NetClientGet:- " + e);
            }
        return resultado;
    }
    

    
    public static String generateToken(String secretKey, String subject) {
        // La clave debe ser lo suficientemente larga para el algoritmo HS256
        byte[] keyBytes = secretKey.getBytes();
        Key key = Keys.hmacShaKeyFor(keyBytes);

        return Jwts.builder()
                .setSubject(subject)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600000)) // 1 hora
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }    
    

}
