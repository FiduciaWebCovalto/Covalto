var fvReportes = new FormValidator();
var cmbCtaChequesParam = JSON.parse("{\"fideicomiso\":-1,\"tipo\":-1,\"orden\":\"s\"}");
var cmbContratoInversionParam = JSON.parse("{\"fideicomiso\":-1}");

var cmbScta = JSON.parse("{\"Fideicomiso\":0}");
var cmbCtoInver = JSON.parse("{\"Fideicomiso\":0}");

fvReportes.setup( {
    formName : "frmReportes", tipoAlert : 1, alertFunction : BaloonAlert, sendObjToAlert : true
});

var fechaDefault = new Date();

function setFechaCal() {
    var fecha;
    if (isDefinedAndNotNull(GI("Fecha"))) {
        fecha = GI("Fecha").value.split("/");

        GI("paramDia").value = fecha[0];
        GI("paramMes").value = fecha[1];
        GI("paramAno").value = fecha[2];
    }
    else if (isDefinedAndNotNull(GI("paramFecha"))) {
        fecha = GI("paramFecha").value.split("/");
        GI("paramDia").value = fecha[0];
        GI("paramMes").value = fecha[1];
        GI("paramAno").value = fecha[2];
    }
    else if ((isDefinedAndNotNull(GI("paramFechaInical")) && isDefinedAndNotNull(GI("paramFechaFinal"))) || (isDefinedAndNotNull(GI("paramFechaUnica")))) {
        // nada
    }
}

function validaFecha() {
    if (isDefinedAndNotNull(GI("Fecha")) && GI("paramEstructura").value == 3)
        Swal.fire('Aviso', 'La Fecha es un campo Obligatorio',  'warning');
}

function isValidDate(date) {
    var today = new Date();
    if (date > today)
        return true;
    else 
        return false;
}

function cargaCalendario(idCalendario) {
    Calendar.setup( {
        inputField : idCalendario, // id of the input field
        button : idCalendario, ifFormat : "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
        showsTime : false, timeFormat : "24", onUpdate : setFechaCal, disableFunc : isValidDate, date : fechaDefault, weekNumbers : false, cache : true, step : 1
    });
}

// calendarios -----------
var repSelected;// nombre del reporte  seleccionado
function cargaReporte(reporte) {
    var objReporte = GI("dvReporte");
    var urlReportes = ctxRoot + "/modules/Contabilidad/Reportes/";
    if (reporte == "-1") {
        Swal.fire('warning',"Se requiere que seleccione un reporte", 'warning');
        doInnerHTML(objReporte, "");
    }
    else {
        LDSCR(urlReportes + reporte + ".do", objReporte, pantallaCargada);
    }
    repSelected = reporte;

    if (reporte == "EstadoCuenta") {
        cargaEdoCue();
    }

}

function pantallaCargada() {
    hideWaitLayer();
    if (repSelected == "PosicionporPeriodo") {
        cargaPosPer();
    }

    if (repSelected == "BalanceGeneralCons") {
        cargaEjecutivos();
    }

    if (isDefinedAndNotNull(GI("Fecha")))
        try {
            cargaCalendario("Fecha");
        }
        catch (ex) {
        }
    else if (isDefinedAndNotNull(GI("paramFecha")))
        try {
            cargaCalendario("paramFecha");
        }
        catch (ex) {
        }
    else if (isDefinedAndNotNull(GI("paramFechaDel")) && isDefinedAndNotNull(GI("paramFechaAl")))
        try {
            cargaCalendario("paramFechaDel");
            cargaCalendario("paramFechaAl");
        }
        catch (ex) {
        }
    else if (isDefinedAndNotNull(GI("paramFechaInicial")) && isDefinedAndNotNull(GI("paramFechaFinal")))
        try {
            cargaCalendario("paramFechaInicial");
            cargaCalendario("paramFechaFinal");
        }
        catch (ex) {
        }
    else if (isDefinedAndNotNull(GI("paramFechaIni")) && isDefinedAndNotNull(GI("paramFechaFin")))
        try {
            cargaCalendario("paramFechaIni");
            cargaCalendario("paramFechaFin");
        }
        catch (ex) {
        }
    else if (isDefinedAndNotNull(GI("paramFechaUnica")))
        try {
            cargaCalendario("paramFechaUnica");
        }
        catch (ex) {
        }
}

var generaEdoCtaURL = ctxRoot + "/edocta/resources/services/edoCta";

function ejecutaEdoCtaCI() {
    showWaitLayer();

    var urlFinal = generaEdoCtaURL + "?fisoID=" + GI("paramFideicomiso").value + "&date=" + GI("paramFechaUnica").value;
    alert(urlFinal)
    $.post(urlFinal, 
    {
    },
    function (data) {
        $.ajax( {
            url : urlFinal, type : 'PUT', success : function (result) {
                hideWaitLayer();
                doDownloadEdoCta();
            }
        });
    });
}

function validaPrecios() {
    date = GI("paramFechaUnica").value;
    var fechaEnPartes = date.split('/');
    var objPreciosM = JSON.parse("{\"id\":\"validaPEC\"}");
    objPreciosM.anio = fechaEnPartes[2];
    objPreciosM.mes = fechaEnPartes[1];
    objPreciosM.dia = fechaEnPartes[0];
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(objPreciosM);
    makeAjaxRequest(url, "HTML", consultaControlPrecios, null);
}

function consultaControlPrecios(obj, result) {
    resultado = JSON.parse(result);
    if (resultado[0].tienePrecios == 0) {
        Swal.fire('Aviso', 
        'No hay vector de precios para la fecha seleccionada (' + 
        GI("paramFechaUnica").value + '), verifique.','warning');
    }
    else {
        ejecutaEdoCtaCI();
    }

}

function doDownloadEdoCta() {
    var link = GI('linkEdoCtaPDF');
    link.href = generaEdoCtaURL + "?fisoID=" + GI("paramFideicomiso").value;
    imprimirURLAPDF(url);
    //link.click();
}

function ejecutaReporte() {
    var bandera = 1;

    if (isDefinedAndNotNull(GI("paramFiso"))) {
        if (GI("paramFiso").value == "" && GI("paramEstructura").value == 3) {
            Swal.fire('Aviso', 'El Fideicomiso es un campo Obligatorio',  'warning');
            bandera = 0;
        }
    }

    if (isDefinedAndNotNull(GI("Fecha"))) {
        if (GI("Fecha").value == "" && GI("paramEstructura").value == 3) {
            Swal.fire('Aviso', 'La Fecha es un campo Obligatorio',  'warning');
            bandera = 0;
        }
    }

    if (isDefinedAndNotNull(GI("paramFecha"))) {
        if (GI("paramFecha").value == "" && GI("paramEstructura").value == 3) {
            Swal.fire('Aviso', 'La Fecha es un campo Obligatorio',  'warning');
        }
    }

    if (fvReportes.checkForm() && bandera == 1) {

        if (GI("slcReportes").value == "ContratosInversion") {
            validaPrecios();
            /*ejecutaEdoCtaCI();*/
            return;
        }

        var parametros = getParameters(GI("frmReportes"));

        if (!isDefinedAndNotNull(parametros.sendToJSP) && isDefinedAndNotNull(GI("urlReporte"))
        &&GI("refSP").value!="repEdoCuentaPeriodico") {

            var url = GI("urlReporte").value;

            for (k in parametros) {
                url += k + "=" + parametros[k] + "&";
            }

            url += "web=0";
            var link = GI("linkReporteNew");

            link.href = url;
            //link.click();
            imprimirURLAPDF(url);
            return;
        }else if(GI("refSP").value=="repEdoCuentaPeriodico")//aplica para estado de cuenta
        {
            eval("parametros.Tipo = 2");
            eval("parametros.Fideicomiso = "+GI("paramFiso").value);
            eval("parametros.FechaInicial = '" + GI("paramFechaInicial").value + "'");
            eval("parametros.FechaFinal = '" + GI("paramFechaFinal").value + "'");
            eval("parametros.CveNiv1 = 'CveNiv1'");
            eval("parametros.CveNiv2 = ''");
            eval("parametros.CveNiv3 = ''");
            eval("parametros.NomNiv1 = 'NomNiv1'");
            eval("parametros.NomNiv2 = ''");
            eval("parametros.NomNiv3 = ''");
            eval("parametros.NumNiveles = 0"); 
        }

        if (isDefinedAndNotNull(GI("template")))
            parametros.template = GI("template").value;
        if (isDefinedAndNotNull(GI("nombreReporte")))
            parametros.nombreReporte = GI("nombreReporte").value;

        if (isDefinedAndNotNull(GI("refSP"))) {
            parametros.id = GI("refSP").value;
            var url = ctxRoot + "/execRefReporte.do?json=" + JSON.stringify(parametros);
        }
        else {
            validaEjecucionReporte(parametros, "{\"RESULTADO\":0}");
        }

        makeAjaxRequest(url, "HTML", validaEjecucionReporte, parametros);

    }
    else {

    }
}

function validaEjecucionReporte(obj, result) {
    //alert(result)
    var objResult = JSON.parse(result);
    var resultado =  - 1;
    var Paramadicionales="";
    if (isDefinedAndNotNull(objResult.RESULTADO))
        resultado = objResult.RESULTADO;
    else if (isDefinedAndNotNull(objResult.codigoError))
        resultado = objResult.codigoError
    if (resultado == 0) {
        var url;
        // Ejecucion OK
        var idLink = "linkReporte";
        if (isDefinedAndNotNull(obj.sendToJSP))
            idLink = "linkReporteNew";
        obj.id = GI("refQry").value;
        if( GI("refQry").value=="getAuxiliarporCuenta")
            Paramadicionales="&PeriodoInicial="+GI("paramFechaDel").value+"&PeriodoFinal="+GI("paramFechaAl").value;
        if( GI("refSP").value=="repEdoCuentaPeriodico"){    
         var parametrosUrl = new Object;
         parametrosUrl.sendToJSP="true";
         parametrosUrl.urlReporte="/jsp/Reportes/Contabilidad/EstadoCuenta.jsp"
         parametrosUrl.id="getDatEdoCuentaPeriodico";
         parametrosUrl.Fiso= GI("paramFiso").value;
         url = ctxRoot + "/imprimirReporte.do?json=" + encodeURIComponent(JSON.stringify(parametrosUrl))+Paramadicionales;     
        }
        else
            url = ctxRoot + "/imprimirReporte.do?json=" + encodeURIComponent(JSON.stringify(obj))+Paramadicionales;
        var link = GI(idLink);
        link.href = url;
        imprimirURLAPDF(url);
        hideWaitLayer();
    }
    else {
        hideWaitLayer();
        if (resultado == 1) {
            // Error
        }
        else {
            // Error ORACLE
        }
    }
    hideWaitLayer();
}

function setTipoReporte(tipo) {
    GI("paramtipoReporte").value = tipo;

    if (tipo == "MSA")
        GI("paramEstructura").value = 2;
    else if (tipo == "H")
        GI("paramEstructura").value = 3;
    else 
        GI("paramEstructura").value = 1;
}

var s_fideicomiso = "";
var s_tipo = "";
// -------------- Estado Cuenta-------------------------------------
function cargaEdoCue() {
    loadElement(GI("cmbCtaCheques"));
}

function valorFide(parametro) {
    s_fideicomiso = parametro;

}

function valorTipo(parametro) {
    s_tipo = parametro;

    if (s_fideicomiso != "") {
        cargaCombo(s_fideicomiso, s_tipo);
        GI("cmbCtaCheques").style.visibility = "visible";
    }
    else {
        Swal.fire('Aviso', 'Seleccione Fideicomiso',  'warning');
    }
}

function cargaCombo(s_fide, s_tip) {
    cmbCtaChequesParam.fideicomiso = eval(s_fide);
    cmbCtaChequesParam.tipo = eval(s_tip);
    cmbCtaChequesParam.orden = 's';

    loadElement(GI("cmbCtaCheques"));
}

function cargaComboCto(item) {
    GI('cmbContratoInversion').selectedIndex = 0;
    cmbContratoInversionParam.fideicomiso = eval(item.value);
    cmbContratoInversionParam.order = 's';

    loadElement(GI("cmbContratoInversion"));
}

function cargaCuenta(valor) {
    GI("paramCtaCheques").value = ((valor != "-1") ? valor : "");
}

//--------------------------------contratos inversion

// -------------- Posición por contrato-------------------------------------
function cargaPosPer() {
    loadElement(GI("paramFideicomiso"));
}

function cargaCmbPosporPer(objCmb) {
    if (objCmb == GI("paramFideicomiso")) {
        cmbScta = JSON.parse("{\"Fideicomiso\":" + objCmb.value + "}");
        loadElement(GI("paramSubcuenta"));
    }
    else if (objCmb == GI("paramSubcuenta")) {
        cmbCtoInver = JSON.parse("{\"Fideicomiso\":" + GI("paramFideicomiso").value + ",\"SubCuenta\":" + objCmb.value + "}");
        loadElement(GI("paramCtoInver"));
    }

}

function cargaEjecutivos() {
    loadElement(GI("paramEjecutivoFirma"));
}
/*
const selectReporte = document.getElementById('slcReportes');
selectReporte.addEventListener('change', function(e) {
            // 3. Obtener el valor seleccionado
            const reporte = e.target.value;
            var objReporte = GI("dvReporte");
            var urlReportes = ctxRoot + "/modules/Contabilidad/Reportes/";
            if (reporte == "-1") {
            Swal.fire('warning',"Se requiere que seleccione un reporte", 'warning');
            doInnerHTML(objReporte, "");
            }
            else {
            LDSCR(urlReportes + reporte + ".do", objReporte, pantallaCargada);
            }
            repSelected = reporte;
            
            if (reporte == "EstadoCuenta") {
            cargaEdoCue();
            }
            
        });*/