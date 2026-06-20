var cmbFideicomisoTrac = JSON.parse("{}");
var formularioCarga = GI('frmDatos');
var frameCarga = GI('frameUpload');
var objArchivosPlanosParam = JSON.parse("{\"id\":\"conArcPla\"}");

showWaitLayer();

var fechaDefault = new Date();
var opcparam = 0;
var opcprov = 0;

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

function obtCheckOPC() {
    var pos = 0;
    var i = 0;
    var opc = [GI("chkCBSPEI").checked,GI("chkCBMXN").checked,GI("chkCBUSD").checked,GI("chkBSPEI").checked];

    var count = 0;

    for (i = 0;i < opc.length;++i) {
        if (opc[i] == 1) {
            count++;
            pos = i;
            //alert("POS:"+pos+" I="+i);
        }
    }
    //alert("TAM:"+opc.length);
    //alert("OBT:"+opcparam);
    if (count > 1) {
        Swal.fire('Aviso', 'Eliga solo una operacion de carga',  'warning');
        opcparam = null;
    }
    else {
        /* 
         * Casa de Bolsa SPEI               = 1
         * Casa de Bolsa Moneda Nacional    = 2 
         * Casa de Bolsa Dolares            = 3 
         * Contratos Banco SPEI             = 5
        */
        switch (pos) {
            case 0:
                opcparam = 1;//SQL - Casa de Bolsa SPEI
                break;
            case 1:
                opcparam = 2;//SQL - Casa de Bolsa Moneda Nacional
                break;
            case 2:
                opcparam = 3;//SQL - Casa de Bolsa Dolares
                break;
            case 3:
                opcparam = 4;//SQL - Contratos Banco SPEI
                break;
            default :
                opcparam = null;
        }
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
    obtCheckOPC();
    //alert("previo:"+opcparam);
    if (opcparam != null) {
        if (opcparam == 4) {
            if (confirm("¿Esta seguro que desea aplicar?")) {
                var parametrosUrl = {
                    id : 'storeGenArchLayout', opc : opcparam, fecha : GI('txtFechaValor').value, nomArchivo : "GENERAPAGOS.txt"
                }

                var url = ctxRoot + '/executeRef.do?json=' + JSON.stringify(parametrosUrl);
                //alert(url)
                makeAjaxRequest(url, "HTML", funAplicaComprasVentasResp, opcparam);
            }
        }
    }
}

function funAplicaComprasVentasResp(obj, result) {
    /*// Los codigos de error son un numero seguido de un guion y el mensaje de error
  var err = JSON.parse(result).result.split('-');
  //alert(err)
  var errCode = parseInt(err[0], 10);
  var errMsg = err[1];
  alert(errMsg)*/

    var res = JSON.parse(result).RESULTADO;
    if (isDefinedAndNotNull(res)) {
        //alert("Numero:" +eval(res));
        switch (eval(res)) {
            case 0:
                Swal.fire('Aviso', 'Operación exitosa',  'warning');
                document.getElementById("cmdCancelar").click();
                break;
            case 1:
                Swal.fire('Aviso', 'Cargue el archivo correcto antes de Cargar Honorarios!',  'warning');
                break;
            case 5:
                Swal.fire('Aviso', 'La Fecha del Archivo no corresponde con la Fecha del Sistema!',  'warning');
                //var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(objArchivosPlanosParam);
                //makeAjaxRequest(url, "HTML", sugerirNombreArchivoInterfase, null);            
                break;
            case 6:
                Swal.fire('Aviso', 'Faltan DATOS!',  'warning');
                //var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(objArchivosPlanosParam);
                //makeAjaxRequest(url, "HTML", sugerirNombreArchivoInterfase, null);           
                break;
            default :
                Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
        }
    }else{
        Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
    }
    hideWaitLayer();

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