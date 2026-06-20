<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.DecimalFormat, java.text.NumberFormat,java.util.Locale"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="parametrosToken.jsp" %>
<%@ include file="sesionInstrucc.jsp"%>
<HTML>
<%
/****************************AUTENTICACION CON TOKEN******************************/
if(((String)session.getAttribute("token")).equals("1"))
    {%>
    <%@ include file="autenticaToken.jsp" %>
    <%
     }
/*********************************************************************************/

   String titulo="";
   DecimalFormat dfFormat = new DecimalFormat("###,##0.00");
   String mensaje="";
   String sFolio=BD.getFolioFOSEG();
   double dImpFed=0, dImpEst=0, dImpRen=0;
   double dImpFedT=0, dImpEstT=0, dImpRenT=0, dImpTotal=0;


   if(request.getParameter("txtImporte1")!=null)
      if(request.getParameter("txtImporte1").length()>0)
         dImpFed = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte1")).doubleValue();
   if(request.getParameter("txtImporte2")!=null)
      if(request.getParameter("txtImporte2").length()>0)
         dImpEst = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte2")).doubleValue();
   if(request.getParameter("txtImporte3")!=null)
      if(request.getParameter("txtImporte3").length()>0)
         dImpRen = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte3")).doubleValue();

   if(request.getParameter("txtImpFed")!=null)
      dImpFedT = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImpFed")).doubleValue();
   if(request.getParameter("txtImpEst")!=null)
      dImpEstT = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImpEst")).doubleValue();
   if(request.getParameter("txtImpRen")!=null)
      dImpRenT =NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImpRen")).doubleValue();
   dImpTotal=dImpFed + dImpEst + dImpRen;


    if (request.getParameter("txtTipoC").equals("C"))
			{
			titulo="Confirmar Registro de Compromiso";
			}
	else
            {
			titulo="Confirmar Cancelaci�n de Compromiso";
            }
   
   
   
   if (request.getParameter("txtTipoC").equals("C"))
   {
      mensaje="\"INSTRUCCION DE COMPROMISO\\n";
   }
   else
   {
      mensaje="\"INSTRUCCION DE CANCELACI�N DE COMPROMISO\\n";
   }

   //mensaje a firmar digitalmente
   mensaje+="\\nFolio de Operaci�n: "+ sFolio;
   mensaje+="\\nFideicomiso: "+ session.getAttribute( "Fideicomiso" );
   mensaje+="\\nEjejercicio: "+ request.getParameter("cboEjercicio");
   mensaje+="\\nEje: "+ request.getParameter("cboEje");
   mensaje+="\\nPrograma: "+ request.getParameter("cboPrograma");
   mensaje+="\\nProyecto: "+ request.getParameter("cboProyecto");
   mensaje+="\\nAccion: "+ request.getParameter("cboAccion");
   mensaje+="\\nImporte de recursos Federales: "+ dfFormat.format(dImpFed);
   mensaje+="\\nImporte de recursos Estatales: "+ dfFormat.format(dImpEst);
   mensaje+="\\nImporte de recursos Rendimientos: "+ dfFormat.format(dImpRen);
   mensaje+="\\nImporte Total: "+ dfFormat.format(dImpTotal);
   mensaje+="\";";

%>

 <HEAD><TITLE><%=titulo%></TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
 <%@ include file="objetosPKI.jsp" %>
<script language="JavaScript" SRC='scripts/navegador.js'></script>
<script language="JavaScript" type="text/JavaScript">
<!--
function cancelar()
		{
		parent.location='FI_Instrucciones.jsp'
		}
function confirmar()
{
   <%
   if(sCaptura.equals("NO"))
   {
   %>
      Sign();
   <%
   }
   else
   {
   %>
      document.Compromiso.action='instruccionFS6.jsp';
      document.Compromiso.submit();
   <%
   }
   %>
}

function Sign()
{
if(bName == "Microsoft Internet Explorer")
   {
	
      var ToSignText;
      var pkcs7_="";
      var estatus;
      ToSignText=<%=mensaje%>
      SeguriSIGN.Who=document.domain;
      pkcs7_=SeguriSIGN.Firma(ToSignText);
      if(SeguriSIGN.status == 2000)	
      {
         document.Compromiso.Pkcs7.value=pkcs7_;
         document.Compromiso.SignedText.value="NONE";
         if(SeguriSIGN.File!="")
            alert("El archivo seleccionado fue:"+SeguriSIGN.File);
      }
      else
      {
         if(SeguriSIGN.status != 0)
            alert("Error del proceso de la Firma:"+SeguriSIGN.status);
         else if(SeguriSIGN.status == 0)
           alert("Para poder realizar la Instrucci�n de Compromiso\n Es necesaria su Firma Digital ");
      }			
      if(SeguriSIGN.status == 2000)
      {
         document.Compromiso.action='instruccionFS6.jsp';
         document.Compromiso.submit();	
      }

   }
   else
   { 
   	if (bName == "Netscape") 
      {

         var ToSignText;
         var pkcs7_="";
         ToSignText=<%=mensaje%>
         pkcs7_=crypto.signText(ToSignText,"ask");
         if(pkcs7_!="error:UserCancel" && pkcs7_!="error:internalError" && pkcs7_!="error:noMatchingCert")
         {
            document.Compromiso.Pkcs7.value=pkcs7_;
            document.Compromiso.SignedText.value=escape(ToSignText);
            document.Compromiso.action="Compromiso.jsp";
            document.Compromiso.submit();	
         }
         else
            if(pkcs7_=="error:internalError")
               alert("Verifique que la AC que emitio el certificado este instalada o habilitada");
         else
         {
            if(pkcs7_=="error:userCancel")
               alert("El proceso de firma fue cancelado por el usuario");
            else
               if(pkcs7_=="error:noMatchingCert")
                  alert("Es posible que la base de datos de certificados no este inicializada o este vacia");	
         }

      }
   }

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

function MM_swapImage() { 
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script></HEAD>
<BODY vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" > 
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
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=sysFecha%></TD>
      <TD background="imagenes/fondoMenu.gif"><a href="FI_Consultas.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','imagenes/consultas2.gif',1)"><img src="imagenes/consultas1.gif" name="Image10" width="104" height="17" border="0"></a><a href="FI_Instrucciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Instrucciones','','imagenes/instrucciones2.gif',1)"><img src="imagenes/instrucciones2.gif" name="Instrucciones"  border="0"></a><a href="FI_EdosF.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Reportes1','','imagenes/reportes2.gif',1)"><img src="imagenes/reportes1.gif" name="Reportes1"  border="0" id="Reportes1"></a><a href="FI_Opciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Opciones1','','imagenes/Opciones2.gif',1)"><img src="imagenes/Opciones1.gif" name="Opciones1"  border="0" id="Opciones1"></a><a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir1','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir1"  border="0" id="Salir1"></a></TD>
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Confirmar 
              <%=request.getParameter("txtTipoC").equals("C")?"Compromiso":"Cancelaci�n de Compromiso"%></td>
          </tr>

          <tr> 
            <td>&nbsp;</td>
          </tr>

          <tr> 
            <td class="alerta" align="center"> 
              <%
            if(dImpFedT<dImpFed && dImpFed>0)
		           {
                     if( request.getParameter("txtTipoC").equals("S"))
                        out.print("El saldo del Origen Federal  que esta comprometido, es menor al que se desea cancelar<br>No se puede realizar la Operaci�n");
                     else
                        out.print("El saldo del  Origen Federal es insuficiente<br>No se puede realizar la Operaci�n");
			   }
	 if(dImpEstT<dImpEst && dImpEst>0)
			  {
                     if( request.getParameter("txtTipoC").equals("S"))
                        out.print("El saldo del Origen Estatal que esta comprometido, es menor al que se desea cancelar<br>No se puede realizar la Operaci�n");
                     else
                        out.print("El saldo del  Origen Estatal es insuficiente<br>No se puede realizar la Operaci�n");
				   }
		 if(dImpRenT<dImpRen && dImpRen>0)
				   {
		
							 if( request.getParameter("txtTipoC").equals("S"))
								out.print("El saldo del Origen Rendimientos  que esta comprometido, es menor al que se desea cancelar<br>No se puede realizar la Operaci�n");
							 else
								out.print("El saldo del  Origen Rendimientos es insuficiente<br>No se puede realizar la Operaci�n");
		
		
				   }
				 %>
            </td>
          </tr>
          
          <tr> 
            <td  align="center"> <form name="Compromiso"  method="post" action="">
                <input type="hidden" name="txtFolio" value="<%=sFolio%>">
                <input type="hidden" name="Pkcs7">
                <input type="hidden" name="SignedText">
                <input type="hidden" name="txtTipoC" value="<%=request.getParameter("txtTipoC")%>">
                <input type="hidden" name="cboEjercicio" value="<%=request.getParameter("cboEjercicio")%>">
                <input type="hidden" name="cboEje" value="<%=request.getParameter("cboEje")%>">
                <input type="hidden" name="cboPrograma" value="<%=request.getParameter("cboPrograma")%>">
                <input type="hidden" name="cboProyecto" value="<%=request.getParameter("cboProyecto")%>">
                <input type="hidden" name="cboAccion" value="<%=request.getParameter("cboAccion")%>">
                <input type="hidden" name="txtImporte1" value="<%=request.getParameter("txtImporte1")!=null && !request.getParameter("txtImporte1").trim().equals("")?request.getParameter("txtImporte1"):"0"%>">
                <input type="hidden" name="txtImporte2" value="<%=request.getParameter("txtImporte2")!=null && !request.getParameter("txtImporte2").trim().equals("")?request.getParameter("txtImporte2"):"0"%>">
                <input type="hidden" name="txtImporte3" value="<%=request.getParameter("txtImporte3")!=null && !request.getParameter("txtImporte3").trim().equals("")?request.getParameter("txtImporte3"):"0"%>">
                <input type="hidden" name="txtAcuerdo" value="<%=request.getParameter("txtAcuerdo")%>">
                <%
	
                     if (request.getParameter("txtTipoC").equals("C"))
                     {
                  %>
                <input type="hidden" name="txtConcepto" value="<%=request.getParameter("txtConcepto")%>">
                <%
                     }
                  %>
                <table width="90%">
                  <tr  > 
                    <td colspan="2" class="celda01"  align="center" bgcolor="#999966">DETALLE DEL COMPROMISO</td>
                  </tr>
                  <tr  class="celda02"> 
                    <td width="28%" >Ejercicio:</td>
                    <td width="72%"> <%=request.getParameter("cboEjercicio")%> 
                    </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td colspan="2"  class="celda01">Registro Presupuestal:</td>
                  </tr>
                  <tr  class="celda02"> 
                    <td align="right">Eje:</td>
                    <td > <%=request.getParameter("cboEje")%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td align="right">Programa:</td>
                    <td > <%=request.getParameter("cboPrograma")%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td  align="right">Proyecto:</td>
                    <td > <%=request.getParameter("cboProyecto")%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td align="right">Acci�n:</td>
                    <td > <%=request.getParameter("cboAccion")%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td class="celda01" >Origen :</td>
                    <td class="celda01" >Importes:</td>
                  </tr>
                  <tr  class="celda02"> 
                    <td  align="right">Federal:</td>
                    <td >$ <%=dfFormat.format(dImpFed)%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td  align="right"> Estatal:</td>
                    <td >$ <%=dfFormat.format(dImpEst)%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td  align="right">Rendimientos:</td>
                    <td >$ <%=dfFormat.format(dImpRen)%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td  align="right" class="celda01">Importe Total:</td>
                    <td >$ <%=dfFormat.format(dImpFed + dImpEst + dImpRen)%> </td>
                  </tr>
                  <%
                        if (request.getParameter("txtAcuerdo")!=null && !request.getParameter("txtAcuerdo").equals(""))
                        {
                     %>
                  <tr  class="celda02"> 
                    <td >Acuerdo de Comite o Carta de Instrucci&oacuten:</td>
                    <td > <%=request.getParameter("txtAcuerdo")%> </td>
                  </tr>
                  <%
                        }
                        if (request.getParameter("txtTipoC").equals("C") && request.getParameter("txtConcepto")!=null && !request.getParameter("txtConcepto").equals(""))
                        {
                     %>
                  <tr  class="celda02"> 
                    <td >Concepto:</td>
                    <td > <%=request.getParameter("txtConcepto")%> </td>
                  </tr>
                  <%
                        }
                     %>
                </table>
              </form></td>
          </tr>
          <tr> 
            <td>&nbsp; </td>
          </tr>
          <%
            if ( dImpFedT>=dImpFed && dImpEstT>=dImpEst && dImpRenT>=dImpRen)
            {
         %>
          <tr> 
            <td align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:history.back()"><u>Modificar 
              Instrucci&oacute;n</u></a></td>
          </tr>
          <tr> 
            <td >&nbsp;</td>
          </tr>
          <%
            }
         %>
          <tr> 
            <td align="center"> 
              <%
                  if ( (dImpFedT>=dImpFed || (dImpFedT<=0 && dImpFed==0) ) && (dImpEstT>=dImpEst || (dImpEstT<=0 && dImpEst==0)) && (dImpRenT>=dImpRen || dImpRenT<=0 && dImpRen==0))
                  {
               %>
              <a href="javascript:confirmar()";a> 
              <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:confirmar()" class="boton">
              </a> 
              <%
                  }
                  else
                  {
               %>
               <input type="button" name="Modificar" value="Modificar" onClick="javascript:history.back()" class="boton"></a> 
              <%
                  }
               %>
              &nbsp; 
              <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()" class="boton"> 
            </td>
          </tr>
        </table> </TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY>
</HTML>
