// JavaScript Document

var superPestanias = new Array(); //pestañas horizontales
var pestanias = new Array(); //pestañas verticales
// new pestania('urlpantalla','titulo')

  //Fideicomisos
  //pestanias[0] = new pestania('Administracion/PrincipalFideicomisos','Fideicomisos');
  pestanias[0] = new pestania('Administracion/Fideicomisos/PrincipalFideicomisos','Fideicomisos');
  pestanias[1] = new pestania('Administracion/AlternaSubCuentas/PrincipalSubCuentas','SubFideicomiso');
  pestanias[2] = new pestania('Administracion/PrincipalFinalidadesContrato','Fines');
  pestanias[3] = new pestania('Administracion/Inversion/PrincipalFinalidadesContrato','Inversion');
  pestanias[4] = new pestania('Administracion/ActosLegales/PrincipalFinalidadesContrato','Actos Legales');
  pestanias[5] = new pestania('Administracion/Observacion/PrincipalFinalidadesContrato','Observacion');  
  pestanias[6] = new pestania('Administracion/Fiscal/PrincipalFinalidadesContrato','Fiscal');
  //pestanias[7] = new pestania('Administracion/PendientesFideicomiso/PendientesFideicomiso','Pendientes por Fideicomiso');  
  superPestanias[0] = new superPestania(pestanias,'Fideicomisos');
  pestanias = new Array();
  
  //Comités Técnicos
  pestanias[0] = new pestania('Administracion/KYC/PrincipalKYC','KYC');  
  pestanias[1] = new pestania('Otros/ClonacionKYCAdmon/PrincipalClonacionKYC','Clonacion KYC');
  pestanias[2] = new pestania('Administracion/PerfilTransaccional/PrincipalFinalidadesContrato','Perfil Transaccional');  

  //pestanias[2] = new pestania('Administracion/PrincipalMiembrosComiteTecnico','Miembros');
  
  superPestanias[1] = new superPestania(pestanias,'KYC');
  pestanias = new Array();
  
  
  //Charola Solicitud No Monetaria
 //pestanias[0] = new pestania('Administracion/CharolaSolicitudAdmon2/CharolaSolicitudAdmon','Evaluacion Proyecto Negocio');
 //Charola Solicitud Monetaria
//Operaciones
    pestanias[0] = new pestania('Administracion/Monetarias/CharolaSolicitudAdmon','Instrucciones Monetarias');
    pestanias[1] = new pestania('Administracion/NoMonetarias/CharolaSolicitudAdmon','Instrucciones No Monetarias');   
    //pestanias[2] = new pestania('Administracion/Recurrentes/CharolaSolicitudAdmon','Instrucciones Recurrentes');    
  superPestanias[2] = new superPestania(pestanias,'Operaciones');
  
  pestanias = new Array();
  
  
  //Admon Cuentas
 pestanias[0] = new pestania('Administracion/CuentasInversion/PrincipalFinalidadesContrato','Cuentas');
 pestanias[1] = new pestania('Administracion/ValidacionCBI/CharolaSolicitudAdmon','Validacion CBI');
   
  superPestanias[3] = new superPestania(pestanias,'Ctas. Bancarias e Inv');
  
  pestanias = new Array();   
   
    
    //Comite
    pestanias[0] = new pestania('Administracion/Agenda/PrincipalAgenda','Agenda de Eventos');
    superPestanias[4] = new superPestania(pestanias,'Agenda');

 pestanias = new Array();   
   
    
    //Comite
    pestanias[0] = new pestania('Administracion/PrincipalComiteTecnico','Comite Tecnico');
    //pestanias[1] = new pestania('Administracion/PrincipalMiembrosComiteTecnico','Miembros');
    superPestanias[5] = new superPestania(pestanias,'Comite');
    
    pestanias = new Array();       

  pestanias[0] = new pestania('Formalizacion/Reportes/PrincipalInformacionGerencial','Informacion Gerencial');
  superPestanias[6] = new superPestania(pestanias,'PLD');  

escribeSuperPantalla(superPestanias);

  

  
  