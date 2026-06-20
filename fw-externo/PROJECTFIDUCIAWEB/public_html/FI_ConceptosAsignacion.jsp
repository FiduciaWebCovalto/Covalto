<!-- FI_ConceptosAsignacion.jsp -->
<%@ page %>
<jsp:useBean id="fConceptosDAO" class="com.bancomext.daos.FConceptosDAO" />
<jsp:useBean id="fContratoDAO" class="com.bancomext.daos.FContratoDAO" />
<% 
try {
  String ctoNumContrato = request.getParameter("ctoNumContrato");
  String ctoNomContrato = fContratoDAO.obtenerDatosFideicomiso(ctoNumContrato);
  String botonBuscar = request.getParameter("botonBuscar");
  String radioConcepto = request.getParameter("radioConcepto")==null?"":request.getParameter("radioConcepto");
  String cveNumSecClave = request.getParameter("cveNumSecClave");
  String cveDesclave = request.getParameter("cveDesclave");
  String botonAsignar = request.getParameter("botonAsignar");
  String botonQuitar = request.getParameter("botonQuitar");
  String conceptoAsignar = request.getParameter("conceptoAsignar");
  String conceptoQuitar = request.getParameter("conceptoQuitar");
  
  String checkedDeposito = "";
  String checkedRetiro = "";

  if (radioConcepto.equals("75")) {
    //out.print("75");
    checkedDeposito = "checked=\"checked\"";
  } else if (radioConcepto.equals("128")) {
    //out.print("128");
    checkedRetiro = "checked=\"checked\"";
  } 
  
if (botonAsignar != null && botonAsignar.equals("Asignar") && conceptoAsignar != null && conceptoAsignar.length() > 0) {
  int resultado = fConceptosDAO.asignarConcepto(radioConcepto, conceptoAsignar, ctoNumContrato);
  if (resultado > 0) {
      out.print("<div class=\"texto\"><font color=\"#006600\"><b>La asignaci�n de conceptos al fideicomiso fue realizada correctamente.</b></font></div>");
      botonAsignar = null;
  } else {
      out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>La asignaci�n de conceptos al fideicomiso no fue satisfactoria, favor de verificar.</b></font></div>");
      botonAsignar = null;
  }
} else if (botonQuitar != null && botonQuitar.equals("Quitar") && conceptoQuitar != null && conceptoQuitar.length() > 0) {
  int resultado = fConceptosDAO.quitarConcepto(radioConcepto, conceptoQuitar, ctoNumContrato);
  if (resultado > 0) {
      out.print("<div class=\"texto\"><font color=\"#006600\"><b>La eliminaci�n de conceptos del fideicomiso fue realizada correctamente.</b></font></div>");
      botonQuitar = null;
  } else {
      out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>La eliminaci�n de conceptos del fideicomiso no fue satisfactoria, favor de verificar.</b></font></div>");
      botonQuitar = null;
  }
}  
%>
<script src="scripts/ApiConc.js"></script>

<script language="JavaScript" type="text/JavaScript">

  function buscar(ctrl) {
  
    if (ctrl != null  && ctrl.length > 0) {
      for (i=0;i<ctrl.length;i++) {
          if (ctrl[i].checked) {
            break;
          }
      }
    }
    if (ctrl[i]!=null) {
      //alert(ctrl[i].value);
      document.formaAdminConceptos.action = "FI_Administracion.jsp?menu=11&botonBuscar=Buscar&radioConcepto=" + ctrl[i].value;
      document.formaAdminConceptos.submit();  
      return true;
    } else {
      alert("Es necesario seleccionar un tipo de concepto.");
      return false;
    }   
  } 
  
  function regresar() {
    document.formaAdminConceptos.action = "FI_Administracion.jsp?menu=10";
    document.formaAdminConceptos.submit();  
  }    

  function limpiar() {
    document.formaAdminConceptos.radioConcepto.value = ''; 
    document.formaAdminConceptos.cveNumSecClave.value = ''; 
    document.formaAdminConceptos.action = "FI_Administracion.jsp?menu=11&radioConcepto=0";
    document.formaAdminConceptos.submit();  
  }
  
  function asignar() {
    var conceptoAsignar = "";
    for (i=0;i<document.formaAdminConceptos.elements.length;i++) {
      if ((document.formaAdminConceptos.elements[i].type=="checkbox")&&(document.formaAdminConceptos.elements[i].checked) &&
          (document.formaAdminConceptos.elements[i].name=="chkConceptoDisponible")) {
        conceptoAsignar += document.formaAdminConceptos.elements[i].value + "|";
       }//if
    }//for
    document.formaAdminConceptos.action = "FI_Administracion.jsp?menu=11&botonAsignar=Asignar&conceptoAsignar=" + conceptoAsignar;
    document.formaAdminConceptos.submit();
  }
  
  function quitar() {
    var conceptoQuitar = "";
    for (i=0;i<document.formaAdminConceptos.elements.length;i++) {
      if ((document.formaAdminConceptos.elements[i].type=="checkbox") && (document.formaAdminConceptos.elements[i].checked) &&
          (document.formaAdminConceptos.elements[i].name=="chkConceptoAsignado")) {
        conceptoQuitar += document.formaAdminConceptos.elements[i].value + "|";
       }//if
    }//for
    document.formaAdminConceptos.action = "FI_Administracion.jsp?menu=11&botonQuitar=Quitar&conceptoQuitar=" + conceptoQuitar;
    document.formaAdminConceptos.submit();
  }    
  
</script>

<form id="formaAdminConceptos" name="formaAdminConceptos" action="procesarDatos"  method="post">
  <input type="hidden" id="ctoNumContrato" name="ctoNumContrato" value="<%=ctoNumContrato%>" />
<input type="hidden" name="accion" value="fisoconceptos"/>
  
  <table width="90%" align="center">
    <tr>
      <td align="right" class="texto">
        <DIV align="left">
          Numero de Fideicomiso:&nbsp;&nbsp;&nbsp;<b><%=ctoNumContrato%></b>
        </DIV>
      </td>
      <td class="texto">&nbsp;</td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <DIV align="left">
          Nombre del Fideicomiso:&nbsp;&nbsp;<b><%=ctoNomContrato%></b>
        </DIV>
      </td>
      <td class="texto">&nbsp;</td>
    </tr>    
    <tr>
      <td class="texto">No. de Clave / Descripcion:&nbsp;<input type="text" name="cveNumSecClave" value="<%= cveNumSecClave==null?"":cveNumSecClave%>"></td>
    </tr>
    <tr>
      <td class="texto" colspan="2">Tipo:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="radio" id="radioConcepto" name="radioConcepto" value="75" <%=checkedDeposito%> />Dep&oacute;sito&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="radio" id="radioConcepto" name="radioConcepto" value="128" <%=checkedRetiro%> />Retiro
      </td>
    </tr>
    <tr>
      <td align="center" class="texto" colspan="2">
        <input type="button" name="Buscar" id="Buscar"  class="btn btn-info" value="Buscar" onClick="javascript:buscar(document.formaAdminConceptos.radioConcepto);"/>&nbsp;
        <input type="button" name="Limpiar" id="Limpiar" class="btn btn-warning" value="Limpiar" onClick="javascript:limpiar();"/>
      </td>
    </tr>
    <tr><td colspan="2">&nbsp;</td></tr>
    <tr>
      <td>
        <DIV align="center">
            <P class="lead">
              Conceptos Disponibles
            </P>
        </DIV>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
            <div class="table-responsive" style="max-height: 450px; overflow-y: auto;">
                <table id="fisosDisponibles"  class="table table-responsive table-hover">
                    <thead class="table-primary">
                        <tr>
                            <th align="center">&nbsp;</th>
                            <th align="center">No Clave</th>
                            <th align="center">No Secuencial</th>
                            <th align="center">Concepto</th>
                            <th align="center">Tipo</th>
                        </tr>
                    </thead>
                    <tbody>
                      <%
                        if (radioConcepto != null && radioConcepto.length()>1) {          
                          out.print(fConceptosDAO.generarTablaConceptosDisponibles(ctoNumContrato, cveNumSecClave, cveDesclave, radioConcepto));
                       }
                      %>  
                    </tbody>
                </table>
            </div>      
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <P>&nbsp;</P>
        <P>
          <input type="button" name="Agregar" class="btn btn-primary" value="Asignar" onClick="javascript:enviarSeleccion(1,'fisoconceptos');"/>&nbsp;
          <input type="button" name="Quitar" class="btn btn-danger" value="Quitar" onClick="javascript:enviarSeleccion(2,'fisoconceptos');"/>
        </P>
      </td>
    </tr>
    <tr>
      <td>
        <DIV align="center">
            <P class="lead">
              Conceptos Asignados
            </P>
        </DIV>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
            <div class="table-responsive" style="max-height: 450px; overflow-y: auto;">
                <table id="fisosAsignados"  class="table table-responsive table-hover">
                    <thead class="table-primary">
                        <tr>
                            <th align="center">&nbsp;</th>
                            <th align="center">No Clave</th>
                            <th align="center">No Secuencial</th>
                            <th align="center">Concepto</th>
                            <th align="center">Tipo</th>
                        </tr>
                    </thead>
                    <tbody>
                      <%
                        if (radioConcepto != null && radioConcepto.length()>0) {  
                          out.print(fConceptosDAO.generarTablaConceptosAsignados(ctoNumContrato, radioConcepto));
                        }  
                      %>  
                    </tbody>
                </table>
            </div>        
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="button" name="Regresar" id="Regresar" class="btn btn-success" value="Regresar" onClick="javascript:regresar()"/>
      </td>
    </tr>
  </table>
</form>
<% 
} catch (Exception e) {
e.printStackTrace();
}
%>