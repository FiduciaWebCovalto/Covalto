<!--



// -----------------------------------------------------------------------------------------------
// 		COMIENZA EL CODIGO QUE SEPARA LA VERSION EXACTA, SIN IMPORTAR SI ES NETSCAPE O EXPLORER
var useragent = navigator.userAgent;
var bName = (useragent.indexOf('Opera') > -1) ? 'Opera' : navigator.appName;
var pos = useragent.indexOf('MSIE');
if (pos > -1) {
	bVer = useragent.substring(pos + 5);
	var pos = bVer.indexOf(';');
	var bVer = bVer.substring(0,pos);
}
var pos = useragent.indexOf('Opera');
if (pos > -1)	{
	bVer = useragent.substring(pos + 6);
	var pos = bVer.indexOf(' ');
	var bVer = bVer.substring(0, pos);
}
if (bName == "Netscape") {
	var bVer = useragent.substring(8);
	var pos = bVer.indexOf(' ');
	var bVer = bVer.substring(0, pos);
}
if (bName == "Netscape" && parseFloat(navigator.appVersion) >= 4.7) {
	var pos = useragent.lastIndexOf('/');
	var bVer = useragent.substring(pos + 1);
	var posCorchete = bVer.indexOf('[');
	if(posCorchete != 0 && posCorchete != -1)
		bVer = bVer.substring(0,posCorchete)
	}


function detect() 
		{

// ********		MANDA A LOS REQUISITOS SI NO ES VERSION MAYOR A TRES DE NETSCAPE y a 5 en Internet Explorer  ********	
/*if ( (bName == "Microsoft Internet Explorer") && (parseInt(bVer)<5))
		{
		location.href="Requisitos.jsp";
		}
else if(bName != "Microsoft Internet Explorer")
		{
		location.href="Requisitos.jsp";
		}*/
	}