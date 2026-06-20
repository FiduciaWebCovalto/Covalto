showWaitLayer();
initForms();

var fvCargaMasiva = new FormValidator();
var archivoSeleccionado = false;
//var divNombreFideicomisoParam;
var fechaDefault = new Date();

fvCargaMasiva.setup({
  formName      : "frmCargaMasiva",
  tipoAlert     : 1,
  alertFunction : BaloonAlert,
  sendObjToAlert: true
});

function showFrame() {
  displayFrame("dvMensajes", "frameUpload", ctxRoot + "/modules/Garantias/Inmuebles/CargaMasiva/FileUpload.do", 200, 200, 100, 400, 0, 0);  
}

function frameSubmit(forma) {
    //obtenerTipoArchivo();
  if(fvCargaMasiva.checkForm() && obtenerNombreArchivo(forma.flArchivo)){
    showWaitLayer();
    GI("frameUpload").onreadystatechange = hideFrame;

//Swal.fire('Aviso', 'Nombre Archivo"+GI("NombreArchivo',  'warning').value);
    
  forma.document.getElementById("Fecha").value = GI("txtFechaContable").value;
  forma.document.getElementById("NombreArchivo").value = GI("NombreArchivo").value;
  forma.submit();
  
    archivoSeleccionado = true;
    deshabilitaObjetos(GI("frmCargaMasiva"));
    muestraObjs("cmdCargar,cmdLimpiar");
  }else{
    archivoSeleccionado = false;
  }
}

function hideFrame() { 
  GI("frameUpload").onreadystatechange = null;
  removeFrame("frameUpload");
  hideWaitLayer();
  
  consultaFisoInmuebles();
}

function consultaFisoInmuebles()
{
  var objCargaMasivaParam = JSON.parse("{\"id\":\"conArcPla\"}");
  objCargaMasivaParam.nomArchivo = GI("NombreArchivo").value;
  objCargaMasivaParam.Fecha = GI("txtFechaContable").value;
  var url = ctxRoot + "/getRef.do?json=" + JSON.stringify(objCargaMasivaParam);

  makeAjaxRequest(url, "HTML", consultaFisoInmueblesRes, null);
}


function consultaFisoInmueblesRes(obj,result)
{
  var res = JSON.parse(result);
  
  if(isDefinedAndNotNull(res))
  {
  
    if(res.length>0)
    {
      var sline = res[0].arpDescripcion;
      var sfiso = sline.split(";")[0];
      alert(sfiso)
      if(sfiso!=GI("paramFideicomiso").value)
      {
        Swal.fire('Aviso', 'El no. de Fideicomiso contenido en el archivo no coincide con el no. digitado en el campo Fideicomiso',  'warning');
        
        borraArchivoInmuebles();
      }
      
    }
  }
}

function borraArchivoInmuebles()
{
  var objCargaMasivaParam = JSON.parse("{\"id\":\"borraArcPla\"}");
  objCargaMasivaParam.Archivo = GI("NombreArchivo").value;
  var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objCargaMasivaParam);
  makeAjaxRequest(url, "HTML", borraArchivoInmueblesRes, null);
}

function borraArchivoInmueblesRes(obj,result)
{
  
  var res = JSON.parse(result);
  
  if(isDefinedAndNotNull(res))
  {
    if(res.tipoError=="SUCCESS")
    {
      limpiar();
    }
  }
}


function obtenerNombreArchivo(objFile){  
  var numTipo = GI("rdTipoMovimiento").value;
  var tipoOperacion = eval(numTipo);
  switch(tipoOperacion){
    case 1://Individualización Inmuebles
         if(false&&objFile.value != "" && objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0].indexOf("INMUEBLES") == -1){
         Swal.fire('Aviso', 'Seleccione un Archivo de Carga correcto!',  'warning');
         return false;
         }else if(objFile.value == ""){
            Swal.fire('Aviso', 'Seleccione el Archivo de Carga!',  'warning');
            return false;
	}else 
      {
       GI("NombreArchivo").value = objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0];
        return true;
      }
    break;
    case 2://Individualización Inmuebles
         if(false&&objFile.value != "" && objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0].indexOf("ADQUIRENTES") == -1){
         Swal.fire('Aviso', 'Seleccione un Archivo de Carga correcto!',  'warning');
         return false;
         }else if(objFile.value == ""){
            Swal.fire('Aviso', 'Seleccione el Archivo de Carga!',  'warning');
            return false;
      }else 
      {
       GI("NombreArchivo").value = objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0];
        return true;
      }
    break;
    case 3://Individualización Inmuebles
         if(false&&objFile.value != "" && objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0].indexOf("PAGOS") == -1){
         Swal.fire('Aviso', 'Seleccione un Archivo de Carga correcto!',  'warning');
         return false;
         }else if(objFile.value == ""){
            Swal.fire('Aviso', 'Seleccione el Archivo de Carga!',  'warning');
            return false;
	}else 
      {
       GI("NombreArchivo").value = objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0];
        return true;
      }
    break;
   default:
      Swal.fire('¡Éxito!', 'Operación realizada correctamente', 'success'); 
      }

  if(false&&objFile.value != "" && objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0].indexOf("ADQUIRENTES") == -1){
    Swal.fire('Aviso', 'Seleccione un Archivo de Carga correcto!',  'warning');
    return false;
  }else if(objFile.value == ""){
    Swal.fire('Aviso', 'Seleccione el Archivo de Carga!',  'warning');
    return false;
  }
  GI("NombreArchivo").value = objFile.value.split("\\")[objFile.value.split("\\").length-1].split(".")[0];
  return true;
}

function ejecutaCargaMasiva(){
  showWaitLayer();
  var objCargaMasivaParam = JSON.parse("{\"id\":\"ejeFunCargaMasivaInmuebles\"}");
  //objCargaMasivaParam.Tipo = 1;
  objCargaMasivaParam.TipoMovimiento = eval(GI("rdTipoMovimiento").value);
  objCargaMasivaParam.Fideicomiso = GI("paramFideicomiso").value;
  objCargaMasivaParam.NombreArchivo = GI("NombreArchivo").value;
  objCargaMasivaParam.Fecha = GI("txtFechaContable").value;
  var url = ctxRoot + "/executeRef.do?json=" + JSON.stringify(objCargaMasivaParam);
  makeAjaxRequest(url, "HTML", validaCargaMasiva, null);
}


function validaCargaMasiva(obj, result){
  var resultado = JSON.parse(result);
  if(isDefinedAndNotNull(resultado)){
    if(resultado == "CORRECTO"||resultado == "0"){
      Swal.fire('¡Éxito!', "Proceso concluido satisfactoriamente", 'success');
      onButtonClickPestania('Garantias.Inmuebles.CargaMasiva.PrincipalCargaMasiva','');
    }else if(resultado == "ERROR NO DATOS")
      Swal.fire('Aviso', 'No existe información a procesar!',  'warning');
    else if(resultado == "ERROR NUM COLS")
      Swal.fire('Aviso', 'Número de columnas invalido!',  'warning');
    else if(resultado == "ERROR NUM SPD")
      Swal.fire('Aviso', 'Error de dato númerico que no debería tener punto décimal!',  'warning');
    else if(resultado == "ERROR NUM CPD")
      Swal.fire('Aviso', 'Error de dato númerico que maneja punto décimal!',  'warning');
    else if(resultado == "ERROR PROC. ASIGNADO")
      Swal.fire('Aviso', 'Error al procesar el rubro de asignado!',  'warning');
    else if(resultado == "ERROR PROC. COMPROMETIDO")
      Swal.fire('Aviso', 'Error al procesar el rubro de comprometido!',  'warning');
    else if(resultado == "ERROR PROC. EJERCIDO")
      Swal.fire('Aviso', 'Error al procesar el rubro de ejercido!',  'warning');
    else if(resultado == "ERROR ORACLE")
      Swal.fire('Aviso', 'Ocurrió un error inesperado (oracle)!',  'warning');
    if(resultado != "CORRECTO"){
      var objDeleteParam = JSON.parse("{\"id\":\"delArcPla\"}");
      var url = ctxRoot + "/doRef.do?json=" + JSON.stringify(objDeleteParam);
      //alert(url);
      makeAjaxRequest(url, "HTML", null, null);
    }
  }else
    alert("Ocurrió un error inesperado!"+resultado);
  hideWaitLayer();
}

// limpiar

function limpiar()
{
  onButtonClickPestania('Garantias.Inmuebles.CargaMasiva.PrincipalCargaMasiva','');
}

// validacion garantias

function consultaDatosFideicomiso(txtFideicomiso)
{
  consultaNombreFideicomiso('nomFideicomiso',txtFideicomiso);
  
  var vFideicomiso = txtFideicomiso.value;
  
  if(vFideicomiso.length>0)
  {
    var objFisoGar = JSON.parse("{}");
    objFisoGar.id = "consultarBienesGar";
    objFisoGar.Fiso = vFideicomiso;
    
    var url = ctxRoot+"/getRef.do?json="+JSON.stringify(objFisoGar);
    
    makeAjaxRequest(url,"html",consultaDatosFideicomisoRes,txtFideicomiso);
  }
}

function consultaDatosFideicomisoRes(txtFideicomiso,result)
{
  var res = JSON.parse(result);
  
 /* if(res.length==0)
  {
    Swal.fire('Aviso', 'Fideicomiso no tiene Garantias registradas',  'warning');
    txtFideicomiso.value="";
    txtFideicomiso.focus();
  }*/
  
}

/*NUEVA SECCION PARA CARGAR Y DESCARGAR ARCHIVOS*/
//const boton = document.getElementById('btnUpload');

document.getElementById('btnUpload').addEventListener('click', function(event) {
    // 1. Evitar que el botón recargue la página
    event.preventDefault();
    uploadFileExcel();
});    

async function uploadFileExcel() {  
    var boton = document.getElementById("btnUpload");
    const fileInput = document.getElementById('excelFile');
    const statusMessage = document.getElementById('statusMessage');
    // 1. Recuperar credenciales del almacenamiento local
    if(GI("paramFideicomiso").value==""){
        Swal.fire('Eror', 'No ha seleccionado el fideicomiso.',  'error');
        return;
    }    
    if (fileInput.files.length === 0){
        Swal.fire('Eror', 'No ha seleccionado ningun archivo',  'error');
        return;
    } 
    const selectedOption = document.querySelector('input[name="importType"]:checked').value;
    if (!selectedOption) {
        Swal.fire('Eror', 'Por favor selecciona una opcion',  'error');
        return;
    }
    // Crear FormData para enviar archivos vía AJAX
    const formData = new FormData();
    formData.append('file', fileInput.files[0]);
    formData.append('type', selectedOption);
    const token = localStorage.getItem('token'); 
    const usuario = localStorage.getItem('usuario'); 

    formData.append('token', token);
    formData.append('usuario', usuario);
    formData.append('origen', "3");
    formData.append('fecha', GI("txtFechaContable").value);
    formData.append('fideicomiso', GI("paramFideicomiso").value);

    console.log('type'+selectedOption);
    console.log('file'+fileInput.files[0]);
    
    statusMessage.innerHTML = '<div class="alert alert-info">Subiendo...</div>';

    try {
    
    const response = await 
    fetch('ExcelUploadServlet', {
    method: 'POST',
    body: formData
    });
    
    const result = await response.json();
    console.log('Respuesta del Servlet:', result);
    
        if (result=="200") {                    
            statusMessage.innerHTML = 'Archivo subido con éxito!';
            statusMessage.style.color = 'green';
            boton.style.display = "none";
            
            Swal.fire({
              title: "El Archivo se cargo con exito!",
              text: "¡Favor de revisar la informacion en la pantalla de Individualizacion!",
              icon: "success",
              confirmButtonColor: "#3085d6",
              confirmButtonText: "Aceptar"
            }).then((result) => {
              if (result.isConfirmed) {
                reinicia_pantalla();
              }
            });                        
        } else if (result=="800")
        {
            statusMessage.innerHTML = 'El archivo ya se subio';
            statusMessage.style.color = 'red';
            boton.style.display = "none";
            
            Swal.fire({
              title: "El archivo ya se subio!",
              icon: "error",
              confirmButtonColor: "#3085d6",
              confirmButtonText: "Aceptar"
            }).then((result) => {
              if (result.isConfirmed) {
                reinicia_pantalla();
              }
            });
        }else{
            //300 El fideicomiso dentro del archivo no corresponde con el indicado en pantalla
            //301 Error No existe el bien, favor de Validar en la pantalla de Registro de Bienes.
            var mensaje="";
            switch (result) {
                case 300:
                    mensaje="El fideicomiso dentro del archivo no corresponde con el indicado en pantalla";
                    break;
                case 301:
                    mensaje="Error No existe el bien, favor de Validar en la pantalla de Registro de Bienes.";
                    break;
                case 302:
                    mensaje="Error Hay Bienes que se encuentran comprometidos!";
                    break;   
                case 303:
                    mensaje="Error No existe la unidad para liberacion!";
                    break;   
                case 304:
                    mensaje="Error Solo puede haber status ACTIVO en la individualizacion!";
                    break;                       
                default:
                    console.log("Estado del pedido desconocido.");
            }
            statusMessage.innerHTML = mensaje;
            statusMessage.style.color = 'red';
            boton.style.display = "none";
            
            Swal.fire({
              title: mensaje,
              icon: "error",
              confirmButtonColor: "#3085d6",
              confirmButtonText: "Aceptar"
            }).then((result) => {
              if (result.isConfirmed) {
                reinicia_pantalla();
              }
            });        
        }         
    }
    catch (error) {
        statusMessage.innerHTML = 'Error al subir el archivo.';
        statusMessage.style.color = 'red';
        boton.style.display = "none";
    
        Swal.fire({
          title: "Error al subir el archivo!",
          icon: "error",
          confirmButtonColor: "#3085d6",
          confirmButtonText: "Aceptar"
        }).then((result) => {
          if (result.isConfirmed) {
            reinicia_pantalla();
          }
        });
    }
}
function reinicia_pantalla(){
  onButtonClickPestania("Garantias.Inmuebles.CargaMasiva.PrincipalCargaMasiva","");
  loadDynamicJS(ctxRoot + "/modules/Garantias/Inmuebles/CargaMasiva/PrincipalCargaMasiva.js");
}

document.getElementById('excelFile').addEventListener('change', handleFile);

// 1. Manejar la selección del archivo y mostrar preview
function handleFile(e) {

    const file = e.target.files[0];
    const reader = new FileReader();
    console.log("handleFile "+file)
    reader.onload = function(event) {
        let datosParseados = null;

        const data = new Uint8Array(event.target.result);
        const workbook = XLSX.read(data, {type: 'array'});
        
        // Obtener la primera hoja
        const firstSheetName = workbook.SheetNames[0];
        const worksheet = workbook.Sheets[firstSheetName];
        
        // Convertir a JSON
        datosParseados = XLSX.utils.sheet_to_json(worksheet);
        
        // Mostrar en Tabla Bootstrap
        mostrarTabla(datosParseados);
        document.getElementById('previewContainer').style.display = 'block';
    };
    reader.readAsArrayBuffer(file);
}

// 2. Mostrar datos en HTML
function mostrarTabla(data) {
    const selectedOption = document.querySelector('input[name="importType"]:checked').value; 
    if (!selectedOption) {
        Swal.fire('Eror', 'Por favor selecciona una opcion para la Carga',  'error');
        return;
    }

    if (data.length === 0) return;
    var boton = document.getElementById("btnUpload");   
    let html = '<table class="table table-responsive table-hover">';
    // Cabecera
    html += '<thead class="table-info"><tr>' + Object.keys(data[0]).map(key => `<th>${key}</th>`).join('') + '</tr></thead>';
    // Cuerpo
    html += '<tbody>' + data.map(row => `<tr>${Object.values(row).map(val => `<td>${val}</td>`).join('')}</tr>`).join('') + '</tbody>';
    html += '</table>';
    document.getElementById('tablePreview').innerHTML = html;
    boton.style.display = "block";
}