    // JavaScript Document

var superPestanias = new Array(); //pestañas horizontales
var pestanias = new Array(); //pestañas verticales
// new pestania('urlpantalla','titulo')

  //Operación
  pestanias[0] = new pestania('PLD/Indices/PrincipalCatalogoIndices','Índices');
  pestanias[1] = new pestania('PLD/Reportes/PrincipalInformacionGerencial','Informacion Gerencial');
  /*pestanias[4] = new pestania('PLD/InternaPreocupantes/PrincipalParametrosContrasena','Internas Preocupantes');
  pestanias[5] = new pestania('PLD/ClasificacionPLDInterna/PrincipalClasificacionPLD','Clasificacion Interna Preocupante');
  pestanias[6] = new pestania('PLD/CirculoCredito/PrincipalPrevencionLavado','Circulo Credito');*/
  
  
  superPestanias[0] = new superPestania(pestanias,'PLD');
  pestanias = new Array();
  
escribeSuperPantalla(superPestanias);
