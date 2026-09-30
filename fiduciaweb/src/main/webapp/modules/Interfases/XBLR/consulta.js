//showWaitLayer();
initForms();
var testObj = {};

var fechaDefault = new Date();

function setFechaCal(){}
function isValidDate(){ return false; }

Calendar.setup({
    inputField     :    "paramFECHA",
    button         :    "paramFECHA",
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

var fvXBLR = new FormValidator();
fvXBLR.setup({
  formName      : "frmDatosXBLR",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function resultadoFuncion(obj, result){
    var resultado = JSON.parse(result);
    if(resultado.codigoError == 0) {
        GI('lnkExcelDownload').click();
        hideWaitLayer();
    } else {
        hideWaitLayer();
        Swal.fire('Aviso', 'Error al generar el reporte',  'warning');
    }
}

function generarArchivo() {
    if(fvXBLR.checkForm()) {
        showWaitLayer();
        var url = ctxRoot+"/modules/Interfases/XBLR/funcionXBLR.do?FORMAT=XLSX&FECHA=" + GI("paramFECHA").value + "&FISO=" + GI("paramFISO").value;
        makeAjaxRequest(url,"HTML",resultadoFuncion,null)    
    }
}

function limpiar() {
    GI('frmDatosXBLR').reset();
}
//hideWaitLayer();