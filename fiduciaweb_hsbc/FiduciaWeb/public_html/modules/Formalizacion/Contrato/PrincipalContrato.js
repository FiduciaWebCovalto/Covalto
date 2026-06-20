var catProspectosAnteproyecto = new Catalogo("mx.com.inscitech.fiducia.domain.Anteproy");
var infoCatalogo = null;

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;

var clavesCombo24  = JSON.parse("{\"llaveClave\":24}");
var clavesCombo31  = JSON.parse("{\"llaveClave\":31}");
var clavesCombo36  = JSON.parse("{\"llaveClave\":36}");
var clavesCombo125 = JSON.parse("{\"llaveClave\":125}");
var clavesCombo148 = JSON.parse("{\"llaveClave\":148}");
var clavesCombo162 = JSON.parse("{\"llaveClave\":162}");
var clavesCombo1003 = JSON.parse("{\"llaveClave\":1003}"); // areas de institucion
var clavesCombo161 = JSON.parse("{\"llaveClave\":161}");
var clavesCombo162 = JSON.parse("{\"llaveClave\":162}");
var clavesCombo1010 = JSON.parse("{\"llaveClave\":1010}"); //Clave de SubProducto
var clavesCombo701 = JSON.parse("{\"llaveClave\":701,\"orderDescripcion\":\"s\"}");

var clavesCombo705 = JSON.parse("{\"NumIndice\":705,\"order\":\"s\"}");
var clavesCombo710 = JSON.parse("{\"NumIndice\":710,\"order\":\"s\"}");
var clavesCombo711 = JSON.parse("{\"NumIndice\":711,\"order\":\"s\"}");
var clavesCombo712 = JSON.parse("{\"NumIndice\":712,\"order\":\"s\"}");
var clavesCombo715 = JSON.parse("{\"NumIndice\":715,\"order\":\"s\"}");

var validacionNoExistaFideicomiso = JSON.parse("{\"id\":\"verificaExistenciaContrato\",\"numContrato\":0}");
var validacion = JSON.parse("{\"id\":\"cuentaAnteproyectosBajaProspectos\",\"numProspecto\":-1,\"numContrato\":0}");
var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaProspecto\",\"numProspecto\":0}");
var validacionAlta2 = JSON.parse("{\"id\":\"verificaExistenciaAnteproyecto\",\"numProspecto\":0}");
var validacionAlta3 = JSON.parse("{\"id\":\"verificaExistenciaProspectoLN\",\"numProspecto\":0}");
var buscaDatos = JSON.parse("{\"id\":\"traeDatosProyecto\",\"numProspecto\":0}");
var determinaContrato = JSON.parse("{\"id\":\"determinaSigContrato\"}"); 
//var parametroMoneda = JSON.parse("{\"llaveClave\":161}");
var vgContenedorDatos=null;

var validacionDepositoArchivos = JSON.parse("{\"id\":\"AnteproyectosDepositoArchivos\",\"numProspecto\":0}");
var AnteproyectosRevFinalidades = JSON.parse("{\"id\":\"AnteproyectosRevFinalidades\",\"numProspecto\":0}");
var AnteproyectosRevHonorarios = JSON.parse("{\"id\":\"AnteproyectosRevHonorarios\",\"numProspecto\":0}");
var AnteproyectosCorreo= JSON.parse("{\"id\":\"AnteproyectosCorreo\",\"numProspecto\":0}");
var tablaProspectosAnteproyectoData = new Array();
tablaProspectosAnteproyectoData[0] = "antNumProspecto,100";
tablaProspectosAnteproyectoData[1] = "antNumContrato,100";
tablaProspectosAnteproyectoData[2] = "antNomNegocio,300";
tablaProspectosAnteproyectoData[3] = "antCveTipoNeg,200";

var operacion = 0;
var numPantalla = 0;
var ncorreo=0;
pkInfo=null;
var fechaApertura = new Date();
var fechaProbableConstitucion = new Date();
var fechaUltimaGestion = new Date();

var fecha1 = new Date();
var fecha2 = new Date();
var fecha3 = new Date();

var parametroComboProducto;
var clavesCombo37;
var usarSetValuesFormObject=false;
var fvMantenimientoAnteproyecto = new FormValidator();

//Variables que pasarán del primero al segundo Tab cuando se de una alta
var numPromotor=null;
var nomNegocio=null;
var numAbogado=null;

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalProspectosAnteproyecto () {
  onButtonClickPestania("Formalizacion.Contrato.PrincipalContrato","");
}

function clickTabla(pk) {
  pkInfo = pk;
  
  cloneObject(pk,catProspectosAnteproyecto.getCatalogo());
}


//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda y tercera pantalla
function cargaMantenimientoProspectosAnteproyectoGenerales(tipoPantalla) {

  if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    if(pkInfo!=null)
      if(pkInfo.prsCveStatus == "CONSTITUIDO" && tipoPantalla==MODIFICAR)
      {
        Swal.fire('Aviso', 'El Prospecto está CONSTITUIDO',  'warning');
        return;
      }
    
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Formalizacion/Contrato/MantenimientoContrato.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoAnteproyecto, null);
  }
}

function cargaMantenimientoProspectosAnteproyectoGeneralesTab() {
  numPantalla = 1;
  showWaitLayer();
  var urlCliente = ctxRoot + "/modules/Formalizacion/Contrato/MantenimientoContrato.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoAnteproyecto, null);
}

function cargaMantenimientoProspectosAnteproyectoCaracteristicasTab(tipoPantalla) {
    operacion = tipoPantalla;
    if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null) {
        Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
        return;
    } else {
        if(pkInfo!=null) {
            if(pkInfo.prsCveStatus == "CONSTITUIDO" && tipoPantalla==MODIFICAR) {
                Swal.fire('Aviso', 'El Prospecto está CONSTITUIDO',  'warning');
                return;
            }
        }
    }
  numPantalla = 2;
  var urlCliente = ctxRoot + "/modules/Formalizacion/Contrato/MantenimientoContrato.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoAnteproyecto, null);
}

function despliegaPantallaMantenimientoAnteproyecto(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  if(numPantalla==1)
  {
    cargaComboClasProd(false);
    
    Calendar.setup({
    inputField     :    "antFechaApertura",   // id of the input field
    button         :    "antFechaApertura",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechaApertura,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
    
    Calendar.setup({
    inputField     :    "antFecProConsti",   // id of the input field
    button         :    "antFecProConsti",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDateSpecial,
    date           :    fechaProbableConstitucion,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
    
    Calendar.setup({
    inputField     :    "antFecGestion",   // id of the input field
    button         :    "antFecGestion",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechaUltimaGestion,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
    
    //Agregando la funcionalidad del required
    fvMantenimientoAnteproyecto.setup({
      formName      : "frmDatosMantenimientoAnteproyectoGenerales",
      tipoAlert     : 1,
      alertFunction : BaloonAlert,
      sendObjToAlert: true
    });
  }
  else if(numPantalla==2)
  { 
    
    Calendar.setup({
    inputField     :    "antFechaContrato",   // id of the input field
    button         :    "antFechaContrato",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechaApertura,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
    
    Calendar.setup({
    inputField     :    "antFechaEscritura",   // id of the input field
    button         :    "antFechaEscritura",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechaApertura,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
    
    //Agregando la funcionalidad del required
    fvMantenimientoAnteproyecto.setup({
      formName      : "frmDatosMantenimientoAnteproyectoCaracteristicas",
      tipoAlert     : 1,
      alertFunction : BaloonAlert,
      sendObjToAlert: true
    });
  }
}

//se recupera informacion de giro y actividad
  function obtenGiro(obj,result){
    // alert(result);
     var resultado = JSON.parse(result)[0];
     //alert(resultado.actNomRama);
     GI("ctoRama").value=resultado.actNomRama;
     //se recupera la informacion de la actividad
      vgContenedorDatos=null;
      vgContenedorDatos=JSON.parse("{\"id\":\"consultaActividades2\"}");
      vgContenedorDatos.numProspecto=numProspecto;
      var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
     // alert(url);
      makeAjaxRequest(url, "HTML", obtenActividad, null);     
  }   
  function obtenActividad(obj,result){
     //alert(result);
     var resultado = JSON.parse(result)[0];
     GI("antNomActividad").value=resultado.prsCveActividad;     
  }   


function loadCatalogo() {
  catProspectosAnteproyecto.setOnUpdate(catLoaded);
  if(operacion==MODIFICAR || operacion==CONSULTAR){
    catProspectosAnteproyecto.buscaCatalogoPK(false);
    //quitaRef();
  }else
  {
    if (numPantalla==1)
      muestraObjs("cmdSiguiente,cmdCancelar"); //Mostrar el botón Siguiente y Cancelar
    else if(numPantalla==2 && numPromotor!=null)   //Asignar los encabezados e inhabilitar la llave primaria y los datos de encabezado
    {
      muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
      GI("antNumProspecto").value=pkInfo.antNumProspecto;
      GI("antNumProspecto").disabled=true;
      GI("antNumPromotor").value=numPromotor;
      GI("antNumPromotor").disabled=true;
      GI("antNomNegocio").value=nomNegocio;
      GI("antNomNegocio").disabled=true;
      GI("antNumAbogado").value=numAbogado;
      GI("antNumAbogado").disabled=true;
    }
    
    formsLoaded();
  }

}
var numProspecto;
function catLoaded() {
  if(operacion==MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
    if(numPantalla==2) { 
        cargaRadiosConMaster("antTipoPublic","antTipoPublic2");
        habilitaDeshabilitaComponentesEscrituraPublica(GI("antTipoPublic").checked);
        consultaDatosNotario();
        
        reuneFechas();                //Integra las fechas de los Convenios Modificatorios
        vgContenedorDatos=null;
        vgContenedorDatos=JSON.parse("{\"id\":\"claveActividad2\"}");
        numProspecto=GI("antNumProspecto").value;
        vgContenedorDatos.numProspecto=GI("antNumProspecto").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
        makeAjaxRequest(url, "HTML", obtenGiro, GI("antNumProspecto"));  
    }
    deshabilitaPK("antNumProspecto".split(","));
    setCargaParams();
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  { 
    
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    muestraObjs("cmdCancelar"); //Mostrar el botón Cancelar
    
    if(numPantalla==1){
        deshabilitaObjetos(GI("frmDatosMantenimientoAnteproyectoGenerales"));
      
    }else if(numPantalla==2)//Para la página de Características
    { //Cargando los radio-botones
      
      cargaRadiosConMaster("antTipoPublic","antTipoPublic2");
      deshabilitaObjetos(GI("frmDatosMantenimientoAnteproyectoCaracteristicas"));                  //Deshabilita objetos (excepto botones)
      consultaDatosNotario();
      
      reuneFechas();                //Integra las fechas de los Convenios Modificatorios
    //se recupera la info del giro
      vgContenedorDatos=null;
      vgContenedorDatos=JSON.parse("{\"id\":\"claveActividad2\"}");
      vgContenedorDatos.numProspecto=GI("antNumProspecto").value;
      var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
      //alert(url);
      makeAjaxRequest(url, "HTML", obtenGiro, null);  
    }
  }
  if(numPantalla==1)  //Sólo en la primer pantalla se carga éste combo
    {
      cargaParamComboProducto(GI("antCveTipoNeg"),GI("antCveClasifPro"),true);
      cargaComboClasProd(true);
    }
    setCargaParams();
  formsLoaded();
}
function setCargaParams(){//prodsForz
    RA(GI("antCveClasifPro"),"onchange");
    vgContenedorDatos=null;
    vgContenedorDatos=JSON.parse("{\"id\":\"prodsForz\"}");
    vgContenedorDatos.numProsp=GI("antNumProspecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
    makeAjaxRequest(url, "HTML", forzaCargaParams, null);
}
function forzaCargaParams(obj, result){
    var resultado = JSON.parse(result)[0];
    GI('antCveClasifPro').value=resultado.antCveClasifPro;
    GI('antCveClasifSubPro').value=resultado.antCveClasifSubPro;
    cargaParamComboProductov2(resultado.prlNumProducto);
}
function AltaOModificaInfo() {
  catProspectosAnteproyecto.setOnUpdate(operacionExitosa);
  
  
  if(operacion==ALTA)// && fvMantenimientoAnteproyecto.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    catProspectosAnteproyecto.altaCatalogo();
    enviaCorreoUNE(GI("antNumProspecto").value);
  }
  else if(operacion==MODIFICAR && fvMantenimientoAnteproyecto.checkForm())//Se trata de una modificación
  {
    showWaitLayer();
    catProspectosAnteproyecto.modificaCatalogo();
  }
}




function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalProspectosAnteproyecto();
  hideWaitLayer();
}

var ProspectoAlta;
function guardaInfoSiguiente() {
  //Para tener toda la información al dar de alta
  if(fvMantenimientoAnteproyecto.checkForm())
  {
    infoCatalogo = catProspectosAnteproyecto.getCatalogo();
    setValuesToObject(infoCatalogo);
    ProspectoAlta=GI("antNumProspecto").value
    pkInfo = JSON.parse("{\"antNumProspecto\":" + GI("antNumProspecto").value+ "}"); 
    //Swal.fire('Aviso', 'llego aki',  'warning')//Guardando los encabezados
    numPromotor=GI("antNumPromotor").value;
    nomNegocio=GI("antNomNegocio").value;
    numAbogado=GI("antNumAbogado").value;
    
    if (operacion==ALTA){
      vgContenedorDatos=null;
      vgContenedorDatos=JSON.parse("{\"id\":\"claveActividad2\"}");
      numProspecto=ProspectoAlta;
      vgContenedorDatos.numProspecto=ProspectoAlta;
      var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
      //alert(url);
      makeAjaxRequest(url, "HTML", obtenGiro, GI("antNumProspecto"));    
    }
    
    //Swal.fire('Aviso', 'Información de Pantalla 1 capturada',  'warning');
    //alert("pantalla 1: " + JSON.stringify(infoCatalogo));
    cargaMantenimientoProspectosAnteproyectoCaracteristicasTab();
  }
}


////////////////////////////////////////////////////////////////////////////////
//Carga el Combo de Producto
function cargaParamComboProducto(objComboUno,objComboDos,parametro2){
  
  usarSetValuesFormObject=parametro2;
  
  parametroComboProducto = JSON.parse("{\"llaveClaveTipoNegocio\":\"" +objComboUno.value + "\",\"llaveClaveClasifProd\":\"" +objComboDos.value + "\",\"order\":\"s\"}");
  SA(GI("antNumProducto"),"next","asignaProducto");
  setTimeout('GI("antNumProducto").value = '+GI("antNumProducto").value,1000);
  loadElement(GI("antNumProducto"));
}
function quitaRef(){
    loadElement(GI("antNumProducto"));
}
function cargaParamComboProductov2(parametro2){
  
  var opciones = GI("antNumProducto").options;
  //alert(opciones);
    var ubic=0;
    for (var i = 0; i < opciones.length; i++) {
        console.log(opciones[i].text);
        if(opciones[i].text===parametro2){
            ubic=i;
            alert(ubic);
        }
    }
    GI("antNumProducto").selectedIndex = ubic;
  
}

function asignaProducto(){
  formsLoaded();
}

function actualizaComboProducto() {

  cargaParamComboProducto(GI("antCveTipoNeg"),GI("antCveClasifPro"),false);
}

function actualizaComboClasProd()
{
  cargaComboClasProd(false);
}

function cargaComboClasProd(boleano)
{
   usarSetValuesFormObject=boleano;
   //alert(GI("antCveTipoNeg").value)
   var cveClasProd = GI("antCveTipoNeg").selectedIndex==0?-1:GI("antCveTipoNeg").value=="REPRESENTACION COMUN"?1002:37;
   clavesCombo37  = JSON.parse("{\"llaveClave\":"+eval(cveClasProd)+"}");
   
   SA(GI("antCveClasifPro"),"next","asignaClasProd");
   loadElement(GI("antCveClasifPro"));
}

function asignaClasProd()
{
/*
  if(usarSetValuesFormObject)
    setValuesFormObject(catProspectosAnteproyecto.getCatalogo());
  else
    GI("antCveClasifPro").selectedIndex=0;
  */  
  actualizaComboProducto();
  formsLoaded();
}

////////////////////////////////////////////////////////////////////////////////
//Verifica si es posible eliminar un registro
function eliminarRegistro(/*idQuery, noProyecto*/) {
  //validacion.numProspecto = noProyecto;
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    if(pkInfo.prsCveStatus == "CONSTITUIDO")
      Swal.fire('Aviso', 'El Prospecto está CONSTITUIDO',  'warning');
    else
    {
      validacion.numProspecto = pkInfo.antNumProspecto;
      var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacion);
      makeAjaxRequest(url, "HTML", verificarEliminacion, null);
    }
  }
}

function verificarEliminacion(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].totalAnteproy > 0)
    Swal.fire('Aviso', 'El Proyecto ha sido constituido como fideicomiso',  'warning');
  else
  {
    catProspectosAnteproyecto.setOnUpdate(operacionExitosa);
    showWaitLayer();
    eliminaCatalogo(catProspectosAnteproyecto);
  }
}

////////////////////////////////////////////////////////////////
function validarPkAlta(objeto) {
  if(GI("antNumProspecto").value!="")
  {
    validacionAlta3.numProspecto = GI("antNumProspecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta3);
    //alert(url)
    makeAjaxRequest(url, "HTML", validarPkAltaLN, objeto);
  }
}

function validarPkAltaLN(obj, result) {
  var objResult = JSON.parse(result);
  //alert(objResult[0].totalProspecto)
  if(objResult[0].totalProspecto > 0)
  {  
    Swal.fire('Aviso', 'Debe validar a las Personas en Listas Negras del Prospecto, verifique',  'warning');
    GI("antNumProspecto").value="";
    obj.focus();
  }
  else
  {
      if(GI("antNumProspecto").value!="")
      {
        validacionAlta.numProspecto = GI("antNumProspecto").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
        makeAjaxRequest(url, "HTML", verificarAlta, obj);
      }
  }    
}

function verificarAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].totalProspecto > 0)
  {  
    Swal.fire('Aviso', 'El Prospecto no existe o tiene Personas en Listas Negras, verifique',  'warning');
    GI("antNumProspecto").value="";
    obj.focus();
  }
  else
  {
    validacionAlta2.numProspecto = GI("antNumProspecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta2);
    makeAjaxRequest(url, "HTML", verificarAlta2, obj);
  }
}

function verificarAlta2(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].existeRegistro > 0)
  {
    Swal.fire('Aviso', 'El Proyecto ya existe, verifique',  'warning');
    GI("antNumProspecto").value="";
    obj.focus();
  }
  else
  {
  buscaDatos.numProspecto = GI("antNumProspecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(buscaDatos);
    makeAjaxRequest(url, "HTML", traeNombreFecha, obj); 
  }
  
  
}

function traeNombreFecha(obj, result){

  var objResult = JSON.parse(result);
  //alert(objResult[0].datosProyecto);
  
  var sdatosProy  = objResult[0].datosProyecto.split('-');
  var sdpLength = sdatosProy.length; // longitud
  
  if(sdpLength==2)
  { 
    GI('antNomNegocio').value= sdatosProy[0];
  }
  else// nombre de proyecto contiene guiones
  {
    var sdatosProyAux = new Array();
    
    for(var i=0;i<sdpLength-1;i++)
      sdatosProyAux[i] = sdatosProy[i];
      
    GI('antNomNegocio').value= sdatosProyAux.join("-");
  }
    //alert( sdatosProy[sdatosProy.length-1].indexOf(" "))
    //alert(sdatosProy[sdatosProy.length-1].substr(0, sdatosProy[sdatosProy.length-1].indexOf(" ")))
    GI('antCveTipoNeg').value=sdatosProy[sdatosProy.length-1].substr(0, sdatosProy[sdatosProy.length-1].indexOf(" "));    //tipo de negocio
    GI('antCveClasifPro').value= sdatosProy[sdatosProy.length-1];// producto
    
    
}

////////////////////////////////////////////////////////////////
//Funciones para la funcionalidad de la Fecha
function setFechaCal()
{}

function isValidDate(date) {
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

////////////////////////////////////////////////////////////////
//Funciones para habilitar/deshabilitar objetos que dependen de los radio-botones
function clickPublicoPrivado(cad,obj,booleano) {
  GI("antTipoPublic").disabled=booleano;
  GI("Paraestatal").disabled=booleano;
  GI("Estatal").disabled=booleano;
  GI("Municipal").disabled=booleano;
  
  asignaValueRadio2Master(cad,obj);
  
  if(booleano)
  {
    GI("Nada").checked=true;
    asignaValueRadio2Master("antTipoPublic",GI("Nada"));
  }
}

function habilitaDeshabilitaRadiosPublic(booleano) {
  GI("antTipoPublic").disabled=booleano;
  GI("Paraestatal").disabled=booleano;
  GI("Estatal").disabled=booleano;
  GI("Municipal").disabled=booleano;
}

function clickContratoEscritura(field, obj, booleano) {
    asignaValueRadio2Master(field, obj);
    
    if(booleano) {
        GI("antNumEscritura").value="";
        GI("antNumNotario").value=-1;
        GI("txtLocalidad").value="";
        GI("txtNumNotario").value="";
        GI("antFechaEscritura").value="";
        GI("txtEstado").value="";    
        disableElement(GI("antNumEscritura"));
        disableElement(GI("antNumNotario"));
        disableElement(GI("antFechaEscritura"));
        enableElement(GI("antFechaContrato"));
        enableElement(GI("antComentarios"));
    } else {
        GI("antFechaContrato").value="";
        GI("antComentarios").value="";
        disableElement(GI("antFechaContrato"));
        disableElement(GI("antComentarios"));
        enableElement(GI("antNumEscritura"));
        enableElement(GI("antNumNotario"));
        enableElement(GI("antFechaEscritura"));
    }
}

function habilitaDeshabilitaComponentesEscrituraPublica(booleano) {
    if(booleano) {
        GI("antNumEscritura").value="";
        GI("antNumNotario").value=-1;
        GI("txtLocalidad").value="";
        GI("txtNumNotario").value="";
        GI("antFechaEscritura").value="";
        GI("txtEstado").value="";    
        disableElement(GI("antNumEscritura"));
        disableElement(GI("antNumNotario"));
        disableElement(GI("antFechaEscritura"));
        enableElement(GI("antFechaContrato"));
        enableElement(GI("antComentarios"));
    } else {
        GI("antFechaContrato").value="";
        GI("antComentarios").value="";
        disableElement(GI("antFechaContrato"));
        disableElement(GI("antComentarios"));
        enableElement(GI("antNumEscritura"));
        enableElement(GI("antNumNotario"));
        enableElement(GI("antFechaEscritura"));
    }
}

//////////////////////////////////////////////////////////////////////
//Muestra los datos informativos Localidad y Número de notario oficial
function consultaDatosNotario() {
  if(GI("antNumNotario").value!=-1) {
    var params = JSON.parse("{}");
    params.id = "muestraDatosNotarios";
    params.Numero = GI("antNumNotario").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(params);
    makeAjaxRequest(url, "HTML", muestraDatosNotario, null);
  } else {
    GI("txtLocalidad").value = "";
    GI("txtNumNotario").value = "";
    GI("txtEstado").value = "";
  }
}

function muestraDatosNotario(obj, result) {
  var objResult = JSON.parse(result);
  GI("txtLocalidad").value = objResult[0].notLocalidadNota;
  GI("txtNumNotario").value = objResult[0].notNumNotario;
  GI("txtEstado").value = objResult[0].notNomEstado;
}

/* --- SIG FIDEICOMISO ---*/


function determinaFideicomiso()
{

  var nlocalidad = '0';
  var nproducto =pkInfo.antNumProspecto;
  

  determinaContrato.NumProyecto = nproducto;
  
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(determinaContrato);
  
  makeAjaxRequest(url, "HTML", determinaFideicomisoRes, null);  
}

function determinaFideicomisoRes(obj, result)
{
  var objResult = JSON.parse(result);
  
  if(isDefinedAndNotNull(objResult))
  {
        var txtNextFid = objResult.RESULTADO;
         GI("txtNoFideicomiso").value=txtNextFid;       
  }
  else
    GI("txtNoFideicomiso").value="";
}


function verificaNoExistaFideicomiso() {
  if(GI("txtNoFideicomiso").value!="")
  {
    validacionNoExistaFideicomiso.numContrato=GI("txtNoFideicomiso").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionNoExistaFideicomiso);
    makeAjaxRequest(url, "HTML", verificarNoExistenciaFideicomiso, null);
  }
}

function verificarNoExistenciaFideicomiso(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoNumContrato > 0)
  {
    Swal.fire('Aviso', 'El Fideicomiso ya existe, verifique',  'warning');
    //GI("txtNoFideicomiso").value="";
    //GI("txtNoFideicomiso").focus();
    GI("txtCveFideicomiso").focus();
  }
}

function ocultaMuestraFiso(ovisibility)
{
  GI('tablaFiso').style.visibility =ovisibility;// tabla fiso
  
    GI('txtNoFideicomiso').value = '';
}

function botonFideicomiso(fisoOpc)
{
	//Swal.fire('Aviso', 'llego aki',  'warning')
    if(fisoOpc=='CANCELAR')
    {
      ocultaMuestraFiso('hidden');
    }
    else if(fisoOpc=='ACEPTAR')
    {
        if(GI('txtNoFideicomiso').value.length<=0)
        {
          Swal.fire('Aviso', 'Seleccione Generar Fideicomiso',  'warning');
        }
        else
        {
          var nproyecto  = pkInfo.antNumProspecto;
          var nfideicomiso = GI('txtNoFideicomiso').value;
          
          var objUpdFiso = JSON.parse("{}"); 
          
          objUpdFiso.id = "actualizaProyectoFiso";
          objUpdFiso.NumProyecto = nproyecto;
          objUpdFiso.NumFiso = nfideicomiso;
          
          var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objUpdFiso);
          
          makeAjaxRequest(url, "HTML", actualizaProyectoFiso, null);        
        }
    
    }
}

function envioDictaminacion()
{
    //se valida que haya depositado los archivos digitales en carpeta compartida            
    validacionDepositoArchivos.numProspecto = pkInfo.antNumProspecto;
    //alert("VALOR:"+validacionDepositoArchivos.numProspecto);
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionDepositoArchivos);
    //alert(url)
    makeAjaxRequest(url, "HTML", validarDepositoArchivo, null); 
}

function validarDepositoArchivo(obj, result) {
  var objResult = JSON.parse(result);
  //alert(objResult[0].totalProspecto)
  if(objResult[0].archivo == 1)
  {  
  
            AnteproyectosRevFinalidades.numProspecto = pkInfo.antNumProspecto;
            var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(AnteproyectosRevFinalidades);
            //alert(url)
            makeAjaxRequest(url, "HTML", validarRevFinalidades, null);     
  }
  else
  {
	Swal.fire('Aviso', 'Debe depositar los documentos en la Carpeta Compartida, verifique',  'warning');
  }    
}

function validarRevFinalidades(obj, result) {
  var objResult = JSON.parse(result);
  //alert(objResult[0].totalProspecto)
  if(objResult[0].archivo >0)
  {
            AnteproyectosRevHonorarios.numProspecto = pkInfo.antNumProspecto;
            var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(AnteproyectosRevHonorarios);
            //alert(url)
            makeAjaxRequest(url, "HTML", validarRevHonorarios, null);     
  }
  else
  {
	Swal.fire('Aviso', 'Debe Incorporar Finalidades, verifique',  'warning');
  }    
}


function validarRevHonorarios(obj, result) {
  var objResult = JSON.parse(result);
  //alert(objResult[0].totalProspecto)
  if(objResult[0].archivo >0)
  {
    //funcion para validar correo duplicado
    AnteproyectosCorreo.numProspecto = pkInfo.antNumProspecto;
    AnteproyectosCorreo.correo = 1;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(AnteproyectosCorreo);
    //alert(url)
    makeAjaxRequest(url, "HTML", validaCorreoDup, null);     
  }
  else
  {
	Swal.fire('Aviso', 'Debe Incorporar Honorarios, verifique',  'warning');
  }    
}
function validaCorreoDup(obj, result) {
  var objResult = JSON.parse(result);
  //alert(result);
  if(objResult[0].correo > 0)
  {
        Swal.fire('Aviso', 'Ya se ha enviado un correo previamente, espere respuesta de Dictaminacion.',  'warning');
  }
  else
  {	
        realizarInsercionesCorreoDup();
  }    
}

function realizarInsercionesCorreoDup() {  

    //showWaitLayer();
    var parametros = "\"fiso\":" + pkInfo.antNumProspecto + ",\"correo\":"+1;
    ncorreo = 1;
    var url = ctxRoot + "/doRef.do?json={\"id\":\"insDatoCorreoDicta\","+ parametros + "}";
    makeAjaxRequest(url, "HTML", verifInsertCorreo, null);
    
    //hideWaitLayer();
}
function verifInsertCorreo(obj, result) {
  
  var objResult = JSON.parse(result);
  //alert(objResult[0].totalProspecto)
  if(ncorreo==1)
  {
  
//funcion para mandar correo de documentos
        //enviaCorreoDocs(pkInfo.antNumProspecto);
          // funcion actualizar num fiso
    Swal.fire('Aviso', 'Se ha enviado el correo a Dictaminacion para continuar con el Proceso.',  'warning');      
    //enviaCorreoDocs(pkInfo.antNumProspecto);
    realizarTransferenciaProspecto();
    
  }
  else
  {
	Swal.fire('Aviso', 'Ocurrio un error al solicitar el envio de correo',  'warning');
  }    
}
function realizarTransferenciaProspecto() {  

    //showWaitLayer();
    //Swal.fire('Aviso', 'Llega al TransferDicta',  'warning')var url = ctxRoot + "/executeRef.do?json={'id':'exeDicta','proy':"+pkInfo.antNumProspecto +"}";
    //alert(url);
    makeAjaxRequest(url, "HTML", verifInsertDicta, null);
    //setTimeout("VeriificaEstado()", 3000);
    //hideWaitLayer();
}

function verifInsertDicta(obj, result) {
  enviaCorreoDocs(pkInfo.antNumProspecto);
}

function actualizaProyectoFiso(obj, result)
{
  var objResult = JSON.parse(result);
  
  if(isDefinedAndNotNull(objResult))
  {
        var res = objResult.RESULTADO;
        
        switch(Number(res))
        {
            case 0:
              Swal.fire('Aviso', 'Asignación Correcta',  'warning');
              ocultaMuestraFiso('hidden');
              GI('cmdAceptar').click();
              break;
            default:
              Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
              break;
        }
  }
  else
      Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
}

function asignarFideicomiso()
{
  if(isDefinedAndNotNull(pkInfo))
  {
          if(Number(pkInfo.antNumContrato)>0)
          {
            Swal.fire('Aviso', 'El Proyecto ya tiene asignado un no. de fideicomiso',  'warning');
            return;
          }
          
      ocultaMuestraFiso('visible');
  
  }else
    Swal.fire('Aviso', 'Seleccione Proyecto',  'warning');
}

function desasignaProyectoFiso(nfideicomiso,nproyecto)
{         
          var objUpdFiso = JSON.parse("{}"); 
          
          objUpdFiso.id = "actualizaProyectoFiso";
          objUpdFiso.NumProyecto = nproyecto;
          objUpdFiso.NumFiso = nfideicomiso;
          
          var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objUpdFiso);
          
          makeAjaxRequest(url, "HTML", desasignaProyectoFisoRes, null);  
}

function desasignaProyectoFisoRes(obj,result)
{
  var objResult = JSON.parse(result);
  
  if(isDefinedAndNotNull(objResult))
  {
        var res = objResult.RESULTADO;
        
        switch(Number(res))
        {
            case 0:
              //Swal.fire('Aviso', 'Asignación Correcta',  'warning');
              break;
            default:
              Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
              break;
        }
  }
  else
      Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
}

/* --- SIG FIDEICOMISO ---*/


function reportaSeguimiento()// reporte seguimiento
{
  var cveSeguimiento = GI('antSeguimiento').value;
  if(GI('antSeguimiento').selectedIndex>0)
  {
    var objSeguimiento = JSON.parse("{}");
    objSeguimiento.id = "ejeFunRepSeguimientoProy";
    objSeguimiento.numProspecto = GI("antNumProspecto").value;
    objSeguimiento.numUsuario = ctxUser;
    objSeguimiento.varSeguimiento = cveSeguimiento;
    
    var url = ctxRoot + "/executeRef.do?json="+JSON.stringify(objSeguimiento);
    
    makeAjaxRequest(url,"html",reportaSeguimientoRes,null);
  }
}  

function reportaSeguimientoRes(obj,result)
{
  //alert(result);
}

function enviaCorreoDocs(proyecto){
    //Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
     var idLink = "linkReporteNew"; 
     var parametrosUrl = new Object;
     parametrosUrl.sendToJSP="true";
   // Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte="/modules/Formalizacion/CorreoDocumentos/EnviarCorreo.jsp"
     parametrosUrl.id="mandaCorreoDocs";
	 parametrosUrl.proyecto=proyecto;
     //var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
     var url = ctxRoot + "/imprimirReporte.do?json=" + encodeURIComponent(JSON.stringify(parametrosUrl));

	 //alert(url)
     idLink.href=url;
     window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");        
     //idLink.click();
     document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
  }
function enviaCorreoUNE(proyecto){
    //Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
     var idLink = "linkReporteNew"; 
     var parametrosUrl = new Object;
     parametrosUrl.sendToJSP="true";
   // Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte="/modules/Formalizacion/CorreoUne/EnviarCorreo.jsp"
     parametrosUrl.id="mandaCorreoDocs";
	 parametrosUrl.proyecto=proyecto;
     var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
	 //alert(url)
     idLink.href=url;
     window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");        
     //idLink.click();
     document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
  }
function vaciarNombreAdministrador() {
  if(GI("antNumAdmin").selectedIndex==0)
    GI("txtAdmonResponsable").value="";
  else
    GI("txtAdmonResponsable").value=GI("antNumAdmin").options[GI("antNumAdmin").selectedIndex].text;
}
function validaUNE(){
    if(GI("antUneChk").checked){
       GI("antCveStProspec").disabled=true;
       var opciones = GI("antCveStProspec").options;
       var ubic=0;
       for (var i = 0; i < opciones.length; i++) {
            if(opciones[i].text==="PROCESO AUTORIZACION"){
                ubic=i;
            }
       }
       GI("antCveStProspec").selectedIndex = ubic;
    }else{
        GI("antCveStProspec").disabled=false;
    }
}

function enviarCorreoOperaciones() {
    if(pkInfo==null)
        Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
    else
        enviaCorreoWorkFlowProyecto("AREA DE CONTRATO DE NEGOCIO",pkInfo.antNumProspecto,
        "PROYECTO DE NEGOCIO","ETAPA DE PROYECTO CONCLUIDA, LISTA PARA EVALUACION DE COMITE DE ACEPTACION.");
}

