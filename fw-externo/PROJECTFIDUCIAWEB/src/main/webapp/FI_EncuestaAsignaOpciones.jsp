<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fEncuestaDAO" class="mx.com.inscitech.clients.daos.FEncuestaDAO"/>
<%
  String fencIdEncuesta = request.getParameter("fencIdEncuesta");
  //out.print(fencIdEncuesta);
  //String botonBuscar = request.getParameter("botonBuscar");
  String botonAsignar = request.getParameter("botonAsignar");
  String botonQuitar = request.getParameter("botonQuitar");
  String opcionAsignar = request.getParameter("opcionAsignar");
  String opcionQuitar = request.getParameter("opcionQuitar");
  
if (botonAsignar != null && botonAsignar.equals("Asignar") && opcionAsignar != null && opcionAsignar.length() > 0) {
  int resultado = fEncuestaDAO.asignarOpcion(opcionAsignar, fencIdEncuesta);
  if (resultado > 0) {
      out.print("<div class=\"texto\"><font color=\"#006600\"><b>La asignaci�n de opciones a la encuesta fue realizada correctamente.</b></font></div>");
      botonAsignar = null;
  } else {
      out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>La asignaci�n de opciones a la encuesta no fue satisfactoria, favor de verificar.</b></font></div>");
      botonAsignar = null;
  }
} else if (botonQuitar != null && botonQuitar.equals("Quitar") && opcionQuitar != null && opcionQuitar.length() > 0) {
  int resultado = fEncuestaDAO.quitarOpcion(opcionQuitar, fencIdEncuesta);
  if (resultado > 0) {
      out.print("<div class=\"texto\"><font color=\"#006600\"><b>La eliminaci�n de opciones de la encuesta fue realizada correctamente.</b></font></div>");
      botonQuitar = null;
  } else {
      out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>La eliminaci�n de opciones de la encuesta no fue satisfactoria, favor de verificar.</b></font></div>");
      botonQuitar = null;
  }
}  
%>

<script language="JavaScript" type="text/JavaScript">
  
  function regresar() {
    document.formaOpciones.action = "FI_Administracion.jsp?menu=100";
    document.formaOpciones.submit();
  }

  function asignar() {
    var opcionAsignar = "";
    for (i=0;i<document.formaOpciones.elements.length;i++) {
      if ((document.formaOpciones.elements[i].type=="checkbox")&&(document.formaOpciones.elements[i].checked) &&
          (document.formaOpciones.elements[i].name=="chkOpcionDisponible")) {
        opcionAsignar += document.formaOpciones.elements[i].value + "|";
       }//if
    }//for
    document.formaOpciones.action = "FI_Administracion.jsp?menu=103&botonAsignar=Asignar&opcionAsignar=" + opcionAsignar;
    document.formaOpciones.submit();
  }
  
  function quitar() {
    var opcionQuitar = "";
    for (i=0;i<document.formaOpciones.elements.length;i++) {
      if ((document.formaOpciones.elements[i].type=="checkbox") && (document.formaOpciones.elements[i].checked) &&
          (document.formaOpciones.elements[i].name=="chkOpcionAsignado")) {
        opcionQuitar += document.formaOpciones.elements[i].value + "|";
       }//if
    }//for
    document.formaOpciones.action = "FI_Administracion.jsp?menu=103&botonQuitar=Quitar&opcionQuitar=" + opcionQuitar;
    document.formaOpciones.submit();
  }     
  
</script>

<form name="formaOpciones" method="POST" action="">
  <input type="hidden" name="fencIdEncuesta" value="<%=fencIdEncuesta%>">
  <table width="90%" align="center">
    <tr>
      <td align="right" class="texto" colspan="2">
        <DIV align="center">
          <FONT size="2">Opciones Disponibles</FONT> 
        </DIV>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <table width="100%">
          <tr class="celda01" bgcolor="#999966">
            <td align="center" width="10%">&nbsp;</td>
            <td align="center" width="30%">No de Opci&oacute;n</td>
            <td align="center" width="60%">Descripci&oacute;n</td>
          </tr>
          <%
          out.print(fEncuestaDAO.generarTablaOpcionesDisponibles(fencIdEncuesta));
          %>
        </table>
        <P align="center">
          <input type="button" name="Asignar" class="btn btn-primary" value="Asignar" onClick="javascript:asignar();" />
          <input type="button" name="Quitar" class="btn btn-danger" value="Quitar" onClick="javascript:quitar();" />
        </P>
      </td>
    </tr>
  </table>
  
  <br />
  
  <table width="90%" align="center">
    <tr>
      <td align="right" class="texto" colspan="2">
        <DIV align="center">
          <FONT size="2">Opciones Asignadas</FONT> 
        </DIV>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <table width="100%">
          <tr class="celda01" bgcolor="#999966">
            <td align="center" width="10%">&nbsp;</td>
            <td align="center" width="30%">No de Opci&oacute;n</td>
            <td align="center" width="60%">Descripci&oacute;n</td>
          </tr>
          <%
          out.print(fEncuestaDAO.generarTablaOpcionesAsignadas(fencIdEncuesta));
          %>
        </table>
        <P>
          <input type="button" name="Regresar" id="Regresar" class="btn btn-success" value="Regresar" onClick="javascript:regresar()"/>
        </P>
      </td>
    </tr>
  </table>
</form>
