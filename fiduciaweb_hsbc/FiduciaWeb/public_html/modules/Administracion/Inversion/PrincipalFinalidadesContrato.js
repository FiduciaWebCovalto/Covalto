var catFinalidades = new Catalogo("mx.com.inscitech.fiducia.domain.Finalida");

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;

var fecha = new Date();
var fecha1 = new Date();
var fecha2 = new Date();
var fecha3 = new Date();

var clavesCombo164 = JSON.parse("{\"llaveClave\":164}");
var usarSetValuesFormObject = null;
//GI("paramNumFiso").value=sessionStorage.getItem('sesFideicomiso');
initForms();

var tablaFinalidadesContratoData = new Array();
tablaFinalidadesContratoData[0] = "finNumContrato,90px";
//tablaFinalidadesContratoData[2] = "finCveTipoFinal,200px";
//tablaFinalidadesContratoData[3] = "finNumDictador,100px";
tablaFinalidadesContratoData[1] = "finTxtComentario,300px";
tablaFinalidadesContratoData[2] = "finCveStFinalid,90px";
tablaFinalidadesContratoData[3] = "finFolioFinalida,80px";


var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var fvMantenimientoFinalidades = new FormValidator();

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalFinalidadesContrato() {
  onButtonClickPestania("Administracion.Inversion.PrincipalFinalidadesContrato","");
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catFinalidades.getCatalogo());
}

function limpiar(objForma){
  RF(objForma);
  catFinalidades = new Catalogo("mx.com.inscitech.fiducia.domain.Finalida");
  asignaEtiqueta("nomFideicomiso","");
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
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Administracion/Inversion/MantenimientoFinalidadesContrato.do";
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
  
  //deshabilitaPK("finFolioFinalida".split(","));
  loadCatalogo();
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
    deshabilitaPK("finNumContrato,finFolioFinalida".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botï¿½n
    deshabilitaObjetos(GI("frmDatosFinalidadesContratoMantenimiento"));                  //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botï¿½n Regresar
  //Mostrar el nombre del fiso (informativo)
  consultaNombreFideicomiso("nomFideicomiso",GI("finNumContrato"));
  cargaParamComboMandante(GI("finNumContrato"),true);
  formsLoaded();
}

function AltaOModificaInfo() {
  catFinalidades.setOnUpdate(operacionExitosa);
  if(operacion==ALTA && fvMantenimientoFinalidades.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    catFinalidades.altaCatalogo();
  }
  else if(operacion==MODIFICAR && fvMantenimientoFinalidades.checkForm())//Se trata de una modificaciï¿½n
  {
    showWaitLayer();
    catFinalidades.modificaCatalogo();
  }
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    catFinalidades.setOnUpdate(operacionExitosa);
    showWaitLayer();
    eliminaCatalogo(catFinalidades);
  }
}


///////////////////////////////////////////////////////////
function mostrarDatosInformativos() {
  showWaitLayer();
  var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaContrato\",\"numContrato\":0}");
  validacionAlta.numContrato = GI("finNumContrato").value;
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
  makeAjaxRequest(url, "HTML", verificarAlta, GI("finNumContrato"));
}

function verificarAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoNumContrato > 0)
  {
    var validacionAlta2 = JSON.parse("{\"id\":\"verificaSeaActivo\",\"numContrato\":0}");
    validacionAlta2.numContrato = GI("finNumContrato").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta2);
    makeAjaxRequest(url, "HTML", verificarAlta2, obj);
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no existe, verifique',  'warning');
    asignaEtiqueta("nomFideicomiso","");
    GI("finFolioFinalida").value = "";
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
    consultaNombreFideicomiso("nomFideicomiso",obj);
    
    //Agregar el nï¿½mero de la Finalidad (Incremental)
    var SecNumFinalida = JSON.parse("{\"id\":\"numSecNumFinalida\",\"NumFiso\":0}");
    SecNumFinalida.NumFiso=GI("finNumContrato").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(SecNumFinalida);
    makeAjaxRequest(url, "HTML", agregarFinalida, obj);
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no estï¿½ ACTIVO',  'warning');
    asignaEtiqueta("nomFideicomiso","");
    GI("finFolioFinalida").value = "";
    obj.value="";
    borraCombos("finNumDictador");
    obj.focus();
    hideWaitLayer();
  }
}

function agregarFinalida(obj, result) {
  var objResult = JSON.parse(result);
  GI("finFolioFinalida").value=objResult[0].secNumFinalida;
  
  cargaParamComboMandante(obj,false);
}

/////////////////////////////////////////////////////////////////////////
//Verificar al intentar dar de alta si el Registro aï¿½n no existe
function verificacionExistenciaRegistro(isNumContrato) {
  if(GI("finNumContrato").value!=""  && GI("finFolioFinalida").value!=-1)
  {
    var validacionExistenciaRegistro = JSON.parse("{\"id\":\"verificaExistenciaFinalidadesAdmon\",\"numContrato\":0,\"cveTipoFinal\":0,\"folioFinalida\":0}");
    validacionExistenciaRegistro.numContrato = GI("finNumContrato").value;
    validacionExistenciaRegistro.folioFinalida = GI("finFolioFinalida").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionExistenciaRegistro);
    makeAjaxRequest(url, "HTML", verificacionExistenciaRegistroFunction, GI("finNumContrato"));
  }
  if(GI("finNumContrato").value!="" && isNumContrato)
    mostrarDatosInformativos();
  else if(GI("finNumContrato").value=="" && isNumContrato)
  {
    asignaEtiqueta("nomFideicomiso","");
    GI("finFolioFinalida").value = "";
  }
}

function verificacionExistenciaRegistroFunction(obj,result) {
  var objResult = JSON.parse(result);
  if(objResult[0].existeRegistro > 0)
  {
    Swal.fire('Aviso', 'El Registro ya existe, verifique',  'warning');
    obj.value="";
    GI("finFolioFinalida").value="";
    obj.focus();
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
  usarSetValuesFormObject = usoSetValuesFormObject;
  parametroComboMandante = JSON.parse("{\"llaveClaveNumContrato\": " +obj.value + "}");
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
