<%@ page import="java.text.DecimalFormat, java.text.NumberFormat,java.util.Locale"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ include file="parametrosToken.jsp" %>
<%@ include file="Sesion.jsp" %>

<%@ page import="mx.com.inscitech.clients.daos.FValuacionFondoDao"%>
<%@ page import="mx.com.inscitech.clients.beans.FValuacionFondoBean"%>

<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<script language="JavaScript" SRC='scripts/general.js'></script>

<% 
  try {
            FValuacionFondoDao fvfd = new FValuacionFondoDao();
            FValuacionFondoBean fvfb= new FValuacionFondoBean();
            
            String keys = request.getParameter("variableConPks")==null?request.getParameter("hiddenvariableConPks")==null?"0-0":request.getParameter("hiddenvariableConPks"): request.getParameter("variableConPks");
            String key[]=keys.split("-");
            //CARGAMOS EL BEAN CON LA INFORMACION ACTUAL
            fvfb=fvfd.consultar(Integer.parseInt(key[0]),key[1],key[2],Integer.parseInt(key[3]),Integer.parseInt(key[4]));
            
            
%>
             <script language="JavaScript" type="text/JavaScript">
                    function regresar(){
                        document.formValuacionFondosConsultar.action = "FI_ValuacionFondos.jsp";
                        document.formValuacionFondosConsultar.submit();
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
    <HEAD>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')" >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366">&nbsp;</TD>
      <TD vAlign="top" background="imagenes/msur01.png"
          > <DIV align="right"><FONT color="#FFFFFF"
            size=-7 
            face="Arial, Helvetica, sans-serif"> 01 800 623 4672 &nbsp;&nbsp;</FONT>&nbsp;&nbsp;<A 
            href="mailto:info@nafin.com"><FONT color="#FFFFFF"size=-7 
            face="Arial, Helvetica, sans-serif">info@nafin.com&nbsp;&nbsp;&nbsp;</FONT></A>
        </DIV></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
    <TR > 
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"></TD>
      <TD background="imagenes/fondoMenu.gif">
      <a href="FI_Administracion.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Administracion','','imagenes/administracion2.gif',1)"><img src="imagenes/administracion1.gif" name="Administracion" border="0"></a>      
        <a href="FI_Operacion.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Operacion','','imagenes/Operacion2.gif',1)"><img src="imagenes/Operacion1.gif" name="Operacion" border="0"></a>      
        <a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir"  border="0"></a>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540"  width="176"> 
        <%@ include file="menuInstrucciones.jsp" %><!--menuAdministracion.jsp-->
      </TD>
      <TD valign="top" align="center"> 
	  <table width="100%" border="0">
        </table>
        <table width="593" border="0">
          <tr> 
            <td class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo" >Consulta de Valuacion de Fondos</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
		  </table >
</HEAD> 
    <form name="formValuacionFondosConsultar" method="post">
      <table align="center" id="datos" border="0" width="100%" cellspacing="2" cellpadding="4">
          <tr>
              <td width="5%">&nbsp;</td>
              <td width="90%">
                  <table align="center" width="100%" class="texto cellspacing="2" cellpadding="4"">
                      <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">Fideicomiso</td>
                        <td width="15%" align="left">
                          <input type="text" name="txt" value="<%=fvfb.getfhccIdFideicomiso() %>" maxlength="10" size="10" disabled="disabled"/>
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">
                            <input type="hidden" name="hiddenvariableConPks"  value="<%= keys%>" />
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right" colspan="5">
                            <hr>
                        </td>
                        
                    </tr>
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">Id. Credrito</td>
                        <td width="15%" align="left">
                          <input type="text" name="txt" value="<%= fvfb.getfhccIdCredito() %>" maxlength="10" size="10" disabled="disabled"/>
                        </td>
                        <td width="15%" align="right">&nbsp;
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">&nbsp;
                        </td>
                    </tr>
                    
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">Fecha de Valuacion</td>
                        <td width="15%" align="left">
                            <input  type="hidden" maxlength="10" name="txtFechaI" style=" WIDTH:70px"   value="<%=(request.getParameter("txtFechaI")!=null)?request.getParameter("txtFechaI"):"01"+fecha.substring(2,10)%>">
                             <input type="hidden" name="txtfcreFecApertura" maxlength=10 value="<%=fvfb.getfhccIdCredito()%>">
                             <input type="text" id="cboCalendarioF" name="cboCalendarioF" maxlength=10 value="<%= fvfb.getfhccIdFecValuacion () %>" disabled="disabled"/>
                           <!-- <input type="button" id="lanzaCalendarioF" name="lanzaCalendarioF"  style=" WIDTH: 15px"   class="botonCbo" disabled="disabled" value="v"/>
                            <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendarioF",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioF"   // el id del bot�n que lanzar� el calendario
																						});					
                            </SCRIPT>-->
                        </td>
                        <td width="15%" align="right">&nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">Id. Cto. de Inversi&oacute;n</td>
                        <td width="15%" align="left">
                          <input type="text" name="txt" value="<%= fvfb.getfhccIdCtoInver()%>" maxlength="10" size="10" disabled="disabled"/>
                        </td>
                        <td width="15%" align="right">Secuencial</td>
                        <td width="15%" align="right">
                          <input type="text" name="txt" value="<%= fvfb.getfhccIdSecuencial() %>" maxlength="10" size="10" disabled="disabled"/>
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">Comentario</td>
                        <td width="15%" align="left" colspan="3">
                          <textarea name="txtfcreFormulaCal" style="width:500px;height:100px" disabled="disabled">
                          
                            <%= fvfb.getfhccTxComentario ()%>
                          
                          </textarea>
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                    </tr>
                    
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">Saldo Inicio</td>
                        <td width="15%" align="left">
                          <input type="text" name="txt" value="<%= fvfb.getfhccSaldoInicio() %>" maxlength="10" size="10" disabled="disabled"/>
                        </td>
                        <td width="15%" align="right">&nbsp;
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">&nbsp;
                        </td>
                    </tr>
                    
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">Saldo Final</td>
                        <td width="15%" align="left">
                          <input type="text" name="txt" value="<%= fvfb.getfhccSaldoFinal () %>" maxlength="10" size="10" disabled="disabled"/>
                        </td>
                        <td width="15%" align="right">
                          &nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">Moneda</td>
                        <td width="15%" align="left">
                          <input type="text" name="txt" value="<%= fvfb.getfhccMoneda () %>" maxlength="10" size="10" disabled="disabled"/>
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">Tipo Cambio</td>
                        <td width="15%" align="left">
                          <input type="text" name="txt" value="<%= fvfb.getfhccTipoCambio () %>" maxlength="10" size="10" disabled="disabled"/>
                        </td>
                        <td width="15%" align="right">&nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">Folio</td>
                        <td width="15%" align="left">
                          <input type="text" name="txt" value="<%= fvfb.getfhccFolioMovto () %>" maxlength="10" size="10" disabled="disabled" />
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">Proporci&oacute;n
                        </td>
                        <td width="15%" align="left">
                          <input type="text" name="txt" value="<%= fvfb.getfhccStPropor () %>" maxlength="10" size="10" disabled="disabled"/>
                        </td>
                        <td width="15%" align="right">&nbsp;
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">&nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">
                          &nbsp;
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="right">&nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">&nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                    </tr>
                </table>
              </td>
              <td width="5%">&nbsp;</td>
          </tr>
          <tr>
              <td width="5%">&nbsp;</td>
              <td width="90%">
                  <table align="center">
                    <tr>
                      <td class="texto" align="right">
                        <DIV align="center">
                          <input type="button" name="cmdRegresar" class="boton" value="Regresar" onClick="javascript:regresar();" />
                        </DIV>
                      </td>
                    </tr>
                 </table>
              </td>
              <td width="5%">&nbsp;</td>
          </tr>
      </table>
</form>
<%
  } catch (Exception e) {
  e.printStackTrace();
  }
%>