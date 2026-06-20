showWaitLayer();
initForms();
var txtFolioParam = JSON.parse("{\"Folio\":0}");

function cancelaInstruccionInternet(obj, result){
  alert("status "+datos);
  var datos = JSON.parse(result)[0];
  var mesAbierto = 1;
  if(isDefinedAndNotNull(datos)){
    showWaitLayer();
    alert("status "+datos.statusContabilidad);
    switch(datos.statusContabilidad){
      case "CANCELADO":
        Swal.fire('Aviso', 'La instrucción con Folio: " + txtFolioParam.Folio + ", ya se encuentra cancelada',  'warning');
      break;
      case "ESPERA":
        Swal.fire('Aviso', 'La instrucción con Folio: " + txtFolioParam.Folio + ", se encuentra en espera de autorización por el cliente',  'warning');
      break;
      case "ACTIVO": 
        Swal.fire('Aviso', 'La instrucción con Folio: " + txtFolioParam.Folio + ", no ha sido aceptada por Tesoreria',  'warning');
      break;
      case "PENDIENTE":
        Swal.fire('Aviso', 'La instrucción con Folio: " + txtFolioParam.Folio + ", no ha sido contabilizada',  'warning');
      break;
      case "RECHAZADA":
        Swal.fire('Aviso', 'La instrucción con Folio: " + txtFolioParam.Folio + ", ha sido rechazada',  'warning');
      break;
      case "ACEPTADA":
        showWaitLayer();
        if((datos.fechaContable.split("/")[1] < GI("txtFechaContable").value.split("/")[1]) && mesAbierto == 0)
          Swal.fire('Aviso', 'No es posible cancelar instrucciones del " + GI("txtFechaContable',  'warning').value + ", el mes al que pertenece la instrucción esta cerrado para el Fideicomiso " + datos.numContrato);
        else{
          if(confirm("Es necesario se encuentre cancelada la poliza manual involucrada con la instrucción de " + datos.tipoInstruccion + " del Fideicomiso " + datos.numContrato + ", con Folio: " + txtFolioParam.Folio + ". ¿Estas seguro de cambiar el estatus de contabilidad a ¡CANCELADO!?")){
            showWaitLayer();
            var url = ctxRoot + "/doRef.do?json={\"id\":\"updStaInsInt\",\"Folio\":" + txtFolioParam.Folio + "}";
            makeAjaxRequest(url, "HTML", validaUpdateStatusInstruccion, null);
          }
        }
        hideWaitLayer();
      break;
      default:
        Swal.fire('Aviso', 'La instrucción con Folio: " + txtFolioParam.Folio + ", no fue aceptada por poliza',  'warning');
    }
    hideWaitLayer();
  }
}


function validaUpdateStatusInstruccion(obj, result){
  var resultado = JSON.parse(result);
  if(isDefinedAndNotNull(resultado)){
    if(resultado.tipo == "SUCCESS")
      Swal.fire('Aviso', 'La instrucción con Folio: " + txtFolioParam.Folio + ", fue cancelada',  'warning');
    else
      Swal.fire('Aviso', 'No fue posible cambiar el estatus de contabilidad de la instrucción con Folio: " + txtFolioParam.Folio + "  a ¡CANCELADO!',  'warning');
  }
  hideWaitLayer();
}