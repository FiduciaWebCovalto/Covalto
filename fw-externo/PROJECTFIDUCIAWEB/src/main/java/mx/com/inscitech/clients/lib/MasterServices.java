package mx.com.inscitech.clients.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mx.com.inscitech.clients.domain.ParamGlobal;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import mx.com.inscitech.clients.domain.*;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import java.util.List;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.net.URLEncoder;


import java.nio.charset.StandardCharsets;

/**
 * Servicio maestro para consumo de endpoints backend REST de WS_Oracle / servicios fiduciarios.
 * Proporciona un cliente HTTP optimizado y registro de eventos a nivel INFO.
 */
public class MasterServices {
    private static final Logger LOGGER = LoggerFactory.getLogger(MasterServices.class);

    private static final HttpClient HTTP_CLIENT = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_1_1)
        .followRedirects(HttpClient.Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(10))
        .build();

    protected String secret = "dennis123456789phegon123456789den1234321";

    public String[] consumo(int caso, String param1) {
        String token = generateToken(secret, "Inmuebles@trustechcapitalmexico.com");
        return consumo(caso, param1, token, "Inmuebles@trustechcapitalmexico.com");
    }

    public String[] consumo(int caso, String param1, String token, String usuario) {
        String apiUrl = ConfigLoader.getServiceUrl();
        String url = apiUrl != null && apiUrl.endsWith("/") ? apiUrl.substring(0, apiUrl.length() - 1) : apiUrl;
        String[] resultado = {null};
        String param0 = "", param2 = "";
        int cont = 0;        
        String urlfinal = "";

        if (token == null || token.trim().isEmpty()) {
            token = generateToken(secret, usuario != null && !usuario.trim().isEmpty() ? usuario : "Inmuebles@trustechcapitalmexico.com");
        }

        LOGGER.info("Iniciando consumo en MasterServices - Caso: {}, Parametro: {}, URL base: {}", caso, param1, url);

        try {
            switch(caso) {
                case 1: // parametro por id
                    urlfinal = url + "/parametro/id/" + param1;
                    break;
                case 2:
                    urlfinal = url + "/usuario/buscar?id=" + param1;
                    break;
                case 3:
                    urlfinal = url + "/feccont";
                    break;
                case 4: // se recupera el valor2
                    urlfinal = url + "/parametro/id/" + param1;
                    break;            
                case 5: // fisos
                    urlfinal = url + "/contrato";
                    break;   
                case 6: // se recupera conceptos
                    urlfinal = url + "/conceptos/buscar?id=" + param1;
                    break;             
                case 7: // datos del fiso
                    urlfinal = url + "/contrato/buscar?id=" + param1;
                    break;   
                case 8: case 19: // monedas
                    urlfinal = url + "/monedas";
                    break;   
                case 9: // fideicom
                    urlfinal = url + "/fideicom/buscar?id=" + param1;
                    break;             
                case 10: // benefici
                    urlfinal = url + "/beneficiario/buscar?id=" + param1;
                    break;             
                case 11: case 37: // otros
                    urlfinal = url + "/Otros/buscar?id=" + param1;
                    break;             
                case 12: // folios
                    urlfinal = url + "/folios/siguiente/";
                    break;  
                case 13: // cuentas inversion
                    urlfinal = url + "/cuentasinversion/buscar?id=" + param1 + "&id2=INVERSION";
                    break;  
                case 14: case 38: // fiso x cuenta
                    urlfinal = url + "/cuentasinversion/buscar?id=" + param1 + "&id2=CHEQUES";
                    break; 
                case 15: // subfiso
                    urlfinal = url + "/subfiso/buscar?id=" + param1;
                    break;           
                case 16: // personal
                    urlfinal = url + "/personal";
                    break;             
                case 17: // monedas por id
                    urlfinal = url + "/monedas/id/" + param1;
                    break;   
                case 18: // monedas por nombre
                    urlfinal = url + "/monedas/nombre/id?id=" + URLEncoder.encode(param1, StandardCharsets.UTF_8.toString());                    
                    break;              
                case 20: // parametro por nombre
                    urlfinal = url + "/parametro/nombre/" + param1;
                    break;
                case 21: // busqueda por operacion y nombre
                    urlfinal = url + "/insno/buscarnombre?" + param1;
                    break;
                case 22: // busqueda por operacion sin padre (padre=0)
                    urlfinal = url + "/insno/buscar/id?id=" + param1;
                    break;            
                case 23: // busqueda por operacion
                    urlfinal = url + "/insno/id/" + param1;
                    break; 
                case 24: // TIPOS DE OPERACION NO MONETARIAS
                    urlfinal = url + "/operacion";
                    break; 
                case 25: // UNIDADES
                    urlfinal = url + "/unidades/buscar?id=" + param1;
                    break; 
                case 26: // INDICES por descripcion
                    urlfinal = url + "/indices/id/" + param1;
                    break; 
                case 27: // INDICES por clave
                    urlfinal = url + "/indices/buscar?id=" + param1;
                    break; 
                case 28: case 32: // CLAVES POR nombre
                    param0 = param1.substring(0, param1.indexOf('&'));
                    param2 = param1.substring(param1.indexOf("2=") + 2);
                    urlfinal = url + "/conceptos/nombre?" + param0 + "&id2=" + URLEncoder.encode(param2, StandardCharsets.UTF_8.toString());
                    break;
                case 29: // benefici POR nombre
                    param0 = param1.substring(0, param1.indexOf('&'));
                    param2 = param1.substring(param1.indexOf("2=") + 2);
                    urlfinal = url + "/beneficiario/buscarnombre?" + param0 + "&id2=" + URLEncoder.encode(param2, StandardCharsets.UTF_8.toString());
                    break;
                case 30: // fideicom POR nombre
                    param0 = param1.substring(0, param1.indexOf('&'));
                    param2 = param1.substring(param1.indexOf("2=") + 2);                
                    urlfinal = url + "/fideicom/buscarnombre?" + param0 + "&id2=" + URLEncoder.encode(param2, StandardCharsets.UTF_8.toString());
                    break;
                case 31: // otros POR nombre
                    param0 = param1.substring(0, param1.indexOf('&'));
                    param2 = param1.substring(param1.indexOf("2=") + 2);                
                    urlfinal = url + "/Otros/buscarnombre?" + param0 + "&id2=" + URLEncoder.encode(param2, StandardCharsets.UTF_8.toString());
                    break;
                case 33: // tipo de cambio por fecha
                    urlfinal = url + "/tipocamb/buscar?" + param1;
                    break;            
                case 34: // se recupera conceptos por secuencial
                    urlfinal = url + "/conceptos/id/sec?" + param1;
                    break;             
                case 35: // se recupera la posicion
                    urlfinal = url + "/posicion/buscar?id=" + param1;
                    break;             
                case 36: // paises
                    urlfinal = url + "/paises";
                    break; 
                case 39: // cuentas por titular
                    param0 = param1.substring(0, param1.indexOf('&'));
                    param2 = param1.substring(param1.indexOf("2=") + 2);
                    urlfinal = url + "/cuentasinversion/consultatitular/id?id=" + param0 + "&id2=" + URLEncoder.encode(param2, StandardCharsets.UTF_8.toString());                
                    break;              
                case 40: // plazas por banco
                    urlfinal = url + "/plazas/buscar?id=" + param1;
                    break;
                case 41: // cuentas por cuenta y fiso
                    param0 = param1.substring(0, param1.indexOf('&'));
                    param2 = param1.substring(param1.indexOf("2=") + 2);
                    urlfinal = url + "/cuentasinversion/buscar/" + param0 + "/buscar2/" + param2;                
                    break;              
                case 42: // se recupera la posicion por fiso y contrato de posicion
                    param0 = param1.substring(0, param1.indexOf('&'));
                    param2 = param1.substring(param1.indexOf("2=") + 2);                
                    urlfinal = url + "/posicion/buscar/id?id=" + param0 + "&id2=" + URLEncoder.encode(param2, StandardCharsets.UTF_8.toString());                
                    break; 
                case 43: // se recuperan documentos por operacion
                    urlfinal = url + "/documento/buscar?id=" + param1;
                    break; 
                case 44: // vista1
                    urlfinal = url + "/vistas/vista1?id=" + param1;
                    break;
                case 45: // vista2
                    urlfinal = url + "/vistas/vista2?id2=" + param1;
                    break; 
                case 46: // vista3
                    urlfinal = url + "/vistas/vista3?id3=" + param1;
                    break; 
                case 47: // vista4
                    urlfinal = url + "/vistas/vista4?id4=" + param1;
                    break; 
                case 48: // vista5
                    urlfinal = url + "/vistas/vista5?id5=" + param1;
                    break; 
                case 49: // vista6
                    urlfinal = url + "/vistas/vista6?id6=" + param1;
                    break;   
                case 50: // datos archivos para visualizar pasando el folio
                    urlfinal = url + "/api/documentos/buscar?id=" + param1;
                    break;              
            }

            LOGGER.info("URL destino resuelta en MasterServices: {}", urlfinal);

            int timeoutMs = ConfigLoader.getTimeout() > 0 ? ConfigLoader.getTimeout() : 30000;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlfinal))
                    .timeout(Duration.ofMillis(timeoutMs))
                    .header("Authorization", "Bearer " + token)
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json, */*")
                    .GET()
                    .build();

            HttpResponse<String> response = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
            LOGGER.info("Respuesta backend recibida en MasterServices - Status Code: {}", response.statusCode());

            String jsoncadena = response.body();
            Gson gson = new GsonBuilder()
                .serializeNulls()
                .create();

            switch(caso) {
                case 1: // ParamGlobal
                    jsoncadena = jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                    LOGGER.info("Contenido JSON recibido (Caso 1): {}", jsoncadena);
                    ParamGlobal paramGlobal = gson.fromJson(jsoncadena, ParamGlobal.class);                        
                    LOGGER.info("GSON ParamGlobal paramValor: {}", paramGlobal.paramValor); 
                    resultado[0] = String.valueOf(paramGlobal.paramValor);
                    break;
                case 2: // f_usufid
                    jsoncadena = jsoncadena.trim();
                    LOGGER.info("Contenido JSON recibido (Caso 2): {}", jsoncadena);
                    Type listType = new TypeToken<List<FUsufidDTO>>(){}.getType();
                    List<FUsufidDTO> registros = gson.fromJson(jsoncadena, listType);
                    resultado = new String[registros.size()];
                    if (!registros.isEmpty()) {
                        resultado = registros.get(0).getContrato().toString().replaceAll("\\[","").split(",");
                    }
                    LOGGER.info("Longitud resultado fusufid: {}", resultado.length);
                    for (String nombre : resultado) {
                        LOGGER.info("Contrato fusufid: {}", nombre);
                    }
                    break;                
                case 3: // feccont
                    jsoncadena = jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                    LOGGER.info("Contenido JSON recibido (Caso 3): {}", jsoncadena);
                    Feccont fecha = gson.fromJson(jsoncadena, Feccont.class);                        
                    LOGGER.info("GSON feccont: {}", fecha.fcoFecha); 
                    resultado[0] = String.valueOf(fecha.fcoFecha);
                    break;
                case 4: // ParamGlobal se recupera valor2
                    jsoncadena = jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                    LOGGER.info("Contenido JSON recibido (Caso 4): {}", jsoncadena);
                    ParamGlobal valor2 = gson.fromJson(jsoncadena, ParamGlobal.class);                        
                    LOGGER.info("GSON ParamGlobal valor2: {}", valor2.paramValor2); 
                    resultado[0] = String.valueOf(valor2.paramValor2);
                    break;
                case 5: // fisos
                    jsoncadena = jsoncadena.trim();
                    LOGGER.info("Contenido JSON recibido (Caso 5): {}", jsoncadena);
                    Type listFisos = new TypeToken<List<Contrato>>(){}.getType();
                    List<Contrato> fisos = gson.fromJson(jsoncadena, listFisos);
                    resultado = fisos.toString().replaceAll("\\[","").split(",");
                    LOGGER.info("Longitud resultado fisos: {}", resultado.length);
                    break;  
                case 6: case 28: case 34: // conceptos
                    LOGGER.info("Contenido JSON recibido (Caso {}): {}", caso, jsoncadena);            
                    Type typeclaves = new TypeToken<List<ClavesDTO>>(){}.getType();
                    List<ClavesDTO> claves = gson.fromJson(jsoncadena, typeclaves);
                    resultado = new String[claves.size()];
                    cont = 0;
                    for (ClavesDTO item : claves) {
                        resultado[cont++] = item.toString();
                    }
                    LOGGER.info("Longitud resultado claves: {}", resultado.length);
                    break;                  
                case 7: // datos del fiso
                    jsoncadena = jsoncadena.trim();
                    LOGGER.info("Contenido JSON recibido (Caso 7): {}", jsoncadena);
                    Type listFisosid = new TypeToken<List<Contrato>>(){}.getType();
                    List<Contrato> fisosid = gson.fromJson(jsoncadena, listFisosid);
                    resultado = fisosid.toString().replaceAll("\\]","").replaceAll("\\[","").substring(
                        fisosid.toString().indexOf('-')).split(",");
                    LOGGER.info("Longitud listFisosid: {}", resultado.length);
                    break;  
                case 8:
                    LOGGER.info("Contenido JSON recibido (Caso 8): {}", jsoncadena);
                    Type typemonedas = new TypeToken<List<Monedas>>(){}.getType();
                    List<Monedas> monedas = gson.fromJson(jsoncadena, typemonedas);
                    resultado = new String[monedas.size()];
                    cont = 0;
                    for (Monedas item : monedas) {
                        resultado[cont++] = item.getMonNomMoneda();
                    }
                    break;
                case 9: case 30: // fideicom
                    LOGGER.info("Contenido JSON recibido (Caso {}): {}", caso, jsoncadena);
                    Type typefideicom = new TypeToken<List<FideicomDTO>>(){}.getType();
                    List<FideicomDTO> fideicom = gson.fromJson(jsoncadena, typefideicom);
                    resultado = new String[fideicom.size()];
                    cont = 0;
                    for (FideicomDTO item : fideicom) {
                        resultado[cont++] = item.toString();
                    }
                    break;             
                case 10: case 29: // benefici
                    LOGGER.info("Contenido JSON recibido (Caso {}): {}", caso, jsoncadena);
                    Type typebenefici = new TypeToken<List<BeneficiDTO>>(){}.getType();
                    List<BeneficiDTO> benefici = gson.fromJson(jsoncadena, typebenefici);
                    resultado = new String[benefici.size()];
                    cont = 0;
                    for (BeneficiDTO item : benefici) {
                        resultado[cont++] = item.toString();
                    }
                    break;             
                case 11: case 31: // otros
                    LOGGER.info("Contenido JSON recibido (Caso {}): {}", caso, jsoncadena);
                    Type typeterceros = new TypeToken<List<TercerosDTO>>(){}.getType();
                    List<TercerosDTO> terceros = gson.fromJson(jsoncadena, typeterceros);
                    resultado = new String[terceros.size()];
                    cont = 0;
                    for (TercerosDTO item : terceros) {
                        resultado[cont++] = item.toString();
                    }
                    break;   
                case 12: // folios
                    jsoncadena = jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                    LOGGER.info("Folio asignado recibido (Caso 12): {}", jsoncadena); 
                    resultado[0] = jsoncadena;
                    break;
                case 13:
                    LOGGER.info("Contenido JSON recibido (Caso 13): {}", jsoncadena);
                    Type typecueninv = new TypeToken<List<FCuentasInversion>>(){}.getType();
                    List<FCuentasInversion> inver = gson.fromJson(jsoncadena, typecueninv);
                    resultado = new String[inver.size()];
                    cont = 0;
                    for (FCuentasInversion item : inver) {
                        String urlMoneda = url + "/monedas/id/" + item.getFciMoneda();
                        LOGGER.info("Consultando Moneda Cto Inver: {}", urlMoneda);
                        HttpRequest requestmon = HttpRequest.newBuilder()
                                .uri(URI.create(urlMoneda))
                                .timeout(Duration.ofMillis(timeoutMs))
                                .header("Authorization", "Bearer " + token)
                                .header("Content-Type", "application/json")
                                .GET()
                                .build();
                         
                        HttpResponse<String> response2 = HTTP_CLIENT.send(requestmon, HttpResponse.BodyHandlers.ofString());                
                        String jsoncadena2 = response2.body();
                        String sNomMoneda = "";
                        Type typecuenmon2 = new TypeToken<List<Monedas>>(){}.getType();
                        List<Monedas> monedasnombre = gson.fromJson(jsoncadena2, typecuenmon2);
                        for (Monedas item2 : monedasnombre) {
                            sNomMoneda = item2.monNomMoneda;
                        }
                        resultado[cont++] = item.fciNumCta + "-" + item.fciNombreCta + "-" + sNomMoneda;
                    }
                    break;   
                case 14: case 41:
                    LOGGER.info("Contenido JSON recibido (Caso {}): {}", caso, jsoncadena);
                    Type typecueninv2 = new TypeToken<List<FCuentasInversion>>(){}.getType();
                    List<FCuentasInversion> inver2 = gson.fromJson(jsoncadena, typecueninv2);
                    resultado = new String[inver2.size()];
                    cont = 0;
                    for (FCuentasInversion item : inver2) {
                        resultado[cont++] = item.fciNumCta + "";
                    }                    
                    break;   
                case 15: // subfiso
                    LOGGER.info("Contenido JSON recibido (Caso 15): {}", jsoncadena);
                    Type typesubfiso = new TypeToken<List<FSubcuentaDTO>>(){}.getType();
                    List<FSubcuentaDTO> subfiso = gson.fromJson(jsoncadena, typesubfiso);
                    resultado = new String[subfiso.size()];
                    cont = 0;
                    for (FSubcuentaDTO item : subfiso) {
                        resultado[cont++] = item.toString();
                    }
                    break; 
                case 16: // personal
                    LOGGER.info("Contenido JSON recibido (Caso 16): {}", jsoncadena);
                    Type typepersonal = new TypeToken<List<Personal>>(){}.getType();
                    List<Personal> personal = gson.fromJson(jsoncadena, typepersonal);
                    resultado = new String[personal.size()];
                    cont = 0;
                    for (Personal item : personal) {
                        resultado[cont++] = item.toString();
                    }
                    break;
                case 18: // monedas por nombre
                    LOGGER.info("Contenido JSON recibido (Caso 18): {}", jsoncadena);
                    Type typemonedasn = new TypeToken<List<Monedas>>(){}.getType();
                    List<Monedas> monedasn = gson.fromJson(jsoncadena, typemonedasn);
                    resultado = new String[monedasn.size()];
                    cont = 0;
                    for (Monedas item : monedasn) {
                        resultado[cont++] = item.monNumPais + "";
                    }
                    for (String nombre : resultado) {
                        LOGGER.info("Moneda por nombre: {}", nombre);
                    }
                    break;
                case 19: // monedas y regresa el id y nombre
                    LOGGER.info("Contenido JSON recibido (Caso 19): {}", jsoncadena);
                    Type typemonedas2 = new TypeToken<List<Monedas>>(){}.getType();
                    List<Monedas> monedas2 = gson.fromJson(jsoncadena, typemonedas2);
                    resultado = new String[monedas2.size()];
                    cont = 0;
                    for (Monedas item : monedas2) {
                        resultado[cont++] = item.toString();
                    }
                    break;
                case 20: // ParamGlobal por nombre y regresa el paramvalor2
                    jsoncadena = jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                    LOGGER.info("Contenido JSON recibido (Caso 20): {}", jsoncadena);
                    ParamGlobal param = gson.fromJson(jsoncadena, ParamGlobal.class);                        
                    LOGGER.info("GSON ParamGlobal paramValor2: {}", param.paramValor2); 
                    resultado[0] = String.valueOf(param.paramValor2);
                    break;
                case 21: case 22: case 23: // parametrizacion no monetarias
                    LOGGER.info("Contenido JSON recibido (Caso {}): {}", caso, jsoncadena);
                    Type typeparamnom = new TypeToken<List<FConinsnomon>>(){}.getType();
                    List<FConinsnomon> insnomon = gson.fromJson(jsoncadena, typeparamnom);
                    resultado = new String[insnomon.size()];
                    cont = 0;
                    for (FConinsnomon item : insnomon) {
                        resultado[cont++] = item.id.conpIdConcepto + "-" + item.conpBase + "-" +
                            item.conpComentario + "-" + item.conpEstatus + "-" + item.conpNombre + "-" +
                            item.conpObligatorio + "-" + item.conpPadre + "-" + item.conpTabla + "-" +
                            item.conpTipoDato;
                    }
                    for (String nombre : resultado) {
                        LOGGER.info("Parametrizacion no monetaria: {}", nombre);
                    }
                    break;
                case 24: // operaciones no monetarias
                    LOGGER.info("Contenido JSON recibido (Caso 24): {}", jsoncadena);
                    Type typenomon = new TypeToken<List<FTipoper>>(){}.getType();
                    List<FTipoper> nomonetaria = gson.fromJson(jsoncadena, typenomon);
                    resultado = new String[nomonetaria.size()];
                    cont = 0;
                    for (FTipoper item : nomonetaria) {
                        resultado[cont++] = item.ftopNumOper + "-" +
                            (item.ftopBienes == null ? 0 : item.ftopBienes) + "-" +
                            item.ftopNombreTipoper + "-" +
                            (item.ftopAtencionDias == null ? "1" : item.ftopAtencionDias);
                    }
                    for (String nombre : resultado) {
                        LOGGER.info("Operacion no monetaria: {}", nombre);
                    }
                    break;
                case 25: // unidades
                    LOGGER.info("Contenido JSON recibido (Caso 25): {}", jsoncadena);
                    Type typeunidades = new TypeToken<List<FUnidades>>(){}.getType();
                    List<FUnidades> unidades = gson.fromJson(jsoncadena, typeunidades);
                    resultado = new String[unidades.size()];
                    cont = 0;
                    for (FUnidades item : unidades) {
                        resultado[cont++] = item.id.funiIdSubcuenta + "-" + item.funiTipo + "-" +
                            item.id.funiIdBien + "-" + item.id.funiIdEdificio + "-" + item.id.funiIdDepto;
                    }
                    for (String nombre : resultado) {
                        LOGGER.info("Unidad: {}", nombre);
                    }
                    break;
                case 26: // INDICES
                    jsoncadena = jsoncadena.replaceAll("\\]","").replaceAll("\\[","").trim();
                    LOGGER.info("Contenido JSON recibido (Caso 26): {}", jsoncadena);
                    FIndices indices = gson.fromJson(jsoncadena, FIndices.class);                        
                    LOGGER.info("GSON indices eindFormaEmp: {}", indices.eindFormaEmp); 
                    resultado[0] = String.valueOf(indices.eindFormaEmp);
                    break;
                case 27:
                    LOGGER.info("Contenido JSON recibido (Caso 27): {}", jsoncadena);
                    Type typeindiceclave = new TypeToken<List<FIndices>>(){}.getType();
                    List<FIndices> indicesclave = gson.fromJson(jsoncadena, typeindiceclave);
                    resultado = new String[indicesclave.size()];
                    cont = 0;
                    for (FIndices item : indicesclave) {
                        resultado[cont++] = item.id.eindIdSubindice + "-" + item.eindDescripcion;
                    }
                    break;
                case 32: // conceptos lim inf
                    LOGGER.info("Contenido JSON recibido (Caso 32): {}", jsoncadena);            
                    Type typeclaves2 = new TypeToken<List<ClavesDTO>>(){}.getType();
                    List<ClavesDTO> claves2 = gson.fromJson(jsoncadena, typeclaves2);
                    resultado = new String[claves2.size()];
                    cont = 0;
                    for (ClavesDTO item : claves2) {
                        resultado[cont++] = item.cveLiminfClave + "";
                    }
                    LOGGER.info("Longitud resultado claves liminf: {}", resultado.length);
                    break;
                case 33: // tipocambio
                    LOGGER.info("Contenido JSON recibido (Caso 33): {}", jsoncadena);            
                    Type typetipoc = new TypeToken<List<Tipocamb>>(){}.getType();
                    List<Tipocamb> tipocamb = gson.fromJson(jsoncadena, typetipoc);
                    resultado = new String[tipocamb.size()];
                    cont = 0;
                    for (Tipocamb item : tipocamb) {
                        resultado[cont++] = item.ticImpTipoCamb + "";
                    }
                    LOGGER.info("Longitud resultado tipocamb: {}", resultado.length);
                    break;
                case 35: case 42: // posicion por fiso y por fiso/ctoinver
                    LOGGER.info("Contenido JSON recibido (Caso {}): {}", caso, jsoncadena);            
                    Type typeposicion = new TypeToken<List<Posicion>>(){}.getType();
                    List<Posicion> posicion = gson.fromJson(jsoncadena, typeposicion);
                    resultado = new String[posicion.size()];
                    cont = 0;
                    for (Posicion item : posicion) {
                        resultado[cont++] = item.id.posContratoInter + "-" + item.posCostoHistoric;
                    }
                    LOGGER.info("Longitud resultado posicion: {}", resultado.length);
                    break;                
                case 36: // paises
                    LOGGER.info("Contenido JSON recibido (Caso 36): {}", jsoncadena);
                    Type typepaises = new TypeToken<List<Paises>>(){}.getType();
                    List<Paises> paises = gson.fromJson(jsoncadena, typepaises);
                    resultado = new String[paises.size()];
                    cont = 0;
                    for (Paises item : paises) {
                        resultado[cont++] = item.getPaiNomPais();
                    }
                    break;
                case 37: // otros
                    LOGGER.info("Contenido JSON recibido (Caso 37): {}", jsoncadena);
                    Type typetercerosnom = new TypeToken<List<TercerosDTO>>(){}.getType();
                    List<TercerosDTO> tercerosnom = gson.fromJson(jsoncadena, typetercerosnom);
                    resultado = new String[tercerosnom.size()];
                    cont = 0;
                    for (TercerosDTO item : tercerosnom) {
                        resultado[cont++] = item.terNomTercero;
                    }
                    break;  
                case 38: case 39: // cuentas de forma liquidacion spei
                    LOGGER.info("Contenido JSON recibido (Caso {}): {}", caso, jsoncadena);
                    Type typecueninv3 = new TypeToken<List<FCuentasInversion>>(){}.getType();
                    List<FCuentasInversion> inver3 = gson.fromJson(jsoncadena, typecueninv3);
                    resultado = new String[inver3.size()];
                    cont = 0;
                    for (FCuentasInversion item : inver3) {
                        resultado[cont++] = item.fciNumCta + "|CUENTA CHEQUES|" +
                            (item.fciClabe != null ? item.fciClabe : "SINCUENTACLABE");
                    } 
                    break;   
                case 40: // plazas por banco
                    LOGGER.info("Contenido JSON recibido (Caso 40): {}", jsoncadena);
                    Type typeplazas = new TypeToken<List<FPlazasBancoDTO>>(){}.getType();
                    List<FPlazasBancoDTO> plazas = gson.fromJson(jsoncadena, typeplazas);
                    resultado = new String[plazas.size()];
                    cont = 0;
                    for (FPlazasBancoDTO item : plazas) {
                        resultado[cont++] = item.fplbNombrePlaza;
                    }
                    break;                
                case 43: // documento por operacion
                    LOGGER.info("Contenido JSON recibido (Caso 43): {}", jsoncadena);            
                    Type typedocumento = new TypeToken<List<VistaDocumento>>(){}.getType();
                    List<VistaDocumento> documento = gson.fromJson(jsoncadena, typedocumento);
                    resultado = new String[documento.size()];
                    cont = 0;
                    for (VistaDocumento item : documento) {
                        resultado[cont++] = item.documento;
                    }
                    break;
                case 44: // vista1
                    LOGGER.info("Contenido JSON recibido (Caso 44): {}", jsoncadena);            
                    Type typev1 = new TypeToken<List<Vista1>>(){}.getType();
                    List<Vista1> v1 = gson.fromJson(jsoncadena, typev1);
                    resultado = new String[v1.size()];
                    cont = 0;
                    for (Vista1 item : v1) {
                        resultado[cont++] = item.estado;
                    }
                    break;
                case 45: // vista2
                    LOGGER.info("Contenido JSON recibido (Caso 45): {}", jsoncadena);            
                    Type typev2 = new TypeToken<List<Vista2>>(){}.getType();
                    List<Vista2> v2 = gson.fromJson(jsoncadena, typev2);
                    resultado = new String[v2.size()];
                    cont = 0;
                    for (Vista2 item : v2) {
                        resultado[cont++] = item.estado;
                    }
                    break;  
                case 46: // vista3
                    LOGGER.info("Contenido JSON recibido (Caso 46): {}", jsoncadena);            
                    Type typev3 = new TypeToken<List<Vista3>>(){}.getType();
                    List<Vista3> v3 = gson.fromJson(jsoncadena, typev3);
                    resultado = new String[v3.size()];
                    cont = 0;
                    for (Vista3 item : v3) {
                        resultado[cont++] = item.estado;
                    }
                    break;    
                case 47: // vista4
                    LOGGER.info("Contenido JSON recibido (Caso 47): {}", jsoncadena);            
                    Type typev4 = new TypeToken<List<Vista4>>(){}.getType();
                    List<Vista4> v4 = gson.fromJson(jsoncadena, typev4);
                    resultado = new String[v4.size()];
                    cont = 0;
                    for (Vista4 item : v4) {
                        resultado[cont++] = item.estado;
                    }
                    break;                  
                case 48: // vista5
                    LOGGER.info("Contenido JSON recibido (Caso 48): {}", jsoncadena);            
                    Type typev5 = new TypeToken<List<Vista5>>(){}.getType();
                    List<Vista5> v5 = gson.fromJson(jsoncadena, typev5);
                    resultado = new String[v5.size()];
                    cont = 0;
                    for (Vista5 item : v5) {
                        resultado[cont++] = item.estado;
                    }
                    break; 
                case 49: // vista6
                    LOGGER.info("Contenido JSON recibido (Caso 49): {}", jsoncadena);            
                    Type typev6 = new TypeToken<List<Vista6>>(){}.getType();
                    List<Vista6> v6 = gson.fromJson(jsoncadena, typev6);
                    resultado = new String[v6.size()];
                    cont = 0;
                    for (Vista6 item : v6) {
                        resultado[cont++] = item.estado;
                    }
                    break; 
                case 50: // recuperacion de datos de documento a visualizar
                    LOGGER.info("Contenido JSON recibido (Caso 50): {}", jsoncadena);            
                    Type typevdoc = new TypeToken<List<PdfDocument>>(){}.getType();
                    List<PdfDocument> datosdocumento = gson.fromJson(jsoncadena, typevdoc);
                    resultado = new String[datosdocumento.size()];
                    cont = 0;
                    for (PdfDocument item : datosdocumento) {
                        resultado[cont++] = item.nombre + "-" + item.filePath + "-" + item.contentType;
                    }
                    break;                 
            }
        } catch (Exception e) {
            LOGGER.error("Error al consumir servicio en MasterServices (Caso {}): {}", caso, e.getMessage(), e);
        }

        LOGGER.info("Consumo finalizado en MasterServices - Caso: {}, Elementos en resultado: {}", 
                caso, (resultado != null ? resultado.length : 0));
        return resultado;
    }

    public static String generateToken(String secretKey, String subject) {
        byte[] keyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
        Key key = Keys.hmacShaKeyFor(keyBytes);

        return Jwts.builder()
                .setSubject(subject)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600000)) // 1 hora
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
}
