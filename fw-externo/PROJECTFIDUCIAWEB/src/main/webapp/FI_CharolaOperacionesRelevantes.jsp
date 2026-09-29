<!-- FI_CharolaOperacionesRelevantes.jsp -->
<%@ page import="java.text.*, java.util.*"%>
<jsp:useBean id="BD" class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="instruccDAO" class="com.bancomext.daos.InstruccDAO"/>
<jsp:useBean id="instrucc" class="com.bancomext.beans.Instrucc"/>
<%@ include file="Sesion.jsp"%>
<%
  String buscar = request.getParameter("Buscar");
  String txtFechaI = request.getParameter("txtFechaI");
  String firFolio = request.getParameter("firComentario2");
  String firRFC = request.getParameter("firRFC");
  String firFideicomiso = request.getParameter("firFideicomiso");
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

  function limpiar() {
    document.forma.firComentario2.value='';
    document.forma.firRFC.value='';
    document.forma.firFideicomiso.value='';
//    document.forma.action = "FI_Operacion.jsp?menu=7";
 //   document.forma.submit();
  }

  function buscar() {
    document.forma.action = "FI_Operacion.jsp?menu=7&Buscar=Buscar";
    document.forma.submit();
  }

  
  function detalle(folio, tipo) {
    document.forma.action = "FI_Operacion.jsp?menu=11&folio="+folio+"&tipo="+tipo+"&txtFechaI="+document.forma.txtFechaI.value+"&contabilizar=contabilizar";//confirmarInstruccion.jsp
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
    document.forma.action = "FI_Operacion.jsp?menu=7&Buscar=Buscar&botonContabilizar=Contabilizar&fideicomisoAsignar=" + fideicomisoAsignar;
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
    document.forma.action = "FI_Operacion.jsp?menu=7&Buscar=Buscar&botonRechazar=Rechazar&fideicomisoAsignar=" + fideicomisoAsignar;
    document.forma.submit();
  }
  
  function aceptaInterna() 
  {  
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
    
    document.forma.action = "FI_Operacion.jsp?menu=7&Buscar=Buscar&botonInterna=Comentario&fideicomisoAsignar=" + fideicomisoAsignar;
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
        <input type="button" id="cboCalendarioI" name="cboCalendarioI" style=" WIDTH: 120px" value="<%=request.getParameter("txtFechaI")!=null?request.getParameter("txtFechaI"):fecha%>" onChange="forma.txtFechaI.value=forma.cboCalendarioI.value;"/>
        <input type="button" id="lanzaCalendarioI" name="lanzaCalendarioI" style=" WIDTH: 15px" class="botonCbo" value=""/>
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
      <td align="left" class="texto">Folio:
        <input type="text" name="firComentario2" maxlength=15 size="15" value="<%=request.getParameter("firComentario2")!=null?request.getParameter("firComentario2"):""%>" class="texto">       
      </td>
    </tr>
    <tr>
      <td align="left" class="texto">RFC:
        <input type="text" name="firRFC" maxlength=15 size="15" value="<%=request.getParameter("firRFC")!=null?request.getParameter("firRFC"):""%>" class="texto">       
      </td>
    </tr>
    <tr>
      <td align="left" class="texto">Fideicomiso:
        <input type="text" name="firFideicomiso" maxlength=15 size="15" value="<%=request.getParameter("firFideicomiso")!=null?request.getParameter("firFideicomiso"):""%>" class="texto">       
      </td>
    </tr>
    <tr>
      <td align="left" class="texto">
        <input type="button" name="Buscar" id="Buscar"  class="btn btn-info" value="Buscar" onClick="javascript:buscar();"/>
        <input type="button" name="Limpiar" id="Limpiar" class="btn btn-warning" value="Limpiar" onClick="javascript:limpiar();"/>
      </td>
    </tr>


    <%
    if (botonContabilizar != null && botonContabilizar.equals("Contabilizar") && fideicomisoAsignar != null && fideicomisoAsignar.length() > 0) 
    {
        instruccDAO.aceptaInstruccion(fideicomisoAsignar);
        out.print("<div class=\"texto\"><font color=\"#006600\"><b>La instrucci�n ha sido aceptada correctamente.</b></font></div>");
    }
    if (botonInterna != null && botonInterna.equals("Comentario") && fideicomisoAsignar != null && fideicomisoAsignar.length() > 0) 
    {
            String sComment = request.getParameter("txtDescripcion").toString();
            String sReporta = request.getParameter("fReporta");
    
      instruccDAO.inusual_relevante_24horas(fideicomisoAsignar,0,sComment,"INUSUAL",(sReporta.equals("on")&&sReporta!=null?"1":"0"));
      
      out.print("<div class=\"texto\"><font color=\"#006600\"><b>Se ha incorporado el Comentario.</b></font></div>");
      
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
          <FONT size="2">Instrucciones Relevantes / Inusuales / 24 Horas</FONT>
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
            <td align="center">Status</td>
            <td align="center">Comentario Ejec</td>
          </tr>
          <%
              if (buscar != null && buscar.equals("Buscar")) {
                out.print(instruccDAO.generarTablaInstruccionesOpePLD("INUSUAL','RELEVANTE','24 HORAS", txtFechaI,firFolio,firRFC,firFideicomiso));
              }  
          %>            
        </table>
      </td>
    </tr>
    
    <tr><td align="center">&nbsp;</td></tr>
    
    <tr><td align="center">
      <!--input type="button" name="Contabilizar" class="boton" value="Aceptar" onClick="javascript:contabilizar();"/-->
      <!--input type="button" name="Rechazar" class="boton" value="Rechazar" onClick="javascript:rechazar();"/-->    
    </td></tr>
    
    <tr><td align="center">&nbsp;</td></tr>
    <tr>
      <td align="center" id="dvPreocupante" style="visibility:hidden;">
          <table class="texto">
            <tr>
              <td class="subtitulo">Instrucciones Relevantes / Inusuales / 24 Horas<hr/></td>
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
              <td align="right" class="texto">
              <%
                String checkedFusuMteo = "";
               /* if(instrucc.getValor2()!=null){
                    if (instrucc.getValor2().equals("1")) {
                      checkedFusuMteo = "checked=\"checked\"";
                    } 
                 } */  
              %>
              <input type="CHECKBOX" name="fReporta" <%=checkedFusuMteo%> />
              </td>
              <td class="texto">Reporta CNBV</td>
            </tr>            
            <tr>
              <td align="right"><input type="button" name="AceptaInterna" class="boton" value="Aceptar" onClick="javascript:aceptaInterna();"/> </td>
            </tr>
          </table>
      </td>
    </tr>
    <tr><td align="center">&nbsp;</td></tr>


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