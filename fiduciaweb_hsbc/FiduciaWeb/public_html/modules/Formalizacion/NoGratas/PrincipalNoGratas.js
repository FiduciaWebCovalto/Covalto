var catProspectosFideicomitentes = new Catalogo("mx.com.inscitech.fiducia.domain.FPersNG");

//showWaitLayer();

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;

var clavesCombo31  = JSON.parse("{\"llaveClave\":31}"); // Estatus de registro
var clavesCombo29 = JSON.parse("{\"llaveClave\":29}"); // Tipos de persona
var consultaDatosInformativos = JSON.parse("{\"id\":\"muestraNombreProspecto\",\"numProspecto\":0}");
var verificaExistenciaProspecto = JSON.parse("{\"id\":\"verificarExistenciaRegistroProspecto\",\"numProspecto\":0}");

var contenedor = new Object();

initForms();

var tablaFideicomitentesData = new Array();
tablaFideicomitentesData[0] = "pngNumSec,60";
tablaFideicomitentesData[1] = "pngNombre,200";

var operacion = 0;
var numPantalla = 0;
pkInfo=null;
var parametroComboEstado;
var usarSetValuesFormObject=false;
var fvMantenimientoFideicomitentes = new FormValidator();

//No permitir editar el campo informativo de la página principal:
//1. Nombre del proyecto (Nombre del negocio)
//deshabilitaPK("txtNomProyecto".split(","));

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalProspectosFideicomitentes() {
  onButtonClickPestania("Formalizacion.NoGratas.PrincipalNoGratas","");
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catProspectosFideicomitentes.getCatalogo());
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalProspectosFideicomitentes();
  hideWaitLayer();
}


function operacionExitosaKYC() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  //cargaPrincipalProspectosFideicomitentes();
  ocultaObjs("cmdAceptar"); //Mostrar el botón Aceptar y Cancelar
  SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
  deshabilitaObjetos(GI("frmDatosMantenimientoFideicomitentes"));      
  hideWaitLayer();
}


//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda pantalla
function cargaMantenimientoFideicomitentes(tipoPantalla) {
  if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    //showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Formalizacion/NoGratas/MantenimientoNoGratas.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoProspectosFideicomitentes, null);
  }
}

function despliegaPantallaMantenimientoProspectosFideicomitentes(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimientoFideicomitentes.setup({
    formName      : "frmDatosMantenimientoFideicomitentes",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
  
  //No permitir editar el campo informativo de la página de mantenimiento:
  //1. Nombre del proyecto (Nombre del negocio)
  //deshabilitaPK("txtNomProyecto,fidNumProspecto,fidSecuencialPersona".split(","));
}

function loadCatalogo() {
  catProspectosFideicomitentes.setOnUpdate(catLoaded);
  if(operacion==MODIFICAR || operacion==CONSULTAR)
    catProspectosFideicomitentes.buscaCatalogoPK(false);
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
    formsLoaded();
  }
}


function catLoaded() {

  if(operacion==MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar y Cancelar
    deshabilitaPK("fidNumProspecto,fidSecuencialPersona".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmDatosMantenimientoFideicomitentes"));                   //Deshabilita objetos (excepto botones)

  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  //Mostrar datos en campos informativos
  mostrarDatosInformativos(3);
  formsLoaded();
}

function AltaOModificaInfo() {
  catProspectosFideicomitentes.setOnUpdate(operacionExitosaKYC);
  if(operacion==ALTA && fvMantenimientoFideicomitentes.checkForm())//Se trata de una alta
  {
    //showWaitLayer();
    catProspectosFideicomitentes.altaCatalogo();
  }
  else if(operacion==MODIFICAR && fvMantenimientoFideicomitentes.checkForm())//Se trata de una modificación
  {
    //showWaitLayer();
    catProspectosFideicomitentes.modificaCatalogo();
  }
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    catProspectosFideicomitentes.setOnUpdate(operacionExitosa);
    //showWaitLayer();
    eliminaCatalogo(catProspectosFideicomitentes);
  }
}


//////////////////////////////////////////////////////////////
function consultarExistenciaFideicomitente() {
  if(GI("fidNumProspecto").value!="")
    mostrarDatosInformativos(2);
  else if(GI("fidNumProspecto").value=="")
    GI("txtNomPr").value="";
}

function mostrarDatosInformativos(parametroPantalla) {
  GI("txtNomProspecto").value="";
  //showWaitLayer();
  if(parametroPantalla==1)
  {
    consultaDatosInformativos.numProspecto = GI("paramProspecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
  }
  else if(parametroPantalla==2)
  {
    var Secuencial = JSON.parse("{\"id\":\"secNumFideicomProspecto\",\"numProspecto\":0}");
    Secuencial.numProspecto=GI("fidNumProspecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(Secuencial);
    makeAjaxRequest(url, "HTML", verificarSecuencial, null);
  }
  else
  {
    consultaDatosInformativos.numProspecto = GI("fidNumProspecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
  }
}

function verificarAlta(obj, result) {
  var objResult = JSON.parse(result);

  if(objResult[0].existeRegistro > 0)
  {
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
  }
  else
  {
    Swal.fire('Aviso', 'El Proyecto no existe, verifique',  'warning');
    GI("afbAnteproyecto").value="";
    GI("txtNomProyecto").value="";
    GI("afbNumFidben").value="";
    GI("afbAnteproyecto").focus();
    hideWaitLayer();
  }
}

function insertaDatosInformativos(obj, result) {
  var objResult = JSON.parse(result);
  GI("txtNomProspecto").value=objResult[0].prsNomProspecto;
  hideWaitLayer();
}

function verificarSecuencial(obj, result) {
  var objResult = JSON.parse(result);
  GI("fidSecuencialPersona").value=objResult[0].fidSecuencialPersona;
  
  consultaDatosInformativos.numProspecto = GI("fidNumProspecto").value;
  verificaExistenciaProspecto.numProspecto = GI("fidNumProspecto").value;
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(verificaExistenciaProspecto);
  makeAjaxRequest(url, "HTML", verificarAlta, null);
}
