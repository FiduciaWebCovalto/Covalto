var catProspectosFideicomisarios = new Catalogo("mx.com.inscitech.fiducia.domain.Afidben");

var clavesCombo23 = JSON.parse("{\"llaveClave\":23}");

showWaitLayer();

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;
var CONSULTARPR = 4;

var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var consultaDatosInformativos = JSON.parse("{\"id\":\"conNomProyecto\",\"numAnteproyecto\":0}");
var validacionAlta = JSON.parse("{\"id\":\"cuentaAnteproyectosBajaProspectos\",\"numProspecto\":0}");
var validacionAlta2 = JSON.parse("{\"id\":\"verificaExistenciaFideicomitente\",\"cvePersona\":0,\"numFidben\":0,\"anteproyecto\":0}");

var contenedor = new Object();

initForms();

var tablaFideicomisariosData = new Array();
tablaFideicomisariosData[0] = "afbAnteproyecto,70";
tablaFideicomisariosData[1] = "afbNumFidben,104";
tablaFideicomisariosData[2] = "afbNomFidben,296";
tablaFideicomisariosData[3] = "afbCveStFidBen,100";
tablaFideicomisariosData[4] = "afbNomMunicipio,100";


var operacion = 0;
numPantalla = 0;
pkInfo=null;
var parametroComboEstado;
var usarSetValuesFormObject=false;
var fvMantenimientoFideicomisarios = new FormValidator();
deshabilitaPK("txtNomProyecto".split(","));
//No permitir editar el campo informativo de la p谩gina principal:
//1. Nombre del proyecto (Nombre del negocio)
//deshabilitaPK("txtNomProyecto".split(","));

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalProspectosFideicomisarios() {
  onButtonClickPestania("Formalizacion.PrincipalProspectosFideicomisarios","");
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catProspectosFideicomisarios.getCatalogo());
}

function operacionExitosa() {
  Swal.fire('Aviso', 'La operaci贸n se realiz贸 correctamente',  'warning');
  cargaPrincipalProspectosFideicomisarios();
  hideWaitLayer();
}


function operacionExitosaKYC() {

  Swal.fire('Aviso', 'La operaci贸n se realiz贸 correctamente',  'warning');
  //cargaPrincipalProspectosFideicomisarios();
  ocultaObjs("cmdAceptar");
  SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al bot贸n
  deshabilitaObjetos(GI("frmDatosMantenimientoFideicomisarios"));
  cargaCheckList();
  hideWaitLayer();
}

//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda pantalla
function cargaMantenimientoFideicomisarios(tipoPantalla) {
  if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR  || tipoPantalla==CONSULTARPR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Formalizacion/MantenimientoProspectosFideicomisarios.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoProspectosFideicomisarios, null);
  }
}

function despliegaPantallaMantenimientoProspectosFideicomisarios(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimientoFideicomisarios.setup({
    formName      : "frmDatosMantenimientoFideicomisarios",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
  
  //No permitir editar el campo informativo de la p谩gina de mantenimiento:
  //1. Nombre del proyecto (Nombre del negocio)
  deshabilitaPK("txtNomProyecto,afbCvePersona,afbNumFidben".split(","));
}

function loadCatalogo() {
  catProspectosFideicomisarios.setOnUpdate(catLoaded);
  if(operacion==MODIFICAR || operacion==CONSULTAR || operacion==CONSULTARPR)
    catProspectosFideicomisarios.buscaCatalogoPK(false);
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el bot贸n Aceptar y Cancelar
    formsLoaded();
  }
}

function catLoaded() {
  //cargaParamComboEstado(GI("afbNomPais"),true);
  if(operacion==MODIFICAR)//Si se trata de una modificaci贸n, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el bot贸n Aceptar
    deshabilitaPK("afbCvePersona,afbNumFidben,afbAnteproyecto".split(","));
    GI('cmdCuentas').style.visibility='visible';
  }
  else if(operacion==CONSULTAR || operacion==CONSULTARPR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al bot贸n
    deshabilitaObjetos(GI("frmDatosMantenimientoFideicomisarios"));
    // muestraObjs("cmdKYC");
    GI('cmdCuentas').style.visibility='visible';
     cargaCheckList();
  }
  muestraObjs("cmdCancelar"); //Mostrar el bot贸n Regresar
  //Mostrar datos en campos informativos
  //mostrarDatosInformativos(3);
  formsLoaded();
}


function AltaOModificaInfo() {
  catProspectosFideicomisarios.setOnUpdate(operacionExitosaKYC);
    showWaitLayer();
    //VALIDACION DE PORCENTAJES
    vgContenedorDatos=null;
    vgContenedorDatos=JSON.parse("{\"id\":\"funcionPorcentajes\"}");//PRIMERO SE PROCESA LA BITACORA
    vgContenedorDatos.etapa='PROYECTO';
    vgContenedorDatos.fiso=eval(GI("afbAnteproyecto").value); 
    vgContenedorDatos.tipopersona='BENEFICIARIO';
    vgContenedorDatos.porcentaje=eval(GI("afbCurp").value);
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
    //alert(url)
    makeAjaxRequest(url, "HTML", ejecutaFuncionPorcentaje, null);      
}
var nombre;
function ejecutaFuncionPorcentaje(tp,result){
    //alert(result);
    var rusultado= JSON.parse(result);
    var res=rusultado.result
    if(res==0){
     if((operacion==ALTA ||operacion==MODIFICAR) && fvMantenimientoFideicomisarios.checkForm())//Se trata de una alta
        {
            //catProspectosFideicomisarios.altaCatalogo();
            var vgContenedorDatos=null;
            vgContenedorDatos=JSON.parse("{\"id\":\"funcionIncorporaTipoPers\"}");//PRIMERO SE PROCESA LA BITACORA
            vgContenedorDatos.Etapa='PROYECTO';
            vgContenedorDatos.NumProyFid=eval(GI("afbAnteproyecto").value);
            vgContenedorDatos.TipoPers='BENEFICIARIO';
            vgContenedorDatos.NumPers=eval(GI("afbNumFidben").value);
            nombre=GI("afbNomFidben").value;
            vgContenedorDatos.Nombre=GI("afbNomFidben").value;
            vgContenedorDatos.CatPersona=GI("afbTipoPersona").value;
            vgContenedorDatos.Pais=GI("afbNomPais").value;
            vgContenedorDatos.Calidad='';
            vgContenedorDatos.Status='PENDIENTE';    
            vgContenedorDatos.Curp=GI("afbCurp").value;    
            var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
            console.log(url);
            makeAjaxRequest(url, "HTML", ejecutaFuncion, null);      
        }
        else if(operacion==MODIFICAR && fvMantenimientoFideicomisarios.checkForm())//Se trata de una modificaci贸n
        {
            showWaitLayer();
            catProspectosFideicomisarios.modificaCatalogo();
        }
    } 
    else if(res==1){
      Swal.fire('Aviso', 'El Porcentaje Total del Proyecto supera el 100%, Favor de revisar',  'warning');
    }
    hideWaitLayer();     
  }

var anteproy;
    var numsec;
    
  function ejecutaFuncion(tp,result){
    //alert(result);
    var rusultado= JSON.parse(result);
    var res=rusultado.result
    if(res==0){
        //se incorpora el proyecto de negocio al WF
        vgContenedorDatos=null;
        vgContenedorDatos=JSON.parse("{\"id\":\"funcionProyectoWF\"}");//PRIMERO SE PROCESA LA BITACORA
        vgContenedorDatos.proyecto=eval(GI("afbAnteproyecto").value);
        anteproy=eval(GI("afbAnteproyecto").value);
        vgContenedorDatos.tipo=GI("afbTipoPersona").value;//"P"+GI("afbTipoPersona").value.substring(0,1)+((GI("afbNomPais").value=="MEXICO")?"NAC":"EXT"); 
        vgContenedorDatos.tipopersona='BENEFICIARIO';
        vgContenedorDatos.numeropersona=eval(GI("afbNumFidben").value);
        numsec=eval(GI("afbNumFidben").value);
        vgContenedorDatos.etapa='DICTAMINACION';
        var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
        //alert(url)
        makeAjaxRequest(url, "HTML", ejecutaFuncion2, null);       
    
      //Swal.fire('∩xito!', 'Operaci髇 realizada correctamente', 'success');
    } 
    else if(res==1){
      Swal.fire('Aviso', 'El Registro ya existe',  'warning');
    }
    else if(res==2){
      Swal.fire('Aviso', 'Existen Registros PENDIENTES por Autorizar',  'warning');
    }    
    else {
      Swal.fire('Aviso', 'Ocurrio un error al realizar la Operacion.',  'warning')}
    hideWaitLayer();     
    onButtonClickPestania("Formalizacion.PrincipalProspectosFideicomisarios","");  
  }


  function ejecutaFuncion2(tp,result){
     //alert(result);
     var resultado= JSON.parse(result);
    var res=resultado.result
    //alert("res "+res)
     if(res!=0){
       Swal.fire('Aviso', 'Ocurrio un error al tratar de incorporar la Instruccion',  'warning')}  
     else{
        //FUNCION PARA ACTUALIZAR NOMBRE
        var objParametros=null;
        objParametros = JSON.parse("{\"id\":\"updNombreAFB\"}");
        //alert(GI("afbAnteproyecto").value);
        objParametros.anteproy=anteproy;
        objParametros.numpers=numsec;
        objParametros.nomb=nombre;
        var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objParametros);
        //console.log(url);
        makeAjaxRequest(url, "HTML", respuestaAltaNombre, null);
        //Swal.fire('∩xito!', 'Operaci髇 realizada correctamente', 'success');
     }
  }

function respuestaAltaNombre(obj, result){
    //Swal.fire('Aviso', 'aqui',  'warning')var resultado = JSON.parse(result);
  /*console.log(result);
  console.log(obj);*/
  if(isDefinedAndNotNull(resultado) && resultado.codigoError == 0) {
    Swal.fire('∩xito!', "Operaci髇 realizada exitosamente", 'success');
  } else {
    Swal.fire('Aviso', 'Ocurri un error al realizar la operacin!',  'warning');
  }
}
function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    var objelimina = JSON.parse("{\"id\":\"borraFunPrev\",\"proyecto\":" + pkInfo.afbAnteproyecto +
                                                                              ",\"tipo\":\"" + pkInfo.afbCvePersona +"\""+
                                                                              ",\"persona\":"  + pkInfo.afbNumFidben + "}");    
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objelimina);                                                                              
    makeAjaxRequest(url,"HTML",funborraAutoPrev,null);
  }
}

function funborraAutoPrev(obj,result)
{

     var objResult = JSON.parse(result);
     
    catProspectosFideicomitentes.setOnUpdate(operacionExitosa);
    showWaitLayer();
    eliminaCatalogo(catProspectosFideicomitentes);
}

//////////////////////////////////////////////////////////////
//Funciones para cargar el combo Estado
function cargaParamComboEstado(objCombo,parametro2){
  usarSetValuesFormObject=parametro2;
  parametroComboEstado = JSON.parse("{\"llaveClaveEstado\": \"" +objCombo.value + "\"}");
  SA(GI("afbNomEstado"),"next","asignaEstado");
  loadElement(GI("afbNomEstado"));
}

function asignaEstado(){
  if(usarSetValuesFormObject)
    setValuesFormObject(catProspectosFideicomisarios.getCatalogo());
  else
    GI("afbNomEstado").selectedIndex=0;
  
  formsLoaded();
}

//////////////////////////////////////////////////////////////
function consultarExistenciaFideicomisario() {
  /*if(GI("afbNumFidben").value!="" && GI("afbAnteproyecto").value!="")
  {
    validacionAlta2.cvePersona = GI("afbCvePersona").value;
    validacionAlta2.numFidben = GI("afbNumFidben").value;
    validacionAlta2.anteproyecto = GI("afbAnteproyecto").value;
    
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta2);
    makeAjaxRequest(url, "HTML", verificacionAlta2, null);
  }
  else*/ if(GI("afbAnteproyecto").value!="")
    mostrarDatosInformativos(2);
  else if(GI("afbAnteproyecto").value=="")
    GI("txtNomProyecto").value="";
}

function verificacionAlta2(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].existeRegistro > 0)
  {
    Swal.fire('Aviso', 'Ya existe ese registro, verifique',  'warning');
    GI("afbNumFidben").value="";
    GI("afbAnteproyecto").value="";
    GI("txtNomProyecto").value="";
  }
  else
    mostrarDatosInformativos(2);
}

function mostrarDatosInformativos(parametroPantalla) {
  GI("txtNomProyecto").value="";
  showWaitLayer();
  if(parametroPantalla==1)
  {
    consultaDatosInformativos.numFideicomiso = GI("paramProyecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
  }
  else if(parametroPantalla==2)
  {
    var Secuencial = JSON.parse("{\"id\":\"contProyecto\",\"Anteproyecto\":0}");
    Secuencial.Anteproyecto=GI("afbAnteproyecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(Secuencial);
    makeAjaxRequest(url, "HTML", validaProyecto1, null);  
  }
  else
  {
    consultaDatosInformativos.numAnteproyecto = GI("afbAnteproyecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
  }
}

function verificarAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].totalAnteproy > 0)
  {
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
  }
  else
  {
    Swal.fire('Aviso', 'El Proyecto no existe, verifique',  'warning');
    GI("afbAnteproyecto").value="";
    GI("txtNomProyecto").value="";
    GI("afbNumFidben").value="";
    GI("afbAnteproyecto").focus();
    hideWaitLayer();
  }
}

function insertaDatosInformativos(obj, result) {
  var objResult = JSON.parse(result);
  //GI("txtNomProyecto").value=objResult[0].nombre;
  hideWaitLayer();
}

function validaProyecto1(obj, result) {
  var objResult = JSON.parse(result);
    var existeProyecto=objResult[0].secNumAfidben;
    
    if(existeProyecto>0){
        var Secuencial = JSON.parse("{\"id\":\"contProyecto2\",\"Anteproyecto\":0}");
        Secuencial.Anteproyecto=GI("afbAnteproyecto").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(Secuencial);
        //alert(url);
        makeAjaxRequest(url, "HTML", constituido, null);  
        /*var Secuencial = JSON.parse("{\"id\":\"ValidaProyecto\",\"Anteproyecto\":0}");
        Secuencial.Anteproyecto=GI("afbAnteproyecto").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(Secuencial);
        makeAjaxRequest(url, "HTML", validaProyecto, null);*/
    }
    else{
        Swal.fire('Aviso', 'El Proyecto no Existe, verifique',  'warning');
        GI("afbAnteproyecto").value="";  
        GI("afbAnteproyecto").focus();
        hideWaitLayer();
    }
}
function constituido(obj, result){
    var objResult = JSON.parse(result);
    var existe=objResult[0].existe;
    //alert("validacion en contratos=" +existe);
    if(existe>0){
        Swal.fire('Aviso', 'El Proyecto ya est谩 Constituido, no se puede modificar',  'warning');
        GI("afbAnteproyecto").value="";  
        GI("afbAnteproyecto").focus();
        hideWaitLayer();
    }
    else{
        var Secuencial = JSON.parse("{\"id\":\"ValidaProyecto\",\"Anteproyecto\":0}");
        Secuencial.Anteproyecto=GI("afbAnteproyecto").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(Secuencial);
        makeAjaxRequest(url, "HTML", validaProyecto, null);
        
    }
}
function validaProyecto(obj, result) {
  var objResult = JSON.parse(result);
  var fideicomiso=objResult[0].fideicomiso;
  var tiene_archivos=objResult[0].archivos;
  
  if(fideicomiso!=0){
    if(tiene_archivos==1){
        //var Secuencial = JSON.parse("{\"id\":\"numSecAfidben\",\"Anteproyecto\":0,\"Fideicomisarios\":\"BENEFICIARIO\"}");
        var Secuencial = JSON.parse("{\"id\":\"numSecAfidben\"}");
        //Secuencial.Anteproyecto=GI("afbAnteproyecto").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(Secuencial);
        makeAjaxRequest(url, "HTML", verificarSecuencial, null);
    }else{
        Swal.fire('Aviso', 'El Proyecto no tiene archivos en la carpeta compartida, verifique',  'warning');
        GI("afbAnteproyecto").value="";  
        GI("afbAnteproyecto").focus();
        hideWaitLayer();
    }
  }
  else{
    Swal.fire('Aviso', 'El Proyecto no tiene asignado Fideicomiso, verifique',  'warning');
    GI("afbAnteproyecto").value="";  
    GI("afbAnteproyecto").focus();
    hideWaitLayer();
  }
}
function verificarSecuencial(obj, result) {
  var objResult = JSON.parse(result);
  GI("afbNumFidben").value=objResult[0].secNumAfidben;
  
  consultaDatosInformativos.numAnteproyecto = GI("afbAnteproyecto").value;
  validacionAlta.numProspecto = GI("afbAnteproyecto").value;
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
  makeAjaxRequest(url, "HTML", verificarAlta, null);
}

/// enlace CHECKLIST-----------------

function cargaCheckList()
{
  contenedor.Proyecto = GI("afbAnteproyecto").value;
  contenedor.NumPersona = GI("afbNumFidben").value;
  contenedor.NomPersona = GI("afbNomFidben").value;
  
  if(operacion==CONSULTARPR)
    contenedor.TPersona = "P"+(GI("afbTipoPersona").value.indexOf("FISICA")!=-1?"F":"M")+((GI("afbTipoPersona").value.indexOf("NACIONAL")!=-1)?"NACP":"EXTP");
  else  
    contenedor.TPersona = "P"+(GI("afbTipoPersona").value.indexOf("FISICA")!=-1?"F":"M")+((GI("afbTipoPersona").value.indexOf("NACIONAL")!=-1)?"NAC":"EXT");
  var url = ctxRoot + "/modules/Formalizacion/KYC/PrincipalCheckList.do";
  makeAjaxRequest(url, "HTML", cargaParametros, contenedor);
  loadDynamicJS(ctxRoot + "/modules/Formalizacion/KYC/PrincipalCheckList.js");
}


function cargaParametros(obj,result)
{
  GI("cargaCheck").innerHTML = result;
  //initForms();
  GI("paramProyecto").value= obj.Proyecto;
  GI("paramTPersona").value= obj.TPersona;
  GI("paramNumPersona").value= obj.NumPersona;
  GI("paramNomPersona").value= obj.NomPersona;
  GI("idRegresar").value = 2;
   GI("paramTipo").value = 2;
  
 var url = ctxRoot + "/executeRef.do?json={\"id\":\"ejeFunCargaConceptosKYCProyecto\",\"TPersona\":\"" + obj.TPersona + "\",\"Proyecto\":" + obj.Proyecto + ",\"Tipo\":" + 2 + ",\"NumPersona\":" + obj.NumPersona + "}";
 
 makeAjaxRequest(url, "HTML",cargaConceptosKYC,null);
}

function cargaConceptosKYC(obj,result){
  var resultado = JSON.parse(result).result;
  switch(resultado){
    case 0:
        consultar(GI("cmdCargar"), GI('frmCheckList'), false);
    break;
    case 1:
      Swal.fire('Aviso', 'No hay Conceptos para esta Persona',  'warning');
    break;
  }
  hideWaitLayer();
  GI('ContenedorKYC').style.visibility='visible';
  GI('cargaConceptos').innerHTML='<div style="color: #CCCCCC;font-size: 70px;font-weight: bold;">KYC</div>';
}

function llamaReplica(){
    if (isDefinedAndNotNull(pkInfoCharSol)) {
        if(confirm("縀sta seguro que desea aplicar?")){
            var parametrosUrl = {
                id : 'storeReplicaKYC', 
                proy:pkInfo.afbAnteproyecto,
                numPers:pkInfo.afbNumFidben
            }
            var url = ctxRoot + '/executeRef.do?json=' + JSON.stringify(parametrosUrl);
            //alert(url)
            makeAjaxRequest(url, "HTML", confirmaReplica, null);
        }
    }else
        Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
}
function confirmaReplica(obj,result) {
    
    if( JSON.parse(result).RESULTADO == 0){
        Swal.fire('Aviso', 'Proceso realizado con exito',  'warning');
    }else{
        Swal.fire('Aviso', 'Ocurri un error en el proceso',  'warning');
    }
}

/*Funciones para vigencia de documentos*/
function cargaPrincipalCuentas(){
  //showWaitLayer();
 // Swal.fire('Aviso', 'entro a cuentas',  'warning')var objDatosFideicom = new Object();
  objDatosFideicom.NumAnteproy = GI("afbAnteproyecto").value;
  objDatosFideicom.NumPers= GI("afbNumFidben").value;
  objDatosFideicom.TipoPers= GI("afbTipoPersona").value;
  objDatosFideicom.pant= 2;
  var urlCliente = "modules/Formalizacion/VigenciaDoctos/PrincipalVigenciaDoctos.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipalDirecciones, objDatosFideicom);
  loadDynamicJS(ctxRoot + "/modules/Formalizacion/VigenciaDoctos/PrincipalVigenciaDoctos.js");
}
function despliegaPantallaPrincipalDirecciones(obj, result) {
  GI("dvPantalla").innerHTML = result;
  deshabilitaObjetos(GI("frmDatos"));
  //asignaEtiqueta("nomFideicomiso",obj.NomContrato);
  //GI("fidNomFideicom").value = obj.NomFideicomitente;
  GI("paramTipoPer").value = obj.TipoPers;
  GI("paramnumPersona").value = obj.NumPers;
  GI("paramnumProyec").value = obj.NumAnteproy; //prsNumProspecto
  GI("pantORIG").value=obj.pant;
  consultar(GI("cmdRegresar"), GI("frmDatos"), false);
  formsLoaded();
}
function invocaRiesgo() {
        vgContenedorDatos=null;
        vgContenedorDatos=JSON.parse("{\"id\":\"funcionRiesgo\"}");//PRIMERO SE PROCESA LA BITACORA
        vgContenedorDatos.fideicomiso=pkInfo.afbAnteproyecto;
        vgContenedorDatos.tipopersona='';//"P"+GI("afbTipoPersona").value.substring(0,1)+((GI("afbNomPais").value=="MEXICO")?"NAC":"EXT"); 
        vgContenedorDatos.numeropersona=pkInfo.afbNumFidben;
        vgContenedorDatos.rfc='';
        vgContenedorDatos.fechadel='';
        vgContenedorDatos.fechaal='';
        vgContenedorDatos.status='';
        vgContenedorDatos.tiponegocio='PROYECTO';
        var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
        //alert(url)
        makeAjaxRequest(url, "HTML", ejecutaFuncionRiesgo, null); 
}        

  function ejecutaFuncionRiesgo(tp,result){
     //alert(result);
     var resultado= JSON.parse(result);
    var res=resultado.result
    //alert("res "+res)
     if(res!=0){
       Swal.fire('Aviso', 'Ocurrio un error al tratar de Determinar el Riesgo',  'warning')}  
     else{
        Swal.fire('∩xito!', 'Operaci髇 realizada correctamente', 'success');
     }
  }