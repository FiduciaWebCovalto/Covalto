var catContrato = new Catalogo("mx.com.inscitech.fiducia.domain.Contrato");
var infoCatalogo = null;

showWaitLayer();

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;

var parametroComboProducto = JSON.parse("{}");

var tablaFideicomisosData = new Array();
tablaFideicomisosData[0] = "ctoNumContrato,100";
tablaFideicomisosData[1] = "ctoNomContrato,300";
tablaFideicomisosData[2] = "ctoCveTipoNeg,150";
tablaFideicomisosData[3] = "ctoCveStContrat,150";
tablaFideicomisosData[4] = "riesgo,150";

var operacion = 0;
var numPantalla = 0;
var ncorreo=0;
pkInfo=null;
var today = new Date();

var usarSetValuesFormObject=false;
var fvMantenimiento = new FormValidator();

//Variables que pasarÃ¡n del primero al segundo Tab cuando se de una alta
var numPromotor=null;
var nomNegocio=null;
var numAbogado=null;

initForms();

GI("Aceptar").click();

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipal () {
  onButtonClickPestania("Administracion.Fideicomisos.PrincipalFideicomisos","");
}

function clickTabla(pk) {
  pkInfo = pk;
  
  var objParametros = JSON.parse("{}");
  objParametros.NumFideicomiso = pk.ctoNumContrato;
  objParametros.NumFiso = pk.ctoNumContrato;
  objParametros.IdFideicomiso = pk.ctoNumContrato;
  
  setCatalogCriteria("frmPrincipal", objParametros);
  
  cloneObject(pk, catContrato.getCatalogo());
}


//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda y tercera pantalla
function cargarPantallaMantenimiento(tipoPantalla) {
    if(pkInfo == null) {
        Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
        return;
    } 
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Administracion/Fideicomisos/MantenimientoFideicomisosGenerales.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimiento, null);
}

function despliegaPantallaMantenimiento(obj, result) {
    GI("dvPantalla").innerHTML = result;
    
    switch(numPantalla) {
        case 1:
            initForms();
            Calendar.setup({
                inputField     :    "ctoFecConst",   // id of the input field
                button         :    "ctoFecConst",
                ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
                showsTime      :    false,
                timeFormat     :    "24",
                onUpdate       :    setFechaCal,
                disableFunc    :    isValidDate,
                date           :    today,
                weekNumbers    :    false,
                cache          :    true,
                step           :    1
            });
            Calendar.setup({
                inputField     :    "ctoFecContrato",   // id of the input field
                button         :    "ctoFecContrato",
                ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
                showsTime      :    false,
                timeFormat     :    "24",
                onUpdate       :    setFechaCal,
                disableFunc    :    isValidDate,
                date           :    today,
                weekNumbers    :    false,
                cache          :    true,
                step           :    1
            });
            Calendar.setup({
                inputField     :    "ctoEscPubFec",   // id of the input field
                button         :    "ctoEscPubFec",
                ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
                showsTime      :    false,
                timeFormat     :    "24",
                onUpdate       :    setFechaCal,
                disableFunc    :    isValidDate,
                date           :    today,
                weekNumbers    :    false,
                cache          :    true,
                step           :    1
            });
            Calendar.setup({
                inputField     :    "ctoRppFecIns",   // id of the input field
                button         :    "ctoRppFecIns",
                ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
                showsTime      :    false,
                timeFormat     :    "24",
                onUpdate       :    setFechaCal,
                disableFunc    :    isValidDate,
                date           :    today,
                weekNumbers    :    false,
                cache          :    true,
                step           :    1
            });
            fvMantenimiento.setup({
                formName      : "frmMantenimiento",
                tipoAlert     : 1,
                alertFunction : BaloonAlert,
                sendObjToAlert: true
            });
        break;
        case 2:
            initForms();
            Calendar.setup({
                inputField     :    "ctoFechaUltimaRev",   // id of the input field
                button         :    "ctoFechaUltimaRev",
                ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
                showsTime      :    false,
                timeFormat     :    "24",
                onUpdate       :    setFechaCal,
                disableFunc    :    isValidDate,
                date           :    today,
                weekNumbers    :    false,
                cache          :    true,
                step           :    1
            });
            Calendar.setup({
                inputField     :    "ctoFechaProxRev",   // id of the input field
                button         :    "ctoFechaProxRev",
                ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
                showsTime      :    false,
                timeFormat     :    "24",
                onUpdate       :    setFechaCal,
                disableFunc    :    isValidDate,
                date           :    today,
                weekNumbers    :    false,
                cache          :    true,
                step           :    1
            });
        break;
        case 3:
            loadCatalogo();
        break
    }
}

function loadCatalogo() {
    catContrato.setOnUpdate(catLoaded);
    if(operacion == MODIFICAR || operacion == CONSULTAR) {
        catContrato.buscaCatalogoPK(false);
    }
}

function catLoaded() {
    if(numPantalla == 1) {
        cargaRadiosConMaster("ctoTipoCont", "ctoTipoCont2");
        
        if(GI("ctoTipoCont").checked) {
            habilitaCamposTipoContrato(1, GI("ctoTipoCont"));
        } else if(GI("ctoTipoCont2").checked) {
            habilitaCamposTipoContrato(2, GI("ctoTipoCont2"));
        }
    } else if(numPantalla == 2) {
    
    } else if(numPantalla == 3) {
    
    }
    if(operacion == MODIFICAR) {
        show("cmdAceptar");
        show("cmdCancelar");
    } else if(operacion == CONSULTAR) {
        SA(GI("cmdCancelar"), "value", "Regresar");
        show("cmdCancelar");
        
        deshabilitaObjetos(GI("frmMantenimiento"));
    }
    formsLoaded();
}

function cargarPantallaMantenimientoTab(tabId) {
    numPantalla = tabId;
    showWaitLayer();
    var urlCliente = ctxRoot;
    
    switch(tabId) {
        case 1:
            urlCliente += "/modules/Administracion/Fideicomisos/MantenimientoFideicomisosGenerales.do";
        break;
        case 2:
            urlCliente += "/modules/Administracion/Fideicomisos/MantenimientoFideicomisosKYC.do";
        break;
        case 3:
            urlCliente += "/modules/Administracion/Fideicomisos/MantenimientoFideicomisosBloqueos.do";
        break;
    }
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimiento, null);
}

function AltaOModificaInfo() {
  catContrato.setOnUpdate(operacionExitosa);  
  
  if(operacion == MODIFICAR && fvMantenimiento.checkForm()) {
    showWaitLayer();
    catContrato.modificaCatalogo();
  }
}

function operacionExitosa() {
  Swal.fire('Aviso', 'La operacion se realizo correctamente',  'warning');
  cargaPrincipal();
  hideWaitLayer();
}

//Funciones para la funcionalidad de la Fecha
function setFechaCal() {}

function isValidDate(date) {
  /*
  var today = new Date();
  if(date > today) {
    return true;
  } else {
    return false;
  }
  */
  return false;
}

function habilitaCamposTipoContrato(opc, rdObject) {
    if(opc == 1) {
        GI("ctoTipoEscritura").disabled = true;
        GI("ctoNumEscritura").disabled = true;
        GI("ctoEscPubFec").disabled = true;
        GI("ctoNumNotario").disabled = true;
        
        RA(GI("ctoTipoEscritura"), "required");
        RA(GI("ctoNumEscritura"), "required");
        RA(GI("ctoEscPubFec"), "required");
        RA(GI("ctoNumNotario"), "required");
        
        GI("ctoContPrivComen").disabled = false;
        GI("ctoFecContrato").disabled = false;
        
        SA(GI("ctoContPrivComen"), "required", "true");
        SA(GI("ctoFecContrato"), "required", "true");
        
        limpiaCombos("ctoTipoEscritura,ctoNumNotario");
        limpiaTxts("ctoNumEscritura,ctoEscPubFec,ctoNoNotario,ctoEdoNotario,ctoLocNotario");
    } else if(opc == 2) {
        GI("ctoContPrivComen").disabled = true;
        GI("ctoFecContrato").disabled = true;
        
        RA(GI("ctoContPrivComen"), "required");
        RA(GI("ctoFecContrato"), "required");
        
        GI("ctoTipoEscritura").disabled = false;
        GI("ctoNumEscritura").disabled = false;
        GI("ctoEscPubFec").disabled = false;
        GI("ctoNumNotario").disabled = false;
        
        SA(GI("ctoTipoEscritura"), "required", "true");
        SA(GI("ctoNumEscritura"), "required", "true");
        SA(GI("ctoEscPubFec"), "required", "true");
        SA(GI("ctoNumNotario"), "required", "true");
        
        limpiaTxts("ctoContPrivComen,ctoFecContrato");
        consultaDatosNotario();
    }
    asignaValueRadio2Master('ctoTipoCont', rdObject);
}

function consultaDatosNotario() {
    if(GI("ctoNumNotario").value != -1) {
        var params = JSON.parse("{}");
        params.id = "muestraDatosNotarios";
        params.Numero = GI("ctoNumNotario").value;
        
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(params);
        makeAjaxRequest(url, "HTML", muestraDatosNotario, null);
    } else {
        limpiaTxts("ctoNoNotario,ctoEdoNotario,ctoLocNotario");
    }
}

function muestraDatosNotario(obj, result) {
    var objResult = JSON.parse(result);
    
    GI("ctoNoNotario").value = objResult[0].notNumOficNota;
    GI("ctoEdoNotario").value = objResult[0].notNomEstado;
    GI("ctoLocNotario").value = objResult[0].notLocalidadNota;
}

function determinaRiesgo() {
if(pkInfo==null){
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
    return;
}
var objParametros = JSON.parse("{\"id\":\"fncdeterminaRiesgo\"}");
    objParametros.cliente =pkInfo.ctoNumContrato;
    objParametros.contrato=pkInfo.ctoNumContrato;
    
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objParametros);
    //alert(url)
    makeAjaxRequest(url, "HTML", respuestaRiesgo);
}

function respuestaRiesgo(obj, result){
  var fcn = JSON.parse(result);
  if(fcn.RESULTADO == 0) {
    Swal.fire('¡Éxito!', 'Se determino correctamente el nivel de Riesgo', 'success');
    cargaPrincipal();
  } 
  else if(fcn.RESULTADO == 1) {
    Swal.fire('Error', 'No se ha incorporado el KYC!', 'error');
  }
  else if(fcn.RESULTADO == 2) {
    Swal.fire('Error', 'Faltan datos en el KYC para determinar el Riesgo!', 'error');
  }  
  else {
    Swal.fire('Error', 'Algo salió mal', 'error');
  } 
}

var consultaExistenciaDoctoBaja = 
JSON.parse("{\"id\":\"qryValidaBajaDocumento\"}");
function validaDocumento(){
    if(pkInfo!=null){
            consultaExistenciaDoctoBaja.fiso = pkInfo.ctoNumContrato;
            consultaExistenciaDoctoBaja.folio = eval(0);
            consultaExistenciaDoctoBaja.persona = pkInfo.ctoNumContrato;
            var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaExistenciaDoctoBaja);
            makeAjaxRequest(url, "HTML", validaExistenciaDoctoBaja, null);    
    }    
    else 
        Swal.fire('warning', 'Seleccione un Documento de la Lista.',  'warning');
}

function validaExistenciaDoctoBaja(obj, result) {
  var objResult = JSON.parse(result);
    var existe=objResult[0].existe;
    if(existe==0){
        Swal.fire('¡error!', "El Contrato aun no se encuentra en el Expediente Electronico", 'error');
        return;
    }
    else{
        generaReporteDoctoContrato(0,pkInfo.ctoNumContrato,pkInfo.ctoNumContrato);
    }
    hideWaitLayer();
}