<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ include file="Sesion.jsp" %> 
<%
 if(request.getParameter( "cboFideicomiso" ) !=null)
   {
      String  sFideicomiso = request.getParameter( "cboFideicomiso" );
      session.setAttribute( "Fideicomiso", sFideicomiso ); // N�mero y nombre del fideicomiso
      System.out.println("Token sFideicomiso "+sFideicomiso);
      System.out.println("Token NumFid "+sFideicomiso.substring(0,sFideicomiso.indexOf("-")));
      //int iNumFid= Integer.parseInt( sFideicomiso.substring(0,sFideicomiso.indexOf("-")) );
      session.setAttribute( "NumFid", sFideicomiso.substring(0,sFideicomiso.indexOf("-"))); // N�mero del fideicomiso   
   }%>
<HTML>
<HEAD>
<TITLE>FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" type="text/JavaScript">
function aceptarToken() 
	{
	if(document.Token.txtToken.value=="")
		{
                Swal.fire('error', 'Es necesario que digite su LLAVE!', 'error')
		document.Token.txtToken.focus();
		return;
		}	
   if((document.Token.txtToken.value).length<6)
		{
                Swal.fire('error', 'La longitud de la LLAVE es invalida!', 'error')
		document.Token.txtToken.value="";
		document.Token.txtToken.focus();
		return;
		}	
	if(isNaN(document.Token.txtToken.value))
		{
                Swal.fire('error', 'La LLAVE es un dato numerico!', 'error')
		document.Token.txtToken.value="";
		document.Token.txtToken.focus();
		return;
		}		
	document.Token.submit();
	}	
	

function ocultarToken() 
{
document.Token.txtToken.value="";
document.Token.txtToken.focus();
}
</script>

</HEAD>
<BODY class="bg-light" onLoad="document.Token.txtToken.focus();">
    <jsp:include page="header.jsp"/>
<div class="table-responsive" style="max-height: 450px; overflow-y: auto;">
                <table id="fisosDisponibles"  class="table table-responsive table-hover">
    <thead>

    <TR>
      <TD colspan="7">
        <nav class="navbar navbar-expand-md bg-body-tertiary">
          <div class="container-xl">
            <a class="navbar-brand" href="#">
              <img src="imagenes/logo.jpg" alt="">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item">
                  <a class="nav-link" href="salir.jsp">Salir</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
      </TD>
    </TR>
</thead>
  <TBODY>

    <TR > 
      <TD align="center" class="tdMenuLateral"  width="176"  valign="top"  height="100%" ><br><br>
      </TD>
      <TD valign="top" align="center"> 
        <table width="90%" border="0" >
          <tr> 
            <td  align="center" class="alerta">&nbsp; </td>
          </tr>
          <tr> 
            <td  align="center" class="alerta"><%=session.getAttribute("errorToken")!=null ?(String)session.getAttribute("errorToken")+"<br>":""%>&nbsp; </td>
          </tr>
		   <%
				  session.setAttribute("errorToken","");
		  %>
          <tr> 
            <td  align="center" class="titulo">
			<form name="Token" method="post" action="FI_Bienvenida.jsp">
			<table width="309" border="1" cellpadding="1" cellspacing="1" bordercolor="#666666" bgcolor="#999999" align="center">
                <tr> 
                  <td width="301" align="center"><table width="300" border="0" cellspacing="1" cellpadding="1" class="texto" bgcolor="#CCCCCC" align="center"  background="imagenes/fondoSubMenu.png">
                      <tr> 
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                      </tr>
                      <tr> 
                        <td width="43%">&nbsp;</td>
                        <td width="57%">&nbsp;</td>
                      </tr>
                      <tr align="center"> 
                          <td colspan="2" class="textoNegritaWhite">Introduzca su 
                            <%=session.getAttribute("empresa_9")%>-LLAVE: 
                            <input type="password" name="txtToken" size="10"  style=" WIDTH: 100px"
                                 maxlength="6"  value="<%=request.getParameter("txtToken")!=null?request.getParameter("txtToken"):""%>"></td>
                      </tr>
                      <tr> 
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                      </tr>
                      <tr> 
                        <td colspan="2" align="center"> <input type="button" name="AceptarToken" value="Aceptar" onClick="aceptarToken()"  class="btn btn-primary"> 
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
			  </form></td>
          </tr>
          <tr> 
            <td  align="center" class="alerta">&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" class="subtitulo">&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" class="alerta">&nbsp;</td>
          </tr>

        </table>
			
      </TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</div>	
</BODY></HTML>
