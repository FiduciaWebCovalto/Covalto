var catReglaNegocio = new Catalogo("mx.com.inscitech.fiducia.domain.ReglaNegocio");

showWaitLayer();

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;

var clavesCombo1008 = JSON.parse("{\"llaveClave\":1008}");
var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
//var verificarExistenciaRegistro = JSON.parse("{\"id\":\"verificaExisteContactoFideicomiso\",\"numContrato\":0,\"numSecContac\":0}");
var consultaDatosInformativos = JSON.parse("{\"id\":\"muestraDatosReglasOperacion\",\"NumFideicomiso\":0}");
var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaContrato\",\"numContrato\":0}");
var validacionAlta2 = JSON.parse("{\"id\":\"verificaSeaActivo\",\"numContrato\":0}");

var tablaReglasOpera = new Array();
tablaReglasOpera[0] = "froNumFideicom,90px";
tablaReglasOpera[1] = "froSecNumFideicom,90px";
tablaReglasOpera[2] = "froTipoRegla,100px";
tablaReglasOpera[3] = "froDescripcion,300px";
tablaReglasOpera[4] = "froStatus,90px";

var operacion = 0;
var numPatalla = 0;
var numParametroPantalla = 0;
pkInfo = null;
var fvMantenimientoFideicomisos = new FormValidator();

formsLoaded();

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalContactosFideicomisos() {
  onButtonClickPestania("Administracion.ReglasOperacion.PrincipalReglasOperacion","");
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catReglaNegocio.getCatalogo());
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalContactosFideicomisos();
  hideWaitLayer();
}

//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda pantalla
function cargaMantenimientoContactosFideicomisos(tipoPantalla) {
  if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Administracion/ReglasOperacion/MantenimientoReglasOperacion.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoContactosFideicomisos, null);
  }
}

function despliegaPantallaMantenimientoContactosFideicomisos(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimientoFideicomisos.setup({
    formName      : "frmDatosMantenimientoContactosFideicomisos",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
  
  //No permitir editar los 4 campos informativos de la página de mantenimiento:
  //1. Cto. Eje
  //2. Nombre
  //3. Tipo de persona
  //4. No. Cliente
  //deshabilitaPK("froNumFideicom,froSecNumFideicom".split(","));
}

function loadCatalogo() {
  catReglaNegocio.setOnUpdate(catLoaded);
  if(operacion==MODIFICAR || operacion==CONSULTAR)
    catReglaNegocio.buscaCatalogoPK(false);
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
    deshabilitaPK("froSecNumFideicom,froNumFideicom".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmDatosMantenimientoContactosFideicomisos"));
  }
  //Mostrar datos en campos informativos
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  mostrarDatosInformativos(3);
  formsLoaded();
}

function AltaOModificaInfo() {
  catReglaNegocio.setOnUpdate(operacionExitosa);
  if(operacion==ALTA && fvMantenimientoFideicomisos.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    catReglaNegocio.altaCatalogo();
  }
  else if(operacion==MODIFICAR && fvMantenimientoFideicomisos.checkForm())//Se trata de una modificación
  {
    showWaitLayer();
    catReglaNegocio.modificaCatalogo();
  }
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    catReglaNegocio.setOnUpdate(operacionExitosa);
    showWaitLayer();
    eliminaCatalogo(catReglaNegocio);
  }
}


//////////////////////////////////////////////////////////////
//Verificar si el Registro aún no existe
/*function verificarSiExisteRegistro() {
  if(GI("froNumFideicom").value!="" && GI("froSecNumFideicom").value!="")
  {
    verificarExistenciaRegistro.numContrato=GI("froNumFideicom").value;
    verificarExistenciaRegistro.numSecContac=GI("froSecNumFideicom").value;
    
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(verificarExistenciaRegistro);
    makeAjaxRequest(url, "HTML", verificarSiExisteRegistroAction, null);
  }
  else if(GI("froNumFideicom").value!="")
  
  
  mostrarDatosInformativos(2);
}

function verificarSiExisteRegistroAction(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].existeRegistro > 0)
  {
    Swal.fire('Aviso', 'El Registro ya existe, verifique',  'warning');
    GI("froNumFideicom").value="";
    GI("froSecNumFideicom").value="";
    
    GI("txtCtoEje").value="";
    GI("txtNombre").value="";
    GI("txtTipoPersona").value="";
    GI("txtNoCliente").value="";
  }
  else
    mostrarDatosInformativos(2);
}*/

//Muestra los datos informativos
function mostrarDatosInformativos(parametroPantalla) {
  numParametroPantalla = parametroPantalla;
  
  if(parametroPantalla==1)
  {
    if(GI("paramNumFiso").value !="")
    {
      showWaitLayer();
      validacionAlta2.numContrato = GI("paramNumFiso").value;
      var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta2);
      makeAjaxRequest(url, "HTML", funcVerExistRegistro, GI("paramNumFiso"));
    }
    /*else
        Swal.fire('Aviso', 'Favor de introducir Numero de Fideicomiso.',  'warning');*/
  }
  else if(parametroPantalla==2)
  {
    consultaDatosInformativos.NumFideicomiso = GI("froNumFideicom").value;
    validacionAlta.numContrato = GI("froNumFideicom").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificarAlta, GI("froNumFideicom"));
  }
  else
  {
    showWaitLayer();
    consultaDatosInformativos.NumFideicomiso = GI("froNumFideicom").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, GI("froNumFideicom"));
  }
}

function funcVerExistRegistro(obj,result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoCveStContrat == 0)
  {
    consultaDatosInformativos.NumFideicomiso = GI("paramNumFiso").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, GI("paramNumFiso"));
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no está ACTIVO',  'warning');
    obj.value="";
    obj.focus();
    hideWaitLayer();
  }
}

function verificarAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoNumContrato > 0)
  {
    validacionAlta2.numContrato = obj.value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta2);
    makeAjaxRequest(url, "HTML", verificarAlta2, obj);
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no existe, verifique',  'warning');
    obj.value="";
    obj.focus();
  }
}

function verificarAlta2(obj,result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoCveStContrat == 0)
  {
    var SecNumContacto = JSON.parse("{\"id\":\"numSecNumContacto\",\"NumFiso\":0}");
    SecNumContacto.NumFiso=obj.value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(SecNumContacto);
    makeAjaxRequest(url, "HTML", agregarContacto, obj);
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no está ACTIVO',  'warning');
    obj.value="";
    obj.focus();
  }
}

function agregarContacto(obj, result) {
  var objResult = JSON.parse(result);
  GI("froSecNumFideicom").value=objResult[0].secNumContacto;
  
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
  makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
}

function insertaDatosInformativos(obj, result) {
  var objResult = JSON.parse(result);
  /*GI("txtCtoEje").value=objResult[0].ctoNumCtoEje;
  GI("txtNombre").value=objResult[0].ctoNomContrato;
  GI("txtTipoPersona").value=objResult[0].ctoCveTipoPer;
  GI("txtNoCliente").value=objResult[0].ctoNumCliente;*/
  hideWaitLayer();
}
function generaFichaSP(){
    if(GI("paramNumFiso").value !="")
    {
        if(confirm("¿Esta seguro que desea aplicar?")){
            var parametrosUrl = {
                id : 'storeGenFichaROP', 
                numfideico:GI("paramNumFiso").value
            }
            var url = ctxRoot + '/executeRef.do?json=' + JSON.stringify(parametrosUrl);
            //alert(url)
            makeAjaxRequest(url, "HTML", ObtenReporte, null);
        }
    }
    else
        Swal.fire('Aviso', 'Favor de introducir Numero de Fideicomiso.',  'warning');
}
//storeGenFichaROP
//-------------------------------------------------codigo para nuevos reportes

function ObtenReporte(obj,result) {
    
    if( JSON.parse(result).RESULTADO == 0){
    
     var idLink = "linkReporteNew"; 
     var parametrosUrl = new Object;
     parametrosUrl.sendToJSP="true";

     parametrosUrl.urlReporte="/modules/Administracion/ReglasOperacion/ReporteFichaTecnica.jsp"
     parametrosUrl.id="getRepFReglaOp";
     parametrosUrl.numfideico = GI("paramNumFiso").value;
     var url = ctxRoot + "/imprimirReporte.do?json=" + encodeURIComponent(JSON.stringify(parametrosUrl));
     console.log('url: ' + url);

     idLink.href=url;
     window.open(url,GI("linkReporteNew").value);        
     //idLink.click();
     document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
    
/*    
        var cadenota='{"Estructura":"1","sendToJSP":"true","urlReporte":"/modules/Administracion/ReglasOperacion/ReporteFichaTecnica.jsp","Order":"s","id":"getRepFReglaOp","numfideico":'+GI("paramNumFiso").value+'+"}';
        var url = ctxRoot + "/imprimirReporte.do?json=" + cadenota;
        var link = GI('linkReporteNew');
        link.href=url;
        link.click();
        document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
        hideWaitLayer();*/
    }
  
}
