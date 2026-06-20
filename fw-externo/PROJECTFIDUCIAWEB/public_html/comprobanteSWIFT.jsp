<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="Sesion.jsp" %>
<HTML><HEAD><TITLE>Comprobante de Instrucción de Retiro SWIFT - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link href="styles/bancomext.css" rel="stylesheet" type="text/css">
</HEAD>
<BODY vLink=#052206 leftMargin=0 topMargin=0 marginwidth="0" marginheight="0"  onLoad="window.print();window.close()">
<table border="0" width="70%" align="center">
  <tr bordercolor="#000000"> 
    <td  ><img src="imagenes/lineLogo_R.gif"  height="10"></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td align="right" class="textoNegrita"><table width="100%" border="0" height="79">
        <tr bordercolor="#000000"> 
          <td width="11%"><img src="imagenes/logo.jpg" width="135" height="89"></td>
          <td width="89%" align="center" bordercolor="#FFFFFF" class="subtitulo">DIRECCION 
            FIDUCIARIA <br>
            COMPROBANTE DE RETIRO SWIFT</td>
        </tr>
      </table></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td ><img src="imagenes/lineLogo_R.gif"  height="10"></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  align="right" class="textoNegrita">Fecha:<%=fecha+"&nbsp;&nbsp;  "+BD.getHora() +" hrs."%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  align="right" class="textoNegrita">&nbsp;</td>
  </tr>
</table>
<table width="650" border="0" align="center">
  <%

String sData[] = BD.getDatosSWIFT(request.getParameter("txtFolio"),(String)session.getAttribute("NumFid"));
%>
  <tr> 
    <td align="center"> <table width="550"  border="1" bordercolor="#FFFFFF">
        <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
          <td  class="subtitulo"  colspan="3">Folio de Operaci&oacute;n: <%=request.getParameter("txtFolio")%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto">Fideicomiso</td>
          <td class="texto" colspan="2"><%= session.getAttribute("Fideicomiso") %></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto">Fecha de Operaci&oacute;n</td>
          <td class="texto" colspan="2"><%=sData[0]%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto">Tipo de Cambio</td>
          <td class="texto" colspan="2"><%=sData[1]%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto" colspan="3">&nbsp;</td>
        </tr>
        <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
          <td align="center" class="subtitulo">ORIGEN</td>
          <td align="center" class="subtitulo"><%=sData[2]%></td>
          <td align="center" class="subtitulo">MONEDA NACIONAL</td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto">Federal</td>
          <td align="right" class="texto"><%=sData[3]%></td>
          <td align="right" class="texto"><%=sData[6]%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto" >Estatal</td>
          <td align="right" class="texto" ><%=sData[4]%></td>
          <td align="right" class="texto" ><%=sData[7]%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto">Rendimientos</td>
          <td align="right" class="texto"><%=sData[5]%></td>
          <td align="right" class="texto"><%=sData[8]%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="celda01"><b>Total</b></td>
          <td align="right" class="celda01"><b><%=sData[9]%></b></td>
          <td align="right" class="celda01"><b><%=sData[10]%></b></td>
        </tr>
      </table></td>
  </tr>
</table>
</BODY>
</HTML>
