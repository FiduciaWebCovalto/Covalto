showWaitLayer();
initForms();

var fvCargaInicial = new FormValidator();
var archivoSeleccionado = false;
fvCargaInicial.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function showFrame() {
  displayFrame("dvMensajes", "frameUpload", ctxRoot + "/modules/Tesoreria/CargaInicialSaldosFOSEG/FileUpload.do", 200, 200, 100, 400, 0, 0);  
}

function frameSubmit(forma) {
  if(fvCargaInicial.checkForm() && obtenerNombreArchivo(forma.flArchivo)){
    showWaitLayer();
    GI("frameUpload").onreadystatechange = hideFrame;
    forma.NombreArchivo.value = GI("NombreArchivo").value;
    forma.Fecha.value = GI("txtFechaContable").value;
    forma.submit();
    archivoSeleccionado = true;
    deshabilitaObjetos(GI("frmDatos"));
    muestraObjs("cmdCargar,cmdLimpiar");
  }else{
    archivoSeleccionado = false;
  }
}

function hideFrame() { 
  GI("frameUpload").onreadystatechange = null;
  removeFrame("frameUpload");
  hideWaitLayer();
}

function obtenerNombreArchivo(objFile){
  if(objFile.value != "" && objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0].indexOf("CARGA_FOSEG") == -1){
    Swal.fire('Aviso', 'Seleccione un Archivo de Carga correcto!',  'warning');
    return false;
  }else if(objFile.value == ""){
    Swal.fire('Aviso', 'Seleccione el Archivo de Carga!',  'warning');
    return false;
  }
  GI("NombreArchivo").value = objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0];
  return true;
}

function ejecutaCargaInicial(){
  showWaitLayer();
  var objCargaInicialParam = JSON.parse("{\"id\":\"ejeFunCargaInicial\"}");
  objCargaInicialParam.Tipo = eval(GI("rdTipoA").value);
  objCargaInicialParam.Fideicomiso = eval(GI("Fideicomiso").value);
  objCargaInicialParam.Ejercicio = eval(GI("txtEjercicio").value);
  objCargaInicialParam.OrigenRecursos = eval(GI("cmbOrigenRecursos").value);
  objCargaInicialParam.Concepto = GI("txtConcepto").value;
  objCargaInicialParam.Fecha = GI("txtFechaContable").value;
  objCargaInicialParam.Usuario = 300;
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objCargaInicialParam);
  alert(url);
  makeAjaxRequest(url, "HTML", validaCargaInicial, null);
}

function validaCargaInicial(obj, result){
  alert(result);
  var resultado = JSON.parse(result);
  if(isDefinedAndNotNull(resultado)){
    if(resultado == "CORRECTO"){
      Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
      onButtonClick('Tesoreria.CargaInicialSaldosFOSEG.PrincipalCargaInicialSaldosFOSEG','');
    }else if(resultado == "ERROR NO DATOS")
      Swal.fire('Aviso', 'No existe información a procesar!',  'warning');
    else if(resultado == "ERROR NUM COLS")
      Swal.fire('Aviso', 'Número de columnas invalido!',  'warning');
    else if(resultado == "ERROR NUM SPD")
      Swal.fire('Aviso', 'Error de dato númerico que no debería tener punto décimal!',  'warning');
    else if(resultado == "ERROR NUM CPD")
      Swal.fire('Aviso', 'Error de dato númerico que maneja punto décimal!',  'warning');
    else if(resultado == "ERROR PROC. ASIGNADO")
      Swal.fire('Aviso', 'Error al procesar el rubro de asignado!',  'warning');
    else if(resultado == "ERROR PROC. COMPROMETIDO")
      Swal.fire('Aviso', 'Error al procesar el rubro de comprometido!',  'warning');
    else if(resultado == "ERROR PROC. EJERCIDO")
      Swal.fire('Aviso', 'Error al procesar el rubro de ejercido!',  'warning');
    else if(resultado == "ERROR ORACLE")
      Swal.fire('Aviso', 'Ocurrió un error inesperado (oracle)!',  'warning');
    if(resultado != "CORRECTO"){
      var objDeleteParam = JSON.parse("{\"id\":\"delArcPla\"}");
      var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objDeleteParam);
      alert(url);
      makeAjaxRequest(url, "HTML", null, null);
    }
  }else
    Swal.fire('Aviso', 'Ocurrió un error inesperado!',  'warning');
  hideWaitLayer();
}
