var catEjecutivos = new Catalogo("mx.com.inscitech.fiducia.domain.Ejecutiv");

showWaitLayer();

var clavesCombo5 = JSON.parse("{\"llaveClave\":5}");
var clavesCombo67 = JSON.parse("{\"llaveClave\":67}");
var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");

var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaRegistroEjecutivos\",\"claveBanca\":0,\"numEjecutivoAtencion\":0}");

initForms();

var tablaDatosEjecutivosData = new Array();
tablaDatosEjecutivosData[0] = "ejeCveBanca,90px";
tablaDatosEjecutivosData[1] = "ejeNumEjecAtenc,60px";
tablaDatosEjecutivosData[2] = "ejeNomEjecutivo,200px";
tablaDatosEjecutivosData[3] = "ejeCveTipoEjec,160px";
tablaDatosEjecutivosData[4] = "ejeNumCveLada1,80px";
tablaDatosEjecutivosData[5] = "ejeNumTelef1,90px";
tablaDatosEjecutivosData[6] = "ejeNumExt1,60px";
tablaDatosEjecutivosData[7] = "ejeCveStEjecuti,90px";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var fvMantenimientoEjecutivo = new FormValidator();

var parametroComboEstado;
var usarSetValuesFormObject=false;
var CONSULTAR = 3;


function cargaPrincipalCatalogosEjecutivosControlGestion() {
	var urlCliente = ctxRoot + "/modules/ControlGestion/PrincipalCatalogosEjecutivosControlGestion.do";
	makeAjaxRequest(urlCliente, "HTML", despliegaPantallaP, null);
}

function despliegaPantallaP(obj, result) {
  GI("dvPantalla").innerHTML = result;
  hideWaitLayer();
  initForms();
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catEjecutivos.getCatalogo());
}

////////////////////////////////////////////////////////////////////
//CARGA LA SEGUNDA PANTALLA (MantenimientoCatalogosEjecutivosControlGestion)
function cargaMantenimientoCatalogosEjecutivosControlGestion(tipoPantalla) {
  if ((tipoPantalla==OPER_MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/ControlGestion/MantenimientoCatalogosEjecutivosControlGestion.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
  }
}

function despliegaPantalla(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimientoEjecutivo.setup({
    formName      : "frmMantenimientoCatalogosEjecutivosControlGestion",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
}

///////////////////////////
function loadCatalogo() {
  catEjecutivos.setOnUpdate(catLoaded);
  if(operacion==OPER_MODIFICAR || operacion==CONSULTAR)
    catEjecutivos.buscaCatalogoPK(false);
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
    formsLoaded();
  }
}

function catLoaded() {
  if(numPantalla==1)
    cargaParamComboEstado(GI("ejeNomPais"),true); //El combo se carga sólo en el Mantenimiento
  
  if(operacion==OPER_MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
    deshabilitaPK("ejeCveBanca,ejeNumEjecAtenc".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmMantenimientoCatalogosEjecutivosControlGestion"));         //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();
}

function AltaOModificaInfo() {
  catEjecutivos.setOnUpdate(operacionExitosa);
  if(operacion==OPER_ALTA && fvMantenimientoEjecutivo.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    catEjecutivos.altaCatalogo();
  }
  else if(operacion==OPER_MODIFICAR && fvMantenimientoEjecutivo.checkForm())//Se trata de una modificación
  {
    showWaitLayer();
    catEjecutivos.modificaCatalogo();
  }
}


///////////////////////////////////////////////////////////////////
function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    catEjecutivos.setOnUpdate(operacionExitosa);
    showWaitLayer();
    eliminaCatalogo(catEjecutivos);
  }
}
//////////////////////////////////////////////////////////////////////
function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalCatalogosEjecutivosControlGestion();
  hideWaitLayer();
}

//Verificar que el registro aún no exista
function verificaExistenciaRegistro() {
  if(operacion==OPER_ALTA && GI("ejeCveBanca").value!=-1 && GI("ejeNumEjecAtenc").value!="")
  {
    showWaitLayer();
    validacionAlta.claveBanca = GI("ejeCveBanca").value;
    validacionAlta.numEjecutivoAtencion = GI("ejeNumEjecAtenc").value;
    
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificacionAlta, null);
  }
}

function verificacionAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].existeRegistro > 0)
  {
    Swal.fire('Aviso', 'El registro ya existe, verifique',  'warning');
    GI("ejeCveBanca").selectedIndex=0;
    GI("ejeNumEjecAtenc").value="";
  }
  hideWaitLayer();
}

////////////////////////////////////////////////////////////////////
//Funciones para cargar el combo Estados luego de haber elegido alguna opción del combo Paises
function cargaParamComboEstado(objCombo,parametro2){
  usarSetValuesFormObject=parametro2;
  parametroComboEstado = JSON.parse("{\"llaveClaveEstado\":\"" + objCombo.value + "\"}");
  SA(GI("ejeNumEstado"),"next","asignaEstado");
  loadElement(GI("ejeNumEstado"));
}

function asignaEstado(){
  if(usarSetValuesFormObject)
    setValuesFormObject(catEjecutivos.getCatalogo());
  else
    GI("ejeNumEstado").selectedIndex=0;
  
  formsLoaded();
}

/////////////////////////////////
//Función para cambiar el Nombre del Estado en la etiqueta cuando cambie el Número del mismo en el combo
function cambiaNomEstado() {
  if(GI("ejeNumEstado").value!=-1)
    GI("ejeNomEstado").value=GI("ejeNumEstado").options[GI("ejeNumEstado").selectedIndex].text;
  else
    GI("ejeNomEstado").value="";
}