showWaitLayer();

var clavesCombo31  = JSON.parse("{\"llaveClave\":31,\"orderDescripcion\":\"s\"}");
var clavesCombo702  = JSON.parse("{\"llaveClave\":702,\"orderDescripcion\":\"s\"}");

var cat = new Catalogo("mx.com.inscitech.fiducia.domain.FActividadesRelevantes");
var fvCat = new FormValidator();
var strIdPK = "farIdContrato,farIdTipoOperacion";
var arrIdPK = strIdPK.split(",");
var modo = 0;
pkInfo = null;

var objCmbOrigenGlobal = null;

var arrTblDat = new Array();
arrTblDat[0] = "farIdContrato,80px";
arrTblDat[1] = "farCveTipoOperacion,200px";
arrTblDat[2] = "farValidaDeposito,80px";
arrTblDat[3] = "farValidaRetiro,80px";
arrTblDat[4] = "farValidaDepositoEftvo,80px";
arrTblDat[5] = "farCveStActividad,150px";

fvCat.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});


initForms();

function clickTabla(pk)
{
  cloneObject(pk,cat.getCatalogo());
  pkInfo = pk;
}

function limpiar(objForma)
{
  regresar();
}

// mantenimiento prodesta -----------------

function cargaMantenimientoActividadesRelevantes(Modo){
  modo = Modo;
  if((isDefinedAndNotNull(pkInfo) || Modo == OPER_ALTA) && Modo != OPER_BAJA){
    showWaitLayer();
    var urlCliente = "modules/Otros/ActividadesRelevantes/MantenimientoActividadesRelevantes.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoActividadesRelevantes, null);
  }else if(isDefinedAndNotNull(pkInfo) && Modo == OPER_BAJA)
  {
    ejecutaOperacion();
  }
}
function despliegaPantallaMantenimientoActividadesRelevantes(obj, result) {
  GI("dvPantalla").innerHTML = result;
  
  initForms(); 
  if(modo == OPER_CONSULTAR || modo == OPER_MODIFICAR)
  {
    deshabilitaPK(arrIdPK);
    if(modo == OPER_CONSULTAR){
      deshabilitaObjetos(GI("frmDatos"));
      GI("cmdCancelar").value = "Regresar";
      muestraObj("cmdCancelar");
    }
    else
    {
      muestraObjs("cmdAceptar,cmdCancelar");
    }
  }else if(modo == OPER_ALTA )
    muestraObjs("cmdAceptar,cmdCancelar");
    
  deshabilitaCampos("txtMoneda"); // deshabilita campo moneda
}


function ejecutaOperacion()
{
  if(modo == OPER_ALTA)
  {
    if(fvCat.checkForm()){
      showWaitLayer();
      cat.setOnUpdate(validaAvisoOperacionCatalogo);
      cat.altaCatalogo();  
    }
  }else if(modo == OPER_MODIFICAR){
    if(fvCat.checkForm()){
      cat.setOnUpdate(validaAvisoOperacionCatalogo);
      showWaitLayer();
      cat.modificaCatalogo();
    }
  }else if(modo == OPER_BAJA){
    showWaitLayer();
    cat.setOnUpdate(validaAvisoOperacionCatalogo);
    cat.bajaCatalogo(false);
    
  }
}


function asignaValues2ObjHTML(){
  if(once)
  {
   once = false;
     if(isDefinedAndNotNull(pkInfo) && modo != OPER_ALTA)
     {
       cat.setOnUpdate(catLoaded);
       cat.buscaCatalogoPK(false);
     }else{
       formsLoaded();
     }
   }
}

//-----------------------------------------
var once=true;


function catLoaded() 
{
   obtenerMonedaFiso(GI('farIdContrato'));// moneda fideicomiso

   hideWaitLayer();
}


function validaAvisoOperacionCatalogo()
{
  Swal.fire('¡Éxito!', "Operación realizada exitosamente", 'success');
  regresar();
  hideWaitLayer();
}  
  
function regresar()
{
  onButtonClickPestania("Otros.ActividadesRelevantes.PrincipalActividadesRelevantes","");
}




/*--FIDEICOMISO--*/

function verificacionActivo(txtFiso) 
{
  if(txtFiso.value != "") 
  {
    var validacionAlta2 = JSON.parse("{\"id\":\"verificaSeaActivo\",\"numContrato\":" + txtFiso.value + "}");
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta2);
    makeAjaxRequest(url, "HTML", funcionVerificacionActivo, txtFiso);
  }else
    asignaEtiqueta("nomFideicomiso","");
    
  obtenerMonedaFiso(txtFiso);// moneda fideicomiso
}

function funcionVerificacionActivo(txtFiso,result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoCveStContrat != 0)
  {
    Swal.fire('Aviso', 'El Fideicomiso no está ACTIVO',  'warning');
    txtFiso.value="";
    asignaEtiqueta("nomFideicomiso","");
  }
  else
    consultaNombreFideicomiso("nomFideicomiso",txtFiso);
}

/*---------------*/


// moneda fideicomiso

function obtenerMonedaFiso(txtFiso)
{
  if(txtFiso.value==""){  return; }
    
  var objConsultaMoneda = JSON.parse("{}");
  objConsultaMoneda.id = "muestraMonedaAnteproyecto";
  objConsultaMoneda.numFiso = txtFiso.value;
  
  var url = ctxRoot+"/getRef.do?json="+JSON.stringify(objConsultaMoneda);
  
  makeAjaxRequest(url,"html",obtenerMonedaFisoRes,GI('txtMoneda'));
  
}

function obtenerMonedaFisoRes(obj,result)
{
  var res = JSON.parse(result);

  if(res)
  {
    obj.value = res[0].antMoneda;
  }
  else
  {
    obj.value = "MONEDA NACIONAL";
  }
}