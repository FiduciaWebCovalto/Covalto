//***DEFINICON DE LOS BEANS**************************************************************************************************************
var cat = new Catalogo("mx.com.inscitech.fiducia.domain.ProspectCuentas");

//***VARIABLES GLOBALES******************************************************************************************************************


var modo2 = 0;
var pkProsp2 = null;
var clavesCombo27  = JSON.parse("{\"llaveClave\":27}");
var clavesCombo1006  = JSON.parse("{\"llaveClave\":1006}");
var fvCat = new FormValidator("frmDatos");
var strIdPK = "prsIdCuentas"; //"PRS_NUM_PROSPECT", "PRC_TIPO_CUENTAS", "PRC_NUM_CUENTAS", "PRC_BANCO"
//var arrIdPK = strIdPK.split(",");


//***DEFINICION DEL CONTENIDO DE TABLAS DE CONSULTA**************************************************************************************
//[{"numProspecto":1,"prcBanco":168,"prcNumCuentas":2,"prcTipoCuentas":1,"prsIdCuentas":1}]
var arrTblDatProsp = new Array();
arrTblDatProsp[0] = "prsIdCuentas,60";
arrTblDatProsp[1] = "prcNumCuentas,80";
arrTblDatProsp[2] = "prcNumCuentasBolsa,200";

function clickTablaProsp(pk){
        //console.log("Carga de Tabla!");
	pkProsp2 = pk;
	cloneObject(pk,cat.getCatalogo());
}
var vgnumProspect;
function cargaMantenimientoCuentas(Modo){
  modo = Modo;  
  if((isDefinedAndNotNull(pkProsp2) || Modo == OPER_ALTA) && Modo != OPER_BAJA){
    //alert(Modo + "Pantalla Alta");
    //showWaitLayer();
    var objDatosCuentas = new Object();
    objDatosCuentas.numProspectParam = GI("paramnumProspecto").value;
    var urlCliente = "modules/Formalizacion/AsignacionCuentasActinver/MantenimientoAsignaCuentas.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoCuentas, objDatosCuentas);
  }else if(isDefinedAndNotNull(pkProsp2) && Modo == OPER_BAJA){
    //alert(Modo + " X");
    ejecutaOperacionCuenta();
  }
}

function despliegaPantallaMantenimientoCuentas(obj, result) {
  GI("dvPantalla").innerHTML = result;
  GI("prsNumprospect").value = obj.numProspectParam;
  //deshabilitaPK("pacNumCto");
  initForms();
  
    /*fvCat.setup({
        formName      : "frmDatos",
        tipoAlert     : 1,
        alertFunction : BaloonAlert,
        sendObjToAlert: true
    });*/
  if(modo == OPER_CONSULTAR || modo == OPER_MODIFICAR){
    deshabilitaPK(arrIdPK);
    if(modo == OPER_CONSULTAR){
      deshabilitaObjetos(GI("frmDatos"));
      GI("cmdCancelar").value = "Regresar";
      muestraObj("cmdCancelar");
    }
  }
  if(modo == OPER_ALTA || modo == OPER_MODIFICAR)
    muestraObjs("cmdAceptar,cmdCancelar");
}

function cargaPrincipalDirecciones2(){
  showWaitLayer();
  pkProsp2 = null;
  var objDatosFideicomitente = new Object();
  objDatosFideicomitente.NumContrato = GI("prsNumprospect").value;
  var urlCliente = "modules/Formalizacion/AsignacionCuentasActinver/PrincipalAsignaCuentas.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipalDirecciones, objDatosFideicomitente);
}

function ejecutaOperacionCuenta(){
  cat.setOnUpdate(verificaOperacionCuenta);
  if(modo == OPER_ALTA){
    if(fvCat.checkForm()){
        //console.log(JSON.stringify(fvCat));
        //Swal.fire('Aviso', 'Alta de catalogo',  'warning');
        //showWaitLayer();
        cat.altaCatalogo(true);
        enviaCorreo(GI("prsNumprospect").value);
    }
  }else if(modo == OPER_BAJA){
    showWaitLayer();
    cat.bajaCatalogo(false);
  }
}
function verificaOperacionCuenta(){
  Swal.fire('¡Éxito!', "Operación realizada exitosamente", 'success');
  if(modo == OPER_BAJA)
    consultar(GI("cmdRegresar"), GI("frmDatos"), false);
  else
    cargaPrincipalDirecciones2();
  hideWaitLayer();
}
/*FUNCION PARA MANDAR CORREO DE APERTURA DE CUENTAS*/
function enviaCorreo(proyecto){
     var idLink = "linkReporteNew"; 
     var parametrosUrl = new Object;
     parametrosUrl.sendToJSP="true";
     //Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte="/modules/Formalizacion/AgendaBursatil/EnviarCorreo.jsp"
     parametrosUrl.id="mandaCorreoInstrucBursatil";
	 parametrosUrl.proyecto=proyecto;
     var url = ctxRoot + "/imprimirReporte.do?json=" + encodeURIComponent(JSON.stringify(parametrosUrl));
	 //alert(url)
     idLink.href=url;
     window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");        
     //idLink.click();
     document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
  }