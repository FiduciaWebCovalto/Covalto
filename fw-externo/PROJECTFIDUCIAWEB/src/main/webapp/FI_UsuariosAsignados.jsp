<!-- FI_AdministracionConceptos.jsp -->
<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fContratoDAO" class="mx.com.inscitech.clients.daos.FContratoDAO"/>
<% 
try {
String ctoNumContrato = request.getParameter("ctoNumContrato");
String ctoNomContrato = request.getParameter("ctoNomContrato");
String buscar = request.getParameter("Buscar");
%>

<script language="JavaScript" type="text/JavaScript">

  function regresar() {
    document.forma.action = "FI_Administracion.jsp?menu=10&Buscar=Buscar";
    document.forma.submit();
  }

</script>

<form name="forma" method="post" action="">
  <table width="90%" align="center" id="datos">
    <tr>
      <td align="right" class="texto">
        <DIV align="left">No. de Fideicomiso:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <%=ctoNumContrato%>
        </DIV>
      </td>
      <td class="texto">&nbsp;</td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <DIV align="left">Nombre de Fideicomiso:&nbsp;&nbsp;&nbsp;
         <%=ctoNomContrato%>
        </DIV>
      </td>
      <td class="texto">&nbsp;</td>
    </tr>    
    <tr>
      <td class="texto" align="right" colspan="2">
        <DIV align="center">
          <P>&nbsp;</P>
          <P>
            <FONT size="2">Usuarios Asignados a Fideicomiso</FONT> 
          </P>
        </DIV>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <table width="60%">
          <tr class="celda01" bgcolor="#999966">
            <td align="center" width="15%">Clave Usuario</td>
            <td align="center" width="45%">Nombre Usuario</td>
          </tr>
        <%

          out.print(fContratoDAO.generarTablaUsuariosAsignadosFideicomiso(ctoNumContrato));
          %>            
        </table>
      </td>
    </tr>
    <tr><td>&nbsp;</td></tr>
    <tr>
      <td colspan="2" align="center">
        <P>
          <input type="button" name="Regresar" id="Regresar" class="btn btn-success" value="Regresar" onClick="javascript:regresar();"/>&nbsp; 
        </P>
      </td>
    </tr>
  </table>
</form>
<% 
} catch (Exception e) {
e.printStackTrace();
}
%>