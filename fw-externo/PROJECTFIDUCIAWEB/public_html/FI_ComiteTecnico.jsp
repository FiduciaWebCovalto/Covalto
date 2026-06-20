<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.util.*,java.text.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="Sesion"  class="com.bancomext.negocio.nAcuerdos"/>
<jsp:useBean id="acuerdo"  class="com.bancomext.negocio.nAcuerdos"/>
<%@ include file="Sesion.jsp" %>
<%
try{
String lista="";
int i=0;
boolean bPermiso=false;
DecimalFormat dec = new DecimalFormat("###,###,###,##0.00");
//Parametros de consulta
int numQuery=Integer.valueOf(request.getParameter("cboBuscar")!=null?request.getParameter("cboBuscar"):"2").intValue();
int numFiso=Integer.parseInt((String)session.getAttribute("NumFid")!=null?(String)session.getAttribute("NumFid"):"0");
String txtCondicion=request.getParameter("txtCondicion")!=null?request.getParameter("txtCondicion").trim():"";
String alerta= "";
int menu = Integer.parseInt(request.getParameter("menu")!=null?request.getParameter("menu"):"11"); 
int accion=Integer.parseInt(request.getParameter("accion")!=null?request.getParameter("accion"):"0");
String strTitulo= " ";
String strFechaSesion=request.getParameter("txtSesionFecha")!=null?request.getParameter("txtSesionFecha"):fecha;
String strTipoSesion=request.getParameter("txtSesionTipo")!=null?request.getParameter("txtSesionTipo"):"";
int numUsuario= Integer.parseInt((((String)session.getAttribute("NumUser")!=null)?(String)session.getAttribute("NumUser"):"0"));
String erroresEliminar="";
switch ( menu)
						 {
						 	
						 	case 11://Sesiones
									 strTitulo= " Sesiones del Comite T�cnico";
									switch ( accion)
												 {
												  case 1://Consulta 
												  				
            													Sesion.removerValores();
																Sesion.setVtrIntDato1(numFiso);
																Sesion.setVtrStrDato2(txtCondicion);
																if(!txtCondicion.trim().equals("")||numQuery==1)Sesion.querySelect(numQuery);						  						 						
															    break;
													case 2://Registrar
													
													            String sesionFecha=(request.getParameter("sesionFecha")!=null?request.getParameter("sesionFecha"):"").trim().toUpperCase();
																String sesionTipo=(request.getParameter("sesionTipo")!=null?request.getParameter("sesionTipo"):"").trim().toUpperCase();
																String sesionTema=(request.getParameter("sesionTema")!=null?request.getParameter("sesionTema"):"").trim();
																numQuery=2;
																txtCondicion=sesionFecha;
																Sesion.removerValores();
																Sesion.setVtrIntDato1(numFiso);
																Sesion.setVtrStrDato2(sesionFecha);
																Sesion.setVtrStrDato3(sesionTipo);
																Sesion.setVtrStrDato4(sesionTema);
																Sesion.setVtrIntDato5(numUsuario);
																int rowsUpdate=Sesion.queryUpdate(1);
																switch (rowsUpdate)
																			{
																	 case -300:
																			alerta= "No fue posible registrar la sesion <br>Ya se encuentra programada una sesion para el "+sesionFecha+" de tipo "+(sesionTipo.equals("O")?"ordinaria":"extraordinaria")+"<br> &nbsp;";
																			break;
																	 case -303:
																			alerta= "No fue posible registrar la sesion <br>Los  datos, no son validos<br>&nbsp; ";
																			break;																																						
																	 default:
																	       if(rowsUpdate<1)	alerta= "No fue posible registrar la sesion<br>Favor de Intentar mas tarde...<br>&nbsp; ";
																			break;		
																			}
            													Sesion.removerValores();
																Sesion.setVtrIntDato1(numFiso);
																Sesion.setVtrStrDato2(txtCondicion);
																Sesion.querySelect(numQuery);						  						 						
															    break;			
												    case 4://Eliminar
								
													           String eliminaSesiones[]=request.getParameterValues("idSesion");
															   String IdFecha="";
															   String IdTipo="";
															   for(int r=0; r<eliminaSesiones.length;r++)
																	{
																	IdFecha=eliminaSesiones[r].substring(0,10);
																	IdTipo=eliminaSesiones[r].substring(11,12);
																	Sesion.setVtrIntDato1(numFiso);
																	Sesion.setVtrStrDato2(IdFecha);
																	Sesion.setVtrStrDato3(IdTipo);
																	Sesion.setVtrIntDato4(numUsuario);
																	int rowsDelete=Sesion.queryUpdate(4);
																	switch (rowsDelete)
																				{
																		 case -301:
																				alerta= "No fue posible eliminar la sesion <br>Existen acuerdos de la Sesion  del "+IdFecha+" de tipo "+(IdTipo.equals("O")?"ordinaria":"extraordinaria")+"<br> &nbsp;";
																				break;
																		 case -303:
																				alerta= "No fue posible eliminar la sesion <br>Los valores de los datos, no son validos<br>&nbsp; ";
																				break;																																						
																		 default:
																				  if(rowsDelete<1)	alerta= "No fue posible eliminar la sesion<br>Favor de Intentar mas tarde...<br>&nbsp; ";
																				break;		
																				}
																   }//fin for r
																Sesion.removerValores();
																Sesion.setVtrIntDato1(numFiso);
																Sesion.setVtrStrDato2(txtCondicion);
																Sesion.querySelect(numQuery);
																break;
											  }
                                              break;
						   case 12://
						   				 strTitulo= " Sesiones del Comite T�cnico";
						   				break;											  
					       case 23: //Acuerdos   
											 strTitulo ="Acuerdos del Comite  T�cnico";								  						 						
									switch ( accion)
												 {

													case 2://Registrar
													
													            String acuerdoId=(request.getParameter("acuerdoId")!=null?request.getParameter("acuerdoId"):"").trim().toUpperCase();
																String acuerdoDescripci�n=(request.getParameter("acuerdoDescripcion")!=null?request.getParameter("acuerdoDescripcion"):"").trim().toUpperCase();
																System.out.println("Monto: "+(request.getParameter("acuerdoMonto")!=null?request.getParameter("acuerdoMonto"):"0").trim());
																
																
																double acuerdoMonto=NumberFormat.getInstance(Locale.US).parse((request.getParameter("acuerdoMonto")!=null?request.getParameter("acuerdoMonto"):"0").trim()).doubleValue();
																System.out.println("Monto: "+acuerdoMonto);
																acuerdo.removerValores();
																acuerdo.setVtrIntDato1(numFiso);
																acuerdo.setVtrStrDato2(strFechaSesion);
																acuerdo.setVtrStrDato3(strTipoSesion);
																acuerdo.setVtrStrDato4(acuerdoId);
																acuerdo.setVtrStrDato5(acuerdoDescripci�n);
																acuerdo.setVtrDoubleDato6(acuerdoMonto);
																acuerdo.setVtrDoubleDato7(acuerdoMonto);																
																acuerdo.setVtrIntDato8(numUsuario);
																int rowsUpdate=acuerdo.queryUpdate(11);
																
																switch (rowsUpdate)
																			{
																	 case -300:
																			alerta= "No fue posible registrar el Acuerdo<br>Ya se encuentra registrado el acuerdo "+ acuerdoId+"<br>&nbsp; ";
																			break;
																	 case -303:
																			alerta= "No fue posible registrar el Acuerdo <br>Los datos, no son validos<br>&nbsp; ";
																			break;																																						
																	 default:
																	       if(rowsUpdate<1)	alerta= "No fue posible registrar el Acuerdo<br>Favor de Intentar mas tarde...<br>&nbsp; ";
																			break;		
																			}
            												  						 
															    break;			

												    case 4://eliminar
													           String eliminaAcuerdos[]=request.getParameterValues("idAcuerdo");
															   String eliminaAcuerdoId="";
															  
														
															   for(int r=0; r<eliminaAcuerdos.length;r++)
																	{
																	
																	eliminaAcuerdoId=eliminaAcuerdos[r].trim();
																	acuerdo.removerValores();
																	acuerdo.setVtrIntDato1(numFiso);
																	acuerdo.setVtrStrDato2(strFechaSesion);
																	acuerdo.setVtrStrDato3(strTipoSesion);
																	acuerdo.setVtrStrDato4(eliminaAcuerdoId);
																	acuerdo.setVtrIntDato5(numUsuario);
																	int rowsAcuerdosEliminados=acuerdo.queryUpdate(14);
																	switch (rowsAcuerdosEliminados)
																				{
																		 case 0:
																		 		
																				 alerta=alerta+ "No fue posible eliminar el acuerdo: "+eliminaAcuerdoId + "<Existen operaciones de retiro realacionadas con el acuerdo:><br> &nbsp;";
																		 		break;		
																																																								
																		 default:
																				  if(rowsAcuerdosEliminados<1)
																				  alerta=alerta+ "No fue posible eliminar el acuerdo: "+eliminaAcuerdoId+"<br> &nbsp;";
													
																				break;
																						
																				}
																   }//fin for r
																   

																break;

												    case 5://Cambiar Estatus
								
															
													           String cambiarStatus[]=request.getParameterValues("idAcuerdo");
															   String statusAcuerdoId="";
															  
														
															   for(int r=0; r<cambiarStatus.length;r++)
																	{
																	
																	statusAcuerdoId=cambiarStatus[r].trim();
																	acuerdo.removerValores();
																	acuerdo.setVtrIntDato1(numFiso);
																	acuerdo.setVtrStrDato2(strFechaSesion);
																	acuerdo.setVtrStrDato3(strTipoSesion);
																	acuerdo.setVtrStrDato4(statusAcuerdoId);
																	acuerdo.setVtrStrDato5("CUMPLIDO");
																	acuerdo.setVtrIntDato6(numUsuario);
																	int rowsAcuerdosActualizados=acuerdo.queryUpdate(15);
																	if (rowsAcuerdosActualizados<=0)
																		 alerta=alerta+ "No fue posible cambiar el estatus del acuerdo: "+statusAcuerdoId + " a cumplido<br> &nbsp;";
																   }//fin for r
																   

																break;

											  }
											 
								             break;
								 case 24: //Acuerdos   
											 strTitulo ="Acuerdos del Comite  T�cnico";
											 break;											 
		
					  }					  		  
%>
<HTML>
<HEAD><TITLE>Sesiones Comite T�cnico</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<link rel="stylesheet" href="styles/bancomext2.css" type="text/css">
<link rel="stylesheet" href="styles/calendario.css" type="text/css">

<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
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
<script language="JavaScript" >


function formatImporte(objeto)
{
                var importe=objeto.value;
                var posEntero =objeto.value.indexOf(".");
				if(posEntero==-1 &&objeto.value.length>0 )
					{
					objeto.value=importe+".00"
				    posEntero =objeto.value.indexOf(".");
					}
					
				var entero=objeto.value.substring(0,posEntero);   
				var dec=objeto.value.substring(posEntero,objeto.value.length);   
				var dig=0;
				if(posEntero>0)
				      {
					    entero=objeto.value.substring(0,posEntero);   
					    for(var i=posEntero;i>=0;i--)
							{
						
							if(dig==3 &&  i>0)
							  {
							 
							   entero=entero.substring(0,i)+","+entero.substring(i,entero.length);   
							     
							   dig=0;
							   }
							   	dig++;
							}
						   
					  dec=objeto.value.substring(posEntero,objeto.value.length); 
					  }
					  objeto.value=entero+dec;
}	
function formatImporte(objeto)
{
                var importe=objeto.value;
                var posEntero =objeto.value.indexOf(".");
				if(posEntero==-1 &&objeto.value.length>0 )
					{
					objeto.value=importe+".00"
				    posEntero =objeto.value.indexOf(".");
					}
					
				var entero=objeto.value.substring(0,posEntero);   
				var dec=objeto.value.substring(posEntero,objeto.value.length);   
				var dig=0;
				if(posEntero>0)
				      {
					    entero=objeto.value.substring(0,posEntero);   
					    for(var i=posEntero;i>=0;i--)
							{
						
							if(dig==3 &&  i>0)
							  {
							 
							   entero=entero.substring(0,i)+","+entero.substring(i,entero.length);   
							     
							   dig=0;
							   }
							   	dig++;
							}
						   
					  dec=objeto.value.substring(posEntero,objeto.value.length); 
					  }
					  objeto.value=entero+dec;
}		
		
function validaNum(objeto)
{

				var texto=objeto.value.substring(objeto.value.length-1,objeto.value.length);    
				 if (isNaN(parseInt(texto)) && texto!="." ) {
					  objeto.value=objeto.value.substring(0,objeto.value.length-1);
					  objeto.focus();
 								}
				
}


function validaId(objeto)
{

				var texto=objeto.value.substring(objeto.value.length-1,objeto.value.length).toUpperCase();
				if(objeto.value.length>1)
				{
                var texto2=objeto.value.substring(objeto.value.length-2,objeto.value.length-1).toUpperCase();			     				 
                  if(texto==" "   && texto ==texto2)
                    {
					  objeto.value=objeto.value.substring(0,objeto.value.length-1);
					  objeto.focus();
					 }
					} 				  
				 if (texto!="-"  && texto!="/" && texto!="A" && texto!="B" && texto!="C" && texto!="D" && texto!="E" && texto!="F" && texto!="G" && texto!="H" &&
				    texto!="I" && texto!="J" && texto!="K" && texto!="L" && texto!="M" && texto!="N" && texto!="�" && texto!="O" &&
					texto!="P" && texto!="Q" && texto!="R" && texto!="S" && texto!="T" && texto!="U" && texto!="V" && texto!="W" &&
					texto!="X" && texto!="Y" && texto!="Z" && texto!="0" && texto!="1"  && texto!="2"  && texto!="3" && texto!="4" && texto!="5"  
					&& texto!="6"  && texto!="7"  && texto!="8"  && texto!="9"   && texto!=" "  
				 ) {
					  objeto.value=objeto.value.substring(0,objeto.value.length-1);
					  objeto.focus();
 								}
				
}


            function verificaSeleccion()
							{
							var numSelect=0;
							for (i=0;i<document.forma.elements.length;i++)
    					 				if ((document.forma.elements[i].type=="checkbox")&&(document.forma.elements[i].checked))
										     numSelect=numSelect+1;				 
							return numSelect;				 									
							}		

			function ir(menu,accion)
								{
								var bSubmit=true;
								<%
								switch (menu)
												 {
												  case 11:
												  			%>
															if(accion==0) 
															   document.forma.txtCondicion.value=""; 
															if(accion==4) 
																{
																 if(verificaSeleccion()==0) 
																	{
																	 alert("Debes seleccionar las registros a eliminar a borrar");
																	 bSubmit=false;   
																	 }
																else
																	{	 
																	 bSubmit=confirm("Estas Seguro que deseas eliminar todos los registros Seleccionados");
																	 }
																}
															<%
															break;
															
												case 12:%>
												                if (document.forma.sesionTema.value=="")
																   {
																    alert("Debes escribir el tema relevante de la reunion");
																	document.forma.sesionTema.focus();
																	bSubmit=false;   
																	}
															<%
															break;
												case 23:
															%>
															if(accion==5) 
																{
																 if(verificaSeleccion()==0) 
																	{
																	 alert("Debes de seleccionar el acuerdo que deseas dar por cumplido");
																	 bSubmit=false;   
																	 }
																else	 
																if(verificaSeleccion()>1) 
																	{
																	 alert("Debes de seleccionar solo un acuerdo");
																	 for (i=1;i<document.forma.elements.length;i++)
												    					 if (document.forma.elements[i].type=="checkbox")
											        						document.forma.elements[i].checked=false;
																	 bSubmit=false;   
																	 }	 
																else
																	{	 
																	 bSubmit=confirm("Estas Seguro que deseas dar por cumplido el acuerdo seleccionado" );
																
																	 }
																}																

															<%
															break;			
												case 24:
													%>
												                if (document.forma.acuerdoId.value=="")
																   {
																    alert("Debes indicar el  No. del Acuerdo ");
																	document.forma.acuerdoId.focus();
																	bSubmit=false;   
																	}
																else	
												                if (document.forma.acuerdoDescripcion.value=="")
																   {
																    alert("Debes indicar el concepto del acuerdo");
																	document.forma.acuerdoId.focus();
																	bSubmit=false;   
																	}
																else	
												                if (document.forma.acuerdoDescripcion.value.length>300)
																   {
																    alert("La longitud del concepto debe de ser maximo de 300 carateres");
																	document.forma.acuerdoId.focus();
																	bSubmit=false;   
																	}																	
																 else																		
																if(document.forma.acuerdoMonto.value=="")
																   {
																    alert("Debes proporcionar el monto autorizado del acuerdo");
																   document.forma.acuerdoMonto.focus();
																   bSubmit=false;   
																	}
																	else
																if(document.forma.acuerdoMonto.value<=0.009)
																   {
																    alert("El monto autorizado debe ser mayor a cero");
																   document.forma.acuerdoMonto.value=""; 
																   document.forma.acuerdoMonto.focus(); 
																   bSubmit=false;   
																	}
															<%
															break;															
																
													}
													%>																
															if (bSubmit)
																{	
																document.forma.action="?menu="+menu+"&accion="+accion;
																document.forma.submit();
																}
								}

			function detalle(SesionFecha,SesionTipo)
						 {

						  			  document.forma.txtSesionFecha.value=SesionFecha;
									  document.forma.txtSesionTipo.value=SesionTipo;						 
									  ir(23,0)


						 } 

		 function imprimir(FechaSesion,TipoSesion)
		 						  {
					 
										  window.open("repAcuerdosComite.jsp?imp=1&Fecha="+FechaSesion+"&Tipo="+TipoSesion,"Acuedos_Comite","top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=no,copyhistory=NO,width=750,height=400");
								  
								  }
		
		function ver(FechaSesion,TipoSesion)
		 						  {
					 
										  window.open("repAcuerdosComite.jsp?imp=0&Fecha="+FechaSesion+"&Tipo="+TipoSesion,"Acuedos_Comite","top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=no,copyhistory=NO,width=750,height=400");
								  
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
          > </TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
    <TR > 
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=BD.fecha()%></TD>
      <TD background="imagenes/fondoMenu.gif"><a href="FI_Consultas.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','imagenes/consultas2.gif',1)"><img src="imagenes/consultas1.gif" name="Image10" width="104" height="17" border="0"></a><a href="FI_Instrucciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Instrucciones','','imagenes/instrucciones2.gif',1)"><img src="imagenes/instrucciones2.gif" name="Instrucciones"  border="0"></a><!--a href="FI_EdosF.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Reportes','','imagenes/reportes2.gif',1)"><img src="imagenes/reportes1.gif" name="Reportes"  border="0"></a--><a href="FI_Opciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Opciones','','imagenes/Opciones2.gif',1)"><img src="imagenes/Opciones1.gif" name="Opciones"  border="0"></a><a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir"  border="0"></a></TD>
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
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        <table width="593" border="0">
          <tr> 
            <td class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo" ><%=strTitulo%></td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
		  </table >

              <form name="forma" action="" method="post" >     
				  <input type="hidden" name="txtSesionFecha" value="<%=request.getParameter("txtSesionFecha")!=null?request.getParameter("txtSesionFecha"):""%>"> 
                <input type="hidden" name="txtSesionTipo"  value="<%=request.getParameter("txtSesionTipo")!=null?request.getParameter("txtSesionTipo"):""%>"> 
                <table width="593" align="center">
                  <tr> 
                  
              <td   align="center"> 
                <%


switch ( menu)
   {					     
   case 11:
		%>

                <table cellSpacing=0 cellPadding=0  width="100%">
                  <tr> 
                    <td colspan="3"  class="alerta" align="center"><%=alerta%></td>
                  </tr>

                  <tr> 
                    <td width="12%"  class="texto">Buscar por:</td>
                    <td width="76%" align="left"> <select name="cboBuscar"  onChange="javascript:ir(11,0);"   >
                        <option value="1" <%= numQuery==1?"selected":""%>>Todas</option>
                        <option value="2" <%= numQuery==2?"selected":""%>>Fecha de sesi�n</option>
                        <option value="3" <%= numQuery==3?"selected":""%>>Tipo de sesi�n </option>
                        <option value="4" <%= numQuery==4?"selected":""%>>No. de sesi�n</option>
                      </select> &nbsp;&nbsp; 
                      <%switch (numQuery)
						  								{
														case 1:// todas las Sesiones
																%>
                      <input name="txtCondicion" type="hidden" value=""> 
                      <%	
																	break;
																	
														case 2:
														%>
                      <input type="button" id="cboCalendario" name="cboCalendario"  style=" WIDTH: 60px" value="<%=txtCondicion.equals("")?fecha:txtCondicion%>" onChange="forma.txtCondicion.value=forma.cboCalendario.value;"><input type="button" id="lanzaCalendario" name="lanzaCalendario"  style=" WIDTH: 15px"  value="v"  class="botonCbo">

                      <input type="hidden" id="txtCondicion" name="txtCondicion"  style=" WIDTH: 60px" value="<%=txtCondicion.equals("")?fecha:txtCondicion%>" > 
                      <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendario",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendario"   // el id del bot�n que lanzar� el calendario
																						});					
																   </SCRIPT> 
                      <%
																	break;
													case 3:
													%>
                      <select name="txtCondicion" >
                        <option value="O" <%=txtCondicion.equals("O")?"selected":""%>>ORDINARIA</option>
                        <option value="E" <%=txtCondicion.equals("E")?"selected":""%>>EXTRAORDINARIA</option>
                      </select> 
                      <%
																	break;
													case 4:
													%>
                      <input name="txtCondicion" type="text"  size="40"  value="<%=txtCondicion%>">
                      <%
																	break;
													case 5:
													%>
                      <select name="txtCondicion"  >
                        <option value="VIGENTE" <%=txtCondicion.equals("VIGENTE")?"selected":""%>>VIGENTE</option>
                        <option value="PASADA" <%=txtCondicion.equals("PASADA")?"selected":""%>>PASADA</option>
                        <option value="EFECTUADA"  <%=txtCondicion.equals("EFECTUADA")?"selected":""%>>EFECTUADA</option>
                        <option value="CANCELADA"  <%=txtCondicion.equals("CANCELADA")?"selected":""%>>CANCELADA</option>
                      </select> 
                      <%
																	break;
													}//fin switch(numQuery)						
													%>
                    </td>
                    <td width="12%"  align="right"> <input name="btBuscar" type="button" onClick="  ir(11,1)" value="Buscar" class="boton"> 
                    </td>
                  </tr>
                  <tr class="alerta"> 
                    <td colspan="3">&nbsp; </td>
                  </tr>
                  <tr> 
                    <td colspan="3"> <table width="100%" >
                        <tr class="celda01" bgcolor="#999966"> 
                          <td align="center">&nbsp;</td>
                          <td  align="center">Fecha</td>
                          <td  align="center">Tipo</td>
                          <td   align="center">No. de Sesi&oacute;n</td>
                          <td   align="center">Registrar Acuerdos</td>
                        </tr>
                        <%
							  

							if ( !Sesion.hasData () && accion==1)
								  {%>
                        <tr  class="subtitulo"> 
                          <td align="center" colspan="6">No hay Sesiones Agendadas 
                            <%=numQuery==2?"para el dia de Hoy":"con los criterios de consulta seleccionados"%></td>
                        </tr>
                        <%}%>
                        <%			  																
						  if ( Sesion.hasData () )
						  {
							   //renglon de titulos de usuarios
							  %>
                        <%
						//tabla con registros de usuarios
						for(int r=0; r < Sesion.getSize(); r++)
							 {
							 Sesion.setIndex (r );%>
                        <tr  class="celda02"> 
                          <td align="center"><input type="checkbox" name="idSesion" value="<%=Sesion.getVtrStrDato2().trim()+"-"+Sesion.getVtrStrDato3().trim()%>"  <%=Sesion.getVtrIntDato7()>0?"DISABLED":""%> ></td>
                          <td align="center"><%=Sesion.getVtrStrDato2()%></td>
                          <td align="center"><%=Sesion.getVtrStrDato3().equals("O")?"ORDINARIA":"EXTRAORDINARIA"%> 
                          </td>
                          <td ><%=Sesion.getVtrStrDato4()%></td>
                          <td align="center">
                            <input name="btVer<%=r%>" type="button" onClick=" javascript:detalle('<%=Sesion.getVtrStrDato2()%>','<%=Sesion.getVtrStrDato3()%>');" value="Acuerdos (<%=Sesion.getVtrIntDato7()%>)" class="botonG10"    style=" WIDTH: 125px">
                            &nbsp; </td>
                        </tr>
                        <%}
						
						
						}%>
                      </table></td>
                  </tr>
                </table>
                      <table width="100%" border="0">
                        <tr> 
                          <td colspan="3">&nbsp;</td>
                        </tr>
                        <tr> 
                          <td width="45%" align="right"><input name="Registrar" type="button" onClick="ir(12,0);" value="Registrar " class="boton" > 
                          </td>
                          <td width="10%" align="center">&nbsp; </td>
                          <td width="45%"><input name="Eliminar" type="button" onClick="ir(11,4);" value=" Eliminar " class="boton" <%=!Sesion.hasData() ?"disabled":""%> d>
                          </td>
                        </tr>
                      </table>
                      <%break;
			
				case 12:%>
                      <input name="txtCondicion" type="hidden" value=""> 
                      <table width="95%" border="0">
                        <tr> 
                          <td colspan="2" class="subtitulo">SESION:</td>
                        </tr>
                        <tr class="texto"> 
                          <td width="22%" align="right">Fecha:</td>
                          <td width="78%" >
						     <input type="button" id="cboCalendario" name="cboCalendario"  style=" WIDTH: 60px" value="<%=fecha%>" onChange="forma.sesionFecha.value=forma.cboCalendario.value;"><input type="button" id="lanzaCalendario" name="lanzaCalendario"  style=" WIDTH: 15px"   value="v"  class="botonCbo"> 
                      <input type="hidden" id="sesionFecha" name="sesionFecha"  style=" WIDTH: 60px" value="<%=fecha%>" > 
                            <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendario",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendario"   // el id del bot�n que lanzar� el calendario
																						});					
																   </SCRIPT> 
                           </td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">Tipo :</td>
                          <td class="texto"><input type="radio" name="sesionTipo" value="O"  checked=true >
                            Ordinaria </td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">&nbsp;</td>
                          <td class="texto"> <input type="radio" name="sesionTipo" value="E"   >
                            Extraordinaria </td>
                        </tr>
                        <tr> 
                          
                    <td height="23" align="right"  class="texto">No. Sesi&oacute;n:</td>
                          <td class="texto"><input type="text" name="sesionTema"   style=" WIDTH: 300px" maxlength="200"  ></td>
                        </tr>
                        <tr class="texto"> 
                          <td colspan="2"> </td>
                        </tr>
                        <tr class="texto"> 
                          <td colspan="2" align="center"> <table width="100%" border="0">
                              <tr> 
                                <td>&nbsp;</td>
                              </tr>
                              <tr> 
                                <td align="center"> <input type="button" name="Aceptar" value="Guardar" class="boton"  onClick="ir(11,2);" > &nbsp;&nbsp;&nbsp;
                                  <input name="Eliminar" type="button" onClick="javascript:history.back();" value="Salir" class="boton" > 
                                </td>
                              </tr>
                              <tr>
                                <td align="center">&nbsp;</td>
                              </tr>
                              <tr> 
                                <td >&nbsp;<a href="javascript:history.back();"><img src="imagenes/b_atras.gif" border=0 width="58"  height="23" align="right"></a></td>
                              </tr>
                            </table></td>
                        </tr>
                      </table>
            
                   
								
                  </td>
                </tr>
              </table>
              <%
			  break;
   case 23:
   
   				Sesion.setVtrIntDato1(numFiso);
	  		    Sesion.setVtrStrDato2(strFechaSesion);
				Sesion.setVtrStrDato3(strTipoSesion);
				Sesion.querySelect(5);//DETALLE Sesion
		System.out.println(strFechaSesion);
		System.out.println(strTipoSesion);
		
				acuerdo.removerValores();
				acuerdo.setVtrIntDato1(numFiso);
	  		    acuerdo.setVtrStrDato2(strFechaSesion);
				acuerdo.setVtrStrDato3(strTipoSesion);
				acuerdo.querySelect(10);
							
		%>
                <table width="593" border="0" align="center"> 
                  <tr> 
                    <td colspan="2" class="alerta" align="center"><%=alerta%></td>
                  </tr>
                  <tr> 
                    
              <td width="22%"   class="textoNegrita">Fecha de la sesi&oacute;n: 
              </td>
                    <td width="78%"  class="texto"><%=Sesion.getVtrStrDato2()%></td>
                  </tr>
                  <tr > 
                    
              <td  class="textoNegrita">Tipo de sesi&oacute;n:</td>
                    <td  class="texto"><%=Sesion.getVtrStrDato3().equals("O")?"ORDINARIA":"EXTRAORDINARIA"%></td>
                  </tr>
                  <tr> 
                    
              <td   class="textoNegrita">No. de sesi&oacute;n:</td>
                    <td class="texto"><%=Sesion.getVtrStrDato4()%></td>
                  </tr>
                  <tr> 
                    <td align="right"  class="textoNegrita">&nbsp;</td>
                    <td class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2" align="right" ><table width="100%" >
                  <tr class="celda01" bgcolor="#999966"> 
                    <td  align="center">&nbsp;</td>
                    <td   align="center">No. Acuerdo</td>
                    <td  align="center">Concepto</td>
                    <td   align="center">Monto Autorizado</td>
                    <td   align="center">Estatus</td>
                  </tr>
                  <%
							  

							if ( !acuerdo.hasData () )
								  {%>
                  <tr  class="subtitulo"> 
                    <td align="center" colspan="5">La sesion no tiene acuerdos 
                      registrados </td>
                  </tr>
                  <%}%>
                  <%			  																
						
						for(int r=0; r < acuerdo.getSize(); r++)
							 {
							 acuerdo.setIndex (r );%>
                  <tr  class="celda02"> 
                    <td align="center"><input type="checkbox" name="idAcuerdo" value="<%=acuerdo.getVtrStrDato4()%>"  <%=acuerdo.getVtrStrDato11().equals("CUMPLIDO")||acuerdo.getVtrStrDato11().equals("CANCELADO")?"DISABLED":""%>></td>
                    <td align="center"><%=acuerdo.getVtrStrDato4()%></td>
                    <td align="center"><%=acuerdo.getVtrStrDato5()%></td>
                    <td  align="right"><%=dec.format(acuerdo.getVtrDoubleDato6())%></td>
                    <td align="center"><%=acuerdo.getVtrStrDato11()%></td>
                  </tr>
                  <%}%>
                </table>
                      
                <table width="100%" border="0">
                  <tr> 
                    <td colspan="3">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td width="24%" align="right"><input name="Registrar" type="button" onClick="ir(24,1);" value="    Registrar   " class="boton" ></td>
                    <td align="center">
					 <%if( !((String)session.getAttribute("permiso")).equals("CLIENTE SECRETARIO DE ACTAS"))
							 {%>
					<input name="Cumplir" type="button" onClick="ir(23,5);" value="Cumplir Acuerdo" class="boton" <%=!acuerdo.hasData () ?"disabled":""%>> 
						  <%}%>
                    </td>
                    <td width="28%"><input name="Eliminar" type="button" onClick="ir(23,4);" value="     Eliminar     " class="boton" <%=!acuerdo.hasData () ?"disabled":""%>> 
                  </tr>
                  <tr> 
                    <td align="right">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td>&nbsp;</tr>
                  <tr>
                    <td align="right"><input name="Ver" type="button" onClick="javascript:ver('<%=strFechaSesion%>','<%=strTipoSesion%>');" value="         Ver         " class="boton"  <%=!acuerdo.hasData () ?"disabled":""%>></td>
                    <td align="center"><input name="Imprimir" type="button" onClick="javascript:imprimir('<%=strFechaSesion%>','<%=strTipoSesion%>');" value="       Imprimir       " class="boton"  <%=!acuerdo.hasData () ?"disabled":""%>></td>
                    <td><input name="Eliminar32" type="button" onClick="ir(11,1);" value="         Salir        " class="boton" ></tr>
                  <tr> 
                    <td colspan="3" align="center">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="3" align="center"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                    </td>
                  </tr>
                  <tr> 
                    <td colspan="3">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td >&nbsp;</td>
                    <td rowspan="2" >&nbsp;</td>
                    <td align="right"><a href="javascript:history.back();"><img src="imagenes/b_atras.gif" border=0 width="58"  height="23" align="right"></a></td>
                  </tr>
                  <tr> 
                    <td align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                </table>
                      
                    </td>
                  </tr>
                  <tr class="texto"> 
                    <td colspan="2" align="center">&nbsp; </td>
                  </tr>
                </table>
                <%
			 break;
	case 24:

  				Sesion.setVtrIntDato1(numFiso);
	  		    Sesion.setVtrStrDato2(strFechaSesion);
				Sesion.setVtrStrDato3(strTipoSesion);
				Sesion.querySelect(5);//DETALLE Sesion
	
	%>
                
          <table width="593"  align="center">
            <tr> 
              <td   class="subtitulo" >Sesi&oacute;n:</td>
              <td  class="texto">&nbsp;</td>
            </tr>
            <tr> 
              <td   class="texto" align="right">Fecha: </td>
              <td  class="textoNegrita"><%=Sesion.getVtrStrDato2()%></td>
            </tr>
            <tr > 
              <td  class="texto" align="right">Tipo:</td>
              <td  class="textoNegrita"><%=Sesion.getVtrStrDato3().equals("O")?"ORDINARIA":"EXTRAORDINARIA"%></td>
            </tr>
            <tr> 
              <td   class="texto" align="right">No. Sesi�n:</td>
              <td class="textoNegrita"><%=Sesion.getVtrStrDato4()%></td>
            </tr>
            <tr> 
              <td align="right"  class="texto" >&nbsp;</td>
              <td  class="texto">&nbsp;</td>
            </tr>
            <tr> 
              <td  class="subtitulo" >Acuerdo:</td>
              <td  class="texto">&nbsp;</td>
            </tr>
            <tr> 
              <td align="right"  class="texto" >&nbsp;</td>
              <td  class="texto">&nbsp;</td>
            </tr>
            <tr> 
              <td height="24" align="right"  class="texto" >No. Acuerdo :</td>
              <td  class="texto"><input type="text" name="acuerdoId"   style=" WIDTH: 200px" maxlength="25"  onKeyUp="validaId(this.form.acuerdoId);"></td>
            </tr>
            <tr> 
              <td  class="texto" align="right">Monto Autorizado:</td>
              <td height="3" class="texto"> <input type="text" name="acuerdoMonto" size="13"  style=" WIDTH: 130px" maxlength="23" value="" onKeyUp="validaNum(this.form.acuerdoMonto);" onBlur="formatImporte(this.form.acuerdoMonto)"></td>
            </tr>
            <tr> 
              <td class="texto" align="right">Concepto (300 caracteres):</td>
              <td rowspan="2" class="texto"><textarea name="acuerdoDescripcion" rows="5" cols="50"   style=" WIDTH: 280px" ></textarea></td>
            </tr>
            <tr> 
              <td class="texto" align="right">&nbsp;</td>
            </tr>
            <tr> 
              <td colspan="2" align="center" >&nbsp; </td>
            </tr>
            <tr> 
              <td colspan="2" align="center" > <input type="button" name="Aceptar" value="Guardar" class="boton"  onClick="ir(23,2)" >&nbsp;&nbsp;&nbsp;
                <input name="Eliminar3" type="button" onClick="javascript:history.back();" value="Salir" class="boton" > 
              </td>
            </tr>
            <tr> 
              <td colspan="2" align="center" >&nbsp;</td>
            </tr>
          </table>
                <%
			 break;				 				  
							}%>
                <br><table border=0 cellpadding=0 cellspacing=1  align="center">
                  <tr align=middle valign=center> 
                    <td height=30 align="center"> <a href="#top"><img border=0 height=11 src="imagenes/arriba.gif" width=59></a> 
                    </td>
                  </tr>
                  <tr align=middle> 
                    <td  height=7><img  height=1 src="imagenes/cnaranja01.gif" width=470></td>
                  </tr>
                </table>
              </form>				
         </TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
	
</BODY></HTML>
<%
}
catch(Exception E)
{}%>