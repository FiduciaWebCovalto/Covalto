showWaitLayer();

var numContrato = GI("paramFideicomiso").value;
consultaNombreFideicomiso("nomFideicomiso",GI("paramFideicomiso"));
var objRadioParam = JSON.parse("{}");
var t;
var fvPrincipalCierreMensual = new FormValidator();

//Agregando la funcionalidad del required
fvPrincipalCierreMensual.setup({
  formName      : "frmPrincipalCierreMensual",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

//----------------------------------------------------VARIABLES GLOBALES para el timmer--------------------------------------------
  var porcTimer = 0;
  var NTI=0;
  var NTIaux = 0;
  var NumeroInversionistasActuales = 0;
  var ci = false;
  var cont = 0;
  var porctot=0;
  var NIAct=0;
//------------------------------------------------------------------------------------------------------------------

hideWaitLayer();

function cargaPrincipalCierreMensual() {
  onButtonClickPestania("CuentasIndividuales.CierreMensual.PrincipalCierreMensual","");
}

function botonAceptar() {
  //comprobarIteracionPorcentajeDeProcesoTranscurrido();//Determina si es necesario o no iterar del 25% al 75%    
    //obtenerFechaContable();
    showWaitLayer();
    var objQuerySelectCount = JSON.parse("{\"id\":\"verRegistroCF\"}");
    objQuerySelectCount.fechaAplicacion = "01/"+GI("txtMes").value+"/"+ GI("txtAno").value;
    objQuerySelectCount.interfaseID = "Cierre"; 
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objQuerySelectCount);        
    makeAjaxRequest(url, "HTML", verificarRegistrosErrCtasIndiv2, null);            
}

var numRegistros;
var contRegistros;
function verificarRegistrosErrCtasIndiv2(obj, result){
   //alert(result);
    numRegistros=JSON.parse(result)[0]
    contRegistros=numRegistros.totalRegistros
    var objParametros = JSON.parse("{\"id\":\"funcionCierreMensual\"}");
    eval("objParametros.Fideicomiso=" + numContrato);
    var intempleado=GI("txtIntereses").value;
    var intmunicipio=GI("txtInteresesMun").value;
    intempleado=intempleado.split(",").join("");
    intmunicipio=intmunicipio.split(",").join("");
    eval("objParametros.Opcion="+intempleado);
    console.log(intempleado);
    eval("objParametros.Mes=" + GI("txtMes").value);
    eval("objParametros.Ano=" + GI("txtAno").value); 
    eval("objParametros.Importe=" + intmunicipio); 
    console.log(intmunicipio);
    
    stopCtl = false;
    ultimaCantidad = -1;
    veces = 0;
    etapa = 0;    
    objMonitor.Anio = GI("txtAno").value;
    objMonitor.Mes = GI("txtMes").value;
    urlProcCtl = ctxRoot + "/doRef.do?json=" + JSON.stringify(objMonitor);    
    var url = ctxRoot + "/executeRefAsync.do?json=" + JSON.stringify(objParametros);
    makeAjaxRequest(url, "HTML", processMonitor, null);        
}

var objMonitor = {id:"controlCierrePensiones", Fideicomiso: 1045, Anio:2020,Mes:1}; //Cambiar ID a la consulta de control //interfaseID en 3 para apertura de linea
var urlProcCtl = ctxRoot + "/doRef.do?json=" + JSON.stringify(objMonitor);
function processMonitor(obj, result) {
    console.log("Total Registros: "+contRegistros);
    console.log("Salida stopCtl: "+stopCtl);
    if(!stopCtl) { setTimeout(function() { makeAjaxRequest(urlProcCtl, "HTML", processMonitor, null); }, 3000); }
    console.log("Salida result: "+result);
    //if(isDefinedAndNotNull(result)) {
        
        try {
            var msgProc = JSON.parse(result);
            if(msgProc.succedded) return;
        } catch(e) {}
        
        var objCtl = JSON.parse(result)[0];
        console.log("Salida totalRegistros: "+objCtl.totalRegistros);
        if(!stopCtl && objCtl.totalRegistros == contRegistros && veces >= 5) {
            stopCtl = true;
            //Poner aqui la funcion a llamar cunado se cumplan las condiciones
            validaEjecutaPlan(obj,objCtl.totalRegistros);
        } else {
            ultimaCantidad = objCtl.totalRegistros;
            veces++;
        }
    //}    
}

function validaEjecutaPlan(obj, result){
  Swal.fire('Aviso', 'Proceso concluido!',  'warning');
  hideWaitLayer();
}

/*function timedCount()
{
t=setTimeout("timedCount()",3000);
GI("txtProgreso").value=t;
}*/

function stopCount()
{
  clearTimeout(t);
  GI("txtProgreso").value="100 %";
  porcTimer = 0;
  NumeroInversionistasActuales = 0;
  porctot = 0;
  NIAct=0;
}

function respuestaFuncionCierreMensual(obj, result){
  var res=JSON.parse(result).RESULTADO;
  alert(res)
  //stopCount();
  switch(res){
   case 0: Swal.fire('Aviso', 'Proceso exitoso',  'warning'); break;
   case 1: Swal.fire('Aviso', 'Ocurrio un error al procesar intereses',  'warning'); break;
   default: Swal.fire('Aviso', 'Ocurrió un error',  'warning');
  }  
  
  hideWaitLayer();
}

function cargaRadios(){

  var validaRadio = JSON.parse("{\"id\":\"muestraDatosParamFisosPart\",\"Fideicomiso\":0}");
    validaRadio.Fideicomiso = GI("paramFideicomiso").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validaRadio);
    makeAjaxRequest(url, "HTML", asignaRadio, null);
    nextDivFunction(GI("tipoRadio"));

  
}

function asignaRadio(obj, result) {
   var objResult = JSON.parse(result);
  if(objResult[0].pctoParticip==0)
  {
    GI("participacion").style.visibility = "hidden"; 
    ocultaObj("radio1");
    hideWaitLayer();
  }else
    hideWaitLayer();
}

function obtenerFechaContable(){

    var objObtenerFecha = JSON.parse("{\"id\":\"ultimoDiaMes\"}");
    objObtenerFecha.mes=GI("txtMes").value;
    objObtenerFecha.anio=GI("txtAno").value;
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objObtenerFecha);
    makeAjaxRequest(url, "HTML", verFecha, null);
}

function verFecha (obj, result){
  var resultado = JSON.parse(result)[0];
  GI("txtFecha").value=resultado.fecha;
}

function imprimirReporte() {
    
    showWaitLayer();
    var parametros = getParameters(GI("frmPrincipalCierreMensual"));
     
   // parametros.Tipo = 2;
   // parametros.Fideicomiso = GI("paramFideicomiso").value;
   // parametros.FechaInicial ="";
   // parametros.FechaFinal = GI("txtFecha").value;
   // parametros.CveNiv1 ="3400000000";
    //parametros.CveNiv2 ="3400010000";
   // parametros.CveNiv3 ="3400010001";
   // parametros.NomNiv1="ENTIDADES";
   // parametros.NomNiv2="MUNICIPIO";
   // parametros.NomNiv3="EJIDO";
   // parametros.NumNiveles=3;
   
    eval("parametros.urlReporte = '/jsp/Reportes/CuentasIndividuales/EstadoCuenta.jsp'");
    
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
      makeAjaxRequest(url, "HTML", validaImprimirReporte, parametros);
    } else {
      validaImprimirReporte(parametros, "{\"RESULTADO\":0}");
    }
    //showWaitLayer();
    //makeAjaxRequest(url, "HTML", validaImprimirReporte, parametros);    
}

function validaImprimirReporte(obj, result) {
  // TODO: Dejar el mensaje de espera hasta que se despliegue el guardar como
  var objResult = JSON.parse(result);
  if(objResult.RESULTADO == 0) { // Ejecucion OK
    var idLink = "linkReporte"; 
    idLink = "linkReporteNew"; 
    obj.id = GI("refQry").value;
    var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(obj);
    var link = GI(idLink);
    link.href=url;
    link.click();
    document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
    hideWaitLayer();
  } 
  else // Error
    Swal.fire('Aviso', 'Ocurrio un error, favor de verificar',  'warning');
    hideWaitLayer();
  }


function imprimirReporteSoloParaParticipacion(){
    if(GI("participacion").value==1){
       if(confirm("¿Desea ver el estado de cuenta?"))
          imprimirReporte();
    }
}

function reedireccionar(){
var validaRadio = JSON.parse("{\"id\":\"refer\",\"Fideicomiso\":0}");
    validaRadio.Fideicomiso = GI("paramFideicomiso").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validaRadio);
    makeAjaxRequest(url, "HTML", resultrefer, null);
  
}

function resultrefer(obj, result) {
   var objResult = JSON.parse(result);
  if(objResult[0].fisoSeleccionado!=1){
      onButtonClickPestania("CuentasIndividuales.CuentasIndividuales.PrincipalFideicomisosCuentasIndividuales","");
      loadDynamicJS(ctxRoot + "/modules/CuentasIndividuales/CuentasIndividuales/PrincipalFideicomisosCuentasIndividuales.js");
      //hideWaitLayer();
      
  }
    hideWaitLayer();

}

//**************************************************************************************   TIMER    *********************************************



function iniciarProcesoParaTimeCount(){
  //GI("txtProgreso").value=porcTimer+" % ";
  //if(ci){//valor regresado de la funcion comprobarIteracionPorcentajeDeProcesoTranscurrido(). Si ci = true entonces iterar del 25 al 75%
        NTI = obtenerNumTotalInversionistas();
        timedCount();// inicia el proceso recursivo
  /*    }
  else {
        porcTimer=75;
        }
  if(cuentaSaldos()>0){
        porcTimer=100;
  }
  GI("txtProgreso").value=porcTimer+" % ";*/
}

//var g;

/*function prueba(){
for(var x=0;x<12193;x++){
  g=x;
   var porctot;
   
    //GI("txtNumInv").value=NTI;
    porctot=porcTimer+obtenerPorcentajeDeProcesoTranscurrido(12193);
    GI("txtProgreso").value=porctot+" % ";
}
}*/

function timedCount(){
    
    //var porctot;
    //GI("txtNumInv").value=NTI;
    NTI = obtenerNumTotalInversionistas();
    NIAct=obtenerNumInversActuales();
    porctot=porcTimer+obtenerPorcentajeDeProcesoTranscurrido(NTI);
 
    if(porctot==NaN)
       porctot=0;
    GI("txtProgreso").value=porctot+" % ";
    t=setTimeout("timedCount()",3000);
   
}


function comprobarIteracionPorcentajeDeProcesoTranscurrido(){
    var obtenerAnioMesTemporal = JSON.parse("{\"id\":\"MesAnioTemporal\"}");
    var mesTemp=eval(GI("txtMes").value);
    var anioTemp=eval(GI("txtAno").value);

    if(mesTemp==12){
     anioTemp=anioTemp+1;
     mesTemp=1;
    }else
     mesTemp=mesTemp+1;
     
    obtenerAnioMesTemporal.Fideicomiso=GI("paramFideicomiso").value;
    obtenerAnioMesTemporal.Mes=mesTemp;
    obtenerAnioMesTemporal.Anio=anioTemp;
    obtenerAnioMesTemporal.Mes1=mesTemp;
    obtenerAnioMesTemporal.Anio1=anioTemp;
    
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(obtenerAnioMesTemporal);
    makeAjaxRequest(url, "HTML", verResultado, null);
}

function verResultado (obj, result){
  var resultado = JSON.parse(result)[0];
  cuenta=resultado.cuenta;
  if(cuenta>0)
    ci=false;
  else
    ci=true;
}

//---------------------------------------------------------------------------- OBTENER NUM TOTAL INVERSIONISTAS--------------------------------------------------
function obtenerNumTotalInversionistas(){
    procesoObtieneTotInvers();// todo el proceso que obtiene el valor de la variable NTIaux
    return NTIaux
}


function procesoObtieneTotInvers(){
    var qryTotalInvers = JSON.parse("{\"id\":\"obtenTotalInversss\"}");
    qryTotalInvers.fiso = GI("paramFideicomiso").value;
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(qryTotalInvers);
    makeAjaxRequest(url, "HTML", muestraTotalInvers, null);
}

function muestraTotalInvers(obj,result){
    var result = JSON.parse(result)[0];
    NTIaux = result.totInvers;
    
}






//---------------------------------------------------------------------------------------------------------------------------------------------------------------

//-----------------------------------------------------------------------obtener Porcentaje De Proceso Transcurrido---------------------------------------------
function obtenerPorcentajeDeProcesoTranscurrido(totalInversionistas){
    //var pR = obtenerProporcionReal(obtenerProporcionRelativa(totalInversionistas));
      var pR = obtenerProporcionReal2(totalInversionistas);
      //GI("txtPropReal").value=pR;
    return(pR);//porcentaje total transcurrido
}

/*function obtenerProporcionRelativa(totInvs){
    var NIAct=obtenerNumInversActuales();
    GI("txtInvsAct").value=NIAct;
    var proporcionRelativa = (NIAct*75)/totInvs;
    return Math.round(proporcionRelativa,3);
}*/

/*function obtenerProporcionReal(propRelativ){
  GI("txtPropRelativ").value=propRelativ;
  var propReal = (propRelativ*50)/75
  return Math.round(propReal,3);
}*/

function obtenerProporcionReal2(totInvs){
    NIAct=obtenerNumInversActuales();
    //GI("txtInvsAct").value=NIAct;
    var proporcionRelativa = (NIAct*100)/totInvs;
    if(proporcionRelativa==NaN)
      proporcionRelativa=0;
    return Math.round(proporcionRelativa,3);
}

function obtenerNumInversActuales(){
    procesoobtenerNumInversActuales(); //funcion que determina el valor de la variable global NumeroInversionistasActuales
    return NumeroInversionistasActuales;
}

function procesoobtenerNumInversActuales(){
    var qryNumInversActuales = JSON.parse("{\"id\":\"obtenInversActuales\"}");
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(qryNumInversActuales);
    makeAjaxRequest(url, "HTML", muestraNumInversActuales,null);
}

function muestraNumInversActuales(obj,result){
    //alert(result);
    var result = JSON.parse(result)[0];
    NumeroInversionistasActuales = result.numInvAct;
    //alert(NumeroInversionistasActuales);
}

//---------------------------------------------------------------------------------------------------------------------------------------------------------------

function cuentaSaldos(){
    ContSaldos();//funcion que determina el valor de la variable global "cont"
    return cont;
}

function ContSaldos(){
    var obtenerContSaldos = JSON.parse("{\"id\":\"ContadorFidSaldos\"}");
    var mesTem=eval(GI("txtMes").value);
    var anioTem=eval(GI("txtAno").value);

    if(mesTem==12){
     anioTem=anioTem+1;
     mesTem=1;
    }else
     mesTem=mesTem+1;
     
    obtenerContSaldos.Fideicomiso=GI("paramFideicomiso").value;
    obtenerContSaldos.Anio=anioTem;
    obtenerContSaldos.Mes=mesTem;
    
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(obtenerContSaldos);
    makeAjaxRequest(url, "HTML", verContResultado,null);
}

function verContResultado (obj, result){
  var resultado = JSON.parse(result)[0];
  cont=resultado.contador;
}

