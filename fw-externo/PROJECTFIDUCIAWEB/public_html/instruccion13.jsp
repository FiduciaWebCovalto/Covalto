<%@ page import="java.util.*,java.text.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.nInstruccionesMDC"/>
<jsp:useBean id="BD3"  class="com.bancomext.negocio.nInstrucciones"/>
<jsp:useBean id="BD2"  class="com.bancomext.negocio.nFiducia"/>
<jsp:useBean id="consultas"  class="com.bancomext.negocio.nConsultasMDC"/>
<%@ include file="paramSeguridad.jsp" %>
<%@ include file="pki.jsp" %>
<%@ include file="configura_bus.jsp" %>
<script language="JavaScript" SRC='scripts/ApiSendEmail.js'></script>

<%   
  
  
	//VERIFICA QUE NO EXISTA UNA INSTRUCCION CON ESTE FOLIO
	if(BD3.existeFolio(request.getParameter("txtFolio"),1))
		{
		session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Por Favor, registrala nuevamente");
		%>
		<jsp:forward page="FI_InstruccionesN.jsp"/>    
		<%     
		}
                      
    String fechaValor = request.getParameter("fechaValor")!=null?request.getParameter("fechaValor"):fecha; 		   
   boolean bInstruccion=false;
   boolean bFirmasMan=BD.firmasMancomunadas((String)session.getAttribute("NumFid"));
   String numOper=request.getParameter("txtnumOper")==null?"":(String)request.getParameter("txtnumOper");
   String DescOper=request.getParameter("txtConceptoOperacion")==null?"":(String)request.getParameter("txtConceptoOperacion");
   String diasAtencion=request.getParameter("txtdiasAtencion")==null?"":(String)request.getParameter("txtdiasAtencion");


	String sBienes=request.getParameter("txtBienes")==null?"":request.getParameter("txtBienes");
	String sEdificio=request.getParameter("txtEdificio")==null?"":request.getParameter("txtEdificio");
	String nCajas=request.getParameter("txtNumCajas")==null?"":(String)request.getParameter("txtNumCajas");
	String[] sEtiquetas=request.getParameterValues("txtEtiquetas");
	String[] sCajas=request.getParameterValues("field_name");	
        String[] sFechas=request.getParameterValues("sFechas");	
	String[] sSelect=(String[]) session.getAttribute("sArrselect");//request.getParameterValues("field_name3");	
	String[] sIndice=request.getParameterValues("txtIndiceEtiqueta");	
	String[] sConceptos=request.getParameterValues("txtConceptos");	
	String[] sIndiceInterno=null;  
        if(sSelect!=null){
            for (String selects : sSelect) {
                System.out.println("registro sArrselect:"+selects);
            }
        }
        session.removeAttribute("sArrselect");
	int iDatos=0;
   System.out.println("Numero de Etiquetas instruccion13"+String.valueOf(sEtiquetas.length));
   String detalleBit="";
  String Folio = request.getParameter("txtFolio");
  
   String[] bitacora = new String[5];
	 bitacora[0]=fecha;
	 bitacora[1]=Folio;
	 bitacora[2]=(String)session.getAttribute("NumUser");
	 bitacora[3]="Otros Servicios por Internet con Folio: "+Folio+(sCaptura.equals("SI") || bFirmasMan ?"  y en espera de autorizaci�n":"")+detalleBit;
         bitacora[4]=(String)session.getAttribute("username");
	 
	 String[] firmas = new String[5];
	 firmas[0]= sCaptura.equals("SI")?"1":"2";
	 firmas[1]= Folio;
	 firmas[2]= (String)session.getAttribute("NumFid");
	 firmas[3]= (String)session.getAttribute("NumUser");
	 firmas[4]= fecha;	 
   
   String folioRcp = BD2.getFolio(22);
   String folioAgenda = BD2.getFolio(1);
   
   String[] Datos = new String[22];
   Datos[0] = folioRcp; //Folio Recepci�n
   Datos[1] = Folio; //Folio
   Datos[2] = request.getParameter("sNumEtapa");//Etapa en la que se encuentra la solicitud
   Datos[3] = (String)session.getAttribute("NumFid"); //Fideicomiso
   Datos[4] = DescOper;//concepto de la solicitud
   Datos[17] = fecha;   //fecha
   Datos[18] = numOper;   //fecha
   //Inserta Dep�sito  
   bInstruccion = BD.insertaOtrosServicios(Datos,bitacora,firmas);  
     %>
      <script>
        sendEmail( "<%=(String)session.getAttribute("username")%>",
        <%=(String)request.getParameter("txtFolio")%> ,'OTROS SERVICIOS',
        "0",
        "<%=(String)request.getParameter("txtConceptoOperacion")%>");
      </script>
      <%	
      if(!bInstruccion)
		  {
		  session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Intenta nuevamente");
	  		%>
			<jsp:forward page="FI_InstruccionesN.jsp"/>    
			<%       
			}
			
	session.setAttribute("operacion",bInstruccion?"La Instruccion con Folio:"+Folio+ " fue registrada orrectamnete<br>Error al imprimir tu comprobante de la instruccion<br>Informale a tu ejecutivo de Cuenta":"La operacion no fue registrada, Intenta Nuevamente");		

%>
<HTML><HEAD>
<TITLE>Instrucciones - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>

<link href="styles/nafin.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">

function instrucciones()
	{
	parent.location='FI_InstruccionesN.jsp'
	}

function imprimir()
{

window.print();
parent.location='FI_InstruccionesN.jsp';
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
<jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
<div class="table-responsive">
    <table id="fisosDisponibles"  class="table table-responsive table-hover">
            <thead class="table-primary" align="center">
                <tr>
                    <th>&nbsp;</th>
                    <th><h1 class="display-3">DIRECCION FIDUCIARIA</h1></th>
                    <th>&nbsp;</th>
                </tr>
                <tr>
                    <th>&nbsp;</th>
                    <th><h1 class="display-4">AVISO DE SOLICITUD DE INSTRUCCION NO MONETARIA</h1></th>
                    <th>&nbsp;</th>
                </tr>
            </thead>
    </table>
    <table id="fisosDisponibles"  class="table table-responsive table-hover">
        <thead class="table-primary" align="left">
            <tr>
                <th>&nbsp;</th>
                <th>Fecha de Operaci&oacute;n: <%=fechaValor%></th>
                <th>&nbsp;</th>
            </tr>
            <tr>
                <th>&nbsp;</th>
                <th>Folio de Operaci&oacute;n: <%=Folio%></th>
                <th>&nbsp;</th>
            </tr>
        </thead>
        <tbody>

            <tr> 
              <td >Fideicomiso:</td>
              <td ><%= session.getAttribute( "Fideicomiso" ) %></td>
            </tr>
            
            <tr> 
              <td > Servicio Solicitado:</td>
              <td  > 
                <%
                            if(!request.getParameter("txtConceptoOperacion").equals(""))
             out.print(request.getParameter("txtConceptoOperacion"));
                            %>
              </td>
            
            </tr>
            <tr > 
                              <td > Documentos a entregar:</td>
                              <td  >&nbsp;
                              </td>                          
                            </tr>  
                              <%
                              consultas.removerValores();
                              consultas.setVtrStrDato1(numOper);
                              consultas.querySelect(4);
                              if(consultas.hasData())
                                for(int j=0;j<consultas.getSize();j++){
                                consultas.setIndex(j);
                                %>
                                <tr >
                                <td  >&nbsp;
                                </td>                            
                                <td > 
                                <%=consultas.getVtrStrDato1()%>
                                </td>
                                </tr>                             
                                <%
                                }
                              else{
                                %>
                                <tr >
                                <td >&nbsp;
                                </td>                             
                                <td > &nbsp; </td>
                                </tr>                             
                                <% 
                                }
                              %> 
                              
            <tr> 
              <td > Tiempo de Atencion de la Solicitud:</td>
              <td  > 
                <%
                            if(!request.getParameter("txtdiasAtencion").equals(""))
             out.print(request.getParameter("txtdiasAtencion"));
                            %>
              </td>
            
            </tr>  
                            <tr> 
                              <td> Datos de la Solicitud:</td>
                              <td>
                              </td>                          
                            </tr> 						
                                                    <%	for (int i = 0; i < sEtiquetas.length; i++){
                                                            sIndiceInterno=sIndice[i].split(",");		
                                                    %>
                                                    <tr>
                                <td>
                                                            <%
                                                            System.out.println("Etiquetas: "+sEtiquetas[i]);
                                                            out.print(sEtiquetas[i]);
                                                            %>
                                </td>                            
                                <td> 
                                                            <%
                                                            System.out.println("Tipo de Objetos: "+sIndiceInterno[1]);
                                                            System.out.println("Indice de Objetos: "+sIndiceInterno[2]);
                                                            int indice=Integer.parseInt(sIndiceInterno[2]);
                                                            if(sIndiceInterno[1].equals("CAJA")){
                                out.print(sCajas[indice]);
                                                            iDatos=BD.insertaOtrosServiciosDatos(numOper,sConceptos[i],sCajas[indice],Folio,"","");
                                                            }else if(sIndiceInterno[1].equals("FECHA")){
                                out.print(sFechas[indice]);
                                                            iDatos=BD.insertaOtrosServiciosDatos(numOper,sConceptos[i],sFechas[indice],Folio,"","");
                                                            }else{
                                                            out.print(sSelect[indice].replaceAll("\"", "").replaceAll("=", ""));
                                                            iDatos=BD.insertaOtrosServiciosDatos(numOper,sConceptos[i],
                                                            sSelect[indice].replaceAll("\"", "").replaceAll("=", ""),Folio,"","");
                                                            }%>
                                </td>
                                                    </tr> 						
                           <%} if(sBienes.equals("1")){%>    
            <tr> 
              <td > Edificio Relacionado:</td>
              <td  > 
                <%
             out.print(sEdificio);
                            %>
              </td>
            
            </tr> <%}%>					   
            
                            <tr> 
                 <td >&nbsp;</td>
                  <td >&nbsp;</td>
                  <td >&nbsp;</td>
                </tr>           
                <tr> 
                 <td >&nbsp;</td>
                   <td><%=sCaptura.equals("SI")?"Capturada":"Elaborada"%> por:</td>
                    <td >&nbsp;</td>
                </tr>
                <tr> 
                 <td >&nbsp;</td>
                  <td >&nbsp;</td>
                   <td >&nbsp;</td>
                </tr>
                <tr> 
                 <td >&nbsp;</td>
                  <td> _______________________</td>
                   <td >&nbsp;</td>
                </tr>
                <tr> 
                 <td >&nbsp;</td>
                  <td><div><b><%=(String)session.getAttribute("NomUser")%></b></div></td>
                   <td >&nbsp;</td>
                </tr>
                <!--INICIO APROBO-->
                <tr> 
                 <td >&nbsp;</td>
                  <td >&nbsp;</td>
                  <td >&nbsp;</td>
                </tr>
                  <tr > 
                   <td >&nbsp;</td>
                  <td>Autorizada por:</td>
                   <td >&nbsp;</td>
                </tr>       
                <tr> 
                 <td >&nbsp;</td>
                  <td >&nbsp;</td>
                  <td>&nbsp;</td>
                </tr>
                <tr> 
                 <td >&nbsp;</td>
                  <td> _______________________</td>
                   <td >&nbsp;</td>
                </tr>
                <tr > 
                 <td >&nbsp;</td>
                  <td><div><b>&nbsp;<%=(String)session.getAttribute("empresa_4")%></b></div></td>
                   <td >&nbsp;</td>
                </tr>
                <tr> 
                  <td>&nbsp;</td>
                   <td >&nbsp;</td>
                    <td >&nbsp;</td>
                </tr>
                <tr>
                 <td >&nbsp;</td>
                  <td  align="center"> 
                    <input type="button" name="Imprimir"   class="btn btn-info" value="Imprimir"   onClick="javascript:imprimir()" > 
                    </td>
                     <td >&nbsp;</td>
                </tr>                

        </tbody>
    </table>
</div>    
</BODY>
</HTML>