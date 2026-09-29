<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%

 String sysFecha=BD.fecha(); 


 %>
<HTML>
<HEAD><TITLE>FiduciaWeb Movil  -  <%=session.getAttribute("empresa_1")%></TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" src="scripts/navegador.js"></script>
<script language="JavaScript">

function guia()
{
   window.open("acreditacion.doc","GUIA_DE_ACREDITACION","top=20,left=20,width=750,height=420,menubar=YES,scrollbars=YES");
}

function ir(opc) 
		{
if ( (bName == "Microsoft Internet Explorer") && (parseInt(bVer)<5))
		{
		location.href="Requisitos.jsp";
		}
else if(bName != "Microsoft Internet Explorer")
		{
		location.href="Requisitos.jsp";
		}
else {			
	if (opc==1)
			{
			location.href="<%=BD.getDatosParametros(103)%>";
			}
		if (opc==2)
			{
			window.open("<%=BD.getDatosParametros(104)%>",'cambio_pwd','resizable=YES,scrollbars=YES')  ;
			}	
		if (opc==3)
			{
			window.open("<%=BD.getDatosParametros(105)%>",'cambio_pwd','resizable=YES,scrollbars=YES')  ;
			}	
		}	
		}

</script>
</HEAD>
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0">
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%">
  <TBODY>
    <TR> 
      <TD width="176"  height="50"  background="imagenes/logo.jpg">&nbsp;</TD>
      <TD  vAlign="top" background="imagenes/msur01.png"
          > <DIV align="right">
            <FONT color="#FFFFFF" size="-7" face="Arial, Helvetica, sans-serif"><FONT color="#FFFFFF" size="-7" face="Arial, Helvetica, sans-serif">54 49 91&nbsp;12</FONT>&nbsp;&nbsp;</FONT>&nbsp;&nbsp;
            <A href="mailto:info@bancomextsa.com"><FONT color="#FFFFFF" size="-7" face="Arial, Helvetica, sans-serif">fiduciario@finalmex.com</FONT></A><A 
            href="mailto:info@bancomext.com"><FONT color="#FFFFFF"size=-7 
            face="Arial, Helvetica, sans-serif">&nbsp;&nbsp;</FONT></A> 
        </DIV></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
     <TR   > 
      <TD align="left" class="date" height="15" colspan="2" background="imagenes/fondoMenu.gif">&nbsp;&nbsp; <%=sysFecha!=null?sysFecha:""%> </TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540" width="176">&nbsp;</TD>
      <TD valign="top" align="center"><form name="inicio" action="FI_ValidUser.jsp" method="post">
          <table border="0" cellpadding=1 cellspacing=1 width="100%" height="333">
            <tbody>
              <tr> 
                <td width="576" ><input type="hidden" name="nameExplorador" value=""></td>
              </tr>
              <tr> 
                <td >&nbsp;</td>
              </tr>
              <tr> 
                <td >&nbsp;</td>
              </tr>
              <tr> 
                <td height="94" align="center"><img src="imagenes/fid1.png" > 
                </td>
              </tr>
              <tr> 
                <td >&nbsp;</td>
              </tr>
              <tr> 
                <td   class="texto" align="center">Si a�n no eres usuario, <a href="FI_Acreditacion.jsp">GUIA 
                  DE ACREDITACION</a></td>
              </tr>
              <tr> 
                <td>&nbsp;</td>
              </tr>
              <tr> 
                <td>&nbsp;</td>
              </tr>
              <tr> 
                <td align="center" class="subtitulo"> <input type="button" name="Entrar" value="&nbsp; INGRESAR AL SISTEMA  &nbsp;" class="boton" onClick="javascript:ir(1);"> 
                </td>
              </tr>
              <tr> 
                <td >&nbsp;</td>
              </tr>
              <tr> 
                <td align="center" class="subtitulo"> <input type="button" name="Entrar" value="CAMBIO DE CONTRASE�A" class="boton" onClick="javascript:ir(2);"> 
                </td>
              </tr>
              <tr> 
                <td >&nbsp;</td>
              </tr>
              <tr> 
                <td align="center" class="subtitulo"> <input type="button" name="Entrar" value="OLVIDO SU CONTRASE�A?" class="boton" onClick="javascript:ir(3);"> 
                </td>
              </tr>
              <tr> 
                <td >&nbsp;</td>
              </tr>
            </tbody>
          </table>
        </form></TD>
    </TR>

  </TBODY>
</TABLE>

</BODY></HTML>
