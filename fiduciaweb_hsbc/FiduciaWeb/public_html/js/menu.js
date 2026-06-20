function loadMenu() {
  preLoadImages();
  //menu #1
  aMenuBar=new dhtmlXMenuBarObject("menu_zone",'100%',20,"");
  aMenuBar.setOnClickHandler(onButtonClick);
  aMenuBar.setGfxPath("imagenes/");
  //aMenuBar.loadXML("xml/menu_general.xml");
  const ruta_xml="xml/menu_<%=session.getAttribute("puestoId")%>.xml";
  console.log("ruta xml menu "+ruta_xml);  
  aMenuBar.loadXML(ruta_xml);
  aMenuBar.showBar();
}

function preLoadImages() {
  var imSrcAr = new Array("")
  var imAr = new Array(0);
  for(var i=0;i<imSrcAr.length;i++){
    imAr[imAr.length] = new Image();
    imAr[imAr.length-1].src = "imagenes/"+imSrcAr[i]
  }
}

function onButtonClick(itemId) { // esta funcion no es la buena, hay otra en menu.jsp
  var baseURL = ctxRoot + "/modules/";
  var url = baseURL + itemId.replace(".", "/");  
  while(url.indexOf(".") != -1)
    url = url.replace(".", "/");
  LDSCR(url + ".do", GI("dvContenido") , function() { LDJS(url + ".js"); } );
  hideWaitLayer();
}