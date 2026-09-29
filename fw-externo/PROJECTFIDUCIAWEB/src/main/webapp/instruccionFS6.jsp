<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.util.*,java.text.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.nInstrucciones"/>
<%@ include file="sesionInstrucc.jsp" %>
<%@ include file="parametrosPKI.jsp" %>
<%@ include file="pki.jsp" %>
<%
		//VERIFICA QUE NO EXISTA UNA INSTRUCCION CON ESTE FOLIO
		
      	if(BD.existeFolio(request.getParameter("txtFolio"),6))
		{
		session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Por Favor, registrala nuevamente");
		%>
		<jsp:forward page="FI_Instrucciones.jsp"/>    
		<%     
		}


   DecimalFormat dfFormat = new DecimalFormat("###,##0.00");
   String sFiso=(String)session.getAttribute("NumFid");
   String Ejercicio=request.getParameter("cboEjercicio").trim();
   String Eje=request.getParameter("cboEje")!=null?request.getParameter("cboEje"):"-";	
   String Programa=request.getParameter("cboPrograma")!=null?request.getParameter("cboPrograma"):"-";
   String Proyecto=request.getParameter("cboProyecto")!=null?request.getParameter("cboProyecto"):"-";
   String Accion=request.getParameter("cboAccion")!=null?request.getParameter("cboAccion"):"-";
   String  acuerdo=request.getParameter("txtAcuerdo")!=null?request.getParameter("txtAcuerdo"):"null";
   String  concepto= (request.getParameter("txtTipoC").equals("C") && request.getParameter("txtConcepto")!=null && !request.getParameter("txtConcepto").equals(""))?request.getParameter("txtConcepto"):"null";
   
   double  sImporteF = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte1")!=null && !request.getParameter("txtImporte1").trim().equals("")?request.getParameter("txtImporte1"):"0").doubleValue(); 
   double  sImporteE =  NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte2")!=null && !request.getParameter("txtImporte2").trim().equals("")?request.getParameter("txtImporte2"):"0").doubleValue(); 
   double  sImporteR = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte3")!=null && !request.getParameter("txtImporte3").trim().equals("")?request.getParameter("txtImporte3"):"0").doubleValue(); 
	System.out.println(request.getParameter("txtImporte1"));
	System.out.println(request.getParameter("txtImporte2"));
	System.out.println(request.getParameter("txtImporte3"));
   Eje=Eje.substring(0,Eje.indexOf('-')).trim();
   Programa=Programa.substring(0,Programa.indexOf('-')).trim();
   Proyecto=Proyecto.substring(0,Proyecto.indexOf('-')).trim();
   Accion=Accion.substring(0,Accion.indexOf('-')).trim();
   
    int tipoInstruccionFOSEG=Integer.parseInt(request.getParameter("txtTipoC").equals("C")?"5":"6");
   //se validan los saldos disponibles
    if(sCaptura.equals("NO"))
		{       	
		int    iTipo=Integer.parseInt(request.getParameter("txtTipoC").equals("C")?"1":"2");
		String tipoSaldo=request.getParameter("txtTipoC").equals("C")?"":" Comprometidos ";
		String msgError="";
		if(sImporteF>0)
			{
			if(BD.getSaldoRecursos(sFiso,Ejercicio,Eje, Programa,Proyecto, Accion,"1",iTipo)<sImporteF)
			msgError+="<br>El saldo del Presupuesto de los Recursos Federales "+tipoSaldo+"es Insuficiente";
			}
		if(sImporteE>0)
			{
			if(BD.getSaldoRecursos(sFiso,Ejercicio,Eje, Programa,Proyecto, Accion,"2",iTipo)<sImporteE)
			msgError+="<br>El saldo del Presupuesto de los Recursos Estatales "+tipoSaldo+"es Insuficiente";
			}
		if(sImporteR>0)
			{
			if(BD.getSaldoRecursos(sFiso,Ejercicio,Eje, Programa,Proyecto, Accion,"3",iTipo)<sImporteR)
			msgError+="<br>El saldo del Presupuesto de los Rendimientos "+tipoSaldo+"es Insuficiente";
			}
			
		if(!msgError.trim().equals(""))
						{
						session.setAttribute("msgError","No se registro la operacion "+ msgError);
						%>
						<jsp:forward page="FI_Instrucciones.jsp"/>    
						<%     
						}
	 }
	 
	  DecimalFormat num = new DecimalFormat("############0.00");	
      boolean bInstruccion=false;
      boolean bFirmasMan=BD.firmasMancomunadas((String)session.getAttribute("NumFid"));
	  
	 if(sCaptura.equals("NO"))
		{       
/**************************************************************Firma Digital***********************************************************/
   %>		
   <%@ include file="firmaDigital.jsp" %>
   <%  
/**************************************************************Fin Firma Digital********************************************************/

		}
	 
      String[] presupuesto = new String[3];
	  if(sImporteF>0)
     	 presupuesto[0] ="7000,"+Eje+","+Programa+","+Proyecto+","+Accion+",0,"+(String)session.getAttribute("NumFid")+","+Ejercicio+",1,"+Folio+","+fecha+","+ num.format(sImporteF)+","+request.getParameter("txtTipoC")+",N,null,"+acuerdo+","+request.getParameter("txtTipoC")+"," + sCaptura;
	  else
	   presupuesto[0] ="";

  	  if(sImporteE>0)
	  	presupuesto[1] ="7000,"+Eje+","+Programa+","+Proyecto+","+Accion+",0,"+(String)session.getAttribute("NumFid")+","+Ejercicio+",2,"+Folio+","+fecha+","+ num.format(sImporteE)+","+request.getParameter("txtTipoC")+",N,null,"+acuerdo+","+request.getParameter("txtTipoC")+"," + sCaptura;
	  else
	   presupuesto[1] ="";
	System.out.println( presupuesto[1] );

   	  if(sImporteR>0)
  	      presupuesto[2] ="7000,"+Eje+","+Programa+","+Proyecto+","+Accion+",0,"+(String)session.getAttribute("NumFid")+","+Ejercicio+",3,"+Folio+","+fecha+","+ num.format(sImporteR)+","+request.getParameter("txtTipoC")+",N,null,"+acuerdo+","+request.getParameter("txtTipoC")+"," + sCaptura;
 	  else
	   presupuesto[2] ="";
	 String[] bitacora = new String[4];
	 bitacora[0]=fecha;
	 bitacora[1]=Folio;
	 bitacora[2]=(String)session.getAttribute("NumUser");
	 bitacora[3]="Compromiso por Internet con Folio: "+Folio+(sCaptura.equals("SI") || bFirmasMan ?"  y en espera de autorizaci�n":"");//+detalleBit;


   	 String[] firmas = new String[5];
	 firmas[0]=sCaptura.equals("SI")?"1":"2";
	 firmas[1]=Folio;
	 firmas[2]=(String)session.getAttribute("NumFid");
	 firmas[3]=(String)session.getAttribute("NumUser");
	 firmas[4]=fecha;


     bInstruccion=BD.insertaInstruccFoseg(presupuesto,bitacora,firmas,tipoInstruccionFOSEG);
	 if(!bInstruccion)
					  {
					  session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Intenta nuevamente");
						%>
						<jsp:forward page="FI_Instrucciones.jsp"/>    
						<%       
						}
	session.setAttribute("operacion",bInstruccion?"La Instruccion con Folio:"+Folio+ " fue registrada orrectamnete<br>Error al imprimir tu comprobante de la instruccion<br>Informale a tu ejecutivo de Cuenta":"La operacion no fue registrada, Intenta Nuevamente");		
				
%>
         <HTML><HEAD>
		 <TITLE>Instrucciones - FiduciaWeb Movil</TITLE>
         <META content="text/html; charset=windows-1252" http-equiv=Content-Type>
         <META content="P�gina Principal" name=O>
         <link href="styles/bancomext.css" rel="stylesheet" type="text/css">
         <script language="JavaScript" type="text/JavaScript">

         function instrucciones()
         {
            parent.location='FI_Instrucciones.jsp'
         }

         function imprimir()
         {
            window.print();
            parent.location='FI_Instrucciones.jsp';
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
            <%String tipoInstruccion="";
                     if( request.getParameter("txtTipoC").equals("C"))
                        tipoInstruccion="COMPROMISO DE RECURSOS";
                     else
					   tipoInstruccion="CANCELACI�N DE COMPROMISO DE RECURSOS";
                  %>
            <%=sCaptura.equals("NO") && !bFirmasMan?"COMPROBANTE DE "+tipoInstruccion:""%> 
            <%=sCaptura.equals("SI") && !bFirmasMan? tipoInstruccion+"<br>EN ESPERA DE AUTORIZACION":""%> 
            <%=sCaptura.equals("SI") && bFirmasMan? tipoInstruccion+"<br>EN ESPERA DE LA PRIMERA FIRMA DE AUTORIZACION":""%> 
            <%=sCaptura.equals("NO") && bFirmasMan? tipoInstruccion+"<br>EN ESPERA DE LA SEGUNDA FIRMA DE AUTORIZACION":""%> 
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
<table width="70%" border="0" align="center">
               <tr>
                  <td align="center">
                     <table width="100%"  border="1" bordercolor="#FFFFFF">
        <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
          <td  class="subtitulo"  colspan="2">Folio de Operaci&oacute;n: <%=Folio%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td width="22%"  class="texto">Fideicomiso:</td>
          <td width="78%" class="texto"><%= session.getAttribute( "Fideicomiso" )%><font class="subtitulo">&nbsp; 
            </font></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto">Ejercicio</td>
          <td class="texto"><%=request.getParameter("cboEjercicio")%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td colspan="2"  class="texto" >Registro Presupuestal:</td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto" align="right">Eje:</td>
          <td  class="texto"><%=request.getParameter("cboEje")%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto" align="right">Programa:</td>
          <td class="texto"><%=request.getParameter("cboPrograma")%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto" align="right">Proyecto:</td>
          <td  class="texto"><%=request.getParameter("cboProyecto")%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto" align="right">Accion:</td>
          <td class="texto"><%=request.getParameter("cboAccion")%></td>
        </tr>
        <tr bordercolor="#000000">
          <td  class="texto">Origen:</td>
          <td  class="texto">Importes:</td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto" align="right"> Federal:</td>
          <td  class="texto"><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteF)%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto" align="right">Estatal:</td>
          <td  class="texto"><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteE)%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto" align="right"> Rendimientos:</td>
          <td  class="texto"><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteR)%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto" align="right"> 
            <%
                                 if( request.getParameter("txtTipoC").equals("C"))
                                    out.print("Importe Total a Comprometer");
                                 else
                                    out.print("Importe Total a Cancelar como Compromiso");
                              %>
          </td>
          <td  class="texto"><%=NumberFormat.getCurrencyInstance(Locale.US).format((sImporteF+sImporteE+sImporteR))%></td>
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
                           if (request.getParameter("txtTipoC").equals("C") && request.getParameter("txtConcepto")!=null && !request.getParameter("txtConcepto").equals(""))
                           {
                        %>
        <tr bordercolor="#000000"> 
          <td  class="texto">Concepto</td>
          <td  class="texto"><%=request.getParameter("txtConcepto")%></td>
        </tr>
        <%
                           }
                        %>
      </table>
                  </td>
               </tr>
               <tr> 
                  <td align="center">
                     <table width="100%" >
        <tr>
          <td class="texto" align="left">&nbsp;</td>
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
          <td class="textoNegrita" >&nbsp;</td>
        </tr>

        <tr> 
          <td >&nbsp;</td>
        </tr>        
        <tr> 
          <td >&nbsp;</td>
        </tr>
        <tr> 
          <td  class="texto" align="center"> <input type="button" name="Imprimir"  class="boton" value="Imprimir"   onClick="javascript:imprimir()" > 
            &nbsp; <input type="button" name="Salir"  class="boton" value="Salir"   onClick="javascript:instrucciones()" ></td>
        </tr>
      </table>
                  </td>
               </tr>
            </table>
         <p>&nbsp;</p>
         </BODY>
         </HTML>

