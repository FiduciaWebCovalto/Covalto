<!-- FI_CharolaOperacionesInternasSospechosas.jsp -->
<%@ page import="java.text.*, java.util.*"%>
<jsp:useBean id="BD" class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="instruccDAO" class="mx.com.inscitech.clients.daos.InstruccDAO"/>
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
    document.forma.action = "FI_Operacion.jsp?menu=9&Buscar=Buscar";
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
    document.forma.action = "FI_Operacion.jsp?menu=9&Buscar=Buscar&botonContabilizar=Contabilizar&fideicomisoAsignar=" + fideicomisoAsignar;
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
    document.forma.action = "FI_Operacion.jsp?menu=9&Buscar=Buscar&botonRechazar=Rechazar&fideicomisoAsignar=" + fideicomisoAsignar;
    document.forma.submit();
  }
  
  function aceptaInterna() {
  //alert('entro');
    
    var fideicomisoAsignar = "";
    for (i=0;i<document.forma.elements.length;i++) {
      if ((document.forma.elements[i].type=="checkbox")&&(document.forma.elements[i].checked) &&
          (document.forma.elements[i].name=="chkFideicomisoDisponible")) {
          fideicomisoAsignar += document.forma.elements[i].value + "|";
          //alert(fideicomisoAsignar);
       }//if
    }//for
    
    // selecciona instrucciones
    if(fideicomisoAsignar.length==0)
    {
      alert("Seleccione Instrucci�n");
      return;
    }
    
    // selecciona ejecutivos
    if(document.getElementById("cboEjecutivo").selectedIndex==0)
    {
      alert("Seleccione Ejecutivo");
      return;
    }
    
    document.forma.action = "FI_Operacion.jsp?menu=9&Buscar=Buscar&botonInterna=Interna&fideicomisoAsignar=" + fideicomisoAsignar;
    document.forma.submit();
  }
  
  function internaPreocupante(btnPreocupante)
  {
    document.getElementById('dvPreocupante').style.visibility = "visible";
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
    if (botonContabilizar != null && botonContabilizar.equals("Contabilizar") && fideicomisoAsignar != null && fideicomisoAsignar.length() > 0) 
    {
        instruccDAO.aceptaInstruccion(fideicomisoAsignar);
        out.print("<div class=\"texto\"><font color=\"#006600\"><b>La instrucci�n ha sido aceptada correctamente.</b></font></div>");
    }
    if (botonInterna != null && botonInterna.equals("Interna") && fideicomisoAsignar != null && fideicomisoAsignar.length() > 0) 
    {
      int iEjecutivo = Integer.parseInt(request.getParameter("cboEjecutivo").toString());
      String sComment = request.getParameter("txtDescripcion").toString();
    
      instruccDAO.internaSospechosa(fideicomisoAsignar,iEjecutivo,sComment,"SOSPECHOSA");
      
      out.print("<div class=\"texto\"><font color=\"#006600\"><b>Se ha alertado de la persona Interna Preocupante.</b></font></div>");
      
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
          <FONT size="2">Instrucciones Internas Sospechosas</FONT>
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
                out.print(instruccDAO.generarTablaInstrucciones("ACTIVO','ENVIO A FIDUCIA','TRANSITO','RELEVANTE','INUSUAL','24 HORAS','AUTORIZADA", txtFechaI));
              }  
          %>            
        </table>
      </td>
    </tr>
    
    <tr><td align="center">&nbsp;</td></tr>
    
    <tr><td align="center">
      <input type="button" name="Contabilizar" class="boton" value="Aceptar" onClick="javascript:contabilizar();"/>&nbsp;
      <input type="button" name="Rechazar" class="boton" value="Rechazar" onClick="javascript:rechazar();"/>    
      <input type="button" name="Interna" class="boton" value="Interna Preocupante" onClick="javascript:internaPreocupante(this);"/>    
    </td></tr>
    
    <tr><td align="center">&nbsp;</td></tr>
    <tr>
      <td align="center" id="dvPreocupante" style="visibility:hidden;">
          <table class="texto">
            <tr>
              <td class="subtitulo">Interna Preocupante<hr/></td>
            </tr>
            <tr>
              <td>Persona:</td>
            </tr>
            <tr>
              <td>
                  <select id="cboEjecutivo" name="cboEjecutivo" >
                    <option>Seleccione Ejecutivo 
                    <%
                        String temporal=request.getParameter("cboEjecutivo");   
                        if(request.getParameter("cboEjecutivo")!=null&&!temporal.equals("Seleccione Ejecutivo"))
                          out.print(BD.DataCombos(54,"",request.getParameter("cboEjecutivo")));
                        else
                          out.print(BD.DataCombos(54,"",""));
                    %>
                    </option>
                  </select>  
              </td>
            </tr>
            <tr>
              <td>Comentario:</td>
            </tr>
            <tr>
              <td>
                <textarea name="txtDescripcion" cols="25"></textarea>
              </td>
            </tr>
            <tr>
              <td align="right"><input type="button" name="AceptaInterna" class="boton" value="Aceptar" onClick="javascript:aceptaInterna();"/> </td>
            </tr>
          </table>
      </td>
    </tr>
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