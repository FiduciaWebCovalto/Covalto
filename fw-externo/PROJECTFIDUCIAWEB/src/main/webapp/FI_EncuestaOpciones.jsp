<%@ page import="java.util.*, java.text.*"%>
<jsp:useBean id="fOpcionesDAO" class="mx.com.inscitech.clients.daos.FOpcionesDAO"/>
<%
try {
 
  String botonAceptar = request.getParameter("botonAceptar");
  String fopcIdOpcion = request.getParameter("fopcIdOpcion");
  String fopcDescripcion = request.getParameter("fopcDescripcion"); 
  String botonBaja = request.getParameter("botonBaja");
  
%>
<script language="JavaScript" type="text/JavaScript">
  
  function aceptar() {
    document.formaEncuestaOpciones.action = "FI_Administracion.jsp?menu=104&botonAceptar=Aceptar";
    document.formaEncuestaOpciones.submit();  
  }//function aceptar
  
  function limpiar() {
    document.formaEncuestaOpciones.action = "FI_Administracion.jsp?menu=104";
    document.formaEncuestaOpciones.submit();
  }//function limpiar

  function alta() {
    //&botonAlta=Alta
    document.formaEncuestaOpciones.action = "FI_Administracion.jsp?menu=105";
    document.formaEncuestaOpciones.submit();
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
      alert("Es necesario buscar y seleccionar una opci�n.");
      return false;
    }
    if (ctrl[i]!=null) {
      document.formaEncuestaOpciones.action = "FI_Administracion.jsp?menu=106&fopcIdOpcion=" + ctrl[i].value;
      document.formaEncuestaOpciones.submit();  
      return true;
    } else {
      alert("Es necesario seleccionar una opci�n.");
      return false;
    }
  }//function modificar

  function baja(ctrl)
  {
    var radioUnico = document.formaEncuestaOpciones.radioFencIdEncuesta;
    
    //validaciones 1
    if (ctrl != null && ctrl.length > 0) {
      for (i=0;i<ctrl.length;i++) {      
          if (ctrl[i].checked) {
           break;
          }//if
      }//for
    } else if (radioUnico != null && radioUnico.value > 0 && radioUnico.checked) {
        if (confirm("�Estas seguro que deseas eliminar la opci�n con el Id: " + radioUnico.value + "?")) {
          document.formaEncuestaOpciones.action = "FI_Administracion.jsp?menu=104&fopcIdOpcion=" + radioUnico.value + "&botonBaja=Baja&botonAceptar=Aceptar";
          document.formaEncuestaOpciones.submit();
          return true;
        }
    } else {
       alert("Es necesario seleccionar una opci�n.");
        return false;
    }   
    
    //validaciones 2
    if (ctrl[i]!=null) {
      if (confirm("�Estas seguro que deseas eliminar la opci�n con el Id: " + ctrl[i].value + "?")) {
        document.formaEncuestaOpciones.action = "FI_Administracion.jsp?menu=104&fopcIdOpcion=" + ctrl[i].value + "&botonBaja=Baja&botonAceptar=Aceptar";
        document.formaEncuestaOpciones.submit();
        return true;
      }
   } else {
      alert("Es necesario seleccionar una opci�n.");
      return false;
   }//else
  }//function baja  

</script>  

<form name="formaEncuestaOpciones" method="POST">
   <%
      if (botonBaja != null && botonBaja.equals("Baja") && fopcIdOpcion != null && fopcIdOpcion.length() > 0) {
        if (fOpcionesDAO.eliminar(String.valueOf(fopcIdOpcion)) > 0) {
          out.print("<div class=\"texto\"><font color=\"#006600\">La opci�n con el Id: " + fopcIdOpcion +" fue eliminada correctamente.</font></div>");
        } else {
          out.print("<div class=\"texto\"><font color=\"#FF0000\">La opci�n con el Id: " + fopcIdOpcion +" no pudo ser elminada, favor de verificar.</font></div>");
        }
          fopcIdOpcion = null;
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
        <DIV align="left">Id&nbsp;Opci�n:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <input type="text" name="fopcIdOpcion" style=" WIDTH: 50px" maxlength="10" size="20"/>
        </DIV>
      </td>
      <td class="texto">
        <DIV align="left"/>
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <DIV align="left">Descripci&oacute;n:&nbsp;
          <input type="text" name="fopcDescripcion" style=" WIDTH: 300px" maxlength="300"/>
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
            <input type="button" name="Modificar" class="btn btn-success" value="Modificar" onClick="javascript:modificar(document.formaEncuestaOpciones.radioFopcIdOpcion);"/>
            <input type="button" name="Baja" class="btn btn-danger" value="Baja" onClick="javascript:baja(document.formaEncuestaOpciones.radioFopcIdOpcion);"/>
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
            <td align="center">Id Opci�n</td>
            <td align="center">Descripci&oacute;n</td>
          </tr>
          <%
          if (botonAceptar != null && botonAceptar.equals("Aceptar")) {
            if (fopcIdOpcion == null || fopcIdOpcion.length() == 0) {
              fopcIdOpcion = "-1";
            }
            out.print(fOpcionesDAO.generarTabla(Integer.parseInt(fopcIdOpcion), fopcDescripcion));
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