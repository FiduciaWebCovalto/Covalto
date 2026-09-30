
<%@ page import="java.text.DecimalFormat, java.text.NumberFormat,java.util.Locale"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ page import="mx.com.inscitech.clients.daos.FAmortizacionDao"%>
<%@ include file="parametrosToken.jsp" %>
<%@ include file="Sesion.jsp" %>
<% 
  try {
                FAmortizacionDao dao = new FAmortizacionDao();
                String botonAlta = request.getParameter("botonAlta");
                String botonBaja = request.getParameter("botonBaja");
                String botonAceptar=request.getParameter("botonAceptar");
                String botonConsultar=request.getParameter("botonConsultar");
                String valorRadio = request.getParameter("valorRadio")==null?"":request.getParameter("valorRadio");
                
                String keys = request.getParameter("variableConPks")==null?request.getParameter("hiddenvariableConPks")==null?"0-0":request.getParameter("hiddenvariableConPks"): request.getParameter("variableConPks");
                String key[]=keys.split("-"); 
                
                
                String paramfcreIdFideicomiso = request.getParameter("paramfcreIdFideicomiso")==null?"":request.getParameter("paramfcreIdFideicomiso");
                String paramfcreIdCredito = request.getParameter("paramfcreIdCredito")==null?"":request.getParameter("paramfcreIdCredito");
                String paramfcreTipoCredito = request.getParameter("paramfcreTipoCredito")==null?"":request.getParameter("paramfcreTipoCredito");
                
                
                //String valparamfccrIdFideicomiso = request.getParameter("paramfcreIdFideicomiso")==null?request.getParameter("paramfccrIdFideicomiso")==null?"":request.getParameter("paramfccrIdFideicomiso"):request.getParameter("paramfcreIdFideicomiso");
                //String valparamfccrIdCredito = request.getParameter("paramfcreIdCredito")==null?request.getParameter("paramfccrIdCredito")==null?"":request.getParameter("paramfccrIdCredito"):request.getParameter("paramfcreIdCredito");
                
                String valparamfccrIdFideicomiso = key[0];
                String valparamfccrIdCredito = key[1];

                
                String valparamfccrIdPago = request.getParameter("paramfccrIdPago")==null?"":request.getParameter("paramfccrIdPago");
                String valparamfccrFechaPago = request.getParameter("paramfccrFechaPago")==null?"":request.getParameter("paramfccrFechaPago");
                
%>
                <script language="JavaScript" type="text/JavaScript">
                        function alta() {
                        document.formulario.action = "FI_AmortizacionesAlta.jsp";
                        document.formulario.submit();
                        //alert("hola");
                      }//function alta
                      
                      function aceptar(opcion) {
                      document.formulario.action = "FI_Amortizaciones.jsp?botonAceptar=Aceptar";
                      document.formulario.submit();  
                     } 
                     
                     function modificar(ctrl) {
                        //alert(document.formulario.radioKeys.value);
                        //document.formulario.action = "FI_ProporcionesModificar.jsp?";
                        //document.formulario.submit();
                        var radioUnico = document.formulario.radioKeys;
                        if (ctrl != null  && ctrl.length > 0) {
                          for (i=0;i<ctrl.length;i++) {
                              if (ctrl[i].checked) {
                                break;
                              }
                          }    
                        } else if (radioUnico != null && radioUnico.value.length > 0 && radioUnico.checked) {
                               
                              document.formulario.action = "FI_AmortizacionesModificar.jsp?variableConPks2="+radioUnico.value;
                              document.formulario.submit();    
                           } else {
                          alert("Es necesario buscar y seleccionar un registro");
                          return false;
                        }
                        
                        //validaciones 2 de 2
                        if (ctrl[i]!=null) {
                          //var pk2[] = ctrl[i].value.split("-");
                          document.formulario.action = "FI_AmortizacionesModificar.jsp?variableConPks2="+ctrl[i].value;
                          document.formulario.submit();  
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
                                          document.formulario.action = "FI_Amortizaciones.jsp?valorRadio=" + ctrl[i].value + "&botonBaja=Baja";
                                          document.formulario.submit();
                                          return true;
                                        } else return false;//if(confirm
                                      }//if(checked
                                  }//for  
                                }
                            
                                if (ctrl != null && ctrl.value != null && ctrl.value.length > 0 && ctrl.checked) {
                                  if (confirm("�Estas seguro que deseas eliminar el registro con la clave: " + ctrl.value + "?")) {
                                    document.formulario.action = "FI_Amortizaciones.jsp?valorRadio=" + ctrl.value + "&botonBaja=Baja";
                                    document.formulario.submit();
                                    return true;
                                  } else return false;
                                }
                                alert("Es necesario buscar y seleccionar un usuario.");
                                return false;    
                              }//function baja
                      
                      
                      function limpiar() {
                        document.formulario.action = "FI_Proporciones.jsp";
                        document.formulario.paramfcreIdFideicomiso.value = '';
                        document.formulario.paramfcreIdCredito.value = '';
                        document.formulario.paramfcreTipoCredito.value = '';
                        document.formulario.paramfproTipoFondo.value = '';
                        document.formulario.paramfproConcepto.value = '';
                        document.formulario.submit();  
                        }
                        
                        
                        function regresar() {
                        document.formulario.action = "FI_Creditos.jsp";
                        document.formulario.submit();  
                     } 
                      
                     
                      
              </script>
    <HEAD>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')" >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366"><IMG 
            src="imagenes/logo.gif" 
            alt="Nacional Financiera"   border="0"  width="176"></TD>
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo" >Tabla de Amortizacion</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
		  </table >
</HEAD> 
    <form name="formulario" method="post">
    <%
       if (botonBaja != null && botonBaja.equals("Baja") && valorRadio != null) {
          if (dao.borrar(valorRadio) > 0) {
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
         <input type="text" name="paramfccrIdFideicomiso" id="paramfccrIdFideicomiso" size="15" maxlength="15" value="<%= valparamfccrIdFideicomiso%>"/>
        
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">Id. Credito</td>
      <td class="texto">
        <P>
          <input type="text" name="paramfccrIdCredito" id="paramfccrIdCredito" size="15" maxlength="15" value="<%= valparamfccrIdCredito%>"/>
        </P>
      </td>
    </tr>
    
    <tr>
      <td align="right" class="texto">
        <DIV align="right"></DIV>Id. Pago</td>
      <td class="texto">
        <input type="text" name="paramfccrIdPago" id="paramfccrIdPago" size="15" maxlength="15" value="<%= valparamfccrIdPago%>"/>
      </td>
    </tr>    
    <tr>
      <td align="right" class="texto">
        <DIV align="right">Fecha de Pago</DIV></td>
      <td class="texto">
        <input type="text" name="paramfccrFechaPago" id="paramfccrFechaPago" size="15" maxlength="15" value="<%= valparamfccrFechaPago%>"/>
      </td>
        <td class="texto">&nbsp;
      </td>
    </tr>
    
    <tr>
      <td align="right" class="texto">
        <DIV align="right"></DIV></td>
      <td class="texto">
          <input type="hidden" name="paramfcreIdFideicomiso" id="paramfcreIdFideicomiso" size="15" maxlength="15" value="<%= paramfcreIdFideicomiso%>"/>
         <input type="hidden" name="paramfcreIdCredito" id="paramfcreIdCredito" size="15" maxlength="15" value="<%= paramfcreIdCredito%>"/>
         <input type="hidden" name="paramfcreTipoCredito" id="paramfcreTipoCredito" size="15" maxlength="15" value="<%= paramfcreTipoCredito%>"/>
          <input type="hidden" name="hiddenvariableConPks"  value="<%= keys%>" />
      </td>
        <td class="texto">&nbsp;
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
          <input type="button" name="botonModificar" class="btn btn-success" value="Modificar" onClick="javascript:modificar(document.formulario.radioKeys);"/>
          <input type="button" name="botonBaja" class="btn btn-danger" value="Baja" onClick="javascript:baja(document.formulario.radioKeys);"/>
          <input type="button" name="botonRegresarr" class="boton" value="Regresar" onClick="javascript:regresar();"/>
          <!-- input type="button" name="botonConsultar" class="boton" value="Asignar/Quitar Fideicomiso" onClick="javascript:consultar(document.formulario.radioKeys);"/ -->
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
            <td align="center">Id credito</td>
            <td align="center">Id Pago</td>
            <td align="center">Fecha Pago</td>
            <td align="center">Importe Pago</td>
          </tr>
          <%
              if (botonAceptar != null && botonAceptar.equals("Aceptar")) {
                  out.print(dao.generaTabla(Integer.parseInt(valparamfccrIdFideicomiso.equals("")?"-1":valparamfccrIdFideicomiso), Integer.parseInt(valparamfccrIdCredito.equals("")?"-1":valparamfccrIdCredito),valparamfccrIdPago,valparamfccrFechaPago));
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