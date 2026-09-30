<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="Presupuesto"  class="mx.com.inscitech.clients.negocio.RetirosDB"/>
<jsp:useBean id="avisos" class="mx.com.inscitech.clients.negocio.nServicios"/>
<%@ include file="Sesion.jsp" %> 
<%@ include file="parametrosToken.jsp" %>
<%
/****************************AUTENTICACION CON TOKEN******************************/
if(((String)session.getAttribute("token")).equals("1"))
    {%>
       <%@ include file="autenticaTokenLogin.jsp" %>
    <%
     }
/*********************************************************************************/

 if(request.getParameter( "cboFideicomiso" ) !=null)
   {
      String  sFideicomiso = request.getParameter( "cboFideicomiso" );
      session.setAttribute( "Fideicomiso", sFideicomiso ); // N�mero y nombre del fideicomiso
      
      session.setAttribute( "NumFid",sFideicomiso.substring(0,sFideicomiso.indexOf("-"))); // N�mero del fideicomiso   
   }

session.setAttribute("CtasInd","0");


if(BD.getTipoFiso((String)session.getAttribute( "NumFid" ))){
	  session.setAttribute("FOSEG","S");
    String strNiveles[]= Presupuesto.getData(24,(String)session.getAttribute( "NumFid" ));
    for (int i=0;i<5;i++){
            session.setAttribute(("NIVEL"+String.valueOf(i)).trim(),"");
          }    
      if(strNiveles!=null)
      for (int i=0;i<strNiveles.length;i++){
        session.setAttribute(("NIVEL"+String.valueOf(i)).trim(),strNiveles[i]);
      }
}
      else 
          session.setAttribute("FOSEG","N");%>
<%

// Obtiene el tipo de Contabilidad del fideicomiso
session.setAttribute("TpoCont","1");   	
%>


<HTML>
<HEAD>
<TITLE>FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" src="scripts/navegador.js"></script>
<script language="JavaScript" type="text/JavaScript">

function aviso()
{
<%
avisos.querySelect(11);
if(avisos.hasData())
  {
  %>
   window.open("aviso.jsp","Ventana_aviso","top=30,left=30,width=300,height=480,<%=avisos.getSize()>2?",scrollbars=YES":""%>"); 
    <%
  }
 %> 
       
}

function Encuesta()
{
   window.open("ligaEncuesta.jsp","Ventana_Encuesta","top=190,left=20,width=170,height=203,scrollbars=NO");      
}


       
      function Certificado()
      {
         window.open("Certificado.html","Ventana_Certificado","top=40,left=0,width=800,height=460,scrollbars=YES");      
      }


         function InstalarCertificado() 
         {
            window.open("instalarCD.html","Ventana_InstalarCD","top=40,left=0,width=800,height=460,scrollbars=YES");      
         }

</script>

</HEAD>
<BODY onLoad="detect();aviso();" >
  <jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
  
<div class="table-responsive" style="max-height: 450px; overflow-y: auto;">
                <table id="fisosDisponibles"  class="table table-responsive table-hover">

  <TBODY>
    <TR > 
      <TD align="center" class="tdMenuLateral" valign="top" height="100%"  width="176">
<div id="Layer1" style="position:absolute; width:200px; height:115px; z-index:1; left: -14px; top: 90px;"> 
          <%
		 if (session.getAttribute("FOSEG")!=null && ((String)session.getAttribute("FOSEG")).trim().equals("S") && (tipoUsuario!=null && (!tipoUsuario.equals("EJECUTIVO CONSULTA") && !tipoUsuario.equals("EJECUTIVO SECRETARIO DE ACTAS") &&  !tipoUsuario.equals("CLIENTE SECRETARIO DE ACTAS") )))
		    if (BD.rendimientosPendientes((String)session.getAttribute( "NumFid" ),BD.getNumContrato((String)session.getAttribute("NumFid"),"RENDIMIENTOS")))
					{%>
          <table width="150" border=1  align="center"     bgcolor="#333366" >
            <tr align=left height="10" bordercolor="#FFFFFF"  bgcolor="#FFFFFF" > 
              <td  align="center"class="subtitulo" > 
                AVISO</td>
          </tr>
          <tr bordercolor="#333366"  bgcolor="#FFFFFF"> 
              <td height="39"  align="center" bgcolor="#CCCCCC" class="detalleAviso" > 
                <P class="textoNegrita"> EXISTEN RENDIMIENTOS, PENDIENTES DE ASIGNAR A UN PRESUPUESTO</P>
             </td>
          </tr>
        </table>
		<% }%></div> 
      </TD>
      <TD valign="top" align="center"> 
        <%if(request.getParameter("error")==null)
				{%>
        <table width="90%" border="0">
          <tr> 
            <td colspan="2"  align="center" > </td>
          </tr>
          <tr> 
            <td colspan="2"  align="center"  class="subtitulo">&nbsp; </td>
          </tr>
          <tr> 
            <td colspan="2"  align="center"  class="alerta">&nbsp; <%=session.getAttribute("Actualiza")!=null?session.getAttribute("Actualiza"):""%> 
              <%session.setAttribute("Actualiza","");%>
            </td>
          </tr>
          <tr> 
            <td colspan="2" class="TEXTO" align="center">&nbsp;</td>
          </tr>
          <tr> 
            <td colspan="2" class="titulo" align="center">BIENVENIDO</td>
          </tr>
          <tr> 
            <td colspan="2"  align="center" class="subtitulo">&nbsp;</td>
          </tr>
          <tr> 
            <td colspan="2"  align="center" class="fiso"><%= session.getAttribute( "NomUser" ) %><br> 
              <%= session.getAttribute( "Fideicomiso" ) %></td>
          </tr>
          <tr> 
            <td colspan="2"  align="center" class="subtitulo">version 2026.02</td>
          </tr>
          
          <tr> 
            <td colspan="2"   align="center" class="subtitulo">&nbsp;</td>
          </tr>
          <tr> 
            <td  align="right"  class="subtitulo">&nbsp;</td>
            <td >&nbsp;</td>
          </tr>
          <tr> 
            <td  align="right"  class="subtitulo">&nbsp;</td>
            <td >&nbsp;</td>
          </tr>
	 </table>
		<%}%>
		<%if(request.getParameter("error")!=null)
				{%>
        <table width="90%" border="0" >
          <tr> 
            <td  align="center" class="alerta">&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" class="alerta">&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" class="titulo">&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" class="alerta">&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" class="subtitulo"><%= session.getAttribute( "NomUser" )!=null?session.getAttribute( "NomUser" ):"" %></td>
          </tr>
          <tr> 
            <td  align="center" class="alerta">&nbsp;</td>
          </tr>

        </table>
			<%}%>
		</TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</div>    
</BODY></HTML>
