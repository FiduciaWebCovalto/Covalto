<!-- confirmarInstruccion.jsp -->
<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="instruccDAO" class="mx.com.inscitech.clients.daos.InstruccDAO"/>
<jsp:useBean id="fDeposito" class="mx.com.inscitech.clients.beans.FDeposito"/>
<jsp:useBean id="fRetiro" class="mx.com.inscitech.clients.beans.FRetiro"/>
<jsp:useBean id="fTraspaso" class="mx.com.inscitech.clients.beans.Traspaso"/>
<jsp:useBean id="fHonorarios" class="mx.com.inscitech.clients.beans.Honorarios"/>
<jsp:useBean id="instrucc" class="mx.com.inscitech.clients.beans.Instrucc"/>
<jsp:useBean id="instruccComVen" class="mx.com.inscitech.clients.beans.Instrucc"/>
<% 
  String folio = request.getParameter("folio");
  String tipo = request.getParameter("tipo")==null?"":request.getParameter("tipo");
  String txtFechaI = request.getParameter("txtFechaI");
  String cboContratoR = request.getParameter("cboContratoR");
  String autorizar = request.getParameter("autorizar");
  String rechazar = request.getParameter("rechazar"); 
  String contabilizar = request.getParameter("contabilizar");
  String fdpoTipoCambioFirme = request.getParameter("fdpoTipoCambioFirme");
  String insNomMiembro = request.getParameter("insNomMiembro");
  String tipoInstruccion = request.getParameter("tipoInstruccion");
  String fechaCaptura = "";
  String instruccion = "";
  String autorizadaPor = "";
  String firma1 = "";
  String firma2 = "";
  String firma3 = "";
  
  String username = session.getAttribute("username").toString();
  
  instrucc = instruccDAO.obtenerInstruccion(folio);
  fDeposito = instruccDAO.obtenerDetalleDeposito(folio);
  fRetiro = instruccDAO.obtenerDetalleRetiro(folio);
  fTraspaso = instruccDAO.obtenerDetalleTraspaso(folio);
  fHonorarios = instruccDAO.obtenerDetalleHonorarios(folio);
  instruccComVen = instruccDAO.obtenerDetalleCompraVenta(folio);
//out.print(username);
%>
<script language="JavaScript" type="text/JavaScript">

  function fichaUnica() 
	{
	newWindow = window.open("FichaUnica.jsp?folio=" + document.formaAutorizar.folio.value, "FichaUnica",
"top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=yes,resizable=yes,copyhistory=NO,width=750,height=400");
  newWindow.focus();
  }
  
  function regresar() {
    document.formaAutorizar.action = "FI_Operacion.jsp?menu=2&Buscar=Buscar&txtFechaI=" + document.formaAutorizar.txtFechaI.value;
    document.formaAutorizar.submit();
  }
  
  function autorizar() {
    document.formaAutorizar.action = "FI_Operacion.jsp?menu=4&autorizar=Autorizar&folio=" + document.formaAutorizar.folio.value;
    document.formaAutorizar.submit();
  }
  
  
  function rechazar() {
    document.formaAutorizar.action = "FI_Operacion.jsp?menu=4&rechazar=Rechazar&folio=" + document.formaAutorizar.folio.value;
    document.formaAutorizar.submit();
  }  
</script>  

<form name="formaAutorizar" method="post" action="">
<input type="hidden" name="folio" value="<%=folio%>" />
<input type="hidden" name="tipo" value="<%=tipo%>" />
<input type="hidden" name="txtFechaI" value="<%=txtFechaI%>" />
<input type="hidden" name="cboContratoR" value="<%=request.getParameter("cboContratoR")%>">
<table width="95%" border="0">
  <tr>
    <td colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01">
      <b>DATOS GENERALES</b> 
    </td>
  </tr>
  <%
  if (autorizar != null && autorizar.equals("Autorizar")) 
  {
     if (instruccDAO.verificarUsuarioFirma(folio, username) > 0) {
        out.print("<br/><div class=\"texto\"><font color=\"#FF0000\"><b>Usted no puede autorizar la instrucci�n con el folio: " + folio + ". Favor de verificar.</b></font></div><br/>");
     } else if (instruccDAO.autorizarFirma(folio, username, fdpoTipoCambioFirme, tipo,insNomMiembro) > 0) {
        out.print("<br/><div class=\"texto\"><font color=\"#006600\"><b>La instrucci�n con el folio: " + folio + " ha sido autorizada satisfactoriamente.</b></font></div><br/>");        
     }
  }
  else if (rechazar != null && rechazar.equals("Rechazar")) 
  {
     if (instruccDAO.verificarUsuarioFirma(folio, username) > 0) {
        out.print("<br/><div class=\"texto\"><font color=\"#FF0000\"><b>Usted no puede rechazar la instrucci�n con el folio: " + folio + ". Favor de verificar.</b></font></div><br/>");
     } else if (instruccDAO.rechazarFirma(folio, username,insNomMiembro) > 0) {
        out.print("<br/><div class=\"texto\"><font color=\"#006600\"><b>La instrucci�n con el folio: " + folio + " ha sido rechazada satisfactoriamente.</b></font></div><br/>");        
     }
  }  
  %>
  <tr class="celda02">
    <td width="34%">Folio:</td>
    <td width="66%">
      <%= folio%>
    </td>
  </tr>

  
<%


  /////////////////////////////VALIDA OPERACION///////////////////////////////////
if (tipo.indexOf("VALIDA OPERACION")!=-1) {
%>
  <tr class="celda02">
    <td>Fecha de Captura:</td>
    <td>
      <%= instrucc.getValor13() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Fideicomiso:</td>
    <td>
    <%= instrucc.getValor1() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Tipo de Instrucci&oacute;n:</td>
    <td>
      <%= tipo %>
    </td>
  </tr>
  <!--<tr class="celda02">
    <td>Moneda:</td>
    <td>
       <%= fDeposito.getValor9() %>
    </td>
  </tr>-->
  <tr class="celda02">
    <td>Status:</td>
    <td>
      <%= instrucc.getValor11() %>
    </td>
  </tr>  
  <%
      out.print(instruccDAO.obtenerFirmas(folio));  
  %>
  </table>
  
  <table width="95%" border="0">
    <tr>
      <td height="19" colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01">
        <b>DETALLE DEPOSITO</b>
      </td>
    </tr>
    <tr class="celda02">
      <td width="34%" align="left">Cuenta <%=session.getAttribute("empresa_9")%> en la que se deposita:</td>
      <td width="66%">
        <%= fDeposito.getValor8() %>
      </td>
    </tr>
    <tr class="celda02">
      <td align="left">Importe :</td>
      <td>
       <%= fDeposito.getValor6() %>
      </td>
    </tr>
    <tr class="celda02">
      <td align="left">Descripci&oacute;n :</td>
      <td>
       <%= fDeposito.getValor12() %>
      </td>
    </tr>    
    <tr class="celda02">
      <td>Concepto :</td>
      <td>
        <%= fDeposito.getValor3() %>
      </td>
    </tr>   
    <tr class="celda02">
      <td>Persona que deposita :</td>
      <td>
        <%= fDeposito.getValor10() %>
      </td>
    </tr>      
    <tr class="celda02">
      <td align="left">Moneda :</td>
      <td>
        <%= fDeposito.getValor9() %>
        <input type="hidden" name="fdpoTipoMoneda" value="<%=fDeposito.getValor9()%>">
        <input type="hidden" name="fdpoTipoCambio1">
      </td>
    </tr>
  <tr class="celda02">
    <td>Comentario Ejecutivo:</td>
    <td>
       <input type="text" size="50" name="insNomMiembro" value="<%=request.getParameter("insNomMiembro")!=null?request.getParameter("insNomMiembro"):"0"%>">
    </td>
  </tr>     
  <%
  if (fDeposito.getValor9() != null && !fDeposito.getValor9().equals("MONEDA NACIONAL")) {
  //FDPO_TIPO_CAMBIO_FIRME
  %>
  <tr class="celda02">
    <td>Tipo de cambio provisional:</td>
    <td>
       <%= fDeposito.getValor13()==null?"":fDeposito.getValor13() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Tipo de cambio firme:</td>
    <td>
       <%= fDeposito.getValor14()==null?"":fDeposito.getValor14() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Tipo de cambio de cierre u operaci�n:</td>
    <td>
       <input type="text" name="fdpoTipoCambioFirme" value="<%=request.getParameter("fdpoTipoCambioFirme")!=null?request.getParameter("fdpoTipoCambioFirme"):"0"%>">
    </td>
  </tr>   
  <%
  }
  %>    
</table>
<%
}




  if (tipo.equalsIgnoreCase("DEPOSITO")) {
  /////////////////////////////DEPOSITO///////////////////////////////////
%>
  <tr class="celda02">
    <td>Fecha de Captura:</td>
    <td>
      <%= fDeposito.getValor1() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Fideicomiso:</td>
    <td>
    <%= fDeposito.getValor15() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Sub Cuenta:</td>
    <td>
    <%= fDeposito.getValor16() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Tipo de Instrucci&oacute;n:</td>
    <td>
      <%= tipo %>
    </td>
  </tr>
  <!--<tr class="celda02">
    <td>Moneda:</td>
    <td>
       <%= fDeposito.getValor9() %>
    </td>
  </tr>-->
  <tr class="celda02">
    <td>Status:</td>
    <td>
      <%= fDeposito.getValor11() %>
    </td>
  </tr>  
  <%
      out.print(instruccDAO.obtenerFirmas(folio));  
  %>
  </table>
  
  <table width="95%" border="0">
    <tr>
      <td height="19" colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01">
        <b>DETALLE DEPOSITO</b>
      </td>
    </tr>
    <tr class="celda02">
      <td width="34%" align="left">Cuenta <%=session.getAttribute("empresa_9")%> en la que se deposita:</td>
      <td width="66%">
        <%= fDeposito.getValor8() %>
      </td>
    </tr>
    <tr class="celda02">
      <td align="left">Importe :</td>
      <td>
       <%= fDeposito.getValor6() %>
      </td>
    </tr>
    <tr class="celda02">
      <td align="left">Descripci&oacute;n :</td>
      <td>
       <%= fDeposito.getValor12() %>
      </td>
    </tr>    
    <tr class="celda02">
      <td>Concepto :</td>
      <td>
        <%= fDeposito.getValor3() %>
      </td>
    </tr>   
    <tr class="celda02">
      <td>Persona que deposita :</td>
      <td>
        <%= fDeposito.getValor10() %>
      </td>
    </tr>      
    <tr class="celda02">
      <td align="left">Moneda :</td>
      <td>
        <%= fDeposito.getValor9() %>
        <input type="hidden" name="fdpoTipoMoneda" value="<%=fDeposito.getValor9()%>">
        <input type="hidden" name="fdpoTipoCambio1">
      </td>
    </tr>
  <tr class="celda02">
    <td>Comentario Ejecutivo:</td>
    <td>
       <input type="text" size="50" name="insNomMiembro" value="<%=request.getParameter("insNomMiembro")!=null?request.getParameter("insNomMiembro"):"0"%>">
    </td>
  </tr> 
  <%
  if (fDeposito.getValor9() != null && !fDeposito.getValor9().equals("MONEDA NACIONAL")) {
  //FDPO_TIPO_CAMBIO_FIRME
  %>
  <tr class="celda02">
    <td>Tipo de cambio provisional:</td>
    <td>
       <%= fDeposito.getValor13()==null?"":fDeposito.getValor13() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Tipo de cambio firme:</td>
    <td>
       <%= fDeposito.getValor14()==null?"":fDeposito.getValor14() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Tipo de cambio de cierre u operaci�n:</td>
    <td>
       <input type="text" name="fdpoTipoCambioFirme" value="<%=request.getParameter("fdpoTipoCambioFirme")!=null?request.getParameter("fdpoTipoCambioFirme"):"0"%>">
    </td>
  </tr>
   
  
  <%
  }
  %>    
</table>
<%
  } 
 else if (tipo.equalsIgnoreCase("HONORARIOS")) {
  /////////////////////////////HONORARIOS///////////////////////////////////
%>
  <tr class="celda02">
    <td>Fecha de Captura:</td>
    <td>
      <%= fHonorarios.getValor10() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Fideicomiso:</td>
    <td>
    <%= fHonorarios.getValor8() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Tipo de Instrucci&oacute;n:</td>
    <td>
      <%= tipo %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Status:</td>
    <td>
      <%= fHonorarios.getValor7() %>
    </td>
  </tr>  
  <%
      out.print(instruccDAO.obtenerFirmas(folio));  
  %>
  </table>
  
  <table width="95%" border="0">
    <tr>
      <td height="19" colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01">
        <b>DETALLE HONORARIOS</b>
      </td>
    </tr>
    <tr class="celda02">
      <td width="34%" align="left">Tipo de Persona:</td>
      <td width="66%">
        <%= fHonorarios.getValor2() %>
      </td>
    </tr>
    <tr class="celda02">
      <td align="left">Tipo de Honorario :</td>
      <td>
       <%= fHonorarios.getValor5() %>
      </td>
    </tr>
        <tr class="celda02">
      <td>Secuencial de la Provisi&oacute;n :</td>
      <td>
        <%= fHonorarios.getValor4() %>
      </td>
    </tr> 
    <tr class="celda02">
      <td align="left">Importe (C/IVA) :</td>
      <td>
       <%= fHonorarios.getValor6() %>
      </td>
    </tr>            
     <tr class="celda02">
    <td align="left">Moneda :</td>
    <td>
       <%= fHonorarios.getValor9() %>
         <input type="hidden" name="fdpoTipoMoneda" value="<%=fHonorarios.getValor9()%>">
       <input type="hidden" name="fdpoTipoCambioFirme" value="0">
       <input type="hidden" name="fdpoTipoCambio1">
      </td>
    </tr>            
</table>
<%
  } 
  else if (tipo.equalsIgnoreCase("TRASPASO")) {
  /////////////////////////////TRASPASO///////////////////////////////////
%>
  <tr class="celda02">
    <td>Fecha de Captura:</td>
    <td>
      <%= fTraspaso.getValor1() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Fideicomiso:</td>
    <td>
    <%= fTraspaso.getValor6() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Tipo de Instrucci&oacute;n:</td>
    <td>
      <%= tipo %>
    </td>
  </tr>
  <input type="hidden" name="fdpoTipoMoneda" value="1">
       <input type="hidden" name="fdpoTipoCambioFirme" value="0">
  <tr class="celda02">
    <td>Status:</td>
    <td>
      <%= fTraspaso.getValor5() %>
    </td>
  </tr>  
  <%
      out.print(instruccDAO.obtenerFirmas(folio));  
  %>
  </table>
  <table width="95%" border="0">
    <tr>
      <td height="19" colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01">
        <b>DETALLE TRASPASO</b>
      </td>
    </tr>
    <tr class="celda02">
      <td width="34%" align="left">Contrato de Inversi�n Origen:</td>
      <td width="66%">
        <%= fTraspaso.getValor2() %>
      </td>
    </tr>
    
    <tr class="celda02">
      <td width="34%" align="left">Sub Cuenta Origen:</td>
      <td width="66%">
        <%= fTraspaso.getValor7() %>
      </td>
    </tr>
    <tr class="celda02">
      <td width="34%" align="left">Contrato de Inversi�n Destino:</td>
      <td width="66%">
        <%= fTraspaso.getValor3() %>
      </td>
    </tr>
    <tr class="celda02">
      <td width="34%" align="left">Sub Cuenta Destino:</td>
      <td width="66%">
        <%= fTraspaso.getValor8() %>
      </td>
    </tr>
    <tr class="celda02">
      <td align="left">Importe :</td>
      <td>
       <%= fTraspaso.getValor4() %>
      </td>
    </tr>   
</table>  
<%
  }
  else if (tipo.equalsIgnoreCase("RETIRO")) {
  /////////////////////////////RETIRO///////////////////////////////////
%>
  <tr class="celda02">
    <td>Fecha de Captura:</td>
    <td>
      <%= fRetiro.getValor1() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Fideicomiso:</td>
    <td>
      <%= fRetiro.getValor21() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Sub Cuenta:</td>
    <td>
      <%= fRetiro.getValor26() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Tipo de Instrucci&oacute;n:</td>
    <td>
      <%= tipo %>
    </td>
  </tr>
    <tr class="celda02">
    <td>Moneda:</td>
    <td>
       <%= fRetiro.getValor24() %>
    </td>
  </tr>      
  <tr class="celda02">
    <td>Status:</td>
    <td>
      <%= fRetiro.getValor25() %>
    </td>
  </tr>  
  <%
      out.print(instruccDAO.obtenerFirmas(folio));  
  %>
  </table>
  <table width="95%" border="0">
    <tr>
      <td height="19" colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01">
        <b>DETALLE RETIRO</b>
      </td>
    </tr>
    <tr class="celda02">
      <td width="34%" align="left">Retiro del Contrato de Inversi�n:</td>
      <td width="66%">
        <%= fRetiro.getValor2() %>
      </td>
    </tr>
    <tr class="celda02">
      <td align="left">Importe:</td>
      <td>
       <%= fRetiro.getValor3() %>
      </td>
    </tr>
    <tr class="celda02">
      <td align="left">Descripci&oacute;n:</td>
      <td>
       <%= fRetiro.getValor22() %>
      </td>
     </tr>  
    <tr class="celda02">
      <td>Fecha de Sesi�n:</td>
      <td>
        <%= fRetiro.getValor14()==null?"":fRetiro.getValor14() %>
      </td>
    </tr>
    <tr class="celda02">
      <td>Tipo de Sesi�n:</td>
      <td>
       <%= fRetiro.getValor15()==null?"":fRetiro.getValor15() %>
      </td>
    </tr>     
    <tr class="celda02">
      <td>No. Acuerdo:</td>
      <td>
       <%= fRetiro.getValor16()==null?"":fRetiro.getValor16() %>
      </td>
    </tr>      
    <tr class="celda02">
      <td align="left">Forma de Liquidaci�n:</td>
      <td>
       <%= fRetiro.getValor6()==null?"":fRetiro.getValor6() %>
      </td>
    </tr>
  <tr class="celda02">
    <td>Referencia:</td>
    <td>
     <%= fRetiro.getValor17()==null?"":fRetiro.getValor17() %>
    </td>
  </tr>         
  <tr class="celda02">
    <td>Moneda:</td>
    <td>
       <%= fRetiro.getValor24() %>
       <input type="hidden" name="fdpoTipoMoneda" value="<%=fRetiro.getValor24()%>">
       <input type="hidden" name="fdpoTipoCambio1">
    </td>
  </tr>
  <tr class="celda02">
    <td>Comentario Ejecutivo:</td>
    <td>
       <input type="text" size="50" name="insNomMiembro" value="<%=request.getParameter("insNomMiembro")!=null?request.getParameter("insNomMiembro"):"0"%>">
    </td>
  </tr>    
  
  <%
  if (fRetiro.getValor24() != null && !fRetiro.getValor24().equals("MONEDA NACIONAL")) {
  //FDPO_TIPO_CAMBIO_FIRME
  %>
  <tr class="celda02">
    <td>Tipo de cambio provisional:</td>
    <td>
       <%= fRetiro.getValor19()==null?"":fRetiro.getValor19()%>
    </td>
  </tr>
  <tr class="celda02">
    <td>Tipo de cambio firme:</td>
    <td>
       <%= fRetiro.getValor20()==null?"":fRetiro.getValor20()%>
    </td>
  </tr>
  <tr class="celda02">
    <td>Tipo de cambio de cierre u operaci�n:</td>
    <td>
       <input type="text" name="fdpoTipoCambioFirme" value="<%=request.getParameter("fdpoTipoCambioFirme")!=null?request.getParameter("fdpoTipoCambioFirme"):"0"%>">
    </td>
  </tr>
    
  <%
  }
  %>      
</table>
<%
  }else if (tipo.indexOf("LIQUIDACION")>-1)
  {
  /////////////////////////////LIQUIDACION///////////////////////////////////
%>
  <tr class="celda02">
    <td>Fecha de Captura:</td>
    <td>
      <%= instruccComVen.getValor3() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Fideicomiso:</td>
    <td>
      <%= instruccComVen.getValor18() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Sub Cuenta:</td>
    <td>
      <%= instruccComVen.getValor19() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Cto Inver:</td>
    <td>
      <%= instruccComVen.getValor20() %>
    </td>
  </tr>
  <tr class="celda02">
    <td>Tipo de Instrucci&oacute;n:</td>
    <td>
      <%= instruccComVen.getValor16() %>
    </td>
   </tr>
   <tr class="celda02">
    <td>Importe:</td>
    <td>
      <%= instruccComVen.getValor17() %>
    </td>
   </tr>
  <tr class="celda02">
    <td>Status:</td>
    <td>
      <%= instruccComVen.getValor11() %>
    </td>
  </tr>  
  <%
      out.print(instruccDAO.obtenerFirmas(folio));  
      }
  %>

<br/>

<table>
  <tr>
    <td align="right" class="texto">
      <DIV align="center">
        <P>
<%
if(contabilizar!=null && contabilizar.equals("contabilizar")) {
  out.print("<input type=\"button\" name=\"Regresar\" class=\"boton\" value=\"Regresar\" onClick=\"javascript:history.back();\" ");
} else {
%>

          <input type="button" name="Autorizar" class="boton" value="Autorizar Instruccion" onClick="javascript:autorizar();" />
          <input type="button" name="Rechazar" class="boton" value="Rechazar Instruccion" onClick="javascript:rechazar();" />
          <input type="button" name="FichaUnica" class="boton" value="Ficha �nica" onClick="javascript:fichaUnica();"/>
          <input type="button" name="Regresar" id="Regresar" class="btn btn-success" value="Regresar a la Bandeja" onClick="javascript:regresar();" />
<%
}
%>

        </P>
      </DIV>
    </td>
  </tr>
</table>

</form>