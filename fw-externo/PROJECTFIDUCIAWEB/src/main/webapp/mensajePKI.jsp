<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%

Locale currentLocale = new Locale("sp","US");
String sOperValida = "",Comprometido="";
  double  sImporteE=0,sImporteF=0,sImporteR=0,sImporteT=0;
   Comprometido=request.getParameter("comprometido")!=null?request.getParameter("comprometido"):"NO";
   int tipoSaldo=1;
     if(Comprometido.equals("SI"))
	 	{
		tipoSaldo=2;
		}

         sImporteE = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte1")!=null&&!request.getParameter("txtImporte1").trim().equals("")?request.getParameter("txtImporte1"):"0.00").doubleValue(); 
	     sImporteF = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte2")!=null&&!request.getParameter("txtImporte2").trim().equals("")?request.getParameter("txtImporte2"):"0.00").doubleValue(); 
		 sImporteR = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte3")!=null&&!request.getParameter("txtImporte3").trim().equals("")?request.getParameter("txtImporte3"):"0.00").doubleValue(); 
	     sImporteT = sImporteE +  sImporteF+sImporteR;

	  //validacion de saldos
	String Ejercicio=request.getParameter("cboEjercicio");
   	String Eje=request.getParameter("cboEje")!=null?request.getParameter("cboEje"):"-";	
	String Programa=request.getParameter("cboPrograma")!=null?request.getParameter("cboPrograma"):"-";
	String Proyecto=request.getParameter("cboProyecto")!=null?request.getParameter("cboProyecto"):"-";
	String Accion=request.getParameter("cboAccion")!=null?request.getParameter("cboAccion"):"-";
	double saldoCF =BD.getSaldoActual((String)session.getAttribute("NumFid"), BD.getNumContrato((String)session.getAttribute("NumFid"),"FEDERAL"));
	double saldoCE = BD.getSaldoActual((String)session.getAttribute("NumFid"),BD.getNumContrato((String)session.getAttribute("NumFid"),"ESTATAL"));
	double saldoCR =BD.getSaldoActual((String)session.getAttribute("NumFid"),BD.getNumContrato((String)session.getAttribute("NumFid"),"RENDIMIENTOS"));
	
	double SaldoF=BD.getSaldoRecursos((String)session.getAttribute( "NumFid" ),Ejercicio,Eje.substring(0,Eje.indexOf('-')), Programa.substring(0,Programa.indexOf('-')),Proyecto.substring(0,Proyecto.indexOf('-')), Accion.substring(0,Accion.indexOf('-')),"1",tipoSaldo);
	double SaldoE=BD.getSaldoRecursos((String)session.getAttribute( "NumFid" ),Ejercicio,Eje.substring(0,Eje.indexOf('-')), Programa.substring(0,Programa.indexOf('-')),Proyecto.substring(0,Proyecto.indexOf('-')), Accion.substring(0,Accion.indexOf('-')),"2",tipoSaldo);
	double SaldoR=BD.getSaldoRecursos((String)session.getAttribute( "NumFid" ),Ejercicio,Eje.substring(0,Eje.indexOf('-')), Programa.substring(0,Programa.indexOf('-')),Proyecto.substring(0,Proyecto.indexOf('-')), Accion.substring(0,Accion.indexOf('-')),"3",tipoSaldo);  
   //mensaje a firmar se forma la cadena en Mensaje PKI

 //mensaje a firmar
   String mensaje="\"INSTRUCCION DE RETIRO\\n\\n";   
       
   mensaje+="Folio de Operaci�n en Internet: "+sFolio;
   mensaje+="Folio de Movimiento Foseg "+sFolioFS;
   mensaje+="\\nFideicomiso: "+session.getAttribute( "Fideicomiso" );
   mensaje+="\\n\\nEjercicio: "+ request.getParameter("cboEjercicio");
    if(!request.getParameter("txtFormaLiq").equals("SWIFT") && request.getParameter("txtFormaLiq")!=null)
   {  
   mensaje+="\\n\\nOrigen de los Recursos: ";
   mensaje+="\\n\\tImporte  Estatal: "+ NumberFormat.getInstance(Locale.US).format(sImporteE);
   mensaje+="\\n\\tImporte Federal: "+ NumberFormat.getInstance(Locale.US).format(sImporteF);
   mensaje+="\\n\\tImporte Rendimientos: "+NumberFormat.getInstance(Locale.US).format(sImporteR);
   mensaje+="\\n\\tImporte Total del Retiro: "+ NumberFormat.getInstance(Locale.US).format(sImporteT);
   }
   mensaje+="\\n\\nAcuerdo del Comite: "+ request.getParameter("cboAcuerdosComiteTec");
   mensaje+="\\nComprometido:"+ (request.getParameter("comprometido")!=null?request.getParameter("comprometido"):"NO");   
   mensaje+="\\n\\nRegistro Presupuestal: ";
   mensaje+="\\n\\n\\tEje: "+ request.getParameter("cboEje");
   mensaje+="\\n\\tPrograma: "+ request.getParameter("cboPrograma");
   mensaje+="\\n\\tProyecto: "+ request.getParameter("cboProyecto");
    mensaje+="\\n\\tAccion: "+ request.getParameter("cboAccion");
	mensaje+="\\n\\nConcepto: "+ request.getParameter("txtMetaR");
	mensaje+="\\nPagos Multiples:"+ (request.getParameter("pagosM")!=null?"SI":"NO");   
    mensaje+="\\n\\nForma de liquidacion: "+(request.getParameter("txtFormaLiq")!=null?request.getParameter("txtFormaLiq"):"");
   if((request.getParameter("txtFormaLiq")).equals("Cheque")&&request.getParameter("txtFormaLiq")!=null && request.getParameter("pagosM")==null )
  	    { 
		  mensaje+="\\nCheque a cargo del banco: "+request.getParameter("cboBancoChequeR");        
    	  mensaje+="\\nTitular de la Cuenta: "+request.getParameter("txtBeneficiarioChequeR"); 
		 } 
   if((request.getParameter("txtFormaLiq")).equals("SPEUA")&&request.getParameter("txtFormaLiq")!=null)
   		{
		 mensaje+="\\nCuenta: "+request.getParameter("cboCuentaSpeuaR");
         mensaje+="\\nPlaza: "+request.getParameter("txtPlazaSpeuaR");   
         mensaje+="\\nTitular: "+request.getParameter("txtTitularSpeuaR");
		 } 
   if((request.getParameter("txtFormaLiq")).equals("SIAC(Banxico)")&&request.getParameter("txtFormaLiq")!=null && request.getParameter("pagosM")==null)
   	     { 
		 mensaje+="\\nCuenta: "+request.getParameter("cboCuentaSiacR");
         mensaje+="\\nTitular: "+request.getParameter("txtInstitucionSiacR"); 
		 }  
   if((request.getParameter("txtFormaLiq")).equals("TBC-Bancomer")&&request.getParameter("txtFormaLiq")!=null && request.getParameter("pagosM")==null)
        {
      mensaje+="\\nTitular: "+request.getParameter("cboCuentaTbcR");
      mensaje+="\\nPlaza: "+request.getParameter("txtPlazaTbcR");
      mensaje+="\\nTitular: "+request.getParameter("txtTitularTbcR");
        } 
		

//SE INCORPORA LA FORMA DE LIQUIDACION POR SPEI Y SE DESHABILTA SPEUA
   
   if(( (request.getParameter("txtFormaLiq")).equals("T E F") || (request.getParameter("txtFormaLiq")).equals("SPEI") ) &&  request.getParameter("txtFormaLiq")!=null && request.getParameter("pagosM")==null)
       {
      mensaje+="\\nCuenta: "+request.getParameter("txtCuentaPagoR");
      mensaje+="\\nPlaza: "+request.getParameter("txtPlazaPagoR");      
      mensaje+="\\nTitular: "+request.getParameter("txtTitularPagoR");
      mensaje+="\\nRFC: "+request.getParameter("txtRfcPagoR");
    } 
   if((request.getParameter("txtFormaLiq")).equals("SWIFT")&&request.getParameter("txtFormaLiq")!=null && request.getParameter("pagosM")==null)
   {  
      mensaje+="\\n\\nDATOS DOMICILIARIO:\\n";
      mensaje+="\\nBanco: "+request.getParameter("txtBancoDSwiftR");
      mensaje+="\\nPais: "+request.getParameter("cboPaisDSwiftR");      
      mensaje+="\\nCiudad: "+request.getParameter("txtCiudadDSwiftR");
      mensaje+="\\nPlaza: "+request.getParameter("txtPlazaSwiftR");
      mensaje+="\\nSucursal: "+request.getParameter("txtSucursalSwiftR");      
      mensaje+="\\nCuenta: "+request.getParameter("txtCuentaSwiftR");
      mensaje+="\\nBranch: "+request.getParameter("txtBranchSwiftR");      
      mensaje+="\\nMoneda Extranjera: "+request.getParameter("cboMonedaSwiftR");
     
	  mensaje+="\\n\\nOrigen de los Recursos: ";
   	  mensaje+="\\n\\tImporte  Estatal: "+ NumberFormat.getInstance(Locale.US).format(sImporteE);
   	  mensaje+="\\n\\tImporte Federal: "+ NumberFormat.getInstance(Locale.US).format(sImporteF);
  	  mensaje+="\\n\\tImporte Rendimientos: "+NumberFormat.getInstance(Locale.US).format(sImporteR);
   	  mensaje+="\\nImporte Total a Transferir en Moneda Extranjera: "+ NumberFormat.getInstance(Locale.US).format(sImporteT);
      mensaje+="\\n\\nCodigo SWIFT: "+request.getParameter("txtCodigoSwiftR");
      mensaje+="\\n\\nDATOS BENEFICIARIO\\n";
      mensaje+="\\nNombre: "+request.getParameter("txtNombreBSwiftR");   
      mensaje+="\\nPais: "+request.getParameter("cboPaisBSwiftR");
      mensaje+="\\nCiudad: "+request.getParameter("txtCiudadBSwiftR");   
      mensaje+="\\nDomicilio: "+request.getParameter("txtDomicilioBSwiftR");
      mensaje+="\\nTelefono: "+request.getParameter("txtTelefonoBSwiftR");  
   }
   mensaje+="\\n\\n\\nIntruccion Realizada por: "+session.getAttribute( "NomUser" );
   mensaje+="\";";
%>