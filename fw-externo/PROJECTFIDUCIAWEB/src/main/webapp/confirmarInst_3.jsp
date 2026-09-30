<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="Horario"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="FechaHabilSig"  class="mx.com.inscitech.clients.negocio.RetirosDB"/>
<jsp:useBean id="MonedaOrig"  class="mx.com.inscitech.clients.negocio.nServicios"/>
<jsp:useBean id="MonedaDest"  class="mx.com.inscitech.clients.negocio.nServicios"/>
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
    String[] valCtoInverOrigen;      
    valCtoInverOrigen=((String)request.getParameter("cboContratoOrigenTC")).split("-");
    String[] valCtoInverDestino;      
    valCtoInverDestino=((String)request.getParameter("cboContratoDestinoTC")).split("-");

    String sMonedaOrigen="";
    String sMonedaDestino="";
    sMonedaOrigen=valCtoInverOrigen[2];
    sMonedaDestino=valCtoInverDestino[2];
    MonedaOrig.setVtrStrDato1(sMonedaOrigen);
    MonedaOrig.querySelect(49);
    int cveMonedaOrigen = MonedaOrig.getVtrIntDato1();
    MonedaDest.setVtrStrDato1(sMonedaOrigen);
    MonedaDest.querySelect(49);
    int cveMonedaDestino = MonedaDest.getVtrIntDato1();
  
  //se activa posteriormente la validacion de saldo 
  double SaldoCO=0;//BD.getSaldoActual((String)session.getAttribute("NumFid"),valCtoInverOrigen[0]);   
   String Folio=BD.getFolio(2);
    System.out.println("La fecha desde nuevo objeto: "+request.getParameter("txtFecha"));
   String fechaValor="";
   Horario.querySelect(65);     //SE OBTIENE LA HORA DE LA BASE Y SE COMPARA VS EL HORARIO DE OPERACION EN FORMATO HH24MI
   if(Horario.getVtrIntDato1()<1600){//HORARIO MAYOR A 14:30 EN RETIROS
    fechaValor = request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha;  
    fechaValor=FechaHabilSig.obtenerFechaHabilSig(fechaValor,cveMonedaOrigen,1);
   } 
  else{
    fechaValor = request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha;  
    fechaValor=FechaHabilSig.obtenerFechaHabilSig(fechaValor,cveMonedaOrigen,2);
   } 
  
//mensaje a firmar digitalmente

		 String mensaje="\"INSTRUCCION DE TRASPASO ENTRE CONTRATOS DE INVERSION\\n\\n";       
			mensaje+="Folio de Operaci�n: "+Folio+"\\n";
        		mensaje+="Fideicomiso: "+session.getAttribute( "Fideicomiso" );
			mensaje+="\\nContrato de Inversi�n Origen: "+request.getParameter("cboContratoOrigenTC");
	                mensaje+="\\nContrato de Inversi�n Destino: "+request.getParameter("cboContratoDestinoTC");
                        mensaje+="\\nImporte: "+((NumberFormat.getCurrencyInstance(Locale.US).format(NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporteTC")).doubleValue()))).trim();
   		        mensaje+="\";";
				
		String alerta="";
		/* if(SaldoCO<(NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporteTC")).doubleValue()))
					{
					alerta="EL SALDO DEL CONTRATO DE INVERSION ORIGEN ES INSUFICIENTE<BR>NO SE PUEDE REALZAR EL TRASPASO";
					}				*/
%>
<HTML>
<HEAD><TITLE>Instrucciones - Confirmar Traspaso </TITLE>
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
      document.Traspaso.action='instruccion3.jsp';
      document.Traspaso.submit();
   <%
   }
   %>
}


 function Sign()
		{
if(bName == "Microsoft Internet Explorer")
	{		
		document.Traspaso.action="instruccion3.jsp";
		document.Traspaso.submit();
	}
	if (bName == "Netscape") 
	{
			document.Traspaso.action="instruccion3.jsp";
			document.Traspaso.submit();
   }   
}

//-->
</script>
</HEAD>
<body class="bg-light">
<jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
<div class="table-responsive">

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
                        <th><h1 class="display-1">Confirmar Traspaso</h1></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th class="alerta"><%=alerta%></th>
                    </tr>
                    <tr> 
                          <td  align="center"> <form name="Traspaso"  method="post" action="instruccion3.jsp">
                              <input type="hidden" name="Pkcs7">
                              <input type="hidden" name="SignedText">
                              <input type="hidden" name="txtFolio" value="<%=Folio%>">
                              <input type="hidden" name="cboContratoOrigenTC" value="<%=request.getParameter("cboContratoOrigenTC")%>">
                              <input type="hidden" name="cboContratoDestinoTC" value="<%=request.getParameter("cboContratoDestinoTC")%>">
                              <input type="hidden" name="cboSubCuentaOrigen" value="<%=request.getParameter("cboSubCuentaOrigen")%>">
                              <input type="hidden" name="cboSubCuentaDestino" value="<%=request.getParameter("cboSubCuentaDestino")%>">
                              <input type="hidden" name="txtImporteTC" value="<%=request.getParameter("txtImporteTC")%>">
                              <input type="HIDDEN"  name="fechaValor" 
                              value="<%=fechaValor!=null&&fechaValor.length()>0?fechaValor:(request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):"")%>">
                        <div class="table-responsive">
                            <table id="fisosDisponibles"  class="table table-responsive table-hover">
                                <thead class="table-primary" align="center">
                                    <tr>
                                        <th>&nbsp;</th>
                                        <th>DETALLE DEL TRASPASO</th>
                                        <th>&nbsp;</th>
                                    </tr>
                                </thead>
                            </table>					
			</div>
                              <table width="90%" >
                                <tr> 
                                  <td align="left">Fecha del Retiro: </td>
                                  <td > <%=fechaValor!=null&&fechaValor.length()>0?fechaValor:(request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):"")%> 
                                  </td>
                                </tr>                                                                        
                                <tr> 
                                  <td width="35%"    > 
                                    Contrato de Inversi&oacute;n Origen:</td>
                                  <td width="65%" > 
                                    <%
                                if(request.getParameter("cboContratoOrigenTC")!=null)
                                        out.print(request.getParameter("cboContratoOrigenTC"));							
                                        if(SaldoCO<(NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporteTC")).doubleValue()))			
                                                   out.print("<font class=\"subtitulo\" >&nbsp;&nbsp;[Saldo disponible: "+NumberFormat.getCurrencyInstance(Locale.US).format(SaldoCO)+"]</font>");
                                                %>
                                  </td>
                                </tr>
                                
                                <tr > 
                                  <td width="35%"    > 
                                    Subcuenta Origen:</td>
                                  <td width="65%" > 
                                    <%
                            if(request.getParameter("cboSubCuentaOrigen")!=null)
                                        out.print(request.getParameter("cboSubCuentaOrigen"));							
                                  %>
                                  </td>
                                </tr>
                                
                                
                                <tr> 
                                  <td >Contrato de Inversi&oacute;n Destino:</td>
                                  <td > 
                                    <%
                                                if(request.getParameter("cboContratoDestinoTC")!=null)
                                        out.print(request.getParameter("cboContratoDestinoTC"));
                                                %>
                                  </td>
                                </tr>
                                <tr> 
                                  <td width="35%"    > 
                                    Subcuenta Destino:</td>
                                  <td width="65%" > 
                                    <%
                            if(request.getParameter("cboSubCuentaDestino")!=null)
                                        out.print(request.getParameter("cboSubCuentaDestino"));							
                                  %>
                                  </td>
                                </tr>
                                
                                <tr > 
                                  <td  > Importe del Traspaso:</td>
                                  <td  > 
                                    <%
                                        if(request.getParameter("txtImporteTC")!=null)
                                           out.print(NumberFormat.getCurrencyInstance(Locale.US).format( NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporteTC")).doubleValue() ));
                                                %>
                                  </td>
                                </tr>
                                <%if(alerta.trim().equals(""))
                                                                {
                                                                %>
                                    <!--SECCION PARA SUBIR PDF-->
                                    <tr> 
                                    <td>&nbsp;</td>  
                                    <td style="text-align: center;"> 
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
                                    <td>&nbsp;</td>                                                                              
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
                                  <td align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:history.back()"><u>Modificar 
                                    Instrucci&oacute;n</u></a></td>
                                </tr>
                                <tr> 
                                  <td >&nbsp;</td>
                                </tr>
                                <%}%>
                               
                                <tr> 
                                    <td>&nbsp;</td>
                                  <td align="left">
                                      <% if(!alerta.trim().equals(""))
                                       {
                                     %>
                                      <input type="button" name="Modificar" value="Modificar" onClick="javascript:history.back()" class="btn btn-primary" value="Aceptar">
                                      <%}
                               else    {%>
                                        <button type="submit" id="btnEnviar" class="btn btn-primary" disabled>Aceptar</button>
                                      
                                      <%}%>
                                    </td>
                                </tr>
                              </table>
                            </form></td>
                        </tr>
                        <tr> 
                          <td align="center">&nbsp;</td>
                        </tr>


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

        </td>
  </TBODY>
</TABLE>
</div>
</BODY></HTML>
