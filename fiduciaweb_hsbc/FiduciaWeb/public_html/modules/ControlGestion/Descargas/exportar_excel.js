var rdValue = 0;
function setReporte(objRadio) {
    rdValue = objRadio.value;
}
function doDownload() {
        var datosConsulta = getParameters(GI('frmDatos'));
        datosConsulta.id = "consultaReporte" + rdValue;
			
        var jsonParam = JSON.stringify(datosConsulta);
        GI('jsonExport').value = jsonParam;
        GI('frmExport').submit();
}
