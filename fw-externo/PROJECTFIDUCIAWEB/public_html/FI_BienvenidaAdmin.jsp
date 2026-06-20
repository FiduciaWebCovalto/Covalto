<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="avisos" class="com.bancomext.negocio.nServicios"/>
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
      session.setAttribute( "NumFid", sFideicomiso.substring(0,sFideicomiso.indexOf(' '))); // N�mero del fideicomiso   
   }

session.setAttribute("CtasInd","0");

session.setAttribute("FOSEG","N");
%>
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
  <jsp:include page="MenuAdmon.jsp"/>

<TABLE style="background-repeat: no-repeat;" border="0" cellPadding="0" cellSpacing="0" width="100%"  height="100%" >
  
  <TBODY>
    <TR > 
      <TD valign="top" align="center"> 
        <%if(request.getParameter("error")==null)
				{%>
        <table width="90%" border="0">
          <tr> 
            <td colspan="2" align="center" > </td>
          </tr>
          <tr> 
            <td colspan="2" align="center"  class="subtitulo">&nbsp; </td>
          </tr>
          <tr> 
            <td colspan="2" align="center"  class="alerta">&nbsp; <%=session.getAttribute("Actualiza")!=null?session.getAttribute("Actualiza"):""%> 
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
            <td colspan="2" align="center" class="subtitulo">&nbsp;</td>
          </tr>
          <tr> 
            <td colspan="2" align="center" class="fiso"><%= session.getAttribute( "NomUser" ) %></td>
          </tr>
          <tr> 
            <td colspan="2" align="center" class="subtitulo">&nbsp;</td>
          </tr>
          <tr> 
            <td colspan="2" align="center" class="titulo">version 2026.02</td>
          </tr>

          <%
            if(!((String)session.getAttribute("permiso")).equals("ADMINISTRACION")&&!((String)session.getAttribute("permiso")).equals("AUTORIZACION INSTRUCCIONES")
            && !((String)session.getAttribute("permiso")).equals("LIBERA INSTRUCCIONES")&&!((String)session.getAttribute("permiso")).equals("CONTABILIZA INSTRUCCIONES"))
            {
          %>
		          <tr> 
            <td colspan="2">&nbsp;</td>
          </tr>
          <tr> 
            <td colspan="2">&nbsp;</td>
          </tr>
          <%
            }%>
          <tr> 
            <td colspan="2" align="center" class="subtitulo">&nbsp;</td>
          </tr>
          <tr> 
            <td align="right" class="subtitulo">&nbsp;</td>
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
            <td  align="center" class="subtitulo"><%= session.getAttribute( "NomUser" ) %></td>
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
	
</BODY></HTML>
