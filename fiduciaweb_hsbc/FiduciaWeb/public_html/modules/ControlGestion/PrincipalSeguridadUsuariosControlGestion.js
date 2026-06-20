var catUsuarios = new Catalogo("mx.com.inscitech.fiducia.domain.Usuarios");
catUsuarios.dateFormat = "dd/MM/YYYY";

catUsuarios
showWaitLayer();
var clavesMayor = JSON.parse("{\"mayor2000\":2000,\"orderPuesto\":\"s\"}");
//var clavesMayor = JSON.parse("{\"mayor2000\":2000}");
var paramPerfil = JSON.parse("{\"orderPerfil\":\"s\"}");
var paramPuesto = JSON.parse("{\"orderPuesto\":\"s\"}");
var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var clavesCombo30 = JSON.parse("{\"llaveClave\":30}");

var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaRegistroUsuarios\",\"numUsuario\":0}");

var recibeContra = JSON.parse("{\"id\":\"contraDefault\"}");

initForms();

var tablaDatosUsuariosData = new Array();
tablaDatosUsuariosData[0] = "usuNumUsuario,50px";
tablaDatosUsuariosData[1] = "perNomUsuario,200px";
tablaDatosUsuariosData[2] = "usuNomUsuario,100px";
tablaDatosUsuariosData[3] = "usuNomPuesto,200px";
tablaDatosUsuariosData[4] = "usuCveStUsuario,80px";

var operacion = 0;
var numPantalla = 0;
pkInfo = null;
var fvMantenimientoUsuarios = new FormValidator();
var CONSULTAR = 3;

function cargaPrincipalSeguridadUsuariosControlGestion() {
  onButtonClickPestania("ControlGestion.PrincipalSeguridadUsuariosControlGestion","");
  hideWaitLayer();
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catUsuarios.getCatalogo());
}

////////////////////////////////////////////////////////////////////
//CARGA LA SEGUNDA PANTALLA (MantenimientoSeguridadUsuariosControlGestion)
function cargaMantenimientoSeguridadUsuariosControlGestion(tipoPantalla) {
  if ((tipoPantalla==OPER_MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/ControlGestion/MantenimientoSeguridadUsuariosControlGestion.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
  }
}

function despliegaPantalla(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimientoUsuarios.setup({
    formName      : "frmMantenimientoSeguridadUsuariosControlGestion",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
}

function loadCatalogo() {
  catUsuarios.setOnUpdate(catLoaded);
  if(operacion==OPER_MODIFICAR || operacion==CONSULTAR){
    catUsuarios.buscaCatalogoPK(false);
    //SA(GI("usuNumUsuario"),"ref","muestraDatosPersonalOrdenado");
    //loadElement(GI("usuNumUsuario"));
  }
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
    
       // SA(GI("usuNumUsuario"),"ref","muestraDatosPersonalOrdenadoSinUsuarios");
        //loadElement(GI("usuNumUsuario"));
   funRecibeContra();
    formsLoaded();
  }
}

function catLoaded() {
  if(operacion==OPER_MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
  {
    deshabilitaPK("usuNumUsuario".split(","));
    muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmMantenimientoSeguridadUsuariosControlGestion"));         //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  //cargaRadiosConMaster("usuPtceGpot","usuPtceGpot2");
  
  formsLoaded();
}

function AltaOModificaInfo() {
  catUsuarios.setOnUpdate(operacionExitosa);
    
  if(operacion==OPER_ALTA && fvMantenimientoUsuarios.checkForm())//Se trata de una alta
  {
    showWaitLayer();    
    catUsuarios.altaCatalogo();
    
    deshabilitaPK("usuNumUsuario".split(","));
    
  }
  else if(operacion==OPER_MODIFICAR && fvMantenimientoUsuarios.checkForm())//Se trata de una modificación
  {
    showWaitLayer();
    funRecibeContra();
    catUsuarios.modificaCatalogo();
  }
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalSeguridadUsuariosControlGestion();
  hideWaitLayer();
}

//Verificar que el registro aún no exista
function verificaExistenciaRegistro() {
  if(operacion==OPER_ALTA && GI("usuNumUsuario").value != -1)
  {
    showWaitLayer();
//    deshabilitaPK("usuTipoUsuario".split(","));
    validacionAlta.numUsuario = GI("usuNumUsuario").value;
    
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificacionAlta, null);
  }
}

function verificacionAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].existeRegistro > 0)
  {
    Swal.fire('Aviso', 'La Persona ya es un Usuario, verifique',  'warning');
    GI("usuNumUsuario").value=-1;
  }
  hideWaitLayer();
}

function funRecibeContra() {
  
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(recibeContra);
       
    makeAjaxRequest(url, "HTML", funRecibeContra2, null);
 
}

function funRecibeContra2(obj, result) {
  var resu = JSON.parse(result);  
    GI("usuPassword").value=resu[0].pasDef; 
}





/////////////////////////////////////////////////////////////////////////////
//La eliminación de un registro de Usuario implica la eliminación de registros en otras tablas
function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
    realizarDeletes();
}

function realizarDeletes(){
    var numUsuario = pkInfo.usuNumUsuario;
    var objDeleteParam = JSON.parse("{\"id\":\"delDato\",\"NumUsuario\":" + numUsuario + "}");
    
    showWaitLayer();
    for(var i=0; i<7; i++)
    {
      objDeleteParam.id = eval("'delDato" + i + "'");
      var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objDeleteParam);
      makeAjaxRequest(url, "HTML", verificaEliminacionesUsuarios, i + "== 6");
    }
}

function verificaEliminacionesUsuarios(obj, result) {
  if(eval(obj)) {
    catUsuarios.setOnUpdate(operacionExitosa);
    eliminaCatalogo(catUsuarios);
  }
}

/////////////////////////////////////////////////////////////////////////////
//Obtiene el Nombre del Puesto a partir del Número del mismo
function obtieneNomPuesto(objCmbNumPuesto) {
  if(objCmbNumPuesto.value == -1)
    GI("usuNomPuesto").value = "";
  else
    GI("usuNomPuesto").value = objCmbNumPuesto.options[objCmbNumPuesto.selectedIndex].text;
    
//alert(GI("usuNomPuesto").value);
}

function convertirMayusculas( objeto ) {
   var strMayusculas = objeto.value;
   objeto.value = strMayusculas.toUpperCase();
   }
   
   
   
function asignaToken() {
   var token;
   //alert(GI("usuNumPuesto").value);
   if(GI("usuNumPuesto").value==3000 || GI("usuNumPuesto").value==3002 || GI("usuNumPuesto").value==3005)
      Token=0; 
    else
      Token=1;  
      
  GI("usuToken").value=Token;
  }
   
   
