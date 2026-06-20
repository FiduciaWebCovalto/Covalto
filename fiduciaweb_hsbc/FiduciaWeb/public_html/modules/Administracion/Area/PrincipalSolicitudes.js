var catSubCuenta = new Catalogo("mx.com.inscitech.fiducia.domain.FTipoperArea");


var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var clavesCombo5 = JSON.parse("{\"llaveClave\":5}");
var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaRegistroSolicitudArea\"}");

initForms();
var pkAux = pkInfo;
var tablaDatosSubCuentasData = new Array();
tablaDatosSubCuentasData[0] = "ftopNumOper,70px";
tablaDatosSubCuentasData[1] = "etapa,100px";
tablaDatosSubCuentasData[2] = "cveDescClave,270px";
tablaDatosSubCuentasData[3] = "ftaStatus,90px";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var frmMantenimientoCatalogoSubCuentas = new FormValidator();
var CONSULTAR = 3;

function cargaPrincipalCatalogosGeneralEstructuraGeograficaPaises() {
  onButtonClickPestania("Administracion.Area.PrincipalSolicitudes","");
  hideWaitLayer();
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catSubCuenta.getCatalogo());
}

////////////////////////////////////////////////////////////////////
//CARGA LA SEGUNDA PANTALLA (MantenimientoCatalogosGeneralesEstructuraGeograficaPaises)
var nombreOperacion;
function cargaMantenimientoSubCuentas(tipoPantalla) {
  if ((tipoPantalla==OPER_MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    nombreOperacion=GI("txtNomComite").value;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Administracion/Area/MantenimientoSolicitudes.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, GI("paramFideicomiso").value);
  }
}

function despliegaPantalla(obj, result) {
  GI("dvPantalla").innerHTML = result;
  
    GI("ftopNumOper").value=obj;
    GI("txtNomComite").value = nombreOperacion;
    
    //varNumContratoMiembros.NumContratoMiembros = pkAux.conNumContrato;
    deshabilitaPK("ftopNumOper,txtNomComite".split(","));
    
  initForms();
  
  //Agregando la funcionalidad del required
  frmMantenimientoCatalogoSubCuentas.setup({
    formName      : "frmMantenimientoCatalogoSubCuentas",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
hideWaitLayer();

if ((tipoPantalla==OPER_MODIFICAR)){
    deshabilitaObjetos(GI("frmMantenimientoCatalogoSubCuentas"));
    deshabilitaPK("ftopNumOper");
}
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
    deshabilitaPK("ftopNumOper");
    //deshabilitaObjetos(GI("ftopNumOper"));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmMantenimientoCatalogoSubCuentas"));         //Deshabilita objetos (excepto botones)
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
  if(operacion==OPER_ALTA && GI("ftsNumOperHija").value!="")
  {
    showWaitLayer();
    validacionAlta.Solicitud = GI("ftopNumOper").value;
    validacionAlta.Area = GI("ftaIdArea").value;
    validacionAlta.Etapa = GI("fetaIdEtapa").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificacionAlta, null);
  }
}

function verificacionAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].existeRegistro > 0)
  {
    Swal.fire('Aviso', 'Ya existe un registro con ese número, verifique',  'warning');
  }
  hideWaitLayer();
}