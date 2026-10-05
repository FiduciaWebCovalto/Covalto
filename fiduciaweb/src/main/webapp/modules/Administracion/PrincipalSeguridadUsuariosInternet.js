var catUsuarios = new Catalogo("mx.com.inscitech.fiducia.domain.FTipoper");

//showWaitLayer();

var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var paramQueryEtapa = JSON.parse("{}");

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
  onButtonClickPestania("Administracion.PrincipalSeguridadUsuariosInternet","");
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
    var urlCliente = ctxRoot + "/modules/Administracion/MantenimientoUsuariosInternetPersonas.do";
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
tablaDatosUsuariosAsignacionData[2] = "fpurDescripcion,707";

var validacionAlta3 = JSON.parse("{\"id\":\"validaExistaRegistroAsignadoOpera\",\"Etapa\":0,\"PuntoRevision\":0,\"Solicitud\":0}");

var fvMantenimientoUsuariosAsignacion = new FormValidator();
var divNombreFideicomisoParam;

//CARGA LA TERCERA PANTALLA (MantenimientoAsignacionFideicomisos)
function cargaMantenimientoAsignacionFideicomisos() {
  pkInfo2=null;
  numPantalla = 2;
  //showWaitLayer();
  var urlCliente = ctxRoot + "/modules/Administracion/MantenimientoUsuariosInternetAsignacionFideicomisos.do";
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
  
  paramQueryEtapa.order = "S";
  paramQueryEtapa.tipoSolicitud = pkInfo.ftopNumOper.substring(0, 1) == '1' ? 'M' : 'N';
  
  GI("paramEjecutivoAtencion").value=pkInfo.ftopNumOper;
  consultar(GI("hdRegistrosAsignacion"), GI('frmMantenimientoUsuariosInternetAsignacionFideicomisos'), false);
  
  SA(GI("paramPuntoRevision"),"next","formsLoaded");
  loadElement(GI("paramPuntoRevision"));  
  SA(GI("paramEtapa"),"next","formsLoaded");
  loadElement(GI("paramEtapa"));    
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
    
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta3);
    makeAjaxRequest(url, "HTML", verificacionExistenciaComiteAsignacion, null);    
  }
}

function verificacionExistenciaComiteAsignacion(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].existeRegistro > 0)
    Swal.fire('Aviso', 'La Asignación del Punto de Revision ya existe',  'warning');
  else
    altaAsignarFideicomiso();
}

//Realizar el Update y mostrarlo en el Grid
function altaAsignarFideicomiso() {
  var numFiso = GI("paramEjecutivoAtencion").value;
  var numUsuario = GI("paramEtapa").value;
  var nomUsuario = GI("paramPuntoRevision").value;
  var objInsertaAtencion = JSON.parse("{\"id\":\"insertaDatoAsignacionAtencionSolicitud\",\"NumFiso\":" + numFiso +
                                                                              ",\"NumUsuario\":" + numUsuario + 
                                                                              ",\"NomEjec\":\""  + nomUsuario + "\"}");
  
  var urlAtencion = ctxRoot + "/doRef.do?json=" + JSON.stringify(objInsertaAtencion);
  //makeAjaxRequest(urlAtencion, "HTML", insertandoEliminandoEnAtencion, null);
  makeAjaxRequest(urlAtencion, "HTML", eliminandoEnAtencion, null);
}

function eliminandoEnAtencion(obj, result) {
  var objResult = JSON.parse(result);
  
  
  //AQUI SE EJECUTARA LA INSERCION DE AREAS Y ETAPA POR SOLICITUD VIA UNA FUNCION
            var vgContenedorDatos=null;
            vgContenedorDatos=JSON.parse("{\"id\":\"funcionIncorporaAreaSolicitud\"}");//PRIMERO SE PROCESA LA BITACORA
            vgContenedorDatos.Solicitud= GI("paramEjecutivoAtencion").value;
            vgContenedorDatos.Etapa= GI("paramEtapa").value;
            var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
            //alert(url)  
            makeAjaxRequest(url, "HTML", ejecutaFuncion, null);   
}
  function ejecutaFuncion(tp,result){
    //alert(result);
    var rusultado= JSON.parse(result);
    var res=rusultado.result
    /*if(res==0){
      Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
    }       
    else {
      Swal.fire('Aviso', 'Ocurrio un error al realizar la Operacion.',  'warning')}*/
    hideWaitLayer(); 
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
  
  var objDeleteAtencion = JSON.parse("{\"id\":\"EliminaDatoAsignacionAtencionSolicitud\",\"CveBanca\":\"" + cveBanca +
                                                                              "\",\"EjecAtencion\":" + ejecAtencion + 
                                                                              ",\"NumContrato\":"  + numContrato  + 
                                                                              "}");
  var urlAtencion = ctxRoot + "/doRef.do?json=" + JSON.stringify(objDeleteAtencion);
  makeAjaxRequest(urlAtencion, "HTML", eliminandoEnAtencion, null);
}

function convertirMayusculas( objeto ) {
   var strMayusculas = objeto.value;
   objeto.value = strMayusculas.toUpperCase();
   }
