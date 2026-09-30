showWaitLayer();

var catCedrefis = new Catalogo("mx.com.inscitech.fiducia.domain.Cedrefis");
var catTratFid = new Catalogo("mx.com.inscitech.fiducia.domain.TratFid");
var catOblFid = new Catalogo("mx.com.inscitech.fiducia.domain.OblFid");
var cmbObligacionesFiscalesParam = JSON.parse("{\"chido\":140}");
var cmbParticipacionParam = JSON.parse("{\"chido\":141}");
var cmbStatusParam = JSON.parse("{\"chido\":31}");
var divNombreFideicomisoParam;
var trfCveTratfisc;
initForms();

var arrTblCedFisDat = new Array();
arrTblCedFisDat[0] = "crfNumFideicom,100";
arrTblCedFisDat[1] = "crfObligadFisc,130";
arrTblCedFisDat[2] = "crfPartfisc,150";
arrTblCedFisDat[3] = "crfRfc,120";
arrTblCedFisDat[4] = "crfTitular,570";
arrTblCedFisDat[5] = "crfIsrRendim,100";

var fvCatCedrefis = new FormValidator();
var strIdPK = "crfNumFideicom,trfCveTratfisc";
var arrIdPK = strIdPK.split(",");
var modo = 0;
pkInfo = null;

fvCatCedrefis.setup({
  formName      : "frmMantenimientoCedulaFiscal",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function clickTabla(pk){
  trfCveTratfisc = pk.trfCveTratfisc;
  delete pk.trfCveTratfisc;
  pkInfo = pk;
  cloneObject(pk,catCedrefis.getCatalogo());
}

function limpiar(objForma){
  RF(objForma);
  catCedrefis = new Catalogo("mx.com.inscitech.fiducia.domain.Cedrefis");
  pkInfo = null;
}

function cargaMantenimientoCedulaFiscal(Modo){
  modo = Modo;
  if((isDefinedAndNotNull(pkInfo) || Modo == OPER_ALTA) && Modo != OPER_BAJA){
    showWaitLayer();
    var urlCliente = "modules/Contabilidad/CedulaFiscal/MantenimientoCedulaFiscalRegimenFiscal.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoCedulaFiscal, null);
  }else if(isDefinedAndNotNull(pkInfo) && Modo == OPER_BAJA){
    ejecutaOperacionCedulaFiscal();
  }
}

function despliegaPantallaMantenimientoCedulaFiscal(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  ocultaObj("cmdObligaciones");
    ocultaObj("cmdDocumentos");
    ocultaObj("cmdCedula");

  if(modo == OPER_CONSULTAR || modo == OPER_MODIFICAR){
    deshabilitaPK(arrIdPK);
    if(modo == OPER_CONSULTAR){
      deshabilitaObjetos(GI("frmMantenimientoCedulaFiscal"));
      GI("cmdCancelar").value = "Regresar";
      muestraObjs("cmdCancelar,cmdObligaciones,cmdDocumentos,cmdCedula");
    }
  }
  if(modo == OPER_ALTA || modo == OPER_MODIFICAR)
    muestraObjs("cmdAceptar,cmdCancelar");
}

function asignaValues2ObjHTML(){
  if(isDefinedAndNotNull(pkInfo) && modo != OPER_ALTA){
    catCedrefis.setOnUpdate(cargaComplemento);
    catCedrefis.buscaCatalogoPK(false);
    GI("trfCveTratfisc").value = trfCveTratfisc;
  }else
    formsLoaded();
}
function cargaComplemento(){
  consultaNombreFideicomiso("nomFideicomiso",GI("crfNumFideicom"));
  formsLoaded();
}
function ejecutaOperacionCedulaFiscal(){
  if(modo == OPER_ALTA){
    if(fvCatCedrefis.checkForm()){
      showWaitLayer();
      verificaCedulaFiscal();
    }
  }else if(modo == OPER_MODIFICAR){
    if(fvCatCedrefis.checkForm()){
      showWaitLayer();
      catCedrefis.setOnUpdate(avisoOperacionCatalogo);
      catCedrefis.modificaCatalogo();
      onButtonClickPestania("Contabilidad.CedulaFiscal.PrincipalCedulaFiscalRegimenFiscal","");
      hideWaitLayer();
    }
  }else if(modo == OPER_BAJA){
    showWaitLayer();
    catTratFid.getCatalogo().crfNumFideicom = catCedrefis.getCatalogo().crfNumFideicom;
    catTratFid.getCatalogo().trfCveTratfisc = trfCveTratfisc;
    catTratFid.setOnUpdate(bajaObligaciones);
    catTratFid.bajaCatalogo(false);
  }
}
function altaComplemento(){
  catCedrefis.setOnUpdate(avisoOperacionCatalogo);
  catTratFid.setOnUpdate(avisoOperacionCatalogo);
  catTratFid.altaCatalogo();
  onButtonClickPestania("Contabilidad.CedulaFiscal.PrincipalCedulaFiscalRegimenFiscal","");
  hideWaitLayer();
}
function bajaObligaciones(){
  var fideicomiso = catCedrefis.getCatalogo().crfNumFideicom;
  var url = ctxRoot + "/doRef.do?json={\"id\":\"delOblFid\",\"Fideicomiso\":" + fideicomiso + "}";
  makeAjaxRequest(url, "HTML", bajaCedulaFiscal, null);
}

function bajaCedulaFiscal(obj, result){
  catCedrefis.setOnUpdate(avisoOperacionCatalogo);
  catCedrefis.bajaCatalogo(false);
  onButtonClickPestania("Contabilidad.CedulaFiscal.PrincipalCedulaFiscalRegimenFiscal","");
  hideWaitLayer();
}
function cargaPrincipalCedulaFiscalRegimenFiscal(){
  showWaitLayer();
  loadDynamicJS(ctxRoot + "/modules/Contabilidad/CedulaFiscal/PrincipalObligacionesCedulaFiscalRegimenFiscal.js");
  var urlCliente = "modules/Contabilidad/CedulaFiscal/PrincipalObligacionesCedulaFiscalRegimenFiscal.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipalObligacionesCedulaFiscalRegimenFiscal, null);
}
function cargaPrincipalCedulaFiscalRegimenFiscal2(){
  showWaitLayer();
  loadDynamicJS(ctxRoot + "/modules/Contabilidad/CedulaFiscal/PrincipalDocumentosCedulaFiscalRegimenFiscal.js");
  var urlCliente = "modules/Contabilidad/CedulaFiscal/PrincipalDocumentosCedulaFiscalRegimenFiscal.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipalDocumentosCedulaFiscalRegimenFiscal, null);
}

function despliegaPantallaPrincipalObligacionesCedulaFiscalRegimenFiscal(obj, result) {
  GI("dvPantalla").innerHTML = result;
  deshabilitaPK("crfNumFideicom".split(","));
  catCedrefis.setOnUpdate(cargaComplemento2);
  catCedrefis.buscaCatalogoPK(false);
}
function cargaComplemento2(){
  GI("paramFideicomiso").value = GI("crfNumFideicom").value;
  consultaNombreFideicomiso("nomFideicomiso",GI("crfNumFideicom"));
  consultar(GI("paramorder"), frmDatosObligacionesFiscales, false);
  consultar(GI("crfNumFideicom"), frmDatosObligacionesFiscales, false);
  //alert(GI("paramFideicomiso").value);
  formsLoaded();
}

function despliegaPantallaPrincipalDocumentosCedulaFiscalRegimenFiscal(obj, result) {
  GI("dvPantalla").innerHTML = result;
  deshabilitaPK("crfNumFideicom".split(","));
  catCedrefis.setOnUpdate(cargaComplemento22);
  catCedrefis.buscaCatalogoPK(false);
}
function cargaComplemento22(){
  GI("paramFideicomiso").value = GI("crfNumFideicom").value;
  consultaNombreFideicomiso("nomFideicomiso",GI("crfNumFideicom"));
  consultar(GI("paramorder"), frmDatosObligacionesFiscales, false);
  consultar(GI("crfNumFideicom"), frmDatosObligacionesFiscales, false);
  //alert(GI("paramFideicomiso").value);
  formsLoaded();
}
function verificaCedulaFiscal(){
  var fideicomiso = GI("crfNumFideicom").value;
  var url = ctxRoot + "/getRef.do?json={\"id\":\"verExiCedFis\",\"Fideicomiso\":" + fideicomiso + "}";
  makeAjaxRequest(url, "HTML", validaCedulaFiscal, null);
}

function validaCedulaFiscal(obj, result){
  var objValida = JSON.parse(result)[0];
  if(objValida.existeRegistro != 0){
    Swal.fire('Aviso', 'El Fideicomiso ya cuenta con Cédula Fiscal',  'warning');
  }else{
    catCedrefis.setOnUpdate(altaComplemento);
    catCedrefis.altaCatalogo();
  }
  hideWaitLayer();
}
function generaFichaSP(){
    if(GI("crfNumFideicom").value !="")
    {
        if(confirm("¿Esta seguro que desea aplicar?")){
            var parametrosUrl = {
                id : 'storeGenCeduAnFis', 
                numfideico:GI("crfNumFideicom").value
            }
            var url = ctxRoot + '/executeRef.do?json=' + JSON.stringify(parametrosUrl);
            //alert(url)
            makeAjaxRequest(url, "HTML", ObtenReporte, null);
        }
    }
    else
        Swal.fire('Aviso', 'Favor de introducir Numero de Fideicomiso.',  'warning');
}
//storeGenFichaROP
//-------------------------------------------------codigo para nuevos reportes

function ObtenReporte(obj,result) {
    
    if( JSON.parse(result).RESULTADO == 0){
    
     var idLink = "linkReporteNew"; 
     var parametrosUrl = new Object;
     parametrosUrl.sendToJSP="true";

     parametrosUrl.urlReporte="/modules/Contabilidad/CedulaAnalisisFiscal/ReporteFichaTecnica.jsp"
     parametrosUrl.id="getRepCedAnfis";
     parametrosUrl.numfideico = GI("crfNumFideicom").value;
     var url = ctxRoot + "/imprimirReporte.do?json=" + encodeURIComponent(JSON.stringify(parametrosUrl));
     console.log('url: ' + url);

     idLink.href=url;
     window.open(url,GI("linkReporteNew").value);        
     //idLink.click();
     document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
    
/*    
        var cadenota='{"Estructura":"1","sendToJSP":"true","urlReporte":"/modules/Administracion/ReglasOperacion/ReporteFichaTecnica.jsp","Order":"s","id":"getRepFReglaOp","numfideico":'+GI("paramNumFiso").value+'+"}';
        var url = ctxRoot + "/imprimirReporte.do?json=" + cadenota;
        var link = GI('linkReporteNew');
        link.href=url;
        link.click();
        document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
        hideWaitLayer();*/
    }
  
}