<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ include file="sesionInstrucc.jsp"%>
<HTML>
<HEAD><TITLE>Instrucciones - Asignación de Rendimientos </TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<%
double saldoDPA=0;
if(request.getParameter("cboEjercicio")!=null && !request.getParameter("cboEjercicio").equals("Selecciona un Ejercicio"))
	saldoDPA= BD.getRendimientosContrato((String)session.getAttribute( "NumFid" ),request.getParameter("cboEjercicio"),BD.getNumContrato((String)session.getAttribute("NumFid"),"RENDIMIENTOS"));
double saldoD=0;
if((request.getParameter("cboAccion")!=null &&  !(request.getParameter("cboAccion").trim()).equals("selecciona una Accion")))
  {
   String Ejercicio=request.getParameter("cboEjercicio");
   String Eje=request.getParameter("cboEje")+"  -";
	Eje=Eje.substring(0,Eje.indexOf('-'));
	String Programa=request.getParameter("cboPrograma")+"  -";
	Programa=Programa.substring(0,Programa.indexOf('-'));
	String Proyecto=request.getParameter("cboProyecto")+"  -";
	Proyecto=Proyecto.substring(0,Proyecto.indexOf('-'));
	String Accion=request.getParameter("cboAccion")+"  -";
	Accion=Accion.substring(0,Accion.indexOf('-'));
	saldoD=BD.getSaldoRecursos((String)session.getAttribute( "NumFid" ),Ejercicio,Eje,Programa,Proyecto,Accion,"3",1);
	
	}
%>
<script language="JavaScript" SRC='scripts/general.js'>
</script>
<script language="JavaScript" SRC='scripts/instruccionFS8.js'>
</script>
<script language="JavaScript" type="text/JavaScript">

  
function MM_findObj(n, d) { 
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImgRestore() { 
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { 
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImage() { 
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script>
</HEAD>
<body  class="bg-light"vLink="#052206" leftMargin="0" 
topMargin="0" marginwidth="0" marginheight="0"  onLoad="javascript:suma();MM_preloadImages('imagenes/consultas2.gif','imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif')">
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Asignaci&oacute;n 
              de Rendimientos</td>
          </tr>
          <tr> 
            <td align="center"><form name="AsignacionFS"  method="post" action="">
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
                <table width="90%"  align="center" id="datos">
                  <tr> 
                    <td height="20"  colspan="2" align="left" class="subtitulo">Asignaci&oacute;n 
                      de Rendimientos:</td>
                  </tr>
                  <tr> 
                    <td height="20" colspan="2">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td width="146"    height="18" align="right"  class="texto">Ejercicio: 
                      &nbsp; </td>
                    <td width="337"  class="texto"><select name="cboEjercicio" id="select" onChange="Mostrar()";>
                        <option>Selecciona un Ejercicio
                        <%if(request.getParameter("cboEjercicio")!=null   &&   !request.getParameter("cboEjercicio").equals("Selecciona un Ejercicio"))
                		                out.print(BD.DataCombos(13,(String)session.getAttribute( "NumFid" ),request.getParameter("cboEjercicio")));
                        	else
										out.print(BD.DataCombos(13,(String)session.getAttribute( "NumFid" ),""));
							%>
                        </option>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="21"  align="right"  class="texto">Saldo Disponible 
                      por Asignar:</td>
                    <td align="left"  class="subtitulo" ><%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoDPA)%> 
                      <input type="hidden" name="saldoDA" value="<%=saldoDPA%>"></td>
                  </tr>
                  <tr> 
                    <td align="right"  class="texto">Acuerdo del Comite T&eacute;cnico 
                      o Carta de Instrucci&oacute;n:</td>
                    <td class="texto"> <input name="txtAcuerdoComite" type="text" value="<%=request.getParameter("txtAcuerdoComite")!=null?request.getParameter("txtAcuerdoComite"):""%>"
				   maxlength=50 size=60 > </td>
                  </tr>
                  <tr> 
                    <td height="21" align="right" class="subtitulo"><a name="RP"></a>&nbsp;</td>
                    <td  class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="21" align="right" class="subtitulo"> Registro 
                      Presupuestal:</td>
                    <td  class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="21" align="right" class="texto">Eje: </td>
                    <td  class="textoCbo"><select name="cboEje" id="select2" onChange="Mostrar()"; style="HEIGHT: 22px; WIDTH: 330px;">
                        <option>Selecciona un Eje 
                        <%
							
							if(request.getParameter("cboEjercicio")!=null   &&   !(request.getParameter("cboEjercicio").trim()).equals("Selecciona un Ejercicio"))
                		               {
									   if(request.getParameter("cboEje")!=null   &&   !(request.getParameter("cboEje").trim()).equals("Selecciona un Eje"))
										    out.print(BD.DataCombos(14,(String)session.getAttribute( "NumFid" )+","+request.getParameter("cboEjercicio"),request.getParameter("cboEje")));
										else
											 out.print(BD.DataCombos(14,(String)session.getAttribute( "NumFid" )+","+request.getParameter("cboEjercicio"),""));
                        				}
							%>
                        </option>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Programa:</td>
                    <td  class="texto"><select name="cboPrograma" id="select3" onChange="Mostrar()"; style="HEIGHT: 22px; WIDTH: 330px;">
                        <option>Selecciona un Programa 
                        <%
							
							if(request.getParameter("cboEje")!=null   &&   !(request.getParameter("cboEje").trim()).equals("Selecciona un Eje"))
                		               {
									  
									   String Ejercicio=request.getParameter("cboEjercicio");
									   String Eje=request.getParameter("cboEje")+"  -";
									   	Eje=Eje.substring(0,Eje.indexOf('-'));
									
									   if(request.getParameter("cboPrograma")!=null   &&   !(request.getParameter("cboPrograma").trim()).equals("Selecciona un Programa"))
										 out.print(BD.DataCombos(15,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje,request.getParameter("cboPrograma")));
										else
										 out.print(BD.DataCombos(15,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje,""));
                        				}
							%>
                        </option>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Proyecto:</td>
                    <td  class="texto"><select name="cboProyecto" id="select4" onChange="Mostrar()"; style="HEIGHT: 22px; WIDTH: 330px;">
                        <option>Selecciona un Proyecto 
                        <%
							
							if(request.getParameter("cboPrograma")!=null   &&   !(request.getParameter("cboPrograma").trim()).equals("Selecciona un Programa"))
                		               {
									  
									   String Ejercicio=request.getParameter("cboEjercicio");
									   String Eje=request.getParameter("cboEje")+"  -";
									   Eje=Eje.substring(0,Eje.indexOf('-'));
									   String Programa=request.getParameter("cboPrograma")+"  -";
									   	Programa=Programa.substring(0,Programa.indexOf('-'));
									
									   if(request.getParameter("cboProyecto")!=null   &&   !(request.getParameter("cboProyecto").trim()).equals("Selecciona un Proyecto"))
										 out.print(BD.DataCombos(16,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje+"-"+Programa,request.getParameter("cboProyecto")));
										else
										 out.print(BD.DataCombos(16,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje+"-"+Programa,""));
                        				}
							%>
                        </option>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Acci&oacute;n:</td>
                    <td  class="texto"><select name="cboAccion" id="select5" style="HEIGHT: 22px; WIDTH: 330px;" onChange="Mostrar()">
                        <option value="selecciona una Accion">Selecciona una Acci&oacute;n 
                        <%
							
							if(request.getParameter("cboProyecto")!=null   &&   !(request.getParameter("cboProyecto").trim()).equals("Selecciona un Proyecto"))
                		               {
									    String Ejercicio=request.getParameter("cboEjercicio");
									    String Eje=request.getParameter("cboEje")+"  -";
									    Eje=Eje.substring(0,Eje.indexOf('-'));
									    String Programa=request.getParameter("cboPrograma")+"  -";
									   	Programa=Programa.substring(0,Programa.indexOf('-'));
										String Proyecto=request.getParameter("cboProyecto")+"  -";
										Proyecto=Proyecto.substring(0,Proyecto.indexOf('-'));
									   if(request.getParameter("cboAccion")!=null   &&   !(request.getParameter("cboAccion").trim()).equals("Selecciona una Accion"))
										 out.print(BD.DataCombos(17,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje+"-"+Programa+"_"+Proyecto,request.getParameter("cboAccion")));
										else
										 out.print(BD.DataCombos(17,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje+"-"+Programa+"_"+Proyecto,""));
                        				}
							%>
                        </option>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="23" align="right"  class="texto"> Saldo disponible:</td>
                    <td class="texto"><%=(request.getParameter("cboAccion")!=null&& !(request.getParameter("cboAccion").trim()).equals("selecciona una Accion"))?NumberFormat.getCurrencyInstance(Locale.US).format(saldoD):"$ 0.00"%> 
                      <input  type="hidden" name="saldoRP" value="<%=saldoD%>"></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right"  class="texto">Importe asignado:&nbsp;&nbsp;</td>
                    <td  class="texto"><input name="txtImporteA" type="text"  size="32"  value="<%=(request.getParameter("txtImporteA")!=null&&!request.getParameter("txtImporteA").equals(""))?request.getParameter("txtImporteA"):""%>"   onKeyUp="validaNum(this.form.txtImporteA);"   onBlur="formatImporte(this.form.txtImporteA)">  
                    </td>
                  </tr>
                  <tr> 
                    <td height="24"  align="right" class="textoNegrita"> Saldo 
                      Disponible Actual:&nbsp;</td>
                    <td  class="texto"> <input name="txtImporteRP" type="text" disabled="true"  value="0.00" size="32"> 
                      <input name="txtImporteRPA" type="hidden"> </td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="2" class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="27" colspan="2" align="center"> 
                      <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:validacion(
<%=(String)session.getAttribute("token")%>)" class="boton"> 
                      &nbsp; <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()" class="boton"> 
                    </td>
                  </tr>
                </table>
              </form></td>
          </tr>
          <tr> 
            <td  align="center" valign="top">
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
if( document.AsignacionFS.cboEjercicio.selectedIndex==0)    
   	  			  document.AsignacionFS.cboEjercicio.focus();
    else if( document.AsignacionFS.txtAcuerdoComite.value=="")
		 document.AsignacionFS.txtAcuerdoComite.focus();
	
     else if( document.AsignacionFS.cboEje.selectedIndex==0)    	
      		document.AsignacionFS.cboEje.focus(); 
	else if( document.AsignacionFS.cboPrograma.selectedIndex==0)    
      		document.AsignacionFS.cboPrograma.focus(); 
	else if( document.AsignacionFS.cboProyecto.selectedIndex==0)    	
      		document.AsignacionFS.cboProyecto.focus(); 
	else if( document.AsignacionFS.cboAccion.selectedIndex==0)    	
       		document.AsignacionFS.cboAccion.focus(); 
    else if( document.AsignacionFS.txtImporteA.value=="")
	  		document.AsignacionFS.txtImporteA.focus();
</script>
</BODY></HTML>
