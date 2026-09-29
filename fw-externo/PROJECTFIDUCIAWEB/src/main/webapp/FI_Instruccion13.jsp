<!--
/**
 * Autor: Inscitech Mexico
 * mail: eominguer@gmail.com
 * Fecha: Junio 2009
 **/
-->
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="consultas"  class="com.bancomext.negocio.nServicios"/>
<jsp:useBean id="param2"  class="com.bancomext.negocio.nServicios"/>
<jsp:useBean id="param3"  class="com.bancomext.negocio.nServicios"/>
<jsp:useBean id="movimientos"  class="com.bancomext.negocio.nServicios"/>
<jsp:useBean id="querys"  class="com.bancomext.negocio.nServicios"/>
<jsp:useBean id="ValoresQuerys"  class="com.bancomext.negocio.nInstrucciones"/>

<%@ include file="paramSeguridad.jsp" %>
<HEAD><TITLE>Instrucciones - No Monetarias</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" SRC='scripts/general.js'></script>
<!--***************************************Modif cubo********************************************-->
<script language="JavaScript" >
						function actualizar()
							{
                                                           // if(document.Deposito.txtConceptoD==null || document.Deposito.txtConceptoD==""){
								document.Deposito.action = "FI_Instruccion13.jsp"; 
								document.Deposito.submit();
                                                            //}
							}
                                                        
						function preguntahijos(valor)
							{
                                                        //alert(document.Deposito.HidentxtHIja.value)
								document.Deposito.action = "FI_Instruccion13.jsp?HidentxtHIja="+document.Deposito.HidentxtHIja.value+"&txtnumOper="+document.Deposito.txtnumOper.value; 
								document.Deposito.submit();
							}                                                        
                                                        
                                                        
                                                        

</script>
<!--********************************************************************************************-->
<%
String numOper="";
String DescOper="";
String diasAtencion="";
int iBienes=0;
int iCombos=0;
int iCajas=0;
int iFechas=0;
String esHija=request.getParameter("HidentxtHIja")!=null?(String)request.getParameter("HidentxtHIja"):"0";
String field_name3=request.getParameter("field_name3")!=null?(String)request.getParameter("field_name3"):"";
String txtnumOper=request.getParameter("txtnumOper")!=null?(String)request.getParameter("txtnumOper"):"";


System.out.println("Valor field_name3: "+field_name3.replaceAll("=", "").replaceAll("\"", ""));
System.out.println("Valor esHIja: "+esHija);
System.out.println("Valor txtnumOper: "+txtnumOper);

    param3.removerValores();
    param3.setVtrStrDato1(txtnumOper);//FTOP_NUM_OPER
    param3.setVtrStrDato2(field_name3.replaceAll("=", "").replaceAll("\"", ""));//CONP_NOMBRE
    
    param3.querySelect(205);//se recuperan los datos parametrizados de la solicitud	
    int iSitieneHijas=param3.getSize();
    System.out.println("iSitieneHijas: "+iSitieneHijas);

%>
<script language="JavaScript" type="text/JavaScript">

</script>
</HEAD>
<body class="bg-light">
  <jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
  
<div class="table-responsive" style="max-height: 900px; overflow-y: auto;">
<TABLE class="table table-responsive table-hover" >
    <TBODY>
    <TR > 
      <TD valign="top" align="center">
	    <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        <table width="593" border="0">
            <td class="texto">&nbsp;</td>
          </tr>
            <tr> 
               <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">SOLICITUD DE INSTRUCCIONES NO MONETARIAS </td>
            </tr>
            <tr> 
               <td>&nbsp;</td>
            </tr>
            <tr> 
               <td>
               <form name="Deposito" id="Deposito" method="post" 
               action="confirmarInst_13.jsp" class="needs-validation" novalidate>			   
                <table width="90%"  align="center" id="datos">
                  <tr> 
                    <td align="left"  class="subtitulo">&nbsp;</td>
                    <td class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td align="right"  class="texto" >&nbsp;</td>
                    <td class="texto">&nbsp;</td>
                  </tr>
                  <td  class="texto" align="right">Servicio Solicitado:</td>
                  <td  class="texto"> 
                    
                    <div class="mb-3">
                    <select class="form-select"  name="txtConceptoD" id="txtConceptoD" onchange="actualizar();" required>
                        <option value="">Selecciona Operación</option> 
                          <%                    
                          consultas.removerValores();
                          consultas.querySelect(200);
                          tempCboSelect=request.getParameter("txtConceptoD")!=null?(String)request.getParameter("txtConceptoD"):"0";
                          
                        	for(int r=0; r < consultas.getSize(); r++)
                                 {
                                 consultas.setIndex (r );
                                 if (consultas.getVtrStrDato1().equals(tempCboSelect)) 
                                    {
                                    numOper=consultas.getVtrStrDato1();
                                    DescOper=consultas.getVtrStrDato2();
                                    diasAtencion=consultas.getVtrStrDato3();
									iBienes=consultas.getVtrIntDato1();//bienes
                                    }
                                 %>
                                  <option value="<%=consultas.getVtrStrDato1()%>" <%=consultas.getVtrStrDato1().equals(tempCboSelect)?"selected":""%>> <%=consultas.getVtrStrDato2()%> </option>   
                                <%}
                        %>
                      </select>  
                        <div class="invalid-feedback">
                        Por favor, seleccione el Servicio.
                        </div>                      
                      </div>
                      <input class="form-control"  type="HIDDEN" name="txtnumOper" value="<%=numOper%>">
                      <input class="form-control"  type="HIDDEN" name="txtConceptoOperacion" value="<%=DescOper%>">
                      <input class="form-control"  type="HIDDEN" name="txtdiasAtencion" value="<%=diasAtencion%>">
					  <input class="form-control"  type="HIDDEN" name="txtBienes" value="<%=iBienes%>">
                  </td>
                  </tr>
                  <tr>
                  <td> </td>
                  <td align="left">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td class="texto" align="center">
					<%if (iBienes==1){%>
              <form name="Movs" method="post">
                <table border="0" width="95%">
                    <%
                                                        String stempo= ((String)session.getAttribute( "NumFid" )).substring(0,((String)session.getAttribute( "NumFid" )).indexOf("-")  );
                                                        System.out.println("Fideicomiso 203: "+stempo);
							movimientos.setVtrIntDato1(Integer.parseInt(stempo));
							movimientos.querySelect(203);
							%>
                      <tr class="celda01" bgcolor="#999966"> 
						<td align="center">&nbsp;</td>
                        <td align="center">SubCuenta</td>
                        <td  align="center">Tipo</td>
                        <td align="center">IdBien</td>
                        <td  align="center">Edificio</td>
                        <td  align="center">Departamento</td>
                      </tr>
                      <%
						//tabla con registros de usuarios
						for(int r=0; r < movimientos.getSize(); r++)
							 {
								movimientos.setIndex (r );
							 %>
                      <tr  class="celda02"> 
					    <td  align="center"><input class="form-control"  type="radio" name="radioBien" value=<%=movimientos.getVtrStrDato2()%>>&nbsp;</td>
                        <td  align="center"><%=movimientos.getVtrIntDato1()%></td>
                        <td  align="center"><%=movimientos.getVtrStrDato1()%> 
                        </td>
                        <td  align="center"><%=movimientos.getVtrIntDato2()%> 
                        </td>
                        <td  align="center"><%=movimientos.getVtrStrDato2()%> 
						<input class="form-control"  type="HIDDEN" name="txtEdificio" value="<%=movimientos.getVtrStrDato2()%>">
                        </td>                        
                        <td  align="center"><%=movimientos.getVtrStrDato3()%> 
                        </td>                        
                      </tr>
                      <%}
						if ( !movimientos.hasData () )
								  {%>
                      <tr  class="celda01"> 
                        <td align="center" colspan="4">No hay Bienes asociados al Fideicomiso</td>
                      </tr>
                      <%}%>
                </table>
				</form>
				
					<%}else{//fin de condicion de bienes%> 
					
			

				
                                      
                                        <%	 // de aqui 	
						param2.setVtrStrDato1(numOper);//num solicitud
						param2.querySelect(202);//se recuperan los datos parametrizados de la solicitud	
                                                System.out.println("Tamaño de param2 "+param2.getSize());
						for(int r=0; r < param2.getSize()&&iSitieneHijas==0; r++)
							 {
								param2.setIndex (r );
                                                                System.out.println("Valor es Hija en el for"+param2.getVtrIntDato5());
                                                                esHija=String.valueOf(param2.getVtrIntDato5() );
								if(param2.getVtrIntDato2()==0){//CAJA DE TEXTO
                                                                 if(param2.getVtrStrDato4().equals("ALFANUMERICO")) {
					%>
				
                  <tr> 
                  
                  
                    <td colspan="2" align="center" >
					<div class="field_wrapper">
						<div>
							<label for="field_name2[<%=r%>]"><%=param2.getVtrStrDato5()%><%=param2.getVtrIntDato6()==1?"*":""%>:</label><br>
							<input class="form-control"  type="HIDDEN" name="txtEtiquetas" id="txtEtiquetas" value="<%=param2.getVtrStrDato5()%>">
                            <input class="form-control"  type="HIDDEN" name="txtNumEtiquetas" id="txtNumEtiquetas" value="<%=param2.getSize()%>">		
							<input class="form-control"  type="HIDDEN" name="txtConceptos" id="txtConceptos" value="<%=param2.getVtrIntDato1()%>">							
						</div>
					</div>					
					</td>
                    <td colspan="2" align="center" >
					<div class="field_wrapper">
						<div class="mb-3">
							<input class="form-control"  type="text" name="field_name" id="field_name" size="50" <%=param2.getVtrIntDato6()==1?"required":""%>/>
							<input class="form-control"  type="HIDDEN" name="Valores[<%=iCajas%>]">	
                                                        <input class="form-control"  type="HIDDEN" name="OblCajas" value="<%=param2.getVtrIntDato6()%>">
							<input class="form-control"  type="HIDDEN" name="txtNumCajas" value="<%=iCajas%>">
							<input class="form-control"  type="HIDDEN" name="txtIndiceEtiqueta" value="<%=String.valueOf(r)+",CAJA,"+String.valueOf(iCajas)%>">							
                                                        <div class="invalid-feedback">
                                                        Por favor, introduzca <%=param2.getVtrStrDato5()%>
                                                        </div>
						</div>
					</div>					
					</td>					
                  </tr>
				   <%
                                   iCajas++;
                                   } //cierre del ALFANUMERICO
                                 //   else {
                               //   if(param2.getVtrStrDato4()=="FECHA"){
                              if(param2.getVtrStrDato4().equals("FECHA")){
                                   %>
                                   
                              <tr> 
                    <td colspan="2" align="center" >
					<div class="field_wrapper">
						<div>
							<label for="field_name2[<%=r%>]"><%=param2.getVtrStrDato5()%>:</label><br>
							<input class="form-control"  type="HIDDEN" name="txtEtiquetas" value="<%=param2.getVtrStrDato5()%>">
                                                        <input class="form-control"  type="HIDDEN" name="txtNumEtiquetas" value="<%=param2.getSize()%>">		
							<input class="form-control"  type="HIDDEN" name="txtConceptos" value="<%=param2.getVtrIntDato1()%>">	
                                                        
               					</div>
					</div>					
					</td>
                    <td colspan="2" align="center" >
					<div class="field_wrapper">
						<div class="mb-3">
                    <input class="form-control"  type="HIDDEN" name="OblFechas" value="<%=param2.getVtrIntDato6()%>">
                    <input class="form-control"  type="button" id="cboCalendario2" name="cboCalendario2"  style=" WIDTH: 100px" value="<%=fecha%>">
                     <input class="form-control"  type="button" id="lanzaCalendario2" name="lanzaCalendario2"  style=" WIDTH: 20px"   value="v"  class="botonCbo"> 
                      <input class="form-control"  type="hidden" id="sesionFecha" name="sesionFecha"  style=" WIDTH: 100px" value="<%=fecha%>" >
                      <SCRIPT type=text/javascript>
                                  // script que define y configura el calendario-
                                 Calendar.setup({
                                 inputField     :    "cboCalendario2",      // id del campo de texto
                                 ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
                                 button         :    "lanzaCalendario2"   // el id del bot?n que lanzar? el calendario
                              });					
                         </SCRIPT>  
							<input class="form-control"  type="HIDDEN" name="Valores[<%=iCajas%>]">	
							<input class="form-control"  type="HIDDEN" name="txtNumCajas" value="<%=iCajas%>">
							<input class="form-control"  type="HIDDEN" name="txtIndiceEtiqueta" value="<%=String.valueOf(r)+",FECHA,"+String.valueOf(iFechas)%>">							
						</div>
                                            <div class="invalid-feedback">
                                            Por favor, introduzca la Fecha.
                                            </div>
					</div>					
					</td>					
                  </tr>      
                                   
                                                             
                                   
                               <%   iFechas++;
                                        } //fin del else del tipo de dato
                                         // iCajas++;
                                                                
                                                                
                                                                
                                                                }//FIN DE IF PARA CAJA DE TEXTO
								else{//se trata de un combo
									//se tiene que leer el query que llenara el combo
									querys.removerValores();
									System.out.println("Valor del Query "+iCombos+" "+param2.getVtrStrDato2());
									querys.setVtrStrDato1(param2.getVtrStrDato2());//identificador del query
									querys.querySelect(204);//se recuperan los datos parametrizados de la solicitud
									querys.setIndex (0);//la premisa es que siempre debe traer solo un registro
                                                                        System.out.println("querys.getVtrStrDato1():"+querys.getVtrStrDato2());
					%>
					  <tr> 	
						<td colspan="2" align="center" >
						<div class="field_wrapper">
							<div>
								<label for="field_name2[<%=r%>]"><%=param2.getVtrStrDato5()%><%=param2.getVtrIntDato6()==1?"*":""%>:</label><br>	
								<input class="form-control" type="HIDDEN" name="txtEtiquetas" value="<%=param2.getVtrStrDato5()%>">
                                <input class="form-control"  type="HIDDEN" name="txtNumEtiquetas" value="<%=param2.getSize()%>">
								<input class="form-control"  type="HIDDEN" name="txtConceptos" value="<%=param2.getVtrIntDato1()%>">
                                                                <input class="form-control"  type="HIDDEN" name="HidentxtHIja" value="<%=param2.getVtrIntDato5()%>">
							</div>
						</div>					
						</td>		
						<td colspan="2" align="center">
						<div >
							<div class="mb-3">
								<input class="form-control"  type="HIDDEN" name="txtIndiceEtiqueta" value="<%=String.valueOf(r)+",COMBO,"+String.valueOf(iCombos)%>">							
                                                                <input class="form-control"  type="HIDDEN" name="OblCombos" value="<%=param2.getVtrIntDato6()%>">
								<select class="form-select  w-50"  name="field_name3" id="field_name3"  <%=param2.getVtrIntDato6()==1?"required":""%> >
                                                                <option value="">Seleccione un concepto</option>
					<%				iCombos++;
									String[] arreglo=null;
                                                                        String tempCboSelect2=request.getParameter("field_name3")!=null?(String)request.getParameter("field_name3"):"0";
                                                                        arreglo=ValoresQuerys.sEjecutaQuery(querys.getVtrStrDato2(),"");//se recupera el arreglo con los valores del combo
									for (int i = 0; i < arreglo.length-1; i++){
					%>		
                                                                <option value=="<%=arreglo[i]%>" <%=arreglo[i].equals(tempCboSelect2.replaceAll("=", "").replaceAll("\"", ""))?"selected":""%>> <%=arreglo[i]%> </option>
					<%}
					%>	
							</select>
                                                        <div class="invalid-feedback">
                                                        Por favor, seleccione <%=param2.getVtrIntDato5()%>
                                                        </div>  
							</div>
						</div>										
						</td>					
					  </tr>						
					<%
								}//fin de else para el combo
				   } //// hasta aqui viene el for del numero de solicitud
                                   /////////////////////////////////////////////////////
                                   ////////////////////////////////////////////////////
                                        	 // de aqui 
                                                 
                                    } /// lo puse para probar             
                                    if(iSitieneHijas!=0){
                                   %>       
                                   <label for="field_name24"><%=field_name3.replaceAll("=", "").replaceAll("\"", "")%>:</label>
                                 
                        
                               
                                      
                                          <%       

						for(int r=0; r < param3.getSize(); r++)
							 {
								param3.setIndex (r );
								if(param3.getVtrIntDato2()==0){//CAJA DE TEXTO
                                                          //       if(param2.getVtrStrDato4()=="ALFANUMERICO"){
					%>
				
                  <tr> 
                    <td colspan="2" align="center" >
					<div class="field_wrapper">
						<div>
							<label for="field_name2[<%=r%>]"><%=param3.getVtrStrDato1()%>:</label><br>
							<input class="form-control"  type="HIDDEN" name="txtEtiquetasHijo" value="<%=param3.getVtrStrDato1()%>">
                            <input class="form-control"  type="HIDDEN" name="txtNumEtiquetasHijo" value="<%=param3.getSize()%>">		
							<input class="form-control"  type="HIDDEN" name="txtConceptosHijo" value="<%=param3.getVtrIntDato1()%>">							
						</div>
					</div>					
					</td>
                    <td colspan="2" align="center" >
					<div class="field_wrapper">
						<div>
							<input class="form-control"  type="text" name="field_nameHijo"/>
							<input class="form-control"  type="HIDDEN" name="Valores[<%=iCajas%>]">	
							<input class="form-control"  type="HIDDEN" name="txtNumCajasHijo" value="<%=iCajas%>">
							<input class="form-control"  type="HIDDEN" name="txtIndiceEtiquetaHijo" value="<%=String.valueOf(r)+",CAJA,"+String.valueOf(iCajas)%>">							
						</div>
					</div>					
					</td>					
                  </tr>
				   <%
                                 //  iCajas++;
                                //   } cierre del if 
                                 //   else {
                                  //fin del else del tipo de dato
                                          iCajas++;
                                                                
                                                                
                                                                
                                                                }//FIN DE IF PARA CAJA DE TEXTO
								else{//se trata de un combo
									//se tiene que leer el query que llenara el combo
									querys.removerValores();
									System.out.println("Valor del Query "+iCombos+" "+param3.getVtrStrDato2());
									querys.setVtrStrDato1(param3.getVtrStrDato2());//identificador del query
									querys.querySelect(204);//se recuperan los datos parametrizados de la solicitud
									querys.setIndex (0);//la premisa es que siempre debe traer solo un registro
					%>
					  <tr> 	
						<td colspan="2" align="center" >
						<div class="field_wrapper">
							<div>
								<label for="field_name2[<%=r%>]"><%=param3.getVtrStrDato1()%>:</label><br>	
								<input class="form-control"  type="HIDDEN" name="txtEtiquetasHijo" value="<%=param3.getVtrStrDato1()%>">
                                <input class="form-control"  type="HIDDEN" name="txtNumEtiquetasHijo" value="<%=param3.getSize()%>">
								<input class="form-control"  type="HIDDEN" name="txtConceptosHijo" value="<%=param3.getVtrIntDato1()%>">															
							</div>
						</div>					
						</td>		
						<td colspan="2" align="center">
						<div >
							<div class="mb-3">	
								<input class="form-control"  type="HIDDEN" name="txtIndiceEtiquetaHijo" value="<%=String.valueOf(r)+",COMBO,"+String.valueOf(iCombos)%>">							
								<select class="form-select"  name="field_name4" required>
                                                                <option value="">Seleccione un concepto</option>
								<!--input type="HIDDEN" name="ValoresCmb[<%=iCombos%>]">
								<input class="form-control"  type="HIDDEN" name="txtNumCmb" value="<%=iCombos%>"-->															
					<%				iCombos++;
									//ValoresQuerys.removerValores();
									String[] arreglo=null;
									if(param3.getVtrStrDato3().equals("FIDEICOMISO"))
										arreglo=ValoresQuerys.sEjecutaQuery(querys.getVtrStrDato1(), ((String)session.getAttribute( "NumFid" )).substring(0,((String)session.getAttribute( "NumFid" )).indexOf("-") ));//se recupera el arreglo con los valores del combo
									else
										arreglo=ValoresQuerys.sEjecutaQuery(querys.getVtrStrDato1(),"");//se recupera el arreglo con los valores del combo
									for (int i = 0; i < arreglo.length-1; i++){
					%>		
								<option value="<%=arreglo[i]%>"> <%=arreglo[i]%> </option>   
					<%}
					%>	
							</select>
                                                        <div class="invalid-feedback">
                                                        Por favor, seleccione el Dato de la Lista.
                                                        </div>  
							</div>
						</div>										
						</td>					
					  </tr>	
                      </select>                      
					<%
								}//fin de else para el combo
				   }
                                   
                                   
                                   
                             }//cierrra si es hijo       
                                     
				    ///////////////////////////////////////////////////////////////////cierra cndicion del else bien
                                    %>
                  <tr> 
                    <td colspan="2" align="center" > 
                      <button type="submit" class="btn btn-primary">Aceptar</button>
                      <script language="JavaScript" SRC='scripts/instruccion13.js'></script>
                    </td>
                  </tr>
                  <tr> 
                    <td colspan="2" align="center" >&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2" align="center" ><table border=0 cellpadding=0 cellspacing=1 >
                        <tbody>
                          <tr> 
                            <td align="middle" class="ref" >|<a  href="FI_Legales.jsp" class="ref">ASPECTOS 
                              LEGALES</a>|</td>
                          </tr>
                        </tbody>
                      </table></td>
                  </tr>
                </table>
              </form>
              </td>
           </tr>
        </table>
       </TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</div>	
</BODY></HTML>
