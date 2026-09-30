<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ include file="Sesion.jsp" %>
<HTML>
<HEAD><TITLE>FiduciaWeb Movil  -  <%=session.getAttribute("empresa_1")%></TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" src="scripts/navegador.js"></script>
</HEAD>
<BODY class="bg-light" onLoad="detect();">
  <jsp:include page="header.jsp"/>
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%">
  <TBODY>  
    
    <TR > 
      <TD align="center" class="tdMenuLateral"  valign="top"  width="176">&nbsp;</TD>
      <TD valign="top" align="center"><form name="Fideicomiso" action="<%=((String)session.getAttribute("token")).equals("1")?"FI_Token.jsp":"FI_Bienvenida.jsp"%>" method="post">
          <table border="0" cellpadding=1 cellspacing=1 width="505" >
            <tbody>
              <tr> 
                <td >&nbsp;</td>
              </tr>
              <tr> 
                <td >&nbsp;</td>
              </tr>
              <tr> 
                <td >&nbsp;</td>
              </tr>
              <tr> 
                <td height="94" align="center"></td>
              </tr>
              <tr> 
                <td >&nbsp;</td>
              </tr>
              <tr> 
                <td align="center" > 
                  <%
                     if(session.getAttribute("Actualiza")!=null)
                     {
                  %>
                  <font class="subtitulo"  color="#C60000"><%=session.getAttribute("Actualiza")%></font> 
                  <%
                     }
                  %>
                </td>
              </tr>
              <tr> 
                <td >&nbsp;</td>
              </tr>
              <tr> 
                <td  class="subtitulo"><%=session.getAttribute("NomUser")%></td>
              </tr>
              <tr> 
                <td>&nbsp;</td>
              </tr>
              <tr> 
                <td   class="texto">Selecciona el fideicomiso que deseas consultar: </td>
              </tr>
              <tr> 
                <td  align="center"><select name="cboFideicomiso" style="width:400px;" class="texto">
                    <%=BD.DataCombo((String[])session.getAttribute("Fideicomisos"))%> 
                  </select>&nbsp;<input type="button" name="Seleccionar" value="Seleccionar"  class="btn btn-primary" onClick="javascript:document.Fideicomiso.submit();"> 
                </td>
              </tr>
              <tr> 
                <td  >&nbsp;</td>
              </tr>
              <tr> 
                <td  align="right" > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>
              </tr>
            </tbody>
          </table>
        </form></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
