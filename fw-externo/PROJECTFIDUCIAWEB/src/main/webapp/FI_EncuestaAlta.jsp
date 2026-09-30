<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fEncuestaDAO" class="mx.com.inscitech.clients.daos.FEncuestaDAO" />
<jsp:useBean id="fEncuesta" class="mx.com.inscitech.clients.beans.FEncuesta" />
<% 
String aceptarAlta = request.getParameter("AceptarAlta");
//out.print("aceptar: " + aceptarAlta+"<br>");
if (aceptarAlta != null && aceptarAlta.equals("Aceptar")) {
  String fencIdEncuesta = request.getParameter("fencIdEncuesta");
  String fencDescripcion = request.getParameter("fencDescripcion")==null?"":request.getParameter("fencDescripcion");
  if (fencIdEncuesta!=null && fencIdEncuesta.length()>0) {
        fEncuesta.setFencIdEncuesta(Integer.parseInt(fencIdEncuesta));
        fEncuesta.setFencDescripcion(fencDescripcion);
        
        if (fEncuestaDAO.insertar(fEncuesta) > 0) {
            out.print("<div class=\"texto\"><font color=\"#006600\"><b>La encuesta con el Id: \"" + fencIdEncuesta + "\" y la descripción \"" + fencDescripcion + "\" fue grabada correctamente.</b></font></div>");        
            fencIdEncuesta = null;
        } else {
            out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>La encuesta con el Id: \"" + fencIdEncuesta + "\" ya existe, favor de verificar.</b></font></div>");        
            fencIdEncuesta = null;
        }
  } else {  
        out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>El Id de la encuesta es un campo requerido.</b></font></div>");
  }
}
%>
<script language="JavaScript" type="text/JavaScript">
  function cancelarAlta() {
    document.formAlta.action = "FI_Administracion.jsp?menu=100";
    document.formAlta.submit();
  }
            
  function aceptarAlta() {
    document.formAlta.action = "FI_Administracion.jsp?menu=101&botonAlta=Alta&AceptarAlta=Aceptar";
    document.formAlta.submit();
  }
</script>


<form name="formAlta" method="POST">
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
            <FONT size="2">Mantenimiento de Encuesta</FONT>
            <img height="1" src="imagenes/cnaranja01.gif" width="470"/>
          </P>
        </DIV>
      </td>
    </tr>
    
    <tr>
      <td align="right" class="texto">Id Encuesta:</td>
      <td><input type="text" name="fencIdEncuesta" style=" WIDTH: 130px" maxlength="10" size="22"/></td>
    </tr>
    <tr>
      <td align="right" class="texto">Descripci&oacute;n:</td>
      <td>
        <textarea rows="5" cols="30" name="fencDescripcion"></textarea> 
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
          <input type="button" name="AceptarAlta" class="boton" value="Aceptar" onClick="javascript:aceptarAlta();" />
          <input type="button" name="CancelarAlta" class="boton" value="Cancelar" onClick="javascript:cancelarAlta();" />
        </DIV>
      </td>
    </tr>
    <tr class="subtitulo">
      <td align="center" colspan="7">&nbsp;</td>
    </tr>
    <tr class="celda02"/>
  </table>
</form>