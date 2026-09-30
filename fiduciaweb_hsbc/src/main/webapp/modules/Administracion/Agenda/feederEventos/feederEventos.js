
function getEventosFeeder()
{ 
  var fecha;
  fecha=ctxFeccont
  var objEventosFeeder = JSON.parse("{}");
  objEventosFeeder.id = "qryConsultaAgendaFeeder";
  objEventosFeeder.order = "s";
  
  var url = ctxRoot+"/getRef.do?json="+JSON.stringify(objEventosFeeder);
  //alert(url)
  makeAjaxRequest(url,"html",getEventosFeederRes,null);
}

function getEventosFeederRes(obj,result)
{
  var feedEventos = JSON.parse(result);
  var nfeeds = feedEventos.length;
  var nfeedsuser = 0;
  
  var dvFeeder = "<div class='rel'>";
  dvFeeder += "<div id='dvFeederHead'>Eventos ("+nfeeds+")</div>";
  
  dvFeeder += "<div id='dvFeederScroll'><div class='rel'>";
  
  for(s=0;s<nfeeds;s++)
  {
    var feedEvento = feedEventos[s]; 
    /*
    var binvolucrado = (feedEvento.eageStrUsuarios.indexOf(','+ctxUser+',')>-1);
    var beventofin = (feedEvento.eageIdSubfolio==feedEvento.eageFinEventos);
    if(binvolucrado||beventofin)
    {*/
      nfeedsuser++;
      
      dvFeeder += "<div class='dvFeederEvent' >";
      
      dvFeeder += "<table class='dvFeederEventTable'><tr>";
      dvFeeder += "<td class='dvFeederFecha"+(feedEvento.eageCveStatus=='PENDIENTE'?'Red':'')+"' align='right'>"+feedEvento.eageFecEvento+"</td>";
      dvFeeder += "<td rowspan=2 align='right' valign='top'>"+feedEvento.eageDesEvento+"</td>";
      dvFeeder += "</tr><tr>";
      dvFeeder += "<td align='right'><b>"+feedEvento.eageIdFolio+"&nbsp;&nbsp;"+feedEvento.eageNomFideicomiso+"</b></td>";
      dvFeeder += "</tr></table>";
      
      dvFeeder += "</div>";
    //}
  }
  
  dvFeeder += "</div></div>";
  dvFeeder += "</div>";
  
  var theFeederDV = GI("dvFeeder");
  var theFeederHd = GI("dvFeederHead");
  
  theFeederDV.innerHTML = dvFeeder; 
   theFeederHd.innerHTML = "Eventos ("+nfeedsuser+")"; 
  
}

getEventosFeeder();