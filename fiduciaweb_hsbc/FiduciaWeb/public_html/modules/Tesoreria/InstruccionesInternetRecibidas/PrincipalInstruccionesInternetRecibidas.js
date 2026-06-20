showWaitLayer();
initForms();

var arrTblInsIntRecDat = new Array();
var fechaDefault = new Date();
var objCharolaContaParam = JSON.parse("{\"id\":\"ejeFunCharolaConta\"}");
var fvFichaUnica = new FormValidator();
var existeError = false;
var registros = 0;

fvFichaUnica.setup({
  formName      : "frmDatos2",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});
arrTblInsIntRecDat[0] = "imagen,35";
arrTblInsIntRecDat[1] = "rubro,43";
arrTblInsIntRecDat[2] = "folio,62";
arrTblInsIntRecDat[3] = "horaMin,40";
arrTblInsIntRecDat[4] = "fideicomiso,79";
arrTblInsIntRecDat[5] = "tipoInstruccion,150";
arrTblInsIntRecDat[6] = "importe,67";
//arrTblInsIntRecDat[7] = "concepto,150";
arrTblInsIntRecDat[7] = "ctoinver,113";
arrTblInsIntRecDat[8] = "cuentaArea,103";
arrTblInsIntRecDat[9] = "fecha,82";

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
function setCalendar(){
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
}
function consultarTablas(btn, frm, reqParam){
  borraTabla(GI("tblRegPriInsIntDepRec"));
  borraTabla(GI("tblRegPriInsIntLiqRec"));
  borraTabla(GI("tblRegPriInsAcePro"));  
  GI("paramDia").value = GI("paramFecha").value.split("/")[0];
  GI("paramMes").value = GI("paramFecha").value.split("/")[1];
  GI("paramAno").value = GI("paramFecha").value.split("/")[2];
  
  //consultar(btn, frm, reqParam);
  SA(btn,"ref","conPriInsIntLiqRec");  
  SA(btn,"tabla","tblRegPriInsIntLiqRec");  
  SA(btn,"fun","addTableElement");
  consultar(btn, frm, reqParam);    
  SA(btn,"ref","conPriInsIntDepRec");
  SA(btn,"tabla","tblRegPriInsIntDepRec");
  SA(btn,"fun","addTableElement");
  consultar(btn, frm, reqParam);
  SA(btn,"fun","addTableElement");
  SA(btn,"ref","conPriInsIntHonRec");
  consultar(btn, frm, reqParam);

}

function moveTableRow(objImagen){
  var objTblSource = GI(GA(objImagen,"tblSource"));
  var objTblDestination = GI(GA(objImagen,"tblDestination"));
  var row = objImagen.parentElement.parentElement;
  var tbodySource = objImagen.parentElement.parentElement.parentElement;
  var tbodyDestination = objTblDestination.lastChild;
  if(objImagen.src.indexOf("flecha_abajo") != -1)
    objImagen.src = "imagenes/flecha_arriba.gif";
  else
    objImagen.src = "imagenes/flecha_abajo.gif";  
  objImagen.tblSource = objTblDestination.id;
  objImagen.tblDestination = objTblSource.id;
  tbodyDestination.appendChild(row);
}

function contabilizar(){
  var tbody = GI("tblRegPriInsAcePro").lastChild;
  while(tbody.hasChildNodes()){
    showWaitLayer();
    pkInfo = JSON.parse("{" + tbody.lastChild.valorItem + "}");
    tbody.removeChild(tbody.lastChild);
    if(isDefinedAndNotNull(pkInfo)){
      showWaitLayer();
      objCharolaContaParam.Folio = pkInfo.folio;
      objCharolaContaParam.TipoInstruccion = pkInfo.tipoInstruccion;
      objCharolaContaParam.MesAbierto = eval(GI("txtMesAbierto").value); //0 cerrado; 1 abierto
      objCharolaContaParam.Usuario = userInfo.userId;
      objCharolaContaParam.Fideicomiso = pkInfo.fideicomiso;
      objCharolaContaParam.Fecha = GI("txtFechaContable").value;
      objCharolaContaParam.FechaAnt = GI("paramFecha").value;
      objCharolaContaParam.TipoCharola = 1;
      objCharolaContaParam.Paridad = 0;
      var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objCharolaContaParam);
      makeAjaxRequest(url, "HTML", validaResultadoFunCharolaConta, tbody);
    }
    if(!tbody.hasChildNodes() && registros > 1){
      if(existeError)
        Swal.fire('Aviso', 'Contabilidad afectada satisfactoriamente pero con errores, favor de verificar!',  'warning');
      else
        Swal.fire('Aviso', 'Contabilidad afectada satisfactoriamente!',  'warning');
      consultarTablas(GI("cmdAceptar"), GI("frmDatosInstrucciones"), false);
    }
    hideWaitLayer();
  }
}

try{
function validaResultadoFunCharolaConta(obj, result){
  var resultado = JSON.parse(result)[0];
  registros++;
  if(isDefinedAndNotNull(resultado))
    if(resultado != 0)
      existeError = true;
  pkInfo = null;
  if(!obj.hasChildNodes() && registros == 1){
    if(existeError)
      Swal.fire('Aviso', 'Contabilidad afectada satisfactoriamente pero con errores, favor de verificar!',  'warning');
    else
      Swal.fire('Aviso', 'Contabilidad afectada satisfactoriamente!',  'warning');
    consultarTablas(GI("cmdAceptar"), GI("frmDatosInstrucciones"), false);
  }
  hideWaitLayer();
}
}catch(e){alert(e.message);}
/*
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
        Swal.fire('Aviso', 'Ocurrio un error al grabar la Contabilidad o grabar en Honorarios',  'warning');
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
    }
  }else
    Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
  pkInfo = null;
  if(!obj.hasChildNodes()){
    showWaitLayer();
    consultarTablas(GI("cmdAceptar"), GI("frmDatosInstrucciones"), false);
    hideWaitlayer();
  }
  hideWaitLayer();
}
*/
function cargaPrincicalFichaUnicaInstruccionesInternetRecibidas(Modo){
  showWaitLayer();
  var urlCliente = "modules/Tesoreria/InstruccionesInternetRecibidas/PrincipalFichaUnicaInstruccionesInternetRecibidas.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincicalFichaUnicaInstruccionesInternetRecibidas, GI("paramFecha"));
}

function despliegaPantallaPrincicalFichaUnicaInstruccionesInternetRecibidas(obj, result) {
  GI("dvPantalla").innerHTML = result;
  GI("paramFecha").value = obj.value;
  setCalendar();
  hideWaitLayer();
}

function estableceRequiredObjs(strIdRadioMaster,objRadio){
  asignaValueRadio2Master(strIdRadioMaster,objRadio);
  switch(objRadio.id){
    case "paramTipoFicha":
      deshabilitaPK("paramFolio".split(","));
      RA(GI("paramFolio"),"required");
      limpiaTxts("paramFolio");
      habilitaPK("paramStatus,paramFecha".split(","));
      SA(GI("paramStatus"),"required","true");
      SA(GI("paramFecha"),"required","true");
    break;
    case "TipoFichaEspecifica":
      deshabilitaPK("paramStatus,paramFecha".split(","));
      RA(GI("paramStatus"),"required");
      RA(GI("paramFecha"),"required");
      limpiaCombos("paramStatus");
      limpiaTxts("paramFecha");
      habilitaPK("paramFolio".split(","));
      SA(GI("paramFolio"),"required","true");
    break;
  }
}

function ejecutaFichaUnica(){
  if(fvFichaUnica.checkForm()){
    showWaitLayer();
    var parametros = getParameters(GI("frmDatos2"));
    parametros.id = GI("refSP").value;
    parametros.FOSEG = GI("paramFOSEG").value;
    delete parametros.RepInfoRavTipoAviso;
    var url = ctxRoot + "/execRefReporte.do?json=" + JSON.stringify(parametros);
    makeAjaxRequest(url, "HTML", validaFichaUnica, parametros);
  }
}

function validaFichaUnica(obj, result) {
  // TODO: Dejar el mensaje de espera hasta que se despliegue el guardar como
  var objResultado = JSON.parse(result);
  if(isDefinedAndNotNull(objResultado)){
    switch(objResultado.resultado){
      case 0:
        obj = new Object();
        obj.id = GI("paramFOSEG").checked?GI("refQry").value + "FOSEG":GI("refQry").value;
        obj.template = GI("paramFOSEG").checked?GI("template").value + "FichaUnicaFOSEG.xsl":GI("template").value+"FichaUnica.xsl";
        obj.nombreReporte = GI("paramFOSEG").checked?GI("nombreReporte").value + " FOSEG":GI("nombreReporte").value;
        obj.RepInfoRavTipoAviso = GI("paramFOSEG").checked?GI("paramRepInfoRavTipoAviso").value + " FOSEG":GI("paramRepInfoRavTipoAviso").value;
        var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(obj);
        var link = GI("linkReporte");
        link.href=url;
        link.click();
      break;
      case 1: Swal.fire('Aviso', 'El Status es parametro requerido, favor introducirlo!',  'warning'); break;
      case 2: Swal.fire('Aviso', 'El Folio es parametro requerido, favor introducirlo!',  'warning'); break;
      case 3: Swal.fire('Aviso', 'No existe ninguna Instruccion con el Folio introducido!',  'warning'); break;
      case 4: Swal.fire('Aviso', 'Ocurrio un error al procesar la Ficha Unica!',  'warning'); break;
      default:
        Swal.fire('Aviso', 'Ocurrió un error inesperado (Oracle)',  'warning');
    }
    hideWaitLayer();
  }else{
    Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');  
    hideWaitLayer();
  }
}

function agregarTodoElContenido(btn, frm, reqParam){
  borraTabla(GI("tblRegPriInsIntDepRec"));
  borraTabla(GI("tblRegPriInsIntLiqRec"));
  borraTabla(GI("tblRegPriInsAcePro"));  
  
  GI("paramDia").value = GI("paramFecha").value.split("/")[0];
  GI("paramMes").value = GI("paramFecha").value.split("/")[1];
  GI("paramAno").value = GI("paramFecha").value.split("/")[2];
  //consultar(btn, frm, reqParam);
  SA(btn,"fun","addTableElement");     
  SA(btn,"ref","conPriInsIntLiqRecAcep");
  consultar(btn, frm, reqParam);  
  SA(btn,"fun","addTableElement");  
  SA(btn,"ref","conPriInsIntDepRecAcep");
  consultar(btn, frm, reqParam);   
  SA(btn,"fun","addTableElement");  
  SA(btn,"ref","conPriInsIntHonRecAcep");
  consultar(btn, frm, reqParam);     

}