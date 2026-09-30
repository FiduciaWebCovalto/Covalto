var cmbFideicomisoTrac = JSON.parse("{}");
var formularioCarga = GI('frmDatos');
var frameCarga = GI('frameUpload');
var objArchivosPlanosParam = JSON.parse("{\"id\":\"conArcPla\"}");

showWaitLayer();

var fechaDefault = new Date();
var opcparam = 0;

initForms();

Calendar.setup( {
    inputField : "txtFechaValor", button : "txtFechaValor", ifFormat : "%d/%m/%Y", //"%a %e/%b/%Y",format of the input field
    showsTime : false, timeFormat : "24", onUpdate : setFechaCal, disableFunc : isValidDate, date : fechaDefault, weekNumbers : false, cache : true, step : 1
});

function setFechaCal() {
}

function isValidDate(date) {
    var today = new Date();
    if (date > today)
        return true;
    else 
        return false;
}

// Pantalla
var fvMantenimiento = new FormValidator();

fvMantenimiento.setup( {
    formName : "frmDatos", tipoAlert : 1, alertFunction : BaloonAlert, sendObjToAlert : true
});

initForms();
formsLoaded();

function cargaObjetosTipoMovimiento(objRdMovimiento) {
    asignaValueRadio2Master("rdTipoMovimiento", objRdMovimiento);

}

function subirArchivo() {
    if (fvMantenimiento.checkForm()) {
        frameSubmit(document.frameUpload.frmCargaComprasVentas);

    }
}

var nomArchivo = null;

function frameSubmit(forma) {
    nomArchivo = forma.document.getElementById("fileTest").value

    if (nomArchivo == '') {
        Swal.fire('Aviso', 'debe seleccionar un archivo',  'warning');
        return;
    }

    nomArchivo = nomArchivo.split('\\');
    nomArchivo = nomArchivo[nomArchivo.length - 1];

    forma.document.getElementById("Fecha").value = GI("txtFechaValor").value;
    forma.document.getElementById("NombreArchivo").value = nomArchivo;

    forma.submit();
    formularioCarga.cmdAplicar.style.visibility = 'visible';
    //formularioCarga.cmdCargar.style.visibility = 'hidden';
    //formularioCarga.cmdPreview.style.visibility = 'visible';
}

//se genera el preview del archivo de precios a partir de archivos_planos
function generaPreviewArchivo() {
    //formularioCarga.cmdPreview.style.visibility = 'hidden';
    formularioCarga.cmdAplicar.style.visibility = 'visible';
}

//aplicar el precio una vez que se cargÃ³ el preview
function funAplicaComprasVentas() {

    if (confirm("¿Esta seguro que desea aplicar?")) {
        var parametrosUrl = {
            id : 'storeGenArchCheqCont', 
            opc : 2, //1 = Contratos de Inversion 2 = Cuentas de Cheques
            fecha : GI('txtFechaValor').value, 
            nomArchivo : nomArchivo
        }

        var url = ctxRoot + '/executeRef.do?json=' + JSON.stringify(parametrosUrl);
        //alert(url)
        makeAjaxRequest(url, "HTML", funAplicaComprasVentasResp, null);
    }
}

function funAplicaComprasVentasResp(obj, result) {
    // Los codigos de error son un numero seguido de un guion y el mensaje de error
    var err = JSON.parse(result).RESULTADO.split('-');
    //alert(err)
    var errCode = parseInt(err[0], 10);
    var errMsg = err[1];
    alert(errMsg);
    //hideWaitLayer();
}

function resetPantallaCarga() {
    //se limpia el formulario
    RF(formularioCarga);
    nomArchivo = null;
    formularioCarga.cmdCargar.style.visibility = 'visible';
    //se ocultan los botones de preview y ejecucion
    //formularioCarga.cmdPreview.style.visibility = 'hidden';
    formularioCarga.cmdAplicar.style.visibility = 'hidden';
    var srcFrame = frameCarga.src;
    frameCarga.src = srcFrame;
}

resetPantallaCarga();