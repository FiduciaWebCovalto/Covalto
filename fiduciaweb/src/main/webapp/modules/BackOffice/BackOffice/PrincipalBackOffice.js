// JavaScript Document

var superPestanias = new Array(); //pestañas horizontales
var pestanias = new Array(); //pestañas verticales

// new pestania('urlpantalla','titulo')


  pestanias[0] = new pestania('BackOffice/CharolaSolicitudAdmon3/CharolaSolicitudAdmon','Instrucciones No Monetarias');
  
  superPestanias[0] = new superPestania(pestanias,'WorkFlow');
  pestanias = new Array();
 
escribeSuperPantalla(superPestanias);


