<%@ page import="java.text.DecimalFormat, java.text.NumberFormat,java.util.Locale"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ include file="parametrosToken.jsp" %>
<%@ include file="Sesion.jsp" %>

<%@ page import="mx.com.inscitech.clients.daos.FCreditosDao"%>
<%@ page import="mx.com.inscitech.clients.beans.FCreditosBean"%>

<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<script language="JavaScript" SRC='scripts/general.js'></script>

<% 
  try {
            FCreditosDao fcd = new FCreditosDao();
            FCreditosBean fcb= new FCreditosBean();
            String botonModificar=request.getParameter("botonModificar");
            String keys = request.getParameter("variableConPks")==null?request.getParameter("hiddenvariableConPks")==null?"0-0":request.getParameter("hiddenvariableConPks"): request.getParameter("variableConPks");
            String key[]=keys.split("-");
            //CARGAMOS EL BEAN CON LA INFORMACION ACTUAL
            fcb=fcd.consultar(Integer.parseInt(key[0]),key[1]);
            
            //INICIALIZAMOS VARIABLES AUXILIARES QUE VAN A SERVRIR PARA LA MODIFICACION           
            String valfcreIdFideicomiso = request.getParameter("HIDDENtxtfcreIdFideicomiso")==null?"": request.getParameter("HIDDENtxtfcreIdFideicomiso");
            String valfcreIdCredito = request.getParameter("HIDDENtxtfcreIdCredito")==null?"": request.getParameter("HIDDENtxtfcreIdCredito");
            String valfcreTipoCredito = request.getParameter("cbofcreTipoCredito")==null?"0": request.getParameter("cbofcreTipoCredito");
            String valfcreImpCredito = request.getParameter("txtfcreImpCredito")==null?"": request.getParameter("txtfcreImpCredito");
            String valfcreTasa = request.getParameter("txtfcreTasa")==null?"": request.getParameter("txtfcreTasa");
            String valfcrePagos = request.getParameter("txtfcrePagos")==null?"": request.getParameter("txtfcrePagos");
            String valfcrePeriodicidad = request.getParameter("cbofcrePeriodicidad")==null?"": request.getParameter("cbofcrePeriodicidad");
            String valfcreImpApertura = request.getParameter("txtfcreImpApertura")==null?"": request.getParameter("txtfcreImpApertura");
            String valfcreImpNeto = request.getParameter("txtfcreImpNeto")==null?"": request.getParameter("txtfcreImpNeto");
            String valfcreImpSaldo = request.getParameter("txtfcreImpSaldo")==null?"": request.getParameter("txtfcreImpSaldo");
            String valfcreFecApertura = request.getParameter("cboCalendarioF")!=null?request.getParameter("cboCalendarioF"):fecha;
            String valfcreFechaPago = request.getParameter("cboCalendarioF2")!=null?request.getParameter("cboCalendarioF2"):fecha;
            //String valfcreFormulaCal = request.getParameter("txtfcreFormulaCal")==null?"": request.getParameter("txtfcreFormulaCal");
            String valfcreMoneda = request.getParameter("cbofcreMoneda")==null?"": request.getParameter("cbofcreMoneda");
            String valfcreImpMoneda = request.getParameter("txtfcreImpMoneda ")==null?"": request.getParameter("txtfcreImpMoneda");
            String valfcreTasaMora = request.getParameter("txtfcreTasaMora")==null?"": request.getParameter("txtfcreTasaMora");
            //String valfcreTexComentario = request.getParameter("txtfcreTexComentario")==null?"": request.getParameter("txtfcreTexComentario");
            String valfcreFecReservaTras = request.getParameter("cboCalendarioF3")!=null?request.getParameter("cboCalendarioF3"):fecha;
            String valfcreImpReservaTras = request.getParameter("txtfcreImpReservaTras")==null?"": request.getParameter("txtfcreImpReservaTras");
            String valfcrePlazoTras = request.getParameter("txtfcrePlazoTras")==null?"": request.getParameter("txtfcrePlazoTras");
            String valfcreFecReservaLim = request.getParameter("cboCalendarioF4")!=null?request.getParameter("cboCalendarioF4"):fecha;
            String valfcrePlazoLim = request.getParameter("txtfcrePlazoLim")==null?"": request.getParameter("txtfcrePlazoLim");
            String valfcreStCredito = request.getParameter("cbofcreStCredito")==null?"": request.getParameter("cbofcreStCredito");
  
            
           
%>
             <script language="JavaScript" type="text/JavaScript">
                     var numb = '0123456789.,$';
                    var lwr = 'abcdefghijklmnopqrstuvwxyz ';
                    var upr = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ ';
                  
                  function cancelar(){
                      document.formCreditosModificar.action="FI_Creditos.jsp";
                      document.formCreditosModificar.submit();
                  }
                  
                  function modificar(){
                       //alert("hola");
                        if(campoObligatorio(document.formCreditosAlta.txtfcreImpCredito," Importe Credito ","Num")&&
                          isNum(document.formCreditosAlta.txtfcrePagos,"Los pagos son un valor numerico")&&
                          campoObligatorioLista(document.formCreditosAlta.cbofcreStCredito," Estatus ")
                       ){
                            document.formCreditosModificar.action="FI_CreditosModificar.jsp?botonModificar=Modificar";
                            document.formCreditosModificar.submit();
                        }
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
                          else{
                              valr=true;
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo" >Modificar Cr&eacute;ditos</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
		  </table >
</HEAD> 
    <form name="formCreditosModificar" method="post">
      <%
        
          if((botonModificar!=null)&&(botonModificar.equals("Modificar"))){
              String idMoneda[]= null;
              fcb.setfcreIdFideicomiso(Integer.parseInt(valfcreIdFideicomiso.equals("")?"0":valfcreIdFideicomiso));
              fcb.setfcreIdCredito(valfcreIdCredito);
              fcb.setfcreTipoCredito(valfcreTipoCredito);
              //fcb.setfcreImpCredito(Double.parseDouble(valfcreImpCredito.equals("")?"0.0":valfcreImpCredito));
              fcb.setfcreImpCredito(fcd.desformatear(valfcreImpCredito));
              fcb.setfcreTasa(Double.parseDouble(valfcreTasa.equals("")?"0.0":valfcreTasa));
              fcb.setfcrePagos(Double.parseDouble(valfcrePagos.equals("")?"0.0":valfcrePagos));
              //fcb.setfcrePeriodicidad(valfcrePeriodicidad);
              fcb.setfcrePeriodicidad(fcd.fixValCombo(valfcrePeriodicidad,""));
              fcb.setfcreImpApertura(Double.parseDouble(valfcreImpApertura.equals("")?"0.0":valfcreImpApertura));
              fcb.setfcreImpNeto(Double.parseDouble(valfcreImpNeto.equals("")?"0.0":valfcreImpNeto));
              fcb.setfcreImpSaldo(Double.parseDouble(valfcreImpSaldo.equals("")?"0.0":valfcreImpSaldo));
              fcb.setfcreFecApertura(valfcreFecApertura);
              fcb.setfcreFechaPago(valfcreFechaPago);
              //fcb.setfcreFormulaCal(valfcreFormulaCal);
                    /*if(!valfcreMoneda.equals(""))
                      idMoneda=valfcreMoneda.split("-");
                    else
                      idMoneda[0]="0";
              fcb.setfcreMoneda(Integer.parseInt(idMoneda[0]));*/
              fcb.setfcreMoneda(Integer.parseInt(fcd.fixValCombo(valfcreMoneda,"0")));
              fcb.setfcreImpMoneda(Double.parseDouble(valfcreImpMoneda.equals("")?"0.0":valfcreImpMoneda));
              fcb.setfcreTasaMora(Double.parseDouble(valfcreTasaMora.equals("")?"0.0":valfcreTasaMora));
              //fcb.setfcreTexComentario(valfcreTexComentario);
              fcb.setfcreFecReservaTras(valfcreFecReservaTras);
              fcb.setfcreImpReservaTras(Double.parseDouble(valfcreImpReservaTras.equals("")?"0.0":valfcreImpReservaTras));
              fcb.setfcrePlazoTras(Integer.parseInt(valfcrePlazoTras.equals("")?"0":valfcrePlazoTras));
              fcb.setfcreFecReservaLim(valfcreFecReservaLim);
              fcb.setfcrePlazoLim(Integer.parseInt(valfcrePlazoLim.equals("")?"0":valfcrePlazoLim));
              //fcb.setfcreStCredito(valfcreStCredito);
              fcb.setfcreStCredito(fcd.fixValCombo(valfcreStCredito,""));
              if(fcd.modificar(fcb)>0){
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
                          <input type="text" name="txtfcreIdFideicomiso" value="<%= fcb.getfcreIdFideicomiso() %>" maxlength="10" size="10" disabled="disabled"/>
                          <input type="hidden" name="HIDDENtxtfcreIdFideicomiso" value="<%= fcb.getfcreIdFideicomiso() %>" maxlength="10" size="10"/>
                        </td>
                        <td width="15%" align="left" colspan="2">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="left">
                            <input type="hidden" name="hiddenvariableConPks"  value="<%= keys%>" />
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="center">&nbsp;</td>
                        <td width="15%" align="left" colspan="5">
                            <hr>
                        </td>
                        
                    </tr>
                    <tr>
                        <td width="15%" align="right">Id. Cr&eacute;dito&nbsp;</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfcreIdCredito" value="<%= fcb.getfcreIdCredito() %>" maxlength="10" size="10" disabled="disabled"/>
                         <input type="hidden" name="HIDDENtxtfcreIdCredito" value="<%= fcb.getfcreIdCredito() %>" maxlength="10" size="10" />
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">
                          <!--<span class="texto">
                            <select name="cbofcreTipoCredito" style=" WIDTH: 150px">&gt; 
                              <option -1>seleccione una opcion</option>
                              <%=BD.DataCombo2(fcd.cargaCombos(172),fcb.getfcreTipoCredito(),false)%>
                            </select>
                          </span>-->
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">&nbsp;
                        </td>
                    </tr>
                    
                    <tr>
                        <td width="15%" align="right">Importe Cr&eacute;dito</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfcreImpCredito" value="<%=  fcd.formatear(String.valueOf(fcb.getfcreImpCredito())) %>" maxlength="20" size="20"/>
                          <!--<input type="text" name="txtfcreTasa" value="<%= fcb.getfcreTasa() %>" maxlength="10" size="10"/>-->
                        </td>
                        <td width="15%" align="right">Moneda</td>
                        <td width="15%" align="left">
                          <span class="texto">
                            <select name="cbofcreMoneda" style=" WIDTH: 150px">&gt; 
                              <option -1>seleccione una opcion</option>
                              <%= BD.DataCombo2(fcd.cargaCombos(1000),String.valueOf(fcb.getfcreMoneda()),true)%>
                            </select>
                          </span>
                          <!--<input type="text" name="txtfcreTasaMora" value="<%= fcb.getfcreTasaMora() %>" maxlength="5" size="5"/>-->
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">Pagos</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfcrePagos" value="<%= fcb.getfcrePagos() %>" maxlength="10" size="10"/>
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
                    <tr>
                        <td width="15%" align="right">Periodicidad</td>
                        <td width="15%" align="left">
                          <span class="texto">
                            <select name="cbofcrePeriodicidad" style=" WIDTH: 150px">&gt; 
                              <option -1> seleccione una opcion </option>
                              <%=BD.DataCombo2(fcd.cargaCombos(52),fcb.getfcrePeriodicidad(),false)%>
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
                    
                   <!-- <tr>
                        <td width="15%" align="right">Importe Apertura</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfcreImpApertura" value="<%= fcb.getfcreImpApertura() %>" maxlength="20" size="20"/>
                        </td>
                        <td width="15%" align="right">Importe Neto</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfcreImpNeto" value="<%= fcb.getfcreImpNeto() %>" maxlength="20" size="20"/>
                        </td>
                        <td width="15%" align="right">Importe Saldo</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfcreImpSaldo" value="<%= fcb.getfcreImpSaldo() %>" maxlength="20" size="20"/>
                        </td>
                    </tr>-->
                    
                    <tr>
                        <td width="15%" align="right">Fecha de Apertura</td>
                        <td width="15%" align="left">
                            	<input  type="hidden" maxlength="10" name="txtFechaI" style=" WIDTH:70px"   value="<%=(request.getParameter("txtFechaI")!=null)?request.getParameter("txtFechaI"):"01"+fecha.substring(2,10)%>">
                             <input type="hidden" name="txtfcreFecApertura" maxlength=10 value="<%=valfcreFecApertura%>">
                             <input type="text" id="cboCalendarioF" name="cboCalendarioF" maxlength=10 value="<%= fcb.getfcreFecApertura() %>">
                            <!--<input type="button" id="cboCalendarioF" name="cboCalendarioF"  style=" WIDTH: 60px" value="<%=valfcreFecApertura%>" >--><!--onChange="fechas();"-->
                            <input type="button" id="lanzaCalendarioF" name="lanzaCalendarioF"  style=" WIDTH: 15px"   class="botonCbo" value="v">
                            <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendarioF",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioF"   // el id del bot�n que lanzar� el calendario
																						});					
                            </SCRIPT>
                        </td>
                        <td width="15%" align="right">Fecha de Pago</td>
                        <td width="15%" align="left">
                          <input  type="hidden" maxlength="10" name="txtFechaI2" style=" WIDTH:70px"   value="<%=(request.getParameter("txtFechaI2")!=null)?request.getParameter("txtFechaI2"):"01"+fecha.substring(2,10)%>">
                             <input type="hidden" name="txtfcreFechaPago" maxlength=10 value="<%=valfcreFechaPago%>">
                            <!--<input type="button" id="cboCalendarioF2" name="cboCalendarioF2"  style=" WIDTH: 60px" value="<%=valfcreFechaPago%>" >--><!--onChange="fechas();"-->
                            <input type="text" id="cboCalendarioF2" name="cboCalendarioF2" maxlength=10 value="<%= fcb.getfcreFechaPago() %>">
                            <input type="button" id="lanzaCalendarioF2" name="lanzaCalendarioF2"  style=" WIDTH: 15px"   class="botonCbo" value="v">
                            <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendarioF2",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioF2"   // el id del bot�n que lanzar� el calendario
																						});					
                            </SCRIPT>
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                    </tr>
                    <!--<tr>
                        <td width="15%" align="right">F&oacute;rmula de Calculo</td>
                        <td width="15%" align="left" colspan="2">
                          <textarea name="txtfcreFormulaCal" style="width:350px;height:80px">
                          <%//=fcb.getfcreFormulaCal()%>
                          </textarea>
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
                    </tr>-->
                    <tr>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">&nbsp;
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">
                          <!--<input type="text" name="txtfcreImpMoneda" value="<%= fcb.getfcreImpMoneda() %>" maxlength="10" size="10"/>-->
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                    </tr>
                    <!--<tr>
                        <td width="15%" align="right">Comentario</td>
                        <td width="15%" align="left" colspan="3">
                          <textarea name="txtfcreTexComentario" style="width:500px;height:80px" >
                             <%//= fcb.getfcreTexComentario()%>
                          </textarea>
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                    </tr>-->
                    <!--<tr>
                        <td width="15%" align="center">TRASPASOS</td>
                        <td width="15%" align="left" colspan="5">
                            <hr>
                        </td>
                        
                    </tr>
                    <tr>
                        <td width="15%" align="right">Fecha Traspaso</td>
                        <td width="15%" align="left">
                          <input  type="hidden" maxlength="10" name="txtFechaI3" style=" WIDTH:70px"   value="<%=(request.getParameter("txtFechaI3")!=null)?request.getParameter("txtFechaI3"):"01"+fecha.substring(2,10)%>">
                             <input type="hidden" name="txtfcreFecReservaTras" maxlength=10 value="<%=valfcreFecReservaTras%>">
                            <input type="text" id="cboCalendarioF3" name="cboCalendarioF3" maxlength=10 value="<%= fcb.getfcreFecReservaTras() %>">
                            <input type="button" id="lanzaCalendarioF3" name="lanzaCalendarioF3"  style=" WIDTH: 15px"   class="botonCbo" value="v">
                            <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendarioF3",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioF3"   // el id del bot�n que lanzar� el calendario
																						});					
                            </SCRIPT>
                        </td>
                        <td width="15%" align="right">Importe Reserva</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfcreImpReservaTras" value="<%= fcb.getfcreImpReservaTras() %>" maxlength="20" size="20"/>
                        </td>
                        <td width="15%" align="right">Periodo</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfcrePlazoTras" value="<%= fcb.getfcrePlazoTras() %>" maxlength="10" size="10"/>
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">Fecha Limite de Reserva</td>
                        <td width="15%" align="left">
                          <input  type="hidden" maxlength="10" name="txtFechaI4" style=" WIDTH:70px"   value="<%=(request.getParameter("txtFechaI4")!=null)?request.getParameter("txtFechaI4"):"01"+fecha.substring(2,10)%>">
                             <input type="hidden" name="txtfcreFecReservaLim" maxlength=10 value="<%=valfcreFecReservaLim%>">
                            <input type="text" id="cboCalendarioF4" name="cboCalendarioF4" maxlength=10 value="<%= fcb.getfcreFecReservaLim()%>">
                            <input type="button" id="lanzaCalendarioF4" name="lanzaCalendarioF4"  style=" WIDTH: 15px"   class="botonCbo" value="v">
                            <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendarioF4",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioF4"   // el id del bot�n que lanzar� el calendario
																						});					
                            </SCRIPT>
                        </td>
                        <td width="15%" align="right">Plazo Limite</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfcrePlazoLim" value="<%= fcb.getfcrePlazoLim() %>" maxlength="10" size="10"/>
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                    </tr>-->
                    <tr>
                        <td width="15%" align="center">&nbsp;</td>
                        <td width="15%" align="left" colspan="5">
                            <hr>
                        </td>
                        
                    </tr>
                    <tr>
                        <td width="15%" align="right">Status</td>
                        <td width="15%" align="left">
                          <span class="texto">
                            <select name="cbofcreStCredito" style=" WIDTH: 150px">&gt; 
                              <option -1>seleccione una opcion</option>
                              <%=BD.DataCombo2(fcd.cargaCombos(31),fcb.getfcreStCredito(),true)%>
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
                          <input type="button" name="botonModificar" class="btn btn-success" value="Modificar" onClick="javascript:modificar();"/>
                          <input type="button" name="Cancelar" class="boton" value="Cancelar" onClick="javascript:cancelar();" />
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