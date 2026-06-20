    <!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->
<jsp:useBean id="BD"  class="com.bancomext.negocio.EdoCuenta"/>
<jsp:useBean id="valida" class="com.bancomext.negocio.nReporte"/>
<%@ include file="Sesion.jsp" %>

<%	

String numFid=(String)session.getAttribute( "NumFid" )!=null?(String)session.getAttribute( "NumFid" ):"0";

int edoFinanciero=Integer.parseInt(request.getParameter("edo")!=null?request.getParameter("edo").trim():"0");

String titulo="";
String reporte="";
String reporte2="";
String[] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
String[] mesesN={"01","02","03","04","05","06","07","08","09","10","11","12"};
String fechaRep= fecha.substring(0,2)+ " de "+ meses[Integer.parseInt(fecha.substring(3,5))-1] +" de "+ fecha.substring(6,10);

switch(edoFinanciero)
			{
			case 1:
					titulo="Estado de Cuenta";
					break;														
			}

%>
<HTML>
<HEAD><TITLE>Informaci�n Financiera - <%=titulo%></TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" type="text/JavaScript">
<%
switch(edoFinanciero)
			{
			case 1:
					titulo="Estado de Cuenta";
					reporte ="edoCta.jsp";
					break;															
			}

if (edoFinanciero>0)
	{%>
function  consulta() 
	{
	 var contrato="";
	 var mes="";
	 var anio="";
   var moneda="";
	<%
	    if(edoFinanciero==1)//estado de cuenta
			{%>
			if(document.edos.cboContrato.selectedIndex==0) 
				{
                                Swal.fire('warning', 'Selecciona un Contrato de Inversion!', 'warning')
			   document.edos.cboContrato.focus();
			   return;
			    }   
			  contrato="&contrato="+document.edos.cboContrato.value;	
		<%}%>
		
		<% if(tipoUsuario!=null && tipoUsuario.equals("EJECUTIVO CONSULTA") && edoFinanciero!=1)
				   {%>
					if(document.edos.cboAnio.selectedIndex==0) 
						{
                                                Swal.fire('warning', 'Selecciona un Año!', 'warning')
					   document.edos.cboAnio.focus();
					   return;
						} 
						anio=document.edos.cboAnio.value;		   
				<%}%>
		if(document.edos.cboMes.selectedIndex==0) 
			{
		   Swal.fire('warning', 'Selecciona un Mes!', 'warning')
		   document.edos.cboMes.focus();
		   return;
			}   
       
	  mes=document.edos.cboMes.value;
    <%
    if(edoFinanciero==3){%>
    moneda=document.edos.chkMonNac.value;
    <%}%>
	   <% if(tipoUsuario!=null && tipoUsuario.equals("EJECUTIVO CONSULTA") && edoFinanciero!=1)
				   {%>
				    window.open("<%=reporte%>?numFid=<%=numFid%>&mes="+mes+"&anio="+anio, <%="\""+titulo.replace(' ' ,'_')+"\""%>,"top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=yes,resizable=yes,copyhistory=NO,width=750,height=400");

	             <%}
		  else if(edoFinanciero==3) {%>
        	  window.open("<%=reporte%>?numFid=<%=numFid%>&mes="+mes.substring(5,7)+"&anio="+mes.substring(0,4)+contrato+"&moneda="+moneda, <%="\""+titulo.replace(' ' ,'_')+"\""%>,"top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=yes,resizable=yes,copyhistory=NO,width=750,height=400");	 
	             <%}
		  else  {%>
					  window.open("<%=reporte%>?numFid=<%=numFid%>&mes="+mes.substring(5,7)+"&anio="+mes.substring(0,4)+contrato, <%="\""+titulo.replace(' ' ,'_')+"\""%>,"top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=yes,resizable=yes,copyhistory=NO,width=750,height=400");	 
	             <%}%>
               
		
	}
	

function  imprime() 
	{
	 var contrato="";
	 var mes="";
	 var anio="";
	 var moneda="";
	<%
	 if(edoFinanciero==1)//estado de cuenta
			{%>
			if(document.edos.cboContrato.selectedIndex==0) 
				{
			   alert("Selecciona un Contrato de Inversion");
			   document.edos.cboContrato.focus();
			   return;
				}   
			  contrato="&contrato="+document.edos.cboContrato.value;	
		<%}%>
		
		
			<% if(tipoUsuario!=null && tipoUsuario.equals("EJECUTIVO CONSULTA") && edoFinanciero!=1)
				   {%>
					if(document.edos.cboAnio.selectedIndex==0) 
						{
					   alert("Selecciona un A�o");
					   document.edos.cboAnio.focus();
					   return;
						} 
						anio=document.edos.cboAnio.value;		   
				<%}%>
						
	if(document.edos.cboMes.selectedIndex==0) 
        {
       alert("Selecciona un Mes");
	   document.edos.cboMes.focus();
	   return;
        }   

   mes=document.edos.cboMes.value;
		
    <%
    if(edoFinanciero==3){%>
    moneda=document.edos.chkMonNac.value;
    <%}%>

	
			   <% if(tipoUsuario!=null && tipoUsuario.equals("EJECUTIVO CONSULTA") && edoFinanciero!=1)
				   {%>
				    window.open("<%=reporte%>?numFid=<%=numFid%>&mes="+mes+"&anio="+anio+"&bImprimir=1", <%="\""+titulo.replace(' ' ,'_')+"\""%>,"top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=yes,resizable=yes,copyhistory=NO,width=750,height=400");

	             <%}
		  else if(edoFinanciero==3) {%>
					  window.open("<%=reporte%>?numFid=<%=numFid%>&mes="+mes.substring(5,7)+"&anio="+mes.substring(0,4)+contrato+"&moneda="+moneda+"&bImprimir=1", <%="\""+titulo.replace(' ' ,'_')+"\""%>,"top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=yes,resizable=yes,copyhistory=NO,width=750,height=400");	 
	             <%}
		  else  {%>
					  window.open("<%=reporte%>?numFid=<%=numFid%>&mes="+mes.substring(5,7)+"&anio="+mes.substring(0,4)+contrato+"&bImprimir=1", <%="\""+titulo.replace(' ' ,'_')+"\""%>,"top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=yes,resizable=yes,copyhistory=NO,width=750,height=400");	 
	             <%}%>
	}
<%}%>
</script>
</HEAD>
<body class="bg-light">
  <jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
  
<div class="table-responsive" style="max-height: 450px; overflow-y: auto;">
<table id="fisosDisponibles"  class="table table-responsive table-hover">
  <TBODY>

    <TR > 

      <TD valign="top" align="center"> 
	  <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %></td>
          </tr>
        </table>
        <table width="593" border="0">
          <tr> 
            <td   class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" class="titulo"><%=titulo%></td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td> <table border="0" width="100%" align="center">
                <tr> 
                  <td align="center"><form name="edos" method="post" action="">
                      <%if(edoFinanciero!=0)
				  		{%>
                      <table  border="0" width="90%">
                        <%if(edoFinanciero==1)
					 		{%>
                        <tr > 
                          <td width="116"   >&nbsp;</td>
                          <td width="397"   >&nbsp;</td>
                        </tr>
                        <tr > 
                          <td class="texto" align="right" >Contrato de Inversi&oacute;n:</td>
                          <td> <select  name="cboContrato" method="post" action="">
                              <option>--Seleccione un Contrato--</option>
                              <%                     
							out.print(BD.DataCombos(3,(String)session.getAttribute( "NumFid" ),""));
                            %>
                            </select> </td>
                        </tr>
                        <%}
				  else{%>
                        <tr > 
                          <td width="116">&nbsp;</td>
                          <td width="397">&nbsp;</td>
                        </tr>
						                  <%}%>
										  
<% if(tipoUsuario!=null && tipoUsuario.equals("EJECUTIVO CONSULTA") && edoFinanciero!=1)
						   {%>										  
                        <tr> 
                          <td   class="texto" align="right">A&ntilde;o:</td>
                          <td> <select name="cboAnio"   class="Input1" style="width:250px;">
                              <option>--Selecciona un Año---</option>
                              <%
						
						int anio=Integer.parseInt(fecha.substring(6,10));
						for(int i=anio;i>=1999;i--)
							{%>
                              <option value="<%=i%>" ><%=i%></option>
                              <%	
								} 
						  %>
                            </select> </td>
                        </tr>
		
                        <tr> 
                          <td   class="texto" align="right">Mes:</td>
                          <td> <select name="cboMes"   class="Input1" style="width:250px;">
                              <option>--Selecciona un Mes---</option>
                              <%
						
	
						
						for(int i=0;i<12;i++)
							{
	%>
                              <option value="<%=mesesN[i]%>" ><%=meses[i]%></option>
                              <%
							}  
						  %>
                            </select> </td>
                        </tr>
      				<%}
					else {%>
                        <tr> 
                          <td   class="texto" align="right">Mes:</td>
                          <td> <select name="cboMes"   class="Input1" style="width:250px;">
                              <option>--Selecciona un Mes---</option>
                              <%
						
						int mesFC=Integer.parseInt(fecha.substring(3,5));
						int anio=Integer.parseInt(fecha.substring(6,10));
						int j=mesFC;
						
						for(int i=(mesFC-2);i>=(mesFC-13);i--)
							{
							if(i<0)
								{%>
                              <option value="<%=(anio-1)+"-"+mesesN[j+(11-mesFC)]%>" ><%=meses[j+(11-mesFC)]+"-"+(anio-1)%></option>
                              <%
								j--;	
								}
							else  
								{
								%>
                              <option value="<%=anio+"-"+mesesN[i]%>"  ><%=meses[i]+"-"+(anio)%></option>
                              <%
								}
							}  
						  %>
                            </select> </td>
                        </tr>
						<%}%>
                        <tr> 
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr>
                        <%if(edoFinanciero==3){%>
                        <tr> 
                          <td>&nbsp;</td>
                          <td class="texto" ><input name="chkMonNac" type="checkbox"  onclick="javascript:this.checked==checked?this.value=1:this.value=2" <%=request.getParameter("chkMonNac")!=null && request.getParameter("chkMonNac").equals("1")?"checked ":" "%>/>&nbsp;&nbsp;&nbsp;Moneda Nacional</td>
                          <td>&nbsp;</td>
                        </tr>
                        <%}%>
                        <tr> 
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr>                        
                        <tr> 
                          <td colspan="2" align="right"><input type="button" name="Consultar" value="Consultar" class="btn btn-primary" onClick="javascript:consulta()"> 
                            &nbsp;&nbsp; 
                          </td>
                        </tr>
                        <tr> 
                          <td colspan="2" align="justify">&nbsp;</td>
                        </tr>
                      </table>
                      <%}
					  else{%>
                      <table border="0" width="90%" >
                        <tr> 
                          <td  align="center">&nbsp;</td>
                        </tr>
                        <tr> 
                          <td  class="texto" ><p align="justify" >En este sitio 
                              se puede consultar los Estados de Cuenta de forma Mensual. 
                            <p></td>
                        </tr>
                        <tr> 
                          <td  class="texto">&nbsp;</td>
                        </tr>
                      </table>
                      <%}%>
                    </form></td>
                </tr>
                <tr> 
                  <td  align="center">&nbsp;</td>
                </tr>
              </table></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</div>	
</BODY></HTML>
