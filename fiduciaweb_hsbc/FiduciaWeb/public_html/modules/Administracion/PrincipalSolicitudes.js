var catSubCuenta = new Catalogo("mx.com.inscitech.fiducia.domain.FTipoper");


var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaRegistroSolicitud\"}");
var validacionSecuencial = JSON.parse("{\"id\":\"numSecSolicitud\"}");

initForms();

var tablaDatosSubCuentasData = new Array();
tablaDatosSubCuentasData[0] = "ftopNumOper,70px";
tablaDatosSubCuentasData[1] = "ftopNombreTipoper,270px";
tablaDatosSubCuentasData[2] = "ftopStatus,90px";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var frmMantenimientoCatalogoSubCuentas = new FormValidator();
var CONSULTAR = 3;

function cargaPrincipalCatalogosGeneralEstructuraGeograficaPaises() {
  onButtonClickPestania("Administracion.PrincipalSolicitudes","");
  hideWaitLayer();
}

function cargaPrincipalCatalogosGeneralEstructuraGeograficaPaises2() {
  onButtonClickPestania("Administracion.PrincipalSolicitudes","");
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
    var urlCliente = ctxRoot + "/modules/Administracion/MantenimientoSolicitudes.do";
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

    if ((numPantalla==OPER_MODIFICAR))
        deshabilitaObjetos(GI("frmMantenimientoCatalogoSubCuentas"));
        //deshabilitaPK("ftopNumOper");
//alert(numPantalla)
    if ((numPantalla==1)){
        validacionSecuencial.Tipo = 2;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionSecuencial);
        makeAjaxRequest(url, "HTML", verificacionSecuencial, null);
    }
}

function verificacionSecuencial(obj, result) {
  var objResult = JSON.parse(result);
  GI("ftopNumOper").value=objResult[0].secuencial;
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
    muestraObjs("cmdSubClasifica"); //Mostrar el botón Miembros
    muestraObjs("cmdAreas"); //Mostrar el botón Miembros
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
  if(operacion==OPER_ALTA && GI("ftopNumOper").value!="")
  {
    showWaitLayer();
    validacionAlta.Solicitud = GI("ftopNumOper").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificacionAlta, null);
  }
}

function verificacionAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].existeRegistro > 0)
  {
    Swal.fire('Aviso', 'Ya existe un registro con ese número, verifique',  'warning');
    GI("ftopNumOper").value="";
  }
  hideWaitLayer();
}


//////////////////////////////////////////////////////////////////////////////
//Funciones para la pantalla subclasifica
var nombreOperacion;
function cargaPrincipalSubClasificacion() {
  numPantalla = 0;
  //Swal.fire('Aviso', 'cargaPrincipalSubClasificacion',  'warning')showWaitLayer();
  nombreOperacion=GI("ftopNombreTipoper").value;
  loadDynamicJS (ctxRoot + "/modules/Administracion/Subclasifica/PrincipalSolicitudes.js");
  var urlCliente = ctxRoot + "/modules/Administracion/Subclasifica/PrincipalSolicitudes.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoSubClasifica, GI("ftopNumOper").value);
}


function despliegaPantallaMantenimientoSubClasifica(obj, result) {
  GI("dvPantalla").innerHTML = result;
  //alert(numPantalla)
  if(numPantalla==0)
  {
    //Swal.fire('Aviso', 'llego aki',  'warning')GI("paramFideicomiso").value=obj;
    
    //consultaNombreFideicomiso("nomFideicomiso",GI("paramFideicomiso"));
    GI("txtNomComite").value = nombreOperacion;
    
    //varNumContratoMiembros.NumContratoMiembros = pkAux.conNumContrato;
    deshabilitaPK("paramFideicomiso,txtNomComite".split(","));
    consultar(GI("cmdAceptar"), GI('frmMantenimientoCatalogoSubCuentas'), false);
    hideWaitLayer();
  }
}

//////////////////////////////////////////////////////////////////////////////
//Funciones para la pantalla areas
function cargaPrincipalAreas() {
  numPantalla = 0;
  //Swal.fire('Aviso', 'cargaPrincipalSubClasificacion',  'warning')showWaitLayer();
  nombreOperacion=GI("ftopNombreTipoper").value;
  loadDynamicJS (ctxRoot + "/modules/Administracion/Area/PrincipalSolicitudes.js");
  var urlCliente = ctxRoot + "/modules/Administracion/Area/PrincipalSolicitudes.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoSubClasifica, GI("ftopNumOper").value);
}


function despliegaPantallaMantenimientoSubClasifica(obj, result) {
  GI("dvPantalla").innerHTML = result;
  //alert(numPantalla)
  if(numPantalla==0)
  {
    //Swal.fire('Aviso', 'llego aki',  'warning')GI("paramFideicomiso").value=obj;
    
    //consultaNombreFideicomiso("nomFideicomiso",GI("paramFideicomiso"));
    GI("txtNomComite").value = nombreOperacion;
    
    //varNumContratoMiembros.NumContratoMiembros = pkAux.conNumContrato;
    deshabilitaPK("paramFideicomiso,txtNomComite".split(","));
    consultar(GI("cmdAceptar"), GI('frmMantenimientoCatalogoSubCuentas'), false);
    hideWaitLayer();
  }
}

//////////////////////////////////////////////////////////////////////////////
