<!-- FI_Usuario.jsp -->
<%@ page import="mx.com.inscitech.clients.daos.FPerfilDAO, mx.com.inscitech.clients.daos.FUsuarioDAO"%>
<%
try {
FPerfilDAO fPerfilDAO = new FPerfilDAO();
FUsuarioDAO fUsuarioDAO = new FUsuarioDAO();
String fusuIdUsuario = request.getParameter("fusuIdUsuario");
//out.print("fusuIdUsuario=" + fusuIdUsuario);
int fperIdPerfil = Integer.parseInt(request.getParameter("fperIdPerfil")==null?"-1":request.getParameter("fperIdPerfil"));
String fperNombrePerfil = request.getParameter("fperNombrePerfil");
String botonAceptar = request.getParameter("botonAceptar");
String botonBaja = request.getParameter("botonBaja");
String ctoNumContrato = request.getParameter("ctoNumContrato");
if (request.getParameter("ctoNumContrato")!=null && request.getParameter("ctoNumContrato").trim().length()>0)
  ctoNumContrato = request.getParameter("ctoNumContrato");
String ctoNomContrato = request.getParameter("ctoNomContrato");
//out.print("botonBaja: " + botonBaja);
//out.print("botonAceptar: " + botonAceptar);
%>
<script language="JavaScript" type="text/JavaScript">

  function aceptar(opcion) {
    document.formUsuario.action = "FI_Administracion.jsp?menu=" + opcion + "&botonAceptar=Aceptar";
    document.formUsuario.submit();  
  }  


  function limpiar() {
    document.formUsuario.action = "FI_Administracion.jsp?menu=1";
    document.formUsuario.fperNombrePerfil.value = '';
    document.formUsuario.ctoNomContrato.value = '';
    document.formUsuario.ctoNumContrato.value = '';
    document.formUsuario.fperIdPerfil.value = '-1';
    //document.formUsuario.
    document.formUsuario.submit();  
  }
  
    
  function alta() {
    document.formUsuario.action = "FI_Administracion.jsp?menu=3&botonAlta=Alta";
    document.formUsuario.submit();
  }//function alta


  function modificar(ctrl) {
    var radioUnico = document.formUsuario.radioFusuIdUsuarios;
    if (ctrl != null  && ctrl.length > 0) {
      for (i=0;i<ctrl.length;i++) {
          if (ctrl[i].checked) {
            break;
          }
      }    
    } else if (radioUnico != null && radioUnico.value.length > 0 && radioUnico.checked) {
          document.formUsuario.action = "FI_Administracion.jsp?menu=2&fusuIdUsuario=" + radioUnico.value;
          document.formUsuario.submit();    
    } else {
      Swal.fire('warning', 'Es necesario buscar y seleccionar un usuario', 'warning')
      return false;
    }
    
    //validaciones 2 de 2
    if (ctrl[i]!=null) {
      document.formUsuario.action = "FI_Administracion.jsp?menu=2&fusuIdUsuario=" + ctrl[i].value;
      document.formUsuario.submit();  
      return true;
    } else {
      Swal.fire('warning', 'Es necesario seleccionar un usuario', 'warning')
      return false;
    }
  }//function modificar


  async function baja(ctrl)
  {    
    if (ctrl != null && ctrl.length > 0) {
      for (i=0;i<ctrl.length;i++) {
          if (ctrl[i].checked) {
          const result = await Swal.fire({
                    title: 'Estas seguro que deseas eliminar al usuario con la clave: ' + ctrl[i].value + '?',
                    text: "No podras revertir esto.",
                    icon: 'warning',
                    showCancelButton: true,
                    confirmButtonText: 'Si, aceptar',
                    cancelButtonText: 'Cancelar',
                    allowOutsideClick: false // Evita cerrar al hacer clic fuera
                });
                
                if (result.isConfirmed) {
                    document.formUsuario.action = "FI_Administracion.jsp?menu=1&fusuIdUsuario=" + ctrl[i].value + "&botonBaja=Baja&botonAceptar=Aceptar";
                    document.formUsuario.submit();
                    return true;
                } else {
                    // Código a ejecutar cuando cancelan
                    console.log("El usuario canceló");
                    return false;
                }
          }//if(checked
      }//for  
    }

    if (ctrl != null && ctrl.value != null && ctrl.value.length > 0 && ctrl.checked) {
              const result = await Swal.fire({
                    title: 'Estas seguro que deseas eliminar al usuario con la clave: ' + ctrl.value + '?',
                    text: "No podras revertir esto.",
                    icon: 'warning',
                    showCancelButton: true,
                    confirmButtonText: 'Si, aceptar',
                    cancelButtonText: 'Cancelar',
                    allowOutsideClick: false // Evita cerrar al hacer clic fuera
                });
                
                if (result.isConfirmed) {
                    document.formUsuario.action = "FI_Administracion.jsp?menu=1&fusuIdUsuario=" + ctrl.value + "&botonBaja=Baja&botonAceptar=Aceptar";
                    document.formUsuario.submit();
                    return true;
                } else {
                    // Código a ejecutar cuando cancelan
                    console.log("El usuario canceló");
                    return false;
                }
    }
    Swal.fire('warning', 'Es necesario seleccionar un usuario', 'warning')
    return false;    
  }//function baja


  function consultar(ctrl) {
    var radioUnico = document.formUsuario.radioFusuIdUsuarios;
    
    //validaciones 1 de 2
    if (ctrl != null && ctrl.length > 0) {
      for (i=0;i<ctrl.length;i++) {      
          if (ctrl[i].checked) {
           break;
          }//if
      }//for
    } else if (radioUnico != null && radioUnico.value.length > 0 && radioUnico.checked) {
          document.formUsuario.action = "FI_Administracion.jsp?menu=4&fusuIdUsuario=" + radioUnico.value;
          document.formUsuario.submit();
    } else {
        Swal.fire('warning', 'Es necesario buscar y seleccionar un usuario.', 'warning')
        return false;
    }   
    //validaciones 2 de 2
    if (ctrl[i]!=null) {
      document.formUsuario.action = "FI_Administracion.jsp?menu=4&fusuIdUsuario=" + ctrl[i].value;
      document.formUsuario.submit();  
    } else {
     alert("Es necesario seleccionar un usuario");
      return false;
    }//else
  }//function consultar

  
</script>
<form name="formUsuario" method="post">
   <%
      if (botonBaja != null && botonBaja.equals("Baja") && fusuIdUsuario != null) {
        if (fUsuarioDAO.eliminar(fusuIdUsuario) > 0) {
        %>
        <script language="JavaScript" type="text/JavaScript">
        Swal.fire('success', 'Operacion realizada correctamente!', 'success');
        </script>
        <%        
        } else {%>
        <script language="JavaScript" type="text/JavaScript">
        Swal.fire('error', 'La operacion no se pudo realizar!', 'error');
        </script>
        <%        }
          fusuIdUsuario = null;
          botonBaja = null;
      }
  %>  

  <table width="90%" align="center">
    <tr>
      <td align="left" class="subtitulo" colspan="2">
        <DIV align="center" />
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <DIV align="right">Nombre Usuario:</DIV>
      </td>
      <td class="texto">
        <input type="text" name="fperNombrePerfil" style="WIDTH: 200px" maxlength="150" value="<%= fperNombrePerfil==null?"":fperNombrePerfil%>" />
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <DIV align="right">Perfil:</DIV>
      </td>
      <td class="texto">
        <P>
          <select name="fperIdPerfil">
            <option value="-1">Seleccione Perfil</option> 
            <%
              if (fPerfilDAO != null) {
                out.print(fPerfilDAO.generarSelect(fperIdPerfil));
              }
            %>  
          </select>
        </P>
      </td>
    </tr>

    <tr>
      <td align="right" class="texto" colspan="2">
        <DIV align="center">
          <P>&nbsp;</P>
          <P>
            <input type="button" name="botonAceptar" class="btn btn-primary" value="Buscar" onClick="javascript:aceptar(1);"/>
            <input type="button" name="botonLimpiar" class="btn btn-warning" value="Limpiar" onClick="javascript:limpiar();" />
          </P>
        </DIV>
      </td>
    </tr>
    <tr>
      <td align="right" class="texto" colspan="2">
        <DIV align="center">
          <input type="button" name="botonAlta" class="btn btn-primary" value="Alta" onClick="javascript:alta();"/>
          <input type="button" name="botonModificar" class="btn btn-success" value="Modificar" onClick="javascript:modificar(document.formUsuario.radioFusuIdUsuarios);"/>
          <input type="button" name="botonBaja" class="btn btn-danger" value="Baja" onClick="javascript:baja(document.formUsuario.radioFusuIdUsuarios);"/>
          <!-- input type="button" name="botonConsultar" class="boton" value="Asignar/Quitar Fideicomiso" onClick="javascript:consultar(document.formUsuario.radioFusuIdUsuarios);"/ -->
        </DIV>
      </td>
    </tr>
    <input type="hidden" name="cboPersona" size="13" style=" WIDTH: 130px" maxlength="20" value="<%=request.getParameter("cboTipoD")!=null?request.getParameter("cboTipoD"):""%>"/>
    <tr>
      <td class="texto" align="right" colspan="2">
        <DIV align="center">
          <P>&nbsp;</P>
          <P>
            <FONT size="2">Usuarios Disponibles</FONT> 
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
                    <th align="center">Clave Usuario</th>
                    <th align="center">Nombre</th>
                    <th align="center">Perfil</th>
                    <th align="center">E-Mail</th>
                    <th align="center">Importe M&aacute;ximo</th>
                    <th align="center">Fecha &Uacute;ltimo Acceso</th>
                    <th align="center">Fideicomisos Asignados</th>            
                </tr>
              </thead>   
              <tbody>
              <%
                  if (botonAceptar != null && botonAceptar.equals("Aceptar")) {
                    out.print(fUsuarioDAO.generarTabla(fperIdPerfil, fperNombrePerfil, ctoNumContrato, ctoNomContrato));
                  }  
              %>            
              </tbody>
          </table>
        </div>
        <P>&nbsp;</P>
        <P>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</P>
      </td>
    </tr>
  </table>
</form>
<%
} catch (Exception e) {
  out.print("Error en FI_Usuario.jsp " + e.getMessage());
  System.out.println("Error en FI_Usuario.jsp " + e.getMessage());
}
%>