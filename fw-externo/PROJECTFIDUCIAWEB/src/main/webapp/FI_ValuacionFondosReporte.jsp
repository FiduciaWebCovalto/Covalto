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
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" >
<table border='0' bordercolor='#000000' bgcolor='#FFFFFF' >
		<tr>		
		<td>
			<table width='900'>
				<tr>
					<td align="CENTER"  style="font-family: Arial;	font-size: 16px;color: #000000;font-weight: bold;">BANCOMEXT</td>
				</tr>
				<tr>
					<td><div align='center' style="font-family: Verdana, Arial, Helvetica;	font-size: 12px;color: #000000;font-weight: bold;">DIVISION FIDUCIARIA</div></td>
				</tr>
				<tr>
					<td><div align='center' style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">VALUACION DE FONDOS</div></td>
				</tr>
				<tr><td height='23'>&nbsp;</td></tr>
        <tr><td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"><%=valparamfhccIdFideicomiso%></td></tr>
			</table>
		</td>
		<td>
			<table> 
				<tr>
					<td width='151' height='91' rowspan='7'><div align='center'><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg" ></div></td>					
				</tr>
			</table>
		</td>
		</tr>
		</table>	
</HEAD> 
    <form name="formValuacionFondos" method="post" >
      <table width="90%" align="center"  style="visibility:hidden;position:absolute;">
    <tr>
      <td align="left" class="subtitulo" colspan="2">
        <DIV align="center" />
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">
      </td>
      <td class="texto">
         <input type="text"  style="visibility:hidden" name="paramfhccIdFideicomiso" id="paramfhccIdFideicomiso" size="15" maxlength="15" value="<%=valparamfhccIdFideicomiso%>"/>
        
      </td>
    </tr>
    <tr>
      <td align="right" class="texto"></td>
      <td class="texto">
          <input type="text"  style="visibility:hidden" name="paramfhccIdCredito" id="paramfhccIdCredito" size="15" maxlength="15" value="<%=valparamfhccIdCredito%>"/>
      </td>
    </tr>
    <tr>
      <td align="right" class="texto">
      </td>
      <td class="texto">
        <input  style="visibility:hidden" type="text" id="paramfhccIdFecValuacion" name="paramfhccIdFecValuacion" maxlength=10 value="<%= valparamfhccIdFecValuacion %>"/>
        <input  style="visibility:hidden" type="button" id="lanzaCalendarioF" name="lanzaCalendarioF"  style=" WIDTH: 15px"   class="botonCbo" value="v"/>
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
            
            <input  style="visibility:hidden" type="button" name="botonLimpiar" class="btn btn-warning" value="Limpiar" onClick="javascript:limpiar();"/>
          </P>
          <P>
            <input  style="visibility:hidden" type="button" name="cmdConsultar" class="boton" value="Consultar" onClick="javascript:consultar(document.formValuacionFondos.radioKeysCreditos);"/>
            <input  style="visibility:hidden" type="button" name="cmdValuacion" class="boton" value="Valuacion" onClick="javascript:mostrarTablaJS(1);"/>
            <input  style="visibility:hidden" type="button" name="cmdAplica" class="boton" value="Aplica" onClick="javascript:mostrarTablaJS(2);" />
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
   </table>
   
        <table width="80%" align="center" style="font-size:14px;">
          <tr bgcolor="#999999">
            <td align="center">&nbsp;</td>
            <td align="center"><b>Fideicomiso</b></td>
            <td align="center"><b>Id credito</b></td>
            <td align="center"><b>Fecha Valuacion</b></td>
            <td align="center"><b>Id. Contrato Inversion</b></td>
            <td align="center"><b>Secuencial</b></td>
            <td align="center"><b>Comentatario</b></td>
            <td align="center"><b>Saldo Inicio</b></td>
            <td align="center"><b>Saldo Final</b></td>
            <td align="center"><b>Moneda</b></td>
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
        <input type="button" name="cmdRegresar" value="Regresar" onClick="javascript:mostrarTablaJS(3);"/>
    </form>
  </body>
<%
  } catch (Exception e) {
  e.printStackTrace();
  }
%>