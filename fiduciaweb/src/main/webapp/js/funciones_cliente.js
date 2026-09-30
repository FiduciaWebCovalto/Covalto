var cat = null;
var pkInfo = null;

function initForms() {
  for(var i = 0; i < document.forms.length; i++) {
    var f = document.forms[i];
    if(f.name == "") continue;
    for(var j = 0; j < f.elements.length; j++) {
      if(loadElement(f.elements[j])) break;
    }
  }
}

function loadElement(e) {
  var q = GA(e, "ref"); // Referencia del Query a ejecutar
  var m = GA(e, "fun"); // Nombre de la funcion a ejecutar
  var a = GA(e, "loc"); // Indica si la referencia es local o remota
  var p = GA(e, "param"); // Variable con los parametros adicionales para el, los combos
  
  if(isDefinedAndNotNull(q)) {
    var fun = isDefinedAndNotNull(m) ? eval(m) : null;
    if(!isDefinedAndNotNull(a)) {
      var url = ctxRoot;
      if(!isDefinedAndNotNull(p))
        url += "/getRef.do?json={\"id\":\"" + q + "\"}";
      else {
            try {
                var objParam = JSON.parse(p.replaceAll('\'', "\""));
            } catch(e) {
                objParam = eval(p);
            }
        eval("objParam.id=\"" + q + "\"");
        url += "/getRef.do?json=" + JSON.stringify(objParam);
      }
      makeAjaxRequest(url, "HTML", fun, e);
    } else {
      fun(e); // Se ejecuta la funcion en lugar de ir al server
    }
    return true;
  }
  
  return false;
}

function loadComboElement(obj, result) {
  var arrValues = JSON.parse(result);
  var key = GA(obj, "keyValue");
  var value = GA(obj, "theValue");
  loadCombo(obj, arrValues, key, value);
  var nextElement = GA(obj, "next");
  if(isDefinedAndNotNull(nextElement)) {
    var nextObj = GI(nextElement); 
    if(isDefinedAndNotNull(nextObj)) {
      loadElement(nextObj);
    } else {
      try { eval(nextElement+"()"); } catch(ex) {}
    }
  }
}

function loadTableElement(objTabla, result) {

  var jsonArray = JSON.parse(result);
  var arWidth = eval(GA(objTabla, "dataInfo"));
  var radio = (eval(GA(objTabla, "check"))!=null?false:true);
  loadTable(objTabla, jsonArray, arWidth, GA(objTabla, "keys"), GA(objTabla, "fun"),radio);
  hideWaitLayer();
}

function formsLoaded() {
  hideWaitLayer();
}

function consultar(btn, frm, reqParam) {
  var parametros = getParameters(frm);
  if(reqParam && JSON.stringify(parametros) == "{}") {
    // TODO: Cambiar de alert a el mensaje de la aplicacion
    Swal.fire('error',"Se requiere que almenos se especifique un parametro", 'error');
    return;
  }
  eval("parametros.id=\"" + GA(btn, "ref") + "\"")
  var order = GA(btn, "doOrder");
  console.log('order: ' + order);
  if(isDefinedAndNotNull(order) && order != "") parametros.order = "true";
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(parametros);
  var m = GA(btn, "fun"); // Nombre de la funcion a ejecutar
  var fun = isDefinedAndNotNull(m) ? eval(m) : null;
  showWaitLayer();
  makeAjaxRequest(url, "HTML", fun, GI(GA(btn, "tabla")));
}

function setPkInfo(pk) {
  pkInfo = pk;
}

function disableElement(el) {
  el.className = "inputLocked";
  try { el.disabled = true; } catch(ex) {}
}

function enableElement(el) {
  el.className = "";
  try { el.disabled = false; } catch(ex) {}
}

function validaOperacion(result) {
  var objResult = JSON.parse(result);
  if(isDefinedAndNotNull(objResult) && isDefinedAndNotNull(objResult.tipoError)) {
    if(objResult.tipoError == "SUCCESS") 
      return true;
    else {
      showMensaje(objResult);
      return false;
    }
  } else {
    // TODO: Verificar posibles escenarios
    return true;
  }
}

function showMensaje(errorBean) {
  // TODO: Mostrar pantalla de error.
  Swal.fire('error',"Error: " + errorBean.mensajeError, 'error');
}

function eliminaCatalogo(objCatalogo) {
  for(var i in pkInfo){
    try {   
      objCatalogo.getCatalogo()[i] = pkInfo[i]; 
    } catch(e) {
    Swal.fire('error',"Error: " + e.message, 'error');
    }
  }
  objCatalogo.bajaCatalogo(false);
}

function deshabilitaPK() {
  
}

function deshabilitaCampos(campos)
{
    var camposSplit = campos.split(",");
    
    for(var i = 0; i < camposSplit.length; i++)
    {
      SA(GI(camposSplit[i]), "LKD", "true");
      SA(GI(camposSplit[i]), "disabled", "true");
      GI(camposSplit[i]).className = "inputLocked";
    }
}

function habilitaCampos(campos)
{
    var camposSplit = campos.split(",");
    
    for(var i = 0; i < camposSplit.length; i++)
    {
      SA(GI(camposSplit[i]), "LKD", "false");
      GI(camposSplit[i]).disabled=false;
      GI(camposSplit[i]).className = "inputDislocked";
    }
}

function guardaValChk(objChk, objDest) {
  if(objChk.checked)
    objDest.value = GA(objChk, "tv");
  else
    objDest.value = GA(objChk, "fv");
}

function validaPrecision(objeto) {
  var cadena = objeto.value;
  enteros = GA(objeto, "enteros");
  decimales = GA(objeto, "decimales");
  cadena = cadena.split(".");
  
  if(cadena.length > 2)
  {
  Swal.fire('error',"Sólo está permitido un punto decimal en la expresión", 'error');
    objeto.value = "";
    objeto.focus();
    return;
  }
  
  //Verificar la longitud antes del punto
  if(cadena.length == 2)
    if(cadena[0].length > enteros || cadena[1].length > decimales){
        Swal.fire('error',"El campo acepta únicamente " + enteros + " dígitos y/o "+ decimales + " decimales!", 'error');
      objeto.value = "";
      objeto.focus();
      return;
    }
  else{
    Swal.fire('error',"El campo acepta únicamente " + enteros + " dígitos!", 'error');
    objeto.value = "";
    objeto.focus();
    return;
  }
}

		function formatDate(objeto)
			{

			if(objeto.value.length==2 || objeto.value.length==5)
				{
				objeto.value=objeto.value+"/";
				}
			else{
          var texto=objeto.value.substring(objeto.value.length-1,objeto.value.length);
           texto=parseInt(texto);
           if (isNaN(texto)) {
            objeto.value=objeto.value.substring(0,objeto.value.length-1);
            objeto.focus();
           }
				}	       
				} 

function formatImporte(objeto)
{
                var importe=objeto.value;
                var posEntero =objeto.value.indexOf(".");
				
				if(posEntero==-1 &&objeto.value.length>0 )
					{
					objeto.value=importe+".00"
				    posEntero =objeto.value.indexOf(".");
					}
					
				var entero=objeto.value.substring(0,posEntero);   
				var dec=objeto.value.substring(posEntero,objeto.value.length);   
				
			    if(posEntero==0)
					{
					entero="0";
					}
				if(dec.length>2)
					{
					dec=objeto.value.substring(posEntero,posEntero+3);
					}
			    		
				objeto.value=entero+dec;

				if(isNaN(objeto.value))
					{
                                        Swal.fire('error',"El formato del importe no es valido\nEjemplos:1000\n               1000.00\n ", 'error');
					
					objeto.value="";
					objeto.focus();
					}
				else	
				if(parseFloat(objeto.value)==0) 
					{
                                        Swal.fire('error',"El importe no es valido, debe ser mayor a cero ", 'error');
					objeto.value="";
					objeto.focus();
					}
				
        	
}	      

function redirecciona_fid_ctasindiv()
{
      loadDynamicJS(ctxRoot + "/modules/CuentasIndividuales/CuentasIndividuales/PrincipalFideicomisosCuentasIndividuales.js");
      onButtonClick("CuentasIndividuales.CuentasIndividuales.PrincipalFideicomisosCuentasIndividuales","");
      hideWaitLayer();
}