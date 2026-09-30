// JavaScript Document
//var superPestanias = new Array(); //pestañas horizontales
var pestanias = new Array();

// new pestania('urlpantalla','titulo')
  pestanias[0] = new pestania('Vinta/Clientes/PrincipalParametrosContrasena','Clientes');  
  pestanias[1] = new pestania('Vinta/CreditoPre/PrincipalParametrosContrasena','Cotiza Credito');
  pestanias[2] = new pestania('Vinta/Credito/PrincipalParametrosContrasena','Creditos');  
  pestanias[3] = new pestania('Vinta/RecepcionPagos/PrincipalRecepcionPagos','Operaci&oacute;n');
  pestanias[4] = new pestania('Vinta/AutorizacionPagos/PrincipalAutorizacionPagos','Autorizar Operaciones');
  pestanias[5] = new pestania('Vinta/ClasificacionPLD/PrincipalClasificacionPLD','Clasificacion PLD');  
  pestanias[6] = new pestania('Vinta/CirculoCredito/PrincipalPrevencionLavado','Circulo Credito');  
    

    //superPestanias[0] = new superPestania(pestanias,'Administracion Cartera');
    //pestanias = new Array();


var objPes = new Object();
objPes.arPestanias=pestanias;
objPes.indice = 0;

iniciaPantalla(objPes,null);    
/*escribeSuperPantalla(superPestanias);    
/*var objPes = new Object();
objPes.arPestanias=pestanias;
objPes.indice = 0;

iniciaPantalla(objPes,null);*/
