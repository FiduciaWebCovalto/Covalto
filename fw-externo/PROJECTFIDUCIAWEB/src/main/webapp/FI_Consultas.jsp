



<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="movimientos"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="consultas"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="firmas"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="det"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="detCuentas"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="detComite"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="detSWIFT"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="moneda"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="consultas_doc"  class="mx.com.inscitech.clients.negocio.nConsultasMDC"/>
<jsp:useBean id="CargaArchivo"  class="mx.com.inscitech.clients.negocio.CargaArchivo"/>

<%@ include file="Sesion.jsp" %>
<%
int menu=Integer.parseInt(request.getParameter("menu")!=null?request.getParameter("menu").trim():"0");
String titulo="CONSULTAS";
String[] bitacora = new String[5];
String fechaCont=BD.getFecha();
String folioBit="";
int regBitacora=0;
switch(menu)
					{
					case 1:
							titulo="Saldos por Contratos de Inversi�n";
							break;
					case 2:
							titulo="Honorarios Fiduciarios Pendientes de Pago";
							break;
					case 3:
							titulo="Tasas de Rendimiento";
							break;
					case 4:
							titulo="Instrucciones SWIFT";
							break;
					case 5:
					case 6:
							titulo="Movimientos	";
							break;
					default:
							titulo="CONSULTAS	";
							break;	
					}//switch(menu)
%>
<HTML>
<HEAD><TITLE><%=titulo%> - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<script language="JavaScript" SRC='scripts/general.js'></script>
<script language="JavaScript" type="text/JavaScript">
<%
switch(menu)
					{
					case 1:
							%>
							function verDetalleCto(sNumCto,sEntidad)
												{
												   <%												
												   if (request.getParameter("txtCtoInver")!=null)
												   {
												   //incorporacion de la bitacora
												     folioBit=BD.getFolio(2);
													 System.out.println("cTO INVER"+request.getParameter("txtCtoInver"));
													 bitacora[0]=fechaCont;
													 bitacora[1]= folioBit;
													 bitacora[2]=(String)session.getAttribute("NumUser");
													 bitacora[3]="Consulta de Saldo de Contrato de Inversion "+request.getParameter("txtCtoInver")+" con Folio en Bitacora: "+folioBit+" para el Fideicomiso "+(String)session.getAttribute("NumFid");
													 bitacora[4]="120.0.0.1";
												   
												     regBitacora=BD.insertaBitacora(bitacora);													
												   }
												   %>												   
												   document.ctoinv.txtCtoInver.value = sNumCto;
                           document.ctoinv.txtEntidad.value = sEntidad;
												   document.ctoinv.submit();
												}
							<%
							break;
					case 4:
							//INSTRUCCIONES SWIFT
							%>
							function imprimir(folio)
								{
								 window.open("comprobanteSWIFT.jsp?txtFolio="+folio,"Comprobante_SWIFT","top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=yes,copyhistory=NO,width=750,height=420"); 
								}
							function buscarSWIFT()
											{
											   var iLen = document.InstSWIFT.txtFolio.value;
											   if(iLen.length < 1)
											 	  {
												  alert("Debes indicar el folio de la instrucci�n");
												  document.InstSWIFT.txtFolio.focus();      
												   }
											   else if(isNaN(document.InstSWIFT.txtFolio.value))
												   {
												  alert("El Folio debe ser num�rico");
												  document.InstSWIFT.txtFolio.value="";
												  document.InstSWIFT.txtFolio.focus();
											 	  }
											   else
											 	  {
												  document.InstSWIFT.submit();
												   }
											}
							<%
							break;
					case 5:
							if(request.getParameter("detalle")==null)
								        {%>
										function buscarMovs()
																	{ 
																if(document.Movs.rTipoConsult[0].checked==true) document.Movs.txtTipo.value="1";
																if(document.Movs.rTipoConsult[1].checked==true) document.Movs.txtTipo.value="2";
																if(document.Movs.rTipoConsult[2].checked==true) document.Movs.txtTipo.value="3"; 
															   <%if (  (request.getParameter("cboBuscarPor")!=null?request.getParameter("cboBuscarPor"):"P").equals("P") )
																		{%>		
																	  <%@ include file="validaPeriodo.jsp" %>
																	<%}
																else
																		{%>			 
																	<%}
																	%>
															   document.Movs.submit();
																	}
																	
									  function Enviar(sFolio)
																	{
																	   document.Movs.txtFolio.value = sFolio;
																	   document.Movs.action="FI_Consultas.jsp?menu=5&detalle=1";
																	   document.Movs.submit();
																	}
					              <%}
							break;
					case 6:
							if(request.getParameter("detalle")==null)
								{%>
								 function buscarMovs()
																	{ 

															 <%if ( (request.getParameter("cboBuscarPor")!=null?request.getParameter("cboBuscarPor"):"P").equals("P") )
																		{%>		
																		<%@ include file="validaPeriodo.jsp" %>
																	<%}
																 else{%>		
																	 <%}%>

															 document.Movs.submit();

																	}
			
								function detalle(folio,tipoOperacion)
									{
								   document.Movs.action="FI_Consultas.jsp?menu=6&detalle=1";
								   document.Movs.txtFolio.value = folio;
								   document.Movs.txtTipoOpera.value = tipoOperacion;
								   document.Movs.submit();
									}								
							<%}
							  
							break;
							
					default:
							break;	
					}//switch(menu)
%>
function atras() {
						   document.forms[0].submit();
						}
function ver(valor)
{
  alert(valor);
  document.detalle.accion.value= valor; 
  document.detalle.verReporte.value="si";
	document.detalle.submit();      
}            
function ver2(valor)
{	 
  var varAccion=valor;
  window.open("reporte.jsp?excel=1&accion="+ varAccion ,"","top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=yes,copyhistory=NO,width=750,height=420"); 	
}
</script>
</HEAD>
<!--CUENTAS POR COBRAR-->
<BODY <%=(request.getParameter("verReporte")!=null && request.getParameter("verReporte").equals("si")) ?"onLoad=\"javascript:ver2(\'"+ request.getParameter("accion") + "\')\"":""%>>
<jsp:include page="header.jsp"/>
<!--CUENTAS POR COBRAR-->
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%">
  <TBODY>
    <TR class="trMenuSuperior">
      <TD colspan="7">
        <ul class="menuSuperior">
          <li><a href="FI_Consultas.jsp">Consultas</a></li>
          <li><a href="FI_Instrucciones.jsp">Instrucciones</a></li> <li><a href="FI_InstruccionesN.jsp">Instrucciones No Monetarias</a></li>
          <li><a href="FI_Opciones.jsp">Opciones</a></li>
          <li><a href="salir.jsp">Salir</a></li>
        </ul>
      </TD>
    </TR>
    <TR > 
      <TD align="center" class="tdMenuLateral" valign="top"  height="100%"  width="176">
        <%@ include file="menuConsultas.jsp" %>
      </TD>
      <TD valign="top" align="center">
	  <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %></td>
          </tr>
	</table>	  
	 <table width="80%" border="0"> 
          <tr> 
            <td width="588" class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo"><%=titulo%></td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td align="center" valign="top"> 
              <%//vista de la consulta
switch(menu)
					{
					case 1:
							String ctoInv=request.getParameter("txtCtoInver");
              String sEntidad = request.getParameter("txtEntidad");
							if(ctoInv==null)
								{%>
								  <table border="0" width="95%">
									<tr> 
									  <td height="26" align="center"> <form action="FI_Consultas.jsp?menu=1" method="post" name="ctoinv">
										  <input type="hidden" name="txtCtoInver">
                      <input type="hidden" name="txtEntidad">
										  
										  <%
												consultas.setVtrIntDato1(Integer.parseInt((String)session.getAttribute("NumFid")));
												consultas.querySelect(30);
												if(!consultas.hasData())
													BD.getSaldoCtos((String)session.getAttribute( "NumFid" ));
										  %>
										  <TABLE width="100%" border=0>
											<TBODY>
											  <TR class=celda01 bgColor=#999966>
											    <TD align="middle" width="34%">NOMBRE CONTRATO DE INVERSI&Oacute;N</TD> 
												<TD align=middle width="20%">CONTRATO DE INVERSI�N</TD>
												<TD align="middle" width="22%"> &nbsp;&nbsp;&nbsp;DIVISA &nbsp;&nbsp;&nbsp;</TD>
												<TD align=middle width="24%">SALDO</TD>
											  </TR>
											  <%	
											  double saldoTotal=0;
											  String strSigla="";
											   String strSiglaAnt="";
											   System.out.println("Paso en detalle");
											  for(int r=0; r < consultas.getSize(); r++)
												   {
												   consultas.setIndex (r );
												   strSigla=consultas.getVtrStrDato4();
												  if(!strSiglaAnt.equals("")  && !strSiglaAnt.equals(strSigla))
														  {
														  %>
															  <TR>
															    <TD class="celda01" align="right" width="34%">&nbsp;</TD> 
																<TD class=celda01 align=right width="20%">SALDO EN <%=strSiglaAnt%>:</TD>
																<TD class="celda01" align="right" width="22%">&nbsp;</TD>
																<TD class=celda01 align=right width="24%"><%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoTotal)%> <%=strSiglaAnt%> </TD>
															  </TR>
															  <TR>
															    <TD class="celda01" align="right" width="34%">&nbsp;</TD> 
																<TD class=celda01 align=right width="20%">&nbsp;</TD>
																<TD class="celda01" align="right" width="22%">&nbsp;</TD>
																<TD class=celda01 align=right width="24%">&nbsp;</TD>
															  </TR>
													  <%
														 saldoTotal=0;
														 }
													 saldoTotal=saldoTotal+consultas.getVtrDoubleDato2();
													%>
												  <TR>
												    <TD class="celda02" align="middle" width="34%"><%=consultas.getVtrStrDato5()%></TD> 
													<TD class=celda02 align=middle width="20%"><A  href="javascript:verDetalleCto('<%=Math.round(consultas.getVtrDoubleDato1())%>','<%=consultas.getVtrIntDato4()%>')"><%=Math.round(consultas.getVtrDoubleDato1())%></A></TD>
													<TD class="celda02" align="right" width="22%"><%=consultas.getVtrStrDato6()%></TD>
													<TD class=celda02 align=right   width="24%"><%=NumberFormat.getCurrencyInstance(Locale.US).format(consultas.getVtrDoubleDato2())%> <%=consultas.getVtrStrDato4()%></TD>
                          
												  </TR>
												 <%
												  strSiglaAnt=strSigla;
												  }%>
												 <TR>
												   <TD class="celda01" align="right" width="34%">&nbsp;</TD> 
												   <TD class=celda01 align=right width="20%">SALDO EN <%=strSigla%>:</TD>
												   <TD class="celda01" align="right" width="22%">&nbsp;</TD>
												   <TD class=celda01 align=right  width="24%"><%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoTotal)%> <%=strSigla%> </TD>
												 </TR>
											</TBODY>
										  </TABLE>
										</form></td>
									</tr>
									<tr> 
									  <td align="center">&nbsp;</td>
									</tr>
									<tr> 
									  <td class="texto"> Si deseas realizar alg&uacute;n movimiento, 
										<a href="FI_Instrucciones.jsp"> click aqu&iacute;.</a> </td>
									</tr>
									<tr> 
									  <td align="center">&nbsp;</td>
									</tr>
								  </table>
								  <%
									}
						else   //detalle de las inversiones por contrato
									{%>
									  
              <table border="0" width="100%">
                <tr> 
                  <td   class="subtitulo">CONTRATO DE INVERSI&Oacute;N: &nbsp;<%=ctoInv%></td>
                </tr>
                <tr> 
                  <td>&nbsp;</td>
                </tr>
                <tr> 
                  <td align="center"><%=BD.getDetalleCtos((String)session.getAttribute("NumFid"),request.getParameter("txtCtoInver"),sEntidad)%> 
                  </td>
                </tr>
                <tr> 
                  <td align="center">&nbsp;</td>
                </tr>
                <tr> 
                  <td align="right"><a href="FI_Consultas.jsp?menu=1" ><img src="imagenes/b_atras.gif" border=0 width="58"  height="23" align="right"></a></td>
                </tr>
              </table>
									  <%}%>
              <table border=0 cellpadding=0 cellspacing=1  align="center">
                <tr align=middle valign=center>
                  <td height=30 align="center"> <a href="#top"><img border=0 height=11 src="imagenes/arriba.gif" width=59></a> 
                  </td>
                </tr>
                <tr align=middle> 
                  <td  height=7><img  height=1 src="imagenes/cnaranja01.gif" width=420></td>
                </tr>
              </table>
              <%
							break;
					case 2:
					   //incorporacion de la bitacora
						 folioBit=BD.getFolio(2);
						 bitacora[0]=fechaCont;
						 bitacora[1]= folioBit;
						 bitacora[2]=(String)session.getAttribute("NumUser");
						 bitacora[3]="Consulta de Honorarios Pendienteds de Pago al d�a "+fechaCont
						 +" para el Fideicomiso "+(String)session.getAttribute("NumFid");
						 bitacora[4]="120.0.0.1";					
							%>
              <table border="0" width="95%">
                <tr> 
                  <td align="center" valign="top"><%=BD.getHonPend((String)session.getAttribute("NumFid"),bitacora)%></td>
                </tr>
                <tr> 
                  <td align="center" valign="top">&nbsp;</td>
                </tr>
                <tr> 
                  <td align="center" valign="top"><table width="85%" border="0" height="27">
                      <tr > 
                        <td class="texto">Si deseas realizar alg&uacute;n movimiento, 
                          <a href="FI_Instruccion4.jsp"> click aqu&iacute;.</a></td>
                      </tr>
                    </table></td>
                </tr>
              </table>
              <%
							break;
					case 3:
					   //incorporacion de la bitacora
						 folioBit=BD.getFolio(2);
						 bitacora[0]=fechaCont;
						 bitacora[1]= folioBit;
						 bitacora[2]=(String)session.getAttribute("NumUser");
						 bitacora[3]="Consulta de Tasas de Rendimiento al dia "+fechaCont+" para el Fideicomiso "+(String)session.getAttribute("NumFid");
						 bitacora[4]="120.0.0.1";										
							%>
              <table width="95%" border="0">
                <tr> 
                  <td align="center" valign="top"><%=BD.getTasasRend(fecha,bitacora)%></td>
                </tr>
                <tr> 
                  <td>&nbsp;</td>
                </tr>
                <tr> 
                  <td><table width="90%" border="0" align="center">
                      <tr> 
                        <td ><font  face="Arial, Helvetica, sans-serif" size="2">Las 
                          tasas antes indicadas son <b>informativas</b>.</font> 
                        </td>
                      </tr>
                    </table></td>
                </tr>
              </table>
              <%
							break;
					case 4:
							int i=0;			
							if(request.getParameter("txtFolio")!=null  &&  !request.getParameter("txtFolio").trim().equals("") )
								{
								   //incorporacion de la bitacora
									 folioBit=BD.getFolio(2);
									 System.out.println("Folio"+folioBit);
									 bitacora[0]=fechaCont;
									 bitacora[1]= folioBit;
									 bitacora[2]=(String)session.getAttribute("NumUser");
									 bitacora[3]="Consulta de Movimiento SWIFT con folio "+request.getParameter("txtFolio")+" para el Fideicomiso "+(String)session.getAttribute("NumFid");
									 bitacora[4]="120.0.0.1";
								   
									 regBitacora=BD.insertaBitacora(bitacora);									
								   i = BD.existeSWIFT(request.getParameter("txtFolio"));
								   switch (i)
								   {
									  case 0:
										 session.setAttribute("Error","No existe una instrucci�n de retiro SWIFT con ese Folio.");
										 break;
									  case 1:
										 session.setAttribute("Error"," ");
										break;
									  case -1:
										 session.setAttribute("Error","La instrucci�n de retiro SWIFT, no ha sido procesada.");
										 break;
								   }

								}
								
							%>
              <form name="InstSWIFT" method="post" action="FI_Consultas.jsp?menu=4">
                <%
			  if( i!=1 )
				  {%>
                <table width="95%" border="0">
                  <%
                     if(session.getAttribute("Error")!=null && session.getAttribute("Error")!="")
                     {
                  %>
                  <tr> 
                    <td align="center" class="alerta" colspan="2"> 
                      <% 
                              out.print(session.getAttribute("Error"));		
				             session.setAttribute("Error","");
                           %>
                    </td>
                  </tr>
                  <tr> 
                    <td align="center" class="subtitulo" colspan="2">&nbsp;</td>
                  </tr>
                  <%
                     }
                     %>
                  <tr> 
                    <td width="30%" align="right" class="texto">Folio:</td>
                    <td width="80%"> <input type="text" name="txtFolio" maxlength=10 size="10">
                           <%
                              if(request.getParameter("txtFolio")!=null)
                                 out.print("value=\""+request.getParameter("txtFolio")+"\"");
                              else
                                 out.print("value=\"\"");
                           %>
                         <input type="button" name="Buscar" id="Buscar" value="Buscar" class="boton" onClick="javascript:buscarSWIFT()"></td>
                  </tr>
                  <tr> 
                    <td height="20" colspan="2">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td  class="texto" align="center" colspan="2">&nbsp; </td>
                  </tr>
                </table>
                <%}
			else
			 	 {
					String sHora=BD.getHora();
					String sFecha=BD.getFecha();
					
					String sData[] = BD.getDatosSWIFT(request.getParameter("txtFolio"),(String)session.getAttribute("NumFid"));
					%>
                <table width="95%" height="38">
                  <tr> 
                    <td ><table width="100%"  border="0" >
                        <tr bordercolor="#000000"  bgcolor="#999966"> 
                          <td  class="celda01"  colspan="3">Folio de Operaci&oacute;n: 
                            <%=request.getParameter("txtFolio")%></td>
                        </tr>
                        <tr bordercolor="#000000" class="celda02"> 
                          <td>Fideicomiso</td>
                          <td colspan="2"><%= session.getAttribute("Fideicomiso") %></td>
                        </tr>
                        <tr bordercolor="#000000" class="celda02"> 
                          <td>Fecha de Operaci&oacute;n</td>
                          <td colspan="2"><%=sData[0]%></td>
                        </tr>
                        <tr bordercolor="#000000" class="celda02"> 
                          <td>Tipo de Cambio</td>
                          <td colspan="2"><%=sData[1]%></td>
                        </tr>
                        <tr bordercolor="#000000"> 
                          <td class="texto" colspan="3">&nbsp;</td>
                        </tr>
                        <tr bgcolor="#999966" class="celda01"> 
                          <td align="center">ORIGEN</td>
                          <td align="center"><%=sData[2]%></td>
                          <td align="center">MONEDA NACIONAL</td>
                        </tr>
                        <tr bordercolor="#000000" class="celda02"> 
                          <td>Federal</td>
                          <td align="right"><%=sData[3]%></td>
                          <td align="right"><%=sData[6]%></td>
                        </tr>
                        <tr bordercolor="#000000" class="celda02"> 
                          <td >Estatal</td>
                          <td align="right" ><%=sData[4]%></td>
                          <td align="right" ><%=sData[7]%></td>
                        </tr>
                        <tr bordercolor="#000000" class="celda02"> 
                          <td>Rendimientos</td>
                          <td align="right"><%=sData[5]%></td>
                          <td align="right"><%=sData[8]%></td>
                        </tr>
                        <tr bordercolor="#000000" class="celda02"> 
                          <td class="textoNegrita"><b>Total</b></td>
                          <td align="right" class="textoNegrita"><b><%=sData[9]%></b></td>
                          <td align="right" class="textoNegrita"><b><%=sData[10]%></b></td>
                        </tr>
                      </table></td>
                  </tr>
                  <tr> 
                    <td >&nbsp;</td>
                  </tr>
                  <tr> 
                    <td  class="texto" align="center"> <input type="button" name="Imprimir" value="Imprimir Comprobante" class="boton" onClick="javascript:imprimir( '<%=request.getParameter("txtFolio")%>')"> 
                    </td>
                  </tr>
                </table>
                <%}%>
              </form>
              <%
						    
							break;
					case 5:
							
							if(request.getParameter("detalle")==null)
								{
								%>
              <form name="Movs" method="post" action="FI_Consultas.jsp?menu=5">
                <input type="hidden" name="txtFecha" value="<%=fecha%>">
                <input type="hidden" name="txtFolio">
                <input type="hidden" name="txtDivisa">
                
                <table width="95%" border="0">
                  <%
									 if(session.getAttribute("Error")!=null && session.getAttribute("Error")!="")
									 {
								  %>
                  <tr> 
                    <td align="center" class="alerta" colspan="2"> 
                      <% 
											  out.print(session.getAttribute("Error"));
									   session.setAttribute("Error","");
										   %>
                    </td>
                  </tr>
                  <tr> 
                    <td align="center" class="subtitulo" colspan="2">&nbsp;</td>
                  </tr>
                  <%
									 }
									 %>
                  <tr> 
                    <td align="left" class="texto" colspan="2"> <input type="hidden" name="txtTipo">
										   <%
											  if(request.getParameter("txtTipo")!=null)
												 out.print("value=\"" + request.getParameter("txtTipo") + "\"");
											  else
												 out.print("value=\"1\"");
										   %> </td>
                  </tr>
				  </table>
				  <table border="0" width="95%">
                  <tr> 
                    <td width="90%"  class="texto">&nbsp;&nbsp;Buscar por: 
                      <select name="cboBuscarPor"    onChange="document.Movs.submit();">
                        <%int numQuery=1;%>
                        <option value="P" <%= (request.getParameter("cboBuscarPor")!=null?request.getParameter("cboBuscarPor"):"P").equals("P")?"selected":""%>>Periodo</option>
               
                      </select> &nbsp;&nbsp; 
                      <%if (  (request.getParameter("cboBuscarPor")!=null?request.getParameter("cboBuscarPor"):"P").equals("P") )
					  				{%>
                      <input type="hidden" name="txtFechaI" maxlength=10 size="8" value="<%=request.getParameter("txtFechaI")!=null?request.getParameter("txtFechaI"):fecha%>" class="texto"> 
                      <input type="button" id="cboCalendarioI" name="cboCalendarioI"  style=" WIDTH: 60px" value="<%=request.getParameter("txtFechaI")!=null?request.getParameter("txtFechaI"):fecha%>" onChange="Movs.txtFechaI.value=Movs.cboCalendarioI.value;"><input type="button" id="lanzaCalendarioI" name="lanzaCalendarioI"  style=" WIDTH: 15px"   class="botonCbo" value="v"> 
                      <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendarioI",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioI"   // el id del bot�n que lanzar� el calendario
																						});					
																   </SCRIPT> &nbsp; 
                      al&nbsp; <input type="hidden" name="txtFechaF" maxlength=10 size="8" value="<%=request.getParameter("txtFechaF")!=null?request.getParameter("txtFechaF"):fecha%>" class="texto"> 
                      <input type="button" id="cboCalendarioF" name="cboCalendarioF"  style=" WIDTH: 60px" value="<%=request.getParameter("txtFechaF")!=null?request.getParameter("txtFechaF"):fecha%>" onChange="Movs.txtFechaF.value=Movs.cboCalendarioF.value;"><input type="button" id="lanzaCalendarioF" name="lanzaCalendarioF"  style=" WIDTH: 15px"   class="botonCbo" value="v">  
                      <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendarioF",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioF"   // el id del bot�n que lanzar� el calendario
																						});					
					</SCRIPT> 
                      <%}
					else
					  				{%>
                      <input type="text" name="txtAcuerdo" maxlength=50 size="40" value="<%=request.getParameter("txtAcuerdo")!=null?request.getParameter("txtAcuerdo"):""%>" > 
                      <%}%>
                      &nbsp;&nbsp; </td>
                    <td width="10%" class="mensaje" align="right"><input type="button" name="Buscar" id="Buscar" value="Buscar" class="boton" onClick="javascript:buscarMovs()"></td>
                  </tr>
                  <tr> 
                    <td  class="mensaje" >&nbsp;&nbsp; 
                      <%if (  (request.getParameter("cboBuscarPor")!=null?request.getParameter("cboBuscarPor"):"0").equals("P")|| request.getParameter("cboBuscarPor")==null )
												{%>
                      Nota: S&oacute;lo puedes hacer consulta de los movimientos del 
                      mes actual y el anterior. 
                      <%}%>
                    </td>
                    <td  class="mensaje">&nbsp;</td>
                  </tr>
				  </table>
				  
                <table width="95%" border="0"  class="texto">
                  <tr> 
                    <td >Tipo de Movimiento:</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td width="35%" align="right" style=" WIDTH: 20px">Dinero 
                      <input type="radio" name="rTipoConsult" value="Dinero"> 
										   <%
											  if(request.getParameter("txtTipo")!=null)
											  {
												 if(request.getParameter("txtTipo").equals("1"))
												 {
													out.print("checked=\"true\"");
												 }
											  }
											  else
											  {
												 out.print("checked=\"true\"");
											  }
										   %>
										</td>
                    <td width="32%" align="center" style=" WIDTH: 20px">Compromisos 
                      <input type="radio" name="rTipoConsult" value="Compromisos"> 
										   <%
											  if(request.getParameter("txtTipo")!=null)
											  {
												 if(request.getParameter("txtTipo").equals("2"))
												 {
													out.print("checked=\"true\"");
												 }
											  }
										   %>
										  </td>
                    <td width="33%" style=" WIDTH: 20px">Reprogramaciones 
                      <input type="radio" name="rTipoConsult" value="Reprogramaciones">
										   <%
											  if(request.getParameter("txtTipo")!=null)
											  {
												 if(request.getParameter("txtTipo").equals("3"))
												 {
													out.print("checked=\"true\"");
												 }
											  }
										   %>
										  </td>
                  </tr>
                </table>
                <table border=0 width="95%">
                  <tr> 
                    <td  colspan="2">&nbsp; </td>
                  </tr>
                  <td colspan="2" align="center"> 
                    <%
										    if(request.getParameter("txtFechaI")!=null && request.getParameter("txtFechaF")!=null && (request.getParameter("cboBuscarPor")!=null?request.getParameter("cboBuscarPor"):"P").equals("P"))
										   {
										   
										   System.out.println(request.getParameter("txtFechaI") +" al "+request.getParameter("txtFechaF")+ " Tipo:"+request.getParameter("txtTipo") );
												   //incorporacion de la bitacora
												     folioBit=BD.getFolio(2);
													 System.out.println("Folio"+folioBit);
													 bitacora[0]=fechaCont;
													 bitacora[1]= folioBit;
													 bitacora[2]=(String)session.getAttribute("NumUser");
													 bitacora[3]="Consulta de Movimientos Foseg para el Periodo del "
													 +request.getParameter("txtFechaI")+" al "+request.getParameter("txtFechaF")
													 +" para el Tipo de Movimiento de ";
													 if (((String)request.getParameter("txtTipo")).equals("1"))
													 bitacora[3]+=" Dinero"+" para el Fideicomiso "+(String)session.getAttribute("NumFid");
													 else if (((String)request.getParameter("txtTipo")).equals("2"))
													 bitacora[3]+=" Compromisos"+" para el Fideicomiso "+(String)session.getAttribute("NumFid");
													 else
													 bitacora[3]+=" Reprogramaciones"+" para el Fideicomiso "+(String)session.getAttribute("NumFid");													
													 bitacora[4]="120.0.0.1";
												   
												     regBitacora=BD.insertaBitacora(bitacora);										   
											  out.print(BD.getMovsFOSEG((String)session.getAttribute("NumFid"),request.getParameter("txtFechaI"),request.getParameter("txtFechaF"),request.getParameter("txtTipo"),"ACTIVO"));
										   }
										%>
                  </td>
                  </tr>
       
         
                </table>
              </form>
              <%}
						  else
						  		{
								//detalle del movimiento%>
								<form name="detalle" action="FI_Consultas.jsp" method="post">
								<input type="hidden" name="menu" value="5">
								<input type="hidden" name="txtFechaI" value="<%=request.getParameter("txtFechaI")%>">
								<input type="hidden" name="txtFechaF" value="<%=request.getParameter("txtFechaF")%>">
								<input type="hidden" name="txtTipo" value="<%=request.getParameter("txtTipo")%>">
                <!--CUENTAS POR COBRAR-->
                <input type="HIDDEN" name="accion" value="">                  
                <input type="hidden" name="verReporte" value="no">		                  
                <!--CUENTAS POR COBRAR-->                
								</form>
              <%=request.getParameter("txtFolio")!=null?BD.getMovsDetFOSEG(request.getParameter("txtFolio"),(String)session.getAttribute("NumFid"),0):""%> 
              <%}
			  			break;
			   case 6://INICIA LA SECCION DE CONSULTA DE MOVIMIENTOS%>
              <form name="Movs" method="post" action="FI_Consultas.jsp?menu=6">
                <input type="hidden" name="txtFecha" value="<%=fecha%>">
                <input type="hidden" name="txtFolio">
                <input type="hidden" name="txtTipoOpera"  value="">
                <input type="hidden" name="txtDivisa">
                <%if(request.getParameter("detalle")==null)
								{
								%>
                <table border="0" width="95%">
                  <tr> 
                    <td width="90%"  class="texto">Periodo Del:                       . &nbsp;&nbsp; 
                      <%if (  (request.getParameter("cboBuscarPor")!=null?request.getParameter("cboBuscarPor"):"P").equals("P") )
					  				{%>
                      <input type="hidden" name="txtFechaI" maxlength=10 size="8" value="<%=request.getParameter("txtFechaI")!=null?request.getParameter("txtFechaI"):fecha%>" class="texto"> 
                      <input type="button" id="cboCalendarioI" name="cboCalendarioI"  style=" WIDTH: 60px" value="<%=request.getParameter("txtFechaI")!=null?request.getParameter("txtFechaI"):fecha%>" onChange="Movs.txtFechaI.value=Movs.cboCalendarioI.value;"><input type="button" id="lanzaCalendarioI" name="lanzaCalendarioI"  style=" WIDTH: 15px"   class="botonCbo" value="v"> 
                      <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendarioI",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioI"   // el id del bot�n que lanzar� el calendario
																						});					
																   </SCRIPT> &nbsp; 
                      al&nbsp; <input type="hidden" name="txtFechaF" maxlength=10 size="8" value="<%=request.getParameter("txtFechaF")!=null?request.getParameter("txtFechaF"):fecha%>" class="texto"> 
                      <input type="button" id="cboCalendarioF" name="cboCalendarioF"  style=" WIDTH: 60px" value="<%=request.getParameter("txtFechaF")!=null?request.getParameter("txtFechaF"):fecha%>" onChange="Movs.txtFechaF.value=Movs.cboCalendarioF.value;"><input type="button" id="lanzaCalendarioF" name="lanzaCalendarioF"  style=" WIDTH: 15px"  class="botonCbo" value="v">  
                      <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendarioF",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioF"   // el id del bot�n que lanzar� el calendario
																						});					
					</SCRIPT> 
                      <%}
					else
					  				{%>
                      <input type="text" name="txtAcuerdo" maxlength=50 size="40" value="<%=request.getParameter("txtAcuerdo")!=null?request.getParameter("txtAcuerdo"):""%>" > 
                      <%}%>
                      &nbsp;&nbsp; </td>
                    <td width="10%" class="mensaje" align="right"><input type="button" name="buscar2" value="Buscar" class="boton" onClick="javascript:buscarMovs()"></td>
                  </tr>
                  <tr> 
                    <td  class="mensaje" >
                      <%if (  (request.getParameter("cboBuscarPor")!=null?request.getParameter("cboBuscarPor"):"0").equals("P")  || request.getParameter("cboBuscarPor")==null)
												{%>
                      Nota:&oacute;Solo puedes hacer consulta de los movimientos del 
                      mes actual y el anterior. 
                      <%}%>
                    </td>
                    <td  class="mensaje">&nbsp;</td>
                  </tr>
                </table>
                <table border="0" width="95%">
                  <tr> 
                    <td height="20">&nbsp;</td>
                  </tr>
                  <td align="center"> 
                    <%
						   	//muestra tabla con los registros segun el criterio de busqueda 2(todo),4(clave),5(nomina),6(nombre)
							   if(request.getParameter("txtFechaI")!=null && request.getParameter("txtFechaF")!=null && (request.getParameter("cboBuscarPor")!=null?request.getParameter("cboBuscarPor"):"P").equals("P"))
								{
							movimientos.setVtrIntDato1(Integer.parseInt((String)session.getAttribute("NumFid")));
							movimientos.setVtrStrDato2(request.getParameter("txtFechaI")!=null?request.getParameter("txtFechaI"):fecha);
							movimientos.setVtrStrDato3(request.getParameter("txtFechaF")!=null?request.getParameter("txtFechaF"):fecha);
							movimientos.querySelect(12);

							  //incorporacion de la bitacora
							 folioBit=BD.getFolio(2);
							 System.out.println("Folio MOVIMIENTOS"+folioBit);
							 bitacora[0]=fechaCont;
							 bitacora[1]= folioBit;
							 bitacora[2]=(String)session.getAttribute("username");
							 bitacora[3]="Consulta de Movimientos del Periodo "+request.getParameter("txtFechaI")+" al periodo "+request.getParameter("txtFechaF")+" para el Fideicomiso "+(String)session.getAttribute("NumFid")
;
							 bitacora[4]="120.0.0.1";
						   
							 regBitacora=BD.insertaBitacora(bitacora);	
						  																
							//renglon de titulos de usuarios
							%>
                    <table  width="100%">
                      <tr class="celda01" bgcolor="#999966"> 
                        <td align="center">FOLIO</td>
                        <td  align="center">FECHA DE CAPTURA</td>
                        <td align="center"> TIPO DE INSTRUCCI&Oacute;N</td>
                        <td  align="center">IMPORTE</td>
                        <td  align="center">DIVISA</td>
                        <td  align="center">STATUS</td>
                      </tr>
                      <%
						//tabla con registros de usuarios
						for(int r=0; r < movimientos.getSize(); r++)
							 {
               String sDivisa="";
               movimientos.setIndex (r );
               //se obtiene el nombre de la moneda
              if (movimientos.getVtrIntDato8()==1)
                moneda.setVtrIntDato1(movimientos.getVtrIntDato7());
               else //if (movimientos.getVtrIntDato8()==2)
                moneda.setVtrIntDato1(movimientos.getVtrIntDato8());
               moneda.querySelect(48); 
               sDivisa=moneda.getVtrStrDato1();
							 %>
                      <tr  class="celda02"> 
                        <td  align="center" class="textoAzul"> <a href="javascript:detalle(<%=movimientos.getVtrIntDato1()%>,<%=movimientos.getVtrIntDato4()%>);" ><%=movimientos.getVtrIntDato1()%></a></td>
                        <td  align="center"><%=movimientos.getVtrStrDato2()%> 
                        </td>
                        <td  align="center"><%=movimientos.getVtrStrDato3()%> 
                        </td>
                        <td  align="right"><%=movimientos.getVtrIntDato4()==2?NumberFormat.getCurrencyInstance(Locale.US).format(movimientos.getVtrDoubleDato6()):NumberFormat.getCurrencyInstance(Locale.US).format(movimientos.getVtrDoubleDato5())%> 
                        </td>
                        <td  align="center"><%=sDivisa%> 
                        <input type="hidden" name="txtMoneda" value="<%=sDivisa%>">
                        </td>                        
                        <td  align="center"><%=movimientos.getVtrStrDato4()%> 
                        <input type="hidden" name="txtStatus" value="<%=movimientos.getVtrStrDato4()%>">
                        </td>                        
                      </tr>
                      <%}
						if ( !movimientos.hasData () )
								  {%>
                      <tr  class="celda01"> 
                        <td align="center" colspan="4">No hay instrucciones del 
                          periodo especificado</td>
                      </tr>
                      <%}%>
                    </table>
                    <%}//buscar%>
                  </td>
                  </tr>
                </table>
				<%}%>
                <%if(request.getParameter("detalle")!=null)//detalle de la instruccion
					   {
							String usuario=(String)session.getAttribute( "NomUser" );
							String instruccion="";
							String fechaCaptura="";
							String usuarioCaptura="";
							String usuarioFirma1="";
							String usuarioFirma2="";
							int tipoInstruccion=Integer.parseInt(request.getParameter("txtTipoOpera")!=null?request.getParameter("txtTipoOpera").trim():"0");
							int folio=Integer.parseInt(request.getParameter("txtFolio")!=null?request.getParameter("txtFolio").trim():"0");
							int fiso=Integer.parseInt((String)session.getAttribute("NumFid")!=null?(String)session.getAttribute("NumFid"):"0");
							det.setVtrIntDato1(folio);
							det.setVtrIntDato2(fiso);
              firmas.removerValores();
              firmas.setVtrIntDato1(folio);
              firmas.querySelect(1);
              if(firmas.hasData())
                {
                usuarioCaptura=firmas.getVtrStrDato1();
              
                if(firmas.getSize()==2)
                  {
                  firmas.setIndex(1);
                  usuarioFirma1=firmas.getVtrStrDato1();
                  }
                }
								
						switch(tipoInstruccion)
							{
							case 1:
										instruccion="DEPOSITO";
										det.querySelect(21);
										fechaCaptura=fechaCaptura.equals("")?det.getVtrStrDato2():fechaCaptura;	
                    //CUENTAS POR COBRAR
                    String strContenidoArchivo  = "";
                    strContenidoArchivo =  CargaArchivo.getDatosDetalleCarga(String.valueOf(folio),String.valueOf(fiso));
                    session.setAttribute("contenido",strContenidoArchivo);		
                      ///////////////////
					
										break;			
							case 2:
										instruccion="RETIRO";
										det.querySelect(22);
										fechaCaptura=fechaCaptura.equals("")?det.getVtrStrDato1():fechaCaptura;									 
										 if(det.getVtrIntDato5()==21)
												   { 
												   detSWIFT.setVtrIntDato1(folio);
												   detSWIFT.setVtrIntDato2(fiso);
												   detSWIFT.querySelect(32);
													}	
										break;
															
							case 3:
										instruccion="TRASPASO ENTRE CONTRATOS DE INVERSION";
										det.querySelect(23);
										fechaCaptura=fechaCaptura.equals("")?det.getVtrStrDato1():fechaCaptura;
										System.out.println("33");
										break;		

							case 4:
										instruccion="INSTRUCCION NO MONETARIA";
										det.removerValores();
										det.setVtrIntDato1(folio);
										det.setVtrIntDato2(folio);										
										det.querySelect(201);
										fechaCaptura=fechaCaptura.equals("")?det.getVtrStrDato3():fechaCaptura;
										System.out.println("201");
										break;											
										
								}

					   %>
				<input type="hidden" name="txtFechaI" value="<%=request.getParameter("txtFechaI")%>">
				<input type="hidden" name="txtFechaF" value="<%=request.getParameter("txtFechaF")%>">
				<input type="hidden" name="txtTipo" value="<%=request.getParameter("txtTipo")%>">

                <table width="95%"  border="0" >
                  <tr> 
                    <td  colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01"><b>DATOS 
                      GENERALES</b></td>
                  </tr>
                  <tr  class="celda02"> 
                    <td width="34%"> Folio:</td>
                    <td width="66%" > <%=folio%> </td>
                  </tr >
                  <tr  class="celda02"> 
                    <td   >Fecha de Captura: </td>
                    <td > <%=fechaCaptura%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td> Tipo de Instrucci&oacute;n: </td>
                    <td > <%=instruccion%></td>
                  </tr>
                  <tr  class="celda02"> 
                    <td> Status: </td>
                    <td > <%=request.getParameter("txtStatus")!=null?request.getParameter("txtStatus").trim():""%></td>
                  </tr>
                  <tr  class="celda02"> 
                    <td> Divisa: </td>
                    <td > <%=request.getParameter("txtMoneda")!=null?request.getParameter("txtMoneda").trim():""%></td>
                  </tr>                  
                  <tr  class="celda02"> 
                    <td > Realizada<%=usuarioFirma1.equals("")?"  y autorizada":""%> 
                      por:</td>
                    <td > <%=usuarioCaptura%> </td>
                  </tr>
                        <%if(!usuarioFirma1.equals(""))
								{
								
								%>
                        <tr  class="celda02"> 
                          <td > Autorizada por: </td>
                          <td > <%=usuarioFirma1+(usuarioFirma2.equals("")?"":"  Y  "+ usuarioFirma2)%> </td>
                        </tr>
                        <%}%>
                </table>
                <br>
                <%
					
						switch(tipoInstruccion)
									{
												case 1:
															%>
                <table width="95%"  border="0" >
                  <tr> 
                    <td height="19" colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01"><b>DETALLE 
                      DEP&Oacute;SITO </b></td>
                  </tr>
                  <tr  class="celda02"> 
                    <td width="34%" align="left" > Cuenta <%=session.getAttribute("empresa_9")%> en la que se dep&oacute;sito:</td>
                    <td width="66%"><%=det.getVtrStrDato4()%> </td>
                  </tr >
                  <tr  class="celda02"> 
                    <td   align="left">Importe : </td>
                    <td ><%=NumberFormat.getCurrencyInstance(Locale.US).format(det.getVtrDoubleDato5())%> 
                    </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td   align="left">Moneda : </td>
                    <td ><%=det.getVtrStrDato9()%> 
                    </td>
                  </tr>
                  
                  <tr  class="celda02"> 
                    <td > Concepto : </td>
                    <td ><%=det.getVtrStrDato7()%> </td>
                  </tr>
                  <% 
                            if(Integer.parseInt((String)session.getAttribute("TpoCont")) == 1 ) {
                  %>
                  <tr  class="celda02"> 
                    <td > Persona que deposita : </td>
                    <td ><%=det.getVtrStrDato10()%> </td>
                  </tr>
                 <% } %>
                  
                  <tr  class="celda02"> 
                    <td > Abono al Contrato de Inversi&oacute;n No.:</td>
                    <td > <%=det.getVtrIntDato8()%> </td>
                  </tr>
                  <% if(!det.getVtrStrDato9().trim().equals("0")) 
                  {%>
                  <% } %>
                </table>
                <%
															break;
												case 2:
															%>
                <table width="95%"  border="0" >
                  <tr> 
                    <td height="19" colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01"><b>DETALLE 
                      RETIRO</b></td>
                  </tr>
                  <tr  class="celda02"> 
                    <td width="34%" align="left" > Retiro del Contrato de Inversi&oacute;n:</td>
                    <td width="66%"><%=det.getVtrIntDato2()%> </td>
                  </tr >
                  <tr  class="celda02"> 
                    <td   align="left">Importe: </td>
                    <td ><%=NumberFormat.getCurrencyInstance(Locale.US).format(det.getVtrDoubleDato3())%> 
                    </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td > Concepto: </td>
                    <td ><%=det.getVtrStrDato4()%> </td>
                  </tr>
				  <% 
				  // ACUERDOS COMITE TECNICO
				  if(!det.getVtrStrDato13().equals(""))
				  			{
							%>
                  <tr  class="celda02">
                    <td > Acuerdo Comit&eacute; T&eacute;cnico:</td>
                    <td > Fecha de Sesi&oacute;n:&nbsp;<%=det.getVtrStrDato13()%> <br>
                      Tipo de Sesi&oacute;n: &nbsp; <%=det.getVtrStrDato14().equals("O")?"ORDINARIA":"EXTRAORDINARIA"%><br>
                      No. Acuerdo:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=det.getVtrStrDato15()%> 
                    </td>
                  </tr>
				  		 <%}%>
                  <tr  class="celda02"  > 
                    <td > Forma de Liquidaci&oacute;n:</td>
                    <td > <%=det.getVtrStrDato6()%> </td>
                  </tr>
                  <%
					if(det.getVtrIntDato5()==1||det.getVtrIntDato5()==2||det.getVtrIntDato5()==11)//Cheques y aviso de afectacion
					 {
					%>
                  <tr  class="celda02"> 
                    <td > Beneficiario: </td>
                    <td ><%=det.getVtrStrDato10()%> </td>
                  </tr>
                  <%				
					 }
					if(det.getVtrIntDato5()==24)//Bancomer CIE
					 {
					%>
                  <tr  class="celda02"> 
                    <td >N&uacute;mero de Referencia CIE:</td>
                    <td ><%=det.getVtrStrDato16()%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td >Beneficiario:</td>
                    <td ><%=det.getVtrStrDato10()%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td >N&uacute;mero de Convenio:</td>
                    <td ><%=det.getVtrStrDato17()%> </td>
                  </tr>
                  
                  <%				
					 }           
					if(det.getVtrIntDato5()==26)//Cuentas internas
					 {
					%>
                  <%				
					 }					 
					if(det.getVtrIntDato5()==-1 ||  det.getVtrIntDato5()==-1)//Speua(5) , TBC-BANCOMER(19)
					 {
					%>
                  <tr  class="celda02"> 
                    <td >N�mero de Cuenta:</td>
                    <td ><%=det.getVtrStrDato7()+" - "+det.getVtrStrDato8()%> 
                    </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td > Plaza: </td>
                    <td ><%=det.getVtrStrDato11()%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td > Titular de la Cuenta: </td>
                    <td ><%=det.getVtrStrDato10()%> </td>
                  </tr>
                  <%				
					 }
					 
					if(det.getVtrIntDato5()==18)//SIAC(BANXICO)
					 {

					%>
                  <tr  class="celda02"> 
                    <td >N�mero de Cuenta:</td>
                    <td ><%=det.getVtrStrDato9()%> </td>
                  </tr>
                  <%								 
					 }
					if(det.getVtrIntDato5()==3)//SPEI
					 {
              detCuentas.setVtrIntDato1(Integer.parseInt((String)session.getAttribute("NumFid")!=null?(String)session.getAttribute("NumFid"):"0"));//NUMERO DE FIDEICOMISO
							detCuentas.setVtrStrDato1(det.getVtrStrDato8());//CLABE DE LA CUENTA
              detCuentas.querySelect(46);//se recuperan los datos de la cuenta
              if (detCuentas.hasData()){
					%>
                  <tr  class="celda02"> 
                    <td > Banco: </td>
                    <td ><%=detCuentas.getVtrStrDato6()%> </td>
                  </tr>          
                  <tr  class="celda02"> 
                    <td >N�mero de Cuenta:</td>
                    <td ><%=detCuentas.getVtrStrDato1()%> 
                    </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td > Plaza: </td>
                    <td ><%=detCuentas.getVtrStrDato2()%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td > Titular de la Cuenta: </td>
                    <td ><%=detCuentas.getVtrStrDato4()%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td > RFC: </td>
                    <td ><%=detCuentas.getVtrStrDato5()%> </td>
                  </tr>
                  <%									
                  }
					 }
					%>
                  <%
				if(det.getVtrIntDato5()==21)//SWIFT
					 {
					%>
                  <tr class="celda02" > 
                    <td height="29" colspan="2" align="center" class="celda01" >Datos 
                      del Banco Domiciliario</td>
                  </tr>
                  <tr class="celda02" > 
                    <td  >Pa&iacute;s:</td>
                    <td > <%=detSWIFT.getVtrStrDato1()%> </td>
                  </tr>
                  <tr class="celda02" > 
                    <td  >Ciudad:</td>
                    <td > <%=detSWIFT.getVtrStrDato2()%> </td>
                  </tr>
                  <tr class="celda02" > 
                    <td   >Nombre del Banco:</td>
                    <td  > <%=detSWIFT.getVtrStrDato3()%> </td>
                  </tr>
                  <tr class="celda02" > 
                    <td >Plaza:</td>
                    <td > <%=detSWIFT.getVtrStrDato4()==null?"":detSWIFT.getVtrStrDato4()%> </td>
                  </tr>
                  <tr class="celda02" > 
                    <td   >Sucursal:</td>
                    <td  > <%=detSWIFT.getVtrStrDato5()==null?"":detSWIFT.getVtrStrDato5()%> </td>
                  </tr>
                  <tr class="celda02" > 
                    <td  >N&uacute;mero de Cuenta:</td>
                    <td  > <%=detSWIFT.getVtrStrDato6()%> </td>
                  </tr>
                  <tr class="celda02" > 
                    <td   >Branch:</td>
                    <td  > <%=detSWIFT.getVtrStrDato7()%> </td>
                  </tr>
                  <tr class="celda02" > 
                    <td >Moneda:</td>
                    <td  > <%=detSWIFT.getVtrStrDato8()%> </td>
                  </tr>
                  <tr class="celda02" > 
                    <td >Importe a transferir:</td>
                    <td > <%=NumberFormat.getCurrencyInstance(Locale.US).format(detSWIFT.getVtrDoubleDato9())%> 
                    </td>
                  </tr>
                  <tr class="celda02" > 
                    <td  >C�digo SWIFT o ABA :</td>
                    <td  > <%=detSWIFT.getVtrStrDato10()%> </td>
                  </tr>
                  <tr class="celda02" > 
                    <td height="29" colspan="2"  align="center" class="celda01" >Datos 
                      del Beneficiario</td>
                  </tr>
                  <tr class="celda02" > 
                    <td   >Nombre:</td>
                    <td  > <%=detSWIFT.getVtrStrDato11()%> </td>
                  </tr>
                  <tr class="celda02" > 
                    <td >Pa&iacute;s:</td>
                    <td > <%=detSWIFT.getVtrStrDato12()%> </td>
                  </tr>
                  <tr class="celda02" > 
                    <td  >Ciudad:</td>
                    <td > <%=detSWIFT.getVtrStrDato13()%> </td>
                  </tr>
                  <tr class="celda02" > 
                    <td   >Domicilio:</td>
                    <td > <%=detSWIFT.getVtrStrDato14()%> </td>
                  </tr>
                  <tr class="celda02" > 
                    <td >Tel&eacute;fono:</td>
                    <td  > <%=detSWIFT.getVtrStrDato15()%> </td>
                  </tr>
                  <%}//SWIFT%>
                </table>
                <%
															break;
												case 3:
														    %>
                <table width="95%"  border="0" >
                  <tr> 
                    <td height="19" colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01"><b>DETALLE 
                      TRASPASO </b></td>
                  </tr>
                  <tr  class="celda02"> 
                    <td width="28%" align="left" > Contrato de Inversi&oacute;n 
                      Origen:</td>
                    <td width="72%"><%=det.getVtrIntDato2()%> </td>
                  </tr >
                  <tr  class="celda02"> 
                    <td   align="left">Contrato de Inversi&oacute;n Destino: </td>
                    <td ><%=det.getVtrIntDato3()%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td > Importe: </td>
                    <td > <%=NumberFormat.getCurrencyInstance(Locale.US).format(det.getVtrDoubleDato4())%></td>
                  </tr>
                </table>
                <%
															break;
												case 4://INSTRUCCION NO MONETARIA
														    %>
                <table width="95%"  border="0" >
                  <tr> 
                    <td height="19" colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01"><b>DETALLE 
                      INSTRUCCION NO MONETARIA</b></td>
                  </tr>
                  <tr  class="celda02"> 
                    <td   align="left">Etapa Atencion: </td>
                    <td ><%=det.getVtrStrDato6()%> </td>
                  </tr>					  
                  <tr  class="celda02"> 
                    <td   align="left">Fecha Fin Etapa: </td>
                    <td ><%=det.getVtrStrDato4()%> </td>
                  </tr>	
                  <tr  class="celda02"> 
                    <td   align="left">Observaciones: </td>
                    <td ><%=det.getVtrStrDato5()%> </td>
                  </tr>	

				  <tr  class="celda02"> 
                          <td> Documentos a entregar:</td>
                          <td>
                          </td>                          
                   </tr>  
                          <%
                          consultas_doc.removerValores();
                          consultas_doc.setVtrStrDato1(det.getVtrStrDato7());
                          consultas_doc.querySelect(4);
                          if(consultas_doc.hasData())
                            for(int j=0;j<consultas_doc.getSize();j++){
                            consultas_doc.setIndex(j);
                            %>
                            <tr class="celda02">
                            <td>
                            </td>                            
                            <td> 
                            <%=consultas_doc.getVtrStrDato1()%>
                            </td>
                            </tr>                             
                            <%
                            }
                          else{
                            %>
                            <tr class="celda02">
                            <td>
                            </td>                             
                            <td> &nbsp; </td>
                            </tr>                             
                            <% 
                            }
                          %>

				  
                </table>															
															
															
											   <%
															break;
											   
											   default:
											   				break;				
									}//fin switch(tipoInstruccion)
													
										%>
														
                <table width="90%"  border="0" >
                  <tr> 
                    <td align="right" colspan="2">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td align="right" colspan="2"><a href="javascript:atras()"><img src="imagenes/b_atras.gif" border=0 width="58"  height="23" align="right"></a></td>
                  </tr>
                  <tr> 
                    <td colspan="2" align="center"> <input type="button" name="Consultar" value="Consultar" class="boton" onClick="javascript:ver2('Consultar')">     
                                                    <input type="button" name="Imprimir"  value="Imprimir"  class="boton" onClick="javascript:ver2('Imprimir')"></td>       
                  </tr>
                  <!---->
                </table>
                <%}%>
              </form> 
              <%	
			  				break;
			    case 11:
							%>
							 <jsp:forward page="FI_Consultas_Menu_11.jsp"/>
							<%	
							break;
			    case 12:
							%>
							 <jsp:forward page="FI_Consultas_Menu_12.jsp"/>
              <%	
							break;							
					default:
							%>
              
              <%
							break;	
					}//switch(menu)
%>
              <%
										   if(request.getParameter("txtFechaI")!=null && request.getParameter("txtFechaF")!=null)
										   {%>
              <table border=0 cellpadding=0 cellspacing=1  align="center" width="100%">
                <tr align=middle valign=center> 
                  <td height=30 align="center"> <a href="#top"><img border=0 height=11 src="imagenes/arriba.gif" width=59></a> 
                  </td>
                </tr>
                <tr align=middle> 
                  <td  height=7 align="center"><img  height=1 src="imagenes/cnaranja01.gif" width="420"></td>
                </tr>
              </table>
              <%}%>
            </td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
	
</BODY></HTML>
