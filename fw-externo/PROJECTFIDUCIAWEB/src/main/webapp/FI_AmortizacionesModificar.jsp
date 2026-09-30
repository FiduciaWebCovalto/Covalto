<%@ page import="java.text.DecimalFormat, java.text.NumberFormat,java.util.Locale"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ include file="parametrosToken.jsp" %>
<%@ include file="Sesion.jsp" %>

<%@ page import="mx.com.inscitech.clients.daos.FAmortizacionDao"%>
<%@ page import="mx.com.inscitech.clients.beans.FAmortizacionBean"%>

<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<script language="JavaScript" SRC='scripts/general.js'></script>

<% 
  try {
            FAmortizacionDao dao = new FAmortizacionDao();
            FAmortizacionBean bean= new FAmortizacionBean();
            String botonModificar=request.getParameter("botonModificar");
            
            String keys = request.getParameter("variableConPks2")==null?request.getParameter("hiddenvariableConPks")==null?"0-0":request.getParameter("hiddenvariableConPks"): request.getParameter("variableConPks2");
            String key[]=keys.split("-");
            
            //CARGAMOS EL BEAN CON LA INFORMACION ACTUAL
              bean=dao.consultar(Integer.parseInt(key[0]),Integer.parseInt(key[1]),key[2]);


            String valfccrIdFideicomiso = request.getParameter("hiddentxtfccrIdFideicomiso")==null?"": request.getParameter("hiddentxtfccrIdFideicomiso");
            String valfccrIdCredito = request.getParameter("hiddentxtfccrIdCredito")==null?"": request.getParameter("hiddentxtfccrIdCredito");
            String valfccrIdPago = request.getParameter("hiddentxtfccrIdPago")==null?"": request.getParameter("hiddentxtfccrIdPago");
            String valfccrFechaPago = request.getParameter("fecfccrFechaPago")!=null?request.getParameter("fecfccrFechaPago"):fecha ;
            //String valfccrImpPago = request.getParameter("txtfccrImpPago")==null?"": request.getParameter("txtfccrImpPago");
            String valfccrImpCapital = request.getParameter("txtfccrImpCapital")==null?"": request.getParameter("txtfccrImpCapital");
            String valfccrImpIntereses = request.getParameter("txtfccrImpIntereses")==null?"": request.getParameter("txtfccrImpIntereses");
            String valfccrFecPagado = request.getParameter("hiddenfecfccrFecPagado")!=null?request.getParameter("hiddenfecfccrFecPagado"):fecha;
            String valfccrTasa = request.getParameter("txtfccrTasa")==null?"": request.getParameter("txtfccrTasa");
            String valfccrMoneda = request.getParameter("cbofccrMoneda")==null?"": request.getParameter("cbofccrMoneda");
            String valfccrImpMoneda = request.getParameter("txtfccrImpMoneda")!=null?request.getParameter("txtfccrImpMoneda"):"0.0";
            String valfccrTipoCambio = request.getParameter("txtfccrTipoCambio")==null?"": request.getParameter("txtfccrTipoCambio");
            String valfccrTexComentario = request.getParameter("txtfccrTexComentario")==null?"": request.getParameter("txtfccrTexComentario");
            String valfccrStPago = request.getParameter("txtfccrStPago ")==null?"": request.getParameter("txtfccrStPago");
            //variables auxiliares///////////////////////////////////////
            String valfccrImpPago=String.valueOf(dao.desformatear(valfccrImpCapital)+dao.desformatear(valfccrImpIntereses));
  
%>
             <script language="JavaScript" type="text/JavaScript">
                    
                  function modificar(){
                    document.formModificar.action="FI_AmortizacionesModificar.jsp?botonModificar=Modificar";
                      document.formModificar.submit();
                  }
              
                  
                  function cancelar(){
                      document.formModificar.action="FI_Amortizaciones.jsp";
                      document.formModificar.submit();
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
      <TD width="176" bgcolor="#003366"><IMG 
            src="imagenes/logo.gif" 
            alt="Nacional Financiera"   border="0"  width="176"></TD>
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo" >Modificar Tabla Amortizacion</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
		  </table >
</HEAD> 
    <form name="formModificar" method="post">
      <%
        
          if((botonModificar!=null)&&(botonModificar.equals("Modificar"))){
              String idMoneda[]= null;
              bean.setfccrIdFideicomiso(Integer.parseInt(valfccrIdFideicomiso.equals("")?"0":valfccrIdFideicomiso));
              bean.setfccrIdCredito(Integer.parseInt(valfccrIdCredito.equals("")?"0":valfccrIdCredito));
              bean.setfccrIdPago(valfccrIdPago);
              bean.setfccrFechaPago(valfccrFechaPago);
              bean.setfccrImpPago(Double.parseDouble(valfccrImpPago.equals("")?"0.0":valfccrImpPago));
              bean.setfccrImpCapital(dao.desformatear(valfccrImpCapital));
              bean.setfccrImpIntereses(dao.desformatear(valfccrImpIntereses));
              bean.setfccrFecPagado(valfccrFecPagado);
              bean.setfccrTasa(Double.parseDouble(valfccrTasa.equals("")?"0.0":valfccrTasa));
              /*if(!valfccrMoneda.equals(""))
                      idMoneda=valfccrMoneda.split("-");
                    else
                      idMoneda[0]="0";
              bean.setfccrMoneda(Integer.parseInt(idMoneda[0]));*/
              bean.setfccrMoneda(Integer.parseInt(dao.fixValCombo(valfccrMoneda,"0")));
              bean.setfccrImpMoneda(Double.parseDouble(valfccrImpMoneda.equals("")?"0.0":valfccrImpMoneda));
              bean.setfccrTipoCambio(Double.parseDouble(valfccrTipoCambio.equals("")?"0.0":valfccrTipoCambio));
              bean.setfccrTexComentario(valfccrTexComentario);
              bean.setfccrStPago((dao.fixValCombo(valfccrStPago,"")));
              if(dao.modificar(bean)>0){
                  out.print("<div class=\"texto\"><font color=\"#006600\"><b>Registro modificado correctamente</b></font></div>");
              } else {
                  out.print("<div class=\"texto\"><font color=\"#006600\"><b>Error al tratar de modificar el registro</b></font></div>");
              }
              
          }
      %>
      <table align="center" id="datos" border="0" width="100%" cellspacing="2" cellpadding="4">
          <tr>
              <td width="5%">&nbsp;</td>
              <td width="90%">
                  <table align="center" width="100%" class="texto cellspacing="2" cellpadding="4"">
                      <tr>
                        <td width="15%" align="right">Fideicomiso</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfccrIdFideicomiso" value="<%= bean.getfccrIdFideicomiso()%>" maxlength="10" size="10"/>
                          <input type="hidden" name="hiddentxtfccrIdFideicomiso" value="<%= bean.getfccrIdFideicomiso()%>" maxlength="10" size="10"/>
                        </td>
                        <td width="15%" align="left" colspan="2">
                            <input type="hidden" name="hiddenvariableConPks"  value="<%= keys%>" />
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="center">&nbsp;</td>
                        <td width="15%" align="left" colspan="5">
                            <hr>
                        </td>
                        
                    </tr>
                    <tr>
                        <td width="15%" align="right">Credito</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfccrIdCredito" value="<%=  bean.getfccrIdCredito()%>" maxlength="10" size="10"/>
                          <input type="hidden" name="hiddentxtfccrIdCredito" value="<%=  bean.getfccrIdCredito()%>" maxlength="10" size="10"/>            
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfccrIdPago" value="<%= bean.getfccrIdPago()%>" maxlength="10" size="10"/>
                          <input type="hidden" name="hiddentxtfccrIdPago" value="<%= bean.getfccrIdPago()%>" maxlength="10" size="10"/>                        
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">&nbsp;
                        </td>
                    </tr>
                    
                    <tr>
                        <td width="15%" align="right">Importe Pago</td><!--Importe Pago-->
                        <td width="15%" align="left">
                          <input type="text" name="txtfccrImpCapital" value="<%=dao.formatear(String.valueOf(bean.getfccrImpCapital()))%>" maxlength="10" size="10"/>
                          <!--<input type="text" name="txtfccrImpPago" value="" maxlength="10" size="10"/>-->
                        </td>
                        <td width="15%" align="right">Importe Intereses</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfccrImpIntereses" value="<%=dao.formatear(String.valueOf(bean.getfccrImpIntereses()))%>" maxlength="10" size="10"/>
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">&nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">Moneda</td>
                        <td width="15%" align="left">
                          <span class="texto">
                            <select name="cbofccrMoneda" style=" WIDTH: 150px">&gt; 
                              <option -1>seleccione una opcion</option>
                              <%= BD.DataCombo2(dao.cargaCombos(1000),String.valueOf(bean.getfccrMoneda()),true)%>
                              
                            </select>
                          </span>
                            
                        </td>
                        <td width="15%" align="right">Tipo Cambio</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfccrTipoCambio" value="<%=bean.getfccrTipoCambio()%>" maxlength="10" size="10"/>
                            
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">
                          <!--<input type="text" name="txtfccrTasa" value="" maxlength="10" size="10"/>-->
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">fecha Pago</td>
                        <td width="15%" align="left">
                            <input type="text" id="fecfccrFechaPago" name="fecfccrFechaPago" maxlength=10 value="<%=bean.getfccrFechaPago ()%>">
                            <input type="button" id="lanzaCalendarioF4" name="lanzaCalendarioF4"  style=" WIDTH: 15px"   class="botonCbo" value="v">
                            <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "fecfccrFechaPago",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioF4"   // el id del bot�n que lanzar� el calendario
																						});					
                            </SCRIPT>  
                        </td>
                        <td width="15%" align="right">Fecha Pagado</td>
                        <td width="15%" align="left">
                          <!--<input type="text" name="txtfccrImpMoneda" value="" maxlength="10" size="10"/>-->
                          <input type="text" id="fecfccrFecPagado" name="fecfccrFecPagado" maxlength=10 value="<%=bean.getfccrFecPagado()%>" disabled="disabled">
                          <input type="hidden" id="hiddenfecfccrFecPagado" name="hiddenfecfccrFecPagado" maxlength=10 value="<%=bean.getfccrFecPagado()%>">
                            <!--<input type="button" id="lanzaCalendarioF5" name="lanzaCalendarioF5"  style=" WIDTH: 15px"   class="botonCbo" value="v">
                            <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "fecfccrFecPagado",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioF5"   // el id del bot�n que lanzar� el calendario
																						});					
                            </SCRIPT>-->
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">&nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">Comentario</td>
                        <td width="15%" align="left" colspan="5">
                          <input type="text" name="txtfccrTexComentario" value="<%= bean.getfccrTexComentario()%>" maxlength="80" size="80"/>
                        </td>
                        
                    </tr>
                    <tr>
                        <td width="15%" align="right">Estatus</td>
                        <td width="15%" align="left">
                          <span class="texto">
                            <select name="cbofccrStPago" style=" WIDTH: 150px">&gt; 
                              <option -1>seleccione una opcion</option>
                             <%= BD.DataCombo2(dao.cargaCombos(31),bean.getfccrStPago(),false)%>
                            </select>
                          </span>
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
                          <input type="button" name="botonAlta" class="boton" value="Aceptar" onClick="javascript:modificar();"/>
                          <input type="button" name="CancelarAlta" class="boton" value="Cancelar" onClick="javascript:cancelar();" />
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