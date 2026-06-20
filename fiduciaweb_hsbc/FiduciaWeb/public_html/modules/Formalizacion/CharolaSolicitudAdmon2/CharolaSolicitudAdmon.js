//***DEFINICON DE LOS BEANS**************************************************************************************************************
var cat = new Catalogo("mx.com.inscitech.fiducia.domain.Instrucc");

//***VARIABLES GLOBALES******************************************************************************************************************
var paramsQryDocumentsCbo;
var paramsQryDocumentsCbo2;
var clavesCombo638 = JSON.parse("{\"llaveClave\":638}");
var paramPerfil = JSON.parse("{\"orderPerfil\":\"s\"}");
var paramQueryAdmon = JSON.parse("{\"order\":\"s\"}");
var asignaPerfil = JSON.parse("{\"numEtapa\":\"" + eval(9) + "\"}");
var verificaExistenciaHijDoc = JSON.parse("{\"id\":\"verificaExistenciaHijDoc\",\"numDocto\":0}");

var vgFunPtoRev = 1;
var vgFunDoc = 2;
var vgFunAutorizar = 3;
var vgFunRechazar = 4;

var strIdPK = "insNumContrato,insNumFolioInst";
var arrIdPK = strIdPK.split(",");
var fvCat = new FormValidator();
var opcion = 0;
var pkInfoCharSol = null;
var pkInfoPtoRev = null;

var vgObjqryllenaTablaAdmon = null;
var vgContenedorDatos = null;
var txtPerfil;
var userId;

var vgNumEtapa;
var vgIdEtapa;
var vgFecIni;
var vgFecFin;

var vgValor;
var vgTipoSolicitud;//nuevo
var vgEtapa;
var vgPromotor;
var vgProducto;
var vgPersona;
var vgClasificacion;

initForms();
//***DEFINICION DEL CONTENIDO DE TABLAS DE CONSULTA**************************************************************************************
var arrTblDatCharSol = new Array();
arrTblDatCharSol[0] = "insNumFolioInst,100px";
arrTblDatCharSol[1] = "insFechaContable,100px";
arrTblDatCharSol[2] = "insNumContrato,70px";
arrTblDatCharSol[3] = "insTxtComentario,300px";
arrTblDatCharSol[4] = "tipo,100px";
arrTblDatCharSol[5] = "nombre,200px";
arrTblDatCharSol[6] = "clasifica,100px";
arrTblDatCharSol[7] = "pais,100px";
arrTblDatCharSol[8] = "insCveTipoInstr,100px";
arrTblDatCharSol[9] = "statuspld,100px";

//arrTblDatCharSol[5] = "insCveStInstruc,100px";
function clickTablaCharSol(pk) {
    pkInfoCharSol = pk;
    cloneObject(pk, cat.getCatalogo());
}

var arrTblDatPtoRev = new Array();
arrTblDatPtoRev[0] = "fpurIdPuntorev,100px";
arrTblDatPtoRev[1] = "fpurDescripcion,400px";
arrTblDatPtoRev[2] = "frxoRevCorrecta,50px";
arrTblDatPtoRev[3] = "frxoObservacion,600px";

function clickTablaPtoRev(pk) {
    pkInfoPtoRev = pk;
    cloneObject(pk, cat.getCatalogo());
    GI("rdSi").checked = false;
    GI("rdNo").checked = false;
    GI("txtObservaciones").value = "";
}

///////////////////////////////////////////////////////////////////////FUNCIONALIDAD DEL MODULO////////////////////////////////////////////////////////////////////
//***FUNCIONALIDAD BOTONES*********************************************************************************************************************
function funcionDelBoton(opc) {
    if (isDefinedAndNotNull(pkInfoCharSol)) {
        opcion = opc;
        txtPerfil = GI("Perfil").value;
        userId = GI("txtuserId").value;
        vgEtapa = GI("paramEtapa").value;
        //alert(pkInfoCharSol.tipo)
        vgPersona = pkInfoCharSol.tipo + " - " + pkInfoCharSol.nombre;
        vgClasificacion = pkInfoCharSol.clasifica + " - " + pkInfoCharSol.pais;
        vgTipoSolicitud = pkInfoCharSol.insTxtComentario;
        paramsQryDocumentsCbo = JSON.parse("{\"numOper\":\"" + pkInfoCharSol.insNumOper + "\",\"numEtapa\":\"" + eval(9) + "\"}");
        showWaitLayer();
        if (opcion == vgFunPtoRev || opcion == vgFunDoc) {
            obtenerDatosPrevioCargarPantallaMantto();
        }
    }
    else {
        Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
    }
}

function obtenerDatosPrevioCargarPantallaMantto() {
    vgContenedorDatos = null;
    vgContenedorDatos = JSON.parse("{\"id\":\"obtenNumEtapa\"}");
    vgContenedorDatos.tipoSol = 'N';
    vgContenedorDatos.numEtapa = 9;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
    //alert(url);
    makeAjaxRequest(url, "HTML", obtenNumEtapaYa, null);
}

function obtenNumEtapaYa(obj, result) {
    //alert(result);
    var resultado = JSON.parse(result)[0];
    vgNumEtapa = resultado.fetaSecEtapa;
    vgIdEtapa = resultado.fetaIdEtapa;
    var qryObtenFecha = JSON.parse("{\"id\":\"obtenFecha\"}");
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(qryObtenFecha);
    makeAjaxRequest(url, "HTML", funcObtenFecha, null);
}

function funcObtenFecha(obj, result) {
    var resultado = JSON.parse(result)[0];
    vgFecIni = resultado.fecha;
    vgFecFin = resultado.fecha;
    vgContenedorDatos = null;
    vgContenedorDatos = JSON.parse("{\"id\":\"determinarFisoFoseg\"}");
    vgContenedorDatos.numFiso = pkInfoCharSol.insNumContrato;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
    //alert(url);
    makeAjaxRequest(url, "HTML", determinandoFisoFoseg, null);
}

function determinandoFisoFoseg(obj, result) {
    //alert("result determinandoFisoFoseg = "+result);
    var respuesta = JSON.parse(result)[0];
    //alert(respuesta.esfoseg);
    obtenerDatosParaPantallaMantenimiento(1);
}

function obtenerDatosParaPantallaMantenimiento(opc) {
    recogerDatosParaPantallaMantenimiento(opc);

    /* var fechaSinHora;
     vgContenedorDatos=null;
     vgContenedorDatos=JSON.parse("{\"id\":\"ejeFunFichaUnica\"}");//EJECUTANDO FUNCION FICHA UNICA*************************************************************************************
     vgContenedorDatos.opcion=2;
     vgContenedorDatos.folio=eval(pkInfoCharSol.insNumFolioInst);
     //FORMATEANDO FECHA
        fechaSinHora=vgFecIni.split(" ");//quitando la hora
        //alert("Fecha:"+fechaSinHora[0]);
     vgContenedorDatos.fecha=fechaSinHora[0];
     vgContenedorDatos.status=pkInfoCharSol.insCveStInstruc;
     //alert("Status:"+pkInfoCharSol.insCveStInstruc);
     //alert("foseg:"+opc);
     vgContenedorDatos.foseg=eval(opc);
     vgContenedorDatos.usuario=eval(GI("txtuserId").value);
     var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
     //alert(url)
     makeAjaxRequest(url, "HTML",datosObtenidos , opc);//cargaTipoPantalla*/
}

function datosObtenidos(opc, result) {
    //alert(result);
    var rusultado = JSON.parse(result);
    var res = rusultado.result
    if (res == 0)
        recogerDatosParaPantallaMantenimiento(opc);
    else {
        Swal.fire('Aviso', 'ocurrio un error al obtener los datos de la ficha unica',  'warning')}
}

function recogerDatosParaPantallaMantenimiento(opc) {
    //alert(pkInfoCharSol.insNumContrato);
    vgContenedorDatos = null;
    vgContenedorDatos = JSON.parse("{\"id\":\"conNomProyecto\"}");//PRIMERO SE PROCESA LA BITACORA
    vgContenedorDatos.numFideicomiso = eval(pkInfoCharSol.insNumContrato);
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
    //alert(url)
    makeAjaxRequest(url, "HTML", recogiendoDatos, null);
}

function recogiendoDatos(obj, result) {
    var resultado = JSON.parse(result)[0];
    //alert(result);
    //alert(resultado.nombre)
    vgValor = resultado.nombre;
    vgPromotor = resultado.promotor;
    vgProducto = resultado.producto;
    cargaTipoPantalla();
}
/*
function recogerDatosParaPantallaMantenimiento(opc){
    recogiendoDatos();
  }
  
  function recogiendoDatos(){
      cargaTipoPantalla();
  }*/

function cargaTipoPantalla() {
    if (opcion == vgFunPtoRev) {
        var urlCliente = ctxRoot + "/modules/Formalizacion/CharolaSolicitudAdmon2/PuntosRevisionSolicitudesAdmon.do";
        makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
    }
    else {
        var urlCliente = ctxRoot + "/modules/Formalizacion/CharolaSolicitudAdmon2/DocumentosSolicitudesAdmon.do";
        makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
    }
}

function despliegaPantalla(obj, result) {
    GI("dvPantalla").innerHTML = result;
    initForms();
    if (opcion == vgFunPtoRev) {
        //Agregando la funcionalidad del required
        fvCat.setup( {
            formName : "frmPtosSol", tipoAlert : 1, alertFunction : BaloonAlert, sendObjToAlert : true
        });
        //hideWaitLayer();
        cat.buscaCatalogoPK(false);
        asignaValoresAobjetosFormulario2();
    }
    else {
        //FUNCIONALIDAD DOCUMENTOS
        //Agregando la funcionalidad del required
        fvCat.setup( {
            formName : "frmDocumentos", tipoAlert : 1, alertFunction : BaloonAlert, sendObjToAlert : true
        });
        cat.buscaCatalogoPK(false);
        asignaValoresAobjetosFormulario();
    }
}

function asignaValoresAobjetosFormulario2() {
    //alert(vgValor.ctoNomContrato);
    //GI("ins").value=vgValor.ctoNumContrato;
    GI("insNumContrato").value = "Fideicomiso Reservado " + pkInfoCharSol.insNumContrato
    GI("txtNomContraro").value = vgValor;
    GI("txtInsOperacion").value = vgTipoSolicitud;
    GI("paramEtapa").value = vgEtapa;
    GI("txtPromotor").value = vgPromotor;
    GI("txtProducto").value = vgProducto;
    GI("txtPersona").value = vgPersona;
    GI("txtClasificacion").value = vgClasificacion;

    if (opcion == vgFunPtoRev)
        cat.setOnUpdate(cargaTablaParaPtosRev);
    else 
        cat.setOnUpdate(formsLoaded);
}

function asignaValoresAobjetosFormulario() {
    //alert(vgValor.ctoNomContrato);
    //GI("ins").value=vgValor.ctoNumContrato;
    GI("txtNumContrato").value = "Fideicomiso Reservado " + pkInfoCharSol.insNumContrato
    GI("txtNomContraro").value = vgValor;
    GI("txtInsOperacion").value = vgTipoSolicitud;
    GI("paramEtapa").value = vgEtapa;
    GI("txtPromotor").value = vgPromotor;
    GI("txtProducto").value = vgProducto;
    GI("txtPersona").value = vgPersona;
    GI("txtClasificacion").value = vgClasificacion;
    if (opcion == vgFunPtoRev)
        cat.setOnUpdate(cargaTablaParaPtosRev);
    else 
        cat.setOnUpdate(formsLoaded);
}

//***funciones auxiliares****************************************************************************************
function verNomFiso() {
    consultaNombreFideicomiso('nomFideicomiso', GI("paramFiso"));
}

function regresarAlaCharola() {
    /*GI("paramFiso").value="";
    GI("paramnumfolio").value="";*/
    onButtonClick("Formalizacion/CharolaSolicitudAdmon2/CharolaSolicitudAdmon", "");
    hideWaitLayer();
}

function cargaTablaParaDocumentos2() {
    vgContenedorDatos = null;
    vgContenedorDatos = new Object();
    vgContenedorDatos.tipo = 2
    vgContenedorDatos.perfil = txtPerfil;
    eval(pkInfoCharSol.insNumOper) == null ? vgContenedorDatos.numOper = 0 : vgContenedorDatos.numOper = pkInfoCharSol.insNumOper;
    vgContenedorDatos.fiso = pkInfoCharSol.insNumContrato
    vgContenedorDatos.numfolio = GI("insNumFolioInst").value;
    vgContenedorDatos.documento = GI("cboNombre2").value;
    //alert(GI("cboNombre2").value)
    despliegaTabla(GI("tblRegDocumentos"), vgContenedorDatos);
}

function cargaTablaParaDocumentos() {
    verificaExistenciaHijDoc.numDocto = GI("cboNombre").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(verificaExistenciaHijDoc);
    //alert(url)
    makeAjaxRequest(url, "HTML", verificarDoctHijo, null);
}

function verificarDoctHijo(obj, result) {
    var objResult = JSON.parse(result);

    if (objResult[0].existeRegistro > 0) {
        //alert(GI("cboNombre").value)
        //alert(pkInfoCharSol.insNumOper)
        paramsQryDocumentsCbo2 = JSON.parse("{\"numOper\":\"" + pkInfoCharSol.insNumOper + "\",\"numEtapa\":\"" + eval(9) + "\",\"DocPadre\":\"" + eval(GI("cboNombre").value) + "\"}");
        //alert(paramsQryDocumentsCbo2)
        SA(GI("cboNombre2"), "next", "formsLoaded");
        loadElement(GI("cboNombre2"));
    }
    else {
        paramsQryDocumentsCbo2 = JSON.parse("{\"numOper\":\"" + pkInfoCharSol.insNumOper + "\",\"numEtapa\":\"" + eval(9) + "\",\"DocPadre\":\"" + eval(0) + "\"}");
        //alert(paramsQryDocumentsCbo2)
        SA(GI("cboNombre2"), "next", "formsLoaded");
        loadElement(GI("cboNombre2"));
        vgContenedorDatos = null;
        vgContenedorDatos = new Object();
        vgContenedorDatos.tipo = 2
        vgContenedorDatos.perfil = txtPerfil;
        eval(pkInfoCharSol.insNumOper) == null ? vgContenedorDatos.numOper = 0 : vgContenedorDatos.numOper = pkInfoCharSol.insNumOper;
        vgContenedorDatos.fiso = pkInfoCharSol.insNumContrato
        vgContenedorDatos.numfolio = GI("insNumFolioInst").value;
        vgContenedorDatos.documento = GI("cboNombre").value;
        despliegaTabla(GI("tblRegDocumentos"), vgContenedorDatos);
    }
}

function cargaTablaParaPtosRev() {
    vgContenedorDatos = null;
    vgContenedorDatos = new Object();
    vgContenedorDatos.tipo = 1
    vgContenedorDatos.perfil = txtPerfil
    eval(pkInfoCharSol.insNumOper) == null ? vgContenedorDatos.numOper = 0 : vgContenedorDatos.numOper = pkInfoCharSol.insNumOper;
    vgContenedorDatos.fiso = GI("insNumContrato").value
    vgContenedorDatos.numfolio = GI("insNumFolioInst").value
    vgContenedorDatos.documento = 0;
    //alert("datos ptos rev:"+vgContenedorDatos);
    despliegaTabla(GI("tblRegPtosRev"), vgContenedorDatos);
}

function despliegaTabla(tabla, obj) {
    vgObjqryllenaTablaAdmon = JSON.parse("{\"id\":\"qryllenaTablaAdmon\"}");
    vgObjqryllenaTablaAdmon.tipo = eval(obj.tipo);
    vgObjqryllenaTablaAdmon.numEtapa = eval(9);
    vgObjqryllenaTablaAdmon.numOper = obj.numOper;
    vgObjqryllenaTablaAdmon.fiso = eval(obj.fiso);
    vgObjqryllenaTablaAdmon.numfolio = eval(obj.numfolio);
    vgObjqryllenaTablaAdmon.documento = eval(obj.documento);
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(vgObjqryllenaTablaAdmon);
    //alert(url)
    makeAjaxRequest(url, "HTML", resultadoConsulta, tabla);
}

function resultadoConsulta(objTabla, result) {
    //alert(result);
    var resultado = JSON.parse(result);
    //alert(resultado.length)
    if (isDefinedAndNotNull(resultado) && resultado.length > 0) {
        loadTableElement(objTabla, result);
        hideWaitLayer();
    }
    else {
        Swal.fire('Aviso', 'No existen Registros para estos criterios de b煤squeda',  'warning');
        regresarAlaCharola();
        hideWaitLayer();
    }
}

//***FUNCIONALIDAD DEL BOTON GUARDAR*********************************************************************************
function guardar(tp) {
    //tp = tipo pantalla: ptos revision o documentos
    if (fvCat.checkForm()) {
        if (isDefinedAndNotNull(pkInfoPtoRev)) {
            if (tp == 1) {
                //FUNCIONALIDAD AL GUARDAR PARA PTOS DE REVISION
                vgContenedorDatos = null;
                vgContenedorDatos = JSON.parse("{\"id\":\"funcionAceptarRechazarCharolaSolPtosRev\"}");//PRIMERO SE PROCESA LA BITACORA
                vgContenedorDatos.opcion = eval(tp);
                vgContenedorDatos.contrato = eval(GI("insNumContrato").value);
                vgContenedorDatos.folio = eval(GI("insNumFolioInst").value);
                vgContenedorDatos.numEtapa = eval(vgNumEtapa);
                vgContenedorDatos.numOper = pkInfoCharSol.insNumOper;
                vgContenedorDatos.idEtapa = eval(vgIdEtapa);
                vgContenedorDatos.idPtoRev = eval(pkInfoPtoRev.fpurIdPuntorev);
                if (GI("rdSi").checked == true)
                    vgContenedorDatos.revCorrecta = "S"
                if (GI("rdNo").checked == true)
                    vgContenedorDatos.revCorrecta = "N"
                vgContenedorDatos.obsrvacion = GI("txtObservaciones").value;
                vgContenedorDatos.Fecha = vgFecIni;
                vgContenedorDatos.numUsuario = eval(userId);
                vgContenedorDatos.firma = 0;
                vgContenedorDatos.idDoc = 0;
                var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
                //alert(url)
                makeAjaxRequest(url, "HTML", ejecutaFuncion, tp);
            }
            else {
                //FUNCIONALIDAD AL GUARDAR DOCUMENTOS
                vgContenedorDatos = null;
                vgContenedorDatos = JSON.parse("{\"id\":\"funcionAceptarRechazarCharolaSolPtosRev\"}");//PRIMERO SE PROCESA LA BITACORA
                vgContenedorDatos.opcion = eval(tp);
                vgContenedorDatos.contrato = pkInfoCharSol.insNumContrato;
                vgContenedorDatos.folio = eval(GI("insNumFolioInst").value);
                vgContenedorDatos.numEtapa = eval(vgNumEtapa);
                vgContenedorDatos.numOper = pkInfoCharSol.insNumOper;
                vgContenedorDatos.idEtapa = eval(vgIdEtapa);
                vgContenedorDatos.idPtoRev = eval(pkInfoPtoRev.fpurIdPuntorev);
                if (GI("rdSi").checked == true)
                    vgContenedorDatos.revCorrecta = "S"
                if (GI("rdNo").checked == true)
                    vgContenedorDatos.revCorrecta = "N"
                vgContenedorDatos.obsrvacion = GI("txtObservaciones").value;
                vgContenedorDatos.Fecha = vgFecIni;
                vgContenedorDatos.numUsuario = eval(userId);
                vgContenedorDatos.firma = 0;
                ///alert(eval(GI("cboNombre2").value))
                if (eval(GI("cboNombre2").value) ==  - 1)
                    vgContenedorDatos.idDoc = eval(GI("cboNombre").value);
                else 
                    vgContenedorDatos.idDoc = eval(GI("cboNombre2").value);
                var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
                //alert(url)
                makeAjaxRequest(url, "HTML", ejecutaFuncion, tp);
            }
        }
        else {
            Swal.fire('Aviso', 'selecciona un punto de revision de la tabla',  'warning');
        }
    }
}

function ejecutaFuncion(tp, result) {
    //alert(tp)
    //alert(result);
    var resultado = JSON.parse(result);
    var res = resultado;
    if (res.result == 0) {
        if (tp == 1) {
            Swal.fire('Aviso', 'Operaci贸n realizada satisfactoriamente.',  'warning');
            cargaTablaParaPtosRev();
        }
        else {
            Swal.fire('Aviso', 'Operaci贸n realizada satisfactoriamente.',  'warning');
            if (eval(GI("cboNombre2").value) ==  - 1)
                cargaTablaParaDocumentos();
            else 
                cargaTablaParaDocumentos2();
        }
    }
    else if (res.result == 1)
        Swal.fire('Aviso', 'No se puede autorizar debido a que no todos los puntos de revisi贸n fueron correctos',  'warning');
    else if (res.result == 2)
        Swal.fire('Aviso', 'No se puede autorizar debido a que no todos los puntos de revisi贸n de los documentos fueron correctos',  'warning');
    else if (res.result == 3)
        Swal.fire('Aviso', 'No se puede rechazar una solicitud con todos los puntos de revisi贸n correctos',  'warning');
    else {
        Swal.fire('Aviso', 'Ocurrio un error al tratar de modificar el valor',  'warning')}
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
var vgopcAutRech;
var vgopcion;

function autorizaRechaza(opc) {
    vgopcion = opc;
    if (isDefinedAndNotNull(pkInfoCharSol)) {

        var url = ctxRoot + "/doRef.do?json={\"id\":\"delDatoCorreoDicta\",\"fiso\":" + pkInfoCharSol.insNumContrato + "}";
        makeAjaxRequest(url, "HTML", realizarDeleteCorreo, null);

        /*var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
        //alert(url)
        makeAjaxRequest(url, "HTML", ejecutaAutorizaRechazaProyectoLN, null);*/
    }
    else 
        Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
}

function realizarDeleteCorreo() {
    vgopcAutRech = vgopcion;
    vgContenedorDatos = null;
    vgContenedorDatos = JSON.parse("{\"id\":\"determinarValidaListasNegras\"}");
    vgContenedorDatos.proyecto = eval(pkInfoCharSol.insNumContrato);
    vgContenedorDatos.tipo = pkInfoCharSol.tipo;
    vgContenedorDatos.numero = eval(pkInfoCharSol.numero);
    vgContenedorDatos.etapa = 'DICTAMINACION';
    vgContenedorDatos.status = 'AUTORIZADO';

    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
    //alert(url)
    makeAjaxRequest(url, "HTML", ejecutaAutorizaRechazaProyectoLN, null);
}

function ejecutaAutorizaRechazaProyectoLN(obj, result) {
    var sMensaje = "";
    var resultado = JSON.parse(result)[0];
    // alert(resultado.existe);
    if (resultado.existe > 0) {
        vgopcAutRech = vgopcion;
        vgContenedorDatos = null;
        vgContenedorDatos = JSON.parse("{\"id\":\"funcionAceptarRechazarCharolaSol\"}");
        vgContenedorDatos.opcion = eval(vgopcion);
        vgContenedorDatos.numEtapa = eval(9);
        vgContenedorDatos.contrato = eval(pkInfoCharSol.insNumContrato);
        vgContenedorDatos.folio = eval(pkInfoCharSol.insNumFolioInst);
        vgContenedorDatos.numOper = pkInfoCharSol.insNumOper;
        vgContenedorDatos.numUsuario = eval(GI("txtuserId").value)

        var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
        //alert(url)
        makeAjaxRequest(url, "HTML", ejecutaAutorizaRechaza, null);
    }
    else {
        Swal.fire('Aviso', 'Falta validar en listas Negras a esta Persona.',  'warning');
    }
}

function ejecutaAutorizaRechaza(obj, resultado) {
    var sMensaje = "";
    var resp = JSON.parse(resultado);
    var r = resp.result
    //alert(r);
    switch (r) {
        case  - 1:
            Swal.fire('Aviso', 'A ocurrido un error',  'warning');
            break;
        case 0:
            if (vgopcAutRech != 1) {
                if (vgopcAutRech == 1)
                    sMensaje = "SOLICITUD DE OTROS SERVICIOS RECHAZADA\n"
                sMensaje += "\nFolio: " + pkInfoCharSol.insNumFolioInst;
                sMensaje += "\nFideicomiso: " + pkInfoCharSol.insNumContrato;
                sMensaje += "\nServicio: " + pkInfoCharSol.insTxtComentario;
                sMensaje += "\nOperada por el usuario: " + GI("paramNomUsuario").value;
                /*sign(sMensaje);
       if(iFirmaSatisfactoria==0)      
       {  */
                //quitar mensaje y meter en nueva funcion llamada enviarCorreoRechazo con el alert
                enviaCorreoRechazo(pkInfoCharSol.insNumContrato);

                consultar(GI("cmdAceptar"), GI("frmCharolaSolicitudes"), false);
                /*}*/
            }
            else {
                if (vgopcAutRech == 1) {
                    //enviaCorreoAcepta(pkInfoCharSol.insNumContrato); Se cambia a Constitucion
                    sMensaje = "SOLICITUD DE OTROS SERVICIOS AUTORIZADA\n"
                }
                else 
                sMensaje = "SOLICITUD DE OTROS SERVICIOS RECHAZADA\n"
                sMensaje += "\nFolio: " + pkInfoCharSol.insNumFolioInst;
                sMensaje += "\nFideicomiso: " + pkInfoCharSol.insNumContrato;
                sMensaje += "\nServicio: " + pkInfoCharSol.insTxtComentario;
                sMensaje += "\nOperada por el usuario: " + GI("paramNomUsuario").value;
                /*sign(sMensaje);
       if(iFirmaSatisfactoria==0)      
       {*/
                vgContenedorDatos = null;
                vgContenedorDatos = JSON.parse("{\"id\":\"funcionAceptarRechazarCharolaSolFrmElec\"}");
                vgContenedorDatos.opcion = eval(vgopcAutRech);
                vgContenedorDatos.numEtapa = eval(9);
                vgContenedorDatos.contrato = eval(pkInfoCharSol.insNumContrato);
                vgContenedorDatos.folio = eval(pkInfoCharSol.insNumFolioInst);
                vgContenedorDatos.numOper = pkInfoCharSol.insNumOper;
                vgContenedorDatos.usuario = eval(GI("txtuserId").value)
                //vgContenedorDatos.subioImagen=eval(0)		
                var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
                //alert(url)
                makeAjaxRequest(url, "HTML", ejecutaAutorizaRechazaFrmElec, null);
                /*} */
            }
            break;
            case 1:
                Swal.fire('Aviso', 'No se puede autorizar 茅sta instruccion debido a que no todos sus puntos de revision han sido correctos',  'warning');
                consultar(GI("cmdAceptar"), GI("frmCharolaSolicitudes"), false);
                break;
            case 2:
                Swal.fire('Aviso', 'No se puede autorizar 茅sta instruccion debido a que no todos sus documentos tienen sus puntos de revision correctos',  'warning');
                break;
            case 3:
                Swal.fire('Aviso', 'Imposible rechazar una instruccion con todos sus puntos de revision correctos',  'warning');
                break;
        }
    }

    function ejecutaAutorizaRechazaFrmElec(obj, resultado) {
        var resp = JSON.parse(resultado);
        var r = resp.result
        switch (r) {
            case  - 1:
                Swal.fire('Aviso', 'A ocurrido un error',  'warning');
                break;
            case 0:
            //enviarFirma(); 
                Swal.fire('∩xito!', 'Operaci髇 realizada correctamente', 'success');
                autorizaRechazaProyecto();
                break;
        }
    }

    function fin() {
    }

    function generaReporte() {
        var idLink = "linkReporteNew";
        var parametrosUrl = new Object;
        parametrosUrl.sendToJSP = "true";
        parametrosUrl.urlReporte = "/jsp/Reportes/Formalizacion/ReporteFinalidades.jsp"
        parametrosUrl.id = "repFinalidadesProy";
        parametrosUrl.proyecto = pkInfoCharSol.insNumContrato
        var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
        var link = GI(idLink);
        link.href = url;
        link.click();
        document.onreadystatechange = function () {
            hideWaitLayer();
            document.onreadystatechange = function () {
            }
        }
    }

    function AgregaArchivo() {
        var idLink = "linkReporteNew";
        var parametrosUrl = new Object;
        parametrosUrl.sendToJSP = "true";
        Swal.fire('Aviso', 'Se notificar谩 de Expediente Incompleto al 谩rea t茅cnico legal.',  'warning')parametrosUrl.urlReporte = "/modules/Formalizacion/ExpedienteIncompleto/EnviarCorreo.jsp"
        parametrosUrl.id = "mandaCorreoInstrucExpInc";
        parametrosUrl.proyecto = pkInfoCharSol.insNumContrato;
        parametrosUrl.folio = pkInfoCharSol.insNumFolioInst;
        parametrosUrl.etapa = eval(9);
        parametrosUrl.operacion = '30001';
        var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
        //alert(url)
        idLink.href = url;
        window.open(url, GI("linkReporteNew").value, "width=450,height=205,scrollbars=NO");
        //idLink.click();
        document.onreadystatechange = function () {
            hideWaitLayer();
            document.onreadystatechange = function () {
            }
        }
    }

    //codigo para ubicar la tabla principal en el folio solicitado
    function regresarAlaCharola2() {
        showWaitLayer();
        var objDatosFolio = new Object();
        objDatosFolio.numFolio = GI("insNumFolioInst").value;
        objDatosFolio.Etapa = GI("paramEtapa").value;
        var urlCliente = "modules/Formalizacion/CharolaSolicitudAdmon2/CharolaSolicitudAdmon.do";
        makeAjaxRequest(urlCliente, "HTML", ubicaFolioSolicitado, objDatosFolio);
    }

    function ubicaFolioSolicitado(obj, result) {
        GI("dvPantalla").innerHTML = result;
        pkInfo = null;
        var botonTemp2 = GI("cmdLimpiar");
        GI("paramnumEtapa").value = eval(9);
        SA(botonTemp2, "ref", "qryMuestraNombreEtapa");
        SA(botonTemp2, "fun", "loadTxtElementX");
        SA(botonTemp2, "tabla", "paramEtapa");
        consultar(botonTemp2, GI("frmCharolaSolicitudes"), false);
        var botonTemp = GI("cmdLimpiar");
        GI("paramnumfolio").value = obj.numFolio;
        GI("paramEtapa").value = obj.Etapa;
        SA(botonTemp, "ref", "qryCharolInstrucAdmon");
        SA(botonTemp, "fun", "loadTableElement");
        SA(botonTemp, "tabla", "tblRegCharSol");
        consultar(botonTemp, GI("frmCharolaSolicitudes"), false);
        formsLoaded();
    }

    function enviarFirma() {
        idLink = "linkReporteNew";
        var parametrosUrl = new Object;
        parametrosUrl.sendToJSP = "true";
        /*if(pkcs7_=="")
      pkcs7_="vacio"*/
        //parametrosUrl.urlReporte="/jsp/Reportes/MesaControl/EnviarFirma.jsp";
        parametrosUrl.urlReporte = "/modules/Formalizacion/CharolaInstruccionAdmon/EnviarFirma.jsp";
        parametrosUrl.id = "muestraDatosInstruFrmElec";
        parametrosUrl.FolioFiducia = eval(pkInfoCharSol.insNumFolioInst);
        parametrosUrl.ParamJsp_pk = pkcs7_;//;+"&SignedText="+sMensaje;
        parametrosUrl.ParamJsp_Text = sMensaje;
        parametrosUrl.ParamJspFolioFiducia = pkInfoCharSol.insNumFolioInst + "";
        var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
        idLink.href = url;
        window.open(url, GI("linkReporteNew").value, "width=450,height=205,scrollbars=NO");
        document.onreadystatechange = function () {
            hideWaitLayer();
            document.onreadystatechange = function () {
            }
        }
    }

    function getViewer(obj) {

        var uris = GA(this, 'uris');
        var names = GA(this, 'names');
        var target = GA(this, 'target');
        if (target == 'new' || target == 'blank') {
            window.open(ctxRoot + '/jsp/Global/Visualizer.jsp?uris=' + uris + '&names=' + names);
        }
        else {
            Swal.fire('Aviso', 'Modulo en desarrollo',  'warning')}
    }

    function enviaCorreo(folio) {
        var idLink = "linkReporteNew";
        var parametrosUrl = new Object;
        parametrosUrl.sendToJSP = "true";
        // Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte = "/modules/Formalizacion/CorreoAdmin/EnviarCorreo.jsp"
        parametrosUrl.id = "mandaCorreoFiscal";
        parametrosUrl.folio = folio;
        var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
        //alert(url)
        idLink.href = url;
        window.open(url, GI("linkReporteNew").value, "width=450,height=205,scrollbars=NO");
        //idLink.click();
        document.onreadystatechange = function () {
            hideWaitLayer();
            document.onreadystatechange = function () {
            }
        }
    }
    //ENVIAR CORREO FISCAL
    function enviaCorreo2(folio) {
        var idLink = "linkReporteNew";
        var parametrosUrl = new Object;
        parametrosUrl.sendToJSP = "true";
        // Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte = "/modules/Formalizacion/CorreoFiscal/EnviarCorreo.jsp"
        parametrosUrl.id = "mandaCorreoFiscal";
        parametrosUrl.fideico = folio;
        var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
        //alert(url)
        idLink.href = url;
        window.open(url, GI("linkReporteNew").value, "width=450,height=205,scrollbars=NO");
        //idLink.click();
        document.onreadystatechange = function () {
            hideWaitLayer();
            document.onreadystatechange = function () {
            }
        }
    }

    function viewDoc(objBtn) {
        var objSel = GI('cboNombre');
        var objLnk = GI('docLink');
        var url = "#";
        //alert(objSel.value)
        switch (parseInt(objSel.value)) {
            case 100:
            //Solicitud de Revocacion Firmada
                url = ctxRoot + "/temp/solicitud.pdf";
                break;
            case 101:
            case 301:
            //Identificacion Oficial vigente
                url = ctxRoot + "/temp/identificacion.pdf";
                break;
            case 102:
            case 204:
            //En su caso Acuerdo del Comite
                url = ctxRoot + "/temp/acuerdo.pdf";
                break;
            case 103:
            //Copia del Poder a Revocar
                url = ctxRoot + "/temp/poder.pdf";
                break;
            case 103:
            //Copia del Poder a Revocar
                url = ctxRoot + "/temp/poder.pdf";
                break;
            case 201:
            //proyecto de negocio
                url = ctxRoot + "/temp/proyecto.PDF";
                break;
            case 300:
            //Copia del Poder a Revocar
                url = ctxRoot + "/temp/instruccionpago.pdf";
                break;
            case 302:
            //Copia FATCA
                url = ctxRoot + "/temp/FormatoFATCA.pdf";
                break;
            default :
                Swal.fire('Aviso', 'Seleccione un documento',  'warning');
        }

        SA(objLnk, "href", url);
        objLnk.click();
    }

    function autorizaRechazaProyecto() {

        if (isDefinedAndNotNull(pkInfoCharSol)) {
            vgContenedorDatos = null;
            vgContenedorDatos = JSON.parse("{\"id\":\"funcionAceptarProyecto\"}");
            vgContenedorDatos.etapa = "PROYECTO";
            vgContenedorDatos.proyecto = eval(pkInfoCharSol.insNumContrato);
            vgContenedorDatos.tipo = 'SINVALOR';
            vgContenedorDatos.numero = 1;

            var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
            // alert(url)
            makeAjaxRequest(url, "HTML", ejecutaAutorizaRechazaProyecto, null);
        }
        else 
            Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
    }

    function ejecutaAutorizaRechazaProyecto(obj, resultado) {
        var sMensaje = "";
        var resp = JSON.parse(resultado);
        var r = resp.result
        //alert(r);
        switch (r) {
            case  - 1:
                Swal.fire('Aviso', 'A ocurrido un error',  'warning');
                break;
            case 0:
                Swal.fire('Aviso', 'Proyecto Autorizado Satisfactoriament, se envio correo a Administraci贸n',  'warning');
                enviaCorreo(pkInfoCharSol.insNumFolioInst);
                enviaCorreo2(pkInfoCharSol.insNumContrato);//Correo Fiscal
                consultar(GI("cmdAceptar"), GI("frmCharolaSolicitudes"), false);
                break;
            case 1:
                Swal.fire('Aviso', 'Existen Expedientes Pendientes',  'warning');
                break;
            case 2:
                Swal.fire('Aviso', 'Existen Personas en Listas Negras, Favor de validar con el Area de PLD',  'warning');
                break;
            case 3:
                Swal.fire('Aviso', 'Falta validar en listas Negras a las Personas del Proyecto.',  'warning');
                consultar(GI("cmdAceptar"), GI("frmCharolaSolicitudes"), false);
                break;
        }
    }

    //incorpora pld
    function validalistas() {
        if (isDefinedAndNotNull(pkInfoCharSol)) {
            showWaitLayer();

            //TODO: Invocar WS. Lista mayor a 0
            var vgContenedorDatos = null;
            vgContenedorDatos = JSON.parse("{\"id\":\"funcionIncorporaTipoPersPLD\"}");//PRIMERO SE PROCESA LA BITACORA
            vgContenedorDatos.Etapa = 'DICTAMINACION';
            vgContenedorDatos.NumProyFid = eval(pkInfoCharSol.insNumContrato);
            vgContenedorDatos.TipoPers = pkInfoCharSol.tipo;
            vgContenedorDatos.NumPers = eval(pkInfoCharSol.numero);
            vgContenedorDatos.Nombre = pkInfoCharSol.nombre;
            vgContenedorDatos.CatPersona = '';
            vgContenedorDatos.Pais = '';
            vgContenedorDatos.Calidad = '';
            vgContenedorDatos.Status = 'PENDIENTE';
            var nom = pkInfoCharSol.nombre.toUpperCase();
            vgContenedorDatos.Coincidencia = 0;
            var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
            //alert(url)
            makeAjaxRequest(url, "HTML", ejecutaFuncion1, null);
        }
        else 
            Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
    }

    function ejecutaFuncion1(tp, result) {
        //alert(result);
        var rusultado = JSON.parse(result);
        var res = rusultado.result;
        if (res == 0) {
            consultar(GI("cmdAceptar"), GI("frmCharolaSolicitudes"), false);
            Swal.fire('∩xito!', 'Operaci髇 realizada correctamente', 'success');
            //aqui poner el enviar correo PLD 
        }
        else if (res == 1) {
            Swal.fire('Aviso', 'El Registro ya existe',  'warning');
        }
        else {
            Swal.fire('Aviso', 'Ocurrio un error al realizar la Operacion.',  'warning')}
        hideWaitLayer();
    }

    function limpiarConsultas() {
        GI("paramFiso").value = "";
        GI("paramnumfolio").value = "";
    }

    function enviaCorreoRechazo(proyecto) {
        //Swal.fire('∩xito!', 'Operaci髇 realizada correctamente', 'success');
        var idLink = "linkReporteNew";
        var parametrosUrl = new Object;
        parametrosUrl.sendToJSP = "true";
        // Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte = "/modules/Formalizacion/CorreoRechazo/EnviarCorreo.jsp"
        parametrosUrl.id = "mandaCorreoRechazo";
        parametrosUrl.proyecto = proyecto;
        var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
        //alert(url)
        idLink.href = url;
        window.open(url, GI("linkReporteNew").value, "width=450,height=205,scrollbars=NO");
        //idLink.click();
        document.onreadystatechange = function () {
            hideWaitLayer();
            document.onreadystatechange = function () {
            }
        }
    }

    function enviaCorreoAcepta(proyecto) {
        //Swal.fire('∩xito!', 'Operaci髇 realizada correctamente', 'success');
        var idLink = "linkReporteNew";
        var parametrosUrl = new Object;
        parametrosUrl.sendToJSP = "true";
        // Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte = "/modules/Formalizacion/CorreoAutorizaExp/EnviarCorreo.jsp"
        parametrosUrl.id = "mandaCorreoAcepta";
        parametrosUrl.proyecto = proyecto;
        var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
        //alert(url)
        idLink.href = url;
        window.open(url, GI("linkReporteNew").value, "width=450,height=205,scrollbars=NO");
        //idLink.click();
        document.onreadystatechange = function () {
            hideWaitLayer();
            document.onreadystatechange = function () {
            }
        }
    }

    function enviaCorreoPLD(proyecto, cvePersona, numFidben) {
        //parametro ANT_NUM_PROSPECTO AFB_CVE_PERSONA AFB_NUM_FIDBEN
        //Swal.fire('∩xito!', 'Operaci髇 realizada correctamente', 'success');
        var idLink = "linkReporteNew";
        var parametrosUrl = new Object;
        parametrosUrl.sendToJSP = "true";
        // Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte = "/modules/Formalizacion/CorreoPLD/EnviarCorreo.jsp"
        parametrosUrl.id = "mandaCorreoPLD";
        parametrosUrl.numProspecto = proyecto;
        parametrosUrl.cvePersona = cvePersona;
        parametrosUrl.numFidben = numFidben;
        var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
        //alert(url)
        idLink.href = url;
        window.open(url, GI("linkReporteNew").value, "width=450,height=205,scrollbars=NO");
        //idLink.click();
        document.onreadystatechange = function () {
            hideWaitLayer();
            document.onreadystatechange = function () {
            }
        }
    }