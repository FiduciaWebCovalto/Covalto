<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.util.*,java.text.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="Sesion"  class="com.bancomext.negocio.nAcuerdos"/>
<jsp:useBean id="acuerdo"  class="com.bancomext.negocio.nAcuerdos"/>
<%
String tipoUsuario=((String)session.getAttribute("permiso"))!=null?(String)session.getAttribute("permiso"):"OTRO";
DecimalFormat dec = new DecimalFormat("###,###,###,###,###,###,###,##0.00");
int numFiso=Integer.parseInt((String)session.getAttribute("NumFid")!=null?(String)session.getAttribute("NumFid"):"0");
String strFechaSesion=request.getParameter("Fecha")!=null?request.getParameter("Fecha"):"";
String strFechaTipo=request.getParameter("Tipo")!=null?request.getParameter("Tipo"):"";
int numQuery=Integer.parseInt(request.getParameter("param1")!=null?request.getParameter("param1"):"0");
String txtCriterio=request.getParameter("param2")!=null?request.getParameter("param2"):"";
boolean bImp=request.getParameter("imp")!=null && request.getParameter("imp").equals("1")?true:false;

				



if(!strFechaSesion.equals("") && !strFechaTipo.equals(""))
	{
	Sesion.setVtrIntDato1(numFiso);
	Sesion.setVtrStrDato2(strFechaSesion);
	Sesion.setVtrStrDato3(strFechaTipo);
	Sesion.querySelect(5);//DETALLE Sesion

	acuerdo.setVtrIntDato1(numFiso);
	acuerdo.setVtrStrDato2(strFechaSesion);
	acuerdo.setVtrStrDato3(strFechaTipo);
	acuerdo.querySelect(10);
	}
if(numQuery>10)
{
	acuerdo.setVtrIntDato1(numFiso);
	acuerdo.setVtrStrDato2(txtCriterio);
	acuerdo.querySelect(numQuery);
}	
	
%>

<html>
<head>
<title>Comite T�cnico  (<%= session.getAttribute( "Fideicomiso" ) %>)</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
</head>
<body onLoad="<%=(bImp)?"window.print();window.close();":""%>">

	
<table width="100%" border="0" align="center">
  <tr> 
    <td width="11%"  rowspan="4"><img src="imagenes/logo.jpg" ></td>
    <td width="89%" colspan="7"  align="center"  style="font-family: Arial;	font-size: 16px;color: #000000;font-weight: bold;">Inscitech</td>
  </tr>
  <tr> 
    <td  align="center" colspan="7" style="font-family: Verdana, Arial, Helvetica;	font-size: 12px;color: #000000;font-weight: bold;">Direcci�n 
      Fiduciaria</td>
  </tr>
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7"> 
      FIDEICOMISO&nbsp;&nbsp; <%= session.getAttribute( "Fideicomiso" ) %></td>
  </tr>
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7">ACUERDOS 
      COMITE TECNICO</td>
  </tr>
</table>

<%if(!strFechaSesion.equals("") && !strFechaTipo.equals(""))
	{%>    
<table width="100%" border="0">

  <tr> 
    <td colspan="2" class="textoNegrita">&nbsp; </td>
  </tr>
  <tr> 
    <td width="22%"   class="textoNegrita">FECHA DE LA SESION: </td>
    <td width="78%"  class="texto"><%=Sesion.getVtrStrDato2()%></td>
  </tr>
  <tr > 
    <td  class="textoNegrita">TIPO DE SESION:</td>
    <td  class="texto"><%=Sesion.getVtrStrDato3().equals("O")?"ORDINARIA":"EXTRAORDINARIA"%></td>
  </tr>
  <tr> 
    <td   class="textoNegrita">TEMA RELEVANTE:</td>
    <td class="texto"><%=Sesion.getVtrStrDato4()%></td>
  </tr>
 
  <tr> 
    <td height="25" align="right"  class="textoNegrita">&nbsp;</td>
    <td class="texto">&nbsp;</td>
  </tr>
  <tr> 
    <td height="89" colspan="2" align="right" >
<table width="100%"  >
        <tr class="celda01" bgcolor="#999966"> 
          <td width="8%"  align="center">NO . ACUERDO </td>
          <td width="39%"  align="center">DESCRIPCION</td>
          <td width="13%"   align="center">MONTO AUTORIZADO</td>
		  <% if(!tipoUsuario.equals("CLIENTE SECRETARIO DE ACTAS"))
		      {%>
          <td width="13%"   align="center">MONTO DISPONIBLE</td>
          <td width="10%"   align="center">MONTO EJERCIDO</td>
		    <%}%>
          <td width="14%"   align="center">ESTATUS</td>
        </tr>
        <%
							  

							if ( !acuerdo.hasData () )
								  {%>
        <tr  class="subtitulo"> 
          <td align="center" colspan="6">La Sesion no tiene acuerdos registrados 
          </td>
        </tr>
        <%}%>
        <%			  																
						
						for(int r=0; r < acuerdo.getSize(); r++)
							 {
							 acuerdo.setIndex (r );%>
        <tr  class="celda02"> 
          <td align="center"><%=acuerdo.getVtrStrDato4()%></td>
          <td align="center"><%=acuerdo.getVtrStrDato5()%></td>
          <td  align="right"><%=dec.format(acuerdo.getVtrDoubleDato6())%></td>
		  <% if(!tipoUsuario.equals("CLIENTE SECRETARIO DE ACTAS"))
		      {%>
          <td align="right"><%=dec.format(acuerdo.getVtrDoubleDato7())%></td>
          <td align="right"><%=dec.format(acuerdo.getVtrDoubleDato8())%></td>
		    <%}%>
          <td align="center"><%=acuerdo.getVtrStrDato11()%></td>
        </tr>
        <%}%>
      </table>


      
    </td>
  </tr>
  <tr class="texto"> 
    <td colspan="2" align="center">&nbsp; </td>
  </tr>
</table>
	   
<%}

if(numQuery>10)
{%>
<table width="100%" >
  <tr >
    <td  align="center">&nbsp;</td>
    <td  align="center">&nbsp;</td>
    <td  align="center">&nbsp;</td>
    <td   align="center">&nbsp;</td>
    <td    align="center">&nbsp;</td>
    <td  align="center">&nbsp;</td>
  </tr>
  <tr > 
    <td  align="center">&nbsp;</td>
    <td  align="center">&nbsp;</td>
    <td  align="center">&nbsp;</td>
    <td   align="center">&nbsp;</td>
    <td    align="center">&nbsp;</td>
    <td  align="center">&nbsp;</td>
  </tr>
  <tr > 
    <td  align="center">&nbsp;</td>
    <td  align="center">&nbsp;</td>
    <td  align="center">&nbsp;</td>
    <td   align="center">&nbsp;</td>
    <td    align="center">&nbsp;</td>
    <td  align="center">&nbsp;</td>
  </tr>
  <tr > 
    <td  align="center">&nbsp;</td>
    <td  align="center">&nbsp;</td>
    <td  align="center">&nbsp;</td>
    <td   align="center">&nbsp;</td>
    <td    align="center">&nbsp;</td>
    <td  align="center">&nbsp;</td>
  </tr>
  <tr class="celda01" bgcolor="#999966"> 
    <td  align="center">Acuerdo</td>
    <td  align="center">Fecha</td>
    <td  align="center">Descripci&oacute;n</td>
    <td   align="center">Monto Autorizado</td>
    <td    align="center">Monto Ejercido</td>
    <td  align="center">Estatus</td>
  </tr>
  <%
							  

							if ( !acuerdo.hasData () )
								  {%>
  <tr  class="subtitulo"> 
    <td align="center" colspan="6">No existen Acuerdos, con los criterios de busqueda 
      seleccionados </td>
  </tr>
  <%}%>
  <%			  																
						
						for(int r=0; r < acuerdo.getSize(); r++)
							 {
							 acuerdo.setIndex (r );%>
  <tr  class="celda02"> 
    <td align="center"><%=acuerdo.getVtrStrDato4()%></td>
    <td align="center"><%=acuerdo.getVtrStrDato2()%></td>
    <td align="center"><%=acuerdo.getVtrStrDato5()%></td>
    <td  align="right"><%=dec.format(acuerdo.getVtrDoubleDato6())%></td>
    <td align="right"><%=dec.format(acuerdo.getVtrDoubleDato8())%></td>
    <td align="center"><%=acuerdo.getVtrStrDato11()%></td>
  </tr>
  <%}%>
</table>
<%}%>
</body>
</html>