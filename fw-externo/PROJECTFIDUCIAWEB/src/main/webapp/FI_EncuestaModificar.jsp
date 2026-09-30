<!-- FI_EncuestaModificar.jsp -->
<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fEncuestaDAO" class="mx.com.inscitech.clients.daos.FEncuestaDAO" />
<jsp:useBean id="fEncuesta" class="mx.com.inscitech.clients.beans.FEncuesta" />
<%
try {

String fencIdEncuesta = request.getParameter("fencIdEncuesta");
String aceptarMod = request.getParameter("AceptarMod");

if (fencIdEncuesta != null) {
  fEncuesta = fEncuestaDAO.consultar(fencIdEncuesta);
}

if (aceptarMod != null && aceptarMod.equals("Aceptar")) {
  fencIdEncuesta = request.getParameter("fencIdEncuestaHidden");
  String fencDescripcion = request.getParameter("fencDescripcion")==null?"":request.getParameter("fencDescripcion");
  if (fencIdEncuesta!=null && fencIdEncuesta.length()>0) {
        fEncuesta.setFencIdEncuesta(Integer.parseInt(fencIdEncuesta));
        fEncuesta.setFencDescripcion(fencDescripcion);
     
        if (fEncuestaDAO.modificar(fEncuesta) > 0) {
            out.print("<div class=\"texto\"><font color=\"#006600\">La encuesta con el Id: \"" + fencIdEncuesta + "\" fue modificada correctamente.</font></div>");
        } else {
            out.print("<div class=\"texto\"><font color=\"#FF0000\">La encuesta con el Id: \"" + fencIdEncuesta + "\" no pudo ser modificada, favor de verificar la información capturada.</font></div>");
        }
    } 
}
%>
<script language="JavaScript" type="text/JavaScript">
  function cancelarMod() {
    document.formModificar.action = "FI_Administracion.jsp?menu=100";
    document.formModificar.submit();
  }
            
  function aceptarMod() {
    var forma = "document.formUsuarioModificar";
    document.formModificar.action = "FI_Administracion.jsp?menu=102&AceptarMod=Aceptar";
    document.formModificar.action += "&fencIdEncuesta" + forma.fencIdEncuestaHidden; 
    document.formModificar.action += "&fencDescripcion" + forma.fencDescripcion;
    document.formModificar.submit();
  }            
</script>

<form name="formModificar" method="POST">
<input type="hidden" name="fencIdEncuestaHidden" value="<%=fEncuesta.getFencIdEncuesta()%>">
  <table align="center" id="datos" border="0">
    <tr>
      <td align="left" class="subtitulo" colspan="2">
        <DIV align="center"/>
      </td>
    </tr>

    <tr>
      <td align="right" class="texto" colspan="2"></td>
    </tr>

    <tr>
      <td align="right" class="texto" colspan="2"></td>
    </tr>

    <tr>
      <td align="right" class="texto" colspan="2">
        <DIV align="center">
          <P>
            <FONT size="2">Datos Generales</FONT>
            <img height="1" src="imagenes/cnaranja01.gif" width="470"/>
          </P>
        </DIV>
      </td>
    </tr>
    
    <tr>
      <td align="right" class="texto">Id Encuesta:</td>
      <td><input type="text" name="fencIdEncuesta" value="<%=fEncuesta.getFencIdEncuesta()%>" style=" WIDTH: 130px" maxlength="20" size="22" disabled="disabled" /></td>
    </tr>
    
    <tr>
      <td align="right" class="texto">Descripci&oacute;n:</td>
      <td>
        <textarea rows="5" cols="30" name="fencDescripcion"><%=fEncuesta.getFencDescripcion()%></textarea> 
      </td>
    </tr> 
    
    <tr>
      <td class="texto" align="right" colspan="2"></td>
    </tr>

    <tr>
      <td class="texto" align="right" colspan="2"></td>
    </tr>

    <tr>
      <td class="texto" align="right" colspan="2">
        <DIV align="center">
          <input type="button" name="AceptarMod" class="boton" value="Aceptar" onClick="javascript:aceptarMod();" />
          <input type="button" name="CancelarMod" class="boton" value="Cancelar" onClick="javascript:cancelarMod();" />
        </DIV>
      </td>
    </tr>
    <tr class="celda02"/>
  </table>
  <tr>
    <td colspan="2" align="center">&nbsp;</td>
  </tr>
</form>
<%
} catch (Exception e) {
e.printStackTrace();
}
%>