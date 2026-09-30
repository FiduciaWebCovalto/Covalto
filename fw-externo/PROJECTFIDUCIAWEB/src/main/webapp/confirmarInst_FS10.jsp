<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="HN"  class="mx.com.inscitech.clients.negocio.nInstrucciones"/>
<%@ include file="sesionInst4.jsp" %>
<%@ include file="parametrosToken.jsp" %>

<%  
/****************************AUTENTICACION CON TOKEN******************************/
if(((String)session.getAttribute("token")).equals("1"))
    {%>
    <%@ include file="autenticaToken.jsp" %>
    <%
     }
/*********************************************************************************/	
	NumberFormat nfFormato;
	nfFormato = NumberFormat.getCurrencyInstance(Locale.US);
	String titulo="Confirmar Pago de Honorarios";
	String sFolio="";
	String mensajePKI="";
	String sCto= null;
	String sImporte = null; // Variable para conocer el saldo del a�o
	double SaldoCO, dImpCon;

	String sAnio  = request.getParameter("optAnio");
	sImporte = request.getParameter(sAnio);	
	dImpCon = Double.parseDouble(sImporte);	 
	String sImp=nfFormato.format(dImpCon);

	titulo="Pago de Honorarios";		
	sFolio=BD.getFolio(2);
	SaldoCO=0;
	sCto=HN.getContRendimientos((String)session.getAttribute("NumFid"));
	SaldoCO=BD.getSaldoActual((String)session.getAttribute("NumFid"),sCto);
	
	
	
	String sParcial = request.getParameter("txtImporte");
	String sEstado;			
	double dImpPar = Double.parseDouble(sParcial);
	sParcial = nfFormato.format(dImpPar);
	  
	String sTotal = request.getParameter("txtParcial");
	double dTotal = Double.parseDouble(sTotal);
	sTotal = nfFormato.format(dTotal);
	
  // Valida si es un pago parcial o total  
	if( sParcial.equals(sTotal))
		sEstado = "TOTAL";
	else
		sEstado = "PARCIAL";
	
	//mensaje a firmar digitalmente	
	mensajePKI	 = "\"INSTRUCCION DE PAGO DE HONORARIOS\\n\\n";
	mensajePKI	 += "Folio de Operaci�n: "+sFolio;
	mensajePKI	 += "\\n\\nConcepto: HONORARIOS POR ADMINISTRACION DEL PERIODO  "+request.getParameter("txtPeriodo")+","+ sEstado;
	mensajePKI += "\\nImporte con IVA: $"+request.getParameter("txtImporte");
	mensajePKI += "\";";
%>

<HTML>
<HEAD><TITLE>Instrucciones - Confirmar Pago de Honorarios </TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
 <%@ include file="objetosPKI.jsp" %>
<script language="JavaScript" SRC='scripts/navegador.js'></script>
<script language="JavaScript" type="text/JavaScript">
function cancelar()
	{
	  parent.location="FI_Instrucciones.jsp";
	}

function Sign()
{
// script para Microsoft Internet Explorer		
if(bName == "Microsoft Internet Explorer")
{
			var ToSignText;
			var pkcs7_="";
			var estatus;
			ToSignText=<%=mensajePKI%>
			
			SeguriSIGN.Who=document.domain;
			pkcs7_=SeguriSIGN.Firma(ToSignText);
			if(SeguriSIGN.status == 2000)	
				{
				document.Pago.Pkcs7.value=pkcs7_;
				document.Pago.SignedText.value="NONE";
				if(SeguriSIGN.File!="")
					alert("El archivo seleccionado fue:"+SeguriSIGN.File);
				}
			else
				{
				if(SeguriSIGN.status != 0)
					alert("Error del proceso de la Firma: "+SeguriSIGN.status);
				else if(SeguriSIGN.status == 0)
					alert("Para poder realizar la Instrucci�n de Pago de Honorarios\n Es necesaria su Firma Digital ");
					
				}
			
			if(SeguriSIGN.status == 2000)
				{
				   document.Pago.action="instruccionFS10.jsp";
	         document.Pago.submit();	
				}
}
else

if (bName == "Netscape") 
		{
		var ToSignText;
		var pkcs7_="";
		ToSignText=<%=mensajePKI%>
		pkcs7_=crypto.signText(ToSignText,"ask");
		if(pkcs7_!="error:UserCancel" && pkcs7_!="error:internalError" && pkcs7_!="error:noMatchingCert")
			{
			document.Pago.Pkcs7.value=pkcs7_;
			document.Pago.SignedText.value=escape(ToSignText);
			document.Pago.action="instruccion4.jsp";
			document.Pago.submit();
			}
		else    {

			if(pkcs7_=="error:internalError")
				{
				alert("Verifique que la AC que emitio el certificado este instalada o habilitada");
				}
			else	{
				if(pkcs7_=="error:userCancel")
					alert("El proceso de firma fue cancelado por el usuario");
				else
					if(pkcs7_=="error:noMatchingCert")
						alert("Es posible que la base de datos de certificados no este inicializada o este vacia");	
				}
		        }


}
}

function MM_swapImage() { 
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}	
}
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
      <TD background="imagenes/fondoMenu.gif"><a href="FI_Consultas.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','imagenes/consultas2.gif',1)"><img src="imagenes/consultas1.gif" name="Image10" width="104" height="17" border="0"></a><a href="FI_Instrucciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Instrucciones','','imagenes/instrucciones2.gif',1)"><img src="imagenes/instrucciones2.gif" name="Instrucciones"  border="0"></a><a href="FI_EdosF.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Reportes1','','imagenes/reportes2.gif',1)"><img src="imagenes/reportes1.gif" name="Reportes1"  border="0" id="Reportes1"></a><a href="FI_Opciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Opciones1','','imagenes/Opciones2.gif',1)"><img src="imagenes/Opciones1.gif" name="Opciones1"  border="0" id="Opciones1"></a><a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir1','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir1"  border="0" id="Salir1"></a></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540" width="176">
        <%@ include file="menuInstrucciones.jsp" %>
      </TD>
      <TD valign="top" align="center"><table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
          <tr> 
            <td class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">
				<%=titulo%>
			</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"> <table width="80%"  border="0">
                <%

				 if(SaldoCO < (NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte")).doubleValue()))
						{						
						%>
						<script language="JavaScript" type="text/JavaScript">
							Out()	;						
						</script>
                <tr> 
                  <td class="alerta"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;EL 
                    SALDO DEL CONTRATO DE INVERSION ES INSUFICIENTE<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                    &nbsp;&nbsp;&nbsp;&nbsp;NO SE PUEDE REALIZAR EL PAGO DE HONORARIOS</td>
                </tr>
                <%}%>
                <tr> 
                  <td  align="center">
				   <form name="Pago"  method="post" action="">
                      <input type="hidden" name="Pkcs7">
                      <input type="hidden" name="SignedText">
                      <input type="hidden" name="txtFolio" value="<%=sFolio%>" >
                      <input type="hidden" name="txtImporte" value="<%=request.getParameter("txtImporte")%>">
                      <input type="hidden" name="txtAnio" value = " <%=request.getParameter("optAnio")%>">
                       <input type="hidden" name="txtPeriodo" value = " <%=request.getParameter("txtPeriodo")%>">
                       <input type="hidden" name="txtEstado" value = " <%=sEstado%>">
                      <table width="96%">
					   <td  colspan="3" align="center"  bgcolor="#999966" class="celda01"><b>DATOS
					         GENERALES</b></td>
                        </tr>
                        <tr  class="celda02"> 
                          <td width="172"   > En espera de autorizaci�n:</td>
                          <td colspan="2"  ><%= sCaptura %> </td>
						 						  
                        </tr>
                           <tr  class="celda02"> 
                          <td width="172"   > Ejercicio:</td>
                          <td  colspan="2"> <%=sAnio%></td>
						 
                        </tr>
						
					         <tr class="celda02"> 
								<td height="19"  class="celda01" >Registro Presupiestal</td>
								<td colspan="2">&nbsp;  </td>
					    </tr>
						
                        <tr  class="celda02"> 
                          <td align="right">Eje:</td>
                          <td  colspan="2">14.   Rendimientos Financieros</td>
                        </tr>         
						 <tr  class="celda02"> 
                          <td    align="right">Programa:</td>
                          <td  colspan="2">2.  Rendimeintos Aplicados</td>
                        </tr>   
						<tr  class="celda02"> 
                          <td    align="right">Proyecto:</td>
                          <td  colspan="2">1.  Aplicaciones Generales </td>
                        </tr>   
						<tr  class="celda02"> 
                          <td   align="right" >Acci&oacute;n:</td>
                          <td  colspan="2">1. Honorarios Fiducuiarios </td>
                        </tr>    
						<tr  class="celda02"> 
                          <td   align="right" >Comprometido:</td>
                          <td  colspan="2">NO</td>
                        </tr>     
						<tr class="celda02"> 
								<td  class="celda01" >Origen de los Recursos</td>
								<td width="119"  class="celda01" >Importe</td>
								<td width="138"  class="celda01" >Estructura Presupuestal</td>
					    </tr> 
						<tr class="celda02"> 
								<td   >Saldo Disponible Contrato de Rendimientos</td>
								<td width="119" ><%  out.println(request.getParameter("txtConRen")) ;%> </td>
								<td width="138"  ><%  out.println(sImp) ;%> 
								</td>
					    </tr>       
           
                        <tr  class="celda02"> 
                          <td class="celda01"> Importe Total del Pago:</td>
                          <td  colspan="2" > 
                            <%
							if(request.getParameter("txtImporte")!=null)
                		        	out.print(NumberFormat.getCurrencyInstance(Locale.US).format( NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte")).doubleValue() ));
						%>
                            (incluye IVA)</td>
                        </tr>
						
						<tr  class="celda02"> 
                          <td   >Acuerdo del Comite T&eacute;cnico o Carta de Instrucci&oacute;n:</td>
                          <td  colspan="2">DE CONFORMIDAD CONTRATO FISO</td>
                        </tr>   
						
						<tr class="celda02"> 
								<td   >Concepto:</td>
								<td  colspan="2" >HONORARIOS POR ADMINISTRACION DEL PERIODO  &nbsp;&nbsp;<% out.println(request.getParameter("txtPeriodo")); %>, <% out.println(sEstado); %> </td>
					    </tr>       
						
						<tr class="celda02"> 
								<td   >Froma de Liquidaci&oacute;n:</td>
								<td  colspan="2" >Descontar del Fondo</td>
					    </tr>            
                      </table>
					  
					  
					<table width="96%">
					   <td  colspan="3" align="center"  bgcolor="#999966" class="celda01"><b>DETALLE
				         LIQUIDACION</b></td>
                        </tr>
                        <tr  class="celda02"> 
                          <td width="172"   > Descontar del fondo</td>
                          <td width="261" colspan="2"  > Contrato  &nbsp;<% out.println(request.getParameter("txtContrato")); %>  &nbsp; de Rendimiento</td>						 						  
                        </tr>
					</TABLE>

					  
                    </form></td>
                </tr>
                <tr> 
                  <td height="20" align="center"> &nbsp &nbsp;&nbsp; </td>
                </tr>

                <tr> 
                  <td align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:history.back()"><u>Modificar 
                    Instrucci&oacute;n</u></a></td>
                </tr>
                <tr> 
                  <td >&nbsp;</td>
                </tr>
  
                <tr> 
                  <td height="30" align="center"> 
				  <% 
				    	 if(SaldoCO > (NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte")).doubleValue()))
						{						
					%>
          					<input type="button" name="Aceptar" value="Aceptar" onClick="javascript:Sign()"  class="boton" > 
						
					<%}%>				
						                  
                    &nbsp; <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()"  class="boton" > 
                  </td>
                </tr>
              </table></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
