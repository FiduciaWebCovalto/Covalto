<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="SesionOpciones.jsp" %>
<%
int menu=Integer.parseInt(request.getParameter("menu")!=null?request.getParameter("menu").trim():"0");
String titulo="OPCIONES";
int i=0,j=0,pregunta=0;
int numPre =0;
int numInc =0;
int Reg =0;
int columnas = 0;
String []  sEncuesta = null;
String []  sOpciones =null;
String[] bitacora = new String[5];
String fechaCont=BD.getFecha();
String folioBit="";
int regBitacora=0;

/*
menu=1;Cambio de Contrase�a
menu=2;Solicitud de  alta de cuenta para transferencia electronica de fondos
menu=3;Encuesta
menu=4;Ayuda
*/
switch(menu)
					{
					case 3:
							titulo="Encuesta";
							 i=0;
							 j=0;
							pregunta=0;
							numPre =BD.getNumRegistros("F_ENCUESTA");
							numInc =BD.getNumRegistros("F_OPCENC_ENCUES");
							Reg =numPre + numInc;
							columnas = 5;//BD.getNumRegistros("F_OPCENC");
							sEncuesta = new String[Reg];
							sOpciones =new String[columnas];
							if(numPre>0 && columnas>0 && numInc>0)
								 {
								   //incorporacion de la bitacora
									 folioBit=BD.getFolio(2);
									 bitacora[0]=fechaCont;
									 bitacora[1]= folioBit;
									 bitacora[2]=(String)session.getAttribute("username");
									 bitacora[3]="Consulta de Encuesta";
									 bitacora[4]="120.0.0.1";
								   
									 regBitacora=BD.insertaBitacora(bitacora);								 
									sEncuesta = BD.getEncuesta();
									sOpciones = BD.getOpcionesEncuesta();
								}
							break;
					case 4:
							titulo="Temas de Ayuda";
							break;
					default:
							titulo="OPCIONES	";
							break;	
					}//switch(menu)
%>
<HTML>
<HEAD><TITLE>Opciones - <%=titulo%></TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<%
//definicion de scripts del menu
switch(menu)
					{

					case 3:
							//="Encuesta"
							%>
							<%if(numPre>0 && columnas>0 && numInc>0)
									 {%>
								<script language="JavaScript">
								function validacion() {
								
								  var falta=0;
								
								  for (i=0;i<document.Encuesta.elements.length&&falta==0;i+=<%=columnas%>)
									 {
									if (
									<%
									for(j=0;j<columnas;j++)
								
										{%>
								
											(document.Encuesta.elements[i+<%=j%>].type=="radio"&&document.Encuesta.elements[i+<%=j%>].checked==false)
										<%
										if(j<(columnas-1))
											out.print("&&");
										%>
										  <%}%>	
								
									   )
								
										 {
										
										falta=1;
								
								
								
									<%int m=0;
										for(j=0;j<Reg;j++)
									   {
										if((sEncuesta[j].trim()).indexOf('-')>0)
										  {
										  pregunta++;
										  j++;
										  }
                    if(j>=Reg)
                      break;
										if(j==1&&(sEncuesta[j].trim()).indexOf(')')>0)
										{
								
										   %>
										  if(i==0)
											{
											parent.location.href="<%="#"+pregunta%>";
								
											alert("Elige una opcion en el Inciso  \' <%=(sEncuesta[j].trim()).charAt(0)%> \'  de la Pregunta <%=pregunta%>");
											}
										  <%if(j<((Reg)-1))
											 out.print("else ");
										  }
                    if(j>=Reg)
                      break;                      
										if(j>1&&(sEncuesta[j].trim()).indexOf(')')>0)
										  {
								
										   %>
										  if(i==<% m=m+columnas;out.print(m);%>)
											{
											parent.location.href="<%="#"+pregunta%>";
								
											alert("Elige una opcion en el Inciso  \' <%=(sEncuesta[j].trim()).charAt(0)%> \'  de la Pregunta <%=pregunta%>");
											}
										  <%if(j<((Reg)-1))
											 out.print("else ");
								
											
										}
									   }%>
								
								  
								
											 }
								
								  }
								
								
								
								if(falta==0)
									  {
								
									 document.Encuesta.submit();
									  }
								
								
								
											}
								
								function cancelar() 
								
								 {
								
								  
								
								  for (i=0;i<document.Encuesta.elements.length;i++)
								
									 if ((document.Encuesta.elements[i].type=="radio")&&(document.Encuesta.elements[i].checked))
								
										document.Encuesta.elements[i].checked=false;
								
								  document.Encuesta.sugerencia.value="";
								
								}
								</script>
								<%}
							break;	
					}//switch(menu)

%>

</HEAD>
<body class="bg-light">
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo"><%=titulo%></td>
          </tr>
		  <tr> 
            <td class="alerta" align="center"><br><%=session.getAttribute("msgError")!=null ?(String)session.getAttribute("msgError")+"<br>":""%></td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td valign="top" align="center"> 
              <%
			  
			   session.setAttribute("msgError","");
			switch(menu)
					{
					
					case 3:
							//="Encuesta";
							 if(request.getParameter("enviada")!=null)
							 		{
									%>
              <table border="0" class="subtitulo" width="80%">
                <tr> 
                  <td align="center"><br> <br> <br>
                    GRACIAS TU OPINION ES IMPORTANTE </td>
                </tr>
              </table>
              <%
									}
							else {
													
							if(numPre>0 && columnas>0 && numInc>0)
											{%>
              <table width="90%" border="0">
                <tr> 
                  <td colspan="2" class="subtitulo" height="23" align="center"> 
                    NOS INTERESA TU OPINI&Oacute;N </td>
                </tr>
                <tr> 
                  <td colspan="2">&nbsp;</td>
                </tr>
                <tr> 
                  <td colspan="2" class="texto" align="justify"> Eval�a el nivel 
                    de servicio de la Direcci�n Fiduciaria </td>
                </tr>
                <tr> 
                  <td colspan="2">&nbsp;</td>
                </tr>
                <tr> 
                  <td  width="170" class="nota" align="justify" > Marca la opci&oacute;n 
                    correspondiente: </td>
                  <td   width="380" class="nota" align="justify" > 
                    <%
										for(j=0;j<columnas;j++)
										out.print("<b>&nbsp;&nbsp;&nbsp;&nbsp;"+(sOpciones[j].trim()).charAt(0)+"</b>="+sOpciones[j].trim()+" ");
										%>
                  </td>
                </tr>
              </table>
              <form name="Encuesta" method="post" action="mail.jsp?tipo=1">
                <table width="90%" border="0">
                  <%
									pregunta=0;
									for(i=0;i<Reg;i++)
										{
										if((sEncuesta[i].trim()).indexOf('-')>0)
										  {
										  pregunta++;
										  %>
                  <tr> 
                    <td bordercolor="#006699" bgcolor="#999966" class="celda01" align="justify" ><a name="#<%=pregunta%>"></a><%=sEncuesta[i].trim()%></td>
                    <%for(j=0;j<columnas;j++)
												{%>
                    <td bordercolor="#006699" bgcolor="#999966" class="celda01" align="center"><%=sOpciones[j].trim().charAt(0)%></td>
                    <%}%>
                  </tr>
                  <%}
								
										if((sEncuesta[i].trim()).indexOf(')')>0)
										  {%>
                  <tr> 
                    <td class="celdaInciso" align="justify"><%=sEncuesta[i].trim()%></td>
                    <%for(j=0;j<columnas;j++)
												{%>
                    <td class="celdaInciso" align="center"><input type="radio" name="p<%=pregunta+""+(sEncuesta[i].trim()).charAt(0)%>" value="<%=sOpciones[j]%>" style=" WIDTH: 20px"></td>
                    <%}%>
                  </tr>
                  <%}
										if((i<(Reg-1))&&((sEncuesta[i+1].trim()).indexOf('-')>0))
										{%>
                  <tr> 
                    <td colspan="<%=columnas+1%>">&nbsp;</td>
                  </tr>
                  <%}
										}%>
                  <tr> 
                    <td colspan="<%=columnas+1%>">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="<%=columnas+1%>" class="texto">Tus comentarios, 
                      quejas o sugerencias nos permitir&aacute;n mejorar nuestro 
                      servicio.</td>
                  </tr>
                  <tr> 
                    <td colspan="<%=columnas+1%>"><input type="text" name="sugerencia"  size="60" style=" WIDTH: 570px" ></td>
                  </tr>
                  <tr> 
                    <td colspan="<%=columnas+1%>">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="<%=columnas+1%>"align="center"> <input type="button" name="Enviar" value="Enviar" class="boton" onClick="javascript:validacion()"> 
                      &nbsp; <input type="button" name="Cancelar2" value="Cancelar" class="boton" onClick="javascript:cancelar()"> 
                    </td>
                  </tr>
                  <tr> 
                    <td colspan="<%=columnas+1%>"align="center" class="subtitulo">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="<%=columnas+1%>"align="center" class="subtitulo"><strong>Muchas 
                      Gracias</strong></td>
                  </tr>
                  <tr> 
                    <td colspan="<%=columnas+1%>"> <table border=0 cellpadding=0 cellspacing=1 class=texto_menu_inf width=530 align="center">
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
                      </table></td>
                  </tr>
                </table>
              </form>
              <%}//fin encuesta
									 }//fin else enviada					
							break;
					case 4:
							//="Ayuda";
							%>
              <table border="0" width="90%" >
                <tr> 
                  <td  class="texto"><p align="justify"> Para Abrir los archivos 
                      de Ayuda debe tener instalado <a href="http://download.winzip.com/winzip81.exe"> 
                      WinZip</a> en su equipo, dado que los archivos estan comprimidos 
                      con un formato zip para reducir el tiempo de descarga.<br>
                      <br>
                    </p></td>
                </tr>
                <tr> 
                  <td class="texto" align="justify"> Haga click sobre los siguientes 
                    v&iacute;nculos para descargar los manuales de usuario:</td>
                </tr>
                <tr> 
                  <td class="Texto"> <br><ul>
                      <li><a href="formatos/Manual_BANCOMEXT-LLAVE.zip">Manual de 
                        Usuario</a></li>
                    </ul></td>
                </tr>
                <tr> 
                  <td align="center" class="subtitulo">&nbsp;</td>
                </tr>
              </table>
              <%	
							break;
					default:
							//="OPCIONES	";
							%>
              <table border="0" width="90%" >
                <tr> 
                  <td  class="texto">
				  <ul>
                    <%    if(tipoUsuario!=null &&  (tipoUsuario.equals("CLIENTE OPERATIVO") ||  tipoUsuario.equals("CLIENTE CAPTURA")))

  							{%>
                    
                      <li> Solicitar el alta de cuenta para Transferencia Electr�nica 
                        de Fondos.</li>
                    
                    <%}%>
                    </ul></td>
                </tr>
              </table>
              <%
							break;	
					}//switch(menu)
%>
            </td>
          </tr>
        </table>
		</TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
<%
   if(menu==1)
  {
%>	
   <script language="JavaScript">
   document.CambioPwd.txtAnterior.focus();
   </script>
<%
   }
%>	
</BODY></HTML>
