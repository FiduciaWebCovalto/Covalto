showWaitLayer();

var fncVencimientoManualReportosParam = JSON.parse("{\"id\":\"ejeFunVencimientoManualReportos\"}");
var fvVencimientoManualReportos = new FormValidator();

initForms();

fvVencimientoManualReportos.setup({
  formName      : "frmVencimientoManualReportos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function consultaMesAbierto(){
  verificaFecha(GI("txtFechaContable"));
  hideWaitLayer();
}
function ejecutaVencimientoManualReportos(){
  if(fvVencimientoManualReportos.checkForm()){
    showWaitLayer();
    var numUsuario = 683; //ALERTA: SE PUSIERON DE ESTA FORMA EN EL CODIGO YA QUE LOS PARAMETROS PARA FUNCIONES Y STORES DEBEN IR UNO A UNO ORDENADOS(NO ES COMO LOS QUERYS)
    fncVencimientoManualReportosParam.numFolio = eval(GI("txtFolio").value);
    fncVencimientoManualReportosParam.banContabiliza = (GI("chkNoAfectarContabilidad").checked)?0:1;
    fncVencimientoManualReportosParam.numUsuario = numUsuario;
    fncVencimientoManualReportosParam.banMesAbierto = eval(GI("txtMesAbierto").value);
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(fncVencimientoManualReportosParam);
    makeAjaxRequest(url, "HTML", validaVencimientoManualReportos, null);
  }
}

function validaVencimientoManualReportos(obj, result){
  var resultado = JSON.parse(result)[0];
  var folio = resultado;
  var numOperacion = 0;
  
  if(resultado.substring(0,2) == 10){
    numOperacion = resultado.split("-")[1];
    resultado = resultado.split("-")[0];
  }
  else if(resultado.substring(0,1) == 0){
    numOperacion = resultado.split("-")[1];
    resultado = resultado.split("-")[0];
  }
  
  if(isDefinedAndNotNull(resultado)){
    switch(eval(resultado)){
      case 0:
        alert("Proceso concluido satisfactoriamente con folio de operación: "+folio.substring(2,folio.length));
        onButtonClickPestania("Tesoreria.VencimientoManualReportos.PrincipalVencimientoManualReportos","");
      break;
      case 1:Swal.fire('Aviso', 'Plazo erroneo!',  'warning');break;
      case 2:Swal.fire('Aviso', 'Plazo erroneo!',  'warning');break;
      case 3:Swal.fire('Aviso', 'Fecha de vencimiento feriada!',  'warning');break;
      case 4:Swal.fire('Aviso', 'No se grabó DATOVAL!',  'warning');break;
      case 5:Swal.fire('Aviso', 'No se grabó DETVALOR!',  'warning');break;
      case 6:Swal.fire('Aviso', 'No se contabilizó!',  'warning');break;
      case 7:Swal.fire('Aviso', 'El Reporto no se encuentra para el vencimiento!',  'warning');break;
      case 8:Swal.fire('Aviso', 'No se grabo DATOVAL en el vencimiento!',  'warning');break;
      case 9:Swal.fire('Aviso', 'No se grabó DETVALOR en el vencimiento!',  'warning');break;
      case 10:Swal.fire('Aviso', 'No existe la Operación " + numOperacion + " ó la Operación no tiene asignada Estructura Contable!',  'warning');break;
      case 11:Swal.fire('Aviso', 'No existe el Reporto!',  'warning');break;
      default:Swal.fire('Aviso', 'Ocurrió un error inesperado!',  'warning');
    }
  }else
    Swal.fire('Aviso', 'Ocurrió un error inesperado!',  'warning');
  hideWaitLayer();
}