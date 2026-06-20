// JavaScript Document

var superPestanias = new Array(); //pestañas horizontales
var pestanias = new Array(); //pestañas verticales
// new pestania('urlpantalla','titulo')

  //Seguridad
  //pestanias[0] = new pestania('ControlGestion/PrincipalSeguridadEstructuraControlGestion','Estructura Organizacional'); // mandar a catálogos generales
  //pestanias[0] = new pestania('ControlGestion/PrincipalSeguridadModulos','Funciones');
  pestanias[0] = new pestania('ControlGestion/PrincipalSeguridadPuestos','Perfiles');
  pestanias[1] = new pestania('ControlGestion/PrincipalSeguridadFuncionesXPuesto','Funciones por Perfil');
  
  superPestanias[0] = new superPestania(pestanias,'Seguridad');
  pestanias = new Array();
  
  //Usuarios
  pestanias[0] = new pestania('ControlGestion/PrincipalSeguridadUsuariosInternet','Usuarios');
  
  superPestanias[1] = new superPestania(pestanias,'Usuarios');
  pestanias = new Array();
  
/*  //Personal
  pestanias[0] = new pestania('ControlGestion/PrincipalSeguridadPersonal','Personal');
  
  superPestanias[2] = new superPestania(pestanias,'Personal');
  pestanias = new Array();*/

  //Bitácora
  pestanias[0] = new pestania('ControlGestion/PrincipalBitacoraControlGestion','Bitácora');
  pestanias[1] = new pestania('ControlGestion/Descargas/exportar_excel','Descarga Info');
  
  superPestanias[2] = new superPestania(pestanias,'Bitácora');
  pestanias = new Array();  
  
  //Fiducia Web
  pestanias[0] = new pestania('ControlGestion/ParametrosEmpresa/PrincipalParametrosEmpresa','Parámetros Institución');
  pestanias[1] = new pestania('ControlGestion/ParametrosContrasena/PrincipalParametrosContrasena','Configuración Passwords');
  
  superPestanias[3] = new superPestania(pestanias,'Fiducia Web');
  pestanias = new Array();  
  
  // Errores
  
  pestanias[0] = new pestania('Operacion/BitacoraOperativa/PrincipalConsultaBitacoraOperativa','Bitácora');
  
    superPestanias[4] = new superPestania(pestanias,'Errores');
    pestanias = new Array();
    
  //Mantto Doctos y PuntosRev
 pestanias[0] = new pestania('Administracion/PrincipalPuntosRevision','Puntos Revision');
 pestanias[1] = new pestania('Administracion/PrincipalDocumentos','Documentos');
 pestanias[2] = new pestania('Administracion/PrincipalSolicitudes','Solicitudes'); 
 pestanias[3] = new pestania('Administracion/PrincipalSeguridadUsuariosInternet','Ptos Rev x Sol');
 pestanias[4] = new pestania('Administracion/DocumentosSolicitud/PrincipalSeguridadUsuariosInternet','Doctos x Sol');
 /*pestanias[5] = new pestania('Administracion/Area/PrincipalSolicitudes','Area'); 
 pestanias[6] = new pestania('Administracion/Subclasifica/PrincipalSolicitudes','SuBClasifica');*/
 pestanias[5] = new pestania('MesaControl/ConceptosOperacionesNoMonetarias/PrincipalConceptos', 'Conceptos Instrucciones No Monetarias');
   
  superPestanias[5] = new superPestania(pestanias,'Param Solicitudes');
  
  pestanias = new Array();   

  //KYC
  pestanias[0] = new pestania('KYC/Conceptos/PrincipalConceptos','Conceptos');
  
  superPestanias[6] = new superPestania(pestanias,'Parametrizaci&oacute;n de Formatos');
  pestanias = new Array();

escribeSuperPantalla(superPestanias);