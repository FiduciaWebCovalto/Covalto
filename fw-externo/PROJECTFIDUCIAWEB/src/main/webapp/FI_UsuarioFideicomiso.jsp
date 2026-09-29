<!-- FI_UsuarioFideicomiso.jsp -->
<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fContratoDAO" class="com.bancomext.daos.FContratoDAO"/>
<jsp:useBean id="fUsuario" class="com.bancomext.beans.FUsuario"/>

<% 
try {
String fusuIdUsuario = request.getParameter("fusuIdUsuario");
System.out.println("fusuIdUsuario: " + fusuIdUsuario);
String fusuNombreUsuario = request.getParameter("fusuNombreUsuario")==null?"":request.getParameter("fusuNombreUsuario");
String ctoNumContrato = request.getParameter("ctoNumContrato");
String ctoNomContrato = request.getParameter("ctoNomContrato");
String buscar = request.getParameter("Buscar");
String botonAsignar = request.getParameter("botonAsignar");
String botonQuitar = request.getParameter("botonQuitar");
String fideicomisoAsignar = request.getParameter("fideicomisoAsignar");
String fideicomisoQuitar = request.getParameter("fideicomisoQuitar");
System.out.println("fideicomisoAsignar: "+fideicomisoAsignar);
System.out.println("fusuIdUsuario: "+fusuIdUsuario);
%>
<script src="scripts/Api.js"></script>
<script language="JavaScript" type="text/JavaScript">
  function buscar() {
    document.formUsuarioFideicomiso.action = "FI_Administracion.jsp?menu=5&Buscar=Buscar&fusuNombreUsuario"+document.formUsuarioFideicomiso.fusuNombreUsuario.value;
    document.formUsuarioFideicomiso.submit();
  }

  function limpiar() {
    ctoNumContrato.value = '';
    document.formUsuarioFideicomiso.action = "FI_Administracion.jsp?menu=5";
    document.formUsuarioFideicomiso.submit();
  }
  
  function cancelar() {
    document.formUsuarioFideicomiso.action = "FI_Administracion.jsp?menu=1";
    document.formUsuarioFideicomiso.submit();
  }
  
  function regresar() {
    document.formUsuarioFideicomiso.action = "FI_Administracion.jsp?menu=1&botonAceptar=Aceptar";
    document.formUsuarioFideicomiso.submit();
  }
</script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>        
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script> 
<form id="formUsuarioFideicomiso" name="formUsuarioFideicomiso" action="procesarDatos" method="post">
<input type="hidden" name="fusuIdUsuario" value="<%=fusuIdUsuario%>">
<input type="hidden" name="fusuNombreUsuario" value="<%=fusuNombreUsuario%>">
<input type="hidden" name="accion" value="usuariofideicomiso"/>
  <table class="table table-responsive table-hover" id="datos">
  <thead class="table-primary">
        <tr class="table-primary">
        <td>Nombre del usuario:&nbsp;&nbsp;
         <%=fusuNombreUsuario%></td>
        </tr>
        <tr class="table-primary">
        <td>No./Nombre de Fideicomiso:&nbsp;&nbsp;&nbsp;
          <input type="text" name="ctoNumContrato" id="ctoNumContrato" style=" WIDTH: 300px" maxlength="50"/></td>
        </tr>                 
   </thead>
   <tbody>
    <tr>
      <td>
        <DIV align="center">
          <input type="button" name="Buscar" id="Buscar" class="btn btn-primary" value="Buscar" onClick="javascript:buscar()"/>&nbsp;
          <input type="button" name="Limpiar" id="Limpiar" class="btn btn-warning" value="Limpiar" onClick="javascript:limpiar()"/>&nbsp;
          <input type="button" name="Regresar" id="Regresar" class="btn btn-danger" value="Regresar" onClick="javascript:regresar();"/>&nbsp;
        </DIV>
      </td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>
        <DIV align="center">
          <p class="lead">
            Fideicomisos Disponibles 
          </P>
        </DIV>
      </td>
    </tr>
    <tr>
        <td>
            <div class="table-responsive" style="max-height: 450px; overflow-y: auto;">
                <table id="fisosDisponibles"  class="table table-responsive table-hover">
                    <thead class="table-primary">
                        <tr>
                            <th>Seleccionar</th>
                            <th>Usuario</th>
                            <th>No. Fideicomiso</th>
                            <th>Nombre</th>
                        </tr>
                    </thead>
                    <tbody>
                    <%
                            out.print(fContratoDAO.generarTablaFideicomisosDisponibles(fusuIdUsuario, ctoNumContrato, ctoNomContrato));
                      %>   
                    </tbody>
                </table>
            </div>
        </td>
    </tr>
    <tr><td>&nbsp;</td></tr>
    <tr>
      <td align="center">
        <P>
          <input type="button" name="Asignar" class="btn btn-primary" value="Asignar" onClick="javascript:enviarSeleccion(1,'usuariofideicomiso');"/>&nbsp;
          <input type="button" name="Quitar" class="btn btn-danger" value="Quitar" onClick="javascript:enviarSeleccion(2,'usuariofideicomiso');"/>
        </P>
          <p class="lead">
            Fideicomisos Asignados 
          </P>
      </td>
    </tr>
    <tr>
        <td>
            <div class="table-responsive" style="max-height: 450px; overflow-y: auto;">
                <table id="fisosAsignados"   class="table table-responsive table-hover" >
                    <thead class="table-primary">
                        <tr>
                            <th>Seleccionar</th>
                            <th>Usuario</th>
                            <th>No. Fideicomiso</th>
                            <th>Nombre</th>
                        </tr>
                    </thead>
                    <tbody>
                    <%
                          out.print(fContratoDAO.generaTablaFideicomisosAsignados(fusuIdUsuario)); 
                      %>   
                    </tbody>
                </table>    
            </div>
        </td>
    </tr>
    <tbody>
  </table>
</form>
<% 
} catch (Exception e) {
e.printStackTrace();
}
%>