<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.io.*"%>
<%@ page import="java.sql.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="reporte"  class="mx.com.inscitech.clients.negocio.nFinanciera"/>
<%@ include file="Sesion.jsp" %>
<HTML>
<HEAD><TITLE>Información Financiera - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<script language="JavaScript" SRC='scripts/general.js'></script>
<script language="JavaScript" type="text/JavaScript">

<%
  String strContenidoArchivo  = "";
 	session.setAttribute("contenido","");
	ServletContext servidor=pageContext.getServletContext();                        	    
	String sRuta=servidor.getRealPath("/reportes/")+File.separator;		
  String sNiv1 = "";
  String sNiv2 = "";
  String sNiv3 = "";
  String sParam = "";
  String sFecFidLim = "";
  String sFecFid = "";
  String sFecFidIni = "";
  String sFecCalend = "";
  String sFecFiso = "";
  String[] sData = new String[9];
  String[] sNomNivel;
  int[] iLenNivel;
  int iNumlevels;
  int iDia;
  int iMes;
  int ianio;
  int iNumMovIni = 0;
  int iMesSig = 0;
  int iAnioSig = 0;
  
  sFecFidLim = BD.getFecha();
  ianio = Integer.parseInt(sFecFidLim.substring(6,10));
  iMes = Integer.parseInt(sFecFidLim.substring(3,5));
  iDia = Integer.parseInt(sFecFidLim.substring(0,2));
  sFecFiso = Integer.toString(ianio) + Integer.toString(iMes);
  
  sFecCalend = request.getParameter("txtFechaF");
  if(sFecCalend != null) { 
     iAnioSig =  Integer.parseInt(sFecCalend.substring(6,10));
     iMesSig =  Integer.parseInt(sFecCalend.substring(3,5));
     sFecCalend =  Integer.toString(iAnioSig) +  Integer.toString(iMesSig);
  }
  
  //JJR
  //27/09/2005
  //CORECCION DEBIDO A QUE  UTILIZO Ñ PARA LA DECLARACION DE UNA VARIABLE Y NO ESPECIFICA DE QUE LIBRERIA
  //SE VA UTILIZAR  EL CONSTRUCTOR DATE 
  //iaño = (new Date(iaño - 1900, iMes - 6, iDia).getYear()) + 1900;
  //iMes = (new Date(iaño - 1900, iMes - 6, iDia).getMonth()) + 1;
  
  if( iMes < 10 ) {
      sFecFid = Integer.toString(ianio) + "0" + Integer.toString(iMes);
      sFecFidIni =  "01/" + "0" + Integer.toString(iMes) + "/" +  Integer.toString(ianio);
  } else {
      sFecFid = Integer.toString(ianio) + Integer.toString(iMes);
      sFecFidIni =  "01/" + Integer.toString(iMes) + "/" +  Integer.toString(ianio);
  }
  
 iNumMovIni = BD.obtenMoviIni((String)session.getAttribute("NumFid"),sFecFidIni);
 
 ianio = (new java.util.Date(ianio - 1900, iMes - 6, iDia).getYear()) + 1900;
 iMes = (new java.util.Date(ianio - 1900, iMes - 6, iDia).getMonth()) + 1;
 sFecFidLim = Integer.toString(ianio);
  
   if (iMes < 10) 
    sFecFidLim += "0" + Integer.toString(iMes);
   else 
    sFecFidLim += Integer.toString(iMes);
    
  sFecFidLim += "01";
  
  sNomNivel = BD.getTitulosCtasInd((String)session.getAttribute("NumFid"));
  iLenNivel = BD.getLenCtasInd((String)session.getAttribute("NumFid"));
  
  iNumlevels = 1;
  if (request.getParameter("txtFechaI")!=null &&  request.getParameter("txtFechaF")!=null && request.getParameter("cboEnt")!=null && !request.getParameter("cboEnt").equals("Selecciona el " + sNomNivel[1]))
  { 
    sData[5] = "0";
    sData[6] = "0";
    if (sNomNivel[2] != null)
    {
      iNumlevels = 2;
      if(request.getParameter("cboEnt")!=null && request.getParameter("cboMun")!=null )
      {
        if(!request.getParameter("cboEnt").equals("Selecciona el " + sNomNivel[2]) && !request.getParameter("cboMun").equals("Selecciona el " + sNomNivel[3]))
        {
          iNumlevels = 3;          
          sNiv2 = request.getParameter("cboMun").substring(0, request.getParameter("cboMun").indexOf(" "));
          sNiv3 = request.getParameter("cboInv").substring(0, request.getParameter("cboInv").indexOf(" "));
          sData[5] = request.getParameter("cboMun");
          sData[6] = request.getParameter("cboInv");
        }
      }      
    }  
	
    sNiv1 = request.getParameter("cboEnt").substring(0,request.getParameter("cboEnt").indexOf(" "));
    sData[0] = (String)session.getAttribute("NumFid");
    sData[1] = (String)session.getAttribute("Fideicomiso");
    sData[2] = request.getParameter("txtFechaI");
    sData[3] = request.getParameter("txtFechaF");
    sData[4] = request.getParameter("cboEnt");
    
    sData[7] = sRuta;
    sData[8] = Integer.toString(iNumlevels);
    
    if( (iNumMovIni > 1) && Integer.parseInt(sFecCalend) <=  Integer.parseInt(sFecFiso) ) {
       strContenidoArchivo = reporte.getReporteCtasInd(sData, sNomNivel);
    } 
   
    session.setAttribute("contenido",strContenidoArchivo);		
  }
%>

function ObtenerDatos(iCbo) 
{
   if (iCbo == 1)
   {
      if(document.CtasInd.cboEnt.selectedIndex==0) 
      {
         document.CtasInd.cboEnt.focus();
      }
      else
      {
         document.CtasInd.submit();
      }
   }
   else if(iCbo==2)
   {
      if (document.CtasInd.cboMun.selectedIndex==0) 
      {
         document.CtasInd.cboMun.focus();
      }
      else
      {
         document.CtasInd.submit();
      }
   }
   else if(iCbo==3)
   {
      if (document.CtasInd.cboInv.selectedIndex==0) 
      {
         document.CtasInd.cboInv.focus();
      }
      else
      {
         document.CtasInd.submit();
      }
   }
}



function fechas()
{  
CtasInd.txtFechaF.value=CtasInd.cboCalendarioF.value;
 var dFecha = CtasInd.txtFechaF.value;	
 document.CtasInd.txtFechaI.value = "01" + "/" + dFecha.substr(3,2) + "/" +  dFecha.substr(6,4) ;	  
 document.CtasInd.submit();	  
}

function ValidarDatos(iNumlevels, sFecFidLim, sFecFid, iNumMovIni)
{ 
    var sFecha = new String;
    var sFechaMax = new String;
    
   //Valida qe la fecha sea mayor a seis meses atras respecto a la fecha contable
   sFecha = document.CtasInd.txtFechaF.value.substr(6,4) + document.CtasInd.txtFechaF.value.substr(3,2) + document.CtasInd.txtFechaF.value.substr(0,2);
   //Obtiene el mes y año capturado
   sFechaMax = document.CtasInd.txtFechaF.value.substr(6,4) + document.CtasInd.txtFechaF.value.substr(3,2);
   
   if ( parseInt(sFecFidLim) >  parseInt(sFecha))
   {  
       sFecha = sFecFidLim;
       alert("Las fecha debe ser mayor que " +(sFecFidLim+"d").substr(6,2) + "/" + (sFecFidLim+"a").substr(4,2) +"/"+(sFecFidLim+"m").substr(0,4));
    //  document.CtasInd.txtFechaF.focus();
      return false;
   } 
   
   /***********************************************/
   if( parseInt(sFechaMax) > parseInt(sFecFid) ) {
       alert("El mes solicitado no puede ser mayor al periodo actual");
       return false;
   }
   /***********************************************/
   
   /***********************************************/
   if(iNumMovIni < 1 ) {
      alert("El mes previo no está capitalizado. No es posible generar reporte para el mes solicitado");
      return false;
   }
   /***********************************************/
   
   if(document.CtasInd.cboEnt.selectedIndex==0)
   {
      var strValidacionEnt = document.CtasInd.cboEnt.options[0].value;
      alert(strValidacionEnt);
      document.CtasInd.cboEnt.focus();
      return false;
   }
  
   if (iNumlevels >= 2)
   {
     if( document.CtasInd.cboMun.selectedIndex==0) 
     {
       var strValidacionMun = document.CtasInd.cboMun.options[0].value;
       alert(strValidacionMun);
       document.CtasInd.cboMun.focus();
       return false;
     }
   }
  
   if (iNumlevels >= 3)
   {
     if( document.CtasInd.cboInv.selectedIndex==0) 
     {
        var strValidacionInv = document.CtasInd.cboInv.options[0].value;
        alert(strValidacionInv);
        document.CtasInd.cboInv.focus();
        return false;
     }
   }
   return true;
 }


function ver(iNumlevels, sFecFidLim, sFecFid, iNumMovIni) 
{

   if (!ValidarDatos(iNumlevels, sFecFidLim, sFecFid, iNumMovIni))
   {
      return;
   }
   <%
   if (!strContenidoArchivo.equals(""))
   {
   %>
      window.open("ctasInd.jsp","Estado","top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=no,copyhistory=NO,width=750,height=420");
   <%
   }
   else
   {
   %>
      alert("El Estado de Cuenta por inversionista, NO ESTA DISPONIBLE");
   <%
   }
%>
}
</script>
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script>
</HEAD>
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')" >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366"><IMG 
            src="imagenes/logo.jpg" 
            alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="176"></TD>
      <TD vAlign="top" background="imagenes/msur01.png"
          ></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
    <TR > 
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=sysFecha%></TD>
      <TD background="imagenes/fondoMenu.gif"><a href="FI_Consultas.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','imagenes/consultas2.gif',1)"><img src="imagenes/consultas1.gif" name="Image10" width="104" height="17" border="0"></a><a href="FI_Instrucciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Instrucciones','','imagenes/instrucciones2.gif',1)"><img src="imagenes/instrucciones1.gif" name="Instrucciones"  border="0"></a><a href="FI_EdosF.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Reportes','','imagenes/reportes2.gif',1)"><img src="imagenes/reportes2.gif" name="Reportes"  border="0"></a><a href="FI_Opciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Opciones','','imagenes/Opciones2.gif',1)"><img src="imagenes/Opciones1.gif" name="Opciones"  border="0"></a><a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir"  border="0"></a></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540" width="176"><table width="176"border="0">
          <tr> 
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td align="left" class="subMenu"><img src="imagenes/bolita.gif"  border="0"></td>
            <td align="left" class="subMenu"><a class="subMenu" href="FI_EdosF.jsp?edo=1">Estado 
              de Cuenta</a></td>
          </tr>
          <tr> 
            <td class="subMenu">&nbsp;</td>
            <td class="subMenu">&nbsp;</td>
          </tr>
          <tr> 
            <td align="left" class="subMenu"><img src="imagenes/bolita.gif"  border="0"></td>
            <td align="left" class="subMenu"><a class="subMenu" href="FI_EdosF.jsp?edo=2">Balance 
              General</a></td>
          </tr>
          <tr> 
            <td class="subMenu">&nbsp;</td>
            <td class="subMenu">&nbsp;</td>
          </tr>
          <tr> 
            <td align="left" class="subMenu"><img src="imagenes/bolita.gif"  border="0"></td>
            <td align="left" class="subMenu"><a class="subMenu" href="FI_EdosF.jsp?edo=3">Balanza 
              de Comprobación</a></td>
          </tr>
          <tr> 
            <td class="subMenu">&nbsp;</td>
            <td class="subMenu">&nbsp;</td>
          </tr>
          <tr> 
            <td align="left" class="subMenu"><img src="imagenes/bolita.gif"  border="0"></td>
            <td align="left" class="subMenu"><a class="subMenu" href="FI_EdosF.jsp?edo=4">Estado 
              de Resultados</a></td>
          </tr>
          <% 
            if (BD.ExistenCtasInd( (String)session.getAttribute("NumFid"))) 
            {
          %>
            <tr> 
              <td class="subMenu">&nbsp;</td>
              <td class="subMenu">&nbsp;</td>
            </tr>
            <tr> 
              <td align="left" class="subMenu"><img src="imagenes/bolita.gif"  border="0"></td>
              <td align="left" class="subMenu"><a class="subMenu" href="repCtasInd.jsp">Cuentas 
              Individuales</a></td>
            </tr>
          <%
            }
            if(((String)session.getAttribute( "FOSEG" )).equals("S"))
  	        {
		      %>
          <tr> 
            <td class="subMenu">&nbsp;</td>
            <td class="subMenu">&nbsp;</td>
          </tr>
          <tr> 
            <td align="left" class="subMenu"><img src="imagenes/bolita.gif"  border="0"> 
            </td>
            <td align="left" class="subMenu"><a class="subMenu" href="edoCtaFoseg.jsp">Situación 
              Program&aacute;tico Presupuestal</a></td>
          </tr>
          <%}%>
          <tr> 
            <td class="subMenu">&nbsp;</td>
            <td class="subMenu">&nbsp;</td>
          </tr>
          <tr> 
            <td  class="subMenu" align="right">&nbsp;</td>
            <td  class="subMenu" align="right"> <a class="subMenu"  href="<%=((String)session.getAttribute( "totFid" )).equals("1")?"FI_Bienvenida":"FI_Fideicomiso"%>.jsp">Inicio</a>&nbsp;<img src="imagenes/flecha.gif"   border="0"> 
            </td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
        </table></TD>
      <TD valign="top" align="center"> <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        <table width="593" border="0">
          <tr> 
            <td class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Cuentas 
              Individuales</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td align="center" valign="top"> <form name="CtasInd" method="post" action="repCtasInd.jsp">
                <input type="hidden" name="txtNumFid" value="<%= session.getAttribute( "NumFid" ) %>">
				<input  type="hidden" maxlength="10" name="txtFechaI" style=" WIDTH:70px"   value="<%=(request.getParameter("txtFechaI")!=null)?request.getParameter("txtFechaI"):"01"+fecha.substring(2,10)%>">
                <input type="hidden" name="txtFechaF" maxlength=10 value="<%=request.getParameter("txtFechaF")!=null?request.getParameter("txtFechaF"):fecha%>">
                <table width="80%"  border="0">

                    <td colspan="2"></td>
                  </tr>
                  <tr> 
                    <td colspan="2"> </td>
                  </tr>
                  <%            
                  if (sNomNivel[1] != null)
                  {
                  %>
                  <tr>
                    <td class="texto" align="right">Fecha Final</td>
                    <td class="texto"> 
                      <input type="button" id="cboCalendarioF" name="cboCalendarioF"  style=" WIDTH: 60px" value="<%=request.getParameter("txtFechaF")!=null?request.getParameter("txtFechaF"):fecha%>" onChange="fechas();">
                      <input type="button" id="lanzaCalendarioF" name="lanzaCalendarioF"  style=" WIDTH: 15px"   class="botonCbo" value="v">
                      <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendarioF",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioF"   // el id del botón que lanzará el calendario
																						});					
					</SCRIPT></td>
                  </tr>
                  <tr> 
                    <td width="34%" class="texto" align="right"><%=sNomNivel[1]%> 
                      :</td>
                    <td class="texto"> <select name="cboEnt" onChange="ObtenerDatos(1)">
                        <option value="<%="Selecciona el " + sNomNivel[1]%>">Selecciona 
                        el <%=sNomNivel[1]%></option>
                        <%
                        if(request.getParameter("cboEnt")!=null)
                        {
                          out.print(BD.DataCombos(10,(String)session.getAttribute("NumFid") + " AND DAT_NIVEL = 1 START  WITH DAT_PARENT_ID = 0",request.getParameter("cboEnt")));                          
                        }
                        else
                        {
                          out.print(BD.DataCombos(10,(String)session.getAttribute("NumFid") + " AND DAT_NIVEL = 1 START  WITH DAT_PARENT_ID = 0",""));
                        }
                        %>
                      </select> </td>
                  </tr>
                  <tr> 
                    <td colspan="2"> </td>
                  </tr>
                  <%
                  }
                  %>
                  <tr> 
                    <td colspan="2"></td>
                  </tr>
                  <%                      
                  if (sNomNivel[2] != null)
                  {
                  %>
                  <tr> 
                    <td width="34%" class="texto" align="right"><%=sNomNivel[2]%> 
                      :</td>
                    <td class="texto"> <select name="cboMun" onChange="ObtenerDatos(2)">
                        <option value="<%="Selecciona el " + sNomNivel[2]%>">Selecciona 
                        el <%=sNomNivel[2]%></option>
                        <%
                      if (request.getParameter("cboEnt")!= null)
                      {
                        if (!request.getParameter("cboEnt").equals("Selecciona el " + sNomNivel[1]))
                        {                          
                          sParam  = (String)session.getAttribute("NumFid");
                          sParam +=  " AND DAT_NIVEL = 2"; 
                          sParam +=  " START WITH DAT_PARENT_ID = RPAD('" + sNiv1 + "'," + iLenNivel[0] + ", '0')";
                          
                          if(!request.getParameter("cboMun").equals("Selecciona el " + sNomNivel[2]))            
                          {                            
                            out.print(BD.DataCombos(10,sParam,request.getParameter("cboMun")));
                          }
                          else
                          {
                            out.print(BD.DataCombos(10,sParam,""));
                          }
                        }
                      } 
                      %>
                      </select> </td>
                  </tr>
                  <%
                  }
                  %>
                  <tr> 
                    <td colspan="2"></td>
                  </tr>
                  <tr> 
                    <td colspan="2"></td>
                  </tr>
                  <%                      
                  if (sNomNivel[3] != null)
                  {
                  %>
                  <tr> 
                    <td width="34%" class="texto" align="right"><%=sNomNivel[3]%> 
                      :</td>
                    <td class="texto"> <select name="cboInv" onChange="ObtenerDatos(3)">
                        <option value="<%="Selecciona el " + sNomNivel[3]%>">Selecciona 
                        el <%=sNomNivel[3]%></option>
                        <%
                      if (request.getParameter("cboEnt")!= null)
                      {
                        if (!request.getParameter("cboEnt").equals("Selecciona el " + sNomNivel[1])&& !request.getParameter("cboMun").equals("Selecciona el " + sNomNivel[2]))
                        {                          
                          sParam  = (String)session.getAttribute("NumFid");
                          sParam +=  " AND DAT_NIVEL = 3"; 
                          sParam +=  " START WITH DAT_PARENT_ID = RPAD('" + sNiv1 + sNiv2 + "'," + iLenNivel[0] + ", '0')";
                          
                          if(!request.getParameter("cboInv").equals("Selecciona el " + sNomNivel[3]))
                          {
                            out.print(BD.DataCombos(10,sParam,request.getParameter("cboInv")));
                          }
                          else
                          {
                            out.print(BD.DataCombos(10,sParam,""));
                          }
                        }
                      }
                      %>
                      </select> </td>
                  </tr>
                  <%
                  }
                  %>
                  <tr> 
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2" align="center"> <input type="button" name="Consultar" value="Consultar" class="boton" onClick="javascript:ver(<%=iNumlevels%>,<%=sFecFidLim%>,<%=sFecFid%>,<%=iNumMovIni%>)"></td>
                  </tr>
                </table>
              </form></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
	
</BODY></HTML>
