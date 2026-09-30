  //***DEFINICON DE LOS BEANS**************************************************************************************************************
  var cat = new Catalogo("mx.com.inscitech.fiducia.domain.Instrucc");
  
  //***VARIABLES GLOBALES******************************************************************************************************************
  
  var parametrosCharola = JSON.parse("{}");
  parametrosCharola.idEtapa = GI("paramIdEtapa").value;
  //parametrosCharola.idTipoSolicitud = GI("paramIdTipoSolicitud").value;
  //parametrosCharola.tipoSolicitud = GI("paramTipoSolicitud").value;
  
  var paramsQryDocumentsCbo;
  var paramFideicomiso;
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
  arrTblDatCharSol[0] = "semaforo,400px";
  arrTblDatCharSol[1] = "obligacion,1000px";
  arrTblDatCharSol[2] = "insNumContrato,1500px";
  arrTblDatCharSol[3] = "insNumFolioInst,100px";
  arrTblDatCharSol[4] = "fbisFechaIni,400px";  
  arrTblDatCharSol[5] = "ctoCveStContrat,300px";
  arrTblDatCharSol[6] = "insCveTipoInstr,100px";
  arrTblDatCharSol[7] = "insTxtComentario,600px";
  arrTblDatCharSol[8] = "concepto,300px";
  arrTblDatCharSol[9] = "monto,500px";
  arrTblDatCharSol[10] = "beneficiario,500px";
  arrTblDatCharSol[11] = "fusuNombreUsuario,300px";
  arrTblDatCharSol[12] = "ateNomEjecutivo,300px";
  arrTblDatCharSol[13] = "back1,300px";
  arrTblDatCharSol[14] = "back2,300px";
  arrTblDatCharSol[15] = "recurrente,100px";
  
  function clickTablaCharSol(pk) {
    pkInfoCharSol = pk;
    cloneObject(pk,cat.getCatalogo());
  }
  
  var arrTblDatPtoRev = new Array();
  arrTblDatPtoRev[0] = "fpurIdPuntorev,50px";
  arrTblDatPtoRev[1] = "fpurDescripcion,550px";
  arrTblDatPtoRev[2] = "frxoRevCorrecta,200px";
  arrTblDatPtoRev[3] = "frxoExcepcion,200px";
  arrTblDatPtoRev[4] = "frxoCausaRechazo,400px";
  arrTblDatPtoRev[5] = "frxoSubsanable,250px";
  arrTblDatPtoRev[6] = "frxoFacultado,200px";
  arrTblDatPtoRev[7] = "frxoEstatus,200px";
  
    function clickTablaPtoRev(pk) {
        pkInfoPtoRev = pk;
        cloneObject(pk,cat.getCatalogo());
        
        if(pk.frxoObservacion != "null") {
            GI("txtObservaciones").value = pk.frxoObservacion;
        } else {
            GI("txtObservaciones").value = "";
        }
    }
  
    function setOrder(obj) {
        for(var i = 1; i <= 15; i++) {
            GI("paramOrder" + i).value = "";
        }
        GI("paramOrder" + obj.value).value = "S";
    }
  
  ///////////////////////////////////////////////////////////////////////FUNCIONALIDAD DEL MODULO////////////////////////////////////////////////////////////////////
  //***FUNCIONALIDAD BOTONES*********************************************************************************************************************
  var nNumSolicitud;
    function funcionDelBoton(opc) {
       if(isDefinedAndNotNull(pkInfoCharSol)) {
          //SE VALIDA SI TIENE UNA SUBCLASIFICACION LA SOLICITUD
          nNumSolicitud = pkInfoCharSol.insNumOper;
          vgContenedorDatos = null;
          vgContenedorDatos = JSON.parse("{\"id\":\"verificaExistenciaRegistroSolicitudSubC\"}");
          vgContenedorDatos.Solicitud = pkInfoCharSol.insNumOper;
          var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
          makeAjaxRequest(url, "HTML", obtenNumSubClasifica, opc);   
      }
      else{
        Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
      }
    }
    
  function obtenNumSubClasifica(obj, result){
     //alert(obj);
     //alert(vgFunSubClasifica);
     var resultado = JSON.parse(result)[0];
     var existe = resultado.existeRegistro;
     //alert(existe)
    if(obj==vgFunPtoRev||obj==vgFunDoc) {
            if(existe==0)   {
                  txtPerfil = GI("Perfil").value;
                  userId = GI("txtuserId").value;
                  vgEtapa = GI("paramEtapa").value;
                  vgTipoSolicitud = pkInfoCharSol.insTxtComentario;
                  paramsQryDocumentsCbo = JSON.parse("{\"numOper\":\"" + pkInfoCharSol.insNumOper + "\",\"numEtapa\":\""+ parametrosCharola.idEtapa +"\"}");
                  showWaitLayer();
                 if(obj==vgFunPtoRev||obj==vgFunDoc){
                    obtenerDatosPrevioCargarPantallaMantto(obj);
                 }
            }
            else{
                Swal.fire('Aviso', 'Debe de indicar la subclasificacion de la Solicitud.',  'warning');
            }
      }else{ 
        if(obj==vgFunSubClasifica && existe==0){
            Swal.fire('Aviso', 'La Solicitud seleccionada no tiene SubClasificacion',  'warning');
        }
        else{
              txtPerfil=GI("Perfil").value;
              userId=GI("txtuserId").value;
              vgEtapa=GI("paramEtapa").value;
              vgTipoSolicitud=pkInfoCharSol.insTxtComentario;
              paramsQryDocumentsCbo = JSON.parse("{\"numOper\":\"" +pkInfoCharSol.insNumOper + "\",\"numEtapa\":\""+ parametrosCharola.idEtapa +"\"}");
              showWaitLayer();        
            obtenerDatosPrevioCargarPantallaMantto(obj);
        }
      }
  }    
    
    function obtenerDatosPrevioCargarPantallaMantto(opc){
      vgContenedorDatos=null;
      vgContenedorDatos=JSON.parse("{\"id\":\"obtenNumEtapa\"}");
      vgContenedorDatos.tipoSol= parametrosCharola.idTipoSolicitud;
      vgContenedorDatos.numEtapa=GI("paramIdEtapa").value;
      var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
      //alert(url);
      makeAjaxRequest(url, "HTML", obtenNumEtapaYa, opc);
  }
  
  function obtenNumEtapaYa(obj,result){
     //alert(result);
     var resultado = JSON.parse(result)[0];
     vgNumEtapa=resultado.fetaSecEtapa;
     vgIdEtapa=resultado.fetaIdEtapa;
     var qryObtenFecha=JSON.parse("{\"id\":\"obtenFecha\"}");
     var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(qryObtenFecha);
     makeAjaxRequest(url, "HTML", funcObtenFecha, obj);
  }
  
  function funcObtenFecha(obj,result){
    var resultado = JSON.parse(result)[0];
    vgFecIni=resultado.fecha;
    vgFecFin=resultado.fecha;
    vgContenedorDatos=null;
    vgContenedorDatos=JSON.parse("{\"id\":\"determinarFisoFoseg\"}");
    vgContenedorDatos.numFiso=pkInfoCharSol.insNumContrato;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
    //alert(url);
    makeAjaxRequest(url, "HTML", determinandoFisoFoseg, obj);
  }
  
    function determinandoFisoFoseg(obj,result){
        var respuesta=JSON.parse(result)[0];
        obtenerDatosParaPantallaMantenimiento(obj);
    }
  
    function obtenerDatosParaPantallaMantenimiento(opc){
        recogerDatosParaPantallaMantenimiento(opc);
    }
  
  function datosObtenidos(opc,result){
      //alert(result);
      var rusultado= JSON.parse(result);
      var res=rusultado.result
      if(res==0)
         recogerDatosParaPantallaMantenimiento(opc);
      else {
         Swal.fire('Aviso', 'ocurrio un error al obtener los datos de la ficha unica',  'warning')}
  }
  
    function recogerDatosParaPantallaMantenimiento(opc){
        vgContenedorDatos=null;
        vgContenedorDatos=JSON.parse("{\"id\":\"conNomFid\"}");//PRIMERO SE PROCESA LA BITACORA
        vgContenedorDatos.numFideicomiso=eval(pkInfoCharSol.insNumContrato);
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
        makeAjaxRequest(url, "HTML", recogiendoDatos, opc);  
    }
  
  function recogiendoDatos(obj,result){
      //alert(result);
      vgValor=JSON.parse(result)[0];
      cargaTipoPantalla(obj);
  }
   /*
function recogerDatosParaPantallaMantenimiento(opc){
    recogiendoDatos();
  }
  
  function recogiendoDatos(){
      cargaTipoPantalla();
  }*/
  
  function cargaTipoPantalla(opcion){
       if(eval(opcion)==eval(vgFunPtoRev)){
  /*alert("cargaTipoPantallaErick"+vgFunPtoRev)
  alert("cargaTipoPantallaErick2"+eval(opcion))       */
          var urlCliente = ctxRoot + "/modules/MesaControl/Rechazadas/PuntosRevisionSolicitudesAdmon.do";
          makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, opcion);
       }
       if(eval(opcion)==eval(vgFunSubClasifica)){
          var urlCliente = ctxRoot + "/modules/MesaControl/Rechazadas/SubclasificaSolicitudesAdmon.do";
          makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, opcion);
       }       
       else if(eval(opcion)==eval(vgFunDoc)){
          //alert("cargaTipoPantalladoctos"+opcion)  
          var urlCliente = ctxRoot + "/modules/MesaControl/Rechazadas/DocumentosSolicitudesAdmon.do";
          makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, opcion);
       }
    }
    
    function despliegaPantalla(obj, result){
      GI("dvPantalla").innerHTML = result;
      initForms();
      //alert("despliegaPantalla "+obj)
      if(obj==vgFunPtoRev){
         //Agregando la funcionalidad del required
          fvCat.setup({
            formName      : "frmPtosSol",
            tipoAlert     : 1,
            alertFunction : BaloonAlert,
            sendObjToAlert: true
          });
          //hideWaitLayer();
         cat.buscaCatalogoPK(false);
         asignaValoresAobjetosFormulario2(obj);
      } else{//FUNCIONALIDAD DOCUMENTOS
        //Agregando la funcionalidad del required
            fvCat.setup({
              formName      : "frmDocumentos",
              tipoAlert     : 1,
              alertFunction : BaloonAlert,
              sendObjToAlert: true
            });
            cat.buscaCatalogoPK(false);
            asignaValoresAobjetosFormulario(obj);
      }
    }

    function asignaValoresAobjetosFormulario2(opcion) {
        asignaEtiqueta("divRMCliente", pkInfoCharSol.fusuNombreUsuario == "CLIENTE"? "Cliente" : "CM");
        GI("fusuNombreUsuario").value = pkInfoCharSol.fusuNombreUsuario;
        GI("txtComentario").value = pkInfoCharSol.insTxtComentario;
        GI("ctoCveStContrat").value = pkInfoCharSol.ctoCveStContrat;
        GI("insNumContrato").value = pkInfoCharSol.insNumContrato;
        GI("txtNomContraro").value = vgValor.nombre;
        GI("txtConcepto").value = pkInfoCharSol.concepto;
        GI("paramEtapa").value = vgEtapa;
        
        loadElement(GI("cboCausaRechazo"));
                
        cat.setOnUpdate(cargaTablaParaPtosRev);
    }

    
    function asignaValoresAobjetosFormulario(opcion){
        //alert(vgValor.ctoNomContrato);
        //GI("ins").value=vgValor.ctoNumContrato;
        //alert(nNumSolicitud)
        
        GI("txtNumContrato").value=pkInfoCharSol.insNumContrato
        GI("txtNomContraro").value=vgValor.nombre;
        GI("txtInsOperacion").value=vgTipoSolicitud;
        GI("paramEtapa").value=vgEtapa;
        if(opcion==vgFunSubClasifica) {   
        //Swal.fire('Aviso', 'llego aki 2',  'warning')//alert(nNumSolicitud)
        GI("paramFideicomiso").value=nNumSolicitud;      
        SA(GI("cboNombre"),"next","formsLoaded");
        loadElement(GI("cboNombre"));  
        //formsLoaded();
      }
      
      /*if(opcion==vgFunPtoRev)
        cat.setOnUpdate(cargaTablaParaPtosRev);
      else*/
          cat.setOnUpdate(formsLoaded);
    }
    
  //***funciones auxiliares****************************************************************************************
  function verNomFiso(){
    consultaNombreFideicomiso('nomFideicomiso',GI("paramContrato"));
  }
  
  function regresarAlaCharola(){
    onButtonClick("/MesaControl/Rechazadas/CharolaSolicitudAdmon","");
    hideWaitLayer();
  }
  
    function cargaTablaParaDocumentos(){
        vgContenedorDatos=null;
        vgContenedorDatos = new Object();
        vgContenedorDatos.tipo=2
        vgContenedorDatos.perfil=txtPerfil;
        eval(pkInfoCharSol.insNumOper)==null?vgContenedorDatos.numOper=0:vgContenedorDatos.numOper= pkInfoCharSol.insNumOper;
        vgContenedorDatos.fiso=pkInfoCharSol.insNumContrato
        vgContenedorDatos.numfolio=GI("insNumFolioInst").value;
        vgContenedorDatos.documento=GI("cboNombre").value;
        despliegaTabla(GI("tblRegDocumentos"),vgContenedorDatos);
    }
  
    function cargaTablaParaPtosRev() {
        vgContenedorDatos = null;
        vgContenedorDatos = new Object();
        vgContenedorDatos.tipo = 1;
        vgContenedorDatos.perfil = txtPerfil;
        eval(pkInfoCharSol.insNumOper) == null ? vgContenedorDatos.numOper = 0:vgContenedorDatos.numOper = pkInfoCharSol.insNumOper;
        vgContenedorDatos.fiso = GI("insNumContrato").value;
        vgContenedorDatos.numfolio = GI("insNumFolioInst").value;
        vgContenedorDatos.documento = 0;
        //alert("datos ptos rev:"+vgContenedorDatos);
        despliegaTabla(GI("tblRegPtosRev"), vgContenedorDatos);
    }
  
    function despliegaTabla(tabla,obj){
        vgObjqryllenaTablaAdmon=JSON.parse("{\"id\":\"qryllenaTablaAdmon\"}");
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
        if(isDefinedAndNotNull(resultado) && resultado.length>0){
            loadTableElement(objTabla, result);
            hideWaitLayer();
        } else {
            Swal.fire('Aviso', 'No existen Registros para estos criterios de búsqueda',  'warning');
            regresarAlaCharola();
            hideWaitLayer();
        } 
    }

  //***FUNCIONALIDAD DEL BOTON GUARDAR*********************************************************************************
  
  function guardar(tp) { //tp = tipo pantalla: ptos revision o documentos
   if(fvCat.checkForm()){
    if(isDefinedAndNotNull(pkInfoPtoRev)) {
          if(tp==1) {//FUNCIONALIDAD AL GUARDAR PARA PTOS DE REVISION
            vgContenedorDatos=null;
            vgContenedorDatos=JSON.parse("{\"id\":\"funcionAceptarRechazarCharolaSolPtosRev\"}");//PRIMERO SE PROCESA LA BITACORA
            vgContenedorDatos.opcion=eval(tp);
            vgContenedorDatos.contrato=eval(GI("insNumContrato").value);
            vgContenedorDatos.folio=eval(GI("insNumFolioInst").value);
            vgContenedorDatos.numEtapa=eval(vgNumEtapa);
            vgContenedorDatos.numOper=pkInfoCharSol.insNumOper;
            vgContenedorDatos.idEtapa=eval(vgIdEtapa);
            vgContenedorDatos.idPtoRev=eval(pkInfoPtoRev.fpurIdPuntorev);
            if(GI("rdSi").checked==true) vgContenedorDatos.revCorrecta="S"
            if(GI("rdNo").checked==true) vgContenedorDatos.revCorrecta="N"
            vgContenedorDatos.obsrvacion=GI("txtObservaciones").value;
            vgContenedorDatos.Fecha=vgFecIni;
            vgContenedorDatos.numUsuario=eval(userId);
            vgContenedorDatos.firma=0;
            vgContenedorDatos.idDoc=0;
            var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
            //alert(url)
            makeAjaxRequest(url, "HTML", ejecutaFuncion, tp);
          } else if(tp==3) {//FUNCIONALIDAD PARA SUBCLASIFICAR
            vgContenedorDatos=null;
            vgContenedorDatos=JSON.parse("{\"id\":\"funcionSubClasificacion\"}");//PRIMERO SE PROCESA LA BITACORA
            vgContenedorDatos.folio=eval(GI("insNumFolioInst").value);
            vgContenedorDatos.numOper=eval(GI("txtInsOperacion").value);
            var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
            //alert(url)
            makeAjaxRequest(url, "HTML", ejecutaFuncion, tp);
          } else {//FUNCIONALIDAD AL GUARDAR DOCUMENTOS
            vgContenedorDatos=null;
            vgContenedorDatos=JSON.parse("{\"id\":\"funcionAceptarRechazarCharolaSolPtosRev\"}");//PRIMERO SE PROCESA LA BITACORA
            vgContenedorDatos.opcion=eval(tp);
            vgContenedorDatos.contrato=pkInfoCharSol.insNumContrato;
            vgContenedorDatos.folio=eval(GI("insNumFolioInst").value);
            vgContenedorDatos.numEtapa=eval(vgNumEtapa);
            vgContenedorDatos.numOper=pkInfoCharSol.insNumOper;
            vgContenedorDatos.idEtapa=eval(vgIdEtapa);
            vgContenedorDatos.idPtoRev=eval(pkInfoPtoRev.fpurIdPuntorev);
            if(GI("rdSi").checked==true) vgContenedorDatos.revCorrecta="S"
            if(GI("rdNo").checked==true) vgContenedorDatos.revCorrecta="N"
            vgContenedorDatos.obsrvacion=GI("txtObservaciones").value;
            vgContenedorDatos.Fecha=vgFecIni;
            vgContenedorDatos.numUsuario=eval(userId);
            vgContenedorDatos.firma=0;
            vgContenedorDatos.idDoc=eval(GI("cboNombre").value);
            var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
            //alert(url)
            makeAjaxRequest(url, "HTML", ejecutaFuncion, tp);
          }
    }else {
       Swal.fire('Aviso', 'Selecciona un punto de revision de la tabla',  'warning');
    }
   }
  }
  
  function ejecutaFuncion(tp,result){
     //alert(result);
     var resultado= JSON.parse(result);
     var res=resultado;
     if(res.result==0){
        if(tp==1) {
           Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
           cargaTablaParaPtosRev();
           GI("txtObservaciones").value = "";
        } else if(tp==1) {
           Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
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
        vgContenedorDatos=JSON.parse("{\"id\":\"funcionAceptarRechazarCharolaSol\"}");
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
    var sMensaje = "";
    var resp = JSON.parse(resultado);
    var r = resp.result
    
    switch(r) {
        case -1: 
            Swal.fire('Aviso', 'A ocurrido un error',  'warning'); 
        break;
        case 0:
            /*
            if(obj != 1) {
                if(obj == 1)
                    sMensaje="SOLICITUD DE OTROS SERVICIOS RECHAZADA\n";
                sMensaje+="\nFolio: "+pkInfoCharSol.insNumFolioInst ;
                sMensaje+="\nFideicomiso: "+pkInfoCharSol.insNumContrato ;
                sMensaje+="\nServicio: "+pkInfoCharSol.insTxtComentario ;
                sMensaje+="\nOperada por el usuario: "+GI("paramNombreUsuario").value;
                /*sign(sMensaje);
                if(iFirmaSatisfactoria==0)      
                //{*  
                //enviaCorreo(pkInfoCharSol.insNumFolioInst);
                //Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');  
                //consultar(GI("cmdAceptar"), GI("frmCharolaSolicitudes"), false); 
                //*}*
            } else {
                if(obj == 1)
                    sMensaje="SOLICITUD DE OTROS SERVICIOS AUTORIZADA\n"
                else 
                    sMensaje="SOLICITUD DE OTROS SERVICIOS RECHAZADA\n"
                sMensaje+="\nFolio: "+pkInfoCharSol.insNumFolioInst ;
                sMensaje+="\nFideicomiso: "+pkInfoCharSol.insNumContrato ;
                sMensaje+="\nServicio: "+pkInfoCharSol.insTxtComentario ;
                sMensaje+="\nOperada por el usuario: "+GI("paramNombreUsuario").value;
                //*sign(sMensaje);
                if(iFirmaSatisfactoria==0)      
                //{*
                vgContenedorDatos=null;
                vgContenedorDatos=JSON.parse("{\"id\":\"funcionAceptarRechazarCharolaSolFrmElec\"}");
                vgContenedorDatos.opcion=eval(obj);
                vgContenedorDatos.numEtapa= parametrosCharola.idEtapa ;
                vgContenedorDatos.contrato=eval(pkInfoCharSol.insNumContrato);
                vgContenedorDatos.folio=eval(pkInfoCharSol.insNumFolioInst);
                vgContenedorDatos.numOper=pkInfoCharSol.insNumOper;
                vgContenedorDatos.usuario=eval(GI("txtuserId").value)
                vgContenedorDatos.subioImagen=eval(0)		
                var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
                makeAjaxRequest(url, "HTML", ejecutaAutorizaRechazaFrmElec, null);      
                /*} */
            //}
            Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success'); 
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
  
function ejecutaAutorizaRechazaFrmElec(obj, resultado){ 
    var resp = JSON.parse(resultado);
    var r = resp.result  
    switch(r) {
        case -1: 
            Swal.fire('Aviso', 'A ocurrido un error',  'warning'); 
        break;
        case  0: 
            //enviarFirma(); 
            //TODO: Invocar WS para pago, if tipo liquidacion o retiro -> spei | traspaso - ws traspasos
            //enviaCorreo(pkInfoCharSol.insNumFolioInst);	  
            Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success'); 
            //consultar(GI("cmdAceptar"), GI("frmCharolaSolicitudes"), false); 
        break;
    }   
}
  
  function fin(){}
  
  function generaReporte(){
     var idLink = "linkReporteNew"; 
     var parametrosUrl = new Object;
     parametrosUrl.sendToJSP="true";
     parametrosUrl.urlReporte="/jsp/Reportes/MesaControl/Finalidades.jsp"
     parametrosUrl.id="repFinalidadesMesaControl";
     parametrosUrl.fiso=pkInfoCharSol.insNumContrato
     var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
     var link = GI(idLink);
     link.href=url;
     link.click();
     document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
  }

  function  AgregaArchivo(){
     var idLink = "linkReporteNew"; 
     var parametrosUrl = new Object;
     parametrosUrl.sendToJSP="true";
     parametrosUrl.urlReporte="/jsp/Reportes/MesaControl/AgregaArchivo.jsp"
     parametrosUrl.id="repFinalidadesMesaControl";
     parametrosUrl.fiso=567;
     var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
     var link = GI(idLink);
     link.href=url;
     link.click();
     document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
  }

//codigo para ubicar la tabla principal en el folio solicitado
function regresarAlaCharola2(){
    showWaitLayer();   
    var objDatosFolio = new Object();
    objDatosFolio.numFolio = GI("insNumFolioInst").value;  
    objDatosFolio.Etapa = GI("paramEtapa").value; 
    var urlCliente = "modules/MesaControl/Rechazadas/CharolaSolicitudAdmon.do";
    makeAjaxRequest(urlCliente, "HTML", ubicaFolioSolicitado, objDatosFolio);    
  }
  
  function ubicaFolioSolicitado(obj, result){
    GI("dvContenido").innerHTML = result;
    pkInfo = null;
    var botonTemp2 = GI("cmdLimpiar");
    //GI("paramnumEtapa").value= parametrosCharola.idEtapa ;    
    SA(botonTemp2,"ref","qryMuestraNombreEtapaM");
    SA(botonTemp2,"fun","loadTxtElementX");
    SA(botonTemp2,"tabla","paramEtapa");
    consultar(botonTemp2, GI("frmCharolaSolicitudes"), false);     
    var botonTemp = GI("cmdLimpiar");
    GI("paramFolio").value=obj.numFolio;    
    GI("paramEtapa").value=obj.Etapa;    
    SA(botonTemp,"ref","qryCharolInstrucAdmon3");
    SA(botonTemp,"fun","loadTableElement");
    SA(botonTemp,"tabla","tblRegCharSol");
    consultar(botonTemp, GI("frmCharolaSolicitudes"), false);  
    formsLoaded();
  }  
  
  function enviarFirma(){
     idLink = "linkReporteNew"; 
     var parametrosUrl = new Object;
     parametrosUrl.sendToJSP="true";
     /*if(pkcs7_=="")
      pkcs7_="vacio"*/
     //parametrosUrl.urlReporte="/jsp/Reportes/MesaControl/EnviarFirma.jsp";
     parametrosUrl.urlReporte="/modules/MesaControl/CharolaInstruccionAdmon/EnviarFirma.jsp";
     parametrosUrl.id="muestraDatosInstruFrmElec";
     parametrosUrl.FolioFiducia=eval(pkInfoCharSol.insNumFolioInst);
     parametrosUrl.ParamJsp_pk=pkcs7_;//;+"&SignedText="+sMensaje;
     parametrosUrl.ParamJsp_Text=sMensaje;
     parametrosUrl.ParamJspFolioFiducia=pkInfoCharSol.insNumFolioInst+"";
     var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
     idLink.href=url;
     window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");        
     document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
  } 
  
  
  
function getViewer(obj){

  var uris=GA(this,'uris'); var names=GA(this,'names');  var target=GA(this,'target');  if(target=='new' || target=='blank'){window.open(ctxRoot+'/jsp/Global/Visualizer.jsp?uris='+uris+'&names='+names);  }else{Swal.fire('Aviso', 'Modulo en desarrollo',  'warning')}
}

  function enviaCorreo(folio){
     var idLink = "linkReporteNew"; 
     var parametrosUrl = new Object;
     parametrosUrl.sendToJSP="true";
   // Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte="/modules/Administracion/Agenda/EnviarCorreo.jsp"
     parametrosUrl.id="mandaCorreoInstrucc";
     parametrosUrl.folio=folio;
     var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
	 //alert(url)
     idLink.href=url;
     window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");        
     //idLink.click();
     document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
  }
  
  function viewDoc(objBtn) {
	var objSel = GI('cboNombre');
	var objLnk = GI('docLink');
	var url = "#";
	//alert(objSel.value)
	switch(parseInt(objSel.value)) {
		case 100: //Solicitud de Revocacion Firmada
			url = ctxRoot + "/temp/solicitud.pdf";
			break;
		case 101: case 301: //Identificacion Oficial vigente
			url = ctxRoot + "/temp/identificacion.pdf";
			break;
		case 102: //En su caso Acuerdo del Comite
			url = ctxRoot + "/temp/acuerdo.pdf";
			break;
		case 103: //Copia del Poder a Revocar
			url = ctxRoot + "/temp/poder.pdf";
			break;
		case 103: //Copia del Poder a Revocar
			url = ctxRoot + "/temp/poder.pdf";
			break;	
		case 300: //Copia del Poder a Revocar
			url = ctxRoot + "/temp/instruccionpago.pdf";
			break;				
		default:
			Swal.fire('Aviso', 'Seleccione un documento',  'warning');
	}
	
	SA(objLnk, "href", url);
	objLnk.click();
}

function rowInstruccion(row) {
    row.children[1].innerHTML = '<img src="imagenes\\table\\bullets\\' + row.children[1].innerHTML + '.png">';
}

function rowPuntoRevision(row) {
    var pk = JSON.parse("{" + GA(row, "valorItem") + "}");
    
    var id = "cboCumple" + pk.fpurIdPuntorev;
    row.children[3].innerHTML = GI("divCumple").innerHTML.replace("cboCumple", id).replace("pk", pk.fpurIdPuntorev);
    if(trim(pk.frxoRevCorrecta) != "null") {
        GI(id).value = trim(pk.frxoRevCorrecta);
    } else {
        GI(id).value = "S";
    }
    show(id);
    
    id = "cboExcepcion" + pk.fpurIdPuntorev;
    row.children[4].innerHTML = GI("divExcepcion").innerHTML.replace("cboExcepcion", id).replace("pk", pk.fpurIdPuntorev);
    if(trim(pk.frxoExcepcion) != "null") {
        GI(id).value = trim(pk.frxoExcepcion);
    } else {
        GI(id).value = "N";
    }
    show(id);
    
    id = "cboCausaRechazo" + pk.fpurIdPuntorev;
    row.children[5].innerHTML = GI("divCausaRechazo").innerHTML.replace("cboCausaRechazo", id);
    if(trim(pk.frxoCausaRechazo) != "null") {
        GI(id).value = trim(pk.frxoCausaRechazo);
    } else {
        GI(id).value = "-1";
    }
    show(id);
    
    id = "cboSubsanable" + pk.fpurIdPuntorev;
    row.children[6].innerHTML = GI("divSubsanable").innerHTML.replace("cboSubsanable", id);
    if(trim(pk.frxoSubsanable) != "null") {
        GI(id).value = trim(pk.frxoSubsanable);
    } else {
        GI(id).value = "N";
    }
    show(id);
    
    row.children[7].innerHTML = pkInfoCharSol.ateNomEjecutivo;
}

function aplicaReglasCumple() {
    var id = pkInfoPtoRev.fpurIdPuntorev;
    if(GI("cboCumple" + id).value == "S") {
        GI("cboExcepcion" + id).value = "N";
        GI("cboCausaRechazo" + id).value = "-1";
        GI("cboSubsanable" + id).value = "N";
        disableElement(GI("cboExcepcion" + id));
        disableElement(GI("cboCausaRechazo" + id));
        disableElement(GI("cboSubsanable" + id));
        RA(GI("cboCausaRechazo" + id), "required");
    } else {
        GI("cboExcepcion" + id).value = "N";
        GI("cboCausaRechazo" + id).value = "-1";
        enableElement(GI("cboExcepcion" + id));
        enableElement(GI("cboCausaRechazo" + id));
        SA(GI("cboCausaRechazo" + id), "required", "required");
    }
}

function aplicaReglasExcepcion() {
    var id = pkInfoPtoRev.fpurIdPuntorev;
    if(GI("cboExcepcion" + id).value == "S") {
        GI("cboSubsanable" + id).value = "N";
        enableElement(GI("cboSubsanable" + id));
    } else {
        GI("cboSubsanable" + id).value = "N";
        disableElement(GI("cboSubsanable" + id));
    }
}

function guardarRevision() {
    var tp = 1;
    if(fvCat.checkForm()) {
        if(isDefinedAndNotNull(pkInfoPtoRev)) {
            vgContenedorDatos = null;
            vgContenedorDatos = JSON.parse("{}");
            vgContenedorDatos.id = "funcionAceptarRechazarCharolaSolPtosRev";
            vgContenedorDatos.opcion = tp;
            vgContenedorDatos.contrato = eval(GI("insNumContrato").value);
            vgContenedorDatos.folio = eval(GI("insNumFolioInst").value);
            vgContenedorDatos.numEtapa = eval(vgNumEtapa);
            vgContenedorDatos.numOper = pkInfoCharSol.insNumOper;
            vgContenedorDatos.idEtapa = eval(vgIdEtapa);
            vgContenedorDatos.idPtoRev = eval(pkInfoPtoRev.fpurIdPuntorev);
            vgContenedorDatos.revCorrecta = GI("cboCumple" + pkInfoPtoRev.fpurIdPuntorev).value;
            vgContenedorDatos.excepcion = GI("cboExcepcion" + pkInfoPtoRev.fpurIdPuntorev).value;
            vgContenedorDatos.causaRechazo = GI("cboCausaRechazo" + pkInfoPtoRev.fpurIdPuntorev).value != "-1" ? GI("cboCausaRechazo" + pkInfoPtoRev.fpurIdPuntorev).value : "";
            vgContenedorDatos.subsanable = GI("cboSubsanable" + pkInfoPtoRev.fpurIdPuntorev).value;
            vgContenedorDatos.observaciones = GI("txtObservaciones").value;
            vgContenedorDatos.Fecha = vgFecIni;
            vgContenedorDatos.numUsuario = eval(userId);
            vgContenedorDatos.firma = 0;
            vgContenedorDatos.idDoc = 0;
            
            showWaitLayer();
            var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
            makeAjaxRequest(url, "HTML", ejecutaFuncion, tp);
        } else {
            Swal.fire('Aviso', 'Selecciona un punto de revision de la tabla',  'warning');
        }
    }
}

function cargaPantallaInstrucciones() {
      onButtonClickPestania("MesaControl.Rechazadas.CharolaSolicitudAdmon","");
      hideWaitLayer();
}

function enviarCorreoLegal() {
    Swal.fire('Aviso', 'Se enviara correo a legal',  'warning');
}