//Version de Formalizacion/Proyectos
var catFinalidades = new Catalogo("mx.com.inscitech.fiducia.domain.FActosLegales");

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;
var isNumContrato = true;

var clavesCombo1095 = JSON.parse("{\"llaveClave\":1095}");
var clavesCombo1096 = JSON.parse("{\"llaveClave\":1096}");
var clavesCombo1097 = JSON.parse("{\"llaveClave\":1097}");

var consultaDatosInformativos = JSON.parse("{\"id\":\"muestraNombreAnteproyecto\",\"numAnteproyecto\":0}");
var usarSetValuesFormObject = null;

var fecha = new Date();
var fecha1 = new Date();
var fecha2 = new Date();
var fecha3 = new Date();
GI("paramNumFideicomiso").value=sessionStorage.getItem('sesFideicomiso');
initForms();

var tablaFinalidadesContratoData = new Array();
tablaFinalidadesContratoData[0] = "ctoNumContrato,90";
tablaFinalidadesContratoData[1] = "ctoCveTipoNeg,90";
tablaFinalidadesContratoData[2] = "ctoNomContrato,350";
tablaFinalidadesContratoData[3] = "falTipoDocumento,90";
tablaFinalidadesContratoData[4] = "falFolio,90";


var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var fvMantenimientoFinalidades = new FormValidator();

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalFinalidadesContrato() {
  onButtonClickPestania("Administracion.ActosLegales.PrincipalFinalidadesContrato","");
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catFinalidades.getCatalogo());
}

function limpiar(objForma){
  RF(objForma);
  catFinalidades = new Catalogo("mx.com.inscitech.fiducia.domain.FActosLegales");
  asignaEtiqueta("txtNomProyecto","");
  pkInfo = null;
}

function operacionExitosa(el, result) {
  var objError = JSON.parse(el);
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
    var urlCliente = ctxRoot + "/modules/Administracion/ActosLegales/MantenimientoFinalidadesContrato.do";
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
    inputField     :    "falFecha",   // id of the input field
    button         :    "falFecha",
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
    Calendar.setup({
    inputField     :    "falFechaEscritura",   // id of the input field
    button         :    "falFechaEscritura",
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
    Calendar.setup({
    inputField     :    "falFechaInscripcion",   // id of the input field
    button         :    "falFechaInscripcion",
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
    
    deshabilitacampospk(pkInfo.falTipoDocumento);
  //deshabilitaPK("finFolioFinalidaAnteproy".split(","));
}

function loadCatalogo() {
  catFinalidades.setOnUpdate(catLoaded);
  if(operacion==MODIFICAR || operacion==CONSULTAR)
    catFinalidades.buscaCatalogoPK(false);
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botï¿½n Aceptar y Cancelar
    formsLoaded();
  }
}

function catLoaded() {
  if(operacion==MODIFICAR)//Si se trata de una modificaciï¿½n, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el botï¿½n Aceptar
    deshabilitaPK("falNumFideicomiso".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botï¿½n
    deshabilitaObjetos(GI("frmDatosFinalidadesContratoMantenimiento"));                  //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botï¿½n Regresar
  //Mostrar el nombre del fiso (informativo)
  //alert(GI("paramfinNumContrato").value)
  //consultaNombreFideicomiso("txtNomProyecto",GI("paramfinNumContrato"));
  
  //cargaParamComboMandante(GI("paramfinNumContrato"),true);
  formsLoaded();
}

function AltaOModificaInfo() {
  catFinalidades.setOnUpdate(operacionExitosa);
  if(operacion == ALTA && fvMantenimientoFinalidades.checkForm())//Se trata de una alta
  {
    //console.log(JSON.stringify(fvMantenimientoFinalidades));
    //Swal.fire('Aviso', 'Intento de registro',  'warning');
    //showWaitLayer();
    catFinalidades.altaCatalogo(true);
  }
  else if(operacion == MODIFICAR && fvMantenimientoFinalidades.checkForm())//Se trata de una modificaciï¿½n
  {
    //showWaitLayer();
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
    
    //Agregar el nï¿½mero de la Finalidad (Incremental)
    var SecNumFinalida = JSON.parse("{\"id\":\"numSecNumFinalida2\",\"NumFiso\":0}");
    
    SecNumFinalida.NumFiso=GI("paramfinNumContrato").value;

    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(SecNumFinalida);
    makeAjaxRequest(url, "HTML", agregarFinalida, obj);
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no estï¿½ ACTIVO',  'warning');
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
//Verificar al intentar dar de alta si el Registro aï¿½n no existe

function verificacionExistenciaRegistro(isNumContratoReq) {
    isNumContrato = isNumContratoReq;
    
    if(GI("falNumFideicomiso").value != "") { // && GI("finFolioFinalidaAnteproy").value != -1
        //showWaitLayer();
        
        var validacionExistenciaRegistro = {};
        validacionExistenciaRegistro.id = "verificaExistenciaContrato";
        validacionExistenciaRegistro.numContrato = GI("falNumFideicomiso").value;
        //validacionExistenciaRegistro.cveTipoFinal = GI("finCveTipoFinal").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionExistenciaRegistro);     
        
        console.log("URL: "+url);
        makeAjaxRequest(url, "HTML", verificacionExistenciaRegistroFunction);    
        
    }
}

function loadComboX(obj, result) {
    console.log("loadComboX: " + result);
    loadComboElement(GI('finNumDictador'), result);
}

function verificacionExistenciaRegistroFunction(obj, result) {
    console.log("verificacionExistenciaRegistroFunction");
    console.log("Result VERF:"+result);
    console.log("isNumContrato: " + isNumContrato);

  var objResult = JSON.parse(result);
  if(objResult[0].ctoNumContrato == 0)
  {
    Swal.fire('Aviso', 'El Fideicomiso no existe, verifique',  'warning');
    GI("falNumFideicomiso").value="";
    GI("falNumFideicomiso").focus();
  }
    
    hideWaitLayer();
}

/////////////////////////////////////////////////////////////////////////
//Funciï¿½n para obtener el Nombre del Dictador
function obtieneNombre(combo) {
  if(combo.value != -1)
    GI("finNomDictador").value = combo.options[combo.selectedIndex].text;
  else
    GI("finNomDictador").value = "";
}

////////////////////////////////////////////////////////////////////
//Funciones para cargar el combo Fideicomitente/Mandante luego de haber colocado un nï¿½mero de Fideicomiso
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

function deshabilitacampos(obj) {
//alert(obj)
//alert(obj.value.indexOf("ESCRITURA PUBLICA"))
//alert(obj.value.indexOf("CONTRATO PRIVADO"))
    console.log("Valor de Combo "+obj.value.indexOf("ESCRITURA PUBLICA"));
    console.log("Valor de Combo "+obj.value.indexOf("CONTRATO PRIVADO"));
    if(obj.value.indexOf("CONTRATO PRIVADO")==0){
//alert(obj.value);        
        //deshabilitaPK("falTipoConvenio,falComentarios,falFecha".split(","));
        
        GI("falTipoConvenio").disabled=false;
        GI("falComentarios").disabled=false;
        GI("falFecha").disabled=false;        

        GI("falNumEscritura").disabled=true;        
        GI("falFechaEscritura").disabled=true;
        GI("falTipoEscritura").disabled=true;
        GI("falNombreNotario").disabled=true;
        GI("falNumeroNotario").disabled=true;
        GI("falCiudadNotaria").disabled=true;
        GI("falEstadoNotaria").disabled=true;
        GI("falFechaInscripcion").disabled=true;
        GI("falLugarRegistro").disabled=true;
        GI("falNumFolio").disabled=true;
        GI("falPartida").disabled=true;
        GI("falVolumen").disabled=true;
        GI("falFojas").disabled=true;
        GI("falLibro").disabled=true;
        GI("falSeccion").disabled=true;
    }
    else if(obj.value.indexOf("ESCRITURA PUBLICA")==0){
        //deshabilitaPK("falTipoConvenio,falNumEscritura,falFechaEscritura,falTipoEscritura,falNombreNotario,falNumeroNotario,falCiudadNotaria,falEstadoNotaria,falFechaInscripcion,falLugarRegistro,falNumFolio,falPartida,falVolumen,falFojas,falLibro,falSeccion".split(","));
        GI("falNumEscritura").disabled=false;                
        GI("falFechaEscritura").disabled=false;
        GI("falTipoEscritura").disabled=false;
        GI("falNombreNotario").disabled=false;
        GI("falNumeroNotario").disabled=false;
        GI("falCiudadNotaria").disabled=false;
        GI("falEstadoNotaria").disabled=false;
        GI("falFechaInscripcion").disabled=false;
        GI("falLugarRegistro").disabled=false;
        GI("falNumFolio").disabled=false;
        GI("falPartida").disabled=false;
        GI("falVolumen").disabled=false;
        GI("falFojas").disabled=false;
        GI("falLibro").disabled=false;
        GI("falSeccion").disabled=false;  
        
        GI("falTipoConvenio").disabled=true;
        GI("falComentarios").disabled=true;
        GI("falFecha").disabled=true;           
    }
}

function deshabilitacampospk(obj) {
//alert(obj)
//alert(obj.value.indexOf("ESCRITURA PUBLICA"))
//alert(obj.value.indexOf("CONTRATO PRIVADO"))
     if(obj.value.indexOf("CONTRATO PRIVADO")==0){
//alert(obj.value);        
        //deshabilitaPK("falTipoConvenio,falComentarios,falFecha".split(","));
        
        GI("falTipoConvenio").disabled=false;
        GI("falComentarios").disabled=false;
        GI("falFecha").disabled=false;        

        GI("falNumEscritura").disabled=true;        
        GI("falFechaEscritura").disabled=true;
        GI("falTipoEscritura").disabled=true;
        GI("falNombreNotario").disabled=true;
        GI("falNumeroNotario").disabled=true;
        GI("falCiudadNotaria").disabled=true;
        GI("falEstadoNotaria").disabled=true;
        GI("falFechaInscripcion").disabled=true;
        GI("falLugarRegistro").disabled=true;
        GI("falNumFolio").disabled=true;
        GI("falPartida").disabled=true;
        GI("falVolumen").disabled=true;
        GI("falFojas").disabled=true;
        GI("falLibro").disabled=true;
        GI("falSeccion").disabled=true;
    }
    else if(obj.indexOf("ESCRITURA PUBLICA")==0){
        //deshabilitaPK("falTipoConvenio,falNumEscritura,falFechaEscritura,falTipoEscritura,falNombreNotario,falNumeroNotario,falCiudadNotaria,falEstadoNotaria,falFechaInscripcion,falLugarRegistro,falNumFolio,falPartida,falVolumen,falFojas,falLibro,falSeccion".split(","));
        GI("falNumEscritura").disabled=false;                
        GI("falFechaEscritura").disabled=false;
        GI("falTipoEscritura").disabled=false;
        GI("falNombreNotario").disabled=false;
        GI("falNumeroNotario").disabled=false;
        GI("falCiudadNotaria").disabled=false;
        GI("falEstadoNotaria").disabled=false;
        GI("falFechaInscripcion").disabled=false;
        GI("falLugarRegistro").disabled=false;
        GI("falNumFolio").disabled=false;
        GI("falPartida").disabled=false;
        GI("falVolumen").disabled=false;
        GI("falFojas").disabled=false;
        GI("falLibro").disabled=false;
        GI("falSeccion").disabled=false;  
        
        GI("falTipoConvenio").disabled=true;
        GI("falComentarios").disabled=true;
        GI("falFecha").disabled=true;           
    }
}

function mayusculas(e) {
    e.value = e.value.toUpperCase();
}