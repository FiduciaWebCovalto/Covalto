<!-- FI_PersonalizacionEncuesta.jsp -->
<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fEncuestaDAO" class="mx.com.inscitech.clients.daos.FEncuestaDAO"/>
<%
try {
 
  String botonAceptar = request.getParameter("botonAceptar");
  String fencIdEncuesta = request.getParameter("fencIdEncuesta");
  String fencDescripcion = request.getParameter("fencDescripcion"); 
  String botonBaja = request.getParameter("botonBaja");
  
%>

<script language="JavaScript" type="text/JavaScript">
  
  function aceptar() {
    document.formaPeronalizacionEncuesta.action = "FI_Administracion.jsp?menu=100&botonAceptar=Aceptar";
    document.formaPeronalizacionEncuesta.submit();  
  }//function aceptar
  
  function limpiar() {
    document.formaPeronalizacionEncuesta.action = "FI_Administracion.jsp?menu=100";
    document.formaPeronalizacionEncuesta.fencIdEncuesta.value ='';
    document.formaPeronalizacionEncuesta.fencDescripcion.value ='';
    document.formaPeronalizacionEncuesta.submit();
  }//function limpiar

  function alta() {
    //&botonAlta=Alta
    document.formaPeronalizacionEncuesta.action = "FI_Administracion.jsp?menu=101";
    document.formaPeronalizacionEncuesta.submit();
  }//function alta
  
  function modificar(ctrl) {
    if (ctrl != null) {
      //alert(ctrl.length);
      for (i=0;i<ctrl.length;i++) {
          if (ctrl[i].checked) {
            break;
          }
      }    
    } else {
      alert("Es necesario buscar y seleccionar una encuesta");
      return false;
    }
    if (ctrl[i]!=null) {
      document.formaPeronalizacionEncuesta.action = "FI_Administracion.jsp?menu=102&fencIdEncuesta=" + ctrl[i].value;
      document.formaPeronalizacionEncuesta.submit();  
      return true;
    } else {
      alert("Es necesario seleccionar una encuesta");
      return false;
    }
  }//function modificar

  function baja(ctrl)
  {
    var radioUnico = document.formaPeronalizacionEncuesta.radioFencIdEncuesta;
    
    //validaciones 1
    if (ctrl != null && ctrl.length > 0) {
      for (i=0;i<ctrl.length;i++) {      
          if (ctrl[i].checked) {
           break;
          }//if
      }//for
    } else if (radioUnico != null && radioUnico.value > 0 && radioUnico.checked) {
        if (confirm("�Estas seguro que deseas eliminar la encuesta con el Id: " + radioUnico.value + "?")) {
          document.formaPeronalizacionEncuesta.action = "FI_Administracion.jsp?menu=100&fencIdEncuesta=" + radioUnico.value + "&botonBaja=Baja&botonAceptar=Aceptar";
          document.formaPeronalizacionEncuesta.submit();
          return true;
        }
    } else {
       alert("Es necesario seleccionar una encuesta.");
        return false;
    }   
    
    //validaciones 2
    if (ctrl[i]!=null) {
      if (confirm("�Estas seguro que deseas eliminar la encuesta con el Id: " + ctrl[i].value + "?")) {
        document.formaPeronalizacionEncuesta.action = "FI_Administracion.jsp?menu=100&fencIdEncuesta=" + ctrl[i].value + "&botonBaja=Baja&botonAceptar=Aceptar";
        document.formaPeronalizacionEncuesta.submit();
        return true;
      }
   } else {
      alert("Es necesario seleccionar una encuesta.");
      return false;
   }//else
  }//function baja  

  function consultar(ctrl) {
    var radioUnico = document.formaPeronalizacionEncuesta.radioFencIdEncuesta;
    
    //validaciones 1
    if (ctrl != null && ctrl.length > 0) {
      for (i=0;i<ctrl.length;i++) {      
          if (ctrl[i].checked) {
           break;
          }//if
      }//for
    } else if (radioUnico != null && radioUnico.value > 0 && radioUnico.checked) {
          document.formaPeronalizacionEncuesta.action = "FI_Administracion.jsp?menu=103&fencIdEncuesta=" + radioUnico.value;
          document.formaPeronalizacionEncuesta.submit();
    } else {
       alert("Es necesario seleccionar una encuesta.");
        return false;
    }   
    
    //validaciones 2
    if (ctrl[i]!=null) {
        document.formaPeronalizacionEncuesta.action = "FI_Administracion.jsp?menu=103&fencIdEncuesta=" + ctrl[i].value;
        document.formaPeronalizacionEncuesta.submit();
   } else {
      alert("Es necesario seleccionar una encuesta.");
      return false;
   }//else
  }//function consultar  
  
</script>  

<form name="formaPeronalizacionEncuesta" method="POST">
   <%
      if (botonBaja != null && botonBaja.equals("Baja") && fencIdEncuesta != null && fencIdEncuesta.length() > 0) {
        if (fEncuestaDAO.eliminar(String.valueOf(fencIdEncuesta)) > 0) {
          out.print("<div class=\"texto\"><font color=\"#006600\">La encuesta con el Id: " + fencIdEncuesta +" fue eliminada correctamente.</font></div>");
        } else {
          out.print("<div class=\"texto\"><font color=\"#FF0000\">La encuesta con el Id: " + fencIdEncuesta +" no pudo ser elminada, favor de verificar.</font></div>");
        }
          fencIdEncuesta = null;
          botonBaja = null;
      }
  %> 
  
  <table width="90%" align="center" id="datos">
    <tr>
      <td align="left" class="subtitulo" colspan="2">
        <DIV align="center"/>
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <DIV align="left">Id&nbsp;Encuesta:
          <input type="text" name="fencIdEncuesta" style=" WIDTH: 50px" maxlength="10" value="<%= fencIdEncuesta==null?"":fencIdEncuesta  %>" />
        </DIV>
      </td>
      <td class="texto">
        <DIV align="left"/>
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <DIV align="left">Descripci&oacute;n:
          <input type="text" name="fencDescripcion" style=" WIDTH: 300px" maxlength="300" value="<%= fencDescripcion==null?"":fencDescripcion  %>"/>
        </DIV>
      </td>
      <td class="texto">
        <P align="left">&nbsp;</P>
      </td>
    </tr>
    <tr>
      <td align="right" class="texto" colspan="2">
        <DIV align="center">
          <P>&nbsp;</P>
          <P>
            <input type="button" name="Aceptar" class="btn btn-primary" value="Buscar" onClick="javascript:aceptar();"/>
            <input type="button" name="Limpiar" id="Limpiar" class="btn btn-warning" value="Limpiar" onClick="javascript:limpiar();"/>
          </P>
          <P>
            <input type="button" name="Alta" class="btn btn-primary" value="Alta" onClick="javascript:alta();"/>
            <input type="button" name="Modificar" class="btn btn-success" value="Modificar" onClick="javascript:modificar(document.formaPeronalizacionEncuesta.radioFencIdEncuesta);"/>
            <input type="button" name="Baja" class="btn btn-danger" value="Baja" onClick="javascript:baja(document.formaPeronalizacionEncuesta.radioFencIdEncuesta);"/>
            <input type="button" name="Consultar" class="boton" value="Asignar opciones" onClick="javascript:consultar(document.formaPeronalizacionEncuesta.radioFencIdEncuesta);"/>
          </P>
        </DIV>
      </td>
    </tr>
    <tr>
      <td class="texto" align="right" colspan="2">
        <DIV align="center">
          <P>&nbsp;</P>
        </DIV>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <table width="100%">
          <tr class="celda01" bgcolor="#999966">
            <td align="center">&nbsp;</td>
            <td align="center">Id Encuesta</td>
            <td align="center">Descripci&oacute;n</td>
          </tr>
          <%
          if (botonAceptar != null && botonAceptar.equals("Aceptar")) {
            if (fencIdEncuesta == null || fencIdEncuesta.length() == 0) {
              fencIdEncuesta = "-1";
            }
            out.print(fEncuestaDAO.generarTabla(Integer.parseInt(fencIdEncuesta), fencDescripcion));
            }
          %>            
        </table>
        <P>&nbsp;</P>
        <P align="right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</P>
      </td>
    </tr>
  </table>
</form>
<%
} catch (Exception e) {
  e.printStackTrace();
}
%>