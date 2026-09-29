<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*,java.lang.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="sesionInstrucc.jsp"%>
<HTML>
<HEAD><TITLE>Instrucciones - Cancelación de Compromisos</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" SRC='scripts/general.js'>
</script>
<script language="JavaScript" SRC='scripts/instruccionFS6.js'>
</script>
<script language="JavaScript" type="text/JavaScript">
var existeToken="<%=(String)session.getAttribute("token")%>";
<!--
function MM_swapImgRestore() { 
   var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { 
   var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
   var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
   if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { 
   var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) 
   {
      d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);
   }
   if(!(x=d[n])&&d.all)
      x=d.all[n]; 
   for (i=0;!x&&i<d.forms.length;i++) 
      x=d.forms[i][n];
   for(i=0;!x&&d.layers&&i<d.layers.length;i++)
      x=MM_findObj(n,d.layers[i].document);
   if(!x && d.getElementById) 
      x=d.getElementById(n);
   return x;
}

function MM_swapImage() { 
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script>
</HEAD>
<%
   DecimalFormat dfFormat = new DecimalFormat("###,##0.00");
   boolean bSaldoOk = false;
   double dImpFed = 0;
   double dImpEst = 0;
   double dImpRen = 0;

   if (request.getParameter("cboEjercicio")!=null && request.getParameter("cboEje")!=null && request.getParameter("cboPrograma")!=null && request.getParameter("cboProyecto")!=null && request.getParameter("cboAccion")!=null)
      if (!request.getParameter("cboEjercicio").equals("Selecciona un Ejercicio") && !request.getParameter("cboPrograma").equals("Selecciona un Programa") && !request.getParameter("cboProyecto").equals("Selecciona un Proyecto") && !request.getParameter("cboAccion").equals("Selecciona una Acción"))
      {
         dImpFed = BD.getSaldoRecursos((String)session.getAttribute("NumFid"),request.getParameter("cboEjercicio"),request.getParameter("cboEje").substring(0,request.getParameter("cboEje").indexOf(" ")),request.getParameter("cboPrograma").substring(0,request.getParameter("cboPrograma").indexOf(" ")),request.getParameter("cboProyecto").substring(0,request.getParameter("cboProyecto").indexOf(" ")),request.getParameter("cboAccion").substring(0,request.getParameter("cboAccion").indexOf(" ")),"1",2);
         dImpEst = BD.getSaldoRecursos((String)session.getAttribute("NumFid"),request.getParameter("cboEjercicio"),request.getParameter("cboEje").substring(0,request.getParameter("cboEje").indexOf(" ")),request.getParameter("cboPrograma").substring(0,request.getParameter("cboPrograma").indexOf(" ")),request.getParameter("cboProyecto").substring(0,request.getParameter("cboProyecto").indexOf(" ")),request.getParameter("cboAccion").substring(0,request.getParameter("cboAccion").indexOf(" ")),"2",2);
         dImpRen = BD.getSaldoRecursos((String)session.getAttribute("NumFid"),request.getParameter("cboEjercicio"),request.getParameter("cboEje").substring(0,request.getParameter("cboEje").indexOf(" ")),request.getParameter("cboPrograma").substring(0,request.getParameter("cboPrograma").indexOf(" ")),request.getParameter("cboProyecto").substring(0,request.getParameter("cboProyecto").indexOf(" ")),request.getParameter("cboAccion").substring(0,request.getParameter("cboAccion").indexOf(" ")),"3",2);
         bSaldoOk = true;
      }
%>
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/consultas2.gif','imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif')" >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366"><IMG 
            src="imagenes/logo.jpg" 
            alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="176"></TD>
      <TD width="835" vAlign="top" background="imagenes/msur01.png"
          > <DIV align="right"><FONT color="#FFFFFF"
            size=-7 
            face="Arial, Helvetica, sans-serif"> 01 800 623 4672 &nbsp;&nbsp;</FONT>&nbsp;&nbsp;<A 
            href="mailto:info@bancomext.com"><FONT color="#FFFFFF"size=-7 
            face="Arial, Helvetica, sans-serif">info@bancomext.com&nbsp;&nbsp;&nbsp;</FONT></A> 
        </DIV></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
    <TR > 
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=sysFecha%></TD>
      <TD background="imagenes/fondoMenu.gif"><a href="FI_Consultas.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image101','','imagenes/consultas2.gif',1)"><img src="imagenes/consultas1.gif" name="Image101" width="104" height="17" border="0" id="Image101"></a><a href="FI_Instrucciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Instrucciones1','','imagenes/instrucciones2.gif',1)"><img src="imagenes/instrucciones2.gif" name="Instrucciones1"  border="0" id="Instrucciones1"></a><a href="FI_EdosF.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Reportes11','','imagenes/reportes2.gif',1)"><img src="imagenes/reportes1.gif" name="Reportes11"  border="0" id="Reportes1"></a><a href="FI_Opciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Opciones11','','imagenes/Opciones2.gif',1)"><img src="imagenes/Opciones1.gif" name="Opciones11"  border="0" id="Opciones1"></a><a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir11','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir11"  border="0" id="Salir1"></a></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540" width="176"> 
        <%@ include file="menuInstrucciones.jsp" %>
      </TD>
      <TD valign="top" align="center"> <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        <table width="593" border="0">
          <tr> 
            <td class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Cancelaci&oacute;n 
              de Compromisos</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"><form name="CompromisoCan"  method="post" action="">
                <input type="hidden" name="txtTipoC" value="S">
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
                <table width="499" height="405" border="0" id="datos">
                  <tr> 
                    <td height="20"  colspan="3" align="left" class="subtitulo">Compromiso:</td>
                  </tr>
                  <tr> 
                    <td height="20" colspan="3">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td width="134"    height="18" align="right"  class="texto">Ejercicio:</td>
                    <td colspan="2" class="texto"> <select name="cboEjercicio" onChange="ObtenerDatos(1)">
                        <option selected>Selecciona un Ejercicio</option>
                        <%
                                    if(request.getParameter("cboEjercicio")!=null)
                                    {
                                       out.print(BD.DataCombos(13,(String)session.getAttribute("NumFid"),request.getParameter("cboEjercicio")));
                                    }
                                    else
                                    {
                                       out.print(BD.DataCombos(13,(String)session.getAttribute("NumFid"),""));
                                    }
                                 %>
                      </select> </td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="3" class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="3"  class="subtitulo" align="left">Registro 
                      Presupuestal :</td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Eje:</td>
                    <td colspan="2" class="texto"> <select name="cboEje" onChange="ObtenerDatos(2)" style=" WIDTH: 330px;">
                        <option selected>Selecciona un Eje</option>
                        <%
                                       if(request.getParameter("cboEjercicio")!=null)
                                          if (!request.getParameter("cboEjercicio").equals("Selecciona un Ejercicio"))
                                          {
                                             if (!request.getParameter("cboEjercicio").equals("Selecciona un Eje"))
                                                out.print(BD.DataCombos(14,(String)session.getAttribute("NumFid") + " , " + request.getParameter("cboEjercicio"),request.getParameter("cboEje")));
                                             else
                                                out.print(BD.DataCombos(14,(String)session.getAttribute("NumFid") + " , " + request.getParameter("cboEjercicio"),request.getParameter("cboEje")));
                                          }
                                    %>
                      </select> </td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Programa:</td>
                    <td colspan="2" class="texto"> <select name="cboPrograma" onChange="ObtenerDatos(3)" style=" WIDTH: 330px;">
                        <option selected>Selecciona un Programa</option>
                        <%
                                       if(request.getParameter("cboEjercicio")!=null)
                                          if(request.getParameter("cboEje")!=null)
                                             if (!request.getParameter("cboEjercicio").equals("Selecciona un Ejercicio"))
                                                if (!request.getParameter("cboEje").equals("Selecciona un Eje"))
                                                {
                                                   if (!request.getParameter("cboPrograma").equals("Selecciona un Programa"))
                                                      out.print(BD.DataCombos(15,(String)session.getAttribute("NumFid") + " , " + request.getParameter("cboEjercicio") + " : " + request.getParameter("cboEje").substring(0,request.getParameter("cboEje").indexOf(" ")),request.getParameter("cboPrograma")));
                                                   else
                                                      out.print(BD.DataCombos(15,(String)session.getAttribute("NumFid") + " , " + request.getParameter("cboEjercicio") + " : " + request.getParameter("cboEje").substring(0,request.getParameter("cboEje").indexOf(" ")),""));
                                                }
                                    %>
                      </select> </td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Proyecto:</td>
                    <td colspan="2" class="texto"> <select name="cboProyecto" onChange="ObtenerDatos(4)" style=" WIDTH: 330px;">
                        <option selected>Selecciona un Proyecto</option>
                        <%
                                       if(request.getParameter("cboEjercicio")!=null)
                                          if(request.getParameter("cboEje")!=null)
                                             if(request.getParameter("cboPrograma")!=null)
                                                if (!request.getParameter("cboEjercicio").equals("Selecciona un Ejercicio"))
                                                   if (!request.getParameter("cboEje").equals("Selecciona un Eje"))
                                                      if(!request.getParameter("cboPrograma").equals("Selecciona un Programa"))
                                                      {
                                                         if (!request.getParameter("cboProyecto").equals("Selecciona un Proyecto"))
                                                            out.print(BD.DataCombos(16,(String)session.getAttribute("NumFid") + " , " + request.getParameter("cboEjercicio") + " : " + request.getParameter("cboEje").substring(0,request.getParameter("cboEje").indexOf(" ")) + " - " + request.getParameter("cboPrograma").substring(0,request.getParameter("cboPrograma").indexOf(" ")),request.getParameter("cboProyecto")));
                                                         else
                                                            out.print(BD.DataCombos(16,(String)session.getAttribute("NumFid") + " , " + request.getParameter("cboEjercicio") + " : " + request.getParameter("cboEje").substring(0,request.getParameter("cboEje").indexOf(" ")) + " - " + request.getParameter("cboPrograma").substring(0,request.getParameter("cboPrograma").indexOf(" ")),""));
                                                      }
                                    %>
                      </select> </td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Acci&oacute;n:</td>
                    <td colspan="2" class="texto"> <select name="cboAccion"  onChange="ObtenerDatos(5)" style=" WIDTH: 330px;">
                        <option selected>Selecciona una Acci&oacute;n</option>
                        <%
                                       if(request.getParameter("cboEjercicio")!=null)
                                          if(request.getParameter("cboEje")!=null)
                                             if(request.getParameter("cboPrograma")!=null)
                                                if (!request.getParameter("cboEjercicio").equals("Selecciona un Ejercicio"))
                                                   if (!request.getParameter("cboEje").equals("Selecciona un Eje"))
                                                      if(!request.getParameter("cboPrograma").equals("Selecciona un Programa"))
                                                         if(!request.getParameter("cboProyecto").equals("Selecciona un Proyecto"))
                                                         {
                                                            if (!request.getParameter("cboProyecto").equals("Selecciona un Proyecto"))
                                                               out.print(BD.DataCombos(17,(String)session.getAttribute("NumFid") + " , " + request.getParameter("cboEjercicio") + " : " + request.getParameter("cboEje").substring(0,request.getParameter("cboEje").indexOf(" ")) + " - " + request.getParameter("cboPrograma").substring(0,request.getParameter("cboPrograma").indexOf(" ")) + " _ " + request.getParameter("cboProyecto").substring(0,request.getParameter("cboProyecto").indexOf(" ")),request.getParameter("cboAccion")));
                                                            else
                                                               out.print(BD.DataCombos(17,(String)session.getAttribute("NumFid") + " , " + request.getParameter("cboEjercicio") + " : " + request.getParameter("cboEje").substring(0,request.getParameter("cboEje").indexOf(" ")) + " - " + request.getParameter("cboPrograma").substring(0,request.getParameter("cboPrograma").indexOf(" ")) + " _ " + request.getParameter("cboProyecto").substring(0,request.getParameter("cboProyecto").indexOf(" ")),""));
                                                         }
                                    %>
                      </select> </td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="3" class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="3" class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="21" class="subtitulo" >Origen:</td>
                    <td width="177" height="21"  class="subtitulo">Importes a 
                      Cancelar:</td>
                    <td width="174" height="21" class="subtitulo">Saldo Comprometido:</td>
                  </tr>
                  <tr> 
                    <td align="right" class="texto">Federal:</td>
                    <td  class="texto"> <input name="txtImporte1" type="text" size="32"  value="<%=request.getParameter("txtImporte1")!=null?request.getParameter("txtImporte1"):""%>"  onKeyUp="validaNum(this.form.txtImporte1);"   onBlur="formatImporte(this.form.txtImporte1)"> 
                    </td>
                    <td align="right" class="texto2"> 
                      <%
                                 if (bSaldoOk)
                                 {
                                    out.print(NumberFormat.getCurrencyInstance(Locale.US).format(dImpFed));
                              %>
                      <input type="hidden" name="txtImpFed" value="<%=dImpFed%>"> 
                      <%
                                 }   
                                 else
                                 {
                                    out.print("&nbsp;");
                              %>
                      <input type="hidden" name="txtImpFed" value="0"> 
                      <%
                                 } 
                              %>
                    </td>
                  </tr>
                  <tr> 
                    <td align="right" class="texto">Estatal:</td>
                    <td class="texto"> <input name="txtImporte2" type="text" size="32"  value="<%=request.getParameter("txtImporte2")!=null?request.getParameter("txtImporte2"):""%>"   onKeyUp="validaNum(this.form.txtImporte2);"   onBlur="formatImporte(this.form.txtImporte2)"> 
                    </td>
                    <td align="right" class="texto2"> 
                      <%
                                 if (bSaldoOk)
                                 {
                                    out.print(NumberFormat.getCurrencyInstance(Locale.US).format(dImpEst));
                              %>
                      <input type="hidden" name="txtImpEst" value="<%=dImpEst%>"> 
                      <%
                                 }   
                                 else
                                 {
                                    out.print("&nbsp;");
                              %>
                      <input type="hidden" name="txtImpEst" value="0"> 
                      <%
                              } 
                              %>
                    </td>
                  </tr>
                  <tr> 
                    <td align="right"  class="texto">Rendimientos:</td>
                    <td  class="texto"> <input name="txtImporte3" type="text" id="txtImporte32"  size="32"  value="<%=request.getParameter("txtImporte3")!=null?request.getParameter("txtImporte3"):""%>"   onKeyUp="validaNum(this.form.txtImporte3);"   onBlur="formatImporte(this.form.txtImporte3)"> 
                    </td>
                    <td align="right" class="texto2"> 
                      <%
                                 if (bSaldoOk)
                                 {
                                    out.print(NumberFormat.getCurrencyInstance(Locale.US).format(dImpRen));
                              %>
                      <input type="hidden" name="txtImpRen" value="<%=dImpRen%>"> 
                      <%
                                 }   
                                 else
                                 {
                                    out.print("&nbsp;");
                              %>
                      <input type="hidden" name="txtImpRen" value="0"> 
                      <%
                                 } 
                              %>
                    </td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="3" class="texto"> <input name="txtImporte" type="hidden"> 
                    </td>
                  </tr>
                  <tr> 
                    <td width="134"    height="18" align="right"  class="texto">Acuerdo 
                      de Comite o Carta de Instrucci&oacuten:</td>
                    <td colspan="2" class="texto"> <input name="txtAcuerdo" type="text" size="50" maxlength="50" value="<%=request.getParameter("txtAcuerdo")!=null?request.getParameter("txtAcuerdo"):""%>"> 
                    </td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="3" class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="33" colspan="3" align="center"> 
                      <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:ValidarDatos(
<%=(String)session.getAttribute("token")%>)" class="boton">&nbsp;
                      <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()" class="boton"> 
                    </td>
                  </tr>
                </table>
              </form>
              <table border="0" cellpadding="0" cellspacing="1"  class="texto_menu_inf" width=495>
                <tbody>
                  <tr align="middle" valign="center"> 
                    <td class="texto_menu_inf"  height="30" align="center"> <a  href="#top"><img   border=0 height=12 src="imagenes/arriba.gif"  width=59></a></td>
                  </tr>
                  <tr align="middle"> 
                    <td class="texto_menu_inf"   height="7"><img   height=1 src="imagenes/cnaranja01.gif"  width=520></td>
                  </tr>
                  <tr> 
                    <td class="texto_menu_inf" height="7">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td class="texto_menu_inf"  height="26" valign="bottom" align="center"> 
                      <table border=0 cellpadding=0 cellspacing=1 >
                        <tbody>
                          <tr> 
                            <td class="textohome" >|</td>
                            <td align="middle" class="textohome" ><a  href="FI_Legales.jsp">ASPECTOS 
                              LEGALES</a></td>
                            <td class="textohome" >|</td>
                          </tr>
                        </tbody>
                      </table></td>
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
<script language="JavaScript">
	 if( document.CompromisoCan.cboEjercicio.selectedIndex==0)    
   	  			  document.CompromisoCan.cboEjercicio.focus();   
     else if( document.CompromisoCan.cboEje.selectedIndex==0)    	
      		document.CompromisoCan.cboEje.focus(); 
	else if( document.CompromisoCan.cboPrograma.selectedIndex==0)    
      		document.CompromisoCan.cboPrograma.focus(); 
	else if( document.CompromisoCan.cboProyecto.selectedIndex==0)    	
      		document.CompromisoCan.cboProyecto.focus(); 
	else if( document.CompromisoCan.cboAccion.selectedIndex==0)    	
       		document.CompromisoCan.cboAccion.focus(); 
   else if( document.CompromisoCan.cboAccion.selectedIndex!=0)    
     			 document.CompromisoCan.txtImporte1.focus();


  </script>

</BODY></HTML>
