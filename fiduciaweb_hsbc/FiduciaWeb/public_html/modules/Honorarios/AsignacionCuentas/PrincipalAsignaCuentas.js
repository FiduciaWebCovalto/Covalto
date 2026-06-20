x//***DEFINICON DE LOS BEANS**************************************************************************************************************
var cat = new Catalogo("mx.com.inscitech.fiducia.domain.PacahonCtoInver");

//***VARIABLES GLOBALES******************************************************************************************************************


var modo2 = 0;
var pkProsp2 = null;
var clavesCombo27  = JSON.parse("{\"llaveClave\":27}");
var clavesCombo1006  = JSON.parse("{\"llaveClave\":1006}");
var fvCat = new FormValidator("frmDatos");
var strIdPK = "pacIdCto"; //"PRS_NUM_PROSPECT", "PRC_TIPO_CUENTAS", "PRC_NUM_CUENTAS", "PRC_BANCO"
//var arrIdPK = strIdPK.split(",");
var pacNumCtoin = JSON.parse("{\"pacNumCtoin\":-1}");

//***DEFINICION DEL CONTENIDO DE TABLAS DE CONSULTA**************************************************************************************
//[{"numProspecto":1,"prcBanco":168,"prcNumCuentas":2,"prcTipoCuentas":1,"prsIdCuentas":1}]
var arrTblDatProsp = new Array();
arrTblDatProsp[0] = "pacIdCto,60";
arrTblDatProsp[1] = "pacNumCto,300";
arrTblDatProsp[2] = "pacCtoInver,300";
/*arrTblDatProsp[2] = "prcNumCuentas,60";
arrTblDatProsp[3] = "prcTipoCuentas,150";*/

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
    objDatosCuentas.numProspectParam = GI("parampacNumCto").value;
    pacNumCtoin.pacNumCtoin=GI("parampacNumCto").value;
    var urlCliente = "modules/Honorarios/AsignacionCuentas/MantenimientoAsignaCuentas.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoCuentas, objDatosCuentas);
  }else if(isDefinedAndNotNull(pkProsp2) && Modo == OPER_BAJA){
    //alert(Modo + " X");
    ejecutaOperacionCuenta();
  }
}

function despliegaPantallaMantenimientoCuentas(obj, result) {
  GI("dvPantalla").innerHTML = result;
  GI("pacNumCto").value = obj.numProspectParam;
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
  objDatosFideicomitente.NumContrato = GI("pacNumCto").value;
  var urlCliente = "modules/Honorarios/AsignacionCuentas/PrincipalAsignaCuentas.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipalDirecciones, objDatosFideicomitente);
  hideWaitLayer();
}

function ejecutaOperacionCuenta(){
  cat.setOnUpdate(verificaOperacionCuenta);
  if(modo == OPER_ALTA){
    if(fvCat.checkForm()){
        //console.log(JSON.stringify(fvCat));
        //Swal.fire('Aviso', 'Alta de catalogo',  'warning');
        //showWaitLayer();
        cat.altaCatalogo(true);
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