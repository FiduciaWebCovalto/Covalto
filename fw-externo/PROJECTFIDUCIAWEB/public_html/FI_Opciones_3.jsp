<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="BDR"  class="com.bancomext.negocio.RetirosDB"/>
<%@ include file="sesionOpc2.jsp" %>

<HTML>

<HEAD><TITLE>Opciones - Solicitud de Alta de Otras Cuentas</TITLE>

<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" SRC='scripts/registrar.js'>
</script>
<script language="JavaScript" SRC='scripts/ventanaError.js'>
</script>
</HEAD>


<!--  ALTA DE TRANSFERENCIA ELECTRONICA -->

<body class="bg-light">

<%
      if( request.getAttribute("mensajeError") != null ) { %>
           <script language="javascript"> ventanaError() </script>
       <%
      }         
%>
<jsp:include page="header.jsp"/>
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%" >
  <TBODY>
    <TR class="trMenuSuperior">
      <TD colspan="7">
        <ul class="menuSuperior">
          <li><a href="FI_Consultas.jsp">Consultas</a></li>
          <li><a href="FI_Instrucciones.jsp">Instrucciones</a></li> <li><a href="FI_InstruccionesN.jsp">Instrucciones No Monetarias</a></li>
          <li><a href="FI_EdosF.jsp">Informacion Financiera</a></li>
          <li><a href="FI_Opciones.jsp">Opciones</a></li>
          <li><a href="salir.jsp">Salir</a></li>
        </ul>
      </TD>
    </TR>
    <TR > 
      <TD align="center" class="tdMenuLateral"  valign="top" height="100%"   width="176">
        <%@ include file="menuOpciones.jsp" %>
      </TD>
      <TD valign="top" align="center">
	   <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %></td>
          </tr>
        </table>
        <table width="593" border="0">
          <tr> 
            <td class="texto">&nbsp;</td>
          </tr>
          
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Solicitud de Alta de Terceros</td>
          </tr>
          
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td valign="top" align="center"> 
              <table border="0" width="90%">
                <tr> 
                  <td align="center" class="alerta" > <%=(request.getParameter("permiso")!=null && ( ((String)session.getAttribute("permiso")).equals("CLIENTE CONSULTA")||((String)session.getAttribute("permiso")).equals("CLIENTE DEPOSITO")||((String)session.getAttribute("permiso")).equals("CLIENTE CAPTURA") )) || (request.getParameter("permiso")!=null && request.getParameter("permiso").equals("0"))?"Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operación<br>":""%> 
                  </td>
                </tr>
              </table>
              
              
              <form name="RegistrarCuenta" method="post" action="confirmarOpc_3.jsp">
                <table width="50%" border="0" cellspacing="1" cellpadding="1" align="center">
                  <tr> 
                    <td><div id="token" style="position:absolute; visibility:hidden;"   align="center"> 
                        <table width="305" border="1" cellpadding="1" cellspacing="1" bordercolor="#666666" bgcolor="#999999" align="center">
                          <tr> 
                            <td align="center"><table width="300" border="0" cellspacing="1" cellpadding="1" class="texto" bgcolor="#CCCCCC" align="center"  background="imagenes/fondoSubMenu.png">
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                                <tr> 
                                  <td width="43%">&nbsp;</td>
                                  <td width="57%">&nbsp;</td>
                                </tr>
                                <tr align="center"> 
                                  <td colspan="2" class="textoNegritaWhite">Introduzca 
                                    su <%=session.getAttribute("empresa_9")%>-LLAVE: 
                                    <input type="password" name="txtToken" size="10"  style=" WIDTH: 100px"
                                 maxlength="6"  value="<%=request.getParameter("txtToken")!=null?request.getParameter("txtToken"):""%>"></td>
                                </tr>
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                                <tr> 
                                  <td colspan="2" align="center"> <input type="button" name="AceptarToken" value="Aceptar" onClick="aceptarToken()" class="btn btn-primary"> 
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="button" name="CancelarToken" value="Cancelar" onClick="ocultarToken();" class="btn btn-danger"> 
                                  </td>
                                </tr>
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                              </table></td>
                          </tr>
                        </table>
                      </div></td>
                  </tr>
                </table>
                <table width="90%" height="98" id="datos">
                  <tr> 
                    </td>
                  </tr>
                  
                  <tr> 
                    <td width="198" class="texto" align="right">Nombre</td>
                    <td width="336" align="left"><input maxlength=80 name="txtCuenta"  size="30" style=" WIDTH:300px"> 
                      <font class="mensaje"></font></td>
                  </tr>
                  <tr> 
                    <td class="texto" align="right">RFC:</td>
                    <td align="left"><input maxlength=13 name="txtRFC" size="15" style=" WIDTH: 100px" onblur="convertirMayusculas(this)" ></td>
                  </tr>
                  <tr> 
                    <td class="texto" align="right">Numero de Convenio:</td>
                    <td align="left"><input maxlength=13 name="txtConvenio" size="15" style=" WIDTH: 80px" onblur="convertirMayusculas(this)" >
                    <font class="mensaje01"> (Requerido para Convenios CIE)</font></td>
                  </tr>                  
                  <tr> 
                    <td colspan="2" >&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2" class="texto">Tu Direcci&oacute;n de Correo 
                      Electronico es: <b><i><font face="Arial"> <%= session.getAttribute("Email") %></font></i></b></td>
                  </tr>
                  <tr> 
                    <td class="texto">&nbsp;</td>
                    <td class="texto"><b></b></td>
                  </tr>
     
			
                  <tr> 
                    <td class="texto" colspan="2">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td class="texto" colspan="2" align="center"> <input type="button" name="Aceptar2" value="Aceptar" class="boton" onClick="javascript:validacionTercero(<%=(String)session.getAttribute("token")%>)"> 
                      &nbsp; <input type="button" name="Cancelar2" value="Cancelar" class="boton" onClick="javascript:cancelarTerceros()"> 
                    </td>
                  </tr>
                </table>
              </form>

            </td>
          </tr>
        </table>
		</TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>

</BODY></HTML>
