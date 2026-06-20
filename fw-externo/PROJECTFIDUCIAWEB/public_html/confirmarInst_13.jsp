<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="consultas2"  class="com.bancomext.negocio.nServicios"/>
<jsp:useBean id="consultas"  class="com.bancomext.negocio.nServicios"/>
<%@ include file="parametrosToken.jsp" %>
<%@ include file="paramSeguridad.jsp" %>
<%@ include file="configura_bus.jsp" %>
<HTML>
<HEAD><TITLE>Instrucciones - Confirmar Instruccion No Monetaria </TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
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
    boolean bFaltanObligatorios=false;
   
   String Folio=BD.getFolio(2);
   String sNumEtapa="";
   String strEstado="";
   String numOper=request.getParameter("txtnumOper")==null?"":(String)request.getParameter("txtnumOper");
   String DescOper=request.getParameter("txtConceptoOperacion")==null?"":(String)request.getParameter("txtConceptoOperacion");
   String diasAtencion=request.getParameter("txtdiasAtencion")==null?"":(String)request.getParameter("txtdiasAtencion");


	String sBienes=request.getParameter("txtBienes")==null?"":request.getParameter("txtBienes");
	String sEdificio=request.getParameter("txtEdificio")==null?"":request.getParameter("txtEdificio");
	String nEtiquetas=request.getParameter("txtNumEtiquetas")==null?"":(String)request.getParameter("txtNumEtiquetas");
	String nCajas=request.getParameter("txtNumCajas")==null?"":(String)request.getParameter("txtNumCajas");
	String[] sEtiquetas=request.getParameterValues("txtEtiquetas");
	String[] sCajas=request.getParameterValues("field_name");	
        String[] sFechas=request.getParameterValues("sesionFecha");	
	String[] sSelect=request.getParameterValues("field_name3");	
	String[] sIndice=request.getParameterValues("txtIndiceEtiqueta");	
	String[] sConceptos=request.getParameterValues("txtConceptos");
        String valorunico="";
        if (sSelect != null)  {
            session.setAttribute("sArrselect", sSelect);
        }
	String[] OblCajas=request.getParameterValues("OblCajas");	
	String[] OblCombos=request.getParameterValues("OblCombos");		
        String[] OblFechas=request.getParameterValues("OblFechas");		
        
        String nEtiquetasHijo=request.getParameter("txtNumEtiquetasHijo")==null?"":(String)request.getParameter("txtNumEtiquetasHijo");
	String nCajasHijo=request.getParameter("txtNumCajasHijo")==null?"":(String)request.getParameter("txtNumCajasHijo");
        String[] sEtiquetasHijo=request.getParameterValues("txtEtiquetasHijo");
        String[] sCajasHijo=request.getParameterValues("field_nameHijo");
	String[] sIndiceHijo=request.getParameterValues("txtIndiceEtiquetaHijo");	
	String[] sConceptosHijo=request.getParameterValues("txtConceptosHijo");	
        String[] sSelect4=request.getParameterValues("field_name4");	

	String[] sIndiceInterno=null;
	/*System.out.println("Numero de Etiquetas"+String.valueOf(sEtiquetas.length));
	System.out.println("Numero de Cajas"+String.valueOf(sCajas.length));
	System.out.println("Numero de Select"+String.valueOf(sSelect.length));
	System.out.println("Valors de Bienes"+String.valueOf(sBienes));
	System.out.println("Valors de Edificio"+String.valueOf(sBienes));*/
	if(sCajas==null)
		System.out.println("sSelect es nulo");
		
	if(OblCajas!=null)
	for (int i = 0; i < OblCajas.length; i++){
		System.out.println("Valors de OblCajas"+OblCajas[i])	;
		if(OblCajas[i].equals("1")&&sCajas[i].length()==0)
                    bFaltanObligatorios=true;
	}
        if(OblCombos!=null)
	for (int i = 0; i < OblCombos.length; i++){
		System.out.println("Valors de OblCombos"+OblCombos[i])	;
		if(OblCombos[i].equals("1")&&sSelect[i].length()==0)
                    bFaltanObligatorios=true;
	}     
        if(OblFechas!=null)
	for (int i = 0; i < OblFechas.length; i++){
		System.out.println("Valors de OblCombos"+OblFechas[i])	;
		if(OblFechas[i].equals("1")&&sFechas[i].length()==0)
                    bFaltanObligatorios=true;
	}           

   //se obtiene la etapa a partir del numero del usuario
 /*  consultas.setVtrIntDato1(Integer.valueOf((String)session.getAttribute("NumUser")).intValue());
   consultas.querySelect(3);
   if(consultas.hasData())
    sNumEtapa=consultas.getVtrStrDato1();*/
   sNumEtapa="1"; 
  
      
%>

 <%@ include file="objetosPKI.jsp" %>
<script language="JavaScript" SRC='scripts/navegador.js'></script>
<script language="JavaScript" type="text/JavaScript">

function cancelar()
		{
		parent.location='FI_InstruccionesN.jsp'
		}
    


	function Sign()
	{
}

function confirmar() 
{
  document.Deposito.action='instruccion13.jsp';
  document.Deposito.submit();
}


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
                <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a>
                </td>
            </tr>
            </table>
        </td>
     </tr>
    <%try
    {%>
     <tr>
        <td>
        <div class="table-responsive" style="max-height: 900px; overflow-y: auto;">
            <table id="fisosDisponibles"  class="table table-responsive table-hover">
                <thead class="table-primary" align="center">
                    <tr>
                        <th><h1 class="display-1">Confirmar Instruccion No Monetaria</h1></th>
                    </tr>
                </thead>
                <tbody>
                <tr> 
                  <td height="26" align="center"> 
                    <form name="Deposito" id="Deposito" method="post" action="instruccion13.jsp">
                      <input type="HIDDEN" name="txtFolio" value="<%=Folio%>">
                      <input type="HIDDEN" name="Pkcs7">
                      <input type="HIDDEN" name="SignedText">
                      <input type="HIDDEN" name="txtConceptoD" value="<%=request.getParameter("txtConceptoD")%>">
                      <input type="HIDDEN" name="sNumEtapa" value="<%=sNumEtapa%>">
                      <input type="HIDDEN" name="txtnumOper" value="<%=numOper%>">
                      <input type="HIDDEN" name="txtConceptoOperacion" value="<%=DescOper%>">
                      <input type="HIDDEN" name="txtdiasAtencion" value="<%=diasAtencion%>">
					  
					  
					  <input type="HIDDEN" name="txtBienes" value="<%=sBienes%>">
					  <input type="HIDDEN" name="txtEdificio" value="<%=sEdificio%>">
					  
<%                      
	for (int i = 0; i < sEtiquetas.length; i++){
%>
					  <input type="HIDDEN" name="txtEtiquetas" value="<%=sEtiquetas[i]%>">


<%					  		//System.out.println("Valors de Etiquetas"+sEtiquetas[i])	;
	}
        if(sCajas!=null)
	for (int i = 0; i < sCajas.length; i++){
%>
					  <input type="HIDDEN" name="field_name" value="<%=sCajas[i]%>">
					  <input type="HIDDEN" name="txtNumCajas" value="<%=nCajas%>">					  



<%			//System.out.println("Valors de Cajas"+sCajas[i])	;
	}
        if(sSelect!=null){
	for (String arreglo : sSelect){
%>				  
					  <input type="HIDDEN" name="field_name3" value="<%= arreglo %>">


<%		System.out.println("Valores de Select"+arreglo);	
	}
        }
        if(sFechas!=null)
	for (int i = 0; i < sFechas.length; i++){
%>				  
					  <input type="HIDDEN" name="sFechas" value="<%=sFechas[i]%>">


<%		//System.out.println("Valors de Select"+sSelect[i]);	
	}
        
	for (int i = 0; i < sIndice.length; i++){
%>
					  <input type="HIDDEN" name="txtIndiceEtiqueta" value="<%=sIndice[i]%>">






<%	//System.out.println("Valors de Select"+sIndice[i]);
}
for (int i = 0; i < sConceptos.length; i++){
%>						  
						  <input type="HIDDEN" name="txtConceptos" value="<%=sConceptos[i]%>">
<%	//System.out.println("Valors de sConceptos"+sConceptos[i]);
}%>


                        <div class="table-responsive">
                            <table id="fisosDisponibles"  class="table table-responsive table-hover">
                                <thead class="table-primary" align="center">
                                    <tr>
                                        <th>&nbsp;</th>
                                        <th>DETALLE DEL SERVICIO SOLICITADO</th>
                                        <th>&nbsp;</th>
                                    </tr>
                                </thead>
                            </table>
                            <table class="table table-responsive table-hover">

                                <tr  class="celda02"> 
                                <td> Servicio Solicitado:</td>
                                <td> 
                                <%
                                if(!request.getParameter("txtConceptoOperacion").equals(""))
                                out.print(request.getParameter("txtConceptoOperacion"));
                                %>
                                </td>
                                <td>&nbsp;</td>                            
                                </tr>
                                
                                <% ///////// PARA EXTINCION
                                if(request.getParameter("txtConceptoOperacion").equals("EXTINCION ")) {
                                %>
                                <tr  class="celda02"> 
                                <td> Confirmacion:</td>
                                <td></td>                          
                                </tr>
                                <tr  class="celda02">
                                <td> Patrimonio:</td>
                                <td width="333" class="texto">
                                <%
                                consultas2.removerValores();
                                consultas2.setVtrIntDato1(Integer.parseInt((String)session.getAttribute("NumFid")));
                                consultas2.querySelect(206);
                                if(consultas2.hasData()) {
                                //  String strEstado="";
                                strEstado=consultas2.getVtrStrDato1();     
                                
                                }
                                
                                
                                %>
                                <input type="text" name="txtpatrimonio" size="25" class="texto3"  value="<%=consultas2.getVtrStrDato1()   %>"   >  
                                </td>
                                </tr>
                                
                                <tr  class="celda02">
                                <td> Honorarios:</td>
                                <td width="333" class="texto">
                                <%
                                consultas2.removerValores();
                                consultas2.setVtrIntDato1(Integer.parseInt((String)session.getAttribute("NumFid")));
                                consultas2.querySelect(207);
                                if(consultas2.hasData()) {
                                strEstado=consultas2.getVtrStrDato1();     
                                
                                }
                                
                                
                                %>
                                
                                <input type="text" name="txthonorarios" size="25" class="texto3"  value="<%=consultas2.getVtrStrDato1()   %>"   >  
                                </td>
                                </tr>
                                
                                <tr  class="celda02">
                                <td> RDC:</td>
                                <td width="333" class="texto">
                                <%
                                consultas2.removerValores();
                                consultas2.setVtrIntDato1(Integer.parseInt((String)session.getAttribute("NumFid")));
                                consultas2.querySelect(209);
                                if(consultas2.hasData()) {
                                strEstado=consultas2.getVtrStrDato1();     
                                }
                                %>                                
                                <input type="text" name="txtrdc" size="25" class="texto3"  value="<%=consultas2.getVtrStrDato1()   %>"   >  
                                </td>
                                </tr>
                                
                                <tr  class="celda02">
                                <td> Fiscal:</td>
                                <td width="333" class="texto">
                                <%
                                consultas2.removerValores();
                                consultas2.setVtrIntDato1(Integer.parseInt((String)session.getAttribute("NumFid")));
                                consultas2.querySelect(211);
                                if(consultas2.hasData()) {
                                //  String strEstado="";
                                strEstado=consultas2.getVtrStrDato1();                                     
                                }
                                %>
                                
                                <input type="text" name="txtFiscal" size="25" class="texto3"  value="<%=consultas2.getVtrStrDato1()   %>"   >  
                                </td>
                                </tr>
                                
                                <tr  class="celda02">
                                <td> Valores:</td>
                                <td width="333" class="texto">
                                <%
                                consultas2.removerValores();
                                consultas2.setVtrIntDato1(Integer.parseInt((String)session.getAttribute("NumFid")));
                                consultas2.querySelect(208);
                                if(consultas2.hasData()) {
                                strEstado=consultas2.getVtrStrDato1();     
                                
                                }
                                
                                
                                %>
                                <input type="text" name="txtValores" size="25" class="texto3"  value="<%=consultas2.getVtrStrDato1()   %>"   >  
                                </td>
                                </tr>
                                
                                <tr  class="celda02">
                                <td> Contable:</td>
                                <td width="333" class="texto">
                                <%
                                consultas2.removerValores();
                                consultas2.setVtrIntDato1(Integer.parseInt((String)session.getAttribute("NumFid")));
                                consultas2.querySelect(208);
                                if(consultas2.hasData()) {
                                strEstado=consultas2.getVtrStrDato1();                                     
                                }
                                %>
                                <input type="text" name="txtContable" size="25" class="texto3"   value="<%=consultas2.getVtrStrDato1()   %>"   >  
                                </td>
                                </tr>
                                
                                <tr  class="celda02">
                                <td> Embargos:</td>
                                <td width="333" class="texto">
                                <%
                                consultas2.removerValores();
                                consultas2.setVtrIntDato1(Integer.parseInt((String)session.getAttribute("NumFid")));
                                consultas2.querySelect(210);
                                if(consultas2.hasData()) {
                                strEstado=consultas2.getVtrStrDato1();     
                                
                                }
                                %>
                                <input type="text" name="txtEmbargos" size="25" class="texto3"  value="<%=consultas2.getVtrStrDato1()   %>"   >  
                                </td>
                                </tr>
                                <%} %>
                                
                                <tr  class="celda02"> 
                                <td> Documentos a entregar:</td>
                                <td>
                                </td>  
                                <td>&nbsp;</td>                            
                                </tr>  
                                <%
                                consultas.removerValores();
                                consultas.setVtrStrDato1(numOper);
                                consultas.querySelect(4);
                                if(consultas.hasData())
                                for(int j=0;j<consultas.getSize();j++){
                                consultas.setIndex(j);
                                %>
                                <tr class="celda02">
                                <td>&nbsp;</td>                            
                                <td> 
                                <%=consultas.getVtrStrDato2()%>
                                </td>
                                <td align="right"  colspan="2">
                                <DIV align="center">
                                <P class="texto">
                                Selecciona archivo:<input  name="archivo" type="file"/>&nbsp;&nbsp;&nbsp;
                                <input class="boton" value="Guardar" type="submit"/><br><br>
                                </P>
                                </DIV>    
                                </td>
                                </tr>                             
                                <%
                                }
                                else{
                                %>
                                <tr class="celda02">
                                <td>
                                </td>                             
                                <td> &nbsp; </td>
                                </tr>                             
                                <% 
                                }
                                %>
                                
                                <tr  class="celda02"> 
                                <td>Tiempo de Atencion de la Solicitud:</td>
                                <td> 
                                <%
                                if(!request.getParameter("txtdiasAtencion").equals(""))
                                out.print(request.getParameter("txtdiasAtencion"));
                                %>
                                </td>
                                <td>&nbsp;</td>
                                </tr> 
                                <tr  class="celda02"> 
                                <td> Datos de la Solicitud:</td>
                                <td>
                                </td> 
                                <td>&nbsp;</td>                            
                                </tr> 						
                                <%	for (int i = 0; i < sEtiquetas.length; i++){
                                    sIndiceInterno=sIndice[i].split(",");		
                                %>
                                <tr class="celda02">
                                <td>
                                    <%
                                    System.out.println("Etiquetas: "+sEtiquetas[i]);
                                    out.print(sEtiquetas[i]);
                                    %>
                                </td>                            
                                <td> 
                                    <%
                                    System.out.println("Tipo de Objetos: "+sIndiceInterno[1]);
                                    System.out.println("Indice de Objetos: "+sIndiceInterno[2]);
                                    int indice=Integer.parseInt(sIndiceInterno[2]);
                                    if(sIndiceInterno[1].equals("CAJA")){
                                out.print(sCajas[indice]);
                                    }
                                    else if(sIndiceInterno[1].equals("FECHA")){
                                out.print(sFechas[indice]);
                                    }else{
                                    out.print(sSelect[indice].replaceAll("\"", "").replaceAll("=", ""));
                                    }%>
                                </td>
                                <td>&nbsp;</td>                            
                                </tr> 						
                                <%}%>
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
                                <td align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:window.history.back()"><u>Modificar 
                                Instrucci&oacute;n</u></a></td>
                                <td >&nbsp;</td>
                                <td >&nbsp;</td>
                                </tr>
                                <tr> 
                                <td >&nbsp;</td>
                                <td >&nbsp;</td>
                                <td >&nbsp;</td>
                                </tr>
                                <tr> 
                                <td >&nbsp;</td>
                                
                                <td align="center"> 
                                <button type="submit" id="btnEnviar" class="btn btn-primary" disabled>Aceptar</button>                                
                                </td>        
                                <td>&nbsp;</td>
                                </tr>
                            </table>
                         </div>   
                      </form>
                    </td>
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

<%
}
catch(Exception e)
{
         %>
            <table align="center" width="90%" class="alerta">
            <tr>
              <td  class="alerta"> <p>&nbsp;</p>
            <p>TU OPERACION NO PUEDE SER PROCESADA, AUN NO HA SIDO PARAMETRIZADA 
            EN EL SISTEMA.</p>
            <p>FAVOR DE INFORMAR A TU EJECUTIVO DE CUENTA.</p>
            </p>
            <p><br>
            </p>
            </td>
            </tr>
            </table>
	<%

}
%>
  </TBODY>
</TABLE>
</div>
</BODY></HTML>
