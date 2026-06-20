<!-- FI_AutorizacionCuentaFideicomiso.jsp -->
<%@ page import="java.util.*"%>
<jsp:useBean id="fCuebanDAO" class="com.bancomext.daos.FCuebanDAO"/>
<%
  String botonBuscar = request.getParameter("botonBuscar");
  String fcbaNumeroCtaBan  = request.getParameter("fcbaNumeroCtaBan");  
  String fcbaClabeCba  = request.getParameter("fcbaClabeCba");
  String fcbaStatus = request.getParameter("fcbaStatusTexto");
  String botonAutorizar = request.getParameter("botonAutorizar");
  String botonRechazar = request.getParameter("botonRechazar");
  String botonModificar = request.getParameter("botonModificar");
  int res = 0;
  
  if (botonAutorizar != null && botonAutorizar.equals("Autorizar")) {
    if (fCuebanDAO.autorizar(fcbaClabeCba) > 0)
      out.print("<div class=\"texto\"><font color=\"#006600\"><b>La autorizaci�n de la cuenta \"" + fcbaClabeCba + "\" fue realizada satisfactoriamente.</b></font></div>");
    else
      out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>La autorizaci�n de la cuenta \"" + fcbaClabeCba + "\" no fue realizada favor de verificar.</b></font></div>");
  } else if (botonRechazar != null && botonRechazar.equals("Rechazar")) {  
      if (fCuebanDAO.rechazar(fcbaClabeCba) > 0)
        out.print("<div class=\"texto\"><font color=\"#006600\"><b>El rechazo de la cuenta \"" + fcbaClabeCba + "\" fue realizado satisfactoriamente.</b></font></div>");
      else  
        out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>El rechazo de la cuenta \"" + fcbaClabeCba + "\" no fue realizado favor de verificar.</b></font></div>");
  }
%>

<script language="JavaScript" type="text/JavaScript">
 
  function buscar() {
    document.formaCuenta.action = "FI_Operacion.jsp?menu=1&botonBuscar=Buscar";
    document.formaCuenta.submit();  
  }
 
 
  function limpiar() {
    document.formaCuenta.action = "FI_Operacion.jsp?menu=1";
    document.formaCuenta.submit();  
  }


  function autorizar(ctrl) {
    var radioUnico = document.formaCuenta.radioFcbaClabeCba;
    if (ctrl != null  && ctrl.length > 0) {
      for (i=0;i<ctrl.length;i++) {
          if (ctrl[i].checked) {
            break;
          }
      }    
    } else if (radioUnico != null && radioUnico.value.length > 0 && radioUnico.checked) {
          document.formaCuenta.action = "FI_Operacion.jsp?menu=1&fcbaClabeCba=" + radioUnico.value + "&botonAutorizar=Autorizar";
          document.formaCuenta.submit();    
    } else {
      alert("Es necesario buscar y seleccionar una cuenta.");
      return false;
    }
    
    //validaciones 2 de 2
    if (ctrl[i]!=null) {
      document.formaCuenta.action = "FI_Operacion.jsp?menu=1&fcbaClabeCba=" + ctrl[i].value + "&botonAutorizar=Autorizar";
      document.formaCuenta.submit();  
      return true;
    } else {
      alert("Es necesario seleccionar una cuenta.");
      return false;
    }
  }//function autorizar


  function rechazar(ctrl) {
    var radioUnico = document.formaCuenta.radioFcbaClabeCba;
    if (ctrl != null  && ctrl.length > 0) {
      for (i=0;i<ctrl.length;i++) {
          if (ctrl[i].checked) {
            break;
          }
      }    
    } else if (radioUnico != null && radioUnico.value.length > 0 && radioUnico.checked) {
          document.formaCuenta.action = "FI_Operacion.jsp?menu=1&fcbaClabeCba=" + radioUnico.value + "&botonRechazar=Rechazar";
          document.formaCuenta.submit();    
    } else {
      alert("Es necesario buscar y seleccionar una cuenta.");
      return false;
    }
    
    //validaciones 2 de 2
    if (ctrl[i]!=null) {
      document.formaCuenta.action = "FI_Operacion.jsp?menu=1&fcbaClabeCba=" + ctrl[i].value + "&botonRechazar=Rechazar";
      document.formaCuenta.submit();  
      return true;
    } else {
      alert("Es necesario seleccionar una cuenta.");
      return false;
    }
  }//function rechazar


  function modificar(ctrl) {
    var radioUnico = document.formaCuenta.radioFcbaClabeCba;
    if (ctrl != null  && ctrl.length > 0) {
      for (i=0;i<ctrl.length;i++) {
          if (ctrl[i].checked) {
            break;
          }
      }    
    } else if (radioUnico != null && radioUnico.value.length > 0 && radioUnico.checked) {
          document.formaCuenta.action = "FI_Operacion.jsp?menu=3&fcbaClabeCba=" + radioUnico.value + "&botonModificar=Modificar";
          document.formaCuenta.submit();    
    } else {
      alert("Es necesario buscar y seleccionar una cuenta.");
      return false;
    }
    
    //validaciones 2 de 2
    if (ctrl[i]!=null) {
      document.formaCuenta.action = "FI_Operacion.jsp?menu=3&fcbaClabeCba=" + ctrl[i].value + "&botonModificar=Modificar";
      document.formaCuenta.submit();  
      return true;
    } else {
      alert("Es necesario seleccionar una cuenta.");
      return false;
    }
  }//function modificar

  function asignarQuitar(ctrl) {
    var radioUnico = document.formaCuenta.radioFcbaClabeCba;
    
    //validaciones 1 de 2
    if (ctrl != null && ctrl.length > 0) {
      for (i=0;i<ctrl.length;i++) {      
          if (ctrl[i].checked) {
           break;
          }//if
      }//for
    } else if (radioUnico != null && radioUnico.value.length > 0 && radioUnico.checked) {
          document.formaCuenta.action = "FI_Operacion.jsp?menu=5&fcbaClabeCba=" + radioUnico.value;
          document.formaCuenta.submit();
    } else {
        alert("Es necesario buscar y seleccionar una cuenta.");
        return false;
    }   
    //validaciones 2 de 2
    if (ctrl[i]!=null) {
      document.formaCuenta.action = "FI_Operacion.jsp?menu=5&fcbaClabeCba=" + ctrl[i].value;
      document.formaCuenta.submit();  
    } else {
     alert("Es necesario seleccionar una cuenta.");
      return false;
    }//else
  }//function asignarQuitar
  
</script>


<form name="formaCuenta" method="post" action="">
  <table align="center" id="datos">
    <tr>
      <td align="left" class="texto" >No. de CLABE:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="text" name="fcbaClabeCba" style=" WIDTH: 180px" maxlength="50" /></td>
    </tr>      
    <tr>
      <td align="left" class="texto">No. de Cuenta Bancaria:&nbsp;
      <input type="text" name="fcbaNumeroCtaBan" style=" WIDTH: 100px" maxlength="50" /></td>
    </tr>  
    <tr>
      <td align="left" class="texto">Status:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="hidden" name="fcbaStatusTexto" style=" WIDTH: 100px" maxlength="50" />
        <select name="fcbaStatus" onchange="document.getElementById('fcbaStatusTexto').value=this.options[this.selectedIndex].text">
          <option value="-1">Seleccione Status</option>      
        <% 
          if (fCuebanDAO != null) {
            out.print(fCuebanDAO.generarSelectStatus(-1));
          }
        %>
        </select>      
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <DIV align="center">
          <P>
            <input type="button" name="Buscar" id="Buscar"  class="btn btn-info" value="Buscar" onClick="javascript:buscar();"/>&nbsp;
            <input type="button" name="Limpiar" id="Limpiar" class="btn btn-warning" value="Limpiar" onClick="javascript:limpiar();"/>
          </P>
          <P>&nbsp;</P>
        </DIV>
      </td>
    </tr>
    <tr>
      <td class="texto" align="right">
        <DIV align="center">
          <FONT size="2">Cuentas Disponibles</FONT> 
        </DIV>
      </td>
    </tr>
    <tr>
      <td align="center">
        <table width="100%">
          <tr class="celda01" bgcolor="#999966">
            <td align="center">&nbsp;</td>
            <td align="center">No. de CLABE</td>
            <td align="center">No. de Cuenta</td>
            <td align="center">Banco</td>
            <td align="center">Titular</td>
            <td align="center">RFC</td>
            <td align="center">Fecha de Captura</td>
            <td align="center">Status</td>
          </tr>
          <%
        
              if (botonBuscar != null && botonBuscar.equals("Buscar")) {
                out.print(fCuebanDAO.generarTablaCuentasDisponibles(fcbaNumeroCtaBan, fcbaClabeCba, fcbaStatus));
              }  
          %>  
        </table>
        <P>
          <input type="button" name="Autorizar" class="boton" value="Autorizar" onClick="javascript:autorizar(document.formaCuenta.radioFcbaClabeCba);"/>
          <input type="button" name="Modificar" class="btn btn-success" value="Modificar" onClick="javascript:modificar(document.formaCuenta.radioFcbaClabeCba);"/>
          <input type="button" name="Rechazar" class="boton" value="Rechazar" onClick="javascript:rechazar(document.formaCuenta.radioFcbaClabeCba);"/>
          <input type="button" name="Asignar" class="btn btn-primary" value="Asignar/Quitar Fideicomiso" onClick="javascript:asignarQuitar(document.formaCuenta.radioFcbaClabeCba);"/>
        </P>
      </td>
    </tr>
  </table>
</form>