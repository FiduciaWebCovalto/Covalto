// JavaScript Document

var fncInterfase = JSON.parse("{\"id\":\"ejeFunEntradaNafin\"}");
var objArchivosPlanosParam = JSON.parse("{\"id\":\"conArcPla\"}");
var dvFechaParam = JSON.parse("{\"id\":\"ejeFunRegresaFechaAnterior\"}");

var fvInterfase = new FormValidator();

initForms();
fechaTrack(GI("txtFechaValor"));

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

cal.manageFields("txtFechaValor", "txtFechaValor", "%d/%m/%Y");

fvInterfase.setup({
  formName      : "frmDatosInterfase",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function ejecutaFuncion(){
  if(GI("txtFechaValor").value==""||GI("txtNomArch").value=="")
  {  
    Swal.fire('Aviso', 'Debe seleccionar la Fecha,Nombre',  'warning');
  }
  else
  {
    if(fvInterfase.checkForm())
    {
          frameSubmit(document.frameUpload.frmValuacion);
         // ejecutaStoreInterfase();    
    }
  }
}
  

function frameSubmit(forma) {
  //if(fv.checkFrom())
  forma.document.getElementById("Fecha").value = GI("txtFechaValor").value;
  forma.document.getElementById("NombreArchivo").value = GI("txtNomArch").value;
  forma.submit();
  
  //ejecutaStoreInterfase(); /// ejecuta rutina  valuacion
  //document.getElementById("cmdLimpiar").click();
  //showWaitLayer();

}

function ejecutaStoreInterfase(){
    fncInterfase.fecha = GI("txtFechaValor").value;
    fncInterfase.nomArchivo = GI("txtNomArch").value;
    fncInterfase.numUsuario = ctxUser;
    fncInterfase.numOpcion = 0;
    
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(fncInterfase);
   showWaitLayer();
    makeAjaxRequest(url, "HTML", validaStoreInterfase, null);
  }


function validaStoreInterfase(obj, result){
  var res = JSON.parse(result).RESULTADO;
  if(isDefinedAndNotNull(res)){
    switch(eval(res)){
      case 0:
          Swal.fire('Aviso', 'Operación exitosa',  'warning')document.getElementById("cmdLimpiar").click();
      break;
      case 1:Swal.fire('Aviso', 'Cargue el archivo correcto antes de al vaciar los Precios!',  'warning');break;
      default:Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
    }
  }else
  {
     Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
  }
  hideWaitLayer();
}


function fileUploaded() {  
 Swal.fire('Aviso', 'Archivo Cargado correctamente',  'warning')/* 
  var objInterface = GI("dvInterface");
  var url = ctxRoot + "/modules/Interfases/InterfseVauacion/TasAplicar.do";
 
 GI("frameUpload").onreadystatechange = function() {};
  hide("frameUpload");
  hide("frmTas");
  
  removeFrame("frameUpload");
  
  makeAjaxRequest(url, "HTML", cambiaPantallaTAS, objInterface);*/
}
/*

function cambiaPantallaTAS(obj, result) {
  obj.innerHTML = result;
  SA(GI("paramFecha"), "readonly", "true");
  GI("txtMensaje").value=vgDisplay;
  hideWaitLayer();
}*/

//-----------Reporte--------------------


function reporteNafin()
{
    if(fvInterfase.checkForm())
    {
     
        var surl ="\"id\":\"funGeneraReporteNafin\",";
        surl +="\"nomArchivo\":\""+GI('txtNomArch').value+"\",";
        surl +="\"fecha\":\""+GI('txtFechaValor').value+"\",";
        surl +="\"usuario\":"+ctxUser+",";
        surl +="\"opcion\":0"; 
        
        var url = ctxRoot + "/execRefReporte.do?json={"+surl+"}";
        makeAjaxRequest(url,"HTML",reporteNafinResp,null);
                
    }
}
function reporteNafinResp(obj,result)
{
  var res = JSON.parse(result).RESULTADO;
  switch(res)
  {
    case 0:
      var surl ="\"Estructura\":\"1\",";
        surl +="\"sendToJSP\":\"true\",";
        surl +="\"urlReporte\":\"/modules/TRACs/Interfases/Nafin/ReporteNafin.jsp\",";
        surl +="\"id\":\"getRepNaftrac\","
        surl +="\"order\":\"s\"";
    
        var url = ctxRoot + "/imprimirReporte.do?checknaftrac="+GI('chNaftrac').checked+"&json={"+surl+"}";
        var link = GI('linkReporte');
        link.href=url;
        link.click();
        document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
        hideWaitLayer();
      
    break;
    case 1:
      Swal.fire('Aviso', 'No hay datos para esa fecha!',  'warning')break;
    default:
      Swal.fire('Aviso', 'ocurrió un error inesperado!',  'warning')break;
  }
}
//-----------Reporte--------------------

//-----------Archivo--------------------

function generaArchivo()
{

}
//-----------Archivo--------------------