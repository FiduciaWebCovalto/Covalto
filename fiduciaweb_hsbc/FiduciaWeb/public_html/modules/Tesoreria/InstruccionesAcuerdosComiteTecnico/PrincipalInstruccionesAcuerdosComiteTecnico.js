showWaitLayer();
initForms();

var objAcuerdoComiteParam = JSON.parse("{\"id\":\"X\"}");
var cmbAcuerdosParam = JSON.parse("{\"NumFideicomiso\":-1,\"order\":\"s\"}");
var fvInstruccionesAcuerdos = new FormValidator();

fvInstruccionesAcuerdos.setup({
  formName      : "frmDatosInstruccionesAcuerdos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function limpiar(objForma){
  RF(objForma);
  borraCombos("cmbNoAcuerdo");
}
function cargaComboAcuerdos(objComboAcuerdo){
  if(objComboAcuerdo.selectedIndex != 0){
    showWaitLayer();
    cmbAcuerdosParam.NumFideicomiso = objComboAcuerdo.value;
    loadElement(GI("cmbNoAcuerdo"));
  }
}
function asignaMontoAutorizadoDisponible(objCmbAcuerdo){
  if(objCmbAcuerdo.value != -1){
    GI("txtMontoAutorizado").value = objCmbAcuerdo.value.split("-")[0];
    GI("txtMontoDisponible").value = objCmbAcuerdo.value.split("-")[1];
  }else{
    GI("txtMontoAutorizado").value = "0";
    GI("txtMontoDisponible").value = "0";
  }
}
function verificaImporte(objImporte){
  if(eval(objImporte.value) == 0){
    Swal.fire('Aviso', 'Introduzca un Importe mayor a 0',  'warning');
    objImporte.focus();
  }else{
    if(objImporte.value != "" && objImporte > GI("txtMontoDisponible").value){
      Swal.fire('Aviso', 'Introduzca un Importe no mayor al Importe Disponible',  'warning');
      objImporte.focus();
    }
  }
}

function ejecutaInstruccionAcuerdo(){
  if(fvInstruccionesAcuerdos.checkForm()){
    if(GI("txtContrasena").value != ""){
      showWaitLayer();
      loadElement(GI("txtContrasena"));
    }else{
      Swal.fire('Aviso', 'Introduzca una Contraseña valida',  'warning');
      GI("txtContrasena").focus();
    }
  }
}
function verificaContrasena(obj, result){
  var resultado = JSON.parse(result)[0];
  var opc = eval(GI("rdTipoInstruccion").value);
  if(isDefinedAndNotNull(resultado)){
    if(resultado.pwd == GI("txtContrasena").value){
      switch(opc){
        case 1: //Reembolso
          objAcuerdoComiteParam.id = "updInsAcuComRee";
          objAcuerdoComiteParam.Importe = eval(GI("txtImporte").value);
          objAcuerdoComiteParam.NumFideicomiso = eval(GI("cmbFideicomiso").value);
          objAcuerdoComiteParam.Fecha = GI("cmbNoAcuerdo").options[GI("cmbNoAcuerdo").selectedIndex].text.substring(0,10);
          objAcuerdoComiteParam.Tipo = GI("cmbNoAcuerdo").options[GI("cmbNoAcuerdo").selectedIndex].text.substring(12,13);
          objAcuerdoComiteParam.Id = GI("cmbNoAcuerdo").options[GI("cmbNoAcuerdo").selectedIndex].text.substring(14,GI("cmbNoAcuerdo").options[GI("cmbNoAcuerdo").selectedIndex].text.length);
        break;
        case 2: //Retiro
          objAcuerdoComiteParam.id = "updInsAcuComRet";
          objAcuerdoComiteParam.Importe = eval(GI("txtImporte").value);
          objAcuerdoComiteParam.NumFideicomiso = eval(GI("cmbFideicomiso").value);
          objAcuerdoComiteParam.Fecha = GI("cmbNoAcuerdo").options[GI("cmbNoAcuerdo").selectedIndex].text.substring(0,10);
          objAcuerdoComiteParam.Tipo = GI("cmbNoAcuerdo").options[GI("cmbNoAcuerdo").selectedIndex].text.substring(12,13);
          objAcuerdoComiteParam.Id = GI("cmbNoAcuerdo").options[GI("cmbNoAcuerdo").selectedIndex].text.substring(14,GI("cmbNoAcuerdo").options[GI("cmbNoAcuerdo").selectedIndex].text.length);
        break;
      }
      var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objAcuerdoComiteParam);
      makeAjaxRequest(url, "HTML", validaResultadoUpdate, opc);
    }else{
      Swal.fire('Aviso', 'Contraseña Invalida!',  'warning');
      obj.value = "";
      hideWaitLayer();
    }
  }else{
    Swal.fire('Aviso', 'Ocurrio un error al verificar la Contraseña!',  'warning');
    obj.value = "";
    hideWaitLayer();
  }
}
function validaResultadoUpdate(obj, result){
  var resultado = JSON.parse(result);
  if(isDefinedAndNotNull(resultado)){
    if(resultado.tipoError == "SUCCESS"){
      switch(obj){
        case 1:
        case 2:
          if(obj == 1)
            Swal.fire('Aviso', 'La operación de Reembolso fue aplicada exitosamente!',  'warning');
          else
            Swal.fire('Aviso', 'La operación de Retiro fue aplicada exitosamente (los retiros solo se aplican si el acuerdo tiene saldo disponible!',  'warning');
          delete objAcuerdoComiteParam.Importe;
          objAcuerdoComiteParam.id = "updInsAcuCom1";
          var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objAcuerdoComiteParam);
          makeAjaxRequest(url, "HTML", validaResultadoUpdate, 3);
        break;
        case 3:
          objAcuerdoComiteParam.id = "updInsAcuCom2";
          var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objAcuerdoComiteParam);
          makeAjaxRequest(url, "HTML", validaResultadoUpdate, 4);
        break;
        case 4:
          objAcuerdoComiteParam.id = "updInsAcuCom3";
          var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objAcuerdoComiteParam);
          makeAjaxRequest(url, "HTML", validaResultadoUpdate, 10);
        break;
        case 10:
          hideWaitLayer();
          GI("cmbFideicomiso").focus();
          limpiar(GI("frmDatosInstruccionesAcuerdos"));
        break;
        default:
          hideWaitLayer();
          GI("cmbFideicomiso").focus();
      }
    }else{
      Swal.fire('Aviso', 'Ocurrio un error al realizar la operación!',  'warning');
      hideWaitLayer();
    }
  }else{
    Swal.fire('Aviso', 'Ocurrio un error al realizar la operación c!',  'warning');
    hideWaitLayer();
  }
}