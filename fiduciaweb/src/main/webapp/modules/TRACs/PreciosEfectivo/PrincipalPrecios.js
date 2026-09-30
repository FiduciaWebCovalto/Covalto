
var formularioCarga = GI('frmDatos');
var tablaPreview = GI('tablaPreviewPrecios');
var frameCarga = GI('frameUpload');

showWaitLayer();



// combos
var cmbFideicomisoTrac = JSON.parse("{}");
var indicesCombo662 = JSON.parse("{\"Indice\":662}");
var indicesCombo661 = JSON.parse("{\"Indice\":661,\"orderDescripcion\":\"S\"}");


var tablaPreviewData = new Array();

tablaPreviewData[0] = "fcpeFiso,150px";
tablaPreviewData[1] = "fcpeSubfiso,150px";
tablaPreviewData[2] = "fcpeCtoinver,150px";
tablaPreviewData[3] = "fcpeImporte,150px";
tablaPreviewData[4] = "fcpeOperacion,150px";
tablaPreviewData[5] = "fcpeStatus,150px";

var fechaDefault = new Date();

Calendar.setup({
    inputField     :    "txtFechaPrecios",
    button         :    "txtFechaPrecios",
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

pkInfo=null;

initForms();
formsLoaded();


function limpiar(objForma){
  RF(objForma);
  
  pkInfo = null;
}

function subirArchivo(){
  if(GI("txtFechaPrecios").value == "")
  {  
    Swal.fire('Aviso', 'Debe seleccionar la Fecha',  'warning');
  }
  else
  {
    if(fvMantenimiento.checkForm())
    {
      
      frameSubmit(document.frameUpload.frmCargaPrecios);

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

  forma.document.getElementById("Fecha").value = GI("txtFechaPrecios").value;
  forma.document.getElementById("NombreArchivo").value = nomArchivo;

  forma.submit();
  
  formularioCarga.cmdCargar.style.visibility = 'hidden';
  formularioCarga.cmdPreview.style.visibility = 'visible';
}

//se genera el preview del archivo de precios a partir de archivos_planos
function generaPreviewArchivo()
{
  
  var parametrosUrl = {
    id: 'ejeFunCargaPreciosMasivaEfe',
    fiso: GI('fiso').value,
    fecha: GI('txtFechaPrecios').value,
    tipoPrecio: GI('tipoPrecio').value,
    nomArchivo: nomArchivo
  }

  var url = ctxRoot + '/executeRef.do?json='+ JSON.stringify(parametrosUrl);
  //alert(url)
  makeAjaxRequest(url,"HTML",generaPreviewArchivoRes,null);
  
}

//TODO: incluir mensajes correctos 
function generaPreviewArchivoRes(obj,result)
{
  //alert(result)
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
      id: 'qryPreviewCargaPreciosEfe'
    });
    var url = ctxRoot + "/getRef.do?json="+ parametros
    
    showWaitLayer();
    borraTabla( tablaPreview );
    makeAjaxRequest(url, "HTML", loadTableElement, tablaPreview);
}

//aplicar el precio una vez que se cargó el preview

function funAplicaPrecio()
{
  if(fvMantenimiento.checkForm() && confirm("¿Esta seguro que desea aplicar el precio?"))
  {
    var parametrosUrl = {
      id: 'ejeFunAplPreciosEfe',
        fiso: GI('fiso').value,
        fecha: GI('txtFechaPrecios').value,
        tipoPrecio: GI('tipoPrecio').value,
        nomArchivo: nomArchivo
    }

    var url = ctxRoot + '/executeRef.do?json='+ JSON.stringify(parametrosUrl);
    //alert(url)
    makeAjaxRequest(url, "HTML", funAplicaPrecioResp, null);
  }
}

function funAplicaPrecioResp(obj,result)
{

  ///alert(result)
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



  
/*  var errCode = JSON.parse(result).RESULTADO;

  if(errCode === 0){
    Swal.fire('Aviso', 'Operación exitosa!',  'warning')}else{
    if (errCode == 2)
        Swal.fire('Aviso', 'No existen operaciones de Tracks para Procesar',  'warning');
    else
        Swal.fire('Aviso', 'Ocurrió un error inesperado!',  'warning')}

  consultaPreviewArchivo()
*/
}

function resetPantallaCarga(){
  limpiar( formularioCarga );
  borraTabla( tablaPreview );

  nomArchivo = null;

  formularioCarga.cmdCargar.style.visibility = 'visible';

  //se ocultan los botones de preview y ejecucion
  formularioCarga.cmdPreview.style.visibility = 'hidden';
  formularioCarga.cmdAplicar.style.visibility = 'hidden';

  var srcFrame = frameCarga.src;
  frameCarga.src = srcFrame;
}

resetPantallaCarga();
