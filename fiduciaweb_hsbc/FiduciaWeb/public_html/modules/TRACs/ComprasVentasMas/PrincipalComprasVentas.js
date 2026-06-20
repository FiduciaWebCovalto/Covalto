var cmbFideicomisoTrac = JSON.parse("{}");
var formularioCarga = GI('frmDatos');
var tablaPreview = GI('tablaPreviewComprasVentas');
var frameCarga = GI('frameUpload');

showWaitLayer();


var tablaPreviewData = new Array();

tablaPreviewData[0] = "fcvmCtoInver,150px";
tablaPreviewData[1] = "fcvmPizarra,150px";
tablaPreviewData[2] = "fcvmSerie,150px";
tablaPreviewData[3] = "fcvmCupon,150px";
tablaPreviewData[4] = "fcvmTitulos,150px";
tablaPreviewData[5] = "fcvmPrecio,150px";
tablaPreviewData[6] = "fcvmImporte,150px";
tablaPreviewData[7] = "fcvmStatus,150px";

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

  forma.document.getElementById("Fecha").value = GI("fechaVal").value;
  forma.document.getElementById("NombreArchivo").value = nomArchivo;

  forma.submit();
  
  formularioCarga.cmdCargar.style.visibility = 'hidden';
  formularioCarga.cmdPreview.style.visibility = 'visible';
}

//se genera el preview del archivo de precios a partir de archivos_planos
function generaPreviewArchivo()
{
  var tipoMovimiento = parseInt(GI("rdTipoMovimiento").value, 10);
  
  var parametrosUrl = {
    id: 'ejeFunCargaCompraVentaMasiva',
      fiso: GI('fiso').value,
      tipo: tipoMovimiento,
      fecha: GI('fechaVal').value,
      nomArchivo: nomArchivo
  }

  var url = ctxRoot + '/executeRef.do?json='+ JSON.stringify(parametrosUrl);
 // alert(url)
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
    formularioCarga.cmdAplicar.style.visibility = 'visible';

  }
  else {
      resetPantallaCarga();
  }

}


//se consulta el preview del archivo
function consultaPreviewArchivo()
{
    parametros = JSON.stringify({
      id: 'qryPreviewCargaCompraVentas'
    });

    var url = ctxRoot + "/getRef.do?json="+ parametros
    //alert(url)
    showWaitLayer();
    borraTabla( tablaPreview );
    makeAjaxRequest(url, "HTML", loadTableElement, tablaPreview);
}

//aplicar el precio una vez que se cargó el preview

function funAplicaComprasVentas()
{
  if(fvMantenimiento.checkForm() && confirm("¿Esta seguro que desea aplicar?"))
  {

    var tipoMovimiento = parseInt(GI("rdTipoMovimiento").value, 10);
    
    var parametrosUrl = {
      id: 'ejeFunComprasVentasMas',
      fiso: GI('fiso').value,
      tipo: tipoMovimiento,
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
  formularioCarga.cmdAplicar.style.visibility = 'hidden';

  var srcFrame = frameCarga.src;
  frameCarga.src = srcFrame;
}

resetPantallaCarga();
