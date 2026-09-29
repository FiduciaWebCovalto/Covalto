<!doctype html>
<!--
/*
  @Autor:cubo
  @Creado: Septiembre 2020
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="Horario"  class="com.bancomext.negocio.nConsultas"/>
<jsp:useBean id="FechaHabilSig"  class="com.bancomext.negocio.RetirosDB"/>
<jsp:useBean id="MonedaOrig"  class="com.bancomext.negocio.nConsultas"/>
<jsp:useBean id="MonedaDest"  class="com.bancomext.negocio.nConsultas"/>
<%@ include file="sesionInstrucc.jsp" %>
<%@ include file="parametrosToken.jsp" %>
<%@ include file="configura_bus.jsp" %>
<%
    // Recuperamos el parámetro del web.xml
    String sUrl = getServletContext().getInitParameter("apiBaseUrl");
%>
    <script>
        const API_BASE_URL = "<%= sUrl %>";
        console.log('1.la ip configurada es: '+API_BASE_URL);    
        
        if (!localStorage.getItem('token')) {
            window.location.href = 'login.jsp'; // Redirigir si no hay token
        }
    </script>
<%
/****************************AUTENTICACION CON TOKEN******************************/
if(((String)session.getAttribute("token")).equals("1"))
    {%>
    <%@ include file="autenticaToken.jsp" %>
    <%
     }
/*********************************************************************************/
    String temporal = request.getParameter("cboFormaInversion");
    int idFormaInversion = temporal != null && !"-1".equals(temporal) ? Integer.parseInt(temporal.substring(0, 1)) : -1;
    
    String cboFormaInversion = ((String)request.getParameter("cboFormaInversion"));
    String cboConcepto = ((String)request.getParameter("cboConcepto"));
    String txtObservaciones = ((String)request.getParameter("txtObservaciones"));
    String txtMonto = ((String)request.getParameter("txtMonto"));
    
    // Campos para cambio tipo, plazo y/o instrumento de inversi&oacute;n
    String txtTipoInstrumentoOriginal = ((String)request.getParameter("txtTipoInstrumentoOriginal"));
    String txtTipoInstrumentoNuevo = ((String)request.getParameter("txtTipoInstrumentoNuevo"));
    String cboContratoOrigen = ((String)request.getParameter("cboContratoOrigen"));
    String cboContratoDestino = ((String)request.getParameter("cboContratoDestino"));
    String txtCajonIndeval = ((String)request.getParameter("txtCajonIndeval"));
    String txtPlazoNuevoRequerido = ((String)request.getParameter("txtPlazoNuevoRequerido"));
    String txtInstitucion = ((String)request.getParameter("txtInstitucion"));
    String txtContratoBursatil = ((String)request.getParameter("txtContratoBursatil"));
    
    // Campos para traspaso de títulos
    String cboCuentaInversionOrigen = ((String)request.getParameter("cboCuentaInversionOrigen"));
    String cboCuentaInversionDestino = ((String)request.getParameter("cboCuentaInversionDestino"));
    
    // Campos para compra
    String cboCuentaCargo = ((String)request.getParameter("cboCuentaCargo"));
    String cboContratoInversion = ((String)request.getParameter("cboContratoInversion"));
    String cboDivisa = ((String)request.getParameter("cboDivisa"));
    String txtNombreBeneficiario = ((String)request.getParameter("txtNombreBeneficiario"));
    String cboTipoInstrumento = ((String)request.getParameter("cboTipoInstrumento"));
    String txtClavePizarra = ((String)request.getParameter("txtClavePizarra"));
    String txtPlazo = ((String)request.getParameter("txtPlazo"));
    String txtLiquidez = ((String)request.getParameter("txtLiquidez"));
    String txtPrecioTecho = ((String)request.getParameter("txtPrecioTecho"));
    String txtPrecioPiso = ((String)request.getParameter("txtPrecioPiso"));
    String cboPrecioMercado = ((String)request.getParameter("cboPrecioMercado"));
    
    String Folio=BD.getFolio(2);
%>
<HTML>
<HEAD><TITLE>Instrucciones - Confirmar Inversi&oacute;n </TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
 <%@ include file="objetosPKI.jsp" %>
<script language="JavaScript" SRC='scripts/navegador.js'></script>
</script>
<script language="JavaScript" type="text/JavaScript">
<!-- 
function confirmar() 
{
   <%
   if(sCaptura.equals("NO"))
   {
   %>
     Sign()
   <%
   }
   else
   {
   %>
      document.Inversion.action='instruccion14.jsp';
      document.Inversion.submit();
   <%
   }
   %>
}


 function Sign()
		{
if(bName == "Microsoft Internet Explorer")
	{		
		document.Inversion.action="instruccion14.jsp";
		document.Inversion.submit();
	}
	if (bName == "Netscape") 
	{
			document.Inversion.action="instruccion14.jsp";
			document.Inversion.submit();
   }   
}

//-->
</script>
</HEAD>
<body class="bg-light">
<jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
<div class="table-responsive" >

<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%" >
  <TBODY>
    <TR > 
      <TD valign="top" align="center"> <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
          </table>
        </td>
     </tr>
     <tr>
        <td>          
        <div class="table-responsive" >
            <table id="fisosDisponibles"  class="table table-responsive table-hover">
                <thead class="table-primary" align="center">
                    <tr>
                        <th><h1 class="display-1">Confirmar Inversion</h1></th>
                    </tr>
                </thead>
                <tbody>
                    <tr> 
                      <td align="center"> 
                        <form name="Inversion"  method="post" action="instruccion14.jsp">
                          <input type="hidden" name="Pkcs7">
                          <input type="hidden" name="SignedText">
                          <input type="hidden" name="txtFolio" value="<%=Folio%>">
                          
                          <input type="hidden" name="cboFormaInversion" value="<%=cboFormaInversion%>">
                          <input type="hidden" name="cboConcepto" value="<%=cboConcepto%>">
                          <input type="hidden" name="txtObservaciones" value="<%=txtObservaciones%>">
                          <input type="hidden" name="txtMonto" value="<%=txtMonto%>">
                          <input type="hidden" name="txtTipoInstrumentoOriginal" value="<%=txtTipoInstrumentoOriginal%>">
                          <input type="hidden" name="txtTipoInstrumentoNuevo" value="<%=txtTipoInstrumentoNuevo%>">
                          <input type="hidden" name="cboContratoOrigen" value="<%=cboContratoOrigen%>">
                          <input type="hidden" name="cboContratoDestino" value="<%=cboContratoDestino%>">
                          <input type="hidden" name="txtCajonIndeval" value="<%=txtCajonIndeval%>">
                          <input type="hidden" name="txtPlazoNuevoRequerido" value="<%=txtPlazoNuevoRequerido%>">
                          <input type="hidden" name="txtInstitucion" value="<%=txtInstitucion%>">
                          <input type="hidden" name="txtContratoBursatil" value="<%=txtContratoBursatil%>">
                          <input type="hidden" name="cboCuentaInversionOrigen" value="<%=cboCuentaInversionOrigen%>">
                          <input type="hidden" name="cboCuentaInversionDestino" value="<%=cboCuentaInversionDestino%>">
                          <input type="hidden" name="cboCuentaCargo" value="<%=cboCuentaCargo%>">
                          <input type="hidden" name="cboContratoInversion" value="<%=cboContratoInversion%>">
                          <input type="hidden" name="cboDivisa" value="<%=cboDivisa%>">
                          <input type="hidden" name="txtNombreBeneficiario" value="<%=txtNombreBeneficiario%>">
                          <input type="hidden" name="cboTipoInstrumento" value="<%=cboTipoInstrumento%>">
                          <input type="hidden" name="txtClavePizarra" value="<%=txtClavePizarra%>">
                          <input type="hidden" name="txtPlazo" value="<%=txtPlazo%>">
                          <input type="hidden" name="txtLiquidez" value="<%=txtLiquidez%>">
                          <input type="hidden" name="txtPrecioTecho" value="<%=txtPrecioTecho%>">
                          <input type="hidden" name="txtPrecioPiso" value="<%=txtPrecioPiso%>">
                          <input type="hidden" name="cboPrecioMercado" value="<%=cboPrecioMercado%>">
                          <div class="table-responsive" style="max-height: 900px; overflow-y: auto;">
                              <table id="fisosDisponibles"  class="table table-responsive table-hover">
                                    <thead class="table-primary" align="center">
                                        <tr>
                                            <th>&nbsp;</th>
                                            <th>DETALLE DE LA INVERSION</th>
                                            <th>&nbsp;</th>
                                        </tr>
                                    </thead>
                                </table>
                              <table class="table table-responsive table-hover">
                                <tr > 
                                  <td>Forma de Inversi&oacute;n:</td>
                                  <td><%=cboFormaInversion.split("-")[1]%></td>
                                </tr>
                                <tr > 
                                  <td>Concepto:</td>
                                  <td><%=cboConcepto%>
                                </tr>
                                <tr > 
                                  <td>Observaciones:</td>
                                  <td><%=txtObservaciones%>
                                </tr>
                                <tr > 
                                  <td>Monto en N&uacute;mero / N&uacute;mero de T&iacute;tulos:</td>
                                  <td><%=txtMonto%>
                                </tr>
                                
                                <% if(idFormaInversion == 1) { %>
                                    <tr > 
                                      <td>Tipo de Instrumento Original:</td>
                                      <td><%=txtTipoInstrumentoOriginal%>
                                    </tr>
                                    <tr > 
                                      <td>Tipo de Instrumento al que se Requiere Cambiar:</td>
                                      <td><%=txtTipoInstrumentoNuevo%>
                                    </tr>
                                    <tr > 
                                      <td>Cuenta de Inversi&oacute;n Origen:</td>
                                      <td><%=cboContratoOrigen%>
                                    </tr>
                                    <tr > 
                                      <td>Cuenta de Inversi&oacute;n Destino:</td>
                                      <td><%=cboContratoDestino%>
                                    </tr>
                                    <tr > 
                                      <td>Caj&oacute;n de Indeval:</td>
                                      <td><%=txtCajonIndeval%>
                                    </tr>
                                    <tr > 
                                      <td>Plazo Nuevo Requerido (en d&iacute;as):</td>
                                      <td><%=txtPlazoNuevoRequerido%>
                                    </tr>
                                    <tr > 
                                      <td>Instituci&oacute;n:</td>
                                      <td><%=txtInstitucion%>
                                    </tr>
                                    <tr > 
                                      <td>Contrato Burs&aacute;til:</td>
                                      <td><%=txtContratoBursatil%>
                                    </tr>
                                <%} else if(idFormaInversion == 2) {%>
                                    <tr > 
                                      <td>Cuenta de Inversi&oacute;n Origen:</td>
                                      <td><%=cboCuentaInversionOrigen%>
                                    </tr>
                                    <tr > 
                                      <td>Cuenta de Inversi&oacute;n Destino:</td>
                                      <td><%=cboCuentaInversionDestino%>
                                    </tr>
                                    <tr > 
                                      <td>Caj&oacute;n de Indeval:</td>
                                      <td><%=txtCajonIndeval%>
                                    </tr>
                                    <tr > 
                                      <td>Instituci&oacute;n:</td>
                                      <td><%=txtInstitucion%>
                                    </tr>
                                    <tr > 
                                      <td>Contrato Burs&aacute;til:</td>
                                      <td><%=txtContratoBursatil%>
                                    </tr>
                                <%} else if(idFormaInversion == 3) {%>
                                    <tr > 
                                      <td>Cuenta Cargo:</td>
                                      <td><%=cboCuentaCargo%>
                                    </tr>
                                    <tr > 
                                      <td>Contrato de Inversi&oacute;n:</td>
                                      <td><%=cboContratoInversion%>
                                    </tr>
                                    <tr > 
                                      <td>Divisa:</td>
                                      <td><%=cboDivisa%>
                                    </tr>
                                    <tr > 
                                      <td>Nombre del Beneficiario:</td>
                                      <td><%=txtNombreBeneficiario%>
                                    </tr>
                                    <tr > 
                                      <td>Tipo de Instrumento:</td>
                                      <td><%=cboTipoInstrumento%>
                                    </tr>
                                    <tr > 
                                      <td>Clave de Pizarra:</td>
                                      <td><%=txtClavePizarra%>
                                    </tr>
                                    <tr > 
                                      <td>Plazo:</td>
                                      <td><%=txtPlazo%>
                                    </tr>
                                    <tr > 
                                      <td>Liquidez:</td>
                                      <td><%=txtLiquidez%>
                                    </tr>
                                    <tr > 
                                      <td>Precio Techo:</td>
                                      <td><%=NumberFormat.getCurrencyInstance(Locale.US).format(NumberFormat.getInstance(Locale.US).parse(txtPrecioTecho).doubleValue())%>
                                    </tr>
                                    <tr > 
                                      <td>Precio Piso:</td>
                                      <td><%=NumberFormat.getCurrencyInstance(Locale.US).format(NumberFormat.getInstance(Locale.US).parse(txtPrecioPiso).doubleValue())%>
                                    </tr>
                                    <tr > 
                                      <td>Precio de Mercado:</td>
                                      <td><%=cboPrecioMercado%>
                                    </tr>
                                <%}%>

                                    <!--SECCION PARA SUBIR PDF-->
                                    <tr> 
                                    <td>&nbsp;</td>                                                                              
                                    <td style="text-align: left;"> 
                                    <div class="card shadow d-flex justify-content-center" style="width: 45rem;" >
                                    <div class="card-header bg-primary text-white">
                                    <h4 class="mb-0">Subir Carta Instruccion PDF</h4>
                                    </div>
                                    <div class="card-body">
                                    <form id="uploadForm" enctype="multipart/form-data">
                                    <div class="mb-3">
                                    <label for="pdfFile" class="form-label">Seleccionar PDF</label>
                                    <input class="form-control" type="file" id="pdfFile" 
                                    name="pdfFile" accept="application/pdf" required>
                                    </div>
                                    <button type="button" onclick="uploadFile()" class="btn btn-success">Subir</button>
                                    <button id="btnEnviarOPT" class="btn btn-primary py-2" onclick="solicitarOtp()" disabled>
                                        Enviar Codigo de Seguridad
                                    </button>
                                    </form>
                                    <input type="hidden" name="pdfName" id="hiddenPdfName"> 
                                    <!-- Área para mostrar mensajes -->
                                    <div id="statusMessage" class="mt-3"></div>
                                    </div>
                                    </div>
                                    </td>
                                    
                                    </tr>                                    
                                    <!--FIN SECCION PARA SUBIR PDF-->
                                    <!-- Modal de Validación OTP (Oculto inicialmente) -->
                                    <div class="modal fade" id="otpModal" tabindex="-1" aria-hidden="true" data-bs-backdrop="static">
                                        <div class="modal-dialog modal-dialog-centered">
                                            <div class="modal-content">
                                                <div class="modal-header border-0">
                                                    <h5 class="modal-title">Verificacion de Identidad</h5>
                                                </div>
                                                <div class="modal-body text-center">
                                                    <p class="text-muted">Hemos enviado un codigo de 6 dígitos a tu correo.</p>
                                                    <div class="mb-3">
                                                        <input type="text" class="form-control text-center fs-3" id="otpInput" placeholder="000000" maxlength="6">
                                                    </div>
                                                    <button class="btn btn-success" id="btnverificarOtp">Autorizar Operación</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>                                       
                                    <tr> 
                                    <td align="center">&nbsp;</td>
                                    <td align="center">&nbsp;</td>
                                    </tr>
                                    <tr> 
                                    <td align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:history.back()"><u>Modificar Instrucci&oacute;n</u></a></td>
                                    <td align="center">&nbsp;</td>
                                    </tr>
                                    <tr> 
                                    <td >&nbsp;</td>
                                    <td align="center">&nbsp;</td>
                                    </tr>
                                    <tr> 
                                    <td>&nbsp;</td> 
                                    <td align="left">
                                    <button type="submit" id="btnEnviar" class="btn btn-primary" disabled>Aceptar</button>
                                    <!--input type="button" name="Aceptar" value="Aceptar" onClick="javascript:confirmar()" class="btn btn-primary"-->
                                    &nbsp; 
                                    </td>

                                    </tr>                                 
                              </table>
     
                            </div> 
                        </form></td>
        
                </tbody>
            </table>
        </div>
        <script>
        async function uploadFile() {          
            const fileInput = document.getElementById('pdfFile');
            const statusMessage = document.getElementById('statusMessage');
            const submitBtn = document.getElementById('btnEnviarOPT');
            const token = localStorage.getItem('token'); 
            const usuario = localStorage.getItem('usuario'); 
             var id = '<%= Folio %>'; 
            // 1. Recuperar credenciales del almacenamiento local

            if (fileInput.files.length === 0) return;

            // Crear FormData para enviar archivos vía AJAX
            const formData = new FormData();
            formData.append('file', fileInput.files[0]);
            formData.append('id', id);
            formData.append('usuario', usuario);
            formData.append('token', token);


            statusMessage.innerHTML = '<div class="alert alert-info">Subiendo...</div>';

            try {

                const response = await 
                fetch('uploadServlet', {
                method: 'POST',
                body: formData
                });
                
                const result = await response.json();
                console.log('Respuesta del Servlet:', result);

                if (result=="200") {                    
                    statusMessage.innerHTML = 'Archivo subido con éxito!';
                    statusMessage.style.color = 'green';

                    // Habilitar el botón de submit final
                    submitBtn.disabled = false;
                } else if (result=="800")
                {
                    statusMessage.innerHTML = 'El archivo ya se subio';
                    statusMessage.style.color = 'red';
                }
                 else {
                    //throw new Error('Error en el servidor');
                    submitBtn.disabled = true;
                }            
            } catch (error) {
                statusMessage.innerHTML = 'Error al subir el archivo.';
                statusMessage.style.color = 'red';
            }

        }
        
        let modalOtp = new bootstrap.Modal(document.getElementById('otpModal'));

        async function solicitarOtp() {
            const btnEnviarOPT = document.getElementById('btnEnviarOPT');
            const mensajeEstado = document.getElementById('statusMessage');

            // Cambiar estado del botón (feedback de carga)
            btnEnviarOPT.disabled = true;
            btnEnviarOPT.innerHTML = `<span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span> Enviando...`;
            mensajeEstado.innerHTML = "";

            try {
                // Ejecución API REST Asíncrona (Fetch)
                const BEARER_TOKEN = localStorage.getItem('token');
                console.log(API_BASE_URL+'/api/auth/enviar-otp')
                console.log('Bearer '+BEARER_TOKEN)
                console.log('email:'+ localStorage.getItem('usuario'))
                const response = await fetch(API_BASE_URL+'/api/auth/enviar-otp', {
                    method: 'POST',
                    headers: {
                        'Authorization': 'Bearer '+BEARER_TOKEN,
                        'Content-Type': 'application/json'
                    },
                     body: JSON.stringify({ email: localStorage.getItem('usuario') })
                });                

                if (response.ok) {
                    mensajeEstado.innerHTML = `<div class="alert alert-success">¡Codigo enviado con éxito!</div>`;
                    // Abrir el modal para ingresar el OTP
                    modalOtp.show();
                } else {
                    mensajeEstado.innerHTML = `<div class="alert alert-danger">Error al enviar el codigo.</div>`;
                }
            } catch (error) {
                console.error("Error:", error);
                mensajeEstado.innerHTML = `<div class="alert alert-danger">Error de conexión con el servidor.</div>`;
            } finally {
                btnEnviarOPT.disabled = false;
                btnEnviarOPT.innerHTML = "Enviar Código de Seguridad";
            }
        }

        async  function verificarOtp(otpIngresado) {
            const mensajeEstado = document.getElementById('statusMessage');
            const submitBtn = document.getElementById('btnEnviar');
            // Ejecución API REST Asíncrona (Fetch)
            const BEARER_TOKEN = localStorage.getItem('token');
            const response = await fetch(API_BASE_URL+'/api/auth/validar-otp', {
                method: 'POST',
                headers: {
                    'Authorization': 'Bearer '+BEARER_TOKEN,
                    'Content-Type': 'application/json'
                },
                 body: JSON.stringify({ email: localStorage.getItem('usuario'),
                 otp:otpIngresado})
            });            
            if (response.ok) {
                mensajeEstado.innerHTML = `<div class="alert alert-success">¡Código Correcto!</div>`;
                // Habilitar el botón de submit final
                submitBtn.disabled = false;                
            } else {
                mensajeEstado.innerHTML = `<div class="alert alert-danger">¡Código InCorrecto!</div>`;
            }
            modalOtp.hide();
        }
        // 2. Seleccionamos el botón
          const botonOtp = document.getElementById('btnverificarOtp');
        
          // 3. Agregamos el evento click
          botonOtp.addEventListener('click', async () => {
            try {
              botonOtp.disabled = true; // Desactivar el botón para evitar clics múltiples
                const otpIngresado = document.getElementById('otpInput').value;
                if(otpIngresado.length !== 6) {
                    Swal.fire('error', 'El código debe ser de 6 dígitos.!', 'error');
                    return;
                }       
              // Esperamos a que la función asíncrona termine
              const resultado = await verificarOtp(otpIngresado); 
            } catch (error) {
              console.error('Error:', error);
            } finally {
              botonOtp.disabled = false; // Reactivamos el botón
            }
          });
        </script>

        </TD>
    </TR>
  </TBODY>
</TABLE>
</div>
</BODY>
</HTML>
