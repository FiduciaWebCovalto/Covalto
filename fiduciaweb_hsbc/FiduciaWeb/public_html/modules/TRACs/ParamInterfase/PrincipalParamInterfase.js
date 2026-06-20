var catParamInter = new Catalogo("mx.com.inscitech.fiducia.domain.FSisvalFiduciaweb");

var clavesCombo31  = JSON.parse("{\"llaveClave\":31,\"orderDescripcion\":\"s\"}");
var clavesCombo1003  = JSON.parse("{\"llaveClave\":1003,\"orderDescripcion\":\"s\"}");

var fvCat = new FormValidator();
var strIdPK = "fvfwIdOperSisVal,fvfwIdOperSisFw,fvfwTipoOper,fvfwNumOperacion";
var arrIdPK = strIdPK.split(",");
var modo = 0;
pkInfo = null;

var arrTblDat = new Array();
arrTblDat[0] = "fvfwIdOperSisVal,150px";
arrTblDat[1] = "fvfwIdOperSisFw,150px";
arrTblDat[2] = "fvfwTipoOper,150px";
arrTblDat[3] = "fvfwNumOperacion,100px";


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


function cargaMantenimientoVentanas(Modo)
{
  modo = Modo;
  if((isDefinedAndNotNull(pkInfo) || Modo == OPER_ALTA) && Modo != OPER_BAJA){
    //showWaitLayer();
    var urlCliente = "modules/TRACs/ParamInterfase/MantenimientoParamInterfase.do";
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
    cargaDatosParamFiso();
    GI("fvfwIdOperSisValNombre").style.visibility = "visible";
    GI("fvfwTipoOper").style.visibility = "hidden";
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
    GI("fvfwIdOperSisValNombre").style.visibility = "hidden";
    GI("fvfwTipoOper").style.visibility = "visible";
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
  objVentana.id = "ejeFunParamInterfase";
  
  if(cveOperacion=='BAJA')
  {
    objVentana.Opcion = 3;// BAJA
    objVentana.ClaveA2K = pkInfo.fvfwIdOperSisVal;
    objVentana.ClaveFiduciaWeb = pkInfo.fvfwIdOperSisFw;
    objVentana.TipoOper = pkInfo.fvfwTipoOper;
    objVentana.Operacion = eval(0);
  }
  else // ALTA/MODIFICAR
  {
    objVentana.Opcion = cveOperacion=="ALTA"?1:3; // ALTA O MODIFICAR
    objVentana.ClaveA2K = GI("fvfwIdOperSisVal").value;
    objVentana.ClaveFiduciaWeb = GI("fvfwIdOperSisFw").value;
    objVentana.TipoOper = GI("fvfwTipoOper").value;
    if(GI("fvfwNumOperacion").value!=null && GI("fvfwNumOperacion").value!=''){
        objVentana.Operacion = eval(GI("fvfwNumOperacion").value);
    }    
    else{
        objVentana.Operacion = eval(0);
    }    
  }  
  var url = ctxRoot+"/executeRef.do?json="+JSON.stringify(objVentana);
  alert(url)
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
        Swal.fire('Aviso', '¡Ya existe Parametrizacion!',  'warning');
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
  onButtonClickPestania("TRACs.ParamInterfase.PrincipalParamInterfase","");
}

function cargaDatosParamFiso()
{
 // if(isDefinedAndNotNull(pkInfo))
  //{
    GI("fvfwIdOperSisVal").value = pkInfo.fvfwIdOperSisVal;
    GI("fvfwIdOperSisFw").value = pkInfo.fvfwIdOperSisFw;
    GI("fvfwTipoOper").value = pkInfo.fvfwTipoOper;
    GI("fvfwNumOperacion").value = pkInfo.fvfwNumOperacion;
    GI("fvfwIdOperSisValNombre").value =  pkInfo.fvfwTipoOper;
  //}
  formsLoaded();
}

