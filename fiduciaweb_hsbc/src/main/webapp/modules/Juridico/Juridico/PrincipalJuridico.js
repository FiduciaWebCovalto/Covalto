// JavaScript Document
var superPestanias = new Array(); //pestañas horizontales
var pestanias = new Array(); //pestañas verticales

// new pestania('urlpantalla','titulo')

pestanias[0] = new pestania('Juridico/ActosLegales/CharolaSolicitudAdmon','Actos Legales');
pestanias[1] = new pestania('Juridico/Rechazadas/CharolaSolicitudAdmon','Rechazadas Monetarias');
pestanias[2] = new pestania('Juridico/RechazadasNoMonetarias/CharolaSolicitudAdmon','Rechazadas No Monetarias');
pestanias[3] = new pestania('Juridico/Excepciones/CharolaSolicitudAdmon','Excepciones');
//pestanias[4] = new pestania('Juridico/RPP/CharolaSolicitudAdmon','RPP');

//pestanias[4] = new pestania('Juridico/CharolaSolicitudAdmon3/CharolaSolicitudAdmon','Instrucciones No Monetarias');

superPestanias[0] = new superPestania(pestanias,'WorkFlow');
 
escribeSuperPantalla(superPestanias);


