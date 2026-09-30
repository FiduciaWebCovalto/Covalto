<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->/

<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="reporte"  class="mx.com.inscitech.clients.negocio.nFinanciera"/>
<%@ page import="java.io.*"%>
<%@ page import="java.io.PrintWriter"%>
<%@ include file="Sesion.jsp" %>

<HTML>
<HEAD><TITLE>Información Financiera - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<%
	boolean bStatus = false;
	ServletContext servidor=pageContext.getServletContext();                        	    
	String sRuta=servidor.getRealPath("/reportes/")+File.separator;		
    String[] sData = new String[10];
	  if(request.getParameter("cboEjercicio")!=null && !request.getParameter("cboEjercicio").equals("Selecciona un Ejercicio")) 
	  {
	  	   	String Eje=(request.getParameter("cboEje")!=null && !request.getParameter("cboEje").equals("Selecciona un Eje"))?request.getParameter("cboEje"):"";	
			String Programa=(request.getParameter("cboPrograma")!=null && !request.getParameter("cboPrograma").equals("Selecciona un Programa"))?request.getParameter("cboPrograma"):"";
			String Proyecto=(request.getParameter("cboProyecto")!=null && !request.getParameter("cboProyecto").equals("Selecciona un Proyecto"))?request.getParameter("cboProyecto"):"";
			String Accion=(request.getParameter("cboAccion")!=null && !request.getParameter("cboAccion").equals("Selecciona una Accion"))?request.getParameter("cboAccion"):"";

			Eje=!Eje.equals("")?Eje.substring(0,Eje.indexOf('-')).trim():"";
			Programa=!Programa.equals("")?Programa.substring(0,Programa.indexOf('-')).trim():"";
			Proyecto=!Proyecto.equals("")?Proyecto.substring(0,Proyecto.indexOf('-')).trim():"";
			Accion=!Accion.equals("")?Accion.substring(0,Accion.indexOf('-')).trim():"";
		    sData[0] = (String)session.getAttribute("NumFid");
		    sData[1] = ((String)session.getAttribute( "Fideicomiso" )).substring(((String)session.getAttribute( "Fideicomiso" )).indexOf('-')+1,((String)session.getAttribute( "Fideicomiso" )).length());
			sData[2] = request.getParameter("cboEjercicio");
			sData[3] = BD.getFecha(); 
		    sData[4] =request.getParameter("cboOrigen").equals("Selecciona el Origen")?"":request.getParameter("cboOrigen").equals("Estatal")?"2":request.getParameter("cboOrigen").equals("Federal")?"1":"3";
		    sData[5] =Eje;
		    sData[6] =Programa;
		    sData[7] =Proyecto;
		    sData[8] =Accion;
			sData[9] = sRuta;
	}
	String strContenidoArchivo  = "";
	if(request.getParameter("verReporte")!=null && request.getParameter("verReporte").equals("si"))
	{
		strContenidoArchivo =  reporte.getPresupuestalFoseg(sData);
		session.setAttribute("contenido",strContenidoArchivo);		
	}

%>
<script language="JavaScript" SRC='scripts/general.js'>
</script>
<script language="JavaScript" type="text/JavaScript">
function Mostrar()
{
document.EdoCtaFoseg.submit(); 
}

function ver(valor)
{
 if (document.EdoCtaFoseg.cboEjercicio.selectedIndex==0)
   {
      alert("El ejercicio es un dato necesario para la generación del la situación programático presupuestal");
      document.EdoCtaFoseg.cboEjercicio.focus();
      
    }
   else
   {
        document.EdoCtaFoseg.accion.value= valor; 
      	document.EdoCtaFoseg.verReporte.value="si";
	      document.EdoCtaFoseg.submit();      
	}
}

function ver2(varAccion)
{	 
   if(document.EdoCtaFoseg.excel.checked==false){
     if( varAccion == "Consultar"){	
        window.open("reporte.jsp?accion="+ varAccion ,"","top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=yes,copyhistory=NO,width=750,height=420"); 
        
     }else{
        window.open("reporte.jsp?accion="+ varAccion ,"","top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=yes,copyhistory=NO,width=750,height=420"); 
     }    
  }else{
        window.open("reporte.jsp?excel=1&accion="+ varAccion ,"","top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=yes,copyhistory=NO,width=750,height=420"); 	
  }
}

function habilitarBoton(casillaVerificacion) {
   if(casillaVerificacion.checked==false)
     document.EdoCtaFoseg.Imprimir.disabled = false;
   else
     document.EdoCtaFoseg.Imprimir.disabled = true;   
 }
 
</script>
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_preloadImages() { 
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { 
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_findObj(n, d) { 
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { 
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script>
</HEAD>
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" <%=(request.getParameter("verReporte")!=null && request.getParameter("verReporte").equals("si")) ?"onLoad=\"javascript:ver2(\'"+ request.getParameter("accion") + "\')\"":""%>>
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
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540" width="176"><table width="176" border="0">
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
           <TD valign="top" align="center"> 
	  <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        <table width="593" border="0">
          <tr> 
            <td   class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" class="titulo">Situaci&oacute;n 
              Program&aacute;tico Presupuestal</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td align="center" valign="top"> <form name="EdoCtaFoseg" method="post" action="edoCtaFoseg.jsp">
                <input type="hidden" name="verReporte" value="no">
                <input type="hidden" name="txtNumFid" value="<%= session.getAttribute( "NumFid" ) %>">
                <table width="84%"  border="0">
                  <tr> 
                    <td width="28%" height="24" align="right" class="texto">Ejercicio:</td>
                    <td width="72%"><select name="cboEjercicio" onChange="Mostrar()";>
                        <option selected>Selecciona un Ejercicio</option>
                        <%
                                    if(request.getParameter("cboEjercicio")!=null)
                                    {
                                       out.print(BD.DataCombos(13,(String)session.getAttribute("NumFid"),request.getParameter("cboEjercicio")));
                                    }
                                    else
                                    {
                                       out.print(BD.DataCombos(13,(String)session.getAttribute("NumFid"),""));
                                    }
                                 %>
                      </select></td>
                  </tr>
                  <tr> 
                    <td colspan="2"></td>
                  </tr>
                  <tr> 
                    <td colspan="2"></td>
                  </tr>
                  <tr> 
                    <td  class="texto" align="right">Origen de los Recursos:</td>
                    <td  class="texto"><select name="cboOrigen" onChange="Mostrar()">
                        <option>Selecciona el Origen 
                        <%
							String temporal=request.getParameter("cboOrigen");
                            String[]  origen={"Federal","Estatal","Rendimientos" };
							for(int i=0;i<origen.length;i++)
	   							{		 	
							    if(request.getParameter("cboOrigen")!=null&&!temporal.equals("Selecciona el Origen")&&temporal.equals(origen[i]))
							           out.println("<option selected>"+request.getParameter("cboOrigen"));
						   		else	  
						   		      out.println("<option>"+origen[i]);
								}  
							%>
                        </option>
                      </select></td>
                  </tr>
                  <tr> 
                    <td colspan="2"></td>
                  </tr>
                  <tr> 
                    <td colspan="2"></td>
                  </tr>
                  <tr> 
                    <td height="21" align="right" class="texto">Eje: </td>
                    <td  class="textoCbo"><select name="cboEje" id="cboEje" onChange="Mostrar()"; style="HEIGHT: 22px; WIDTH: 330px;">
                        <option>Selecciona un Eje 
                        <%
							
							if(request.getParameter("cboEjercicio")!=null   &&   !(request.getParameter("cboEjercicio").trim()).equals("Selecciona un Ejercicio"))
                		               {
									   if(request.getParameter("cboEje")!=null   &&   !(request.getParameter("cboEje").trim()).equals("Selecciona un Eje"))
										    out.print(BD.DataCombos(14,(String)session.getAttribute( "NumFid" )+","+request.getParameter("cboEjercicio"),request.getParameter("cboEje")));
										else
											 out.print(BD.DataCombos(14,(String)session.getAttribute( "NumFid" )+","+request.getParameter("cboEjercicio"),""));
                        				}
							%>
                        </option>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Programa:</td>
                    <td  class="texto"><select name="cboPrograma" id="cboPrograma" onChange="Mostrar()"; style="HEIGHT: 22px; WIDTH: 330px;">
                        <option>Selecciona un Programa 
                        <%
							
							if(request.getParameter("cboEje")!=null   &&   !(request.getParameter("cboEje").trim()).equals("Selecciona un Eje"))
                		               {
									  
									   String Ejercicio=request.getParameter("cboEjercicio");
									   String Eje=request.getParameter("cboEje")+"  -";
									   	Eje=Eje.substring(0,Eje.indexOf('-'));
									
									   if(request.getParameter("cboPrograma")!=null   &&   !(request.getParameter("cboPrograma").trim()).equals("Selecciona un Programa"))
										 out.print(BD.DataCombos(15,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje,request.getParameter("cboPrograma")));
										else
										 out.print(BD.DataCombos(15,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje,""));
                        				}
							%>
                        </option>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Proyecto:</td>
                    <td  class="texto"><select name="cboProyecto" id="cboProyecto" onChange="Mostrar()"; style="HEIGHT: 22px; WIDTH: 330px;">
                        <option>Selecciona un Proyecto 
                        <%
							
							if(request.getParameter("cboPrograma")!=null   &&   !(request.getParameter("cboPrograma").trim()).equals("Selecciona un Programa"))
                		               {
									  
									   String Ejercicio=request.getParameter("cboEjercicio");
									   String Eje=request.getParameter("cboEje")+"  -";
									   Eje=Eje.substring(0,Eje.indexOf('-'));
									   String Programa=request.getParameter("cboPrograma")+"  -";
									   	Programa=Programa.substring(0,Programa.indexOf('-'));
									
									   if(request.getParameter("cboProyecto")!=null   &&   !(request.getParameter("cboProyecto").trim()).equals("Selecciona un Proyecto"))
										 out.print(BD.DataCombos(16,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje+"-"+Programa,request.getParameter("cboProyecto")));
										else
										 out.print(BD.DataCombos(16,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje+"-"+Programa,""));
                        				}
							%>
                        </option>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Acci&oacute;n:</td>
                    <td  class="texto"><select name="cboAccion" id="cboAccion" style="HEIGHT: 22px; WIDTH: 330px;" onChange="Mostrar()">
                        <option value="Selecciona una Accion">Selecciona una Acci&oacute;n 
                        <%
							
							if(request.getParameter("cboProyecto")!=null   &&   !(request.getParameter("cboProyecto").trim()).equals("Selecciona un Proyecto"))
                		               {
									    String Ejercicio=request.getParameter("cboEjercicio");
									    String Eje=request.getParameter("cboEje")+"  -";
									    Eje=Eje.substring(0,Eje.indexOf('-'));
									    String Programa=request.getParameter("cboPrograma")+"  -";
									   	Programa=Programa.substring(0,Programa.indexOf('-'));
										String Proyecto=request.getParameter("cboProyecto")+"  -";
										Proyecto=Proyecto.substring(0,Proyecto.indexOf('-'));
									   if(request.getParameter("cboAccion")!=null   &&   !(request.getParameter("cboAccion").trim()).equals("Selecciona una Accion"))
										 out.print(BD.DataCombos(17,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje+"-"+Programa+"_"+Proyecto,request.getParameter("cboAccion")));
										else
										 out.print(BD.DataCombos(17,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje+"-"+Programa+"_"+Proyecto,""));
                        				}
							%>
                        </option>
                      </select></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr class="texto"> 
                    <td align="right">Abrir con excel:</td>
                    <td><input type="checkbox" name="excel" value="1"  <%=request.getParameter("excel")!=null &&request.getParameter("excel").trim().equals("1") ?"checked":""%> onclick="habilitarBoton(this)"></td>
                  </tr>
                  <tr> 
                    <td colspan="2" align="center"> <input type="button" name="Consultar" value="Consultar" class="boton" onClick="javascript:ver('Consultar')">     
                                                    <input type="button" name="Imprimir"  value="Imprimir"  class="boton" onClick="javascript:ver('Imprimir')"></td>       
                  </tr>
                     <input type="HIDDEN" name="accion" value="">
                </table>
              </form></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
<script>
    habilitarBoton(document.EdoCtaFoseg.excel);
</script>
</BODY></HTML>
