<!-- FI_CharolaInstruccionConsulta.jsp -->
<%@ page import="java.text.*, java.util.*"%>
<jsp:useBean id="BD" class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="instruccDAO" class="com.bancomext.daos.InstruccDAO"/>
<%@ include file="Sesion.jsp"%>
<%
  String buscar = request.getParameter("Buscar");
  String txtFechaI = request.getParameter("txtFechaI");
  String botonContabilizar = request.getParameter("botonContabilizar");
  String botonRechazar = request.getParameter("botonRechazar");
  String botonInterna = request.getParameter("botonInterna");
  
  String fideicomisoAsignar = request.getParameter("fideicomisoAsignar");
  String fideicomisoQuitar = request.getParameter("fideicomisoQuitar");
  String resultadoSP = new String();
  String archivoGenerado = new String();
  
if (botonRechazar != null && botonRechazar.equals("Rechazar") && fideicomisoAsignar != null && fideicomisoAsignar.length() > 0) {
  instruccDAO.rechazarInstruccion(fideicomisoAsignar);
} 

%>
<script language="JavaScript" type="text/JavaScript">

  function buscar() {
    document.forma.action = "FI_Operacion.jsp?menu=10&Buscar=Buscar";
    document.forma.submit();
  }
  
  function detalle(folio, tipo) {
    document.forma.action = "FI_Operacion.jsp?menu=4&folio="+folio+"&tipo="+tipo+"&txtFechaI="+document.forma.txtFechaI.value+"&contabilizar=contabilizar";//confirmarInstruccion.jsp
    document.forma.submit();
  }  
  
</script>  
<%
  if (session.getAttribute("permiso")!=null && session.getAttribute("permiso").equals("LIBERA INSTRUCCIONES")) {
%>            
<form name="forma" method="post" action="">
  <table width="100%" align="center" id="datos">
    <tr>
      <td align="left" class="texto">Fecha:
        <input type="hidden" name="txtFechaI" maxlength=10 size="8" value="<%=request.getParameter("txtFechaI")!=null?request.getParameter("txtFechaI"):fecha%>" class="texto">       
        <input type="button" id="cboCalendarioI" name="cboCalendarioI" style=" WIDTH: 60px" value="<%=request.getParameter("txtFechaI")!=null?request.getParameter("txtFechaI"):fecha%>" onChange="forma.txtFechaI.value=forma.cboCalendarioI.value;"/>
        <input type="button" id="lanzaCalendarioI" name="lanzaCalendarioI" style=" WIDTH: 15px" class="botonCbo" value="v"/>
        <input type="button" name="Buscar" id="Buscar"  class="btn btn-info" value="Buscar" onClick="javascript:buscar();"/>
        <SCRIPT type="text/javascript">
          // script que define y configura el calendario-
          Calendar.setup({
            inputField     :    "cboCalendarioI",      // id del campo de texto
            ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
            button         :    "lanzaCalendarioI"   // el id del bot�n que lanzar� el calendario
          });					
			   </SCRIPT>
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <DIV align="center">
          <P>&nbsp;
          </P>
        </DIV>
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <DIV align="center">
          <FONT size="2">Instrucciones Relevantes / Inusuales / 24 Horas / Internas Preocupantes</FONT>
        </DIV>
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <table width="100%">
          <tr class="celda01" bgcolor="#999966">
            <td align="center">&nbsp;</td>
            <td align="center">Fideicomiso</td>
            <td align="center">Folio</td>
            <td align="center">Fecha</td>
            <td align="center">Instrucci�n</td>
            <td align="center">Tipo</td>
            <td align="center">Status</td>
          </tr>
          <%
              if (buscar != null && buscar.equals("Buscar")) {
                out.print(instruccDAO.generarTablaInstruccionesOpePLD("ACTIVO", txtFechaI));
              }  
          %>            
        </table>
      </td>
    </tr>


    <tr>
      <td align="center" class="texto">
          &nbsp;
      </td>
    </tr>
  </table>
</form>

<%
 } else {
%>
  <table>
  <tr> 
  <td align="center" class="alerta">Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operaci�n<br></td>
  </tr>
  </table>
<%          
  }
%> 