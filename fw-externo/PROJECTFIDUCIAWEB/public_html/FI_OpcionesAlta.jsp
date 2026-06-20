<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fOpcionesDAO" class="com.bancomext.daos.FOpcionesDAO" />
<jsp:useBean id="fOpciones" class="com.bancomext.beans.FOpciones" />
<% 
String aceptarAlta = request.getParameter("AceptarAlta");
//out.print("aceptar: " + aceptarAlta+"<br>");
if (aceptarAlta != null && aceptarAlta.equals("Aceptar")) {
  String fencIdEncuesta = request.getParameter("fencIdEncuesta");
  String fencDescripcion = request.getParameter("fencDescripcion")==null?"":request.getParameter("fencDescripcion");
  if (fencIdEncuesta!=null && fencIdEncuesta.length()>0) {
        fOpciones.setFopcIdOpcion(Integer.parseInt(fencIdEncuesta));
        fOpciones.setFopcDescripcion(fencDescripcion);
        
        if (fOpcionesDAO.insertar(fOpciones) > 0) {
            out.print("<div class=\"texto\"><font color=\"#006600\"><b>La opción con el Id: \"" + fencIdEncuesta + "\" fue grabada correctamente.</b></font></div>");        
            fencIdEncuesta = null;
        } else {
            out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>La opción con el Id: \"" + fencIdEncuesta + "\" ya existe, favor de verificar.</b></font></div>");        
            fencIdEncuesta = null;
        }
  } else {  
        out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>El Id de la opción es un campo requerido.</b></font></div>");
  }
}
%>
<script language="JavaScript" type="text/JavaScript">
  function cancelarAlta() {
    document.formAlta.action = "FI_Administracion.jsp?menu=104";
    document.formAlta.submit();
  }
            
  function aceptarAlta() {
    document.formAlta.action = "FI_Administracion.jsp?menu=105&botonAlta=Alta&AceptarAlta=Aceptar";
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
            <FONT size="2">Mantenimiento de Opciones</FONT>
            <img height="1" src="imagenes/cnaranja01.gif" width="470"/>
          </P>
        </DIV>
      </td>
    </tr>
    
    <tr>
      <td align="right" class="texto">Id Opción:</td>
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