<%@ page import="java.text.DecimalFormat, java.text.NumberFormat,java.util.Locale"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ page import="mx.com.inscitech.clients.daos.FValuacionFondoDao"%>
<%@ include file="parametrosToken.jsp" %>
<%@ include file="Sesion.jsp" %>

<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<script language="JavaScript" SRC='scripts/general.js'></script>

<% 
  try {
                FValuacionFondoDao fvfd = new FValuacionFondoDao();
                String mostrarTablaJS = request.getParameter("mostrarTablaJS")==null?"":request.getParameter("mostrarTablaJS");
                String opcion = request.getParameter("opcion")==null?"-1":request.getParameter("opcion");
                String botonAceptar=request.getParameter("botonAceptar");
                String valparamfhccIdFideicomiso = request.getParameter("paramfhccIdFideicomiso")==null?"":request.getParameter("paramfhccIdFideicomiso");
                String valparamfhccIdCredito = request.getParameter("paramfhccIdCredito")==null?"":request.getParameter("paramfhccIdCredito");
                String valparamfhccIdFecValuacion = request.getParameter("paramfhccIdFecValuacion")!=null?request.getParameter("paramfhccIdFecValuacion"):fecha;
%>
                <script language="JavaScript" type="text/JavaScript">
                        function alta() {
                        document.formValuacionFondos.action = "FI_CreditosAlta.jsp";
                        document.formValuacionFondos.submit();
                        //alert("hola");
                      }//function alta
                      
                      function aceptar(opcion) {
                      document.formValuacionFondos.action = "FI_Creditos.jsp?botonAceptar=Aceptar";
                      document.formValuacionFondos.submit();  
                     }
                     
                     function mostrarTablaJS(opc){
                     
                          switch(opc){
                              case 1:
                                  document.formValuacionFondos.action = "FI_ValuacionFondos.jsp?mostrarTablaJS=Aceptar&opcion=1";
                                  document.formValuacionFondos.submit();
                              break;
                              case 2:
                                  document.formValuacionFondos.action = "FI_ValuacionFondos.jsp?mostrarTablaJS=Aceptar&opcion=2";
                                  document.formValuacionFondos.submit();
                              break;
                               case 3:
                                  document.formValuacionFondos.action = "FI_ValuacionFondos.jsp?mostrarTablaJS=Aceptar&opcion=3";
                                  document.formValuacionFondos.submit();
                              break;
                          }
                        
                     }
                     
                     function genReporte()
                     {
                            document.formValuacionFondos.action = "FI_ValuacionFondosReporte.jsp?mostrarTablaJS=Aceptar&opcion=3";
                            document.formValuacionFondos.submit();
                     }
                     
                     function consultar(ctrl) {
                        var radioUnico = document.formValuacionFondos.radioKeysCreditos;
                        if (ctrl != null  && ctrl.length > 0) {
                          for (i=0;i<ctrl.length;i++) {
                              if (ctrl[i].checked) {
                                break;
                              }
                          }    
                        } else if (radioUnico != null && radioUnico.value.length > 0 && radioUnico.checked) {
                               
                               //var pk[] = radioUnico.value.split("-");
                              document.formValuacionFondos.action = "FI_ValuacionFondosConsultar.jsp?variableConPks="+radioUnico.value;
                              document.formValuacionFondos.submit();    
                        } else {
                          alert("Es necesario buscar y seleccionar un registro");
                          return false;
                        }
                        
                        //validaciones 2 de 2
                        if (ctrl[i]!=null) {
                          //var pk2[] = ctrl[i].value.split("-");
                          document.formValuacionFondos.action = "FI_ValuacionFondosConsultar.jsp?variableConPks="+ctrl[i].value;
                          document.formValuacionFondos.submit();  
                          return true;
                        } else {
                          alert("Es necesario seleccionar un registro");
                          return false;
                        }
                      }//function modificar
                      
                      function ver(rad){
                          alert(rad.name);
                      }
                      
              </script>
    <HEAD>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')" >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366">&nbsp;</TD>
      <TD vAlign="top" background="imagenes/msur01.png"> <DIV align="right"><FONT color="#FFFFFF" size=-7 face="Arial, Helvetica, sans-serif"> 01 800 623 4672 &nbsp;&nbsp;</FONT>&nbsp;&nbsp;<A href="mailto:info@nafin.com"><FONT color="#FFFFFF"size=-7 face="Arial, Helvetica, sans-serif">info@nafin.com&nbsp;&nbsp;&nbsp;</FONT></A></DIV></TD>
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo" >Valuacion de fondos</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
		  </table >
</HEAD> 
    <form name="formValuacionFondos" method="post">
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
         <input type="text" name="paramfhccIdFideicomiso" id="paramfhccIdFideicomiso" size="15" maxlength="15" value="<%= valparamfhccIdFideicomiso%>"/>
        
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">Id. Credito</td>
      <td class="texto">
        <P>
          <input type="text" name="paramfhccIdCredito" id="paramfhccIdCredito" size="15" maxlength="15" value="<%= valparamfhccIdCredito%>"/>
        </P>
      </td>
    </tr>
    
    <tr>
      <td align="right" class="texto">
        <DIV align="right"></DIV>Fecha</td>
      <td class="texto">
         <input type="text" id="paramfhccIdFecValuacion" name="paramfhccIdFecValuacion" maxlength=10 value="<%= valparamfhccIdFecValuacion %>"/>
        <input type="button" id="lanzaCalendarioF" name="lanzaCalendarioF"  style=" WIDTH: 15px"   class="botonCbo" value="v"/>
        <SCRIPT type=text/javascript>
                        // script que define y configura el calendario-
                        Calendar.setup({
                          inputField     :    "paramfhccIdFecValuacion",      // id del campo de texto
                          ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
                          button         :    "lanzaCalendarioF"   // el id del bot�n que lanzar� el calendario
                        });					
        </SCRIPT>
      </td>
    </tr>    
    <tr>
      <td align="right" class="texto">
        <DIV align="right"></DIV>
      </td>
      <td class="texto">&nbsp;
        
      </td>
    </tr>
    
    <tr>
      <td align="right" class="texto" colspan="2">
        <DIV align="center">
          <P>
            <input type="button" name="botonAceptar" class="btn btn-primary" value="Buscar" onClick="javascript:mostrarTablaJS(3);"/>
            <input type="button" name="botonLimpiar" class="btn btn-warning" value="Limpiar" onClick="javascript:limpiar();"/>
          </P>
          <P>
            <input type="button" name="cmdConsultar" class="boton" value="Consultar" onClick="javascript:consultar(document.formValuacionFondos.radioKeysCreditos);"/>
            <input type="button" name="cmdValuacion" class="boton" value="Valuacion" onClick="javascript:mostrarTablaJS(1);"/>
            <input type="button" name="cmdAplica" class="boton" value="Aplica" onClick="javascript:mostrarTablaJS(2);" />
             <input type="button" name="cmdReporte" class="boton" value="Reporte" onClick="javascript:genReporte();" />
          </P>
        </DIV>
      </td>
    </tr>
    <tr>
      <td align="right" class="texto" colspan="2">
        <DIV align="center">
          <!-- input type="button" name="botonConsultar" class="boton" value="Asignar/Quitar Fideicomiso" onClick="javascript:consultar(document.formValuacionFondos.radioKeysCreditos);"/ -->
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
            <td align="center">Fecha Valuacion</td>
            <td align="center">Id. Contrato Inversion</td>
            <td align="center">Secuencial</td>
            <td align="center">Comentatario</td>
            <td align="center">Saldo Inicio</td>
            <td align="center">Saldo Final</td>
            <td align="center">Moneda</td>
          </tr>
          <%
              if (!mostrarTablaJS.equals("")&&mostrarTablaJS.equals("Aceptar")&&(opcion.equals("1")||opcion.equals("2"))) {
                  out.print(fvfd.ejecutaFuncionValuacionFondosYgeneraTabla(Integer.parseInt(opcion),valparamfhccIdFecValuacion,Integer.parseInt(valparamfhccIdFideicomiso.equals("")?"0":valparamfhccIdFideicomiso),valparamfhccIdCredito));
              } 
              else if(!mostrarTablaJS.equals("") && mostrarTablaJS.equals("Aceptar")&&(opcion.equals("3"))) {
                  out.print(fvfd.generaTabla(Integer.parseInt(valparamfhccIdFideicomiso.equals("")?"0":valparamfhccIdFideicomiso),valparamfhccIdCredito,valparamfhccIdFecValuacion));
              }
          %>  
        </table>
        <P>&nbsp;</P>
        <P>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</P>
      </td>
    </tr>
  </table>
    </form>
  </body>
<%
  } catch (Exception e) {
  e.printStackTrace();
  }
%>