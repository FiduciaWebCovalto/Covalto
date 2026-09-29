<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fPerfilDAO" class="com.bancomext.daos.FPerfilDAO"/>
<jsp:useBean id="fUsuarioDAO" class="com.bancomext.daos.FUsuarioDAO"/>
<jsp:useBean id="fUsuario" class="com.bancomext.beans.FUsuario"/>
<% 
String aceptarAlta = request.getParameter("AceptarAlta");
//out.print("aceptar: " + aceptarAlta+"<br>");
if (aceptarAlta != null && aceptarAlta.equals("Aceptar")) {
  String fusuNombreUsuario = request.getParameter("fusuNombreUsuario")==null?"":request.getParameter("fusuNombreUsuario");
  String fusuStatus = request.getParameter("fusuStatus")==null?"":request.getParameter("fusuStatus");
  String fusuEmail = request.getParameter("email")==null?"":request.getParameter("email");
  int fperIdPerfil = Integer.parseInt(request.getParameter("fperIdPerfil")==null?"-1":request.getParameter("fperIdPerfil"));
  String fusuImpMaximo = request.getParameter("fusuImpMaximo")==null?"-1":request.getParameter("fusuImpMaximo");
  String fusuMteo = request.getParameter("fusuMteo")==null?"":request.getParameter("fusuMteo");
}
%>
<script language="JavaScript" type="text/JavaScript">

var numb = '0123456789';
var lwr = 'abcdefghijklmnopqrstuvwxyz';
var upr = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';

  function cancelarAlta() {
    window.location.href = 'FI_Administracion.jsp?menu=1'
    document.formUsuarioAlta.action = "FI_Administracion.jsp?menu=1";
    document.formUsuarioAlta.submit();
  }
            
  function aceptarAlta() {
  //alert(document.formUsuarioAlta.fusuEmail);
    if (
        isAlpha(document.formUsuarioAlta.fusuNombreUsuario, "Es necesario capturar un Nombre de usuario\nque contenga solamente caract�res alfab�ticos") &&
        validarCombo(document.formUsuarioAlta.fperIdPerfil, "Es necesario seleccionar un perfil") &&
        validarCorreo(document.formUsuarioAlta.email, "El formato del correo no es el indicado, favor de verificar.\n\tEjemplo: nombre@correo.dominio") &&        
        validarCombo(document.formUsuarioAlta.fusuStatus, "Es necesario seleccionar un status") &&
        isNum(document.formUsuarioAlta.fusuNombreUsuario, "Es necesario capturar un Importe\nque contenga solamente caract�res num�ricos")
        ) {
      //alert(document.formUsuarioAlta.fusuMteo.checked);
      document.formUsuarioAlta.action = "FI_Administracion.jsp?menu=3&botonAlta=Alta&AceptarAlta=Aceptar";
      document.formUsuarioAlta.submit();
    }
  }
  
  function validarCorreo(field, alerttxt)
  {
  //alert(field);
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
  

 
function isValid(parm, val) {
//alert(parm.value.length)
//alert(val)
  if (parm.value.length == 0) return false;
  if (parm == "") {return false;}
  for (i=0; i<parm.length; i++) {
    if (val.indexOf(parm.charAt(i), 0) == -1) { return false;}
  }
  return true;
}
 
function isNum(field, alerttxt) {
    //alert(isValid(field, lwr+upr));
    if (isValid(field, numb)) {return true;}
    else { alert(alerttxt); field.focus(); return false; }   
}

function isLower(parm) {return isValid(parm, lwr);}
function isUpper(parm) {return isValid(parm, upr);}

function isAlpha(field, alerttxt) 
  {
    //alert(isValid(field, lwr+upr));
    if (isValid(field, lwr+upr)) {return true;}
    else { alert(alerttxt);field.focus();return false; } 
  }
  
function isAlphanum(parm) {return isValid(parm,lwr+upr+numb);}
</script>


<form id="formUsuarioAlta">
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
      <td align="right" class="texto">Email de Usuario:</td>
      <td><input type="text" name="email" id="email" maxlength="255" size="60"/></td>
    </tr>
    
    <tr>
      <td align="right" class="texto">Nombre de Usuario:</td>
      <td><input type="text" name="fusuNombreUsuario" id="fusuNombreUsuario" style=" WIDTH: 200px" maxlength="150" size="22"/></td>
    </tr> 
    
    <tr>
      <td align="right" class="texto">Perfil:</td>
      <td>
        <select name="fperIdPerfil" id="fperIdPerfil">
          <option value="-1">Seleccione Perfil:</option>
          <% 
          if (fPerfilDAO != null) {
            out.print(fPerfilDAO.generarSelect(-1));
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
            out.print(fUsuarioDAO.generarSelectStatus(""));
          }
        %>
        </select>
      </td>
    </tr>

    <tr>
      <td align="right" class="texto">Importe M&aacute;ximo Autorizado:</td>
      <td class="texto"><input type="text" name="fusuImpMaximo" id="fusuImpMaximo" style=" WIDTH: 130px" maxlength="50"/> *</td>
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
          <input type="submit" name="AceptarAlta" class="btn btn-primary" value="Aceptar"/>
          <script src="scripts/Apiregnvousuario.js"></script>
          <input type="button" name="CancelarAlta" class="btn btn-danger" value="Cancelar" onClick="javascript:cancelarAlta();" />
          <p id="message"></p>

        </DIV>
      </td>
    </tr>
    <tr class="subtitulo">
      <td align="center" colspan="7">&nbsp;</td>
    </tr>
    <tr class="celda02"/>
  </table>
</form>