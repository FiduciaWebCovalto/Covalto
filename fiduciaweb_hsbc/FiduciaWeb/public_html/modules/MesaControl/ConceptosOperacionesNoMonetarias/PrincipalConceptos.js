var catConceptos = new Catalogo("mx.com.inscitech.fiducia.domain.FConceptosIntrucccionesNoMonetarias");

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;
var nivelPantalla;

var clavesCombo38 = JSON.parse("{\"llaveClave\":38}");
var cmbTipoDato = JSON.parse("{\"Indice\":570,\"orderDescripcion\":\"s\"}");
var cmbCriterio = JSON.parse("{\"Indice\":581,\"orderDescripcion\":\"s\"}");
var cmbSecuencias = JSON.parse("{\"Indice\":582,\"orderDescripcion\":\"s\"}");
var cmbStatus = JSON.parse("{\"llaveClave\":31}");

var pkInfo = null;
var fvCatConceptos = new FormValidator();
var strIdPK = "ftopNumOper,conpIdConcepto";

initForms();

var tablaConceptosData = new Array();
tablaConceptosData[0] = "ftopNumOper,150px";
tablaConceptosData[1] = "conpIdConcepto,100px";
tablaConceptosData[2] = "conpNombre,200px";
tablaConceptosData[3] = "conpBaseString,150px";
tablaConceptosData[4] = "conpEstatus,100px";

function clickTabla(pk, tipoPantalla) {
    pkInfo = pk;
    cloneObject(pk, catConceptos.getCatalogo());
}

//segunda pantalla
function cargaMantenimientoConceptos(tipoPantalla) {
    operacion = tipoPantalla;
    var urlCliente = ctxRoot + "/modules/MesaControl/ConceptosOperacionesNoMonetarias/MantenimientoConceptos.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoConceptos, null);
}

function despliegaPantallaMantenimientoConceptos(obj, result) {
    GI("dvPantalla").innerHTML = result;
    initForms();

    fvCatConceptos.setup( {
        formName : "frmMantenimientoConceptos", tipoAlert : 1, alertFunction : BaloonAlert, sendObjToAlert : true
    });

    if (operacion != CONSULTAR) {
        muestraObjs("cmdAceptar,cmdCancelar");
    }
    else {
        SA(GI("cmdCancelar"), "value", "Regresar");
        muestraObjs("cmdCancelar");
    }

}

function loadCatalogo() {
    catConceptos.setOnUpdate(catLoaded);

    if (operacion == MODIFICAR || operacion == CONSULTAR) {
        //SI NO ES UN REGISTRO NUEVO
        catConceptos.buscaCatalogoPK(false);// MANDAR LLAMAR EL MAPEO CORRESPONDIENTE CON CADA CAMPO
        if (operacion == MODIFICAR) {
            //SI ES UNA MODIFICACION
            deshabilitaPK(strIdPK.split(","));
        }
        else if (operacion == CONSULTAR) {
            deshabilitaObjetos(GI("frmMantenimientoConceptos"));

        }
    }
}

function catLoaded() {
    formsLoaded();
    GI("conpBaseCheck").checked = GI("conpBase").value == 1;
}

function AltaOModificaInfo() {
    GI("conpBase").value = GI("conpBaseCheck").checked ? 1 : 0;

    catConceptos.setOnUpdate(operacionExitosa);
    if (operacion == ALTA && fvCatConceptos.checkForm())//Se trata de una alta
    {
        showWaitLayer();
        catConceptos.altaCatalogo();
    }
    else if (operacion == MODIFICAR && fvCatConceptos.checkForm())//Se trata de una modificacion
    {
        showWaitLayer();
        catConceptos.modificaCatalogo();
    }
}

function eliminarRegistro() {
    if (pkInfo == null)
        Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
    else {
        catConceptos.setOnUpdate(operacionExitosa);
        showWaitLayer();
        eliminaCatalogo(catConceptos);
    }
}

function operacionExitosa() {
    cargaPrincipalConceptos();
    hideWaitLayer();
}

function cargaPrincipalConceptos() {
    onButtonClickPestania('MesaControl.ConceptosOperacionesNoMonetarias.PrincipalConceptos', '')
    hideWaitLayer();
}

function consultaNextIdConcepto() {
    var url = ctxRoot + "/getRef.do?json={\"id\":\"nextIdConceptosOperacionesNoMonetarias\",\"NumOperacion\":\"" + GI('ftopNumOper').value + "\"}";

    makeAjaxRequest(url, "HTML", recuperaNextIdConcepto, null);
}

function recuperaNextIdConcepto(obj, result) {
    var resultado = JSON.parse(result)[0];
    GI('conpIdConcepto').value = parseInt(resultado.nextId, 0);
}