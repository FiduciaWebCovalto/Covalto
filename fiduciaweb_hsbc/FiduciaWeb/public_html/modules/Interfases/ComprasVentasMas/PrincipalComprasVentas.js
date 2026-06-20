var cmbFideicomisoTrac = JSON.parse("{}");
var formularioCarga = GI('frmDatos');
var tablaPreview = GI('tablaPreviewComprasVentas');
var frameCarga = GI('frameUpload');
var cmbContratoInversionParam = JSON.parse("{\"fideicomiso\":-1}");
var objArchivosPlanosParam = JSON.parse("{\"id\":\"conArcPla\"}");

showWaitLayer();


var tablaPreviewData = new Array();

tablaPreviewData[0] = "fcvcCliente,150px";
tablaPreviewData[1] = "fcvcTipo,150px";
tablaPreviewData[2] = "fcvcFecha,150px";
tablaPreviewData[3] = "fcvcFolio,150px";
tablaPreviewData[4] = "fcvcTitulos,150px";
tablaPreviewData[5] = "fcvcPrecio,150px";
tablaPreviewData[6] = "fcvcMoneda,150px";
tablaPreviewData[7] = "fcvcDescripcion,150px";

var fechaDefault = new Date();

Calendar.setup({
    inputField     :    "fechaVal",
    button         :    "fechaVal",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechaDefault,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
});

function setFechaCal(){}
//
function isValidDate(date){ 
  var today = new Date();
  if(date > today)
    return true;
  else
    return false;
}

// Pantalla
var fvMantenimiento = new FormValidator();

fvMantenimiento.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

initForms();
formsLoaded();


function cargaObjetosTipoMovimiento(objRdMovimiento){
  
  asignaValueRadio2Master("rdTipoMovimiento", objRdMovimiento);

}

function subirArchivo(){
  if(GI("fechaVal").value == '')
  {  
    Swal.fire('Aviso', 'Debe seleccionar la Fecha ',  'warning');
  }
  else
  {
    if(fvMantenimiento.checkForm())
    {
      frameSubmit(document.frameUpload.frmCargaComprasVentas);
           
    }
  }
}
  
var nomArchivo = null;

function frameSubmit(forma) {
  
  nomArchivo = forma.document.getElementById("fileTest").value

  if( nomArchivo == ''){
    Swal.fire('Aviso', 'debe seleccionar un archivo',  'warning');
    return;
  }

  nomArchivo = nomArchivo.split('\\');
  nomArchivo = nomArchivo[nomArchivo.length-1];

  GI("frameUpload").onreadystatechange = fileUploaded;  
  forma.document.getElementById("Fecha").value = GI("fechaVal").value;
  forma.document.getElementById("NombreArchivo").value = nomArchivo;

  forma.submit();
  showWaitLayer();  
  formularioCarga.cmdCargar.style.visibility = 'hidden';
  formularioCarga.cmdPreview.style.visibility = 'visible';
  formularioCarga.cmdLiquidacion.style.visibility = 'visible';

}

//se genera el preview del archivo de precios a partir de archivos_planos
function generaPreviewArchivo()
{
 // var tipoMovimiento = parseInt(GI("rdTipoMovimiento").value, 10);
  
  var parametrosUrl = {
    id: 'ejeFunCargaCompraVentaMasivaCon',
      fiso: GI('fiso').value,
      tipo: eval(GI('cmbContratoInversion').value),//CONTRATO DE INVERSION
      fecha: GI('fechaVal').value,
      nomArchivo: nomArchivo
  }

  var url = ctxRoot + '/executeRef.do?json='+ JSON.stringify(parametrosUrl);
  alert(url)
  makeAjaxRequest(url,"HTML",generaPreviewArchivoRes,null);
  
}

//TODO: incluir mensajes correctos 
function generaPreviewArchivoRes(obj,result)
{
  
  // Los codigos de error son un numero seguido de un guion y el mensaje de error
  var err = JSON.parse(result).result.split('-');
  var errCode = parseInt(err[0], 10);
  var errMsg = err[1];


  alert(errMsg)

  if(errCode === 0){
    consultaPreviewArchivo();

    formularioCarga.cmdPreview.style.visibility = 'hidden';
    formularioCarga.cmdLiquidacion.style.visibility = 'visible';
    formularioCarga.cmdAplicar.style.visibility = 'visible';

  }
  else {
      resetPantallaCarga();
  }

}


//se invoca la funcion para generar la formula
function generaLiquidacion() {
    var parametrosUrl = {
      id: 'ejeFunFidLiqFormula',
      fiso: GI('fiso').value,
      tipo: eval(GI('cmbContratoInversion').value),//CONTRATO DE INVERSION
      fecha: GI('fechaVal').value,
      nomArchivo: nomArchivo
    }

    var url = ctxRoot + '/executeRef.do?json='+ JSON.stringify(parametrosUrl);
    alert(url)
    makeAjaxRequest(url, "HTML", funAplicaFormula, null);    
}
function funAplicaFormula(obj,result)
{
  // Los codigos de error son un numero seguido de un guion y el mensaje de error
  var err = JSON.parse(result).result.split('-');
  var errCode = parseInt(err[0], 10);
  var errMsg = err[1];
  alert(errMsg)
  
   // alert(objArchivosPlanosParam.nomArchivo)
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(objArchivosPlanosParam);
    alert(url)
    makeAjaxRequest(url, "HTML", sugerirNombreArchivoInterfase, null);    
  
}

function sugerirNombreArchivoInterfase(obj , result){
  
  var resultado = JSON.parse(result)[0];
  
  //if(isDefinedAndNotNull(resultado)){
      
    delete objArchivosPlanosParam.id;
    
    objArchivosPlanosParam.queryId = "conArcPla";
    objArchivosPlanosParam.colData = "arpDescripcion";
    
    //objArchivosPlanosParam.Fecha = GI("txtFechaValor").value;
    objArchivosPlanosParam.order = "\"s\"";
    objArchivosPlanosParam.fileName = "FL_"+GI("fechaVal").value.split("/")[1]+GI("fechaVal").value.split("/")[0]+GI("fechaVal").value.split("/")[2] + ".txt";
    //alert(objArchivosPlanosParam)
    var url = ctxRoot + "/generarArchivoInterfase.do?json=" + JSON.stringify(objArchivosPlanosParam);
    alert(url)
    var liga = GI("ligaArchivo");
    liga.href = url;
    liga.click();
    
 //   Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');    
  /*}else
    Swal.fire('Aviso', 'No se ha generado ningún registro',  'warning');*/
  hideWaitLayer();
}


//se consulta el preview del archivo
function consultaPreviewArchivo()
{
    parametros = JSON.stringify({
      id: 'qryPreviewCargaCompraVentasCon',
      fecha: GI('fechaVal').value,
      status: 'ACTIVO'
    });

    var url = ctxRoot + "/getRef.do?json="+ parametros
    //alert(url)
    showWaitLayer();
    borraTabla( tablaPreview );
    makeAjaxRequest(url, "HTML", loadTableElement, tablaPreview);
}

//aplicar el precio una vez que se cargÃ³ el preview

function funAplicaComprasVentas()
{
  if(fvMantenimiento.checkForm() && confirm("Â¿Esta seguro que desea aplicar?"))
  {
	showWaitLayer();
 //   var tipoMovimiento = parseInt(GI("rdTipoMovimiento").value, 10);
    
    var parametrosUrl = {
      id: 'ejeFunComprasVentasMasCon',
      fiso: GI('fiso').value,
      tipo: eval(GI('cmbContratoInversion').value),//CONTRATO DE INVERSION
      fecha: GI('fechaVal').value,
      nomArchivo: nomArchivo
    }

    var url = ctxRoot + '/executeRef.do?json='+ JSON.stringify(parametrosUrl);
    alert(url)
    makeAjaxRequest(url, "HTML", funAplicaComprasVentasResp, null);
  }
}

function funAplicaComprasVentasResp(obj,result)
{
  
  // Los codigos de error son un numero seguido de un guion y el mensaje de error
  var err = JSON.parse(result).result.split('-');
  var errCode = parseInt(err[0], 10);
  var errMsg = err[1];



  alert(errMsg)
  hideWaitLayer();	
  consultaPreviewArchivo()


}

function resetPantallaCarga(){
  //se limpia el formulario
  RF( formularioCarga );

  nomArchivo = null;

  borraTabla( tablaPreview );

  formularioCarga.cmdCargar.style.visibility = 'visible';

  //se ocultan los botones de preview y ejecucion
  formularioCarga.cmdPreview.style.visibility = 'hidden';
  formularioCarga.cmdLiquidacion.style.visibility = 'hidden';
  formularioCarga.cmdAplicar.style.visibility = 'hidden';

  var srcFrame = frameCarga.src;
  frameCarga.src = srcFrame;
}

resetPantallaCarga();

function cargaCmbContratoInversion(objTxtNumFideicomiso,objCmbContratoInversion){
  if(objTxtNumFideicomiso.value != ""){
    showWaitLayer();
    objCmbContratoInversion.selectedIndex = 0;
    cmbContratoInversionParam.fideicomiso = objTxtNumFideicomiso.value;
    loadElement(objCmbContratoInversion);
    hideWaitLayer();
  }
}


var cont=0;
function fileUploaded() {  
    hideWaitLayer();
    cont++;
    if(cont==1) {
    Swal.fire('Aviso', 'Archivo Cargado correctamente',  'warning');    
    }

}
