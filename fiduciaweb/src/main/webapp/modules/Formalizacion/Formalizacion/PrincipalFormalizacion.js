// JavaScript Document

var superPestanias = new Array(); //pestañas horizontales
var pestanias = new Array(); //pestañas verticales
// new pestania('urlpantalla','titulo')

  //Prospecto
  pestanias[0] = new pestania('Formalizacion/PrincipalProspectos','Prospectos');  
  superPestanias[0] = new superPestania(pestanias,'Prospecto');
  pestanias = new Array();

  //Proyecto
  pestanias[0] = new pestania('Formalizacion/PrincipalProspectosAnteproyecto','Proyecto');
  pestanias[1] = new pestania('Otros/ClonacionKYC/PrincipalClonacionKYC','Clonacion KYC');
  pestanias[2] = new pestania('Formalizacion/KYC/PrincipalKYC','KYC');
  pestanias[3] = new pestania('Formalizacion/Evidencias/PrincipalFinalidadesContrato','Evidencias');  
  //pestanias[4] = new pestania('Formalizacion/PerfilTransaccional/PrincipalFinalidadesContrato','Perfil Transaccional');
  superPestanias[1] = new superPestania(pestanias,'Proyecto');
  pestanias = new Array();


  //DICTAMINACION
    pestanias[0] = new pestania('Formalizacion/AprobacionMCF/CharolaAprobacionMCF','Aprobacion MCF');
    //pestanias[1] = new pestania('Formalizacion/VincularCIS/PrincipalVincularCIS','Vincular CIS');
    pestanias[1] = new pestania('Formalizacion/Contrato/PrincipalContrato','Contrato');
    pestanias[2] = new pestania('Formalizacion/PrincipalFinalidadesContrato','Fines');
    pestanias[3] = new pestania('Formalizacion/Inversion/PrincipalFinalidadesContrato','Inversion');    
    pestanias[4] = new pestania('Formalizacion/PrincipalParametrosHonorarios','Honorarios');
    pestanias[5] = new pestania('Formalizacion/AprobacionHonorarios/CharolaAprobacionHonorarios','Aprobacion Honorarios');
    pestanias[6] = new pestania('Formalizacion/Fiscal/PrincipalFinalidadesContrato','Fiscal');
   
  superPestanias[2] = new superPestania(pestanias,'Dictaminacion');  
pestanias = new Array()  

  //PLD
 pestanias[0] = new pestania('Formalizacion/Tablero/PrincipalFinalidadesContrato','Estatus Dictaminacion');
   
  superPestanias[3] = new superPestania(pestanias,'Activar Fideicomiso');  
  

  
pestanias = new Array()

escribeSuperPantalla(superPestanias);









