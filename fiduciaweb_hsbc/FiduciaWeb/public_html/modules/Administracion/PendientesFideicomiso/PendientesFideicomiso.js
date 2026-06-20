    //***VARIABLES GLOBALES******************************************************************************************************************  
  var paramsQryDocumentsCbo;
  var paramFideicomiso;
  var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
  var clavesCombo638 = JSON.parse("{\"llaveClave\":638}");
  var clavesCombo1075 = JSON.parse("{\"llaveClave\":1075}");
  var paramPerfil = JSON.parse("{\"orderPerfil\":\"s\"}");
  var paramQueryAdmon = JSON.parse("{\"Order\":\"s\"}");
  
  var vgFunPtoRev = 1;
  var vgFunDoc = 2;
  var vgFunAutorizar = 3;
  var vgFunRechazar = 4;
  var vgFunSubClasifica = 5;
  
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
  
  //***DEFINICION DEL CONTENIDO DE TABLAS DE CONSULTA**************************************************************************************
  var tblDataEMBARGO = new Array();
  tblDataEMBARGO[0] = "col1,200px";
  tblDataEMBARGO[1] = "col2,200px";
  tblDataEMBARGO[2] = "col3,200px";
  tblDataEMBARGO[3] = "col4,200px";
  tblDataEMBARGO[4] = "col5,200px";
  
  var tblDataPODERES = new Array();
  tblDataPODERES[0] = "col1,200px";
  tblDataPODERES[1] = "col2,200px";
  tblDataPODERES[2] = "col3,200px";
  tblDataPODERES[3] = "col4,200px";
  tblDataPODERES[4] = "col5,200px";
  tblDataPODERES[5] = "col6,200px";
  
  var tblDataRDCL = new Array();
  tblDataRDCL[0] = "col1,200px";
  tblDataRDCL[1] = "col2,200px";
  
  var tblDataREMEDIACION = new Array();
  tblDataREMEDIACION[0] = "col1,200px";
  tblDataREMEDIACION[1] = "col2,200px";
  tblDataREMEDIACION[2] = "col3,200px";
  tblDataREMEDIACION[3] = "col4,200px";
  
  var tblDataPREDIALES = new Array();
  tblDataPREDIALES[0] = "col1,200px";
  tblDataPREDIALES[1] = "col2,200px";
  tblDataPREDIALES[2] = "col3,200px";
  tblDataPREDIALES[3] = "col4,200px";
  
  var tblDataJUICIOS = new Array();
  tblDataJUICIOS[0] = "col1,200px";
  tblDataJUICIOS[1] = "col2,200px";
  
  var tblDataDOC_FALTANTE = new Array();
  tblDataDOC_FALTANTE[0] = "col1,200px";
  tblDataDOC_FALTANTE[1] = "col2,200px";
  tblDataDOC_FALTANTE[2] = "col3,200px";
  tblDataDOC_FALTANTE[3] = "col4,200px";
  
  var tablaActual = "";
  function setTablaResultados(tabla) {
    if(tablaActual != "") {
        hide("tbl" + tablaActual);
    }
    show("tbl" + tabla);
    tablaActual = tabla;
    
    SA(GI("cmdAceptar"), "ref", "qry.admon.pendientesFideicomiso." + tabla);
    GI("tblResultados").innerHTML = "";
    SA(GI("tblResultados"), "dataInfo", "tblData" + tabla);
  }
  
  function validaTipoCarga(objBoton, objForma, bool) {
    if(GI("paramTipoCarga").value == "") {
        Swal.fire('Aviso', 'Seleccione el Tipo de Carga a consultar',  'warning');
    } else {
        consultar(objBoton, objForma, bool);
    }
  }
  
  function clickTablaResultados(pk) {
    pkInfoCharSol = pk;
    cloneObject(pk,cat.getCatalogo());
  }
  
  function verNomFiso(){
    consultaNombreFideicomiso('nomFideicomiso',GI("paramContrato"));
  }
  
function autorizaRechaza(operacion) {
    if(isDefinedAndNotNull(pkInfoCharSol)) {
        vgContenedorDatos = JSON.parse("{}");
        vgContenedorDatos.id = "fun.admon.autorizarRechazarInsRec"
        vgContenedorDatos.operacion = operacion;
        vgContenedorDatos.contrato = eval(pkInfoCharSol.insNumContrato);
        vgContenedorDatos.folio = eval(pkInfoCharSol.insNumFolioInst);
        vgContenedorDatos.numEtapa = parametrosCharola.idEtapa;
        vgContenedorDatos.numUsuario = eval(GI("txtuserId").value);
        vgContenedorDatos.monto = GI("txtMonto").value;
        
        if(operacion == 3 && GI("txtMonto").value == "") {
            Swal.fire('Aviso', 'Introduzca un nuevo monto de la instruccion valido',  'warning');
            return;
        }
        
        var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
        makeAjaxRequest(url, "HTML", ejecutaAutorizaRechaza, operacion);
    } else {
        Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
    }
}
  
function ejecutaAutorizaRechaza(obj, resultado) { 
    var resp = JSON.parse(resultado);
    
    switch(resp.result) {
        case -1: 
            Swal.fire('Aviso', 'A ocurrido un error',  'warning'); 
        break;
        case 0:
            Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
            GI("cmdAceptar").click();
        break;
        case 1: 
            Swal.fire('Aviso', 'La instruccion no se puede autorizar porque no es una instruccion hija',  'warning'); 
        break;
        case 2: 
            Swal.fire('Aviso', 'La instruccion no se puede rechazar porque no es una instruccion padre',  'warning'); 
        break;
        case 3: 
            Swal.fire('Aviso', 'La instruccion no cuenta con el estatus correcto para " + (obj == 1 ? "ser autorizada": obj == 2 ? "ser rechazada": "modificar su monto',  'warning'));
        break;
    }
}

function validarModificarMonto() {
    if(!isDefinedAndNotNull(pkInfoCharSol)) { 
        Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
    } else if(pkInfoCharSol.eageFolioPadre == "null") {
        Swal.fire('Aviso', 'No esta permitido modificar el monto de una instruccion padre',  'warning');
    } else {
        show("trNuevoMonto");
    }
}

function cargaPantallaPrincipal() {
    onButtonClickPestania("Administracion.PendientesFideicomiso.PendientesFideicomiso","");
}