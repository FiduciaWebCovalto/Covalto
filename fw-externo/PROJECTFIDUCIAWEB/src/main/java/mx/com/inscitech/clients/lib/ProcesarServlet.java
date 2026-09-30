package mx.com.inscitech.clients.lib;

import java.io.PrintWriter;

// ProcesarServlet.java
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import mx.com.inscitech.clients.daos.FContratoDAO;
import mx.com.inscitech.clients.daos.FContratoDATODTO;
import mx.com.inscitech.clients.daos.FConceptosDAO;
import mx.com.inscitech.clients.daos.MapeoTabla;
import mx.com.inscitech.clients.domain.Accion;
import mx.com.inscitech.clients.domain.FCatmaesFideic;

import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponseWrapper;

import java.io.BufferedReader;

import java.util.List;
import java.util.stream.Collectors;


@WebServlet("/procesarDatos")
public class ProcesarServlet extends HttpServlet {
    int conta=0;
    String sAccion="";
    @Override
       protected void doPost(HttpServletRequest request, HttpServletResponse response) 
               throws ServletException, IOException {
           
           // 1. Leer el JSON enviado en el cuerpo de la petición
           StringBuilder buffer = new StringBuilder();
           String line;
           try (BufferedReader reader = request.getReader()) {
               while ((line = reader.readLine()) != null) {
                   buffer.append(line);
               }
           }
           String jsonData = buffer.toString();
            System.out.println("jsondata "+jsonData);
           // 2. Procesar con GSON
           Gson gson = new Gson();
           Accion accion = gson.fromJson(jsonData, Accion.class);
           accion.getAccion();
           // Obtenemos un parámetro que identifica la acción
           //String accion = request.getParameter("accion");
           System.out.println("accion: "+accion.getAccion());
           sAccion=accion.getAccion();
           if (sAccion == null) {
               response.getWriter().println("Acción no especificada");
           } else if (sAccion.equals("usuariofideicomiso")) {//asignacion de fideicomisos a usuario

               FContratoDAO productosSeleccionados = gson.fromJson(jsonData, FContratoDAO.class);
    
               FContratoDAO inserta = new FContratoDAO();
    
               //System.out.println("Usuario: " + data.getUsuarioId());
               for (FContratoDATODTO item : productosSeleccionados.getFilasSeleccionadas()) {
                   inserta.asignarquitarFideicomiso(item.getFiso(),item.getUsuario(),
                                                    productosSeleccionados.getOpcion());
                   conta++;
               }
               
           } else if (sAccion.equals("fisoconceptos")) {//asignacion de conceptos a fisos
               FConceptosDAO conceptos = gson.fromJson(jsonData, FConceptosDAO.class);
               FConceptosDAO bd = new FConceptosDAO();
               if(conceptos.getOpcion()==1){
                       for (MapeoTabla item : conceptos.getFilasSeleccionadas()) {
                           System.out.println("clave:"+item.getFcmaIdSecCatma());
                           System.out.println("sclave:"+item.getConcepto());
                           System.out.println("desclave:"+conceptos.getFfidIdFideicomiso().replaceAll(" ", ""));
                           conta=bd.asignarConcepto(item.getFcmaIdSecCatma(),
                                                     item.getConcepto(),
                                                     conceptos.getFfidIdFideicomiso().replaceAll(" ", ""));
                           conta++;
                       }
                   }//asigna concepto
                    
               else{
                       for (MapeoTabla item : conceptos.getFilasSeleccionadas()) {
                           conta=bd.quitarConcepto(item.getFcmaIdSecCatma(),
                                                     item.getConcepto(),
                                                     conceptos.getFfidIdFideicomiso().replaceAll(" ", ""));
                           conta++;
                       }
                   }//asigna concepto//quita concepto
           } else {
               response.getWriter().println("Acción desconocida");
           }

           // 4. Enviar respuesta JSON
           response.setContentType("application/json");
           response.setCharacterEncoding("UTF-8");
           String jsonResponse = gson.toJson(conta);
           response.getWriter().write(jsonResponse);
       }
}