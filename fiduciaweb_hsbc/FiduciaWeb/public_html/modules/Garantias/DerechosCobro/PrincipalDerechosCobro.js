var catGar = new Catalogo("mx.com.inscitech.fiducia.domain.FCregarl");
var catfBienesgar = new Catalogo("mx.com.inscitech.fiducia.domain.FBgarliq");

//VARIABLES QUE CONTROLAN EL EVENTO DEL BOTON ACEPTAR DE LA PANTALLA PRINCIPAL

var pkInfo = null;
var pkInfoBienesGar = null;

var modo;

var usarSetValuesFormObject=false;
var parametroComboProducto;

var fechas = new Date();

var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");

var fechaActual = JSON.parse("{\"id\":\"regresaFechaActual\"}");

initForms();

var tablaGarantiasData = new Array();
tablaGarantiasData[0] = "fcreIdFideicomiso,100px";
tablaGarantiasData[1] = "fcreRegistro,100px";
tablaGarantiasData[2] = "fcreIdCredito,100px";
tablaGarantiasData[3] = "fcreImpCredito,100px";
tablaGarantiasData[4] = "disponible,100px";
tablaGarantiasData[5] = "fcreStCredito,100px";


var tablaBienesGarData = new Array();
tablaBienesGarData[0] = "glbeIdFideicomiso,100px";
tablaBienesGarData[1] = "glbeIdCredito,100px";
tablaBienesGarData[2] = "glbeIdBeneficiario,100px";
tablaBienesGarData[3] = "glbeNombreBen,200px";
tablaBienesGarData[4] = "glbeDescripcion,100px";
tablaBienesGarData[5] = "glbeImpCredito,100px";
tablaBienesGarData[6] = "disponible,100px";
tablaBienesGarData[7] = "glbeFechaSus,100px";
tablaBienesGarData[8] = "glbeFechaVen,100px";
tablaBienesGarData[9] = "glbeFechaPro,100px";
tablaBienesGarData[10] = "glbeMontoProrroga,100px";
tablaBienesGarData[11] = "glbeCveStatus,100px";


function clickTabla(pk)
{
  cloneObject(pk,catGar.getCatalogo());
  pkInfo = pk;
  
  //GI('paramIdGar').value = pkInfo.fgarCveGarantia;
  GI('paramCredito').value = pkInfo.fcreIdCredito;//Id Credito
  GI('paramFiso').value = pkInfo.fcreIdFideicomiso;
  
  consultaBienesGar();
}

var fvCatGar = new FormValidator();
var fvcatfBienesgar = new FormValidator();
var fvcatfBienesgarPagos = new FormValidator();

function consultaGarantia(btnAceptar)
{
  consultar(btnAceptar, GI('frmPrincipalGarantias'), false); 
}

function consultaBienesGar()
{
  GI('cmdAceptarBienesGar').click();
}