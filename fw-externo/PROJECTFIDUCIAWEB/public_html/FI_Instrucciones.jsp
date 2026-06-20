
<!doctype html>
<!--
/*
  FI_Instrucciones.jsp
  @Autor:Inscitech
  @Creado: Junio 2008
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
            <thead class="table-primary" align="center">
            <tr class="alerta">
            <th align="center"><%=session.getAttribute("errorToken")!=null ?(String)session.getAttribute("errorToken")+"<br>":""%> </th>
          </tr>
            <tr> 
                <th  align="center" class="alerta">
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
                </th>
                </tr>
            </thead>
     </table>       
</div>
</BODY></HTML>