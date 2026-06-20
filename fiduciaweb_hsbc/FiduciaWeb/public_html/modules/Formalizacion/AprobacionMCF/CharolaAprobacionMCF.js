//***DEFINICON DE LOS BEANS**************************************************************************************************************
var cat = new Catalogo("mx.com.inscitech.fiducia.domain.Instrucc");

//***VARIABLES GLOBALES******************************************************************************************************************

var parametrosCharola = JSON.parse("{}");
var paramQueryAdmon = JSON.parse("{\"Order\":\"s\"}");

var strIdPK = "insNumContrato,insNumFolioInst,insCveStInstruc,InsNumOper,insTxtComentario";
var arrIdPK = strIdPK.split(",");
var fvCat = new FormValidator();
var opcion = 0;
var pkInfoCharSol = null;
var pkInfoPtoRev = null;

var txtPerfil;
var userId;

var arrTblDatCharSol = new Array();
arrTblDatCharSol[0] = "antNumProspecto,50";
arrTblDatCharSol[1] = "antNomNegocio,300";
arrTblDatCharSol[2] = "antCveTipoNeg,150";

function clickTablaCharSol(pk) {
    pkInfoCharSol = pk;
    cloneObject(pk,cat.getCatalogo());
}
  
var arrTblDatPtoRev = new Array();
arrTblDatPtoRev[0] = "fpurIdPuntorev,50px";
arrTblDatPtoRev[1] = "fpurDescripcion,550px";
arrTblDatPtoRev[2] = "frxoRevCorrecta,100px";
arrTblDatPtoRev[3] = "frxoEstatus,200px";
  
function clickTablaPtoRev(pk) {
    pkInfoPtoRev = pk;
    cloneObject(pk,cat.getCatalogo());
    
    if(pk.frxoObservacion != "null") {
        GI("txtObservaciones").value = pk.frxoObservacion;
    } else {
        GI("txtObservaciones").value = "";
    }
}
var validaExistenciaProyectoConstituido = 
JSON.parse("{\"id\":\"qryValidaConstituido\"}");
function cargaPantallaPuntosRevision() {

    validaExistenciaProyectoConstituido.proyecto = pkInfoCharSol.antNumProspecto;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validaExistenciaProyectoConstituido);
    makeAjaxRequest(url, "HTML", validaModificaConstituidoMR, null); 

}
function validaModificaConstituidoMR(obj, result) {
    var objResult = JSON.parse(result);
    const existe=objResult[0].existe;
    if(existe==1)
        Swal.fire('error', 'El Proyecto ya se constituyo',  'error');
    else{
        if(isDefinedAndNotNull(pkInfoCharSol)) {
            showWaitLayer();
            var urlCliente = ctxRoot + "/modules/Formalizacion/AprobacionMCF/PuntosRevisionSolicitudesAdmon.do";
            makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
        } else {
            Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
        }   
    }
}
    
function despliegaPantalla(obj, result) {
    GI("dvPantalla").innerHTML = result;
    fvCat.setup({
        formName      : "frmPtosSol",
        tipoAlert     : 1,
        alertFunction : BaloonAlert,
        sendObjToAlert: true
    });
    GI("antNumProspecto").value = pkInfoCharSol.antNumProspecto;
    GI("antNomNegocio").value = pkInfoCharSol.antNomNegocio;
    GI("antCveTipoNeg").value = pkInfoCharSol.antCveTipoNeg;
    
    deshabilitaPK("antNumProspecto,antNomNegocio,antCveTipoNeg".split(","));
    
    cargaTablaParaPtosRev();
}

function cargaTablaParaPtosRev() {
    var vgObjqryllenaTablaAdmon = JSON.parse("{}");
    vgObjqryllenaTablaAdmon.id = "qry.formalizacion.dictaminacion.aprobacionMCF.puntosRevision";
    vgObjqryllenaTablaAdmon.etapa = 11;
    vgObjqryllenaTablaAdmon.numOperacion = 90000;
    vgObjqryllenaTablaAdmon.prospecto = pkInfoCharSol.antNumProspecto;
    vgObjqryllenaTablaAdmon.folio = pkInfoCharSol.antNumProspecto;
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(vgObjqryllenaTablaAdmon);
    makeAjaxRequest(url, "HTML", resultadoConsulta, null);
}
  
function resultadoConsulta(obj, result) {
    var resultado = JSON.parse(result);
    if(isDefinedAndNotNull(resultado) && resultado.length > 0){
        loadTableElement(GI("tblRegPtosRev"), result);
    } else {
        Swal.fire('Aviso', 'No existen registros para estos criterios de búsqueda',  'warning');
    } 
    hideWaitLayer();
}  

function rowPuntoRevision(row) {
    var pk = JSON.parse("{" + GA(row, "valorItem") + "}");
    
    var id = "cboCumple" + pk.fpurIdPuntorev;
    row.children[3].innerHTML = GI("divCumple").innerHTML.replace("cboCumple", id);
    if(trim(pk.frxoRevCorrecta) != "null") {
        GI(id).value = trim(pk.frxoRevCorrecta);
    } else {
        GI(id).value = "S";
    }
    show(id);
}

function guardarRevision() {
    if(fvCat.checkForm()) {
        if(isDefinedAndNotNull(pkInfoPtoRev)) {
            var vgContenedorDatos = JSON.parse("{}");
            vgContenedorDatos.id = "upd.formalizacion.dictaminacion.aprobacionMCF.puntosRevision";
            vgContenedorDatos.opcion = 1;
            vgContenedorDatos.contrato = pkInfoCharSol.antNumProspecto;
            vgContenedorDatos.folio = pkInfoCharSol.antNumProspecto;
            vgContenedorDatos.numEtapa = GI("paramIdEtapa").value;
            vgContenedorDatos.numOper = 90000;
            vgContenedorDatos.idEtapa = GI("paramIdEtapa").value;
            vgContenedorDatos.idPtoRev = pkInfoPtoRev.fpurIdPuntorev;
            vgContenedorDatos.revCorrecta = GI("cboCumple" + pkInfoPtoRev.fpurIdPuntorev).value;
            vgContenedorDatos.observaciones = GI("txtObservaciones").value;
            vgContenedorDatos.numUsuario = GI("txtuserId").value;
            vgContenedorDatos.firma = 0;
            
            showWaitLayer();
            
            var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
            makeAjaxRequest(url, "HTML", validarGuardadoRevision, null);
        } else {
            Swal.fire('Aviso', 'Selecciona un punto de revision de la tabla',  'warning');
        }
    }
}

function validarGuardadoRevision(obj, result){
    var resultado= JSON.parse(result);
    var res=resultado;
    if(res.result == 0) {
        Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
        cargaTablaParaPtosRev();
        GI("txtObservaciones").value = "";     
    } else {
        Swal.fire('Aviso', 'Ocurrio un error',  'warning')}
    hideWaitLayer();
  }


function autorizaRechaza(opc) {	 
    if(isDefinedAndNotNull(pkInfoCharSol)) { 
        var vgContenedorDatos = JSON.parse("{}");
        vgContenedorDatos.id = "upd.formalizacion.dictaminacion.aprobacionMCF";
        vgContenedorDatos.opcion = opc
        vgContenedorDatos.numEtapa = GI("paramIdEtapa").value;
        vgContenedorDatos.contrato = pkInfoCharSol.antNumProspecto;
        vgContenedorDatos.folio = pkInfoCharSol.antNumProspecto;
        vgContenedorDatos.numOper = 90000;
        vgContenedorDatos.numUsuario = GI("txtuserId").value;
        
        showWaitLayer();
            
        var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
        makeAjaxRequest(url, "HTML", ejecutaAutorizaRechaza, opc);
    } else {
        Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
    }
}
  
function ejecutaAutorizaRechaza(obj, resultado) { 
    var resp = JSON.parse(resultado);
    var r = resp.result
    
    switch(r) {
        case -1: 
            Swal.fire('Aviso', 'Ocurrio un error',  'warning'); 
        break;
        case 0:
            Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
            enviaCorreoWorkFlowProyecto("AREA DE CONTRATO DE NEGOCIO",pkInfoCharSol.antNumProspecto,
            "PROYECTO DE NEGOCIO","ETAPA DE PROYECTO CONCLUIDA, LISTA PARA EVALUACION DE COMITE DE ACEPTACION.");
            cargaPantallaAprobacionMCF();
        break;
        case 1: 
            Swal.fire('Aviso', 'No se puede procesar debido a que no se han evaluado todos los puntos de revision',  'warning'); 
        break;
        case 2: 
            Swal.fire('Aviso', 'No se puede autorizar debido a que alguno de de los puntos de revision es incorrecto',  'warning'); 
        break;
        case 3: 
            Swal.fire('Aviso', 'No se puede rechazar debido a que todos los puntos de revision son correctos',  'warning'); 
        break;
    }
    hideWaitLayer();
}

function cargaPantallaAprobacionMCF() {
    onButtonClickPestania("Formalizacion.AprobacionMCF.CharolaAprobacionMCF","");
    hideWaitLayer();
}