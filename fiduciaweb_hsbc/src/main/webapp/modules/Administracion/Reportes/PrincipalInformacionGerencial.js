var fvReportes = new FormValidator();

fvReportes.setup({
  formName      : "frmReportes",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

var fechaDefault = new Date();

function setFechaCal() {
  var fecha;
  if(isDefinedAndNotNull(GI("Fecha"))) 
    fecha = GI("Fecha").value.split("/");
  else if(isDefinedAndNotNull(GI("paramFecha")))
    fecha = GI("paramFecha").value.split("/");
    
  GI("paramMes").value = fecha[0];
  GI("paramAno").value = fecha[1];
}

function isValidDate(date) { 
  var today = new Date();
  if(date > today)
    return true;
  else
    return false;
}

function cargaCalendario(idCalendario) {
  Calendar.setup({
      inputField     :    idCalendario,   // id of the input field
      button         :    idCalendario,
      ifFormat       :    "%m/%Y", //"%a %e/%b/%Y",       // format of the input field
      showsTime      :    false,
      timeFormat     :    "24",
      onUpdate       :    setFechaCal,
      disableFunc    :    isValidDate,
      date           :    fechaDefault,
      weekNumbers    :    false,
      cache          :    true,
      step           :    1
  });                   
}

function cargaReporte(reporte) {
  var objReporte = GI("dvReporte");
  var urlReportes = ctxRoot + "/modules/Administracion/Reportes/";
  
  if(reporte == "-1") {
    doInnerHTML(objReporte, "");
  } else {
    showWaitLayer();
    LDSCR(urlReportes + reporte + ".do", objReporte, pantallaCargada);
  }
}

function pantallaCargada() {
  hideWaitLayer();
  
  if(isDefinedAndNotNull(GI("Fecha")))
    try { cargaCalendario("Fecha"); } catch(ex) {}
  else if(isDefinedAndNotNull(GI("paramFecha"))) 
    try { cargaCalendario("paramFecha"); } catch(ex) {}
}

function ejecutaReporte() {
  if(fvReportes.checkForm()) {
    var parametros = getParameters(GI("frmReportes"));
    
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
    if(isDefinedAndNotNull(GI("template"))) parametros.template = GI("template").value;
    if(isDefinedAndNotNull(GI("nombreReporte"))) parametros.nombreReporte = GI("nombreReporte").value;
    if(isDefinedAndNotNull(GI("refSP"))) {
      parametros.id = GI("refSP").value;
      var url = ctxRoot + "/execRefReporte.do?json=" + JSON.stringify(parametros);
      showWaitLayer();
      makeAjaxRequest(url, "HTML", validaEjecucionReporte, parametros);
    } else {
      validaEjecucionReporte(parametros, "{\"RESULTADO\":0}");
    }
  }
}

function validaEjecucionReporte(obj, result) {
  var objResult = JSON.parse(result);
  var resultado = -1;
  
  if(isDefinedAndNotNull(objResult.RESULTADO))
    resultado = objResult.RESULTADO;
  else if(isDefinedAndNotNull(objResult.codigoError))
    resultado = objResult.codigoError;
    
  if(resultado == 0) { // Ejecucion OK
    var idLink = "linkReporte"; 
    if(isDefinedAndNotNull(obj.sendToJSP)) idLink = "linkReporteNew"; 
    obj.id = GI("refQry").value;
    var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(obj);
    var link = GI(idLink);
    link.href=url;
    link.click();
    document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
  } else {
    if(resultado == 1){ // Error
    } else { // Error ORACLE
    }
  }
  hideWaitLayer();
}
