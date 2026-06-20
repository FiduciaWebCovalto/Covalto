var fechaDefault = new Date();

function setFechaCal() {
  //Swal.fire('Aviso', 'se actualizo la fecha',  'warning');
}

function isValidDate(date) { 
  var today = new Date();
  if(date > today)
    return true;
  else
    return false;
}

Calendar.setup({
    inputField     :    "paramFecha",   // id of the input field
    button         :    "paramFecha",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechaDefault,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
});                   

function cambiaPantallaTAS(obj, result) {
  obj.innerHTML = result;
  SA(GI("paramFecha"), "readonly", "true");
  hideWaitLayer();
}

function fileUploaded() {  
  var objInterface = GI("dvInterface");
  var url = ctxRoot + "/modules/Tesoreria/Interfaces/TasAplicar.do";
  
  GI("frameUpload").onreadystatechange = function() {};
  hide("frameUpload");
  removeFrame("frameUpload");
  
  makeAjaxRequest(url, "HTML", cambiaPantallaTAS, objInterface);
}

function frameSubmit(forma) {
  //if(fv.checkFrom())
  GI("frameUpload").onreadystatechange = fileUploaded;
  forma.document.getElementById("fechaTas").value = GI("paramFecha").value;
  forma.submit();
  showWaitLayer();
}

//displayFrame(containerId, frameId, frameSrc, height, width, parentHeight, parentWidth, top, left) {
function cargaFrame() {
  displayFrame("dvFileUpload", "frameUpload", ctxRoot + "/modules/Tesoreria/Interfaces/TasUpload.do", 200, 300, 100, 500, -50, -100);
}

function aplicarTas() {
  showWaitLayer();
  GI("paramFechaAnt").value = GI("paramFecha").value;
  var parametrosTAS = getParameters(GI("frmTas"));
  parametrosTAS.id = "exeTAS"
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(parametrosTAS);
  makeAjaxRequest(url, "HTML", imprimeResultado, null);
  setTimeout("VeriificaEstado()", 3000);
}

function VeriificaEstado() {
}

function imprimeResultado(obj, result) {
  Swal.fire('Aviso', 'Se ha ejecutado la aplicacion de forma correcta!',  'warning');
  hideWaitLayer();
}

function ejecutaResultadoTransferencia(){
var interfase;
  if(GI("paramFecha").value=="" ||
  !(eval(GI("paramInterfaceID").value)==1||
  eval(GI("paramInterfaceID").value)==2||
  eval(GI("paramInterfaceID").value)==3||
  eval(GI("paramInterfaceID").value)==4)){  
    Swal.fire('Aviso', 'Debe seleccionar la Fecha y la Interfase',  'warning');
  }
  else
  {
      showWaitLayer();
      fncValidaTransferencia.tipoId = 1;
      fncValidaTransferencia.Archivo = "ERROR_TAS_"+fecha[2]+fecha[1]+fecha[0];
      fncValidaTransferencia.colData = "arpDescripcion";
      
      var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(fncValidaTransferencia);
      makeAjaxRequest(url, "HTML", sugerirNombreArchivo, null);     
  }
}

function sugerirNombreArchivo(obj , result){
  var resultado = JSON.parse(result)[0];
    delete fncValidaTransferencia.id;
    fncValidaTransferencia.queryId = "conArcPlaTAS";
    fncValidaTransferencia.fileName = "ERROR_TAS_"+fecha[2]+fecha[1]+fecha[0]+".txt";
    var url = ctxRoot + "/generarArchivoInterfase.do?json=" + JSON.stringify(fncValidaTransferencia);
    var liga = GI("ligaArchivo");
    liga.href = url;
    liga.click();
    Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
    onButtonClickPestania('Tesoreria.Interfaces.PrincipalTAS','');
    hideWaitLayer();
}

//cargaFrame();