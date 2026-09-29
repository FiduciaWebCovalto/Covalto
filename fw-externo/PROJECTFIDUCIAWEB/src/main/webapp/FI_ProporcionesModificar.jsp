<%@ page import="java.text.DecimalFormat, java.text.NumberFormat,java.util.Locale"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="parametrosToken.jsp" %>
<%@ include file="Sesion.jsp" %>
<jsp:useBean id="RBD"  class="com.bancomext.negocio.RetirosDB"/>


<%@ page import="com.bancomext.daos.FProporcionesDao"%>
<%@ page import="com.bancomext.beans.FProporcionesBean"%>

<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<script language="JavaScript" SRC='scripts/general.js'></script>

<% 
  try {
            String idFormula[]=null;
            FProporcionesDao dao = new FProporcionesDao();
            FProporcionesBean bean= new FProporcionesBean();
            String botonModificar=request.getParameter("botonModificar");
            String auxCbo[]=null;
            
            
            
            String keys = request.getParameter("variableConPks")==null?request.getParameter("hiddenvariableConPks")==null?"0-0":request.getParameter("hiddenvariableConPks"): request.getParameter("variableConPks");
            String key[]=keys.split("-");
            //CARGAMOS EL BEAN CON LA INFORMACION ACTUAL
              bean=dao.consultar(Integer.parseInt(key[0]),key[1],Integer.parseInt(key[2]));
            //VARIABLES DE VALIDAIONES/////////////////////
             String   llenaCboCtoInvers=request.getParameter("llenaCboCtoInvers")==null?"FALSE": request.getParameter("llenaCboCtoInvers");
             int fisoCombo = -100;
            //////////////////////////////////////////////
            
            
            //////////////////////////////////////////////////////////
              String valfproIdFideicomiso = request.getParameter("hiddentxtfproIdFideicomiso")==null?"": request.getParameter("hiddentxtfproIdFideicomiso");
            String valfproIdCredito = request.getParameter("hiddencbofproIdCredito")==null?"0": request.getParameter("hiddencbofproIdCredito");
            String valfproIdCtoInver = request.getParameter("hiddencbofproIdCtoInver")==null?"": request.getParameter("hiddencbofproIdCtoInver");
            String valfproTipoFondo = request.getParameter("chkfproTipoFondo")==null?"0": request.getParameter("chkfproTipoFondo");
            String valfproFormula = request.getParameter("cbofproFormula")==null?"": request.getParameter("cbofproFormula");
            String valfproSaldoObjetivo = request.getParameter("txtfproSaldoObjetivo")==null?"": request.getParameter("txtfproSaldoObjetivo");
            String valfproSaldo = request.getParameter("hiddentxtfproSaldo")==null?"": request.getParameter("hiddentxtfproSaldo");
            String valfproPorcentaje = request.getParameter("txtfproPorcentaje")==null?"": request.getParameter("txtfproPorcentaje");
            String valfproConcepto = request.getParameter("txtfproConcepto")==null?"": request.getParameter("txtfproConcepto");
            String valfproPeriodicidad = request.getParameter("cbofproPeriodicidad")==null?"": request.getParameter("cbofproPeriodicidad");
            String valfproReceptor = request.getParameter("txtfproReceptor")==null?"":request.getParameter("txtfproReceptor");
            String valfproPagador = request.getParameter("txtfproPagador")==null?"":request.getParameter("txtfproPagador");
            String valfproTexComentario = request.getParameter("txtfproTexComentario")==null?"": request.getParameter("txtfproTexComentario");
            
            String valfproFecReservaTras = request.getParameter("fecfproFecReservaTras")!=null?request.getParameter("fecfproFecReservaTras"): fecha;
            String valfproImpReservaTras = request.getParameter("txtfproImpReservaTras")==null?"0.0": request.getParameter("txtfproImpReservaTras");
            String valfproFecHono = request.getParameter("f")!=null?request.getParameter("fecfproFecHono"): fecha;
            String valfproPagaHono = request.getParameter("chkfproPagaHono")==null?"0":request.getParameter("chkfproPagaHono");
            String valfproPagaCredito = request.getParameter("chkfproPagaCredito")==null?"0":request.getParameter("chkfproPagaCredito");
            String valfproCuentaClave = request.getParameter("cbofproCuentaClave")==null?"0":request.getParameter("cbofproCuentaClave");
            String valfproStPropor = request.getParameter("cbofproStPropor")==null?"": request.getParameter("cbofproStPropor");
           
           
           //ejecuciones de validaciones///////////////
            if(llenaCboCtoInvers.equals("TRUE")){
                fisoCombo=Integer.parseInt(valfproIdFideicomiso);
            }
            ////////////////////////////////////////////
            
%>
             <script language="JavaScript" type="text/JavaScript">
                    
                   var numb = '0123456789.$,';
                    var lwr = 'abcdefghijklmnopqrstuvwxyz ';
                    var upr = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ ';
                    
                  function modificar(){
                       if(
                          campoObligatorioLista(document.formModificar.cbofproStPropor," Estatus ")&&
                          isNum(document.formModificar.txtfproSaldoObjetivo,"El Monto Minimo Garantizado es numerico")&&
                          isNum(document.formModificar.txtfproPorcentaje,"El Tipo Porcentaje es numerico")&&
                          isNum(document.formModificar.txtfproImpReservaTras,"El Importe de Reserva es numerico")

                       ){
                      document.formModificar.action="FI_ProporcionesModificar.jsp?botonModificar=Modificar";
                      document.formModificar.submit();
                      }
                  }
                  
                  function cancelar(){
                      document.formModificar.action="FI_Proporciones.jsp";
                      document.formModificar.submit();
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo" >Parametros del Fideicomiso</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
		  </table >
</HEAD> 
    <form name="formModificar" method="post">
      <%
        
          if((botonModificar!=null)&&(botonModificar.equals("Modificar"))){
              //String idMoneda[]= null;
              String id[]=null;
             bean.setfproIdFideicomiso(Integer.parseInt(valfproIdFideicomiso.equals("")?"0":valfproIdFideicomiso));
             bean.setfproIdCredito(dao.fixValCombo(valfproIdCredito,"0"));
                   
             bean.setfproIdCtoInver(Integer.parseInt(dao.fixValCombo(valfproIdCtoInver,"0")));
             bean.setfproTipoFondo(valfproTipoFondo);
             /*if(!valfproFormula.equals(""))
                    id=valfproFormula.split("-");
             else*/
             bean.setfproFormula("");
             //bean.setfproSaldoObjetivo(Double.parseDouble(valfproSaldoObjetivo.equals("")?"0.0":valfproSaldoObjetivo));
             bean.setfproSaldoObjetivo(dao.desformatear(valfproSaldoObjetivo));
             //bean.setfproSaldo(Double.parseDouble(valfproSaldo.equals("")?"0.0":valfproSaldo));
             bean.setfproSaldo(dao.desformatear(valfproSaldo));
             bean.setfproPorcentaje(Double.parseDouble(valfproPorcentaje.equals("")?"0.0":valfproPorcentaje));
             bean.setfproConcepto(valfproConcepto);
             bean.setfproPeriodicidad(valfproPeriodicidad);
             bean.setfproReceptor(Integer.parseInt(valfproReceptor.equals("")?"0":valfproReceptor));
             bean.setfproPagador(Integer.parseInt(valfproPagador.equals("")?"0":valfproPagador));
             bean.setfproTexComentario(valfproTexComentario);
             
             bean.setfproFecReservaTras(valfproFecReservaTras);
             //bean.setfproImpReservaTras(Double.parseDouble(valfproImpReservaTras.equals("")?"0.0":valfproImpReservaTras));
             bean.setfproImpReservaTras(dao.desformatear(valfproImpReservaTras));
             bean.setfproFecHono(valfproFecHono);
             bean.setfproPagaHono(Integer.parseInt(valfproPagaHono.equals("")?"0":valfproPagaHono));
             bean.setfproPagaCredito(Integer.parseInt(valfproPagaCredito.equals("")?"0":valfproPagaCredito));
             bean.setfproCuentaClave(valfproCuentaClave);
             bean.setfproStPropor(dao.fixValCombo(valfproStPropor,""));
              if(dao.modificar(bean)>0){
                  out.print("<div class=\"texto\"><font color=\"#006600\"><b>Registro modificadfo correctamente</b></font></div>");
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
                          <input type="text" name="txtfproIdFideicomiso" value="<%= bean.getfproIdFideicomiso() %>" maxlength="10" size="10" disabled="disabled"/>
                          <input type="hidden" name="hiddentxtfproIdFideicomiso" value="<%= bean.getfproIdFideicomiso() %>" maxlength="10" size="10"/>

                        </td>
                        <td width="15%" align="left" colspan="2">&nbsp;
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
                        <td width="15%" align="right">Credito</td>
                        <td width="15%" align="left">
                          <input type="text" name="cbofproIdCredito" value="<%= bean.getfproIdCredito() %>" maxlength="10" size="10" disabled="disabled"/>
                        <input type="hidden" name="hiddencbofproIdCredito" value="<%= bean.getfproIdCredito () %>" maxlength="10" size="10"/>
                        </td>
                        <td width="15%" align="right">Contrato de Inversion</td>
                          <!--<input type="text" name="txtfproIdCtoInver" value="<%= bean.getfproIdCtoInver () %>" maxlength="10" size="10"/>-->
                        <td  width="15%" align="left" class="texto"> 
                            <input type="text" name="cbofproIdCtoInver" value="<%= bean.getfproIdCtoInver() %>" maxlength="10" size="10" disabled="disabled"/>
                        <input type="hidden" name="hiddencbofproIdCtoInver" value="<%= bean.getfproIdCtoInver() %>" maxlength="10" size="10"/>
                        </td>
                        <td width="15%" align="right">Cuenta CLABE</td>
                        <td width="15%" align="left">
                          <span class="texto">
                            <select name="cbofproCuentaClave" id="cbofproCuentaClave" style=" WIDTH: 150px">&gt; 
                              <option value="">seleccione una opcion</option>
                                <%=  BD.DataCombo2(dao.cargaCombos(1003),bean.getfproCuentaClave(),false)%>
                            </select>
                          </span>
                          
                          <!--<span class="texto">
                            <select name="cbofproTipoFondo" style=" WIDTH: 150px">&gt; 
                              <option value="">seleccione una opcion</option>
                              <%=  BD.DataCombo2(dao.cargaCombos(171),bean.getfproTipoFondo(),false)%>
                            </select>
                          </span>-->
                        </td>
                    </tr>
                    
                    <!--<tr>
                        <td width="15%" align="right">Formula</td>
                        <td width="15%" align="left">
                          <span class="texto">
                            <select name="cbofproFormula" style=" WIDTH: 150px">&gt; 
                              <option value="">seleccione una opcion</option>
                              <%=  BD.DataCombo2(dao.cargaCombos(1001),bean.getfproFormula(),true)%>
                            
                            </select>
                          </span>
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left" colspan="3">
                          <input type="text" name="txt" value="" maxlength="100" size="45"/>
                        </td>
                    </tr>-->
                    <tr>
                        <td width="15%" align="right">
                          <P>Monto Minimo Garantizado</P>
                        </td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfproSaldoObjetivo" value="<%= dao.formatear(String.valueOf(bean.getfproSaldoObjetivo ()))%>" maxlength="10" size="10"/><!--<%= NumberFormat.getCurrencyInstance(Locale.US).format(bean.getfproSaldoObjetivo ()) %>-->
                        </td>
                        <td width="15%" align="right">Saldo Valuacion</td>
                        <td width="15%" align="left">
                            <input type="text" name="txtfproSaldo" value="<%= dao.formatear(String.valueOf(bean.getfproSaldo ())) %>" maxlength="10" size="10" disabled="disabled" />
                            <input type="hidden" name="hiddentxtfproSaldo" value="<%=bean.getfproSaldo () %>" maxlength="10" size="10"/>
                        </td>
                        <td width="15%" align="right">Porcentaje Maximo Retencion</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfproPorcentaje" value="<%= bean.getfproPorcentaje() %>" maxlength="10" size="10"/>
                        </td>
                    </tr>
                    <!--<tr>
                        <td width="15%" align="right">Concepto</td>
                        <td width="15%" align="left" colspan="5">
                          <input type="text" name="txtfproConcepto" value="<%= bean.getfproConcepto () %>" maxlength="100" size="45"/>
                        </td>
                    </tr>-->
                    <tr>
                        <td width="15%" align="right">Periodicidad</td>
                        <td width="15%" align="left">
                          <span class="texto">
                            <select name="cbofproPeriodicidad" style=" WIDTH: 150px">&gt; 
                              <option value="">seleccione una opcion</option>
                              <%=  BD.DataCombo2(dao.cargaCombos(52),bean.getfproPeriodicidad(),false)%>
                            </select>
                          </span>
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">Receptor</td>
                        <td width="15%" align="left">
                          <input type="checkbox" name="txtfproReceptor" value="1" <%= bean.getfproReceptor()==1?"checked":" " %>/>
                        </td>
                        <td width="15%" align="right">Pagador</td>
                        <td width="15%" align="left">
                          <input type="checkbox" name="txtfproPagador" value="1"  <%= bean.getfproPagador ()==1?"checked":" " %>/>
                        </td>
                        <td width="15%" align="right">
                            &nbsp;
                        </td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">Comentario</td>
                        <td width="15%" align="left" colspan="5">
                          <input type="text" name="txtfproTexComentario" value="<%= bean.getfproTexComentario () %>" maxlength="100" size="45"/>
                        </td>
                    </tr>
                    
                    <tr>
                        <td width="15%" align="right">Reserva</td>
                        <td width="15%" align="left">
                          <input type="checkbox" name="chkfproTipoFondo" value="1"  <%= bean.getfproTipoFondo().equals("1")?"checked":" " %> />
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">Importe de Reserva</td>
                        <td width="15%" align="left">
                          <input type="text" name="txtfproImpReservaTras" value="<%=  dao.formatear(String.valueOf(bean.getfproImpReservaTras()))%>" maxlength="10" size="10"/>
                        </td>
                        <td width="15%" align="right">Fecha de Reserva</td>
                        <td width="15%" align="left">
                             <input type="text" id="fecfproFecReservaTras" name="fecfproFecReservaTras" maxlength=10 value="<%= bean.getfproFecReservaTras ()%>">
                            <input type="button" id="lanzaCalendarioF" name="lanzaCalendarioF"  style=" WIDTH: 15px"   class="botonCbo" value="v">
                            <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "fecfproFecReservaTras",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioF"   // el id del bot�n que lanzar� el calendario
																						});					
                            </SCRIPT>
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">Paga Honorario</td>
                        <td width="15%" align="left">
                          <input type="checkbox" name="chkfproPagaHono" value="1" <%= bean.getfproPagaHono()==1?"checked":" " %>/>
                                
                        </td>
                        <td width="15%" align="right">Fecha Pago Honorarios</td>
                        <td width="15%" align="left">
                             <input type="text" id="fecfproFecHono" name="fecfproFecHono" maxlength=10 value="<%= bean.getfproFecHono ()%>">
                            <input type="button" id="lanzaCalendarioF2" name="lanzaCalendarioF2"  style=" WIDTH: 15px"   class="botonCbo" value="v">
                            <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "fecfproFecHono",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioF2"   // el id del bot�n que lanzar� el calendario
																						});					
                            </SCRIPT>
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">&nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td width="15%" align="right">Paga Credito</td>
                        <td width="15%" align="left">
                          <input type="checkbox" name="chkfproPagaCredito" value="1"  <%= bean.getfproPagaCredito()==1?"checked":" " %>/>
                                
                        </td>
                        <td width="15%" align="right">Estatus</td>
                        <td width="15%" align="left">
                            <span class="texto">
                            <select name="cbofproStPropor" style=" WIDTH: 150px">&gt; 
                              <option value="">seleccione una opcion</option>
                              <%=  BD.DataCombo2(dao.cargaCombos(31),bean.gefproStPropor (),false)%>
                            </select>
                          </span>
                        </td>
                        <td width="15%" align="right">&nbsp;</td>
                        <td width="15%" align="left">&nbsp;
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