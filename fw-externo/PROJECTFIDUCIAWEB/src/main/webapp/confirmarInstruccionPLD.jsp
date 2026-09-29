<!-- confirmarInstruccion.jsp -->
<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="instruccDAO" class="com.bancomext.daos.InstruccDAO"/>
<jsp:useBean id="fDeposito" class="com.bancomext.beans.FDeposito"/>
<jsp:useBean id="fRetiro" class="com.bancomext.beans.FRetiro"/>
<jsp:useBean id="fTraspaso" class="com.bancomext.beans.Traspaso"/>
<jsp:useBean id="fHonorarios" class="com.bancomext.beans.Honorarios"/>
<jsp:useBean id="instrucc" class="com.bancomext.beans.Instrucc"/>
<jsp:useBean id="instruccComVen" class="com.bancomext.beans.Instrucc"/>
<% 
  String folio = request.getParameter("folio");
  String tipo = request.getParameter("tipo")==null?"":request.getParameter("tipo");
  String txtFechaI = request.getParameter("txtFechaI");
  String cboContratoR = request.getParameter("cboContratoR");
  String autorizar = request.getParameter("Aceptar");
  String rechazar = request.getParameter("rechazar"); 
  String contabilizar = request.getParameter("contabilizar");
  String fdpoTipoCambioFirme = request.getParameter("fdpoTipoCambioFirme");
  String insNomMiembro = request.getParameter("insNomMiembro");
  String tipoInstruccion = request.getParameter("tipoInstruccion");

  if (!(autorizar != null && autorizar.equals("Aceptar")))   
    instrucc = instruccDAO.obtenerDatosPLD(folio);
    
    String sPrueba=instrucc.getValor1();
  String firComentario = request.getParameter("firComentario");  
  String firReporta = request.getParameter("firReporta");    
  String fechaCaptura = "";
  String instruccion = "";
  String autorizadaPor = "";
  String firma1 = "";
  String firma2 = "";
  String firma3 = "";
  
  String username = session.getAttribute("username").toString();
  
//out.print(username);
%>
<script language="JavaScript" type="text/JavaScript">

  function regresar() {
    document.formaAutorizar.action = "FI_Operacion.jsp?menu=7&Buscar=Buscar&txtFechaI=" + document.formaAutorizar.txtFechaI.value;
    document.formaAutorizar.submit();
  }
  
  function autorizar() {
    document.formaAutorizar.action = "FI_Operacion.jsp?menu=11&Aceptar=Aceptar&folio=" + document.formaAutorizar.folio.value;
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
  if (autorizar != null && autorizar.equals("Aceptar")) 
  {
    String sComment = request.getParameter("firComentario").toString();
    String sReporta = request.getParameter("firReporta")!=null?(String)request.getParameter("firReporta"):"";
    
    instruccDAO.inusual_relevante_24horas(folio,0,sComment,"INUSUAL",(sReporta!=null?(sReporta.equals("on")?"1":"0"):"0" ) );
    
    out.print("<div class=\"texto\"><font color=\"#006600\"><b>Se ha incorporado el Comentario.</b></font></div>");
  }
  %>

  <tr class="celda02">
    <td>Descripcion:</td>
    <td>
       <input type="text" name="firComentario" size="100"  value="<%=instrucc.getValor1()!=null?instrucc.getValor1():(request.getParameter("firComentario")!=null?request.getParameter("firComentario"):"")%>">
    </td>
  </tr>   

    <tr>
      <td align="right" class="texto">
      <%
        String checkedFusuMteo = "";
        if(firReporta!=null&&firReporta.equals("on"))
            checkedFusuMteo = "checked=\"checked\"";
        else if (!(autorizar != null && autorizar.equals("Aceptar")))
        {
            if(instrucc.getValor2()!=null)
                if (instrucc.getValor2().equals("1")) {
                  checkedFusuMteo = "checked=\"checked\"";
                } 
        }        
      %>
      <input type="CHECKBOX" name="firReporta" <%=checkedFusuMteo%> />
      </td>
      <td class="texto">Reporta CNBV</td>
    </tr>
</table>
<table>
  <tr>
    <td align="right" class="texto">
      <DIV align="center">
        <P>
            <input type="button" name="Aceptar" class="boton" value="Aceptar" onClick="javascript:autorizar();" />
            <input type="button" name="Regresar" id="Regresar" class="btn btn-success" value="Regresar a la Bandeja" onClick="javascript:regresar();" />
        </P>
      </DIV>
    </td>
  </tr>
</table>

</form>