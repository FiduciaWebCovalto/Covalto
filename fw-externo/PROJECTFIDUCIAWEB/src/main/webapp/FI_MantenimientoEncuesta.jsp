<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="BD2"  class="mx.com.inscitech.clients.negocio.RetirosDB"/>
<%@ include file="sesionInst1.jsp" %>

<%
	String radioTipoPersona=request.getParameter("radioTipoPersona");
%>

<HTML>
<HEAD><TITLE>Instrucciones - Deposito</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" SRC='scripts/general.js'></script>
<script language="JavaScript" SRC='scripts/instruccion1.js'></script>

<script language="JavaScript" >
						function FideicomitenteD()
							{
								document.Deposito.action = "FI_Instruccion1.jsp#tipoPersona"; 
								document.Deposito.submit();
							}	
						function TerceroD()
							{
									document.Deposito.action = "FI_Instruccion1.jsp#tipoPersona"; 
									document.Deposito.submit();
							}
						function FideicomisarioD()
							{
									document.Deposito.action = "FI_Instruccion1.jsp#tipoPersona"; 
									document.Deposito.submit();
							}
</script>

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
</HEAD>
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')" >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%" >
  <TBODY>
      <TR> 
          <TD width="176" bgcolor="#003366"><IMG 
            src="imagenes/logo.jpg" 
            alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="176"></TD>
          <TD vAlign="top" background="imagenes/msur01.png"> 
          </TD>
      </TR>
      <TR> 
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
         <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="100%"   width="176"> 
         <%@ include file="menuInstrucciones.jsp" %>
      </TD>
      <TD valign="top" align="center"> 
	        <table width="100%" border="0">
            <tr> 
               <td class="fiso">&nbsp;&nbsp;<a name="top"></a></td>
            </tr>
          </table>
          <table width="593" border="0">
            <tr> 
               <td class="texto">&nbsp;</td>
            </tr>
            <tr> 
               <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Mantenimiento de Encuesta</td>
            </tr>
            <tr> 
               <td>&nbsp;</td>
            </tr>
            <tr> 
               <td>
			   <form name="Deposito" method="POST" action="">
			   
                <table width="90%"  align="center" id="datos" border="0" cellspacing="1" cellpadding="2">
                  <tr> 
                    <td align="left"  class="subtitulo">
                      <DIV align="center"></DIV>
                    </td>
                  </tr>
                  <tr> 
                    <td align="right"  class="texto">
                      <DIV align="left">
                        <P>&nbsp;</P>
                        <P>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;No&nbsp;Opci&oacute;n:
                        <input type="text" name="sesionTema" style=" WIDTH: 50px" maxlength="3"/></P>
                      </DIV>
                    </td>
                  </tr>
                  <tr>
                    <td align="right" class="texto">Descripci&oacute;n:
                    <textarea name="Textarea" cols="10" rows="10" style=" WIDTH: 400px"> </textarea></td>
                  </tr>
                  <tr>
                    <td align="right" class="texto">
                      <DIV align="center">
                        <P>&nbsp;</P>
                        <P>
                          <input type="button" name="Aceptar" class="boton" value="Aceptar" onClick="javascript:confirmar()"/> &nbsp;&nbsp;&nbsp;
                          <input type="button" name="Cancelar" class="boton" value="Cancelar" onClick="javascript:cancelar()"/>&nbsp;&nbsp;&nbsp;&nbsp; 
                          <input type="button" name="Asigna Opciones" class="boton" value="Asigna Opciones" onClick=")"/>
                        </P>
                      </DIV>
                    </td>
                  </tr>
                 
                 
                  
                  
                  </tr>
                  
<input type="hidden"  name="cboPersona" size="13"  style=" WIDTH: 130px" maxlength="20"  value="<%=request.getParameter("cboTipoD")!=null?request.getParameter("cboTipoD"):""%>" > 

                  
                  <tr>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
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
