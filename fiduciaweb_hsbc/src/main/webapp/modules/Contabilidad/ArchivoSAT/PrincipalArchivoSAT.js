showWaitLayer();
var fncArchivoSAT = JSON.parse("{\"id\":\"ejeFunGeneraArchivoSAT\"}");
var objArchivosPlanosParam = JSON.parse("{\"id\":\"conArcPla\"}");
var cmbEjercicioParam = JSON.parse("{}");

var fvCat = new FormValidator();

initForms();

fvCat.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function asignaAnoMovimiento(obj, result){
  var resultado = JSON.parse(result)[0];
  fncArchivoSAT.Fecha = resultado.fecha;
  obj.value = resultado.fecha.split("/")[2];
  cmbEjercicioParam.Ano = obj.value;
  SA(GI("cmbEjercicio"),"ref","conEjeArcSAT");
  loadElement(GI("cmbEjercicio"));
  formsLoaded();
}
function asignaValueRadio2MasterX(strRadioMaster,objRadioActual){
  asignaValueRadio2Master(strRadioMaster,objRadioActual);
  RA(GI("txtSeparador"),"required");
  limpiaTxts("txtSeparador");
  ocultaObj("txtSeparador");
}
function ejecutaOperacionArchivoSAT(){
  if(fvCat.checkForm()){
    showWaitLayer();
    fncArchivoSAT.Ejercicio = eval(GI("cmbEjercicio").value);
    fncArchivoSAT.Tipo = eval(GI("rdTipoArchivo").value);
    fncArchivoSAT.Separador = GI("rdSeparador").value;
    fncArchivoSAT.NombreArchivo = "PCB050107CP2"+GI("cmbEjercicio").value+"001";
    fncArchivoSAT.Fecha = fncArchivoSAT.Fecha;
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(fncArchivoSAT);
   // alert(url)
    makeAjaxRequest(url, "HTML", validaOperacionArchivoSAT, fncArchivoSAT.NombreArchivo);
  }
}

function validaOperacionArchivoSAT(obj, result){
 //alert(result)
  var objResultado = JSON.parse(result);
  if(isDefinedAndNotNull(objResultado.resultado)){
    switch(eval(objResultado.resultado)){
      case 0:
        showWaitLayer();
        /*objArchivosPlanosParam.fileName = fncArchivoSAT.NombreArchivo + "";
        objArchivosPlanosParam.tipoId = 1;
        objArchivosPlanosParam.queryId = "conArcPla";
        objArchivosPlanosParam.colData = "arpDescripcion";
        objArchivosPlanosParam.nomArchivo = obj; */
        delete objArchivosPlanosParam.id;
        objArchivosPlanosParam.queryId = "conArcPla";
        objArchivosPlanosParam.colData = "arpDescripcion";
        //objArchivosPlanosParam.Fecha = GI("txtFechaValor").value;
        objArchivosPlanosParam.order = "\"s\"";
        objArchivosPlanosParam.fileName = obj;        
        var url = ctxRoot + "/generarArchivoInterfase.do?json=" + JSON.stringify(objArchivosPlanosParam);
        var liga = GI("ligaArchivo");
        liga.href = url;
        liga.click();
        Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
        onButtonClickPestania('Contabilidad.ArchivoSAT.PrincipalArchivoSAT','');
        
        
      break;
      default:Swal.fire('Aviso', 'Ocurrió un error inesperado (oracle)!',  'warning');
    }
  }else
    Swal.fire('Aviso', 'Ocurrió un error inesperado!',  'warning');
  hideWaitLayer();
}