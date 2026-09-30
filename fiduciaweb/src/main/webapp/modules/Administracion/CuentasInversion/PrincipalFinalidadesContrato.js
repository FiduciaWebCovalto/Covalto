//Version de Formalizacion/Proyectos
var catFinalidades = new Catalogo("mx.com.inscitech.fiducia.domain.FCuentasInversion");

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;
var isNumContrato = true;
var cmbFormaManejoParam = JSON.parse("{\"chido\":24}");

var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var clavesCombo1132 = JSON.parse("{\"llaveClave\":1132}");
var clavesCombo1113 = JSON.parse("{\"llaveClave\":1113}");
var clavesCombo1115 = JSON.parse("{\"llaveClave\":1115}");
var consultaDatosInformativos = JSON.parse("{\"id\":\"muestraNombreAnteproyecto\",\"numAnteproyecto\":0}");
var cuentasProceso = JSON.parse("{\"id\":\"ValidaCuentasInversionProceso\"}");
var usarSetValuesFormObject = null;
var fideo = JSON.parse("{\"fideicomiso\":0}")
initForms();
var fecha = new Date();

function setFechaCal()
{}

function isValidDate(date)
{
  var today = new Date();
  if(date>today)
    return true;
  else
    return false;
}

var tablaFinalidadesContratoData = new Array();
tablaFinalidadesContratoData[0] = "fciNumFideicomiso,200px";
tablaFinalidadesContratoData[1] = "fciNumCta,250px";
tablaFinalidadesContratoData[2] = "fciTipoCta,250px";
tablaFinalidadesContratoData[3] = "fciIntermediario,250px";
tablaFinalidadesContratoData[4] = "monNomMoneda,250px";
tablaFinalidadesContratoData[5] = "fciEstatus,200px";
tablaFinalidadesContratoData[6] = "fciFeDeAp,200px";
tablaFinalidadesContratoData[7] = "fciEstatusHogan,200px";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var fvMantenimientoFinalidades = new FormValidator();
var fvCat = new FormValidator();

fvCat.setup({
  formName      : "frmDatosFinalidadesContratoConsulta",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});
//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalFinalidadesContrato() {
  onButtonClickPestania("Administracion.CuentasInversion.PrincipalFinalidadesContrato","");
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catFinalidades.getCatalogo());
}

function limpiar(objForma){
  RF(objForma);
  catFinalidades = new Catalogo("mx.com.inscitech.fiducia.domain.FCuentasInversion");
  //asignaEtiqueta("txtNomProyecto","");
  pkInfo = null;
  //Swal.fire('Aviso', 'ok',  'warning');
}

function operacionExitosa(el, result) {
  
      Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalFinalidadesContrato();
  hideWaitLayer();
}

//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda pantalla
function cargaMantenimientoFinalidadesContrato(tipoPantalla) {
  if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Administracion/CuentasInversion/MantenimientoFinalidadesContrato.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoFinalidadesContrato, null);
  }
}

function despliegaPantallaMantenimientoFinalidadesContrato(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimientoFinalidades.setup({
    formName      : "frmDatosFinalidadesContratoMantenimiento",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
  
    Calendar.setup({
    inputField     :    "fciFeDeAp",   // id of the input field
    button         :    "fciFeDeAp",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fecha,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });  
  //deshabilitaPK("finFolioFinalidaAnteproy".split(","));
}

function loadCatalogo() {
  catFinalidades.setOnUpdate(catLoaded);
  if(operacion==MODIFICAR || operacion==CONSULTAR)
    catFinalidades.buscaCatalogoPK(false);
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
    formsLoaded();
  }
  hideWaitLayer();
}

function catLoaded() {
  if(operacion==MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
    deshabilitaPK("fciNumFideicomiso,fciNumCta,fciTipoCta".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    muestraObjs("cmdServicios,cmdFirmantes,cmdEjecutivos");
    deshabilitaObjetos(GI("frmDatosFinalidadesContratoMantenimiento"));                  //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();
  hideWaitLayer();
}

function AltaOModificaInfo() {
    cuentasProceso.NumFideicomiso = GI("fciNumFideicomiso").value;
    cuentasProceso.Cuenta = GI("fciNumCta").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(cuentasProceso);
    makeAjaxRequest(url, "HTML", respuestaCuentasProceso, null);
}

function respuestaCuentasProceso(obj, result) {
    var objResult = JSON.parse(result);
    var existe=objResult[0].existe;
    if(existe==1){
        Swal.fire('error', 'La cuenta se encuentra en proceso de Validacion',  'error');
    }else{
         if(GI("fciTipoCta").value=="CHEQUES"&&GI("fciClabe").value=="")
            {
                Swal.fire('Aviso', 'Debe incorporar la cuenta CLABE',  'warning');
                return;
            }
          else if(operacion == ALTA && fvMantenimientoFinalidades.checkForm())//Se trata de una alta
          {
            catFinalidades.setOnUpdate(operacionExitosa);
            catFinalidades.altaCatalogo(true);
          }
          else if(operacion == MODIFICAR && fvMantenimientoFinalidades.checkForm())//Se trata de una modificación
          {
            //showWaitLayer();
            catFinalidades.setOnUpdate(operacionExitosa);
            catFinalidades.modificaCatalogo(true);
          }        
    }
    hideWaitLayer();
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {  
    cuentasProceso.NumFideicomiso = pkInfo.fciNumFideicomiso;
    cuentasProceso.Cuenta =  pkInfo.fciNumCta;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(cuentasProceso);
    makeAjaxRequest(url, "HTML", respuestaCuentasProcesoBaja, null);
  } 
}

function respuestaCuentasProcesoBaja(obj, result) {
    var objResult = JSON.parse(result);
    var existe=objResult[0].existe;
    
    if(existe==1){
        Swal.fire('error', 'La cuenta se encuentra en proceso de Validacion',  'error');
    }else{    
        catFinalidades.setOnUpdate(operacionExitosa);
        catFinalidades.bajaCatalogo(false);    
    }
}

function verificarAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoNumContrato > 0)
  {
    var validacionAlta2 = JSON.parse("{\"id\":\"verificaSeaActivo\",\"numContrato\":0}");
    validacionAlta2.numContrato = GI("paramfinNumContrato").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta2);
    makeAjaxRequest(url, "HTML", verificarAlta2, obj);
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no existe, verifique',  'warning');
    asignaEtiqueta("txtNomProyecto","");
    GI("finFolioFinalidaAnteproy").value = "";
    obj.value="";
    borraCombos("finNumDictador");
    obj.focus();
    hideWaitLayer();
  }
}

function verificarAlta2(obj,result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoCveStContrat == 0)
  {
    consultaNombreFideicomiso("txtNomProyecto",obj);
    
    //Agregar el número de la Finalidad (Incremental)
    var SecNumFinalida = JSON.parse("{\"id\":\"numSecNumFinalida2\",\"NumFiso\":0}");
    
    SecNumFinalida.NumFiso=GI("paramfinNumContrato").value;

    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(SecNumFinalida);
    makeAjaxRequest(url, "HTML", agregarFinalida, obj);
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no está ACTIVO',  'warning');
    asignaEtiqueta("txtNomProyecto","");
    GI("finFolioFinalidaAnteproy").value = "";
    obj.value="";
    borraCombos("finNumDictador");
    obj.focus();
    hideWaitLayer();
  }
}

function agregarFinalida(obj, result) {
  var objResult = JSON.parse(result);
  GI("finFolioFinalidaAnteproy").value=objResult[0].secNumFinalida;
  alert("Param= "+obj.value);
  cargaParamComboMandante(obj,false);
}

/////////////////////////////////////////////////////////////////////////
//Verificar al intentar dar de alta si el Registro aún no existe

function verificacionExistenciaRegistro(isNumContratoReq) {
    isNumContrato = isNumContratoReq;
    
/*    if(GI("finNumContrato").value != "") { // && GI("finFolioFinalidaAnteproy").value != -1
        //showWaitLayer();
        
        var validacionExistenciaRegistro = {};
        validacionExistenciaRegistro.id = "verificaExistenciaFinalidadesAdmon2";
        validacionExistenciaRegistro.numContrato = GI("finNumContrato").value;
        var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(validacionExistenciaRegistro);     
        
        console.log("URL: "+url);
        makeAjaxRequest(url, "HTML", verificacionExistenciaRegistroFunction);    
    }*/
}

function loadComboX(obj, result) {
    console.log("loadComboX: " + result);
    loadComboElement(GI('finNumDictador'), result);
}

function verificacionExistenciaRegistroFunction(obj, result) {
    //console.log("verificacionExistenciaRegistroFunction");
    //console.log("Result VERF:"+result);
    //console.log("isNumContrato: " + isNumContrato);

    /*var objResult = JSON.parse(result);
    if(objResult[0].existeRegistro > 0) {
        //Swal.fire('Aviso', 'El Registro ya existe, verifique',  'warning');
        obj.value = "";
        GI("finCveTipoFinal").value =- 1;
        //GI("finFolioFinalidaAnteproy").value = "";
        borraCombos("finNumDictador");
        obj.focus();
    }
    
    if(!isNumContrato) {
        //console.log("isDefinedAndNotNull(isNumContrato) && !isNumContrato");

        var fxp = {};
        fxp.id = "fideicomitentesXProyecto";
        //fxp.Proyecto = GI("paramfinNumContrato").value;
        //fxp.Status = GI("finCveTipoFinal").value;
        var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(fxp);     
        
        console.log("URL: "+url);
        makeAjaxRequest(url, "HTML", loadComboX);    
    }*/
    
    hideWaitLayer();
}

/////////////////////////////////////////////////////////////////////////
//Función para obtener el Nombre del Dictador
function obtieneNombre(combo) {
  if(combo.value != -1)
    GI("finNomDictador").value = combo.options[combo.selectedIndex].text;
  else
    GI("finNomDictador").value = "";
}

////////////////////////////////////////////////////////////////////
//Funciones para cargar el combo Fideicomitente/Mandante luego de haber colocado un número de Fideicomiso
function cargaParamComboMandante(obj,usoSetValuesFormObject){
    alert("Param= "+obj.value);
  usarSetValuesFormObject = usoSetValuesFormObject;
  parametroComboMandante = JSON.parse("{\"AFB_ANTEPROYECTO\": " +obj.value + "}"); 
  //parametroComboMandante = JSON.parse("{\"AFB_ANTEPROYECTO\": " +GI("paramfinNumContrato").value + "}");
  SA(GI("finNumDictador"),"next","asignaMandante");
  loadElement(GI("finNumDictador"));
}

function asignaMandante(){
  if(usarSetValuesFormObject)
  {
    setValuesFormObject(catFinalidades.getCatalogo());
  }
  else
    GI("finNumDictador").selectedIndex=0;
  
  formsLoaded();
}
// Valida exista el proyecto



function mostrarDatosInformativos() { //parametroPantalla
    GI("txtNomProyecto").value="";
    //showWaitLayer();
    //esta es la buena 
    consultaDatosInformativos.numAnteproyecto = GI("paramfinNumContrato").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
}

function insertaDatosInformativos(obj, result) {
    //var objResult = JSON.parse(result);
    //GI("txtNomProyecto").value=objResult[0].antNomNegocio;
    hideWaitLayer();
}

function CargaComboCuentas()
{
  var valor = GI("fciNumFideicomiso").value;
  
  fideo = JSON.parse("{\"fideso\":"+((valor!="")?valor:"0")+"}");
  SA(GI("fciCtaRel"),"param","fideo");
  SA(GI("fciCtaRel"),"next","");
   
  loadElement(GI("fciCtaRel")); 
}

//////////////////////////////////////////////////////////////////////////////
//Funciones para la tercera pantalla
var opcionPrincipal;
var vFideicomiso;
var vCuenta;
var vTipoCuenta;
function cargaPrincipalPantallasAlternas(opcion) {
  showWaitLayer();
  opcionPrincipal=opcion;
  vFideicomiso=GI("fciNumFideicomiso").value;
  vCuenta=GI("fciNumCta").value;
  vTipoCuenta=GI("fciTipoCta").value;
  if(opcion==1){
      loadDynamicJS (ctxRoot + "/modules/Administracion/RelacionDeServicios/PrincipalFinalidadesContrato.js");
      var urlCliente = ctxRoot + "/modules/Administracion/RelacionDeServicios/PrincipalFinalidadesContrato.do";
      makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoMiembrosComiteTecnico, GI("fciNumFideicomiso").value);
  }
  else if(opcion==2){
      loadDynamicJS (ctxRoot + "/modules/Administracion/Firmantes/PrincipalFinalidadesContrato.js");
      var urlCliente = ctxRoot + "/modules/Administracion/Firmantes/PrincipalFinalidadesContrato.do";
      makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoMiembrosComiteTecnico, GI("fciNumFideicomiso").value);
  }
  else{
      loadDynamicJS (ctxRoot + "/modules/Administracion/EjecutivosDeContacto/PrincipalFinalidadesContrato.js");
      var urlCliente = ctxRoot + "/modules/Administracion/EjecutivosDeContacto/PrincipalFinalidadesContrato.do";
      makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoMiembrosComiteTecnico, GI("fciNumFideicomiso").value);
  }  
  
}


function despliegaPantallaMantenimientoMiembrosComiteTecnico(obj, result) {
    GI("dvPantalla").innerHTML = result;
    //alert(obj)
    GI("paramNumFideicomiso").value=vFideicomiso;
    GI("paramCuenta").value=vCuenta;
    GI("paramTipoCuenta").value=vTipoCuenta;
    
    
    deshabilitaPK("paramNumFideicomiso".split(","));
    consultar(GI("cmdAceptar"), GI('frmDatosFinalidadesContratoConsulta'), false);
    hideWaitLayer(); 
}

//////////////////////////////////////////////////////////////////////////////


function doDownload() {
    var tablaConsulta = GI('tablaRegistrosFinalidadesContrato');
    var rows = tablaConsulta.getElementsByTagName("tr");

    if(rows.length <= 0) {
        Swal.fire('Aviso', 'No se encontraron registros!',  'warning');        
    } else {
        var datosConsulta = getParameters(GI('frmDatosFinalidadesContratoConsulta'));
        datosConsulta.id = "muestraDatosCuentasInversion";
        var jsonParam = JSON.stringify(datosConsulta);
        GI('jsonExport').value = jsonParam;
        GI('frmExport').submit();
    }
}

