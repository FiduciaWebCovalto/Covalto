//Version de Formalizacion/Proyectos
var catFinalidades = new Catalogo("mx.com.inscitech.fiducia.domain.FinalidaAnteproy");

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;
var isNumContrato = true;

var fecha = new Date();
var fecha1 = new Date();
var fecha2 = new Date();
var fecha3 = new Date();

var clavesCombo164 = JSON.parse("{\"llaveClave\":164}");
var consultaDatosInformativos = JSON.parse("{\"id\":\"muestraNombreAnteproyecto\",\"numAnteproyecto\":0}");
var usarSetValuesFormObject = null;

initForms();

var tablaFinalidadesContratoData = new Array();
tablaFinalidadesContratoData[0] = "finNumContrato,90px";
tablaFinalidadesContratoData[1] = "antNumContrato,90";
//tablaFinalidadesContratoData[2] = "finCveTipoFinal,200px";
//tablaFinalidadesContratoData[3] = "finNumDictador,100px";
tablaFinalidadesContratoData[2] = "finTxtComentario,300px";
tablaFinalidadesContratoData[3] = "finCveStFinalid,90px";
tablaFinalidadesContratoData[4] = "finFolioFinalida,80px";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var fvMantenimientoFinalidades = new FormValidator();

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalFinalidadesContrato() {
  onButtonClickPestania("Formalizacion.PrincipalFinalidadesContrato","");
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catFinalidades.getCatalogo());
}

function limpiar(objForma){
  RF(objForma);
  catFinalidades = new Catalogo("mx.com.inscitech.fiducia.domain.FinalidaAnteproy");
  asignaEtiqueta("txtNomProyecto","");
  pkInfo = null;
}

function operacionExitosa(el, result) {
  var objError = JSON.parse(el);
  if(objError.tipoError === "ERROR") {
      alert(objError.mensajeError + " Error: " + objError.detalleError);
  } else {
      Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  }
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
    var urlCliente = ctxRoot + "/modules/Formalizacion/MantenimientoFinalidadesContrato.do";
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
    inputField     :    "finNomDictador",   // id of the input field
    button         :    "finNomDictador",
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
  loadCatalogo();
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
    deshabilitaPK("finNumContrato".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmDatosFinalidadesContratoMantenimiento"));                  //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  //Mostrar el nombre del fiso (informativo)
  alert(GI("paramfinNumContrato").value)
  consultaNombreFideicomiso("txtNomProyecto",GI("paramfinNumContrato"));
  
  cargaParamComboMandante(GI("paramfinNumContrato"),true);
  formsLoaded();
}

function AltaOModificaInfo() {
    validaExistenciaProyectoConstituido.proyecto = GI("finNumContrato").value;
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
/*function mostrarDatosInformativos() {
  showWaitLayer();
  var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaContrato\",\"numContrato\":0}");
  validacionAlta.numContrato = GI("paramfinNumContrato").value;
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
  makeAjaxRequest(url, "HTML", verificarAlta, GI("paramfinNumContrato"));
}*/

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
    
    if(GI("finNumContrato").value != "") { // && GI("finFolioFinalidaAnteproy").value != -1
        //showWaitLayer();
        
        var validacionExistenciaRegistro = {};
        validacionExistenciaRegistro.id = "verificaExistenciaContratoProspecto2";
        validacionExistenciaRegistro.numContrato = GI("finNumContrato").value;
        //validacionExistenciaRegistro.cveTipoFinal = GI("finCveTipoFinal").value;
        var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(validacionExistenciaRegistro);     
        
        console.log("URL: "+url);
        makeAjaxRequest(url, "HTML", verificacionExistenciaRegistroFunction);    
        
    }
}

function loadComboX(obj, result) {
    console.log("loadComboX: " + result);
    loadComboElement(GI('finNumDictador'), result);
}

function verificacionExistenciaRegistroFunction(obj, result) {
    //console.log("verificacionExistenciaRegistroFunction");
    //console.log("Result VERF:"+result);
    //console.log("isNumContrato: " + isNumContrato);
//alert(result)
  var objResult = JSON.parse(result);
  if(objResult[0].ctoNumContrato == 0)
  {
    Swal.fire('Aviso', 'El Proyecto no existe, verifique',  'warning');
    GI("finNumContrato").value="";
    GI("finNumContrato").focus();
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
// Valida exista el proyecto



function mostrarDatosInformativos() { //parametroPantalla
    GI("txtNomProyecto").value="";
    //showWaitLayer();
    //esta es la buena 
   /* consultaDatosInformativos.numAnteproyecto = GI("paramfinNumContrato").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);*/
}

function insertaDatosInformativos(obj, result) {
    //var objResult = JSON.parse(result);
    //GI("txtNomProyecto").value=objResult[0].antNomNegocio;
    hideWaitLayer();
}

//Funciones para la funcionalidad de la Fecha
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

function isValidDateSpecial(date)
{
  var today = new Date();
  if(date>today)
    return false;
  else
    return false;
}



function descomponeFecha(objOriginal,diaCopia,mesCopia,anoCopia)
{
  var fecha=objOriginal.value;
  fecha=fecha.toString();
  fecha=fecha.split("/");
  
  diaCopia.value=fecha[0];
  mesCopia.value=fecha[1];
  anoCopia.value=fecha[2];
}

function reuneFechas() {
  GI("txtFecha1").value=GI("antDiaConmod1").value+"/"+GI("antMesConmod1").value+"/"+GI("antAnoConmod1").value;
  GI("txtFecha2").value=GI("antDiaConmod2").value+"/"+GI("antMesConmod2").value+"/"+GI("antAnoConmod2").value;
  GI("txtFecha3").value=GI("antDiaConmod3").value+"/"+GI("antMesConmod3").value+"/"+GI("antAnoConmod3").value;
}


function validaModificaConstituidoR(obj, result) {
    var objResult = JSON.parse(result);
    const existe=objResult[0].existe;
    if(existe==1){
        Swal.fire('error', 'El Proyecto ya se constituyo',  'error');
    }    
    else{
        catFinalidades.setOnUpdate(operacionExitosa);
        if(operacion == ALTA && fvMantenimientoFinalidades.checkForm())//Se trata de una alta
        {
        //console.log(JSON.stringify(fvMantenimientoFinalidades));
        //Swal.fire('Aviso', 'Intento de registro',  'warning');
        //showWaitLayer();
        catFinalidades.altaCatalogo(true);
        }
        else if(operacion == MODIFICAR && fvMantenimientoFinalidades.checkForm())//Se trata de una modificación
        {
        //showWaitLayer();
        catFinalidades.modificaCatalogo(true);
        }  
    }    
}