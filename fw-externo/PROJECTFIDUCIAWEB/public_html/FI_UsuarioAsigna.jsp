<!-- FI_UsuarioAsigna.jsp -->
<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fPerfilDAO" class="com.bancomext.daos.FPerfilDAO"/>
<jsp:useBean id="fUsuarioDAO" class="com.bancomext.daos.FUsuarioDAO"/>
<jsp:useBean id="fUsuario" class="com.bancomext.beans.FUsuario"/>
<jsp:useBean id="stringFormatter" class="com.bancomext.util.StringFormatter"/>
<% 
  String fusuIdUsuario = request.getParameter("fusuIdUsuario");
  fUsuario = fUsuarioDAO.consultar(fusuIdUsuario);
%>
<script language="JavaScript" type="text/JavaScript">
  function cancelarAF() {
    document.formUsuarioAsigna.action = "FI_Administracion.jsp?menu=1";
    document.formUsuarioAsigna.submit();
  }
            
  function aceptarAF() {
    document.formUsuarioAsigna.action = "FI_Administracion.jsp?menu=5&fusuIdUsuario=" + document.formUsuarioAsigna.fusuIdUsuarioHidden.value;
    document.formUsuarioAsigna.action += "&fusuNombreUsuario=" + document.formUsuarioAsigna.fusuNombreUsuarioHidden.value;
    document.formUsuarioAsigna.submit();
  }            
</script>


<form name="formUsuarioAsigna" method="POST">
<input type="hidden" name="fusuIdUsuarioHidden" value="<%=fUsuario.getFusuIdUsuario()%>">
<input type="hidden" name="fusuNombreUsuarioHidden" value="<%=fUsuario.getFusuNombreUsuario()%>">

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
      <td align="right" class="texto">Clave de Usuario:</td>
      <td><input type="text" name="fusuIdUsuario" value="<%=fUsuario.getFusuIdUsuario()%>" style=" WIDTH: 130px" maxlength="20" size="22" disabled="disabled" /></td>
    </tr>
    
    <tr>
      <td align="right" class="texto">Nombre de Usuario:</td>
      <td><input type="text" name="fusuNombreUsuario" value="<%=fUsuario.getFusuNombreUsuario()%>" style="WIDTH: 200px" maxlength="20" size="22" disabled="disabled"/></td>
    </tr> 
    
    <tr>
      <td align="right" class="texto">Perfil:</td>
      <td>
        <select name="fperIdPerfil" disabled="disabled">
          <option value="-1">Seleccione Perfil</option>
          <% 
          if (fPerfilDAO != null) {
            out.print(fPerfilDAO.generarSelect(fUsuario.getFperIdPerfil()));
          }
        %>
        </select>
      </td>
    </tr>

    <tr>
      <td align="right" class="texto">E-mail:</td>
      <td><input type="text" name="fusuEmail" value="<%=fUsuario.getFusuEmail()%>" style=" WIDTH: 130px" maxlength="50" disabled="disabled"/></td>
    </tr>

    <tr>
      <td align="right" class="texto">Status:</td>
      <td>
        <select name="fusuStatus" disabled="disabled">
          <option value="-1">Seleccione Status</option>
        <% 
          if (fUsuarioDAO != null) {
            out.print(fUsuarioDAO.generarSelectStatus(fUsuario.getFusuStatus()));
          }
        %>
        </select>
      </td>
    </tr>
    <%
    String fusuImpMaximo = stringFormatter.formatMoney(String.valueOf(fUsuario.getFusuImpMaximo()));
    %>
    <tr>
      <td align="right" class="texto">Importe M&aacute;ximo Autorizado:</td>
      <td class="texto"><input type="text" name="fusuImpMaximo" value="<%=fusuImpMaximo%>" style=" WIDTH: 130px" maxlength="50" disabled="disabled"/> *</td>
    </tr>
    
    </tr>
      <td></td>
      <td align="left"><font class="mensaje01">* Aplica solamente para retiros.</font></td>
    </tr>    

    <tr>
      <td align="right" class="texto">
      <%
        String checkedFusuMteo = "";
        if (fUsuario.getFusuMteo()==1) {
          checkedFusuMteo = "checked=\"checked\"";
        } 
      %>
      <input type="CHECKBOX" name="fusuMteo" disabled="disabled" <%=checkedFusuMteo%> />      
      </td>
      <td class="texto">No dispersa MTEO</td>
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
          <input type="button" name="AceptarAF" class="boton" value="Asignar Fideicomiso" onClick="javascript:aceptarAF();" />
          <input type="button" name="CancelarAF" class="boton" value="Cancelar" onClick="javascript:cancelarAF();" />
        </DIV>
      </td>
    </tr>
    <tr class="subtitulo">
      <td align="center" colspan="7">&nbsp;</td>
    </tr>
    <tr class="celda02"/>
  </table>
  <tr>
    <td colspan="2" align="center">&nbsp;</td>
  </tr>
</form>