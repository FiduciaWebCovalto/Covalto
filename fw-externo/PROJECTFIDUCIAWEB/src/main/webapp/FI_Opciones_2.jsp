<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="sesionOpc2.jsp" %>

<HTML>

<HEAD><TITLE>Opciones - Solicitud de Alta de Cuenta CLABE</TITLE>

<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" SRC='scripts/registrar.js'>
</script>
<script language="JavaScript" SRC='scripts/ventanaError.js'>
</script>                         
<script language="JavaScript" type="text/JavaScript">
<!--

function generaClabe()
{
  // -- MONEDAS ---- //
    var monedaIndex = document.RegistrarCuenta.cboMoneda.selectedIndex;
    var valMoneda = document.RegistrarCuenta.cboMoneda.options[monedaIndex].value;
    valMoneda = valMoneda.substring(0, valMoneda.indexOf('-') );
    
    if(valMoneda!=1)// moneda diferente de MONEDA NACIONAL
    {
      return; // sale de la función
    }
  // -- MONEDAS ---- //

var STRCUENTA=new Array(17);
var clave;
var STRVALUE=0;

var Bancotemp=document.RegistrarCuenta.cboBanco.selectedIndex;
var Bancotemp2=document.RegistrarCuenta.cboBanco.options[Bancotemp].value.split('-');
var Banco=Bancotemp2[0];
var Plaza=document.RegistrarCuenta.txtPlaza2.value;
var Cuenta=document.RegistrarCuenta.txtNCuenta.value;
var clabeAnt=document.RegistrarCuenta.txtCuenta.value;

if(clabeAnt=='' && Banco!=''  && Plaza!='' && Cuenta!='')
{
  if(Banco.length==2){Banco='0'+Banco}
  if(Banco.length==1){Banco='00'+Banco}

  if(Plaza.length==2){Plaza='0'+Plaza}
  if(Plaza.length==1){Plaza='00'+Plaza}

  clave=Banco + Plaza + Cuenta;
  
    for(i=0;i<=16;i++){
    STRCUENTA[i] = clave.substring( i+1, 1);
    }
  
    for(i=0;i<=16;i++){
    
      switch(i%3){  
        case 0:
        STRVALUE = STRVALUE + ((3 * STRCUENTA[i])%10);      
        break;  
        case 1:
        STRVALUE = STRVALUE + ((7 * STRCUENTA[i])%10);
        break;      
        case 2:
        STRVALUE = STRVALUE + ((1 * STRCUENTA[i])%10);
        break;      
      }   
    }
  
  STRVALUE =(10 - (STRVALUE%10))%10;
  clave=Banco + Plaza + Cuenta+String(STRVALUE);
  document.RegistrarCuenta.txtCuenta.value=clave;
}

}

function cambioTitular(combo)
{
  if(combo.selectedIndex!=0)
    document.RegistrarCuenta.txtTitular.value = combo.options[combo.selectedIndex].text;
  else
    document.RegistrarCuenta.txtTitular.value = "";
}

function datosDesdeClabe()
{
  // -- MONEDAS ---- //
    var monedaIndex = document.RegistrarCuenta.cboMoneda.selectedIndex;
    var valMoneda = document.RegistrarCuenta.cboMoneda.options[monedaIndex].value;
    valMoneda = valMoneda.substring(0, valMoneda.indexOf('-') );
    
    if(valMoneda!=1)// moneda diferente de MONEDA NACIONAL
    {
      return; // sale de la función
    }
  // -- MONEDAS ---- //
  

  clabe=document.RegistrarCuenta.txtCuenta.value
  var BancoDeClabe=clabe.substring(0,3);
  //alert(BancoDeClabe)
  
      for(i=0;i<document.RegistrarCuenta.cboBanco.options.length;i++)
      {
          var Bancotemp2=document.RegistrarCuenta.cboBanco.options[i].value.split('-');
          
          var Banco=Bancotemp2[0];
          if(Banco.length==2){Banco='0'+Banco}
          if(Banco.length==1){Banco='00'+Banco}
          
          if(BancoDeClabe==Banco)
          {
          //alert(BancoDeClabe)
          document.RegistrarCuenta.cboBanco.selectedIndex=i;
          }
      }
      
  document.RegistrarCuenta.txtPlaza2.value=clabe.substring(3,6);
  document.RegistrarCuenta.txtNCuenta.value=clabe.substring(6,17);

}

function FideicomitenteD()
  {
    document.RegistrarCuenta.action = "FI_Opciones_2.jsp#tipoPersona";        
    document.RegistrarCuenta.submit();
  } 
function TerceroD()
  {
      document.RegistrarCuenta.action = "FI_Opciones_2.jsp#tipoPersona"; 
      document.RegistrarCuenta.submit();
  }
function FideicomisarioD()
  {
      document.RegistrarCuenta.action = "FI_Opciones_2.jsp#tipoPersona"; 
      document.RegistrarCuenta.submit();
  }
  
function LimpiaCombo(){


      document.RegistrarCuenta.action = "FI_Opciones_2.jsp#tipoPersona"; 
      document.RegistrarCuenta.submit();
}
//-->
</script>
</HEAD>


<!--  ALTA DE TRANSFERENCIA ELECTRONICA -->

<body class="bg-light">

<%
      if( request.getAttribute("mensajeError") != null ) { %>
           <script language="javascript"> ventanaError() </script>
       <%
      }         
%>
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
        <%@ include file="menuOpciones.jsp" %>
      </TD>
      <TD valign="top" align="center">
     <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %></td>
          </tr>
        </table>
        <table width="593" border="0">
          <tr> 
            <td class="texto">&nbsp;</td>
          </tr>
         
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Solicitud de Alta de Cuenta CLABE</td>
          </tr>
         
          
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td valign="top" align="center"> 
              <table border="0" width="90%">
                <tr> 
                  <td align="center" class="alerta" > <%=(request.getParameter("permiso")!=null && ( ((String)session.getAttribute("permiso")).equals("CLIENTE CONSULTA")||((String)session.getAttribute("permiso")).equals("CLIENTE DEPOSITO")||((String)session.getAttribute("permiso")).equals("CLIENTE CAPTURA") )) || (request.getParameter("permiso")!=null && request.getParameter("permiso").equals("0"))?"Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operación<br>":""%> 
                  </td>
                </tr>
              </table>
              
              
              <form name="RegistrarCuenta" method="post" action="confirmarOpc_2.jsp">
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
                <table width="90%" height="98" id="datos">
                  <tr> 
                    <td class="texto" align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2"> 
          <input type="HIDDEN" value="0" maxlength=100 name="txtPlaza"  size="20" style=" WIDTH: 200px"> 
                    </td>
                  </tr>
                  <tr> 
                    <td colspan="2"><input type="HIDDEN" value="0" maxlength=100 name="txtSucursal"  size="10" style=" WIDTH:100px"> 
                    </td>
                  </tr>
                  <tr> 
                    <td width="198" class="texto" align="right">Moneda:</td>                    
                      <td class="texto"> 
                      
                      <select name="cboMoneda" >
                        <option>Selecciona Moneda 
                        <%                            
                              out.print(BD.DataCombos(53,"",request.getParameter("cboMoneda")!=null?request.getParameter("cboMoneda"):"-1"));
                            
                        %>
                        </option>
                      </select> 
                      
                          <td height="3" width="345" class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td width="198" class="texto" align="right">Banco:</td>                    
                      <td class="texto"> <select name="cboBanco" >
                        <option>Selecciona Banco 
                        <%                            
                              out.print(BD.DataCombos(48,"",request.getParameter("cboBanco")!=null?request.getParameter("cboBanco"):"-1"));
                            
                        %>
                        </option>
                      </select> 
                      
                          <td height="3" width="345" class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td width="198" class="texto" align="right">Plaza:</td>
                    <td width="336" align="left"><input maxlength=3 name="txtPlaza2" onBlur="generaClabe()" value="<%=((request.getParameter("txtPlaza2")!=null)?request.getParameter("txtPlaza2"):"")%>" size="18" style=" WIDTH: 120px"> 
                      <font class="mensaje"> (3 d&iacute;gitos)</font></td>
                  </tr>
                  <tr> 
                    <td width="198" class="texto" align="right">Cuenta:</td>
                    <td width="336" align="left"><input maxlength=11 name="txtNCuenta" onBlur="generaClabe()" value="<%=((request.getParameter("txtNCuenta")!=null)?request.getParameter("txtNCuenta"):"")%>"  size="18" style=" WIDTH: 120px"> 
                      <font class="mensaje"> (11 d&iacute;gitos)</font></td>
                  </tr>
                  <tr> 
                    <td width="198" class="texto" align="right">N&uacute;mero 
                      de Cuenta:</td>
                    <td width="336" align="left"><input maxlength=18 name="txtCuenta" onBlur="datosDesdeClabe()"  size="18" style=" WIDTH: 120px" value="<%=((request.getParameter("txtCuenta")!=null)?request.getParameter("txtCuenta"):"")%>"> 
                      <font class="mensaje"> (18 d&iacute;gitos)</font></td>
                  </tr>
                  <tr> 
                    <td  class="texto" align="right">Tipo de Persona:</td>
                  <td align="left" class="texto"> 
                      <input type="radio" name="radioTipoPersona" value="0" id="rTP0" <%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("0")?"checked ":" "%> onClick="LimpiaCombo();">Fideicomiso&nbsp;</td>
                  </tr>
                  <tr> 
                    <td></td>
                    <td align="left" class="texto"><input type="radio" name="radioTipoPersona" id="rTP1" value="1" <%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("1")?"checked ":" "%> onClick="FideicomitenteD();">
                      Fideicomitente</td>
                  </tr>
                  <tr> 
                    <td></td>
                    <td align="left" class="texto"><input type="radio" name="radioTipoPersona" id="rTP2" value="2" <%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("2")?"checked ":" "%> onClick="FideicomisarioD();">
                      Fideicomisario</td>
                  </tr>
                  <tr> 
                    <td class="texto" align="right">&nbsp;</td>
                    <td align="left"  class="texto"><input type="radio" name="radioTipoPersona" id="rTP3" value="3" <%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("3")?"checked ":" "%> onClick="TerceroD();">
                      Tercero </td>
                  </tr>
                  <tr> 
                    <td name="tipoPersona" id="tipoPersona" name="tipoPersona" style="visibility:hidden;" class="texto" align="right"><%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("1")?"Fideicomitente:":request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("2")?"Fideicomisario:":request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("3")?"Tercero:":"&nbsp;"%></td>
                    <td  class="texto"> <select name="cboTipoD" id="cboTipoD" onchange="cambioTitular(this);">
                        <option value="-1">Selecciona <%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("1")?"Fideicomitente":request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("2")?"Fideicomisario":request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("3")?"Tercero":"Tipo Persona"%> 
                        <%
                        String temporal="";
                        temporal=request.getParameter("radioTipoPersona");
                        
              if(temporal!=null&&temporal.equals("0")){
              
              }else{
                        
              if(temporal!=null&&temporal.equals("1"))                      
                              out.print(BD.DataCombos(40,(String)session.getAttribute("NumFid"),request.getParameter("cboTipoD"))); 
                            else
                if(temporal!=null&&temporal.equals("2"))
                  out.print(BD.DataCombos(41,(String)session.getAttribute("NumFid"),request.getParameter("cboTipoD")));
              else
                if(temporal!=null&&temporal.equals("3"))
                  out.print(BD.DataCombos(42,(String)session.getAttribute("NumFid"),request.getParameter("cboTipoD")));
                 
              
                }
               %>
                      </select> </td>
                  </tr>
                  
                  
                  
                  
                  <tr> 
                    <td width="198" class="texto" id="tdtitular" style="visibility:hidden;" align="right">Titular de la 
                      Cuenta:</td>
                    <td width="336" align="left"> <input maxlength=100 name="txtTitular" id="txtTitular"  size="40" style=" WIDTH: 300px;visibility:hidden;" 
                         onblur="convertirMayusculas(this)"> </td>
                    <%
                    if(temporal!=null){
              if(temporal.equals("0")){
              %><script>
              document.RegistrarCuenta.cboTipoD.style.visibility='hidden';
              document.getElementById('tipoPersona').style.visibility='hidden';
              
              document.RegistrarCuenta.txtTitular.style.visibility='visible';
              document.getElementById('tdtitular').style.visibility='visible';
</script><%
              }else{
              %><script>document.RegistrarCuenta.cboTipoD.style.visibility='visible';
              document.getElementById('tipoPersona').style.visibility='visible'
              document.RegistrarCuenta.txtTitular.style.visibility='hidden';
              document.getElementById('tdtitular').style.visibility='hidden';
</script><% }
                }else{%><script>document.RegistrarCuenta.cboTipoD.style.visibility='hidden';
              
</script><% }
               %>
                  </tr>
                  <tr> 
                    <td class="texto" align="right">RFC:</td>
                    <td><input maxlength=13 name="txtRFC" size="15" style=" WIDTH: 100px" 
                         onblur="convertirMayusculas(this)" value="<%=((request.getParameter("txtRFC")!=null)?request.getParameter("txtRFC"):"")%>" ></td>
                  </tr>
                  <tr> 
                    <td colspan="2" >&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2" class="texto">Tu Direcci&oacute;n de Correo 
                      Electronico es: <b><i><font face="Arial"> <%= session.getAttribute("Email") %></font></i></b></td>
                  </tr>
                  <tr> 
                    <td class="texto" align="right" >Otra Direcci&oacute;n de 
                      Correo Electronico:</td>
                    <td class="texto"> <input maxlength=100 name="txtCorreo"  size="20" style=" WIDTH: 150px" value="<%=((request.getParameter("txtCorreo")!=null)?request.getParameter("txtCorreo"):"")%>"> 
                      <font class="mensaje">(Opcional)</font> </td>
                  </tr>
                  <tr> 
                    <td class="texto">&nbsp;</td>
                    <td class="texto"><b></b></td>
                  </tr>
     
      
                  <tr> 
                    <td class="texto" colspan="2">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td class="texto" colspan="2" align="center"> <input type="button" name="Aceptar2" value="Aceptar" class="boton" onClick="javascript:validacion(<%=(String)session.getAttribute("token")%>)"> 
                      &nbsp; <input type="button" name="Cancelar2" value="Cancelar" class="boton" onClick="javascript:cancelar()"> 
                    </td>
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

</BODY></HTML>
