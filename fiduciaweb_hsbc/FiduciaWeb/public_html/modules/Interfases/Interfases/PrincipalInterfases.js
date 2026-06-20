// JavaScript Document

var pestanias = new Array();

// new pestania('urlpantalla','titulo')

  pestanias[0] = new pestania('Tesoreria/Interfaces/PrincipalTAS','CB Y BANCO / REPORTOS');
  pestanias[1] = new pestania('Interfases/InterfaseSalomon/PrincipalInterfaseSalomon','SIB');
  pestanias[2] = new pestania('Interfases/InterfaseSalomon3/PrincipalInterfaseSalomon','Poliza Contable');
  


  

  
   
var objPes = new Object();
objPes.arPestanias=pestanias;
objPes.indice = 0;

iniciaPantalla(objPes,null);

