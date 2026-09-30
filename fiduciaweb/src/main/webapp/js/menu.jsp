<%@ page contentType="text/javascript"%>
function loadMenu() {
  aMenuBar=new dhtmlXMenuBarObject("menu_zone",'100%',20,"");
  aMenuBar.setOnClickHandler(onButtonClick);
  aMenuBar.setGfxPath("imagenes/");
  const ruta_xml="xml/menu_<%=session.getAttribute("puestoId")%>.xml";
  console.log("ruta xml menu "+ruta_xml);
  aMenuBar.loadXML(ruta_xml);
  aMenuBar.showBar();
} 

function onButtonClick(itemId) {
  if(isDefinedAndNotNull(itemId) && itemId != "null") {
    var baseURL = ctxRoot + "/modules/";
    var url = baseURL + itemId.replace(".", "/");  
    while(url.indexOf(".") != -1) {
      url = url.replace(".", "/");
    }
    LDSCR(url + ".do", GI("dvContenido"), function() { LDJS(url + ".js"); } );
  }
}