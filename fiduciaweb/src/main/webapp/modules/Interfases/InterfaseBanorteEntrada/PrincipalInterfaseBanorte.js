// JavaScript Document

var fncInterfase = JSON.parse("{\"id\":\"storeGenArchInterfazBanorte\"}");
var objArchivosPlanosParam = JSON.parse("{\"id\":\"conArcPla\"}");
var dvFechaParam = JSON.parse("{\"id\":\"ejeFunRegresaFechaAnterior\"}");

var fvInterfase = new FormValidator();
var fechaDefault = new Date();

initForms();

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

function setFechaCal(){}

function isValidDate(date){ 
  var today = new Date();
  if(date > today)
    return true;
  else
    return false;
}

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

function ejecutaFuncion(){
    if(GI("txtFechaValor").value=="") {  
        Swal.fire('Aviso', 'Debe seleccionar la Fecha,Nombre',  'warning');
    } else {
        if(fvInterfase.checkForm()) {
            isUpload = true;
            subirArchivo();
        }
    }
}


function subirArchivo() {
    var theProcessor = "mx.com.inscitech.fiducia.business.upload.processors.CargaArchivosExcelMasivosImpl";
    var fileName = document.frameUpload.frmValuacion.document.getElementById("fileTest").value;
    document.frameUpload.frmValuacion.processor.value = theProcessor;
    frameSubmit(document.frameUpload.frmValuacion);
}
  

function frameSubmit(forma) {
    showWaitLayer();
    
    nomArchivo = forma.document.getElementById("fileTest").value;       
    nomArchivo = nomArchivo.split('\\');
    nomArchivo = nomArchivo[nomArchivo.length - 1];
    
    forma.document.getElementById("Fecha").value = GI("txtFechaValor").value;
    forma.document.getElementById("NombreArchivo").value = nomArchivo;
    
    nom = nomArchivo;

    stopCtl = false;
    if (isUpload) {
        isUpload = false;
        uploadMonitor();
    }

    forma.submit();
}

function ejecutaStoreInterfase(){
    fncInterfase.nomArchivo = '';
    fncInterfase.fecha = GI("txtFechaValor").value;
    var url = ctxRoot + "/executeRefAsync.do?json=" + JSON.stringify(fncInterfase);
    showWaitLayer();    
    
    stopCtl = false;
    ultimaCantidad = -1;
    veces = 0;
    objMonitor.fechaAplicacion = GI("txtFechaValor").value;
    urlProcCtl = ctxRoot + "/doRef.do?json=" + JSON.stringify(objMonitor);
    makeAjaxRequest(url, "HTML", processMonitor, null);
  }

var objMonitor = {id:"controlIFs", interfaseID: 10, fechaAplicacion:  GI("txtFechaValor").value};
var urlProcCtl = ctxRoot + "/doRef.do?json=" + JSON.stringify(objMonitor);
function processMonitor(obj, result) {
    if(!stopCtl) { setTimeout(function() { makeAjaxRequest(urlProcCtl, "HTML", processMonitor, null); }, 3000); }
    if(isDefinedAndNotNull(result)) {
        
        try {
            var msgProc = JSON.parse(result);
            if(msgProc.succedded) return;
        } catch(e) {}
        
        var objCtl = JSON.parse(result)[0];
        if(!stopCtl && 0 == ultimaCantidad && veces >= 10) {
            stopCtl = true;
            //alert(ultimaCantidad)
            //alert(veces)
            validaStoreInterfase(obj, result);
        } else {
            ultimaCantidad = objCtl.totalRegistros;
            veces++;
        }
    }    
}

function validaStoreInterfase(obj, result){
  Swal.fire('Aviso', 'Operación exitosa',  'warning');
  hideWaitLayer();
  document.getElementById("cmdLimpiar").click();  
  hideWaitLayer();
}

var cont=0;
function fileUploaded() {  
    hideWaitLayer();
    cont++;
    if(cont==1) {
    Swal.fire('Aviso', 'Archivo Cargado correctamente',  'warning');    
    }
}    

var urlCtl = ctxRoot + "/getRef.do?json=" + JSON.stringify({id:"cuentaAP"});
var stopCtl = false;
var veces = 0;
var ultimaCantidad = -1;
var isUpload = false;
function uploadMonitor(obj, result) {
    if(!stopCtl) { setTimeout(function() { makeAjaxRequest(urlCtl, "HTML", uploadMonitor, null); }, 3000); }
    if(isDefinedAndNotNull(result)) {
        var objCtl = JSON.parse(result)[0];
        if(objCtl.totalRegistros == ultimaCantidad && veces >= 5) {
            Swal.fire('Aviso', 'Archivo Cargado Exitosamente!',  'warning');
            stopCtl = true;
            hideWaitLayer();
        } else {
            ultimaCantidad = objCtl.totalRegistros;
            veces++;
        }        
    }
}

