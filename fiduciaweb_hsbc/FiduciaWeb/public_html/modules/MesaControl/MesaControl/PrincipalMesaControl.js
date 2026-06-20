// JavaScript Document
var superPestanias = new Array();//pestañas horizontales
var pestanias = new Array();//pestañas verticales
// new pestania('urlpantalla','titulo')
pestanias[0] = new pestania('MesaControl/Monetarias/CharolaSolicitudAdmon', 'Instrucciones Monetarias');
pestanias[1] = new pestania('MesaControl/NoMonetarias/CharolaSolicitudAdmon', 'Instrucciones No Monetarias');
pestanias[2] = new pestania('MesaControl/MontosMayores/CharolaSolicitudAdmon', 'Montos Mayores');
pestanias[3] = new pestania('MesaControl/Excepciones/CharolaSolicitudAdmon', 'Excepciones Monetarias');
pestanias[4] = new pestania('MesaControl/ExcepcionesNoMon/CharolaSolicitudAdmon', 'Excepciones No Monetarias');
//pestanias[5] = new pestania('MesaControl/Rechazadas/CharolaSolicitudAdmon', 'Instrucciones Rechazadas');
//pestanias[6] = new pestania('MesaControl/Incompletas/CharolaSolicitudAdmon', 'Instrucciones Monetarias Incompletas');
//pestanias[4] = new pestania('MesaControl/Reportes/Reportes', 'Reportes');

superPestanias[0] = new superPestania(pestanias, 'WorkFlow');

escribeSuperPantalla(superPestanias);