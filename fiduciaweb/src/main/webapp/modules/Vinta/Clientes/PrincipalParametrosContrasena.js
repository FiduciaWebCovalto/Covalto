var cat = new Catalogo("mx.com.inscitech.fiducia.domain.Clientes");

var clavesCombo23 = JSON.parse("{\"llaveClave\":23}");

showWaitLayer();

var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;


var tablaData = new Array();
tablaData[0] = "idCliente,100px";
tablaData[1] = "nombre,300px";
tablaData[2] = "ctipoPersona,300px";
tablaData[3] = "vnivelRiesgo,300px";

var fvMantenimiento = new FormValidator();

fvMantenimiento.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

pkInfo=null;
initForms();
formsLoaded();

var fechaDefault = new Date();
function isValidDate(date){ 
  var today = new Date();
  return false;
}
var feriados;
var hay_feriados=0;
function getDateInfo(date, wantsClassName) {
  var as_number = CalendarExtended.dateToInt(date);
  if(hay_feriados!=0){
    for(i=0;i<feriados.length;i++){
      if (as_number==feriados[i][0]){
        return {
      
          klass   : feriados[i][2],
          tooltip : "<div style='text-align: center'>"+feriados[i][1]+"</div>"
        };
      }
    }
  }
};
var cal = CalendarExtended.setup({					
		showTime: 12,    
    date           :    fechaDefault,
    disableFunc    :    isValidDate,
		onSelect: function(cal) { cal.hide() ; },
    dateInfo : getDateInfo,
    animation: false
});


function limpiar(objForma){
  RF(objForma);
  cat = new Catalogo("mx.com.inscitech.fiducia.domain.InternasPreocupantes");
  pkInfo = null;
}

function clickTabla(pk) {
  pkInfo = pk;
  cloneObject(pk,cat.getCatalogo());
}

//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda pantalla

var operacion = 0;

function cargaMantenimiento(tipoPantalla) {
  if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Vinta/Clientes/MantenimientoParametrosContrasena.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimiento, null);
  }
}


function despliegaPantallaMantenimiento(obj, result) {
  GI("dvPantalla").innerHTML = result;
  hideWaitLayer();
  initForms();
  loadCatalogo();
  
  cal.manageFields("dfechaNac", "dfechaNac", "%d/%m/%Y");
    
  //Agregando la funcionalidad del required
  fvMantenimiento.setup({
    formName      : "frmDatosMantenimiento",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true,
    showErrors    : true
  });
}

function loadCatalogo() {
  //cat.setOnUpdate(catLoaded);
  if(operacion==MODIFICAR || operacion==CONSULTAR){
    //cat.buscaCatalogoPK(false);
    MuestraInformacionClientes(operacion);
  }  
  else
  {
    verificarAlta();
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
  }
}

function catLoaded() {
  if(operacion==MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
  {
    Swal.fire('Aviso', 'entros',  'warning')muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
    deshabilitaPK("idCliente".split(","));
    funcactivacampos();
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmDatosMantenimiento"));                  //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();
}

function AltaOModificaInfo() {
  //alert("Operacion: " + operacion);
GI("idDatosCliente").value=GI("idCliente").value;
GI("idDireccion").value=GI("idCliente").value; 
GI("vmunDel").value=GI("fdelgMun").value; 
GI("vestado").value=GI("ventFed").value; 

  cat.setOnUpdate(operacionExitosa);
  if(operacion==ALTA && fvMantenimiento.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    manttoCatalogo(operacion)
  }
  else if(operacion==MODIFICAR && fvMantenimiento.checkForm())//Se trata de una modificación
  {
    showWaitLayer();
    manttoCatalogo(operacion)
  }
}

function eliminarRegistro(operacion) {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    manttoCatalogo(operacion)
  }
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipal();
  hideWaitLayer();
}

function cargaPrincipal() {
  onButtonClickPestania("Vinta.Clientes.PrincipalParametrosContrasena","");
}



function verificarAlta() {
    var ingresaSecuencial = JSON.parse("{\"id\":\"conClientesCredito\"}");
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(ingresaSecuencial);
    //alert(url)
    makeAjaxRequest(url, "HTML", funcionIngresaSecuencial, null);
}

function funcionIngresaSecuencial(obj, result) {
 //alert(result)
  var objResult = JSON.parse(result);
  GI("idCliente").value = objResult[0].folio;
}

function funcactivacampos() {
    ActivaTipoPersona();
}

function ActivaTipoPersona()
{
    //1 persona fisica y 2 persona moral
    if(GI("ctipoPersona").value=='MORAL') {
        GI("vapaterno").disabled=true;
        GI("vamaterno").disabled=true;
    }
    else {
        GI("vapaterno").disabled=false;
        GI("vamaterno").disabled=false;        
    }
}

function ValidaLongRFC() {
    if(GI("vrfc").value!=""){
        if(!(GI("vrfc").value.length>=13 && GI("iprRfc").value.length<=14) ){
            Swal.fire('Aviso', 'La longitud del RFC deber ser entre 13 y 14 Caracteres',  'warning');
            GI("vrfc").focus();
        }      
    }
}

function ValidaLongCURP() {
    if(GI("vcurp").value!=""){
        if(GI("vcurp").value.length!=18){
            Swal.fire('Aviso', 'La longitud del CURP deber ser de 18 Caracteres',  'warning');
            GI("vcurp").focus();
        }
            
    }
}

//mantenimiento tablas direcciones y datos clientes
function manttoCatalogo(opcion){      
    vgContenedorDatos=JSON.parse("{\"id\":\"ejemantto\"}");
        var     cliente = 0;
        var	vlugarNac	='';
        var	vpaisNac	='';
        var	ventFed	='';
        var	fdelgMun	='';
        var	dfechaNac	='';
        var	vestadoCiv	='';
        var	vregMat	='';
        var	vcalleNum	='';
        var	vcolonia	='';
        var	vpoblacion	='';
        var	vmunDel	='';
        var	vestado	='';
        var	vpais	='';
        var	ncp	='';
        var	ntel	='';

        var incliente = '';
        var ctipoPersona = '';
        var vnRs = '';
        var vapaterno = '';
        var vamaterno = '';
        var vnacionalidad = '';
        var csexo = '';
        var vcurp = '';
        var vrfc = '';
        var vnumFiel = '';
        var icta1 = '';
        var icta2 = '';
        var vnivelRiesgo = '';
        
        if(opcion!=4){
            cliente=GI("idCliente").value
            vlugarNac = GI("vlugarNac").value;
            vpaisNac = GI("vpaisNac").value;
            ventFed = GI("ventFed").value;
            fdelgMun = GI("fdelgMun").value;
            dfechaNac = GI("dfechaNac").value;
            vestadoCiv = GI("vestadoCiv").value;
            vregMat = GI("vregMat").value;
            vcalleNum = GI("vcalleNum").value;
            vcolonia = GI("vcolonia").value;
            vpoblacion = GI("vpoblacion").value;
            vmunDel = GI("vmunDel").value;
            vestado = GI("vestado").value;
            vpais = GI("vpais").value;
            ncp = GI("ncp").value;
            ntel = GI("ntel").value;  
            
            incliente=GI("incliente").value;
            ctipoPersona=GI("ctipoPersona").value;
            vnRs=GI("vnRs").value;
            vapaterno=GI("vapaterno").value;
            vamaterno=GI("vamaterno").value;
            vnacionalidad=GI("vnacionalidad").value;
            csexo=GI("csexo").value;
            vcurp=GI("vcurp").value;
            vrfc=GI("vrfc").value;
            vnumFiel=GI("vnumFiel").value;
            icta1=GI("icta1").value;
            icta2=GI("icta2").value;
            vnivelRiesgo=GI("vnivelRiesgo").value;            
        }
        else
        {
         cliente= pkInfo.idCliente
        }
        vgContenedorDatos.Opcion=eval(opcion);
        vgContenedorDatos.cliente=eval(cliente);        
        vgContenedorDatos.vlugarNac = vlugarNac;
        vgContenedorDatos.vpaisNac = vpaisNac;
        vgContenedorDatos.ventFed = ventFed;
        vgContenedorDatos.fdelgMun = fdelgMun;
        vgContenedorDatos.dfechaNac = dfechaNac;
        vgContenedorDatos.vestadoCiv = vestadoCiv;
        vgContenedorDatos.vregMat = vregMat;
        vgContenedorDatos.vcalleNum = vcalleNum;
        vgContenedorDatos.vcolonia = vcolonia;
        vgContenedorDatos.vpoblacion = vpoblacion;
        vgContenedorDatos.vmunDel = vmunDel;
        vgContenedorDatos.vestado = vestado;
        vgContenedorDatos.vpais = vpais;
        vgContenedorDatos.ncp = ncp;
        vgContenedorDatos.ntel = ntel;

        vgContenedorDatos.incliente=incliente
        vgContenedorDatos.ctipoPersona=ctipoPersona
        vgContenedorDatos.vnRs=vnRs
        vgContenedorDatos.vapaterno=vapaterno
        vgContenedorDatos.vamaterno=vamaterno
        vgContenedorDatos.vnacionalidad=vnacionalidad
        vgContenedorDatos.csexo=csexo
        vgContenedorDatos.vcurp=vcurp
        vgContenedorDatos.vrfc=vrfc
        vgContenedorDatos.vnumFiel=vnumFiel
        vgContenedorDatos.icta1=icta1
        vgContenedorDatos.icta2=icta2
        vgContenedorDatos.vnivelRiesgo=vnivelRiesgo

          var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(vgContenedorDatos);//executeRef
      //    alert(url);
          makeAjaxRequest(url, "HTML", resultadoMantenimiento, opcion);
  }
  function resultadoMantenimiento(opcion, result) {
 //   alert(result);
    var resultado =JSON.parse(result).result;
    //alert(resultado)
    if(resultado==0){
        operacionExitosa();  
    }
    else{
      Swal.fire('Aviso', 'Ocurrio un Error inesperado',  'warning');        
    } 
    hideWaitLayer();
  }

function MuestraInformacionClientes(opcion){
      if(opcion==MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
      {
        //Swal.fire('Aviso', 'entros',  'warning')muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
        deshabilitaPK("idCliente".split(","));
        funcactivacampos();
      }
      else if(opcion==CONSULTAR)//Si se trata de una consulta, deshabilitar
      {
        SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
        deshabilitaObjetos(GI("frmDatosMantenimiento"));                  //Deshabilita objetos (excepto botones)
      }
      muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
      formsLoaded();


    var InfoClientes = JSON.parse("{\"id\":\"conClientesCreditoDat\"}");
    InfoClientes.Cliente=pkInfo.idCliente
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(InfoClientes);
    //alert(url)
    makeAjaxRequest(url, "HTML", funcionDevuelveInfo1, opcion);    
}
function funcionDevuelveInfo1(opcion, result) {
       //alert(result);
    var objResult = JSON.parse(result);
    //alert(objResult[0].info)
    if(objResult[0].info!=null){
        var split = objResult[0].info.split(';');
        GI("vlugarNac").value = split[0];
        GI("vpaisNac").value = split[1];
        GI("ventFed").value = split[2];
        GI("fdelgMun").value = split[3];
        GI("dfechaNac").value = split[4];
        GI("vestadoCiv").value = split[5];
        GI("vregMat").value = split[6];
        GI("idDatosCliente").value=pkInfo.idCliente;        
    }
    
    var InfoClientes = JSON.parse("{\"id\":\"conClientesCreditoDir\"}");
    InfoClientes.Cliente=pkInfo.idCliente
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(InfoClientes);
    //alert(url)
    makeAjaxRequest(url, "HTML", funcionDevuelveInfo2, opcion);    
}
function funcionDevuelveInfo2(opcion, result) {
       //alert(result);
    var objResult = JSON.parse(result);
    
    if(objResult[0].info!=null){
        var split = objResult[0].info.split(';');
        GI("vcalleNum").value = split[0];
        GI("vcolonia").value = split[1];
        GI("vpoblacion").value = split[2];
        GI("vmunDel").value = split[3];
        GI("vestado").value = split[4];
        GI("vpais").value = split[5];
        GI("ncp").value = split[6];
        GI("ntel").value = split[7];
        GI("idDireccion").value=pkInfo.idCliente;
    }

    var InfoClientes = JSON.parse("{\"id\":\"conClientesCreditoInfo\"}");
    InfoClientes.Cliente=pkInfo.idCliente
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(InfoClientes);
    //alert(url)
    makeAjaxRequest(url, "HTML", funcionDevuelveInfo3, opcion);   
}

function funcionDevuelveInfo3(opcion, result) {
      // alert(result);
    var objResult = JSON.parse(result);

    if(objResult[0].info!=null){
        var split = objResult[0].info.split(';');
    GI("incliente").value=split[0];
    GI("ctipoPersona").value=split[1];
    GI("vnRs").value=split[2];
    GI("vapaterno").value=split[3];
    GI("vamaterno").value=split[4];
    GI("vnacionalidad").value=split[5];
    GI("csexo").value=split[6];
    GI("vcurp").value=split[7];
    GI("vrfc").value=split[8];
    GI("vnumFiel").value=split[9];
    GI("icta1").value=split[10];
    GI("icta2").value=split[11];
    GI("vnivelRiesgo").value=split[12];
    GI("idCliente").value=pkInfo.idCliente;
    }
    
}
