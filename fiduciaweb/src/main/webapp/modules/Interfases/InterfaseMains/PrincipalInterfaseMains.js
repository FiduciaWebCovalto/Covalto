showWaitLayer();

var testObj = {};
var objArchivosPlanosParam = JSON.parse("{\"id\":\"conInterminds\"}");
var dvFechaParam = JSON.parse("{\"id\":\"ejeFunRegresaFechaAnterior\"}");
var fvInterfase = new FormValidator();
var fechaDefault = new Date();
var nombreArchivo;
initForms();


var tablaConceptosData = new Array();
tablaConceptosData[0] = "tipoPersona,200px";
tablaConceptosData[1] = "idPersona,100px";
tablaConceptosData[2] = "numContrato,100px";
tablaConceptosData[3] = "nomCampo,150px";

function debug(msg){
    try { console.log(msg); } catch(e) {}
}

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
    if(fvInterfase.checkForm()) {
        showWaitLayer();

        //var fncInterfaseKyc = {id: "generaInterfasesMindsKyc", Fecha: GI("txtFechaValor").value, Interfase: GI('interfase').value };
        var fncInterfaseKyc = {id: "generaInterfasesMindsKyc", Fecha: GI("txtFechaValor").value, Interfase: 2 };
        var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(fncInterfaseKyc);
        
        makeAjaxRequest(url, "HTML", validaStoreInterfase, null);
    }
}

function getListasNegrasResponse(obj, result) {
    var res = JSON.parse(result);
    testObj = res;
}

function validaStoreInterfase(obj, result) {
    var res = JSON.parse(result).RESULTADO;

    switch(eval(res)) {
        case 0:
            Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
            var url = ctxRoot + "/listasNegras.do";
            makeAjaxRequest(url, "HTML", getListasNegrasResponse, null);
            break;
        case 1:
        case 3:
            Swal.fire('Aviso', 'Existen conceptos obligatorios MINDS por capturar',  'warning');
            GI('cmdConsultaConceptosPendientes').click();
            break;
        case 2:
            Swal.fire('Aviso', '¡No hay movimientos registrados en este día!',  'warning');
            break;    
        default:
            Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
    }
    
    hideWaitLayer();
}

function sugerirNombreArchivoInterfase(obj , result){
 
    var resultado = JSON.parse(result)[0];
  
    debug("resultado:" + resultado);
    
    delete objArchivosPlanosParam.id;
    delete objArchivosPlanosParam.Fecha;
    objArchivosPlanosParam.queryId = "conInterminds";
    objArchivosPlanosParam.colData = "arpDescripcion";
    objArchivosPlanosParam.tipoId = 1;
    objArchivosPlanosParam.Fecha = GI("txtFechaValor").value;
    
    if(typeof(resultado) != "undefined" && typeof(resultado.arpNomArchivo) != "undefined") {
        objArchivosPlanosParam.Archivo =resultado.arpNomArchivo;
        objArchivosPlanosParam.fileName = resultado.arpNomArchivo+".txt";
        var url = ctxRoot + "/generarArchivoInterfase.do?json=" + JSON.stringify(objArchivosPlanosParam);
        var liga = GI("ligaArchivo");
        liga.href = url;
        liga.click();
        Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
        onButtonClickPestania('Interfases.InterfaseMains.PrincipalInterfaseMains','');
    }
    
    hideWaitLayer();
}
