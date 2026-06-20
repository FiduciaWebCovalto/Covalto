<%@ page import="java.text.DecimalFormat, java.text.NumberFormat,java.util.Locale"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ page import="com.bancomext.daos.FCreditosDao"%>
<%@ include file="parametrosToken.jsp" %>
<%@ include file="Sesion.jsp" %>
<% 
  try {
                FCreditosDao fcd = new FCreditosDao();
                String botonAlta = request.getParameter("botonAlta");
                String botonAceptar=request.getParameter("botonAceptar");
                String botonBaja = request.getParameter("botonBaja");
                String valparamfcreIdFideicomiso = request.getParameter("paramfcreIdFideicomiso")==null?"":request.getParameter("paramfcreIdFideicomiso");
                String valparamfcreIdCredito = request.getParameter("paramfcreIdCredito")==null?"":request.getParameter("paramfcreIdCredito");
                String valparamfcreTipoCredito = request.getParameter("paramfcreTipoCredito")==null?"":request.getParameter("paramfcreTipoCredito");
                String valorRadio = request.getParameter("valorRadio")==null?"":request.getParameter("valorRadio");
%>
                <script language="JavaScript" type="text/JavaScript">
                        function alta() {
                        document.formCreditos.action = "FI_CreditosAlta.jsp";
                        document.formCreditos.submit();
                        //alert("hola");
                      }//function alta
                      
                      function aceptar(opcion) {
                      document.formCreditos.action = "FI_Creditos.jsp?botonAceptar=Aceptar";
                      document.formCreditos.submit();  
                     } 
                     
                     function modificar(ctrl) {
                        //alert(document.formCreditos.radioKeysCreditos.value);
                        var radioUnico = document.formCreditos.radioKeysCreditos;
                        if (ctrl != null  && ctrl.length > 0) {
                          for (i=0;i<ctrl.length;i++) {
                              if (ctrl[i].checked) {
                                break;
                              }
                          }    
                        } else if (radioUnico != null && radioUnico.value.length > 0 && radioUnico.checked) {
                               
                               //var pk[] = radioUnico.value.split("-");
                              document.formCreditos.action = "FI_CreditosModificar.jsp?variableConPks="+radioUnico.value;
                              document.formCreditos.submit();    
                        } else {
                          alert("Es necesario buscar y seleccionar un registro");
                          return false;
                        }
                        
                        //validaciones 2 de 2
                        if (ctrl[i]!=null) {
                          //var pk2[] = ctrl[i].value.split("-");
                          document.formCreditos.action = "FI_CreditosModificar.jsp?variableConPks="+ctrl[i].value;
                          document.formCreditos.submit();  
                          return true;
                        } else {
                          alert("Es necesario seleccionar un registro");
                          return false;
                        }
                      }//function modificar
                      
                      
                      function baja(ctrl)
                              {    
                                if (ctrl != null && ctrl.length > 0) {
                                  for (i=0;i<ctrl.length;i++) {
                                      if (ctrl[i].checked) {
                                        if (confirm("�Estas seguro que deseas eliminar el registro con la clave: " + ctrl[i].value + "?")) {
                                          document.formCreditos.action = "FI_Creditos.jsp?valorRadio=" + ctrl[i].value + "&botonBaja=Baja";
                                          document.formCreditos.submit();
                                          return true;
                                        } else return false;//if(confirm
                                      }//if(checked
                                  }//for  
                                }
                            
                                if (ctrl != null && ctrl.value != null && ctrl.value.length > 0 && ctrl.checked) {
                                  if (confirm("�Estas seguro que deseas eliminar el registro con la clave: " + ctrl.value + "?")) {
                                    document.formCreditos.action = "FI_FI_Creditos.jsp?valorRadio=" + ctrl.value + "&botonBaja=Baja";
                                    document.formCreditos.submit();
                                    return true;
                                  } else return false;
                                }
                                alert("Es necesario buscar y seleccionar un usuario.");
                                return false;    
                              }//function baja
                      
                      
                      function limpiar() {
                        document.formCreditos.action = "FI_Creditos.jsp";
                        document.formCreditos.paramfcreIdFideicomiso.value = '';
                        document.formCreditos.paramfcreIdCredito.value = '';
                        document.formCreditos.paramfcreTipoCredito.value = '';
                        document.formCreditos.submit();  
                        }
                        
                        
                      
                      function ver(){
                      }
                      
                      function amortizacion(ctrl) {
                        //alert(document.formCreditos.radioKeysCreditos.value);
                        var radioUnico = document.formCreditos.radioKeysCreditos;
                        if (ctrl != null  && ctrl.length > 0) {
                          for (i=0;i<ctrl.length;i++) {
                              if (ctrl[i].checked) {
                                break;
                              }
                          }    
                        } else if (radioUnico != null && radioUnico.value.length > 0 && radioUnico.checked) {
                               
                               //var pk[] = radioUnico.value.split("-");
                              document.formCreditos.action = "FI_Amortizaciones.jsp?variableConPks="+radioUnico.value;
                              document.formCreditos.submit();    
                        } else {
                          alert("Es necesario buscar y seleccionar un registro");
                          return false;
                        }
                        
                        //validaciones 2 de 2
                        if (ctrl[i]!=null) {
                          //var pk2[] = ctrl[i].value.split("-");
                          document.formCreditos.action = "FI_Amortizaciones.jsp?variableConPks="+ctrl[i].value;
                          document.formCreditos.submit();  
                          return true;
                        } else {
                          alert("Es necesario seleccionar un registro");
                          return false;
                        }
                      }//function modificar
                      
              </script>
    <HEAD>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')" >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366">&nbsp;</TD>
      <TD vAlign="top" background="imagenes/msur01.png"
          > <DIV align="right"><FONT color="#FFFFFF"
            size=-7 
            face="Arial, Helvetica, sans-serif"> 01 800 623 4672 &nbsp;&nbsp;</FONT>&nbsp;&nbsp;<A 
            href="mailto:info@nafin.com"><FONT color="#FFFFFF"size=-7 
            face="Arial, Helvetica, sans-serif">info@nafin.com&nbsp;&nbsp;&nbsp;</FONT></A>
        </DIV></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
    <TR > 
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"></TD>
      <TD background="imagenes/fondoMenu.gif">
      <!--<a href="FI_Administracion.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Administracion','','imagenes/administracion2.gif',1)"><img src="imagenes/administracion1.gif" name="Administracion" border="0"></a>      
        <a href="FI_Operacion.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Operacion','','imagenes/Operacion2.gif',1)"><img src="imagenes/Operacion1.gif" name="Operacion" border="0"></a>-->      
        <a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir"  border="0"></a>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540"  width="176"> 
        <%@ include file="menuInstrucciones.jsp" %><!--menuAdministracion.jsp-->
      </TD>
      <TD valign="top" align="center"> 
	  <table width="100%" border="0">
        </table>
        <table width="593" border="0">
          <tr> 
            <td class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo" >Creditos</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
		  </table >
</HEAD> 
    <form name="formCreditos" method="post">
    <%
         if (botonBaja != null && botonBaja.equals("Baja") && valorRadio != null) {
          if (fcd.borrar(valorRadio) > 0) {
          out.print("<div class=\"texto\"><font color=\"#006600\"><b>valor eliminado correctamente.</b></font></div>");
        } else {
          out.print("<div class=\"texto\"><font color=\"#FF0000\"><b>El valor no pudo ser elminado, favor de verificar.</b></font></div>");
        }
          
          botonBaja = null;
      }
    %>
      <table width="90%" align="center" border="1">
             <table width="90%" align="center">
    <tr>
      <td align="left" class="subtitulo" colspan="2">
        <DIV align="center" />
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">
        <DIV align="right">Fideicomiso:</DIV>
      </td>
      <td class="texto">
         <input type="text" name="paramfcreIdFideicomiso" id="paramfcreIdFideicomiso" size="15" maxlength="15" value="<%= valparamfcreIdFideicomiso%>"/>
        
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">Id. Credito</td>
      <td class="texto">
        <P>
          <input type="text" name="paramfcreIdCredito" id="paramfcreIdCredito" size="15" maxlength="15" value="<%= valparamfcreIdCredito%>"/>
        </P>
      </td>
    </tr>
    
    <tr>
      <td align="right" class="texto">
        <DIV align="right"></DIV>Tipo Credito
      </td>
      <td class="texto">
        <input type="text" name="paramfcreTipoCredito" id="paramfcreTipoCredito" size="15" maxlength="15" value="<%= valparamfcreTipoCredito%>"/>
      </td>
    </tr>    
    <tr>
      <td align="right" class="texto">
        <DIV align="right"></DIV>
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
          <input type="button" name="botonModificar" class="btn btn-success" value="Modificar" onClick="javascript:modificar(document.formCreditos.radioKeysCreditos);"/>
          <input type="button" name="botonBaja" class="btn btn-danger" value="Baja" onClick="javascript:baja(document.formCreditos.radioKeysCreditos);"/>
          <input type="button" name="botonAmortizacion" class="boton" value="Amortizacion" onClick="javascript:amortizacion(document.formCreditos.radioKeysCreditos);"/>
          <!-- input type="button" name="botonConsultar" class="boton" value="Asignar/Quitar Fideicomiso" onClick="javascript:consultar(document.formCreditos.radioKeysCreditos);"/ -->
        </DIV>
      </td>
    </tr>
    <tr>
      <td class="texto" align="right" colspan="2">
        <DIV align="center">
          <P>&nbsp;</P>
          <P>
            <FONT size="2">Parametros de archivo</FONT> 
          </P>
        </DIV>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <table width="100%">
          <tr class="celda01" bgcolor="#999966">
            <td align="center">&nbsp;</td>
            <td align="center">Fideicomiso</td>
            <td align="center">Tipo Credito</td>
            <td align="center">Importe Credito</td>
            <td align="center">Tasa</td>
            <td align="center">Pagos</td>
            <td align="center">Periodicidad</td>
          </tr>
          <%
              if (botonAceptar != null && botonAceptar.equals("Aceptar")) {
                  out.print(fcd.generaTabla(Integer.parseInt(valparamfcreIdFideicomiso.equals("")?"-1":valparamfcreIdFideicomiso), valparamfcreIdCredito, valparamfcreTipoCredito));
              }  
          %>  
        </table>
        <P>&nbsp;</P>
        <P>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</P>
      </td>
    </tr>
  </table>
</form>
<%
  } catch (Exception e) {
  e.printStackTrace();
  }
%>