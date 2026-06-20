//***DEFINICON DE LOS BEANS**************************************************************************************************************
var cat = new Catalogo("mx.com.inscitech.fiducia.domain.FDocvig");

//***VARIABLES GLOBALES******************************************************************************************************************
var origen = 0;
var cmbDocumentoParam = JSON.parse("{\"numOper\":-1,\"order\":1}");
var contenedor = new Object();

var OPER_ALTA = 1;
var OPER_MODIFICAR = 2;
var OPER_CONSULTAR = 3;
var OPER_CONSULTARPR = 4;

var modo2 = 0;
var pkProsp2 = null;
var clavesCombo27 = JSON.parse("{\"llaveClave\":27}");
var clavesCombo1006 = JSON.parse("{\"llaveClave\":1006}");

var fvFrmDatos = new FormValidator();
fvFrmDatos.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

var fechaDefault = new Date();

function setFechaCal() {
}

function isValidDate(date) {
    return false;
    /*
    var today = new Date();
    if (date < today)
        return true;
    else 
        return false;
    */
}

var fvCat = new FormValidator("frmDatos");
var strIdPK = "fdocNumVigSeq";//"PRS_NUM_PROSPECT", "PRC_TIPO_CUENTAS", "PRC_NUM_CUENTAS", "PRC_BANCO"
//var arrIdPK = strIdPK.split(",");
var verificaExistenciaHijDoc = JSON.parse("{\"id\":\"verificaExistenciaHijDoc\",\"numDocto\":0}");
var objDatosFideicom = new Object();
var paramsQryDocumentsCbo;
var paramsQryDocumentsCbo2;
var tipoper;
//***DEFINICION DEL CONTENIDO DE TABLAS DE CONSULTA**************************************************************************************
//[{"numProspecto":1,"prcBanco":168,"prcNumCuentas":2,"prcTipoCuentas":1,"prsIdCuentas":1}]
var arrTblDatProsp = new Array();

arrTblDatProsp[0] = "semaforo,23px";
arrTblDatProsp[1] = "fdocIdAnteproy,50";
arrTblDatProsp[2] = "fiso,50";
arrTblDatProsp[3] = "fdocIdDocumentovig,50";
arrTblDatProsp[4] = "fdocNombre,150";
arrTblDatProsp[5] = "fecha,100";
arrTblDatProsp[6] = "estatusVigencia,100";

function clickTablaProsp(pk) {
    //console.log("Carga de Tabla!");
    pkProsp2 = pk;
    cloneObject(pk, cat.getCatalogo());
    consultaExistenciaDoctoBaja.fiso = pkProsp2.fiso;
    consultaExistenciaDoctoBaja.folio = pkProsp2.fdocIdDocumentovig;
    consultaExistenciaDoctoBaja.persona = GI("paramnumPersona").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaExistenciaDoctoBaja);
    makeAjaxRequest(url, "HTML", ActivaDesactivaConstitucion, null);   
}

function ActivaDesactivaConstitucion(obj, result) {
  var objResult = JSON.parse(result);
  const VerBtn = document.getElementById('cmdDocumento');
  
  const botonupl = document.getElementById('btnUpload');
  
    var existe=objResult[0].existe;
    if(existe==0){
        VerBtn.disabled=true;
        botonupl.disabled=false;
    }
    else{
        VerBtn.disabled=false;
        botonupl.disabled=true;
    }
    hideWaitLayer();
}
var vgnumProspect;
function rowInstruccion(row) {
    row.children[1].innerHTML = '<img src="imagenes\\table\\bullets\\' + row.children[1].innerHTML + '.png">';
}
function cargaMantenimientoCuentas(Modo) {
    modo = Modo;
    if ((isDefinedAndNotNull(pkProsp2) || Modo == OPER_ALTA) && Modo != OPER_BAJA) {
        //alert(Modo + "Pantalla Alta");
        //showWaitLayer();
        objDatosFideicom = new Object();
        objDatosFideicom.numProy = GI("paramnumProyec").value;
        objDatosFideicom.numPers = GI("paramnumPersona").value;
        objDatosFideicom.TipoParte = GI("paramTipoParte").value;
        objDatosFideicom.TipoPers = GI("paramTipoPer").value;
        objDatosFideicom.antNumContrato = GI("antNumContrato").value;
        objDatosFideicom.RFC = GI("afbTelFidben").value;
        objDatosFideicom.nombre = GI("paramNombre").value;
        origen=GI("pantORIG").value;
        var urlCliente = "modules/Administracion/VigenciaDoctos/MantenimientoVigenciaDoctos.do";
        makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoCuentas, objDatosFideicom);
    }
    else if (isDefinedAndNotNull(pkProsp2) && Modo == OPER_BAJA) {
        //alert(Modo + " X");
        ejecutaOperacionCuenta();
    }
}

function despliegaPantallaMantenimientoCuentas(obj, result) {
    GI("dvPantalla").innerHTML = result;
    GI("fdocIdAnteproy").value = obj.numProy;
    GI("fdocNumper").value = obj.numPers;
    GI("paramTipoParte").value = obj.TipoParte;
    GI("fdocTipoPer").value = obj.TipoPers;
    GI("antNumContrato").value=obj.antNumContrato;
    GI("afbTelFidben").value=obj.RFC;
    GI("paramNombre").value=obj.nombre;
    console.log("Carga Mantto admon: "+obj.TipoParte)
    switch (obj.TipoParte) {
        case "FISICA NACIONAL":
            tipoper = 40001;
            break;
        case "MORAL NACIONAL":
            tipoper = 40002;
            break;
        case "FISICA EXTRANJERA":
            tipoper = 40003;
            break;
        case "MORAL EXTRANJERA":
            tipoper = 40004;
            break;
        case "FIDEICOMISOS":
            tipoper = 40005;
            break;
        default :
            Swal.fire('Aviso', 'No esta definido el tipo de persona',  'warning');
            break;
    }
    Calendar.setup( {
        inputField : "fdocFechaRenov", // id of the input field
        button : "fdocFechaRenov", 
        ifFormat : "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
        showsTime : false, 
        timeFormat : "24", 
        onUpdate : setFechaCal, 
        disableFunc : isValidDate, 
        date : fechaDefault, 
        weekNumbers : false, 
        cache : true, 
        step : 1
    });
    
    cargaTablaParaDocumentos();
    initForms();

    if (modo == OPER_CONSULTAR || modo == OPER_MODIFICAR) {
        deshabilitaPK(arrIdPK);
        if (modo == OPER_CONSULTAR) {
            deshabilitaObjetos(GI("frmDatos"));
            GI("cmdCancelar").value = "Regresar";
            muestraObj("cmdCancelar");
        }
    }
    if (modo == OPER_ALTA || modo == OPER_MODIFICAR)
        muestraObjs("cmdAceptar,cmdCancelar");
}

var consultaExistenciaDocto = 
JSON.parse("{\"id\":\"qryDoctoxVigencia\"}");
var consultaExistenciaDoctoBaja = 
JSON.parse("{\"id\":\"qryValidaBajaDocumento\"}");
function ejecutaOperacionCuenta() {
    if (modo == OPER_ALTA) {
        consultaExistenciaDocto.numProyec = GI("fdocIdAnteproy").value;
        consultaExistenciaDocto.numPersona = GI("fdocNumper").value;
        consultaExistenciaDocto.idDocumento = GI("fdocIdDocumentovig").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaExistenciaDocto);
        makeAjaxRequest(url, "HTML", validaExistenciaDocto, null);    
    }
    else if (modo == OPER_BAJA) {
        consultaExistenciaDoctoBaja.fiso = pkProsp2.fiso;
        consultaExistenciaDoctoBaja.folio = pkProsp2.fdocIdDocumentovig;
        consultaExistenciaDoctoBaja.persona = GI("paramnumPersona").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaExistenciaDoctoBaja);
        makeAjaxRequest(url, "HTML", validaExistenciaDoctoBaja, null);
    }
    hideWaitLayer();
}

function validaExistenciaDoctoBaja(obj, result) {
  var objResult = JSON.parse(result);
    var existe=objResult.existe;
    console.log(objResult.existe)
    console.log(objResult[0].existe)
    if(existe>0){
        Swal.fire('¡error!', "Ya esta en el expediente el documento.", 'error');
    }
    else{
        cat.setOnUpdate(verificaOperacionCuenta);
        if (fvCat.checkForm()) {
            cat.bajaCatalogo(false);
            regresar2();
        }
    }
    hideWaitLayer();
}


function validaExistenciaDocto(obj, result) {
  var objResult = JSON.parse(result);
    var existe=objResult[0];
    console.log(objResult.length)
    if(objResult.length>0){
        Swal.fire('¡error!', "El documento ya esta asignado", 'error');
    }
    else{
        cat.setOnUpdate(verificaOperacionCuenta);
        if (fvCat.checkForm()) {
            cat.altaCatalogo(true);
            regresar2();
        }
    }
    hideWaitLayer();
}

function verificaOperacionCuenta() {
    Swal.fire('¡Éxito!', "Operación realizada exitosamente", 'success');
    consultar(GI("cmdRegresar"), GI("frmDatos"), false);
    hideWaitLayer();
}

function regresar() {
  contenedor.Proyecto = GI("paramnumProyec").value;
  contenedor.NumPersona = GI("paramnumPersona").value;
  contenedor.NomPersona = GI("paramNombre").value;
  contenedor.TPersona = GI("paramTipoPer").value;//afbCvePersona
  contenedor.antNumContrato= GI("antNumContrato").value;
  contenedor.pant=GI("pantORIG").value;
  contenedor.TipoParte= GI("paramTipoParte").value;//afbTipoPersona
  contenedor.RFC= GI("afbTelFidben").value;

  var url = ctxRoot + "/modules/Administracion/KYC/MantenimientoKYC.do";
  makeAjaxRequest(url, "HTML", cargaParametros, contenedor);
  loadDynamicJS(ctxRoot + "/modules/Administracion/KYC/PrincipalKYC.js");
}

function cargaParametros(obj, result) {
  GI("dvPantalla").innerHTML = result;
  //deshabilitaObjetos(GI("frmDatosMantenimientoFideicomitentes"));
  GI("afbAnteproyecto").value = obj.Proyecto; //prsNumProspecto
  GI("afbNumFidben").value = obj.NumPersona;
  GI("afbNomFidben").value = obj.NomPersona;
  GI("afbCvePersona").value = obj.TPersona;//afbCvePersona
  GI("pantORIG").value=obj.pant;
  GI("antNumContrato").VALUE=obj.antNumContrato;
  GI("afbTipoPersona").value = obj.TipoParte;//afbTipoPersona
  GI("afbTelFidben").value=obj.RFC;
  formsLoaded();
}

function cargaTablaParaDocumentos() {
    //NO TIENE HIJOS
    cmbDocumentoParam.numOper = tipoper; 
    loadElement(GI("fdocIdDocumentovig"));
}


function validaDocumentoVigenciaDoctoPDF(){
    if(pkProsp2!=null){
            console.log(pkProsp2.fdocIdDocumentovig)
            console.log(pkProsp2.fiso)
            consultaExistenciaDoctoBaja.fiso = pkProsp2.fiso;
            consultaExistenciaDoctoBaja.folio = pkProsp2.fdocIdDocumentovig;
            consultaExistenciaDoctoBaja.persona = GI("paramnumPersona").value;
            var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaExistenciaDoctoBaja);
            makeAjaxRequest(url, "HTML", validaExistenciaDoctoBaja2, null);
    }    
    else 
        Swal.fire('warning', 'Seleccione un Documento de la Lista.',  'warning');
}

function validaExistenciaDoctoBaja2(obj, result) {
  var objResult = JSON.parse(result);
    var existe=objResult[0].existe;
    console.log("Existe "+existe)
    console.log("Existe "+Number(existe))
    if(Number(existe)===0){
        console.log("Entro");
        Swal.fire('¡error!', "El Expediente aun no se ha cargado!", 'error');
    }
    else{
        generaReporteDoctoContrato(pkProsp2.fdocIdDocumentovig,pkProsp2.fiso,GI("paramnumPersona").value);
    }
    hideWaitLayer();
}

const boton = document.getElementById('btnUpload');
async function uploadFile() {  

    if(pkProsp2==null){
        Swal.fire('warning', 'Seleccione un Documento de la Lista.',  'warning');
        return;
    }    

    const fileInput = document.getElementById('pdfFile');
    const statusMessage = document.getElementById('statusMessage');
    // 1. Recuperar credenciales del almacenamiento local
    
    if (fileInput.files.length === 0){
    Swal.fire('Eror', 'No ha seleccionado ningun archivo',  'error');
    return;
    } 
    
    // Crear FormData para enviar archivos vía AJAX
    const formData = new FormData();
    formData.append('file', fileInput.files[0]);
    formData.append('id', pkProsp2.fdocIdDocumentovig);
    formData.append('fiso', pkProsp2.fiso);
    formData.append('persona', GI("paramnumPersona").value);
    const token = localStorage.getItem('token'); 
    const usuario = localStorage.getItem('usuario'); 

    formData.append('token', token);
    formData.append('usuario', usuario);

    console.log('id'+pkProsp2.fdocIdDocumentovig);
    console.log('fiso'+pkProsp2.fiso);
    console.log('file'+fileInput.files[0]);
    console.log('persona'+GI("paramnumPersona").value);
    
    statusMessage.innerHTML = '<div class="alert alert-info">Subiendo...</div>';

    try {
    
    const response = await 
    fetch('uploadServlet', {
    method: 'POST',
    body: formData
    });
    
    const result = await response.json();
    console.log('Respuesta del Servlet:', result);
    
        if (result=="200") {                    
            statusMessage.innerHTML = 'Archivo subido con éxito!';
            statusMessage.style.color = 'green';
            consultar(GI("cmdRegresar"), GI("frmDatos"), false);
            return;
        } else if (result=="800")
        {
            statusMessage.innerHTML = 'El archivo ya se subio';
            statusMessage.style.color = 'red';
        }    
    }
    catch (error) {
    statusMessage.innerHTML = 'Error al subir el archivo.';
    statusMessage.style.color = 'red';
    }
}
// 3. Agregar el evento clic usando async
boton.addEventListener('click', async () => {
    await uploadFile();
});


    
    
    function regresar2() {
  contenedor.Proyecto = GI("fdocIdAnteproy").value;
  contenedor.NumPersona = GI("fdocNumper").value;
  contenedor.NomPersona = GI("paramNombre").value;
  contenedor.TPersona = GI("fdocTipoPer").value;//afbCvePersona
  contenedor.antNumContrato= GI("antNumContrato").value;
  contenedor.pant=GI("pantORIG").value;
  contenedor.TipoParte= GI("paramTipoParte").value;//afbTipoPersona
  contenedor.RFC= GI("afbTelFidben").value;
  var url = ctxRoot + "/modules/Administracion/VigenciaDoctos/PrincipalVigenciaDoctos.do";
  makeAjaxRequest(url, "HTML", cargaParametros2, contenedor);
  loadDynamicJS(ctxRoot + "/modules/Administracion/VigenciaDoctos/PrincipalVigenciaDoctos.js");
}

function cargaParametros2(obj, result) {
  GI("dvPantalla").innerHTML = result;
  //deshabilitaObjetos(GI("frmDatos"));
  GI("paramnumProyec").value = obj.Proyecto; //prsNumProspecto
  GI("paramnumPersona").value = obj.NumPersona;
  GI("paramNombre").value = obj.NomPersona;
  GI("paramTipoPer").value = obj.TPersona;//afbCvePersona
  GI("antNumContrato").VALUE=obj.antNumContrato;
  GI("paramTipoParte").value = obj.TipoParte;//afbTipoPersona
  GI("afbTelFidben").value=obj.RFC;
  consultar(GI("cmdRegresar"), GI("frmDatos"), false);
  formsLoaded();
}
