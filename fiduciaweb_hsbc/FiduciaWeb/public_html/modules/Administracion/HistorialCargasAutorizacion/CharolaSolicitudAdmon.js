//***DEFINICON DE LOS BEANS**************************************************************************************************************
var cat = new Catalogo("mx.com.inscitech.fiducia.domain.Instrucc");

//***VARIABLES GLOBALES******************************************************************************************************************

var parametrosCharola = JSON.parse("{}");
parametrosCharola.idEtapa = GI("paramIdEtapa").value;
parametrosCharola.idTipoSolicitud = GI("paramIdTipoSolicitud").value;
parametrosCharola.tipoSolicitud = GI("paramTipoSolicitud").value;

var paramsQryDocumentsCbo;
var paramFideicomiso;
var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var clavesCombo638 = JSON.parse("{\"llaveClave\":638}");
var clavesCombo1075 = JSON.parse("{\"llaveClave\":1075}");
var paramPerfil = JSON.parse("{\"orderPerfil\":\"s\"}");
var paramQueryAdmon = JSON.parse("{\"Order\":\"s\"}");
var asignaPerfil = JSON.parse("{\"numEtapa\":\""+GI("paramIdEtapa").value+"\"}");

var vgFunPtoRev = 1;
var vgFunDoc = 2;
var vgFunAutorizar = 3;
var vgFunRechazar = 4;
var vgFunSubClasifica = 5;
var vgFunDocFirmado = 6;

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
arrTblDatCharSol[0] = "insNumContrato,100px";
arrTblDatCharSol[1] = "ftopNombreTipoper,200px";
arrTblDatCharSol[2] = "fbisFechaIni,100px";
arrTblDatCharSol[3] = "insCveStInstruc,100px";
  
function clickTablaCharSol(pk) {
    pkInfoCharSol = pk;
}
  
var arrTblDatPtoRev = new Array();
arrTblDatPtoRev[0] = "fpurIdPuntorev,50px";
arrTblDatPtoRev[1] = "fpurDescripcion,500px";
arrTblDatPtoRev[2] = "frxoRevCorrecta,50px";
arrTblDatPtoRev[3] = "frxoCausaRechazo,400px";
arrTblDatPtoRev[4] = "frxoObservacion,1px";
arrTblDatPtoRev[5] = "frxoEstatus,200px";
  
function clickTablaPtoRev(pk) {
    pkInfoPtoRev = pk;
    
    if(pk.frxoObservacion != "null") {
        GI("txtObservacionesGlobal").value = pk.frxoObservacion;
    } else {
        GI("txtObservacionesGlobal").value = GI("txtObservaciones" + pkInfoPtoRev.fpurIdPuntorev).value;
    }
    enableElement(GI("txtObservacionesGlobal"));
}

///////////////////////////////////////////////////////////////////////FUNCIONALIDAD DEL MODULO////////////////////////////////////////////////////////////////////
//***FUNCIONALIDAD BOTONES*********************************************************************************************************************
function funcionDelBoton(opc) {
    if(isDefinedAndNotNull(pkInfoCharSol)) {
        var qryObtenFecha=JSON.parse("{\"id\":\"obtenFecha\"}");
        var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(qryObtenFecha);
        makeAjaxRequest(url, "HTML", funcObtenFecha, opc);
    } else {
        Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
    }
}
  
 function funcObtenFecha(obj, result) {
    var resultado = JSON.parse(result)[0];
    
    vgFecIni = resultado.fecha;
    vgFecFin = resultado.fecha;
    
    var params = new Object();
    
    params.paramIdEtapa = GI("paramIdEtapa").value;
    params.paramIdTipoSolicitud = GI("paramIdTipoSolicitud").value;
    params.paramTipoSolicitud = GI("paramTipoSolicitud").value;
    params.paramIdEtapaOrigen = GI("paramIdEtapaOrigen").value;
    
    var urlCliente = ctxRoot + "/modules/Administracion/HistorialCargasAutorizacion/PuntosRevisionSolicitudesAdmon.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, params);
}
    
function despliegaPantalla(obj, result) {
    GI("dvPantalla").innerHTML = result;
    
    GI("paramIdEtapa").value = obj.paramIdEtapa;
    GI("paramIdTipoSolicitud").value = obj.paramIdTipoSolicitud;
    GI("paramTipoSolicitud").value = obj.paramTipoSolicitud;
    GI("paramIdEtapaOrigen").value = obj.paramIdEtapaOrigen;
    
    //Agregando la funcionalidad del required
    fvCat.setup({
        formName      : "frmPtosSol",
        tipoAlert     : 1,
        alertFunction : BaloonAlert,
        sendObjToAlert: true
    });
    setValuesFormObject(pkInfoCharSol);
    
    initForms();
}            
    
  //***funciones auxiliares****************************************************************************************
function verNomFiso(){
    consultaNombreFideicomiso('nomFideicomiso',GI("paramContrato"));
}
  
function cargaTablaParaPtosRev() {
    vgContenedorDatos = null;
    vgContenedorDatos = new Object();
    vgContenedorDatos.tipo = 1;
    vgContenedorDatos.perfil = txtPerfil;
    vgContenedorDatos.numOper = pkInfoCharSol.insNumOper;
    vgContenedorDatos.fiso = pkInfoCharSol.insNumContrato;
    vgContenedorDatos.numfolio = pkInfoCharSol.insNumFolioInst;
    vgContenedorDatos.documento = 0;
    despliegaTabla(GI("tblRegPtosRev"), vgContenedorDatos);
}
  
function despliegaTabla(tabla,obj){
    vgObjqryllenaTablaAdmon=JSON.parse("{\"id\":\"qry.juridico.puntosRevision\"}");
    vgObjqryllenaTablaAdmon.tipo=eval(obj.tipo);
    vgObjqryllenaTablaAdmon.numEtapa= parametrosCharola.idEtapa;
    vgObjqryllenaTablaAdmon.numOper=obj.numOper;
    vgObjqryllenaTablaAdmon.fiso=eval(obj.fiso);
    vgObjqryllenaTablaAdmon.numfolio=eval(obj.numfolio);
    vgObjqryllenaTablaAdmon.documento=eval(obj.documento);
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(vgObjqryllenaTablaAdmon);
    makeAjaxRequest(url, "HTML", resultadoConsulta, tabla);
}
  
function resultadoConsulta(objTabla, result) {
    var resultado = JSON.parse(result);
    if(isDefinedAndNotNull(resultado) && resultado.length > 0){
        loadTableElement(objTabla, result);
        hideWaitLayer();
    } else {
        Swal.fire('Aviso', 'No existen registros para estos criterios de búsqueda',  'warning');
        cargaPantallaInstrucciones();
        hideWaitLayer();
    } 
}
  
function ejecutaFuncion(tp, result) {
    var resultado= JSON.parse(result);
    var res=resultado;
    if(res.result==0) {
        if(tp==1) {
            Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
            cargaTablaParaPtosRev();
            GI("txtObservacionesGlobal").value = "";
        } else if(tp == 0) {
            // no hace nada para guardar el grupo de puntos de revision
        } else {
           Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
           cargaTablaParaDocumentos();
        }
    } else if(res.result==1) {
        Swal.fire('Aviso', 'No se puede autorizar debido a que no todos los puntos de revisión fueron correctos',  'warning');
    } else if(res.result==2) {
        Swal.fire('Aviso', 'No se puede autorizar debido a que no todos los puntos de revisión de los documentos fueron correctos',  'warning');
    } else if(res.result==3) {
        Swal.fire('Aviso', 'No se puede rechazar una solicitud con todos los puntos de revisión correctos',  'warning');      
    } else if(res.result==4) {
        Swal.fire('Aviso', 'No se puede autorizar debido a que faltan otras Areas por autorizar la Solicitud.',  'warning');      
    } else {
        Swal.fire('Aviso', 'Ocurrio un error al tratar de modificar el valor',  'warning')}
    hideWaitLayer();
}
  
 
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
function autorizaRechaza(opc) {	 
    if(isDefinedAndNotNull(pkInfoCharSol)) { 
        vgContenedorDatos=null;
        vgContenedorDatos=JSON.parse("{\"id\":\"fun.juridico.aceptarRechazarCharola\"}");
        vgContenedorDatos.opcion=eval(opc);
        vgContenedorDatos.numEtapa= parametrosCharola.idEtapa ;
        vgContenedorDatos.contrato=eval(pkInfoCharSol.insNumContrato);
        vgContenedorDatos.folio=eval(pkInfoCharSol.insNumFolioInst);
        vgContenedorDatos.numOper=pkInfoCharSol.insNumOper;
        vgContenedorDatos.numUsuario=eval(GI("txtuserId").value)
        
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
            Swal.fire('Aviso', 'A ocurrido un error',  'warning'); 
        break;
        case 0:
            Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success'); 
            cargaPantallaInstrucciones();
        break;
        case 1: 
            Swal.fire('Aviso', 'No se puede procesar esta instruccion debido a que no se han evaluado todos sus puntos de revision',  'warning'); 
        break;
        case 2: 
            Swal.fire('Aviso', 'No se puede autorizar esta instruccion debido a que alguno de sus documentos tiene sus puntos de revision incorrectos',  'warning'); 
        break;
        case 3: 
            Swal.fire('Aviso', 'No se puede rechazar esta instruccion, favor de verificar sus puntos de revision',  'warning'); 
        break;
        case 5: 
            Swal.fire('Aviso', 'No se puede autorizar esta instruccion, favor de verificar sus puntos de revision',  'warning'); 
        break;
        case 6: 
            Swal.fire('Aviso', 'No se puede dar por incompleta esta instruccion, favor de verificar sus puntos de revision',  'warning'); 
        break;
        case 7: 
            Swal.fire('Aviso', 'No se puede pausar el tiempo de garantia de esta instruccion debido a que ya tuvo un evento de revision',  'warning'); 
        break;
    }
}

var puntosRevision = new Array();
function rowPuntoRevision(row) {
    var pk = JSON.parse("{" + GA(row, "valorItem") + "}");
    puntosRevision.push(pk);
    
    var id = "cboCumple" + pk.fpurIdPuntorev;
    row.children[3].innerHTML = GI("divCumple").innerHTML.replace("cboCumple", id).replace("pk", pk.fpurIdPuntorev);
    if(trim(pk.frxoRevCorrecta) != "null") {
        GI(id).value = trim(pk.frxoRevCorrecta);
    } else {
        GI(id).value = "S";
    }
    show(id);
    
    id = "cboCausaRechazo" + pk.fpurIdPuntorev;
    row.children[4].innerHTML = GI("divCausaRechazo").innerHTML.replace("cboCausaRechazo", id);
    if(trim(pk.frxoCausaRechazo) != "null") {
        GI(id).value = trim(pk.frxoCausaRechazo);
    } else {
        GI(id).value = "-1";
    }
    show(id);
        
    id = "txtObservaciones" + pk.fpurIdPuntorev;
    row.children[5].innerHTML = GI("divObservaciones").innerHTML.replace("txtObservaciones", id);
    if(trim(pk.frxoObservacion) != "null") {
        GI(id).value = trim(pk.frxoObservacion);
    } else {
        GI(id).value = "";
    }
}

function aplicaReglasCumple() {
    var id = pkInfoPtoRev.fpurIdPuntorev;
    if(GI("cboCumple" + id).value == "S") {
        GI("cboCausaRechazo" + id).value = "-1";
        disableElement(GI("cboCausaRechazo" + id));
        RA(GI("cboCausaRechazo" + id), "required");
    } else {
        GI("cboCausaRechazo" + id).value = "-1";
        enableElement(GI("cboCausaRechazo" + id));
        SA(GI("cboCausaRechazo" + id), "required", "required");
    }
}

function setObservaciones(obj) {
    var id = pkInfoPtoRev.fpurIdPuntorev;
    GI("txtObservaciones" + id).value = obj.value;
}

function guardarRevisiones() {
    var tp = 1;
    var fin = 0;
    if(fvCat.checkForm()) {
        for(var i = 0; i < puntosRevision.length; i++) {
            var puntoRevision = puntosRevision[i];
            
            vgContenedorDatos = JSON.parse("{}");
            vgContenedorDatos.id = "fun.juridico.aceptarRechazarPtosRev";
            vgContenedorDatos.opcion = tp;            
            vgContenedorDatos.contrato = pkInfoCharSol.insNumContrato;
            vgContenedorDatos.folio = pkInfoCharSol.insNumFolioInst;
            vgContenedorDatos.numEtapa = pkInfoCharSol.fbisNumEtapa;
            vgContenedorDatos.numOper = pkInfoCharSol.insNumOper;
            vgContenedorDatos.idEtapa = pkInfoCharSol.fetaIdEtapa;
            vgContenedorDatos.idPtoRev = eval(puntoRevision.fpurIdPuntorev);
            vgContenedorDatos.revCorrecta = GI("cboCumple" + puntoRevision.fpurIdPuntorev).value;
            vgContenedorDatos.causaRechazo = GI("cboCausaRechazo" + puntoRevision.fpurIdPuntorev).value != "-1" ? GI("cboCausaRechazo" + puntoRevision.fpurIdPuntorev).value : "";
            vgContenedorDatos.delegadoFiduciario = "";
            vgContenedorDatos.observaciones = GI("txtObservaciones" + puntoRevision.fpurIdPuntorev).value;
            vgContenedorDatos.referencia = "";
            vgContenedorDatos.folioAutorizado = "";
            vgContenedorDatos.observacionesRechazo = "";
            vgContenedorDatos.Fecha = vgFecIni;
            vgContenedorDatos.numUsuario = eval(GI("txtuserId").value);
            vgContenedorDatos.firma = 0;
            vgContenedorDatos.idDoc = 0;
            
            if(i + 1 == puntosRevision.length) {
                fin = 1;
            }
            
            showWaitLayer();
            var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
            makeAjaxRequest(url, "HTML", ejecutaFuncion, fin);
        }
    }
}

function cargaPantallaInstrucciones() {
    showWaitLayer();
    onButtonClickPestania("Administracion.HistorialCargasAutorizacion.CharolaSolicitudAdmon","");
    hideWaitLayer();
}

function operacionExitosa() {
    Swal.fire('Aviso', 'La operacion se realizo correctamente',  'warning');
    cargaPantallaInstrucciones();
    hideWaitLayer();
}
