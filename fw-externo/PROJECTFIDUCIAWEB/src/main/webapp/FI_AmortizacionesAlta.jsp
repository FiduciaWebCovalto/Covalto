<%@ page import="java.text.DecimalFormat, java.text.NumberFormat,java.util.Locale"%>
<jsp:useBean id="BD" class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ include file="parametrosToken.jsp"%>
<%@ include file="Sesion.jsp"%>
<%@ page import="mx.com.inscitech.clients.daos.FAmortizacionDao"%>
<%@ page import="mx.com.inscitech.clients.beans.FAmortizacionBean"%>
<link rel="stylesheet" href="styles/calendario.css" type="text/css"/>
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<script language="JavaScript" SRC='scripts/general.js'></script>
<%  
  try {
            FAmortizacionDao dao = new FAmortizacionDao();
            FAmortizacionBean bean= new FAmortizacionBean();
            String botonAlta=request.getParameter("botonAlta");
            
            String keys = request.getParameter("variableConPks2")==null?request.getParameter("hiddenvariableConPks")==null?"0-0":request.getParameter("hiddenvariableConPks"): request.getParameter("variableConPks2");
            String key[]=keys.split("-");
            
            

            String valfccrIdFideicomiso = request.getParameter("hiddentxtfccrIdFideicomiso")==null?"": request.getParameter("hiddentxtfccrIdFideicomiso");
            if(valfccrIdFideicomiso.length()==0)
              valfccrIdFideicomiso=key[0];            
            String valfccrIdCredito = request.getParameter("hiddentxtfccrIdCredito")==null?"": request.getParameter("hiddentxtfccrIdCredito");
            if(valfccrIdCredito.length()==0)
              valfccrIdCredito=key[1];            

            String valfccrIdPago = request.getParameter("txtfccrIdPago")==null?"": request.getParameter("txtfccrIdPago");
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
                    var numb = '0123456789';
                    var lwr = 'abcdefghijklmnopqrstuvwxyz ';
                    var upr = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ ';
                  
                  function Alta(){
                      /* if(campoObligatorio(document.formCreditosAlta.txtfccrIdFideicomiso," Fideicomiso ","Num")&&
                          campoObligatorio(document.formCreditosAlta.txtfccrIdCredito," Credito ","Num")&&
                          campoObligatorio(document.formCreditosAlta.txtfccrIdPago," Pago ","Num")&&
                          isNum(document.formCreditosAlta.txtfccrImpCapital,"El importe de Pago es numerico")&&
                          isNum(document.formCreditosAlta.txtfccrImpIntereses,"El importe de Intereses es numerico")&&
                          isNum(document.formCreditosAlta.txtfccrTipoCambio,"El Tipo de Cambio es numerico")
                       )*/
                                  document.formCreditosAlta.action="FI_AmortizacionesAlta.jsp?botonAlta=Alta";
                                  document.formCreditosAlta.submit();
                  }
                  
                  function cancelar(){
                      document.formCreditosAlta.action="FI_Amortizaciones.jsp";
                      document.formCreditosAlta.submit();
                  }
                  
                  function campoObligatorio(parm,nombreCampo,opcion){
                      var val;
                      if (parm.value.length == 0||parm == ""){ 
                          alert("El campo"+nombreCampo+" es obligatorio"); 
                          return false;
                      }
                      else{
                          if(opcion=="Num")
                              valr=isNum(parm,"El campo "+nombreCampo+" debe ser numerico")
                          else if(opcion=="Alpha"){
                              valr=isAlpha(parm,"El campo "+nombreCampo+" debe ser Texto")
                          }
                          if(valr) return true;
                          else return false;
                      } 
                  }
 
                function isValid(parm, val) {
                  //alert("parm.name = "+parm.name+" parm.value.length = "+parm.value.length+" parm.value = "+parm.value;
                  //alert(val)
                    if (parm.value.length == 0) return false;
                    if (parm == "") {return false;}
                    for (i=0; i<parm.value.length; i++) {
                      if (val.indexOf(parm.value.charAt(i), 0) == -1) { return false;}
                    }
                    return true;
                }
 
                function isNum(field, alerttxt) {
                    //alert(isValid(field, lwr+upr));
                    if (isValid(field, numb)) {return true;}
                    else { alert(alerttxt); field.focus(); return false; }   
                }

                function isLower(parm) {return isValid(parm, lwr);}
                function isUpper(parm) {return isValid(parm, upr);}

                function isAlpha(field, alerttxt) 
                  {
                    //alert(isValid(field, lwr+upr));
                    if (isValid(field, lwr+upr)) {return true;}
                    else { alert(alerttxt);field.focus();return false; } 
                  }
  
                  function isAlphanum(parm) {return isValid(parm,lwr+upr+numb);}
                  
                  function validaRadios(field, alertTxt){
                      alert(field);
                      if(field==null){
                        alert(alertTxt)
                        return false
                      }
                      else
                        return true
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
              <link rel="stylesheet" href="styles/bancomext.css" type="text/css"/>
            </HEAD>
            <BODY vLink="#052206" leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')">
              <TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
                <TBODY>
                  <TR>
                    <TD width="176" bgcolor="#003366">
                      <IMG src="imagenes/logo.gif" alt="Nacional Financiera" border="0" width="176"/>
                    </TD>
                    <TD vAlign="top" background="imagenes/msur01.png">
                      <DIV align="right">
                        <FONT color="#FFFFFF" size="-7" face="Arial, Helvetica, sans-serif">01 800 623 4672 &nbsp;&nbsp;</FONT>&nbsp;&nbsp;
                        <A href="mailto:info@nafin.com"><FONT color="#FFFFFF" size="-7" face="Arial, Helvetica, sans-serif">info@nafin.com&nbsp;&nbsp;&nbsp;</FONT></A> 
                      </DIV>
                    </TD>
                  </TR>
                  <TR>
                    <TD colspan="2" align="center" height="1"/>
                  </TR>
                  <TR>
                    <TD background="imagenes/fondoMenu.gif" align="center" class="date"/>
                    <TD background="imagenes/fondoMenu.gif">
                      <a href="FI_Administracion.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Administracion','','imagenes/administracion2.gif',1)">
                        <img src="imagenes/administracion1.gif" name="Administracion" border="0"/>
                      </a>
                      <a href="FI_Operacion.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Operacion','','imagenes/Operacion2.gif',1)">
                        <img src="imagenes/Operacion1.gif" name="Operacion" border="0"/>
                      </a>
                      <a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir','','imagenes/salir2.gif',1)">
                        <img src="imagenes/salir1.gif" name="Salir" border="0"/>
                      </a>
                    </TD>
                  </TR>
                  <TR>
                    <TD colspan="2" align="center" height="2"/>
                  </TR>
                  <TR>
                    <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540" width="176">
                      <%@ include file="menuInstrucciones.jsp"%>
                      <!--menuAdministracion.jsp-->
                    </TD>
                    <TD valign="top" align="center">
                      <table width="100%" border="0"/>
                      <table width="593" border="0">
                        <tr>
                          <td class="texto">&nbsp;</td>
                        </tr>
                        <tr>
                          <td height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Alta Tabla Amortizacion</td>
                        </tr>
                        <tr>
                          <td>&nbsp;</td>
                        </tr>
                      </table>
                      <form name="formCreditosAlta" method="post">
                        <% 
        
          if((botonAlta!=null)&&(botonAlta.equals("Alta"))){
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
              String llaves[] = {valfccrIdFideicomiso,valfccrIdCredito,valfccrIdPago};
              if(dao.valoraLLavePrimaria(1,llaves)==0) {
                  if(dao.insertar(bean)>0){
                      out.print("<div class=\"texto\"><font color=\"#006600\"><b>Registro insertado correctamente</b></font></div>");
                  } else {
                      out.print("<div class=\"texto\"><font color=\"#006600\"><b>Error al tratar de insertar el registro</b></font></div>");
                  }
              }
              else if(dao.valoraLLavePrimaria(1,llaves)==-1){
                  out.print("<div class=\"texto\"><font color=\"#006600\"><b>Error al tratar de verificar la llave</b></font></div>");
              }
              else 
                  out.print("<div class=\"texto\"><font color=\"#006600\"><b>Ya existe un registro con este identificador</b></font></div>");
          }   
      %>
                        <table align="center" id="datos" border="0" width="100%" cellspacing="2" cellpadding="4">
                          <tr>
                            <td width="5%">&nbsp;</td>
                            <td width="90%">
                              <table align="center" width="100%" class="texto cellspacing=" 2 cellpadding="4">
                                <tr>
                                  <td width="15%" align="right">Fideicomiso</td>
                                  <td width="15%" align="left">
                                    <input type="text" name="txtfccrIdFideicomiso" value="<%= key[0]==null?valfccrIdFideicomiso:key[0]%>" maxlength="10" size="10" disabled="disabled"/>
                                    <input type="hidden" name="hiddentxtfccrIdFideicomiso" value="<%= valfccrIdFideicomiso%>" maxlength="10" size="10"/>
                                  </td>
                                  <td width="15%" align="left" colspan="2">&nbsp;</td>
                                  <td width="15%" align="right">&nbsp;</td>
                                  <td width="15%" align="left">&nbsp;</td>
                                </tr>
                                <tr>
                                  <td width="15%" align="center">&nbsp;</td>
                                  <td width="15%" align="left" colspan="5">
                                    <hr/>
                                  </td>
                                </tr>
                                <tr>
                                  <td width="15%" align="right">Credito</td>
                                  <td width="15%" align="left">
                                    <!--&lt;input type=&quot;text&quot; name=&quot;txtfccrIdCredito&quot; value=&quot;&lt;%= key[1]==null?valfccrIdCredito:key[1]%&gt;&quot; maxlength=&quot;10&quot; size=&quot;10&quot;/&gt;-->
                                    <input type="text" name="txtfccrIdCredito" value="<%= key[1]==null?valfccrIdCredito:key[1]%>" maxlength="10" size="10" disabled="disabled"/>
                                    <input type="hidden" name="hiddentxtfccrIdCredito" value="<%=valfccrIdCredito%>" maxlength="10" size="10"/>
                                  </td>
                                  <td width="15%" align="right">Pago</td>
                                  <td width="15%" align="left">
                                    <input type="text" name="txtfccrIdPago" value="<%=valfccrIdPago%>" maxlength="10" size="10"/>
                                  </td>
                                  <td width="15%" align="right">&nbsp;</td>
                                  <td width="15%" align="left">&nbsp;</td>
                                </tr>
                                <tr>
                                  <td width="15%" align="right">Importe Pago</td>
                                  <!--Importe Pago-->
                                  <td width="15%" align="left">
                                    <input type="text" name="txtfccrImpCapital" value="<%=dao.formatear(valfccrImpCapital)%>" maxlength="10" size="10"/>
                                    <!--&lt;input type=&quot;text&quot; name=&quot;txtfccrImpPago&quot; value=&quot;&quot; maxlength=&quot;10&quot; size=&quot;10&quot;/&gt;-->
                                  </td>
                                  <td width="15%" align="right">Importe Intereses</td>
                                  <td width="15%" align="left">
                                    <input type="text" name="txtfccrImpIntereses" value="<%=dao.formatear(valfccrImpIntereses)%>" maxlength="10" size="10"/>
                                  </td>
                                  <td width="15%" align="right">&nbsp;</td>
                                  <td width="15%" align="left">&nbsp;</td>
                                </tr>
                                <tr>
                                  <td width="15%" align="right">Moneda</td>
                                  <td width="15%" align="left">
                                    <span class="texto">
                                      <select name="cbofccrMoneda" style=" WIDTH: 150px">&gt; 
                                        <option -1>seleccione una opcion</option>
                                        <%=  BD.DataCombo2(dao.cargaCombos(1000),valfccrMoneda,true)%>
                                      </select>
                                    </span>
                                  </td>
                                  <td width="15%" align="right">Tipo Cambio</td>
                                  <td width="15%" align="left">
                                    <input type="text" name="txtfccrTipoCambio" value="<%=valfccrTipoCambio%>" maxlength="10" size="10"/>
                                  </td>
                                  <td width="15%" align="right">&nbsp;</td>
                                  <td width="15%" align="left">
                                    <!--&lt;input type=&quot;text&quot; name=&quot;txtfccrTasa&quot; value=&quot;&quot; maxlength=&quot;10&quot; size=&quot;10&quot;/&gt;--></td>
                                </tr>
                                <tr>
                                  <td width="15%" align="right">fecha Pago</td>
                                  <td width="15%" align="left">
                                    <input type="text" id="fecfccrFechaPago" name="fecfccrFechaPago" maxlength="10" value="<%=valfccrFechaPago%>"/>
                                    <input type="button" id="lanzaCalendarioF4" name="lanzaCalendarioF4" style=" WIDTH: 15px" class="botonCbo" value="v"/>
                                    <SCRIPT type="text/javascript">
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "fecfccrFechaPago",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioF4"   // el id del botón que lanzará el calendario
																						});					
                                  </SCRIPT>
                                  </td>
                                  <td width="15%" align="right">Fecha Pagado</td>
                                  <td width="15%" align="left">
                                    <!--&lt;input type=&quot;text&quot; name=&quot;txtfccrImpMoneda&quot; value=&quot;&quot; maxlength=&quot;10&quot; size=&quot;10&quot;/&gt;-->
                                    <input type="text" id="fecfccrFecPagado" name="fecfccrFecPagado" maxlength="10" value="<%=valfccrFecPagado%>" disabled="disabled"/>
                                    <input type="hidden" id="hiddenfecfccrFecPagado" name="hiddenfecfccrFecPagado" maxlength="10" value="<%=valfccrFecPagado%>"/>
                                  </td>
                                  <td width="15%" align="right">&nbsp;</td>
                                  <td width="15%" align="left">&nbsp;</td>
                                </tr>
                                <tr>
                                  <td width="15%" align="right">Comentario</td>
                                  <td width="15%" align="left" colspan="5">
                                    <input type="text" name="txtfccrTexComentario" value="<%=valfccrTexComentario%>" maxlength="80" size="80"/>
                                  </td>
                                </tr>
                                <tr>
                                  <td width="15%" align="right">Estatus</td>
                                  <td width="15%" align="left">
                                    <span class="texto">
                                      <select name="cbofccrStPago" style=" WIDTH: 150px">&gt; 
                                        <option -1>seleccione una opcion</option>
                                        <%=  BD.DataCombo2(dao.cargaCombos(31),valfccrStPago,false)%>
                                      </select>
                                    </span>
                                  </td>
                                  <td width="15%" align="right">&nbsp;</td>
                                  <td width="15%" align="left">&nbsp;</td>
                                  <td width="15%" align="right">&nbsp;</td>
                                  <td width="15%" align="left">&nbsp;</td>
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
                                      <input type="button" name="botonAlta" class="boton" value="Aceptar" onClick="javascript:Alta();"/>
                                      <input type="button" name="CancelarAlta" class="boton" value="Cancelar" onClick="javascript:cancelar();"/>
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
