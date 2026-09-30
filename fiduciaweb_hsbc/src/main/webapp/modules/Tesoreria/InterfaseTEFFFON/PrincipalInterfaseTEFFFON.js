showWaitLayer();

var fncInterfaseTEFFONParam = JSON.parse("{\"id\":\"ejeFunGeneraArchivosTEF\"}");
var objArchivosPlanosParam = JSON.parse("{\"id\":\"conArcPla\"}");
var dvFechaParam = JSON.parse("{\"id\":\"ejeFunRegresaFechaAnterior\"}");
var fvInterfaseTEFFON = new FormValidator();
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

fvInterfaseTEFFON.setup({
  formName      : "frmDatosInterfaseTEFFFON",
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
  asignaEtiqueta("dvFechaAnterior"," " + resultado + " de las 12:31 a las 23:59 hrs");
  asignaEtiqueta("dvFechaValor"," " + GI("txtFechaValor").value + " de las 00:00 a las 12:30 hrs");
  formsLoaded();
}
function ejecutaStoreInterfaseTEFFFON(){
  if(fvInterfaseTEFFON.checkForm()){
    showWaitLayer();
    fncInterfaseTEFFONParam.FechaValor = GI("txtFechaValor").value;
    fncInterfaseTEFFONParam.Opc1 = eval(GI("chkFechaRecepcion1").checked?1:0);
    fncInterfaseTEFFONParam.Opc2 = eval(GI("chkFechaRecepcion2").checked?1:0);
    fncInterfaseTEFFONParam.Opc3 = eval(GI("chkFechaRecepcion3").checked?1:0);
    fncInterfaseTEFFONParam.TipoInterfase = 2;
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(fncInterfaseTEFFONParam);
    makeAjaxRequest(url, "HTML", validaStoreInterfaseTEFFFON, null);
  }
}

function validaStoreInterfaseTEFFFON(obj, result){
  var resultado = JSON.parse(result)[0];
  if(isDefinedAndNotNull(resultado)){
    switch(eval(resultado)){
      case 0:
        showWaitLayer();
        objArchivosPlanosParam.tipoId = 1;
        objArchivosPlanosParam.Archivo = "FIDUCIATEF" + GI("txtFechaValor").value.split("/")[2] + GI("txtFechaValor").value.split("/")[1] + GI("txtFechaValor").value.split("/")[0];
        objArchivosPlanosParam.colData = "arpDescripcion";
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(objArchivosPlanosParam);
        makeAjaxRequest(url, "HTML", sugerirNombreArchivoInterfaseTEFFFON, null);
      break;
      case 1:Swal.fire('Aviso', 'Existen errores al generar el archivo!',  'warning');break;
      default:Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
    }
  }else
    Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
  hideWaitLayer();
}
function sugerirNombreArchivoInterfaseTEFFFON(obj , result){
  var resultado = JSON.parse(result)[0];
  if(isDefinedAndNotNull(resultado)){
    Swal.fire('Aviso', 'Se le sugiere coloque el siguiente nombre " + resultado.arpNomArchivo + ".txt para el archivo generado!',  'warning');
    delete objArchivosPlanosParam.id;
    objArchivosPlanosParam.queryId = "conArcPla";
    objArchivosPlanosParam.fileName = resultado.arpNomArchivo + ".txt";
    var url = ctxRoot + "/generarArchivoInterfase.do?json=" + JSON.stringify(objArchivosPlanosParam)
    var liga = GI("ligaArchivo");
    liga.href = url;
    liga.click();
    Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
    onButtonClick('Tesoreria.InterfaseTEFFFON.PrincipalInterfaseTEFFFON','');
  }else
    Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
  hideWaitLayer();
}