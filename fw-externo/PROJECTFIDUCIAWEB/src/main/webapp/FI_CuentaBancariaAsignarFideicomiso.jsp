<!-- FI_CuentaBancariaAsignarFideicomiso.jsp -->
<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fContratoDAO" class="mx.com.inscitech.clients.daos.FContratoDAO"/>
<jsp:useBean id="fCueban" class="mx.com.inscitech.clients.beans.FCueban"/>
<% 
try {
String fcbaClabeCba = request.getParameter("fcbaClabeCba");
//out.print("fcbaClabeCba: " + fcbaClabeCba);
String ctoNumContrato = request.getParameter("ctoNumContrato");
String ctoNomContrato = request.getParameter("ctoNomContrato");
String buscar = request.getParameter("Buscar");
String botonAsignar = request.getParameter("botonAsignar");
String botonQuitar = request.getParameter("botonQuitar");
String fideicomisoAsignar = request.getParameter("fideicomisoAsignar");
String fideicomisoQuitar = request.getParameter("fideicomisoQuitar");

if (botonAsignar != null && botonAsignar.equals("Asignar") && fideicomisoAsignar != null && fideicomisoAsignar.length() > 0) {
  int resultado = fContratoDAO.asignarFideicomisoCuenta(fideicomisoAsignar, fcbaClabeCba);
  if (resultado > 0) {
      out.print("<div class=\"texto\"><font color=\"#006600\"><b>La asignaci�n de fideicomisos a la cuenta fue realizada correctamente.</b></font></div>");
      botonAsignar = null;
  } else {
      out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>La asignaci�n de fideicomisos a la cuenta no fue satisfactoria, favor de verificar.</b></font></div>");
      botonAsignar = null;
  }
} else if (botonQuitar != null && botonQuitar.equals("Quitar") && fideicomisoQuitar != null && fideicomisoQuitar.length() > 0) {
  int resultado = fContratoDAO.quitarFideicomisoCuenta(fideicomisoQuitar, fcbaClabeCba);
  if (resultado > 0) {
      out.print("<div class=\"texto\"><font color=\"#006600\"><b>La eliminaci�n de fideicomisos de la cuenta fue realizada correctamente.</b></font></div>");
      botonQuitar = null;
  } else {
      out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>La eliminaci�n de fideicomisos de la cuenta no fue satisfactoria, favor de verificar.</b></font></div>");
      botonQuitar = null;
  }
}
%>

<script language="JavaScript" type="text/JavaScript">
  function buscar() {
    document.formaCuentaFideicomiso.action = "FI_Operacion.jsp?menu=5&Buscar=Buscar";
    document.formaCuentaFideicomiso.submit();
  }

  function limpiar() {
    document.formaCuentaFideicomiso.ctoNomContrato.value = '';
    document.formaCuentaFideicomiso.action = "FI_Operacion.jsp?menu=5";
    document.formaCuentaFideicomiso.submit();
  }
  
  function cancelar() {
    document.formaCuentaFideicomiso.action = "FI_Operacion.jsp?menu=1";
    document.formaCuentaFideicomiso.submit();
  }

  function asignar() {
    var fideicomisoAsignar = "";
    for (i=0;i<document.formaCuentaFideicomiso.elements.length;i++) {
      if ((document.formaCuentaFideicomiso.elements[i].type=="checkbox")&&(document.formaCuentaFideicomiso.elements[i].checked) &&
          (document.formaCuentaFideicomiso.elements[i].name=="chkFideicomisoDisponible")) {
        fideicomisoAsignar += document.formaCuentaFideicomiso.elements[i].value + "|";
       }//if
    }//for
    document.formaCuentaFideicomiso.action = "FI_Operacion.jsp?menu=5&botonAsignar=Asignar&fideicomisoAsignar=" + fideicomisoAsignar;
    document.formaCuentaFideicomiso.submit();
  }
  
  function quitar() {
    var fideicomisoQuitar = "";
    for (i=0;i<document.formaCuentaFideicomiso.elements.length;i++) {
      if ((document.formaCuentaFideicomiso.elements[i].type=="checkbox") && (document.formaCuentaFideicomiso.elements[i].checked) &&
          (document.formaCuentaFideicomiso.elements[i].name=="chkFideicomisoAsignado")) {
        fideicomisoQuitar += document.formaCuentaFideicomiso.elements[i].value + "|";
       }//if
    }//for
    document.formaCuentaFideicomiso.action = "FI_Operacion.jsp?menu=5&botonQuitar=Quitar&fideicomisoQuitar=" + fideicomisoQuitar;
    document.formaCuentaFideicomiso.submit();
  }  
</script>

<form name="formaCuentaFideicomiso" method="post" action="">
<input type="hidden" name="fcbaClabeCba" value="<%=fcbaClabeCba%>">
  <table width="90%" align="center" id="datos">
    <tr>
      <td align="right" class="texto">
        <DIV align="left">No. de Fideicomiso:&nbsp;&nbsp;&nbsp;
          <input type="text" name="ctoNumContrato" style=" WIDTH: 100px" maxlength="50"/>
        </DIV>
      </td>
      <td class="texto">&nbsp;</td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <DIV align="left">Nombre Fideicomiso:&nbsp;
          <input type="text" name="ctoNomContrato" style=" WIDTH: 100px" maxlength="50"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <input type="button" name="Buscar" id="Buscar"  class="btn btn-info" value="Buscar" onClick="javascript:buscar()"/>&nbsp;
          <input type="button" name="Limpiar" id="Limpiar" class="btn btn-warning" value="Limpiar" onClick="javascript:limpiar()"/>
        </DIV>
      </td>
      <td class="texto">&nbsp;</td>
    </tr>
    <tr>
      <td class="texto" align="right" colspan="2">
        <DIV align="center">
          <P>&nbsp;</P>
          <P>
            <FONT size="2">Fideicomisos Disponibles</FONT> 
          </P>
        </DIV>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <table width="75%">
          <tr class="celda01" bgcolor="#999966">
            <td align="center" width="1%">&nbsp;</td>
            <td align="center" width="16%">No. de Fideicomiso</td>
            <td align="center" width="58%">Nombre</td>
          </tr>
        <%
              if (buscar != null && buscar.equals("Buscar")) {
                out.print(fContratoDAO.generarTablaFideicomisosDisponiblesCuenta(fcbaClabeCba, ctoNumContrato, ctoNomContrato));
              }  
          %>            
        </table>
      </td>
    </tr>
    <tr><td>&nbsp;</td></tr>
    <tr>
      <td colspan="2" align="center">
        <P>
          <input type="button" name="Asignar" class="btn btn-primary" value="Asignar" onClick="javascript:asignar();"/>&nbsp;
          <input type="button" name="Quitar" class="btn btn-danger" value="Quitar" onClick="javascript:quitar();"/>
        </P>
        <P>
          <FONT size="2">Fideicomisos Asignados</FONT> 
        </P>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <table width="75%">
          <tr class="celda01" bgcolor="#999966">
            <td align="center" width="1%">&nbsp;</td>
            <td align="center" width="16%">No de Fideicomiso</td>
            <td align="center" width="58%">Nombre</td>
            <%
              out.print(fContratoDAO.generaTablaFideicomisosAsignadosCuenta(fcbaClabeCba));
            %>     
        </table>
      </td>
    </tr>
  </table>
</form>
<% 
} catch (Exception e) {
  out.print("Error en FI_CuentaBancariaAsignarFideicomiso");
}
%>