var catConstitucion = new Catalogo("mx.com.inscitech.fiducia.domain.Anteproy");


var clavesCombo161 = JSON.parse("{\"llaveClave\":161}");
var consultaDatosInformativos = JSON.parse("{\"id\":\"claveProducto\",\"numeroProducto\":0}");
var validacionNoExistaFideicomiso = JSON.parse("{\"id\":\"verificaExistenciaContrato\",\"numContrato\":0}");
var determinaContrato = JSON.parse("{\"id\":\"determinaSigContrato\"}"); 
//var validacion = JSON.parse("{\"id\":\"cuentaAnteproyectosBajaProspectos\",\"numProspecto\":-1}");
initForms();
//enviaCorreo(132)
var tablaDatosFichaConstitucionData = new Array();
tablaDatosFichaConstitucionData[0] = "antNumProspecto,70px";
tablaDatosFichaConstitucionData[1] = "antNomNegocio,250px";
tablaDatosFichaConstitucionData[2] = "antFechaApertura,90px";
tablaDatosFichaConstitucionData[3] = "antCveTipoNeg,250px";
tablaDatosFichaConstitucionData[4] = "antCveClasifPro,160px";
tablaDatosFichaConstitucionData[5] = "antCveStProspec,90px";
tablaDatosFichaConstitucionData[6] = "antNumContrato,70px";

var numPantalla = 0;
var fvFuncConstit = new FormValidator();
var fechaConstitucion = new Date();
pkInfo = null;

//Variables para el uso de los checkBox
var fideicomisoFoseg=0;
var contabilidadDetallada=0;
var enviaMensajeria=0;

function cargaPrincipalConstitucion() {
  numPantalla = 0;
  pkInfo = null;
  onButtonClickPestania("ControlGestion.PrincipalConstitucion","");
}

function clickTabla(pk) {
  if(pk.antCveStProspec=="AUTORIZADO")
  {
    pkInfo = pk;
    cargaMantenimientoConstitucion();
  }
}

////////////////////////////////////////////////////////////////////
//CARGA LA SEGUNDA PANTALLA (MantenimientoConstitucion)
function cargaMantenimientoConstitucion() {
  numPantalla = 1;
  var urlCliente = ctxRoot + "/modules/ControlGestion/MantenimientoConstitucion.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
}

function despliegaPantalla(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();  
  GI("txtNoFideicomiso").value=pkInfo.antNumContrato;
 /* GI("antNumProspecto").value=pkInfo.antNumProspecto;
  GI("antNomNegocio").value=pkInfo.antNomNegocio;
  GI("antCveClasifPro").value=pkInfo.antCveClasifPro;
  GI("antCveTipoNeg").value=pkInfo.antCveTipoNeg;*/
      loadCatalogo()

 /* var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(determinaContrato);
  makeAjaxRequest(url, "HTML", determinaFideicomiso, null);*/  
}

function determinaFideicomiso(obj, result)
{
  var objResult = JSON.parse(result);
}

function loadCatalogo() {
  catConstitucion.setOnUpdate(catLoaded);
  
  //Asignar llave primaria a la pantalla de mantenimiento
  GI("antNumProspecto").value = pkInfo.antNumProspecto;
  catConstitucion.buscaCatalogoPK();
}

function catLoaded() {
  //Deshabilitar los datos que son informativos
  deshabilitaPK("antNumProspecto,antNomNegocio,antCveTipoNeg".split(","));
  
  //Colocar el Nombre del producto, teniendo el nÃºmero del mismo
  /*consultaDatosInformativos.numeroProducto = GI("antNumProducto").value;
  if(GI("antNumProducto").value!="")
  {
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", asinaNomProducto, null);
  }*/
  
  //Agregando la funcionalidad del required
  fvFuncConstit.setup({
    formName      : "frmMantenimientoConstitucion",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
  
  //Agregando la funcionalidad para la Fecha de ConstituciÃ³n
  Calendar.setup({
    inputField     :    "txtFechaConstitucion",   // id of the input field
    button         :    "txtFechaConstitucion",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechaConstitucion,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
  });
  
  formsLoaded();
}


function verificarEjecucionFuncion() {
  
  if(fvFuncConstit.checkForm())
    ejecutaFuncionConstitucion();
  
  // cÃ³digo antiguo
  /*var url = ctxRoot + "/getRef.do?json={\"id\":\"consultaExisteKYCConstitucion\",\"Proyecto\":"+eval(GI("antNumProspecto").value)+"}";
  makeAjaxRequest(url, "HTML", existeKYC, null);
  */
}



//Funciones para la funcionalidad de la Fecha ConstituciÃ³n
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

///////////////////////////////////////////////////////////////////////////
//FUNCION QUE SE EJECUTARÃ? UNA VEZ QUE SE DE CLICK EN ACEPTAR
function ejecutaFuncionConstitucion(){
  
  var objParametros = JSON.parse("{\"id\":\"funcionConstitucion\"}");
  eval("objParametros.Prospecto=" + GI("antNumProspecto").value);
  eval("objParametros.Fideicomiso=" + GI("txtNoFideicomiso").value);
  eval("objParametros.ContabilidadDetallada=0");
  eval("objParametros.EnvioMensajeria=0" );
  eval("objParametros.FideicomisoFoseg=0");
  eval("objParametros.FechaConstitucion='" + GI("txtFechaConstitucion").value +"'");
  eval("objParametros.NumAdministradorResponsable=0");
  eval("objParametros.NomAdministradorResponsable=''");
  eval("objParametros.Comentarios=''");
  
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objParametros);
 // alert(url)
  makeAjaxRequest(url, "HTML", respuestaFuncionConstitucion, null);
}

function respuestaFuncionConstitucion(obj, result){
//alert(result)
  var res=JSON.parse(result).resultado;
  switch(res){
    case 0:
      enviaCorreoAcepta(GI("antNumProspecto").value);
      Swal.fire('Aviso', 'Proceso satisfactorio',  'warning');
      break;
    case -1:
      Swal.fire('Aviso', 'Operacion No Realizada',  'warning');
      break;
    default:
      alert("Error: "+res);
  }
  cargaPrincipalConstitucion();
  hideWaitLayer();
}

function enviaCorreoAcepta(proyecto) {
        //Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
        var idLink = "linkReporteNew";
        var parametrosUrl = new Object;
        parametrosUrl.sendToJSP = "true";
        // Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte = "/modules/Formalizacion/CorreoAutorizaExp/EnviarCorreo.jsp"
        parametrosUrl.id = "mandaCorreoAcepta";
        parametrosUrl.proyecto = proyecto;
        var url = ctxRoot + "/imprimirReporte.do?json=" + encodeURIComponent(JSON.stringify(parametrosUrl));
        //alert(url)
        idLink.href = url;
        window.open(url, GI("linkReporteNew").value, "width=450,height=205,scrollbars=NO");
        //idLink.click();
        document.onreadystatechange = function () {
            hideWaitLayer();
            document.onreadystatechange = function () {
            }
        }
    }

  function enviaCorreo(proyecto){
     var idLink = "linkReporteNew"; 
     var parametrosUrl = new Object;
     parametrosUrl.sendToJSP="true";
     //Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte="/modules/Formalizacion/AgendaBursatil/EnviarCorreo.jsp"
     parametrosUrl.id="mandaCorreoInstrucBursatil";
	 parametrosUrl.proyecto=proyecto;
     var url = ctxRoot + "/imprimirReporte.do?json=" + encodeURIComponent(JSON.stringify(parametrosUrl));
	 //alert(url)
     idLink.href=url;
     window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");        
     //idLink.click();
     document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
  }