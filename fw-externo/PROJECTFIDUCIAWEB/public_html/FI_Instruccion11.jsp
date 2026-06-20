<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*,java.lang.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="sesionInst11.jsp" %>
<HTML>
<HEAD><TITLE>Transferencia Inter-fideicomisos - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">


<script language="JavaScript" type="text/JavaScript">
<%	
	out.println("var aDropdown1 = new Array ()");
	out.println("var aDropdown2 = new Array ()");
	out.println("var aSaldos = new Array ()");
	out.println("var dSaldos = new Array (10)");
	
	out.println("function LoadArrays() ");
	out.println("{ ");
	int indx1 = 0;
	int indx2 = 0;
	String sContratos [] = BD.getData(35,(String)session.getAttribute( "NumFid" ) + " AND TIF_USUARIO = " + (String)session.getAttribute( "NumUser" ));
	String aSaldos[] = BD.getCtosSaldo( (String)session.getAttribute( "NumFid" ) + " AND TIF_USUARIO = " + (String)session.getAttribute( "NumUser" ), (String)session.getAttribute( "NumFid" ));	  
	  	  		
	NumberFormat nfFormato;
	nfFormato = NumberFormat.getCurrencyInstance(Locale.US);
	double dImporte;
	String sImporte;
	  
      if (sContratos.length>0) {			         
        for (int i=0; i<sContratos.length; i++) {
		   out.println("aSaldos["+(i)+"]=" + aSaldos[i]); 
		   dImporte= Double.parseDouble(aSaldos[i]);
		   sImporte = nfFormato.format(dImporte);
   		   out.println("dSaldos["+(i)+"]=" + "'" + sImporte + "'"); 
	
			String sFISO [] = BD.getData(36,(String)session.getAttribute( "NumFid" ) + " AND TIF_USUARIO = " + (String)session.getAttribute( "NumUser" ) + " AND TIF_CTO_INTER_ORIGEN = " + sContratos[i]);
			if(sFISO!= null) {			
				for(int j=0; j<sFISO.length;j++) {
				   out.println("aDropdown1["+(indx1++)+"]=new sElement1('"+ (String)session.getAttribute( "NumUser" ) + (String)session.getAttribute( "NumFid" )  + sContratos[i] +"','"+ (String)session.getAttribute( "NumUser" ) + (String)session.getAttribute( "NumFid" )  + sContratos[i] + sFISO[j]+"','"+ sFISO[j] +"') ");
				   String sConD [] = BD.getData(37,(String)session.getAttribute( "NumFid" ) + " AND TIF_USUARIO = " + (String)session.getAttribute( "NumUser" ) + " AND TIF_CTO_INTER_ORIGEN = " + sContratos[i] + " AND TIF_CTO_DESTINO = " + sFISO[j]);
				   if(sConD!= null) {
					   for (int k=0; k<sConD.length; k++) {
						  out.println("aDropdown2["+(indx2++)+"]=new sElement2('"+ (String)session.getAttribute( "NumUser" ) + (String)session.getAttribute( "NumFid" )  + sContratos[i]  + "','" + (String)session.getAttribute( "NumUser" ) + (String)session.getAttribute( "NumFid" )  + sContratos[i] + sFISO[j] +"','"+ sConD[k]+"','"+ sConD[k]+"') ");
					   } 
					}
				}
			}
        }
      }
		out.println(" return true ");
		out.println(" } ");
		
		out.println("function bCascade2() {");
		out.println("   bCascadeDrop1(document.forms[0].cboContrato, document.forms[0].cboFisoD, aDropdown1)");
		out.println("   bCascadeDrop2(document.forms[0].cboContrato, document.forms[0].cboFisoD, document.forms[0].cboContratoD, aDropdown2)");
		out.println("muestraSaldo(1)");
		out.println(" }");
		
		out.println("function bCascade1() {");	  	 
		out.println("   bCascadeDrop2(document.forms[0].cboContrato, document.forms[0].cboFisoD, document.forms[0].cboContratoD, aDropdown2)");
		out.println(" }");
		
		out.println("var iArrayMax1 = " + (indx1-1));
		out.println("var iArrayMax2 = " + (indx2-1));
		
		out.println("function muestraSaldo(iVar) {");	
		out.println("dImp= document.frmTrans.cboContrato.selectedIndex");
		out.println("document.frmTrans.txtSaldo.value = aSaldos[dImp]");
		out.println("document.frmTrans.txtdImporte.value = dSaldos[dImp]");
		out.println("}");
		
%>	
</script>

<script language="JavaScript" type="text/JavaScript">
	function Aceptar(existeToken)
	{  
		if(document.frmTrans.cboContrato.selectedIndex==-1)   
		{
			alert("Selecciona un contrato de donde tomaran los recursos");
			document.frmTrans.cboContrato.selectedIndex=0; 
			document.frmTrans.cboContrato.focus();		
			return;	
		}
		                    
		if(document.frmTrans.cboFisoD.selectedIndex==-1)   
		{
			alert("Selecciona un fideicomiso destino donde depositar los recursos");
			document.frmTrans.cboFisoD.selectedIndex=0; 
			document.frmTrans.cboFisoD.focus();		
			return;	
		}
                    
		if(document.frmTrans.cboContratoD.selectedIndex==-1)   
		{
			alert("Selecciona un contrato destino donde depositar los recuros");
			document.frmTrans.cboContratoD.selectedIndex=0; 
			document.frmTrans.cboContratoD.focus();		
			return;	
		}				
		
		if(document.frmTrans.txtConcepto.value=="")   
		{
			alert("Capture el concepto");
			document.frmTrans.txtConcepto.focus();		
			return;	
		}
				
		if(document.frmTrans.txtImporte.value=="")   
		{
			alert("Capture el importe a trasferir ");
			document.frmTrans.txtImporte.selectedIndex=0; 
			document.frmTrans.txtImporte.focus();		
			return;	
		}	
		
		if(!validaImporte(document.frmTrans.txtImporte.value))
		return;
		
		
		if(parseFloat(document.frmTrans.txtImporte.value) > parseFloat(document.frmTrans.txtSaldo.value))
		{
			alert("El importe del traspaso es mayor que el saldo disponible del contrato");
			document.frmTrans.txtImporte.focus();		
			return;	
		}
	   		
			document.frmTrans.txtCO.value = document.frmTrans.cboContrato.options[document.frmTrans.cboContrato.selectedIndex].text;
			document.frmTrans.txtFD.value =	document.frmTrans.cboFisoD.options[document.frmTrans.cboFisoD.selectedIndex].text;
			document.frmTrans.txtCD.value =	document.frmTrans.cboContratoD.options[document.frmTrans.cboContratoD.selectedIndex].text;
			
			if(document.frmTrans.txtCO.value =="") 
			{
				alert("No existen contratos origen de inversión");
				document.frmTrans.txtImporte.focus();		
				return;	
			}
			
			if(document.frmTrans.txtFD.value =="") 
			{
				alert("No existen Fideicomisos destino ");
				document.frmTrans.txtImporte.focus();		
				return;	
			}
			
			if(document.frmTrans.txtCD.value =="") 
			{
				alert("No contratos destino de inversión");
				document.frmTrans.txtImporte.focus();		
				return;	
			}
									
		//valida si el usuario usa token
		//1=si
		//0=no
		if(existeToken==1)
			{
			mostrarToken(); 
			return;
			}
		  document.frmTrans.action="confirmarInst_11.jsp";
		  document.frmTrans.submit();
			  
	}	// fin de funcio Aceptar
	
	
	function aceptarToken() 
	{
	if(document.frmTrans.txtToken.value=="")
		{
		alert('Es necesario que digite su LLAVE');
		document.frmTrans.txtToken.focus();
		return;
		}	
   if((document.frmTrans.txtToken.value).length<6)
		{
		alert('La longitud de la LLAVE es invalida');
		document.frmTrans.txtToken.value="";
		document.frmTrans.txtToken.focus();
		return;
		}	
	if(isNaN(document.frmTrans.txtToken.value))
		{
		alert('La LLAVE es un dato numerico');
		document.frmTrans.txtToken.value="";
		document.frmTrans.txtToken.focus();
		return;
		}		
	document.frmTrans.action="confirmarInst_11.jsp";
	document.frmTrans.submit();
	}	
	
function mostrarToken() 
{
datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.frmTrans.txtToken.focus();
}

function ocultarToken() 
{
document.frmTrans.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

}



	function validaImporte(importe) 
		{
		if(importe.length>0)    
				{
				var p=0;
				for(var i=0;i<importe.length;i++)
				   {
				   if(importe.charAt(i)=='.')
					 {
					 p++;
					 if(p>1)
					   {
					alert("El formato del importe no es valido\nEjemplos:1000\n               1000.00\n ");return false;	  
					   }
					  }
						
						if((isNaN(importe.charAt(i)) && importe.charAt(i)!='.' && importe.charAt(i)!=',' ) || importe.charAt(i)==',' )
					 {
					 alert("El formato del importe no es valido\nEjemplos:1000\n               1000.00\n "); return false;	  
					 }				
								}
			 return true;  			
			 }
			else return false	;
		} // fin funcion validaImporte
		
	function cancelar() 
 	{
	  parent.location="FI_Instrucciones.jsp";
 	}
</script>


<script type='text/javascript' src='scripts/cascadeLists4.js'></script>
</HEAD>
<body class="bg-light">
	  <jsp:include page="header.jsp"/>
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR class="trMenuSuperior">
      <TD colspan="7">
        <ul class="menuSuperior">
          <li><a href="FI_Consultas.jsp">Consultas</a></li>
          <li><a href="FI_Instrucciones.jsp">Instrucciones</a></li> <li><a href="FI_InstruccionesN.jsp">Instrucciones No Monetarias</a></li>
          <li><a href="FI_EdosF.jsp">Informacion Financiera</a></li>
          <li><a href="FI_Opciones.jsp">Opciones</a></li>
          <li><a href="salir.jsp">Salir</a></li>
        </ul>
      </TD>
    </TR>
    <TR > 
      <TD align="center" class="tdMenuLateral"  valign="top" height="100%"   width="176">  
        <%@ include file="menuInstrucciones.jsp" %>
      </TD>
      <TD valign="top" align="center">
	  <form  name="frmTrans" action=""  >
          <table width="100%" border="0">
            <tr> 
              <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
            </tr>
          </table>
          <TABLE  width="593" border="0" align="center">
            <TR> 
              <TD height="20" colspan="2"></TD>
            </TR>
            <TR> 
              <TD colspan="2" height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo"> 
                Traspaso Inter-Fideicomisos </TD>
            <TR> 
              <TD height="10" colspan="2">&nbsp;</TD>
            </TR>
            <TR> 
              <TD colspan="6"><table width="50%" border="0" cellspacing="1" cellpadding="1" align="center">
                  <tr> 
                    <td><div id="token" style="position:absolute; visibility:hidden;"   align="center"> 
                        <table width="305" border="1" cellpadding="1" cellspacing="1" bordercolor="#666666" bgcolor="#999999" align="center">
                          <tr> 
                            <td align="center"><table width="300" border="0" cellspacing="1" cellpadding="1" class="texto" bgcolor="#CCCCCC" align="center"  background="imagenes/fondoSubMenu.png">
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                                <tr> 
                                  <td width="43%">&nbsp;</td>
                                  <td width="57%">&nbsp;</td>
                                </tr>
                                <tr align="center"> 
                                  <td colspan="2" class="textoNegritaWhite">Introduzca 
                                    su <%=session.getAttribute("empresa_9")%>-LLAVE: 
                                    <input type="password" name="txtToken" size="10"  style=" WIDTH: 100px"
                                 maxlength="6"  value="<%=request.getParameter("txtToken")!=null?request.getParameter("txtToken"):""%>"></td>
                                </tr>
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                                <tr> 
                                  <td colspan="2" align="center"> <input type="button" name="AceptarToken" value="Aceptar" onClick="aceptarToken()" class="btn btn-primary"> 
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="button" name="CancelarToken" value="Cancelar" onClick="ocultarToken();" class="btn btn-danger"> 
                                  </td>
                                </tr>
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                              </table></td>
                          </tr>
                        </table>
                      </div></td>
                  </tr>
                </table> 
                <table width="90%" border="0" cellspacing="2" cellpadding="4"  align="center" id="datos">
                  <TR> 
                    <TD colspan="6" class="celda01">Origen:</TD>
                  </TR>
                  <tr> 
                    <td width="30%" height="30" align="right"  class="texto">Contrato 
                      de inversi&oacute;n </td>
                    <td width="70%" colspan="3"> <select  name="cboContrato" onChange="bCascade2()"   style=" WIDTH: 150px">
                        <%								 
								  if(sContratos!=null){
										for(int l=0;l<sContratos.length;l++)
										{%>
                        <option value="<%=(String)session.getAttribute( "NumUser") + (String)session.getAttribute( "NumFid" ) + sContratos[l]%>" > 
                        <%=sContratos[l]%></option>
                        <%}}%>
                      </select> </td>
                  </tr>
                  <TR> 
                    <TD class="texto" align="right">Saldo al inicio del d&iacute;a:</TD>
                    <TD colspan="5" class="texto" ><input type="text" name="txtdImporte" disabled="true" ></TD>
                  </TR>
                  <TR>
                    <TD colspan="6" class="celda01">&nbsp;</TD>
                  </TR>
                  <TR> 
                    <TD colspan="6" class="celda01">Destino:</TD>
                  </TR>
                  <TR> 
                    <td class="texto" align="right">Fideicomiso </td>
                    <td colspan="3"><span class="texto"> 
                      <select name="cboFisoD"  onChange="bCascade1()"   style=" WIDTH: 150px">> 
                        <% 		
						  	if(sContratos != null) {			  	
							for(int i=0;i<sContratos.length;i++) {								
								String sFISOs [] = BD.getData(36,(String)session.getAttribute( "NumFid" ) + " AND TIF_USUARIO = " + (String)session.getAttribute( "NumUser" ) + " AND TIF_CTO_INTER_ORIGEN = " + sContratos[i]);
								if(sFISOs != null) {
									for(int j=0;j<sFISOs.length;j++){
						  %>
                        <option value="<%=(String)session.getAttribute( "NumUser") + (String)session.getAttribute( "NumFid" ) + sContratos[i] + sFISOs[j]%>"> 
                        <%=sFISOs[j]%></option>
                        <%
						  	}}}}
						  %>
                      </select>
                      </span></td>
                  </TR>
                  <TR> 
                    <td class="texto"  align="right">Contrato de inversión </td>
                    <TD height="20" colspan="4"><select name="cboContratoD"   style=" WIDTH: 150px">> 
                        <% 				
						   	if(sContratos != null){		  
							for(int i=0;i<sContratos.length;i++) {
								String sFISO2 [] = BD.getData(36,(String)session.getAttribute( "NumFid" ) + " AND TIF_USUARIO = " + (String)session.getAttribute( "NumUser" ) + " AND TIF_CTO_INTER_ORIGEN = " + sContratos[i]);
								if(sFISO2 != null) {								
								for(int j=0;j<sFISO2.length;j++) {
									String sConD2 [] = BD.getData(37,(String)session.getAttribute( "NumFid" ) + " AND TIF_USUARIO = " + (String)session.getAttribute( "NumUser" ) + " AND TIF_CTO_INTER_ORIGEN = " + sContratos[i] + " AND TIF_CTO_DESTINO = " + sFISO2[j]);
									if(sConD2 !=null) {
									for(int k=0;k<sConD2.length;k++)
									{%>
                        <option value="<%=sConD2[k]%>"><%=sConD2[k]%></option>
                        <%
							 		}}}}}}
								%>
                      </select></TD>
                  </TR>
                  <tr> 
                    <td colspan="4"  class="texto"> <br>
					  <input type="hidden" name="txtCO" > 
                      <input type="hidden" name="txtFD" > 
					  <input type="hidden" name="txtCD" > 
                      <input type="hidden" name="txtSaldo" ></td>
                  </tr>
                
            <TR> 
              <TD width="32%" height="20" align="right" class="texto">Concepto:</TD>
              <TD width="68%" height="20" class="texto"><input type="text" name="txtConcepto" size="60">	
              </TD>
            </TR>
            <TR> 
              <TD height="20"  class="texto" align="right">Importe:</TD>
              <TD height="20"  class="texto"><input type="text" name="txtImporte"  size="40"   style=" WIDTH: 150px">	
              </TD>
            </TR>
            <TR> 
              <TD height="20"  class="texto" align="right">&nbsp;</TD>
              <TD height="20"  class="texto">&nbsp; </TD>
            </TR>
            <TR> 
              <TD height="20" colspan="2" align="center"  class="texto"><input type="button" name="cmdAceptar" value="Aceptar" onClick="javascript:Aceptar(<%=(String)session.getAttribute("token")%>)" class="boton"> 
                &nbsp; &nbsp; <input type="button" name="cmdCancelar" value="Cancelar" onClick="javascript:cancelar()" class="boton"> 
              </TD>
            </TR>
                      <TR> 
              <TD height="20"  class="texto" align="right">&nbsp;</TD>
              <TD height="20"  class="texto">&nbsp; </TD>
            </TR>
		</table></TD>
            </TR>
			</TABLE>
               <table border=0 cellpadding=0 cellspacing=1 class=texto_menu_inf width=530 align="center">
                  <tr> 
                    <td height="12" colspan="9" class="texto_menu_inf" align="center"></td>
                  </tr>
                  <tr> 
                    <td width="482" height="12" colspan="9" class="texto_menu_inf" align="center"></td>
                  </tr>
                  <tr align=middle valign=center> 
                    <td class=texto_menu_inf colspan="9" height="30" align="center"><a  href="#top"><img  border=0 height=11 src="imagenes/arriba.gif" width=59></a></td>
                  </tr>
                  <tr align=middle> 
                    <td class=texto_menu_inf colspan=9 height=7 align="center"><img height=1 src="imagenes/cnaranja01.gif" width=400></td>
                  </tr>
                  <tr> 
                    <td class=texto_menu_inf colspan=9 height=7>&nbsp;</td>
                  </tr>
          </table>
			  
			   <table border=0 cellpadding=0 cellspacing=1 >
                  <tbody>
                    <tr> 
                      <td align="middle" class="ref" >|<a  href="FI_Legales.jsp" class="ref">ASPECTOS 
                        LEGALES</a>|</td>
                    </tr>
                  </tbody>
          </table>

		</form>
      </TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
<%      
	  out.println("<script languaje='JavaScript' >");
      out.println(" bCascade2()");
      out.println("</script>");	  
%>
</BODY></HTML>
