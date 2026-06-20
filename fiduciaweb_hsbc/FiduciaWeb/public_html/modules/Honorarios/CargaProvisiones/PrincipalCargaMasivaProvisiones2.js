var cmbFideicomisoTrac = JSON.parse("{}");
var formularioCarga = GI('frmDatos');
var frameCarga = GI('frameUpload');
var objArchivosPlanosParam = JSON.parse("{\"id\":\"conArcPla\"}");

showWaitLayer();

var fechaDefault = new Date();
var opcparam = 0;
var opcprov = 0;

initForms();

Calendar.setup({
    inputField     :    "txtFechaValor",
    button         :    "txtFechaValor",
    ifFormat       :    "%d/%m/%Y", //"%a %e/%b/%Y",format of the input field
    showsTime      :    false,
    timeFormat     :    "24",
    onUpdate       :    setFechaCal,
    disableFunc    :    isValidDate,
    date           :    fechaDefault,
    weekNumbers    :    false,
    cache          :    true,
    step           :    1
});

function setFechaCal(){}
function isValidDate(date){ 
  var today = new Date();
  if(date > today)
    return true;
  else
    return false;
}

// Pantalla
var fvMantenimiento = new FormValidator();

fvMantenimiento.setup({
  formName      : "frmDatos",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

initForms();
formsLoaded();


function cargaObjetosTipoMovimiento(objRdMovimiento){
  
  asignaValueRadio2Master("rdTipoMovimiento", objRdMovimiento);

}

function subirArchivo(){
    if(fvMantenimiento.checkForm())
    {
      frameSubmit(document.frameUpload.frmCargaComprasVentas);
           
    }
}

function obtCheckOPC(){
    var pos = 0;
    var i = 0;
    var opc = [GI("chkProvisiones").checked,GI("chkCondonacion").checked,GI("chkQuebrantos").checked, GI("chkPagos").checked, GI("chkCobros").checked,GI("chkCartera").checked,GI("chkParHon").checked,GI("chkDomFisc").checked];
    
    var count = 0;
    
    for(i = 0; i < opc.length; ++i){
        if(opc[i] == 1){
            count++;
            pos = i;
            //alert("POS:"+pos+" I="+i);
        }
    }
    //alert("TAM:"+opc.length);
    
    //alert("OBT:"+opcparam);
    if(count > 1){
        Swal.fire('Aviso', 'Eliga solo una operacion de carga',  'warning');
        opcparam = null;
    }else{
        /* 
         * Provisiones   = 1
         * Pagos(Cobros) = 2 
         * Condonacion   = 3 
         * Quebrantos    = 5
         * Generar Pagos = 4
         * Cartera       = 6
         * Param Honor   = 7
         * Domic Fisc    = 8
        */
        switch(pos){
            case 0:
                opcparam=1; //SQL - Provision
                break;
            case 1:
                opcparam=3; //SQL - Condonacion
                break;
            case 2:
                opcparam=5; //SQL - QUEBRANTO
                break;
            case 3:
                opcparam=4; //SQL - GENERA ARCHIVO
                break;
            case 4:
                opcparam=2; //SQL - PAGO(COBRO)
                break;
            case 5:
                opcparam=6; //SQL - Cartera
                break;
            case 6:
                opcparam=7; //SQL - Parametros Honorarios
                break;
            case 7:
                opcparam=8; //SQL - Domicilio Fiscal
                break;
            default:
                opcparam=null;
        }
    }
}
function obtCheckOPC2(){
    var pos = 0;
    var i = 0;
    var opc = [("chkTodos").checked, GI("chkBanco").checked, GI("chkBolsa").checked];
    /* 
     * TODOS         = 0
     * BANCO 	     = 1
     * CASA DE BOLSA = 2
    */
    var count = 0;
    
    for(i = 0; i < opc.length; ++i){
        if(opc[i] == 1){
            count++;
            pos = i;
            //alert("POS:"+pos+" I="+i);
        }
    }
    //alert("TAM:"+opc.length);
    
    //alert("OBT:"+opcparam);
    if(count > 1){
        Swal.fire('Aviso', 'Eliga solo un tipo de provision',  'warning');
        opcprov = null;
    }else{
        switch(pos){
            case 0:
                opcprov=0; //TODAS LAS PROVISIONES
                break;
            case 1:
                opcprov=1; //PROVISIONES DE BANCO
                break;
            case 2:
                opcprov=2; //PROVISIONES CASA DE BOLSA
                break;
            default:
                opcprov=3; //NO APLICA
        }
    }
}
  
var nomArchivo = null;

function frameSubmit(forma) {
  
  nomArchivo = forma.document.getElementById("fileTest").value

  if( nomArchivo == ''){
    Swal.fire('Aviso', 'debe seleccionar un archivo',  'warning');
    return;
  }

  nomArchivo = nomArchivo.split('\\');
  nomArchivo = nomArchivo[nomArchivo.length-1];

  forma.document.getElementById("Fecha").value = GI("txtFechaValor").value;
  forma.document.getElementById("NombreArchivo").value = nomArchivo;

  forma.submit();
  formularioCarga.cmdAplicar.style.visibility = 'visible';
  //formularioCarga.cmdCargar.style.visibility = 'hidden';
  //formularioCarga.cmdPreview.style.visibility = 'visible';
}

//se genera el preview del archivo de precios a partir de archivos_planos
function generaPreviewArchivo()
{
    //formularioCarga.cmdPreview.style.visibility = 'hidden';
    formularioCarga.cmdAplicar.style.visibility = 'visible';  
}
function funGenPagos(t){
    if(t==1){
        formularioCarga.cmdCargar.style.visibility= 'hidden';
        formularioCarga.cmdAplicar.style.visibility= 'visible';
        GI("txtNomArchGP").disabled=false;
        GI("chkBanco").disabled=false;
        GI("chkBolsa").disabled=false;
        GI("chkTodos").disabled=false;
        GI("chkBancolbl").disabled=false;
        GI("chkBolsalbl").disabled=false;
        GI("chkTodoslbl").disabled=false;
        GI("chkProvisiones").checked=0;
        GI("chkCondonacion").checked=0;
        GI("chkQuebrantos").checked=0;
        GI("chkCobros").checked=0;
    }else if(t==2){
        formularioCarga.cmdCargar.style.visibility= 'hidden';
        formularioCarga.cmdAplicar.style.visibility= 'visible';
        GI("txtNomArchGP").disabled=false;
        GI("chkBanco").disabled=true;
        GI("chkBolsa").disabled=true;
        GI("chkTodos").disabled=true;
        GI("chkBancolbl").disabled=true;
        GI("chkBolsalbl").disabled=true;
        GI("chkTodoslbl").disabled=true;
        GI("chkProvisiones").checked=0;
        GI("chkCondonacion").checked=0;
        GI("chkQuebrantos").checked=0;
        GI("chkCobros").checked=0;
    }else{
        formularioCarga.cmdCargar.style.visibility= 'visible';
        formularioCarga.cmdAplicar.style.visibility= 'hidden';
        GI("chkPagos").checked=0;
        GI("txtNomArchGP").disabled=true;
        GI("chkBanco").checked=0;
        GI("chkBolsa").checked=0;
        GI("chkTodos").checked=0;
        GI("chkBanco").disabled=true;
        GI("chkBolsa").disabled=true;
        GI("chkTodos").disabled=true;
        GI("chkBancolbl").disabled=true;
        GI("chkBolsalbl").disabled=true;
        GI("chkTodoslbl").disabled=true;
    }
    
}
//aplicar el precio una vez que se cargÃ³ el preview
function funAplicaComprasVentas() {
    obtCheckOPC();
    obtCheckOPC2();
    //alert("previo:"+opcparam);
    if (opcparam != null) {
        if (opcparam == 4) {
            if (confirm("¿Esta seguro que desea aplicar?")) {
                var parametrosUrl = {
                    id : 'storeGenArchInterfazHonorarios', opc : opcparam, opc2 : opcprov, fecha : GI('txtFechaValor').value, nomArchivo : "GENERAPAGOS.txt"
                }

                var url = ctxRoot + '/executeRef.do?json=' + JSON.stringify(parametrosUrl);
                //alert(url)
                makeAjaxRequest(url, "HTML", funAplicaComprasVentasResp, opcparam);
            }
        }
        else if (opcparam == 6 || opcparam == 7 || opcparam == 8) {
            //Cartera/Parametros Honorarios-Contratos de Inversion/Domicilio Fiscal / CALL storeGenCarParHonDomfisc
            switch(opcparam){
                        case 6:
                            nomArchivo="Cartera-"+GI('txtFechaValor').value+".txt";
                            break;
                        case 7:
                            nomArchivo="Parametros Honorarios-"+GI('txtFechaValor').value+".txt";
                            break;
                        case 8:
                            nomArchivo="Domicilio Fiscal-"+GI('txtFechaValor').value+".txt";
                            break;
                    }
            if (confirm("¿Esta seguro que desea aplicar?")) {
                var parametrosUrl = {
                    id : 'storeGenCarParHonDomfisc', opc : opcparam, fecha : GI('txtFechaValor').value, nomArchivo : nomArchivo
                }
                var url = ctxRoot + '/executeRef.do?json=' + JSON.stringify(parametrosUrl);
                //alert(url)
                makeAjaxRequest(url, "HTML", funAplicaComprasVentasResp, opcparam);
            }
        }
        else {
            if (confirm("¿Esta seguro que desea aplicar?")) {
                var parametrosUrl = {
                    id : 'storeGenArchInterfazHonorarios', opc : opcparam, opc2 : 3, fecha : GI('txtFechaValor').value, nomArchivo : nomArchivo
                }

                var url = ctxRoot + '/executeRef.do?json=' + JSON.stringify(parametrosUrl);
                //alert(url)
                makeAjaxRequest(url, "HTML", funAplicaComprasVentasResp, opcparam);
            }
        }
    }
}

function funAplicaComprasVentasResp(obj,result)
{
  /*// Los codigos de error son un numero seguido de un guion y el mensaje de error
  var err = JSON.parse(result).result.split('-');
  //alert(err)
  var errCode = parseInt(err[0], 10);
  var errMsg = err[1];
  alert(errMsg)*/
  
  var res = JSON.parse(result).RESULTADO;
  if(isDefinedAndNotNull(res)){
    //alert("Numero:" +eval(res));
        switch (eval(res)) {
            case 0:
            //alert(obj);
                if (opcparam == 4) {
                    showWaitLayer();
                    objArchivosPlanosParam.tipoId = 1;
                    objArchivosPlanosParam.nomArchivo = "GENERAPAGOS.txt";
                    objArchivosPlanosParam.colData = "arpDescripcion";
                    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(objArchivosPlanosParam);
                    makeAjaxRequest(url, "HTML", sugerirNombreArchivoInterfase, null);
                }else if(opcparam == 6 || opcparam == 7 || opcparam == 8){
                    showWaitLayer();
                    objArchivosPlanosParam.tipoId = 1;
                    objArchivosPlanosParam.nomArchivo = nomArchivo;
                    objArchivosPlanosParam.colData = "arpDescripcion";
                    var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(objArchivosPlanosParam);
                    makeAjaxRequest(url, "HTML", sugerirNombreArchivoInterfase2, null);
                }else{
                    Swal.fire('Aviso', 'Operación exitosa',  'warning');
                        document.getElementById("cmdCancelar").click();
            }
      break;
    case 1:Swal.fire('Aviso', 'Cargue el archivo correcto antes de Cargar Honorarios!',  'warning');break;
      case 5:
        Swal.fire('Aviso', 'La Fecha del Archivo no corresponde con la Fecha del Sistema!',  'warning');
        //var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(objArchivosPlanosParam);
        //makeAjaxRequest(url, "HTML", sugerirNombreArchivoInterfase, null);            
        break;
      case 6:
        Swal.fire('Aviso', 'Faltan DATOS!',  'warning');
        //var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(objArchivosPlanosParam);
        //makeAjaxRequest(url, "HTML", sugerirNombreArchivoInterfase, null);           
        break;
      default:
        Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
    }
  }else
  {
     Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
  }
  hideWaitLayer();
  
}

function sugerirNombreArchivoInterfase(obj , result){
    var resultado = JSON.parse(result)[0];
    if (isDefinedAndNotNull(resultado)) {
        Swal.fire('Aviso', 'Se le sugiere coloque el siguiente nombre GENERAPAGOS.txt para el archivo generado!',  'warning'); //+ GI("txtNomArch").value +
        delete objArchivosPlanosParam.id;
        objArchivosPlanosParam.queryId = "conArcPla";
        objArchivosPlanosParam.Fecha = GI("txtFechaValor").value;
        objArchivosPlanosParam.order = "\"s\"";
        objArchivosPlanosParam.fileName = "GENERAPAGOS.txt";
        var url = ctxRoot + "/generarArchivoInterfase.do?json=" + JSON.stringify(objArchivosPlanosParam);
        alert(url)
        var liga = GI("ligaArchivo");
        liga.href = url;
        liga.click();
        Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
        //ObtenReporte();
        onButtonClickPestania('Honorarios.CargaProvisiones.PrincipalCargaMasivaProvisiones', '');

    }
    else 
    Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
    hideWaitLayer();
}
function sugerirNombreArchivoInterfase2(obj , result){
    var resultado = JSON.parse(result)[0];
    if (isDefinedAndNotNull(resultado)) {
        Swal.fire('Aviso', 'Se le sugiere coloque el siguiente nombre"+GI("txtNomArchGP',  'warning').value+"para el archivo generado!"); //+ GI("txtNomArch").value +
        delete objArchivosPlanosParam.id;
        objArchivosPlanosParam.queryId = "conArcPla";
        objArchivosPlanosParam.Fecha = GI("txtFechaValor").value;
        objArchivosPlanosParam.order = "\"s\"";
        objArchivosPlanosParam.fileName = nomArchivo;
        var url = ctxRoot + "/generarArchivoInterfase.do?json=" + JSON.stringify(objArchivosPlanosParam);
        alert(url)
        var liga = GI("ligaArchivo");
        liga.href = url;
        liga.click();
        Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
        //ObtenReporte();
        onButtonClickPestania('Honorarios.CargaProvisiones.PrincipalCargaMasivaProvisiones', '');

    }
    else 
    Swal.fire('Error', 'Ocurrio un Error Inesperadol', 'error');
    hideWaitLayer();
}



function resetPantallaCarga(){
  //se limpia el formulario
  RF( formularioCarga );
  nomArchivo = null;
  formularioCarga.cmdCargar.style.visibility = 'visible';
  //se ocultan los botones de preview y ejecucion
  //formularioCarga.cmdPreview.style.visibility = 'hidden';
  formularioCarga.cmdAplicar.style.visibility = 'hidden';
  var srcFrame = frameCarga.src;
  frameCarga.src = srcFrame;
}

resetPantallaCarga();
