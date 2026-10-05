// JavaScript Document
pkInfo = null;

var arrTblDat = new Array();
arrTblDat[0] = "idPago,50px,right";
arrTblDat[1] = "vfechaPago,110px,center";
arrTblDat[2] = "anumeroCredito,120px,center";
arrTblDat[3] = "vtipoPago,130px,center";
arrTblDat[4] = "vmoneda,130px,center";
arrTblDat[5] = "imonto,130px,right";
arrTblDat[6] = "vstatus,130px,center";

//Calendario para "Fecha"
Calendar.setup({
    inputField     :    "paramFecha",   // id of the input field
    button         :    "paramFecha",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    disableFunc    :    isValidDate,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
});

function isValidDate(date) {
  var today = new Date();
  if(date > today)
    return true;
  else
    return false;
}

function consultarAP(objButton, objForm, reqParams) {
  consultar(objButton, objForm, reqParams);
  pkInfo = null;
  ocultaObj("trSeccion");
  limpiaTxts("txtComentarios");
}

function clickTabla(pk) {
  pkInfo = pk;
  limpiaTxts("txtComentarios");
  muestraObj("trSeccion");
}

function operacionPago(id) {
  if(pkInfo == null) {
    Swal.fire('Aviso', 'Debe seleccionar un registro de la tabla!',  'warning');
    return;
  }
  var objParametros = JSON.parse("{\"id\":\"updVintaPago\"}");
  eval("objParametros.idPago=" + pkInfo.idPago);
  eval("objParametros.idTipoPago=" + pkInfo.idTipoPago);
  eval("objParametros.periodo=" + pkInfo.iperiod);
  eval("objParametros.idProducto=" + pkInfo.idProducto);
  eval("objParametros.idCredito=" + pkInfo.idCredito);
  eval("objParametros.idCliente=" + pkInfo.idCliente);
  eval("objParametros.comentarios='" + GI("txtComentarios").value + "'");
  eval("objParametros.estatus=" + ((id == 2)? "'AUTORIZADO'": "'RECHAZADO'"));
  
  showWaitLayer();
  var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objParametros);
  makeAjaxRequest(url, "HTML", respuestaOperacionPago, objParametros);
}

function respuestaOperacionPago(obj, result){
  var resultado = JSON.parse(result);
  if(obj.estatus == "AUTORIZADO" && isDefinedAndNotNull(resultado) && resultado.codigoError == 0) {
    Swal.fire('¡Éxito!', "Operación realizada exitosamente", 'success');
    pkInfo = null;
    ocultaObj("trSeccion");
    GI("cmdBuscar").click();
    hideWaitLayer();
  } else if (obj.estatus == "RECHAZADO" && isDefinedAndNotNull(resultado) && resultado.codigoError == 0) {
    var objParametros = JSON.parse("{\"id\":\"fncVintaRechazoPago\"}");
    eval("objParametros.idPago=" +  obj.idPago);
    
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objParametros);
    makeAjaxRequest(url, "HTML", respuestaFuncionRechazoPago);
  } else {
    Swal.fire('Aviso', 'Ocurrió un error al realizar la operación!',  'warning');
    hideWaitLayer();
  }
}

function respuestaFuncionRechazoPago(obj, result){
  var fcn = JSON.parse(result);
  if(isDefinedAndNotNull(fcn.resultado) && fcn.resultado == 0) {
    Swal.fire('¡Éxito!', "Operación realizada exitosamente", 'success');
  } else {
    Swal.fire('Aviso', 'Ocurrió un error al realizar la operación!',  'warning');
  }  
  pkInfo = null;
  ocultaObj("trSeccion");
  limpiaTxts("txtComentarios");
  GI("cmdBuscar").click();
  hideWaitLayer();
}

/*
function cargaPrincipalAutorizacionPagos() {
  onButtonClickPestania("Vinta.AutorizacionPagos.PrincipalAutorizacionPagos","");
}
*/