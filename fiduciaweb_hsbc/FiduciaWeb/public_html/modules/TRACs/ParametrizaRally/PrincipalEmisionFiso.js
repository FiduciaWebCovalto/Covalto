var cat = new Catalogo("mx.com.inscitech.fiducia.domain.FSisvalFiduciaweb");

showWaitLayer();

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;
var clavesCombo1004 = JSON.parse("{\"llaveClave\":1004}");

var tablaData = new Array();
tablaData[0] = "fvfwIdOperSisVal,50";
tablaData[1] = "fvfwIdOperSisFw,50";
tablaData[2] = "fvfwTipoOper,100";
tablaData[3] = "fvfwNumOperacion,100";

var fvMantenimiento = new FormValidator();

fvMantenimiento.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

pkInfo=null;


//calendarios
var fechaDefault = new Date();
var cal = CalendarExtended.setup({					
		showTime: 12,    
    date           :    fechaDefault,
    disableFunc    :    isValidDate,
		onSelect: function(cal) { cal.hide() ; },
    animation: false
})

function setFechaCal(){}
function isValidDate(date){ 
  var today = new Date();
  if(date > today)
    return true;
  else
    return false;
}


initForms();
formsLoaded();


function limpiar(objForma){
  RF(objForma);
  catFideicomisos = new Catalogo("mx.com.inscitech.fiducia.domain.FSisvalFiduciaweb");
  pkInfo = null;
}


function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,cat.getCatalogo());
}

//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda pantalla

var operacion = 0;

function cargaMantenimiento(tipoPantalla) {
  if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/TRACs/ParametrizaRally/MantenimientoEmisionFiso.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimiento, null);
  }
}


function despliegaPantallaMantenimiento(obj, result) {
  GI("dvPantalla").innerHTML = result;
  hideWaitLayer();
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimiento.setup({
    formName      : "frmDatosMantenimiento",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true,
    showErrors    : true
  });
}

function loadCatalogo() {
  cat.setOnUpdate(catLoaded);
  if(operacion==MODIFICAR || operacion==CONSULTAR)
    cat.buscaCatalogoPK(false);
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
  }
}

function catLoaded() {
  if(operacion==MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
    deshabilitaPK("fvfwIdOperSisVal,fvfwIdOperSisFw".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    muestraObjs("cmdCancelar");
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmDatosMantenimiento"));                  //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();
}

function AltaOModificaInfo() {
  //alert("Operacion: " + operacion);
  if(operacion==ALTA && fvMantenimiento.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    manttoCatalogo(1)
  }
  else if(operacion==MODIFICAR && fvMantenimiento.checkForm())//Se trata de una modificación
  {
    showWaitLayer();
    manttoCatalogo(2)
  }
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    showWaitLayer();
    manttoCatalogo(3)
  }
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipal();
  hideWaitLayer();
}

function cargaPrincipal() {
  onButtonClickPestania("TRACs.ParametrizaRally.PrincipalEmisionFiso","");
}

//SECCION PARA DAR MANTTO A LOS CATALOGOS MANUALMENTE
/*Opciones
1 Alta
2 Modificacion
3 Baja
*/
var vgContenedorDatos=null;
function manttoCatalogo(opcion){      
    vgContenedorDatos=JSON.parse("{\"id\":\"ejemanttorally\"}");
        var VAR_A2K  =''
        var VAR_FW   =''
        var TIPO_OPER   =''
        var VAR_OPERACION   =0

        if(opcion!=3)
        {
             VAR_A2K  =GI("fvfwIdOperSisVal").value
             VAR_FW   =GI("fvfwIdOperSisFw").value
             TIPO_OPER   =GI("fvfwTipoOper").value
             VAR_OPERACION   =GI("fvfwNumOperacion").value
        }
        else
        {
           VAR_A2K  =pkInfo.fvfwIdOperSisVal
           VAR_FW   =pkInfo.fvfwIdOperSisFw
        }
          vgContenedorDatos.Opcion=eval(opcion);
          vgContenedorDatos.Rally=VAR_A2K;
          vgContenedorDatos.FiduciaWeb=VAR_FW;
          vgContenedorDatos.TipoOperacion=TIPO_OPER;
          vgContenedorDatos.NumOperacion=eval(VAR_OPERACION);
          var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);//executeRef
          //alert(url);
          makeAjaxRequest(url, "HTML", resultadoMantenimiento, null);
  }
  function resultadoMantenimiento(objTabla, result) {
    //alert(result);
    var resultado =JSON.parse(result).result;
    if(resultado==0){
      operacionExitosa();
    }
    else{
      Swal.fire('Aviso', 'Ocurrio un Error inesperado',  'warning');        
    } 
    hideWaitLayer();
  }