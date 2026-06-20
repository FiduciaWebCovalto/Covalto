var catUsuarios = new Catalogo("mx.com.inscitech.fiducia.domain.FTipoper");

//showWaitLayer();

var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
initForms();

var tablaDatosUsuariosInternetData = new Array();
tablaDatosUsuariosInternetData[0] = "ftopNumOper,100px";
tablaDatosUsuariosInternetData[1] = "ftopNombreTipoper,200px";
tablaDatosUsuariosInternetData[2] = "ftopStatus,50px";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var pkInfo2 = null;
var fvMantenimientoUsuariosInternet = new FormValidator();

var nombreUsuarioID=null;

function cargaPrincipalSeguridadUsuariosInternet() {
  onButtonClickPestania("Administracion.DocumentosSolicitud.PrincipalSeguridadUsuariosInternet","");
}

function clickTabla(pk) {
  pkInfo = pk;
  
  cloneObject(pk,catUsuarios.getCatalogo());
}

////////////////////////////////////////////////////////////////////
//CARGA LA SEGUNDA PANTALLA (MantenimientoUsuariosInternetPersonas)
function cargaMantenimientoUsuariosInternetPersonas(tipoPantalla) {
  if ((tipoPantalla==2 || tipoPantalla==3) && pkInfo==null){
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
    }
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Administracion/DocumentosSolicitud/MantenimientoUsuariosInternetPersonas.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
  }
}

function despliegaPantalla(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimientoUsuariosInternet.setup({
    formName      : "frmMantenimientoUsuariosInternetPersonas",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
  loadCatalogo();
hideWaitLayer();
}


function loadCatalogo() {
  catUsuarios.setOnUpdate(catLoadedUsuarios);
  //Asignar llave primaria
  GI("ftopNumOper").value=pkInfo.ftopNumOper;
  catUsuarios.buscaCatalogoPK();//Verificar que abra el catálogo por causa del tipo de dato DATE
  formsLoaded();
}

function catLoadedPersonal() {
  catUsuarios.setOnUpdate(catLoadedUsuarios);
  //Asignar llave primaria
  GI("ftopNumOper").value=pkInfo.ftopNumOper;
  catUsuarios.buscaCatalogoPK();//Verificar que abra el catálogo por causa del tipo de dato DATE
  formsLoaded();
}

function catLoadedUsuarios() {
/*  if(operacion==3)//Si se trata de una consulta, deshabilitar
  {*/
    deshabilitaObjetos(GI("frmMantenimientoUsuariosInternetPersonas"));         //Deshabilita objetos (excepto botones)
    SA(GI("frmMantenimientoUsuariosInternetPersonas").cmdAceptar, "LKD", "true");
    SA(GI("frmMantenimientoUsuariosInternetPersonas").cmdAceptar, "disabled", "true");   //Deshabilita botón Aceptar
 // }
  formsLoaded();
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalSeguridadUsuariosInternet();
}

/*COMIENZA LA SECCION DE ASIGNACION*/

////////////////////////////////////////////////////////////////////
var tablaDatosUsuariosAsignacionData = new Array();
tablaDatosUsuariosAsignacionData[0] = "ftopNumOper,123";
tablaDatosUsuariosAsignacionData[1] = "fetaNombreEtapa,123";
tablaDatosUsuariosAsignacionData[2] = "fdocNombre,400";
tablaDatosUsuariosAsignacionData[3] = "fpurDescripcion,400";

var validacionAlta3 = JSON.parse("{\"id\":\"validaExistaRegistroAsignadoOperaDocumento\",\"Etapa\":0,\"PuntoRevision\":0,\"Solicitud\":0,\"Documento\":0}");


var fvMantenimientoUsuariosAsignacion = new FormValidator();
var divNombreFideicomisoParam;

//CARGA LA TERCERA PANTALLA (MantenimientoAsignacionFideicomisos)
function cargaMantenimientoAsignacionFideicomisos() {
  pkInfo2=null;
  numPantalla = 2;
  //showWaitLayer();
  var urlCliente = ctxRoot + "/modules/Administracion/DocumentosSolicitud/MantenimientoUsuariosInternetAsignacionFideicomisos.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaAsignaFideicomisos, null);
  
}

function despliegaPantallaAsignaFideicomisos(obj, result) {
  GI("dvPantalla").innerHTML = result;
  
  //Agregando la funcionalidad del required
  fvMantenimientoUsuariosAsignacion.setup({
    formName      : "frmMantenimientoUsuariosInternetAsignacionFideicomisos",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
  
  GI("paramEjecutivoAtencion").value=pkInfo.ftopNumOper;
  consultar(GI("hdRegistrosAsignacion"), GI('frmMantenimientoUsuariosInternetAsignacionFideicomisos'), false);
  
  SA(GI("paramPuntoRevision"),"next","formsLoaded");
  loadElement(GI("paramPuntoRevision"));  
  SA(GI("paramEtapa"),"next","formsLoaded");
  loadElement(GI("paramEtapa"));    
  SA(GI("paramDocumentos"),"next","formsLoaded");
  loadElement(GI("paramDocumentos"));    
  formsLoaded();
}

function clickTabla2(pk) {
  pkInfo2 = pk;
}

////////////////////////////////////////////////////////////////////
//Validar el usuario y el comité técnico para dar de Alta una Asignación de Fideicomiso
function validaAltaAsignacion() {
  if(fvMantenimientoUsuariosAsignacion.checkForm())
  {
    validacionAlta3.Solicitud = GI("paramEjecutivoAtencion").value;
    validacionAlta3.Etapa = GI("paramEtapa").value;
    validacionAlta3.PuntoRevision = GI("paramPuntoRevision").value;
    validacionAlta3.Documento = GI("paramDocumentos").value;
    
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta3);
    makeAjaxRequest(url, "HTML", verificacionExistenciaComiteAsignacion, null);    
  }
}

function verificacionExistenciaComiteAsignacion(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].existeRegistro > 0)
    Swal.fire('Aviso', 'La Asignación del Documento ya existe',  'warning');
  else
    altaAsignarFideicomiso();
}

//Realizar el Update y mostrarlo en el Grid
function altaAsignarFideicomiso() {
  var nomUsuario = GI("paramPuntoRevision").value;
  var vDocumento = GI("paramDocumentos").value;
  var objInsertaAtencion = JSON.parse("{\"id\":\"insertaDatoAsignacionAtencionSolicitudDocumento2\"" + 
                                                                              ",\"Documento\":"  + vDocumento + 
                                                                              ",\"NomEjec\":"  + nomUsuario + "}");
  
  var urlAtencion = ctxRoot + "/doRef.do?json=" + JSON.stringify(objInsertaAtencion);
  //makeAjaxRequest(urlAtencion, "HTML", insertandoEliminandoEnAtencion, null);
  makeAjaxRequest(urlAtencion, "HTML", eliminandoEnAtencion, null);
}

function eliminandoEnAtencion(obj, result) {
  var objResult = JSON.parse(result);
  var numFiso = GI("paramEjecutivoAtencion").value;
  var numUsuario = GI("paramEtapa").value;
  var nomUsuario = GI("paramPuntoRevision").value;
  var vDocumento = GI("paramDocumentos").value;
  var objInsertaAtencion = JSON.parse("{\"id\":\"insertaDatoAsignacionAtencionSolicitudDocumento\",\"NumFiso\":" + numFiso +
                                                                              ",\"NumUsuario\":" + numUsuario + 
                                                                              ",\"Documento\":"  + vDocumento + 
                                                                              ",\"NomEjec\":"  + nomUsuario + "}");
  
  var urlAtencion = ctxRoot + "/doRef.do?json=" + JSON.stringify(objInsertaAtencion);
  //makeAjaxRequest(urlAtencion, "HTML", insertandoEliminandoEnAtencion, null);
  makeAjaxRequest(urlAtencion, "HTML", eliminandoEnAtencion2, null);  
  
}


function eliminandoEnAtencion2(obj, result) {
  var objResult = JSON.parse(result);
  
  cargaMantenimientoAsignacionFideicomisos();
}

////////////////////////////////////////////////////////////////////
//Validar que exista la Asignación del Fideicomiso para darlo de Baja
function validaExistaAsignacionComite() {
  if(pkInfo2==null)
    Swal.fire('Aviso', 'Seleccione un registro de la tabla',  'warning');
  else
    deleteEnAtencion();
}

function deleteEnAtencion() {
  var cveBanca = pkInfo2.ftopNumOper;
  var ejecAtencion = pkInfo2.fetaIdEtapa;
  var numContrato = pkInfo2.fpurIdPuntorev;
  var vDocumento = pkInfo2.fdocIdDocumento;
  /*alert(pkInfo2.ftopNumOper)
  alert(pkInfo2.fetaIdEtapa)
  alert(pkInfo2.fpurIdPuntorev)
  alert(pkInfo2.fdocIdDocumento)*/
  var objDeleteAtencion = JSON.parse("{\"id\":\"EliminaDatoAsignacionAtencionSolicitudDocumento\",\"CveBanca\":" + cveBanca +
                                                                              ",\"EjecAtencion\":" + ejecAtencion + 
                                                                              ",\"NumContrato\":"  + numContrato  + 
                                                                              ",\"Documento\":"  + vDocumento  + 
                                                                              "}");
                                                                              
  var urlAtencion = ctxRoot + "/doRef.do?json=" + JSON.stringify(objDeleteAtencion);
  //alert(urlAtencion)
  makeAjaxRequest(urlAtencion, "HTML", eliminandoEnAtencion3, null);
}

function eliminandoEnAtencion3(obj, result) {
  var objResult = JSON.parse(result);
  var numContrato = pkInfo2.fpurIdPuntorev;
  var vDocumento = pkInfo2.fdocIdDocumento;
  var objInsertaAtencion = JSON.parse("{\"id\":\"EliminaDatoAsignacionAtencionSolicitudDocumento2\"" +
                                                                              ",\"NumContrato\":"  + numContrato + 
                                                                              ",\"Documento\":"  + vDocumento + 
                                                                              "}");
  
  var urlAtencion = ctxRoot + "/doRef.do?json=" + JSON.stringify(objInsertaAtencion);
  //makeAjaxRequest(urlAtencion, "HTML", insertandoEliminandoEnAtencion, null);
  makeAjaxRequest(urlAtencion, "HTML", eliminandoEnAtencion4, null);  
  
}


function eliminandoEnAtencion4(obj, result) {
  var objResult = JSON.parse(result);
  
  cargaMantenimientoAsignacionFideicomisos();
}

function convertirMayusculas( objeto ) {
   var strMayusculas = objeto.value;
   objeto.value = strMayusculas.toUpperCase();
   }
