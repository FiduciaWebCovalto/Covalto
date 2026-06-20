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
  arrTblDatCharSol[0] = "semaforo,500px";
  arrTblDatCharSol[1] = "insNumContrato,350px";
  arrTblDatCharSol[2] = "insNumFolioInst,100px";
  arrTblDatCharSol[3] = "tipoOperacion,250px";
  arrTblDatCharSol[4] = "monto,250px,right";
  arrTblDatCharSol[5] = "monNomMoneda,400px";
  arrTblDatCharSol[6] = "fcbaClabeCba,500px";  
  arrTblDatCharSol[7] = "fretNomBeneficiario,550px";
  arrTblDatCharSol[8] = "fretDescripcion,400px";
  arrTblDatCharSol[9] = "periodicidad,300px";
  arrTblDatCharSol[10] = "insCveStInstruc,300px";
  arrTblDatCharSol[11] = "eageFecFinEvento,300px";
  
  function clickTablaCharSol(pk) {
    pkInfoCharSol = pk;
    cloneObject(pk,cat.getCatalogo());
    hide('trNuevoMonto')
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

function cargaPantallaInstrucciones() {
    onButtonClickPestania("Administracion.Recurrentes.CharolaSolicitudAdmon","");
}

function rowInstruccion(row) {
    row.children[1].innerHTML = '<img src="imagenes\\table\\bullets\\' + row.children[1].innerHTML + '.png">';
}