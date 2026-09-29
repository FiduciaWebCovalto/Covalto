<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="sesionInstrucc.jsp" %>
<HTML  xmlns:th="http://www.thymeleaf.org">
<HEAD><TITLE>Traspaso - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" SRC='scripts/general.js'></script>
</HEAD>
<body class="bg-light">
<jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
<div class="table-responsive" style="max-height: 900px; overflow-y: auto;">
    <table id="fisosDisponibles"  class="table table-responsive table-hover"> 
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Traspaso 
              entre Contratos de Inversi&oacute;n</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"> <form name="Traspaso" id="Traspaso"  method="post" action="confirmarInst_3.jsp"
                                            class="needs-validation" novalidate>
			 <table width="50%" border="0" cellspacing="1" cellpadding="1" align="center">
                  <tr>
                    <td><div id="token" style="position:absolute; visibility:hidden;"   align="center"> 
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
                                    <input class="form-control"  type="password" name="txtToken" size="10"  style=" WIDTH: 100px"
                                 maxlength="6"  value="<%=request.getParameter("txtToken")!=null?request.getParameter("txtToken"):""%>"></td>
                                </tr>
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                                <script language="JavaScript" SRC='scripts/instruccion3.js'></script>
                                <tr> 
                                  <td colspan="2" align="center"> <input class="form-control"  type="button" name="AceptarToken" value="Aceptar" onClick="aceptarToken()" class="btn btn-primary"> 
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input class="form-control"  type="button" name="CancelarToken" value="Cancelar" onClick="ocultarToken();" class="btn btn-danger"> 
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
                <table width="90%" id="datos">
                  <tr> 
                    <td colspan="2" class="subtitulo">Traspaso:</td>
                  </tr>
                  <tr> 
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td align="right"  class="texto" >Fecha:</td>
                    <td class="texto">
                    <input class="form-control"  type="hidden" name="txtFecha" maxlength=10 size="8" 
                    value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha%>" class="texto"> 
                      <input class="form-control"  type="text" id="fechaFormateada" name="cboCalendarioI"  style=" WIDTH: 60px" 
                      value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha%>" 
                      onChange="Traspaso.txtFecha.value=Traspaso.cboCalendarioI.value;">
                      <input class="form-control"  type="button" id="lanzaCalendarioI" name="lanzaCalendarioI"  
                      style=" WIDTH: 15px"   class="botonCbo" value="v">
                    <SCRIPT type=text/javascript>
                        // script que define y configura el calendario-
                        Calendar.setup({
                            inputField     :    "cboCalendarioI",      // id del campo de texto
                            ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
                            button         :    "lanzaCalendarioI"   // el id del botón que lanzará el calendario
                        });					
                    </SCRIPT> &nbsp; 
                        &nbsp; 
                    </td>
                  </tr>
                  <tr> 
                    <td width="187" class="texto" align="right"> Contrato de inversi&oacute;n 
                      Origen:</td>
                    <td class="texto"> 
                    <div class="mb-3">
                    <select class="form-select"  name="cboContratoOrigenTC" id="cboContratoOrigenTC" required>
                        <option value="">Selecciona Contrato</option> 
                        <%
		    out.print(BD.DataCombos(3,(String)session.getAttribute( "NumFid" ),""));%>
                      </select> 
                      <div class="invalid-feedback">
                        Por favor, seleccione el Contrato Origen.
                        </div>

                      </div>
                      </td>
                  </tr>
                  
                  <tr> 
                   <tr> 
                    <td width="187" class="texto" align="right"> Subcuenta 
                      Origen:</td>
                    <td class="texto">
                    <div class="mb-3">
                    <select class="form-select"  name="cboSubCuentaOrigen" id="cboSubCuentaOrigen" required>
                        <option value="">Selecciona Subcuenta</option>
                        <%
                              out.print(BD.DataCombos(49,(String)session.getAttribute("NumFid"),""));
                         %>
                      </select>
                      <div class="invalid-feedback">
                        Por favor, seleccione la SubCuenta Origen.
                        </div>

                      </div>
                      </td>
                  </tr>
                  
                  <tr> 
                    <td width="187" class="texto" align="right"> Contrato de inversi&oacute;n 
                      Destino:</td>
                    <td class="texto"> 
                    <div class="mb-3">
                    <select class="form-select"  name="cboContratoDestinoTC" id="cboContratoDestinoTC" required>
                        <option value="">Selecciona Contrato </option>
                        <%
		    out.print(BD.DataCombos(3,(String)session.getAttribute( "NumFid" ),""));%>
                      </select>
                      <div class="invalid-feedback">
                        Por favor, seleccione el Contrato destino.
                        </div>

                      </div>
                      </td>
                  </tr>
                  <tr> 
                    <td width="187" class="texto" align="right"> Subcuenta 
                      Destino:</td>
                    <td class="texto">
                    <div class="mb-3">
                    <select class="form-select"  name="cboSubCuentaDestino" id="cboSubCuentaDestino" required>
                        <option value="">Selecciona Subcuenta</option>
                        <%
                              out.print(BD.DataCombos(49,(String)session.getAttribute("NumFid"),""));
                         %>
                      </select>
                      <div class="invalid-feedback">
                        Por favor, seleccione la SubCuenta destino.
                        </div>

                      </div>
                      </td>
                  </tr>
                  <tr> 
                    <td width="187" class="texto" align="right">Importe:</td>
                    <td class="texto"> 
                    <div class="mb-3">
                    <input class="form-control"  type="text" name="txtImporteTC" size="13" maxlength="20"   onKeyUp="validaNum(this.form.txtImporteTC);"   onBlur="formatImporte(this.form.txtImporteTC)" required>  
                      <div class="invalid-feedback">
                        Por favor, introduce el importe.
                        </div>                    
                    </div>
                    </td>
                  </tr>
                  
                  <tr> 
                    <td colspan="2" >&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2" >&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2" align="center"> 
                    <button type="submit" class="btn btn-primary">Aceptar</button>
                    </td>
                  </tr>
                </table>
              </form>
              <table border=0 cellpadding=0 cellspacing=1 class=texto_menu_inf width=530 align="center">
                <tr> 
                  <td height="12" colspan="9" class="texto_menu_inf" align="center"></td>
                </tr>
                <tr> 
                  <td width="482" height="12" colspan="9" class="texto_menu_inf" align="center"></td>
                </tr>
                <tr align=middle valign=center> 
                  <td class=texto_menu_inf colspan="9" height="30" align="center"><a  href="#top"><img  border=0 height=11 src="imagenes/arriba.gif" width=59></a></td>
                </tr>
                <tr align=middle> 
                  <td class=texto_menu_inf colspan=9 height=7 align="center"><img height=1 src="imagenes/cnaranja01.gif" width=400></td>
                </tr>
                <tr> 
                  <td class=texto_menu_inf colspan=9 height=7>&nbsp;</td>
                </tr>
              </table>
              <table border=0 cellpadding=0 cellspacing=1 >
                <tbody>
                  <tr> 
                    <td align="middle" class="ref" >|<a  href="FI_Legales.jsp" class="ref">ASPECTOS  LEGALES</a>|</td>
                    
                  </tr>
                </tbody>
              </table></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
    </table>
</div>
</BODY></HTML>
