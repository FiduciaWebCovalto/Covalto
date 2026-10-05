var catOblfisc = new Catalogo("mx.com.inscitech.fiducia.domain.FDocumento");
var catOblFid = new Catalogo("mx.com.inscitech.fiducia.domain.FDoctoFisc");
var arrTblOblFisDat = new Array();

arrTblOblFisDat[0] = "fdocIdDocumento,150";
arrTblOblFisDat[1] = "fdocNombre,167";

pkInfo2 = null;
pkInfo3 = null;

function clickTabla2(pk){
  pkInfo2 = pk;
  cloneObject(pk,catOblfisc.getCatalogo());
}
function clickTabla3(pk){
  pkInfo3 = pk;
  cloneObject(pk,catOblFid.getCatalogo());
}
function agregarObligacion(){
  if(isDefinedAndNotNull(pkInfo2)){
    verificaObligacionFideicomiso();
  }
}
function quitarObligacion(){
  if(isDefinedAndNotNull(pkInfo3)){
    catOblFid.setOnUpdate(operacionRealizada);
    catOblFid.bajaCatalogo(false);
  }
}
function verificaObligacionFideicomiso(){
  showWaitLayer();
  var fideicomiso = GI("crfNumFideicom").value;
  var clave = catOblfisc.getCatalogo().fdocIdDocumento;
  var url = ctxRoot + "/getRef.do?json={\"id\":\"verExiDocFid\",\"Fideicomiso\":" + fideicomiso + ",\"Clave\":'" + clave + "'}";
  makeAjaxRequest(url, "HTML", validaObligacionFideicomiso, null);
}
function validaObligacionFideicomiso(obj, result){
  var objValida = JSON.parse(result)[0];
  if(objValida.existeRegistro != 0){
    Swal.fire('Aviso', 'El documento seleccionado se encuentra actualmente asignado al fideicomiso',  'warning');
  }else{
    catOblFid.setOnUpdate(operacionRealizada);
    catOblFid.getCatalogo().fdfIdContrato = GI("crfNumFideicom").value;
    catOblFid.getCatalogo().fdfIdDocumento = catOblfisc.getCatalogo().fdocIdDocumento;
    catOblFid.altaCatalogo(false);
  }
  hideWaitLayer();
}
function operacionRealizada(){
  pkInfo3 = null;
  consultar(GI("crfNumFideicom"), frmDatosObligacionesFiscales, false);
}