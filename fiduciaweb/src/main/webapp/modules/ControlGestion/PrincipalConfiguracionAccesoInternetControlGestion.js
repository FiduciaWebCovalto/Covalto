showWaitLayer();

var llevaACaboCambioParamValor = JSON.parse("{\"id\":\"cambioAccesoInternet\",\"valorValorGlobal\":0}");
var conocerParamValorGlobal = JSON.parse("{\"id\":\"muestraParamValorGlobal\"}");

deshabilitaPK("rdSi,rdNo".split(","));
GI("cmdAceptar").disabled=true;

var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(conocerParamValorGlobal);
makeAjaxRequest(url, "HTML", verificacionContenidoParamValor, null);

formsLoaded();

//Funciones


function cargaPrincipalConfiguracionAccesoInternetControlGestion() {
	var urlCliente = ctxRoot + "/modules/ControlGestion/PrincipalConfiguracionAccesoInternetControlGestion.do";
	makeAjaxRequest(urlCliente, "HTML", despliegaPantallaP, null);
}

function despliegaPantallaP(obj, result) {
  GI("dvPantalla").innerHTML = result;
  hideWaitLayer();
  initForms();
}

function verificacionContenidoParamValor(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].paramValor > 0)
  {
    SA(GI("rdSi"), "checked", "true");
    llevaACaboCambioParamValor.valorValorGlobal=1;
  }
  else
  {
    SA(GI("rdNo"), "checked", "true");
    llevaACaboCambioParamValor.valorValorGlobal=0;
  }
}

function verificaCambio() {
  if(GI("rdSi").checked)
    llevaACaboCambioParamValor.valorValorGlobal=1;
  else if(GI("rdNo").checked)
    llevaACaboCambioParamValor.valorValorGlobal=0;
}

function realizaCambioParamValor() {
  //Llevar a cabo el cambio de ParamValor
  if(GI("rdSi").checked)
    llevaACaboCambioParamValor.valorValorGlobal=1;
  else if(GI("rdNo").checked)
    llevaACaboCambioParamValor.valorValorGlobal=0;  
  var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(llevaACaboCambioParamValor);
  makeAjaxRequest(url, "HTML", ejecutaCambioParamValor, null);
}

function ejecutaCambioParamValor(obj, result){
  var objResult = JSON.parse(result);
  
  Swal.fire('Aviso', 'Cambio de Acceso exitoso',  'warning');
  cargaPrincipalConfiguracionAccesoInternetControlGestion();
}

function habilitaRadios() {
  GI("rdSi").disabled=false;
  GI("rdNo").disabled=false;
  GI("cmdAceptar").disabled=false;
  GI("cmdModificar").disabled=true;
}
