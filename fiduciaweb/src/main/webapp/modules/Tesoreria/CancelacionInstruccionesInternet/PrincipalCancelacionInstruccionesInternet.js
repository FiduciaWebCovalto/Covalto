showWaitLayer();

var fvCancelacionInstruccionesInternet = new FormValidator();

//Agregando la funcionalidad del required
fvCancelacionInstruccionesInternet.setup({
formName      : "frmPrincipalCancelacionInstruccionesInternet",
tipoAlert     : 1,
alertFunction : BaloonAlert,
sendObjToAlert: true
});

//Valor de la afirmacion
var afirmacion=0;

hideWaitLayer();


function botonAceptar() {
  if(fvCancelacionInstruccionesInternet.checkForm())
    ejecutaFuncionCancelaInternet();
}

function ejecutaFuncionCancelaInternet() {
  var objParametros = JSON.parse("{\"id\":\"funcionCancelacionInstruccionesInternet\"}");
  
  eval("objParametros.Folio=" + GI("txtFolio").value);
  eval("objParametros.Usuario=300");
  eval("objParametros.Afirmacion="+ afirmacion);
  
  showWaitLayer();
  var urlFuncCancelInternet = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objParametros);
  makeAjaxRequest(urlFuncCancelInternet, "HTML", respuestaFuncionCancelInternet, null);
}

function respuestaFuncionCancelInternet(obj, result){
  var res=JSON.parse(result).resultado;
  
  if(afirmacion==1)
    afirmacion=0;
      
  switch(res)
  {
    case 0: Swal.fire('Aviso', 'Cancelación satisfactoria',  'warning'); break;
    case 1: Swal.fire('Aviso', 'No existe la instrucción para este folio',  'warning'); break;
    case 2: Swal.fire('Aviso', 'La instrucción ya ha sido cancelada',  'warning'); break;
    case 3: Swal.fire('Aviso', 'La instrucción se encuentra en espera de autorización',  'warning'); break;
    case 4: 
            if(confirm("¿Está seguro de cancelar la instrucción?")==true)
            {
              afirmacion=1;
              ejecutaFuncionCancelaInternet();
              break;
            }
            else
              break;
            
    case 5: Swal.fire('Aviso', 'No es posible cancelar una instrucción contabilizada',  'warning'); break;
    case 6: Swal.fire('Aviso', 'No es posible cancelar instrucciones con fechas donde el fideicomiso haya sido cerrado contablemente',  'warning'); break;
    case 7: Swal.fire('Aviso', 'Esta instrucción fue contabilizada por póliza manual, para poder cancelar la FUOF es necesario solicitar a contabilidad que realice su cancelación',  'warning'); break;
    case 8: Swal.fire('Aviso', 'Error en el proceso de cancelación de esta instrucción',  'warning'); break;
    case 9: Swal.fire('Aviso', 'La instrucción presupuestal ya ha sido cancelada',  'warning'); break;
    case 10: Swal.fire('Aviso', 'No es posible cancelar esta instrucción, ya que el folio pertenece al movimiento presupuestal de una instrucción de retiro',  'warning'); break;
    case -1: Swal.fire('Aviso', 'Ocurrió un error de Oracle',  'warning'); break;
    default: break;
  }
  
  hideWaitLayer();
}
