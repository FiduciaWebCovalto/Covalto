<%@ page import="java.text.DecimalFormat, java.text.NumberFormat,java.util.Locale"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ page import="com.bancomext.daos.FProporcionesDao"%>
<%@ include file="parametrosToken.jsp" %>
<%@ include file="Sesion.jsp" %>
<% 
  try {
                FProporcionesDao dao = new FProporcionesDao();
                String botonAlta = request.getParameter("botonAlta");
                String botonBaja = request.getParameter("botonBaja");
                String botonAceptar=request.getParameter("botonAceptar");
                String botonConsultar=request.getParameter("botonConsultar");
                String valorRadio = request.getParameter("valorRadio")==null?"":request.getParameter("valorRadio");
                
                String valparamfproIdFideicomiso = request.getParameter("paramfproIdFideicomiso")==null?"":request.getParameter("paramfproIdFideicomiso");
                String valparamfproIdCredito = request.getParameter("paramfproIdCredito")==null?"":request.getParameter("paramfproIdCredito");
                String valparamfproIdCtoInver = request.getParameter("paramfproIdCtoInver")==null?"":request.getParameter("paramfproIdCtoInver");
                String valparamfproTipoFondo = request.getParameter("paramfproTipoFondo")==null?"":request.getParameter("paramfproTipoFondo");
                String valparamfproConcepto = request.getParameter("paramfproConcepto")==null?"":request.getParameter("paramfproConcepto");

%>
                <script language="JavaScript" type="text/JavaScript">
                        function alta() {
                        document.formulario.action = "FI_ProporcionesAlta.jsp";
                        document.formulario.submit();
                        //alert("hola");
                      }//function alta
                      
                      function aceptar(opcion) {
                      document.formulario.action = "FI_Proporciones.jsp?botonAceptar=Aceptar";
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
                               
                              document.formulario.action = "FI_ProporcionesModificar.jsp?variableConPks="+radioUnico.value;
                              document.formulario.submit();    
                           } else {
                          alert("Es necesario buscar y seleccionar un registro");
                          return false;
                        }
                        
                        //validaciones 2 de 2
                        if (ctrl[i]!=null) {
                          //var pk2[] = ctrl[i].value.split("-");
                          document.formulario.action = "FI_ProporcionesModificar.jsp?variableConPks="+ctrl[i].value;
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
                                          document.formulario.action = "FI_Proporciones.jsp?valorRadio=" + ctrl[i].value + "&botonBaja=Baja";
                                          document.formulario.submit();
                                          return true;
                                        } else return false;//if(confirm
                                      }//if(checked
                                  }//for  
                                }
                            
                                if (ctrl != null && ctrl.value != null && ctrl.value.length > 0 && ctrl.checked) {
                                  if (confirm("�Estas seguro que deseas eliminar el registro con la clave: " + ctrl.value + "?")) {
                                    document.formulario.action = "FI_Proporciones.jsp?valorRadio=" + ctrl.value + "&botonBaja=Baja";
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
                      
                     
                      
              </script>
    <HEAD>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')" >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
   <TR> 
      <TD width="176" bgcolor="#003366"><IMG src="imagenes/logo.jpg" alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="204" height="65"></TD>
      <TD vAlign="top" background="imagenes/msur01.png">
	   </TD>
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo" >Parametros del Fideicomiso</td>
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
         <input type="text" name="paramfproIdFideicomiso" id="paramfproIdFideicomiso" size="15" maxlength="15" value="<%= valparamfproIdFideicomiso%>"/>
        
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">Credito</td>
      <td class="texto">
        <P>
          <input type="text" name="paramfproIdCredito" id="paramfproIdCredito" size="15" maxlength="15" value="<%= valparamfproIdCredito%>"/>
        </P>
      </td>
    </tr>
    
    <tr>
      <td align="right" class="texto">
        <DIV align="right"></DIV>Contrato de Inversion
      </td>
      <td class="texto">
        <input type="text" name="paramfproIdCtoInver" id="paramfproIdCtoInver" size="15" maxlength="15" value="<%= valparamfproIdCtoInver%>"/>
      </td>
    </tr>    
    <tr>
      <td align="right" class="texto">
        <DIV align="right"></DIV>Fondo
      </td>
      <td class="texto">
        <input type="text" name="paramfproTipoFondo" id="paramfproTipoFondo" size="15" maxlength="15" value="<%= valparamfproTipoFondo%>"/>
      </td>
        <td class="texto">&nbsp;
      </td>
    </tr>
    
    <tr>
      <td align="right" class="texto">
        <DIV align="right"></DIV>Concepto</td>
      <td class="texto">
        <input type="text" name="paramfproConcepto" id="paramfproConcepto" size="50" maxlength="100" value="<%= valparamfproConcepto%>"/>
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
           <!-- <input type="button" name="botonConsultar" class="boton" value="Consultar" onClick="javascript:consultar();"/> -->
          <!-- input type="button" name="botonConsultar" class="boton" value="Asignar/Quitar Fideicomiso" onClick="javascript:consultar(document.formulario.radioKeys);"/-->
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
            <td align="center">Contrato Inversion</td>
            <td align="center">Tipo Fondo</td>
            <td align="center">Cuenta CLABE</td>
            <td align="center">Saldo Objetivo</td>
            <td align="center">Saldo</td>
            
          </tr>
          <%
              if (botonAceptar != null && botonAceptar.equals("Aceptar")) {
                  out.print(dao.generaTabla(Integer.parseInt(valparamfproIdFideicomiso.equals("")?"-1":valparamfproIdFideicomiso), valparamfproIdCredito, Integer.parseInt(valparamfproIdCtoInver.equals("")?"-1":valparamfproIdCtoInver),valparamfproTipoFondo, valparamfproConcepto));
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