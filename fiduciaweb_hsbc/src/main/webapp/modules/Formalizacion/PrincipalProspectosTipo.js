var elCatalogo = new Catalogo("mx.com.inscitech.fiducia.domain.ProspectosTipo");

showWaitLayer();

var operacion = 0;
var numPantalla = 0;

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;

var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var clavesCombo140 = JSON.parse("{\"llaveClave\":140}");
var indices580 = JSON.parse("{\"eindIdIndice\":580}");

initForms();

var tablaProspectosData = new Array();
tablaProspectosData[0] = "prpNumProspecto,42";
tablaProspectosData[1] = "prpTipoPersona,364";
tablaProspectosData[2] = "prpCvePersona,131";
tablaProspectosData[3] = "prpNumProPersona,118";
tablaProspectosData[4] = "prpNomProPersona,111";
tablaProspectosData[5] = "prpCveEstatus,88";

var usarSetValuesFormObject=false;

pkInfo = null;
var fvMantenimientoProspectos = new FormValidator();

//////////////////////////////////////////////////////////////////////////////
//Funciones para la pantalla principal
function cargaPrincipalProspectos() {
  onButtonClickPestania("Formalizacion.PrincipalProspectosTipo","");
}

function clickTabla(pk) {
  pkInfo = pk; 
  cloneObject(pk, elCatalogo.getCatalogo());
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalProspectos();
  hideWaitLayer();
}

//////////////////////////////////////////////////////////////////////////////
//Funciones para la pantalla de mantenimiento
function cargaMantenimientoProspectos(tipoPantalla) {
  if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    if(pkInfo!=null && tipoPantalla==MODIFICAR)
    {
        operacion = tipoPantalla;
        numPantalla = 1;
        showWaitLayer();
        var urlCliente = ctxRoot + "/modules/Formalizacion/MantenimientoProspectosTipo.do";
        makeAjaxRequest(urlCliente, "HTML", showManto, null);
    }
    else
    {
      operacion = tipoPantalla;
      numPantalla = 1;
      showWaitLayer();
      var urlCliente = ctxRoot + "/modules/Formalizacion/MantenimientoProspectosTipo.do";
      makeAjaxRequest(urlCliente, "HTML", showManto, null);
    }
  }
}

function showManto(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimientoProspectos.setup({
    formName      : "frmDatosMantenimientoProspectos",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
}


function loadCatalogo() {
    elCatalogo.setOnUpdate(catLoaded);
    deshabilitaPK("prpNumProspecto,prpTipoPersona".split(","));
    if(operacion == MODIFICAR || operacion == CONSULTAR) {
        elCatalogo.buscaCatalogoPK(false);
    } else {
        muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar    
        hideWaitLayer();
    }
}

function catLoaded() {
  if(operacion == MODIFICAR) {
    muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
  } else if(operacion == CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmDatosMantenimientoProspectos")); //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();
}

function AltaOModificaInfo() {
  elCatalogo.setOnUpdate(operacionExitosa);
  if(operacion == ALTA && fvMantenimientoProspectos.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    elCatalogo.altaCatalogo();
  }
  else if(operacion==MODIFICAR && fvMantenimientoProspectos.checkForm())//Se trata de una modificación
  {
    showWaitLayer();
    elCatalogo.modificaCatalogo();
  }
}

function eliminarRegistro() {
  if(pkInfo == null) {
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  } else {
    verificarEliminacion({},{});
  }
}

function verificarEliminacion(obj, result) {
    elCatalogo.setOnUpdate(operacionExitosa);
    showWaitLayer();
    eliminaCatalogo(elCatalogo);
}

function isValidDate(date)
{
  var today = new Date();
  if(date>today)
    return true;
  else
    return false;
}
