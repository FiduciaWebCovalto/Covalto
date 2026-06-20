var catProspectos = new Catalogo("mx.com.inscitech.fiducia.domain.Prospect");
var catAnteproy = new Catalogo("mx.com.inscitech.fiducia.domain.Anteproy");

showWaitLayer();

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;
var BAJA = 4;
var ASIGNACION_FIDEICOMISO = 5;
var ETAPA_PROYECTO = 6;

var clavesCombo16  = JSON.parse("{\"llaveClave\":16}");
var clavesCombo23  = JSON.parse("{\"llaveClave\":23}");
var clavesCombo36  = JSON.parse("{\"llaveClave\":37}");
var clavesCombo148 = JSON.parse("{\"llaveClave\":36}");
var clavesCombo161 = JSON.parse("{\"llaveClave\":161}");
var clavesCombo1007 = JSON.parse("{\"llaveClave\":1007}");
var clavesCombo1011 = JSON.parse("{\"llaveClave\":1011}");

var clavesComboTipoPersona = JSON.parse("{\"llaveClave\":23}");
var clavesComboPerfilHOGAN = JSON.parse("{\"llaveClave\":1076}");
var clavesComboTipoNegocio = JSON.parse("{\"llaveClave\":36}");
var clavesComboLineaNegocio = JSON.parse("{\"llaveClave\":1077}");
var clavesComboEmpresa = JSON.parse("{\"llaveClave\":1003}");
var paramComboProducto = JSON.parse("{}");
var clavesComboSucursal = JSON.parse("{\"llaveClave\":1078}");
var clavesComboClavePromotorCS = JSON.parse("{\"llaveClave\":1079}");
var clavesComboClavePromotorCM = JSON.parse("{\"llaveClave\":1080}");

var clavesComboClaveSubdirector = JSON.parse("{\"llaveClave\":1132}");
var clavesComboClaveGrupo = JSON.parse("{\"llaveClave\":1133}");

var validaExistaRegistro = JSON.parse("{\"id\":\"verificarExistenciaRegistroProspecto\",\"numProspecto\":-1}");
var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaProspecto\",\"numProspecto\":0}");

initForms();

var tablaProspectosData = new Array();
tablaProspectosData[0] = "prsNumProspecto,42";
tablaProspectosData[1] = "prsNomProspecto,364";
tablaProspectosData[2] = "prsTipoNegocio,131";
tablaProspectosData[3] = "prsFecProspecto,118";
tablaProspectosData[4] = "prsFecConstit,111";
tablaProspectosData[5] = "prsNumContrato,88";
tablaProspectosData[6] = "prsCveStatus,107";

var operacion = 0;
var numPantalla = 0;

var parametroComboEstado;
var numRama;
var tipoPers;
var usarSetValuesFormObject=false;

pkInfo = null;
var fechaConstitucion = new Date();
var fechaProspecto = new Date();
var fvMantenimientoProspectos = new FormValidator();

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalProspectos() {
    onButtonClickPestania("Formalizacion.PrincipalProspectos","");
}

function clickTabla(pk) {
    pkInfo = pk;
    cloneObject(pk,catProspectos.getCatalogo());
}

function verificaExistaProspecto() {
    if(GI("prsNumProspecto").value!="") {
        validaExistaRegistro.numProspecto=GI("prsNumProspecto").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validaExistaRegistro);
        makeAjaxRequest(url, "HTML", verificacionExistaProspecto, null);
    }
}

function verificacionExistaProspecto(obj, result) {
    var objResult = JSON.parse(result);
    if(objResult[0].existeRegistro > 0) {
        Swal.fire('Aviso', 'El Prospecto ya existe',  'warning');
        GI("prsNumProspecto").value="";
    }
}

//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda pantalla
function cargaMantenimientoProspectos(tipoPantalla) {
    if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null) {
        Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
    } else {
        if(pkInfo!=null && tipoPantalla==MODIFICAR) {
            if(pkInfo.prsCveStatus == "CONSTITUIDO") {
                Swal.fire('Aviso', 'El Prospecto está CONSTITUIDO',  'warning');
            } else {
                operacion = tipoPantalla;
                numPantalla = 1;
                showWaitLayer();
                var urlCliente = ctxRoot + "/modules/Formalizacion/MantenimientoProspectos.do";
                makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoProspectos, null);
            }
        } else {
            operacion = tipoPantalla;
            numPantalla = 1;
            showWaitLayer();
            var urlCliente = ctxRoot + "/modules/Formalizacion/MantenimientoProspectos.do";
            makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoProspectos, null);      
        }
    }
}

function despliegaPantallaMantenimientoProspectos(obj, result) {
    GI("dvPantalla").innerHTML = result;
    initForms();
  
    //Agregando la funcionalidad del required
    fvMantenimientoProspectos.setup({
        formName      : "frmDatosMantenimientoProspectos",
        tipoAlert     : 1,
        alertFunction : BaloonAlert,
        sendObjToAlert: true
    });

    //Agregando la funcinalidad de la Fecha Prospecto
    Calendar.setup({
        inputField     :    "prsFecProspecto",   // id of the input field
        button         :    "prsFecProspecto",
        ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
        showsTime      :    false,
        timeFormat     :    "24",
        onUpdate       :    setFechaCal,
        disableFunc    :    isValidDate,
        date           :    fechaProspecto,
        weekNumbers    :    false,
        cache          :    true,
        step           :    1
    });
    hideWaitLayer();
}


function loadCatalogo() {
    catProspectos.setOnUpdate(catLoaded);
    deshabilitaPK("prsNumProspecto".split(","));
    if(operacion==MODIFICAR || operacion==CONSULTAR) {

        catProspectos.buscaCatalogoPK(false);
    } else {
        muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
    
        var Secuencial = JSON.parse("{\"id\":\"numSecProspecto\"}");
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(Secuencial);
        makeAjaxRequest(url, "HTML", verificarSecuencial, null);
    }
}

function verificarSecuencial(obj, result) {
    var objResult = JSON.parse(result);
    GI("prsNumProspecto").value=objResult[0].secNumProspecto;
    hideWaitLayer();
}

function catLoaded() {
    //cargaParamComboEstado(GI("prsNomPais"),true);
    if(operacion==MODIFICAR) {
        muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
    } else if(operacion==CONSULTAR) { //Si se trata de una consulta, deshabilitar
        SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
        deshabilitaObjetos(GI("frmDatosMantenimientoProspectos"));                  //Deshabilita objetos (excepto botones)
    }
    muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
    
    formsLoaded();
    hideWaitLayer();
}

function AltaOModificaInfo() {
    catProspectos.setOnUpdate(operacionExitosa);
    if(operacion==ALTA && fvMantenimientoProspectos.checkForm()) { //Se trata de una alta
        showWaitLayer();
        catProspectos.altaCatalogo();
    } else if(operacion==MODIFICAR && fvMantenimientoProspectos.checkForm()) { //Se trata de una modificación
        showWaitLayer();
        catProspectos.modificaCatalogo();
    }
    hideWaitLayer();
}

function operacionExitosa(el, result) {
  /*var objError = JSON.parse(el);
  if(objError.tipoError === "ERROR") {
      alert(objError.mensajeError + " Error: " + objError.detalleError);
  } else {*/
      Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
        hideWaitLayer();      
      cargaPrincipalProspectos();
  //}    
}

function cancelarRegistro() {
    if(pkInfo == null) {
        Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
        return;
    } else {
        var obj = JSON.parse("{}");
        obj.id = "frm.fnAsignaCuentasProspecto";
        obj.tipoOperacion = 2;
        obj.banco = 0;
        obj.tipoCuenta = 0;
        obj.moneda = 0;
        obj.prospecto = pkInfo.prsNumProspecto;
        obj.cuentas = 0;
        var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(obj);
        makeAjaxRequest(url, "HTML", validarCancelacion, null);
    }
}

function validarCancelacion(obj, resultado) { 
    var resp = JSON.parse(resultado);
    var r = resp.result
    
    switch(r) {
        case -1: 
            Swal.fire('Aviso', 'A ocurrido un error',  'warning'); 
        break;
        case 0:
            Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
            consultar(GI('cmdAceptar'), GI('frmDatosProspectosConsulta'), false);
            Swal.fire('Aviso', 'Se enviará correo a Operaciones para dar de baja el CIS',  'warning');
            pkInfo = null;
        break;
        case 1:
            Swal.fire('Aviso', 'No se puede cancelar el prospecto ya que está asignado a un proyecto',  'warning'); 
        break;
    }
}

//////////////////////////////////////////////////////////////////////////////
//Funciones para el uso del calendario
function setFechaCal() {}

function isValidDate(date) {
    var today = new Date();
    if(date>today) {
        return true;
    } else {
        return false;
    }
}

//----------------------------------------- Pantalla de Cuentas
function cargaPrincipalCuentas() {
    var obj =  new Object();
    obj.prsNumProspecto = GI("prsNumProspecto").value;
    obj.prsNomProspecto = GI("prsNomProspecto").value;
    var urlCliente = "modules/Formalizacion/AsignacionCuentas/PrincipalAsignaCuentas.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipalDirecciones, obj);
    loadDynamicJS(ctxRoot + "/modules/Formalizacion/AsignacionCuentas/PrincipalAsignaCuentas.js");
}

function cargaPrincipalCuentas2() {
    var urlCliente = "modules/Formalizacion/AsignacionCuentasActinver/PrincipalAsignaCuentas.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipalDirecciones, obj);
    loadDynamicJS(ctxRoot + "/modules/Formalizacion/AsignacionCuentasActinver/PrincipalAsignaCuentas.js");
}

function despliegaPantallaPrincipalDirecciones(obj, result) {
    GI("dvPantalla").innerHTML = result;
    deshabilitaObjetos(GI("frmDatos"));
    GI("paramnumProspecto").value = obj.prsNumProspecto; //prsNumProspecto
    GI("prsNomProspecto").value = obj.prsNomProspecto; //prsNumProspecto
    consultar(GI("cmdRegresar"), GI("frmDatos"), false);
    formsLoaded();
}

function generacionCartaAceptacion(){
    var idLink = "linkReporteNew"; 
    var parametrosUrl = new Object;
    parametrosUrl.sendToJSP="true";
    parametrosUrl.urlReporte="/jsp/Reportes/Formalizacion/CartaAceptacion.jsp"
    parametrosUrl.id="repCartaAceptacion";
    parametrosUrl.proyecto=pkInfo.prsNumProspecto;
    var url = ctxRoot + "/imprimirReporte.do?json=" + encodeURIComponent(JSON.stringify(parametrosUrl));
    idLink.href=url;
    window.open(url,GI("linkReporteNew").value);  
    document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
}
  
function validaCorreoAceptacion(){
    validacionAlta.numProspecto = pkInfo.prsNumProspecto;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificarAlta, null);
}

function verificarAlta(obj, result) {
    var objResult = JSON.parse(result);
    if(objResult[0].totalProspecto > 0) {  
        Swal.fire('Aviso', 'El Prospecto no existe o tiene Personas en Listas Negras, verifique',  'warning');
    } else {
        enviaCorreoAceptacion(pkInfo.prsNumProspecto);
    }
}
  
function enviaCorreoAceptacion(numProsp){
    var idLink = "linkReporteNew"; 
    var parametrosUrl = new Object;
    parametrosUrl.sendToJSP="true";
    parametrosUrl.urlReporte="/modules/Formalizacion/CorreoPromo/EnviarCorreo.jsp"
    parametrosUrl.id="mandaCorreoAut6";
    parametrosUrl.prospecto = numProsp;
    
    var url = ctxRoot + "/imprimirReporte.do?json=" + encodeURIComponent(JSON.stringify(parametrosUrl));
    idLink.href=url;
    
    window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");        
    
    document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
}

function asignarFideicomiso() {
    if(isDefinedAndNotNull(pkInfo)) {
        if(Number(pkInfo.prsNumContrato) > 0) {
            Swal.fire('Aviso', 'El prospecto ya tiene asignado un No. de Fideicomiso',  'warning');
            return;
        }
        Swal.fire({
                title: "Esta seguro de que desea asignar el No. de Fideicomiso " + 
                pkInfo.prsNumProspecto + " al Prospecto " + pkInfo.prsNumProspecto,
                showCancelButton: true,
                confirmButtonText: 'Aceptar',
                cancelButtonText: 'Cancelar'
            }).then((result) => {
            if (result.isConfirmed) {
                operacion = ASIGNACION_FIDEICOMISO;
                //showWaitLayer();
                catProspectos.setOnUpdate(actualizaFideicomiso);
                catProspectos.buscaCatalogoPK(false);
                //enviarCorreo();

            } 
            });
        //ocultaMuestraFiso('visible');
    } else {
        Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
    }
}

  function enviarCorreo()
  {
    var parametrosUrl = new Object;
    idLink = "linkReporteNew"; 
    parametrosUrl.id = GI("refQry").value;
    parametrosUrl.sendToJSP=true;
    parametrosUrl.urlReporte="/jsp/Reportes/Administracion/EnviarCorreoCIS.jsp";
    var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
    var link = GI(idLink);
    link.href=url;
    window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");   
    document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }    
  }

function ocultaMuestraFiso(ovisibility) {
    GI('tablaFiso').style.visibility = ovisibility;// tabla fiso
    GI('txtNoFideicomiso').value = '';
}

function determinaFideicomiso() {
    var obj = JSON.parse("{}"); 
    obj.id = "determinaSigContrato";
    obj.NumProyecto = pkInfo.prsNumContrato;
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(obj);
    
    makeAjaxRequest(url, "HTML", determinaFideicomisoRes, null);  
}

function determinaFideicomisoRes(obj, result) {
    var objResult = JSON.parse(result);
    
    if(isDefinedAndNotNull(objResult)) {
        var txtNextFid = objResult.RESULTADO;
        GI("txtNoFideicomiso").value = txtNextFid;       
    } else {
        GI("txtNoFideicomiso").value="";
    }
}


function verificaNoExistaFideicomiso() {
    if(GI("txtNoFideicomiso").value!="") {
        validacionNoExistaFideicomiso.numContrato = GI("txtNoFideicomiso").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionNoExistaFideicomiso);
        makeAjaxRequest(url, "HTML", verificarNoExistenciaFideicomiso, null);
    }
}

function verificarNoExistenciaFideicomiso(obj, result) {
    var objResult = JSON.parse(result);
    if(objResult[0].ctoNumContrato > 0) {
        Swal.fire('Aviso', 'El No. de Fideicomiso ya existe, favor de verificarlo',  'warning');
        GI("txtCveFideicomiso").focus();
    }
}

function botonFideicomiso(fisoOpc){
    if(fisoOpc=='CANCELAR') {
        ocultaMuestraFiso('hidden');
    } else if(fisoOpc=='ACEPTAR') {
        if(GI('txtNoFideicomiso').value.length <= 0) {
            Swal.fire('Aviso', 'Seleccione Generar Fideicomiso',  'warning');
        } else {
            showWaitLayer();
            catProspectos.setOnUpdate(actualizaFideicomiso);
            catProspectos.buscaCatalogoPK(false);
        }
    }
}

function actualizaFideicomiso() {
    catProspectos.setOnUpdate(operacionExitosa);
    catProspectos.getCatalogo().prsNumContrato = pkInfo.prsNumProspecto;
    catProspectos.modificaCatalogo(false);
}

function enviarCorreoOperaciones() {
    if(pkInfo == null) {
        Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
        return;
    } else if(pkInfo.prsCveStatus == "CONSTITUIDO" || pkInfo.prsCveStatus == "CANCELADO") {
        alert("El no se puede enviar el correo a Operaciones para crear CIS ya que el prospecto se encuentra " + pkInfo.prsCveStatus);
        return;
    } /*else if(pkInfo.prsNumContrato == 0) {
        Swal.fire('Aviso', 'No se puede enviar el correo a Operaciones para crear CIS ya que no se ha asignado No. de Fideicomiso al prospecto',  'warning');
        return;
    } */else if(Number(pkInfo.prsNumContrato) > 0) {
        Swal.fire('Aviso', 'El prospecto ya tiene asignado CIS del Fideicomiso',  'warning');
        return;
    }
    asignarFideicomiso();
    
}

function enviarEtapaProyecto() {
    if(pkInfo == null) {
        Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
        return;
    } else if(pkInfo.prsCveStatus == "CONSTITUIDO" || pkInfo.prsCveStatus == "CANCELADO") {
        alert("El prospecto no se puede enviar a Etapa Proyecto ya que se encuentra " + pkInfo.prsCveStatus);
        return;
    } else if(pkInfo.prsNumContrato == 0) {
        Swal.fire('Aviso', 'No se puede enviar a la Etapa Proyecto ya que no se ha asignado No. de Fideicomiso al prospecto',  'warning');
        return;
    } else if(!isDefinedAndNotNull(pkInfo.prsCisFid)) {
        Swal.fire('Aviso', 'No se puede enviar a la Etapa Proyecto ya que no se ha asignado CIS del Fideicomiso al prospecto',  'warning');
        return;
    }
    showWaitLayer();
    catAnteproy.setOnUpdate(copiaProspecto2Anteproy);
    catAnteproy.getCatalogo().antNumProspecto = pkInfo.prsNumProspecto;
    catAnteproy.buscaCatalogoPK(false);
}

function copiaProspecto2Anteproy() {
    if(catAnteproy.getCatalogo().antNumProspecto != 0) {
        Swal.fire('Aviso', 'El prospecto ya ha sido enviado a la Etapa de Proyecto',  'warning');
        hideWaitLayer();
        return;
    }
    operacion = ASIGNACION_FIDEICOMISO;
    
    catAnteproy.setOnUpdate(operacionExitosa);
    catAnteproy.getCatalogo().antNumProspecto = pkInfo.prsNumProspecto;
    catAnteproy.getCatalogo().antNumContrato = pkInfo.prsNumContrato;
    catAnteproy.getCatalogo().antNomNegocio = pkInfo.prsNomProspecto;
    catAnteproy.getCatalogo().antCveTipoNeg = pkInfo.prsTipoNegocio;
    catAnteproy.getCatalogo().antNumProducto = pkInfo.prsNumProducto;
    catAnteproy.getCatalogo().antCveAreaInst = pkInfo.prsCveAreaInst;
    catAnteproy.getCatalogo().antProCliSpe = pkInfo.prsProCliSpe;
    catAnteproy.getCatalogo().antProCliMan = pkInfo.prsProCliMan;
    catAnteproy.getCatalogo().antFechaApertura = pkInfo.prsFecProspecto;
    catAnteproy.altaCatalogo(false);
}

function     Mayusculas(objeto) {
//Swal.fire('Aviso', 'Mays',  'warning')
   var strMayusculas = objeto.value;
   objeto.value = strMayusculas.toUpperCase();
   }

