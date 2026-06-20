showWaitLayer();

var fncInterfase = JSON.parse("{\"id\":\"storeGenArchInterfazSolomon2\"}");
var objArchivosPlanosParam = JSON.parse("{\"id\":\"conArcPlaTAS\"}");
var dvFechaParam = JSON.parse("{\"id\":\"ejeFunRegresaFechaAnterior\"}");
var fvInterfase = new FormValidator();
var fechaDefault = new Date();

initForms();

function setFechaCal(){}
function isValidDate(date){ 
  var today = new Date();
  if(date > today)
    return true;
  else
    return false;
}

Calendar.setup({
    inputField     :    "txtFechaValor",
    button         :    "txtFechaValor",
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

fvInterfase.setup({
  formName      : "frmDatosInterfase",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});
function asignaFechaValor(){
  dvFechaParam.Fecha = GI("txtFechaValor").value;
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(dvFechaParam);
  makeAjaxRequest(url, "HTML", asignaEtiquetas, null);
}
function asignaEtiquetas(obj, result){
  var resultado = JSON.parse(result)[0];
  formsLoaded();
}
function ejecutaStoreInterfase() {
    showWaitLayer();
    var url = "PeopleSoft.do?fecha=" + GI("txtFechaValor").value
    makeAjaxRequest(url, "HTML", validaStoreInterfase, null);
}

function validaStoreInterfase(obj, result){
  var res = JSON.parse(result).RESULTADO;
  if(isDefinedAndNotNull(res)){
    alert(res);
  } else {
    Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
  }
  hideWaitLayer();
}
function sugerirNombreArchivoInterfase(obj , result){
  var resultado = JSON.parse(result)[0];
  if(isDefinedAndNotNull(resultado)){
    Swal.fire('Aviso', 'Se le sugiere coloque el siguiente nombre " + "FIDUCIA_POLIZACON_" + GI("txtFechaValor',  'warning').value.split("/")[2] + GI("txtFechaValor").value.split("/")[1] + GI("txtFechaValor").value.split("/")[0]);
    delete objArchivosPlanosParam.id;
    objArchivosPlanosParam.queryId = "conArcPlaTAS";
     objArchivosPlanosParam.Fecha = GI("txtFechaValor").value;
    objArchivosPlanosParam.order = "arpSecuencial";
    objArchivosPlanosParam.fileName = "FIDUCIA_POLIZAHON_" + GI("txtFechaValor").value.split("/")[2] + GI("txtFechaValor").value.split("/")[1] + GI("txtFechaValor").value.split("/")[0];
    var url = ctxRoot + "/generarArchivoInterfase.do?json=" + encodeURIComponent(JSON.stringify(objArchivosPlanosParam));
    var liga = GI("ligaArchivo");
    liga.href = url;
    liga.click();
    Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
    //ObtenReporte();
    onButtonClickPestania('Interfases.InterfaseSalomon3.PrincipalInterfaseSalomon','');
    
  }else
    Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
  hideWaitLayer();
}

function ponerNombreArchivo(){
    GI("txtNomArch").value="FIDUCIATEF"+GI("txtFechaValor").value.split("/")[1]+GI("txtFechaValor").value.split("/")[0]+GI("txtFechaValor").value.split("/")[2]; 
}



//-------------------------------------------------codigo para nuevos reportes

function ObtenReporte() {
 
 
    var cadenota='{"Estructura":"1","sendToJSP":"true","urlReporte":"/modules/Interfases/InterfaseSalomon/ReportePolizaSalomon.jsp","Order":"s","id":"getRepPosicionSalomon"}'
    var url = ctxRoot + "/imprimirReporte.do?json=" + cadenota;
    var link = GI('linkReporteNew');
    link.href=url;
    link.click();
    document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
    hideWaitLayer();
  
}
