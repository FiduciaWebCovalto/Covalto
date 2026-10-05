//showWaitLayer();
//var objArchivosPlanosParam = JSON.parse("{\"id\":\"muestradatosErrorCtasIndiv\"}");
deshabilitaPK("paramFideicomiso".split(","));

var fvCargaMasiva = new FormValidator();
var fechaDefault = new Date();
var archivoSeleccionado = false;
var divNombreFideicomisoParam;
fvCargaMasiva.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});


var numContrato = GI("paramFideicomiso").value;
consultaNombreFideicomiso("nomFideicomiso",GI("paramFideicomiso"));


function asignaValueRadio2MasterX(strRadioMaster,objRadioActual){
  asignaValueRadio2Master(strRadioMaster,objRadioActual);
  RA(GI("txtSeparador"),"required");
  limpiaTxts("txtSeparador");
  ocultaObj("txtSeparador");
}

function obtenerNombreArchivo(objFile){
  /*
  if(objFile.value != "" && objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0].indexOf("CARGA_FOSEG") == -1){
    Swal.fire('Aviso', 'Seleccione un Archivo de Carga correcto!',  'warning');
    return false;
  }else 
  */
  if(objFile.value == ""){
    Swal.fire('Aviso', 'Seleccione el Archivo de Carga!',  'warning');
    return false;
  }
  GI("NombreArchivo").value = objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0];
  return true;
}

function ejecutaCargaMasiva(){
  showWaitLayer();
  console.log("rdTipoMovimiento: "+GI("rdTipoMovimiento").value);
  if(GI("rdTipoMovimiento").value!="CFA"&&GI("rdTipoMovimiento").value!="CFM"&&
  GI("rdTipoMovimiento").value!="DescargaCifrasA"&&GI("rdTipoMovimiento").value!="DescargaCifrasM"
  &&GI("rdTipoMovimiento").value!="DescargaCifrasR"){
     if(GI("NombreArchivo").value==""||GI("NombreArchivo").value==null){
          hideWaitLayer();
          Swal.fire('Aviso', 'Seleccione el archivo a cargar!',  'warning')}
     else{
          var objCargaMasivaParam = JSON.parse("{\"id\":\"ejeFunCargaMasivaCuentasIndividuales\"}");
          if(numContrato!=1019)
            objCargaMasivaParam.Tipo = 1;
          else
            objCargaMasivaParam.Tipo = 3;
          objCargaMasivaParam.Separador = GI("rdSeparador").value;
          objCargaMasivaParam.TipoMovimiento = GI("rdTipoMovimiento").value;
          objCargaMasivaParam.FechaMovimientos = GI("txtFechaMovimientos").value;
          objCargaMasivaParam.Fideicomiso = numContrato;
          objCargaMasivaParam.NombreArchivo = GI("NombreArchivo").value;
          var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objCargaMasivaParam);
          makeAjaxRequest(url, "HTML", validaCargaMasiva, null);               
     }
  }
  else{        
        //Swal.fire('Aviso', 'llego aki',  'warning');
        //se validan la cantidad total de registros a procesar
        var objQuerySelectCount = JSON.parse("{\"id\":\"verRegistroCF\"}");
        objQuerySelectCount.fechaAplicacion = GI("txtFechaMovimientos").value;
        objQuerySelectCount.interfaseID = GI("rdTipoMovimiento").value; 
        var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objQuerySelectCount);        
        makeAjaxRequest(url, "HTML", verificarRegistrosErrCtasIndiv2, null);            
  }
}
var numRegistros;
var contRegistros;
function verificarRegistrosErrCtasIndiv2(obj, result){
   //alert(result);
        numRegistros=JSON.parse(result)[0]
        contRegistros=numRegistros.totalRegistros
        if(GI("rdTipoMovimiento").value!="DescargaCifrasA"&&GI("rdTipoMovimiento").value!="DescargaCifrasM"
        &&GI("rdTipoMovimiento").value!="DescargaCifrasR"){
            if(GI("rdTipoMovimiento").value=="CFA"){        
                var objParametros = JSON.parse("{\"id\":\"ejeFunGeneraCFAcumulada\"}");
                objParametros.Fecha = GI("txtFechaMovimientos").value;
            }else{
                var objParametros = JSON.parse("{\"id\":\"ejeFunGeneraCFMensual\"}");
                objParametros.Fecha = GI("txtFechaMovimientos").value;
            }            
        }
        else{
            if(GI("rdTipoMovimiento").value=="DescargaCifrasR"){
                var objParametros = JSON.parse("{\"id\":\"ejeFunGeneraCFVirtualR\"}");
                objParametros.Fecha = GI("txtFechaMovimientos").value;                            
            }
            else {
                var objParametros = JSON.parse("{\"id\":\"ejeFunGeneraCFVirtual\"}");
                objParametros.Fecha = GI("txtFechaMovimientos").value;                                            
            }
        }
		console.log("Salida Validacion Cifras Control Acumuladas: "+contRegistros);
        if(GI("rdTipoMovimiento").value!="DescargaCifrasA"&&contRegistros==-2){
			hideWaitLayer();
			Swal.fire('Aviso', 'Ya existe un proceso en ejeucion!',  'warning');
		}else{
        stopCtl = false;
        ultimaCantidad = -1;
        veces = 0;
        etapa = 0;    
        urlProcCtl = ctxRoot + "/doRef.do?json=" + JSON.stringify(objMonitor);    
        var url = ctxRoot + "/executeRefAsync.do?json=" + JSON.stringify(objParametros);
        makeAjaxRequest(url, "HTML", processMonitor, contRegistros);               
        }
}


var objMonitor = {id:"controlCierrePensionesCF"}; 
var urlProcCtl = ctxRoot + "/doRef.do?json=" + JSON.stringify(objMonitor);
function processMonitor(obj, result) {
    //console.log("Total Registros: "+obj);
    console.log("Total Registros2: "+contRegistros);
    //console.log("Salida stopCtl: "+stopCtl);
    if(!stopCtl) { setTimeout(function() { makeAjaxRequest(urlProcCtl, "HTML", processMonitor, null); }, 3000); }
    console.log("Salida result: "+result);
       try {
            var msgProc = JSON.parse(result);
            if(msgProc.succedded) return;
        } catch(e) {}
        
        var objCtl = JSON.parse(result)[0];
        console.log("Salida Registros Procesados: "+objCtl.totalRegistros);
        if((!stopCtl && objCtl.totalRegistros == contRegistros && veces >= 5)||
        (!stopCtl && (GI("rdTipoMovimiento").value=="DescargaCifrasA"||GI("rdTipoMovimiento").value=="DescargaCifrasM")&& veces >= 5)) {
            stopCtl = true;
            //Poner aqui la funcion a llamar cunado se cumplan las condiciones
            //validaEjecutaPlan(obj,result);
            objArchivosPlanosParam.tipoId = 1;
            objArchivosPlanosParam.Archivo = GI("rdTipoMovimiento").value=="DescargaCifrasR"?"TotalRendimientos.csv":"CifrasControl.csv";
            objArchivosPlanosParam.colData = "arpDescripcion";            
            sugerirNombreArchivoInterfase(obj , result);
        } else {
            ultimaCantidad = objCtl.totalRegistros;
            veces++;
        }
}
var objArchivosPlanosParam = JSON.parse("{\"id\":\"conArcPlaTAS\"}");
function sugerirNombreArchivoInterfase(obj , result){
  var resultado = JSON.parse(result)[0];
  if(isDefinedAndNotNull(resultado)){
    delete objArchivosPlanosParam.id;
    objArchivosPlanosParam.queryId = "conArcPlaTAS";
    objArchivosPlanosParam.colData = "arpDescripcion";              
    objArchivosPlanosParam.order = "\"s\"";
    objArchivosPlanosParam.fileName =GI("rdTipoMovimiento").value=="DescargaCifrasR"?"TotalRendimientos.csv":"CifrasControl.csv";
    var url = ctxRoot + "/generarArchivoInterfase.do?json=" + encodeURIComponent(JSON.stringify(objArchivosPlanosParam));
    var liga = GI("ligaArchivo");
    liga.href = url;
    liga.click();
  }else
    Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
  hideWaitLayer();
}

function sugerirNombreArchivoInterfase2(obj , result){
  var resultado = JSON.parse(result)[0];
  if(isDefinedAndNotNull(resultado)){
    delete objArchivosPlanosParam.id;
    objArchivosPlanosParam.queryId = "conArcPlaTAS";
    objArchivosPlanosParam.colData = "arpDescripcion";              
    objArchivosPlanosParam.order = "\"s\"";
    objArchivosPlanosParam.fileName ="CifrasControl.csv";
    var url = ctxRoot + "/generarArchivoInterfase.do?json=" + encodeURIComponent(JSON.stringify(objArchivosPlanosParam));
    var liga = GI("ligaArchivo");
    liga.href = url;
    liga.click();
    onButtonClickPestania('CuentasIndividuales.CargaMasivaMovimientos.PrincipalCargaMasivaMovimientos','');
  }else
    Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
  hideWaitLayer();
}


function validaCargaMasiva(obj, result){
  var resultado = JSON.parse(result);
  if(isDefinedAndNotNull(resultado.respuesta)){
    switch(resultado.respuesta.substring(0,1)){
    case '0':
    Swal.fire('Aviso', 'Proceso concluido satisfactoriamente, se cargaron "+resultado.respuesta.substring(2,resultado.respuesta.length)+" registros!',  'warning');
    delete objArchivosPlanosParam.id;
    objArchivosPlanosParam.queryId = "conArcPlaTAS";
    objArchivosPlanosParam.colData = "arpDescripcion";              
    objArchivosPlanosParam.order = "\"s\"";
    objArchivosPlanosParam.fileName =GI("rdTipoMovimiento").value=="DescargaCifrasR"?"TotalRendimientos.csv":"CifrasControl.csv";
    var url = ctxRoot + "/generarArchivoInterfase.do?json=" + encodeURIComponent(JSON.stringify(objArchivosPlanosParam));
    var liga = GI("ligaArchivo");
    liga.href = url;
    liga.click();
    onButtonClickPestania('CuentasIndividuales.CargaMasivaMovimientos.PrincipalCargaMasivaMovimientos','');
    break;
    case '1':Swal.fire('Aviso', 'No se pudo incorporar la Aportacion del Empleado del Empleado "+ resultado.respuesta.substring(1,resultado.respuesta.length) +"!',  'warning');break;
    case '2':Swal.fire('Aviso', 'No se pudo incorporar el Seguro del Empleado del Empleado "+ resultado.respuesta.substring(1,resultado.respuesta.length) +"!',  'warning');break;
    case '3':Swal.fire('Aviso', 'No se pudo incorporar la Aportacion del Municipio del Empleado "+ resultado.respuesta.substring(1,resultado.respuesta.length) +"!',  'warning');break;
    case '4':Swal.fire('Aviso', 'No se pudo incorporar el Seguro del Municipio del Empleado "+ resultado.respuesta.substring(1,resultado.respuesta.length) +"!',  'warning');break;
    case '5':Swal.fire('Aviso', 'No existe el Empleado "+ resultado.respuesta.substring(1,resultado.respuesta.length) +"!',  'warning');break;
    default:
      Swal.fire('Aviso', 'Ocurrió un error inesperado (oracle)!',  'warning');
      var objDeleteParam = JSON.parse("{\"id\":\"delArcPla\"}");
      var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objDeleteParam);
      makeAjaxRequest(url, "HTML", null, null);
    }
     procesoArchivoPlanoError();
  }else
    Swal.fire('Aviso', 'Ocurrió un error inesperado!',  'warning');
  GI("archivo").style.visibility = "hidden";  
  hideWaitLayer();
}

function showFrame() {
  displayFrame("dvMensajes", "frameUpload", ctxRoot + "/modules/CuentasIndividuales/CargaMasivaMovimientos/FileUpload.do", 200, 200, 100, 400, 0, 0);  
}

function frameSubmit(forma) {
  if(fvCargaMasiva.checkForm() && obtenerNombreArchivo(forma.flArchivo)){
    showWaitLayer();
    GI("frameUpload").onreadystatechange = hideFrame;
    console.log("rdTipoMovimiento: "+GI("rdTipoMovimiento").value);
    var theProcessor = "mx.gob.nafin.fiduciario.business.upload.processors.CargaArchivosExcelReportosImpl";
    switch(GI("rdTipoMovimiento").value) {
        case "DF":
        case "RF":
            theProcessor = "mx.gob.nafin.fiduciario.business.upload.processors.CargaArchivosExcelFOFAESImpl";
            break;
        case "TF":
            theProcessor = "mx.gob.nafin.fiduciario.business.upload.processors.CargaArchivosExcelFOFAESTImpl";
            break;
        default: 
            theProcessor = "mx.gob.nafin.fiduciario.business.upload.processors.CargaArchivosExcelReportosImpl";
            break;
    }
    console.log("theProcessor:"+theProcessor);
    //document.frameUpload.frmCargaComprasVentas.processID.value = procID;
    if(GI("rdTipoMovimiento").value!="CFA"&&GI("rdTipoMovimiento").value!="CFM"){
        forma.processor.value = theProcessor;     
        forma.NombreArchivo.value = GI("NombreArchivo").value;
        forma.Fecha.value = GI("txtFechaContable").value;
        forma.submit();
        archivoSeleccionado = true;
        deshabilitaObjetos(GI("frmDatos"));
        GI("archivo").style.visibility = "visible";
        GI("archivo").value = GI("NombreArchivo").value;
        muestraObjs("cmdCargar,cmdLimpiar,divArchivo");        
    }else{ 
        forma.processor.value = theProcessor;     
        forma.NombreArchivo.value = "CifrasControl.csv";
        forma.Fecha.value = GI("txtFechaContable").value;
        forma.submit();
        archivoSeleccionado = true;
        deshabilitaObjetos(GI("frmDatos"));
        GI("archivo").style.visibility = "hidden";
        GI("archivo").value = "CifrasControl.csv";
        muestraObjs("cmdCargar,cmdLimpiar");                
    }
  }else{
    archivoSeleccionado = false;
  }
}

function hideFrame() { 
  GI("frameUpload").onreadystatechange = null;
  removeFrame("frameUpload");
  hideWaitLayer();
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
    inputField     :    "txtFechaMovimientos",
    button         :    "txtFechaMovimientos",
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


function ejecutaborrartabla(){
  var objBorraCargaMasivaParam = JSON.parse("{\"id\":\"delCargaMasiva\"}");
  var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objBorraCargaMasivaParam);
    makeAjaxRequest(url, "HTML", null, null);
    borraTablaRepErrCuentasIndiv();
}

function cargaPantalla(){
 ejecutaborrartabla();
 onButtonClickPestania('CuentasIndividuales.CargaMasivaMovimientos.PrincipalCargaMasivaMovimientos','');
}


function procesoArchivoPlanoError() {
   //VERIFICAR SI EXISTEN REGISTROS EN LA TABLA REP_ERR_CUENTASINDIV
   var objQuerySelectCount = JSON.parse("{\"id\":\"verExistenDatosTbCtasInd\"}");
   var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objQuerySelectCount);
   //alert(url);
   makeAjaxRequest(url, "HTML", verificarRegistrosErrCtasIndiv, null);
}

function verificarRegistrosErrCtasIndiv(obj, result){
   //alert(result);
   var numRegistros=JSON.parse(result)[0]
   //INICIA LA VERIFICACION
   if(numRegistros.numreg!=0) {//si la tabla REP_ERR_CUENTASINDIV contiene registros, generar un archivo plano
    var nomArchivo= GI("NombreArchivo").value+"_ERROR";
    objArchivosPlanosParam.tipoId = 1;
    objArchivosPlanosParam.Archivo = nomArchivo;
    objArchivosPlanosParam.colData = "cadena";      
    delete objArchivosPlanosParam.id;
    objArchivosPlanosParam.queryId = "muestradatosErrorCtasIndiv";      
    objArchivosPlanosParam.fileName = nomArchivo;
    
    var url = ctxRoot + "/generarArchivoInterfase.do?json=" + JSON.stringify(objArchivosPlanosParam);
    var liga = GI("ligaArchivo");
    liga.href = url;
    liga.click();
    hideWaitLayer();
   //borraTablaRepErrCuentasIndiv();
    //onButtonClickPestania('CuentasIndividuales.CargaMasivaMovimientos.PrincipalCargaMasivaMovimientos','');
   }
}

function borraTablaRepErrCuentasIndiv() {
    var objBorraRepErrCuentasIndiv = JSON.parse("{\"id\":\"delObjRepErrCuentasIndiv\"}");
    //alert(url);
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objBorraRepErrCuentasIndiv);
    makeAjaxRequest(url, "HTML", null, null);

}


//---------------------------------- FUNCIONOES PARA EL REEDIRECCIONAMIENTO --------------------------------------------------

function siguienteFuncionDiv(){
   Swal.fire('Aviso', 'siguienteFuncionDiv',  'warning');
   nextDivFunction(GI("invocaDiv2"));
}

function reedireccionar(){
   Swal.fire('Aviso', 'reedireccionar',  'warning');
}

function reedireccionar(){
var validaRadio = JSON.parse("{\"id\":\"refer\",\"Fideicomiso\":0}");
    validaRadio.Fideicomiso = GI("paramFideicomiso").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validaRadio);
    makeAjaxRequest(url, "HTML", resultrefer, null);
    //obtenerFechaContable();
    
  
}

function resultrefer(obj, result) {
   var objResult = JSON.parse(result);
  if(objResult[0].fisoSeleccionado!=1){
      onButtonClickPestania("CuentasIndividuales.CuentasIndividuales.PrincipalFideicomisosCuentasIndividuales","");
      loadDynamicJS(ctxRoot + "/modules/CuentasIndividuales/CuentasIndividuales/PrincipalFideicomisosCuentasIndividuales.js");
      //hideWaitLayer();
      
  }
  else
    nextDivFunction(GI("divReedireccion"));
    hideWaitLayer();
} 

/*NUEVA SECCION PARA CARGAR Y DESCARGAR ARCHIVOS*/
//const boton = document.getElementById('btnUpload');

document.getElementById('btnUpload').addEventListener('click', function(event) {
    // 1. Evitar que el botón recargue la página
    event.preventDefault();
    uploadFileExcel();
});    

async function uploadFileExcel() {  
    var boton = document.getElementById("btnUpload");
    const fileInput = document.getElementById('excelFile');
    const statusMessage = document.getElementById('statusMessage');
    // 1. Recuperar credenciales del almacenamiento local
    if(GI("txtFechaMovimientos").value==""){
        Swal.fire('Eror', 'No ha incorporado la fecha de carga.',  'error');
        return;
    }
    if(GI("paramFideicomiso").value==""){
        Swal.fire('Eror', 'No ha seleccionado el fideicomiso.',  'error');
        return;
    }    
    if (fileInput.files.length === 0){
        Swal.fire('Eror', 'No ha seleccionado ningun archivo',  'error');
        return;
    } 
    const selectedOption = document.querySelector('input[name="importType"]:checked').value;
    if (!selectedOption) {
        Swal.fire('Eror', 'Por favor selecciona una opcion',  'error');
        return;
    }
    // Crear FormData para enviar archivos vía AJAX
    const formData = new FormData();
    formData.append('file', fileInput.files[0]);
    formData.append('type', selectedOption);
    const token = localStorage.getItem('token'); 
    const usuario = localStorage.getItem('usuario'); 

    formData.append('token', token);
    formData.append('usuario', usuario);
    formData.append('origen', "2");
    formData.append('fecha', GI("txtFechaMovimientos").value);
    formData.append('fideicomiso', GI("paramFideicomiso").value);

    console.log('type'+selectedOption);
    console.log('file'+fileInput.files[0]);
    
    statusMessage.innerHTML = '<div class="alert alert-info">Subiendo...</div>';

    try {
    
    const response = await 
    fetch('ExcelUploadServlet', {
    method: 'POST',
    body: formData
    });
    
    const result = await response.json();
    console.log('Respuesta del Servlet:', result);
    
        if (result=="200") {                    
            statusMessage.innerHTML = 'Archivo subido con éxito!';
            statusMessage.style.color = 'green';
            boton.style.display = "none";
            
            Swal.fire({
              title: "El Archivo se cargo con exito!",
              text: "¡Favor de revisar la informacion en el Estado de Cuenta!",
              icon: "success",
              confirmButtonColor: "#3085d6",
              confirmButtonText: "Aceptar"
            }).then((result) => {
              if (result.isConfirmed) {
                reinicia_pantalla();
              }
            });                        
        } else if (result=="800")
        {
            statusMessage.innerHTML = 'El archivo ya se subio';
            statusMessage.style.color = 'red';
            boton.style.display = "none";
            
            Swal.fire({
              title: "El archivo ya se subio!",
              icon: "error",
              confirmButtonColor: "#3085d6",
              confirmButtonText: "Aceptar"
            }).then((result) => {
              if (result.isConfirmed) {
                reinicia_pantalla();
              }
            });
        }else{
            statusMessage.innerHTML = result;
            statusMessage.style.color = 'red';
            boton.style.display = "none";
            
            Swal.fire({
              title: result,
              icon: "error",
              confirmButtonColor: "#3085d6",
              confirmButtonText: "Aceptar"
            }).then((result) => {
              if (result.isConfirmed) {
                reinicia_pantalla();
              }
            });        
        }         
    }
    catch (error) {
        statusMessage.innerHTML = 'Error al subir el archivo.';
        statusMessage.style.color = 'red';
        boton.style.display = "none";
    
        Swal.fire({
          title: "Error al subir el archivo!",
          icon: "error",
          confirmButtonColor: "#3085d6",
          confirmButtonText: "Aceptar"
        }).then((result) => {
          if (result.isConfirmed) {
            reinicia_pantalla();
          }
        });
    }
}
function reinicia_pantalla(){
  onButtonClickPestania("CuentasIndividuales.CargaMasivaMovimientos.PrincipalCargaMasivaMovimientos","");
  loadDynamicJS(ctxRoot + "/modules/CuentasIndividuales/CargaMasivaMovimientos/PrincipalCargaMasivaMovimientos.js");
}

document.getElementById('excelFile').addEventListener('change', handleFile);

// 1. Manejar la selección del archivo y mostrar preview
function handleFile(e) {

    const file = e.target.files[0];
    const reader = new FileReader();
    console.log("handleFile "+file)
    reader.onload = function(event) {
        let datosParseados = null;

        const data = new Uint8Array(event.target.result);
        const workbook = XLSX.read(data, {type: 'array'});
        
        // Obtener la primera hoja
        const firstSheetName = workbook.SheetNames[0];
        const worksheet = workbook.Sheets[firstSheetName];
        
        // Convertir a JSON
        datosParseados = XLSX.utils.sheet_to_json(worksheet);
        
        // Mostrar en Tabla Bootstrap
        mostrarTabla(datosParseados);
        document.getElementById('previewContainer').style.display = 'block';
    };
    reader.readAsArrayBuffer(file);
}

// 2. Mostrar datos en HTML
function mostrarTabla(data) {
    const selectedOption = document.querySelector('input[name="importType"]:checked').value; 
    if (!selectedOption) {
        Swal.fire('Eror', 'Por favor selecciona una opcion para la Carga',  'error');
        return;
    }

    if (data.length === 0) return;
    var boton = document.getElementById("btnUpload");   
    let html = '<table class="table table-responsive table-hover">';
    // Cabecera
    html += '<thead class="table-info"><tr>' + Object.keys(data[0]).map(key => `<th>${key}</th>`).join('') + '</tr></thead>';
    // Cuerpo
    html += '<tbody>' + data.map(row => `<tr>${Object.values(row).map(val => `<td>${val}</td>`).join('')}</tr>`).join('') + '</tbody>';
    html += '</table>';
    document.getElementById('tablePreview').innerHTML = html;
    boton.style.display = "block";
}

document.getElementById('btnDescargar').addEventListener('click', function(event) {
    // 1. Evitar que el botón recargue la página
    event.preventDefault();
    descargarExcel();
});     
    
async function descargarExcel() {
    const fiso = document.getElementById('paramFideicomiso').value;
    const fechainicial = document.getElementById('txtFechaMovimientos').value;
    const fechafinal = document.getElementById('txtFechaMovimientos').value;
    const selectedOption = document.querySelector('input[name="importTypeDescarga"]:checked').value; 
    console.log('fiso '+fiso);
    console.log('fechainicial '+fechainicial);
    console.log('fechafinal '+fechafinal);
    console.log('selectedOption '+selectedOption); 
    if (!selectedOption) {
        Swal.fire('Eror', 'Por favor selecciona una opcion para la Descarga',  'error');
        return;
    }
    if(selectedOption==1&&(fiso==null||fiso==""))
    {
        Swal.fire('Eror', 'Por favor incorpora un Fideicomiso',  'error');
        return;
    }
    if(selectedOption==2)
    {
        if(fiso==null||fiso=="")
        {
            Swal.fire('Eror', 'Por favor incorpora el Fideicomiso',  'error');
            return;
        }
        if(fechainicial==null||fechainicial=="")
        {
            Swal.fire('Eror', 'Por favor incorpora el Periodo Inicial',  'error');
            return;
        }
        if(fechafinal==null||fechafinal=="")
        {
            Swal.fire('Eror', 'Por favor incorpora el Periodo Final',  'error');
            return;
        }

    }
    // 1. Llamar al Servlet con los 4 parámetros
    const response = await fetch('downloadExcel?caso=3&fiso='+fiso+'&fechainicial='+fechainicial+'&fechafinal='+fechafinal);
    const rawData = await response.json();

    // 2. Reemplazar los headers (Mapeo de datos)
    // Supongamos que API trae: {"userId": 1, "userName": "Juan", "total": 100}
    // Queremos en Excel: "ID", "Nombre Usuario", "Monto Total"
    var mappedData="";
    console.log("rawData: "+rawData)
    if(rawData.length>0){
        mappedData = rawData.map(item => (
        {
            "Clave": item.arpDescripcion.split(",")[0],
            "Dato": item.arpDescripcion.split(",")[1],
            "Aportacion Empleado": item.arpDescripcion.split(",")[2],
            "Interes Empleado": item.arpDescripcion.split(",")[3],
            "Total Empleado": item.arpDescripcion.split(",")[4],
            "Aportacion Empresa": item.arpDescripcion.split(",")[5],
            "Interes Empresa": item.arpDescripcion.split(",")[6],
            "Total Empresa": item.arpDescripcion.split(",")[7],
            "Total Aportaciones": item.arpDescripcion.split(",")[8],
            "Total Intereses": item.arpDescripcion.split(",")[9],
            "Total Acumulado": item.arpDescripcion.split(",")[10],
            "Fecha Alta": item.arpDescripcion.split(",")[11],
            "Fecha Modificacion": item.arpDescripcion.split(",")[12],
            "Porcentaje": item.arpDescripcion.split(",")[13],
            "Derechos Adquiridos": item.arpDescripcion.split(",")[14]        
        }));        
    }else{
        Swal.fire('Aviso', 'No existe informacion a descargar!',  'warning');
        mappedData = rawData.map(item => ({
            "Clave": "",
            "Dato": "",
            "Aportacion Empleado": "",
            "Interes Empleado": "",
            "Total Empleado": "",
            "Aportacion Empresa": "",
            "Interes Empresa": "",
            "Total Empresa": "",
            "Total Aportaciones": "",
            "Total Intereses": "",
            "Total Acumulado": "",
            "Fecha Alta": "",
            "Fecha Modificacion": "",
            "Porcentaje": "",
            "Derechos Adquiridos": ""         
        }));
    }


    // 3. Crear el libro de Excel
    const worksheet = XLSX.utils.json_to_sheet(mappedData);
    const workbook = XLSX.utils.book_new();
    XLSX.utils.book_append_sheet(workbook, worksheet, "Cartera");

    // 4. Descargar archivo
    XLSX.writeFile(workbook, "Honorarios.xlsx");

}