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
tablaFinalidadesContratoData[0] = "semaforo,30px";
tablaFinalidadesContratoData[1] = "antNumProspecto,100px";
tablaFinalidadesContratoData[2] = "antNumContrato,100px";
tablaFinalidadesContratoData[3] = "ftaAprobacion,110px";
tablaFinalidadesContratoData[4] = "ftaContrato,100px";
tablaFinalidadesContratoData[5] = "ftaFines,110px";
tablaFinalidadesContratoData[6] = "ftaPolita,110px";
tablaFinalidadesContratoData[7] = "ftaHonorarios,110px";
tablaFinalidadesContratoData[8] = "ftaAprobHonorarios,130px";
tablaFinalidadesContratoData[9] = "ftaFiscal,100px";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var fvMantenimientoFinalidades = new FormValidator();

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla

function ejecutaFuncionConstitucion(){
    if(pkInfo==null)
        Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
    else{    
      var objParametros = JSON.parse("{\"id\":\"funcionConstitucion\"}");
      eval("objParametros.Prospecto=" + pkInfo.ftaNumProspecto);
      eval("objParametros.Fideicomiso=" + pkInfo.antNumContrato);
      eval("objParametros.ContabilidadDetallada=0");
      eval("objParametros.EnvioMensajeria=0" );
      eval("objParametros.FideicomisoFoseg=0");
      eval("objParametros.FechaConstitucion=''");
      eval("objParametros.NumAdministradorResponsable=0");
      eval("objParametros.NomAdministradorResponsable=''");
      eval("objParametros.Comentarios=''");
      
      var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objParametros);
     // alert(url)
      makeAjaxRequest(url, "HTML", respuestaFuncionConstitucion, null);
    }  
}

function respuestaFuncionConstitucion(obj, result){
//alert(result)
  var res=JSON.parse(result).resultado;
  switch(res){
    case 0:
      Swal.fire('Aviso', 'Proceso satisfactorio',  'warning');
      break;
    case 1:
      Swal.fire('Aviso', 'Faltan Etapas por Completar!',  'warning');
      break;      
    case -1:
      Swal.fire('Aviso', 'Operacion No Realizada',  'warning');
      break;
    default:
      alert("Error: "+res);
  }
  cargaPrincipalFinalidadesContrato();
  hideWaitLayer();
}


function cargaPrincipalFinalidadesContrato() {
  onButtonClickPestania("Formalizacion.Tablero.PrincipalFinalidadesContrato","");
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catFinalidades.getCatalogo());
    consultaExistenciaDoctoBaja.fiso = pkInfo.antNumContrato;
    consultaExistenciaDoctoBaja.folio = eval(0);
    consultaExistenciaDoctoBaja.persona = pkInfo.ftaNumProspecto;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaExistenciaDoctoBaja);
    makeAjaxRequest(url, "HTML", ActivaDesactivaConstitucion, null);   
}
function ActivaDesactivaConstitucion(obj, result) {
  var objResult = JSON.parse(result);
  const submitBtn = document.getElementById('cmdActiva');
  const VerBtn = document.getElementById('cmdDocumento');
  
    var existe=objResult[0].existe;
    if(existe==0){
        submitBtn.disabled = true;
        VerBtn.disabled=true;
        boton.disabled=false;
    }
    else{
        boton.disabled=true;
        submitBtn.disabled =false;
        VerBtn.disabled=false;
    }
    hideWaitLayer();
}

function limpiar(objForma){
  RF(objForma);
  catFinalidades = new Catalogo("mx.com.inscitech.fiducia.domain.FinalidaAnteproy");
  asignaEtiqueta("txtNomProyecto","");
  pkInfo = null;
}

function operacionExitosa() {
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
    var urlCliente = ctxRoot + "/modules/Formalizacion/Inversion/MantenimientoFinalidadesContrato.do";
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
        validacionExistenciaRegistro.id = "verificaExistenciaFinalidadesAdmon2";
        validacionExistenciaRegistro.numContrato = GI("finNumContrato").value;
        //validacionExistenciaRegistro.cveTipoFinal = GI("finCveTipoFinal").value;
        var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(validacionExistenciaRegistro);     
        
        console.log("URL: "+url);
        makeAjaxRequest(url, "HTML", verificacionExistenciaRegistroFunction);    
        
        if(GI("finNumContrato").value != "" && isNumContrato) {
            mostrarDatosInformativos(1);
        } else if(GI("finNumContrato").value == "" && isNumContrato) {
            asignaEtiqueta("txtNomProyecto","");
            //GI("finFolioFinalidaAnteproy").value = "";
            borraCombos("finNumDictador");
        }
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

    var objResult = JSON.parse(result);
   /* if(objResult[0].existeRegistro > 0) {
        //Swal.fire('Aviso', 'El Registro ya existe, verifique',  'warning');
        obj.value = "";
        //GI("finCveTipoFinal").value =- 1;
        //GI("finFolioFinalidaAnteproy").value = "";
        borraCombos("finNumDictador");
        obj.focus();
    }*/
    
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
// Valida exista el proyecto



function mostrarDatosInformativos() { //parametroPantalla
    GI("txtNomProyecto").value="";
}

function insertaDatosInformativos(obj, result) {
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
var consultaExistenciaDoctoBaja = 
JSON.parse("{\"id\":\"qryValidaBajaDocumento\"}");
function validaDocumento(){
    if(pkInfo!=null){
            consultaExistenciaDoctoBaja.fiso = pkInfo.antNumContrato;
            consultaExistenciaDoctoBaja.folio = eval(0);
            consultaExistenciaDoctoBaja.persona = pkInfo.ftaNumProspecto;
            var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaExistenciaDoctoBaja);
            makeAjaxRequest(url, "HTML", validaExistenciaDoctoBaja, null);    
    }    
    else 
        Swal.fire('warning', 'Seleccione un Documento de la Lista.',  'warning');
}

function validaExistenciaDoctoBaja(obj, result) {
  var objResult = JSON.parse(result);
    var existe=objResult[0].existe;
    if(existe==0){
        Swal.fire('¡error!', "El Contrato aun no se encuentra en el Expediente Electronico", 'error');
        return;
    }
    else{
        generaReporteDoctoContrato(0,pkInfo.antNumContrato,pkInfo.ftaNumProspecto);
    }
    hideWaitLayer();
}

const boton = document.getElementById('btnUpload');
async function uploadFile() {  

    if(pkInfo==null){
        Swal.fire('warning', 'Seleccione un Proyecto de la Lista.',  'warning');
        return;
    }   

    const fileInput = document.getElementById('pdfFile');
    const statusMessage = document.getElementById('statusMessage');
    // 1. Recuperar credenciales del almacenamiento local
    
    if (fileInput.files.length === 0){
    Swal.fire('Eror', 'No ha seleccionado ningun archivo',  'error');
    return;
    } 
    const submitBtn = document.getElementById('cmdActiva');
    const VerBtn = document.getElementById('cmdDocumento');
    // Crear FormData para enviar archivos vía AJAX
    const formData = new FormData();
    formData.append('file', fileInput.files[0]);
    formData.append('id', 0);
    formData.append('fiso', pkInfo.antNumContrato);
    formData.append('persona', pkInfo.ftaNumProspecto);
    const token = localStorage.getItem('token'); 
    const usuario = localStorage.getItem('usuario'); 

    formData.append('token', token);
    formData.append('usuario', usuario);
    console.log('id'+'0');
    console.log('fiso'+pkInfo.antNumContrato);
    console.log('file'+fileInput.files[0]);
    console.log('persona'+pkInfo.ftaNumProspecto);
    
    statusMessage.innerHTML = '<div class="alert alert-info">Subiendo...</div>';

    try {
    
    const response = await 
    fetch('uploadServlet', {
    method: 'POST',
    body: formData
    });
    
    const result = await response.json();
    console.log('Respuesta del Servlet:', result);
    
        if (result=="200") {                    
            statusMessage.innerHTML = 'Archivo subido con éxito!';
            statusMessage.style.color = 'green';
            submitBtn.disabled = false;
            VerBtn.disabled=false;
            return;
        } else if (result=="800")
        {
            statusMessage.innerHTML = 'El archivo ya se subio';
            statusMessage.style.color = 'red';
            submitBtn.disabled = true;
            VerBtn.disabled=true;
        }    
    }
    catch (error) {
    statusMessage.innerHTML = 'Error al subir el archivo.';
    statusMessage.style.color = 'red';
    submitBtn.disabled = true;
    VerBtn.disabled=true;
    }
}
// 3. Agregar el evento clic usando async
boton.addEventListener('click', async () => {
    event.preventDefault();
    await uploadFile();
});
function rowInstruccion(row) {
    row.children[1].innerHTML = '<img src="imagenes\\table\\bullets\\' + row.children[1].innerHTML + '.png">';
}