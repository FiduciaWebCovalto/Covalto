var cat = new Catalogo("mx.com.inscitech.fiducia.domain.CreditoSim");
var paramProducto  = JSON.parse("{\"llaveClave\":0,\"order\":\"s\"}");
var paramimonedaCred  = JSON.parse("{\"llaveClave\":0,\"order\":\"s\"}");
var paramCliente  = JSON.parse("{\"llaveClave\":0,\"order\":\"s\"}");
var clavesCombo52 = JSON.parse("{\"llaveClave\":52}");
showWaitLayer();
var fechaDefault = new Date();
function isValidDate(date){ 
  var today = new Date();
  return false;
}
var feriados;
var hay_feriados=0;
function getDateInfo(date, wantsClassName) {
  var as_number = CalendarExtended.dateToInt(date);
  if(hay_feriados!=0){
    for(i=0;i<feriados.length;i++){
      if (as_number==feriados[i][0]){
        return {
      
          klass   : feriados[i][2],
          tooltip : "<div style='text-align: center'>"+feriados[i][1]+"</div>"
        };
      }
    }
  }
};
var cal = CalendarExtended.setup({					
		showTime: 12,    
    date           :    fechaDefault,
    disableFunc    :    isValidDate,
		onSelect: function(cal) { cal.hide() ; },
    dateInfo : getDateInfo,
    animation: false
});


var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;

var tablaData = new Array();
tablaData[0] = "descripcionProducto,100px";
tablaData[1] = "nombreCliente,300px";
tablaData[2] = "anumeroCredito,200px";
tablaData[3] = "imontoCred,200px";
tablaData[4] = "itasaIa,100px";
tablaData[5] = "fechaOtor,100px";
tablaData[6] = "fechaVenc,100px";
tablaData[7] = "imonedaCred,100px";
/*
tablaData[0] = "anumeroCredito,90px,center";
tablaData[1] = "iperiod,60px,right";
tablaData[2] = "dfechaFin,80px,center";
tablaData[3] = "icapital,100px,center";
tablaData[4] = "itasaInteres,80px,center";
tablaData[5] = "iintereses,100px,center";
tablaData[6] = "iiva,100px,right";
tablaData[7] = "icapital,100px,right";
tablaData[8] = "ipagoTotal,100px,right";
tablaData[9] = "isaldoCapital,100px,right";*/

var fvMantenimiento = new FormValidator();

fvMantenimiento.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

pkInfo=null;
initForms();
formsLoaded();

function limpiar(objForma){
  RF(objForma);
  cat = new Catalogo("mx.com.inscitech.fiducia.domain.CreditoSim");
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
    var urlCliente = ctxRoot + "/modules/Vinta/CreditoPre/MantenimientoParametrosContrasena.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimiento, null);
  }
}


function despliegaPantallaMantenimiento(obj, result) {
  GI("dvPantalla").innerHTML = result;
  hideWaitLayer();
  initForms();
  loadCatalogo();
  cal.manageFields("dfechaOtrorg", "dfechaOtrorg", "%d/%m/%Y");
  cal.manageFields("dfechaVenc", "dfechaVenc", "%d/%m/%Y");
    
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
    deshabilitaPK("idProducto,idCredito,idCliente".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmDatosMantenimiento"));                  //Deshabilita objetos (excepto botones)
    muestraObjs("cmdTabla"); //Mostrar el botón Regresar
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();
}

function AltaOModificaInfo() {
  //alert("Operacion: " + operacion);
  cat.setOnUpdate(operacionExitosa);
  if(operacion==ALTA )//Se trata de una alta
  {
    if(GI("idProducto").value==""||GI("idCredito").value==""||GI("idCliente").value==""){
        Swal.fire('Aviso', 'Son campos obligatorios el Producto, el Credito y el Cliente.',  'warning');
        GI("idProducto").focus();
    }
    else{
        showWaitLayer();
        cat.altaCatalogo();    
    }
  }
  else if(operacion==MODIFICAR)//Se trata de una modificación
  {
    showWaitLayer();
    cat.modificaCatalogo();
  }
}

function eliminarRegistro() {
//alert(pkInfo)
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    cat.setOnUpdate(operacionExitosa);
    showWaitLayer();
    eliminaCatalogo(cat);
  }
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipal();
  hideWaitLayer();
}

function cargaPrincipal() {
  onButtonClickPestania("Vinta.CreditoPre.PrincipalParametrosContrasena","");
}



function verificarAlta() {
  if(GI("idProducto").value!="")
  {
    var ingresaSecuencial = JSON.parse("{\"id\":\"conCreditoSecPre\"}");
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(ingresaSecuencial);
    //alert(url)
    makeAjaxRequest(url, "HTML", funcionIngresaSecuencial, null);
  }
}

function funcionIngresaSecuencial(obj, result) {
 //alert(result)
  var objResult = JSON.parse(result);
  GI("idCredito").value = objResult[0].folio;
}


function cargaPrincipalTabla(){
    var objParametros = JSON.parse("{\"id\":\"fncGeneraTablaAmorPre\"}");
    objParametros.numeroCredito= GI("anumeroCredito").value;
    
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objParametros);
    //alert(url)
    makeAjaxRequest(url, "HTML", respuestaTabla);
}

function respuestaTabla(obj, result){
  var fcn = JSON.parse(result);
  if(isDefinedAndNotNull(fcn.resultado) && fcn.resultado == 0) {
    Swal.fire('¡Éxito!', "Operación realizada exitosamente", 'success');
  } else if(isDefinedAndNotNull(fcn.resultado) && fcn.resultado == 1) {
    Swal.fire('Aviso', 'El Credito ya tiene pagos realizados!',  'warning');
  }
  else {
    Swal.fire('Aviso', 'Ocurrió un error al realizar la operación!',  'warning');
  }  
  hideWaitLayer();
}

function imprimirReporte() {

 // if(fvRepCtasInd.checkForm())
 // {
    //Swal.fire('Aviso', 'llego aqui',  'warning')showWaitLayer();
    var parametros = getParameters(GI("frmDatos"));
    parametros.Folio = GI("paramFolio").value;
    parametros.urlReporte = '/modules/Vinta/CreditoPre/ReporteAgenda.jsp';
    parametros.id="qryVintaAmortizacionesCreditoPre";
    
    if(!isDefinedAndNotNull(parametros.sendToJSP) && isDefinedAndNotNull(GI("urlReporte"))) {
      var url = GI("urlReporte").value;
      for(k in parametros) {
        url += k + "=" + parametros[k] + "&";
      }
      url += "web=0";
      var link = GI("linkReporteNew");
      link.href=url;
      link.click();    
      return;
    }
	//makeAjaxRequest(url, "HTML", validaEjecucionReporte, parametros);
    validaEjecucionReporte(parametros, "{\"RESULTADO\":0}");
}

function validaEjecucionReporte(obj, result) {
  //console.log("result: " + result);
  var objResult = JSON.parse(result);
  var resultado = -1;
  
  if(isDefinedAndNotNull(objResult.RESULTADO))
    resultado = objResult.RESULTADO;
  else if(isDefinedAndNotNull(objResult.codigoError))
    resultado = objResult.codigoError
  if(resultado == 0) { // Ejecucion OK
    var idLink = "linkReporte"; 
    if(isDefinedAndNotNull(obj.sendToJSP)) idLink = "linkReporteNew"; 
    //Swal.fire('Aviso', 'LLEGO AKI',  'warning')obj.id = "qryVintaAmortizacionesCreditoPre";
    var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(obj);
    var link = GI(idLink);
    link.href=url;
    link.click();
    document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
    hideWaitLayer();
  } else {
    hideWaitLayer();
    if(resultado == 1){ // Error
    } else { // Error ORACLE
    }
  }
      hideWaitLayer();
}
