
var clavesCombo31  = JSON.parse("{\"llaveClave\":31,\"orderDescripcion\":\"s\"}");
var clavesCombo702  = JSON.parse("{\"llaveClave\":702,\"orderDescripcion\":\"s\"}");
var clavesCombo703 = JSON.parse("{\"llaveClave\":703}");
var cmbPizarra = JSON.parse("{\"Mercado\":1,\"Instrumento\":5}");


var fvCat = new FormValidator();
var strIdPK = "patIdVentana,patIdPizarra,patIdSerie,patIdCupon";
var arrIdPK = strIdPK.split(",");
var modo = 0;
pkInfo = null;

var arrTblDat = new Array();
arrTblDat[0] = "patIdVentana,100px";
arrTblDat[1] = "patIdPizarra,200px";
arrTblDat[2] = "patTipoParametro,150px";
arrTblDat[3] = "patIdSerie,100px";
arrTblDat[4] = "patHoraInicio,100px";
arrTblDat[5] = "patHoraFin,100px";

fvCat.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

initForms();


function clickTabla(pk)
{
  pkInfo = pk;
}

function limpiar(objForma)
{
  regresar();
}

// mantenimiento prodesta -----------------

function cargaMantenimientoVentanas(Modo)
{
  modo = Modo;
  if((isDefinedAndNotNull(pkInfo) || Modo == OPER_ALTA) && Modo != OPER_BAJA){
    showWaitLayer();
    var urlCliente = "modules/TRACs/Ventanas/MantenimientoVentanas.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoVentanas, null);
  }else if(isDefinedAndNotNull(pkInfo) && Modo == OPER_BAJA)
  {
    ejecutaOperacion();
  }
}
function despliegaPantallaMantenimientoVentanas(obj, result) {
  GI("dvPantalla").innerHTML = result;
  
  initForms(); 
  if(modo == OPER_CONSULTAR || modo == OPER_MODIFICAR)
  {
    deshabilitaPK(arrIdPK);
    if(modo == OPER_CONSULTAR){
      deshabilitaObjetos(GI("frmDatos"));
      GI("cmdCancelar").value = "Regresar";
      muestraObj("cmdCancelar");
    }
    else
    {
      muestraObjs("cmdAceptar,cmdCancelar");
    }
  }else if(modo == OPER_ALTA )
  {
    pkInfo = null;
    muestraObjs("cmdAceptar,cmdCancelar");
  }  
}


function ejecutaOperacion()
{
  if(modo == OPER_ALTA)
  {
    if(fvCat.checkForm())
    {  
      ejecutaFuncionVentana('ALTA');  
    }
  }else if(modo == OPER_MODIFICAR){
    if(fvCat.checkForm())
    {
      ejecutaFuncionVentana('MODIFICAR');
    }
  }else if(modo == OPER_BAJA)
  {
      ejecutaFuncionVentana('BAJA'); 
  }
}

function ejecutaFuncionVentana(cveOperacion)
{
  showWaitLayer();
  
  var objVentana = JSON.parse("{}");
  objVentana.id = "ejeFunVentanaTrack";
  
  if(cveOperacion=='BAJA')
  {
    objVentana.NumVentana = pkInfo.patIdVentana;
    objVentana.VarPizarra = pkInfo.patIdPizarra;
    objVentana.VarSerie = pkInfo.patIdSerie;
    objVentana.NumCupon = pkInfo.patIdCupon;
    objVentana.VarHoraInicio = pkInfo.patHoraInicio;
    objVentana.VarHoraFin = pkInfo.patHoraFin;
    objVentana.NumOperacion = 2;// BAJA
  }
  else // ALTA/MODIFICAR
  {
    objVentana.NumVentana = GI("patIdVentana").value;
    objVentana.VarPizarra = GI("patIdPizarra").value;
    objVentana.VarSerie = GI("patIdSerie").value;
    objVentana.NumCupon = GI("patIdCupon").value;
    objVentana.VarHoraInicio = GI("patHoraInicio").value;
    objVentana.VarHoraFin = GI("patHoraFin").value;
    objVentana.NumOperacion = cveOperacion=="ALTA"?1:3; // ALTA O MODIFICAR
  }  
  var url = ctxRoot+"/executeRef.do?json="+JSON.stringify(objVentana);
  
  makeAjaxRequest(url,"html",ejecutaFuncionVentanaRes,null);
}

function ejecutaFuncionVentanaRes(obj,result)
{
  hideWaitLayer();
  var res = JSON.parse(result).RESULTADO;
  
  if(isDefinedAndNotNull(res))
  {
    switch(Number(res))
    {
      case 0:
        validaAvisoOperacionCatalogo();
        break;
      case 1:
        Swal.fire('Aviso', '¡Ya existe Ventana!',  'warning');
        break;
      case 2:
        Swal.fire('Aviso', '¡El horario se traslapa con el de otra Ventana!',  'warning');
        break;
      default:
        Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
        break;
    }
    
  }
  else
  {
    Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
  }

}



//-----------------------------------------

function validaAvisoOperacionCatalogo()
{
  Swal.fire('¡Éxito!', "Operación realizada exitosamente", 'success');
  regresar();
}  
  
function regresar()
{
  onButtonClickPestania("TRACs.Ventanas.PrincipalVentanas","");
}

function cargaDatosVentana()
{
  if(isDefinedAndNotNull(pkInfo))
  {
    GI("patIdVentana").value = pkInfo.patIdVentana;
    GI("patIdPizarra").value = pkInfo.patIdPizarra;
    GI("patIdSerie").value = pkInfo.patIdSerie;
    GI("patIdCupon").value = pkInfo.patIdCupon;
    GI("patHoraInicio").value = pkInfo.patHoraInicio;
    GI("patHoraFin").value = pkInfo.patHoraFin;
  }
  formsLoaded();
}