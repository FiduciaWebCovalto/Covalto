<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.util.*,java.text.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.nInstrucciones"/>
<jsp:useBean id="BDRet"  class="com.bancomext.negocio.RetirosDB"/>
<%@ include file="sesionInstrucc.jsp" %>
<%@ include file="pki.jsp"%>
<%@ include file="parametrosPKI.jsp" %>
<%
	//VERIFICA QUE NO EXISTA UNA INSTRUCCION CON ESTE FOLIO
	if(BD.existeFolio(request.getParameter("txtFolio"),2) || BD.existeFolio(request.getParameter("txtFolioFS"),22))
		{
		session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Por Favor, registrala nuevamente");
		%>
		<jsp:forward page="FI_Instrucciones.jsp"/>    
		<%     
		}
    DecimalFormat num = new DecimalFormat("############0.00");
   
   String[] sData = new String[60];
   String sFolio = request.getParameter("txtFolio");
   String sFolioFS = request.getParameter("txtFolioFS");
   String Ejercicio=request.getParameter("cboEjercicio").trim();
   String Eje=request.getParameter("cboEje")!=null?request.getParameter("cboEje"):"-";	
   String Programa=request.getParameter("cboPrograma")!=null?request.getParameter("cboPrograma"):"-";
   String Proyecto=request.getParameter("cboProyecto")!=null?request.getParameter("cboProyecto"):"-";
   String Accion=request.getParameter("cboAccion")!=null?request.getParameter("cboAccion"):"-";
   Eje=Eje.substring(0,Eje.indexOf('-')).trim();
   Programa=Programa.substring(0,Programa.indexOf('-')).trim();
   Proyecto=Proyecto.substring(0,Proyecto.indexOf('-')).trim();
   Accion=Accion.substring(0,Accion.indexOf('-')).trim();		
   String comprometido=(request.getParameter("comprometido")!=null &&request.getParameter("comprometido").equals("SI"))?"S":"N";
   double sImporteE=0,sImporteF=0,sImporteR=0,sImporteT=0,SaldoE=0,SaldoF=0,SaldoR=0;
  
     if (request.getParameter("cboFormaR")!=null && request.getParameter("cboFormaR").equals("21") && request.getParameter("pagosM")==null)
		   {
			  sImporteE = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte1S")!=null&&!request.getParameter("txtImporte1S").trim().equals("")?request.getParameter("txtImporte1S"):"0.00").doubleValue(); 
			  sImporteF = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte2S")!=null&&!request.getParameter("txtImporte2S").trim().equals("")?request.getParameter("txtImporte2S"):"0.00").doubleValue(); 
			  sImporteR = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte3S")!=null&&!request.getParameter("txtImporte3S").trim().equals("")?request.getParameter("txtImporte3S"):"0.00").doubleValue(); 
			  sImporteT = sImporteE +  sImporteF+sImporteR;
		   }
   else
		   {
			  sImporteE = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte1")!=null&&!request.getParameter("txtImporte1").trim().equals("")?request.getParameter("txtImporte1"):"0").doubleValue(); 
			  sImporteF = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte2")!=null&&!request.getParameter("txtImporte2").trim().equals("")?request.getParameter("txtImporte2"):"0").doubleValue(); 
			  sImporteR =NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte3")!=null&&!request.getParameter("txtImporte3").trim().equals("")?request.getParameter("txtImporte3"):"0").doubleValue(); 
			  sImporteT = sImporteE +  sImporteF+sImporteR;
		   }
   
      //se validan los saldos disponibles
    if(sCaptura.equals("NO")){       	
	   String sFiso= (String)session.getAttribute("NumFid") ;
	   if(sImporteF>0)
			if(BD.getSaldoActual(sFiso, String.valueOf(BD.getNumContrato(sFiso,"FEDERAL")) )< sImporteF)
						{
						session.setAttribute("msgError","Tu operaci�n no fue registrada<br>El saldo en el contrato de inversi�n Federal es insuficiente");
						%>
						<jsp:forward page="FI_Instrucciones.jsp"/>    
						<%     
						}
   if(sImporteE>0)
   		if(BD.getSaldoActual(sFiso, String.valueOf(BD.getNumContrato(sFiso,"ESTATAL")) )< sImporteE)
			{
				session.setAttribute("msgError","Tu operaci�n no fue registrada<br>El saldo en el contrato de inversi�n Estatal es insuficiente");
				%>
					<jsp:forward page="FI_Instrucciones.jsp"/>    
				<%     
			}
   if(sImporteR>0)
   		if(BD.getSaldoActual(sFiso, String.valueOf(BD.getNumContrato(sFiso,"RENDIMIENTOS")) )< sImporteR)
					{
					session.setAttribute("msgError","Tu operaci�n no fue registrada<br>El saldo en el contrato de inversi�n de Rendimientos es insuficiente");
					%>
					<jsp:forward page="FI_Instrucciones.jsp"/>    
					<%     
					}
		}			
			
if(sCaptura.equals("NO"))
	   {
/**************************************************************Firma Digital***********************************************************/
   %>		
   <%@ include file="firmaDigital.jsp" %>
   <%  
/**************************************************************Fin Firma Digital********************************************************/
	   }
							
   sData[0] = fecha;
   sData[1] = sFolio;
   sData[2] = (String)session.getAttribute("NumFid");
   sData[3] = BD.getNumContrato((String)session.getAttribute("NumFid"),"ESTATAL");   
   sData[4] =  num.format(sImporteT)+"";//   request.getParameter("txtImporteR")
   sData[5] = "NO";
   sData[6] = request.getParameter("txtMetaR");
   sData[7] = (request.getParameter("cboFormaR")).trim();
   sData[10] = "";
   //DATOS COMITE TECNICO
   sData[22] = request.getParameter("cboAcuerdosComiteTec") ;
   sData[56] = request.getParameter("txtFechaSesion") ;
   sData[57] = request.getParameter("txtTipoSesion") ;
   sData[58] = request.getParameter("txtNoAcuerdo") ;
   
   sData[23] = num.format(sImporteF)+"";
   sData[24] = num.format(sImporteE)+"";
   sData[25] = num.format(sImporteR)+"";
   sData[26] = BD.getNumContrato(sData[2],"FEDERAL");
//   sData[26] = sData[3];
   sData[27] = BD.getNumContrato(sData[2],"ESTATAL");
   sData[28] =BD.getNumContrato(sData[2],"RENDIMIENTOS");
   
	// Concepto
	sData[48] = (request.getParameter("txtPrograma")).trim();
	// Tipo de liquidacion
	sData[49] = (request.getParameter("txtFormaLiq")).trim();
	// Numero de operacion
	sData[50] = (request.getParameter("txtOperacion")).trim();

	// Numero Persona
	sData[51] = (request.getParameter("txtNumPersona")).trim();
	
	String sEntidad[][]= BDRet.getDataFormas(8,(String)session.getAttribute("NumFid"), sData[3]);
	sData[52]=sEntidad[0][0];
	sData[53]=sEntidad[0][1];
	
	// Numero de persona
	if(sData[51].equals("2"))
		sData[47] = "TERCERO";
	else
		sData[47] = "BENEFICIARIO";				

   //Retiro en espera de autorizacion
   sData[30]=sCaptura;
   sData[31] = (String)session.getAttribute( "NumUser" ) ;
   
  
   if((request.getParameter("cboFormaR")).equals("3") && request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) {
      sData[8] = request.getParameter("txtBeneficiarioChequeR") ;
      sData[9] = request.getParameter("cboBancoChequeR") ;
   }
   	 
   if((request.getParameter("cboFormaR")).equals("SPEUA") && request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) {
		sData[8] = request.getParameter("txtCveBancoSpeuaR");
		sData[10] = request.getParameter("cboCuentaSpeuaR") ;
		sData[9] = sData[10].substring(sData[10].indexOf('|')+2,sData[10].lastIndexOf('|')-1); //Banco
		sData[10] = sData[10].substring(sData[10].lastIndexOf('|')+2,sData[10].length()); //Cuenta
		sData[11] = request.getParameter("txtPlazaSpeuaR") ;
		sData[12] = request.getParameter("txtTitularSpeuaR") ;
   }

   
   if((request.getParameter("cboFormaR")).equals("18") && request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) {
      sData[8] = request.getParameter("cboCuentaSiacR") ;
      sData[9] = request.getParameter("txtInstitucionSiacR") ;
      sData[54] = request.getParameter("txtNomBanco");
   }

  
   if((request.getParameter("cboFormaR")).equals("19") && request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null)  {
      sData[8] = request.getParameter("txtPlazaTbcR") ;
      sData[9] = request.getParameter("cboCuentaTbcR").substring((request.getParameter("cboCuentaTbcR")).indexOf('|')+2,(request.getParameter("cboCuentaTbcR")).length()); ;
      sData[10] = request.getParameter("txtTitularTbcR") ;
      sData[54] = request.getParameter("txtNomBanco");
   }
 
   if( ( (request.getParameter("cboFormaR")).equals("20")  || (request.getParameter("cboFormaR")).equals("23") ) && request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null)  
   {		
      sData[8] = request.getParameter("txtCveBancoPagoR") ;
      sData[10] = request.getParameter("txtCuentaPagoR") ;
      sData[9] = sData[10].substring(sData[10].indexOf('|')+2,sData[10].lastIndexOf('|')-1); //Banco
      sData[10] = sData[10].substring(sData[10].lastIndexOf('|')+2,sData[10].length() ); //Cuenta
      sData[11] = request.getParameter("txtTitularPagoR") ;
      sData[12] = request.getParameter("txtRfcPagoR") ;
      sData[13] = request.getParameter("txtPlazaPagoR");
   }

   if(((request.getParameter("cboFormaR")).equals("24")  || (request.getParameter("cboFormaR")).equals("25") || (request.getParameter("cboFormaR")).equals("26") ) && request.getParameter("pagosM")==null)  
   {		
      sData[8] = request.getParameter("txtCveBancoPagoR");//"0";
      sData[10] = request.getParameter("txtCuentaPagoR");
      sData[9] = sData[10].substring(sData[10].indexOf('|')+2,sData[10].lastIndexOf('|')-1);//Banco
      if(request.getParameter("cboFormaR").equals("24"))
      	sData[10] = sData[10].substring(sData[10].lastIndexOf('|')+2,sData[10].length()) + "," + request.getParameter("txtReferencia");//Cuenta + Referencia
      else
      	sData[10] = sData[10].substring(sData[10].lastIndexOf('|')+2,sData[10].length()) + ",0";
      sData[11] = request.getParameter("txtTitularPagoR");
      sData[12] = request.getParameter("txtRfcPagoR");
      sData[13] = request.getParameter("txtPlazaPagoR");//"0";
      
    System.out.println("sData[8]: " + sData[8]);
	System.out.println("sData[10]: " + sData[10]);
	System.out.println("sData[9]: " + sData[9]);
	System.out.println("sData[10]: " + sData[10]);
	System.out.println("sData[11]: " + sData[11]);
	System.out.println("sData[12]: " + sData[12]);
	System.out.println("sData[13]: " + sData[13]);
   }

   if((request.getParameter("cboFormaR")).equals("21")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
   {               
      sData[8] = request.getParameter("txtBancoDSwiftR") ;
      sData[9] = request.getParameter("cboPaisDSwiftR") ;

      sData[10] = request.getParameter("txtPlazaSwiftR") + "," + request.getParameter("txtCodigoSWIFT");

      sData[11] = request.getParameter("txtCiudadDSwiftR") ;
      sData[12] = request.getParameter("txtSucursalSwiftR") ;
      sData[13] = request.getParameter("txtCuentaSwiftR") ;
      sData[14] = request.getParameter("txtBranchSwiftR") ;
      sData[15] = request.getParameter("cboMonedaSwiftR") ;
      sData[16] = request.getParameter("txtCodigoSwiftR") ;
      sData[17] = request.getParameter("txtNombreBSwiftR") ;
      sData[18] = request.getParameter("cboPaisBSwiftR") ;
      sData[19] = request.getParameter("txtCiudadBSwiftR") ;
      sData[20] = request.getParameter("txtDomicilioBSwiftR") ;
      sData[21] = request.getParameter("txtTelefonoBSwiftR") ;
      if(sCaptura.equals("NO"))
      {
         sCaptura  = "SW";
      }
   }

   if(request.getParameter("pagosM")!=null && request.getParameter("pagosM").equals("S")&&request.getParameter("cboFormaR")!=null) 
	   {
		  sData[7] ="PM";

		  sData[29]=request.getParameter("cboFormaR"); 
	   }
   
   
   //ESTATAL		
   if(sImporteE>0)
      sData[41] ="7000,"+Eje+","+Programa+","+Proyecto+","+Accion+",0,"+(String)session.getAttribute("NumFid")+","+Ejercicio+",2,"+sFolioFS+","+fecha+","+num.format(sImporteE)+",R,"+comprometido+","+ sFolio+","+request.getParameter("cboAcuerdosComiteTec")+",null," + sCaptura;
   else 
   	  sData[41] ="";
   //FEDERAL
   if(sImporteF>0)
      sData[42] ="7000,"+Eje+","+Programa+","+Proyecto+","+Accion+",0,"+(String)session.getAttribute("NumFid")+","+Ejercicio+",1,"+sFolioFS+","+fecha+","+num.format(sImporteF)+",R,"+comprometido+","+ sFolio+","+request.getParameter("cboAcuerdosComiteTec")+",null," + sCaptura;		
   else 
   	  sData[42] ="";
	  
   //RENDIMIENTOS
   if(sImporteR>0) 
          sData[43] ="7000,"+Eje+","+Programa+","+Proyecto+","+Accion+",0,"+(String)session.getAttribute("NumFid")+","+Ejercicio+",3,"+sFolioFS+","+fecha+","+num.format(sImporteR)+",R,"+comprometido+","+ sFolio+","+request.getParameter("cboAcuerdosComiteTec")+",null," + sCaptura;
   else 
   	     sData[43] ="";


      boolean bInstruccion=false;
      boolean bFirmasMan=BD.firmasMancomunadas((String)session.getAttribute("NumFid"));

   	 String[] bitacora = new String[4];
	 bitacora[0]=fecha;
	 bitacora[1]=sFolio;
	 bitacora[2]=(String)session.getAttribute("NumUser");
	 bitacora[3]="Retiro FOSEG por Internet con Folio: "+sFolio+(sCaptura.equals("SI") || bFirmasMan ?"  y en espera de autorizaci�n":"");//+detalleBit;
	 String[] firmas = new String[5];
	 firmas[0]= sCaptura.equals("SI")?"1":"2";
	 firmas[1]= sFolio;
	 firmas[2]= (String)session.getAttribute("NumFid");
	 firmas[3]= (String)session.getAttribute("NumUser");
	 firmas[4]= fecha;	 
	 bInstruccion=BD.insertaRetiro(sData,bitacora,firmas,null);
 
  
   if(!bInstruccion)
					  {
					  session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Intenta nuevamente");
						%>
						<jsp:forward page="FI_Instrucciones.jsp"/>    
						<%       
						}

	session.setAttribute("operacion",bInstruccion?"La Instruccion con Folio:"+Folio+ " fue registrada orrectamnete<br>Error al imprimir tu comprobante de la instruccion<br>Informale a tu ejecutivo de Cuenta":"La operacion no fue registrada, Intenta Nuevamente");		
%>
          
<HTML>
<HEAD>
<TITLE>Instrucciones - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link href="styles/bancomext.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
function regresar()
{
 	parent.location="FI_Instrucciones.jsp";

}
function imprimir()
{
   window.print();
	parent.location="FI_Instrucciones.jsp";

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
            <%=sCaptura.equals("NO") && !bFirmasMan?"SOLICITUD DE RETIRO":""%> 
			<%=sCaptura.equals("SI") && !bFirmasMan?"SOLICITUD DE RETIRO EN ESPERA DE AUTORIZACION":""%> 
			<%=sCaptura.equals("SI") && bFirmasMan?"SOLICITUD DE RETIRO EN ESPERA DE LA 1ra.  FIRMA DE AUTORIZACION":""%> 
			<%=sCaptura.equals("NO") && bFirmasMan?"SOLICITUD DE RETIRO EN ESPERA DE LA 2da. FIRMA DE AUTORIZACION":""%> 
          </td>
        </tr>
      </table></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td ><hr size="2"></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  align="right" class="textoNegrita">Fecha: <%=BD.getFecha()+"&nbsp;&nbsp;  "+BD.getHora() +" hrs."%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  align="right" class="textoNegrita">&nbsp;</td>
  </tr>
</table>
<table width="70%" border="0" align="center">
  <tr> 
    <td align="center"> <table width="100%"  border="1" bordercolor="#FFFFFF">
        <tr bordercolor="#006699"> 
          <td  colspan="2" bordercolor="#000000" bgcolor="#CCCCCC" class="subtitulo">Folio 
            de Operaci&oacute;n:<%=sFolio%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td width="29%" class="texto">Fideicomiso:</td>
          <td width="71%" class="texto"><%= session.getAttribute( "Fideicomiso" ) %></td>
        </tr>
        <tr bordercolor="#000000"  class="texto"> 
          <td> Ejercicio:</td>
          <td> <%=request.getParameter("cboEjercicio")!=null?request.getParameter("cboEjercicio"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000"  class="texto"> 
          <td height="29" colspan="2" align="center">Registro Presupuestal</td>
        </tr>
        <tr bordercolor="#000000"  class="texto"> 
          <td align="right">Eje:</td>
          <td ><%=request.getParameter("cboEje")!=null?request.getParameter("cboEje"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000"  class="texto"> 
          <td align="right">Programa:</td>
          <td ><%=request.getParameter("cboPrograma")!=null?request.getParameter("cboPrograma"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000"  class="texto" > 
          <td align="right"> Proyecto: </td>
          <td ><%=request.getParameter("cboProyecto")!=null?request.getParameter("cboProyecto"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000"  class="texto"> 
          <td align="right">Accion:</td>
          <td><%=request.getParameter("cboAccion")!=null?request.getParameter("cboAccion"):""%> 
          </td>
        </tr>
        <%if (request.getParameter("cboFormaR")!=null && !request.getParameter("cboFormaR").equals("21"))
	   	{%>
        <tr bordercolor="#000000"  class="texto"> 
          <td>Comprometido:</td>
          <td ><%=request.getParameter("comprometido")!=null?request.getParameter("comprometido"):""%></td>
        </tr>
        <tr bordercolor="#000000"  class="texto"> 
          <td>Origen:</td>
          <td >Importe: </td>
        </tr>
        <tr bordercolor="#000000"  > 
          <td align="right"  class="texto2">Estatal: </td>
          <td class="texto" ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteE)%></td>
        </tr>
        <tr bordercolor="#000000" > 
          <td align="right"  class="texto2">Federal:</td>
          <td class="texto" ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteF)%></td>
        </tr>
        <tr bordercolor="#000000"  > 
          <td align="right"  class="texto2" > Rendimientos: </td>
          <td class="texto" ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteR)%></td>
        </tr>
        <tr bordercolor="#000000" > 
          <td align="right"  class="subtitulo">Importe Total del Retiro:</td>
          <td class="texto" ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteT)%></td>
        </tr>
        <%}%>
        <tr bordercolor="#000000"  class="texto"> 
          <td>Acuerdo del Comite T&eacute;cnico:</td>
          <td >
		 <%=request.getParameter("cboAcuerdosComiteTec")%>
          </td>
        </tr>
        <tr bordercolor="#000000"  class="texto"> 
          <td>En espera de autorizaci�n:</td>
          <td > <%=sCaptura.equals("SI")||bFirmasMan?"SI":"NO"%></td>
        </tr>
        <tr bordercolor="#000000"  class="texto"> 
          <td>Concepto:</td>
          <td ><%=request.getParameter("txtMetaR")!=null?request.getParameter("txtMetaR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000"  class="texto" > 
          <td > Pagos Multiples: </td>
          <td > <%=(request.getParameter("pagosM")!=null && request.getParameter("pagosM").equals("S"))?"SI":"N0"%>&nbsp; 
          </td>
        </tr>
        <tr bordercolor="#000000"  class="texto"> 
          <td >Forma de Liquidaci&oacute;n:</td>
          <td><%=request.getParameter("txtFormaLiq")!=null?request.getParameter("txtFormaLiq"):""%> 
          </td>
        </tr>
        <%
     		
			if((request.getParameter("cboFormaR")).equals("3")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
      {%>
        <tr bordercolor="#000000" > 
          <td  class=texto>Nombre del Beneficiario:</td>
          <td class="texto" >
		               <% if(request.getParameter("txtBeneficiarioChequeR")!=null)
                  out.print(request.getParameter("txtBeneficiarioChequeR"));%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td  class=texto >Cheque a Cargo de:</td>
          <td  class="texto"> <%=request.getParameter("cboBancoChequeR")!=null?request.getParameter("cboBancoChequeR"):""%> 
          </td>
        </tr>
        <%}
if((request.getParameter("cboFormaR")).equals("SPEUA")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
      {   
   	%>
        <tr bordercolor="#000000" > 
          <td class=texto>Plaza:</td>
          <td  class="texto"><%=request.getParameter("txtPlazaSpeuaR")!=null?request.getParameter("txtPlazaSpeuaR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td height="24"  class=texto>N&uacute;mero de Cuenta:</td>
          <td  class="texto"><%=request.getParameter("cboCuentaSpeuaR")!=null?request.getParameter("cboCuentaSpeuaR").substring((request.getParameter("cboCuentaSpeuaR")).indexOf('|')+2,(request.getParameter("cboCuentaSpeuaR")).length()):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td  class=texto >Titular de la Cuenta:</td>
          <td  class="texto"><%=request.getParameter("txtTitularSpeuaR")!=null?request.getParameter("txtTitularSpeuaR"):""%> 
          </td>
        </tr>
        <% }
  
   if((request.getParameter("cboFormaR")).equals("18")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
      {%>
        <tr bordercolor="#000000" > 
          <td  class=texto > N&uacute;mero de Cuenta Banxico:</td>
          <td  class="texto"><%=request.getParameter("cboCuentaSiacR")!=null?request.getParameter("cboCuentaSiacR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td class=texto>Instituci&oacute;n o Entidad Beneficiaria:</td>
          <td class="texto"><%=request.getParameter("txtInstitucionSiacR")!=null?request.getParameter("txtInstitucionSiacR"):""%> 
          </td>
        </tr>
        <%
      }
	
	if((request.getParameter("cboFormaR")).equals("19")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
      {%>
        <tr bordercolor="#000000" > 
          <td  class=texto >Plaza:</td>
          <td  class="texto"><%=request.getParameter("txtPlazaTbcR")!=null?request.getParameter("txtPlazaTbcR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td  class=texto >N&uacute;mero de Cuenta:</td>
          <td class="texto"> <%=request.getParameter("cboCuentaTbcR")!=null?request.getParameter("cboCuentaTbcR").substring((request.getParameter("cboCuentaTbcR")).indexOf('|')+2,(request.getParameter("cboCuentaTbcR")).length()):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td  class=texto >Titular </td>
          <td  class="texto"> <%=request.getParameter("txtTitularTbcR")!=null?request.getParameter("txtTitularTbcR"):""%> 
          </td>
        </tr>
        <% }
			
	if(((request.getParameter("cboFormaR")).equals("20") || (request.getParameter("cboFormaR")).equals("23") ) && request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
      {%>
        <tr bordercolor="#000000" > 
          <td  class=texto >N&uacute;mero de Cuenta:</td>
          <td  class="texto"><%=request.getParameter("txtCuentaPagoR")!=null?request.getParameter("txtCuentaPagoR").substring(request.getParameter("txtCuentaPagoR").indexOf('|')+2,request.getParameter("txtCuentaPagoR").length()):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td  class=texto >Plaza:</td>
          <td class="texto"><%=request.getParameter("txtPlazaPagoR")!=null?request.getParameter("txtPlazaPagoR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td  class=texto >Titular de la Cuenta:</td>
          <td  class="texto"><%=request.getParameter("txtTitularPagoR")!=null?request.getParameter("txtTitularPagoR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td  class=texto >RFC:</td>
          <td  class="texto" ><%=request.getParameter("txtRfcPagoR")!=null?request.getParameter("txtRfcPagoR"):""%> 
          </td>
        </tr>
        <% }
		if((request.getParameter("cboFormaR")).equals("21")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
      {%>
        <tr bordercolor="#000000" > 
          <td height="29" colspan="2" align="center" class=texto>Datos del Banco 
            Domiciliario</td>
        </tr>
        <tr bordercolor="#000000" > 
          <td class=texto >Pa&iacute;s:</td>
          <td class="texto"><%=request.getParameter("cboPaisDSwiftR")!=null?request.getParameter("cboPaisDSwiftR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td class=texto >Ciudad:</td>
          <td class="texto"><%=request.getParameter("txtCiudadDSwiftR")!=null?request.getParameter("txtCiudadDSwiftR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td  class=texto >Nombre del Banco:</td>
          <td  class="texto"><%=request.getParameter("txtBancoDSwiftR")!=null?request.getParameter("txtBancoDSwiftR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td class=texto>Plaza:</td>
          <td class="texto"><%=request.getParameter("txtPlazaSwiftR")!=null?request.getParameter("txtPlazaSwiftR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td  class=texto >Sucursal:</td>
          <td class="texto" ><%=request.getParameter("txtSucursalSwiftR")!=null?request.getParameter("txtSucursalSwiftR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td  class=texto>N&uacute;mero de Cuenta:</td>
          <td  class="texto"><%=request.getParameter("txtCuentaSwiftR")!=null?request.getParameter("txtCuentaSwiftR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td  class=texto >Branch:</td>
          <td  class="texto"><%=request.getParameter("txtBranchSwiftR")!=null?request.getParameter("txtBranchSwiftR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td class=texto>Moneda:</td>
          <td  class="texto"><%=request.getParameter("cboMonedaSwiftR")!=null?request.getParameter("cboMonedaSwiftR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000"  class="texto"> 
          <td>Comprometido:</td>
          <td > <%=request.getParameter("comprometido")!=null?request.getParameter("comprometido"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000"  class="texto"> 
          <td>Origen:</td>
          <td >Importe: </td>
        </tr>
        <tr bordercolor="#000000"  > 
          <td align="right"  class="texto2">Estatal: </td>
          <td class="texto" ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteE)%></td>
        </tr>
        <tr bordercolor="#000000" > 
          <td align="right"  class="texto2">Federal:</td>
          <td class="texto" ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteF)%></td>
        </tr>
        <tr bordercolor="#000000"  > 
          <td align="right"  class="texto2" > Rendimientos: </td>
          <td class="texto" ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteR)%></td>
        </tr>
        <tr bordercolor="#000000" > 
          <td align="right"  class="subtitulo">Importe Total a Transferir:</td>
          <td class="texto" ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteT)%></td>
        </tr>
        <tr bordercolor="#000000" > 

          <td  class=texto>C�digo SWIFT ABA o&nbsp;IBAN :</td>
          <td  class="texto"><%=request.getParameter("txtCodigoSwiftR")!=null?request.getParameter("txtCodigoSwiftR"):""%>&nbsp;<%=request.getParameter("txtCodigoSWIFT")!=null?request.getParameter("txtCodigoSWIFT"):""%>

          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td height="29" colspan="2"  align="center" class=texto>Datos del Beneficiario</td>
        </tr>
        <tr bordercolor="#000000" > 
          <td  class=texto >Nombre:</td>
          <td  class="texto"> <%=request.getParameter("txtNombreBSwiftR")!=null?request.getParameter("txtNombreBSwiftR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td class=texto>Pa&iacute;s:</td>
          <td class="texto"> <%=request.getParameter("cboPaisBSwiftR")!=null?request.getParameter("cboPaisBSwiftR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td class=texto >Ciudad:</td>
          <td class="texto"><%=request.getParameter("txtCiudadBSwiftR")!=null?request.getParameter("txtCiudadBSwiftR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td  class=texto >Domicilio:</td>
          <td class="texto"> <%=request.getParameter("txtDomicilioBSwiftR")!=null?request.getParameter("txtDomicilioBSwiftR"):""%> 
          </td>
        </tr>
        <tr bordercolor="#000000" > 
          <td class=texto>Tel&eacute;fono:</td>
          <td  class="texto"><%=request.getParameter("txtTelefonoBSwiftR")!=null?request.getParameter("txtTelefonoBSwiftR"):""%> 
          </td>
        </tr>
        <% } %>
      </table></td>
  </tr>
  <tr> 
    <td align="center"> <table width="100%" >
        <tr> 
          <td >&nbsp;</td>
        </tr>

        <tr> 
          <td class="textoNegrita" align="center"><%=sCaptura.equals("SI")?"Capturada":"Autorizada"%> por:</td>
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
          <td > 	  
			  <%
        if (sCaptura.equals("NO") && !bFirmasMan)
        {      
		
		if((request.getParameter("cboFormaR")).equals("3")) 
		{%><br>
            <p class="subtitulo" align="justify"> La entrega de los cheques solicitados 
              antes de las 12:30 horas se realizar&aacute; a partir de las 10:30 
              horas del siguiente d&iacute;a h&aacute;bil, contra la entrega de 
              este documento (impreso) en el &aacute;rea de Cajas, ubicada en 
              Insurgentes Sur 1971, Torre IV planta baja. </p>
            <p class="subtitulo" align="justify"> Las solicitudes recibidas fuera 
              de dicho horario ser&aacute;n consideradas como recibidas al siguiente 
              d&iacute;a h&aacute;bil. </p>
            <%}
		else{%>
            <p class="subtitulo" align="justify"> Las solicitudes de retiro con 
              forma de liquidaci&oacute;n SPEUA, SIAC-Banxico, TBC-Bancomer y 
              Transferencia Electr&oacute;nica de Fondos, recibidas hasta las 
              12:30 horas, ser&aacute;n operadas al siguiente d&iacute;a h&aacute;bil. 
              En caso de que la forma de liquidaci&oacute;n sea SWIFT el plazo 
              ser&aacute; de 48 horas en Estados Unidos y Canad&aacute; y de 72 
              horas en el resto del mundo. </p>
            <p class="subtitulo" align="justify"> Las solicitudes recibidas fuera 
              de dicho horario ser&aacute;n consideradas como recibidas al siguiente 
              d&iacute;a h&aacute;bil. </p>
            <%}%>
          </td>
        </tr>
        <tr> 
          <td>&nbsp;</td>
        </tr>
        <%
        }
        %>
        <tr> 
          <td  align="center"> <input type="button" name="Imprimir"  class="boton" value="Imprimir"   onClick="javascript:imprimir()" > 
            &nbsp; <input type="button" name="Salir"  class="boton" value="Salir"   onClick="javascript:regresar()" > 
          </td>
        </tr>
      </table></td>
  </tr>
</table>
</BODY>
</HTML>


