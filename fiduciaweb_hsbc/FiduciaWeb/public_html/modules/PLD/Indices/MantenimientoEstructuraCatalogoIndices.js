var arrTblDat2 = new Array();
arrTblDat2[0] = "eindIdIndice";
arrTblDat2[1] = "eindIdSubindice";
arrTblDat2[2] = "eindDescripcion";
arrTblDat2[3] = "eindFormaEmp";
arrTblDat2[4] = "eindStIndices";

var strIdPK2 = "eindIdIndice,eindIdSubindice";
var arrIdPK2 = strIdPK2.split(",");
var modo2 = 0;
pkInfo2 = null;

function clickTabla2(pk) {
  cloneObject(pk,cat2.getCatalogo());
  pkInfo2 = pk;
}

function cargaMantenimientoEstructuraIndices(Modo) {
  if ((Modo==OPER_MODIFICAR || Modo==OPER_CONSULTAR) && pkInfo==null)
    Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning')
  else{
      modo2 = Modo;
      if(Modo != OPER_BAJA){
        showWaitLayer();
        var urlCliente = "modules/PLD/Indices/MantenimientoEstructuraCatalogoIndices.do";
        makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipalEstructuraIndices, null);
      }else if(isDefinedAndNotNull(pkInfo2) && Modo == OPER_BAJA){
        ejecutaOperacionEstructura();
      }
  }       
}

function despliegaPantallaPrincipalEstructuraIndices(obj, result) {
  GI("dvPantalla").innerHTML = result;
  deshabilitaPK("ecinIdIndice,ecinDescripcion".split(","));
  initForms();
    console.log("entro a la segunda pantalla")

  if(modo2 == OPER_CONSULTAR || modo2 == OPER_MODIFICAR){ 
    deshabilitaPK(arrIdPK2);
    if(modo2 == OPER_CONSULTAR){
      deshabilitaObjetos(GI("frmDatos"));
      GI("cmdCancelar").value = "Regresar";
      muestraObj("cmdCancelar");
    }
  }
  if(modo2 == OPER_ALTA || modo2 == OPER_MODIFICAR)
    muestraObjs("cmdAceptar,cmdCancelar");
}
function asignaValues2ObjHTML2(){
  asignaValues2ObjHTML();
  GI("eindIdIndice").value = pkInfo.ecinIdIndice;
  if(isDefinedAndNotNull(pkInfo2) && modo2 != OPER_ALTA){
    cat2.setOnUpdate(formsLoaded);
    cat2.buscaCatalogoPK(false);
  }else{
    asignaSecuencial();
  }
}

function asignaSecuencial(){
  var objSecuencial = GI("eindIdSubindice");
  var indice = pkInfo.ecinIdIndice;
  var url = ctxRoot + "/getRef.do?json={\"id\":\"asiETValSecEstInd\",\"Indice\":" + indice + "}";
  makeAjaxRequest(url, "HTML", asignaValorSecuencial, objSecuencial);
}

function asignaValorSecuencial(obj, result){
  resultado = JSON.parse(result);
  obj.value = resultado[0].numSecuencial;
  formsLoaded();
}
function ejecutaOperacionEstructura(){
  cat2.setOnUpdate(avisoOperacionCatalogo);
  showWaitLayer();
  switch(modo2){
    case OPER_ALTA:
    case OPER_MODIFICAR:
      if(fvCat.checkForm()){
        if(modo2 == OPER_ALTA){
          showWaitLayer();
          verificaEstructuraIndice();
        }else{
          cat2.modificaCatalogo();
          cargaMantenimientoCatalogoIndices(modo);
        }
      }
    break;
    case OPER_BAJA:
      cat2.bajaCatalogo(false);
      cargaMantenimientoCatalogoIndices(modo);
    break;
  }
  hideWaitLayer();
}
function verificaEstructuraIndice(){
  var url = ctxRoot + "/getRef.do?json={\"id\":\"verETExiEstInd\",\"Indice\":" + GI("eindIdIndice").value + ",\"SubIndice\":" + GI("eindIdSubindice").value + "}";
  makeAjaxRequest(url, "HTML", validaOperacionEstructuraIndice, null);
}

function validaOperacionEstructuraIndice(obj, result){
  resultado = JSON.parse(result);
  if(resultado[0].existeRegistro != 0){
    Swal.fire('Error', 'El Registro ya existe!', 'error')
  }else{
    cat2.altaCatalogo();
    cargaMantenimientoCatalogoIndices(modo);
  }
  hideWaitLayer();
}