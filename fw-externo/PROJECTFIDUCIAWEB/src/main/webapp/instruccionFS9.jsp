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

String fechaCaptura="";
String usuarioCaptura="";
String fechaFirma1="";
String usuarioFirma1="";
String stFirma1="";
boolean bSaldo=true;
boolean bAutorizo=false;
boolean bInstruccion=false;
int tipoInstruccion=Integer.parseInt(request.getParameter("txtTipoInstrucc")!=null?request.getParameter("txtTipoInstrucc").trim():"0");
int folio=Integer.parseInt(request.getParameter("txtFolio")!=null?request.getParameter("txtFolio").trim():"0");
int fiso=Integer.parseInt((String)session.getAttribute("NumFid")!=null?(String)session.getAttribute("NumFid"):"0");
String instruccion=request.getParameter("txtTipo")!=null?	request.getParameter("txtTipo"):"";
String formaLiq=(request.getParameter("txtTipo").equals("Retiro"))?request.getParameter("txtFormaLiq"):"";
String accion=request.getParameter("txtAccionSt")!=null?request.getParameter("txtAccionSt").trim():"";
String titulo="";
/*
accion = ACTIV0(AUTORIZACION DE LA INSTRUCCION) 
accion = CANCELADO (CANCELACION DE LA INSTRUCCION)
*/



//VERIFICA SI LA OPERACION NO HA SIDO  AUTORIZADA
if(instrucc.folioAutorizado(String.valueOf(fiso),String.valueOf(folio),tipoInstruccion))
	{
	session.setAttribute("msgError","La instruccion con Folio: "+ folio+ "<br>Ya esta autorizada");
	%>
	<jsp:forward page="FI_InstruccionFS9.jsp?st=1"/>    
	<%     
	}
	
	
switch(tipoInstruccion)
			{
			case 1:
					titulo="AVISO DE "+instruccion.toUpperCase();
					break;
			case 2://Retiro
					//En los retiros se permite el sobregiro del presupuestal
					titulo="SOLICITUD DE "+instruccion.toUpperCase();
					break;
			case 5://Compromiso
			case 7://Reprogramacion
					titulo="COMPROBANTE DE "+instruccion.toUpperCase();
					break;
					
			case 6://Cancelaci�n de Compromiso
					titulo="COMPROBANTE DE "+instruccion.toUpperCase();		
					break;
					
			case 8://Asignacion de Rendimientos
			
					titulo="COMPROBANTE DE "+instruccion.toUpperCase();
			 		break;								
 		  }//switch(tipo de instruccion)
		  	
//Valida los saldos disponibles si la operacion fue autorizada
if(accion.equals("ACTIVO") && tipoInstruccion!=1)	
	{
	String msgError="";
	double impFed= NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImpFed")!=null?request.getParameter("txtImpFed"):"0").doubleValue();
	double impEst= NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImpEst")!=null?request.getParameter("txtImpEst"):"0").doubleValue();
	double impRen= NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImpRen")!=null?request.getParameter("txtImpRen"):"0").doubleValue();
   
   String sFiso=String.valueOf(fiso);
   String Ejercicio=request.getParameter("txtEjercicio").trim();
   String Eje=request.getParameter("txtEje")!=null?request.getParameter("txtEje"):"-";	
   String Programa=request.getParameter("txtPrograma")!=null?request.getParameter("txtPrograma"):"-";
   String Proyecto=request.getParameter("txtProyecto")!=null?request.getParameter("txtProyecto"):"-";
   String Accion=request.getParameter("txtAccion")!=null?request.getParameter("txtAccion"):"-";
   
   Eje=Eje.substring(0,Eje.indexOf('-')).trim();
   Programa=Programa.substring(0,Programa.indexOf('-')).trim();
   Proyecto=Proyecto.substring(0,Proyecto.indexOf('-')).trim();
   Accion=Accion.substring(0,Accion.indexOf('-')).trim();		
   int iTipo=Integer.parseInt(request.getParameter("txtComprometido")!=null?request.getParameter("txtComprometido"):"1");//DISPONIBLE(N-1),COMPROMETIDO(S-2)
    
   switch(tipoInstruccion)
			{
			case 1:
					
					break;
			case 2://Retiro
					//En los retiros se permite el sobregiro del presupuestal
					
					if(impFed>0)
							{
							if(BD.getSaldoActual( sFiso , String.valueOf(BD.getNumContrato(sFiso,"FEDERAL")) )< impFed)
								msgError="<br>El saldo de Contrato de Inversi�n de Recursos Federales es Insuficiente";
						
							}
					if(impEst>0)
							{
							if(BD.getSaldoActual(sFiso, String.valueOf(BD.getNumContrato(sFiso,"ESTATAL")) )< impEst)
					       		msgError+="<br>El saldo de Contrato de Inversi�n de Recursos Estatales es Insuficiente";
						
						   }
					if(impRen>0)
							{
							if(BD.getSaldoActual( sFiso , String.valueOf(BD.getNumContrato(sFiso,"RENDIMIENTOS")) )< impRen)
								msgError+="<br>El saldo de Contrato de Inversi�n de Rendimientos es Insuficiente";
						
							}
					break;
			case 5://Compromiso
			case 7://Reprogramacion
					
					
					if(impFed>0)
							{
							if(BD.getSaldoRecursos(sFiso,Ejercicio,Eje, Programa,Proyecto, Accion,"1",1)<impFed)
								msgError+="<br>El saldo del Presupuesto de los Recursos Federales es Insuficiente";
							}
					if(impEst>0)
							{
							if(BD.getSaldoRecursos(sFiso,Ejercicio,Eje, Programa,Proyecto, Accion,"2",1)<impEst)
								msgError+="<br>El saldo del Presupuesto de los Recursos Estatales es Insuficiente";
						   }
					if(impRen>0)
							{
							if(BD.getSaldoRecursos(sFiso,Ejercicio,Eje, Programa,Proyecto, Accion,"3",1)<impRen)
								msgError+="<br>El saldo del Presupuesto de los Rendimientos es Insuficiente";
							}
					break;
					
			case 6://Cancelaci�n de Compromiso
					
					/*
					if(impFed>0)
							{
							if(BD.getSaldoRecursos(sFiso,Ejercicio,Eje, Programa,Proyecto, Accion,"1",2)<impFed)
								msgError+="<br>El saldo Comprometido del Presupuesto de los Recursos Federales es Insuficiente";
							}
					if(impEst>0)
							{
							if(BD.getSaldoRecursos(sFiso,Ejercicio,Eje, Programa,Proyecto, Accion,"2",2)<impEst)
								msgError+="<br>El saldo Comprometido del Presupuesto de los Recursos Estatales es Insuficiente";
						   }
					if(impRen>0)
							{
							if(BD.getSaldoRecursos(sFiso,Ejercicio,Eje, Programa,Proyecto, Accion,"1",2)<impRen)
								msgError+="<br>El saldo Comprometido del Presupuesto de los Rendimientos es Insuficiente";
							}
					*/		
					break;
					
			case 8://Asignacion de Rendimientos
			
					
					
					String contratoInv=BD.getNumContrato(sFiso,"RENDIMIENTOS");
					if(impRen>0 && BD.getRendimientosContrato(sFiso,Ejercicio,contratoInv)<impRen)
							{
							msgError+="<br>El Ejercicio "+Ejercicio+", no tiene los rendimientos por asignar";
							}
			     
			 		break;								
 		  }//switch(tipo de instruccion)
		  
		 if(!msgError.trim().equals(""))
				{
				msgError="No se puede autorizar la instruccion con Folio: "+folio+ msgError;
				session.setAttribute("msgError",msgError);
				%>
				<jsp:forward page="FI_InstruccionFS9.jsp?st=1"/>    
				<%
				}
				
				
	}//FIN DE VALIDACION DE SALDOS  	 
		
//Datos de autorizacion
strDatos[0]=String.valueOf(tipoInstruccion);
strDatos[1]=String.valueOf(folio);
strDatos[2]=String.valueOf(fiso);
strDatos[3]=fecha;
strDatos[4]=usuario;
strDatos[5]=accion;
strDatos[7]=formaLiq.trim();

//Datos de la bitacora
String[] strBitacora = new String[4];
strBitacora[0]=fecha;
strBitacora[1]=String.valueOf(folio);;
strBitacora[2]=(String)session.getAttribute("NumUser");
firmas.removerValores();
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
		strBitacora[3]=(accion.equals("ACTIVO")?instruccion+" en espera de autorizacion 2":" Cancelacion de "+instruccion )+" por Internet con Folio: " + folio;
		strDatos[6]="1";
		}
    if(stFirma1.equals("ACTIVO"))
		{
		System.out.println(usuarioFirma1);
		System.out.println(nomUsuario);
		if(usuarioFirma1.trim().equals( nomUsuario.trim() ))
			{
			session.setAttribute("msgError","Ya autorizaste la instruccion con Folio: "+ folio);
			%>
			<jsp:forward page="FI_InstruccionFS9.jsp?st=1"/>    
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
bInstruccion=instrucc.autorizacionFOSEG(strDatos,strBitacora);

if(!bInstruccion)
	{
	session.setAttribute("msgError","Error al autorizar la instruccion con Folio: "+ String.valueOf(folio)+ "<br>Favor de Intentar mas tarde, si el problema persiste consulte con su ejecutivo de cuenta ");
	%>
	<jsp:forward page="FI_InstruccionFS9.jsp?st=1"/>    
	<%     
	}

%>
         <HTML><HEAD>
		 <TITLE>Instrucciones - FiduciaWeb Movil</TITLE>
         <META content="text/html; charset=windows-1252" http-equiv=Content-Type>
         <META content="P�gina Principal" name=O>
         <link href="styles/bancomext.css" rel="stylesheet" type="text/css">
         <script language="JavaScript" type="text/JavaScript">

   function regresar()
	{
	parent.location="FI_InstruccionFS9.jsp";
	}

function imprimir()
	{
	window.print();
	parent.location="FI_InstruccionFS9.jsp";
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
</script> 

 </HEAD>
         <BODY vLink=#052206 leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
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
			<%=accion.equals("ACTIVO") && stFirma1.equals("ESPERA")?titulo+"<br>EN ESPERA DE LA 2da. FIRMA DE AUTORIZACION":""%> 
			<%=accion.trim().equals("CANCELADO")?"COMPROBANTE DE CANCELACION DE "+titulo:""%> 
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
<table width="70%"  border="1" bordercolor="#FFFFFF" align="center">
  <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
    <td  class="subtitulo"  colspan="2">Folio de Operaci&oacute;n: <%=request.getParameter("txtFolio")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td width="38%"  class="texto">Fideicomiso:</td>
    <td width="62%" class="texto"><%= session.getAttribute( "Fideicomiso" )%></td>
  </tr>
    <tr bordercolor="#000000"    class="texto"> 
      <td ><%=usuarioCaptura.equals(usuarioFirma1)?"Realizada  y autorizada por:":"Realizada por:"%> 
         </td>
      <td > <%=usuarioCaptura%> </td>
    </tr>
    <%if(!usuarioCaptura.equals(usuarioFirma1) && !usuarioFirma1.equals("ESPERA1") && !usuarioFirma1.equals(""))
		{%>
    <tr bordercolor="#000000"    class="texto"> 
      <td > Autorizada por: </td>
      <td> <%=usuarioFirma1%> </td>
    </tr>
      <%}%>
  <%
                        if(request.getParameter("txtTipo").equals("Deposito"))
                        {
                        %>
  <tr bordercolor="#000000"> 
    <td class="texto">Tipo:</td>
    <td class="texto"><%=request.getParameter("txtTipo")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td class="texto">Concepto:</td>
    <td class="texto"><%=request.getParameter("txtConcepto")%></td>
  </tr>
  
  <tr bordercolor="#000000"> 
    <td class="texto">Persona que deposita:</td>
    <td class="texto"><%=request.getParameter("txtPersona")%></td>
  </tr>
  
  <tr bordercolor="#000000"> 
    <td class="texto">Importe:</td>
    <td class="texto"><%=request.getParameter("txtImporte")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td class="texto">N&uacutemero de Cuenta:</td>
    <td class="texto"><%=request.getParameter("txtCuenta")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td class="texto">Dep&oacutesito al Cto de Inversi�n:</td>
    <td class="texto"><%=request.getParameter("txtCtoInv")%></td>
  </tr>
  <%
                           if(request.getParameter("txtInstrume")!=null)
                           {
                        %>
  <tr bordercolor="#000000"> 
    <td class="texto">Instrumento:</td>
    <td class="texto"><%=request.getParameter("txtInstrume")%></td>
  </tr>
  <%
                           }
                        }
                        else
                        {
                           if(request.getParameter("txtTipo").equals("Reprogramacion"))
                           {
                           %>
  <tr bordercolor="#000000"> 
    <td class="texto" align="center" colspan="2">Registro Presupuestal Origen</td>
  </tr>
  <%
                           }
                           else 
                           {
                           %>
  <tr bordercolor="#000000"> 
    <td class="texto" align="center" colspan="2">Registro Presupuestal</td>
  </tr>
  <%
                           }
                           %>
  <tr bordercolor="#000000"> 
    <td class="texto">Ejercicio</td>
    <td class="texto"><%=request.getParameter("txtEjercicio")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Eje</td>
    <td  class="texto"><%=request.getParameter("txtEje")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td class="texto">Programa</td>
    <td class="texto"><%=request.getParameter("txtPrograma")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Proyecto</td>
    <td  class="texto"><%=request.getParameter("txtProyecto")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td class="texto">Accion</td>
    <td class="texto"><%=request.getParameter("txtAccion")%></td>
  </tr>
  <%
                           if(request.getParameter("txtTipo").equals("Reprogramacion"))
                           {
                           %>
  <tr bordercolor="#000000"> 
    <td class="texto" align="center" colspan="2">Registro Presupuestal Destino</td>
  </tr>
  <tr bordercolor="#000000"> 
    <td class="texto">Ejercicio</td>
    <td class="texto"><%=request.getParameter("txtEjercicio1")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Eje</td>
    <td  class="texto"><%=request.getParameter("txtEje1")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td class="texto">Programa</td>
    <td class="texto"><%=request.getParameter("txtPrograma1")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Proyecto</td>
    <td  class="texto"><%=request.getParameter("txtProyecto1")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td class="texto">Accion</td>
    <td class="texto"><%=request.getParameter("txtAccion1")%></td>
  </tr>
  <%
                           }
                           %>
  <tr bordercolor="#000000"> 
    <td class="texto" align="center" colspan="2">Importe</td>
  </tr>
<%if (request.getParameter("txtComprometido")!=null)
			{%>
  <tr bordercolor="#000000">
    <td  class="texto">Comprometido:</td>
    <td  class="texto"><%=(request.getParameter("txtComprometido").equals("1"))?"NO":"SI"%></td>
  </tr>
  			<%}%>	
  <tr bordercolor="#000000"> 
    <td  class="texto">Importe de Origen Federal</td>
    <td  class="texto"><%=NumberFormat.getCurrencyInstance(Locale.US).format(Double.parseDouble(request.getParameter("txtImpFed")))%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Importe de origen Estatal</td>
    <td  class="texto"><%=NumberFormat.getCurrencyInstance(Locale.US).format(Double.parseDouble(request.getParameter("txtImpEst")))%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Importe de Origen Rendimientos</td>
    <td  class="texto"><%=NumberFormat.getCurrencyInstance(Locale.US).format(Double.parseDouble(request.getParameter("txtImpRen")))%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Importe Total:</td>
    <td  class="texto">$<%=request.getParameter("txtImporte")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td class="texto" align="center" colspan="2">Detalle</td>
  </tr>
  <%
                              if (request.getParameter("txtAcuerdo")!=null && !request.getParameter("txtAcuerdo").equals(""))
                              {
                           %>
  <tr bordercolor="#000000"> 
    <td  class="texto">Acuerdo de Comite o Carta de Instrucci&oacuten</td>
    <td  class="texto"><%=request.getParameter("txtAcuerdo")%></td>
  </tr>
  <%
                              }
                              if(request.getParameter("txtTipo").equals("Retiro"))
                              {
                                 if(request.getParameter("txtPM").equals("SI"))
                                 {
                           %>
  <tr bordercolor="#000000"> 
    <td  class="texto">Pagos Multiples</td>
    <td  class="texto">SI</td>
  </tr>
  <%
                                 }
                           %>
  <tr bordercolor="#000000"> 
    <td  class="texto">Forma de Liquidaci&oacuten</td>
    <td  class="texto"><%=request.getParameter("txtFormaLiq")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Concepto o Meta:</td>
    <td  class="texto"><%=request.getParameter("txtConcepto")%></td>
  </tr>
  <%
                                 if(request.getParameter("txtFormaLiq").equals("Cheque"))
                                 {
                           %>
  <tr bordercolor="#000000"> 
    <td  class="texto">Banco:</td>
    <td  class="texto"><%=request.getParameter("txtBanco")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Nombre del Beneficiario:</td>
    <td  class="texto"><%=request.getParameter("txtBene")%></td>
  </tr>
  <%
                                 }
                                 else if(request.getParameter("txtFormaLiq").equals("SPEUA"))
                                 {
                           %>
  <tr bordercolor="#000000"> 
    <td  class="texto">Banco:</td>
    <td  class="texto"><%=request.getParameter("txtBanco")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">N&uacutemero de Cuenta:</td>
    <td  class="texto"><%=request.getParameter("txtCuenta")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Plaza:</td>
    <td  class="texto"><%=request.getParameter("txtPlaza")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Titular:</td>
    <td  class="texto"><%=request.getParameter("txtBene")%></td>
  </tr>
  <%
                                 }
                                 else if(request.getParameter("txtFormaLiq").equals("SIAC(Banxico)"))
                                 {
                           %>
  <tr bordercolor="#000000"> 
    <td  class="texto">N&uacutemero de Cuenta:</td>
    <td  class="texto"><%=request.getParameter("txtCuenta")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Titular:</td>
    <td  class="texto"><%=request.getParameter("txtBene")%></td>
  </tr>
  <%
                                 }
                                 else if(request.getParameter("txtFormaLiq").equals("TBC-Bancomer"))
                                 {
                                    if(request.getParameter("txtPM")!=null && request.getParameter("txtPM").equals("NO"))
                                    { 
                           %>
  <tr bordercolor="#000000"> 
    <td  class="texto">N&uacutemero de Cuenta:</td>
    <td  class="texto"><%=request.getParameter("txtCuenta")%> </td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Plaza:</td>
    <td  class="texto"><%=request.getParameter("txtPlaza")%> </td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Titular:</td>
    <td  class="texto"><%=request.getParameter("txtBene")%> </td>
  </tr>
  <%
                                    }
                                 }
                                 else if(request.getParameter("txtFormaLiq").equals("Transferencia Electr�nica de Fondos") ||  request.getParameter("txtFormaLiq").equals("SPEI") ) //JJR 12/04/2005  SE INCORPORA SPEI COMO NUEVA FORMA DE LIQUIDACION
                                 {
                                    if(request.getParameter("txtPM")!=null && request.getParameter("txtPM").equals("NO"))
                                    {
                           %>
  <tr bordercolor="#000000"> 
    <td  class="texto">Banco:</td>
    <td  class="texto"><%=request.getParameter("txtBanco")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">N&uacutemero de Cuenta:</td>
    <td  class="texto"><%=request.getParameter("txtCuenta")%>&nbsp;</td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Plaza:</td>
    <td  class="texto"><%=request.getParameter("txtPlaza")%>&nbsp;</td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Titular:</td>
    <td  class="texto"><%=request.getParameter("txtBene")%>&nbsp;</td>
  </tr>
  <%
                                    }
                                 }
                                 else if(request.getParameter("txtFormaLiq").equals("SWIFT"))
                                 {
                           %>
  <tr bordercolor="#000000"> 
    <td  class="texto" align="left" colspan="2">Banco Domiciliario:</td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Pa&iacutes:</td>
    <td  class="texto"><%=request.getParameter("txtPaisD")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Ciudad:</td>
    <td  class="texto"><%=request.getParameter("txtCiudadD")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Banco:</td>
    <td  class="texto"><%=request.getParameter("txtBancoD")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Plaza:</td>
    <td  class="texto"><%=request.getParameter("txtPlazaD")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">N&uacutemero de Cuenta:</td>
    <td  class="texto"><%=request.getParameter("txtCuenta")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto" > Branch:</td>
    <td  class="texto"><%=request.getParameter("txtBranch")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Moneda:</td>
    <td  class="texto"><%=request.getParameter("txtMoneda")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">C&oacutedigo SWIFT o ABA para EUA:</td>
    <td  class="texto"><%=request.getParameter("txtCodigoS")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto" align="left" colspan="2">Datos del Beneficiario:</td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Nombre:</td>
    <td  class="texto"><%=request.getParameter("txtBene")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Ciudad:</td>
    <td  class="texto"><%=request.getParameter("txtCiudadB")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Domicilio:</td>
    <td  class="texto"><%=request.getParameter("txtDomi")%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto">Tel&eacutefono:</td>
    <td  class="texto"><%=request.getParameter("txtTel")%></td>
  </tr>
  <%
                                 }
                              }
                           }
                           %>
</table>
                  </td>
               </tr>
               <tr> 
                  <td align="center">
                     <table width="70%" height="38" align="center">
        <tr>
          <td class="texto" align="left">&nbsp;</td>
        </tr>
        <tr> 
          
        <td class="textoNegrita"  align="center"><%=accion.trim().equals("CANCELADO")?"Cancelada":"Autorizada"%> por:</td>
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
        <tr>
          <td >&nbsp;</td>
        </tr>
		  <%
  if(tipoInstruccion==1 &&  accion.equals("ACTIVO") && (stFirma1.equals("ACTIVO")|| stFirma1.equals("") ))
        {%>
          <tr> 
          <td ><p class="subtitulo" align="justify">La aplicaci&oacute;n de este 
              dep&oacute;sito est&aacute; sujeta a la recepci&oacute;n de los 
              recursos en la cuenta indicada y a su notificaci&oacute;n por este 
              medio, a m&aacute;s tardar a las 12:30 horas de su fecha. </p>
            <p class="subtitulo" align="justify">Los dep&oacute;sitos recibidos 
              y notificados despu�s de ese horario se invertir&aacute;n al siguiente 
              d&iacute;a h&aacute;bil. En caso de requerir inversiones en valores 
              gubernamentales, la notificaci&oacute;n deber&aacute; realizarse 
              antes de las 10:30 horas de su fecha. </p></td>
        </tr>

  <%}%>

        <%
        if(tipoInstruccion==2 &&  accion.equals("ACTIVO") && (stFirma1.equals("ACTIVO")|| stFirma1.equals("") )  )
        {
        %>
        <tr> 
          <td > 
            <%
            if(request.getParameter("txtFormaLiq").equals("Cheque")) 
            {
            %>
               <p class="subtitulo" align="justify"> La entrega de los cheques solicitados 
                 antes de las 12:30 horas se realizar&aacute; a partir de las 10:30 
                 horas del siguiente d&iacute;a h&aacute;bil, contra la entrega de 
                 este documento (impreso) en el &aacute;rea de Cajas, ubicada en 
                 Insurgentes Sur 1971, Torre IV planta baja. </p>
               <p class="subtitulo" align="justify"> Las solicitudes recibidas fuera 
                 de dicho horario ser&aacute;n consideradas como recibidas al siguiente 
                 d&iacute;a h&aacute;bil. </p>
            <%
            }
            else
            {
            %>
               
          <p class="subtitulo" align="justify"> Las solicitudes de retiro con 
            forma de liquidaci&oacute;n SPEI, SIAC-Banxico, TBC-Bancomer y Transferencia 
            Electr&oacute;nica de Fondos, recibidas hasta las12:30 horas, ser&aacute;n 
            operadas al siguiente d&iacute;a h&aacute;bil. En caso de que la forma 
            de liquidaci&oacute;n sea SWIFT el plazo ser&aacute; de 48 horas en 
            Estados Unidos y Canad&aacute; y de 72 horas en el resto del mundo. 
          </p>
               <p class="subtitulo" align="justify"> Las solicitudes recibidas fuera 
                 de dicho horario ser&aacute;n consideradas como recibidas al siguiente 
                 d&iacute;a h&aacute;bil. </p>
            <%
            }
            %>
          </td>
        </tr>
        <%
        }
        %>
        <tr> 
          <td>&nbsp;</td>
        </tr>
        <tr> 
          <td >&nbsp;</td>
        </tr>
        <tr> 
          
        <td  class="texto" align="center"> <input type="button" name="Imprimir"  class="boton" value="Imprimir"   onClick="javascript:imprimir();" > 
          &nbsp; <input type="button" name="Salir"  class="boton" value="Salir"   onClick="javascript:regresar();" ></td>
        </tr>
      </table>
                  </td>
               </tr>
            </table>
      
   </BODY>
         </HTML>