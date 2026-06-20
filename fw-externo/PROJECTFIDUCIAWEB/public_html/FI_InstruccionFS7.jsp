<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="sesionInstrucc.jsp" %>
<%
int l=0;
String tipoOrigen="";
if(request.getParameter("cboOrigen")!=null)
{
if(request.getParameter("cboOrigen").trim().equals("Federal"))
	tipoOrigen="1";
else if(request.getParameter("cboOrigen").trim().equals("Estatal"))
			tipoOrigen="2";
else if(request.getParameter("cboOrigen").trim().equals("Rendimientos"))
			tipoOrigen="3";
}
String Ejercicio=request.getParameter("cboEjercicio")!=null && !request.getParameter("cboEjercicio").trim().equals("Selecciona un Ejercicio") && !tipoOrigen.equals("")? request.getParameter("cboEjercicio").trim() : "";
String Eje=request.getParameter("cboEje");
		 Eje=Eje!=null && !Eje.trim().equals("Selecciona un Eje") && !tipoOrigen.equals("")? Eje.substring(0,Eje.indexOf('-')).trim() : "";
String Programa=request.getParameter("cboPrograma");
		 Programa=Programa!=null && !Programa.trim().equals("Selecciona un Programa") && !tipoOrigen.equals("")? Programa.substring(0,Programa.indexOf('-')).trim(): "";
String Proyecto=request.getParameter("cboProyecto");
     	 Proyecto=Proyecto!=null && !Proyecto.trim().equals("Selecciona un Proyecto") && !tipoOrigen.equals("")? Proyecto.substring(0,Proyecto.indexOf('-')).trim(): "";
String Accion=request.getParameter("cboAccion");
		Accion=Accion!=null && !Accion.trim().equals("Selecciona una Accion") && !tipoOrigen.equals("") ? Accion.substring(0,Accion.indexOf('-')).trim() : "";

String EjercicioD=Ejercicio;
String EjeD=request.getParameter("cboEjeD");
		 EjeD=EjeD!=null && !EjeD.trim().equals("Selecciona un Eje") && !tipoOrigen.equals("")? EjeD.substring(0,EjeD.indexOf('-')).trim() : "";
String ProgramaD=request.getParameter("cboProgramaD");
		 ProgramaD=ProgramaD!=null && !ProgramaD.trim().equals("Selecciona un Programa") && !tipoOrigen.equals("")? ProgramaD.substring(0,ProgramaD.indexOf('-')).trim(): "";
String ProyectoD=request.getParameter("cboProyectoD");
     	 ProyectoD=ProyectoD!=null && !ProyectoD.trim().equals("Selecciona un Proyecto") && !tipoOrigen.equals("")? ProyectoD.substring(0,ProyectoD.indexOf('-')).trim(): "";
String AccionD=request.getParameter("cboAccionD");
		AccionD=AccionD!=null && !AccionD.trim().equals("Selecciona una Accion") && !tipoOrigen.equals("")? AccionD.substring(0,AccionD.indexOf('-')).trim() : "";		
		
double saldoDO=0,saldoDD=0;

if(!Accion.equals(""))
	saldoDO=BD.getSaldoRecursos((String)session.getAttribute( "NumFid" ),Ejercicio,Eje,Programa,Proyecto,Accion,tipoOrigen,1);
	
if(!AccionD.equals("") && !Accion.equals(""))
	saldoDD=BD.getSaldoRecursos((String)session.getAttribute( "NumFid" ),EjercicioD,EjeD,ProgramaD,ProyectoD,AccionD,tipoOrigen,1);
	
%>
<HTML>
<HEAD><TITLE>Reprogramaci�n de Presupuestos - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" SRC='scripts/general.js'>
</script>
<script language="JavaScript" SRC='scripts/instruccionFS7.js'>
</script>
<script language="JavaScript" type="text/JavaScript">
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
<body  class="bg-light"vLink="#052206" leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/consultas2.gif','imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif')" >
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Reprogramaci&oacute;n 
              Presupuestal</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"><form name="reprogramacionFS"  method="post" action="">
                <input type="hidden" name="saldoO" value="<%=saldoDO%>">
                <input type="hidden" name="saldoD" value="<%=saldoDD%>">
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
                                    su Token: 
                                    <input type="password" name="txtToken" size="13"  style=" WIDTH: 130px"
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
                <table width="495" id="datos">
                  <tr> 
                    <td height="21"  class="texto" align="right">Origen de los 
                      Recursos:</td>
                    <td height="21"  class="subtitulo"><select name="cboOrigen" onChange="Mostrar()">
                        <option>Selecciona el Origen 
                        <%
							String temporal=request.getParameter("cboOrigen");
                            String[]  origen={"Federal","Estatal","Rendimientos" };
							for(int i=0;i<origen.length;i++)
	   							{		 	
							    if(request.getParameter("cboOrigen")!=null&&!temporal.equals("Selecciona el Origen")&&temporal.equals(origen[i]))
							           out.println("<option selected>"+request.getParameter("cboOrigen"));
						   		else	  
						   		      out.println("<option>"+origen[i]);
								}  
							%>
                        </option>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="21" align="right"  class="texto">Acuerdo del Comite 
                      o Carta Instrucci&oacute;n::&nbsp;</td>
                    <td class="mensaje"><input name="txtAcuerdo" type="text"   size="50" value="<%=request.getParameter("txtAcuerdo")!=null?request.getParameter("txtAcuerdo"):""%>"></td>
                  </tr>
                  <tr> 
                    <td    height="18" align="right"  class="texto">Ejercicio: 
                      &nbsp; </td>
                    <td  class="texto"><select name="cboEjercicio" onChange="Mostrar()";>
                        <option>Selecciona un Ejercicio</option>
                        <%
					
					  String cboEjercicio[]= BD.getData(13,(String)session.getAttribute( "NumFid" )); 
					  if(cboEjercicio!=null)
							for(l=0;l<cboEjercicio.length;l++)
								{%>
                        <option value="<%=cboEjercicio[l]%>" <%=Ejercicio.equals(cboEjercicio[l].trim())?"selected":""%>><%=cboEjercicio[l]%></option>
                        <%}%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="2"  class="subtitulo" align="center">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="2"  class="subtitulo" align="center">Recursos 
                      Presupuestales Origen</td>
                  </tr>
                  <tr> 
                    <td    height="18" colspan="2" align="right"  class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="21" align="right" class="subtitulo"> Registro 
                      Presupuestal :</td>
                    <td  class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="21" align="right" class="texto">Eje: </td>
                    <td   class="textoCbo"><select name="cboEje" id="select" onChange="Mostrar()"; style="HEIGHT: 22px; WIDTH: 330px;">
                        <option>Selecciona un Eje</option>
                        <%if(!Ejercicio.equals(""))
                		               {
							String cboEje[]= BD.getData(14,(String)session.getAttribute( "NumFid" )+","+Ejercicio); 
							if(cboEje!=null)		 
							for(l=0;l<cboEje.length;l++)
									{%>
                        <option value="<%=cboEje[l].trim()%>" <%=request.getParameter("cboEje")!=null && request.getParameter("cboEje").trim().equals(cboEje[l].trim())?"selected":""%>><%=cboEje[l]%></option>
                        <%}	
                        				}
							%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Programa:</td>
                    <td   class="texto"> <select name="cboPrograma" onChange="Mostrar()" style="HEIGHT: 22px; WIDTH: 330px;">
                        <option>Selecciona un Programa</option>
                        <%if(!Eje.equals("") )
                		               {
										String cboPrograma[]= BD.getData(15,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje); 
									   if(cboPrograma!=null)
										for(l=0;l<cboPrograma.length;l++)
												{%>
                        <option value="<%=cboPrograma[l].trim()%>" <%=request.getParameter("cboPrograma")!=null && request.getParameter("cboPrograma").trim().equals(cboPrograma[l].trim())?"selected":""%>><%=cboPrograma[l]%></option>
                        <%}	
                        				}%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Proyecto:</td>
                    <td   class="texto"><select name="cboProyecto" onChange="Mostrar()"; style="HEIGHT: 22px; WIDTH: 330px;">
                        <option>Selecciona un Proyecto</option>
                        <%if(!Programa.equals(""))
                		               {
									  String cboProyecto[]= BD.getData(16,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje+"-"+Programa); 
									 if(cboProyecto!=null)
										for(l=0;l<cboProyecto.length;l++)
												{%>
                        <option value="<%=cboProyecto[l].trim()%>" <%=request.getParameter("cboProyecto")!=null && request.getParameter("cboProyecto").trim().equals(cboProyecto[l].trim())?"selected":""%>><%=cboProyecto[l]%></option>
                        <%}	
                        				}%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Acci&oacute;n:</td>
                    <td   class="texto"><select name="cboAccion" id="select2" style="HEIGHT: 22px; WIDTH: 330px;"  onChange="Mostrar()";>
                        <option value="Selecciona una Accion">Selecciona una Acci&oacute;n 
                        <%	if(!Proyecto.equals(""))
                		               {
											 String cboAccion[]= BD.getData(17,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje+"-"+Programa+"_"+Proyecto); 
											 if(cboAccion!=null)
											for(l=0;l< cboAccion.length;l++)
													{%>
                        <option value="<%=cboAccion[l].trim()%>" <%=request.getParameter("cboAccion")!=null && request.getParameter("cboAccion").trim().equals(cboAccion[l].trim())?"selected":""%>><%=cboAccion[l]%></option>
                        <%}	
                        				}
							%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="23" align="right"  class="texto"> Saldo disponible 
                      : </td>
                    <td class="texto"> <%=!Accion.equals("")?NumberFormat.getCurrencyInstance(Locale.US).format(saldoDO):"$ 0.00"%></td>
                  </tr>
                  <tr> 
                    <td height="20"  colspan="2" align="left" class="subtitulo">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="20"  colspan="2" align="center" class="subtitulo">Recursos 
                      Presupuestales Destino</td>
                  </tr>
                  <tr> 
                    <td height="20" colspan="2">&nbsp;
                      <input type="hidden"  name="cboEjercicioD" value="<%=EjercicioD%>"></td>
                  </tr>
                  <tr> 
                    <td height="21" align="right" class="subtitulo"> Registro 
                      Presupuestal :</td>
                    <td  class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="21" align="right" class="texto">Eje: </td>
                    <td   class="textoCbo"><select name="cboEjeD" onChange="Mostrar()"; style="HEIGHT: 22px; WIDTH: 330px;">
                        <option>Selecciona un Eje</option>
                        <%if(!EjercicioD.equals("") && !Accion.equals(""))
                		               {
							String cboEjeD[]= BD.getData(20,""); 
							if(cboEjeD!=null)		 
							for(l=0;l<cboEjeD.length;l++)
									{%>
                        <option value="<%=cboEjeD[l].trim()%>" <%=request.getParameter("cboEjeD") !=null && request.getParameter("cboEjeD").trim().equals(cboEjeD[l].trim())?"selected":""%>><%=cboEjeD[l]%></option>
                        <%}	
                        				}
							%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Programa:</td>
                    <td   class="texto"><select name="cboProgramaD"  onChange="Mostrar()"; style="HEIGHT: 22px; WIDTH: 330px;">
                        <option>Selecciona un Programa</option>
                        <%if(!EjeD.equals("") && !Accion.equals(""))
                		               {
										String cboProgramaD[]= BD.getData(21,EjeD); 
									   if(cboProgramaD!=null)
										for(l=0;l<cboProgramaD.length;l++)
												{%>
                        <option value="<%=cboProgramaD[l].trim()%>" <%=request.getParameter("cboProgramaD") !=null && request.getParameter("cboProgramaD").trim().equals(cboProgramaD[l].trim())?"selected":""%>><%=cboProgramaD[l]%></option>
                        <%}	
                        				}%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Proyecto:</td>
                    <td   class="texto"><select name="cboProyectoD" onChange="Mostrar()"; style="HEIGHT: 22px; WIDTH: 330px;">
                        <option>Selecciona un Proyecto</option>
                        <%if(!ProgramaD.equals("") && !Accion.equals(""))
                		               {
									  String cboProyectoD[]= BD.getData(22,EjeD+"-"+ProgramaD); 
									 if(cboProyectoD!=null)
										for(l=0;l<cboProyectoD.length;l++)
												{%>
                        <option value="<%=cboProyectoD[l].trim()%>" <%=request.getParameter("cboProyectoD")!=null && request.getParameter("cboProyectoD").trim().equals(cboProyectoD[l].trim())?"selected":""%>><%=cboProyectoD[l]%></option>
                        <%}	
                        				}%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Acci&oacute;n:</td>
                    <td   class="texto"><select name="cboAccionD"  style="HEIGHT: 22px; WIDTH: 330px;"  onChange="Mostrar()";>
                        <option value="Selecciona una Accion">Selecciona una Acci&oacute;n 
                        <%	if(!ProyectoD.equals("") && !Accion.equals(""))
                		               {
											 String cboAccionD[]= BD.getData(23,EjeD+"-"+ProgramaD+"_"+ProyectoD); 
											 if(cboAccionD!=null)
											for(l=0;l< cboAccionD.length;l++)
													{%>
                        <option value="<%=cboAccionD[l].trim()%>" <%=request.getParameter("cboAccionD")!=null && request.getParameter("cboAccionD").trim().equals(cboAccionD[l].trim())?"selected":""%>><%=cboAccionD[l]%></option>
                        <%}	
                        				}
							%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="23" align="right"  class="texto"> Saldo disponible 
                      : </td>
                    <td class="texto"> <%=!Accion.equals("") && !AccionD.equals("")?NumberFormat.getCurrencyInstance(Locale.US).format(saldoDD):"$ 0.00"%></td>
                  </tr>
                  <tr> 
                    <td height="23" align="right"  class="texto">&nbsp;</td>
                    <td class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="21" align="right"  class="texto">Importe aTransferir:&nbsp;</td>
                    <td class="mensaje"><input name="txtImporteR" type="text"   size="32"    value="<%=(request.getParameter("txtImporteR")!=null&&!request.getParameter("txtImporteR").equals(""))?request.getParameter("txtImporteR"):""%>"    onKeyUp="validaNum(this.form.txtImporteR);"   onBlur="formatImporte(this.form.txtImporteR)"></td>
                  </tr>
                  <tr> 
                    <td height="23" align="right"  class="texto">&nbsp;</td>
                    <td class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2" align="center"> 
                      <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:validacionFS(
<%=(String)session.getAttribute("token")%>)" class="boton"> 
                      &nbsp; <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()" class="boton"> 
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
              </table>
              </td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
<script language="JavaScript">
	 if( document.reprogramacionFS.cboOrigen.selectedIndex==0)    
   	  			  document.reprogramacionFS.cboOrigen.focus();
	 else if( document.reprogramacionFS.txtAcuerdo.value=="")    
        		document.reprogramacionFS.txtAcuerdo.focus(); 
     else if( document.reprogramacionFS.cboEjercicio.selectedIndex==0)    
   	  			  document.reprogramacionFS.cboEjercicio.focus();
     else if( document.reprogramacionFS.cboEje.selectedIndex==0)    	
      		document.reprogramacionFS.cboEje.focus(); 
     else if( document.reprogramacionFS.cboPrograma.selectedIndex==0)    	
      		document.reprogramacionFS.cboPrograma.focus(); 
			
	else if( document.reprogramacionFS.cboProyecto.selectedIndex==0)    	
      		document.reprogramacionFS.cboProyecto.focus(); 
	else if( document.reprogramacionFS.cboAccion.selectedIndex==0)    	
       		document.reprogramacionFS.cboAccion.focus(); 
     else if( document.reprogramacionFS.cboEjeD.selectedIndex==0)    	
      		document.reprogramacionFS.cboEjeD.focus(); 
	else if( document.reprogramacionFS.cboProgramaD.selectedIndex==0)    
      		document.reprogramacionFS.cboProgramaD.focus(); 
	else if( document.reprogramacionFS.cboProyectoD.selectedIndex==0)    	
      		document.reprogramacionFS.cboProyectoD.focus(); 
	else if( document.reprogramacionFS.cboAccionD.selectedIndex==0)    	
       		document.reprogramacionFS.cboAccionD.focus(); 		
   else if( document.reprogramacionFS.txtImporteR.value== "")
         		document.reprogramacionFS.txtImporteR.focus(); 
</script>
</BODY></HTML>
