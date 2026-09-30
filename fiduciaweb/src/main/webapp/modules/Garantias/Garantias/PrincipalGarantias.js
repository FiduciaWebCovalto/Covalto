var catGar = new Catalogo("mx.com.inscitech.fiducia.domain.FGarantias");
var catfBienesgar = new Catalogo("mx.com.inscitech.fiducia.domain.FBienesgar");

catGar.dateFormat = "dd/MM/YYYY";
catfBienesgar.dateFormat = "dd/MM/YYYY";
var vgContenedorDatos;
//VARIABLES QUE CONTROLAN EL EVENTO DEL BOTON ACEPTAR DE LA PANTALLA PRINCIPAL

var fecha = new Date();
var OP_REGISTRO = 1;
var OP_REVALUACION = 3;
var OP_MODIFICAR = 2;
var OP_SALIDA = 5;
var OP_CONSULTAR = 4;
var OP_IMAGENES = 6;

var pkInfo = null;
var pkInfoBienesGar = null;
var pkInfoBienesGarPagos = null;
var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var modo;

var usarSetValuesFormObject=false;
var parametroComboProducto;

var cmbInstrumentoParam = JSON.parse("{\"llaveClaveSec\":-1}");

var fechas = new Date();

var strIdPK = "fgarIdFideicomiso,fgarIdSubcuenta";
var arrIdPK = strIdPK.split(",");
var strIdPKBienesGar = "fgrsIdFideicomiso,fgrsIdSubcuenta,forsCveTipoGarantia,forsIdGarantia,forsCveTipoGarantia2";
var arrIdPKBienesGar = strIdPKBienesGar.split(",");
var strIdPKBienesGarPagos = "fpbIdFideicomiso,fpbIdSubcuenta,fpbIdGarantia,fpbIdBienGarantia";
var arrIdPKBienesGarPagos = strIdPKBienesGarPagos.split(",");



var clavesCombo38 = JSON.parse("{\"llaveClave\":38}");
var clavesCombo70b = JSON.parse("{\"chido\":70}");
var clavesCombo72 = JSON.parse("{\"llaveClave\":72}");
var clavesCombo31 = JSON.parse("{\"llaveClave\":31}");
var clavesCombo52 = JSON.parse("{\"llaveClave\":52}");
var clavesCombo71 = JSON.parse("{\"llaveClave\":71}");
var clavesCombo53 = JSON.parse("{\"llaveClave\":53}");

parametroComboProducto = JSON.parse("{\"llaveClave\":71}");

var fechaActual = JSON.parse("{\"id\":\"regresaFechaActual\"}");
var clavesComboClasifBienFideicom;
//GI("paramIdFideicomiso").value=sessionStorage.getItem('sesFideicomiso');
initForms();

var tablaGarantiasData = new Array();
tablaGarantiasData[0] = "fgarIdFideicomiso,100px";
tablaGarantiasData[1] = "fgarCveGarantia2,100px";
tablaGarantiasData[2] = "fgarImpGarantiaFormatted,100px";
tablaGarantiasData[3] = "fgarImpGarantizadFormatted,100px";
//tablaGarantiasDat[5] = "fgarFecInicio,100px";
tablaGarantiasData[4] = "fgarCveStatus,100px";


var tablaBienesGarData = new Array();
tablaBienesGarData[0] = "fgrsIdFideicomiso,110px";
tablaBienesGarData[1] = "descripbien,110px";
tablaBienesGarData[2] = "forsInmUniApodoInm,80px";
tablaBienesGarData[3] = "forsInmCalleAv,80px";
tablaBienesGarData[4] = "forsInmNumIntLt,50px";
tablaBienesGarData[5] = "forsInmNumExtMza,50px";
tablaBienesGarData[6] = "forsInmColonia,80px";
tablaBienesGarData[7] = "forsInmPais,80px";
tablaBienesGarData[8] = "forsInmEstado,80px";
tablaBienesGarData[9] = "forsInmDelMun,80px";


function clickTabla(pk)
{
  cloneObject(pk,catGar.getCatalogo());
  pkInfo = pk;
  
  //GI('paramIdGar').value = pkInfo.fgarCveGarantia;
  //alert(pkInfo.fgarCveGarantia)
  GI('paramCveTipoGar').value = pkInfo.fgarCveGarantia;
  GI('paramFiso').value = pkInfo.fgarIdFideicomiso;
  
//  GI('dvModificacionGarantia').style.visibility = "visible";
  consultaBienesGar();
}

function clickTablaBienesGar(pk)
{
  cloneObject(pk,catfBienesgar.getCatalogo());
  pkInfoBienesGar = pk;  
  GI('paramIdBienGar').value = pkInfoBienesGar.forsIdGarantia;
}

function clickTablaBienesGarPagos(pk)
{
  pkInfoBienesGarPagos = pk;  
}

var fvCatGar = new FormValidator();
var fvcatfBienesgar = new FormValidator();
var fvcatfBienesgarPagos = new FormValidator();

function consultaGarantia(btnAceptar)
{
  consultar(btnAceptar, GI('frmPrincipalGarantias'), false);
  
  // limpia bienesgar
  pkInfo = null;
  pkInfoBienesGar = null;
  pkInfoBienesGarPagos = null;
  //GI('paramIdGar').value = 999999999;
  GI('paramCveTipoGar').value = 999999999;
  GI('paramFiso').value = 999999999;
  //GI('dvModificacionGarantia').style.visibility = "hidden";
  
  consultaBienesGar();
  
}


// FUNCIONES QUE CARGAN LA PANTALLA DE MANTENIMIENTO 

fvCatGar.setup({
  formName      : "frmMantenimientoGarantias",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});


fvcatfBienesgar.setup({
  formName      : "frmMantenimientoBienesGar",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});


function cargaMantenimientoGarantias(Modo){
    modo = Modo;
    if((isDefinedAndNotNull(pkInfo) || modo == OPER_ALTA)){//
        var urlCliente = "modules/Garantias/Garantias/MantenimientoGarantias.do";
        makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoGarantias, null);
    }
    else
        Swal.fire('Aviso', 'No a has seleccionado campo alguno de la tabla',  'warning');
}

function despliegaPantallaMantenimientoGarantias(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  
  fvCatGar.setup({
    formName      : "frmMantenimientoGarantias",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
  
  
  //muestraFechaActual();
  //asignaFec();
  // FIN DE LA DEFINICION DE FECHAS -------------------------------------------------------------------
   /*alert("modo "+modo )
   alert("OPER_CONSULTAR "+OPER_CONSULTAR )*/
 
 if(modo != OPER_CONSULTAR)
 {
      muestraObjs("cmdAceptar,cmdCancelar");
 }
 else  
 {
      SA(GI("cmdCancelar"),"value","Regresar");
      muestraObjs("cmdCancelar");
 }
  loadCatalogo();  
}

function operacionExitosa() {
  Swal.fire('Aviso', 'La operacion se realizo correctamente',  'warning');
  cargaPrincipalGarantias();
  hideWaitLayer();
}

function cargaPrincipalGarantias() {
  onButtonClickPestania("Garantias.Garantias.PrincipalGarantias","");
  hideWaitLayer();
}

function loadCatalogo(){
  catGar.setOnUpdate(catLoaded);
  if(modo!=OPER_ALTA&&modo!=OPER_BAJA){//SI NO ES UN REGISTRO NUEVO
        catGar.buscaCatalogoPK(false);// MANDAR LLAMAR EL MAPEO CORRESPONDIENTE CON CADA CAMPO
        if(modo==OP_MODIFICAR){//SI ES UNA MODIFICACION
              
              deshabilitaPK(arrIdPK);// BLOQUEAR LOS CAMPOS DE LLAVE PRIMARIA PERTENECIENTES A LA TABLA F_BIENES
        }
        else if(modo==OPER_CONSULTAR){
              deshabilitaObjetos(GI("frmMantenimientoGarantias")); 
              
        }   
  }
}

function catLoaded(){
  formsLoaded();
}

//_______________________________________________________________________________________

// FUNCIONES QUE SE ENCARGAN DE LA GESTION DE LAS FECHAS


function setFechaCal()
{}

function isValidDate(date)
{
  var today = new Date();
  if(date>today)
    return true;
  else
    return false;
}


function isValidDateAll(date)
{
  return false;
}

//------------------------------------------------------------------------


//FUNCIONES GENERICAS DE ESTE JAVASCRPT-----------------------------


function AltaOModificaInfo() {
  catGar.setOnUpdate(operacionExitosa);
  if(modo==OP_REGISTRO && fvCatGar.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    //actualizaImporte(); 
    catGar.altaCatalogo();
  }
  else if(modo==OP_MODIFICAR && fvCatGar.checkForm())//Se trata de una modificaci�n
  {
    showWaitLayer();
    catGar.modificaCatalogo();
  }

}

function     actualizaImporte() {
    vgContenedorDatos=JSON.parse("{\"id\":\"ejemanttogarantias\"}");
    vgContenedorDatos.Opcion=eval(1);
    vgContenedorDatos.Fideicomiso=eval(GI("fgarIdFideicomiso").value);
    //alert(GI("fgarIdSubcuenta").value)
    if(GI("fgarIdSubcuenta").value!=null)
        vgContenedorDatos.Subfiso=eval(GI("fgarIdSubcuenta").value);
    else
        vgContenedorDatos.Subfiso=eval(0);
    vgContenedorDatos.Garantia=eval(GI("fgarCveGarantia").value);
    vgContenedorDatos.Texto=GI("fgarTexGarantia").value;
    vgContenedorDatos.Comentario=GI("fgarTexComentario").value;
    //alert(GI("fgarCveRevaluaChk").value)
    if(GI("fgarCveRevaluaChk").value.length!=2)
        vgContenedorDatos.Revalua=eval(GI("fgarTexComentario").value);
    else
        vgContenedorDatos.Revalua=eval(0);
    vgContenedorDatos.Importe=""+GI("fgarImpGarantia").value;
    vgContenedorDatos.Garantizado=eval(GI("fgarImpGarantizad").value);
    //alert(GI("fgarPjePicnorado").value)
    if(GI("fgarPjePicnorado").value!=null)
        vgContenedorDatos.Pignorado=eval(GI("fgarPjePicnorado").value);
    else
        vgContenedorDatos.Pignorado=eval(0);
    vgContenedorDatos.ImpUltValua=""+GI("fgarImpUltValua").value;
    vgContenedorDatos.CvePerValua=GI("fgarCvePerValua").value;
    vgContenedorDatos.FecUltValua='';
   // alert(GI("fgarFecInicio").value)
    if(GI("fgarFecInicio").value!=null)
        vgContenedorDatos.FecInicio=GI("fgarFecInicio").value;
    else
        vgContenedorDatos.FecInicio='';
    //alert(GI("fgarFecFin").value)    
    if(GI("fgarFecFin").value!=null)    
        vgContenedorDatos.FecFin=GI("fgarFecFin").value;    
    else
        vgContenedorDatos.FecFin='';    
    vgContenedorDatos.Status=GI("fgarCveStatus").value;    
    if(GI("fgarEsGarantiaChk").value.length!=2)
        vgContenedorDatos.EsGarantia=eval(GI("fgarEsGarantiaChk").value);
    else
        vgContenedorDatos.EsGarantia=eval(0);

    
    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);//executeRef
   // alert(url);
    makeAjaxRequest(url, "HTML", resultadoMantenimiento, null);      
}

  function resultadoMantenimiento(objTabla, result) {
    //alert(result);
    var resultado =JSON.parse(result).result;
    if(resultado==0){
      Swal.fire('Aviso', 'La operacion se realizo correctamente',  'warning');
      onButtonClickPestania("Garantias.Garantias.PrincipalGarantias","");
    }
    else{
      Swal.fire('Aviso', 'Ocurrio un Error inesperado',  'warning');        
    } 
    hideWaitLayer();
  }


function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    catGar.setOnUpdate(operacionExitosa);
    showWaitLayer();
    eliminaCatalogo(catGar);
  }
}

function muestraFechaActual() {
  //fechaActual.tipoFecha="CONTABLE";
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(fechaActual);
  makeAjaxRequest(url, "HTML", insertaFechaActual, null);
}

function insertaFechaActual(obj, result) {
  //alert(result);
  var objResult = JSON.parse(result);
  
  GI("fcoDiaDia").value=objResult[0].fcoDiaDia;
  GI("fcoMesDia").value=objResult[0].fcoMesDia;
  GI("fcoAnoDia").value=objResult[0].fcoAnoDia;
  
  if(isDefinedAndNotNull(GI("fgarFecInicio"))) {
    GI("fgarFecInicio").value = formatString(GI("fcoDiaDia").value,"0",2,"Izquierda") + "/" + formatString(GI("fcoMesDia").value,"0",2,"Izquierda") + "/" + GI("fcoAnoDia").value;
  }
}

function asignaFec()
{
  if(modo==OP_REGISTRO)
    GI("fgarFecUltValua").value=GI("fgarFecInicio").value;

}




///
/***************************************** BIENES GAR ******************************************************************/
/***********************************************************************************************************************/

function consultaBienesGar()
{
  GI('cmdAceptarBienesGar').click();
  
  //GI('paramIdBienGar').value = 999999999;
}

function cargaMantenimientoBienesGar(Modo){
    modo = Modo;
    if((isDefinedAndNotNull(pkInfoBienesGar) ||isDefinedAndNotNull(pkInfo)))
    {//&& Modo != OPER_BAJA
        if(modo!=5){
            var objVerRxisteGarantia = JSON.parse("{\"id\":\"verExisteGarantia\"}");
            var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(objVerRxisteGarantia);
            
            if(modo == OP_REGISTRO)
              verificarYdesplegarMantenimiento(null,'[{"verifyExistFile":1}]');
            else
              makeAjaxRequest(url, "HTML", verificarYdesplegarMantenimiento, null);
        } 
        else {
           ejecutaFuncionParaSalidaDelBien(Modo); 
        }
    }
    else
        Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
}

function verificarYdesplegarMantenimiento(obj,result){
   var resultado = JSON.parse(result)[0];
   if(resultado.verifyExistFile==0)
        Swal.fire('Aviso', 'No se ha encontrado ningun bien dada de alta',  'warning');
   else{
        var urlCliente = "modules/Garantias/BienesGar/MantenimientoBienesGar.do";
        makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoBienesGar, null);
   }
}

function despliegaPantallaMantenimientoBienesGar(obj, result) {
  GI("dvPantalla").innerHTML = result;
  initForms();
  fvcatfBienesgar.setup({
    formName      : "frmMantenimientoBienesGar",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
     // DEFINICION DE LOS CAMPOS DE TEXTOS PARA SER CONVERTIDOS EN FECHAS --------------------------------

   Calendar.setup({
    inputField     :    "forsInmFecValor",   // id of the input field
    button         :    "forsInmFecValor",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fecha,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
   Calendar.setup({
    inputField     :    "forsMueFechaExp",   // id of the input field
    button         :    "forsMueFechaExp",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fecha,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
    
   Calendar.setup({
    inputField     :    "forsMueFechaVenc",   // id of the input field
    button         :    "forsMueFechaVenc",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fecha,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
   Calendar.setup({
    inputField     :    "forsMueFecEndoso",   // id of the input field
    button         :    "forsMueFecEndoso",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fecha,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
   Calendar.setup({
    inputField     :    "forsMueFecEntrada",   // id of the input field
    button         :    "forsMueFecEntrada",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fecha,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
   Calendar.setup({
    inputField     :    "forsMueFecSalida",   // id of the input field
    button         :    "forsMueFecSalida",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fecha,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
   Calendar.setup({
    inputField     :    "forsDerFecValor",   // id of the input field
    button         :    "forsDerFecValor",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fecha,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
    });
    
 muestraFechaActualBienesGar(); 
  // FIN DE LA DEFINICION DE FECHAS -------------------------------------------------------------------
 if(modo != OP_CONSULTAR)
 {
      muestraObjs("cmdAceptar,cmdCancelar");
 }
 else  {
      SA(GI("cmdCancelar"),"value","Regresar");
      muestraObjs("cmdCancelar");
 }
  loadCatalogoBienesGar();
   
}

function operacionExitosaBienesGar() {
  Swal.fire('Aviso', 'La operacion se realizo correctamente',  'warning');
  cargaPrincipalBienesFideicomitidos();
  hideWaitLayer();
}

function cargaPrincipalBienesFideicomitidos() {
  onButtonClickPestania("Garantias.Garantias.PrincipalGarantias","");
  hideWaitLayer();
}
var idGarantiaenBienes;
function loadCatalogoBienesGar(){
  //alert(OP_REGISTRO);
  catfBienesgar.setOnUpdate(catLoadedBienesGar);
  //alert("segunda pantalla"+modo);
  
  deshabilitaPK(arrIdPKBienesGar);// BLOQUEAR LOS CAMPOS DE LLAVE PRIMARIA PERTENECIENTES A LA TABLA F_BIENES
  
  if(modo!=OP_REGISTRO){//SI NO ES UN REGISTRO NUEVO
        catfBienesgar.buscaCatalogoPK(false);// MANDAR LLAMAR EL MAPEO CORRESPONDIENTE CON CADA CAMPO
        if(modo==OP_MODIFICAR){//SI ES UNA MODIFICACION, CIERTOS CAMPOS DEBEN ESTAR BLOQUEADOS
              //alert(modo);
              SA(GI("fbifImpBien"),"disabled","true");
              SA(GI("fbifMoneda"),"disabled","true");
              SA(GI("fbifImpMoneda"),"disabled","true");
              SA(GI("fbifStBien"),"disabled","true");
              
        }
        else if(modo==OP_REVALUACION){
              SA(GI("fgrsIdFideicomiso"),"disabled","true");
              SA(GI("fgrsIdSubcuenta"),"disabled","true");
              SA(GI("forsIdGarantia"),"disabled","true");
              SA(GI("forsCveTipoGarantia"),"disabled","true");
              SA(GI("forsCveTipoBien"),"disabled","true");
              SA(GI("forsIdentificacion"),"disabled","true");
              SA(GI("forsImpBien"),"disabled","true");
              SA(GI("forsMoneda"),"disabled","true");
              SA(GI("forsTextoDescrip"),"disabled","true");
              SA(GI("forsTexComentario"),"disabled","true");
              SA(GI("forsCveStatus"),"disabled","true");
              SA(GI("forsFecVencimiento"),"disabled","true");
              SA(GI("forsCveRevaluaChk"),"disabled","true");
              SA(GI("forsCvePerValua"),"disabled","true");
              SA(GI("forsNumEscritura"),"disabled","true");
              SA(GI("forsNumNotario"),"disabled","true");
              SA(GI("forsImpUltValua"),"disabled","true");
              SA(GI("forsFecUltValua"),"disabled","true");

              
        }
        else {//PARA SALIDA y CONSULTAR TODO EL FORMULARIO DEBE DE ESTAR BLOQUEADO
              //alert(modo)
              
              deshabilitaObjetos(GI("frmMantenimientoBienesGar"));
        }
        
        
  }
  else  {// SI ES REGISTRO
  //Swal.fire('Aviso', 'registro',  'warning')
        GI("fgrsIdFideicomiso").value = pkInfo.fgarIdFideicomiso;
        GI("fgrsIdSubcuenta").value = pkInfo.fgarIdSubcuenta;
        GI("forsCveTipoGarantia").value = pkInfo.fgarCveGarantia2;
        GI("forsCveTipoGarantia2").value = pkInfo.fgarCveGarantia2;
        idGarantiaenBienes= pkInfo.fgarCveGarantia;
        //forsCveTipoGarantia
        //alert(pkInfo.fgarCveGarantia)        
        /*alert(GI("forsCveTipoGarantia").options[2].text)*/
        //GI("forsCveTipoGarantia").selectedIndex = pkInfo.fgarCveGarantia;
        //GI("forsCveTipoGarantia").selectedIndex=pkInfo.fgarCveGarantia;
        //GI("forsCveTipoGarantia").options[pkInfo.fgarCveGarantia].text=pkInfo.fgarCveGarantia2;
        //eval(pkInfo.ctoNumEscritura)
        if(pkInfo.fgarCveGarantia2=='INMUEBLES'){
            GI('forsCveTipoGarantia').value=idGarantiaenBienes;
        
            GI("filaforsMueCsc").remove();
            GI("filaforsMueTipoCopia").remove();
            GI("filaforsMueFechaExp").remove();
            GI("filaforsMueMoneda").remove();
            GI("filaforsMueDescDoc").remove();
            GI("filaforsMueFavExpDoc").remove();
            GI("filaforsMueFecEndoso").remove();
            GI("filaforsMueFecSalida").remove();
            GI("filaforsMueImpTotMueb").remove();
            GI("filaforsDerCsc").remove();
            GI("filaforsDerNoCedito").remove();
            GI("filaforsDerImporte").remove();
            GI("filaforsDerEstatusCred").remove();
            GI("filaforsDerDirInmueble").remove();
            GI("filaforsDerEstatus").remove();
            
            muestraObjs("filaforsInmCsc");
            muestraObjs("filaforsInmEstatus");
            muestraObjs("filaforsInmImporte");
            muestraObjs("filaforsInmUniApodoInm");
            muestraObjs("filaforsInmNumExtMza");
            muestraObjs("filaforsInmColonia");
            muestraObjs("filaforsInmEstado");
            muestraObjs("filaforsInmDelMun");
            muestraObjs("filaforsInmSuperficie");
            muestraObjs("filaforsInmFecValor");
            muestraObjs("filaforsInmCuentaPred");
            muestraObjs("filaforsInmEmbargo");
                        
        }


        if(pkInfo.fgarCveGarantia2=='MUEBLES'){
            GI('forsCveTipoGarantia').value=idGarantiaenBienes;
            GI("filaforsInmCsc").remove();
            GI("filaforsInmEstatus").remove();
            GI("filaforsInmImporte").remove();
            GI("filaforsInmUniApodoInm").remove();
            GI("filaforsInmNumExtMza").remove();
            GI("filaforsInmColonia").remove();
            GI("filaforsInmEstado").remove();
            GI("filaforsInmDelMun").remove();
            GI("filaforsInmSuperficie").remove();
            GI("filaforsInmFecValor").remove();
            GI("filaforsInmCuentaPred").remove();
            GI("filaforsInmEmbargo").remove();
            GI("filaforsDerCsc").remove();
            GI("filaforsDerNoCedito").remove();
            GI("filaforsDerImporte").remove();
            GI("filaforsDerEstatusCred").remove();
            GI("filaforsDerDirInmueble").remove();
            GI("filaforsDerEstatus").remove();
                        
            muestraObjs("filaforsMueCsc");
            muestraObjs("filaforsMueTipoCopia");
            muestraObjs("filaforsMueFechaExp");
            muestraObjs("filaforsMueMoneda");
            muestraObjs("filaforsMueDescDoc");
            muestraObjs("filaforsMueFavExpDoc");
            muestraObjs("filaforsMueFecEndoso");
            muestraObjs("filaforsMueFecSalida");
            muestraObjs("filaforsMueImpTotMueb");
            
        }
        if(pkInfo.fgarCveGarantia==2)
            parametroComboEstado = JSON.parse("{\"llaveClave\": \"" +eval(71) + "\"}");
        else if(pkInfo.fgarCveGarantia==1)
            parametroComboEstado = JSON.parse("{\"llaveClave\": \"" +eval(72) + "\"}");
        else if(pkInfo.fgarCveGarantia==3)
            parametroComboEstado = JSON.parse("{\"llaveClave\": \"" +eval(73) + "\"}");
        loadElement(GI("forsCveTipoBien"));
        
        consultaSigBien();// obtiene siguiente id_bien
  }
        
}

function consultaSigBien()
{
  var objSigBien = JSON.parse("{}");
  objSigBien.id = "consultaSigBienesGar";
  objSigBien.Fiso = GI('fgrsIdFideicomiso').value;
  objSigBien.SubFiso = GI('fgrsIdSubcuenta').value;
  objSigBien.CveTipoGar = GI('forsCveTipoGarantia').value;

  var url = ctxRoot + "/getRef.do?json="+JSON.stringify(objSigBien);
  
  makeAjaxRequest(url,"html",consultaSigBienRes,null);

}

function consultaSigBienRes(obj,result)
{
  var res = JSON.parse(result)[0];
  
  GI('forsIdGarantia').value = res.idSigBien;
  
  

}

function asignaFecBienesGar()
{
 if(modo==OP_REGISTRO)
    GI("fbifFecUltValua").value=GI("fbifFecInicio").value

}

function catLoadedBienesGar()
{

  //deshabilitaObjetos(GI("frmMantenimientoBienesGar"));
  //cargaParamComboProducto(GI("fbifIdTipoBien"),true);
  if(modo==OP_REVALUACION){
        muestraObj("importeRevaluacion");
        muestraObj("txtImporteRevaluacion");
        muestraObj("divFecha");
        muestraObj("txtFecha");
        
      }
  else if(modo==OP_CONSULTAR){
        muestraObj("tipoCambio");
        muestraObj("fbifTipoCambio");
  }
  
  cargaParamComboEstado(GI("forsCveTipoGarantia"),true);
  cargaParamComboEstadoP(GI("paramCveTipoGar"),true);//paramTipoBienFideicomitido
  formsLoaded();
}

//_______________________________________________________________________________________

//FUNCIONES GENERICAS DE ESTE JAVASCRPT-----------------------------


function AltaOModificaInfoBienesGar() {
  catfBienesgar.setOnUpdate(operacionExitosaBienesGar);
  if(modo==OP_REGISTRO && fvcatfBienesgar.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    //alert(idGarantiaenBienes)
    GI("forsCveTipoGarantia").selectedIndex=idGarantiaenBienes;
    catfBienesgar.altaCatalogo();
    ejecutaFuncion(1);
  }
  else if(modo==OP_MODIFICAR && fvcatfBienesgar.checkForm())//Se trata de una modificaci�n
  {
    showWaitLayer();
    catfBienesgar.modificaCatalogo();
  }
}

//CARGA LOS COMBOS DE LA PANTALLA PRINCIPAL

  function cargaParamComboEstado(objCombo,parametro2){
  usarSetValuesFormObject=parametro2;
  //alert(""+objCombo.value);
  
    if(objCombo.value==2)
        parametroComboEstado = JSON.parse("{\"llaveClave\": \"" +eval(71) + "\"}");
    else if(objCombo.value==1)
        parametroComboEstado = JSON.parse("{\"llaveClave\": \"" +eval(72) + "\"}");
    else if(objCombo.value==3)
        parametroComboEstado = JSON.parse("{\"llaveClave\": \"" +eval(73) + "\"}");  
    else if(objCombo.value==4)
        parametroComboEstado = JSON.parse("{\"llaveClave\": \"" +eval(90) + "\"}");   
  //parametroComboEstado = JSON.parse("{\"llaveClave\": \"" +objCombo.value + "\"}");
  SA(GI("forsCveTipoBien"),"next","asignaEstado");
  loadElement(GI("forsCveTipoBien"));
}

function asignaEstado(){
  if(usarSetValuesFormObject)
    setValuesFormObject(catfBienesgar.getCatalogo());
  else
    GI("forsCveTipoBien").selectedIndex=0;
  
  formsLoaded();
}



function cargaParamComboEstadoP(objCombo,parametro2){
  usarSetValuesFormObject=parametro2;
  alert(""+objCombo.value);
    if(objCombo.value==2)
        parametroComboEstado = JSON.parse("{\"llaveClave\": \"" +eval(71) + "\"}");
    else if(objCombo.value==1)
        parametroComboEstado = JSON.parse("{\"llaveClave\": \"" +eval(72) + "\"}");
    else if(objCombo.value==3)
        parametroComboEstado = JSON.parse("{\"llaveClave\": \"" +eval(73) + "\"}");    
    else if(objCombo.value==4)
        parametroComboEstado = JSON.parse("{\"llaveClave\": \"" +eval(90) + "\"}");    

  SA(GI("paramCveTipoBien"),"next","asignaEstadoP");//paramClasFide
  loadElement(GI("paramCveTipoBien"))//paramClasFide
}

function asignaEstadoP(){
  if(usarSetValuesFormObject)
    setValuesFormObject(catfBienesgar.getCatalogo());
  else
    GI("paramCveTipoBien").selectedIndex=0;//paramClasFide
  
  formsLoaded();
}
  
  
  
  
function siCambiaLaMoneda(){
    var numOperacion = GI("fbifMoneda").value;
    var tipoOperacion = eval(numOperacion);
    if(tipoOperacion!=1){
      muestraObj("tipoCambio");
      muestraObj("fbifTipoCambio");
    }
    else {
      ocultaObj("tipoCambio");
      ocultaObj("fbifTipoCambio");
    }
}



function actualizaComboBien() {
cargaParamComboProducto(GI("fbifIdTipoBien"),false);
}


function asignaProducto(){
  if(usarSetValuesFormObject)
    setValuesFormObject(catfBienesgar.getCatalogo());
  /*else
   Swal.fire('Aviso', 'hola',  'warning');
    GI("fbifIdCveBien").selectedIndex=0;*/
  
  formsLoaded();
}

function ejecutaFuncionParaSalidaDelBien(Modo) {
    if(confirm("Desea confirmar el procesamiento de datos?"))
     {   
      ejecutaFuncion(Modo);
    }
    else
    {
       if(modo==OP_SALIDA)
          onButtonClickPestania("Garantias.Garantias.PrincipalGarantias","");
    }   
}

function ejecutaFuncion(modo){
//Swal.fire('Aviso', 'ejecutaFuncion',  'warning');
    var mesHab=null;
    //Swal.fire('Aviso', 'No existe Operacion Contable',  'warning');
    /*if(fvcatfBienesgar.checkForm())
    {*/
        /*  var objCargaBienesGarParam = JSON.parse("{\"id\":\"funRegistroBienesGar\"}");
          //alert(modo)
          objCargaBienesGarParam.TipoOperecion=eval(modo); 
          //alert(idGarantiaenBienes)
          if(modo==1){
              objCargaBienesGarParam.Fideicomiso=eval(GI("fgrsIdFideicomiso").value);  
              objCargaBienesGarParam.Subfiso=eval(GI("fgrsIdSubcuenta").value);
              //alert(eval(GI("forsIdGarantia").value))
              objCargaBienesGarParam.IdGarantia=eval(2);
              objCargaBienesGarParam.ClaveGar=eval(forsCveTipoGarantia); 
              objCargaBienesGarParam.TipoBien=eval(GI("forsCveTipoBien").value);            
          }
          else{
              objCargaBienesGarParam.Fideicomiso=eval(pkInfo.fgarIdFideicomiso);  
              objCargaBienesGarParam.Subfiso=eval(pkInfo.fgarIdSubcuenta);
              //alert(eval(GI("forsIdGarantia").value))
              objCargaBienesGarParam.IdGarantia=eval(pkInfo.forsIdGarantia);
              objCargaBienesGarParam.ClaveGar=eval(pkInfo.forsCveTipoGarantia); 
              objCargaBienesGarParam.TipoBien=eval(pkInfo.forsCveTipoBien);                
          }
        var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objCargaBienesGarParam);
        //alert(url);
        makeAjaxRequest(url, "HTML", validaCargaFideicomitidos, null);*/
   //}
}

function validaCargaFideicomitidos(obj, result){
  //alert(result);
  var resultado = JSON.parse(result);
  if(resultado == 1 ) {
    Swal.fire('Aviso', 'Ocurrio un error inesperado',  'warning');
  }
  else if(resultado == 2 )
  {
    Swal.fire('Aviso', 'No existe Operacion Contable',  'warning');
  }
  else  if(resultado== 0)
  {
    Swal.fire('Aviso', 'Proceso correcto',  'warning');
  onButtonClickPestania("Garantias.Garantias.PrincipalGarantias","");
  }
  else
  {
    alert("No existe Operaci�n Contable: "+resultado);
  }
 
 hideWaitLayer();
}


function muestraFechaActualBienesGar() {
  //fechaActual.tipoFecha="CONTABLE";
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(fechaActual);
  makeAjaxRequest(url, "HTML", insertaFechaActual, null);
}

function insertaFechaActual(obj, result) {
  var objResult = JSON.parse(result);
  
  GI("fcoDiaDia").value=objResult[0].fcoDiaDia;
  GI("fcoMesDia").value=objResult[0].fcoMesDia;
  GI("fcoAnoDia").value=objResult[0].fcoAnoDia;
  
  if(isDefinedAndNotNull(GI("forsFecUltValua"))) {
    GI("forsFecUltValua").value = formatString(GI("fcoDiaDia").value,"0",2,"Izquierda") + "/" + formatString(GI("fcoMesDia").value,"0",2,"Izquierda") + "/" + GI("fcoAnoDia").value;
  }
}


function muestraValor(obj){
  if(obj.checked){
    obj.value="on";
    }
  else{ obj.value="off";}
}



/***********************************************************************************************************************/
/***********************************************************************************************************************/

// modificacion de la garantia


function modificacionGarantia()
{
  if(isDefinedAndNotNull(pkInfo))
  {
    var objMGarantia = JSON.parse("{}");
    objMGarantia.id = "ejeFunModificacionGarantia";
    objMGarantia.numFiso = pkInfo.fgarIdFideicomiso;
    objMGarantia.numScta = pkInfo.fgarIdSubcuenta;
    objMGarantia.numIdGarantia = GI('cmbTipoGarantia').value; 
    
    if((pkInfo.fgarCveGarantia==objMGarantia.numIdGarantia)||(GI('cmbTipoGarantia').selectedIndex==0))
    {
      Swal.fire('Aviso', 'Seleccione Tipo de Garantia diferente',  'warning');
      return;
    }
    
    var url = ctxRoot+"/executeRef.do?json="+JSON.stringify(objMGarantia);
    
    makeAjaxRequest(url,"html",modificacionGarantiaRes,null);
  
  }
  else
  {
    Swal.fire('Aviso', 'Seleccione Garantia',  'warning');
  }
}

function modificacionGarantiaRes(obj,result)
{
  var res = JSON.parse(result);
  
  if(isDefinedAndNotNull(res))
  {
    switch(res.RESULTADO)
    {
      case 0:
        Swal.fire('Aviso', 'Se ha modificado la Garantia',  'warning');
        consultaGarantia();
        break;
      default:
        Swal.fire('Aviso', 'Ocurrio un error inesperado',  'warning');
        break;
    }
  
  }
  else
  {
    Swal.fire('Aviso', 'Ocurrio un error inesperado',  'warning');
  }
  
}


//--


function esInmueble(chkRegimen)
{
  bRegimen = chkRegimen.checked;
  
  if(bRegimen)
  {
    if(GI('forsCveTipoGarantia').value!=71) // NO ES INMUEBLE
    {
          chkRegimen.checked = false;
    }
  }

}

function number_format(amount, decimals) {
    amount += ''; // por si pasan un numero en vez de un string
    amount = parseFloat(amount.replace(/[^0-9\.]/g, '')); // elimino cualquier cosa que no sea numero o punto

    decimals = decimals || 0; // por si la variable no fue fue pasada

    // si no es un numero o es igual a cero retorno el mismo cero
    if (isNaN(amount) || amount === 0) 
        return parseFloat(0).toFixed(decimals);

    // si es mayor o menor que cero retorno el valor formateado como numero
    amount = '' + amount.toFixed(decimals);

    var amount_parts = amount.split('.'),
        regexp = /(\d+)(\d{3})/;

    while (regexp.test(amount_parts[0]))
        amount_parts[0] = amount_parts[0].replace(regexp, '1' + ',' + '2');

    //return amount_parts.join('.');
    amount.value = amount_parts.join('.');
    //alert(amount.value)
}

function format(input)
{
var num = input.value.replace(/\./g,'');
if(!isNaN(num)){
num = num.toString().split('').reverse().join('').replace(/(?=\d*\.?)(\d{3})/g,'$1.');
num = num.split('').reverse().join('').replace(/^[\.]/,'');
input.value = num;
}
 
else{ Swal.fire('Aviso', 'Solo se permiten numeros',  'warning');
input.value = input.value.replace(/[^\d\.]*/g,'');
}
}

function numFormat(dec, miles)

{
var num = this.valor, signo=3, expr;

var cad = ""+this.valor;

var ceros = "", pos, pdec, i;

for (i=0; i < dec; i++)

ceros += '0';

pos = cad.indexOf('.')

if (pos < 0)

    cad = cad+"."+ceros;

else

    {

    pdec = cad.length - pos -1;

    if (pdec <= dec)

        {

        for (i=0; i< (dec-pdec); i++)

            cad += '0';

        }

    else

        {

        num = num*Math.pow(10, dec);

        num = Math.round(num);

        num = num/Math.pow(10, dec);

        cad = new String(num);

        }

    }

pos = cad.indexOf('.')

if (pos < 0) pos = cad.lentgh

if (cad.substr(0,1)=='-' || cad.substr(0,1) == '+') 

       signo = 4;

if (miles && pos > signo)

    do{

        expr = /([+-]?\d)(\d{3}[\.\,]\d*)/

        cad.match(expr)

        cad=cad.replace(expr, RegExp.$1+','+RegExp.$2)

        }

while (cad.indexOf(',') > signo)

    if (dec<0) cad = cad.replace(/\./,'')

        return cad;

}

//Fin del objeto oNumero: