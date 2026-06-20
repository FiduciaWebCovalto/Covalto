showWaitLayer();
initForms();
var fvPlan = new FormValidator();
var cmbPlanesParam = JSON.parse("{}");

fvPlan.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function destazaFecha(){
  SA(GI("cmbPlanes"),"ref","conNomPlaHonorarios");
  cmbPlanesParam.Dia = eval(GI("txtFechaContable").value.split("/")[0]);
  cmbPlanesParam.Mes = eval(GI("txtFechaContable").value.split("/")[1]);
  cmbPlanesParam.Ano = eval(GI("txtFechaContable").value.split("/")[2]);
  cmbPlanesParam.Hora = eval(GI("txtHoraMinuto").value);
  loadElement(GI("cmbPlanes"));
}

function ejecutaPlan(){
  if(fvPlan.checkForm()){
    showWaitLayer();
    
     //if(GI("cmbPlanes").value=="PLAN CIERRE MENSUAL")
     //   historicos();
    
    var objPlan = new Object();
    objPlan.nombre = GI("cmbPlanes").value;/*CAMBIA EL PLAN QUE SE MANDA A LAS INTERFASES*/
    switch(objPlan.nombre){
        case "PLAN INICIO LINEA":
            objMonitor.interfaseID=3;
            break;
        case "PLAN TERMINO DE LINEA":
            objMonitor.interfaseID=4;
            break;
        case "PLAN EXTRAORDINARIO":
            objMonitor.interfaseID=5;
            break;
        case "PLAN CIERRE Y MENSUAL":
            objMonitor.interfaseID=6;
            break;
        case "PLAN MENSUAL":
            objMonitor.interfaseID=7;
            break;
        case "PLAN ANUAL":
            objMonitor.interfaseID=8;
            break;
        case "PLAN HONORARIOS":
            objMonitor.interfaseID=9;
            break;
    }
    var objEjecutorParam = JSON.parse("{\"id\":\"ejeFunInvocaPlanes\"}");
    objEjecutorParam.Plan = GI("cmbPlanes").value;
    objEjecutorParam.Usuario = 603;
    
    stopCtl = false;
    ultimaCantidad = -1;
    veces = 0;
    etapa = 0;
    objMonitor.fechaAplicacion = GI("txtFechaContable").value;
    urlProcCtl = ctxRoot + "/doRef.do?json=" + JSON.stringify(objMonitor);
    
    var url = ctxRoot + "/executeRefAsync.do?json=" + JSON.stringify(objEjecutorParam);
    makeAjaxRequest(url, "HTML", processMonitor, objPlan);
  }
}

/*Implementacion de Timer ProcessMonitor*/
/*IMPORTANTE Copiar lo siguiente donde se invoque el process*/
/*stopCtl = false;
ultimaCantidad = -1;
veces = 0;
etapa = 0;
objMonitor.fechaAplicacion = GI("paramFecha").value;
urlProcCtl = ctxRoot + "/doRef.do?json=" + JSON.stringify(objMonitor);*/
/*!!!!!!*/

var objMonitor = {id:"controlIFs", interfaseID: 9, fechaAplicacion: "01/01/2000"}; //Cambiar ID a la consulta de control //interfaseID en 3 para apertura de linea
var urlProcCtl = ctxRoot + "/doRef.do?json=" + JSON.stringify(objMonitor);
function processMonitor(obj, result) {
    if(!stopCtl) { setTimeout(function() { makeAjaxRequest(urlProcCtl, "HTML", processMonitor, null); }, 3000); }
    if(isDefinedAndNotNull(result)) {
        
        try {
            var msgProc = JSON.parse(result);
            if(msgProc.succedded) return;
        } catch(e) {}
        
        var objCtl = JSON.parse(result)[0];
        if(!stopCtl && objCtl.totalRegistros == 0 && veces >= 5) {
            stopCtl = true;
            //Poner aqui la funcion a llamar cunado se cumplan las condiciones
            validaEjecutaPlan(obj,result);
        } else {
            ultimaCantidad = objCtl.totalRegistros;
            veces++;
        }
    }    
}

function validaEjecutaPlan(obj, result){
  /*var resultado = JSON.parse(result)[0];
    switch(eval(resultado)){
      case 0:
        Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
          
        onButtonClickPestania("Operacion.EjecutorPlanes.PrincipalEjecutorPlanes","");
      break;
      case 1:Swal.fire('Aviso', 'No existen Rutinas asignadas al Plan!',  'warning');break;
      case 2:Swal.fire('Aviso', 'Existen Rutinas pendientes por ejecutar para este Plan!',  'warning');break;
      case 3:Swal.fire('Aviso', 'No se proyecto correctamente la Fecha de próxima ejecución de este Plan!',  'warning');break;
      case 4:Swal.fire('Aviso', 'El Usuario no existe!',  'warning');break;
      default:Swal.fire('Aviso', 'Ocurrió un error inesperado!',  'warning');
    }*/
    Swal.fire('Aviso', 'Proceso concluido!',  'warning');
  hideWaitLayer();
}

//--------------historicos-------------------
function historicos()
{
  var url = ctxRoot + "/executeRef.do?json={\"id\":\"historicos\",\"fecha\":\""+GI("txtFechaContable").value+"\"}";
  makeAjaxRequest(url, "HTML", resultadoHistoricos, null); 
}

function resultadoHistoricos(obj, result)
{ 
  var res = JSON.parse(result).resultado;
  
  if(isDefinedAndNotNull(res)){
    switch(eval(res))
    {
      case 0:
            //Swal.fire('Aviso', 'Operación Exitosa!!',  'warning');
            break;
      default:
            Swal.fire('Aviso', 'Error en historicos',  'warning');
            break;
    }
  }
    //Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
} 

//--------------historicos-------------------

 