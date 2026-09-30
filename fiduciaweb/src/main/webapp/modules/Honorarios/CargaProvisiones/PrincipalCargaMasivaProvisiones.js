var formularioCarga = GI('frmDatos');

showWaitLayer();

var fechaDefault = new Date();
var fechaDefault2 = new Date();
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

Calendar.setup({
    inputField     :    "txtFechaValor1",
    button         :    "txtFechaValor1",
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
    formData.append('origen', "1");
    formData.append('fecha', '');
    formData.append('fideicomiso', '');

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
              title: "El archivo ya se subio!",
              icon: "error",
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
            statusMessage.innerHTML = result;
            statusMessage.style.color = 'red';
            boton.style.display = "none";
            
            Swal.fire({
              title: result,
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
  onButtonClickPestania("Honorarios.CargaProvisiones.PrincipalCargaMasivaProvisiones","");
  loadDynamicJS(ctxRoot + "/modules/Honorarios/CargaProvisiones/PrincipalCargaMasivaProvisiones.js");
}

document.getElementById('excelFile').addEventListener('change', handleFile);

// 1. Manejar la selección del archivo y mostrar preview
function handleFile(e) {
    const file = e.target.files[0];
    const reader = new FileReader();

    reader.onload = function(event) {
        const data = new Uint8Array(event.target.result);
        const workbook = XLSX.read(data, {type: 'array'});
        let datosParseados = null;
        
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

document.getElementById('btnDescargar').addEventListener('click', function(event) {
    // 1. Evitar que el botón recargue la página
    event.preventDefault();
    descargarExcel();
});     
    
async function descargarExcel() {
    const fiso = document.getElementById('paramFideicomiso').value;
    const fechainicial = document.getElementById('txtFechaValor').value;
    const fechafinal = document.getElementById('txtFechaValor1').value;
    const selectedOption = document.querySelector('input[name="importTypeDescarga"]:checked').value; 
    console.log('fiso '+fiso);
    console.log('fechainicial '+fechainicial);
    console.log('fechafinal '+fechafinal);
    console.log('selectedOption '+selectedOption); 
    if (!selectedOption) {
        Swal.fire('Eror', 'Por favor selecciona una opcion para la Descarga',  'error');
        return;
    }
    if(selectedOption==1&&(fiso==null||fiso==""))
    {
        Swal.fire('Eror', 'Por favor incorpora un Fideicomiso',  'error');
        return;
    }
    if(selectedOption==2)
    {
        if(fiso==null||fiso=="")
        {
            Swal.fire('Eror', 'Por favor incorpora el Fideicomiso',  'error');
            return;
        }
        if(fechainicial==null||fechainicial=="")
        {
            Swal.fire('Eror', 'Por favor incorpora el Periodo Inicial',  'error');
            return;
        }
        if(fechafinal==null||fechafinal=="")
        {
            Swal.fire('Eror', 'Por favor incorpora el Periodo Final',  'error');
            return;
        }

    }
    // 1. Llamar al Servlet con los 4 parámetros
    const response = await fetch('downloadExcel?caso='+selectedOption+'&fiso='+fiso+'&fechainicial='+fechainicial+'&fechafinal='+fechafinal);
    const rawData = await response.json();

    // 2. Reemplazar los headers (Mapeo de datos)
    // Supongamos que API trae: {"userId": 1, "userName": "Juan", "total": 100}
    // Queremos en Excel: "ID", "Nombre Usuario", "Monto Total"
    var mappedData="";
    if(selectedOption==1){
        mappedData = rawData.map(item => ({
            "Fideicomiso": item.id.carNumContrato,
            "Tipo Persona": item.id.carCvePersFid,
            "Numero Persona": item.id.carNumPersFid,
            "Tipo Honorario": item.id.carCveTipoHono,
            "Importe": item.carImpHonor,
            "Importe 30": item.carImpHonor30,        
            "Importe 60": item.carImpHonor60,        
            "Importe 90": item.carImpHonor90,
            "Año en curso": item.carEjerAnoCurso,
            "Año anterior": item.carEjerAnoAnte
        }));    
    }else{
        mappedData = rawData.map(item => ({
            "Fideicomiso": item.id.decNumContrato,
            "Tipo Honorario": item.id.decCveTipoHono,
            "Tipo Persona": item.id.decCvePersFid,
            "Num Persona": item.id.decNumPersFid,
            "Fecha Calculo": item.id.decFecCalcHono,
            "Secuencial": item.id.decNumSecuencial,
            "Servicio": item.decNumServicio,
            "Concepto": item.decConceptoHono,        
            "Periodo Año Del": item.decAnoPerDel,        
            "Periodo Mes Del": item.decMesPerDel,
            "Periodo Dia Del": item.decDiaPerDel,
            "Periodo Año Al": item.decAnoPerAl,        
            "Periodo Mes Al": item.decMesPerAl,
            "Periodo Dia Al": item.decDiaPerAl,            
            "Importe": item.decImpOrigHonor,
            "Remanente": item.decImpRemHonor,
            "Pagos": item.decImpPagosEfe,
            "Clave Moneda": item.decNumMoneda,
            "Folio": item.decFolioOpera
        }));     
    }

    // 3. Crear el libro de Excel
    const worksheet = XLSX.utils.json_to_sheet(mappedData);
    const workbook = XLSX.utils.book_new();
    XLSX.utils.book_append_sheet(workbook, worksheet, "Cartera");

    // 4. Descargar archivo
    XLSX.writeFile(workbook, "Honorarios.xlsx");

}