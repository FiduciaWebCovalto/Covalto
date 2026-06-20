//***DEFINICON DE LOS BEANS**************************************************************************************************************
var cat = new Catalogo("mx.com.inscitech.fiducia.domain.ProspectCarrCtas");

//***VARIABLES GLOBALES******************************************************************************************************************


var modo2 = 0;
var pkProsp2 = null;
var clavesCombo27  = JSON.parse("{\"llaveClave\":27}");
var clavesCombo1006  = JSON.parse("{\"llaveClave\":1006}");
var fvCatCuentas = new FormValidator();
var strIdPK = "prsIdCuentas"; //"PRS_NUM_PROSPECT", "PRC_TIPO_CUENTAS", "PRC_NUM_CUENTAS", "PRC_BANCO"
//var arrIdPK = strIdPK.split(",");


//***DEFINICION DEL CONTENIDO DE TABLAS DE CONSULTA**************************************************************************************
//[{"numProspecto":1,"prcBanco":168,"prcNumCuentas":2,"prcTipoCuentas":1,"prsIdCuentas":1}]
var arrTblDatProsp = new Array();
arrTblDatProsp[0] = "pccNumCuenta,60";
arrTblDatProsp[1] = "pccBanco,200";
arrTblDatProsp[2] = "pccMoneda,200"
arrTblDatProsp[3] = "pccTipoCuenta,150";

function clickTablaCuentasProspecto(pk) { 
    pkProsp2 = pk;
    cloneObject(pk,cat.getCatalogo());
}

var vgnumProspect;
function cargaMantenimientoCuentas(Modo) {
    modo = Modo;
    if(pkProsp2 == null && Modo == OPER_BAJA) {
        Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
        return;
    }
  
    if((isDefinedAndNotNull(pkProsp2) || Modo == OPER_ALTA) && Modo != OPER_BAJA) {
        var obj = new Object();
        console.log("Antes1 de mostrar botones2");
        obj.numProspectParam = GI("paramnumProspecto").value;
        obj.prsNomProspecto = GI("prsNomProspecto").value;
        var urlCliente = "modules/Formalizacion/AsignacionCuentas/MantenimientoAsignaCuentas.do";
        makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoCuentas, obj);
    } else if(isDefinedAndNotNull(pkProsp2) && Modo == OPER_BAJA) {
        ejecutaOperacionCuenta();
    }
}

function despliegaPantallaMantenimientoCuentas(obj, result) {
  GI("dvPantalla").innerHTML = result;
  console.log("Antes1 de mostrar botones");
  GI("pccNumProspecto").value = obj.numProspectParam;
  GI("prsNomProspecto").value = obj.prsNomProspecto;
    
  initForms();
  
    fvCatCuentas.setup({
        formName      : "frmDatos",
        tipoAlert     : 1,
        alertFunction : BaloonAlert,
        sendObjToAlert: true
    });
}

function cargaPrincipalDirecciones2(){
  showWaitLayer();
  pkProsp2 = null;
  var obj = new Object();
  obj.prsNumProspecto = GI("pccNumProspecto").value;
  obj.prsNomProspecto = GI("prsNomProspecto").value;
  var urlCliente = "modules/Formalizacion/AsignacionCuentas/PrincipalAsignaCuentas.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipalDirecciones, obj);
}

function ejecutaOperacionCuenta(){
    cat.setOnUpdate(verificaOperacionCuenta);
    if(modo == OPER_ALTA) {
        if(fvCatCuentas.checkForm()) {
            cat.altaCatalogo(true);
            //enviaCorreo(GI("prsNumprospect").value);
        }
    } else if(modo == OPER_BAJA) {
        showWaitLayer();
        cat.modificaCatalogo(false);
    }
}

function verificaOperacionCuenta(){
    Swal.fire('¡Éxito!', "Operación realizada exitosamente", 'success');
    if(modo == OPER_BAJA) {
        consultar(GI("cmdRegresar"), GI("frmDatos"), false);
    } else {
        cargaPrincipalDirecciones2();
    }
  hideWaitLayer();
}

/*FUNCION PARA MANDAR CORREO DE APERTURA DE CUENTAS*/
function enviaCorreo(proyecto){
     var idLink = "linkReporteNew"; 
     var parametrosUrl = new Object;
     parametrosUrl.sendToJSP="true";
     //Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte="/modules/Formalizacion/AgendaBursatil/EnviarCorreo.jsp"
     parametrosUrl.id="mandaCorreoInstrucBursatil";
    parametrosUrl.proyecto=proyecto;
     var url = ctxRoot + "/imprimirReporte.do?json=" + encodeURIComponent(JSON.stringify(parametrosUrl));
	 //alert(url)
     idLink.href=url;
     window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");        
     //idLink.click();
     document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
}

function asignarCuentasProspecto() {
    var obj = new Object();
    if(fvCatCuentas.checkForm()) {
        obj.id = "frm.fnAsignaCuentasProspecto";
        obj.tipoOperacion = 1;
        obj.banco = GI("pccBanco").value;
        obj.tipoCuenta = GI("pccTipoCuenta").value;
        obj.moneda = GI("pccMoneda").value;
        obj.prospecto = GI("pccNumProspecto").value;
        obj.cuentas = GI("pccNumCuenta").value;
        
        var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(obj);
        makeAjaxRequest(url, "HTML", validarAsignacionCuentasProspecto, null);
    }
}
  
function validarAsignacionCuentasProspecto(obj, resultado) { 
    var resp = JSON.parse(resultado);
    var r = resp.result
    
    switch(r) {
        case -1: 
            Swal.fire('Aviso', 'A ocurrido un error',  'warning'); 
        break;
        case 0:
            Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
            cargaPrincipalDirecciones2(); 
        break;
        case 1: 
            Swal.fire('Aviso', 'No existen suficientes cuentas disponibles para asignar al prospecto',  'warning'); 
        break;
    }
}


function loadCatalogo() {
    cat.setOnUpdate(catLoaded);
     console.log("Antes de mostrar botones");
    deshabilitaPK("pccNumProspecto,prsNomprospecto".split(","));
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
}

function catLoaded() {
    formsLoaded();
}