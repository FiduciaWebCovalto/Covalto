package mx.com.inscitech.clients.daos;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.StringTokenizer;
import mx.com.inscitech.clients.negocio.nFiducia;
import mx.com.inscitech.clients.lib.MasterServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// LogicaNegocio.java

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)

public class FContratoDAO 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(FContratoDAO.class);

  Connection connection = null;
  Statement statement = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;
  String[] resultado  ={null};
  String[] elemento = {null};
  String[] resultadoFiltrado= {null};
  String[] sArregloOriginal={null},sArregloAsignado={null};
  
    private List<FContratoDATODTO> filasSeleccionadas;
    public int opcion;
  
    public void setFilasSeleccionadas(List<FContratoDATODTO>  filasSeleccionadas){this.filasSeleccionadas=filasSeleccionadas;}
    public List<FContratoDATODTO>  getFilasSeleccionadas(){return this.filasSeleccionadas;}

    public void setOpcion(int opcion){this.opcion=opcion;}
    public int getOpcion(){return this.opcion;}

  /**
   * 
   * @return 
   * @param ctoNomContrato
   * @param ctoNumContrato
   * @param fusuIdUsuario
   */
  public String generarTablaFideicomisosDisponibles(String fusuIdUsuario, String ctoNumContrato, String ctoNomContrato) 
  { 
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    int value = 0;
    String []nomFiso= new String[1];
    try {
          //se recuperan los fisos
          MasterServices serv = new MasterServices();
          MasterServices serv2 = new MasterServices();
          resultado=serv.consumo(5,"");
          
          stringBufferSQL.append("SELECT FFID_ID_FIDEICOMISO ");
          stringBufferSQL.append("FROM F_USUFID "); 
          stringBufferSQL.append("WHERE FUSU_ID_USUARIO = ?");
          nFiducia fiduciaConnection = new nFiducia();
          fiduciaConnection.conectarBD();
          connection = fiduciaConnection.conBD;
          preparedStatement = connection.prepareStatement(stringBufferSQL.toString(), ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
          preparedStatement.setString(1, fusuIdUsuario);
          resultSet = preparedStatement.executeQuery();   
          if (resultSet.last()) {
              value = resultSet.getRow();
              ////LOGGER.debug("Total de registros Disponible: " + value);
              resultSet.beforeFirst(); // Volver al inicio para poder iterar
          }
          sArregloAsignado= new String[value];
          int recorrido=0;
          while (resultSet.next()) 
          { 
              //se recuperan el nombre del fiso
              nomFiso=serv.consumo(7,resultSet.getString(1));
              sArregloAsignado[recorrido]=resultSet.getString(1)+"-"+nomFiso[0];
              //LOGGER.debug("\"Disponible  sArregloAsignado: "+sArregloAsignado[recorrido]);              
              nomFiso=null;
              recorrido++;
          }
          if (preparedStatement != null)
            preparedStatement.close();
          if (resultSet != null)
            resultSet.close();
          if (connection != null)
            connection.close();

          if(ctoNumContrato!=null&&ctoNumContrato.length()>0){ 
            //LOGGER.debug("ctoNumContrato: " + ctoNumContrato);                
            resultadoFiltrado = Arrays.stream(resultado) // Crear Stream
              .filter(n -> n.contains(ctoNumContrato))   // Filtrar por coincidencia
              .toArray(String[]::new);
          }
          //LOGGER.debug("resultadoFiltrado: " + resultadoFiltrado.length);
          if(resultadoFiltrado.length>0&&resultadoFiltrado[0]!=null)
            resultado=resultadoFiltrado;
          //Al arreglo con la clave consultada se le quitan las claves asignadas al fiso
          resultado=regresaArregoFiltrado(resultado,sArregloAsignado);

        for (String subconjunto : resultado) {
            if (subconjunto != null) {
                elemento=subconjunto.split("-");  
                //LOGGER.debug("Disponibles: " + subconjunto);
                sbTabla.append("<tr >");
                sbTabla.append("<td><input type=\"checkbox\" class=\"row-check\"></td>");
                sbTabla.append("<td class=\"usuario\">"+ (fusuIdUsuario==null?"":fusuIdUsuario) +"</td>");            
                sbTabla.append("<td class=\"fiso\">"+ (elemento[0]==null?"":elemento[0]) +"</td>");
                sbTabla.append("<td class=\"nombre\">"+ (elemento[1]==null?"":elemento[1]) +"</td>");
                sbTabla.append("</tr>");
            }        
        }
        
      } catch (Exception e) {
          LOGGER.error("Exception: ", e);
      }
      ////LOGGER.debug(sbTabla.toString());
    return sbTabla.toString();
  }


public String generaTablaFideicomisosAsignados(String fusuIdUsuario) 
{
    StringBuffer sbTabla = new StringBuffer(),stringBufferSQL = new StringBuffer();   
    int value=0;
    String []nomFiso= new String[1];

    try {
          MasterServices serv = new MasterServices();
          stringBufferSQL.append("SELECT FFID_ID_FIDEICOMISO ");
          stringBufferSQL.append("FROM F_USUFID "); 
          stringBufferSQL.append("WHERE FUSU_ID_USUARIO = ?");
          nFiducia fiduciaConnection = new nFiducia();
          fiduciaConnection.conectarBD();
          connection = fiduciaConnection.conBD;
          preparedStatement = connection.prepareStatement(stringBufferSQL.toString(), ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
          preparedStatement.setString(1, fusuIdUsuario);
          resultSet = preparedStatement.executeQuery();   
          if (resultSet.last()) {
              value = resultSet.getRow();
              //LOGGER.debug("Total de registros: " + value);
              resultSet.beforeFirst(); // Volver al inicio para poder iterar
          }
          resultado= new String[value];
          int recorrido=0;
          while (resultSet.next()) 
          { 
              //se recuperan el nombre del fiso
              //LOGGER.debug("Fiso Asignado: "+resultSet.getString(1));
              nomFiso=serv.consumo(7,resultSet.getString(1));
              resultado[recorrido]=resultSet.getString(1)+"-"+nomFiso[0];
              //LOGGER.debug("sArregloAsignado: "+resultado[recorrido]);              
              nomFiso=null;
              recorrido++;
          }
          if (preparedStatement != null)
            preparedStatement.close();
          if (resultSet != null)
            resultSet.close();
          if (connection != null)
            connection.close();

          //LOGGER.debug("Longitud Arreglo asignado:"+resultado.length);  
          for (String subconjunto : resultado) {
              if (subconjunto != null) {
                  elemento=subconjunto.split("-");  
                  //LOGGER.debug("Asignado: " + subconjunto);
                  
                  sbTabla.append("<tr>");
                  sbTabla.append("<td><input type=\"checkbox\" class=\"row-check\"></td>");
                  sbTabla.append("<td class=\"usuario\">"+ (fusuIdUsuario==null?"":fusuIdUsuario) +"</td>");
                  sbTabla.append("<td class=\"fiso\">"+ (elemento[0]==null?"":elemento[0]) +"</td>");
                  sbTabla.append("<td class=\"nombre\">"+ (elemento[1]==null?"":elemento[1]) +"</td>");
                  sbTabla.append("</tr>");
              }

          }
      } catch (Exception e) {
          LOGGER.error("Exception: ", e);
      }
      ////LOGGER.debug(sbTabla.toString());
    return sbTabla.toString();
}

 //opcion 1 para agregar opcion 2 para quitar
  public int asignarquitarFideicomiso(String fideicomisoAsignar,String fusuIdUsuario,int opcion) 
  {
      //String fideicomisoAsignar="";
      //String fusuIdUsuario="";
    StringBuffer sbSQL = new StringBuffer();
    int resultado = 0;
    StringTokenizer st = new StringTokenizer(fideicomisoAsignar, "|");
    try 
    {
        LOGGER.debug("Opcion para asignar fisos: "+String.valueOf(opcion));
         LOGGER.debug("fideicomisoAsignar: "+fideicomisoAsignar);
         LOGGER.debug("fusuIdUsuario: "+fusuIdUsuario);
        if(opcion==1)  {
          sbSQL.append("INSERT INTO F_USUFID (FFID_ID_FIDEICOMISO, FUSU_ID_USUARIO) ");
          sbSQL.append("VALUES (?, ?) ");
        }else{
            sbSQL.append("DELETE FROM F_USUFID ");
            sbSQL.append("WHERE FFID_ID_FIDEICOMISO = ? ");
            sbSQL.append("AND FUSU_ID_USUARIO = ? ");            
            }
         LOGGER.debug("SQL: "+sbSQL.toString());
            nFiducia fiduciaConnection = new nFiducia();
            fiduciaConnection.conectarBD();
            connection = fiduciaConnection.conBD;      
            preparedStatement = connection.prepareStatement(sbSQL.toString());
            preparedStatement.setInt(1, Integer.valueOf(fideicomisoAsignar).intValue());
            preparedStatement.setString(2, fusuIdUsuario);
            resultado = preparedStatement.executeUpdate();
            fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
      
     } 
     catch (Exception e) 
     {
        LOGGER.error("Exception: ", e);
     }
    return resultado;
  }
  

public String generaTablaFideicomisos(String ctoNumContrato) 
{
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    int value = 0;
  
    
    try {
          //se recuperan los fisos
          MasterServices serv = new MasterServices();
          resultado=serv.consumo(5,"");  
          
            if(ctoNumContrato!=null&&ctoNumContrato.length()>0){ 
              //LOGGER.debug("ctoNumContrato: " + ctoNumContrato);                
              resultadoFiltrado = Arrays.stream(resultado) // Crear Stream
                .filter(n -> n.contains(ctoNumContrato))   // Filtrar por coincidencia
                .toArray(String[]::new);
            }
          //LOGGER.debug("resultadoFiltrado: " + resultadoFiltrado.length);
          if(resultadoFiltrado.length>0&&resultadoFiltrado[0]!=null)
              resultado=resultadoFiltrado;
          for (String subconjunto : resultado) {
              elemento=subconjunto.split("-");  
              //LOGGER.debug("subconjunto: " + subconjunto);
              sbTabla.append("<tr>");
              sbTabla.append("<td align=\"center\"><input type=\"radio\" name=\"radioContrato\" value=\"" + (elemento[0]==null?"":elemento[0]) + "\" /></td>\n");
              sbTabla.append("<td align=\"center\">" + (elemento[0]==null?"":elemento[0]) + "</td>");
              sbTabla.append("<td align=\"left\">" + (elemento[1]==null?"":elemento[1]) + "</td>");
              sbTabla.append("</tr>\n");
          }        
              
      } catch (Exception e) {
          LOGGER.error("Exception: ", e);
      }
      ////LOGGER.debug(sbTabla.toString());
    return sbTabla.toString();
}


  /**
   * Fideicomisos asignados a una cuenta bancaria
   * @return 
   * @param ctoNomContrato
   * @param ctoNumContrato
   * @param fcbaClabeCba
   */
  public String generarTablaFideicomisosDisponiblesCuenta(String fcbaClabeCba, String ctoNumContrato, String ctoNomContrato) 
  { 
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    int value = 0;
 
    stringBufferSQL.append("SELECT C.CTO_NUM_CONTRATO, C.CTO_NOM_CONTRATO ");
    stringBufferSQL.append("FROM CONTRATO C "); 
    stringBufferSQL.append("WHERE C.CTO_CVE_ST_CONTRAT = 'ACTIVO' ");
    stringBufferSQL.append("AND C.CTO_NUM_CONTRATO NOT IN "); 
    stringBufferSQL.append("( ");
    stringBufferSQL.append("    SELECT A.CTO_NUM_CONTRATO ");
    stringBufferSQL.append("    FROM CONTRATO A, F_FIDEICO_CUEBAN B ");
    stringBufferSQL.append("    WHERE A.CTO_NUM_CONTRATO = B.FFID_ID_FIDEICOMISO ");
    stringBufferSQL.append("    AND A.CTO_CVE_ST_CONTRAT = 'ACTIVO' ");
    stringBufferSQL.append("    AND B.FCBA_CLABE_CBA = '" + fcbaClabeCba + "' ");
    stringBufferSQL.append(") ");
    if (ctoNumContrato != null && ctoNumContrato.length() > 0) {
      stringBufferSQL.append(" AND C.CTO_NUM_CONTRATO = " + ctoNumContrato);
    }
    if (ctoNomContrato != null && ctoNomContrato.length() > 0) {
      stringBufferSQL.append(" AND UPPER(C.CTO_NOM_CONTRATO) LIKE '%"+ ctoNomContrato.toUpperCase() + "%' ");
    }
    stringBufferSQL.append("ORDER BY C.CTO_NUM_CONTRATO ");
    
    try {
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        nFiducia fiduciaConnection = new nFiducia();
        //Manda llamar al metodo que crea la conexion
        fiduciaConnection.conectarBD();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conBD;
        //Crea un statement
        statement = connection.createStatement();
        //Ejecuta el query
        resultSet = statement.executeQuery(stringBufferSQL.toString());    
        
        while (resultSet.next()) 
        { 
          sbTabla.append("<tr class=\"celda02\" bgcolor=\"#999966\">");
          sbTabla.append("<td align=\"center\"><input type=\"checkbox\" name=\"chkFideicomisoDisponible\" value=\"" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "\" /></td>\n");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");
          sbTabla.append("<td align=\"left\">" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "</td>");
          sbTabla.append("</tr>\n");
        }//while          
        if (statement != null)
          statement.close();
        if (resultSet != null)
          resultSet.close();
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
      
      } catch (Exception e) {
          LOGGER.error("Exception: ", e);
      }
      ////LOGGER.debug(sbTabla.toString());
    return sbTabla.toString();
  }


  /**
   * Fideicomisos Asignados a la cuenta bancaria
   * @return 
   * @param fcbaClabeCba
   */
  public String generaTablaFideicomisosAsignadosCuenta(String fcbaClabeCba) 
  {
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    int value = 0;

    stringBufferSQL.append("SELECT A.CTO_NUM_CONTRATO, A.CTO_NOM_CONTRATO ");
    stringBufferSQL.append("FROM CONTRATO A, F_FIDEICO_CUEBAN B ");
    stringBufferSQL.append("WHERE A.CTO_NUM_CONTRATO = B.FFID_ID_FIDEICOMISO ");
    stringBufferSQL.append("AND A.CTO_CVE_ST_CONTRAT = 'ACTIVO' ");
    stringBufferSQL.append("AND B.FCBA_CLABE_CBA = '" +fcbaClabeCba +"' ");
    stringBufferSQL.append("ORDER BY A.CTO_NUM_CONTRATO ");

    try {
        //Se crea una instancia de la clase que se conecta hacia la base de datos
        nFiducia fiduciaConnection = new nFiducia();
        //Manda llamar al metodo que crea la conexion
        fiduciaConnection.conectarBD();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conBD;
        //Crea un statement
        statement = connection.createStatement();
        //Ejecuta el query
        resultSet = statement.executeQuery(stringBufferSQL.toString());    
        
        while (resultSet.next()) 
        { 
          sbTabla.append("<tr class=\"celda02\" bgcolor=\"#999966\">");
          sbTabla.append("<td align=\"center\"><input type=\"checkbox\" name=\"chkFideicomisoAsignado\" value=\"" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "\" /></td>\n");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");
          sbTabla.append("<td align=\"left\">" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "</td>");
          sbTabla.append("</tr>\n");
        }//while          
        if (statement != null)
          statement.close();
        if (resultSet != null)
          resultSet.close();
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
      
      } catch (Exception e) {
          LOGGER.error("Exception: ", e);
      }
    return sbTabla.toString();
  }//generaTablaFideicomisosAsignadosCuenta


  /**
   * 
   * @return 
   * @param fcbaClabeCba
   * @param fideicomisoAsignar
   */
  public int asignarFideicomisoCuenta(String fideicomisoAsignar, String fcbaClabeCba) 
  {
    StringBuffer sbSQL = new StringBuffer();
    int resultado = 0;
    StringTokenizer st = new StringTokenizer(fideicomisoAsignar, "|");
    try 
    {
      sbSQL.append("INSERT INTO F_FIDEICO_CUEBAN (FFID_ID_FIDEICOMISO, FCBA_CLABE_CBA) ");
      sbSQL.append("VALUES (?, ?) ");
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();
      connection = fiduciaConnection.conBD;
      
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        preparedStatement.setString(2, fcbaClabeCba);
        resultado += preparedStatement.executeUpdate();
      }
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
      
     } 
     catch (Exception e) 
     {
        LOGGER.error("Exception: ", e);
     }
    return resultado;
  }
  
  
  /**
   * 
   * @return 
   * @param fcbaClabeCba
   * @param fideicomisoQuitar
   */
  public int quitarFideicomisoCuenta(String fideicomisoQuitar, String fcbaClabeCba) 
  {
    StringBuffer sbSQL = new StringBuffer();
    int resultado = 0;
    StringTokenizer st = new StringTokenizer(fideicomisoQuitar, "|");
    try 
    {
      sbSQL.append("DELETE F_FIDEICO_CUEBAN ");
      sbSQL.append("WHERE FFID_ID_FIDEICOMISO = ? ");
      sbSQL.append("AND FCBA_CLABE_CBA = ? ");
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();
      connection = fiduciaConnection.conBD;
      
      while(st.hasMoreTokens()) {
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setString(1, st.nextElement().toString());
        preparedStatement.setString(2, fcbaClabeCba);
        resultado += preparedStatement.executeUpdate();
      }
      fiduciaConnection.CloseBD();
      if (connection != null)
       connection.close();

     } 
     catch (Exception e) 
     {
        LOGGER.error("Exception: ", e);
     }
    return resultado;
  }  

public String obtenerDatosFideicomiso(String ctoNumContrato) 
{
    String ctoNomContrato = null;
    int value = 0;
    
    try {


          //se recuperan los fisos
          MasterServices serv = new MasterServices();
          resultado=serv.consumo(5,"");  
          
            if(ctoNumContrato!=null&&ctoNumContrato.length()>0){ 
              //LOGGER.debug("ctoNumContrato: " + ctoNumContrato);                
              resultadoFiltrado = Arrays.stream(resultado) // Crear Stream
                .filter(n -> n.contains(ctoNumContrato))   // Filtrar por coincidencia
                .toArray(String[]::new);
            }
            //LOGGER.debug("resultadoFiltrado: " + resultadoFiltrado.length);
            if(resultadoFiltrado.length>0&&resultadoFiltrado[0]!=null)
              resultado=resultadoFiltrado;
          
              for (String subconjunto : resultado) {
                elemento=subconjunto.split("-");  
                //LOGGER.debug("subconjunto: " + subconjunto);
                  ctoNomContrato = new String();
                  ctoNomContrato = elemento[1]==null?"":elemento[1];          
              }

      } catch (Exception e) {
          LOGGER.error("Exception: ", e);
      }
      ////LOGGER.debug(sbTabla.toString());
    return ctoNomContrato;
}

  public String generarTablaUsuariosAsignadosFideicomiso(String ctoNumContrato) 
  {
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer sbSQL = new StringBuffer();
    /*
    SELECT A.FUSU_ID_USUARIO, A.FUSU_NOMBRE_USUARIO
    FROM F_USUARIO A, F_USUFID B
    WHERE A.FUSU_ID_USUARIO = B.FUSU_ID_USUARIO
    AND B.FFID_ID_FIDEICOMISO = 21
    ORDER BY A.FUSU_ID_USUARIO
    */
    sbSQL.append("SELECT A.FUSU_ID_USUARIO, A.FUSU_NOMBRE_USUARIO ");
    sbSQL.append("FROM F_USUARIO A, F_USUFID B ");
    sbSQL.append("WHERE A.FUSU_ID_USUARIO = B.FUSU_ID_USUARIO ");
    sbSQL.append("AND B.FFID_ID_FIDEICOMISO = '" +ctoNumContrato +"' ");
    sbSQL.append("ORDER BY A.FUSU_ID_USUARIO ");

    try {
    
        nFiducia fiduciaConnection = new nFiducia();
        fiduciaConnection.conectarBD();
        connection = fiduciaConnection.conBD;
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sbSQL.toString());    
        
        while (resultSet.next()) 
        { 
          sbTabla.append("<tr class=\"celda02\" bgcolor=\"#999966\">");
          sbTabla.append("<td align=\"center\">" + (resultSet.getString(1)==null?"":resultSet.getString(1)) + "</td>");
          sbTabla.append("<td align=\"left\">" + (resultSet.getString(2)==null?"":resultSet.getString(2)) + "</td>");
          sbTabla.append("</tr>\n");
        }//while          
        if (statement != null)
          statement.close();
        if (resultSet != null)
          resultSet.close();
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
      
      } catch (Exception e) {
          LOGGER.error("Exception: ", e);
      }
    return sbTabla.toString();
    
  }
    public String[] regresaArregoFiltrado(String []original,String []aExcluir){
        
            String[] modificado = new String[original.length];

                    for (int i = 0; i < original.length; i++) {
                        // substring(1) toma desde el segundo caracter hasta el final
                        original[i]=original[i].replaceAll("\\]","");
                        if ((original[i] != null && original[i].length() > 0)&&i>0) {
                            modificado[i] = original[i].substring(1);
                        } else {
                            modificado[i] = original[i]; // Manejo de nulos o cadenas vacías
                        }
                    }
                    original=modificado;
                    /*for (String subconjunto : original) {
                            LOGGER.debug("Arreglo Original:"+subconjunto);
                    }
                    for (String subconjunto : aExcluir) {
                            LOGGER.debug("Arreglo aExcluir:"+subconjunto);
                    }*/

                    // 3. Convertir el arreglo original a una lista mutable
                    List<String> listaOriginal = new ArrayList<>(Arrays.asList(original));

                    // 4. Convertir el arreglo a excluir a una lista y remover
                    listaOriginal.removeAll(Arrays.asList(aExcluir));

                    // 5. Convertir de vuelta a arreglo (opcional)
                    String[] resultado = listaOriginal.toArray(new String[0]);

                    // Imprimir resultado
                    //LOGGER.debug(Arrays.toString(resultado));
                    return resultado;
        }

}