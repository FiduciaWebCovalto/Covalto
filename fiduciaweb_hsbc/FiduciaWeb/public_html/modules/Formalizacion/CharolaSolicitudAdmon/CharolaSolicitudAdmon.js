//***DEFINICON DE LOS BEANS**************************************************************************************************************
var cat = new Catalogo("mx.com.inscitech.fiducia.domain.Instrucc");

//***VARIABLES GLOBALES******************************************************************************************************************
var paramsQryDocumentsCbo;
var clavesCombo638 = JSON.parse("{\"llaveClave\":638}");
var paramPerfil = JSON.parse("{\"orderPerfil\":\"s\"}");
var paramQueryAdmon = JSON.parse("{\"order\":\"s\"}");
var asignaPerfil = JSON.parse("{\"numEtapa\":\""+eval(1)+"\"}");

var vgFunPtoRev=1;
var vgFunDoc=2;
var vgFunAutorizar=3;
var vgFunRechazar=4;

var strIdPK = "insNumContrato,insNumFolioInst";
var arrIdPK = strIdPK.split(",");
var fvCat = new FormValidator();
var opcion = 0;
var pkInfoCharSol = null;
var pkInfoPtoRev=null;

var vgObjqryllenaTablaAdmon=null;
var vgContenedorDatos=null;
var txtPerfil;
var userId;

var vgNumEtapa;
var vgIdEtapa;
var vgFecIni;
var vgFecFin;

var vgValor;
var vgTipoSolicitud;//nuevo
var vgEtapa;

initForms();
//***DEFINICION DEL CONTENIDO DE TABLAS DE CONSULTA**************************************************************************************
var arrTblDatCharSol = new Array();
arrTblDatCharSol[0] = "insNumFolioInst,100px";
arrTblDatCharSol[1] = "insFechaContable,100px";  
arrTblDatCharSol[2] = "insNumContrato,70px";
arrTblDatCharSol[3] = "insCveTipoInstr,100px";
arrTblDatCharSol[4] = "insTxtComentario,300px";

//arrTblDatCharSol[5] = "insCveStInstruc,100px";
function clickTablaCharSol(pk){
	pkInfoCharSol = pk;
	cloneObject(pk,cat.getCatalogo());
}

var arrTblDatPtoRev = new Array();
arrTblDatPtoRev[0] = "fpurIdPuntorev,100px";
arrTblDatPtoRev[1] = "fpurDescripcion,400px";
arrTblDatPtoRev[2] = "frxoRevCorrecta,50px";
arrTblDatPtoRev[3] = "frxoObservacion,600px";

function clickTablaPtoRev(pk){
	pkInfoPtoRev = pk;
	cloneObject(pk,cat.getCatalogo());
	GI("rdSi").checked=false;
	GI("rdNo").checked=false;
	GI("txtObservaciones").value="";     
}

///////////////////////////////////////////////////////////////////////FUNCIONALIDAD DEL MODULO////////////////////////////////////////////////////////////////////
//***FUNCIONALIDAD BOTONES*********************************************************************************************************************
function funcionDelBoton(opc){
   if(isDefinedAndNotNull(pkInfoCharSol)){
	  opcion=opc;
	  txtPerfil=GI("Perfil").value;
	  userId=GI("txtuserId").value;
	  vgEtapa=GI("paramEtapa").value;
	  vgTipoSolicitud=pkInfoCharSol.insTxtComentario;
	  paramsQryDocumentsCbo = JSON.parse("{\"numOper\":\"" +pkInfoCharSol.insNumOper + "\",\"numEtapa\":\""+eval(1)+"\"}");
	  showWaitLayer();
	 if(opcion==vgFunPtoRev||opcion==vgFunDoc){
		obtenerDatosPrevioCargarPantallaMantto();
	 }
  }
  else{
	Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
  }
}

function obtenerDatosPrevioCargarPantallaMantto(){
  vgContenedorDatos=null;
  vgContenedorDatos=JSON.parse("{\"id\":\"obtenNumEtapa\"}");
  //vgContenedorDatos.perfil=eval(txtPerfil);
  vgContenedorDatos.tipoSol='N';
  vgContenedorDatos.numEtapa=1;
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
  //alert(url);
  makeAjaxRequest(url, "HTML", obtenNumEtapaYa, null);
}

function obtenNumEtapaYa(obj,result){
	//alert(result);
	var resultado = JSON.parse(result)[0];
	vgNumEtapa=resultado.fetaSecEtapa;
	vgIdEtapa=resultado.fetaIdEtapa;
	//alert("vgNumEtapa = "+vgNumEtapa+"  vgIdEtapa = "+vgIdEtapa);
	//OBTENER LA FECHA CONTABLE CON LA HORA
	var qryObtenFecha=JSON.parse("{\"id\":\"obtenFecha\"}");
	var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(qryObtenFecha);
	makeAjaxRequest(url, "HTML", funcObtenFecha, null);
}

function funcObtenFecha(obj,result){
	var resultado = JSON.parse(result)[0];
	vgFecIni=resultado.fecha;
	vgFecFin=resultado.fecha;
	//DETERMINAR SI EL FIDEICOMISO ES FOSEG O NO
	vgContenedorDatos=null;
	vgContenedorDatos=JSON.parse("{\"id\":\"determinarFisoFoseg\"}");
	vgContenedorDatos.numFiso=pkInfoCharSol.insNumContrato;
	var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
	//alert(url);
	makeAjaxRequest(url, "HTML", determinandoFisoFoseg, null);
}

function determinandoFisoFoseg(obj,result){
	//alert("result determinandoFisoFoseg = "+result);
	var respuesta=JSON.parse(result)[0];
	//alert(respuesta.esfoseg);
	if(respuesta.esfoseg=="S")
		obtenerDatosParaPantallaMantenimiento(0);//REGRESARA DATOS PARA FISO TIPO FOSEG
	else
		obtenerDatosParaPantallaMantenimiento(1);
}

function obtenerDatosParaPantallaMantenimiento(opc){
	var fechaSinHora;
	vgContenedorDatos=null;
	vgContenedorDatos=JSON.parse("{\"id\":\"ejeFunFichaUnica\"}");//EJECUTANDO FUNCION FICHA UNICA*************************************************************************************
	vgContenedorDatos.opcion=2;
	vgContenedorDatos.folio=eval(pkInfoCharSol.insNumFolioInst);
	//FORMATEANDO FECHA
	fechaSinHora=vgFecIni.split(" ");//quitando la hora
	//alert("Fecha:"+fechaSinHora[0]);
	vgContenedorDatos.fecha=fechaSinHora[0];
	vgContenedorDatos.status=pkInfoCharSol.insCveStInstruc;
	//alert("Status:"+pkInfoCharSol.insCveStInstruc);
	//alert("foseg:"+opc);
	vgContenedorDatos.foseg=eval(opc);
	vgContenedorDatos.usuario=eval(GI("txtuserId").value);
	var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
	//alert(url)
	makeAjaxRequest(url, "HTML",datosObtenidos , opc);//cargaTipoPantalla
}

function datosObtenidos(opc,result){
  //alert(result);
  var rusultado= JSON.parse(result);
  var res=rusultado.result
  if(res==0)
	 recogerDatosParaPantallaMantenimiento(opc);
  else {
	 Swal.fire('Aviso', 'ocurrio un error al obtener los datos de la ficha unica',  'warning')}
}

function recogerDatosParaPantallaMantenimiento(opc){
	//alert(pkInfoCharSol.insNumContrato);
	vgContenedorDatos=null;
	vgContenedorDatos=JSON.parse("{\"id\":\"conNomFid\"}");//PRIMERO SE PROCESA LA BITACORA
	vgContenedorDatos.numFideicomiso=eval(pkInfoCharSol.insNumContrato);
	var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(vgContenedorDatos);
	//alert(url)
	makeAjaxRequest(url, "HTML", recogiendoDatos, null);  
}

function recogiendoDatos(obj,result){
  //alert(result);
  vgValor=JSON.parse(result)[0];
  cargaTipoPantalla();
}

function cargaTipoPantalla(){
   if(opcion==vgFunPtoRev){
	  var urlCliente = ctxRoot + "/modules/Formalizacion/CharolaSolicitudAdmon/PuntosRevisionSolicitudesAdmon.do";
	  makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
   }
   else{
	  var urlCliente = ctxRoot + "/modules/Formalizacion/CharolaSolicitudAdmon/DocumentosSolicitudesAdmon.do";
	  makeAjaxRequest(urlCliente, "HTML", despliegaPantalla, null);
   }
}

function despliegaPantalla(obj,result){
  GI("dvContenido").innerHTML = result;
  initForms();
  if(opcion==vgFunPtoRev){
	 //Agregando la funcionalidad del required
	  fvCat.setup({
		formName      : "frmPtosSol",
		tipoAlert     : 1,
		alertFunction : BaloonAlert,
		sendObjToAlert: true
	  });
	  //hideWaitLayer();
	 cat.buscaCatalogoPK(false);
	 asignaValoresAobjetosFormulario2();
  }
  else{//FUNCIONALIDAD DOCUMENTOS
	//Agregando la funcionalidad del required
		fvCat.setup({
		  formName      : "frmDocumentos",
		  tipoAlert     : 1,
		  alertFunction : BaloonAlert,
		  sendObjToAlert: true
		});
		cat.buscaCatalogoPK(false);
		asignaValoresAobjetosFormulario();
  }
}

function asignaValoresAobjetosFormulario2(){
//alert(vgValor.ctoNomContrato);
 //GI("ins").value=vgValor.ctoNumContrato;
 GI("insNumContrato").value=pkInfoCharSol.insNumContrato
  GI("txtNomContraro").value=vgValor.nombre;
  GI("txtInsOperacion").value=vgTipoSolicitud;
  GI("paramEtapa").value=vgEtapa;
  if(opcion==vgFunPtoRev)
	cat.setOnUpdate(cargaTablaParaPtosRev);
  else
	  cat.setOnUpdate(formsLoaded);
}


function asignaValoresAobjetosFormulario(){
//alert(vgValor.ctoNomContrato);
 //GI("ins").value=vgValor.ctoNumContrato;
 GI("txtNumContrato").value=pkInfoCharSol.insNumContrato
  GI("txtNomContraro").value=vgValor.nombre;
  GI("txtInsOperacion").value=vgTipoSolicitud;
  GI("paramEtapa").value=vgEtapa;
  if(opcion==vgFunPtoRev)
	cat.setOnUpdate(cargaTablaParaPtosRev);
  else
	  cat.setOnUpdate(formsLoaded);
}

//***funciones auxiliares****************************************************************************************
function verNomFiso(){
consultaNombreFideicomiso('nomFideicomiso',GI("paramFiso"));
}

function regresarAlaCharola(){
onButtonClick("Formalizacion/CharolaSolicitudAdmon/CharolaSolicitudAdmon","");
hideWaitLayer();
}

function cargaTablaParaDocumentos(){
	  vgContenedorDatos=null;
	  vgContenedorDatos = new Object();
	  vgContenedorDatos.tipo=2
	  vgContenedorDatos.perfil=txtPerfil;
	  eval(pkInfoCharSol.insNumOper)==null?vgContenedorDatos.numOper=0:vgContenedorDatos.numOper= pkInfoCharSol.insNumOper;
	  vgContenedorDatos.fiso=pkInfoCharSol.insNumContrato
	  vgContenedorDatos.numfolio=GI("insNumFolioInst").value;
	  vgContenedorDatos.documento=GI("cboNombre").value;
	  despliegaTabla(GI("tblRegDocumentos"),vgContenedorDatos);
}

function cargaTablaParaPtosRev(){
  vgContenedorDatos=null;
  vgContenedorDatos = new Object();
	  vgContenedorDatos.tipo=1
	  vgContenedorDatos.perfil=txtPerfil
	  eval(pkInfoCharSol.insNumOper)==null?vgContenedorDatos.numOper=0:vgContenedorDatos.numOper= pkInfoCharSol.insNumOper;
	  vgContenedorDatos.fiso=GI("insNumContrato").value
	  vgContenedorDatos.numfolio=GI("insNumFolioInst").value
	  vgContenedorDatos.documento=0;
	  //alert("datos ptos rev:"+vgContenedorDatos);
	  despliegaTabla(GI("tblRegPtosRev"),vgContenedorDatos);
}


function despliegaTabla(tabla,obj){
vgObjqryllenaTablaAdmon=JSON.parse("{\"id\":\"qryllenaTablaAdmon\"}");
	  vgObjqryllenaTablaAdmon.tipo=eval(obj.tipo);
	  vgObjqryllenaTablaAdmon.numEtapa=eval(1);
	  vgObjqryllenaTablaAdmon.numOper=obj.numOper;
	  vgObjqryllenaTablaAdmon.fiso=eval(obj.fiso);
	  vgObjqryllenaTablaAdmon.numfolio=eval(obj.numfolio);
	  vgObjqryllenaTablaAdmon.documento=eval(obj.documento);
	  var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(vgObjqryllenaTablaAdmon);
	  //alert(url)
	  makeAjaxRequest(url, "HTML", resultadoConsulta, tabla);
}
function resultadoConsulta(objTabla, result) {
//alert(result);
var resultado = JSON.parse(result);
//alert(resultado.length)
if(isDefinedAndNotNull(resultado) && resultado.length>0){
  loadTableElement(objTabla, result);
  hideWaitLayer();
}
else{
  Swal.fire('Aviso', 'No existen Registros para estos criterios de búsqueda',  'warning');
  regresarAlaCharola();
  hideWaitLayer();
 } 
}

//***FUNCIONALIDAD DEL BOTON GUARDAR*********************************************************************************

function guardar(tp){ //tp = tipo pantalla: ptos revision o documentos
if(fvCat.checkForm()){
if(isDefinedAndNotNull(pkInfoPtoRev)){
	  if(tp==1) {//FUNCIONALIDAD AL GUARDAR PARA PTOS DE REVISION
		vgContenedorDatos=null;
		vgContenedorDatos=JSON.parse("{\"id\":\"funcionAceptarRechazarCharolaSolPtosRev\"}");//PRIMERO SE PROCESA LA BITACORA
		vgContenedorDatos.opcion=eval(tp);
		vgContenedorDatos.contrato=eval(GI("insNumContrato").value);
		vgContenedorDatos.folio=eval(GI("insNumFolioInst").value);
		vgContenedorDatos.numEtapa=eval(vgNumEtapa);
		vgContenedorDatos.numOper=pkInfoCharSol.insNumOper;
		vgContenedorDatos.idEtapa=eval(vgIdEtapa);
		vgContenedorDatos.idPtoRev=eval(pkInfoPtoRev.fpurIdPuntorev);
		if(GI("rdSi").checked==true) vgContenedorDatos.revCorrecta="S"
		if(GI("rdNo").checked==true) vgContenedorDatos.revCorrecta="N"
		vgContenedorDatos.obsrvacion=GI("txtObservaciones").value;
		vgContenedorDatos.Fecha=vgFecIni;
		vgContenedorDatos.numUsuario=eval(userId);
		vgContenedorDatos.firma=0;
		vgContenedorDatos.idDoc=0;
		var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
		//alert(url)
		makeAjaxRequest(url, "HTML", ejecutaFuncion, tp);
	  }else {//FUNCIONALIDAD AL GUARDAR DOCUMENTOS
		vgContenedorDatos=null;
		vgContenedorDatos=JSON.parse("{\"id\":\"funcionAceptarRechazarCharolaSolPtosRev\"}");//PRIMERO SE PROCESA LA BITACORA
		vgContenedorDatos.opcion=eval(tp);
		vgContenedorDatos.contrato=pkInfoCharSol.insNumContrato;
		vgContenedorDatos.folio=eval(GI("insNumFolioInst").value);
		vgContenedorDatos.numEtapa=eval(vgNumEtapa);
		vgContenedorDatos.numOper=pkInfoCharSol.insNumOper;
		vgContenedorDatos.idEtapa=eval(vgIdEtapa);
		vgContenedorDatos.idPtoRev=eval(pkInfoPtoRev.fpurIdPuntorev);
		if(GI("rdSi").checked==true) vgContenedorDatos.revCorrecta="S"
		if(GI("rdNo").checked==true) vgContenedorDatos.revCorrecta="N"
		vgContenedorDatos.obsrvacion=GI("txtObservaciones").value;
		vgContenedorDatos.Fecha=vgFecIni;
		vgContenedorDatos.numUsuario=eval(userId);
		vgContenedorDatos.firma=0;
		vgContenedorDatos.idDoc=eval(GI("cboNombre").value);
		var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
		//alert(url)
		makeAjaxRequest(url, "HTML", ejecutaFuncion, tp);
	  }
}else {
   Swal.fire('Aviso', 'selecciona un punto de revision de la tabla',  'warning');
}
}
}

function ejecutaFuncion(tp,result){
 //alert(result);
 var resultado= JSON.parse(result);
 var res=resultado;
 if(res.result==0){
	if(tp==1){
	   Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
	   cargaTablaParaPtosRev();
	}else{
	   Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
	   cargaTablaParaDocumentos();
	 }
 }
 else if(res.result==1)
  Swal.fire('Aviso', 'No se puede autorizar debido a que no todos los puntos de revisión fueron correctos',  'warning');
 else if(res.result==2)
  Swal.fire('Aviso', 'No se puede autorizar debido a que no todos los puntos de revisión de los documentos fueron correctos',  'warning');
 else if(res.result==3)
  Swal.fire('Aviso', 'No se puede rechazar una solicitud con todos los puntos de revisión correctos',  'warning');      
 else {
   Swal.fire('Aviso', 'Ocurrio un error al tratar de modificar el valor',  'warning')}
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

var vgopcAutRech;
function autorizaRechaza(opc){
 vgopcAutRech=opc;
 
 if(!GI("SubeSolicitudChk").checked&&opc==1) 
	 Swal.fire('Aviso', 'Debe subir la imagen para Autorizar la Solicitud!',  'warning')else if(isDefinedAndNotNull(pkInfoCharSol)){ 
	vgContenedorDatos=null;
	vgContenedorDatos=JSON.parse("{\"id\":\"funcionAceptarRechazarCharolaSol\"}");
	vgContenedorDatos.opcion=eval(opc);
	vgContenedorDatos.numEtapa=eval(1);
	vgContenedorDatos.contrato=eval(pkInfoCharSol.insNumContrato);
	vgContenedorDatos.folio=eval(pkInfoCharSol.insNumFolioInst);
	vgContenedorDatos.numOper=pkInfoCharSol.insNumOper;
	vgContenedorDatos.numUsuario=eval(GI("txtuserId").value)

	var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
	//alert(url)
	makeAjaxRequest(url, "HTML", ejecutaAutorizaRechaza, null);
  } else
	Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
}

function ejecutaAutorizaRechaza(obj, resultado){ 
var sMensaje="";
var resp= JSON.parse(resultado);
var r=resp.result
//alert(r);
switch(r){
 case -1: Swal.fire('Aviso', 'A ocurrido un error',  'warning'); break;
 case  0: 
  if(vgopcAutRech!=1){
   if(vgopcAutRech==1)
   sMensaje="SOLICITUD DE OTROS SERVICIOS RECHAZADA\n"
   sMensaje+="\nFolio: "+pkInfoCharSol.insNumFolioInst ;
   sMensaje+="\nFideicomiso: "+pkInfoCharSol.insNumContrato ;
   sMensaje+="\nServicio: "+pkInfoCharSol.insTxtComentario ;
   sMensaje+="\nOperada por el usuario: "+GI("paramNomUsuario").value;
   /*sign(sMensaje);
   if(iFirmaSatisfactoria==0)      
   {  */    
	  Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');  
	  consultar(GI("cmdAceptar"), GI("frmCharolaSolicitudes"), false); 
   /*}*/   
  }  
  else{
   if(vgopcAutRech==1)
	sMensaje="SOLICITUD DE OTROS SERVICIOS AUTORIZADA\n"
   else 
	sMensaje="SOLICITUD DE OTROS SERVICIOS RECHAZADA\n"
   sMensaje+="\nFolio: "+pkInfoCharSol.insNumFolioInst ;
   sMensaje+="\nFideicomiso: "+pkInfoCharSol.insNumContrato ;
   sMensaje+="\nServicio: "+pkInfoCharSol.insTxtComentario ;
   sMensaje+="\nOperada por el usuario: "+GI("paramNomUsuario").value;
   /*sign(sMensaje);
   if(iFirmaSatisfactoria==0)      
   {*/
	vgContenedorDatos=null;
	vgContenedorDatos=JSON.parse("{\"id\":\"funcionAceptarRechazarCharolaSolFrmElec\"}");
	vgContenedorDatos.opcion=eval(vgopcAutRech);
	vgContenedorDatos.numEtapa=eval(1);
	vgContenedorDatos.contrato=eval(pkInfoCharSol.insNumContrato);
	vgContenedorDatos.folio=eval(pkInfoCharSol.insNumFolioInst);
	vgContenedorDatos.numOper=pkInfoCharSol.insNumOper;
	vgContenedorDatos.usuario=eval(GI("txtuserId").value)
	if(GI("SubeSolicitudChk").checked)
		vgContenedorDatos.subioImagen=eval(1)
	else
		vgContenedorDatos.subioImagen=eval(0)		
	var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
	//alert(url)
	makeAjaxRequest(url, "HTML", ejecutaAutorizaRechazaFrmElec, null);      
   /*} */
  }
  break;
 case  1: Swal.fire('Aviso', 'No se puede autorizar ésta instruccion debido a que no todos sus puntos de revision han sido correctos',  'warning'); consultar(GI("cmdAceptar"), GI("frmCharolaSolicitudes"), false); break;
 case  2: Swal.fire('Aviso', 'No se puede autorizar ésta instruccion debido a que no todos sus documentos tienen sus puntos de revision correctos',  'warning'); break;
 case  3: Swal.fire('Aviso', 'Imposible rechazar una instruccion con todos sus puntos de revision correctos',  'warning'); break;
}
}

function ejecutaAutorizaRechazaFrmElec(obj, resultado){ 
var resp= JSON.parse(resultado);
var r=resp.result  
switch(r){
 case -1: Swal.fire('Aviso', 'A ocurrido un error',  'warning'); break;
 case  0: 
  //enviarFirma(); 
  enviaCorreo(pkInfoCharSol.insNumFolioInst);	  
  Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success'); 
  consultar(GI("cmdAceptar"), GI("frmCharolaSolicitudes"), false); 
  break;
}   
}

function fin(){}

function generaReporte(){
 var idLink = "linkReporteNew"; 
 var parametrosUrl = new Object;
 parametrosUrl.sendToJSP="true";
 parametrosUrl.urlReporte="/jsp/Reportes/MesaControl/Finalidades.jsp"
 parametrosUrl.id="repFinalidadesMesaControl";
 parametrosUrl.fiso=pkInfoCharSol.insNumContrato
 var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
 var link = GI(idLink);
 link.href=url;
 link.click();
 document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
}

function  AgregaArchivo(){
 var idLink = "linkReporteNew"; 
 var parametrosUrl = new Object;
 parametrosUrl.sendToJSP="true";
 parametrosUrl.urlReporte="/jsp/Reportes/MesaControl/AgregaArchivo.jsp"
 parametrosUrl.id="repFinalidadesMesaControl";
 parametrosUrl.fiso=567;
 var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
 var link = GI(idLink);
 link.href=url;
 link.click();
 document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
}

//codigo para ubicar la tabla principal en el folio solicitado
function regresarAlaCharola2(){
showWaitLayer();   
var objDatosFolio = new Object();
objDatosFolio.numFolio = GI("insNumFolioInst").value;  
objDatosFolio.Etapa = GI("paramEtapa").value; 
var urlCliente = "modules/Formalizacion/CharolaSolicitudAdmon/CharolaSolicitudAdmon.do";
makeAjaxRequest(urlCliente, "HTML", ubicaFolioSolicitado, objDatosFolio);    
}
function ubicaFolioSolicitado(obj, result){
GI("dvContenido").innerHTML = result;
pkInfo = null;
var botonTemp2 = GI("cmdLimpiar");
GI("paramnumEtapa").value=eval(1);    
SA(botonTemp2,"ref","qryMuestraNombreEtapa");
SA(botonTemp2,"fun","loadTxtElementX");
SA(botonTemp2,"tabla","paramEtapa");
consultar(botonTemp2, GI("frmCharolaSolicitudes"), false);     
var botonTemp = GI("cmdLimpiar");
GI("paramnumfolio").value=obj.numFolio;    
GI("paramEtapa").value=obj.Etapa;    
SA(botonTemp,"ref","qryCharolInstrucAdmon");
SA(botonTemp,"fun","loadTableElement");
SA(botonTemp,"tabla","tblRegCharSol");
consultar(botonTemp, GI("frmCharolaSolicitudes"), false);  
formsLoaded();
}  

function enviarFirma(){
 idLink = "linkReporteNew"; 
 var parametrosUrl = new Object;
 parametrosUrl.sendToJSP="true";
 /*if(pkcs7_=="")
  pkcs7_="vacio"*/
 //parametrosUrl.urlReporte="/jsp/Reportes/MesaControl/EnviarFirma.jsp";
 parametrosUrl.urlReporte="/modules/Formalizacion/CharolaInstruccionAdmon/EnviarFirma.jsp";
 parametrosUrl.id="muestraDatosInstruFrmElec";
 parametrosUrl.FolioFiducia=eval(pkInfoCharSol.insNumFolioInst);
 parametrosUrl.ParamJsp_pk=pkcs7_;//;+"&SignedText="+sMensaje;
 parametrosUrl.ParamJsp_Text=sMensaje;
 parametrosUrl.ParamJspFolioFiducia=pkInfoCharSol.insNumFolioInst+"";
 var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
 idLink.href=url;
 window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");        
 document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
} 



function getViewer(obj){

var uris=GA(this,'uris'); var names=GA(this,'names');  var target=GA(this,'target');  if(target=='new' || target=='blank'){window.open(ctxRoot+'/jsp/Global/Visualizer.jsp?uris='+uris+'&names='+names);  }else{Swal.fire('Aviso', 'Modulo en desarrollo',  'warning')}
}

function enviaCorreo(folio){
 var idLink = "linkReporteNew"; 
 var parametrosUrl = new Object;
 parametrosUrl.sendToJSP="true";
// Swal.fire('Aviso', 'llego aki',  'warning')parametrosUrl.urlReporte="/modules/Administracion/Agenda/EnviarCorreo.jsp"
 parametrosUrl.id="mandaCorreoInstrucc";
 parametrosUrl.folio=folio;
 var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(parametrosUrl);
 //alert(url)
 idLink.href=url;
 window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");        
 //idLink.click();
 document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
}

function viewDoc(objBtn) {
	var objSel = GI('cboNombre');
	var objLnk = GI('docLink');
	var url = "#";
	alert(objSel.value)
	switch(parseInt(objSel.value)) {
		case 100: //Solicitud de Revocacion Firmada
			url = ctxRoot + "/temp/solicitud.pdf";
			break;
		case 101: //Identificacion Oficial vigente
			url = ctxRoot + "/temp/identificacion.pdf";
			break;
		case 102: //En su caso Acuerdo del Comite
			url = ctxRoot + "/temp/acuerdo.pdf";
			break;
		case 103: //Copia del Poder a Revocar
			url = ctxRoot + "/temp/poder.pdf";
			break;
		default:
			Swal.fire('Aviso', 'Seleccione un documento',  'warning');
	}
	
	SA(objLnk, "href", url);
	objLnk.click();
}
