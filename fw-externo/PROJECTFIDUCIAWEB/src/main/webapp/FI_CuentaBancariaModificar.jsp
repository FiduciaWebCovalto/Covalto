<!--FI_CuentaBancariaModificar.jsp-->
<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fCuebanDAO" class="mx.com.inscitech.clients.daos.FCuebanDAO"/>
<jsp:useBean id="fCueban" class="mx.com.inscitech.clients.beans.FCueban"/>
<% 
try {
  String ffidIdFideicomiso = request.getParameter("ffidIdFideicomiso");
  String fcbaClabeCba = request.getParameter("fcbaClabeCba");
  String botonAceptar = request.getParameter("botonAceptar");
  String fcbaTitular = request.getParameter("fcbaTitular");
  String fcbaRFC = request.getParameter("fcbaRFC");
  
  if (botonAceptar != null && botonAceptar.equals("Aceptar")) {
      int res = fCuebanDAO.modificar(fcbaTitular, fcbaRFC, fcbaClabeCba);
    if (res > 0) {
        out.print("<div class=\"texto\"><font color=\"#006600\"><b>La cuenta con la CLABE: \"" + fcbaClabeCba + "\" fue modificada satisfactoriamente.</b></font></div>");        
    } else {  
        out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>La cuenta con la CLABE: \"" + fcbaClabeCba + "\" no pudo ser modificada</b></font></div>");
    }
  }
  
  fCueban = fCuebanDAO.seleccionarCuenta(fcbaClabeCba);
  if (fCueban == null)
    out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>Los datos de la cuenta con la CLABE: \"" + fcbaClabeCba + "\" no fueron recuperados, favor de verificar.</b></font></div>");
%>
<script language="JavaScript" type="text/JavaScript">
  function cancelar() {
    document.formaCuentaBancaria.action = "FI_Operacion.jsp?menu=1";
    document.formaCuentaBancaria.submit();
  }
            
  function aceptar() {
    document.formaCuentaBancaria.action = "FI_Operacion.jsp?menu=3&botonAceptar=Aceptar";
    document.formaCuentaBancaria.submit();
  }            
  
</script>

<form name="formaCuentaBancaria" method="POST">
<input type="hidden" name="fcbaClabeCba" value="<%=fCueban==null?"":fCueban.getFcbaClabeCba()%>">
  <table align="center" id="datos" border="0">
    <tr>
      <td align="left" class="subtitulo" colspan="2">&nbsp;
      </td>
    </tr>
    
    <tr>
      <td align="right" class="texto">CLABE:</td>
      <td><div class="texto"><%=fCueban==null?"":fCueban.getFcbaClabeCba()%></div></td>
    </tr>
    
    <tr>
      <td align="right" class="texto">Banco:</td>
      <td><div class="texto"><%=fCueban==null?"":fCueban.getFcbaDescBanco()%></div></td>
    </tr> 
    
    <tr>
      <td align="right" class="texto">No. de Cuenta:</td>
      <td><div class="texto"><%=fCueban==null?"":fCueban.getFcbaNumeroCtaBan()%></div></td>
    </tr>

    <tr>
      <td align="right" class="texto">Titular:</td>
      <td><input type="TEXT" value="<%=fCueban==null?"":fCueban.getFcbaTitular()%>" name="fcbaTitular" /></td>
    </tr>

    <tr>
      <td align="right" class="texto">RFC:</td>
      <td><input type="TEXT" value="<%=fCueban==null?"":fCueban.getFcbaRfc()%>" name="fcbaRFC" /></td>    
    </tr>

    <tr>
      <td align="right" class="texto">Fecha de Captura:</td>
      <td><div class="texto"><%=fCueban==null?"":fCueban.getFcbaFechaCaptura()%></div></td>    
    </tr>

    <tr>
      <td align="right" class="texto">Status:</td>
      <td><div class="texto"><%=fCueban==null?"":fCueban.getFcbaStatus()%></div></td>    
    </tr>

    <tr>
      <td class="texto" align="right" colspan="2"></td>
    </tr>

    <tr>
      <td class="texto" align="right" colspan="2">
        <DIV align="center">
          <input type="button" name="Aceptar" class="boton" value="Aceptar" onClick="javascript:aceptar();" />
          <input type="button" name="Cancelar" class="boton" value="Cancelar" onClick="javascript:cancelar();" />
        </DIV>
      </td>
    </tr>
    
    <tr>
      <td align="center">&nbsp;</td>
    </tr>
    
  </table>
</form>
<%
} catch (Exception e) {
  System.out.println("Exception in FI_CuentaBancariaModificar.jsp " + e.getMessage());
}
%>