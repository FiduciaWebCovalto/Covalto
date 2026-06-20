var catProspectosFideicomitentes = new Catalogo("mx.com.inscitech.fiducia.domain.Afidben");
var paramsQryDocumentsCbo;
showWaitLayer();

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;
var CONSULTARPR = 4;

var clavesCombo31  = JSON.parse("{\"llaveClave\":31}");
var clavesCombo23 = JSON.parse("{\"llaveClave\":23}");
var clavesCombo1109  = JSON.parse("{\"llaveClave\":1109}");
var clavesComboTipoPersona = JSON.parse("{\"llaveClave\":1128}");
var consultaDatosInformativos = JSON.parse("{\"id\":\"conNomProyecto\",\"numFideicomiso\":0}");
var validacionAlta = JSON.parse("{\"id\":\"cuentaAnteproyectosBajaProspectos\",\"numProspecto\":0}");
var validacionAlta2 = JSON.parse("{\"id\":\"verificaExistenciaFideicomitente\",\"cvePersona\":0,\"numFidben\":0,\"anteproyecto\":0}");

var contenedor = new Object();

initForms();

var tablaFideicomitentesData = new Array();
tablaFideicomitentesData[0] = "afbNumFidben,100";
tablaFideicomitentesData[1] = "afbAnteproyecto,100";
tablaFideicomitentesData[2] = "afbNomFidben,300";
tablaFideicomitentesData[3] = "afbTipoPersona,300";
tablaFideicomitentesData[4] = "afbCvePersona,100";
tablaFideicomitentesData[5] = "afbCveStFidBen,200";

var operacion = 0;
var numPantalla = 0;
pkInfo=null;
var parametroComboEstado;
var usarSetValuesFormObject=false;
var fvMantenimientoFideicomitentes = new FormValidator();
//deshabilitaPK("txtNomProyecto".split(","));
//No permitir editar el campo informativo de la pÃ¡gina principal:
//1. Nombre del proyecto (Nombre del negocio)
//deshabilitaPK("txtNomProyecto".split(","));

//////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalProspectosFideicomitentes() {
  onButtonClickPestania("Formalizacion.PrincipalProspectosFideicomitentes","");
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,catProspectosFideicomitentes.getCatalogo());
}

function operacionExitosa() {
  Swal.fire('Aviso', 'La operaciÃ³n se realizÃ³ correctamente',  'warning');
  cargaPrincipalProspectosFideicomitentes();
  hideWaitLayer();
}


function operacionExitosaKYC() {
  Swal.fire('Aviso', 'La operaciÃ³n se realizÃ³ correctamente',  'warning');
  //cargaPrincipalProspectosFideicomitentes();
  ocultaObjs("cmdAceptar"); //Mostrar el botÃ³n Aceptar y Cancelar
  SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botÃ³n
  deshabilitaObjetos(GI("frmDatosMantenimientoFideicomitentes"));      
  cargaCheckList();
  hideWaitLayer();
}


//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda pantalla
function cargaMantenimientoFideicomitentes(tipoPantalla) {
  if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR || tipoPantalla==CONSULTARPR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Formalizacion/MantenimientoProspectosFideicomitentes.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoProspectosFideicomitentes, null);
  }
}

function despliegaPantallaMantenimientoProspectosFideicomitentes(obj, result) {
    GI("dvPantalla").innerHTML = result;
    initForms();
    
    //Agregando la funcionalidad del required
    fvMantenimientoFideicomitentes.setup({
        formName      : "frmDatosMantenimientoFideicomitentes",
        tipoAlert     : 1,
        alertFunction : BaloonAlert,
        sendObjToAlert: true
    });
    
    //No permitir editar el campo informativo de la pagina de mantenimiento:
    //1. Nombre del proyecto (Nombre del negocio)
    deshabilitaPK("txtNomProyecto,afbNumFidben".split(","));
    GI('btnViewDoc').style.visibility='hidden';
    //GI('cboNombre').style.visibility='hidden';
}

function loadCatalogo() {
  catProspectosFideicomitentes.setOnUpdate(catLoaded);
  if(operacion==MODIFICAR || operacion==CONSULTAR || operacion==CONSULTARPR)
    catProspectosFideicomitentes.buscaCatalogoPK(false);
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botÃ³n Aceptar y Cancelar
    formsLoaded();
  }
}

function catLoaded() {
  //cargaParamComboEstado(GI("afbNomPais"),true);
  if(operacion==MODIFICAR)//Si se trata de una modificaciÃ³n, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el botÃ³n Aceptar y Cancelar
    deshabilitaPK("afbCvePersona,afbNumFidben,afbAnteproyecto".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botÃ³n
    deshabilitaObjetos(GI("frmDatosMantenimientoFideicomitentes"));                   //Deshabilita objetos (excepto botones)
     //muestraObjs("cmdKYC");
	paramsQryDocumentsCbo = JSON.parse("{}");
        paramsQryDocumentsCbo.Tipo = getClaveKYC(); 
	//loadElement(GI("cboNombre"));
	//GI('btnViewDoc').style.visibility='visible';
        GI('cmdCuentas').style.visibility='visible';
	//GI('cboNombre').style.visibility='visible';
	//GI('cboNombre').disabled=false;
    cargaCheckList();
  }
  else if(operacion==CONSULTARPR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botÃ³n
    deshabilitaObjetos(GI("frmDatosMantenimientoFideicomitentes"));                   //Deshabilita objetos (excepto botones)
     //muestraObjs("cmdKYC");
	paramsQryDocumentsCbo = JSON.parse("{}");
        paramsQryDocumentsCbo.Tipo = getClaveKYC(); 
	//loadElement(GI("cboNombre"));
	//GI('btnViewDoc').style.visibility='visible';
        GI('cmdCuentas').style.visibility='visible';
	//GI('cboNombre').style.visibility='visible';
	//GI('cboNombre').disabled=false;
    cargaCheckList();
  }  
  muestraObjs("cmdCancelar"); //Mostrar el botÃ³n Regresar
  //Mostrar datos en campos informativos
  mostrarDatosInformativos(3);
  formsLoaded();
}

function AltaOModificaInfo() {
    catProspectosFideicomitentes.setOnUpdate(operacionExitosaKYC);
    
    showWaitLayer();
    
    //VALIDACION DE PORCENTAJES
    vgContenedorDatos = null;
    vgContenedorDatos = JSON.parse("{\"id\":\"funcionPorcentajes\"}");//PRIMERO SE PROCESA LA BITACORA
    vgContenedorDatos.etapa = 'PROYECTO';
    vgContenedorDatos.fiso = eval(GI("afbAnteproyecto").value); 
    vgContenedorDatos.tipopersona = GI("afbCvePersona").value;
    vgContenedorDatos.porcentaje = eval(GI("afbCurp").value);

    var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
    makeAjaxRequest(url, "HTML", ejecutaFuncionPorcentaje, null);          
}

var nombre;
function ejecutaFuncionPorcentaje(tp,result){
    //alert(result);
    var rusultado= JSON.parse(result);
    var res=rusultado.result
    if(res==0){
     if((operacion==ALTA ||operacion==MODIFICAR) && fvMantenimientoFideicomitentes.checkForm() )//Se trata de una alta
        {
            //catProspectosFideicomisarios.altaCatalogo();
            var vgContenedorDatos=null;
            vgContenedorDatos=JSON.parse("{\"id\":\"funcionIncorporaTipoPers\"}");//PRIMERO SE PROCESA LA BITACORA
            vgContenedorDatos.Etapa='PROYECTO';
            vgContenedorDatos.NumProyFid=eval(GI("afbAnteproyecto").value);
            vgContenedorDatos.TipoPers=GI("afbCvePersona").value;
            vgContenedorDatos.NumPers=eval(GI("afbNumFidben").value);
            GI("NombrePersona").value=GI("afbNomFidben").value;
            nombre=GI("NombrePersona").value;
            vgContenedorDatos.Nombre=GI("NombrePersona").value;
            vgContenedorDatos.CatPersona=GI("afbTipoPersona").value;
            vgContenedorDatos.Pais=GI("afbNomPais").value;
            vgContenedorDatos.Calidad=GI("afbTelFidben").value;
            vgContenedorDatos.Status='PENDIENTE';    
            vgContenedorDatos.Curp=GI("afbCurp").value;    
            var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
            //console.log(url);
            //alert(url)
            makeAjaxRequest(url, "HTML", ejecutaFuncion, null);    
        }
        else if(operacion==MODIFICAR && fvMantenimientoFideicomitentes.checkForm())//Se trata de una modificaciÃ³n
        {
            showWaitLayer();
            catProspectosFideicomitentes.modificaCatalogo();
        }
    } 
    else if(res==1){
      Swal.fire('Aviso', 'El Porcentaje Total del Proyecto supera el 100%, Favor de revisar',  'warning');
    }
    hideWaitLayer();     
  }
    var anteproy;
    var numsec;
    
  function ejecutaFuncion(tp,result){
    //alert(result);
    var rusultado= JSON.parse(result);
    var res=rusultado.result
    if(res==0){
        //se incorpora el proyecto de negocio al WF
        vgContenedorDatos=null;
        vgContenedorDatos=JSON.parse("{\"id\":\"funcionProyectoWF\"}");//PRIMERO SE PROCESA LA BITACORA
        vgContenedorDatos.proyecto=eval(GI("afbAnteproyecto").value);
        anteproy=eval(GI("afbAnteproyecto").value);
        vgContenedorDatos.tipo=GI("afbTipoPersona").value;//"P"+GI("afbTipoPersona").value.substring(0,1)+((GI("afbNomPais").value=="MEXICO")?"NAC":"EXT"); 
        vgContenedorDatos.tipopersona=GI("afbCvePersona").value;
        vgContenedorDatos.numeropersona=eval(GI("afbNumFidben").value);
        numsec=eval(GI("afbNumFidben").value);
        vgContenedorDatos.etapa='DICTAMINACION';
        var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
        //alert(url)
        makeAjaxRequest(url, "HTML", ejecutaFuncion2, null);       
    
      //Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
    } 
    else if(res==1){
      Swal.fire('Aviso', 'El Registro ya existe',  'warning');
    }
    else if(res==2){
      Swal.fire('Aviso', 'Existen Registros PENDIENTES por Autorizar',  'warning');
    }    
    else {
      Swal.fire('Aviso', 'Ocurrio un error al realizar la Operacion.',  'warning')}
    hideWaitLayer();     
    onButtonClickPestania("Formalizacion.PrincipalProspectosFideicomitentes","");  
  }


  function ejecutaFuncion2(tp,result){
     //alert(result);
     var resultado= JSON.parse(result);
    var res=resultado.result
    //alert("res "+res)
     if(res!=0){
       Swal.fire('Aviso', 'Ocurrio un error al tratar de incorporar la Instruccion',  'warning')}  
     else{
        //FUNCION PARA ACTUALIZAR NOMBRE
        var objParametros=null;
        objParametros = JSON.parse("{\"id\":\"updNombreAFB\"}");
        //alert(GI("afbAnteproyecto").value);
        objParametros.anteproy=anteproy;
        objParametros.numpers=numsec;
        objParametros.nomb=nombre;
        var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objParametros);
        //console.log(url);
        makeAjaxRequest(url, "HTML", respuestaAltaNombre, null);
        //Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
     }
  }

function respuestaAltaNombre(obj, result){
    //Swal.fire('Aviso', 'aqui',  'warning')var resultado = JSON.parse(result);
  /*console.log(result);
  console.log(obj);*/
  if(isDefinedAndNotNull(resultado) && resultado.codigoError == 0) {
    Swal.fire('¡Éxito!', "Operación realizada exitosamente", 'success');
  } else {
    Swal.fire('Aviso', 'Ocurri un error al realizar la operacin!',  'warning');
  }
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    var objelimina = JSON.parse("{\"id\":\"borraFunPrev\",\"proyecto\":" + pkInfo.afbAnteproyecto +
                                                                              ",\"tipo\":\"" + pkInfo.afbCvePersona +"\""+
                                                                              ",\"persona\":"  + pkInfo.afbNumFidben + "}");    
    var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objelimina);                                                                              
    makeAjaxRequest(url,"HTML",funborraAutoPrev,null);
  }
}

function funborraAutoPrev(obj,result)
{

     var objResult = JSON.parse(result);
     
    catProspectosFideicomitentes.setOnUpdate(operacionExitosa);
    showWaitLayer();
    eliminaCatalogo(catProspectosFideicomitentes);
}

//////////////////////////////////////////////////////////////
//Funciones para cargar el combo Estado
function cargaParamComboEstado(objCombo,parametro2){
  usarSetValuesFormObject=parametro2;
  parametroComboEstado = JSON.parse("{\"llaveClaveEstado\": \"" +objCombo.value + "\"}");
  SA(GI("afbNomEstado"),"next","asignaEstado");
  loadElement(GI("afbNomEstado"));
}

function asignaEstado(){
  if(usarSetValuesFormObject)
    setValuesFormObject(catProspectosFideicomitentes.getCatalogo());
  else
    GI("afbNomEstado").selectedIndex=0;
  
  formsLoaded();
}


//////////////////////////////////////////////////////////////
function consultarExistenciaFideicomitente() {
  /*if(GI("afbNumFidben").value!="" && GI("afbAnteproyecto").value!="")
  {
    validacionAlta2.cvePersona = GI("afbCvePersona").value;
    validacionAlta2.numFidben = GI("afbNumFidben").value;
    validacionAlta2.anteproyecto = GI("afbAnteproyecto").value;
    
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta2);
    makeAjaxRequest(url, "HTML", verificacionAlta2, null);
  }
  else*/ 
    if(GI("afbAnteproyecto").value!="") {
        mostrarDatosInformativos(2);
    } else if(GI("afbAnteproyecto").value=="") {
        GI("txtNomProyecto").value="";
    }
}

function verificacionAlta2(obj, result) {
    var objResult = JSON.parse(result);
    if(objResult[0].existeRegistro > 0) {
        Swal.fire('Aviso', 'Ya existe ese registro, verifique',  'warning');
        GI("afbNumFidben").value="";
        GI("afbAnteproyecto").value="";
        GI("txtNomProyecto").value="";
    } else {
        mostrarDatosInformativos(2);
    }
}

function mostrarDatosInformativos(parametroPantalla) {
  GI("txtNomProyecto").value="";
  showWaitLayer();
  //alert(parametroPantalla)
  if(parametroPantalla==1) {
    consultaDatosInformativos.numFideicomiso = GI("paramProyecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
  } else if(parametroPantalla==2) {
    consultaDatosInformativos.numFideicomiso = GI("afbAnteproyecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos2, null);  
  } else {
    consultaDatosInformativos.numFideicomiso = GI("afbAnteproyecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
  }
}

function insertaDatosInformativos2(obj, result) {
    var objResult = JSON.parse(result);
    GI("txtNomProyecto").value=objResult[0].nombre;
    
    var Secuencial = JSON.parse("{\"id\":\"contProyecto\",\"Anteproyecto\":0}");
    Secuencial.Anteproyecto=GI("afbAnteproyecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(Secuencial);
    makeAjaxRequest(url, "HTML", validaProyecto1, null);    
}


function verificarAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].totalAnteproy > 0)
  {
      consultaDatosInformativos.numFideicomiso = GI("afbAnteproyecto").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(consultaDatosInformativos);
    //alert(url)
    makeAjaxRequest(url, "HTML", insertaDatosInformativos, null);
  }
  else
  {
    Swal.fire('Aviso', 'El Proyecto no existe, verifique',  'warning');
    GI("afbAnteproyecto").value="";
    GI("txtNomProyecto").value="";
    GI("afbNumFidben").value="";
    GI("afbAnteproyecto").focus();
    hideWaitLayer();
  }
}

function insertaDatosInformativos(obj, result) {
  var objResult = JSON.parse(result);
  //GI("txtNomProyecto").value=objResult[0].nombre;
  hideWaitLayer();
}

function validaProyecto1(obj, result) {
  var objResult = JSON.parse(result);
    var existeProyecto=objResult[0].secNumAfidben;
    
    if(existeProyecto>0){
        var Secuencial = JSON.parse("{\"id\":\"contProyecto2\",\"Anteproyecto\":0}");
        Secuencial.Anteproyecto=GI("afbAnteproyecto").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(Secuencial);
        //alert(url);
        makeAjaxRequest(url, "HTML", constituido, null);  
        /*var Secuencial = JSON.parse("{\"id\":\"ValidaProyecto\",\"Anteproyecto\":0}");
        Secuencial.Anteproyecto=GI("afbAnteproyecto").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(Secuencial);
        makeAjaxRequest(url, "HTML", validaProyecto, null);  */
    }
    else{
        Swal.fire('Aviso', 'El Proyecto no Existe, verifique',  'warning');
        GI("afbAnteproyecto").value="";  
        GI("afbAnteproyecto").focus();
        hideWaitLayer();
    }
}
function constituido(obj, result){
    var objResult = JSON.parse(result);
    var existe=objResult[0].existe;
    //alert("validacion en contratos=" +existe);
    if(existe>0){
        Swal.fire('Aviso', 'El Proyecto ya estÃ¡ Constituido, no se puede modificar',  'warning');
        GI("afbAnteproyecto").value="";  
        GI("afbAnteproyecto").focus();
        hideWaitLayer();
    }
    else{
        var Secuencial = JSON.parse("{\"id\":\"ValidaProyecto\",\"Anteproyecto\":0}");
        Secuencial.Anteproyecto=GI("afbAnteproyecto").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(Secuencial);
        makeAjaxRequest(url, "HTML", validaProyecto, null);
        
    }
}
function validaProyecto(obj, result) {
  var objResult = JSON.parse(result);
    var fideicomiso=objResult[0].fideicomiso;
    var tiene_archivos=objResult[0].archivos;
    if(fideicomiso!=0){
        var Secuencial = JSON.parse("{\"id\":\"numSecAfidben\"}");
        //Secuencial.Anteproyecto=GI("afbAnteproyecto").value;
        var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(Secuencial);
        makeAjaxRequest(url, "HTML", verificarSecuencial, null);
    } else {
    Swal.fire('Aviso', 'El Proyecto no tiene asignado Fideicomiso, verifique',  'warning');
    GI("afbAnteproyecto").value="";  
    GI("afbAnteproyecto").focus();
    hideWaitLayer();
    }
}
function verificarSecuencial(obj, result) {
  var objResult = JSON.parse(result);
  GI("afbNumFidben").value=objResult[0].secNumAfidben;
  
  consultaDatosInformativos.numFideicomiso = GI("afbAnteproyecto").value;
  validacionAlta.numProspecto = GI("afbAnteproyecto").value;
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
  makeAjaxRequest(url, "HTML", verificarAlta, null);
}

/// enlace CHECKLIST-----------------

function cargaCheckList()
{
  contenedor.Proyecto = GI("afbAnteproyecto").value;
  contenedor.NumPersona = GI("afbNumFidben").value;
  contenedor.NomPersona = GI("afbNomFidben").value;
  //alert((GI("afbTipoPersona").value.indexOf("FISICA")!=-1?"F":"M"))
  //alert(operacion)
  
  if(operacion==CONSULTARPR)
    contenedor.TPersona = getClaveKYC();
  else
    contenedor.TPersona = getClaveKYC();
  //alert(contenedor.TPersona)  
  var url = ctxRoot + "/modules/Formalizacion/KYC/PrincipalCheckList.do";
  makeAjaxRequest(url, "HTML", cargaParametros, contenedor);
  loadDynamicJS(ctxRoot + "/modules/Formalizacion/KYC/PrincipalCheckList.js");
}


function cargaParametros(obj,result) {
    GI("cargaCheck").innerHTML = result;
    //initForms();
    GI("paramProyecto").value= obj.Proyecto;
    GI("paramTPersona").value= obj.TPersona;
    GI("paramNumPersona").value= obj.NumPersona;
    GI("paramNomPersona").value= obj.NomPersona;
    GI("idRegresar").value = 1;
    
    switch (GI("afbCvePersona").value) {
        case "FIDEICOMITENTE":
            GI("paramTipo").value = 1;
        break;
        case "FIDEICOMISARIO":
            GI("paramTipo").value = 2;
        break;
        case "COMITÉ TÉCNICO":
            GI("paramTipo").value = 3;
        break;
        case "OTROS":
            GI("paramTipo").value = 4;
        break;
    }
    
    var url = ctxRoot + "/executeRef.do?json={\"id\":\"ejeFunCargaConceptosKYCProyecto\",\"TPersona\":\"" + obj.TPersona + "\",\"Proyecto\":" + obj.Proyecto + ",\"Tipo\":" + GI("paramTipo").value + ",\"NumPersona\":" + obj.NumPersona + "}";
    makeAjaxRequest(url, "HTML",cargaConceptosKYC,null);
}

function cargaConceptosKYC(obj,result){
  var resultado = JSON.parse(result).result;
  //alert(resultado);
  switch(resultado){
    case 0:
        consultar(GI("cmdCargar"), GI('frmCheckList'), false);
    break;
    case 1:
      Swal.fire('Aviso', 'No hay Conceptos para esta Persona',  'warning');
    break;
  }
  hideWaitLayer();
  GI('ContenedorKYC').style.visibility='visible';
  GI('cargaConceptos').innerHTML='<div style="color: #CCCCCC;font-size: 70px;font-weight: bold;">KYC</div>';
}


  function viewDoc(objBtn) {
	var objSel = GI('cboNombre');
	var objLnk = GI('docLink');
	var url = "#";
	//alert(objSel.value)
	switch(parseInt(objSel.value)) {
		case 100: //Solicitud de Revocacion Firmada
			url = ctxRoot + "/temp/solicitud.pdf";
			break;
		case 101: case 301: //Identificacion Oficial vigente
			url = ctxRoot + "/temp/identificacion.pdf";
			break;
		case 102: //En su caso Acuerdo del Comite
			url = ctxRoot + "/temp/acuerdo.pdf";
			break;
		case 103: //Copia del Poder a Revocar
			url = ctxRoot + "/temp/poder.pdf";
			break;
		case 103: //Copia del Poder a Revocar
			url = ctxRoot + "/temp/poder.pdf";
			break;
		case 205: //proyecto de negocio
			url = ctxRoot + "/temp/proyecto.PDF";
			break;			
		case 300: //Copia del Poder a Revocar
			url = ctxRoot + "/temp/instruccionpago.pdf";
			break;	
		case 302: //Copia FATCA
			url = ctxRoot + "/temp/FormatoFATCA.pdf";
			break;	
		case 303: //RFC
			url = ctxRoot + "/temp/RFC.pdf";
			break;	
		case 304: //CURP
			url = ctxRoot + "/temp/CURP.pdf";
			break;				
		default:
			Swal.fire('Aviso', 'Seleccione un documento',  'warning');
	}
	
	SA(objLnk, "href", url);
	objLnk.click();
}
function llamaReplica(){
    if (isDefinedAndNotNull(pkInfoCharSol)) {
        if(confirm("¿Esta seguro que desea aplicar?")){
            var parametrosUrl = {
                id : 'storeReplicaKYC', 
                proy:pkInfo.afbAnteproyecto,
                numPers:pkInfo.afbNumFidben
            }
            var url = ctxRoot + '/executeRef.do?json=' + JSON.stringify(parametrosUrl);
            //alert(url)
            makeAjaxRequest(url, "HTML", confirmaReplica, null);
        }
    }else
        Swal.fire('warning', 'No ha seleccionado campo alguno de la tablal', 'warning') 
}
function confirmaReplica(obj,result) {
    
    if( JSON.parse(result).RESULTADO == 0){
        Swal.fire('Aviso', 'Proceso realizado con exito',  'warning');
    }else{
        Swal.fire('Aviso', 'Ocurri un error en el proceso',  'warning');
    }
}
/*Funciones para vigencia de documentos*/
function cargaPrincipalCuentas(){
  //showWaitLayer();
 // Swal.fire('Aviso', 'entro a cuentas',  'warning')var objDatosFideicom = new Object();
  objDatosFideicom.NumAnteproy = GI("afbAnteproyecto").value;
  objDatosFideicom.NumPers= GI("afbNumFidben").value;
  objDatosFideicom.TipoParte= GI("afbCvePersona").value;
  objDatosFideicom.TipoPers= GI("afbTipoPersona").value;
  objDatosFideicom.pant= 1;
  var urlCliente = "modules/Formalizacion/VigenciaDoctos/PrincipalVigenciaDoctos.do";
  makeAjaxRequest(urlCliente, "HTML", despliegaPantallaPrincipalDirecciones, objDatosFideicom);
  loadDynamicJS(ctxRoot + "/modules/Formalizacion/VigenciaDoctos/PrincipalVigenciaDoctos.js");
  //alert(JSON.stringify(objDatosFideicom));
}
function despliegaPantallaPrincipalDirecciones(obj, result) {
  GI("dvPantalla").innerHTML = result;
  deshabilitaObjetos(GI("frmDatos"));
  //asignaEtiqueta("nomFideicomiso",obj.NomContrato);
  //GI("fidNomFideicom").value = obj.NomFideicomitente;
  GI("paramnumProyec").value = obj.NumAnteproy; //prsNumProspecto
  GI("paramnumPersona").value = obj.NumPers;
  GI("paramTipoPer").value = obj.TipoPers;
  GI("paramTipoParte").value = obj.TipoParte;
  GI("pantORIG").value=obj.pant;
  consultar(GI("cmdRegresar"), GI("frmDatos"), false);
  formsLoaded();
}
function fin(){}
function invocaRiesgo() {
        vgContenedorDatos=null;
        vgContenedorDatos=JSON.parse("{\"id\":\"funcionRiesgo\"}");//PRIMERO SE PROCESA LA BITACORA
        vgContenedorDatos.fideicomiso=pkInfo.afbAnteproyecto;
        vgContenedorDatos.tipopersona='';//"P"+GI("afbTipoPersona").value.substring(0,1)+((GI("afbNomPais").value=="MEXICO")?"NAC":"EXT"); 
        vgContenedorDatos.numeropersona=pkInfo.afbNumFidben;
        vgContenedorDatos.rfc='';
        vgContenedorDatos.fechadel='';
        vgContenedorDatos.fechaal='';
        vgContenedorDatos.status='';
        vgContenedorDatos.tiponegocio='PROYECTO';
        var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);
        //alert(url)
        makeAjaxRequest(url, "HTML", ejecutaFuncionRiesgo, null); 
}        

  function ejecutaFuncionRiesgo(tp,result){
     //alert(result);
     var resultado= JSON.parse(result);
    var res=resultado.result
    //alert("res "+res)
     if(res!=0){
       Swal.fire('Aviso', 'Ocurrio un error al tratar de Determinar el Riesgo',  'warning')}  
     else{
        Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success');
     }
  }
  
function getClaveKYC() {
    var clave = "P";
    var propietario = "";
    
    if(operacion==CONSULTARPR) {
        propietario = "P";
    }
    
    if(GI("afbTipoPersona").value.indexOf("FISICA") != -1) {
        clave += "F";
    } else if (GI("afbTipoPersona").value.indexOf("MORAL") != -1) {
        clave += "M";
    } else {
        clave += "FISO";
    }
    
    if(GI("afbTipoPersona").value.indexOf("NACIONAL") != -1) {
        clave += "NAC" + propietario;
    } else if (GI("afbTipoPersona").value.indexOf("EXTRANJERA") != -1) {
        clave += "EXT" + propietario;
    }
    
    switch (GI("afbCvePersona").value) {
        case "FIDEICOMITENTE":
            clave += "F";
        break;
        case "FIDEICOMISARIO":
            clave += "B";
        break;
        case "COMITÉ TÉCNICO":
            clave += "C";
        break;
        case "OTROS":
            clave += "O";
        break;
        default:
            clave += "";
    }
    return clave;
}