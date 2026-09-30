showWaitLayer();

var testObj = {};
var divNombreFideicomisoParam;
var cmbSubCta = JSON.parse("{\"Fideicomiso\":0,\"order\":\"s\"}");
var pkInfo = null;
var currentScreen = 0; //0 - Pantalla Inicial

var tablaFisoSPEIData = new Array();
tablaFisoSPEIData[0] = "fpsNumFiso,30px";
tablaFisoSPEIData[1] = "ctoNomContrato,300px";
tablaFisoSPEIData[2] = "fpsSubcuenta,30px";
tablaFisoSPEIData[3] = "fsctNombreSubCuenta,300px";
tablaFisoSPEIData[4] = "fpsNomTipoOperacion,150px";

var fvInterfase = new FormValidator();

initForms();

function cargaCmbSubCta(fisoID) {
  if(fisoID.value != "") {
    showWaitLayer();
    consultaNombreFideicomiso("nomFideicomiso", GI("paramfpsNumFiso"));
    cmbSubCta.Fideicomiso = fisoID.value;    
    loadElement(GI('paramfpsSubcuenta'));
  }
}

function consultaNomFid() {
  consultaNombreFideicomiso("nomFideicomiso", GI("paramfpsNumFiso"));
  hideWaitLayer();
}

function limpiar() {
  RF(GI("frmDatosInterfase"));
  limpiaDivs("nomFideicomiso");
  pkInfo = null;
}

function clickTabla(pk) {
  pkInfo = pk;
  if(pkInfo.fsctNombreSubCuenta == '-') {
    pkInfo.fpsSubcuenta = null;
  }
}

function doMantoSPEI(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  if(currentScreen == 1) {
    GI('funcionTitle').innerText = 'Nuevo Registro';
  }
  if(currentScreen == 2) {
    SA(GI('paramfpsNumFiso'), 'readOnly', true);
    GI('funcionTitle').innerText = 'Modificar Registro';
    loadCurrentRecord();
  }
  if(currentScreen == 4) {
    SA(GI('paramfpsNumFiso'), 'readOnly', true);
    GI('funcionTitle').innerText = 'Consulta';
    loadCurrentRecord();
  }
  doFVSetup();
}

//TODO: Mover a generic_functions
function setParamsReadOnly(obj) {
  if(typeof(obj) != 'undefined' && typeof(obj.elements) != 'undefined') {
    for(var i = 0; i < obj.elements.length; i++) {
      var elemento = obj.elements[i];
      console.log('elemento.id: ' + elemento.id + ' elemento.value: ' + elemento.value + ' elemento.type: ' + elemento.type);
      if(elemento.id.indexOf('param') != -1) { //Quiza indicar con un atributo que cuando se use esta funcion lo ponga en readOnly solo si lo tiene o algo asi
        if(elemento.type == 'text') {
          //SA(elemento, 'readOnly', true);
          SA(elemento, 'disabled', true);
        } else if(elemento.type == 'select-one') {
          SA(elemento, 'disabled', true);
        }
      }
    }
  }
}

function loadCurrentRecord() {
  console.log('loadCurrentRecord');
  showWaitLayer();
  
  GI('paramfpsIdParametro').value = pkInfo.fpsIdParametro;
  GI('paramfpsNumFiso').value = pkInfo.fpsNumFiso;
  GI('paramfpsTipoOperacion').value = pkInfo.fpsTipoOperacion;

  consultaNombreFideicomiso("nomFideicomiso", GI("paramfpsNumFiso"));
  cmbSubCta.Fideicomiso = pkInfo.fpsNumFiso;    
  loadElement(GI('paramfpsSubcuenta'));
  setTimeout(function() { 
    GI('paramfpsSubcuenta').value = pkInfo.fpsSubcuenta; 
    if(currentScreen == 4) { setParamsReadOnly(GI('frmDatosInterfase')); }
  }, 300);  
}

function doLoadRecord(datos, result) {
  console.log('doLoadRecord');
}

function doCancelMntoSPEI(obj, result) {
  console.log('doCancelMntoSPEI');
  GI("dvPantalla").innerHTML = result;
  pkInfo = null;
  initForms();
}

function cancelarMnto() {
  var urlCliente = ctxRoot + "/modules/Interfases/SPEI/ConfiguracionSPEI.do";
  makeAjaxRequest(urlCliente, "HTML", doCancelMntoSPEI, null);    
}

function doMantenimientoSPEI(operacion) {
  console.log('doMantenimientoSPEI operacion: ' + operacion);
  showWaitLayer();
  if(!fvInterfase.checkForm()) {
    hideWaitLayer();
    Swal.fire('Aviso', 'Favor de completar los datos requeridos',  'warning');
    return;
  }
  
  var datos = getParameters(GI('frmDatosInterfase'));
  datos.id = 'mantoFisoSPEI';
  datos.operacion = operacion;
  if(pkInfo != null) {
    datos.fpsIdParametro = pkInfo.fpsIdParametro
  }

  if(datos.operacion == 1) {
    datos.id = 'consultaTotalFisoSPEI';
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(datos);
    makeAjaxRequest(url, "HTML", doAlta, datos);
  } else {
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(datos);
    makeAjaxRequest(url, "HTML", resultadoOperacion, datos);
  }
}

function doAlta(datos, result) {
  datos.id = 'mantoFisoSPEI';
  var objResult = JSON.parse(result)[0];
  if(objResult.total > 0) {
    hideWaitLayer();
    Swal.fire('Aviso', 'Ya existe un registro con la configuracion especificada',  'warning');
  } else {
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(datos);
    makeAjaxRequest(url, "HTML", resultadoOperacion, datos);  
  }
}

function doModificaSPEI(datos) {
  console.log('doModificaSPEI');
  var datosUpdate = {
    id: 'mantoFisoSPEI',
    operacion: 2,
    fpsNumFiso: pkInfo.fpsNumFiso,
    fpsTipoOperacion: pkInfo.fpsTipoOperacion,
    fpsSubcuenta: pkInfo.fpsSubcuenta
  };

  if(datosUpdate.fpsTipoOperacion == null || datosUpdate.fpsTipoOperacion == "null") {
    datosUpdate.fpsTipoOperacion = -1;
    datos.fpsTipoOperacion = -1;
  }
  
  if(datosUpdate.fpsSubcuenta == null || datosUpdate.fpsSubcuenta == "null") {
    datosUpdate.fpsSubcuenta = -1;
    datos.fpsSubcuenta = -1;
  }
  
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(datosUpdate);
  makeAjaxRequest(url, "HTML", continueUpdate, datos);
}

function continueUpdate(datos, result) {
  console.log('continueUpdate');
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(datos);
  makeAjaxRequest(url, "HTML", resultadoOperacion, datos);
}

function resultadoOperacion(datos, result) {
  console.log('resultadoOperacion');
  var op = JSON.parse(result);
  hideWaitLayer();
  pkInfo = null;
  testObj.datos = datos;
  testObj.op = op;
  if((datos.operacion == 1 && op.resultado >= 0) || (datos.operacion != 1 && op.resultado == 0)) { //Operacion OK
    Swal.fire('Aviso', 'Operación realizada con éxito',  'warning');
    cancelarMnto();
  } else {
    Swal.fire('Aviso', 'Error al realizar la operación solicitada, consulte al administrador!',  'warning');
  }
}

function cargaMntoSPEI(pantalla) {
  if ((pantalla != 1) && pkInfo == null) {
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
    return;      
  }
  
  if(pantalla != 3) { //Alta - Modificar - Consultar
    showWaitLayer();
    currentScreen = pantalla;
    var urlCliente = ctxRoot + "/modules/Interfases/SPEI/MantenimientoSPEI.do";
    makeAjaxRequest(urlCliente, "HTML", doMantoSPEI, null);  
  } else if(pantalla == 3) { //Eliminar
    doMantenimientoSPEI(3);
  }  
}

function modificaDatosSPEI() {
  console.log('modificaDatosSPEI');
  showWaitLayer();
  if(!fvInterfase.checkForm()) {
    hideWaitLayer();
    Swal.fire('Aviso', 'Favor de completar los datos requeridos',  'warning');
    return;
  }
  
  var datos = {
    id: 'deleteFisoSPEI',
    fpsNumFiso: parseInt(GI('paramfpsNumFiso').value)    
  };
  
  var subCta = parseInt(GI('paramfpsSubcuenta').value);
  console.log('subCta: ' + subCta);
  if(subCta >= 0) {
    console.log('hay datos sub cuenta');
    datos.fpsSubcuenta = subCta;
  } else {
    datos.id = 'deleteFisoSPEIH';
  }
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(datos);
  makeAjaxRequest(url, "HTML", doPostDelete, datos);
}

function doPostDelete(obj, result) {
  console.log('validaDatosBD'); 
  var info = JSON.parse(result);
  if(parseInt(info.codigoError) == 0) { //Operacion OK
    hideWaitLayer();
    Swal.fire('Aviso', 'Error al procesar la solicitud!',  'warning');
  } else {
    obj.id = 'altaFisoSPEI';
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(obj);
    makeAjaxRequest(url, "HTML", resultadoOperacion, obj);
  }
}

function doFVSetup() {
  fvInterfase.setup({
    formName      : "frmDatosInterfase",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
}

doFVSetup();
hideWaitLayer();