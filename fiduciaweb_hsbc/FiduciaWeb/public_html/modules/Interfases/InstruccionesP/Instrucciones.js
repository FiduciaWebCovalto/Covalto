showWaitLayer();

var testObj = {};
var divNombreFideicomisoParam;
var cmbSubCta = { Fideicomiso: 0, order: 's' };
var cmbClabeCba = { ffidIdFideicomiso: 0, order: 's' };
var cmbFipConcepto = { ffidIdFideicomiso: 0, order: 's' };
var cmbFipPeriodicidad = { };
var pkInfo = null;
var currentScreen = 0; //0 - Pantalla Inicial
var fechaDefault = new Date();

var tablaFisoIPData = new Array();
tablaFisoIPData[0] = "fipNumFiso,30px";
tablaFisoIPData[1] = "ctoNomContrato,200px";
//tablaFisoIPData[2] = "fipSubcuentaOrigen,100px";
tablaFisoIPData[2] = "fipCtaOrigen,130px";
tablaFisoIPData[3] = "fipCtaDestino,130px";
tablaFisoIPData[4] = "fipImporte,90px";
//tablaFisoIPData[7] = "fipPeriodicidad,25px";
tablaFisoIPData[5] = "fipFechaInicio,65px";
tablaFisoIPData[6] = "fipFechaFin,65px";
tablaFisoIPData[7] = "fipConcepto,180px";
//tablaFisoIPData[10] = "eageCveFeriado,10px";

var fvInterfase = new FormValidator();

initForms();

function isValidDate(date){ 
  //var today = new Date();
  //if(date > today)
  //  return true;
  //else
    return false;
}

function setFechaCal(){}

function setCalendars() {
  console.log('setCalendars');
  Calendar.setup({
      inputField     :    "paramfipFecEvento",
      button         :    "paramfipFecEvento",
      ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",format of the input field
      showsTime      :    false,
      timeFormat     :    "24",
      onUpdate       :    setFechaCal,
      disableFunc    :    isValidDate,
      date           :    fechaDefault,
      weekNumbers    :    false,
      cache          :    true,
      step           :    1
  });
  
  Calendar.setup({
      inputField     :    "paramfipFecFinEvento",
      button         :    "paramfipFecFinEvento",
      ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",format of the input field
      showsTime      :    false,
      timeFormat     :    "24",
      onUpdate       :    setFechaCal,
      disableFunc    :    isValidDate,
      date           :    fechaDefault,
      weekNumbers    :    false,
      cache          :    true,
      step           :    1
  });
}

function cargaCmbSubCta(fisoID) {
  console.log('cargaCmbSubCta fisoID: ' + fisoID.value);
  if(fisoID.value != "") {
    //showWaitLayer();
    consultaNombreFideicomiso("nomFideicomiso", fisoID);
    cmbSubCta.Fideicomiso = fisoID.value;
    loadElement(GI('paramfipSubcuentaOrigen'));
  }
}

function consultaNomFid() {
  consultaNombreFideicomiso("nomFideicomiso", GI("paramfipNumFiso"));
  hideWaitLayer();
}

function limpiar() {
  RF(GI("frmDatosInterfase"));
  limpiaDivs("nomFideicomiso");
  pkInfo = null;
}

function clickTabla(pk) {
  pkInfo = pk;
  showWaitLayer();
  loadCurrentRecord();
}

function loadCurrentRecord() {
  console.log('loadCurrentRecord');
  pkInfo.id = 'consultaInsProg';
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(pkInfo);
  makeAjaxRequest(url, "HTML", setPkInfo, pkInfo);  
}

function setPkInfo(obj, result) {
  console.log('setPkInfo');
  var objResult = JSON.parse(result);
  pkInfo = objResult[0];  
  hideWaitLayer();
}

function doLoadData() {
  console.log('doLoadData');
  for(x in pkInfo) {    
    console.log('x: ' + x + ' value: ' + pkInfo[x]);
    if(pkInfo[x] != null && pkInfo[x] != "null") {
      try { GI('param' + x).value = pkInfo[x]; } catch(e) { 
        console.log('Warning: ' + e.message); 
      }
    }
    //try { GI(x).value = pkInfo[x]; } catch(e) { console.log('Warning: ' + e.message); }
  }
  GI('paramfipUltimoDia').checked = (pkInfo.fipUltimoDia == 1);
}

function doCancelMntoIP(obj, result) {
  console.log('cancelMntoIP');
  GI("dvPantalla").innerHTML = result;
  initForms();
}

function cancelarMnto() {
  var urlCliente = ctxRoot + "/modules/Interfases/InstruccionesP/Instrucciones.do";
  makeAjaxRequest(urlCliente, "HTML", doCancelMntoIP, null);    
}

function doCargaMntoIP(obj, result) {
  GI("dvPantalla").innerHTML = result;
  if(pkInfo != null) {
    GI('paramfipNumFiso').value = pkInfo.fipNumFiso;
    cmbSubCta.Fideicomiso = pkInfo.fipNumFiso;
    cmbClabeCba.ffidIdFideicomiso = pkInfo.fipNumFiso;
    cmbFipConcepto.ffidIdFideicomiso = pkInfo.fipNumFiso;
  }
  initForms();
  if(currentScreen == 1) {
    GI('funcionTitle').innerText = 'Nuevo Registro';
  }

  if(currentScreen == 2) {
    SA(GI('paramfipNumFiso'), 'readOnly', true);
    GI('funcionTitle').innerText = 'Modificar Registro';    
  }
  
  if(currentScreen == 4) {
    setParamsReadOnly(GI('frmDatosInterfase'));
    muestraObjs('cmdProyectar');
    GI('funcionTitle').innerText = 'Consulta';
  }
  
  doFVSetup();
  setCalendars();
  setTimeout(doLoadData, 500);
  hideWaitLayer();
}

//TODO: Mover a generic_functions
function setParamsReadOnly(obj) {
  if(typeof(obj) != 'undefined' && typeof(obj.elements) != 'undefined') {
    for(var i = 0; i < obj.elements.length; i++) {
      var elemento = obj.elements[i];
      console.log('elemento.id: ' + elemento.id + ' elemento.value: ' + elemento.value + ' elemento.type: ' + elemento.type);
      var doReadOnly = GA(elemento, 'doReadOnly');
      if(elemento.id.indexOf('param') != -1 || isDefinedAndNotNull(doReadOnly)) { //Quiza indicar con un atributo que cuando se use esta funcion lo ponga en readOnly solo si lo tiene o algo asi
        if(elemento.type == 'text') {
          //SA(elemento, 'readOnly', true);
          SA(elemento, 'disabled', true);
        } else if(elemento.type == 'select-one') {
          SA(elemento, 'disabled', true);
        } else if(elemento.type == 'checkbox') {
          SA(elemento, 'disabled', true);
        }
      }
    }
  }
}

function eliminar() {
  console.log('eliminar');
  if (pkInfo == null) {
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
    return;      
  }
  showWaitLayer();
  pkInfo.id = 'consultaInsProg';
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(pkInfo);
  makeAjaxRequest(url, "HTML", doEliminar, pkInfo);  
}

function doEliminar(datos, result) {
  console.log('doEliminar');
  var objResult = JSON.parse(result);
  pkInfo = objResult[0];
  invocarCRUD(3);
}

function resultadoOperacion(datos, result) {
  console.log('resultadoOperacion');
  var op = JSON.parse(result);
  hideWaitLayer();
  pkInfo = null;
  if(op.resultado == 0 || op.codigoError == "0") { //Operacion OK
    Swal.fire('Aviso', 'Operación realizada con éxito',  'warning');
    if(datos.operacion != 3) cancelarMnto();
  } else {
    Swal.fire('Aviso', 'Error al realizar la operación solicitada, consulte al administrador!',  'warning');
  }
}

function cargaMntoIP(pantalla) {
  if ((pantalla == 2 || pantalla == 4) && pkInfo == null) {
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
    return;      
  }
  
  showWaitLayer();
  currentScreen = pantalla;
  var urlCliente = ctxRoot + "/modules/Interfases/InstruccionesP/InstruccionesMnto.do";
  makeAjaxRequest(urlCliente, "HTML", doCargaMntoIP, null);  
}

function doProyectar() {
  console.log('doProyectar');
  showWaitLayer();
  var proyectarData = {
    id: 'callProyectarIP',
    fipFolio: pkInfo.fipFolio
  };
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(proyectarData);
  makeAjaxRequest(url, "HTML", resultadoOperacion, {});    
}

function invocarCRUD(operacion) {
  var datos = {};
  
  if(operacion != 3) {
    if(fvInterfase.checkForm()) {
      datos = getParameters(GI('frmDatosInterfase'));
    } else {
      Swal.fire('Aviso', 'Por favor verifique la información',  'warning');
      return;
    }
  } else {
    datos = pkInfo;
  }
  
  if(currentScreen == 2) operacion = 2;
  datos.id = 'mantoInsProg';
  datos.operacion = operacion;
  if (pkInfo != null) {
    datos.fipFolio = pkInfo.fipFolio;
  } else {
    datos.fipFolio = 0;
  }
  datos.fipUltimoDia = GI('paramfipUltimoDia').checked ? 0 : 1;
  
  showWaitLayer();
  currentScreen = operacion;
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(datos);
  makeAjaxRequest(url, "HTML", resultadoOperacion, datos);
}

function modificaDatosIP() {
  console.log('modificaDatosSPEI');
  showWaitLayer();
  if(!fvInterfase.checkForm()) {
    hideWaitLayer();
    Swal.fire('Aviso', 'Favor de completar los datos requeridos',  'warning');
    return;
  }
  hideWaitLayer();
}

function doFVSetup() {
  fvInterfase.setup({
    formName      : "frmDatosInterfase",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
}

function cargaCombos(objFisoID) {
  cargaCmbSubCta(objFisoID);
  cmbClabeCba.ffidIdFideicomiso = objFisoID.value;
  cmbFipConcepto.ffidIdFideicomiso = objFisoID.value;
  //cmbFipPeriodicidad.ffidIdFideicomiso = objFisoID.value;
  loadElement(GI('paramfipCtaOrigen'));
  loadElement(GI('paramfipCtaDestino'));
  loadElement(GI('paramfipPeriodicidad'));
}

doFVSetup();
hideWaitLayer();