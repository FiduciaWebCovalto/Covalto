showWaitLayer();
initForms();
deshabilitaPK("txtImporteOrigen,txtMoneda,txtImporteNacional".split(","));
ocultaObjs("dvTipoCambio,dv0,dv1,dv2,dv3,txtImporteOrigen,txtTipoCambio,txtImporteNacional,cmdContabilizar");
SA(GI("txtMoneda"),"disabled","true");

var arrTblInsIntRecDat = new Array();
var fechaDefault = new Date();
var objCharolaContaParam = JSON.parse("{\"id\":\"ejeFunCharolaConta\"}");
var fvInstruccionesInternetSWIFT = new FormValidator();

arrTblInsIntRecDat[0] = "folio,62";
arrTblInsIntRecDat[1] = "status,100";
arrTblInsIntRecDat[2] = "fideicomiso,80";
arrTblInsIntRecDat[3] = "tipoInstruccion,147";
arrTblInsIntRecDat[4] = "moneda,147";
arrTblInsIntRecDat[5] = "importe,67";
arrTblInsIntRecDat[6] = "paridad,54";
arrTblInsIntRecDat[7] = "importecparidad,118";
arrTblInsIntRecDat[8] = "concepto,142";
arrTblInsIntRecDat[9] = "ctoinver,113";
arrTblInsIntRecDat[10] = "cuentaArea,80";
arrTblInsIntRecDat[11] = "fecha,82";

function setFechaCal(){}
function isValidDate(date){ 
  var today = new Date();
  if(date > today)
    return true;
  else
    return false;
}

Calendar.setup({
    inputField     :    "paramFecha",
    button         :    "paramFecha",
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
fvInstruccionesInternetSWIFT.setup({
  formName      : "frmDatosInstrucciones",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});
function consultarX(btn, frm, reqParam){
  if(GI("paramFecha").value != ""){
    GI("paramDia").value = GI("paramFecha").value.split("/")[0];
    GI("paramMes").value = GI("paramFecha").value.split("/")[1];
    GI("paramAno").value = GI("paramFecha").value.split("/")[2];
  }
  consultar(btn, frm, reqParam);
}

function clickTabla(pk){
  pkInfo = pk;
  GI("txtImporteOrigen").value = pkInfo.importe;
  GI("txtMoneda").value = pkInfo.moneda;
  SA(GI("txtTipoCambio"),"required","true");
  muestraObjs("dvTipoCambio,dv1,dv2,dv3,txtImporteOrigen,txtMoneda,txtTipoCambio,txtImporteNacional,cmdContabilizar");
  
}
function verificaTipoCambio(objTipoCambio){
  var importeMonNacional;
  if(eval(objTipoCambio.value) == 0 || objTipoCambio.value == ""){
    Swal.fire('Aviso', 'Introduzca un Tipo de Cambio mayor a 0',  'warning');
    objTipoCambio.focus();
  }else{
    importeMonNacional=eval(objTipoCambio.value) * pkInfo.importe;
    GI("txtImporteNacional").value = importeMonNacional;
    formatImporte(GI("txtImporteNacional"));
  }
}

function contabilizar(){
  if(fvInstruccionesInternetSWIFT.checkForm()){
    showWaitLayer();
    objCharolaContaParam.Folio = pkInfo.folio;
    objCharolaContaParam.TipoInstruccion = pkInfo.tipoInstruccion;
    objCharolaContaParam.MesAbierto = eval(GI("txtMesAbierto").value); //0 cerrado; 1 abierto
    objCharolaContaParam.Usuario = 683;
    objCharolaContaParam.Fideicomiso = pkInfo.fideicomiso;
    objCharolaContaParam.Fecha = GI("txtFechaContable").value;
    objCharolaContaParam.FechaAnt = GI("paramFecha").value;
    objCharolaContaParam.TipoCharola = 1;
    objCharolaContaParam.Paridad = eval(GI("txtTipoCambio").value);
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objCharolaContaParam);
    makeAjaxRequest(url, "HTML", validaResultadoFunCharolaConta, null);
  }
}
function validaResultadoFunCharolaConta(obj, result){
  var resultado = JSON.parse(result)[0];
  if(isDefinedAndNotNull(resultado)){
    switch(resultado){
      case -1:
        Swal.fire('Aviso', 'Ocurrió un error al contabilizar la instrucción de internet',  'warning');
      break;
      case 0:
        Swal.fire('Aviso', 'Contabilidad afectada satisfactoriamente',  'warning');
      break;
      case 1:
        Swal.fire('Aviso', 'La instrucción ya fue procesada',  'warning');
      break;
      case 2:
        Swal.fire('Aviso', 'Contabilidad afectada satisfactoriamente',  'warning');
      break;
      case 3:
        Swal.fire('Aviso', 'No existe el folio en honorarios',  'warning');
      break;
      case 4:
        Swal.fire('Aviso', 'No existe el dato en la clave 30',  'warning');
      break;
      case 5:
        Swal.fire('Aviso', 'No se actualizo el status de la instrucción',  'warning');
      break;
      case 6:
        Swal.fire('Aviso', 'No actualizo correctamente el rubro de liquidación',  'warning');
      break;
      case 7:
        Swal.fire('Aviso', 'No actualizo correctamente el rubro de deposito',  'warning');
      break;
      case 8:
        Swal.fire('Aviso', 'Saldo del Acuerdo de Comité insuficiente',  'warning');
      break;
    }
  }
  consultarX(GI("cmdAceptar"), GI("frmDatosInstrucciones"), false);
  pkInfo = null;
  ocultaObjs("dvTipoCambio,dv1,dv2,dv3,txtImporteOrigen,txtMoneda,txtTipoCambio,txtImporteNacional,cmdContabilizar");
  limpiaTxts("txtImporteOrigen,txtTipoCambio,txtImporteNacional,paramDia,paramMes,paramAno");
  hideWaitLayer();
}