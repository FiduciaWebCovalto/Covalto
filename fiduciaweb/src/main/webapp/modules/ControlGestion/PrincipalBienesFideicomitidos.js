var catfBienes = new Catalogo("mx.com.inscitech.fiducia.domain.FBienes");
catfBienes.dateFormat = "dd/MM/YYYY";

//VARIABLES QUE CONTROLAN EL EVENTO DEL BOTON ACEPTAR DE LA PANTALLA PRINCIPAL

var OP_REGISTRO = 1;
var OP_REVALUACION = 3;
var OP_MODIFICAR = 2;
var OP_SALIDA = 4;
var OP_CONSULTA = 5;
var OP_IMAGENES = 6;

var pkInfo = null;

var modo;

var usarSetValuesFormObject=false;
var parametroComboProducto;


var fechas = new Date();

var strIdPK = "fbifIdFideicomiso,fbifIdSubCuenta,fbifIdTipoBien,fbifIdCveBien,fbifIdBien";
var arrIdPK = strIdPK.split(",");

var clavesCombo70 = JSON.parse("{\"llaveClave\":70}");
var clavesCombo70b = JSON.parse("{\"chido\":70}");
var clavesCombo72 = JSON.parse("{\"llaveClave\":72}");
var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var clavesCombo53 = JSON.parse("{\"llaveClave\":53}");
var clavesCombo71 = JSON.parse("{\"llaveClave\":71}");

var clavesComboClasifBienFideicom;

initForms();

var tablaFideicomisosData = new Array();
tablaFideicomisosData[0] = "fbifIdFideicomiso,100px";
tablaFideicomisosData[1] = "fbifIdSubCuenta,100px";
tablaFideicomisosData[2] = "fbifIdTipoBien,100px";
tablaFideicomisosData[3] = "fbifIdBien,100px";
tablaFideicomisosData[4] = "fbifImpUltValua,100px";
tablaFideicomisosData[5] = "fbifPerValuacion,100px";
tablaFideicomisosData[6] = "fbifStBien,100px";


function clickTabla(pk){
  cloneObject(pk,catfBienes.getCatalogo());
  pkInfo = pk;
}

/*function actualizaComboOperacion() {
  cargaParamComboOperacion(GI("paramTipoBienFideicomitido"),GI("paramClasFide"),false);
}

//Para cargar el Combo de Producto
function cargaParamComboOperacion(objComboUno,objComboDos,parametro2){
  usarSetValuesFormObject=parametro2;
  parametroComboOperacion = JSON.parse("{\"llaveClave\":\"" +objComboUno.value + "\",\"Operacion\":\"" +objComboDos.value + "\"}");
  SA(GI("paramOperacion"));
  loadElement(GI("paramOperacion"));
}*/


var fvcatfBienes = new FormValidator();




// FUNCIONES QUE CARGAN LA PANTALLA DE MANTENIMIENTO 


fvcatfBienes.setup({
  formName      : "frmMantenimientoBienesFideicomitidos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});


    
  

function cargaMantenimientoBienesFideicomitidos(Modo){
    modo = Modo;
    if((isDefinedAndNotNull(pkInfo) || modo == OP_REGISTRO||modo == OP_CONSULTA)){//&& Modo != OPER_BAJA
        var urlCliente = "modules/Contabilidad/BienesFideicomitidos/MantenimientoBienesFideicomitidos.do";
        makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoBienesFideicomitidos, null);
    }
    else
        Swal.fire('Aviso', 'No a has seleccionado campo alguno de la tabla',  'warning');
}

function despliegaPantallaMantenimientoBienesFideicomitidos(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  catfBienes.buscaCatalogoPK(false);
  fvcatfBienes.setup({
    formName      : "frmMantenimientoBienesFideicomitidos",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
  loadCatalogo();

      // DEFINICION DE LOS CAMPOS DE TEXTOS PARA SER CONVERTIDOS EN FECHAS --------------------------------
  /*Calendar.setup({
    inputField     :    "fbifFecUltValua",   // id of the input field
    button         :    "fbifFecUltValua",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDateAll,
    date           :    fechas,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
  });
  
  Calendar.setup({
    inputField     :    "fbifFecInicio",   // id of the input field
    button         :    "fbifFecInicio",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechas,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
  });
  
  Calendar.setup({
    inputField     :    "fbifFecFin",   // id of the input field
    button         :    "fbifFecFin",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDateAll,
    date           :    fechas,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
  });*/
  // FIN DE LA DEFINICION DE FECHAS -------------------------------------------------------------------


  /*
  if(modo==OP_REGISTRO || modo==OP_MODIFICAR){
   
   
      
      muestraObjs("cmdAceptar,cmdCancelar");
      if(modo==OP_MODIFICAR){
         SA(GI("fbifImpBien"),"disabled","true");
         SA(GI("fbifMoneda"),"disabled","true");
         SA(GI("fbifImpMoneda"),"disabled","true");
         SA(GI("fbifImpUltValua"),"disabled","true");
         SA(GI("fbifFecUltValua"),"disabled","true");
         deshabilitaPK(arrIdPK);
      }
     /* else {
         //Swal.fire('Aviso', 'hola',  'warning');
         GI("fbifMoneda").selectedIndex = 8;
         GI("fbifStBien").selectedIndex = 2;
      }
    }
    
   else{
   alert("tipo opera erick:"+modo);
     deshabilitaObjetos(GI("frmMantenimientoBienesFideicomitidos"));
     if(modo==OP_CONSULTA){
      
        GI("cmdCancelar").value = "Regresar";
        //muestraObj("cmdCancelar");
        loadCatalogo();
        alert("tipo opera erick2:"+modo);
     }
     else if(modo==OP_SALIDA)
     muestraObjs("cmdAceptar,cmdCancelar");
     else if(modo==OP_REVALUACION){
     muestraObjs("cmdAceptar,cmdCancelar");
      muestraObj("importeRevaluacion");
      muestraObj("txtImporteRevaluacion");
      RA(GI("txtImporteRevaluacion"),"disabled");
      }
   }*/
   
  //loadCatalogo();
}


function AltaOModificaInfo() {
  catfBienes.setOnUpdate(operacionExitosa);
  if(modo==OP_REGISTRO && fvcatfBienes.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    catfBienes.altaCatalogo();
  }
  else if(modo==OP_MODIFICAR && fvcatfBienes.checkForm())//Se trata de una modificación
  {
    showWaitLayer();
    catfBienes.modificaCatalogo();
  }
}


function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalBienesFideicomitidos();
  hideWaitLayer();
}

function cargaPrincipalBienesFideicomitidos() {
  onButtonClick("Contabilidad.BienesFideicomitidos.PrincipalBienesFideicomitidos","");
  hideWaitLayer();
}

function loadCatalogo(){
  catfBienes.setOnUpdate(catLoaded);
  alert("operacion"+modo);
  if(modo==OP_MODIFICAR || modo==OP_CONSULTA){
  
    GI("fbifIdFideicomiso").value=pkInfo.fbifIdFideicomiso;  
    GI("fbifIdSubCuenta").value=pkInfo.fbifIdSubCuenta;
    GI("fbifIdBien").value=pkInfo.fbifIdBien;

    GI("fbifIdTipoBien").value=pkInfo.fbifIdTipoBien;
   GI("fbifIdCveBien").value=pkInfo.fbifIdCveBien;
   //revisa porque no se carga esta lista alex, que es la segunda
   alert("valor bien"+pkInfo.fbifIdCveBien);

//    cargaCombosMantenimiento(GI("fbifIdTipoBien").value);

      deshabilitaObjetos(GI("frmMantenimientoBienesFideicomitidos"));         //Deshabilita objetos (excepto botones)

    catfBienes.buscaCatalogoPK(false);
  }  
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
  }
  
 /* if(isDefinedAndNotNull(pkInfo) && modo != OP_REGISTRO){
    catfBienes.setOnUpdate(catLoaded);
    //catfBienes.buscaCatalogoPK(false);
  }
  else if(modo == OP_REGISTRO){
  
      GI("fbifMoneda").selectedIndex = 8;
      GI("fbifStBien").selectedIndex = 2;
      formsLoaded();
  
  }*/
}

function catLoaded(){
/*
if(operacion==OP_CONSULTA)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmMantenimientoBienesFideicomitidos"));         //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();
  */
     //deshabilitaObjetos(GI("frmMantenimientoBienesFideicomitidos"));
   if(modo==OP_CONSULTA){
   alert("tipo opera erick:"+modo);

      SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
      deshabilitaObjetos(GI("frmMantenimientoBienesFideicomitidos"));         //Deshabilita objetos (excepto botones)
   }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();   
}



// FUNCIONES QUE SE ENCARGAN DE LA GESTION DE LAS FECHAS


function setFechaCal()
{}

function isValidDate(date)
{
  var today = new Date();
  if(date>today)
    return true;
  else
    return false;
}


function isValidDateAll(date)
{
  return false;
}

//------------------------------------------------------------------------


//FUNCIONES GENERICAS DE ESTE JAVASCRPT-----------------------------


function cargaCombos(){
  //showWaitLayer();
 var numOperacion = GI("paramTipoBienFideicomitido").value;
  var tipoOperacion = eval(numOperacion);
  switch(tipoOperacion){
    case 1://DEPOSITOS
      clavesComboClasifBienFideicom = JSON.parse("{\"chido\":72}");
      loadElement(GI("paramClasFide"));
    break;
    case 2://INVERSIONES
      clavesComboClasifBienFideicom = JSON.parse("{\"chido\":71}");
      loadElement(GI("paramClasFide"));
    break;
    case 3://LIQUIDACIONES
      clavesComboClasifBienFideicom = JSON.parse("{\"chido\":73}");
      loadElement(GI("paramClasFide"));
      break;
    default:
      Swal.fire('Aviso', 'error',  'warning'); 
      }
    }
    
    
    function cargaCombosMantenimiento(objComboUno){
  //showWaitLayer();
   alert("combo uno "+objComboUno.value);
 var numOperacion = objComboUno.value;
  var tipoOperacion = eval(numOperacion);
  

  switch(tipoOperacion){
    case 1://DEPOSITOS
      clavesComboClasifBienFideicom = JSON.parse("{\"chido\":71}");
      loadElement(GI("fbifIdCveBien"));
    break;
    case 2://INVERSIONES
      clavesComboClasifBienFideicom = JSON.parse("{\"chido\":71}");
      loadElement(GI("fbifIdCveBien"));
    break;
    case 3://LIQUIDACIONES
      clavesComboClasifBienFideicom = JSON.parse("{\"chido\":71}");
      loadElement(GI("fbifIdCveBien"));
      break;
    default:
      Swal.fire('Aviso', 'error',  'warning'); 
      }
    }


function siCambiaLaMoneda(){
    var numOperacion = GI("fbifMoneda").value;
    var tipoOperacion = eval(numOperacion);
    if(tipoOperacion!=1){
      muestraObj("tipoCambio");
      muestraObj("fbifTipoCambio");
    }
    else {
      ocultaObj("tipoCambio");
      ocultaObj("fbifTipoCambio");
    }
}



function actualizaComboBien() {
cargaParamComboProducto(GI("fbifIdTipoBien"),false);
}


function cargaParamComboProducto(objComboUno,parametro2){
  usarSetValuesFormObject=parametro2;
  //parametroComboProducto	 = JSON.parse("{\"llaveClave\":\"" +objComboUno.value + "\"}");
parametroComboProducto = JSON.parse("{\"chido\":71}");
/*
 var numOperacion = objComboUno.value;
  var tipoOperacion = eval(numOperacion);
  alert("valor combo uno y tipoOperacion "+tipoOperacion);

  switch(tipoOperacion){
    case 1://DEPOSITOS
      parametroComboProducto = JSON.parse("{\"chido\":71}");
      //loadElement(GI("fbifIdCveBien"));
    break;
    case 2://INVERSIONES
      parametroComboProducto = JSON.parse("{\"chido\":71}");
      //loadElement(GI("fbifIdCveBien"));
    break;
    case 3://LIQUIDACIONES
      parametroComboProducto = JSON.parse("{\"chido\":71}");
      //loadElement(GI("fbifIdCveBien"));
      break;
    default:
      Swal.fire('Aviso', 'error',  'warning'); 
      }

*/
  SA(GI("fbifIdCveBien"),"next","asignaProducto");
  loadElement(GI("fbifIdCveBien"));
}

function asignaProducto(){
  if(usarSetValuesFormObject)
    setValuesFormObject(catfBienes.getCatalogo());
  else
    GI("fbifIdCveBien").selectedIndex=0;
  
  formsLoaded();
}