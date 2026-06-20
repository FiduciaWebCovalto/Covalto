//Version de Formalizacion/Proyectos
var catFinalidades = new Catalogo("mx.com.inscitech.fiducia.domain.FRelacionDeServicios");

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;
var isNumContrato = true;
var cmbFormaManejoParam = JSON.parse("{\"chido\":24}");

var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var clavesComboServicio = JSON.parse("{\"llaveClave\":1129}");
var clavesCombo1114 = JSON.parse("{\"llaveClave\":1114}");
var clavesCombo1103 = JSON.parse("{\"llaveClave\":1103}");
var consultaDatosInformativos = JSON.parse("{\"id\":\"muestraNombreAnteproyecto\",\"numAnteproyecto\":0}");
var usarSetValuesFormObject = null;
var fideo = JSON.parse("{\"fideicomiso\":0}")
initForms();


var tablaFinalidadesContratoData = new Array();
tablaFinalidadesContratoData[0] = "frdsIdFidei,90";
tablaFinalidadesContratoData[1] = "frdsServicio,100";
tablaFinalidadesContratoData[2] = "frdsContratoafiliacion,220";
tablaFinalidadesContratoData[3] = "frdsDetalle,220";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var fvMantenimientoFinalidades = new FormValidator();

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalRelacionDeServicios() {
  onButtonClickPestania("Administracion.RelacionDeServicios.PrincipalFinalidadesContrato","");
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catFinalidades.getCatalogo());
}

function limpiar(objForma){
  RF(objForma);
  catFinalidades = new Catalogo("mx.com.inscitech.fiducia.domain.FRelacionDeServicios");
  //asignaEtiqueta("txtNomProyecto","");
  pkInfo = null;
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalFinalidadesContrato();
  hideWaitLayer();
}

//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda pantalla
var vFideicomiso;
var vCuenta;
var vTipoCuenta;
function cargaMantenimientoFinalidadesContrato(tipoPantalla) {
  vFideicomiso=GI("paramNumFideicomiso").value;
  vCuenta=GI("paramCuenta").value;
  vTipoCuenta=GI("paramTipoCuenta").value;

  if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    //showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Administracion/RelacionDeServicios/MantenimientoFinalidadesContrato.do";
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

    GI("frdsIdFidei").value=vFideicomiso;
    GI("frdsNo").value=vCuenta;
    GI("frdsTipoCta").value=vTipoCuenta;
  
  loadCatalogo();
  deshabilitaPK("frdsIdFidei,frdsNo,frdsTipoCta".split(","));
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
    deshabilitaPK("frdsIdFidei,frdsNo,frdsTipoCta,frdsServicio".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmDatosFinalidadesContratoMantenimiento"));                  //Deshabilita objetos (excepto botones)
  }
  deshabilitaPK("frdsIdFidei,frdsNo,frdsTipoCta,frdsServicio".split(","));
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();
  hideWaitLayer();
}

function AltaOModificaInfo() {
  showWaitLayer();
  catFinalidades.setOnUpdate(operacionExitosa);
  if(operacion == ALTA && fvMantenimientoFinalidades.checkForm())//Se trata de una alta
  {
    catFinalidades.altaCatalogo(true);
  }
  else if(operacion == MODIFICAR && fvMantenimientoFinalidades.checkForm())//Se trata de una modificación
  {
    catFinalidades.modificaCatalogo(true);
  }
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    
    catFinalidades.setOnUpdate(operacionExitosa);
    //showWaitLayer();
    //eliminaCatalogo(catFinalidades);
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


function cargaMantenimientoFinalidadesContrato2() {
  vFideicomiso=GI("frdsIdFidei").value;
  vCuenta=GI("frdsNo").value;
  vTipoCuenta=GI("frdsTipoCta").value;
  var urlCliente = ctxRoot + "/modules/Administracion/RelacionDeServicios/PrincipalFinalidadesContrato.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipal, null);
}

function despliegaPantallaPrincipal(obj, result) {
    GI("dvPantalla").innerHTML = result;
    initForms();
    
    //Agregando la funcionalidad del required
    fvMantenimientoFinalidades.setup({
    formName      : "frmDatosFinalidadesContratoMantenimiento",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
    });
    
    GI("paramNumFideicomiso").value=vFideicomiso;
    GI("paramCuenta").value=vCuenta;
    GI("paramTipoCuenta").value=vTipoCuenta;
    
    loadCatalogo();
    deshabilitaPK("paramNumFideicomiso".split(","));
    consultar(GI("cmdAceptar"), GI('frmDatosFinalidadesContratoConsulta'), false);
    hideWaitLayer(); 
}
