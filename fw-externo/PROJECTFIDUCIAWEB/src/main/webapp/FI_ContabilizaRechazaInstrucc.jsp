<!-- FI_BandejaEntrada.jsp -->
<%@ page import="java.text.*, java.util.*"%>
<jsp:useBean id="BD" class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="instruccDAO" class="mx.com.inscitech.clients.daos.InstruccDAO"/>
<%@ include file="Sesion.jsp"%>
<%
  String buscar = request.getParameter("Buscar");
  String txtFechaI = request.getParameter("txtFechaI");
  String botonContabilizar = request.getParameter("botonContabilizar");
  String botonRechazar = request.getParameter("botonRechazar");
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
    document.forma.action = "FI_Operacion.jsp?menu=6&Buscar=Buscar";
    document.forma.submit();
  }
  
  function detalle(folio, tipo) {
    document.forma.action = "FI_Operacion.jsp?menu=4&folio="+folio+"&tipo="+tipo+"&txtFechaI="+document.forma.txtFechaI.value+"&contabilizar=contabilizar";//confirmarInstruccion.jsp
    document.forma.submit();
  }  
  
  function contabilizar() {
  //alert('Ejecuta el stored procedure');
    var fideicomisoAsignar = "";
    for (j=0;j<document.forma.elements.length;j++) {
      if ((document.forma.elements[j].type=="checkbox")&&(document.forma.elements[j].checked) &&
          (document.forma.elements[j].name=="chkFideicomisoDisponible")) {
          fideicomisoAsignar = document.forma.elements[j].value;
          //alert(fideicomisoAsignar);
       }//if
    }//for
    document.forma.action = "FI_Operacion.jsp?menu=6&Buscar=Buscar&botonContabilizar=Contabilizar&fideicomisoAsignar=" + fideicomisoAsignar;
    document.forma.submit();
  }
  
  function rechazar() {
  //alert('entro');
    var fideicomisoAsignar = "";
    for (i=0;i<document.forma.elements.length;i++) {
      if ((document.forma.elements[i].type=="checkbox")&&(document.forma.elements[i].checked) &&
          (document.forma.elements[i].name=="chkFideicomisoDisponible")) {
          fideicomisoAsignar += document.forma.elements[i].value + "|";
          //alert(fideicomisoAsignar);
       }//if
    }//for
    document.forma.action = "FI_Operacion.jsp?menu=6&Buscar=Buscar&botonRechazar=Rechazar&fideicomisoAsignar=" + fideicomisoAsignar;
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
    <%
    if (botonContabilizar != null && botonContabilizar.equals("Contabilizar") && fideicomisoAsignar != null && fideicomisoAsignar.length() > 0) {
      resultadoSP = instruccDAO.contabilizarInstruccion(fideicomisoAsignar);
      if (resultadoSP !=null && resultadoSP.length() > 0  && resultadoSP.equals("0")) {
        out.print("<div class=\"texto\"><font color=\"#006600\"><b>La instruccion se ha contibilizado correctamente.</b></font></div>");
      } else {
        out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>La instruccion no fue contabilizada, no existe la operaci�n "+resultadoSP+" favor de verificar.</b></font></div>");
      
      }
    }
    %>
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
          <FONT size="2">Instrucciones Pendientes por Contabilizar (Contabilizar o Rechazar)</FONT>
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
            <td align="center">Importe</td>
            <td align="center">Moneda</td>
            <td align="center">Status</td>
          </tr>
          <%
              if (buscar != null && buscar.equals("Buscar")) {
                out.print(instruccDAO.generarTablaInstrucciones("AUTORIZADA", txtFechaI));
              }  
          %>            
        </table>
      </td>
    </tr>
    
    <tr><td align="center">&nbsp;</td></tr>
    
    <tr><td align="center">
      <input type="button" name="Contabilizar" class="boton" value="Contabilizar" onClick="javascript:contabilizar();"/>&nbsp;
      <input type="button" name="Rechazar" class="boton" value="Rechazar" onClick="javascript:rechazar();"/>    
    </td></tr>
    
    <tr><td align="center">&nbsp;</td></tr>
    
    <tr>
      <td align="right" class="texto">
        <DIV align="center">
          <P>
            <FONT size="2">Instrucciones Rechazadas (Consulta)</FONT>
          </P>
        </DIV>
      </td>
    </tr>

    <tr>
      <td align="right" class="texto">
        <table width="100%">
          <tr class="celda01" bgcolor="#999966">
            <td align="center">Fideicomiso</td>
            <td align="center">Folio</td>
            <td align="center">Fecha</td>
            <td align="center">Instrucci�n</td>
            <td align="center">Importe</td>
            <td align="center">Moneda</td>
            <td align="center">Status</td>
          </tr>
          <%
              if (buscar != null && buscar.equals("Buscar")) {
               out.print(instruccDAO.generarTablaInstrucciones("RECHAZADA", txtFechaI));
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