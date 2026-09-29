package com.bancomext.lib;

import com.bancomext.domain.FBienesValor;
import com.bancomext.domain.FBienesValorDTO;
import com.bancomext.domain.FBitacora;
import com.bancomext.domain.FBitacoraDTO;
import java.io.IOException;
import com.google.gson.Gson;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.bancomext.domain.FBitacoraSol;
import com.bancomext.domain.FBitacoraSolDTO;
import com.bancomext.domain.FConinsnomonValorDTO;
import com.bancomext.domain.FConinsnomonValor;
import com.bancomext.domain.FCtoinvRetDTO;
import com.bancomext.domain.FCtoinvRet;
import com.bancomext.domain.FDeposito;
import com.bancomext.domain.FInstComp;
import com.bancomext.domain.FInversion;
import com.bancomext.domain.FRetComp2;
import com.bancomext.domain.FRetiro;
import com.bancomext.domain.FTraspaso;
import com.bancomext.domain.Instrucc;
import com.google.gson.GsonBuilder;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializer;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.ZoneOffset;


public class serviciosenvio extends servicios{

    public int consumo(int caso,String []param1) {
        String apiUrlc = ConfigLoader.getUrl();
        System.out.println("apiUrl de archivo config "+apiUrlc);        
        String url=apiUrlc;
        String jsonPayload="";
        int respuesta=0;
        int numTipoPersona=0,tipoopera=0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
                    // 1. Configuración de datos
                    String apiUrl = "";
                    //String tokenenv = "dennis123456789phegon123456789den1234321";
                    String email = "Inmuebles@trustechcapitalmexico.com";
                    String token = generateToken(secret, "Inmuebles@trustechcapitalmexico.com");                    
                    Gson gson = new GsonBuilder()
                        .registerTypeAdapter(OffsetDateTime.class, (JsonSerializer<OffsetDateTime>) (src, typeOfSrc, context) -> 
                            new JsonPrimitive(src.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)))
                        .registerTypeAdapter(OffsetDateTime.class, (JsonDeserializer<OffsetDateTime>) (json, typeOfT, context) -> 
                            OffsetDateTime.parse(json.getAsString(), DateTimeFormatter.ISO_OFFSET_DATE_TIME))
                        .create();
                    /*for (String datosenviados : param1) {
                        System.out.println("datosenviados envio "+datosenviados);
                    }*/
                        switch(caso){
                            case 1://bienes
                                    apiUrl = url+"/bienes";
                                    // 2. Crear objeto compuesto y cuerpo
                                    FBienesValorDTO keybienes = 
                                    new FBienesValorDTO(param1[0],new BigDecimal(param1[1]),param1[2]);
                                    FBienesValor bienes = new FBienesValor(keybienes);
                                    // 3. Serializar objeto a JSON usando Gson
                                    jsonPayload = gson.toJson(bienes);
                                break;
                            case 2://fbitacora
                                    apiUrl = url+"/fbitacora";
                                    // 2. Crear objeto compuesto y cuerpo
                                    // parse() usa ISO_OFFSET_DATE_TIME por defecto  
                                    
                                    FBitacoraDTO keyfbitacora = new FBitacoraDTO(new BigDecimal(param1[1]),
                                                LocalDate.parse(param1[0], formatter).
                                                atStartOfDay(ZoneOffset.UTC).toOffsetDateTime()
                                                                                 , param1[2]);
                                    FBitacora fbitacora = new FBitacora(keyfbitacora,param1[3]);
                                    // 3. Serializar objeto a JSON usando Gson
                                    jsonPayload = gson.toJson(fbitacora);                            
                                break;
                            case 3://fbitacorasol
                                    apiUrl = url+"/fbitacorasol";
                                    // 2. Crear objeto compuesto y cuerpo
                                    // parse() usa ISO_OFFSET_DATE_TIME por defecto                         
                                    FBitacoraSolDTO keyfbitacorasol = new 
                                        FBitacoraSolDTO( Long.parseLong(param1[0]),  new BigDecimal(param1[1])
                                                         , new BigDecimal(param1[3]));
                                    FBitacoraSol fbitacorasol = new FBitacoraSol
                                        (new BigDecimal(param1[2]),
                                        LocalDate.parse(param1[4], formatter).
                                        atStartOfDay(ZoneOffset.UTC).toOffsetDateTime()
                                         , null,"", new BigDecimal("0"), keyfbitacorasol);
                            
                                    // 3. Serializar objeto a JSON usando Gson
                                    jsonPayload = gson.toJson(fbitacorasol);                            
                                 break;   
                            case 4://instruccion no monetaria
                                    apiUrl = url+"/nomonvalor";
                                    // 2. Crear objeto compuesto y cuerpo
                                    // parse() usa ISO_OFFSET_DATE_TIME por defecto                          
                            
                                    FConinsnomonValorDTO keynomon = new 
                                        FConinsnomonValorDTO(param1[0], new BigDecimal(param1[1])
                                                             , new BigDecimal(param1[2]));
                                    FConinsnomonValor nomon = new FConinsnomonValor
                                        (param1[3], keynomon);
                            
                                    // 3. Serializar objeto a JSON usando Gson
                                    jsonPayload = gson.toJson(nomon);                            
                                 break;  
                            case 5://cto inver por fiso
                                    apiUrl = url+"/retinver";
                                    // 2. Crear objeto compuesto y cuerpo
                                    // parse() usa ISO_OFFSET_DATE_TIME por defecto  
                                    System.out.println("ctoinver: "+param1[0]);
                                    System.out.println("folio: "+param1[1]);
                                    FCtoinvRetDTO keyctoinver = new 
                                    FCtoinvRetDTO(Long.parseLong(param1[0]), Long.parseLong(param1[1]));
                                    FCtoinvRet ctoinver = new FCtoinvRet
                                        (new BigDecimal((param1[2].length()==0?"0":param1[2])), keyctoinver);
                            
                                    // 3. Serializar objeto a JSON usando Gson
                                    jsonPayload = gson.toJson(ctoinver);                            
                                 break;                          
                            case 6://deposito
                                    apiUrl = url+"/deposito";
                                    // 2. Crear objeto compuesto y cuerpo
                                    // parse() usa ISO_OFFSET_DATE_TIME por defecto   
                                    if (param1[7].equals("FIDEICOMITENTE"))
                                      numTipoPersona=1;
                                    else if (param1[7].equals("BENEFICIARIO")||param1[7].equals("FIDEICOMISARIO"))  
                                      numTipoPersona=2;
                                    else
                                      numTipoPersona=3;
                                        FDeposito deposito = new FDeposito
                                        (Long.parseLong(param1[1]), new BigDecimal((param1[9].length()==0?"0":param1[9])),
                                        LocalDate.parse(param1[17], formatter).
                                        atStartOfDay(ZoneOffset.UTC).toOffsetDateTime(),
                                         new BigDecimal(((param1[8].length()==0?"0":param1[8]).replaceAll(" ","").
                                                                   equals("SeleccionaCuentadeCheque")?"0":param1[8])), 
                                         new BigDecimal((param1[10].length()==0?"0":param1[10])), 
                                         new BigDecimal((param1[4].length()==0?"0":param1[4])),
                                        new BigDecimal((param1[19].length()==0?"0":param1[19])), 
                                         param1[15], "ACTIVO", new BigDecimal(numTipoPersona),
                                        new BigDecimal((param1[5].length()==0?"0":param1[5]).replaceAll(" ","")),
                                         new BigDecimal((param1[3].length()==0?"0":param1[3])), 
                                         new BigDecimal((param1[21].length()==0?"0":param1[21])),
                                        new BigDecimal("0"), 
                                         new BigDecimal((param1[22].length()==0?"0":param1[22])),
                                         new BigDecimal((param1[23].length()==0?"0":param1[23])));
                            
                                    // 3. Serializar objeto a JSON usando Gson
                                    jsonPayload = gson.toJson(deposito);                            
                                 break;     
                            case 7://inst comp
                                    apiUrl = url+"/instcomp";
                                    // 2. Crear objeto compuesto y cuerpo
                                    // parse() usa ISO_OFFSET_DATE_TIME por defecto 
                                    FInstComp inscomp = new FInstComp();
                                        if(Integer.valueOf(param1[0]).intValue()==1)//depositos
                                        {
                                            inscomp= new FInstComp
                                            (Long.parseLong(param1[1]), param1[2], param1[3], "","", "", "", "","", "", "", "","");
                                        }else if(Integer.valueOf(param1[0]).intValue()==2)//depositos
                                        {
                                                inscomp= new FInstComp
                                                (Long.parseLong(param1[1]), "", "", param1[3],
                                                                     param1[2], param1[4], param1[5], param1[6],
                                                                     param1[7], param1[8], param1[9], param1[10],
                                                                param1[11]);
                                        }
                                    // 3. Serializar objeto a JSON usando Gson
                                    jsonPayload = gson.toJson(inscomp);                            
                                 break;                          
                            case 8://inversion
                                    apiUrl = url+"/inversion";
                                    // 2. Crear objeto compuesto y cuerpo
                                    // parse() usa ISO_OFFSET_DATE_TIME por defecto 
                                    FInversion inversion = new FInversion
                                            (Long.parseLong(param1[1]),new BigDecimal( param1[0]), new BigDecimal(param1[2]),
                                             new BigDecimal(param1[3]),param1[4], new BigDecimal(param1[5]), param1[6],
                                                                  param1[7], param1[8], param1[9],
                                                                  param1[10], param1[11], param1[12], param1[13],
                                                                  param1[14], param1[15], param1[16], param1[17],
                                                                  param1[18], param1[19], param1[20], param1[21],
                                                                  param1[22]);
                                    // 3. Serializar objeto a JSON usando Gson
                                    jsonPayload = gson.toJson(inversion);                            
                                 break;   
                            case 9://ret comp 2
                                    apiUrl = url+"/retcomp2";
                                    // 2. Crear objeto compuesto y cuerpo
                                    // parse() usa ISO_OFFSET_DATE_TIME por defecto                           
                                    FRetComp2 retcomp2 = new FRetComp2
                                        (Long.parseLong(param1[1]), param1[100], param1[101], "", "",
                                                 "", "", param1[102], param1[103],
                                                param1[104], param1[105], param1[106], param1[107], param1[108],
                                                 param1[109],param1[110], param1[111], param1[112]);
                                    // 3. Serializar objeto a JSON usando Gson
                                    jsonPayload = gson.toJson(retcomp2);                            
                                 break;             
                            case 10://retiro
                                    apiUrl = url+"/retiro";
                                    // 2. Crear objeto compuesto y cuerpo
                                    // parse() usa ISO_OFFSET_DATE_TIME por defecto                           
                                    FRetiro retiro = new FRetiro
                                    (Long.parseLong(param1[1])  , new BigDecimal((param1[4].length()==0?"0":param1[4])),                                                
                                     LocalDate.parse(param1[0], formatter).
                                                atStartOfDay(ZoneOffset.UTC).toOffsetDateTime() , 
                                     new BigDecimal((param1[55].length()==0?"0":param1[55])),
                                        param1[6],
                            LocalDate.parse(param1[0], formatter).
                            atStartOfDay(ZoneOffset.UTC).toOffsetDateTime(), (param1[57].equals("1")?true:false), param1[58]
                                        , new BigDecimal((param1[2].length()==0?"0":param1[2])),
                                        new BigDecimal((param1[48].length()==0?"0":param1[48])),
                                        new BigDecimal((param1[7].length()==0?"0":param1[7])), "ACTIVO",
                                        param1[51], param1[10], param1[9]
                                        , param1[10],
                                        param1[11], param1[10],
                                        param1[12], param1[8],
                                        new BigDecimal((param1[13].length()==0?"0":param1[13])),param1[14],
                                        new BigDecimal("1"),//HAY QUE BUSCAR LA CLAVE DE LA MONEDA
                                        new BigDecimal((param1[4].length()==0?"0":param1[4])), param1[16],
                                        (param1[59].equals("1")?true:false), param1[17], param1[18],
                                        param1[19], param1[20], param1[21],
                                        new BigDecimal((param1[60].length()==0?"0":param1[60])), new BigDecimal("0"),
                                        param1[61], new BigDecimal((param1[63].length()==0?"0":param1[63])),
                                        new BigDecimal((param1[64].length()==0?"0":param1[64])));
                                    // 3. Serializar objeto a JSON usando Gson
                                    jsonPayload = gson.toJson(retiro);
                                 break;                            
                            case 11://traspaso
                                    apiUrl = url+"/traspaso";
                                    // 2. Crear objeto compuesto y cuerpo
                                    // parse() usa ISO_OFFSET_DATE_TIME por defecto                           
                                    FTraspaso traspaso = new FTraspaso
                                    (Long.parseLong(param1[0]), new BigDecimal((param1[1].length()==0?"0":param1[1])),
                                                new BigDecimal((param1[2].length()==0?"0":param1[2])),
                                                 new BigDecimal((param1[3].length()==0?"0":param1[3])), 
                                                 new BigDecimal((param1[4].length()==0?"0":param1[4])), param1[5],
                                                 new BigDecimal("0"), new BigDecimal("0"),
                                                    LocalDate.parse(param1[6], formatter).
                                                    atStartOfDay(ZoneOffset.UTC).toOffsetDateTime(),
                                                 new BigDecimal((param1[7].length()==0?"0":param1[7])),
                                                 new BigDecimal((param1[8].length()==0?"0":param1[8])), "");
                                    // 3. Serializar objeto a JSON usando Gson
                                    jsonPayload = gson.toJson(traspaso);                            
                                 break;  
                            case 12://instruc
                                    String sOperacion="";
                                    apiUrl = url+"/instruc";
                                    // 2. Crear objeto compuesto y cuerpo
                                    // parse() usa ISO_OFFSET_DATE_TIME por defecto  
                                    Instrucc instruccion = new Instrucc();

                                    if(Integer.valueOf(param1[0]).intValue()==1){//depositos
                                        instruccion = new Instrucc
                                        (Long.parseLong(param1[2]), new BigDecimal(param1[1]), new BigDecimal("0"), "",
                                        "RECEPCION INTERNET", new BigDecimal("0"), "0", new BigDecimal(param1[3]),
                                        new BigDecimal(param1[4]), new BigDecimal(param1[5]), new BigDecimal(param1[3]),
                                        new BigDecimal(param1[4]), new BigDecimal(param1[5]), param1[6], "",
                                        null, null, false, "",
                                        param1[7]);                                          
                                    }else if(Integer.valueOf(param1[0]).intValue()==2){//retiros
                                        if(param1[7].equals("3"))//SPEI
                                            sOperacion="10002";
                                        else if(param1[7].equals("31"))//EXPEDICION CHEQUE DE CAJA
                                            sOperacion="10008";
                                        else if(param1[7].equals("11"))//DEPOSITO CON CHEQUES PROPIOS
                                            sOperacion="10009";
                                        else if(param1[7].equals("2"))//CHEQUE OTRO BANCO
                                            sOperacion="10010";
                                        else if(param1[7].equals("21"))//SWIFT
                                            sOperacion="10015";

                                        instruccion = new Instrucc
                                        (Long.parseLong(param1[2]), 
                                         new BigDecimal((param1[1].length()==0?"0":param1[1])), new BigDecimal("0"), "",
                                        "LIQUIDACION INTERNET", new BigDecimal("0"), "0", 
                                         new BigDecimal((param1[3].length()==0?"0":param1[3])),
                                         new BigDecimal((param1[4].length()==0?"0":param1[4])), 
                                         new BigDecimal((param1[5].length()==0?"0":param1[5])), 
                                         new BigDecimal((param1[3].length()==0?"0":param1[3])),
                                         new BigDecimal((param1[4].length()==0?"0":param1[4])),
                                         new BigDecimal((param1[5].length()==0?"0":param1[5])), 
                                         param1[6], "",
                                        null, null, false, "",
                                        sOperacion);                                        
                                    }else if(Integer.valueOf(param1[0]).intValue()==3){//inversion
                                        instruccion = new Instrucc
                                        (Long.parseLong(param1[2]), new BigDecimal(param1[1]), new BigDecimal("0"), "",
                                        "INVERSION INTERNET", new BigDecimal("0"), "0", 
                                        new BigDecimal((param1[3].length()==0?"0":param1[3])),
                                        new BigDecimal((param1[4].length()==0?"0":param1[4])), 
                                        new BigDecimal((param1[5].length()==0?"0":param1[5])), 
                                        new BigDecimal((param1[3].length()==0?"0":param1[3])),
                                        new BigDecimal((param1[4].length()==0?"0":param1[4])),
                                        new BigDecimal((param1[5].length()==0?"0":param1[5])), 
                                         param1[6], "",
                                        null, null, false, "",
                                        param1[7] );                                        
                                    }else if(Integer.valueOf(param1[0]).intValue()==4){//traspaso
                                        instruccion = new Instrucc
                                        (Long.parseLong(param1[2]), new BigDecimal(param1[1]), new BigDecimal("0"), "",
                                        "TRASPASO INTERNET", new BigDecimal("0"), "0", 
                                        new BigDecimal((param1[3].length()==0?"0":param1[3])),
                                        new BigDecimal((param1[4].length()==0?"0":param1[4])), 
                                        new BigDecimal((param1[5].length()==0?"0":param1[5])), 
                                        new BigDecimal((param1[3].length()==0?"0":param1[3])),
                                        new BigDecimal((param1[4].length()==0?"0":param1[4])),
                                        new BigDecimal((param1[5].length()==0?"0":param1[5])), 
                                         param1[6], "",
                                        null, null, false, "",param1[7]);                                        
                                    }else if(Integer.valueOf(param1[0]).intValue()==5){//no monetaria
                                        instruccion = new Instrucc
                                        (Long.parseLong(param1[2]), new BigDecimal(param1[1]), new BigDecimal("0"), "",
                                        "INSTRUCCION NO MONETARIA", new BigDecimal("0"), "0", 
                                        new BigDecimal((param1[3].length()==0?"0":param1[3])),
                                        new BigDecimal((param1[4].length()==0?"0":param1[4])), 
                                        new BigDecimal((param1[5].length()==0?"0":param1[5])), 
                                        new BigDecimal((param1[3].length()==0?"0":param1[3])),
                                        new BigDecimal((param1[4].length()==0?"0":param1[4])),
                                        new BigDecimal((param1[5].length()==0?"0":param1[5])),  
                                         param1[6], "",
                                        null, null, false, "",param1[7]);                                        
                                    }
                            

                                    
                                    // 3. Serializar objeto a JSON usando Gson
                                    jsonPayload = gson.toJson(instruccion);                            
                                 break;  

                        }
                        System.out.println("JSON a enviar: " + jsonPayload);            


                    

                    // 4. Configurar HttpClient
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(apiUrl))
                            .header("Content-Type", "application/json")
                            .header("Authorization", "Bearer " + token) // Token de seguridad
                            .header("X-User-Email", email)              // Correo en header
                            .POST(HttpRequest.BodyPublishers.ofString(jsonPayload))
                            .build();

                    // 5. Enviar la solicitud
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    // 6. Imprimir respuesta
                    System.out.println("Status Code: " + response.statusCode());
                    System.out.println("Respuesta: " + response.body());
                    //respuesta exitosa
                    if(response.statusCode()>=200&&response.statusCode()<=299)
                        respuesta=0;
                    else
                        respuesta=1;


                } catch (Exception e) {
                    e.printStackTrace();
                }
                return respuesta;
    }

}
