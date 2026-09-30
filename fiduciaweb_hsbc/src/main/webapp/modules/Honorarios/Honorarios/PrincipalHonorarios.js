// JavaScript Document

var superPestanias = new Array(); //pestañas horizontales
var pestanias = new Array(); //pestañas verticales
// new pestania('urlpantalla','titulo')

  
  //Operación
  //pestanias[0] = new pestania('Honorarios/PrincipalPresupuestoAnualHonorarios','Presupuesto de Honorarios');
  pestanias[0] = new pestania('Honorarios/PrincipalFiduciariosGeneracionOtrosIngresosHonorarios','Provisiones');
  pestanias[1] = new pestania('Honorarios/PrincipalPagoHonorariosConsulta','Cobro');
  pestanias[2] = new pestania('Honorarios/PrincipalCondonacionHonorarios','Condonacion/Quebranto');
  //pestanias[3] = new pestania('Honorarios/PrincipalCondonacionHonorariosQuebrantos','Quebrantos');  
  pestanias[3] = new pestania('Honorarios/PrincipalFacturacion','Facturación');
  pestanias[4] = new pestania('Honorarios/CargaProvisiones/PrincipalCargaMasivaProvisiones','Carga Masiva'); 
  pestanias[5] = new pestania('Honorarios/EjecutorPlanes/PrincipalEjecutorPlanes','Calculo Honorarios'); 
  //pestanias[7] = new pestania('Honorarios/PrincipalContactosHonorarios','Notificaciones');


    superPestanias[0] = new superPestania(pestanias,'Operación');
    pestanias = new Array();
    
  // Consultas
  
  pestanias[0] = new pestania('Honorarios/PrincipalCarteraContratoHonorarios','Cartera por Fideicomiso');

    superPestanias[1] = new superPestania(pestanias,'Consultas');
    pestanias = new Array();
    
  //Catálogos
  pestanias[0] = new pestania('Honorarios/PrincipalParametrosHonorarios','Parámetros Honorarios');
  pestanias[1] = new pestania('Honorarios/PrincipalCatalogoDomicilioFiscal','Domicilio Fiscal');
  pestanias[2] = new pestania('Honorarios/PrincipalCatalogoINPC','INPC');
  pestanias[3] = new pestania('Honorarios/PrincipalCatalogoDatosAvisos','Avisos de Cobro');
  
    superPestanias[2] = new superPestania(pestanias,'Catálogos');
    pestanias = new Array();

escribeSuperPantalla(superPestanias);