/*Version Alterna*/
var catSubCuenta = new Catalogo("mx.com.inscitech.fiducia.domain.FSubcuenta");


var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaRegistroSubCuenta\",\"Fideicomiso\":0,\"numSubCuenta\":0}");

initForms();

var tablaDatosSubCuentasData = new Array();
tablaDatosSubCuentasData[0] = "fsctIdFideicomiso,70px";
tablaDatosSubCuentasData[1] = "fsctIdSubCuenta,130px";
tablaDatosSubCuentasData[2] = "fsctNombreSubCuenta,270px";
tablaDatosSubCuentasData[3] = "fsctStatus,90px";

/*tablaDatosSubCuentasData[0] = "fidNumContrato,100px";
tablaDatosSubCuentasData[1] = "fidNomFideicom,300px";
tablaDatosSubCuentasData[2] = "fidCveStFideico,90px";
tablaDatosSubCuentasData[3] = "fidCveStFideico,90px";*/


var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var frmMantenimientoCatalogoSubCuentas = new FormValidator();
var CONSULTAR = 3;

function cargaPrincipalCatalogosGeneralEstructuraGeograficaPaises() {
  onButtonClickPestania("Administracion.AlternaSubCuentas.PrincipalSubCuentas","");
  hideWaitLayer();
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catSubCuenta.getCatalogo());
}

////////////////////////////////////////////////////////////////////
//CARGA LA SEGUNDA PANTALLA (MantenimientoCatalogosGeneralesEstructuraGeograficaPaises)
function cargaMantenimientoSubCuentas(tipoPantalla) {
  if ((tipoPantalla==OPER_MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Administracion/AlternaSubCuentas/MantenimientoSubCuentas.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
  }
}

function despliegaPantalla(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  //Agregando la funcionalidad del required
  frmMantenimientoCatalogoSubCuentas.setup({
    formName      : "frmMantenimientoCatalogoSubCuentas",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
hideWaitLayer();
}

///////////////////////////
function loadCatalogo() {
  catSubCuenta.setOnUpdate(catLoaded);
  if(operacion==OPER_MODIFICAR || operacion==CONSULTAR)
    catSubCuenta.buscaCatalogoPK(false);
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
    formsLoaded();
  }
}

function catLoaded() {
  if(operacion==OPER_MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
    deshabilitaPK("paiNumPais".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmMantenimientoCatalogosGeneralesEstructuraGeograficaPaises"));         //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();
}

function AltaOModificaInfo() {
  catSubCuenta.setOnUpdate(operacionExitosa);
  if(operacion==OPER_ALTA && frmMantenimientoCatalogoSubCuentas.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    catSubCuenta.altaCatalogo();
  }
  else if(operacion==OPER_MODIFICAR && frmMantenimientoCatalogoSubCuentas.checkForm())//Se trata de una modificación
  {
    showWaitLayer();
    catSubCuenta.modificaCatalogo();
  }
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    showWaitLayer();
    catSubCuenta.setOnUpdate(operacionExitosa);
    eliminaCatalogo(catSubCuenta);
  }
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalCatalogosGeneralEstructuraGeograficaPaises();
  hideWaitLayer();
}

//Verificar que el registro aún no exista
function verificaExistenciaRegistro() {
  if(operacion==OPER_ALTA && GI("paiNumPais").value!="")
  {
    showWaitLayer();
    validacionAlta.numPais = GI("paiNumPais").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificacionAlta, null);
  }
}

function verificacionAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].existeRegistro > 0)
  {
    Swal.fire('Aviso', 'Ya existe un registro con ese número, verifique',  'warning');
    GI("paiNumPais").value="";
  }
  hideWaitLayer();
}



function validarPkAlta(objeto) {
  if(GI("fsctIdFideicomiso").value!="")
  {
    var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaContrato\",\"numContrato\":0}");
    validacionAlta.numContrato = GI("fsctIdFideicomiso").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificarAlta, objeto);
  }
}

function verificarAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoNumContrato > 0)
  {
    var validacionAlta2 = JSON.parse("{\"id\":\"verificaSeaActivo\",\"numContrato\":0}");
    validacionAlta2.numContrato = GI("fsctIdFideicomiso").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta2);
    makeAjaxRequest(url, "HTML", verificarAlta2, obj);
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no existe, verifique',  'warning');
    GI("fsctIdFideicomiso").value="";
    GI("fsctIdSubCuenta").value="";
    obj.focus();
  }
}

function verificarAlta2(obj,result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoCveStContrat != 0)
  {
    Swal.fire('Aviso', 'El Fideicomiso no está ACTIVO',  'warning');
    GI("fsctIdFideicomiso").value="";
    GI("fsctIdSubCuenta").value="";
    obj.focus();
  }
  else
  {
    consultaNombreFideicomiso("nomFideicomiso",GI("fsctIdFideicomiso"));
    
    //Agregar el número del Tercero (Incremental)
    var SecNumSubCuenta = JSON.parse("{\"id\":\"numSecNumSubCuenta\",\"NumFiso\":0}");
    SecNumSubCuenta.NumFiso=GI("fsctIdFideicomiso").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(SecNumSubCuenta);
    makeAjaxRequest(url, "HTML", agregarTercero, null);
  }
}

function agregarTercero(obj, result) {

  var objResult = JSON.parse(result);
  GI("fsctIdSubCuenta").value=objResult[0].secNumSubcuenta;
}
