<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=iso-8859-1"%>
<%
String archivoEliminar = request.getParameter("fileDel");
if(archivoEliminar != null && !"".equals(archivoEliminar.trim())) {
  java.io.File fileToDelete = new java.io.File(archivoEliminar.trim());
  if(fileToDelete.exists() && fileToDelete.canWrite()) fileToDelete.delete();
  fileToDelete = null;
}

java.io.File confDir = new java.io.File(session.getServletContext().getRealPath("/Archivos/ConfirmacionesX"));
java.io.File edosDir = new java.io.File(session.getServletContext().getRealPath("/Archivos/EstadosDeCuenta"));
java.io.File timbradoDir = new java.io.File(session.getServletContext().getRealPath("/Archivos/Timbrado"));
java.io.File envioEdosCtaDir = new java.io.File(session.getServletContext().getRealPath("/Archivos/EnvioEdoCta"));

java.io.File[] fileList = null;
int i = 0;

%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/>
    <title>ListaArchivos</title>
  </head>
  <body>
  
  <%if(confDir.exists() && confDir.canRead()) {%>
    <table cellpadding="5" cellspacing="4" align="center" border="0">
        <tr>
          <td colspan="3" align="center" class="subtitulo">Confirmaciones</td>
        </tr>
        <% 
          fileList = confDir.listFiles();
          for(i = 0; i < fileList.length; i++) {
            if("readme.txt".equals(fileList[i].getName())) continue;
            if(fileList[i].length() <= 0) continue;
          %>
          <tr>
            <td nowrap="nowrap"><%=fileList[i].getName()%></td>
            <td><a href="Archivos/Confirmaciones/<%=fileList[i].getName()%>" target="_blank">Ver</a></td>
            <td>&nbsp;<!--a href="Archivos/Confirmaciones/<%=fileList[i].getName()%>" target="_blank">Eliminar</a--></td>
          </tr>
          <%
          }
        %>
    </table>
    <br/><hr/>
  <%}%>
  
  <%if(edosDir.exists() && edosDir.canRead()) {%>
    <table cellpadding="5" cellspacing="4" align="center" border="0">
        <tr>
          <td colspan="3" align="center" class="subtitulo">Estados de Cuenta</td>
        </tr>
        <% 
          fileList = edosDir.listFiles();
          for(i = 0; i < fileList.length; i++) {
            if("readme.txt".equals(fileList[i].getName())) continue;
            if(fileList[i].length() <= 0) continue;
          %>
          <tr>
            <td nowrap="nowrap"><%=fileList[i].getName()%></td>
            <td><a href="Archivos/EstadosDeCuenta/<%=fileList[i].getName()%>" target="_blank">Ver</a></td>
            <td>&nbsp;<!--a href="Archivos/Confirmaciones/<%=fileList[i].getName()%>" target="_blank">Eliminar</a--></td>
          </tr>
          <%
          }
        %>
    </table>
    <br/><hr/>
  <%}%>
  
  <%if(timbradoDir.exists() && timbradoDir.canRead()) {%>
    <table cellpadding="5" cellspacing="4" align="center" border="0">
        <tr>
          <td colspan="3" align="center" class="subtitulo">Timbrado</td>
        </tr>
        <% 
          fileList = timbradoDir.listFiles();
          for(i = 0; i < fileList.length; i++) {
            if("readme.txt".equals(fileList[i].getName())) continue;
            if(fileList[i].length() <= 0) continue;
          %>
          <tr>
            <td nowrap="nowrap"><%=fileList[i].getName()%></td>
            <td><a href="Archivos/Timbrado/<%=fileList[i].getName()%>" target="_blank">Ver</a></td>
            <td>&nbsp;<!--a href="Archivos/Confirmaciones/<%=fileList[i].getName()%>" target="_blank">Eliminar</a--></td>
          </tr>
          <%
          }
        %>
    </table>
    <br/><hr/>
  <%}%>
  
  <%if(envioEdosCtaDir.exists() && envioEdosCtaDir.canRead()) {%>
    <table cellpadding="5" cellspacing="4" align="center" border="0">
        <tr>
          <td align="center" class="subtitulo">Envio de Estados de Cuenta</td>
        </tr>
        <% 
          fileList = envioEdosCtaDir.listFiles();
          for(i = 0; i < fileList.length; i++) {
            if("readme.txt".equals(fileList[i].getName())) continue;
            if(fileList[i].length() <= 0) continue;
          %>
          <tr>
            <td nowrap="nowrap"><%=fileList[i].getName()%></td>
          </tr>
          <%
            fileList[i].delete();
          }
        %>
    </table>
    <br/><hr/>
  <%}%>
  
  <%
    confDir = null;
    edosDir = null;
    timbradoDir = null;
    fileList = null;
    envioEdosCtaDir = null;
  %>
  </body>
</html>