<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="NF"  class="mx.com.inscitech.clients.negocio.nFiducia"/>
<jsp:useBean id="CTA" class="mx.com.inscitech.clients.negocio.TransferenciaElectronica" />
<jsp:useBean id="det"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<%@ include file="sesionOpc2.jsp" %>
<%@ include file="parametrosToken.jsp" %>
<HTML>

<HEAD><TITLE>Opciones - Solicitud de Alta de Cuenta CLABE</TITLE>

<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<%
/****************************AUTENTICACION CON TOKEN******************************/
if(((String)session.getAttribute("token")).equals("1"))
    {%>
    <%@ include file="autenticaToken.jsp" %>
    <%
     }
/*********************************************************************************/
       String Folio="";
     String cveCuendep = "";
      String   mensaje  ="";
    boolean bPermiso=true;    
    int existeCta = CTA.existeCuenta(request.getParameter("txtCuenta"),(String)session.getAttribute( "NumFid" ));
    String scveBanco = (request.getParameter("cboBanco")!=null?request.getParameter("cboBanco").toString():"0-0");
    int cveBanco=Integer.valueOf( scveBanco.substring(0,scveBanco.indexOf("-")) ).intValue();
    String nombreBanco=null;      
    String moneda = (request.getParameter("cboMoneda")!=null?request.getParameter("cboMoneda").toString():null);
    

  if(existeCta==0 ) 
    {
    session.setAttribute("msgError","Error al registrar la Cuenta<br>Por Favor, intenta mas tarde");
    bPermiso=false;
      }
    
  if(existeCta==3 ) 
    {
    session.setAttribute("msgError","EL FIDEICOMISO YA TIENE SOLICITADA O ASIGNADA ESTA CUENTA");
    bPermiso=false;
    existeCta=0;
    } 
  
  if(cveBanco==0 ) 
    {
    session.setAttribute("msgError","La clave del banco en el que radica la cuenta es invalida, por favor verifica que el tu numero de cuenta sea valido.");
    bPermiso=false;
    existeCta=0;
    }
    nombreBanco=CTA.getBanco(cveBanco);                       
  if(nombreBanco==null ) 
    {
    session.setAttribute("msgError","El banco en el que radica la cuenta no se encuentra registrado, comunicate con tu ejecutivo y solicita el registro del banco");
    bPermiso=false;
    nombreBanco="DESCONOCIDO";
    existeCta=0;
    }
    
    if(existeCta == 1){
      cveCuendep = CTA.claveCuenta(request.getParameter("txtCuenta"));
      //cveCuendep = cveCuendep.equals("0")?BD.getFolio(502):cveCuendep;
      cveCuendep = cveCuendep.equals("0")?NF.getFolio(502):cveCuendep;
    }
    else
      cveCuendep = String.valueOf(request.getParameter("txtCuenta"));
    //det.getVtrDoubleDato2()

      if(existeCta >1 ) 
        {
        det.removerValores();
        det.setVtrStrDato1(cveCuendep);
        det.querySelect(64);
        }

    if (bPermiso)
      {


      //Folio=BD.getFolio(501);
      Folio=NF.getFolio(501);
       //mensaje a firmar digitalmente
     mensaje  = "\"ALTA CUENTA CLABE\\n"  
                  + "\\nFolio: "+Folio
                  + "\\nClave: "+cveCuendep
                  + "\\nFideicomiso: "+(String)session.getAttribute( "NumFid" )
                  + "\\nBanco en el que radica la Cuenta: "+(nombreBanco==null?"":nombreBanco)
                  + "\\nCuenta: "+((existeCta >1)?det.getVtrStrDato1() :request.getParameter("txtCuenta"))
                  + "\\nTitular: "+((existeCta >1)?det.getVtrStrDato4() :request.getParameter("txtTitular"))
                  + "\\nRFC: "+((existeCta >1)?det.getVtrStrDato5() :request.getParameter("txtRFC"))
                  + "\\n"+ (sCaptura.equals("SI")?"Capturada por: ":"Solicitada por: ")+ session.getAttribute("NomUser")
                  + "\";";    
  
      }   
      
  %>
  <%                    
if(((String)session.getAttribute("token")).equals("1"))
    {%>
 <%@ include file="objetosPKI.jsp" %>
 <%}%>
<script language="JavaScript" src="scripts/navegador.js"></script>
<script language="JavaScript" type="text/JavaScript">

function cancelar()
    {
    parent.location='FI_Opciones_2.jsp'
    }
    


  function Sign()
  {
if(bName == "Microsoft Internet Explorer")
  {   
    document.cta.action="opciones_2.jsp";
    document.cta.submit();  
  }
  else{
    if (bName == "Netscape") 
    {
        document.cta.action="opciones_2.jsp";
        document.cta.submit();  
    }
  }
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
      document.cta.action="opciones_2.jsp";
      document.cta.submit();
   <%
   }
   %>
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

</script>
</HEAD>
<body  class="bg-light"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')" >
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
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=sysFecha%></TD>
      <TD background="imagenes/fondoMenu.gif"><a href="FI_Consultas.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','imagenes/consultas2.gif',1)"><img src="imagenes/consultas1.gif" name="Image10" width="104" height="17" border="0"></a><a href="FI_Instrucciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Instrucciones','','imagenes/instrucciones2.gif',1)"><img src="imagenes/instrucciones2.gif" name="Instrucciones"  border="0"></a><a href="FI_EdosF.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Reportes1','','imagenes/reportes2.gif',1)"><img src="imagenes/reportes1.gif" name="Reportes1"  border="0" id="Reportes1"></a><a href="FI_Opciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Opciones1','','imagenes/Opciones2.gif',1)"><img src="imagenes/Opciones1.gif" name="Opciones1"  border="0" id="Opciones1"></a><a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir1','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir1"  border="0" id="Salir1"></a></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540" width="176"> 
        <%@ include file="menuOpciones.jsp" %>
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
              Solicitud de Alta de Cuenta CLABE</td>
          </tr>
         
          <tr> 
            <td>&nbsp; </td>
          </tr>
          <tr> 
            <td  align="center" valign="top">
      

        <table border="0" width="99%">
  

           <tr> 
                  <td  class="alerta">
         <table width="90%" align="center">
          <tr> 
                        <td class="alerta" align="center"><%=session.getAttribute("msgError")!=null ?(String)session.getAttribute("msgError")+"<br>":""%></td>
                </tr>
                               <%
         session.setAttribute("msgError","");
          if(existeCta==2)
            {
          %>
                      <tr> 
                        <td class="alerta" align="center">AVISO IMPORTANTE</td>
                      </tr>
                      <tr>
                        <td class="alerta" align="justify">&nbsp;</td>
                      </tr>
                      <tr> 
                        <td class="alerta" align="justify">La cuenta se encuentra 
                          registrada con los siguientes datos y de esta forma 
                          se asignara al fideicomiso: </td>
                      </tr>
                    <%}%>
                    </table>
                    </td>
                </tr>
                <tr> 

  
                <tr> 
                  <td height="26" align="center"> 
          <form name="cta" method="post" action="">
              <input type="HIDDEN" name="Pkcs7">
                      <input type="HIDDEN" name="SignedText">
                      <input type="HIDDEN" name="txtFolio" value="<%=Folio%>">
            <input type="HIDDEN" name="cveCuendep" value="<%=cveCuendep%>">
            <input type="HIDDEN" name="txtMoneda" value="<%=moneda%>">
            <input type="HIDDEN" name="txtBanco" value="<%=((existeCta>1)?(det.getVtrStrDato1()+"") :cveBanco+"")%>">
            <input type="HIDDEN" name="chTipoPersona" value="<%=request.getParameter("radioTipoPersona")%>">
            <input type="HIDDEN" name="txtPlaza2" value="<%=request.getParameter("txtPlaza2")%>">
            <input type="HIDDEN" name="cbTipoPersona" value="<%=request.getParameter("cboTipoD")%>">
            <input type="HIDDEN" name="txtNombreBanco" value="<%=nombreBanco%>">
            <input type="HIDDEN" name="txtNCuenta" value="<%=request.getParameter("txtNCuenta")%>">
            <input type="HIDDEN" name="txtCuenta" value="<%=((existeCta>1)?det.getVtrStrDato1() :request.getParameter("txtCuenta"))%>">
            <input type="HIDDEN" name="txtTitular" value="<%=((existeCta>1)?det.getVtrStrDato4() :request.getParameter("txtTitular"))%>">
            <input type="HIDDEN" name="txtRFC" value="<%=((existeCta>1)?det.getVtrStrDato5() :request.getParameter("txtRFC"))%>">
            <input type="HIDDEN" name="txtCorreo" value="<%=request.getParameter("txtCorreo")%>">
                      <table width="90%" height="67" >
                        <td  colspan="2" align="center"  bgcolor="#999966" class="celda01"><b>DETALLE 
                          ALTA DE CUENTA</b></td>
                        </tr>
                        <tr  class="celda02"> 
                          <td width="41%" align="left"   > Fidecomiso:</td>
                          <td width="59%" ><%= session.getAttribute( "Fideicomiso" ) %> 
                          </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td align="left"><%=sCaptura.equals("NO")?"Solicitante:":"Capturada"%></td>
                          <td ><b><%=session.getAttribute("NomUser")%></b> </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td > Moneda:&nbsp;&nbsp;</td>
                          <td><b><%=moneda==null?"":moneda%> &nbsp;</b> 
                          </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td > Banco donde radica la cuenta:&nbsp;&nbsp;</td>
                          <td><b><%=nombreBanco==null?"":nombreBanco%> &nbsp;</b> 
                          </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td > Número de Cuenta:&nbsp;&nbsp;</td>
                         
                          <td><b><%=((existeCta>1)?det.getVtrStrDato1() :request.getParameter("txtCuenta"))%></b> 
                          </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td> Titular de la Cuenta:&nbsp;&nbsp;</td>
                          <td ><b><%=((existeCta>1)?det.getVtrStrDato4() :request.getParameter("txtTitular"))%></b> 
                          </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td > RFC:&nbsp;&nbsp;</td>
                          <td ><b><%=((existeCta>1)?det.getVtrStrDato5() :request.getParameter("txtRFC"))%></b> 
                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td > Correo electronico:&nbsp;&nbsp;</td>
                          <td ><%=(request.getParameter("txtCorreo").trim().equals("")?((String)session.getAttribute("Email") ):request.getParameter("txtCorreo"))%> 
                          </td>
                        </tr>
                      </table>
                    </form></td>
                </tr>
                <tr> 
                  <td  >&nbsp; </td>
                </tr>
                <tr> 
                  <td align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:history.back()"><u>Modificar 
                    Cuenta</u></a></td>
                </tr>
                <tr> 
                  <td >&nbsp;</td>
                </tr>
                <tr> 
                  <td align="center"> <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:confirmar()" class="boton" <%=bPermiso?"":"disabled"%>> 
                    &nbsp; <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()" class="boton"> 
                  </td>
                </tr>
              </table>
            
            </td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>

</BODY></HTML>
