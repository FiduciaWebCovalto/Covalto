<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.util.*,java.text.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="acuerdo"  class="com.bancomext.negocio.nAcuerdos"/>
<%@ include file="Sesion.jsp" %>
<%
try{

DecimalFormat dec = new DecimalFormat("###,###,###,##0.00");
//Parametros de consulta
int numQuery=Integer.valueOf(request.getParameter("cboBuscar")!=null?request.getParameter("cboBuscar"):"0").intValue();
int numFiso=Integer.parseInt((String)session.getAttribute("NumFid")!=null?(String)session.getAttribute("NumFid"):"0");
String txtCondicion=request.getParameter("txtCondicion")!=null?request.getParameter("txtCondicion").trim():fecha;
int buscar=Integer.valueOf(request.getParameter("buscar")!=null?request.getParameter("buscar"):"1").intValue();


					  		  
%>
<HTML>
<HEAD><TITLE>Sesiones Comite T�cnico</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
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

			function selectCondicion()
									 {
													 document.calendario.txtCondicion.value=""; 
													 document.calendario.buscar.value="0";						 
													 document.calendario.submit();
			
									 }
			function detalle(SesionFecha,SesionTipo)
						 {

						  			  document.calendario.txtSesionFecha.value=SesionFecha;
									  document.calendario.txtSesionTipo.value=SesionTipo;						 
						document.calendario.submit();


						 } 

		 function imprimir(param1,param2)
		 						  {

										  window.open("repAcuerdosComite.jsp?imp=1&param1="+param1+"&param2="+param2,"Seguimiento_Acuedos","top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=no,copyhistory=NO,width=750,height=400");
								  
								  }
		
	    function ver(param1,param2)
		 						  {

										  window.open("repAcuerdosComite.jsp?imp=0&param1="+param1+"&param2="+param2,"Seguimiento_Acuedos","top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=no,copyhistory=NO,width=750,height=400");
								  
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
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=sysFecha%></TD>
      <TD background="imagenes/fondoMenu.gif"><a href="FI_Consultas.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Consultas','','imagenes/consultas2.gif',1);"><img src="imagenes/consultas2.gif" name="Consultas" width="104" height="17" border="0"></a><a href="FI_Instrucciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Instrucciones','','imagenes/instrucciones2.gif',1)"><img src="imagenes/instrucciones1.gif" name="Instrucciones"  border="0"></a><!--a href="FI_EdosF.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Reportes','','imagenes/reportes2.gif',1)"><img src="imagenes/reportes1.gif" name="Reportes"  border="0"></a--><a href="FI_Opciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Opciones','','imagenes/Opciones2.gif',1)"><img src="imagenes/Opciones1.gif" name="Opciones"  border="0"></a><a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir"  border="0"></a></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540"  width="176"> 
        <%@ include file="menuConsultas.jsp" %>
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo" >Seguimiento 
              de Acuerdos</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
		  </table >
		  
		  
		         <form name="calendario" action="" method="post" >
          <input type="hidden"name="txtNumContrato"  value="<%=request.getParameter("txtNumContrato")!=null?request.getParameter("txtNumContrato"):""%>">
          <input type="hidden" name="txtSesionFecha" value="<%=request.getParameter("txtSesionFecha")!=null?request.getParameter("txtSesionFecha"):""%>">
          <input type="hidden" name="txtSesionTipo"  value="<%=request.getParameter("txtSesionTipo")!=null?request.getParameter("txtSesionTipo"):""%>">
          <table width="593"  border="0">
            <tr> 
              <td ><table cellSpacing=0 cellPadding=0   width="95%" align="center" >
                  <tr> 
                    <td width="12%"  class="texto">Buscar por: </td>
                    <td width="77%" align="left"> <select name="cboBuscar"    onChange="javascript:selectCondicion();">
                        <option value="11" <%= numQuery==11?"selected":""%>>Todos</option>
                        <option value="12" <%= numQuery==12?"selected":""%>>Fecha de Sesi�n</option>
                        <option value="13" <%= numQuery==13?"selected":""%>>Tipo de sesi�n</option>
                        <option value="14" <%= numQuery==14?"selected":""%>>No. de Acuerdo</option>
                        <option value="15" <%= numQuery==15?"selected":""%>>Estatus</option>
                      </select> &nbsp;&nbsp; 
                      <%switch (numQuery)
						  								{
														case 11:// todas las Sesiones
																%>
                      <input name="txtCondicion" type="hidden" value=""> 
                      <%	
																	break;
																	
														case 12:
														%>
                      <input type="button" id="cboCalendario" name="cboCalendario"  style=" WIDTH: 60px" value="<%=txtCondicion.equals("")?fecha:txtCondicion%>" onChange="calendario.txtCondicion.value=calendario.cboCalendario.value;"><input type="button" id="lanzaCalendario" name="lanzaCalendario"  style=" WIDTH: 15px"  class="botonCbo" value="v">                       
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
													case 13:
													%>
                      <select name="txtCondicion" >
                        <option value="O" <%=txtCondicion.equals("O")?"selected":""%>>ORDINARIA</option>
                        <option value="E" <%=txtCondicion.equals("E")?"selected":""%>>EXTRAORDINARIA</option>
                      </select> 
                      <%
																	break;
													case 14:
													%>
                      <input name="txtCondicion" type="text"  size="40"  value="<%=txtCondicion%>">	
                      <%
																	break;
													case 15:
													%>
                      <select name="txtCondicion"  <%//=opcion==3 || (opcion==1 && bCambio==true)  || (session.getAttribute("bRegistro")!=null && session.getAttribute("bRegistro").equals("1") )?"DISABLED":""%>>
                        <option value="EN PROCESO" <%=txtCondicion.equals("EN PROCESO")?"selected":""%>>EN 
                        PROCESO</option>
                        <option value="CUMPLIDO" <%=txtCondicion.equals("CUMPLIDO")?"selected":""%>>CUMPLIDO</option>
                        <option value="AUTORIZADO"  <%=txtCondicion.equals("AUTORIZADO")?"selected":""%>>AUTORIZADO</option>
                       
                      </select> 
                      <%
																	break;
																	
															default:
															%>
                      <input type="hidden" id="txtCondicion" name="txtCondicion"  style=" WIDTH: 60px" value=""> 
                      <%
																	break;
																	
													}//fin switch(numQuery)						
													%>
                    </td>
                    <td width="11%"  align="right"> <input name="btBuscar" type="button" onClick="document.calendario.submit();" value="Buscar" class="boton"> 
                      <input name="Buscar" id="Buscar" type="hidden"  value="1" ></td>
                  </tr>
                  <tr> 
                    <td colspan="2"   class="texto">&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="3"> 
                      <%
						  							//muestra tabla con los registros segun el criterio de busqueda 2(todo),4(clave),5(nomina),6(nombre)
							acuerdo.setVtrIntDato1(numFiso);
							acuerdo.setVtrStrDato2(txtCondicion);
							if(buscar==1)
							acuerdo.querySelect(numQuery);
						
						  %>
                      <table width="100%" >
                        <tr class="celda01" bgcolor="#999966"> 
                          <td  align="center">Acuerdo</td>
                          <td  align="center">Fecha</td>
                          <td  align="center">Descripci&oacute;n</td>
                          <td   align="center">Monto Autorizado</td>
                          <td  align="center">Estatus</td>
                        </tr>
                        <%
							  

							if ( !acuerdo.hasData () && buscar==1)
								  {%>
                        <tr  class="subtitulo"> 
                          <td align="center" colspan="5">No existen Acuerdos, 
                            con los criterios de busqueda seleccionados </td>
                        </tr>
                        <%}%>
                        <%			  																
						
						for(int r=0; r < acuerdo.getSize(); r++)
							 {
							 acuerdo.setIndex (r );%>
                        <tr  class="celda02"> 
                          <td align="center"><%=acuerdo.getVtrStrDato4()%> </td>
                          <td align="center"><%=acuerdo.getVtrStrDato2()%> </td>
                          <td align="center"><%=acuerdo.getVtrStrDato5()%> </td>
                          <td  align="right"><%=dec.format(acuerdo.getVtrDoubleDato6())%> 
                          </td>
                          <td align="center"><%=acuerdo.getVtrStrDato11()%> </td>
                        </tr>
                        <%}%>
                      </table></td>
                  </tr>
                  <tr>
                    <td colspan="3">&nbsp;</td>
                  </tr>
                  <tr>
                    <td colspan="3" align="center"><input name="Ver" type="button" onClick="javascript:ver('<%=numQuery%>','<%=txtCondicion%>');" value="      Ver     " class="boton"  <%= !acuerdo.hasData () ?"DISABLED":""%>>
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="Imprimir" type="button" onClick="javascript:imprimir('<%=numQuery%>','<%=txtCondicion%>');" value=" Imprimir " class="boton"  <%= !acuerdo.hasData () ?"DISABLED":""%>></td>
                  </tr>
                </table></td>
            </tr>
          </table>
          <p>&nbsp;</p><table border=0 cellpadding=0 cellspacing=1  align="center">
            <tr align=middle valign=center> 
              <td height=30 align="center"> <a href="#top"><img border=0 height=11 src="imagenes/arriba.gif" width=59></a> 
              </td>
            </tr>
            <tr align=middle> 
              <td  height=7><img  height=1 src="imagenes/cnaranja01.gif" width=470></td>
            </tr>
          </table>
          <p>&nbsp;</p>
        </FORM></TD>
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