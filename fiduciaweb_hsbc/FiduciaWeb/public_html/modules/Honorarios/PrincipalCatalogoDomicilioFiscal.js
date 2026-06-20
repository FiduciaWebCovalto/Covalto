var catDomicilioFiscalHonorarios = new Catalogo("mx.com.inscitech.fiducia.domain.DomFiscal");
var clavesCombo10 = JSON.parse("{\"llaveClave\":10}");
var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaContrato\",\"numContrato\":0}");
var validacionAlta2 = JSON.parse("{\"id\":\"verificaSeaActivo\",\"numContrato\":0}");
var validacionExistenciaRegistro = JSON.parse("{\"id\":\"verificaExistenciaRegistroDomFiscal\",\"numContrato\":0}");
var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var tablaDomicilioFiscalHonorariosData = new Array();
tablaDomicilioFiscalHonorariosData[0] = "dfNumContrato,85px";
tablaDomicilioFiscalHonorariosData[1] = "dfTipoPersona,85px";
tablaDomicilioFiscalHonorariosData[2] = "dfNumPersona,85px";
tablaDomicilioFiscalHonorariosData[3] = "dfNumSeq,95px";
tablaDomicilioFiscalHonorariosData[4] = "dfDomicilio,300px";
tablaDomicilioFiscalHonorariosData[5] = "dfRfc,100px";
tablaDomicilioFiscalHonorariosData[6] = "dfNombre,300px";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var CONSULTAR = 3;
var fvMantenimientoDomicilioFiscal = new FormValidator();

formsLoaded();

function cargaPrincipalDomicilioFiscalHonorarios() {
  onButtonClickPestania("Honorarios.PrincipalCatalogoDomicilioFiscal","");
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catDomicilioFiscalHonorarios.getCatalogo());
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    catDomicilioFiscalHonorarios.setOnUpdate(operacionExitosa);
    eliminaCatalogo(catDomicilioFiscalHonorarios);
  }
}

////////////////////////////////////////////////////////////////////
//CARGA LA SEGUNDA PANTALLA (MantenimientoCatalogoDomicilioFiscal)
function cargaMantenimientoDomicilioFiscalHonorarios(tipoPantalla) {
  if ((tipoPantalla==OPER_MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Honorarios/MantenimientoCatalogoDomicilioFiscal.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
  }
}

function despliegaPantalla(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  //Agregando la funcionalidad del required
  fvMantenimientoDomicilioFiscal.setup({
    formName      : "frmDomicilioFiscalHonorariosMantenimiento",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
  
  //loadCatalogo();
}


function loadCatalogo() {
  catDomicilioFiscalHonorarios.setOnUpdate(catLoaded);
  if(operacion==OPER_MODIFICAR || operacion==CONSULTAR)
    catDomicilioFiscalHonorarios.buscaCatalogoPK(false);
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
    formsLoaded();
  }
}

function AltaOModificaInfo() {
  catDomicilioFiscalHonorarios.setOnUpdate(operacionExitosa);
  if(operacion==1 && fvMantenimientoDomicilioFiscal.checkForm())//Se trata de una alta
    catDomicilioFiscalHonorarios.altaCatalogo();
  else if(operacion==2 && fvMantenimientoDomicilioFiscal.checkForm())//Se trata de una modificación
    catDomicilioFiscalHonorarios.modificaCatalogo();
}

function catLoaded() {
  if(operacion==OPER_MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
    deshabilitaPK("dfNumContrato".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmDomicilioFiscalHonorariosMantenimiento"));                  //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();
  if(operacion==OPER_MODIFICAR||operacion==CONSULTAR){
        consultaExistenciaPersona.fiso = GI("dfNumContrato").value;
        consultaExistenciaPersona.tipo = GI("dfTipoPersona").value;
        consultaExistenciaPersona.numero = GI("dfNumPersona").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaExistenciaPersona);
        makeAjaxRequest(url, "HTML", validaExistenciaPersonaMC, null);   
  }
}

function validaExistenciaPersonaMC(obj, result) {
  var objResult = JSON.parse(result);

    if(objResult.length!=0){
        var nombre=objResult[0].nombre;    
        GI("NombrePersona").value=nombre;
    }
    hideWaitLayer();
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalDomicilioFiscalHonorarios();
}

////////////////////////////////////////////////////////////////////////////
function verificarAltaPk() {
  if(GI("dfNumContrato").value!="")
  {
    validacionAlta.numContrato = GI("dfNumContrato").value;
    
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificarAlta, null);
  }
}

function verificarAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoNumContrato > 0)
  {
    validacionAlta2.numContrato = GI("dfNumContrato").value;
    
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta2);
    makeAjaxRequest(url, "HTML", verificarAlta2, null);
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no existe, verifique',  'warning');
    GI("dfNumContrato").value="";
  }
}

function verificarAlta2(obj,result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoCveStContrat == 0)
  {
    validacionExistenciaRegistro.numContrato = GI("dfNumContrato").value;
    
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionExistenciaRegistro);
    makeAjaxRequest(url, "HTML", verificaExistenciaRegistro, null);
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no está ACTIVO',  'warning');
    GI("dfNumContrato").value="";
  }
}

function verificaExistenciaRegistro(obj,result) {
  var objResult = JSON.parse(result);
  if(objResult[0].dfNumRegistro != 0)
  {
    Swal.fire('Aviso', 'Ya existe un registro con ese número de fideicomiso',  'warning');
    GI("dfNumContrato").value="";
  }
}

var consultaExistenciaPersona = 
JSON.parse("{\"id\":\"qryValidaPersonaKYC\"}");

function validaPersona(){
    if(GI("dfNumPersona").value!=""){
            consultaExistenciaPersona.fiso = GI("dfNumContrato").value;
            consultaExistenciaPersona.tipo = GI("dfTipoPersona").value;
            consultaExistenciaPersona.numero = GI("dfNumPersona").value;
            var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaExistenciaPersona);
            makeAjaxRequest(url, "HTML", validaExistenciaPersona, null);    
    }    
    
}

function validaExistenciaPersona(obj, result) {
  var objResult = JSON.parse(result);
   

    if(objResult.length==0){
        Swal.fire('¡error!', "No existe una persona con ese numero en el catalogo de KYC!", 'error');
        GI("dfNumPersona").value="";
    }
    else{
        var nombre=objResult[0].nombre;
        GI("NombrePersona").value=nombre;
    }
    hideWaitLayer();
}