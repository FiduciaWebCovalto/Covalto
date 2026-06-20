
var clavesComboTipoParte = JSON.parse("{\"llaveClave\":1109}");
var clavesComboTipoPersona = JSON.parse("{\"llaveClave\":1128}");
var fvCat = new FormValidator();
var pkInfo = null;

var fechas = new Date();

var arrTblDat = new Array();
arrTblDat[0] = "proyecto,100px";
arrTblDat[1] = "numPersona,50px";
arrTblDat[2] = "cis,50px";
arrTblDat[3] = "rfc,100px";
arrTblDat[4] = "nombre,150px";
arrTblDat[5] = "tipoParte,150px";
arrTblDat[6] = "tipoPersona,150px";
arrTblDat[7] = "estatus,150px";


fvCat.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

initForms();

function limpiar(objForma)
{
  regresar();
}
function regresar()
{
  onButtonClickPestania("Otros.ClonacionKYCAdmon.PrincipalClonacionKYC","");
}

function verificacionActivo(txtFiso) 
{
  if(txtFiso.value != "") 
  {
    var validacionAlta2 = JSON.parse("{\"id\":\"verificaSeaActivoProyecto\",\"numContrato\":" + txtFiso.value + "}");
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta2);
    makeAjaxRequest(url, "HTML", funcionVerificacionActivo, txtFiso);
  }else
    asignaEtiqueta("nomFideicomiso","");
}

function funcionVerificacionActivo(txtFiso,result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoCveStContrat != 0)
  {
    Swal.fire('Aviso', 'El Proyecto no está ACTIVO',  'warning');
    txtFiso.value="";
    asignaEtiqueta("nomFideicomiso","");
  }
  else
    consultaNombreFideicomiso("nomFideicomiso",txtFiso);
}


// Clonacion KYC -----------------------------
function consultaClonacionKyc(btnAceptar)
{
    pkInfo = null;
    consultar(btnAceptar, frmDatos, false);
}

function clickTabla(pk)
{
  pkInfo = pk;
}

function  generaClonacionKyc()
{
  if(fvCat.checkForm()) {
    if(isDefinedAndNotNull(pkInfo)) {
        var objClonacion = JSON.parse("{}");
        objClonacion.id="ejeFunClonacionKYCProyecto";
        objClonacion.Tipo = 2;
        objClonacion.Proyecto = pkInfo.proyecto;
        objClonacion.NumTipoParte = pkInfo.numTipoParte;
        objClonacion.NumPersona = pkInfo.numPersona;
        objClonacion.ProyectoCopia = eval(GI("paramFideicomiso").value);
        
        var url = ctxRoot+"/executeRef.do?json="+JSON.stringify(objClonacion);
        makeAjaxRequest(url,"html",generaClonacionKycRes,null);
    } else {
        Swal.fire('Aviso', 'Seleccione registro Original',  'warning');
    }
  }
}

function generaClonacionKycRes(obj,result)
{
  var res = JSON.parse(result).RESULTADO;
  
  if(isDefinedAndNotNull(res))
  {
    if(res==0)
    {
      Swal.fire('Aviso', 'Proceso concluido correctamente',  'warning');
      regresar();
    }
    else if(res==1)
    {
      Swal.fire('Aviso', 'No Coinciden los Tipos de Persona verifique!',  'warning');
    }    
    else
      Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
  }
  else
  {
    Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
  }
}

function loadTipoPersona(objTipoParte, objTipoPersona) {
    objTipoPersona.innerHTML = "";
    if(objTipoParte.value != "-1") {
        showWaitLayer();
        loadElement(objTipoPersona);
    }
}

function filterTipoPersona(obj, result) {
    var arrResult = JSON.parse(result);
    if(GI("paramParte").value.startsWith("COMIT")) {
        arrResult.pop();
    }
    loadComboElement(obj, JSON.stringify(arrResult));
}
