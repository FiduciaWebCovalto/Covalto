showWaitLayer();
initForms();

var fvCargaMasiva = new FormValidator();
var archivoSeleccionado = false;
//var divNombreFideicomisoParam;
var fechaDefault = new Date();

fvCargaMasiva.setup({
  formName      : "frmCargaMasiva",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function showFrame() {
  displayFrame("dvMensajes", "frameUpload", ctxRoot + "/modules/Contabilidad/BienesFideicomitidos/FileUpload.do", 200, 200, 100, 400, 0, 0);  
}

function frameSubmit(forma) {
    //obtenerTipoArchivo();
  if(fvCargaMasiva.checkForm() && obtenerNombreArchivo(forma.flArchivo)){
    showWaitLayer();
    GI("frameUpload").onreadystatechange = hideFrame;
    forma.NombreArchivo.value = GI("NombreArchivo").value;
    forma.Fecha.value = GI("txtFechaContable").value;
    forma.submit();
    archivoSeleccionado = true;
    deshabilitaObjetos(GI("frmCargaMasiva"));
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
  var numTipo = GI("rdTipoMovimiento").value;
  var tipoOperacion = eval(numTipo);
  alert("tipo:"+tipoOperacion);
  switch(tipoOperacion){
    case 1://Individualización Inmuebles
         if(objFile.value != "" && objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0].indexOf("INMUEBLES") == -1){
         Swal.fire('Aviso', 'Seleccione un Archivo de Carga correcto!',  'warning');
         return false;
         }else if(objFile.value == ""){
            Swal.fire('Aviso', 'Seleccione el Archivo de Carga!',  'warning');
            return false;
	}else 
      {
       GI("NombreArchivo").value = objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0];
        return true;
      }
    break;
    case 2://Individualización Inmuebles
         if(objFile.value != "" && objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0].indexOf("ADQUIRENTES") == -1){
         Swal.fire('Aviso', 'Seleccione un Archivo de Carga correcto!',  'warning');
         return false;
         }else if(objFile.value == ""){
            Swal.fire('Aviso', 'Seleccione el Archivo de Carga!',  'warning');
            return false;
	}else 
      {
       GI("NombreArchivo").value = objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0];
        return true;
      }
    break;
    case 3://Individualización Inmuebles
         if(objFile.value != "" && objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0].indexOf("PAGOS") == -1){
         Swal.fire('Aviso', 'Seleccione un Archivo de Carga correcto!',  'warning');
         return false;
         }else if(objFile.value == ""){
            Swal.fire('Aviso', 'Seleccione el Archivo de Carga!',  'warning');
            return false;
	}else 
      {
       GI("NombreArchivo").value = objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0];
        return true;
      }
    break;
   default:
      Swal.fire('Aviso', 'error',  'warning'); 
      }

  if(objFile.value != "" && objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0].indexOf("ADQUIRENTES") == -1){
    Swal.fire('Aviso', 'Seleccione un Archivo de Carga correcto!',  'warning');
    return false;
  }else if(objFile.value == ""){
    Swal.fire('Aviso', 'Seleccione el Archivo de Carga!',  'warning');
    return false;
  }
  GI("NombreArchivo").value = objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0];
  return true;
}

function ejecutaCargaMasiva(){
  showWaitLayer();
  var objCargaMasivaParam = JSON.parse("{\"id\":\"ejeFunCargaMasiva\"}");
  //objCargaMasivaParam.Tipo = 1;
  objCargaMasivaParam.TipoMovimiento = eval(GI("rdTipoMovimiento").value);
  objCargaMasivaParam.Fideicomiso = GI("paramFideicomiso").value;
  objCargaMasivaParam.NombreArchivo = GI("NombreArchivo").value;
  objCargaMasivaParam.Fecha = GI("txtFechaContable").value;
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objCargaMasivaParam);
  alert(url);
  makeAjaxRequest(url, "HTML", validaCargaMasiva, null);
}


function validaCargaMasiva(obj, result){
  alert(result);
  var resultado = JSON.parse(result);
  if(isDefinedAndNotNull(resultado)){
    if(resultado == "CORRECTO"){
      Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
      onButtonClick('Contabilidad.BienesFideicomitidos.PrincipalCargaMasiva','');
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