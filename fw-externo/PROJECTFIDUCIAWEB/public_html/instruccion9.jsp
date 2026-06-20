<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="instrucc"  class="com.bancomext.negocio.nInstrucciones"/>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="firmas"  class="com.bancomext.negocio.nConsultas"/>
<jsp:useBean id="det"  class="com.bancomext.negocio.nConsultas"/>
<jsp:useBean id="detSWIFT"  class="com.bancomext.negocio.nConsultas"/>

<%@ include file="sesionInst9.jsp" %>
<%@ include file="pki.jsp" %>
<%@ include file="parametrosPKI.jsp" %>
<%
String[] strDatos = new String[8];
String alerta="";
String mensaje="";
String usuario=(String)session.getAttribute( "NumUser" );
String nomUsuario=(String)session.getAttribute( "NomUser" );
String instruccion="";
String fechaCaptura="";
String usuarioCaptura="";
String fechaFirma1="";
String usuarioFirma1="";
String stFirma1="";
boolean bInstruccion=false;
int tipoInstruccion=Integer.parseInt(request.getParameter("txtTipoInstrucc")!=null?request.getParameter("txtTipoInstrucc").trim():"0");
int folio=Integer.parseInt(request.getParameter("txtFolio")!=null?request.getParameter("txtFolio").trim():"0");
int fiso=Integer.parseInt((String)session.getAttribute("NumFid")!=null?(String)session.getAttribute("NumFid"):"0");
String accion=request.getParameter("txtAccionSt")!=null?request.getParameter("txtAccionSt").trim():"";
String titulo="";
				/*
				accion = ACTIV0(AUTORIZACION DE LA INSTRUCCION) 
				accion = CANCELADO (CANCELACION DE LA INSTRUCCION)
				*/
				
//VERIFICA SI LA INSTRUCCION NO HA SIDO AUTORIZADA
if(instrucc.folioAutorizado(String.valueOf(fiso),String.valueOf(folio),tipoInstruccion))
	{
	session.setAttribute("msgError","La instruccion con Folio: "+ folio+ "<br>Ya esta autorizada");
	%>
	<jsp:forward page="FI_Instruccion9.jsp?st=1"/>    
	<%     
	}
	 	 
		
det.setVtrIntDato1(folio);
det.setVtrIntDato2(fiso);
switch(tipoInstruccion)
		{
		case 1:
					titulo="AVISO DE DEPOSITO ";
					instruccion="Dep�sito";
					det.querySelect(21);
					fechaCaptura=fechaCaptura.equals("")?det.getVtrStrDato2():fechaCaptura;	
					break;
					
		case 2:
					titulo="SOLICITUD DE RETIRO ";
					instruccion="Retiro";
					det.querySelect(22);
					fechaCaptura=fechaCaptura.equals("")?det.getVtrStrDato1():fechaCaptura;
					if(accion.equals("ACTIVO"))//Valida los saldos disponibles si la operacion fue autorizada
						if(BD.getSaldoActual( String.valueOf(fiso) , String.valueOf(det.getVtrIntDato2()) )<  det.getVtrDoubleDato3())
							{
							session.setAttribute("msgError","No se Cuenta con saldo Disponible <br>En el Contrato de Inversi�n:  "+det.getVtrIntDato2());
							%>
							<jsp:forward page="FI_Instruccion9.jsp?st=1"/>    
							<%
							 }
								
					break;			
		case 3:
					titulo="SOLICITUD DE TRASPASO ";
					instruccion="Traspaso entre Contratos de Inversi�n";
					det.querySelect(23);
					fechaCaptura=fechaCaptura.equals("")?det.getVtrStrDato1():fechaCaptura;
					
					if(accion.equals("ACTIVO"))//Valida los saldos disponibles si la operacion fue autorizada
						if(BD.getSaldoActual( String.valueOf(fiso) , String.valueOf(det.getVtrIntDato2()) )< det.getVtrDoubleDato4())
							{
							session.setAttribute("msgError","No se Cuenta con saldo Disponible <br>En el Contrato de Inversi�n Origen:  "+det.getVtrIntDato2());
							%>
							<jsp:forward page="FI_Instruccion9.jsp?st=1"/>    
							<%
							}
	
					break;			
					
			}
	

	
//Datos  de autorizacion
strDatos[0]=String.valueOf(tipoInstruccion);
strDatos[1]=String.valueOf(folio);
strDatos[2]=String.valueOf(fiso);
strDatos[3]=fecha;
strDatos[4]=usuario;
strDatos[5]=accion;
strDatos[6]=(String)session.getAttribute( "permiso" );

//Datos de la bitacora
String[] strBitacora = new String[4];
strBitacora[0]=fecha;
strBitacora[1]=String.valueOf(folio);
strBitacora[2]=(String)session.getAttribute("username");

firmas.setVtrIntDato1(folio);
firmas.setVtrIntDato2(fiso);
firmas.querySelect(2);
if(firmas.hasData())
   {	
	usuarioCaptura=firmas.getVtrStrDato1();
    fechaCaptura=firmas.getVtrStrDato2();
	usuarioFirma1=firmas.getVtrStrDato3();
    fechaFirma1=firmas.getVtrStrDato4();
	stFirma1=firmas.getVtrStrDato5().trim();
	if(stFirma1.equals("ESPERA"))
		{
		strBitacora[3]=(accion.equals("ACTIVO")?instruccion+" en espera de autorizacion 2":" Cancelacion de "+instruccion )+" por Internet con Folio: " + folio ;
		strDatos[6]="1";
		}
	if(stFirma1.equals("ACTIVO"))
		{
		if(usuarioFirma1.trim().equals( nomUsuario.trim() ))
			{
			session.setAttribute("msgError","Ya autorizaste la instruccion con Folio: "+ folio);
			%>
			<jsp:forward page="FI_Instruccion9.jsp?st=1"/>    
			<%     
			}
			strBitacora[3]=(accion.equals("ACTIVO")?instruccion:" Cancelacion de "+instruccion )+" por Internet con Folio: " + folio ;
			strDatos[6]="2";	
		   }		
	   }
else
	   { 
	   firmas.removerValores();
	   firmas.setVtrIntDato1(folio);
	   firmas.setVtrIntDato2(fiso);
	   firmas.querySelect(1);
	   if(firmas.hasData()) usuarioCaptura=firmas.getVtrStrDato1();
	   strBitacora[3]=(accion.equals("ACTIVO")?instruccion:" Cancelacion de "+instruccion )+" por Internet con Folio: " + folio ;
       strDatos[6]="0";
	   }	


/**************************************************************Firma Digital***********************************************************/
   %>		
   <%@ include file="firmaDigital.jsp" %>
   <%  
/**************************************************************Fin Firma Digital********************************************************/

strBitacora[3]=strBitacora[3]+detalleBit;
bInstruccion=instrucc.autorizacion(strDatos,strBitacora);

if(!bInstruccion)
	{
	session.setAttribute("msgError","Error al autorizar la instruccion con Folio: "+ String.valueOf(folio)+ "<br>Favor de Intentar mas tarde, si el problema persiste consulte con su ejecutivo de cuenta ");
	%>
	<jsp:forward page="FI_Instruccion9.jsp?st=1"/>    
	<%     
	}
%>

<html>
<head>
<TITLE>Instrucciones - FiduciaWeb Movil</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" type="text/JavaScript">
function regresar()
	{
	parent.location="FI_Instruccion9.jsp";
	}

function imprimir()
	{
	window.print();
	parent.location="FI_Instruccion9.jsp";
	}

</script>
<script> 
function window.onbeforeprint()
{ 
Imprimir.style.visibility = 'hidden';
Salir.style.visibility = 'hidden'; 
} 
function window.onafterprint(){ 
Imprimir.style.visibility = 'visible';
Salir.style.visibility = 'visible'; 
}
</script> </head>

<body class="bg-light">
<table border="0" width="90%" align="center">
  <tr bordercolor="#000000"> 
    <td  ><hr size="2"></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td align="right" class="textoNegrita"><table width="100%" border="0" height="79">
        <tr bordercolor="#000000"> 
          <td width="11%"><img src="imagenes/logo.jpg" width="135" height="89"></td>
          <td width="89%" align="center" bordercolor="#FFFFFF" class="subtitulo">DIRECCION 
            FIDUCIARIA <br>
            <%=accion.equals("ACTIVO") && stFirma1.equals("ACTIVO")?titulo:""%> 
            <%=accion.equals("ACTIVO") && stFirma1.equals("")?titulo:""%> 
            <%=accion.equals("ACTIVO") && stFirma1.equals("ESPERA")?titulo+"EN ESPERA DE LA 2da FIRMA  DE AUTORIZACION":""%> 
            <%=accion.equals("CANCELADO")?"COMPROBANTE DE CANCELACION DE "+titulo:""%> 
          </td>
        </tr>
      </table></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td ><hr size="2"></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  align="right" class="textoNegrita">Fecha:<%=BD.getFecha()+"&nbsp;&nbsp;  "+BD.getHora() +" hrs."%></td>
  </tr>
  <tr bordercolor="#000000">
    <td  align="right" class="textoNegrita">&nbsp;</td>
  </tr>
</table>
  <table width="70%"  border="1" class="texto" bordercolor="#FFFFFF" align="center">
    <tr bordercolor="#000000" > 
      <td  colspan="2"   bgcolor="#CCCCCC" class="subtitulo" >Folio de Operacion: <%=folio%></td>
    </tr>
	<tr bordercolor="#000000"> 
       <td width="38%"  class="texto">Fideicomiso:</td>
       <td width="62%" class="texto"><%= session.getAttribute( "Fideicomiso" )%></td>
    </tr>
    <tr bordercolor="#000000"  > 
      <td width="38%" >Fecha de Captura: </td>
      <td width="62%" > <%=fechaCaptura%> </td>
    </tr>
    <tr bordercolor="#000000"   > 
      <td >Realizada<%=usuarioCaptura.equals(usuarioFirma1)?"  y autorizada":""%> 
        por: </td>
      <td > <%=usuarioCaptura%> </td>
    </tr>
    <%if(!usuarioCaptura.equals(usuarioFirma1) && !usuarioFirma1.equals("ESPERA1") && !usuarioFirma1.equals(""))
		{%>
    <tr bordercolor="#000000"   > 
      <td > Autorizada por: </td>
      <td> <%=usuarioFirma1%> </td>
    </tr>
      <%}%>
    <%					
switch(tipoInstruccion)
		{
	case 1:
		%>
						<tr bordercolor="#000000"  > 
						  <td width="38%" align="left" > Cuenta <%=session.getAttribute("empresa_9")%> en la que se deposito:</td>
						  
      <td width="62%"><%=det.getVtrStrDato4()%> </td>
						</tr >
						<tr bordercolor="#000000"  > 
						  
      <td   align="left">Importe: </td>
						  
      <td ><%=NumberFormat.getCurrencyInstance(Locale.US).format(det.getVtrDoubleDato5())%> 
      </td>
						</tr>
						<tr bordercolor="#000000"  > 
						  
      <td > Concepto: </td>
						  
      <td ><%=det.getVtrStrDato7()%> </td>
						</tr>
      <% 
        if(Integer.parseInt((String)session.getAttribute("TpoCont")) == 1 ) {
      %>           
      <tr bordercolor="#000000"  > 
					<td > Persona que deposita: </td>
						  <td ><%=det.getVtrStrDato10()%> </td>
				</tr>      
			<% } %>
      <tr bordercolor="#000000"  > 
						  <td > Abono al Contrato de Inversi&oacute;n No.:</td>
						  
      <td > <%=det.getVtrIntDato8()%> </td>
						</tr>
						<% if(!det.getVtrStrDato9().trim().equals("")) 
																																				{%>
						<tr bordercolor="#000000"  > 
						  <td > Invertir en Instrumento: </td>
						  
      <td > <%=det.getVtrStrDato9()%> </td>
						</tr>
						<% } %>
						<%
			break;
	case 2:
			%>
															
	                        
    <tr bordercolor="#000000"  > 
      <td width="34%" align="left" > Retiro del Contrato de Inversi&oacute;n:</td>
                          
      <td width="66%"><%=det.getVtrIntDato2()%> </td>
                        </tr >
                        
    <tr bordercolor="#000000"  > 
      <td   align="left">Importe: </td>
                          
      <td ><%=NumberFormat.getCurrencyInstance(Locale.US).format(det.getVtrDoubleDato3())%> 
      </td>
                        </tr>
                        
    <tr bordercolor="#000000"  > 
      <td > Concepto: </td>
                          
      <td ><%=det.getVtrStrDato4()%> </td>
                        </tr>
						<%
				  //JJR 17/02/2006
				  // ACUERDOS COMITE TECNICO
				  if(!det.getVtrStrDato13().equals(""))
				  			{
							%>						
                       <tr bordercolor="#000000"  > 
                          <td >Acuerdo Comite T&eacute;cnico:</td>
                          <td >Fecha de Sesion:&nbsp;<%=det.getVtrStrDato13()%> 
                            <br>
                            Tipo de Sesi&oacute;n: &nbsp; <%=det.getVtrStrDato14().equals("O")?"ORDINARIA":"EXTRAORDINARIA"%><br>
                            No. Acuerdo:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=det.getVtrStrDato15()%> 
                          </td>
                        </tr>
						<%}%>						
                        
    <tr bordercolor="#000000"  > 
      <td > Forma de Liquidaci&oacute;n:</td>
                          
      <td > <%=det.getVtrStrDato6()%> </td>
                        </tr>
                    
                    <%
					if(det.getVtrIntDato5()==3)//Cheque
					 {
					%>
					    
    <tr bordercolor="#000000"  > 
      <td >Banco:</td>
                          
      <td ><%=det.getVtrStrDato7()%> </td>
                        </tr>
					    
    <tr bordercolor="#000000"  > 
      <td > Beneficiario: </td>
                          
      <td ><%=det.getVtrStrDato10()%> </td>
                        </tr>						
					<%				
					 }
					 
					if(det.getVtrIntDato5()==5 ||  det.getVtrIntDato5()==19)//Speua(5) , TBC-BANCOMER(19)
					 {
					%>
					    
    <tr bordercolor="#000000"  > 
      <td >N�mero de Cuenta:</td>
                          
      <td ><%=det.getVtrStrDato7()+" - "+det.getVtrStrDato8()%> </td>
                        </tr>
					    
    <tr bordercolor="#000000"  > 
      <td > Plaza: </td>
                          
      <td ><%=det.getVtrStrDato11()%> </td>
                        </tr>
					    
    <tr bordercolor="#000000"  > 
      <td > Titular de la Cuenta: </td>
                          
      <td ><%=det.getVtrStrDato10()%> </td>
                        </tr>											
					<%				
					 }
					 
					if(det.getVtrIntDato5()==18)//SIAC(BANXICO)
					 {

					%>
					    
    <tr bordercolor="#000000"  > 
      <td >N�mero de Cuenta:</td>
                          
      <td ><%=det.getVtrStrDato9()%> </td>
                        </tr>
					    
    <tr bordercolor="#000000"  > 
      <td > Titular de la Cuenta: </td>
                          
      <td ><%=det.getVtrStrDato10()%> </td>
                        </tr>											
					<%								 
					 }
					 // JJR 12/04/2005
					 // SE INCORPORA LA FORMA DE LIUIDACION POR SPEI
					if(det.getVtrIntDato5()==20 || det.getVtrIntDato5()==23)//TEF(20), SPEI (23)
					 {
					%>
					    
    <tr bordercolor="#000000"  > 
      <td >N�mero de Cuenta:</td>
                          
      <td ><%=det.getVtrStrDato7()+" - "+det.getVtrStrDato8()%> </td>
                        </tr>
					    
    <tr bordercolor="#000000"  > 
      <td > Plaza: </td>
                          
      <td ><%=det.getVtrStrDato11()%> </td>
                        </tr>
					    
    <tr bordercolor="#000000"  > 
      <td > Titular de la Cuenta: </td>
                          
      <td ><%=det.getVtrStrDato10()%> </td>
                        </tr>
					    
    <tr bordercolor="#000000"  > 
      <td > RFC: </td>
                          
      <td ><%=det.getVtrStrDato12()%> </td>
                        </tr>																	
					<%									
					 }
					%>
					
						<%
				if(det.getVtrIntDato5()==21)//SWIFT
					 {
					 detSWIFT.setVtrIntDato1(folio);
					 detSWIFT.setVtrIntDato2(fiso);
					 detSWIFT.querySelect(32);
					%>
					        
                        
    <tr bordercolor="#000000" > 
      <td height="29" colspan="2" align="center" >Datos del Banco Domiciliario</td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td  >Pa&iacute;s:</td>
							  
                          
      <td > <%=detSWIFT.getVtrStrDato1()%> </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td  >Ciudad:</td>
							  
                          
      <td > <%=detSWIFT.getVtrStrDato2()%> </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td   >Nombre del Banco:</td>
							  
                          
      <td  > <%=detSWIFT.getVtrStrDato3()%> </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td >Plaza:</td>
							  
                          
      <td > <%=detSWIFT.getVtrStrDato4()%> </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td   >Sucursal:</td>
							  
                          
      <td  > <%=detSWIFT.getVtrStrDato5()%> </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td  >N&uacute;mero de Cuenta:</td>
							  
                          
      <td  > <%=detSWIFT.getVtrStrDato6()%> </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td   >Branch:</td>
							  
                          
      <td  > <%=detSWIFT.getVtrStrDato7()%> </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td >Moneda:</td>
							  
                          
      <td  > <%=detSWIFT.getVtrStrDato8()%> </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td >Importe a transferir:</td>
							  
                          
      <td > <%=NumberFormat.getCurrencyInstance(Locale.US).format(detSWIFT.getVtrDoubleDato9())%> 
      </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td  >C�digo SWIFT o ABA :</td>
							  
                          
      <td  > <%=detSWIFT.getVtrStrDato10()%> </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td height="29" colspan="2"  align="center" >Datos del Beneficiario</td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td   >Nombre:</td>
							  
                          
      <td  > <%=detSWIFT.getVtrStrDato11()%> </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td >Pa&iacute;s:</td>
							  
                          
      <td > <%=detSWIFT.getVtrStrDato12()%> </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td  >Ciudad:</td>
							  
                          
      <td > <%=detSWIFT.getVtrStrDato13()%> </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td   >Domicilio:</td>
							  
                          
      <td > <%=detSWIFT.getVtrStrDato14()%> </td>
							</tr>
							
                        
    <tr bordercolor="#000000" > 
      <td >Tel&eacute;fono:</td>
							  
                          
      <td  > <%=detSWIFT.getVtrStrDato15()%> </td>
							</tr>

					
					
				<%}//SWIFT%>
					
		 <%
		break;
	case 3:
		    %>
    <tr bordercolor="#000000"  > 
      <td width="38%" align="left" > Contrato de Inversi&oacute;n Origen:</td>
      <td width="62%"><%=det.getVtrIntDato2()%> </td>
    </tr >
    <tr bordercolor="#000000"  > 
      <td   align="left">Contrato de Inversi&oacute;n Destino: </td>
      <td ><%=det.getVtrIntDato3()%> </td>
    </tr>
    <tr bordercolor="#000000"  > 
      <td > Importe: </td>
      <td > <%=NumberFormat.getCurrencyInstance(Locale.US).format(det.getVtrDoubleDato4())%> 
      </td>
    </tr>
    <% if(!det.getVtrStrDato5().trim().equals("")) 
																													{%>
    <tr bordercolor="#000000"  > 
      <td > Invertir en Instrumento:</td>
      <td > <%=det.getVtrStrDato5()%> </td>
    </tr>
    <% } %>
  </table>
  <%
															break;
											   default:
											   				break;				
									}//fin switch(tipoInstruccion)
													
										%>
<table width="70%" height="38" align="center">
  <tr> 
    <td class="texto" align="left">&nbsp;</td>
  </tr>

        <tr> 
          <td class="textoNegrita" align="center"><%=accion.trim().equals("CANCELADO")?"Cancelada":"Autorizada"%> por:</td>
        </tr>
        <tr> 
          <td align="center">&nbsp;</td>
        </tr>
        <tr> 
          <td align="center"> _______________________</td>
        </tr>
        <tr> 
          <td class="textoNegrita" ><div align="center"><b><%=(String)session.getAttribute("NomUser")%></b></div></td>
        </tr>


  <%
  if(tipoInstruccion==1 &&  accion.equals("ACTIVO") && (stFirma1.equals("ACTIVO")|| stFirma1.equals("") ) )
        {%>
		  <tr> 
			<td >&nbsp;</td>
		  </tr>
		  <tr> 
			<td >&nbsp;</td>
		  </tr>
          <tr> 
          <td >
            <p class="subtitulo" align="justify">La aplicaci&oacute;n de este dep&oacute;sito est&aacute; sujeta a la recepci&oacute;n de los recursos en la cuenta indicada y a su notificaci&oacute;n por este medio, a m&aacute;s tardar a las 11:00 hrs. de su fecha, con el fin de que se refleje en el saldo en el d&iacute;a h&aacute;bil siguiente. &nbsp;Los dep&oacute;sitos recibidos 
              y notificados despu�s de ese horario se invertir&aacute;n al siguiente 
              d&iacute;a h&aacute;bil y se reflejar&aacute;n en el saldo 48 hrs. despu&eacute;s.s de su fecha. </p></td>
        </tr>

  <%}%>
  <%
    if(tipoInstruccion==2 &&  accion.equals("ACTIVO") && (stFirma1.equals("ACTIVO")|| stFirma1.equals("") ) )
        {
        %>
  <tr> 
    <td > 
      <%
      if(det.getVtrIntDato5()==3)//Cheque
            {
            %>
      <p class="subtitulo" align="justify"> La  aplicaci&oacute;n de este dep&oacute;sito est&aacute; sujeta a la recepci&oacute;n de los recursos en la cuenta indicada y a su notificaci&oacute;n por este medio, a m&aacute;s tardar a las 11:00 hrs. de su fecha, con el fin de que se refleje en el saldo en el d&iacute;a h&aacute;bil siguiente. &nbsp;Los dep&oacute;sitos recibidos y notificados despu&eacute;s de ese horario se invertir&aacute;n al siguiente d&iacute;a h&aacute;bil y se reflejar&aacute;n en el saldo 48 hrs. despu&eacute;s.      Torre IV planta baja. </p>
      <%
            }
            else
            {
            %>
      <p class="subtitulo" align="justify"> Lad aplicaci&oacute;n de este dep&oacute;sito est&aacute; sujeta a la recepci&oacute;n de los recursos en la cuenta indicada y a su notificaci&oacute;n por este medio, a m&aacute;s tardar a las 11:00 hrs. de su fecha, con el fin de que se refleje en el saldo en el d&iacute;a h&aacute;bil siguiente. &nbsp;Los dep&oacute;sitos recibidos y notificados despu&eacute;s de ese horario se invertir&aacute;n al siguiente d&iacute;a h&aacute;bil y se reflejar&aacute;n en el saldo 48 hrs. despu&eacute;s.os y Canad&aacute; y de 72 horas en el resto del mundo. </p>
      <%
            }
            %>
    </td>
  </tr>
  <%
        }
 %>
   <%
  if(tipoInstruccion==3 )
        {%>
          <tr> 
          <td ><p class="subtitulo" align="justify">La aplicaci&oacute;n de este 
        traspaso est&aacute; sujeta a la recepci&oacute;n de su notificaci&oacute;n 
        por este medio, a m&aacute;s tardar a las 11:00 hrs.s 10:30 horas. </p>
      <p class="subtitulo" align="justify"> Los traspasos solicitados y notificados 
        fuera de ese horario se realizar&aacute;n al siguiente d&iacute;a h&aacute;bil &nbsp;y se reflejar&aacute;n en el saldo 48 hrs. despu&eacute;s. 
      </p>
			</td>
        </tr>

  <%}%>
  <tr> 
    <td>&nbsp;</td>
  </tr>
  <tr> 
    <td >&nbsp;</td>
  </tr>
  <tr> 
    <td  class="texto" align="center">
	   <input type="button" name="Imprimir"  class="boton" value="Imprimir"   onClick="javascript:imprimir();" > 
      &nbsp; <input type="button" name="Salir"  class="boton" value="Salir"   onClick="javascript:regresar();" ></td>
  </tr>
</table>
</body>
</html>
