var catProspectosFideicomitentes = new Catalogo("mx.com.inscitech.fiducia.domain.FideicomProspecto");

showWaitLayer();

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;

var clavesCombo31  = JSON.parse("{\"llaveClave\":31}"); // Estatus de registro
var clavesCombo29 = JSON.parse("{\"llaveClave\":29}"); // Tipos de persona
var consultaDatosInformativos = JSON.parse("{\"id\":\"muestraNombreProspecto\",\"numProspecto\":0}");
var verificaExistenciaProspecto = JSON.parse("{\"id\":\"verificarExistenciaRegistroProspecto\",\"numProspecto\":0}");

var contenedor = new Object();

initForms();

var tablaFideicomitentesData = new Array();
tablaFideicomitentesData[0] = "fidNumProspecto,60";
tablaFideicomitentesData[1] = "fidCvePersona,100";
tablaFideicomitentesData[2] = "fidSecuencialPersona,80";
tablaFideicomitentesData[3] = "fidNomPersona,100";
tablaFideicomitentesData[4] = "fidApPaterno,100";
tablaFideicomitentesData[5] = "fidApMaterno,100";
tablaFideicomitentesData[6] = "fidCveStPersona,100";
tablaFideicomitentesData[7] = "statuspld,100px";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var parametroComboEstado;
var usarSetValuesFormObject=false;
var fvMantenimientoFideicomitentes = new FormValidator();

//No permitir editar el campo informativo de la p谩gina principal:
//1. Nombre del proyecto (Nombre del negocio)
//deshabilitaPK("txtNomProyecto".split(","));

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalProspectosFideicomitentes() {
  onButtonClickPestania("Formalizacion.PrincipalProspectosFideicomitentesFideicomisarios","");
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catProspectosFideicomitentes.getCatalogo());
}

function operacionExitosa() {
  Swal.fire('Aviso', 'La operaci贸n se realiz贸 correctamente',  'warning');
  cargaPrincipalProspectosFideicomitentes();
  hideWaitLayer();
}


function operacionExitosaKYC() {
  Swal.fire('Aviso', 'La operaci贸n se realiz贸 correctamente',  'warning');
  //cargaPrincipalProspectosFideicomitentes();
  ocultaObjs("cmdAceptar"); //Mostrar el bot贸n Aceptar y Cancelar
  SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al bot贸n
  deshabilitaObjetos(GI("frmDatosMantenimientoFideicomitentes"));      
  hideWaitLayer();
}


//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda pantalla
function cargaMantenimientoFideicomitentes(tipoPantalla) {
  if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Formalizacion/MantenimientoProspectosFideicomitentesFideicomisarios.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoProspectosFideicomitentes, null);
  }
}

function despliegaPantallaMantenimientoProspectosFideicomitentes(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimientoFideicomitentes.setup({
    formName      : "frmDatosMantenimientoFideicomitentes",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
  
  //No permitir editar el campo informativo de la p谩gina de mantenimiento:
  //1. Nombre del proyecto (Nombre del negocio)
  deshabilitaPK("txtNomProyecto,fidNumProspecto,fidSecuencialPersona".split(","));
}

function loadCatalogo() {
  catProspectosFideicomitentes.setOnUpdate(catLoaded);
  if(operacion==MODIFICAR || operacion==CONSULTAR)
    catProspectosFideicomitentes.buscaCatalogoPK(false);
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el bot贸n Aceptar y Cancelar
    formsLoaded();
  }
}


function catLoaded() {

  if(operacion==MODIFICAR)//Si se trata de una modificaci贸n, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el bot贸n Aceptar y Cancelar
    deshabilitaPK("fidNumProspecto,fidSecuencialPersona".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al bot贸n
    deshabilitaObjetos(GI("frmDatosMantenimientoFideicomitentes"));                   //Deshabilita objetos (excepto botones)

  }
  muestraObjs("cmdCancelar"); //Mostrar el bot贸n Regresar
  //Mostrar datos en campos informativos
  mostrarDatosInformativos(3);
  formsLoaded();
}

function AltaOModificaInfo() {
  catProspectosFideicomitentes.setOnUpdate(operacionExitosaKYC);
  if(operacion==ALTA && fvMantenimientoFideicomitentes.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    catProspectosFideicomitentes.altaCatalogo();
  }
  else if(operacion==MODIFICAR && fvMantenimientoFideicomitentes.checkForm())//Se trata de una modificaci贸n
  {
    showWaitLayer();
    catProspectosFideicomitentes.modificaCatalogo();
  }
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    catProspectosFideicomitentes.setOnUpdate(operacionExitosa);
    showWaitLayer();
    eliminaCatalogo(catProspectosFideicomitentes);
  }
}


//////////////////////////////////////////////////////////////
function consultarExistenciaFideicomitente() {
  if(GI("fidNumProspecto").value!="")
    mostrarDatosInformativos(2);
  else if(GI("fidNumProspecto").value=="")
    GI("txtNomPr").value="";
}

function mostrarDatosInformativos(parametroPantalla) {
  GI("txtNomProspecto").value="";
  showWaitLayer();
  if(parametroPantalla==1)
  {
    consultaDatosInformativos.numProspecto = GI("paramProspecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
  }
  else if(parametroPantalla==2)
  {
    var Secuencial = JSON.parse("{\"id\":\"secNumFideicomProspecto\",\"numProspecto\":0}");
    Secuencial.numProspecto=GI("fidNumProspecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(Secuencial);
    makeAjaxRequest(url, "HTML", verificarSecuencial, null);
  }
  else
  {
    consultaDatosInformativos.numProspecto = GI("fidNumProspecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
  }
}

function verificarAlta(obj, result) {
  var objResult = JSON.parse(result);

  if(objResult[0].existeRegistro > 0)
  {
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
  }
  else
  {
    Swal.fire('Aviso', 'El Proyecto no existe, verifique',  'warning');
    GI("afbAnteproyecto").value="";
    GI("txtNomProyecto").value="";
    GI("afbNumFidben").value="";
    GI("afbAnteproyecto").focus();
    hideWaitLayer();
  }
}

function insertaDatosInformativos(obj, result) {
  var objResult = JSON.parse(result);
  GI("txtNomProspecto").value=objResult[0].prsNomProspecto;
  hideWaitLayer();
}

function verificarSecuencial(obj, result) {
  var objResult = JSON.parse(result);
  GI("fidSecuencialPersona").value=objResult[0].fidSecuencialPersona;
  
  consultaDatosInformativos.numProspecto = GI("fidNumProspecto").value;
  verificaExistenciaProspecto.numProspecto = GI("fidNumProspecto").value;
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(verificaExistenciaProspecto);
  makeAjaxRequest(url, "HTML", verificarAlta, null);
}


function cargaParametros(obj,result)
{
  GI("cargaCheck").innerHTML = result;
  //initForms();
  GI("paramProyecto").value= obj.Proyecto;
  GI("paramTPersona").value= obj.TPersona;
  GI("paramNumPersona").value= obj.NumPersona;
  GI("paramNomPersona").value= obj.NomPersona;
  GI("idRegresar").value = 1;
   GI("paramTipo").value =1;
  
 var url = ctxRoot + "/executeRef.do?json={\"id\":\"ejeFunCargaConceptosKYCProyecto\",\"TPersona\":\"" + obj.TPersona + "\",\"Proyecto\":" + obj.Proyecto + ",\"Tipo\":" + 1 + ",\"NumPersona\":" + obj.NumPersona + "}";
 
 makeAjaxRequest(url, "HTML",cargaConceptosKYC,null);
}

function cargaConceptosKYC(obj,result){
  var resultado = JSON.parse(result).result;
  switch(resultado){
    case 0:
        consultar(GI("cmdCargar"), GI('frmCheckList'), false);
    break;
    case 1:
      Swal.fire('Aviso', 'No hay Conceptos para esta Persona',  'warning');
    break;
  }
  hideWaitLayer();
  GI('ContenedorKYC').style.visibility='visible';
  GI('cargaConceptos').innerHTML='<div style="color: #CCCCCC;font-size: 70px;font-weight: bold;">KYC</div>';
}

//funcionIncorporaTipoPersPLD
function incorporaPLD(coincidencia) {
    var vgContenedorDatos = {
        id: 'funcionIncorporaTipoPersPLD',
        Etapa: 'PROMOCION',
        NumProyFid: eval(pkInfo.fidNumProspecto),
        TipoPers: pkInfo.fidCvePersona,
        NumPers: eval(pkInfo.fidSecuencialPersona),
        Nombre: pkInfo.fidNomPersona,
        CatPersona: '',
        Pais: '',
        Calidad: '',
        Status: 'PENDIENTE',
        Coincidencia: coincidencia
    };

    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
    makeAjaxRequest(url, "HTML", ejecutaFuncion, null);        
}

function validalistas(tp, result){
    resultado = JSON.parse(result);
    
    if(resultado[0].existeRegistro != 0) {
        Swal.fire('Aviso', 'Ocurrencia en Personas No Gratas!',  'warning');

        incorporaPLD(1); // Se reporta que se encontro una coincidencia

        //ENVIAR CORREO DE LISTA NEGRA PROVISIONAL PARA LISTA NEGRA = 1
        enviaCorreoPLD(pkInfo.fidNumProspecto,pkInfo.fidCvePersona,pkInfo.fidSecuencialPersona);
        
    } else {
        validarWatchLists();
    }    
    
}

function validarWatchLists() {
    //Reemplazar con campos separados
    /*var nombreInfo = pkInfo.fidNomPersona.split(' ');
    var apMaterno = nombreInfo.length > 2 ? nombreInfo[2] : '';*/
    var nombreInfo = pkInfo.fidNomPersona;
    var apPat = pkInfo.fidApPaterno;
    var apMat = pkInfo.fidApMaterno;
    var datosPersona = {
        /*name: nombreInfo[0],
        lastName: nombreInfo[1],
        secondLastName: apMaterno,*/
        name: nombreInfo,
        lastName: apPat,
        secondLastName: apMat,
        tin: (pkInfo.fidRfcPersona == 'null') ? '': pkInfo.fidRfcPersona,
        curp: (pkInfo.fidCurpPersona == 'null') ? '': pkInfo.fidCurpPersona,
        clientTypeID: '1'
    };

    var url = ctxRoot + "/listasNegras.do?json=" + JSON.stringify(datosPersona);
    makeAjaxRequest(url, "HTML", validacionWL, null);
}

function validacionWL(obj, result) {
    var resp = JSON.parse(result);
    
    if(isDefinedAndNotNull(resp)) {
    
        if(resp.succeded) {
            var wlInfo = resp.responseObj;
            if(isDefinedAndNotNull(wlInfo)) {
                if(isDefinedAndNotNull(wlInfo) && wlInfo.matches.length > 0) {
                    //Existe en listas negras
                    incorporaPLD(1);
                } else {
                    //No Existe en listas negras
                    incorporaPLD(0);
                }
            }
        } else {
            alert("Error: " + resp.exitCode + " - " + resp.responseMessage);    
        }
        
    } else {
        Swal.fire('Aviso', 'Ocurri贸 un error, por favor consulte al administrador.',  'warning');
    }
    
    hideWaitLayer();
}

function validacatalogoAlterno(){    
    if(isDefinedAndNotNull(pkInfo)) {
        showWaitLayer();
        var vgContenedorDatos = {id:'validaPersNG', nombrePNG: pkInfo.fidNomPersona.toUpperCase()};
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
        makeAjaxRequest(url, "HTML", validalistas, null); 
    } else {
        Swal.fire('Aviso', 'Debe seleccionar el registro a validar!',  'warning');
    }
}

function ejecutaFuncion(tp,result){
    //alert(result);
    var rusultado= JSON.parse(result);
    var res=rusultado.result;
    if(res==0){
      Swal.fire('∩xito!', 'Operaci髇 realizada correctamente', 'success');
    } 
    else if(res==1){
      Swal.fire('Aviso', 'La persona ya se valido',  'warning');
    }   
    else {
      Swal.fire('Aviso', 'Ocurrio un error al realizar la Operacion.',  'warning')}
    hideWaitLayer();     
  }
  
  function enviaCorreoPLD(proyecto, cvePersona, numFidben){
    //parametro ANT_NUM_PROSPECTO AFB_CVE_PERSONA AFB_NUM_FIDBEN
    //alert("proyecto:"+proyecto+" cvePersona:"+cvePersona+" numFidbem:"+numFidben );
     var idLink = "linkReporteNew"; 
     var parametrosUrl = new Object;
     parametrosUrl.sendToJSP="true";
   //Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte="/modules/Formalizacion/CorreoPLD/EnviarCorreo.jsp"
     parametrosUrl.id="mandaCorreoPLD2";
	 parametrosUrl.numProspecto = proyecto;
         parametrosUrl.cvePersona = cvePersona;
         parametrosUrl.numFidben = numFidben;
     var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
	 //alert(url)
     idLink.href=url;
     window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");        
     //idLink.click();
     document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
  }