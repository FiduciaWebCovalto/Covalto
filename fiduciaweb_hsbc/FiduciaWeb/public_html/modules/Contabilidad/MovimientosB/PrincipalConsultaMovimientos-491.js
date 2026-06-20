var catMovimien = new Catalogo("mx.com.inscitech.fiducia.domain.Movimien");
var objsNombresNumerosParam;
var btnDetValParam;
var dvFechaParam = JSON.parse("{\"id\":\"ejeFunRegresaFechaAnterior\"}");
var fechaDefault = new Date();
function setFechaCal(){}
function isValidDate(date){ 
  var today = new Date();
  if(date > today)
    return true;
  else
    return false;
}

Calendar.setup({
    inputField     :    "paramFecha1",
    button         :    "paramFecha1",
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

Calendar.setup({
    inputField     :    "paramFecha2",
    button         :    "paramFecha2",
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

function asignaFechaValor(){
  dvFechaParam.Fecha = GI("txtFechaValor").value;
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(dvFechaParam);
  makeAjaxRequest(url, "HTML", asignaEtiquetas, null);
}
function asignaEtiquetas(obj, result){
  var resultado = JSON.parse(result)[0];
  formsLoaded();
}


var dia,mes,ano;

var arrTblMovDat = new Array();
arrTblMovDat[0] = "movDiaMovto,30";
arrTblMovDat[1] = "movMesMovto,32";
arrTblMovDat[2] = "movAnoMovto,32";
//arrTblMovDat[3] = "movHrTransac,28";
//arrTblMovDat[4] = "movMinTransac,34";
arrTblMovDat[3] = "movNumContrato,83";
arrTblMovDat[4] = "movSubContrato,83";
arrTblMovDat[5] = "movFolioOpera,70";
arrTblMovDat[6] = "movNumTransac,70";
arrTblMovDat[7] = "movDescMovto,300";
arrTblMovDat[8] = "movImpMovto,150";
//arrTblMovDat[10] = "movCveTipoMerca,63";
//arrTblMovDat[11] = "movNumInstrume,84";
//arrTblMovDat[12] = "movNumSecEmis,56";
//arrTblMovDat[13] = "movNumTitulos,53";
arrTblMovDat[9] = "movNumUsuario,56";
//arrTblMovDat[15] = "movCveImpreEdo,91";
arrTblMovDat[10] = "movCveEntSal,44";


var arrTblAsiDat = new Array();
arrTblAsiDat[0] = "asiSecAsiento,40";
arrTblAsiDat[1] = "asiNomCta,200";
arrTblAsiDat[2] = "asiNumCtam,50";
arrTblAsiDat[3] = "asiNumScta,40";
arrTblAsiDat[4] = "asiNumSscta,40";
arrTblAsiDat[5] = "asiNumSsscta,50";
arrTblAsiDat[6] = "asiNumSssscta,65";
arrTblAsiDat[7] = "asiNumSsssscta,65";
arrTblAsiDat[8] = "asiNumAux1,50";
arrTblAsiDat[9] = "asiNumAux2,50";
arrTblAsiDat[10] = "asiNumAux3,50";
arrTblAsiDat[11] = "asiCveCarAbo,40";
arrTblAsiDat[12] = "asiImpMovimiento,120";
arrTblAsiDat[13] = "asiDescAsiento,200";

var fncValidaTransferencia = JSON.parse("{\"id\":\"conArcPlaCON\"}");

var fvCat = new FormValidator();
//var strIdPK = "movAnoMovto,movMesMovto,movDiaMovto,movNumContrato,movSubContrato,movFolioOpera,movNumModulo,movNumTransac";
var strIdPK = "movFolioOpera";
var arrIdPK = strIdPK.split(",");
var modo = 0;
pkInfo = null;
fvCat.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function clickTabla(pk){
  pkInfo = pk;
  cloneObject(pk,catMovimien.getCatalogo());
}

function limpiar(objForma){
  RF(objForma);
  catMovimien = new Catalogo("mx.com.inscitech.fiducia.domain.Movimien");
}

function cambiaStatus(objCheck, objStatus){
  if(objCheck.checked)
    objStatus.value = "CANCELADO";
  else
    objStatus.value = "ACTIVO";
}

function cargaPrincipalConsultarConsultaMovimientos(){
  if(isDefinedAndNotNull(pkInfo)){
    //showWaitLayer();
    var urlCliente = "modules/Contabilidad/Movimientos/PrincipalConsultarConsultaMovimientos.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaConsultarConsultaMovimientos, null);
    loadDynamicJS(ctxRoot + "/modules/Contabilidad/Movimientos/PrincipalDetalleOperacionConsultarConsultaMovimientos.js");
    loadDynamicJS(ctxRoot + "/modules/Contabilidad/Movimientos/PrincipalDetalleValoresConsultarConsultaMovimientos.js");
  }
}

function despliegaPantallaConsultarConsultaMovimientos(obj, result){
  GI("dvPantalla").innerHTML = result;
  
  //GI("dvContenido").innerHTML = result;
  if(isDefinedAndNotNull(pkInfo)){
    catMovimien.setOnUpdate(cargaComplemento);
    catMovimien.buscaCatalogoPK(false);
    
    cargaFecLiq(pkInfo.movFolioOpera);// Fecha Liquidación
  }else{
    formsLoaded();
  }
  deshabilitaObjetos(GI("frmConsultarMovimientos"));
}

function cargaComplemento(){
  GI("paramFolio").value = pkInfo.movFolioOpera;// catMovimien.getCatalogo().movFolioOpera;
  //alert(GI("paramFolio").value)
  var objTemp = GI("movNumOperacion");
  SA(objTemp, "ref", "conNomFidNumOpeNomOpeNomTraNumGui");
  SA(objTemp, "fun", "asignaValores");
  SA(objTemp, "param", "objsNombresNumerosParam");
  objsNombresNumerosParam = JSON.parse("{" + generaParametros("Fideicomiso,Folio","movNumContrato,movFolioOpera") + "}");
  loadElement(objTemp);
  var objTemp = GI("movFolioOpera");
  SA(objTemp,"ref","conPriAsi");
  SA(objTemp,"fun","loadTableElementSpecial");
  SA(objTemp,"tabla","tblRegPriAsi");
  consultar(objTemp, GI("frmConsultarMovimientos"), false);
  var objTemp2 = GI("cmdDetalleValores");
  SA(objTemp2, "ref", "verExiDetVal");
  SA(objTemp2, "fun", "deshabilitaBoton");
  SA(objTemp2, "param", "btnDetValParam");
  btnDetValParam = JSON.parse("{" + generaParametros("Folio","movFolioOpera") + "}");
  loadElement(objTemp2);
  catOperacio.setOnUpdate(avisoOperacionCatalogo);
}
function asignaValores(obj, result){
  var objeto = JSON.parse(result)[0];
  if(isDefinedAndNotNull(objeto)){
    obj.value = objeto.numOperacion;
    GI("movNomContrato").value = objeto.nomContrato;
    GI("movNomOperacion").value = objeto.nomOperacion;
    GI("movNomTransaccion").value = objeto.nomTransac;
    GI("movNumGuia").value = objeto.numGuiaCont;
  }
  hideWaitLayer();
}

function deshabilitaBoton(obj, result){
  var objeto = JSON.parse(result)[0];
  if(isDefinedAndNotNull(objeto)){
    if(objeto.existeRegistro == 0)
      obj.disabled = true;
  }
}


function cargaPrincipalConsultaMovimientos(){
  //showWaitLayer();
  dia = GI("movDiaMovto").value;
  mes = GI("movMesMovto").value;
  ano = GI("movAnoMovto").value;
  var urlCliente = "modules/Contabilidad/Movimientos/PrincipalConsultaMovimientos.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipalConsultaMovimientos, null);
}

function despliegaPantallaPrincipalConsultaMovimientos(obj, result){
  GI("dvPantalla").innerHTML = result;
  
  //GI("dvContenido").innerHTML = result;
  pkInfo = null;
  if(isDefinedAndNotNull(objParameters)){
    setParameters(objParameters);
    GI("paramDia").value = dia;
    GI("paramMes").value = mes;
    GI("paramAno").value = ano;
    GI(objButtonConsultar).click();
  }
  formsLoaded();
}

function porFolio(objeto)
{
  if(objeto.value!=" "&&objeto.value!="")
  {  
      GI("paramDia").value="";
      GI("paramMes").value="";  
  }
  }
  
  // Fecha Liquición Movientos
  
  function cargaFecLiq(folio)
  {
   var surl = "\"id\":\"qryMovtoFecLiq\",";
   surl += "\"folio\":"+folio+",";
   surl += "\"order\":\"s\"";
   var url = ctxRoot+"/getRef.do?json={"+surl+"}";
   
   //showWaitLayer();
   makeAjaxRequest(url,"HTML",cargaFecLiqResp,null);
  }
  
  function cargaFecLiqResp(obj,result)
  {
   var res = JSON.parse(result)[0];
   GI("movFeqLiq").value= res.fecliq;
   hideWaitLayer();
  }
  
  /*GENERACION DE ARCHIVOS*/
  
  function recuperaTAS() {
    showWaitLayer();
    //console.log('recuperaTAS');
    date = GI("paramFecha").value;
    var objCargaMasivaParam = JSON.parse("{\"id\":\"recuperaMovtos\"}");
    objCargaMasivaParam.FECHA = date;
    objCargaMasivaParam.FIDEICOMISO=GI("paramFideicomiso").value;
    objCargaMasivaParam.DIA=GI("paramDia").value;
    objCargaMasivaParam.MES=GI("paramMes").value;
    objCargaMasivaParam.ANIO=GI("paramAno").value;
    
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objCargaMasivaParam);
    makeAjaxRequest(url, "HTML", recuperaTASRes, null);
}

function recuperaTASRes(obj, result) {
    //console.log('recuperaTASRes');  
    //console.log(result);
    var res = JSON.parse(result);
  
    if(isDefinedAndNotNull(res)) {
        if(res.mensaje == 0) {
//            console.log("Archivo Recuperado");
            //genera archivo nuevo
            validaStoreInterfase();
        } else {
            hideWaitLayer();
        }
    } else {
        hideWaitLayer();
    }
}

function validaStoreInterfase(obj, result) { 
    //console.log('validaStoreInterfase');  
    Swal.fire('Aviso', 'Operación exitosa',  'warning');
    //hideWaitLayer();
    //consultaControl3();
    date = GI("paramFecha").value;
    var fechaEnPartes = date.split('/');
    fncValidaTransferencia.tipoId = 1;
    fncValidaTransferencia.colData = "arpcDescripcion";
    fncValidaTransferencia.fileName = "Movimientos_FISO"+GI("paramFideicomiso").value+"_"+GI("paramDia").value+"/"+GI("paramMes").value+"/"+GI("paramAno").value;
    fncValidaTransferencia.order = "arpcDescripcion";
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(fncValidaTransferencia);
    makeAjaxRequest(url, "HTML", sugerirNombreArchivo, null);
} 

function sugerirNombreArchivo(obj, result) {
    //console.log('sugerirNombreArchivo');
    delete fncValidaTransferencia.id;
    date = GI("paramFecha").value;
    var fechaEnPartes = date.split('/');
    fncValidaTransferencia.queryId = "conArcPlaCON";
    fncValidaTransferencia.Fecha = GI("paramFecha").value;
    fncValidaTransferencia.fileName = "Movimientos_FISO"+GI("paramFideicomiso").value+"_"+GI("paramDia").value+"/"+GI("paramMes").value+"/"+GI("paramAno").value;
    fncValidaTransferencia.order = "arpcDescripcion";
    var url = ctxRoot + "/generarArchivoInterfase.do?json=" + encodeURIComponent(JSON.stringify(fncValidaTransferencia));
    var liga = GI("ligaArchivo");
    liga.href = url;
    liga.click();
    hideWaitLayer();
    Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
}

function doDownload() {

    var tablaConsulta = GI('tblRegPriMov');
    var rows = tablaConsulta.getElementsByTagName("tr");

    if(rows.length <= 0) {
        Swal.fire('Aviso', 'No se encontraron registros!',  'warning');        
    } else {
        var datosConsulta = getParameters(GI('frmDatos'));
        datosConsulta.id = "conPriMov";
        var jsonParam = JSON.stringify(datosConsulta);
        GI('jsonExport').value = jsonParam;
        GI('frmExport').submit();
    }
}

var cmbNivelParam = JSON.parse("{}");
function principalAceptar() {    showWaitLayer();
    
    cmbNivelParam = JSON.parse("{\"id\":\"conPriMov\"}");
    eval("cmbNivelParam.Fideicomiso = '" + GI("paramFideicomiso").value +"'");
    eval("cmbNivelParam.StatusCancelado = '" + GI("paramSubcontrato").value + "'");
    eval("cmbNivelParam.Folio = '" + GI("paramFolio").value + "'");
    eval("cmbNivelParam.Fecha1 = '" + GI("paramFecha1").value +"'");
    eval("cmbNivelParam.Fecha2 = '" + GI("paramFecha2").value +"'");
//    eval("cmbNivelParam.Status = '" + GI("paramStatus").value + "'");
    eval("cmbNivelParam.Descripcion = '" + GI("paramDescripcion").value + "'");
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(cmbNivelParam);
    //alert(url)
    makeAjaxRequest(url, "HTML", resultadoConsulta, GI("tblRegPriMov"));
}

function resultadoConsulta(objTabla, result) {
  var resultado = JSON.parse(result);
  if(isDefinedAndNotNull(resultado) && resultado.length>0)
    loadTableElement(objTabla, result);
  else
    Swal.fire('Aviso', 'No existen Registros para estos criterios de búsqueda',  'warning');
  
  hideWaitLayer();
}


