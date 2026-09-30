showWaitLayer();
var cmbModuloParam = JSON.parse("{\"chido\":65}");
var cmbStatusParam = JSON.parse("{\"chido\":31}");
var cmbTransaccionesParam = JSON.parse("{\"chido\":17}");

initForms();

var arrTblTraDat = new Array();
arrTblTraDat[0] = "fnotSecuencial,100";
arrTblTraDat[1] = "fnotNombre,200";
arrTblTraDat[2] = "fnotCveStNotif,100";
  
var catTransacc = new Catalogo("mx.com.inscitech.fiducia.domain.FNotifica");
var fvCatTransacc = new FormValidator();
var fvMantenimiento = new FormValidator();
var strIdPK = "fnotSecuencial";
var arrIdPK = strIdPK.split(",");
var modo = 0;
pkInfo= null;

fvMantenimiento.setup({
  formName      : "frmDatosTransacciones",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

fvCatTransacc.setup({
  formName      : "frmMantenimientoTransacciones",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function clickTabla(pk) {
  cloneObject(pk,catTransacc.getCatalogo());
  pkInfo = pk;
}

function limpiar(objForma){
  RF(objForma);
  catTransacc = new Catalogo("mx.com.inscitech.fiducia.domain.FNotifica");
  pkInfo= null;
}
function cargaMantenimientoTransacciones(Modo){
  modo = Modo;
  if((isDefinedAndNotNull(pkInfo) || Modo == OPER_ALTA) && Modo != OPER_BAJA){
    showWaitLayer();
    var urlCliente = "modules/Interfases/Transacciones/MantenimientoTransacciones.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoTransacciones, null);
  }else if(isDefinedAndNotNull(pkInfo) && Modo == OPER_BAJA){
    ejecutaOperacionTransaccion();
  }
}

function despliegaPantallaMantenimientoTransacciones(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  if(modo == OPER_CONSULTAR || modo == OPER_MODIFICAR){
    deshabilitaPK(arrIdPK);
    if(modo == OPER_CONSULTAR){
      //deshabilitaObjetos(GI("frmMantenimientoTransacciones"));
      //habilitaObjetos(GI("archivoPDF"));
	  //Swal.fire('Aviso', 'llego aki 1',  'warning')habilitaPK("cveTransacciones,cmbDatoTran".split(","));
      GI("cmdCancelar").value = "Regresar";
      muestraObjs("cmdCancelar,cmdEnviar,trArchivo");
    }
  }
  if(modo == OPER_ALTA || modo == OPER_MODIFICAR)
    muestraObjs("cmdAceptar,cmdCancelar,cmdAgregar,cmdQuitar");
}

function asignaPK2ObjHTML(){
  if(isDefinedAndNotNull(pkInfo) && modo != OPER_ALTA){
    catTransacc.setOnUpdate(cargaComplemento);
    catTransacc.buscaCatalogoPK(false);
  }else{
    formsLoaded();
  }
  eliminaSeleccione(GI("cveTransacciones"));
}
function cargaComplemento(){
  catTransacc.setOnUpdate(avisoOperacionCatalogo);
  //GI("paramGuia").value = GI("trsNumGuiaCont").value;
  cargaComboDatoTran(GI("cmbDatoTran"));
  consultar(GI("cmdAceptar"), GI("frmMantenimientoTransacciones"), false);
  formsLoaded();
}

function eliminaSelDatoTran(){
  eliminaSeleccione(GI("cmbDatoTran"));
  formsLoaded();
}

function eliminaSelMinimoDatoGuia(){
  SA(GI("cmbMinimoDatoGuia"), "next", "validaMinimoDatosGuia");
  eliminaSeleccione(GI("cmbMinimoDatoGuia"));
  var nextElement = GA(GI("cmbMinimoDatoGuia"), "next");
  if(isDefinedAndNotNull(nextElement)) {
    var nextObj = GI(nextElement); 
    if(isDefinedAndNotNull(nextObj)) {
      loadElement(nextObj);
    } else {
      try { eval(nextElement+"()"); } catch(ex) {}
    }
  }
}
function cargaComboDatoTran(objCombo){
  var transaccion = GI("fnotSecuencial").value;
  var url = ctxRoot + "/getRef.do?json={\"id\":\"conDatTraEnvio\",\"transaccion\":" + transaccion + "}";
  SA(objCombo, "next", "eliminaSelDatoTran");
  makeAjaxRequest(url, "HTML", loadComboElement, objCombo);
}

function cargaComboDatosContabilizar(){
  var guia = GI("fnotSecuencial").value;
  if(guia != ""){
    showWaitLayer();
    var objCombo = GI("cmbDatoTran");
    //var url = ctxRoot + "/getRef.do?json={\"id\":\"conAuxs\",\"guia\":" + guia + "}";
	var url = ctxRoot + "/getRef.do?json={\"id\":\"conAuxsEnvio\"}";
	//alert(url)
    SA(objCombo, "next", "cargaComboDatosContabilizarDato");
    makeAjaxRequest(url, "HTML", loadComboElement, objCombo);
  }
}

function cargaComboDatosContabilizarDato(){
  var guia = GI("fnotSecuencial").value;
  var objCombo = GI("cmbDatoTran");
  var url = ctxRoot + "/getRef.do?json={\"id\":\"datoEnvio\"}";
  //alert(url)
  SA(objCombo, "next", "eliminaSelDatoTran");
  makeAjaxRequest(url, "HTML", addComboElement, objCombo);
}
function agregarClave(objComboOrigen, objComboDestino){
  if(objComboOrigen.selectedIndex !=-1){
    var key = GA(objComboDestino, "keyValue");
    var value = GA(objComboDestino, "theValue");
    var llave = objComboOrigen.options[objComboOrigen.selectedIndex].value;
    var texto = objComboOrigen.options[objComboOrigen.selectedIndex].text;
    var result = "[{\"" + key + "\":\"" + llave + "\",\"" + value + "\":\"" + texto + "\"}]";
    var arrValues = JSON.parse(result);
    if(!validaExisteClave(texto,objComboDestino))
      addCombo(objComboDestino, arrValues, key, value);
  }
}

function quitarClave(objCombo){
  if(objCombo.selectedIndex !=-1){
    if(objCombo.selectedIndex == 0 && objCombo.options[objCombo.selectedIndex].value != "0")
      eliminaSeleccione(objCombo);
    else if(objCombo.selectedIndex == objCombo.options.length-1 && objCombo.options[objCombo.selectedIndex].value != "0"){
      objCombo.options.length = objCombo.options.length - 1;
      objCombo.selectedIndex = objCombo.options.length - 1;
    }else{
      if(objCombo.options[objCombo.selectedIndex].value != "0"){
        for(var i = objCombo.selectedIndex; i <= objCombo.options.length - 2; i++){
          objCombo.options[i].value = objCombo.options[i+1].value;
          objCombo.options[i].text = objCombo.options[i+1].text;
        }
        objCombo.options.length = objCombo.options.length - 1;
      }
    }
  }
}

function validaExisteClave(strValor,objCombo){
  for(var i = 0; i < objCombo.options.length; i++){
    if(objCombo.options[i].text == strValor)
      return true;
  }
  return false;
}

function ejecutaOperacionTransaccion(){
  if(modo == OPER_ALTA){
    if(fvCatTransacc.checkForm()){
      verificaTransaccion();
    }
  }else if(modo == OPER_MODIFICAR){
    if(fvCatTransacc.checkForm()){
      showWaitLayer();
      cargaComboMinimoDatosGuia();
    }
  }
  else if(modo == OPER_BAJA){
    verificaTransaccionEmpleadaOperacion();
  }
}

function validaMinimoDatosGuia(){
  var dato = 0;
  objComboBase = GI("cmbMinimoDatoGuia");
  objComboValidar = GI("cmbDatoTran");
  for(var base = 0; base < objComboBase.options.length; base++){
    for(var val = 0; val < objComboValidar.options.length; val++){
      if(objComboBase.options[base].text == objComboValidar.options[val].text){
        dato += 1;
      }
    }
  }
  //alert(dato)
  //alert(objComboBase.options.length)
  //if(dato == objComboBase.options.length){
    catTransacc.setOnUpdate(bajaInsertaDatoTran);
    catTransacc.modificaCatalogo();
  /*}else{
    Swal.fire('Aviso', 'Los datos mínimos de Clave de Notificaciones asignados no son correctos!',  'warning');
    GI("fnotSecuencial").focus();*/
    hideWaitLayer();
  //}
}
function cargaComboMinimoDatosGuia(){
	//alert(GI("fnotSecuencial").value)
  var guia = GI("fnotSecuencial").value;
  var objCombo = GI("cmbMinimoDatoGuia");
  //var url = ctxRoot + "/getRef.do?json={\"id\":\"conAuxsEnvio\",\"guia\":" + guia + "}";
  var url = ctxRoot + "/getRef.do?json={\"id\":\"conAuxsEnvio\"}";
  //alert(url)
  SA(objCombo, "next", "cargaComboMinimoDatosGuiaDato");
  makeAjaxRequest(url, "HTML", loadComboElement, objCombo);
}

function cargaComboMinimoDatosGuiaDato(){
	//alert(GI("fnotSecuencial").value)
  var guia = GI("fnotSecuencial").value;
  var objCombo = GI("cmbMinimoDatoGuia");
  var url = ctxRoot + "/getRef.do?json={\"id\":\"dato\",\"guia\":" + guia + "}";
  //alert(url)
  SA(objCombo, "next", "eliminaSelMinimoDatoGuia");
  makeAjaxRequest(url, "HTML", addComboElement, objCombo);
}

function verificaTransaccion(){
  showWaitLayer();
  var transaccion = GI("fnotSecuencial").value;
  var url = ctxRoot + "/getRef.do?json={\"id\":\"verExiTraEnvio\",\"transaccion\":" + transaccion + "}";
  makeAjaxRequest(url, "HTML", validaAlta, null);
}
function validaAlta(obj, result){
  var objValida = JSON.parse(result)[0];
  if(objValida.existeTransaccion != 0){
    Swal.fire('Aviso', 'La Notificacion ya existe actualmente!',  'warning');
    hideWaitLayer();
  }else{
    catTransacc.setOnUpdate(bajaInsertaDatoTran);
    catTransacc.altaCatalogo();
  }
}
function bajaInsertaDatoTran(){
  bajaDatoTran(insertaDatoTran);
}
function bajaDatoTran(funcionMantenimiento){
    var transaccion = 0;
    if(modo == OPER_BAJA){
      transaccion = pkInfo.fnotSecuencial;
    }else{
      transaccion = GI("fnotSecuencial").value;
    }
    var url = ctxRoot + "/doRef.do?json={\"id\":\"delDatoTranEnvio\",\"transaccion\":" + transaccion +  "}";
	//alert(url)
    makeAjaxRequest(url, "HTML", funcionMantenimiento, null);
}
function insertaDatoTran(obj, result){  
  var objCombo = GI("cmbDatoTran");
  var transaccion = GI("fnotSecuencial").value;
  for(var i = 0; i < objCombo.options.length; i++){
    var dato = objCombo.options[i].text ;
    var parametros = "\"transaccion\":" + transaccion + ",\"dato\":\"" + dato + "\"";
    var url = ctxRoot + "/doRef.do?json={\"id\":\"insDatTranEnvio\","+ parametros + "}";
	//alert(url)
    makeAjaxRequest(url, "HTML", validaInsertaDatoTran, i + " == " + (objCombo.options.length-1));
  }
}
function validaInsertaDatoTran(obj, result){
  if(eval(obj)){
    Swal.fire('¡Éxito!', "Operación realizada exitosamente", 'success');
    onButtonClickPestania('Interfases.Transacciones.PrincipalTransacciones','');
    hideWaitLayer();
  }
}
function verificaTransaccionEmpleadaOperacion(){
  showWaitLayer();
  bajaDatoTran(bajaCatalogo);	
}

function bajaCatalogo(obj, result){
  catTransacc.setOnUpdate(avisoOperacionCatalogo);
  catTransacc.bajaCatalogo(false);
  onButtonClickPestania('Interfases.Transacciones.PrincipalTransacciones','');
  hideWaitLayer();
}

function doEnvioTransaccion() {
  showWaitLayer();
  frmEnvio.onload = function() { return loaded(); };
  frm=GI('frmMantenimientoTransacciones');
  frm.fnotSecuencialHdn.value = GI('fnotSecuencial').value;
  frm.submit(); 
}

function loaded() {
  Swal.fire('Aviso', 'Notificación enviada con éxito!',  'warning');
  hideWaitLayer();
  onButtonClickPestania('Interfases.Transacciones.PrincipalTransacciones','');
}