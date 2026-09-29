<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="firmas"  class="com.bancomext.negocio.nConsultas"/>
<jsp:useBean id="det"  class="com.bancomext.negocio.nConsultas"/>
<jsp:useBean id="detSWIFT"  class="com.bancomext.negocio.nConsultas"/>
<jsp:useBean id="detCuentas"  class="com.bancomext.negocio.nConsultas"/>
<%@ include file="sesionInst9.jsp" %>
<%@ include file="parametrosToken.jsp" %>
<%
/****************************AUTENTICACION CON TOKEN******************************/
if(((String)session.getAttribute("token")).equals("1"))
    {%>
    <%@ include file="autenticaToken.jsp" %>
    <%
     }
	 %>
<HTML>
<HEAD><TITLE>Instrucciones  Pendientes </TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<%
String alerta="";
String mensaje="";
String usuario=(String)session.getAttribute( "NomUser" );
String instruccion="";
String fechaCaptura="";
String usuarioCaptura="";
String fechaFirma1="";
String usuarioFirma1="";
String usuarioFirma2="";

String stFirma1="";
boolean bSaldo=true;
boolean bAutorizo=false;
int tipoInstruccion=Integer.parseInt(request.getParameter("txtTipoOpera")!=null?request.getParameter("txtTipoOpera").trim():"0");
int folio=Integer.parseInt(request.getParameter("txtFolio")!=null?request.getParameter("txtFolio").trim():"0");
int fiso=Integer.parseInt((String)session.getAttribute("NumFid")!=null?(String)session.getAttribute("NumFid"):"0");
det.setVtrIntDato1(folio);
det.setVtrIntDato2(fiso);
firmas.setVtrIntDato1(folio);
firmas.setVtrIntDato2(fiso);
firmas.querySelect(2);
if(firmas.hasData())
		{
		usuarioCaptura=firmas.getVtrStrDato1();
		fechaCaptura=firmas.getVtrStrDato2();
		usuarioFirma1=firmas.getVtrStrDato3();
		usuarioFirma2=firmas.getVtrStrDato6();
		fechaFirma1=firmas.getVtrStrDato4();
		stFirma1=firmas.getVtrStrDato5();
		}
else {
		firmas.removerValores();
		firmas.setVtrIntDato1(folio);
		firmas.setVtrIntDato2(fiso);
	  	firmas.querySelect(1);
		if(firmas.hasData()) usuarioCaptura=firmas.getVtrStrDato1();		
	  }	
		  
	if(usuarioFirma1.trim().equals( ((String)session.getAttribute( "NomUser" )).trim() ))
		{
		bAutorizo=true;
		alerta="Ya autorizaste esta Instrucción";
		}

switch(tipoInstruccion)
		{
		case 1:
					instruccion="DEPOSITO";
					det.querySelect(21);

					fechaCaptura=fechaCaptura.equals("")?det.getVtrStrDato2():fechaCaptura;	
					mensaje	=	"INSTRUCCION DE DEPOSITO\\n"
	       	 					+	"\\nFolio de Operación: "+folio
								+	"\\nFideicomiso: "+fiso
								+	"\\nCuenta Bancomext en la que se deposito: "+det.getVtrStrDato4()
								+	"\\nImporte del deposito: "+NumberFormat.getCurrencyInstance(Locale.US).format(det.getVtrDoubleDato5())
								+ "\\nConcepto del deposito: "+det.getVtrStrDato7()
								+ "\\nAbono al Contrato de Inversión No.: "+det.getVtrIntDato8()
							    + (!det.getVtrStrDato9().trim().equals("0")?"\\nInvertir en Instrumento: "+det.getVtrStrDato9():"");
								
					break;			
		case 2:
					instruccion="RETIRO";
					det.querySelect(22);

					fechaCaptura=fechaCaptura.equals("")?det.getVtrStrDato1():fechaCaptura;	
					mensaje	=	"INSTRUCCION DE RETIRO\\n"
	       	 					+	"\\nFolio de Operación: "+folio
								+	"\\nFideicomiso: "+fiso
								+	"\\nContrato de Inversión: "+det.getVtrIntDato2();
								
					if(det.getVtrIntDato5()!=21)
					 mensaje +=	"\\nImporte del Retiro: "+NumberFormat.getCurrencyInstance(Locale.US).format(det.getVtrDoubleDato3());
					
					mensaje +="\\nConcepto del Retiro: "+det.getVtrStrDato4()
								 + "\\nForma de Liquidación:"+det.getVtrStrDato6();
								
					if(det.getVtrIntDato5()==3)//Cheque
					 {
					 mensaje += "\\nBanco: "+det.getVtrStrDato7()
					  			    + "\\nBeneficiario: "+det.getVtrStrDato10();
					 }
					 
					if(det.getVtrIntDato5()==5 ||  det.getVtrIntDato5()==19)//Speua(5) , TBC-BANCOMER(19)
					 {
					 mensaje += "\\nNúmero de Cuenta: "+(det.getVtrIntDato5()==5?det.getVtrStrDato7() +" - ":"")+ det.getVtrStrDato8()
					  			    + "\\nPlaza : "+det.getVtrStrDato11()
									+ "\\nTitular de la Cuenta : "+det.getVtrStrDato10();
					 }
					 
					if(det.getVtrIntDato5()==18)//SIAC(BANXICO)
					 {
					 mensaje += "\\nNúmero de Cuenta: "+det.getVtrStrDato9()
					  			 + "\\nTitular de la Cuenta : "+det.getVtrStrDato10();
					 }
					 //  JJR 14/04/2005
					 // SE INCORPORA LA FORMA DE LIUIDACION SPEI LA CUAL OPERA COMO TEF
					if(det.getVtrIntDato5()==20 ||  det.getVtrIntDato5()==23)// TEF(20), SPEI (23)
					 {
					 mensaje += "\\nNúmero de Cuenta: "+ det.getVtrStrDato7() +" - " + det.getVtrStrDato8()
					  			    + "\\nPlaza : "+det.getVtrStrDato11()
									+ "\\nTitular de la Cuenta : "+det.getVtrStrDato10()
									+ "\\nRFC : "+det.getVtrStrDato12();
					 }
					 
					 if(det.getVtrIntDato5()==21)
							   { 
							   detSWIFT.setVtrIntDato1(folio);
							   detSWIFT.setVtrIntDato2(fiso);
							   detSWIFT.querySelect(32);
							    
								  mensaje += "\\n\\nDATOS DOMICILIARIO:\\n"
								 			  +  "\\nPais: " +   detSWIFT.getVtrStrDato1()  
								 			  +  "\\nCiudad: "+ detSWIFT.getVtrStrDato2() 
											  +  "\\nBanco: " + detSWIFT.getVtrStrDato3() 
											  + "\\nPlaza: "+ detSWIFT.getVtrStrDato4() 
											  + "\\nSucursal: "+ detSWIFT.getVtrStrDato5() 
											  + "\\nCuenta: "+ detSWIFT.getVtrStrDato6() 
											  + "\\nBranch: "+ detSWIFT.getVtrStrDato7()     
											  + "\\nMoneda: "+ detSWIFT.getVtrStrDato8()     
											  + "\\nImporte a Transferir: "+NumberFormat.getCurrencyInstance(Locale.US).format(detSWIFT.getVtrDoubleDato9())
											  + "\\nCodigo SWIFT: "+ detSWIFT.getVtrStrDato10()   
											  + "\\n\\nDATOS BENEFICIARIO\\n"
											  + "\\nNombre: " +  detSWIFT.getVtrStrDato11()   
											  + "\\nPais: " + detSWIFT.getVtrStrDato12()   
											  + "\\nCiudad: " + detSWIFT.getVtrStrDato13()   
											  + "\\nDomicilio: " + detSWIFT.getVtrStrDato14()   
											  + "\\nTelefono: " + detSWIFT.getVtrStrDato15() ; 
							   }
 					   if(BD.getSaldoActual( (String)session.getAttribute("NumFid") , String.valueOf(det.getVtrIntDato2()) )< det.getVtrDoubleDato3())
						   {
						   bSaldo=false;
						   alerta+="<br>No se Cuenta con saldo Disponible en el Contrato de Inversión";
						   }

					break;
										
		case 3:
					instruccion="TRASPASO ENTRE CONTRATOS DE INVERSION";
					det.querySelect(23);

					fechaCaptura=fechaCaptura.equals("")?det.getVtrStrDato1():fechaCaptura;	
					mensaje	=	"INSTRUCCION DE TRASPASO ENTRE CONTRATOS DE INVERSION\\n"
	       	 					+	"\\nFolio de Operación: "+folio
								+	"\\nFideicomiso: "+fiso
								+	"\\nContrato de Inversión Origen: "+det.getVtrIntDato2()
								+	"\\nContrato de Inversión Destino: "+det.getVtrIntDato3()
								+	"\\nImporte del Traspaso: "+NumberFormat.getCurrencyInstance(Locale.US).format(det.getVtrDoubleDato4())
							    + (!det.getVtrStrDato5().trim().equals("")?"\\nInvertir en Instrumento: "+det.getVtrStrDato5():"");
								
					  if(BD.getSaldoActual( (String)session.getAttribute("NumFid") , String.valueOf(det.getVtrIntDato2()) )< det.getVtrDoubleDato4())
						   {
						   bSaldo=false;
						   alerta+="<br>No se Cuenta con saldo Disponible en el Contarto de Inversión Origen";
						   }

					break;			
					
			}
if(stFirma1.equals("ESPERA"))
	{
	mensaje+= "\\n\\nFirma de autorización 1: " + usuario ;
	}
	
else if(stFirma1.equals("ACTIVO"))
		{
		mensaje+= "\\n\\nFirma de autorización 2: " + usuario ;
		}
else {
		mensaje+= "\\n\\nAutorizada por: " + usuario ;
	  }		
	
	 			
%>

 <%@ include file="objetosPKI.jsp" %>

<script language="JavaScript" src="scripts/navegador.js"></script>
<script language="JavaScript" type="text/JavaScript">

function aceptar() 
{
document.instrucciones.txtAccionSt.value="ACTIVO";
   <%
   if(sCaptura.equals("NO"))
   {
   %>
     Sign()
   <%
   }
   else
   {
   %>
      document.instrucciones.action='instruccion9.jsp';
      document.instrucciones.submit();
   <%
   }
   %>
}

function cancelar()
{
   document.instrucciones.txtAccionSt.value="CANCELADO";
   Sign();
}




	function Sign()
		{

if(bName == "Microsoft Internet Explorer")
	{	
			document.instrucciones.action="instruccion9.jsp";
			document.instrucciones.submit();	
 	}
  else{ 
	   if (bName == "Netscape") 
      {
      
        document.instrucciones.action="instruccion1.jsp";
        document.instrucciones.submit();	
      }
    }		
}

  
</script>
</HEAD>
<body class="bg-light">
<jsp:include page="header.jsp"/>
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%" >
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
      <TD valign="top" align="center"> <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        <table width="593" border="0">
          <tr> 
            <td >&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo"><table width="100%" border="0"  class="titulo">
                <tr> 
                  <td width="93%" align="right">Confirmaci&oacute;n o Cancelaci&oacute;n 
                    de Instrucciones Pendientes </td>
                  <td width="7%">&nbsp;</td>
                </tr>
              </table></td>
          </tr>
          <tr>
            <td class="alerta" align="center">&nbsp;<%=alerta%></td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"><table border="0" width="100%">
                <tr> 
                  <td align="center" valign="top"> <form name="instrucciones" method="post" action="">
                      <input type="hidden" name="txtFolio" value="<%=folio%>">
					  <input type="hidden" name="txtAccionSt" value="">
                      <input type="hidden" name="txtTipoInstrucc"  value="<%=tipoInstruccion%>">
                      <input type="hidden" name="Pkcs7">
                      <input type="hidden" name="SignedText">
                      <table width="90%"  border="0" >
                        <tr> 
                          <td  colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01"><b>DATOS 
                            GENERALES</b></td>
                        </tr>
                        <tr  class="celda02"> 
                          <td width="34%"> Folio:</td>
                          <td width="66%" > <%=folio%> </td>
                        </tr >
                        <tr  class="celda02"> 
                          <td   >Fecha de Captura: </td>
                          <td > <%=fechaCaptura%> </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td> Tipo de Instrucci&oacute;n: </td>
                          <td > <%=instruccion%></td>
                        </tr>
                        <tr  class="celda02"> 
                          <td > Realizada<%=usuarioCaptura.equals(usuarioFirma1)?"  y autorizada":""%> 
                            por:</td>
                          <td > <%=usuarioCaptura%> </td>
                        </tr>
                        <%if( !usuarioFirma1.equals("ESPERA1") && !usuarioFirma1.equals("") && !usuarioCaptura.equals(usuarioFirma1))
								{
								
								%>
                        <tr  class="celda02"> 
                          <td > Autorizada por: </td>
                          <td ><%=usuarioFirma1%></td>
                        </tr>
                        <%}%>
						
                      </table>
                      <br>
                      <%
					
						switch(tipoInstruccion)
									{
												case 1:
															%>
															  <table width="90%"  border="0" >
																			<tr> 
																			  
                          <td height="19" colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01"><b>DETALLE 
                            DEPOSITO </b></td>
																			</tr>
																			<tr  class="celda02"> 
																			  <td width="34%" align="left" > Cuenta <%=session.getAttribute("empresa_9")%> en la que 
																				se deposito:</td>
																			  <td width="66%"><%=det.getVtrStrDato4()%> </td>
																			</tr >
																			<tr  class="celda02"> 
																			  
                          <td   align="left">Importe : </td>
																			  <td ><%=NumberFormat.getCurrencyInstance(Locale.US).format(det.getVtrDoubleDato5())%> 
																			  </td>
																			</tr>
																			<tr  class="celda02"> 
																			  
                          <td > Concepto : </td>
																			  <td ><%=det.getVtrStrDato7()%> </td>
																			</tr>
																			<tr  class="celda02"> 
																			  <td > Abono al Contrato de Inversi&oacute;n No.:</td>
																			  <td > <%=det.getVtrIntDato8()%> </td>
																			</tr>
																			<% if(!det.getVtrStrDato9().trim().equals("0")) 
																															{%>
																			<tr  class="celda02"> 
																			  <td > Invertir en Instrumento:</td>
																			  <td > <%=det.getVtrStrDato9()%> </td>
																			</tr>
																			<% } %>
                        <% 
                            if(Integer.parseInt((String)session.getAttribute("TpoCont")) == 1 ) {
                        %>     
                               <tr  class="celda02"> 
																			  <td > Persona que deposita:</td>
																			  <td > <%=det.getVtrStrDato10()%> </td>
															</tr>
                        
                        	<% } %>
                                      
															  </table>
                      <%
															break;
												case 2:
															%>
                      <table width="90%"  border="0" >
                        <tr> 
                          <td height="19" colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01"><b>DETALLE 
                            RETIRO</b></td>
                        </tr>
                        <tr  class="celda02"> 
                          <td width="34%" align="left" > Retiro del Contrato de 
                            Inversi&oacute;n:</td>
                          <td width="66%"><%=det.getVtrIntDato2()%> </td>
                        </tr >
                        <tr  class="celda02"> 
                          <td   align="left">Importe: </td>
                          <td ><%=NumberFormat.getCurrencyInstance(Locale.US).format(det.getVtrDoubleDato3())%> 
                          </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td > Concepto: </td>
                          <td ><%=det.getVtrStrDato4()%> </td>
                        </tr>
						<%
				  //JJR 17/02/2006
				  // ACUERDOS COMITE TECNICO
				  if(!det.getVtrStrDato13().equals(""))
				  			{
							%>						
                        <tr  class="celda02"> 
                          <td >Acuerdo Comite T&eacute;cnico:</td>
                          <td >Fecha de Sesion:&nbsp;<%=det.getVtrStrDato13()%> 
                            <br>
                            Tipo de Sesi&oacute;n: &nbsp; <%=det.getVtrStrDato14().equals("O")?"ORDINARIA":"EXTRAORDINARIA"%><br>
                            No. Acuerdo:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=det.getVtrStrDato15()%> 
                          </td>
                        </tr>
						<%}%>
                        <tr  class="celda02"> 
                          <td > Forma de Liquidaci&oacute;n:</td>
                          <td > <%=det.getVtrStrDato6()%> </td>
                        </tr>
                        <%
					if(det.getVtrIntDato5()==3)//Cheque
					 {
					%>
                        <tr  class="celda02"> 
                          <td >Banco:</td>
                          <td ><%=det.getVtrStrDato7()%> </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td > Beneficiario: </td>
                          <td ><%=det.getVtrStrDato10()%> </td>
                        </tr>
                        <%				
					 }
					if(det.getVtrIntDato5()==24)//Bancomer CIE
					 {
					%>
                  <tr  class="celda02"> 
                    <td > Referencia: </td>
                    <td ><%=det.getVtrStrDato16()%> </td>
                  </tr>
                  <%				
					 }           
					 					if(det.getVtrIntDato5()==5 ||  det.getVtrIntDato5()==19)//Speua(5) , TBC-BANCOMER(19)
					 {
					%>
                        <tr  class="celda02"> 
                          <td >Número de Cuenta:</td>
                          <td ><%=det.getVtrStrDato7()+" - "+det.getVtrStrDato8()%> 
                          </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td > Plaza: </td>
                          <td ><%=det.getVtrStrDato11()%> </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td > Titular de la Cuenta: </td>
                          <td ><%=det.getVtrStrDato10()%> </td>
                        </tr>
                        <%				
					 }
					 
					if(det.getVtrIntDato5()==18)//SIAC(BANXICO)
					 {

					%>
                        <tr  class="celda02"> 
                          <td >Número de Cuenta:</td>
                          <td ><%=det.getVtrStrDato9()%> </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td > Titular de la Cuenta: </td>
                          <td ><%=det.getVtrStrDato10()%> </td>
                        </tr>
                        <%								 
					 }
					if(det.getVtrIntDato5()==23)//SPEI
					 {
              detCuentas.setVtrIntDato1(Integer.parseInt((String)session.getAttribute("NumFid")!=null?(String)session.getAttribute("NumFid"):"0"));//NUMERO DE FIDEICOMISO
							detCuentas.setVtrStrDato1(det.getVtrStrDato8());//CLABE DE LA CUENTA
              //detCuentas.removerValores();
              detCuentas.querySelect(46);//se recuperan los datos de la cuenta
              if (detCuentas.hasData()){
					%>
                  <tr  class="celda02"> 
                    <td > Banco: </td>
                    <td ><%=detCuentas.getVtrStrDato6()%> </td>
                  </tr>          
                  <tr  class="celda02"> 
                    <td >Número de Cuenta:</td>
                    <td ><%=detCuentas.getVtrStrDato1()%> 
                    </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td > Plaza: </td>
                    <td ><%=detCuentas.getVtrStrDato2()%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td > Titular de la Cuenta: </td>
                    <td ><%=detCuentas.getVtrStrDato4()%> </td>
                  </tr>
                  <tr  class="celda02"> 
                    <td > RFC: </td>
                    <td ><%=detCuentas.getVtrStrDato5()%> </td>
                  </tr>
                  <%									
                  }
					 }
					%>
                        <%
				if(det.getVtrIntDato5()==21)//SWIFT
					 {
					%>
                        <tr class="celda02" > 
                          <td height="29" colspan="2" align="center" class="celda01" >Datos 
                            del Banco Domiciliario</td>
                        </tr>
                        <tr class="celda02" > 
                          <td  >Pa&iacute;s:</td>
                          <td > <%=detSWIFT.getVtrStrDato1()%> </td>
                        </tr>
                        <tr class="celda02" > 
                          <td  >Ciudad:</td>
                          <td > <%=detSWIFT.getVtrStrDato2()%> </td>
                        </tr>
                        <tr class="celda02" > 
                          <td   >Nombre del Banco:</td>
                          <td  > <%=detSWIFT.getVtrStrDato3()%> </td>
                        </tr>
                        <tr class="celda02" > 
                          <td >Plaza:</td>
                          <td > <%=detSWIFT.getVtrStrDato4()%> </td>
                        </tr>
                        <tr class="celda02" > 
                          <td   >Sucursal:</td>
                          <td  > <%=detSWIFT.getVtrStrDato5()%> </td>
                        </tr>
                        <tr class="celda02" > 
                          <td  >N&uacute;mero de Cuenta:</td>
                          <td  > <%=detSWIFT.getVtrStrDato6()%> </td>
                        </tr>
                        <tr class="celda02" > 
                          <td   >Branch:</td>
                          <td  > <%=detSWIFT.getVtrStrDato7()%> </td>
                        </tr>
                        <tr class="celda02" > 
                          <td >Moneda:</td>
                          <td  > <%=detSWIFT.getVtrStrDato8()%> </td>
                        </tr>
                        <tr class="celda02" > 
                          <td >Importe a transferir:</td>
                          <td > <%=NumberFormat.getCurrencyInstance(Locale.US).format(detSWIFT.getVtrDoubleDato9())%> 
                          </td>
                        </tr>
                        <tr class="celda02" > 
                          <td  >Código SWIFT o ABA :</td>
                          <td  > <%=detSWIFT.getVtrStrDato10()%> </td>
                        </tr>
                        <tr class="celda02" > 
                          <td height="29" colspan="2"  align="center" class="celda01" >Datos 
                            del Beneficiario</td>
                        </tr>
                        <tr class="celda02" > 
                          <td   >Nombre:</td>
                          <td  > <%=detSWIFT.getVtrStrDato11()%> </td>
                        </tr>
                        <tr class="celda02" > 
                          <td >Pa&iacute;s:</td>
                          <td > <%=detSWIFT.getVtrStrDato12()%> </td>
                        </tr>
                        <tr class="celda02" > 
                          <td  >Ciudad:</td>
                          <td > <%=detSWIFT.getVtrStrDato13()%> </td>
                        </tr>
                        <tr class="celda02" > 
                          <td   >Domicilio:</td>
                          <td > <%=detSWIFT.getVtrStrDato14()%> </td>
                        </tr>
                        <tr class="celda02" > 
                          <td >Tel&eacute;fono:</td>
                          <td  > <%=detSWIFT.getVtrStrDato15()%> </td>
                        </tr>
                        <%}//SWIFT%>
                      </table>
                      <%
															break;
												case 3:
														    %>
														  <table width="90%"  border="0" >
																	<tr> 
																	  
                          <td height="19" colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01"><b>DETALLE 
                            TRASPASO </b></td>
																	</tr>
																	<tr  class="celda02"> 
																	  <td width="28%" align="left" > Contrato de Inversi&oacute;n 
																		Origen:</td>
																	  <td width="72%"><%=det.getVtrIntDato2()%> </td>
																	</tr >
																	<tr  class="celda02"> 
																	  <td   align="left">Contrato de Inversi&oacute;n Destino: 
																	  </td>
																	  <td ><%=det.getVtrIntDato3()%> </td>
																	</tr>
																	<tr  class="celda02"> 
																	  
                          <td > Importe: </td>
																	  <td > <%=NumberFormat.getCurrencyInstance(Locale.US).format(det.getVtrDoubleDato4())%></td>
																	</tr>
																	<% if(!det.getVtrStrDato5().trim().equals("")) 
																													{%>
																	<tr  class="celda02"> 
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
                    </form></td>
                </tr>
                <tr> 
                  <td  >&nbsp; </td>
                </tr>
                <tr> 
                  <td align="right"><a href="FI_Instruccion9.jsp"><img src="imagenes/b_atras.gif" border=0 width="58"  height="23" align="right"></a></td>
                </tr>
                <tr> 
                  <td >&nbsp;</td>
                </tr>
                <tr> 
                  <td align="center"> <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:aceptar()" class="boton" <%=( !BD.esDeposito(request.getParameter("txtFolio")!=null?request.getParameter("txtFolio").trim():"0") &&  (tipoUsuario.equals("CLIENTE DEPOSITO") ||  tipoUsuario.equals("CLIENTE CONSULTA Y DEPOSITO") ))  ||  sCaptura.equals("SI") || bAutorizo || !bSaldo?"disabled":""%>> 
                    &nbsp; <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()" class="boton" <%=( !BD.esDeposito(request.getParameter("txtFolio")!=null?request.getParameter("txtFolio").trim():"0") &&  (tipoUsuario.equals("CLIENTE DEPOSITO") ||  tipoUsuario.equals("CLIENTE CONSULTA Y DEPOSITO") ))  ||  sCaptura.equals("SI") || bAutorizo?"disabled":""%>> 
                  </td>
                </tr>
              </table></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
