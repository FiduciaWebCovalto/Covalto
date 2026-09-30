//Version de Formalizacion/Proyectos
var catFinalidades = new Catalogo("mx.com.inscitech.fiducia.domain.FEvidencias");
var consultaDatosInformativos = JSON.parse("{\"id\":\"conNomProyecto\",\"numFideicomiso\":0}");
var consultaevidencia = JSON.parse("{\"id\":\"conNomEvidencia\",\"numProyecto\":0}");


var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;
var isNumContrato = true;

var clavesCombo164 = JSON.parse("{\"llaveClave\":164}");
//var consultaDatosInformativos = JSON.parse("{\"id\":\"muestraNombreAnteproyecto\",\"numAnteproyecto\":0}");
var usarSetValuesFormObject = null;

initForms();

var tablaFinalidadesContratoData = new Array();
tablaFinalidadesContratoData[0] = "antNumProspecto,90";
tablaFinalidadesContratoData[1] = "antNomNegocio,90";
tablaFinalidadesContratoData[2] = "antCveTipoNeg,350";
tablaFinalidadesContratoData[3] = "antCveClasifPro,90";
tablaFinalidadesContratoData[4] = "prlNomProducto,80";
tablaFinalidadesContratoData[5] = "folio,80";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var fvMantenimientoFinalidades = new FormValidator();

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalFinalidadesContrato() {
  onButtonClickPestania("Formalizacion.Evidencias.PrincipalFinalidadesContrato","");
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catFinalidades.getCatalogo());
}

function limpiar(objForma){
  RF(objForma);
  catFinalidades = new Catalogo("mx.com.inscitech.fiducia.domain.FEvidencias");
  asignaEtiqueta("txtNomProyecto","");
  pkInfo = null;
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
        //showWaitLayer();
        var urlCliente = ctxRoot + "/modules/Formalizacion/Evidencias/MantenimientoFinalidadesContrato.do";
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
  loadCatalogo();
  hideWaitLayer();
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
}

function catLoaded() {
  if(operacion==MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
    deshabilitaPK("fevNumProspecto".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmDatosFinalidadesContratoMantenimiento"));                  //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  //Mostrar el nombre del fiso (informativo)
  //alert(GI("paramfinNumContrato").value)
  //consultaNombreFideicomiso("txtNomProyecto",GI("paramfinNumContrato"));
  
  formsLoaded();
  hideWaitLayer();
}

function AltaOModificaInfo() {
    validaExistenciaProyectoConstituido.proyecto = GI("fevNumProspecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validaExistenciaProyectoConstituido);
    makeAjaxRequest(url, "HTML", validaModificaConstituidoR, null);
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


///////////////////////////////////////////////////////////
function mostrarDatosInformativoscon() {
    if(GI("paramAnteproyecto").value!=""){
        showWaitLayer();
        consultaDatosInformativos.numFideicomiso = GI("paramAnteproyecto").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
        makeAjaxRequest(url, "HTML", insertaDatosInformativoscon, null);        
    }
}

function insertaDatosInformativoscon(obj, result) {
    var objResult = JSON.parse(result)[0];
    if(!isDefinedAndNotNull(objResult)) {
        Swal.fire('Aviso', 'El Proyecto no existe, verifique',  'warning');
        GI("paramAnteproyecto").value="";
    }
     hideWaitLayer();
}

function agregarFinalida(obj, result) {
  var objResult = JSON.parse(result);
  GI("finFolioFinalidaAnteproy").value=objResult[0].secNumFinalida;
  alert("Param= "+obj.value);
  cargaParamComboMandante(obj,false);
}

/////////////////////////////////////////////////////////////////////////
//Verificar al intentar dar de alta si el Registro aún no existe

function insertaDatosInformativos(obj, result) {
    var objResult = JSON.parse(result)[0];
    if(!isDefinedAndNotNull(objResult)) {
        Swal.fire('Aviso', 'El Proyecto no existe, verifique',  'warning');
        GI("fevNumProspecto").value="";
        GI("fevNumProspecto").focus();
       
    }else if(operacion == ALTA){
        consultaevidencia.numProyecto = GI("fevNumProspecto").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaevidencia);
        makeAjaxRequest(url, "HTML", validaexistenciaevidencia, null);  
    }
     hideWaitLayer();
}
function validaexistenciaevidencia(obj, result) {
    var objResult = JSON.parse(result)[0];
    if(isDefinedAndNotNull(objResult)) {
        Swal.fire('Aviso', 'La Evidencia ya existe, verifique',  'warning');
        GI("fevNumProspecto").value="";
        GI("fevNumProspecto").focus();
    }
    hideWaitLayer();
}

function loadComboX(obj, result) {
    console.log("loadComboX: " + result);
    loadComboElement(GI('finNumDictador'), result);
}

function verificacionExistenciaRegistroFunction(obj, result) {
    //console.log("verificacionExistenciaRegistroFunction");
    //console.log("Result VERF:"+result);
    //console.log("isNumContrato: " + isNumContrato);

    var objResult = JSON.parse(result);
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
    }
    
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

function EnvioCorreo() {
    if(pkInfo==null)
        Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
    else
        enviaCorreoWorkFlowProyecto("AREA DE PROYECTO DE NEGOCIO",pkInfo.antNumProspecto,
        "PROYECTO DE NEGOCIO","ETAPA DE PROYECTO CONCLUIDA, LISTA PARA EVALUACION DE COMITE DE ACEPTACION.");
}


var validaExistenciaProyectoConstituido = 
JSON.parse("{\"id\":\"qryValidaConstituido\"}");

function verificacionExistenciaRegistro(isNumContratoReq) {
    validaModificaConstituidoM(GI("fevNumProspecto").value);
}

function validaModificaConstituidoM(proyecto) {
    validaExistenciaProyectoConstituido.proyecto = proyecto;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validaExistenciaProyectoConstituido);
    makeAjaxRequest(url, "HTML", validaModificaConstituidoMR, null); 
}

function validaModificaConstituidoMR(obj, result) {
    var objResult = JSON.parse(result);
    const existe=objResult[0].existe;
    if(existe==1){
        Swal.fire('error', 'El Proyecto ya se constituyo',  'error');
        GI("fevNumProspecto").value="";  
    }    
    
}    

function validaModificaConstituido(proyecto) {
    validaExistenciaProyectoConstituido.proyecto = proyecto;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validaExistenciaProyectoConstituido);
    makeAjaxRequest(url, "HTML", validaModificaConstituidoR, null); 
}

function validaModificaConstituidoR(obj, result) {
    var objResult = JSON.parse(result);
    const existe=objResult[0].existe;
    if(existe==1)
        Swal.fire('error', 'El Proyecto ya se constituyo',  'error');
    else{
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
}