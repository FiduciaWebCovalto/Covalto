<!-- FI_UsuarioModificar.jsp -->
<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fPerfilDAO" class="com.bancomext.daos.FPerfilDAO"/>
<jsp:useBean id="fUsuarioDAO" class="com.bancomext.daos.FUsuarioDAO"/>
<jsp:useBean id="fUsuario" class="com.bancomext.beans.FUsuario"/>

<%
try {
String fusuIdUsuario = request.getParameter("fusuIdUsuario");
String aceptarMod = request.getParameter("AceptarMod");

if (fusuIdUsuario != null) {
System.out.println("fusuIdUsuario:"+fusuIdUsuario);

  fUsuario = fUsuarioDAO.consultar(fusuIdUsuario);
}

if (aceptarMod != null && aceptarMod.equals("Aceptar")) {
  System.out.println("Email Aceptar:"+(String)request.getParameter("email"));  
  System.out.println("usuario Aceptar: "+(String)request.getParameter("fusuIdUsuario"));
  String fusuNombreUsuario = request.getParameter("fusuNombreUsuario")==null?"":request.getParameter("fusuNombreUsuario");
  String fusuStatus = request.getParameter("fusuStatus")==null?"-1":request.getParameter("fusuStatus");
  String fusuEmail = request.getParameter("email")==null?"":request.getParameter("email");
  int fperIdPerfil = Integer.parseInt(request.getParameter("fperIdPerfil")==null?"-1":request.getParameter("fperIdPerfil"));
  String fusuImpMaximo = request.getParameter("fusuImpMaximo")==null?"-1":request.getParameter("fusuImpMaximo");
  if (fusuIdUsuario!=null && fusuIdUsuario.length()>0) {
        fUsuario.setFusuNombreUsuario(fusuNombreUsuario);
        fUsuario.setFusuStatus(fusuStatus);
        fUsuario.setEmail(fusuEmail);
        fUsuario.setFperIdPerfil(fperIdPerfil);
        fUsuario.setFusuImpMaximo(fusuImpMaximo);
        
        if (fUsuarioDAO.modificar(fUsuario) > 0) {
        %>
        <script language="JavaScript" type="text/JavaScript">
         function cancelar(){
        document.formUsuarioModificar.action = "FI_Administracion.jsp?menu=1&fperIdPerfil=-1";
        document.formUsuarioModificar.submit();}
        Swal.fire('success', 'Operacion realizada correctamente!', 'success');
        </script>
        <%
        } else {
        %>
        <script language="JavaScript" type="text/JavaScript">
        //cancelarMod();
        Swal.fire('error', 'La operacion no se pudo realizar!', 'error');
        </script>
        <%
        }
    } 
}
%>
<script language="JavaScript" type="text/JavaScript">
  function cancelarMod() {
    document.formUsuarioModificar.action = "FI_Administracion.jsp?menu=1&fperIdPerfil=-1";
    document.formUsuarioModificar.submit();
  }
            
  function aceptarMod() {

  var forma = "document.formUsuarioModificar";
    if (validarCorreo(document.formUsuarioModificar.email, "El formato del correo no es el indicado, favor de verificar.\n\tEjemplo: nombre@correo.dominio") &&
        validarCombo(document.formUsuarioModificar.fperIdPerfil, "Es necesario seleccionar un perfil") &&
        validarCombo(document.formUsuarioModificar.fusuStatus, "Es necesario seleccionar un status")) {
 
      document.formUsuarioModificar.action = "FI_Administracion.jsp?menu=2&AceptarMod=Aceptar";
      document.formUsuarioModificar.action += "&fusuNombreUsuario=" + document.getElementById('fusuNombreUsuario').value; 
      document.formUsuarioModificar.action += "&fusuStatus=" + document.getElementById('fusuStatus').value;
      document.formUsuarioModificar.action += "&fusuIdUsuario=" + document.getElementById('email').value; 
       document.formUsuarioModificar.action += "&email=" + document.getElementById('email').value; 
      document.formUsuarioModificar.action += "&fperIdPerfil=" + document.getElementById('fperIdPerfil').value;
      document.formUsuarioModificar.action += "&fusuImpMaximo=" + document.getElementById('fusuImpMaximo').value;
      document.formUsuarioModificar.submit();
    }
  }
  
  function validarCorreo(field, alerttxt)
  {
    with (field)
    {
      apos=value.indexOf("@");
      dotpos=value.lastIndexOf(".");
      if (apos<1||dotpos-apos<2) 
        {alert(alerttxt);field.focus();return false;}
      else {return true;}
    }
  }
  
  function validarCombo(field, alerttxt)
  {
    if (field.value<=0)
      {alert(alerttxt);field.focus();return false;}
    else 
      {return true;}
  }     
  
</script>


<form name="formUsuarioModificar" method="POST">
  <table align="center" id="datos" border="0">
    <tr>
      <td align="left" class="subtitulo" colspan="2">
        <DIV align="center"/>
      </td>
    </tr>

    <tr>
      <td align="right" class="texto" colspan="2"></td>
    </tr>

    <tr>
      <td align="right" class="texto" colspan="2"></td>
    </tr>

    <tr>
      <td align="right" class="texto">E-mail:</td>
      <td><input type="text" name="email" id="email" value="<%=fUsuario.getEmail()%>" maxlength="255" size="60" disabled/></td>
    </tr>
    
    <tr>
      <td align="right" class="texto">Nombre de Usuario:</td>
      <td><input type="text" name="fusuNombreUsuario" id="fusuNombreUsuario" value="<%=fUsuario.getFusuNombreUsuario()%>" style=" WIDTH: 200px" maxlength="150" /></td>
    </tr> 
    
    <tr>
      <td align="right" class="texto">Perfil:</td>
      <td>
        <select name="fperIdPerfil" id="fperIdPerfil">
          <option value="-1">Seleccione Perfil</option>
          <% 
          if (fPerfilDAO != null) {
            out.print(fPerfilDAO.generarSelect(fUsuario.getFperIdPerfil()));
          }
        %>
        </select>
      </td>
    </tr>


    <tr>
      <td align="right" class="texto">Status:</td>
      <td>
        <select name="fusuStatus" id="fusuStatus">
          <option value="">Seleccione Status</option>      
        <% 
          if (fUsuarioDAO != null) {
            out.print(fUsuarioDAO.generarSelectStatus(fUsuario.getFusuStatus()));
          }
        %>
         </select>
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">Importe M&aacute;ximo Autorizado:</td>
      <td><input type="text" class="texto" id="fusuImpMaximo" name="fusuImpMaximo" value="<%=fUsuario.getFusuImpMaximo()%>" style=" WIDTH: 130px" maxlength="50"> *</td>      
    </tr>

    <tr>
      <td class="texto" align="right" colspan="2"></td>
    </tr>

    <tr>
      <td class="texto" align="right" colspan="2"></td>
    </tr>

    <tr>
      <td class="texto" align="right" colspan="2">
        <DIV align="center">
          <input type="button" name="AceptarMod" class="btn btn-primary"  value="Aceptar" onClick="javascript:aceptarMod();" />
          <input type="button" name="CancelarMod" class="btn btn-danger" value="Cancelar" onClick="javascript:cancelarMod();" />
        </DIV>
      </td>
    </tr>
    <tr class="subtitulo">
      <td align="center" colspan="7">&nbsp;</td>
    </tr>
    <tr class="celda02"/>
  </table>
  <tr>
    <td colspan="2" align="center">&nbsp;</td>
  </tr>
</form>
<%
} catch (Exception e) {
e.printStackTrace();
}
%>