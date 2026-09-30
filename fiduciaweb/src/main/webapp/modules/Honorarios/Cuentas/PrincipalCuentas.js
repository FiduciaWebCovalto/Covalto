var cat = new Catalogo("mx.com.inscitech.fiducia.domain.PacahonCtoInver"); //Cambiar catalogo a Cuentas

var strIdPK = "pacNumCto,pacCtoInver";
var arrIdPK = strIdPK.split(",");
var modo2 = 0;
var pkInfo2 = null;
var cmbCtoInver; //JSON.parse("{\"chido\":19}")
var arrTblDat = new Array();

arrTblDat = new Array();
arrTblDat[0] = "pacNumCto,40px";
arrTblDat[1] = "pacCtoInver,300px";

function clickTabla2(pk){
  cloneObject(pk,cat.getCatalogo());
  pkInfo2 = pk;
}

function cargaMantenimientoCuentas(Modo){
  modo = Modo;
  if((isDefinedAndNotNull(pkInfo2) || Modo == OPER_ALTA) && Modo != OPER_BAJA){
    showWaitLayer();
    var objDatosCuentas = new Object();
    objDatosCuentas.Fideicomiso = GI("paramFideicomiso").value;
    var urlCliente = "modules/Honorarios/Cuentas/MantenimientoCuentas.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoCuentas, objDatosCuentas);
  }else if(isDefinedAndNotNull(pkInfo2) && Modo == OPER_BAJA){
    ejecutaOperacionCuenta();
  }
}

function despliegaPantallaMantenimientoCuentas(obj, result) {
  GI("dvContenido").innerHTML = result;
  GI("dirNumContrato").value = obj.Fideicomiso;
  deshabilitaPK("pacNumCto,pacCtoInver".split(","));
  initForms();
  if(modo == OPER_ALTA)
    muestraObjs("cmdAceptar,cmdCancelar");
}

function asignaValues2ObjHTML(){
  if(isDefinedAndNotNull(pkInfo2) && modo != OPER_ALTA){
    cat.setOnUpdate(cargaCmbInver);
    cat.buscaCatalogoPK(false);
  }else{
    asignaSecuencialDireccion();
  }
}
function cargaCmbInver(){
  cmbEstadosParam.clavePais = cat.getCatalogo().dirNumPais;
  SA(GI("dirNumEstado"),"next","cargaComplementoDireccion");
  loadElement(GI("dirNumEstado"));
}

function cargaPrincipalCuenta2(){
  showWaitLayer();
  pkInfo2 = null;
  var objDatosFideicomitente = new Object();
  objDatosDirecciones.Fideicomiso = GI("paramFideicomiso").value;
  objDatosDirecciones.nomFideicomiso = GI("nomFideicomiso").innerHTML;
  var urlCliente = "modules/Honorarios/Cuentas/PrincipalCuentas.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipalDirecciones, objDatosFideicomitente);
}

function ejecutaOperacionCuenta(){
  cat.setOnUpdate(verificaOperacionCuenta);
  if(modo == OPER_ALTA){
    if(fvCat.checkForm()){
      showWaitLayer();
      cat.altaCatalogo();
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
    cargaPrincipalCuenta2();
  hideWaitLayer();
}