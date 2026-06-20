var cat = new Catalogo("mx.com.inscitech.fiducia.domain.FEmiFideicomiso");

showWaitLayer();

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;
var cmbFideicomisoTracParam = JSON.parse("{}");
var cmbEmisionParam = JSON.parse("{\"tipoMercado\":1,\"numInstrumento\":5}");

var tablaData = new Array();
tablaData[0] = "femiNumFideicomiso,80";
tablaData[1] = "femiPizarra,100";
tablaData[2] = "femiSerie,50";
tablaData[3] = "femiCupon,50";

var fvMantenimiento = new FormValidator();

fvMantenimiento.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

pkInfo=null;


//calendarios
var fechaDefault = new Date();
var cal = CalendarExtended.setup({					
		showTime: 12,    
    date           :    fechaDefault,
    disableFunc    :    isValidDate,
		onSelect: function(cal) { cal.hide() ; },
    animation: false
})

function setFechaCal(){}
function isValidDate(date){ 
  var today = new Date();
  if(date > today)
    return true;
  else
    return false;
}


initForms();
formsLoaded();


function limpiar(objForma){
  RF(objForma);
  catFideicomisos = new Catalogo("mx.com.inscitech.fiducia.domain.FEmiFideicomiso");
  pkInfo = null;
}


function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,cat.getCatalogo());
}

//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda pantalla

var operacion = 0;

function cargaMantenimiento(tipoPantalla)
{
  if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
          
    /*if(tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR)
      cmbSubcuenta = JSON.parse("{\"Fideicomiso\":"+pkInfo.lcrIdFideicomiso+"}");
    else
      cmbSubcuenta = JSON.parse("{\"Fideicomiso\":-1}");*/
      
    var urlCliente = ctxRoot + "/modules/TRACs/EmisionFiso/MantenimientoEmisionFiso.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimiento, null);
  }
}


function despliegaPantallaMantenimiento(obj, result) {
  GI("dvPantalla").innerHTML = result;
  hideWaitLayer();
  
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimiento.setup({
    formName      : "frmDatosMantenimiento",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true,
    showErrors    : true
  });
  
  if(operacion==CONSULTAR){
    //Swal.fire('Aviso', 'ALERTA',  'warning')catLoaded();
  }  
  else
  {
      GI("dvConsultaFiso").style.visibility = "hidden";
      GI("dvConsultaEmision").style.visibility = "hidden";
      
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
  }  
}
/*
function loadCatalogo() {
  //cat.setOnUpdate(catLoaded);
  if(operacion==MODIFICAR || operacion==CONSULTAR)
    catLoaded();
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
  }
}*/

function catLoaded() {
  if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    //cargaComplemento();
    vgContenedorDatos=JSON.parse("{\"id\":\"cmbFideicomisoEmiFiso\"}");
    vgContenedorDatos.Fideicomiso=pkInfo.femiNumFideicomiso;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);//executeRef
    //alert(url);
    makeAjaxRequest(url, "HTML", resultadoConsulta1, null);    
  }

}

 function resultadoConsulta1(objTabla, result) {
    //alert(result);
    var resultado =JSON.parse(result);
    //alert(resultado[0].ctoNomContrato)
    GI("txtFideicomiso").value=resultado[0].ctoNomContrato
    GI("txtFideicomiso").style.visibility = "visible";
    GI("dvAltaFiso").style.visibility = "hidden";

    vgContenedorDatos=JSON.parse("{\"id\":\"conDatEmisionTracs\"}");
    vgContenedorDatos.tipoMercado=1;
    vgContenedorDatos.numInstrumento=5;
    vgContenedorDatos.Pizarra=pkInfo.femiPizarra;
    vgContenedorDatos.Serie=pkInfo.femiSerie;
    vgContenedorDatos.Cupon=pkInfo.femiCupon;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);//executeRef
    //alert(url);
    makeAjaxRequest(url, "HTML", resultadoConsulta2, null);       
  }
 function resultadoConsulta2(objTabla, result) {
    //alert(result);
    var resultado =JSON.parse(result);
    //alert(resultado[0].emision)
    GI("txtDatosEmision").value=resultado[0].emision
    GI("txtDatosEmision").style.visibility = "visible";
    GI("dvAltaEmision").style.visibility = "hidden";
    
    
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmDatosMantenimiento"));                  //Deshabilita objetos (excepto botones)
    muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
    //formsLoaded();
  }
  

function AltaOModificaInfo() {
  //alert("Operacion: " + operacion);
  if(operacion==ALTA && fvMantenimiento.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    manttoCatalogo(1);
  }
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
      showWaitLayer();
      manttoCatalogo(3);
  }
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipal();
  hideWaitLayer();
}

function cargaPrincipal() {
  onButtonClickPestania('TRACs.EmisionFiso.PrincipalEmisionFiso','');
}

//SECCION PARA DAR MANTTO A LOS CATALOGOS MANUALMENTE
/*Opciones
1 Alta
2 Modificacion
3 Baja
*/
var vgContenedorDatos=null;
function manttoCatalogo(opcion){  
    vgContenedorDatos=JSON.parse("{\"id\":\"ejemanttoemisionfiso\"}");
        var NUM_FIDEICOMISO=0
        var NOM_FIDEICOMISO  =''
        var PIZARRA  =''
        var SERIE  =''
        var CUPON  =0

        if(opcion!=3)
        {
           NUM_FIDEICOMISO=GI("femiNumFideicomiso").value;
           //NOM_FIDEICOMISO=GI("nomFideicomiso").value;
           PIZARRA  =GI("txtEmisora").value; 
           SERIE  =GI("txtSerie").value; 
           CUPON  =GI("txtCupon").value; 
        }
        else
        {
           NUM_FIDEICOMISO=pkInfo.femiNumFideicomiso
           //NOM_FIDEICOMISO=GI("nomFideicomiso").value;
           PIZARRA  =pkInfo.femiPizarra
           SERIE  =pkInfo.femiSerie
           CUPON  =pkInfo.femiCupon        
        }
          vgContenedorDatos.Opcion=eval(opcion);
          vgContenedorDatos.NumFiso=eval(NUM_FIDEICOMISO);
          vgContenedorDatos.NomFiso=NOM_FIDEICOMISO;
          vgContenedorDatos.Pizarra=PIZARRA;
          vgContenedorDatos.Serie=SERIE;
          vgContenedorDatos.Cupon=eval(CUPON);
          var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);//executeRef
          //alert(url);
          makeAjaxRequest(url, "HTML", resultadoMantenimiento, null);
  }
  function resultadoMantenimiento(objTabla, result) {
    //alert(result);
    var resultado =JSON.parse(result).result;
    if(resultado==0){
      operacionExitosa();
    }
    else  if(resultado==1){
      Swal.fire('Aviso', 'No se puede eliminar, ya que la emision tiene registros asociados.',  'warning');
    }
    else{
      Swal.fire('Aviso', 'Ocurrio un Error inesperado',  'warning');        
    } 
    hideWaitLayer();
  }
  
function asignaEmisoraSerieCupon(objCmbEmisiones){
  if(objCmbEmisiones.selectedIndex != 0){
    GI("txtEmisora").value = objCmbEmisiones.value.split(",")[3];
    GI("txtSerie").value = objCmbEmisiones.value.split(",")[4];
    GI("txtCupon").value = objCmbEmisiones.value.split(",")[5];
  }else{
    limpiaTxts("txtEmisora,txtSerie,txtCupon");
  }
}  

function cargaComplemento(){

  consultaNombreFideicomiso("nomFideicomiso",GI("femiNumFideicomiso"));
  formsLoaded();
}