
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->
<%@ page import="java.text.*,java.util.*,java.lang.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="BD2"  class="com.bancomext.negocio.RetirosDB"/>
<jsp:useBean id="CargaArchivo"  class="com.bancomext.negocio.CargaArchivo"/>
<jsp:useBean id="nombreSubCuenta"  class="com.bancomext.negocio.nConsultas"/>

<%@ include file="sesionInst1.jsp" %>

<%
  String temporal,Folio="";
	String radioTipoPersona=request.getParameter("radioTipoPersona");
  //CUENTAS POR COBRAR
  String GeneraArchivo = request.getParameter("GeneraArchivo")==null?"":request.getParameter("GeneraArchivo");
  String pagosM=request.getParameter("pagosM")==null?"":request.getParameter("pagosM");  
  String campoArchivo= request.getParameter("archivo")==null?"":request.getParameter("archivo");
  String sFolioRec =request.getParameter("txtFolio")==null?"":request.getParameter("txtFolio");
  
  String comboSeleccionado = request.getParameter("hiddentxtCombo")==null?"":request.getParameter("hiddentxtCombo");
  /////
  
	String forma=request.getParameter("cboFormasL");
	
if(forma != null)
	{	
		
		forma=forma.trim();
		System.out.println("Forma deposito principal:"+forma);
		
	}
%>

<HTML>
<HEAD><TITLE>Instrucciones - Deposito</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" SRC='scripts/general.js'></script>
<script>
// JavaScript para desactivar el envío si hay campos inválidos
(function () {
  'use strict'
  // Obtener todos los formularios a los que queremos aplicar estilos de validación personalizados
  var forms = document.querySelectorAll('.needs-validation')

  // Bucle sobre ellos para evitar el envío
  Array.prototype.slice.call(forms)
    .forEach(function (form) {
      form.addEventListener('submit', function (event) {
        if (!form.checkValidity()) {
          event.preventDefault()
          event.stopPropagation()
        }
        form.classList.add('was-validated')
      }, false)
    })
})()
</script>
<script language="JavaScript" >

            function generar() {
              document.Deposito.action = "FI_Instruccion1.jsp?GeneraArchivo=Recibir Archivo";
              document.Deposito.submit();  
              return true;
            }//function generar

            function Mostrar(forma)
            {
			  //alert(forma)		
              if(forma==2)
                  document.Deposito.action = "FI_Instruccion1.jsp#pagosM";	
              else
                  document.Deposito.action = "FI_Instruccion1.jsp";
              document.Deposito.submit();
            }

						function FideicomitenteD()
							{
								document.Deposito.action = "FI_Instruccion1.jsp#tipoPersona"; 
								document.Deposito.submit();
							}	
						function TerceroD()
							{
									document.Deposito.action = "FI_Instruccion1.jsp#tipoPersona"; 
									document.Deposito.submit();
							}
						function FideicomisarioD()
							{
									document.Deposito.action = "FI_Instruccion1.jsp#tipoPersona"; 
									document.Deposito.submit();
							}
              
              function onChangeComboNomSubCta(){
                  document.Deposito.action = "FI_Instruccion1.jsp?onChangeCombo=TRUE"; 
                  
                  document.Deposito.hiddentxtCombo.value = (document.Deposito.cboContratoD.selectedIndex==0)?"":"contrato"; 
                  
                  document.Deposito.cboCtaCheques.selectedIndex=0;
                  document.Deposito.cboCtaCheques.options[0].text = "-1";
                  
                  document.Deposito.submit();
                  
              }
			  
              function onChangeComboFormaDeposito(){
				  
					document.Deposito.action = "FI_Instruccion1.jsp"; //#formaPago
					document.Deposito.submit();
					document.Deposito.txtFormaLiq.value= document.Deposito.cboFormasL.options[document.Deposito.cboFormasL.selectedIndex]
					document.Deposito.txtFormaLiq.value= document.Deposito.cboFormasL.options[document.Deposito.cboFormasL.selectedIndex].text				                    
              }			  
              
              function onChangeCuentaCheques()
              {
                document.Deposito.action = "FI_Instruccion1.jsp?onChangeCombo=TRUE"; 
                
                document.Deposito.hiddentxtCombo.value = (document.Deposito.cboCtaCheques.selectedIndex==0)?"":"cheques"; 
                document.Deposito.hiddentxtIdSubcuenta.value="";
                document.Deposito.hiddentxtNomSubcuenta.value="";
                document.Deposito.txtIdSubcuenta.value="";
                document.Deposito.txtNomSubcuenta.value="";
                
                document.Deposito.cboContratoD.selectedIndex=0;
                document.Deposito.cboContratoD.options[0].text = "-1";
                
                document.Deposito.submit();
              }
              
              function ocultaCamposCombo()
              {
                var comboSeleccionado = '<%=comboSeleccionado%>';
                
                if(comboSeleccionado=="contrato")
                {
                  document.getElementById("divCamposCuentas1").style.visibility="visible";
                  document.getElementById("divCamposCuentas2").style.visibility="visible";
                  document.getElementById("divCamposCuentas3").style.visibility="visible";
                  document.getElementById("divCamposCuentas4").style.visibility="visible";
                   document.getElementById("divCamposCuentas5").style.visibility="hidden";
                }
                else if(comboSeleccionado=="cheques")
                {
                  document.getElementById("divCamposCuentas1").style.visibility="hidden";
                  document.getElementById("divCamposCuentas2").style.visibility="hidden";
                  document.getElementById("divCamposCuentas3").style.visibility="hidden";
                  document.getElementById("divCamposCuentas4").style.visibility="hidden";
                  document.getElementById("divCamposCuentas5").style.visibility="visible";
                  document.getElementById("divCamposCuentas6").style.visibility="visible";
                }
              }
              
</script>

<%
   String onChangeCombo=request.getParameter("onChangeCombo")==null?"":request.getParameter("onChangeCombo");
   String onChangeComboFormaDeposito=request.getParameter("onChangeComboFormaDeposito")==null?"":request.getParameter("onChangeComboFormaDeposito");
   String arrfiso[] = null;
   arrfiso=session.getAttribute("Fideicomiso").toString().replaceAll(" ","").split("-");
   int fiso=Integer.parseInt(arrfiso[0]);
   String numContrato=request.getParameter("cboContratoD")==null?"0":request.getParameter("cboContratoD");
   String arrNomCont[]=null;
   String arrayNombreSubCuenta[]={"",""};
   if(onChangeCombo.equals("TRUE")){
        //Esta version no maneja subfiso por cuenta de inversion
          arrayNombreSubCuenta[0]="";
          arrayNombreSubCuenta[1]="";
        /*System.out.println("onchange numcontrato:"+numContrato);
       arrNomCont=numContrato.split("--");
       nombreSubCuenta.setVtrIntDato1(fiso);
       nombreSubCuenta.querySelect(66);
       if(nombreSubCuenta.hasData())
          arrayNombreSubCuenta=nombreSubCuenta.getVtrStrDato1().split("-");
      else{
          arrayNombreSubCuenta[0]="";
          arrayNombreSubCuenta[1]="";
      }*/
          
   }
%>

</HEAD>
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0"  >
<jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>

<div class="table-responsive" style="max-height: 900px; overflow-y: auto;">

<TABLE class="table table-responsive table-hover" >
    <thead class="table-primary">
    </thead>
   <TBODY>   
    <TR > 
    

      <TD valign="top" align="center"> 
	        <table width="100%" border="0">
            <tr> 
               <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
            </tr>
          </table>
          <table width="593" border="0">
            <tr> 
               <td class="texto">&nbsp;</td>
            </tr>
            <tr> 
               <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Dep&oacute;sito</td>
            </tr>
            <tr> 
               <td>&nbsp;</td>
            </tr>
            <tr> 
               <td>
			   <form name="Deposito" id="Deposito" class="needs-validation" 
                           method="post" action="confirmarInst_1.jsp" novalidate >
			 <table width="50%" border="0" cellspacing="1" cellpadding="1" align="center">
                  <tr>
                    <td><div id="token" style="position:absolute; visibility: hidden;"   align="center"> 
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
			   
                <table width="90%"  align="center" id="datos">
                  <tr> 
                    <td align="left"  class="subtitulo">Dep&oacute;sito:</td>
                    <td class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td align="right"  class="texto" >&nbsp;</td>
                    <td class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td align="right"  class="texto" >Fecha:</td>
                    <td class="texto">
                    <input type="hidden" name="txtFecha" maxlength=10 size="8" 
                    value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha%>" class="texto"> 
                      <input type="button" id="cboCalendarioI" name="cboCalendarioI"  style=" WIDTH: 100px" 
                      value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha%>" onChange="Deposito.txtFecha.value=Deposito.cboCalendarioI.value;"><input type="button" id="lanzaCalendarioI" name="lanzaCalendarioI"  style=" WIDTH: 15px"   class="botonCbo" value="v"> 
                      <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendarioI",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioI"   // el id del bot�n que lanzar� el calendario
																						});					
																   </SCRIPT> &nbsp; 
                    
                    </td>
                  </tr>
                  
                  <tr> 

                    <td class="texto"> 
                         <input type="hidden" name="cboCuentaD" id="cboCuentaD" value="0"/>
                      </td>
                  </tr>
                  <tr> 
                    <td class="texto" align="right">Divisa:</td>
                    <td class="texto"> 
                    <div class="mb-3">
                    <select class="form-select" name="cboDivisa" id="cboDivisa" required>
                        <option value="">Selecciona Divisa </option>
                        <%
						                temporal=request.getParameter("cboDivisa");   
                		       	if(request.getParameter("cboDivisa")!=null&&!temporal.equals("Selecciona Divisa"))
                              out.print(BD.DataCombos(4,"",request.getParameter("cboDivisa")));
                        		else
                      				out.print(BD.DataCombos(4,"",""));
  								      %>
                      </select> 
                                              <div class="invalid-feedback">
                        Por favor, seleccione la divisa.
                        </div>
                      </div>

                          <td height="3" width="345" class="texto">&nbsp;  
                        
                      </td>
                  </tr>
                  
                  <tr> 
                    <td  class="texto" align="right">Importe:</td>
                    <td height="3" width="345" class="texto"> 
                    <div class="mb-3">
                    <input type="text" class="form-control" required name="txtImporteD" size="13"  style=" WIDTH: 130px" maxlength="20"  value="<%=request.getParameter("txtImporteD")!=null?request.getParameter("txtImporteD"):""%>"  onKeyUp="validaNum(this.form.txtImporteD);"   onBlur="formatImporte(this.form.txtImporteD)"> 

                                            <div class="invalid-feedback">
                        Por favor, seleccione el Importe.
                        </div>
                    </div>

                    </td>
                  </tr>
                  <tr> 
                    <td class="texto" align="right">Concepto:</td>
                    <td class="texto"> 
                    <div class="mb-3">
                    <select class="form-select" name="cboConceptoD" required id="cboConceptoD" onChange="mostrarconcepto();">
                        <option value="">Selecciona Concepto </option>
                        <%
                        temporal=request.getParameter("cboConceptoD");
						            if(request.getParameter("cboConceptoD")!=null&&!temporal.equals("Selecciona Concepto"))                      
                           out.print(BD.DataCombos(6,(String)session.getAttribute("NumFid"),request.getParameter("cboConceptoD")));	
						            else
							             out.print(BD.DataCombos(6,(String)session.getAttribute("NumFid"),""));
				  	           %>
                      </select>
                                              <div class="invalid-feedback">
                        Por favor, seleccione el concepto.
                        </div>

                      </div>
                      </td>
                  </tr>
                  <td  class="texto" align="right">Descripci&oacute;n:</td>
                  <td  class="texto"> 
                  <div class="mb-3">
                  <input maxlength="255" name="txtConceptoD" required class="form-control" size="70" style=" WIDTH:300px" value="<%=request.getParameter("txtConceptoD")!=null?request.getParameter("txtConceptoD"):""%>"> 
                        <div class="invalid-feedback">
                        Por favor, seleccione la descripcion.
                        </div>

                  </div>
                  </td>
                  </tr>
                  <td></td>
                  <td align="left"><font class="mensaje">Max. 125 caracteres</font></td>
                  </tr>
                  <tr> 
                    <td  class="texto" align="right">Tipo de Persona:</td>
                    <td align="left" class="texto"> 
                      <input class="form-check-input" type="radio" name="radioTipoPersona" value="1" <%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("1")?"checked ":" "%> onClick="FideicomitenteD();">Fideicomitente&nbsp;</td>
                  </tr>
                  <tr> 
                    <td></td>
                    <td align="left" class="texto"><input class="form-check-input" type="radio" name="radioTipoPersona" value="2" <%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("2")?"checked ":" "%> onClick="FideicomisarioD();">
                      Fideicomisario</td>
                  </tr>
                  <tr> 
                    <td class="texto" align="right">&nbsp;</td>
                    <td align="left"  class="texto"><input class="form-check-input" type="radio" name="radioTipoPersona" value="3" <%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("3")?"checked ":" "%> onClick="TerceroD();">
                      Tercero </td>
                  </tr>
                  <tr>
                    <td name="tipoPersona" class="texto" align="right"><%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("3")?"Tercero:":request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("1")?"Fideicomitente:":request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("2")?"Fideicomisario:":"&nbsp;"%></td>
                    <td class="texto">
                    <div class="mb-3">
                    <select class="form-select" name="cboTipoD" id="cboTipoD" required>
                        <option value="">Selecciona <%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("3")?"Tercero":request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("1")?"Fideicomitente":request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("2")?"Fideicomisario":"Tipo Persona"%> 
                        <%
                        temporal=request.getParameter("radioTipoPersona");
							if(temporal!=null&&temporal.equals("3"))                      
                           		out.print(BD.DataCombos(42,(String)session.getAttribute("NumFid"),request.getParameter("cboTipoD")));	
                           	else
						    if(temporal!=null&&temporal.equals("1"))
							    out.print(BD.DataCombos(40,(String)session.getAttribute("NumFid"),request.getParameter("cboTipoD")));
							else
						    if(temporal!=null&&temporal.equals("2"))
							    out.print(BD.DataCombos(41,(String)session.getAttribute("NumFid"),request.getParameter("cboTipoD")));
				  	   %>
                      </select> 
                                              <div class="invalid-feedback">
                        Por favor, seleccione la persona que deposita.
                        </div>

                      </div>
                      </td>
                  </tr>
               
                  <% 
                       if(Integer.parseInt((String)session.getAttribute("TpoCont")) == 1 ) {
                     %>
                 
<input type="hidden"  name="cboPersona" size="13"  style=" WIDTH: 130px" maxlength="20"  value="<%=request.getParameter("cboTipoD")!=null?request.getParameter("cboTipoD"):""%>" > 

                 
                  <%
                }
                %>
                
                
              <tr> 
                <td width="150" height="24" align="right"  class="texto"> 
                  Forma de Deposito:
                </td>
                <td  class="texto"> 
                <div class="mb-3">
                      <select class="form-select" name="cboFormasL" id="cboFormasL" onchange="onChangeComboFormaDeposito()"  tabindex="7" required>
                    
                        <option value="">Selecciona una Forma</option>
                      <%
                        //if(pagosM!=null)
                          //i=10;
                      
                        String cboLiquidacion[][]= BD2.getDataFormas(13,(String)session.getAttribute("NumFid"),""); 							
                        if(cboLiquidacion!=null)
                        {
                          for(int l=0;l<cboLiquidacion.length;l++)
                          {%>
                          <option value="<%=cboLiquidacion[l][0]%>" <%=forma!=null && forma.trim().equals(cboLiquidacion[l][0].trim())?"selected":""%>> <%=cboLiquidacion[l][1]%></option>
                          <%}
                        }%>
                      </select>
                    <div class="invalid-feedback">Por favor, selecione la Forma de Deposito.</div>
                    </div>
                <span class="texto">
                  <input maxlength="89" id="txtFormaLiq" name="txtFormaLiq"  type="hidden" size="20"   value="<%=request.getParameter("txtFormaLiq")!=null?request.getParameter("txtFormaLiq"):""%>">
                </span> 
                </td>
              </tr>   
                

          <input type="HIDDEN" name="txtFolioRec" value="<%=sFolioRec%>">                 
          <%
          if(!pagosM.equals("")&&pagosM!=null)
            {
            %>            
          <tr class="texto">
            <td  align="right">
              Selecciona el Archivo:
            </td>
            <td align="left">
                <DIV align="center">
                  <P> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="archivo" type="file"/>
                  </P>
                </DIV>    
            </td>                 
          </tr>
          <tr>
            <td>
            </td>
            <td class="texto" align="right">
              <DIV align="left">
              <P>
                <input type="button" name="GeneraArchivo" class="boton" value="Recibir Archivo" onClick="javascript:generar();"/>
              </P>      
              </DIV>
            </td>
          </tr>
          <%     
          if (GeneraArchivo != null && GeneraArchivo.equals("Recibir Archivo")) {                 
                if(!campoArchivo.equals("")&&sFolioRec.equalsIgnoreCase("")){
                Folio=BD.getFolio(2);
                out.print(CargaArchivo.leeArchivo(campoArchivo,Folio));
                out.print("Archivo Cargado Satisfactoriamente");
                }else{
                 out.print("<font color=\"#FF0000\"><b>La selecci�n del archivo es obligatoria</b></font></div>");
                 GeneraArchivo="";
                 }
               }
           }    
          %>           
                

                  <tr> 
                    <td  colspan="2" class="texto"> 

                      <%if(forma!=null)

				  		{
							forma=forma.trim();
							System.out.println("Forma de liquidacion: "+forma);								
							if(forma.equals("24"))//cancelacion de cheques
								{
						%>
                      <table width="100%" border="0">
                        <tr> 
                          <td colspan="2" ><a name="formaPago"><%=forma.equals("24")?"CANCELACION DE CHEQUES DE CAJA":""%></a></td>
                        </tr>
                        <tr> 
                          <td colspan="2" class="texto">&nbsp;</td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">Numero de Cheque:</td>
                          <td  class="texto">
						  <input name="txtNumeroCheque" type="text" size="25" maxlength="25" value="<%=request.getParameter("txtNumeroCheque")!=null?request.getParameter("txtNumeroCheque"):""%>">
						  <input name="txtNumeroChequeHidden" type="HIDDEN" size="25" maxlength="10" value="<%=request.getParameter("txtNumeroCheque")!=null?request.getParameter("txtNumeroCheque"):""%>">
						  </td>
                        </tr>                        
                        <tr> 
                          <td class="texto" align="right">Nombre del Beneficiario:</td>
                          <td  class="texto">
						  <input name="txtNombreBeneficiario" type="text" size="50" maxlength="100" value="<%=request.getParameter("txtNombreBeneficiario")!=null?request.getParameter("txtNombreBeneficiario"):""%>">						  
						  <input name="txtNombreBeneficiarioHidden" type="HIDDEN" size="25" maxlength="10" value="<%=request.getParameter("txtNombreBeneficiario")!=null?request.getParameter("txtNombreBeneficiario"):""%>">
						  </td>
                        </tr>
                    
                        <tr> 
                          <td colspan="2" class="texto">&nbsp;</td>
                        </tr>
                        <%}%>
                      </table>
                      <%}%>	
                      
                      
                      
				
                 <!--SECCION CUENTAS POR COBRAR-->
                
                
                  <tr> 
                    <td colspan="2" align="center" >&nbsp;</td>
                  </tr>
                  <tr> 
                    <td class="subtitulo">Para abono en:</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr> 
                    <td></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr> 
                    <td class="texto" align="right">Contrato de Inversi&oacute;n 
                      No.:</td>
                   <td class="texto"> 
                   <select class="form-select"  name="cboContratoD" id="cboContratoD" onchange="onChangeComboNomSubCta()">
                        <option value="">Selecciona Contrato</option>
                        <%
						                temporal=request.getParameter("cboContratoD");   
                		       	if(request.getParameter("cboContratoD")!=null&&!temporal.equals("Selecciona Contrato"))
                              out.print(BD.DataCombos(3,(String)session.getAttribute("NumFid"),request.getParameter("cboContratoD")));
                        		else
                      				out.print(BD.DataCombos(3,(String)session.getAttribute("NumFid"),""));
  								      %>
                        
                      </select> 

                      </td>
                  </tr>
                  <tr> 
                    <td  class="texto" align="right"><div id="divCamposCuentas1" style="visibility:hidden;">Id Subcuenta:</div></td>
                    <td height="3" width="345" class="texto"> 
                       <div id="divCamposCuentas2" style="visibility:hidden;"> <input type="text" class="form-control"name="txtIdSubcuenta" size="13"  style=" WIDTH: 130px;" maxlength="20"  value="<%=arrayNombreSubCuenta[0].equals("")?request.getParameter("hiddentxtIdSubcuenta")==null?"":request.getParameter("hiddentxtIdSubcuenta"):arrayNombreSubCuenta[0]%>" disabled="disabled" /> 
                        <input type="hidden" name="hiddentxtIdSubcuenta" size="13"  style=" WIDTH: 130px" maxlength="20"  value="<%=arrayNombreSubCuenta[0].equals("")?request.getParameter("hiddentxtIdSubcuenta")==null?"":request.getParameter("hiddentxtIdSubcuenta"):arrayNombreSubCuenta[0]%>"/> 
                        <input type="hidden" name="hiddentxtCombo" size="13"  style=" WIDTH: 130px;" maxlength="20"  value="<%=(request.getParameter("hiddentxtCombo")==null)?"":request.getParameter("hiddentxtCombo")%>"/> 
                      </div>
                    </td>
                  </tr>
                  <tr> 
                    <td  class="texto" align="right"><div id="divCamposCuentas3" style="visibility:hidden;">Nombre Subcuenta:</div></td>
                    <td height="3" width="345" class="texto"> 
                       <div id="divCamposCuentas4" style="visibility:hidden;"> <input type="text" class="form-control"name="txtNomSubcuenta" size="13"  style=" WIDTH: 130px;" maxlength="20"  value="<%=arrayNombreSubCuenta[1].equals("")?request.getParameter("hiddentxtNomSubcuenta")==null?"":request.getParameter("hiddentxtNomSubcuenta"):arrayNombreSubCuenta[1]%>" disabled="disabled"/> 
                        <input type="hidden" name="hiddentxtNomSubcuenta" size="13"  style=" WIDTH: 130px" maxlength="20"  value="<%=arrayNombreSubCuenta[1].equals("")?request.getParameter("hiddentxtNomSubcuenta")==null?"":request.getParameter("hiddentxtNomSubcuenta"):arrayNombreSubCuenta[1]%>"/> 
                      </div>
                    </td>
                  </tr>
                  <tr> 
                    <td class="texto" align="right">Cuenta de Cheques</td>
                    <td class="texto">
                      <select class="form-select" name="cboCtaCheques" id="cboCtaCheques" onchange="onChangeCuentaCheques()">
                        <option value="">Selecciona Cuenta de Cheque</option>
                          <% 
                            temporal=request.getParameter("cboCtaCheques");   
          
                            if(request.getParameter("cboCtaCheques")!=null&&!temporal.equals("Selecciona Cuenta de Cheque"))
                              out.print(BD.DataCombos(50,(String)session.getAttribute("NumFid"),request.getParameter("cboCtaCheques")));//request.getParameter("cboCtaCheques")
                            else
                              out.print(BD.DataCombos(50,(String)session.getAttribute("NumFid"),""));
                        %>
                      </select>

                    </td>
                  </tr>
                  <tr> 
                    <td class="texto" align="right"><div id="divCamposCuentas5" style="visibility:hidden;">Sub cuentas</div></td>
                    <td class="texto">
                      <div id="divCamposCuentas6" style="visibility:hidden;"> 
                          <select class="form-select" name="cboSubCtas" id="cboSubCtas">
                            <option value="">Selecciona una Subcta</option>
                              <% 
                                temporal=request.getParameter("cboSubCtas");   
                                if(request.getParameter("cboSubCtas")!=null&&!temporal.equals("Selecciona una Subcta"))
                                  out.print(BD.DataCombos(49,(String)session.getAttribute("NumFid"),request.getParameter("cboSubCtas")));//request.getParameter("cboCtaCheques")
                                else
                                  out.print(BD.DataCombos(49,(String)session.getAttribute("NumFid"),""));
                            %>
                          </select>
                      </div>
                    </td>              
                    </tr>
            <%
                        if(request.getParameter("pagosM")!=null && request.getParameter("pagosM").equals("S") && sCaptura.equals("NO"))
                          {
                          %>   
                          <tr><td>
                        <form name="RetiroMasivo" method="post" target="Oculto2" enctype="multipart/form-data" action="<%=request.getContextPath()%>/UploadFileDepositos">                           

                              <tr align="center" > 
                                <td align="right"  colspan="2">
                                <DIV align="center">
                                  <P class="texto">
                                     Selecciona archivo:<input  name="archivo" type="file"/>&nbsp;&nbsp;&nbsp;
                                    <input class="boton" value="Enviar" type="submit"/><br><br>
                                  </P>
                                </DIV>    
                                </td> 
                                

                                  <DIV align="center">
                                    <P>&nbsp;</P>
                                    <div style="visibility:hidden; position:absolute; right:0px">
                                  <iframe name="Oculto2"  height="1" width="1" frameborder="0" allowtransparency="yes" scrolling="no"></iframe>
                                  </div>
                                  </P></DIV>
                               
                              </tr>
                          </form>        
                          </td></tr>
                        <%     
                         }    
                        %>               
                       
                
                        
                    
                  <tr> 
                    <td colspan="2" align="center" >&nbsp;</td>
                  </tr>
                  <tr> 

                    <td colspan="2" align="center" > 
                        <button type="submit"  class="btn btn-primary">Aceptar</button>
                        <script language="JavaScript" SRC='scripts/instruccion1.js'></script>

                      <!--input type="button" name="Aceptar"  class="btn btn-primary" value="Aceptar"   onClick="javascript:validacion(0,<%=(String)session.getAttribute("token")%>)" --> 

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
<script>
ocultaCamposCombo();// funcion que oculta cambos de contratos
</script>