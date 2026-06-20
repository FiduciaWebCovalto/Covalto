package com.bancomext.daos;

import com.bancomext.lib.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.StringTokenizer;
import com.bancomext.negocio.nFiducia;
import com.bancomext.lib.servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FConceptosDAO 
{  Connection connection = null;
  Statement statement = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;
    String[] resultado  ={null};

    public void setFfidIdFideicomiso(String ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public String getFfidIdFideicomiso() {
        return ffidIdFideicomiso;
    }
    String[] elemento = {null};
    String[] resultadoFiltrado= {null};
    String[] sArregloOriginal={null},sArregloAsignado={null};
    String ffidIdFideicomiso;
    private List<MapeoTabla> filasSeleccionadas;
    public int opcion;
    public void setOpcion(int opcion){this.opcion=opcion;}
    public int getOpcion(){return this.opcion;}
    public void setFilasSeleccionadas(List<MapeoTabla> filasSeleccionadas) {
        this.filasSeleccionadas = filasSeleccionadas;
    }

    public List<MapeoTabla> getFilasSeleccionadas() {
        return filasSeleccionadas;
    }    
  /**
   * 
   * @return 

   * @param cveNumClave
   * @param cveDesclave
   * @param cveNumSecClave
   * @param ctoNumContrato
   */
  public String generarTablaConceptosDisponibles(String ctoNumContrato, String cveNumSecClave, String cveDesclave, String cveNumClave) 
  { 
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    int value = 0,recorrido=0;
    String sprovional="";
    
    stringBufferSQL.append("SELECT fcma_id_padre||'-'||fcma_id_sec_catma||'-'||ffid_id_fideicomiso,fcma_id_padre||'-'||fcma_id_sec_catma||'-' "); 
    stringBufferSQL.append("FROM F_CATMAES_FIDEIC "); 
    stringBufferSQL.append("where FFID_ID_FIDEICOMISO = ?");
    stringBufferSQL.append(" AND  FCMA_ID_PADRE = ?");
    try {
          System.out.println("cveNumClave: " + cveNumClave); 
          //se recuperan los conceptos
          servicios serv = new servicios();
          resultado=serv.consumo(6,cveNumClave);  

        //Se crea una instancia de la clase que se conecta hacia la base de datos
        nFiducia fiduciaConnection = new nFiducia();
        //Manda llamar al metodo que crea la conexion
        fiduciaConnection.conectarBD();
        //Asigna el valor de la conexion a la variable declarada
        connection = fiduciaConnection.conBD;
        System.out.println("Fiso Disponible"+ctoNumContrato);
          preparedStatement = connection.prepareStatement(stringBufferSQL.toString(), ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
          preparedStatement.setInt(1, Integer.valueOf(ctoNumContrato.trim()).intValue());
          preparedStatement.setInt(2, Integer.valueOf(cveNumClave.trim()).intValue());
          resultSet = preparedStatement.executeQuery();   
          if (resultSet.last()) {
              value = resultSet.getRow();
              resultSet.beforeFirst(); // Volver al inicio para poder iterar
          }   
          sArregloAsignado= new String[value];
          while (resultSet.next()) 
          { 
              // Búsqueda para encontrar la descripcion
              for (String resul : resultado) {
                  if (resul.contains(resultSet.getString(2).trim())) {
                      System.out.println("resul dispo: " + resul);
                      sprovional = resul.replace(resultSet.getString(2), "");
                      System.out.println("hallado dispo: " + sprovional);
                      break; // Detener la búsqueda al encontrarlo
                  }
              }

              sArregloAsignado[recorrido]=resultSet.getString(1)+"-"+sprovional;
              System.out.println("sArregloAsignado: " + sArregloAsignado[recorrido]);
              recorrido++;
          }//while          
          if (statement != null)
            statement.close();
          if (resultSet != null)
            resultSet.close();
          fiduciaConnection.CloseBD();
          if (connection != null)
            connection.close();
                    
            //se filtra por num y o descripcion clave
            if(cveNumSecClave!=null&&cveNumSecClave.length()>0){ 
              System.out.println("cveNumSecClave: " + cveNumSecClave);                
              resultadoFiltrado = Arrays.stream(resultado) // Crear Stream
                .filter(n -> n.contains(cveNumSecClave))   // Filtrar por coincidencia
                .toArray(String[]::new);
            }

            System.out.println("resultadoFiltrado: " + resultadoFiltrado.length);
            if(resultadoFiltrado.length>0&&resultadoFiltrado[0]!=null)
              resultado=resultadoFiltrado;
          value=0;
          sArregloOriginal = new String[resultado.length];
          for (String subconjunto : resultado) {
              elemento=subconjunto.split("-");  
              sArregloOriginal[value]=((cveNumClave+"-"+elemento[1]+"-"+ctoNumContrato).replaceAll(" ","")+"-"+elemento[2]);
              System.out.println("sArregloOriginal[value]: " + sArregloOriginal[value]);
              value++;
          }   
        
          //Al arreglo con la clave consultada se le quitan las claves asignadas al fiso
          resultado=regresaArregoFiltrado(sArregloOriginal,sArregloAsignado);
          for (String subconjunto : resultado) {
              elemento=subconjunto.split("-");  
              System.out.println("subconjunto: " + subconjunto);
              sbTabla.append("<tr>");
              sbTabla.append("<td><input type=\"checkbox\" class=\"row-check\" value=\"" + (elemento[0]==null?"":elemento[0]) + "\" /></td>\n");
              sbTabla.append("<td class=\"fcmaIdPadre\">" + (elemento[0]==null?"":elemento[0]) + "</td>");
              sbTabla.append("<td class=\"fcmaIdSecCatma\">" + (elemento[1]==null?"":elemento[1]) + "</td>");
              sbTabla.append("<td class=\"concepto\">" + (elemento[3]==null?"":elemento[3]) + "</td>");
              //75 DEPOSITO  128 RETIRO
              sbTabla.append("<td >" + (cveNumClave==null?"":(cveNumClave.equals("75")?"DEPOSITO":"RETIRO")) + "</td>");
              sbTabla.append("</tr>\n");           
          }        

      } catch (Exception e) {
          e.printStackTrace();
      }
      //System.out.println(sbTabla.toString());
    return sbTabla.toString();
  }
  
  /**
   * 
   * @return 
   * @param cveNumClave
   * @param cveDesclave
   * @param cveNumSecClave
   * @param ctoNumContrato
   */
  public String generarTablaConceptosAsignados(String ctoNumContrato, String cveNumClave) 
  { 
    StringBuffer sbTabla = new StringBuffer();
    StringBuffer stringBufferSQL = new StringBuffer();
    int value = 0;

      stringBufferSQL.append("SELECT fcma_id_padre||'-'||fcma_id_sec_catma||'-'||ffid_id_fideicomiso,fcma_id_padre||'-'||fcma_id_sec_catma||'-' "); 
      stringBufferSQL.append("FROM F_CATMAES_FIDEIC "); 
      stringBufferSQL.append("where FFID_ID_FIDEICOMISO = ? ");
      stringBufferSQL.append(" AND  FCMA_ID_PADRE = ?");
    try {
          //se recuperan los conceptos
          servicios serv = new servicios();
          resultado=serv.consumo(6,cveNumClave);  

          //Se crea una instancia de la clase que se conecta hacia la base de datos
          nFiducia fiduciaConnection = new nFiducia();
          //Manda llamar al metodo que crea la conexion
          fiduciaConnection.conectarBD();
          //Asigna el valor de la conexion a la variable declarada
          connection = fiduciaConnection.conBD;
          System.out.println("Fiso Asignado"+ctoNumContrato);
            preparedStatement = connection.prepareStatement(stringBufferSQL.toString(), ResultSet.TYPE_SCROLL_SENSITIVE, 
                          ResultSet.CONCUR_UPDATABLE);
            preparedStatement.setInt(1, Integer.valueOf(ctoNumContrato.trim()).intValue());
            preparedStatement.setInt(2, Integer.valueOf(cveNumClave.trim()).intValue());
            resultSet = preparedStatement.executeQuery();   
            if (resultSet.last()) {
                value = resultSet.getRow();
                ////System.out.println("Total de registros Disponible: " + value);
                resultSet.beforeFirst(); // Volver al inicio para poder iterar
            }   
            sArregloAsignado= new String[value];
            int recorrido=0;
            String sprovional="";
            while (resultSet.next()) 
            { 
                System.out.println("sprovional: " + resultSet.getString(2).trim());
                // Búsqueda para encontrar la descripcion
                for (String resul : resultado) {
                    if (resul.contains(resultSet.getString(2).trim())) {
                        System.out.println("resul: " + resul);
                        sprovional = resul.replace(resultSet.getString(2), "");
                        System.out.println("hallado: " + sprovional);
                        break; // Detener la búsqueda al encontrarlo
                    }
                }
                sArregloAsignado[recorrido]=resultSet.getString(1)+"-"+sprovional;
                
                recorrido++;
            }//while          
            if (statement != null)
              statement.close();
            if (resultSet != null)
              resultSet.close();
            fiduciaConnection.CloseBD();
            if (connection != null)
              connection.close();

          resultado=sArregloAsignado      ;
          for (String subconjunto : resultado) {
              elemento=subconjunto.split("-");  
              System.out.println("TablaAsignada: " + subconjunto);
              sbTabla.append("<tr>");
              sbTabla.append("<td><input type=\"checkbox\" class=\"row-check\" value=\"" + (elemento[0]==null?"":elemento[0]) + "\" /></td>\n");
              sbTabla.append("<td class=\"fcmaIdPadre\">" + (elemento[0]==null?"":elemento[0]) + "</td>");
              sbTabla.append("<td class=\"fcmaIdSecCatma\">" + (elemento[1]==null?"":elemento[1]) + "</td>");
              sbTabla.append("<td class=\"concepto\">" + (elemento[3]==null?"":elemento[3]) + "</td>");
              //75 DEPOSITO  128 RETIRO
              sbTabla.append("<td>" + (cveNumClave==null?"":(cveNumClave.equals("75")?"DEPOSITO":"RETIRO")) + "</td>");
              sbTabla.append("</tr>\n");           
          }        

      
      } catch (Exception e) {
          e.printStackTrace();
      }
      //System.out.println(sbTabla.toString());
    return sbTabla.toString();
  }


  /**
   * 
   * @return 
   * @param fusuIdUsuario
   * @param fideicomisoAsignar
   * @param fcmaIdPadre 75 or 128
   */
  public int asignarConcepto(String fcmaIdPadre, String fideicomisoAsignar, String ffidIdFideicomiso) 
  {
    StringBuffer sbSQL = new StringBuffer();
    int resultado = 0;
    try 
    {
      sbSQL.append("INSERT INTO F_CATMAES_FIDEIC (FCMA_ID_PADRE, FCMA_ID_SEC_CATMA, FFID_ID_FIDEICOMISO) ");
      sbSQL.append("VALUES (?, ?, ?) ");
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();
      connection = fiduciaConnection.conBD;
      
        preparedStatement = connection.prepareStatement(sbSQL.toString());
        preparedStatement.setInt(1, Integer.valueOf(fcmaIdPadre).intValue()   );
        preparedStatement.setInt(2,Integer.valueOf(fideicomisoAsignar).intValue());
        preparedStatement.setInt(3,Integer.valueOf(ffidIdFideicomiso).intValue() );
        resultado = preparedStatement.executeUpdate();
        
        fiduciaConnection.CloseBD();
        if (connection != null)
          connection.close();
      
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;
  }
  
  public int quitarConcepto(String fcmaIdPadre, String fideicomisoQuitar, String ffidIdFideicomiso) 
  {
    StringBuffer sbSQL = new StringBuffer();
    int resultado = 0;
    try 
    {
      sbSQL.append("DELETE FROM  F_CATMAES_FIDEIC ");
      sbSQL.append("WHERE FCMA_ID_PADRE = ? ");
      sbSQL.append("AND FCMA_ID_SEC_CATMA = ? ");
      sbSQL.append("AND FFID_ID_FIDEICOMISO = ? ");
      nFiducia fiduciaConnection = new nFiducia();
      fiduciaConnection.conectarBD();
      connection = fiduciaConnection.conBD;
      
        preparedStatement = connection.prepareStatement(sbSQL.toString());
         preparedStatement.setInt(1, Integer.valueOf(fcmaIdPadre).intValue()   );
         preparedStatement.setInt(2,Integer.valueOf(fideicomisoQuitar).intValue());
         preparedStatement.setInt(3,Integer.valueOf(ffidIdFideicomiso).intValue() );
        resultado = preparedStatement.executeUpdate();
      fiduciaConnection.CloseBD();
      if (connection != null)
        connection.close();
      
     } 
     catch (Exception e) 
     {
        e.printStackTrace();
     }
    return resultado;
  }  


    public String[] regresaArregoFiltrado(String []original,String []aExcluir){
        
            /*String[] modificado = new String[original.length];

                    for (int i = 0; i < original.length; i++) {
                        // substring(1) toma desde el segundo caracter hasta el final
                        original[i]=original[i].replaceAll("\\]","");
                        if (original[i] != null && original[i].length() > 0) {
                            modificado[i] = original[i].substring(1);
                        } else {
                            modificado[i] = original[i]; // Manejo de nulos o cadenas vacías
                        }
                    }
                    original=modificado;
                    /*for (String subconjunto : original) {
                            System.out.println("Arreglo Original:"+subconjunto);
                    }
                    for (String subconjunto : aExcluir) {
                            System.out.println("Arreglo aExcluir:"+subconjunto);
                    }*/

                    // 3. Convertir el arreglo original a una lista mutable
                    List<String> listaOriginal = new ArrayList<>(Arrays.asList(original));

                    // 4. Convertir el arreglo a excluir a una lista y remover
                    listaOriginal.removeAll(Arrays.asList(aExcluir));

                    // 5. Convertir de vuelta a arreglo (opcional)
                    String[] resultado = listaOriginal.toArray(new String[0]);

                    // Imprimir resultado
                    //System.out.println(Arrays.toString(resultado));
                    return resultado;
        }


}