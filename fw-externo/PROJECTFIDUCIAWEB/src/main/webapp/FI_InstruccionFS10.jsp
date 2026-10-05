<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*,java.lang.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.nInstrucciones"/>
<%@ include file="sesionInst4.jsp" %>

<% 
	 NumberFormat nfFormato;
	nfFormato = NumberFormat.getCurrencyInstance(Locale.US);
	DecimalFormat num = new DecimalFormat("############0.00");
	String sValida=null;
	String sContarto = null;
	String sTabla = null;
	String sImpContrato=null;
	
	// Variables para recuperar los importes a pagar
	String  sPeriodo, sImporte, sIva, sTotal = null;  
	double dImporte, dIva, dTotal = 0.0;
	
	String[][] sData = BD.getCRen((String)session.getAttribute("NumFid")) ;
	sContarto = BD.getContRendimientos((String)session.getAttribute("NumFid"));
	sTabla =  BD.DataRadio((String)session.getAttribute("NumFid"));
	sImpContrato = BD.getRendimiento((String)session.getAttribute("NumFid")) ;	
	
	// Importe adeudado sin iva
	String[] sDatos = BD.getHeader((String)session.getAttribute("NumFid"));
	if(sDatos != null)
	  {
		sPeriodo  	= sDatos[0];
		sImporte 	= sDatos[1];
		sIva		= sDatos[2];
		sTotal	 	= sDatos[3];
		sValida 	= sDatos[3];
		
		dImporte 	= Double.parseDouble(sImporte);
		dIva		= Double.parseDouble(sIva);
		dTotal 		= Double.parseDouble(sTotal);
		
		sImporte 	= nfFormato.format(dImporte);
		sIva 		= nfFormato.format(dIva);
		sTotal 		= nfFormato.format(dTotal);    
	  }
	  else
	  {
		sValida 	= null;
		sPeriodo  	= "0";
		sImporte 	= "0";
		sIva		= "0";
		sTotal	 	= "0";
	  }	
 %>

<HTML>
<HEAD><TITLE>Pago de Honorarios - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" SRC='scripts/general.js'>
</script>
<script language="JavaScript" type="text/JavaScript">
var existeToken="<%=(String)session.getAttribute("token")%>";
function Valida( iOpt, sImp) 
{   
	if(iOpt ==0) // Valida el importe a retirar
	{
	   if( isNaN((sImp) ))
		{
			alert("El importe debe de ser num�rico");
			document.HonFoseg.txtImporte.focus();
			return;
	   	}	   	
	
	   if(parseInt(sImp) == 0 || sImp == "" )
		{
			alert("Debe ingresar el importe a retirar");
			document.HonFoseg.txtImporte.focus();
			return;
	   	}	   
		else
		{
			var dImp, dTotal, dFon;				
			dImp 	= document.HonFoseg.txtImporte.value;
			dTotal 	= document.HonFoseg.txtParcial.value;
			dFon	= document.HonFoseg.txtFondos.value;
			
			if(parseFloat(dImp) > parseFloat(dFon)) 
				{
					alert("La cantidad  indicada es mayor que el saldo de la estructura presupuestal");
					document.HonFoseg.txtImporte.focus();
					return;				
				} 
							
			if(parseFloat(dImp) > parseFloat(dTotal)) 
				{
					alert("La cantidad  indicada es mayor al saldo de los honorarios del periodo");
					document.HonFoseg.txtImporte.focus();
					return;				
				} 
			
			if(parseFloat(dImp) > parseFloat(sImp)) 
				{
					alert("El importe a pagar es mayor que  el saldo de la estructura presupuestal");
					document.HonFoseg.txtImporte.focus();
					return;
				} 
			//valida si el usuario usa token
			//1=si
			//0=no
			if(existeToken==1)
				{
				mostrarToken(); 
				return;
				}
																																  
			document.HonFoseg.action="confirmarInst_FS10.jsp";
			document.HonFoseg.submit();   
		}
	}
	
	if(iOpt ==1) // Valida que existan fondos en el a�o seleccionado
	{
		if(parseInt(sImp) ==0)
			{			  	
				alert("No existen fondo para el a�o seleccionado");
				document.HonFoseg.Aceptar.disabled=true;
				return 0;
			}	  
		else
			{
				document.HonFoseg.Aceptar.disabled= false;
				document.HonFoseg.txtFondos.value =sImp;
				return 0;
			}
		} 

	}

function aceptarToken() 
	{
	if(document.HonFoseg.txtToken.value=="")
		{
		alert('Es necesario que digite su LLAVE');
		document.HonFoseg.txtToken.focus();
		return;
		}	
   if((document.HonFoseg.txtToken.value).length<6)
		{
		alert('La longitud de la LLAVE es invalida');
		document.HonFoseg.txtToken.value="";
		document.HonFoseg.txtToken.focus();
		return;
		}	
	if(isNaN(document.HonFoseg.txtToken.value))
		{
		alert('La LLAVE es un dato numerico');
		document.HonFoseg.txtToken.value="";
		document.HonFoseg.txtToken.focus();
		return;
		}		
	document.HonFoseg.action="confirmarInst_FS10.jsp";
	document.HonFoseg.submit();
	}	
	
function mostrarToken() 
{
datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.HonFoseg.txtToken.focus();
}

function ocultarToken() 
{
document.HonFoseg.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

}

function cancelar() 
 {
	  parent.location="FI_Instrucciones.jsp";
 }
</script>


<script language="JavaScript" type="text/JavaScript">
<!--
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
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')" >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366"><IMG 
            src="imagenes/logo.jpg" 
            alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="176"></TD>
      <TD vAlign="top" background="imagenes/msur01.png"
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
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        <table width="600" border="0">
          <tr> 
            <td width="625" class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="36" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Pago 
              de Honorarios</td>
          </tr>
          <% 
		  		if(sValida == null)
				{
		   %>
          <tr> 
            <td class="alerta" align="center">&nbsp;</td>
          </tr>
          <tr> 
            <td class="alerta" align="center"> No existen Honorarios Fiduciarios 
              Pendientes de Pago </td>
          </tr>
          <% 
				}
		  else
			{
		 %>
          <tr>
            <td   align="center" class="subtitulo">&nbsp;</td>
          </tr>
          <tr> 
            <td   align="center" class="subtitulo">ADEUDO DE MAYOR ANTIG�EDAD</td>
          </tr>
          <% 
			  	}
		   %>
          <tr> 
            <td height="474"  align="center" valign="top"> <form name="HonFoseg"  method="post" action="">
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
                <table width="92%" id="datos">
                  <% 
					if(sValida != null)
					{
		  		 %>
                  <tr> 
                    <td height="20"   align="left" class="textoNegrita">&nbsp;</td>
                    <td height="20"    align="left"  colspan="2"   class="subtitulo">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="20"   align="left" class="textoNegrita"width="172">CONCEPTO:</td>
                    <td height="20"    align="left"  colspan="2"   class="texto">HONORARIOS 
                      POR ADMINISTRACION</td>
                  </tr>
                  <tr> 
                    <td height="20"   align="left" class="textoNegrita" >PERIODO:</td>
                    <td height="20"    align="left" colspan="2"  class="texto"> 
                      <%= sPeriodo %>&nbsp;&nbsp; <input type="hidden" name="txtPeriodo" value = "<%= sPeriodo %>"> 
                      &nbsp; <input type="hidden" name="txtFondos"> 
					  		<input type="hidden" name="txtConRen" value = " <%= sImpContrato %>"> </td>
                  </tr>
                  <h1> 
                    <tr> </h1>
                  <td height="20"  align="left" class="textoNegrita" >IMPORTE:</td>
                  <td height="20"  align="left" colspan="2"   class="texto"> <%= sImporte %> 
                  </td>
                  </tr>
                  <tr> 
                    <td height="20"  align="left" class="textoNegrita" >IVA:</td>
                    <td height="20"  align="left" colspan="2"  class="texto" > 
                      <%= sIva %> </td>
                  </tr>
                  <tr> 
                    <td height="20"  align="left" class="textoNegrita" >IMPORTE 
                      TOTAL:</td>
                    <td  height="20"  align="left"   class="texto"  colspan="2"> 
                      <%= sTotal %> &nbsp;&nbsp; <input type="hidden" name="txtParcial"   value= "<%= num.format(dTotal) %>" > 
                    </td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="3">&nbsp;</td>
                  </tr>
                  <% 
				  	 }
				   %>
                  <tr> 
                    <td height="21" colspan="3"  class="subtitulo" align="center" >DETALLE 
                      DEL PAGO</td>
                  </tr>
                  <tr> 
                    <td height="50" colspan="3"> 
                      <% 
							if(sValida != null)
							{
						%>
                      <table width="100%" border="0" cellspacing="2" cellpadding="1">
                        <tr> 
                          <td   class="subtitulo" >&nbsp;</td>
                          <td  class="texto">&nbsp;</td>
                        </tr>
                        <tr> 
                          <td   class="subtitulo" >Descontar del Contrato de Rendimientos:</td>
                          <td  class="texto">&nbsp;</td>
                        </tr>
                        <tr   class="texto" > 
                          <td colspan="2" align="right"   class="texto">&nbsp;</td>
                        </tr>
                        <tr> 
                          <td   class="textoNegrita" align="right">No. Contrato 
                            de Inversion: </td>
                          <td  class="texto"> <%=BD.getNumContrato((String)session.getAttribute("NumFid"),"RENDIMIENTOS")%></td>
                        </tr>
                        <tr> 
                          <td width="246"   class="textoNegrita" align="right">Saldo 
                            Disponible:</td>
                          <td width="282"  class="texto"> 
                            <% out.println(sImpContrato); %>
                            <input type="hidden" name="txtConRen2" value = " <%= sImpContrato %>"> 
                          </td>
                        </tr>
                        <tr class="texto"> 
                          <td  colspan="2" >&nbsp;</td>
                        </tr>
                      </table>
                      <table width="100%" border="0" cellspacing="2" cellpadding="1">
                        <% 
		  		if(sTabla != null)
				{
		   %>
                        <tr  class="subtitulo" > 
                          <td>Ejercicio Presupuestal:</td>
                        </tr>
                        <tr> 
                          <td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= sTabla %> 
                          </td>
                        </tr>
                        <% 
			}
			else
			{
			%>
                        <tr> 
                          <td class="alerta" align="center"> No existen recursos 
                            para la estructura presupuesta: 14- 2- 1- 1 </td>
                        </tr>
                        <%
				 }
			%>
                        <tr> 
                          <td class="texto">&nbsp;</td>
                        </tr>
                      </table>
                      <%
		}  
	%>
                      <table width="100%" border="0" cellspacing="2" cellpadding="1">
                        <tr> 
                          <td  colspan="2" class="texto" ><input type="hidden" name="txtContrato" value="<%=sContarto%>" > 
                          </td>
                        </tr>
                        <% 
						if(sValida != null)
						{
					 %>
                        <%
								if(sData!=null)
								{ 
							%>
                        <tr> 
                          <td width="126"  class="subtitulo"  >Movimientos del 
                            d&iacute;a:</td>
                          <td   class="texto">&nbsp;</td>
                        </tr>
                        <tr    class="texto"> 
                          <td colspan="2" >&nbsp;</td>
                        </tr>
                        <%
									for(int i=0;i<sData.length;i++)
									{
								%>
                        <tr> 
                          <td  class="texto"  align="right"><%=sData[i][0] %></td>
                          <td   class="texto">&nbsp;&nbsp;&nbsp;&nbsp;<%=sData[i][1] %></td>
                        </tr>
                        <%
									}
									%>
                        <tr    class="texto"> 
                          <td colspan="2" >&nbsp;</td>
                        </tr>
                        <%
								}
							
							/*%>
                        <tr> 
                          <td height="22" class="subtitulo"  > Disponible:</td>
                          <td width="402"    class="subtitulo"><input type="hidden" name="txtConRen" value = " <%= sImpContrato %>"> 
                          </td>
                        </tr>
                        <%
						 
						}
					%>*/
                      </table></tr>
                  <% 
						if(sValida != null)
						{
					%>
                  <tr> 
                    <td height="22" class="textoNegrita" align="right">Acuerdo 
                      del Comite T&eacute;cnico o Carta de Instrucci&oacute;n:</td>
                    <td width="362"   class="texto">&nbsp;&nbsp; DE CONFORMIDAD 
                      ACUERDO TECNICO </td>
                  </tr>
                  <tr> 
                    <td height="22" class="textoNegrita" align="right">Importe 
                      total a retirar:</td>
                    <td width="362"    class="input"><input name="txtImporte" type="text" size="40"   value="<%=request.getParameter("txtImporte")!=null?request.getParameter("txtImporte"):""%>"  onKeyUp="validaNum(this.form.txtImporte);"   onBlur="formatImporte(this.form.txtImporte)"> </td>
                  </tr>
                  <tr> 
                    <td height="25"  colspan="2" class="texto">&nbsp; </td>
                  </tr>
                  <tr> 
                    <td  height="22" colspan="2"  align="center"> <input name="Aceptar" type="button"  disabled="true" value="Aceptar" onClick="javascript:Valida(0,document.HonFoseg.txtImporte.value)"  class="boton"> 
                      &nbsp; <input name="Cancelar" type="button" value="Cancelar" onClick="javascript:cancelar()" class="boton"> 
                    </td>
                  </tr>
                  <% 
						}				  
				   %>
                  <tr> 
                    <td  colspan="2" class="texto"> </TD>
                  </tr>
                </table>
                <table border=0 cellpadding=0 cellspacing=1 >
                  <tbody>
                    <tr> 
                      <td align="middle" class="ref" >|<a  href="FI_Legales.jsp" class="ref">ASPECTOS 
                        LEGALES</a>|</td>
                    </tr>
                  </tbody>
                </table>
              </form></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>

</BODY></HTML>