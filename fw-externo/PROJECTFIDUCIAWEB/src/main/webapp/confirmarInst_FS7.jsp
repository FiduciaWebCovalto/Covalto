<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ include file="parametrosToken.jsp" %>
<%@ include file="sesionInstrucc.jsp" %>
<%
/****************************AUTENTICACION CON TOKEN******************************/
if(((String)session.getAttribute("token")).equals("1"))
    {%>
    <%@ include file="autenticaToken.jsp" %>
    <%
     }
/*********************************************************************************/

   String sFolio = BD.getFolioFOSEG();
   double sImporte = NumberFormat.getInstance(Locale.US).parse((request.getParameter("txtImporteR")!=null&&!(request.getParameter("txtImporteR")).trim().equals(""))?request.getParameter("txtImporteR"):"0").doubleValue(); 
   double saldoDO = NumberFormat.getInstance(Locale.US).parse((request.getParameter("saldoO")!=null&&!(request.getParameter("saldoO")).trim().equals(""))?request.getParameter("saldoO"):"0").doubleValue(); 
   double saldoDD = NumberFormat.getInstance(Locale.US).parse((request.getParameter("saldoD")!=null&&!(request.getParameter("saldoD")).trim().equals(""))?request.getParameter("saldoD"):"0").doubleValue(); 
   double saldoA=saldoDD+sImporte;
   //mensaje a firmar
   
   String mensaje="\"REPROGRAMACION DE PRESUPUESTO\\n\\n";
   
   mensaje+="Folio de Operaci�n: "+sFolio;
   mensaje+="\\nFideicomiso: "+session.getAttribute( "Fideicomiso" );
      mensaje+="\\nOrigen de los Recursos: "+ request.getParameter("cboOrigen");
      mensaje+="\\n\\n  Registro Presupuestal Origen";   
      mensaje+="\\n\\n\\tEjercicio: "+request.getParameter("cboEjercicio");        
      mensaje+="\\n\\tEje Origen: "+request.getParameter("cboEje");        
      mensaje+="\\n\\tPrograma: "+request.getParameter("cboPrograma");        
      mensaje+="\\n\\tProyecto: "+request.getParameter("cboProyecto");        
      mensaje+="\\n\\tAcci�n: "+request.getParameter("cboAccion");    
	   mensaje+="\\n\\tSaldo Disponible: "+NumberFormat.getCurrencyInstance(Locale.US).format(saldoDO);     
	 mensaje+="\\n\\nRegistro Presupuestal Destino"; 
      mensaje+="\\n\\n\\tEje Origen:  "+request.getParameter("cboEjeD");        
      mensaje+="\\n\\tPrograma:  "+request.getParameter("cboProgramaD");        
      mensaje+="\\n\\tProyecto:  "+request.getParameter("cboProyectoD");        
      mensaje+="\\n\\tAcci�n:  "+request.getParameter("cboAccionD"); 
	   mensaje+="\\n\\t Importe a Transferir: "+NumberFormat.getCurrencyInstance(Locale.US).format(saldoDD);           
      mensaje+="\\n\\tSaldo Actual: "+NumberFormat.getCurrencyInstance(Locale.US).format(sImporte);        
      mensaje+="\\n\\n\\nIntruccion firmada por : "+session.getAttribute( "NomUser" );
   mensaje+="\";"; 
%>   
<HTML>
<HEAD><TITLE>Confirmaci�n de Presupuestos - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_swapImage() { 
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script>
 <%@ include file="objetosPKI.jsp" %>
<script language="JavaScript" SRC='scripts/navegador.js'></script>
<script LANGUAJE="JavaScript">

function confirmar() 
{
   <%
   if(sCaptura.equals("NO"))
   {
   %>
      Sign()
   <%
   }
   else
   {
   %>
      document.APresupuesto.action='instruccionFS7.jsp';
      document.APresupuesto.submit();
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
         document.APresupuesto.Pkcs7.value=pkcs7_;
         document.APresupuesto.SignedText.value="NONE";
         if(SeguriSIGN.File!="")
            alert("El archivo seleccionado fue:"+SeguriSIGN.File);
         }
      else
         {
         if(SeguriSIGN.status != 0)
            alert("Error del proceso de la Firma:"+SeguriSIGN.status);
         else if(SeguriSIGN.status == 0)
            alert("Para poder realizar la Instrucci�n de Presupuesto\n Es necesaria su Firma Digital ");
            
         }


   if(SeguriSIGN.status == 2000)
      {

      document.APresupuesto.action='instruccionFS7.jsp';
	  document.APresupuesto.submit();

      }

   }
  else{ 
      	if (bName == "Netscape") 
   {
      var ToSignText;
      var pkcs7_="";
      ToSignText=<%=mensaje%>
      pkcs7_=crypto.signText(ToSignText,"ask");
      if(pkcs7_!="error:UserCancel" && pkcs7_!="error:internalError" && pkcs7_!="error:noMatchingCert")
         {
         document.APresupuesto.Pkcs7.value=pkcs7_;
         document.APresupuesto.SignedText.value=escape(ToSignText);
         document.APresupuesto.action='instruccionFS7.jsp';
         document.APresupuesto.submit();
   
         }
      else    {

         if(pkcs7_=="error:internalError")
            {
            alert("Verifique que la AC que emitio el certificado este instalada o habilitada");
            }
         else   {
            if(pkcs7_=="error:userCancel")
               alert("El proceso de firma fue cancelado por el usuario");
            else
               if(pkcs7_=="error:noMatchingCert")
                  alert("Es posible que la base de datos de certificados no este inicializada o este vacia");   
            }
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

//-->
</script></HEAD>
<BODY vLink="#052206" leftMargin="0"  topMargin="0" marginwidth="0" marginheight="0"> 
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
              Presupuesto</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td class="alerta" align="center">&nbsp; </td>
          </tr>
          <tr> 
            <td  align="center">
			<form name="APresupuesto"  method="post" action="">
  			    <input type="hidden" name="txtFolio" value="<%=sFolio%>">
                <input type="hidden" name="Pkcs7">
                <input type="hidden" name="SignedText">
                <input type="hidden" name="cboOrigen" value="<%=request.getParameter("cboOrigen")%>">
                <input type="hidden" name="cboEjercicio" value="<%=request.getParameter("cboEjercicio")%>">
                <input type="hidden" name="cboEje" value="<%=request.getParameter("cboEje")%>">
                <input type="hidden" name="cboPrograma" value="<%=request.getParameter("cboPrograma")%>">
                <input type="hidden" name="cboProyecto" value="<%=request.getParameter("cboProyecto")%>">
                <input type="hidden" name="cboAccion" value="<%=request.getParameter("cboAccion")%>">
                <input type="hidden" name="cboEjercicioD" value="<%=request.getParameter("cboEjercicioD")%>">
                <input type="hidden" name="cboEjeD" value="<%=request.getParameter("cboEjeD")%>">
                <input type="hidden" name="cboProgramaD" value="<%=request.getParameter("cboProgramaD")%>">
                <input type="hidden" name="cboProyectoD" value="<%=request.getParameter("cboProyectoD")%>">
                <input type="hidden" name="cboAccionD" value="<%=request.getParameter("cboAccionD")%>">
                <input type="hidden" name="saldoO" value="<%=saldoDO%>">
                <input type="hidden" name="saldoD" value="<%=saldoDD%>">
                <input type="hidden" name="txtImporteR" value="<%=sImporte%>">
                <input type="hidden" name="txtAcuerdo" value="<%=request.getParameter("txtAcuerdo")%>">
                <table width="90%"  >
                  <tr > 
                    <td colspan="2" align="center" class="celda01" bgcolor="#999966">DETALLE REPROGRAMACION PRESUPUESTAL</td>
                  </tr>
                  <tr class="celda02"> 
                    <td >En espera de Autorizaci�n: </td>
                    <td><%=sCaptura%></td>
                  </tr>
                  <tr   class="celda02" > 
                    <td width="29%"> Origen de los Recursos:</td>
                    <td width="71%"><%=request.getParameter("cboOrigen")%></td>
                  </tr>
                  <tr  bgcolor="#FFFFCC" class="celda02"> 
                    <td>Acuerdo del comite o Carta de Instrucci&oacute;n:</td>
                    <td ><%=request.getParameter("txtAcuerdo")%></td>
                  </tr>
                  <tr   class="celda02"> 
                    <td>Ejercicio:</td>
                    <td ><%=request.getParameter("cboEjercicio")%></td>
                  </tr>
                  <tr  bgcolor="#FFFFCC" class="celda02" > 
                    <td  colspan="2" class="celda01" >Registro Presupuestal 
                      Origen: </td>
                  </tr>
                  <tr   class="celda02" > 
                    <td align="right"> Eje: </td>
                    <td width="71%"><%=request.getParameter("cboEje")%></td>
                  </tr>
                  <tr  bgcolor="#FFFFCC" class="celda02"> 
                    <td   align="right">Programa :</td>
                    <td ><%=request.getParameter("cboPrograma")%></td>
                  </tr>
                  <tr   class="celda02"> 
                    <td  align="right"> Proyecto:</td>
                    <td ><%=request.getParameter("cboProyecto")%></td>
                  </tr>
                  <tr class="celda02"> 
                    <td   align="right">Acci&oacute;n: </td>
                    <td ><%=request.getParameter("cboAccion")%></td>
                  </tr>
                  <tr   class="celda02"> 
                    <td  align="right">Saldo disponible:</td>
                    <td><%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoDO)%></td>
                  </tr>
                  <tr  bgcolor="#FFFFCC" class="celda02" > 
                    <td colspan="2" class="celda01" >Registro Presupuestal Destino:</td>
                  </tr>
                  <tr    class="celda02"> 
                    <td  align="right">Eje:</td>
                    <td ><%=request.getParameter("cboEjeD")%></td>
                  </tr>
                  <tr  bgcolor="#FFFFCC" class="celda02"> 
                    <td  align="right" >Programa :</td>
                    <td><%=request.getParameter("cboProgramaD")%></td>
                  </tr>
                  <tr   class="celda02"> 
                    <td  align="right">Proyecto :</td>
                    <td><%=request.getParameter("cboProyectoD")%> </td>
                  </tr>
                  <tr  bgcolor="#FFFFCC" class="celda02"> 
                    <td  align="right">Acci&oacute;n :</td>
                    <td><%=request.getParameter("cboAccionD")%></td>
                  </tr>
                  <tr    class="celda02"> 
                    <td  align="right">Saldo disponible :</td>
                    <td><%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoDD)%></td>
                  </tr>
                  <tr  bgcolor="#FFFFCC" class="celda02"> 
                    <td >Importe a Transferir:</td>
                    <td><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporte)%></td>
                  </tr>
                  <tr   class="celda02"> 
                    <td >Saldo Actual:</td>
                    <td><%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoA)%></td>
                  </tr>
                </table>
              </form></td>
          </tr>
          <tr> 
            <td>&nbsp; </td>
          </tr>
          
          <tr> 
            <td align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:history.back()"><u>Modificar 
              Instrucci&oacute;n</u></a></td>
          </tr>
          <tr> 
            <td >&nbsp;</td>
          </tr>
          <tr> 
            <td align="center"> &nbsp; 
              <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:confirmar()" class="boton">&nbsp;<input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()" class="boton"></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
