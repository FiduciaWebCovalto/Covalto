var catParametrosHonorarios = new Catalogo("mx.com.inscitech.fiducia.domain.Pacahon");

var clavesCombo9  = JSON.parse("{\"llaveClave\":9}");
var clavesCombo10 = JSON.parse("{\"llaveClave\":10}");
var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var clavesCombo637 = JSON.parse("{\"llaveClave\":637}");
var clavesCombo1119 = JSON.parse("{\"llaveClave\":1119}");
var consultaDatosInformativos = JSON.parse("{\"id\":\"muestraDatosFideicomisos\",\"NumFideicomiso\":0}");
var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaContrato\",\"numContrato\":0}");
var validacionExistenciaRegistro = JSON.parse("{\"id\":\"verificaExistenciaRegistroPacahon\",\"numContrato\":0}");
var validacionAlta2 = JSON.parse("{\"id\":\"verificaSeaActivo\",\"numContrato\":0}");

var tablaParametrosHonorariosData = new Array();
tablaParametrosHonorariosData[0] = "pacNumContrato,85px";
tablaParametrosHonorariosData[1] = "ctoCveTipoNeg,115px";
tablaParametrosHonorariosData[2] = "ctoNomContrato,250px";
tablaParametrosHonorariosData[3] = "pacCvePersCob,130px";
tablaParametrosHonorariosData[4] = "pacCvePeriodCob,200px";
tablaParametrosHonorariosData[5] = "pacCveStPacahon,90px";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var fechaUltimoCalculo = new Date();
var fechaUltimaRevision = new Date();
var fechaProxCalculo = new Date();
var fechaConstitucion = new Date();
var fvParamHon = new FormValidator();
var OPER_ALTA = 1;
var OPER_MODIFICAR = 2;
var CONSULTAR = 3;

formsLoaded();

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

function descomponeFecha(objOriginal,objDia,objMes,objAno)
{
  var fecha=objOriginal.value;
  fecha=fecha.toString();
  fecha=fecha.split("/");
  
  objDia.value=fecha[0];
  objMes.value=fecha[1];
  objAno.value=fecha[2];
}


function cargaPrincipalParametrosHonorarios() {
  onButtonClickPestania("Honorarios.PrincipalParametrosHonorarios","");
}


function cargaMantenimientoParametrosHonorarios(tipoPantalla) {
  if ((tipoPantalla==OPER_MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Honorarios/MantenimientoParametrosHonorarios.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
  }
}

function despliegaPantalla(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  if(numPantalla==1)
  {
    Calendar.setup({
    inputField     :    "pacFecUltCalc",   // id of the input field
    button         :    "pacFecUltCalc",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechaUltimoCalculo,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
    
    Calendar.setup({
    inputField     :    "txtFecProxCalc",   // id of the input field
    button         :    "txtFecProxCalc",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechaProxCalculo,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
        
    //Agregando la funcionalidad del required
    fvParamHon.setup({
      formName      : "frmParametrosHonorariosMantenimiento",
      tipoAlert     : 1,
      alertFunction : BaloonAlert,
      sendObjToAlert: true
    });
  }
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catParametrosHonorarios.getCatalogo());
}

function loadCatalogo() {
  catParametrosHonorarios.setOnUpdate(catLoaded);
  if(operacion==OPER_MODIFICAR || operacion==CONSULTAR)
    catParametrosHonorarios.buscaCatalogoPK(false);
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
    formsLoaded();
  }
}

function AltaOModificaInfo() {
  catParametrosHonorarios.setOnUpdate(operacionExitosa);
  if(operacion==OPER_ALTA)//Se trata de una alta
  {
    if(GI("pacNumContrato").value!="")
      catParametrosHonorarios.altaCatalogo();
    else
      Swal.fire('Aviso', 'Hace falta que coloque un número de fideicomiso',  'warning');
  }
  else if(operacion==OPER_MODIFICAR)//Se trata de una modificación
  {
    /*
    var vgContenedorDatos;
    var tp=2;
    vgContenedorDatos=null;
    vgContenedorDatos=JSON.parse("{\"id\":\"funcionModificaHonorarios\"}");//PRIMERO SE PROCESA LA BITACORA
    vgContenedorDatos.opcion=eval(tp);
    vgContenedorDatos.contrato=eval(GI("pacNumContrato").value);
    vgContenedorDatos.importe=eval(GI("pacImpFijoHono").value);
    vgContenedorDatos.moneda=eval(GI("pacNumMoneda").value);
    vgContenedorDatos.persona=GI("pacCvePersCob").value;
    vgContenedorDatos.periodo=GI("pacCvePeriodCob").value;
    vgContenedorDatos.proximo=GI("txtFecProxCalc").value;
    vgContenedorDatos.corte=GI("pacDiaCalcClte").value;
    vgContenedorDatos.constitucion="";//GI("pacFechaConstitucion").value;
    vgContenedorDatos.actualizainpc=""//GI("pacPeriodoActInpc").value;
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
    makeAjaxRequest(url, "HTML", ejecutaFuncion, tp);
    */
    catParametrosHonorarios.modificaCatalogo();
  }
}

 function ejecutaFuncion(tp,result){
    var resultado= JSON.parse(result);
    var res=resultado;
    if(res.result==0) {
        operacionExitosa();
    }
}

function catLoaded() {
  if(operacion==OPER_MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
    deshabilitaPK("pacNumContrato".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    //muestraObjs("cmdCuentas"); //Mostrar el botón de Cuentas
    deshabilitaObjetos(GI("frmParametrosHonorariosMantenimiento"));                  //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  
  //Reuniendo las Fechas
  GI("txtFecProxCalc").value = formatString(GI("pacDiaCalcHono").value,"0",2,"Izquierda") + "/" + formatString(GI("pacMesCalcHono").value,"0",2,"Izquierda") + "/" + GI("pacAnoCalcHono").value;
  //GI("pacFechaConstitucion").value=formatString(GI("pacDiaAltaReg").value,"0",2,"Izquierda") + "/" + formatString(GI("pacMesAltaReg").value,"0",2,"Izquierda") + "/" + GI("pacAnoAltaReg").value;
  //Mostrando lo que existe en la Forma de Cálculo
  abrirFormacalculo(GI("pacCveFormaCalc"));
  //Mostrar el nombre del fiso (informativo)
  mostrarDatosInformativos(3);
  cargaRadiosConMaster("pacCveImpFijo","pacCveImpFijo2,pacCveImpFijo3");
  formsLoaded();
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalParametrosHonorarios();
}

////////////////////////////////////////////////////////////////////////////
function mostrarDatosInformativos(parametroPantalla) {
  GI("txtProspecto").value="";
  GI("txtNombre").value="";
  GI("txtFechaConstitucion").value="";
  GI("txtCIS").value="";
  GI("txtContrato").value="";
  
  validacionAlta.numContrato = GI("pacNumContrato").value;
  validacionAlta2.numContrato = GI("pacNumContrato").value;
  validacionExistenciaRegistro.numContrato = GI("pacNumContrato").value;
  consultaDatosInformativos.NumFideicomiso = GI("pacNumContrato").value;
  
  if(parametroPantalla==2 && GI("pacNumContrato").value!="")
  {
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificarAlta, null);
  }
  else if(parametroPantalla==3)
  {
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
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
    GI("pacNumContrato").value="";
  }
}

function verificarAlta2(obj,result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoCveStContrat == 0)
  {
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionExistenciaRegistro);
    makeAjaxRequest(url, "HTML", verificaExistenciaRegistro, null);
    
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no está ACTIVO',  'warning');
    GI("pacNumContrato").value="";
  }
}

function verificaExistenciaRegistro(obj,result) {
  var objResult = JSON.parse(result);
  if(objResult[0].pacNumRegistro == 0)
  {
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
  }
  else
  {
    Swal.fire('Aviso', 'Ya existe un registro con ese número de fideicomiso',  'warning');
    GI("pacNumContrato").value="";
  }
}

function insertaDatosInformativos(obj, result) {
  var objResult = JSON.parse(result);
  //GI("txtProspecto").value=objResult[0].prsNumProspecto;
  GI("txtNombre").value=objResult[0].ctoNomContrato;
  GI("txtFechaConstitucion").value=objResult[0].ctoFecConst;
  GI("txtCIS").value=objResult[0].ctoCis;
  GI("txtContrato").value=objResult[0].ctoNumContrato; //Numero de contrato
}

///////////////////////////////////////////////////////////////////////////////
//Función para mostrar u ocultar elementos cuando se seleccione algún radio
function opcionesRadios(objRadio) {
    if(objRadio.id=="rdImpFijo" || objRadio.id == "rdPorcPactado" || objRadio.id == "rdPorcMillar" || objRadio.id == "rdExento" || objRadio.id == "rdOtro") {
        ocultaObjs("dvSaldo,dvValor,dvImpMin,dvImpMax");
        RA(GI("rdTabla"), "required", "");
        RA(GI("pacImpMinHono"), "required", "");
        RA(GI("pacImpMaximo"), "required", "");
        GI("pacImpMinHono").value = "";
        GI("pacImpMaximo").value = "";
        GI("rdTblSaldo").checked = false;
        GI("rdTblValor").checked = false;
        
        if(objRadio.id=="rdImpFijo") {
            GI("pacCveFormaCalc").value = "IMPORTE FIJO";
            muestraObjs("pacImpFijoHono,dvINPC,dvImpFijoPerAct");
            SA(GI("pacImpFijoHono"), "required", "");
            SA(GI("pacImpFijoPerAct"), "required", "");
        } else if(objRadio.id=="rdPorcPactado") {
            GI("pacCveFormaCalc").value = "PORCENTAJE FIJO VALOR";
        } else if(objRadio.id=="rdPorcMillar") {
            GI("pacCveFormaCalc").value = "MILLAR VALOR";
        } else if(objRadio.id=="rdExento") {
            GI("pacCveFormaCalc").value = "EXENTO";
        } else if(objRadio.id=="rdOtro") {
            GI("pacCveFormaCalc").value = "OTRO";
        }
    }
    
    if(objRadio.id != "rdImpFijo") {
        ocultaObjs("pacImpFijoHono,dvINPC,dvImpFijoPerAct");
        RA(GI("pacImpFijoHono"), "required", "");
        RA(GI("pacImpFijoPerAct"), "required", "");
        GI("pacImpFijoHono").value = "";
        GI("pacImpFijoPerAct").selectedIndex = 0;
        GI("pacInpcChk").checked = false;
        GI("pacCpiChk").checked = false;
        GI("pacDiezChk").checked = false;
        GI("pacUdiChk").checked = false;
        GI("pacSinActChk").checked = false;
        
    if(objRadio.id=="rdTblCalc") {
        muestraObjs("dvSaldo,dvValor,dvImpMin,dvImpMax");
        SA(GI("rdTabla"), "required", "");
        SA(GI("pacImpMinHono"), "required", "");
        SA(GI("pacImpMaximo"), "required", "");
    } else if(objRadio.id=="rdTblSaldo") {
        GI("pacCveFormaCalc").value = "TABLA SALDO";
    } else if(objRadio.id=="rdTblValor")
        GI("pacCveFormaCalc").value = "TABLA VALOR";
    }
}

//----------------------------------------- Pantalla de Cuentas
function cargaPrincipalCuentas(){
  //showWaitLayer();
 // Swal.fire('Aviso', 'entro a cuentas',  'warning')var objDatosFideicomitente = new Object();
  objDatosFideicomitente.NumContrato = GI("pacNumContrato").value;
  var urlCliente = "modules/Honorarios/AsignacionCuentas/PrincipalAsignaCuentas.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipalDirecciones, objDatosFideicomitente);
  loadDynamicJS(ctxRoot + "/modules/Honorarios/AsignacionCuentas/PrincipalAsignaCuentas.js");
}

function despliegaPantallaPrincipalDirecciones(obj, result) {
  GI("dvPantalla").innerHTML = result;
  deshabilitaObjetos(GI("frmDatos"));
  //asignaEtiqueta("nomFideicomiso",obj.NomContrato);
  //GI("fidNomFideicom").value = obj.NomFideicomitente;
  //GI("paramFideicomiso").value = obj.NumContrato;
  //GI("paramFideicom").value = obj.NumFideicomitente;
  GI("parampacNumCto").value = obj.NumContrato; //prsNumProspecto
  consultar(GI("cmdRegresar"), GI("frmDatos"), false);
  formsLoaded();
}

///////////////////////////////////////////////////////////////////////////////
//Función para mostrar lo existente en la Forma de Cálculo
function abrirFormacalculo(objTexto) {
  if(objTexto.value == "IMPORTE FIJO") {
    GI("rdImpFijo").checked = true;
    muestraObjs("pacImpFijoHono,dvINPC,dvImpFijoPerAct");
    SA(GI("pacImpFijoHono"), "required", "");
  }
  else if(objTexto.value == "EXENTO")
    GI("rdExento").checked = true;
  else if(objTexto.value == "OTRO")
    GI("rdOtro").checked = true;
  else if(objTexto.value == "PORCENTAJE FIJO VALOR")
    GI("rdPorcPactado").checked = true;
  else if(objTexto.value == "MILLAR VALOR")
    GI("rdPorcMillar").checked = true;
  else if(objTexto.value == "TABLA SALDO" || objTexto.value == "TABLA VALOR")
  {
    GI("rdTblCalc").checked = true;
    muestraObjs("dvSaldo,dvValor,dvImpMin,dvImpMax");
    SA(GI("rdTabla"), "required", "");
    SA(GI("pacImpMinHono"), "required", "");
    SA(GI("pacImpMaximo"), "required", "");
    
    if(objTexto.value == "TABLA SALDO")
      GI("rdTblSaldo").checked = true;
    else if(objTexto.value == "TABLA VALOR")
      GI("rdTblValor").checked = true;
  }
}
