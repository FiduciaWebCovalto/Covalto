//showWaitLayer();
initForms();
var fvCat = new FormValidator();
fvCat.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function limpiar(objForma){
  RF(objForma);
  pkInfo = null;
}
function asignaFideicomisoCuentasIndividuales(objCombo){
  showAlert(objCombo);
}

async function showAlert(objCombo) {
  const result = await Swal.fire({
    title: '¿Fideicomiso Asignado, desea continuar?',
    icon: 'question'
  });

  if (result.isConfirmed) {
    console.log('Usuario confirmó');
    if(fvCat.checkForm()){
        var url = "modules/CuentasIndividuales/CuentasIndividuales/PrincipalFideicomisosCuentasIndividuales.do?fideicomisoCtasInd=" + objCombo.value;
        makeAjaxRequest(url, "HTML", validaAsignacionFideicomisoCtasInd, null);
    }
    // Acciones aquí
  }
}
  
function validaAsignacionFideicomisoCtasInd(obj, result){
  GI("dvPantalla").innerHTML = result; // pestaña
  var url = "modules/CuentasIndividuales/CuentasIndividuales/Submit.do";
  makeAjaxRequest(url, "HTML", validaSubmitFideicomisoCtasInd, null);
}

function validaSubmitFideicomisoCtasInd(obj, result){
  GI("dvPantalla").innerHTML = result; // pestaña
	//GI("dvContenido").innerHTML = result;

  
  GI("frmSubmit").submit();
  hideWaitLayer();
}

function asignaValorComboFideicomiso(){
  if(GI("txtFideicomisoCtasInd").value != "")
    GI("cmbContrato").value = GI("txtFideicomisoCtasInd").value;
  formsLoaded();
}