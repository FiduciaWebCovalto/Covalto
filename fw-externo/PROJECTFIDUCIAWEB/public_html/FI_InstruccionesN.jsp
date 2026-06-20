
<!doctype html>
<!--
/*
  FI_InstruccionesN.jsp
  @Autor:Inscitech
  @Creado: Junio 2018
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="Presupuesto"  class="com.bancomext.negocio.RetirosDB"/>
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
<body class="bg-light">
  <jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
  
<div class="table-responsive" style="max-height: 450px; overflow-y: auto;">
                <table id="fisosDisponibles"  class="table table-responsive table-hover">
      <thead class="table-primary">
    </thead>
  <TBODY>
    <TR > 

      <TD valign="top" align="center"> 
    <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %></td>
          </tr>
        </table>
      <table width="593" border="0">
          <tr> 
            <td class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">INSTRUCCIONES  <%=(tipoUsuario!=null &&  tipoUsuario.equals("SECRETARIO DE ACTAS"))?" DEL COMITE T�CNICO":""%></td>
          </tr>
      </table>      
              
        <%if(tipoUsuario!=null &&  !tipoUsuario.equals("CLIENTE SECRETARIO DE ACTAS") && !tipoUsuario.equals("EJECUTIVO SECRETARIO DE ACTAS"))
      {%>
        <table width="90%" border="0" cellspacing="1" cellpadding="1">
          <tr class="alerta">
            <td align="center"><%=session.getAttribute("errorToken")!=null ?(String)session.getAttribute("errorToken")+"<br>":""%> </td>
          </tr>
        </table> 
        <table width="593" border="0">
          <tr> 
            <td  align="center" valign="top">
      <table width="90%" border="0" >
                <tr> 
                  <td  align="center" class="alerta">
          <%=session.getAttribute("msgError")!=null ?(String)session.getAttribute("msgError")+"<br>":""%> 
          <%=request.getParameter("error")!=null && !request.getParameter("error").equals("") && session.getAttribute("operacion")!=null && !((String)session.getAttribute("operacion")).equals("")?(String)session.getAttribute("operacion")+"<br>":""%> 
          <%=(request.getParameter("permiso")!=null && ( ((String)session.getAttribute("permiso")).equals("CLIENTE CONSULTA")||((String)session.getAttribute("permiso")).equals("CLIENTE DEPOSITO")||((String)session.getAttribute("permiso")).equals("CLIENTE CAPTURA") )) || (request.getParameter("permiso")!=null && request.getParameter("permiso").equals("0"))?"Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operaci�n<br>":""%>
          <%=(session.getAttribute("errorSsign")!=null&& ! ((String)session.getAttribute("errorSsign")).equals("") )?"Su operaci&oacute;n no fue  procesada<br> Error al Firmar Digitalmente:<br>"+(String)session.getAttribute("errorSsign"):""%>
          <%
          session.setAttribute("errorToken","");
            session.setAttribute("msgError","");
          session.setAttribute("errorSsign","");
          session.setAttribute("operacion","");
          %>
                  </td>
                </tr>
              </table> 
              </td>
          </tr>
        </table>
    <%}
    else
      {
      %>
        <table border="0" width="70%" align="center" >
          <tr>
            <td   class="texto" >&nbsp;</td>
          </tr>
          <tr>
            <td   class="texto" >&nbsp;</td>
          </tr>
          <tr>
            <td   class="texto" >&nbsp;</td>
          </tr>
          <tr> 
            <td width="85%"   class="texto" ><p align="justify">Desde este sitio 
                puedes autorizar instrucciones No Monetarias
                para efectuar operaciones fiduciarias.
              <p></td>
          </tr>
        </table>
        <%
      }
    %></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</div>
</BODY></HTML>