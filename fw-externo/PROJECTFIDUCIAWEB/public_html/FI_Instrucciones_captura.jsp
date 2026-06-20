<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="Sesion.jsp" %>

<HTML>
<HEAD><TITLE>Instrucciones - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<%if(((String)session.getAttribute("token")).equals("1"))
    {%>
 <%@ include file="objetosPKI.jsp" %>
<%}%>
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_preloadImages() { 
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { 
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_findObj(n, d) { 
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { 
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script>

<script>
    function cambiaCursor() {
       document.body.style.cursor = "wait";
    }
</script>

</HEAD>
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')" >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366"><IMG 
            src="imagenes/logo.jpg" 
            alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="176"></TD>
      <TD vAlign="top" background="imagenes/msur01.png"
          ></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
    <TR > 
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=BD.fecha()%></TD>
      <TD background="imagenes/fondoMenu.gif"><a href="FI_Consultas.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','imagenes/consultas2.gif',1)"><img src="imagenes/consultas1.gif" name="Image10" width="104" height="17" border="0"></a><a href="FI_Instrucciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Instrucciones','','imagenes/instrucciones2.gif',1)"><img src="imagenes/instrucciones1.gif" name="Instrucciones"  border="0"></a><!--a href="FI_EdosF.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Reportes','','imagenes/reportes2.gif',1)"><img src="imagenes/reportes1.gif" name="Reportes"  border="0"></a--><a href="FI_Opciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Opciones','','imagenes/Opciones2.gif',1)"><img src="imagenes/Opciones1.gif" name="Opciones"  border="0"></a><a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir"  border="0"></a></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540"  width="176">
	  <%@ include file="menuInstrucciones.jsp" %>
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">INSTRUCCIONES  <%=(tipoUsuario!=null &&  tipoUsuario.equals("SECRETARIO DE ACTAS"))?" DEL COMITE TÉCNICO":""%></td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
			</table>		  
		          
        <%if(tipoUsuario!=null &&  !tipoUsuario.equals("CLIENTE SECRETARIO DE ACTAS") && !tipoUsuario.equals("EJECUTIVO SECRETARIO DE ACTAS"))
  		{%>
        <table width="90%" border="0" cellspacing="1" cellpadding="1">
          <tr class="alerta">
            <td align="center"><%=session.getAttribute("errorToken")!=null ?(String)session.getAttribute("errorToken")+"<br>":""%> </td>
          </tr>
        </table> 
        <table width="593" border="0">

          <tr> 
            <td  align="center" valign="top">
			     

			<table width="90%" border="0" >
                <tr> 
                  <td  align="center" class="alerta">
				  <%=session.getAttribute("msgError")!=null ?(String)session.getAttribute("msgError")+"<br>":""%> 
				  <%=request.getParameter("error")!=null && !request.getParameter("error").equals("") && session.getAttribute("operacion")!=null && !((String)session.getAttribute("operacion")).equals("")?(String)session.getAttribute("operacion")+"<br>":""%> 
				  <%=(request.getParameter("permiso")!=null && ( ((String)session.getAttribute("permiso")).equals("CLIENTE CONSULTA")||((String)session.getAttribute("permiso")).equals("CLIENTE DEPOSITO")||((String)session.getAttribute("permiso")).equals("CLIENTE CAPTURA") )) || (request.getParameter("permiso")!=null && request.getParameter("permiso").equals("0"))?"Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operación<br>":""%>
				  <%=(session.getAttribute("errorSsign")!=null&& ! ((String)session.getAttribute("errorSsign")).equals("") )?"Su operaci&oacute;n no fue  procesada<br> Error al Firmar Digitalmente:<br>"+(String)session.getAttribute("errorSsign"):""%>
				  <%
				  session.setAttribute("errorToken","");
 			      session.setAttribute("msgError","");
				  session.setAttribute("errorSsign","");
				  session.setAttribute("operacion","");
				  %>
				  <BR>
				  <BR>
                  </td>
                </tr>
              </table> 
              <table border="0" width="90%" align="center" >
                <tr> 
                  <td   class="texto" ><p align="justify">Desde este sitio puedes 
                      girar instrucciones para efectuar operaciones fiduciarias, 
                      de acuerdo con los siguientes horarios: 
                    <p></td>
                </tr>
                <tr> 
                  <td width="85%" class="texto"><ul>
                      <li> 
                        <p align="justify" > Los depósitos instruidos y realizados 
                          en las Cuentas de <%=session.getAttribute("empresa_9")%> a más tardar a las 12:30 horas 
                          serán aplicados el mismo día hábil. </p>
                      </li>
                    </ul>
                    <ul>
                      <li> 
                        <p align="justify"> Los retiros solicitados a más tardar 
                          a las 12:30 horas serán liquidados al siguiente día 
                          hábil, siempre y cuando su forma de liquidación sea 
                          Cheque, SPEUA, SIAC Banxico, TBC Bancomer o Transferencia 
                          Electrónica de Fondos. En el caso de SWIFT el plazo 
                          para la liquidación será de dos días hábiles en Estados 
                          Unidos y Canadá y de tres días hábiles para el resto 
                          del mundo</p>
                      </li>
                    </ul></td>
                </tr>
              </table> </td>
          </tr>
        </table>
		<%}
		else
			{
			%>
        <table border="0" width="70%" align="center" >
          <tr>
            <td   class="texto" >&nbsp;</td>
          </tr>
          <tr>
            <td   class="texto" >&nbsp;</td>
          </tr>
          <tr>
            <td   class="texto" >&nbsp;</td>
          </tr>
          <tr> 
            <td width="85%"   class="texto" ><p align="justify">Desde este sitio 
                puedes autorizar los montos para las instrucciones de Liquidaci&oacute;n 
                para efectuar operaciones fiduciarias.
              <p></td>
          </tr>
        </table>
        <%
			}
		%></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
