<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.nFiducia"/>
<jsp:useBean id="BD2"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="instrucciones"  class="com.bancomext.negocio.nConsultas"/>
<%@ page import="java.text.*,java.util.*"%>
<%@ include file="sesionInst9.jsp" %>
<HTML>
<HEAD><TITLE>Instrucciones - Pendientes </TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function detalle(folio,tipoOperacion,existeToken)
	{
	  document.InstPen.txtFolio.value = folio;
    document.InstPen.txtTipoOpera.value = tipoOperacion;
	//valida si el usuario usa token
//1=si
//0=no
if(existeToken==1)
	{
	mostrarToken(); 
	return;
	}

 

   document.InstPen.submit();
	}

function aceptarToken() 
	{
	if(document.InstPen.txtToken.value=="")
		{
		alert("Es necesario que digite su token");
		document.InstPen.txtToken.focus();
		return;
		}	
   if((document.InstPen.txtToken.value).length<6)
		{
		alert("La longitud del token es invalida");
		document.InstPen.txtToken.value="";
		document.InstPen.txtToken.focus();
		return;
		}	
	if(isNaN(document.InstPen.txtToken.value))
		{
		alert("El token es un dato numerico");
		document.InstPen.txtToken.value="";
		document.InstPen.txtToken.focus();
		return;
		}		
	document.InstPen.action="confirmarInst_9.jsp";
	document.InstPen.submit();
	}	
	
function mostrarToken() 
{
datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.InstPen.txtToken.focus();
}

function ocultarToken() 
{
document.InstPen.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

}

//-->
</script>
</HEAD>
<body class="bg-light">
  <jsp:include page="header.jsp"/>
<a name="top"></a> 
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%"  height="100%" >
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
        <%@ include file="menuInstrucciones.jsp" %>
      </TD>
      <TD valign="top" align="center">
	 <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        <table width="593" border="0">
          <tr> 
            <td class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Instrucciones 
              Pendientes </td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"> 
			<form name="InstPen" method="post" action="confirmarInst_9.jsp">
                <input type="hidden" name="txtFolio"  value="">
				<input type="hidden" name="txtTipoOpera"  value="">
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
                <table width="85%" border="0" id="datos">
                  <tr> 
                    <td height="20" colspan="4" class="alerta" align="center"><%=request.getParameter("st")!=null && request.getParameter("st").equals("1")?(String)session.getAttribute("msgError"):""%>&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="20"> <table  width="520">
                        <%
						    session.setAttribute("folioInst","");
							//muestra tabla con los registros segun el criterio de busqueda
							instrucciones.setVtrIntDato1(Integer.parseInt((String)session.getAttribute("NumFid")));
                                                        instrucciones.setVtrStrDato1(BD2.getFecha());
							instrucciones.querySelect(11);
										  																
							//renglon de titulos de usuarios
							%>
                        <tr class="celda01" bgcolor="#999966"> 
                          <td align="center">FOLIO</td>
                          <td  align="center">FECHA DE CAPTURA</td>
                          <td align="center"> TIPO DE INSTRUCCION</td>
                          <td  align="center">IMPORTE</td>
                        </tr>
                        <%
						//tabla con registros de usuarios
						for(int r=0; r < instrucciones.getSize(); r++)
							 {
							 instrucciones.setIndex (r );%>
                        <tr  class="celda02"> 
                          <td  align="center" class="textoAzul"> <a href="javascript:detalle(<%=instrucciones.getVtrIntDato1()%>,<%=instrucciones.getVtrIntDato4()%>,<%=(String)session.getAttribute("token")%>);" ><%=instrucciones.getVtrIntDato1()%></a></td>
                          <td  align="center"><%=instrucciones.getVtrStrDato2()%> </td>
                          <td  align="center"><%=instrucciones.getVtrStrDato3()%> </td>
                          <td  align="right"><%=instrucciones.getVtrIntDato4()==2?NumberFormat.getCurrencyInstance(Locale.US).format(instrucciones.getVtrDoubleDato6()):NumberFormat.getCurrencyInstance(Locale.US).format(instrucciones.getVtrDoubleDato5())%> </td>
                        </tr>
                        <%}
						if ( instrucciones.hasData () == false)
								  {%>
                        <tr  class="celda01"> 
                          <td align="center" colspan="4">No Existen Instrucciones 
                            Pendientes</td>
                        </tr>
                        <%}%>
                      </table></td>
                  </tr>
                  <tr> 
                    <td height="20" colspan="4">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="20" colspan="4">&nbsp;</td>
                  </tr>
                </table>
              </form>
              <table border=0 cellpadding=0 cellspacing=1 >
                <tr align=middle valign=center> 
                  <td height=30> <div align="center"><a href="#top"><img border=0 height=11 src="imagenes/arriba.gif" width=59></a></div></td>
                </tr>
                <tr align=middle> 
                  <td  height=7><img height=1 src="imagenes/cnaranja01.gif" width=470></td>
                </tr>
              </table>
              <table border=0 cellpadding=0 cellspacing=1 >
                <tbody>
                  <tr> 
                    <td align="middle" class="ref" >|<a  href="FI_Legales.jsp" class="ref">ASPECTOS 
                      LEGALES</a>|</td>
                  </tr>
                </tbody>
              </table></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
