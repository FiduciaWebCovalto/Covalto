
showWaitLayer();

var clavesCombo93 = JSON.parse("{\"llaveClave\":93,\"orderDescripcion\":\"s\"}");
var fechaActual = JSON.parse("{\"id\":\"regresaFechaActual\"}");
var consultaDatosInformativos = JSON.parse("{\"id\":\"muestraDatosFideicomisos\",\"NumFideicomiso\":0}");
var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaContrato\",\"numContrato\":0}");
var validacionAlta2 = JSON.parse("{\"id\":\"verificaSeaActivo\",\"numContrato\":0}");

var parametroComboPaga;

initForms();

var fechaValor = new Date();
var fechaDel = new Date();
var fechaAl = new Date();

//Calendario para "fechaValor"
Calendar.setup({
    inputField     :    "txtFechaValor",   // id of the input field
    button         :    "txtFechaValor",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechaValor,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
});

//Calendario para "Del"
Calendar.setup({
    inputField     :    "txtDel",   // id of the input field
    button         :    "txtDel",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDateSpecial,
    date           :    fechaDel,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
});

//Calendario para "Al"
Calendar.setup({
    inputField     :    "txtAl",   // id of the input field
    button         :    "txtAl",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDateSpecial,
    date           :    fechaAl,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
});

muestraFechaActual();   //Ingresa la fecha actual al iniciar la pantalla

//No permitir editar el campo informativo:
//1. Nombre del fideicomiso
SA(GI("frmPrincipalFiduciariosGeneracionOtrosIngresos").txtNomFiso, "LKD", "true");
SA(GI("frmPrincipalFiduciariosGeneracionOtrosIngresos").txtNomFiso, "disabled", "true");

//Ocultar objetos
ocultaObjs("Paga,Fideicomisario,Tercero,Fideicomitente,cmbPaga");
ocultaObjs("Periodo,Del,Al");

var fvProvisiones = new FormValidator();
fvProvisiones.setup({
  formName      : "frmPrincipalFiduciariosGeneracionOtrosIngresos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

///////////////////////////////////////////////////////////////////////////
//FUNCIONES PARA VISUALIZAR EL CALENDARIO
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

function isValidDateSpecial(date)
{
  return false;
}


function validaFechaCorrecta() {
  verificaFecha(GI("txtFechaValor"));
}

////////////////////////////////////////////////////////////////////////////
//MOSTRAR LA FECHA ACTUAL EN LA CAJA DE TEXTO DESTINADA PARA ELLO
function muestraFechaActual() {
  //fechaActual.tipoFecha="CONTABLE";
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(fechaActual);
  makeAjaxRequest(url, "HTML", insertaFechaActual, null);
}

function insertaFechaActual(obj, result) {
  var objResult = JSON.parse(result);
  
  GI("fcoDiaDia").value=objResult[0].fcoDiaDia;
  GI("fcoMesDia").value=objResult[0].fcoMesDia;
  GI("fcoAnoDia").value=objResult[0].fcoAnoDia;
  
  GI("txtFechaValor").value = formatString(GI("fcoDiaDia").value,"0",2,"Izquierda") + "/" + formatString(GI("fcoMesDia").value,"0",2,"Izquierda") + "/" + GI("fcoAnoDia").value;
  GI("txtMesAbierto").value = 0;
}

///////////////////////////////////////////////////////////////////////////
//MANDAR LLAMAR LA FUNCION CUANDO SE DA ACEPTAR Y VOLVER LA PANTALLA A SU ESTADO INCIAL
function llamarFuncion(){
  if(fvProvisiones.checkForm())
    ejecutaFuncionPagaOPeriodo();
}

function cargaPrincipalFiduciariosGeneracionOtrosIngresosHonorarios() {
  onButtonClickPestania("Honorarios.PrincipalFiduciariosGeneracionOtrosIngresosHonorarios",""); //Reinicializa pantalla
}

///////////////////////////////////////////////////////////////////////////
//FUNCION QUE SE EJECUTARÁ UNA VEZ QUE SE DE CLICK EN ACEPTAR
function ejecutaFuncionPagaOPeriodo(){
  var objParametros = JSON.parse("{\"id\":\"funcionProvisiones\"}");
  eval("objParametros.TipoOperacion=1");
  
  /*Valores para prueba
  eval("objParametros.Fideicomiso=567");
  eval("objParametros.MesAbierto=0");
  eval("objParametros.Const3=683");
  eval("objParametros.Fecha='02/11/2007'");
  eval("objParametros.Tipo_Servicio='ADMINISTRACION'");
  eval("objParametros.Cantidad=1");
  eval("objParametros.TipoPersona='TERCERO'");
  eval("objParametros.NumTipoPersona=2");
  eval("objParametros.Const2=''");
  eval("objParametros.FechaDel='10/12/2007'");
  eval("objParametros.FechaAl='20/12/2007'");
  eval("objParametros.TipoServicio='TERCERO'");
  */
  
  eval("objParametros.Fideicomiso=" + GI("txtNumFiso").value);
  eval("objParametros.Fecha='" + GI("txtFechaValor").value+"'");
  
  eval("objParametros.Tipo_Servicio='" + GI("txtTipoServicio").value+"'");
  /*eval("objParametros.TipoServicio='" + GI("txtTipoServicio").value+"'");*/
  
  eval("objParametros.Cantidad=" + GI("txtCantidad").value);
  ///
  //alert(GI("txtTipoServicio").options[GI("txtTipoServicio").selectedIndex].text)
  //alert(GI("txtTipoPersona").value)
  if(GI("txtTipoServicio").options[GI("txtTipoServicio").selectedIndex].text.indexOf("ADMINISTRACION")==-1 && GI("txtTipoPersona").value!="")
    eval("objParametros.TipoPersona='" + GI("txtTipoPersona").value+"'");
  else if(GI("txtTipoServicio").options[GI("txtTipoServicio").selectedIndex].text.indexOf("ADMINISTRACION")==-1 && GI("txtTipoPersona").value=="")
  {
    eval("objParametros.TipoPersona=''");  //Para prueba
    //ejecutaFuncion = false;
    //Swal.fire('Aviso', 'Por favor elija Fideicomisario o Tercero',  'warning');
  }
  else
    eval("objParametros.TipoPersona=''");  //Para prueba
  ///
  if(GI("txtTipoServicio").options[GI("txtTipoServicio").selectedIndex].text.indexOf("ADMINISTRACION")==-1)
    eval("objParametros.NumTipoPersona=" + GI("cmbPaga").value);
  else  //Para prueba
    eval("objParametros.NumTipoPersona=0");
  ///
  eval("objParametros.Const2=''");
  eval("objParametros.MesAbierto=" + GI("txtMesAbierto").value);
  eval("objParametros.Const3=683");
  //
  if(GI("txtTipoServicio").selectedIndex!=0 && GI("txtTipoServicio").options[GI("txtTipoServicio").selectedIndex].text.indexOf("ADMINISTRACION")!=-1)
  {
    eval("objParametros.FechaDel='" + GI("txtDel").value+"'");
    eval("objParametros.FechaAl='" + GI("txtAl").value+"'");
  }
  else //Para prueba
  {
    eval("objParametros.FechaDel=''");
    eval("objParametros.FechaAl=''");
  }
  
  ///
  eval("objParametros.Secuencial=0");
  eval("objParametros.FechaPago=''");
  eval("objParametros.TipoServicio=''");  
  eval("objParametros.FormaPago=''");
  eval("objParametros.BancoTransf=0");
  eval("objParametros.CuentaNafin=0");
  eval("objParametros.ReferenciaCie=0");
  eval("objParametros.Internet=0");
  eval("objParametros.Const10=0");
  
  showWaitLayer();
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objParametros);
  //alert(url)
  makeAjaxRequest(url, "HTML", respuestaFuncionPagaOPeriodo, null);
}

function respuestaFuncionPagaOPeriodo(obj, result){
//alert(result)
  var cad = JSON.parse(result).resultado;
  var res = cad.substring(0, 1);
  
  switch(res){
    case '0':
      Swal.fire('Exito', "Proceso concluido satisfactoriamente con folio de operación: " + cad.substring(2,cad.length),  'success');
      break;
    case '1':
      Swal.fire('error', "No existen parámetros de honorarios",  'error');
      break;
    case '2':
      Swal.fire('Aviso', 'No existe el porcentaje de pago del tipo de persona que paga los honorarios',  'warning');
      break;
    case '3':
        Swal.fire('error', "No existe La operacion: " + cad.substring(2,cad.length),  'error');
      break;
    case '4':
      Swal.fire('Aviso', 'Error al buscar claves para operaciion',  'warning');
      break;
    case '5':
      Swal.fire('Aviso', 'Error al armar DATOVAL',  'warning');
      break;
    case '6':
      Swal.fire('Aviso', 'No se contabilizó correctamente',  'warning');
      break;
    case '7':
      Swal.fire('Aviso', 'No existe domicilio fiscal',  'warning');
      break;
    case '8':
      Swal.fire('Aviso', 'No se grabó correctamente la factura',  'warning');
      break;
    case '9':
      Swal.fire('Aviso', 'No se grabó correctamente en la estructura de honorarios',  'warning');
      break;
    default:
      Swal.fire('Aviso', 'Error: Revisar Parametrizacion de Honorarios',  'warning');
  }
  cargaPrincipalFiduciariosGeneracionOtrosIngresosHonorarios();
  hideWaitLayer();
}

///////////////////////////////////////////////////////////////////////////
//VERIFICA SI LA FECHA SELECCIONADA ES VÁLIDA
function verificaFecha(objFecha){
  showWaitLayer();
  var fecha = objFecha.value;
  var url = ctxRoot + "/executeRef.do?json={\"id\":\"ejeFunValidaFecha\",\"Fecha\":\"" + fecha + "\"}";
  makeAjaxRequest(url, "HTML", validaFecha, objFecha);
}

function validaFecha(obj, result){
  var resultado = JSON.parse(result).result;
  switch(resultado){
    case 0:
      GI("txtMesAbierto").value = 0;
      break;
    case 1:
        GI("txtMesAbierto").value = 1;
      break;
    case 2:
      Swal.fire('Aviso', 'La fecha seleccionada corresponde un día no hábil',  'warning');
      obj.focus();
      break;
    case 3:
      Swal.fire('Aviso', 'La fecha seleccionada corresponde a un día feriado',  'warning');
      obj.focus();
      break;
    case 4:
      Swal.fire('Aviso', 'Error al defasar la fecha contable un mes',  'warning');
      obj.focus();
      break;
    case 5:
      Swal.fire('Aviso', 'El mes seleccionado se encuentra cerrado',  'warning');
      obj.focus();
      break;
    case 6:
      Swal.fire('Aviso', 'Solo se permiten movimientos del mes actual o del mes anterior',  'warning');
      obj.focus();
      break;
    case -1:
      Swal.fire('Aviso', 'Error al verificar la fecha seleccionada',  'warning');
      obj.focus();
      break;
  }
  
  if(resultado!=0 && resultado!=1)
  {
    GI("txtFechaValor").value=GI("fcoDiaDia").value+"/"+GI("fcoMesDia").value+"/"+GI("fcoAnoDia").value;
    GI("txtMesAbierto").value = 0;
  }
  
  hideWaitLayer();
}

///////////////////////////////////////////////////////////////////////////
//MOSTRAR COMPONENTES DE PAGA O PERIODO Y CARGAR EL COMBO 2 SI FUE UNA PAGA
function muestraPagaOPeriodo() {
  if(GI("txtTipoServicio").selectedIndex==0)
  {
    ocultaObjs("Paga,Fideicomisario,Tercero,Fideicomitente,cmbPaga");
    ocultaObjs("Periodo,Del,Al");
    RA(GI("txtDel"), "required");
    RA(GI("txtAl"), "required");
    RA(GI("cmbPaga"), "required");
  }
  else if(GI("txtNumFiso").value!="")
  {
    if(GI("txtTipoServicio").options[GI("txtTipoServicio").selectedIndex].text.indexOf("ADMINISTRACION")!=-1)
    {
      ocultaObjs("Paga,Fideicomisario,Tercero,Fideicomitente,cmbPaga");
      muestraObjs("Periodo,Del,Al");
      
      RA(GI("cmbPaga"), "required");
      SA(GI("txtDel"), "required", "");
      SA(GI("txtAl"), "required", "");
    }
    else
    {
      muestraObjs("Paga,Fideicomisario,Tercero,Fideicomitente,cmbPaga");
      ocultaObjs("Periodo,Del,Al");
      
      RA(GI("txtDel"), "required");
      RA(GI("txtAl"), "required");
      SA(GI("cmbPaga"), "required", "");
    }
  }
}


function cargaCombo2() {
  showWaitLayer();
  GI("cmbPaga").selectedIndex=0;
  
  if(GI("rdFideicomisario").checked)
  {
    parametroComboPaga=JSON.parse("{\"Fideicomiso\":" +GI("txtNumFiso").value + ",\"Tipo\":\"FIDEICOMISARIO\"}");
    GI("txtTipoPersona").value="FIDEICOMISARIO";
    SA(GI("cmbPaga"), "ref", "muestraBeneficiPaga");
  }
  else if(GI("rdTercero").checked)
  {
    parametroComboPaga=JSON.parse("{\"Fideicomiso\":" +GI("txtNumFiso").value + ",\"Tipo\":\"TERCERO\"}");
    GI("txtTipoPersona").value="TERCERO";
    SA(GI("cmbPaga"), "ref", "muestraBeneficiPaga");
  }
  else if(GI("rdFideicomitente").checked)
  {
    parametroComboPaga=JSON.parse("{\"Fideicomiso\":" +GI("txtNumFiso").value + ",\"Tipo\":\"FIDEICOMITENTE\"}");
    GI("txtTipoPersona").value="FIDEICOMITENTE";
    SA(GI("cmbPaga"), "ref", "muestraBeneficiPaga");
  }
    
  SA(GI("cmbPaga"),"next","hideWaitLayer");
  loadElement(GI("cmbPaga"));
}

////////////////////////////////////////////////////////////////////////////
//VALIDA FECHA PARA EL FIDEICOMISO Y MUESTRA DATOS INFORMATIVOS
function mostrarDatosInformativos() {
  //GI("txtNomFiso").value="";
  
  validacionAlta.numContrato = GI("txtNumFiso").value;
  validacionAlta2.numContrato = GI("txtNumFiso").value;
  consultaDatosInformativos.NumFideicomiso = GI("txtNumFiso").value;
  
  if(GI("txtNumFiso").value!="")
  {
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificarAlta, null);
  }
  else
    Swal.fire('Aviso', 'Debe especificar un número de fideicomiso',  'warning');
}

function verificarAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoNumContrato > 0)
  {
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta2);
    makeAjaxRequest(url, "HTML", verificarAlta2, null);
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no existe, verifique',  'warning');
    GI("txtNumFiso").value="";
  }
}

function verificarAlta2(obj,result) {
  var objResult = JSON.parse(result);
  var fecha = GI("txtFechaValor").value;
  var fideicomiso = GI("txtNumFiso").value;
  if(objResult[0].ctoCveStContrat == 0)
  {
    var url = ctxRoot + "/executeRef.do?json={\"id\":\"ejeFunValidaFechaMesAnterior\",\"Fecha\":\"" + fecha + "\",\"Fideicomiso\":" + fideicomiso + "}";
    makeAjaxRequest(url, "HTML", validaFechaMesAnterior, null);
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no está ACTIVO',  'warning');
    GI("txtNumFiso").value="";
  }
}

function validaFechaMesAnterior(obj, result){
  var resultado = JSON.parse(result)[0];
  switch(resultado){
    case 0:
    case 2:
      showWaitLayer();
      ejecutaInsercionNombreFideicomiso();
      break;
    case 1:
    case -1:
      Swal.fire('Aviso', 'El fideicomiso se encuentra cerrado',  'warning');
      //obj.focus();
  }
  hideWaitLayer();
}

function ejecutaInsercionNombreFideicomiso() {
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
  makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
}

function insertaDatosInformativos(obj, result) {
  var objResult = JSON.parse(result);
  GI("txtNomFiso").value=objResult[0].ctoNomContrato;
  muestraPagaOPeriodo();
}


//Función para mostrar La Paga o Periodo en caso de seleccionar el Fideicomiso después del tipo de servicio
function onBlurNumFiso(objNumFiso) {
  consultaNombreFideicomiso("nomFideicomiso",objNumFiso);
  
  if(GI("txtTipoServicio").value!=-1)
    muestraPagaOPeriodo();
}