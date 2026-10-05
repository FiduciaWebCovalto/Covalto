var fechaDefault = new Date();

function setFechaCal(){}

function isValidDate(date) { 
    var today = new Date();
    if(date > today) {
        return true;
    } else {
            return false;
    }
}

Calendar.setup({
    inputField     :    "paramFechaInicial",
    button         :    "paramFechaInicial",
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

Calendar.setup({
    inputField     :    "paramFechaFinal",
    button         :    "paramFechaFinal",
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

var arrTblDat = new Array();
arrTblDat[0] = "folio,50";
arrTblDat[1] = "fechaContable,80";
arrTblDat[2] = "transaccion,50";
arrTblDat[3] = "origen,100";
arrTblDat[4] = "estatus,100";
arrTblDat[5] = "fecha1,80";
arrTblDat[6] = "aprobador,100";
arrTblDat[7] = "fecha2,80";
arrTblDat[8] = "fideicomiso,100";
arrTblDat[9] = "ctam,20";
arrTblDat[10] = "s1,20";
arrTblDat[11] = "s2,20";
arrTblDat[12] = "s3,20";
arrTblDat[13] = "s4,20";
arrTblDat[14] = "s5,20";
arrTblDat[15] = "aux2,20";
arrTblDat[16] = "aux3,20";
arrTblDat[17] = "descripcionContable,100";
arrTblDat[18] = "monto,80";
arrTblDat[19] = "cargo,80";
arrTblDat[20] = "abono,80";
arrTblDat[21] = "descripcionConciliacion,100";

var fv = new FormValidator();

fv.setup({
  formName      : "frmPrincipal",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function consultarBitacora(objBoton, objForm, bool) {
    if(fv.checkForm()) {
        consultar(objBoton, objForm, bool);
    }
}

function clickTabla(pk){
  pkInfo = pk;
}

function limpiar(objForma){
  RF(objForma);
}

function doDownload(objTabla) {
    var rows = objTabla.getElementsByTagName("tr");

    if(rows.length <= 0) {
        Swal.fire('Aviso', 'No se encontraron registros!',  'warning');
    } else {
        var datosConsulta = getParameters(objTabla);
        datosConsulta.id = GA(GI("cmdAceptar"), "ref");
        var jsonParam = JSON.stringify(datosConsulta);
        GI('jsonExport').value = jsonParam;
        GI('frmExport').submit();
    }
}

