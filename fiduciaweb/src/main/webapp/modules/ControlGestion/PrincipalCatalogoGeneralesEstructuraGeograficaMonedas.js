var catMonedas = new Catalogo("mx.com.inscitech.fiducia.domain.Monedas");

var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");

var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaRegistroMonedas\",\"nombreMoneda\":0,\"numPais\":0}");

var tablaDatosMonedasData = new Array();
tablaDatosMonedasData[0] = "paiNomPais,200px";
tablaDatosMonedasData[1] = "monNomMoneda,200px";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var fvMantenimientoMonedas = new FormValidator();
var CONSULTAR = 3;

formsLoaded();


function cargaPrincipalCatalogoGeneralesEstructuraGeograficaMonedas() {
	var urlCliente = ctxRoot + "/modules/ControlGestion/PrincipalCatalogoGeneralesEstructuraGeograficaMonedas.do";
	makeAjaxRequest(urlCliente, "HTML", despliegaPantallaP, null);
}

function despliegaPantallaP(obj, result) {
  GI("dvPantalla").innerHTML = result;
  hideWaitLayer();
  initForms();
}

function cargaMantenimientoCatalogoGeneralesEstructuraGeograficaMonedas(tipoPantalla) {
  if ((tipoPantalla==OPER_MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/ControlGestion/MantenimientoCatalogoGeneralesEstructuraGeograficaMonedas.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
  }
}

function despliegaPantalla(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimientoMonedas.setup({
    formName      : "frmMantenimientoCatalogosGeneralesEstructuraGeograficaMonedas",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catMonedas.getCatalogo());
}

function loadCatalogo() {
  catMonedas.setOnUpdate(catLoaded);
  if(operacion==OPER_MODIFICAR || operacion==CONSULTAR)
    catMonedas.buscaCatalogoPK(false);
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
    formsLoaded();
  }
}

function AltaOModificaInfo() {
  catMonedas.setOnUpdate(operacionExitosa);
  if(operacion==OPER_ALTA && fvMantenimientoMonedas.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    catMonedas.altaCatalogo();
  }
  else if(operacion==OPER_MODIFICAR && fvMantenimientoMonedas.checkForm())//Se trata de una modificación
  {
    showWaitLayer();
    catMonedas.modificaCatalogo();
  }
}

function catLoaded() {
  if(operacion==OPER_MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
    deshabilitaPK("monNomMoneda,monNumPais".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmMantenimientoCatalogosGeneralesEstructuraGeograficaMonedas"));         //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalCatalogoGeneralesEstructuraGeograficaMonedas();
  hideWaitLayer();
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    catMonedas.setOnUpdate(operacionExitosa);
    showWaitLayer();
    eliminaCatalogo(catMonedas);
  }
}

////////////////////////////////////////////////////////////////////////////
//Verificar que el registro aún no exista
function verificaExistenciaRegistro() {
  if(operacion==OPER_ALTA && GI("monNumPais").value!=-1 && GI("monNomMoneda").value!="")
  {
    showWaitLayer();
    validacionAlta.nombreMoneda = GI("monNomMoneda").value;
    validacionAlta.numPais = GI("monNumPais").value;
    
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificacionAlta, null);
  }
}

function verificacionAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].existeRegistro > 0)
  {
    Swal.fire('Aviso', 'El registro ya existe, verifique',  'warning');
    GI("monNumPais").selectedIndex=0;
    GI("monNomMoneda").value="";
  }
  hideWaitLayer();
}