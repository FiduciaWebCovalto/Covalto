//REGISTRO DISPOSICION,GENERAR CONSTANCIA,LIBERAR GARANTIA,DISPERCION DE INTERES

var conNumFidNomFid = JSON.parse("{}");
var conNumCredito = JSON.parse("{\"fiso\":0}");
var fvConstanciasGarLiq = new FormValidator();
var fvConsultaGarLiq = new FormValidator();
var pesSelected = false;

var tablaCreditosData = new Array();
tablaCreditosData[0] = "fcreIdCredito,70px";
tablaCreditosData[1] = "fcreTipoCredito,100px";
tablaCreditosData[2] = "fcreImpCredito,70px";
tablaCreditosData[3] = "fcrePjeGarantia,30px";
tablaCreditosData[4] = "fcreImpGarantia,70px";
tablaCreditosData[5] = "fcreNumDisposiciones,50px";
tablaCreditosData[6] = "fcreImpDisposiciones,70px";
tablaCreditosData[7] = "fcreImpGarAport,70px";
tablaCreditosData[8] = "fcreImpGarLiberada,70px";
tablaCreditosData[9] = "fcreMoneda,50px";

var tablaDisposicionesData = new Array();
tablaDisposicionesData[0] = "gliqIdDisposicion,100px";
tablaDisposicionesData[1] = "gliqFechaDisposicion,100px";
tablaDisposicionesData[2] = "gliqImporteDisp,100px";
tablaDisposicionesData[3] = "gliqGarLiquida,100px";
tablaDisposicionesData[4] = "gliqNumBeneficiarios,100px";
tablaDisposicionesData[5] = "gliqAccionTomada,100px";
tablaDisposicionesData[6] = "gliqCveStatus,100px";

var tablaBeneficiariosData = new Array();
tablaBeneficiariosData[0] = "glbeIdSecuencial,30px";
tablaBeneficiariosData[1] = "glbeIdBeneficiario,50px";
tablaBeneficiariosData[2] = "glbeNombreBen,140px";
tablaBeneficiariosData[3] = "glbeImpCredito,70px";
tablaBeneficiariosData[4] = "glbePjeGarantia,30px";
tablaBeneficiariosData[5] = "glbeImpGarliq,60px";
tablaBeneficiariosData[6] = "glbeImpGarliqLib,60px";
tablaBeneficiariosData[7] = "glbeImpIntereses,60px";
tablaBeneficiariosData[8] = "glbeFolioConstancia,70px";
tablaBeneficiariosData[9] = "glbeFolioLiberacion,70px";
tablaBeneficiariosData[10] = "glbeTipoMovto,80px";
tablaBeneficiariosData[11] = "glbeImpMovtoConst,60px";
tablaBeneficiariosData[12] = "glbeImpMovtoLibera,60px";
tablaBeneficiariosData[13] = "glilCveStatus,50px";

fvConsultaGarLiq.setup({
  formName      : "frmConsulta",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});



function cargaComboCredito(id)
{
  conNumCredito = JSON.parse("{\"fiso\":"+(GI(id).value!=-1?GI(id).value:0)+"}");
  loadElement(GI("paramCredito"));
}

function generaConstancia()
{

    obj = getParameters(GI("frmDatosGarantiasLiquidas"));
    obj.id = GI("refQry").value;
    var url = ctxRoot + "/imprimirReporte.do?json=" + JSON.stringify(obj);
    //var url = "/modules/Administracion/Garantias/ConstanciaGarantiasLiquidas.jsp";
    var link = GI("linkConstancia");
    link.href=url;
    link.click();
    
}

function clickPestania(obj,cadotras)
{
  pesSelected = true;
  obj.siSeleccionada= "SI";
  var otraspes = cadotras.split(",");
  
  for(s=0;s<otraspes.length;s++)
  {
      GI("gar_"+otraspes[s]).siSeleccionada = "NO";
      var claseOriginal = GA(GI("gar_"+otraspes[s]), "claseOriginal")
      GI("gar_"+otraspes[s]).className = claseOriginal;
  }
  
  switch(eval(obj.id.replace("gar_","")))
  {
    case 0: 
    
        var cadenota = '<FORM name="frmConstancias" id="frmConstancias" onsubmit=""><table class="texto" style="font-size:12px;">';
        cadenota += '<tr><td >Fecha Inicio:&nbsp;<input type="text" id="consFechaIni" name="consFechaIni" tipo="Fecha" size=10 required message="La Fecha de Inicio es un campo obligatorio"></td>';
        cadenota += '<td >Fecha Vigencia:&nbsp;<input type="text" id="consFechaVig" name="consFechaVig" tipo="Fecha" size=10 required message="La Fecha de Vigencia es un campo obligatorio"></td>';
        cadenota += '<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td> <td>Total Crédito:&nbsp;<input type=text id="sumImpCredito" value="0.0" size=10 required message="El Total Crédito es un campo obligatorio"/></td>';
        cadenota += '<td>Garantía Liquida:&nbsp;<input type=text id="sumImpGarliq" size=10 required value="0.0" message="La Garantía Liquida es un campo obligatorio"/></td> <td > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>';
        cadenota += '<td ><input type=button class="boton" value="Aceptar" onclick="if(fvConstanciasGarLiq.checkForm())alert(0)"/></td></tr></table></FORM><input type=hidden id="sumImpIntereses" value="0.0"/>';      
        GI("div_opciones").innerHTML= cadenota;
      
      opcionConstancia();
        
        break;
    case 1:
      GI("div_opciones").innerHTML= 'Liberaciones<input type=hidden id="sumImpCredito"/><input type=hidden id="sumImpGarliq"/>';
      break;
    case 2:
      GI("div_opciones").innerHTML= 'Distribución Intereses<input type=hidden id="sumImpCredito"/><input type=hidden id="sumImpGarliq"/>';
      break; 
    case 3:
      GI("div_opciones").innerHTML= 'Liberación de Intereses<input type=hidden id="sumImpCredito"/><input type=hidden id="sumImpGarliq"/>';
      break;
     case 4:
      GI("div_opciones").innerHTML= 'Reposición Constancia<input type=hidden id="sumImpCredito"/><input type=hidden id="sumImpGarliq"/>';
      break;
     case 5:
      GI("div_opciones").innerHTML= 'Estado de Cuenta<input type=hidden id="sumImpCredito"/><input type=hidden id="sumImpGarliq"/>';
      break;
     case 6:
      GI("div_opciones").innerHTML= 'Contabilizar<input type=hidden id="sumImpCredito"/><input type=hidden id="sumImpGarliq"/>';
      break;
    default:
      alert(eval(obj.id.replace("gar_","")));
      break;
  }
  
}

function acumulaImportes(check,arreglo)
{
  if(check)
  {
    var importes = arreglo.split(';');
    
    for(s=0;s<importes.length;s++)
    {
      var importe =  importes[s].split(":");
      var imp = eval(GI("sum"+importe[0].replace("glbe","")).value) + eval(importe[1]/2)
      
      GI("sum"+importe[0].replace("glbe","")).value = imp;
    }
    
  }
  else
  {
    var importes = arreglo.split(';');
    
    for(s=0;s<importes.length;s++)
    {
      var importe =  importes[s].split(":");
      var imp = eval(GI("sum"+importe[0].replace("glbe","")).value) - eval(importe[1]/2)
      GI("sum"+importe[0].replace("glbe","")).value = imp;
    }
  }
}

//TABLAS
function consultaDatos(){
  
  if(fvConsultaGarLiq.checkForm())
    consultar(GI("cmdAceptar"), GI("frmConsulta"), false);

}

function clickTablaCreditos(pk) {
  pkInfo = pk;
  GI("paramCredito").value=pk.fcreIdCredito;
  GI("cmdConsultarDis").click();
}

function clickTablaDisposicion(pk) {
  pkInfo = pk;
  GI("paramDisposicion").value=pk.gliqIdDisposicion;
  GI("cmdConsultarBen").click();
}

function loadTableElementGarLiq(objTabla, result) {

  var jsonArray = JSON.parse(result);
  var arWidth = eval(GA(objTabla, "dataInfo"));
  loadTableGarLiq(objTabla, jsonArray, arWidth, GA(objTabla, "keys"), GA(objTabla, "fun"), true);
  hideWaitLayer();
}
function loadTableGarLiq(table, dataArray, fieldsArray, keyValue, nombreFuncion, createRadio) {

  var tbody = table.lastChild;
  var tipoRenglon = 1;
  
  while(tbody.hasChildNodes())
    tbody.removeChild(tbody.lastChild);
  
  if(dataArray.length <= 0) {
    var mensajeNoRecords = GA(table, "NoRecordsMsg");
    var funNoRecords = GA(table, "NoRecordsFun");
    
    if(isDefinedAndNotNull(funNoRecords))
      try { eval(funNoRecords + "();"); } catch(ex) {}

    if(isDefinedAndNotNull(mensajeNoRecords))
      alert(mensajeNoRecords);
  }
  
  for(var i = 0; i < dataArray.length; i++) {
    var fila = createElement("tr", tbody);
    var item = dataArray[i];
    var valorItem = "";
    
    fila.tieneFolios = false; //variable que sirve para saber si tiene folio de constancia
    
    if(createRadio ) {
      var tdRadioWidth = GA(table, "radioWidth");
      var colRadio = createElement("td", fila);
      var radio = createElement("<input type='CHECKBOX' id='" + table.id +""+i+"'/>", colRadio);
      radio.className = "radio";
      if(isDefinedAndNotNull(tdRadioWidth)) colRadio.width = tdRadioWidth;
    }
    
    for(var j = 0; j < fieldsArray.length; j++) 
    {
      var fieldInfo = fieldsArray[j].split(",");
      var fieldWidth = "";
      //if(fieldInfo.length == 2)
        fieldWidth = ""+fieldInfo[1];
      
      for(k in item) {
        if(fieldInfo[0] == String(k)) {
          var col = createElement("td", fila);
          
          if(fieldInfo[0]=="glbeFolioConstancia"||fieldInfo[0]=="glbeFolioLiberacion")//si es algun campo de folios
          {
            if(""+item[k]!="null")//si no tiene folio
              fila.tieneFolios = true;
          }
          
          if(fieldInfo.length == 3)
            SA(col,"align","right");
          
          col.innerHTML = ""+item[k];
          if(col.innerHTML == "null") col.innerHTML="";    
          if(fieldWidth != "") col.width = fieldWidth;        
        }
      }
    }
    
    for(k in item) {
      var kName = String(k);
      if(keyValue.indexOf(kName) != -1) {
        if(typeof(item[k]) == "number")
          valorItem += kName+":"+item[k].replace(/^\s*|\s*$/g,"").replace(/,/g,"")+ ";";
        else
          valorItem += kName+":"+item[k].replace(/^\s*|\s*$/g,"").replace(/,/g,"")+";";
      }
    }
    
    valorItem = valorItem.substring(0, valorItem.length - 1);
    SA(fila, "valorItem", valorItem);
    fila.className = "renglon" + tipoRenglon;
    fila.onmouseover = function() { cambiaColorFila(this); }
    fila.onmouseout = function() { cambiaColorFila(this); }
    fila.onclick = function() { 
      try { 
            if(pesSelected&&!this.tieneFolios)//si hay alguna pestaña seleccionada y si no tiene ningun folio
            {
              this.firstChild.firstChild.click();
              acumulaImportes(this.firstChild.firstChild.checked,valorItem);
            }
          } 
      catch(ex)
      {
      }
      var fun = eval(nombreFuncion);
      if(isDefinedAndNotNull(fun))
        fun(JSON.parse("{"+GA(this, "valorItem")+"}"));
    }
    
    /*fila.ondblclick = function() {
      this.click();
      var funDblClick = GA(table, "DblClickFun");
      if(isDefinedAndNotNull(funDblClick))
        try { eval(funDblClick+"();"); } catch(ex) {}
      else 
      {
        var inputs = document.getElementsByTagName("input");
        for(var j = 0; j < inputs.length; j++) 
        {
          if(inputs[j].type.toUpperCase() != "BUTTON") continue;
          if(trim(inputs[j].value.toUpperCase()) == "CONSULTAR")
          {
            inputs[j].click();
            break;
          }
        }
      }
    }*/
    
    SA(fila, "colorOriginal", fila.className);
    
    if(tipoRenglon == 1)
      tipoRenglon = 2;
    else
      tipoRenglon = 1;    
  }
}


//CONSTANCIAS

var fechaDefault = new Date();

function setFechaCal() {
  //Swal.fire('Aviso', 'se actualizo la fecha',  'warning');
}

function isValidDate(date) { 
  var today = new Date();
  if(date > today)
    return true;
  else
    return false;
}

function opcionConstancia()
{
    fvConstanciasGarLiq.setup({
      formName      : "frmConstancias",
      tipoAlert     : 1,
      alertFunction : BaloonAlert,
      sendObjToAlert: true
    });

  Calendar.setup({
    inputField     :    "consFechaIni",   // id of the input field
    button         :    "consFechaIni",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechaDefault,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
});   

Calendar.setup({
    inputField     :    "consFechaVig",   // id of the input field
    button         :    "consFechaVig",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",       // format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechaDefault,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
});
}


initForms();

// inutiles ----------------------------------------------------------
var ALTA = 1;
var MODIFICAR = 2;
var CONSULTAR = 3;

    
var contenedor = new Object();

var operacion = 0;
var numPantalla = 0;
pkInfo = null;

///////////////////////////////////////////////////////////////////////////////
//Funciones para la primera pantalla
function cargaPrincipalTerceros() {
  onButtonClick("Administracion.GarantiasLiquidas.PrincipalGarantiasLiquidas","");
}

function limpiar(objForma){
  RF(objForma);
  pkInfo = null;
}

function operacionExitosa() {
  Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
  cargaPrincipalTerceros();
  hideWaitLayer();
}

//////////////////////////////////////////////////////////////////////////////
//Funciones para la segunda pantalla
function cargaMantenimientoTerceros(tipoPantalla) {
  if ((tipoPantalla==MODIFICAR || tipoPantalla==CONSULTAR) && pkInfo==null)
    Swal.fire('Cuidado', 'Debe seleccionar un registro de la tabla!', 'warning');
  else
  {
    operacion = tipoPantalla;
    numPantalla = 1;
    showWaitLayer();
    var urlCliente = ctxRoot + "/modules/Administracion/MantenimientoTerceros.do";
    makeAjaxRequest(urlCliente, "HTML", despliegaPantallaMantenimientoTerceros, null);
  }
}

function despliegaPantallaMantenimientoTerceros(obj, result) {
  GI("dvContenido").innerHTML = result;
  initForms();
  
  //Agregando la funcionalidad del required
  fvMantenimientoTerceros.setup({
    formName      : "frmDatosMantenimientoTerceros",
    tipoAlert     : 1,
    alertFunction : BaloonAlert,
    sendObjToAlert: true
  });
  deshabilitaPK("tserNumTercero".split(","));

}

function loadCatalogo(){

  catTerceros.setOnUpdate(catLoaded);
  if(operacion==MODIFICAR || operacion==CONSULTAR)
    catTerceros.buscaCatalogoPK(false);
  else
  {
    muestraObjs("cmdAceptar,cmdCancelar"); //Mostrar el botón Aceptar y Cancelar
    formsLoaded();
  }
}

function catLoaded() {
  if(operacion==MODIFICAR)//Si se trata de una modificación, no permitir modificar la PK
  {
    muestraObjs("cmdAceptar"); //Mostrar el botón Aceptar
    deshabilitaPK("terNumContrato,terNumTercero".split(","));
  }
  else if(operacion==CONSULTAR)//Si se trata de una consulta, deshabilitar
  {
    SA(GI("cmdCancelar"), "value", "Regresar");//Colocar la leyenda Regresar en vez de Cancelar al botón
    deshabilitaObjetos(GI("frmDatosMantenimientoTerceros"));    
    //Deshabilita objetos (excepto botones)
  }
  muestraObjs("cmdCancelar"); //Mostrar el botón Regresar
  formsLoaded();
  
   
}

function AltaOModificaInfo() {
  catTerceros.setOnUpdate(operacionExitosa);
  if(operacion==ALTA && fvMantenimientoTerceros.checkForm())//Se trata de una alta
  {
    showWaitLayer();
    catTerceros.altaCatalogo();
  }
  else if(operacion==MODIFICAR && fvMantenimientoTerceros.checkForm())//Se trata de una modificación
  {
    showWaitLayer();
    catTerceros.modificaCatalogo();
  }
}

function eliminarRegistro() {
  if(pkInfo==null)
    Swal.fire('Aviso', 'No se ha seleccionado campo alguno de la tabla',  'warning');
  else
  {
    catTerceros.setOnUpdate(operacionExitosa);
    showWaitLayer();
    eliminaCatalogo(catTerceros);
  }
}

///////////////////////
function validarPkAlta(objeto) {
  if(GI("terNumContrato").value!="")
  {
    var validacionAlta = JSON.parse("{\"id\":\"verificaExistenciaContrato\",\"numContrato\":0}");
    validacionAlta.numContrato = GI("terNumContrato").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta);
    makeAjaxRequest(url, "HTML", verificarAlta, objeto);
  }
}

function verificarAlta(obj, result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoNumContrato > 0)
  {
    var validacionAlta2 = JSON.parse("{\"id\":\"verificaSeaActivo\",\"numContrato\":0}");
    validacionAlta2.numContrato = GI("terNumContrato").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(validacionAlta2);
    makeAjaxRequest(url, "HTML", verificarAlta2, obj);
  }
  else
  {
    Swal.fire('Aviso', 'El Fideicomiso no existe, verifique',  'warning');
    GI("terNumContrato").value="";
    GI("terNumTercero").value="";
    obj.focus();
  }
}

function verificarAlta2(obj,result) {
  var objResult = JSON.parse(result);
  if(objResult[0].ctoCveStContrat != 0)
  {
    Swal.fire('Aviso', 'El Fideicomiso no está ACTIVO',  'warning');
    GI("terNumContrato").value="";
    GI("terNumTercero").value="";
    obj.focus();
  }
  else
  {
    
    //Agregar el número del Tercero (Incremental)
    var SecNumTercero = JSON.parse("{\"id\":\"numSecNumTercero\",\"NumFiso\":0}");
    SecNumTercero.NumFiso=GI("terNumContrato").value;
    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(SecNumTercero);
    makeAjaxRequest(url, "HTML", agregarTercero, null);
  }
}

function agregarTercero(obj, result) {
  var objResult = JSON.parse(result);
  GI("terNumTercero").value=objResult[0].secNumTercero;
}
