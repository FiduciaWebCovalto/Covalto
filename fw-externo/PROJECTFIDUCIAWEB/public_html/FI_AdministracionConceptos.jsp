<!-- FI_AdministracionConceptos.jsp -->
<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fContratoDAO" class="com.bancomext.daos.FContratoDAO"/>
<% 
try {
String ctoNumContrato = request.getParameter("ctoNumContrato");
String ctoNomContrato = request.getParameter("ctoNomContrato");
String fusuNombreUsuario = request.getParameter("fusuNombreUsuario");
String buscar = request.getParameter("Buscar");
%>

<script language="JavaScript" type="text/JavaScript">

  function buscar() {
    document.formUsuarioFideicomiso.action = "FI_Administracion.jsp?menu=10&Buscar=Buscar";
    document.formUsuarioFideicomiso.submit();
  }

  function asignarQuitar(ctrl) {
    if (ctrl != null && ctrl.length > 0) {
      for (i=0;i<ctrl.length;i++) {
          if (ctrl[i].checked) {
            break;
          }
      }    
    } else if (ctrl != null && ctrl.value > 0 && ctrl.checked) {
          document.formUsuarioFideicomiso.action = "FI_Administracion.jsp?menu=11&ctoNumContrato=" + ctrl.value;
          document.formUsuarioFideicomiso.submit(); 
    } else {
      Swal.fire('warning', 'Es necesario buscar y seleccionar un Fideicomiso', 'warning')
      return false;
    }
    
    //validaciones 2 de 2
    if (ctrl[i]!=null) {
      document.formUsuarioFideicomiso.action = "FI_Administracion.jsp?menu=11&ctoNumContrato=" + ctrl[i].value;
      document.formUsuarioFideicomiso.submit();  
    } else {
      Swal.fire('warning', 'Es necesario seleccionar un Fideicomiso', 'warning')
      return false;
    }  
  }

  function limpiar() {
    document.formUsuarioFideicomiso.ctoNomContrato.value = '';
    document.formUsuarioFideicomiso.action = "FI_Administracion.jsp?menu=10";
    document.formUsuarioFideicomiso.submit();
  }

</script>

<form name="formUsuarioFideicomiso" method="post" action="">
  <table width="90%" align="center" id="datos">
    <tr>
      <td align="right" class="texto">
        <DIV align="left">No./Nombre de Fideicomiso:&nbsp;&nbsp;&nbsp;
          <input type="text" name="ctoNumContrato" style=" WIDTH: 100px" maxlength="50" value="<%= ctoNumContrato==null?"":ctoNumContrato%>" />
        </DIV>
      </td>
      <td class="texto">&nbsp;</td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <DIV align="left">&nbsp;
          <input type="button" name="Buscar" id="Buscar"  class="btn btn-info" value="Buscar" onClick="javascript:buscar();"/>&nbsp;
          <input type="button" name="Limpiar" id="Limpiar" class="btn btn-warning" value="Limpiar" onClick="javascript:limpiar();"/>
        </DIV>
      </td>
      <td class="texto">&nbsp;</td>
    </tr>    
    <tr>
      <td class="texto" align="right" colspan="2">
        <DIV align="center">
          <P>&nbsp;</P>
          <P>
            <FONT size="2">Fideicomisos</FONT> 
          </P>
        </DIV>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <div class="table-responsive" style="max-height: 450px; overflow-y: auto;">
            <table  class="table table-responsive table-hover">
                  <thead class="table-primary">
                    <tr>
                        <th align="center">&nbsp;</th>
                        <th align="center">No. de Fideicomiso</th>
                        <th align="center">Nombre</th>          
                    </tr>
                  </thead>   
                  <tbody>
                    <%
                      if (buscar != null && buscar.equals("Buscar")) {
                        out.print(fContratoDAO.generaTablaFideicomisos(ctoNumContrato));
                      }  
                    %>            
                  </tbody>
              </table>      
          </div>
      </td>
    </tr>
    <tr><td>&nbsp;</td></tr>
    <tr>
      <td colspan="2" align="center">
        <P>
          <input type="button" name="Asignar" class="btn btn-primary" value="Asignar/Quitar Conceptos" onClick="javascript:asignarQuitar(document.formUsuarioFideicomiso.radioContrato);"/>&nbsp; 
        </P>
      </td>
    </tr>
  </table>
</form>
<% 
} catch (Exception e) {
e.printStackTrace();
}
%>