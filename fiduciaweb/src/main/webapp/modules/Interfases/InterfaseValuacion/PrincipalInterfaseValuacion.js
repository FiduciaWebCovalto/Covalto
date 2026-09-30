// JavaScript Document

var fncInterfase = JSON.parse("{\"id\":\"storeGenArchInterfazValuacion\"}");
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

var objMonitor = {id:"controlIFs", interfaseID: 2, fechaAplicacion: "01/01/2000"};
var urlProcCtl = ctxRoot + "/doRef.do?json=" + JSON.stringify(objMonitor);
function processMonitor(obj, result) {
    if(!stopCtl) { setTimeout(function() { makeAjaxRequest(urlProcCtl, "HTML", processMonitor, null); }, 3000); }
    if(isDefinedAndNotNull(result)) {
        
        try {
            var msgProc = JSON.parse(result);
            if(msgProc.succedded) return;
        } catch(e) {}
        
        var objCtl = JSON.parse(result)[0];
        if(!stopCtl && 0 == ultimaCantidad && veces >= 5) {
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

var objArchivosPlanosParam = JSON.parse("{\"id\":\"conInterPrecios\"}");
function validaStoreInterfase(obj, result){
  //alert(result)  
  Swal.fire('Aviso', 'Operación exitosa',  'warning');
  hideWaitLayer();
  document.getElementById("cmdLimpiar").click();  

/*  var res = JSON.parse(result).RESULTADO;
  if(isDefinedAndNotNull(res)){
    switch(eval(res)){
      case 0:
          Swal.fire('Aviso', 'Operación exitosa',  'warning');
          hideWaitLayer();
          document.getElementById("cmdLimpiar").click();
      break;
      case 1:Swal.fire('Aviso', 'Cargue el archivo antes de vaciar los Precios!',  'warning');break;
      case 5:
        Swal.fire('Aviso', 'La Fecha del Archivo no corresponde con la Fecha del Sistema!',  'warning');
        var url = ctxRoot + "/getRef.do?json=" + encodeURIComponent(JSON.stringify(objArchivosPlanosParam));
        makeAjaxRequest(url, "HTML", sugerirNombreArchivoInterfase, null);            
        break;
      case 6:
        Swal.fire('Aviso', 'Faltan Precios asociados a Emisoras con Posicion!',  'warning');
        var url = ctxRoot + "/getRef.do?json=" + encodeURIComponent(JSON.stringify(objArchivosPlanosParam));
        makeAjaxRequest(url, "HTML", sugerirNombreArchivoInterfase, null);           
        break;
      default:
        //Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
        alert("No se incorporo el Precio de la Emision No. "+res.substring(1,res.length));
    }
  }else
  {
     Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
  }*/
  hideWaitLayer();
}

function sugerirNombreArchivoInterfase(obj , result){
 
    var resultado = JSON.parse(result)[0];
  
    delete objArchivosPlanosParam.id;
    delete objArchivosPlanosParam.Fecha;
    objArchivosPlanosParam.queryId = "conInterPrecios";
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
        document.getElementById("cmdLimpiar").click();
    }
    
    hideWaitLayer();
}

var cont = 0;
function fileUploaded() {  
    hideWaitLayer();
    cont++;
    if(cont==1) {
        Swal.fire('Aviso', 'Archivo Cargado correctamente',  'warning');    
    }
}

function subirArchivo() {
    var theProcessor = "mx.com.inscitech.fiducia.business.upload.processors.CargaArchivosExcelValuacion";
    var fileName = document.frameUpload.frmValuacion.document.getElementById("fileTest").value;
    if(fileName.indexOf(".csv") != -1) {
        theProcessor = "mx.com.inscitech.fiducia.business.upload.processors.CargaArchivosCSVValuacion";
    }
    document.frameUpload.frmValuacion.processor.value = theProcessor;
    frameSubmit(document.frameUpload.frmValuacion);
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
