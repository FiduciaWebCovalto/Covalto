//***DEFINICON DE LOS BEANS**************************************************************************************************************
var cat = new Catalogo("mx.com.inscitech.fiducia.domain.Instrucc");

//***VARIABLES GLOBALES******************************************************************************************************************

var parametrosCharola = JSON.parse("{}");
parametrosCharola.idEtapa = GI("paramIdEtapa").value;
parametrosCharola.idTipoSolicitud = GI("paramIdTipoSolicitud").value;
parametrosCharola.tipoSolicitud = GI("paramTipoSolicitud").value;

var paramsQryDocumentsCbo;
var paramFideicomiso;
var clavesCombo638 = JSON.parse("{\"llaveClave\":638}");
var clavesComboMotivoRechazo = JSON.parse("{\"llaveClave\":1075}");
var paramPerfil = JSON.parse("{\"orderPerfil\":\"s\"}");
var paramQueryAdmon = JSON.parse("{\"Order\":\"s\"}");
var asignaPerfil = JSON.parse("{\"numEtapa\":\""+GI("paramIdEtapa").value+"\"}");

var strIdPK = "insNumContrato,insNumFolioInst,insCveStInstruc,InsNumOper,insTxtComentario";
var arrIdPK = strIdPK.split(",");
var fvCat = new FormValidator();
var opcion = 0;
var pkInfoCharSol = null;
var pkInfoPtoRev=null;

var vgObjqryllenaTablaAdmon=null;
var vgContenedorDatos=null;
var txtPerfil;
var userId;

var vgNumEtapa;
var vgIdEtapa;
var vgFecIni;
var vgFecFin;

var vgValor;
var vgTipoSolicitud;//nuevo
var vgEtapa;
  
initForms();
//***DEFINICION DEL CONTENIDO DE TABLAS DE CONSULTA**************************************************************************************
var arrTblDatCharSol = new Array();
arrTblDatCharSol[0] = "semaforo,200px";
arrTblDatCharSol[1] = "interfaz,200px";
arrTblDatCharSol[2] = "insNumFolioInst,100px";
arrTblDatCharSol[3] = "insCveStInstruc,200px";
arrTblDatCharSol[4] = "insNumContrato,150px";
arrTblDatCharSol[5] = "insTxtComentario,600px";
arrTblDatCharSol[6] = "moneda,600px";
arrTblDatCharSol[7] = "concepto,300px";
arrTblDatCharSol[8] = "cuentaOrigen,300px";
arrTblDatCharSol[9] = "cuentaDestino,300px";
arrTblDatCharSol[10] = "monto,500px,right";
arrTblDatCharSol[11] = "beneficiario,500px";
arrTblDatCharSol[12] = "fbisFechaIni,400px"; 
arrTblDatCharSol[13] = "cartaRecurrente,300px";
arrTblDatCharSol[14] = "tipoEntrada,300px";

function rowInstruccion(row) {
    row.children[1].innerHTML = '<img src="imagenes\\table\\bullets\\' + row.children[1].innerHTML + '.png">';
}

function clickTablaCharSol(pk) {
    pkInfoCharSol = pk;
    cloneObject(pk, cat.getCatalogo());
}
    
function setOrder(obj) {
    for(var i = 1; i <= 15; i++) {
        GI("paramOrder" + i).value = "";
    }
    GI("paramOrder" + obj.value).value = "S";
}

function cargaPantallaPuntosRevision() {
    if(isDefinedAndNotNull(pkInfoCharSol)) {
        var urlCliente = ctxRoot + "/modules/Administracion/Monetarias/PuntosRevisionSolicitudesAdmon.do";
        makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, opcion);
    } else {
        Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
    }
}
    
function despliegaPantalla(obj, result) {
    GI("dvPantalla").innerHTML = result;
    initForms();
    fvCat.setup({
        formName      : "frmPtosSol",
        tipoAlert     : 1,
        alertFunction : BaloonAlert,
        sendObjToAlert: true
    });
    setValuesFormObject(pkInfoCharSol);
}

function verNomFiso(){
    consultaNombreFideicomiso('nomFideicomiso',GI("paramContrato"));
}


function cargaPantallaInstrucciones() {
    onButtonClickPestania("Administracion.Monetarias.CharolaSolicitudAdmon","");
    hideWaitLayer();
}

function doDownload() {
    var tablaConsulta = GI('tblRegCharSol');
    var rows = tablaConsulta.getElementsByTagName("tr");

    if(rows.length <= 0) {
        Swal.fire('Aviso', 'No se encontraron registros!',  'warning');        
    } else {
        var datosConsulta = getParameters(GI('frmCharolaSolicitudes'));
        datosConsulta.id = "qry.mesaControl.instrucciones.excel";
        var jsonParam = JSON.stringify(datosConsulta);
        GI('jsonExport').value = jsonParam;
        GI('frmExport').submit();
    }
}

function ejecutaAccion(accion) {
    switch(accion) {
        case "interfaz":
        
        break;
        case "carta":
        
        break;
        case "excel":
        
        break;
        case "correo":
            enviaCorreo(eval(pkInfoCharSol.insNumContrato),
            pkInfoCharSol.monto.replaceAll(',','').replaceAll(' ',''),
            pkInfoCharSol.moneda,pkInfoCharSol.insTxtComentario,
            pkInfoCharSol.cuentaDestino);
        break;
        case "operado":
            confirmarAccion();
        break;
        case "rechazado":
         if(fvCat.checkForm()) {
            autorizarRechazar(3, GI("cboCausaRechazo").value);
         }
        break;
    }
}

function autorizarRechazar(opc, motivo) {	 
    vgContenedorDatos = JSON.parse("{}");
    vgContenedorDatos.id = "fun.admon.autorizarRechazarMonetaria";
    vgContenedorDatos.opcion = eval(opc);
    vgContenedorDatos.contrato = eval(GI("insNumContrato").value);
    vgContenedorDatos.folio = eval(GI("insNumFolioInst").value);
    vgContenedorDatos.numEtapa = eval(6);//etapa backofice
    vgContenedorDatos.motivoRechazo = motivo;
    vgContenedorDatos.numUsuario = eval(0);//eval(GI("txtuserId").value)
    
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
    makeAjaxRequest(url, "HTML", validarAutorizarRechazar, null);
}
  
function validarAutorizarRechazar(obj, resultado) { 
    var resp = JSON.parse(resultado);
  
    switch(resp.result) {
        case -1: 
            Swal.fire('Aviso', 'A ocurrido un error',  'warning'); 
        break;
        case 0:
            Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success'); 
            cargaPantallaInstrucciones();
        break;
        case 1: 
            Swal.fire('Aviso', 'No se puede procesar esta instruccion debido a que no cuenta con el estatus correcto',  'warning'); 
        break;
        case 2: 
            Swal.fire('Aviso', 'No se pudo contabilizar',  'warning'); 
        break;
        case 3: 
            Swal.fire('Aviso', 'No existe operacion contable, contacte al Area contable.',  'warning'); 
        break;        
        default:
        Swal.fire('Aviso', 'No existe operacion contable, contacte al Area contable. Operacion '+resp.result,  'warning'); 
        break;
    }
}

function enviaCorreo(parametro1,parametro2,parametro3,parametro4,parametro5) {    
    showWaitLayer();
    var idLink = "linkReporteNew"; 
    var parametros =  new Object;
    parametros.sendToJSP="true";
    parametros.id="devuelveFechaContable";    
    parametros.urlReporte= "/modules/Administracion/Monetarias/EnviarCorreo.jsp?tipo=1&parametro1="+parametro1+
    "&parametro2="+parametro2+"&parametro3="+parametro3+"&parametro4="+parametro4+"&parametro5="+parametro5;
    var url = ctxRoot + "/imprimirReporte.do?json=" +  encodeURIComponent(JSON.stringify(parametros));   
    var link = GI(idLink);
    link.href=url;
    window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");            
    document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }

    Swal.fire('¡Éxito!', 'Operación realizada exitosamente!', 'success');
    hideWaitLayer();
}

function confirmarAccion() {
            // 2. Llamar a Swal.fire dentro de la función
            Swal.fire({
                title: 'Deseas continuar con esta accion?',
                showCancelButton: true,
                confirmButtonText: 'Aceptar',
                cancelButtonText: 'Cancelar'
            }).then((result) => {
            if (result.isConfirmed) {
                autorizarRechazar(2,"");               
            } 
            });
}