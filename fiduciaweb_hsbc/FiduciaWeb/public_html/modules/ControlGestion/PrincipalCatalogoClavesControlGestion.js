var catClaves = new Catalogo("mx.com.inscitech.fiducia.domain.Claves");

showWaitLayer();

var clavesCombo99 = JSON.parse("{\"llaveClave\":99,\"orderDescripcion\":\"s\"}");
var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaRegistroClave\",\"clave\":0,\"secClave\":0}");

initForms();

var tablaDatosCatalogoClavesData = new Array();
tablaDatosCatalogoClavesData[0] = "cveNumClave,70px";
tablaDatosCatalogoClavesData[1] = "cveNumSecClave,70px";
tablaDatosCatalogoClavesData[2] = "cveDescClave,250px";
tablaDatosCatalogoClavesData[3] = "cveFormaEmpCve,250px";
tablaDatosCatalogoClavesData[4] = "cveCveStClave,90px";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var fvMantenimientoClaves = new FormValidator();
var CONSULTAR = 3;

function cargaPrincipalCatalogoClavesControlGestion() {
  onButtonClick("ControlGestion.PrincipalCatalogoClavesControlGestion","");
  hideWaitLayer();
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catClaves.getCatalogo());
}


////////////////////////////////////////////////////////////////////
//CARGA LA SEGUNDA PANTALLA (MantenimientoCatalogosClavesControlGestion)
function cargaMantenimientoCatalogosClavesControlGestion(tipoPantalla) {
  if ((tipoPantalla==OPER_MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/ControlGestion/MantenimientoCatalogosClavesControlGestion.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
  }
}

function despliegaPantalla(obj, result) {
  GI("dvContenido").innerHTML = result;
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimientoClaves.setup({
    formName      : "frmMantenimientoCatalogosClavesControlGestion",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
}

function loadCatalogo() {
  catClaves.setOnUpdate(catLoaded);
  if(operacion==OPER_MODIFICAR || operacion==CONSULTAR)
    catClaves.buscaCatalogoPK(false);
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
    deshabilitaPK("cveNumClave,cveNumSecClave".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmMantenimientoCatalogosClavesControlGestion"));         //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();
}

function AltaOModificaInfo() {
  catClaves.setOnUpdate(operacionExitosa);
  
  if(operacion==OPER_ALTA && fvMantenimientoClaves.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    catClaves.altaCatalogo();
  }
  else if(operacion==OPER_MODIFICAR && fvMantenimientoClaves.checkForm())//Se trata de una modificación
  {
    showWaitLayer();
    catClaves.modificaCatalogo();
  }
  
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    catClaves.setOnUpdate(operacionExitosa);
    showWaitLayer();
    eliminaCatalogo(catClaves);
  }
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalCatalogoClavesControlGestion();
  hideWaitLayer();
}

//Verificar que el registro aún no exista
function verificaExistenciaRegistro() {
  if(operacion==OPER_ALTA && GI("cveNumClave").value!="" && GI("cveNumSecClave").value!="")
  {
    showWaitLayer();
    validacionAlta.clave = GI("cveNumClave").value;
    validacionAlta.secClave = GI("cveNumSecClave").value;
    
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificacionAlta, null);
  }
}

function verificacionAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].existeRegistro > 0)
  {
    Swal.fire('Aviso', 'La clave ya existe, verifique',  'warning');
    GI("cveNumClave").value="";
    GI("cveNumSecClave").value="";
  }
  hideWaitLayer();
}