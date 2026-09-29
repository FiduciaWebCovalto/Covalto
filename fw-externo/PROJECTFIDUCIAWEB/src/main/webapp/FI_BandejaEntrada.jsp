<!-- FI_BandejaEntrada.jsp -->
<%@ page import="java.text.*, java.util.*"%>
<jsp:useBean id="BD" class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="instruccDAO" class="com.bancomext.daos.InstruccDAO"/>
<%@ include file="Sesion.jsp"%>
<%

  String username = session.getAttribute("username").toString();
  
  String buscar = request.getParameter("Buscar");
  String txtFechaI = request.getParameter("txtFechaI");
  String botonAsignar = request.getParameter("botonAsignar");
  String botonQuitar = request.getParameter("botonQuitar");
  String botonAceptarMovimiento = request.getParameter("botonAceptarMovimiento");
  
  String botonGenerarArchivo = request.getParameter("botonGenerarArchivo");
  String fideicomisoAsignar = request.getParameter("fideicomisoAsignar");
  String fideicomisoQuitar = request.getParameter("fideicomisoQuitar");
  
  String archivoGenerado = new String();
  
if (botonAsignar != null && botonAsignar.equals("Asignar") && fideicomisoAsignar != null && fideicomisoAsignar.length() > 0) {
  instruccDAO.agregarInstruccion(fideicomisoAsignar);
} else if (botonQuitar != null && botonQuitar.equals("Quitar") && fideicomisoQuitar != null && fideicomisoQuitar.length() > 0) {
  instruccDAO.quitarInstruccion(fideicomisoQuitar);
} else if (botonAceptarMovimiento != null && botonAceptarMovimiento.equals("AceptarMovimiento") && fideicomisoQuitar != null && fideicomisoQuitar.length() > 0) { 
  instruccDAO.aceptarMovimiento(fideicomisoQuitar, username);
  out.print("<div class=\"texto\"><font color=\"#006600\"><b>La instruccion se ha aplicado correctamente.</b></font></div>");
  
}

%>
<script language="JavaScript" type="text/JavaScript">

  function generarArchivo(moneda) {
  //alert(moneda);
    if (moneda == 1) {
      document.formaBandeja.action = "archivo_instrucciones_nacionales.jsp?txtFechaI=" + document.formaBandeja.txtFechaI.value + "&moneda=" + moneda;
      } else { 
      document.formaBandeja.action = "archivo_instrucciones_extranjeras.jsp?txtFechaI=" + document.formaBandeja.txtFechaI.value + "&moneda=" + moneda;
    }
    document.formaBandeja.submit();
  } 
  
  function buscar() {
    document.formaBandeja.action = "FI_Operacion.jsp?menu=2&Buscar=Buscar";
    document.formaBandeja.submit();
  }
  
  function detalle(folio, tipo) {
    document.formaBandeja.action = "FI_Operacion.jsp?menu=4&folio="+folio+"&tipo="+tipo+"&txtFechaI="+document.formaBandeja.txtFechaI.value;//confirmarInstruccion.jsp
    document.formaBandeja.submit();
  }  
  
  function asignar() {
  //alert('entro');
    var fideicomisoAsignar = "";
    for (i=0;i<document.formaBandeja.elements.length;i++) {
      if ((document.formaBandeja.elements[i].type=="checkbox")&&(document.formaBandeja.elements[i].checked) &&
          (document.formaBandeja.elements[i].name=="chkFideicomisoDisponible")) {
          fideicomisoAsignar += document.formaBandeja.elements[i].value + "|";
          //alert(fideicomisoAsignar);
       }//if
    }//for
    document.formaBandeja.action = "FI_Operacion.jsp?menu=2&Buscar=Buscar&botonAsignar=Asignar&fideicomisoAsignar=" + fideicomisoAsignar;
    document.formaBandeja.submit();
  }
  
  function quitar() {
    var fideicomisoQuitar = "";
    for (i=0;i<document.formaBandeja.elements.length;i++) {
      if ((document.formaBandeja.elements[i].type=="checkbox") && (document.formaBandeja.elements[i].checked) &&
          (document.formaBandeja.elements[i].name=="chkFideicomisoAsignado")) {
        fideicomisoQuitar += document.formaBandeja.elements[i].value + "|";
       }//if
    }//for
    document.formaBandeja.action = "FI_Operacion.jsp?menu=2&Buscar=Buscar&botonQuitar=Quitar&fideicomisoQuitar=" + fideicomisoQuitar;
    document.formaBandeja.submit();
  }

  function aceptarMovimiento() {
    var fideicomisoQuitar = "";
    for (i=0;i<document.formaBandeja.elements.length;i++) {
      if ((document.formaBandeja.elements[i].type=="checkbox") && (document.formaBandeja.elements[i].checked) &&
          (document.formaBandeja.elements[i].name=="chkFideicomisoAsignado")) {
        fideicomisoQuitar += document.formaBandeja.elements[i].value + "|";
       }//if
    }//for
    document.formaBandeja.action = "FI_Operacion.jsp?menu=2&Buscar=Buscar&botonAceptarMovimiento=AceptarMovimiento&fideicomisoQuitar=" + fideicomisoQuitar;
    document.formaBandeja.submit();
  }   
  
</script>  

<form name="formaBandeja" method="post" action="">
  <table width="100%" align="center" id="datos">
    <tr>
      <td align="left" class="texto">Fecha:
        <input type="hidden" name="txtFechaI" maxlength=10 size="8" value="<%=request.getParameter("txtFechaI")!=null?request.getParameter("txtFechaI"):fecha%>" class="texto">       
        <input type="button" id="cboCalendarioI" name="cboCalendarioI" style=" WIDTH: 60px" value="<%=request.getParameter("txtFechaI")!=null?request.getParameter("txtFechaI"):fecha%>" onChange="formaBandeja.txtFechaI.value=formaBandeja.cboCalendarioI.value;"/>
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
      if ((session.getAttribute("permiso")!=null && ((String)session.getAttribute("permiso")).equals("LIBERA INSTRUCCIONES"))) {          
    %>
    <tr>
      <td align="right" class="texto">
        <DIV align="center">
          <P>
            <input type="button" name="Aceptar Movimiento" class="boton" value="Aceptar Movimiento" onClick="aceptarMovimiento();"/>
            <br><br>
            <input type="button" name="Genera Archivo" class="boton" value="Genera Archivo Instrucciones Nacionales" onClick="javascript:generarArchivo('1');"/>
            <input type="button" name="Genera Archivo" class="boton" value="Genera Archivo Instrucciones Extranjeras" onClick="javascript:generarArchivo('0');"/>
          </P>
          <P>&nbsp;</P>
        </DIV>
      </td>
    </tr>
    <%
      }
    %> 
    
    <tr>
      <td align="right" class="texto">
        <DIV align="center">
          <FONT size="2">Instrucciones Pendientes por Validar (Abogado)</FONT> 
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
                out.print(instruccDAO.generarTablaInstrucciones("ACTIVO','24 HORAS','INUSUAL','RELEVANTE", txtFechaI));
              }  
          %>            
        </table>
      </td>
    </tr>
    
    <tr><td>&nbsp;</td></tr>
    
    <tr>
      <td align="right" class="texto">
        <DIV align="center">
          <P>
            <FONT size="2">Instrucciones Pendientes por Validaci�n Presupuestal o Env�o a Fiducia</FONT> 
          </P>
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
               out.print(instruccDAO.generarTablaInstrucciones("ENVIO A FIDUCIA", txtFechaI));
              }  
          %>            
        </table>
      </td>
    </tr>

    <tr>
      <td align="center" class="texto">
          <input type="button" name="Agregar" class="boton" value="Agregar" onClick="javascript:asignar();"/>&nbsp;
          <input type="button" name="Quitar" class="btn btn-danger" value="Quitar" onClick="javascript:quitar();"/>
      </td>
    </tr>
    
    <tr>
      <td align="right" class="texto">
        <DIV align="center">
          <P>
            <FONT size="2">Instrucciones Listas para Env�o a Fiducia</FONT> 
          </P>
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
          </tr>
          <%
              if (buscar != null && buscar.equals("Buscar")) {
                out.print(instruccDAO.generarTablaInstrucciones("TRANSITO", txtFechaI));
              }  
          %>            
        </table>
      </td>
    </tr>
    
  </table>
</form>
