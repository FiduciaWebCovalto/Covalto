<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%
int i=0;
int j=0;
int pregunta=0;
int numPre =BD.getNumRegistros("PERSENC");
int numInc = BD.getNumRegistros("INCENC");
int Reg =numPre + numInc;
int columnas = BD.getNumRegistros("OPCENC");
String []  sEncuesta = new String[Reg];
String []  sOpciones =new String[columnas];


if(numPre>0 && columnas>0 && numInc>0 && request.getParameter("enviada")==null)
     {
sEncuesta = BD.getEncuesta();
sOpciones = BD.getOpcionesEncuesta();
     }%>


<HTML><HEAD><TITLE>Encuesta - FiduciaWeb Movil: Encuesta</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=0>
<%if(numPre>0 && columnas>0 && numInc>0 && request.getParameter("enviada")==null)
     {%>
<script language="JavaScript">
function validacion() {

  var falta=0;
  for (var i=0;i<document.Encuesta.elements.length&&falta==0;i+=<%=columnas%>)
	 {
		if (
			<%for(j=0;j<columnas;j++)
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
		if(j==1&&(sEncuesta[j].trim()).indexOf(')')>0)
			{%>
			  if(i==0)
				{
				parent.location.href="<%="#"+pregunta%>";
				alert("Elige una opcion en el Inciso  \' <%=(sEncuesta[j].trim()).charAt(0)%> \'  de la Pregunta <%=pregunta%>");
				}
		  <%if(j<((Reg)-1))
			     out.print("else ");
		  	}
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

<%}//if(numPre>0 && columnas>0 && numInc>0 && request.getParameter("enviada")==null)
%>

<link href="styles/bancomext.css" rel="stylesheet" type="text/css">
</HEAD>
<BODY vLink=#052206 leftMargin=0 
topMargin=0 marginwidth="0" marginheight="0" >
<a name="top"></a>
<table border="0" width="580">
  <tr> 
    <td width="570" height="12" ></td>
  </tr>
  <tr> 
   <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Encuesta</td>
  </tr>
  <tr> 
    <td>&nbsp;</td>
  </tr>

  <tr> 
    <td align="center"> 
	<%if(numPre>0 && columnas>0 && numInc>0 && request.getParameter("enviada")==null)
     		{%>

        <table width="550" border="0">
          <tr> 
            <td colspan="2" class="subtitulo" height="23" align="center"> 
	        NOS INTERESA TU OPINI&Oacute;N
	    </td>
          </tr>
	  <tr> 
            <td colspan="2">&nbsp;</td>
          </tr>
          <tr> 
            <td colspan="2" class="texto" align="justify"> 
		Eval�a el nivel de servicio de la Direcci�n Fiduciaria
	    </td>
          </tr>
          <tr> 
            <td colspan="2">&nbsp;</td>
          </tr>
          <tr> 
            <td  width="170" class="nota" align="justify" >
		Marca la opci&oacute;n correspondiente:
	    </td>
	    <td   width="380" class="nota" align="justify" >
	   	<%
		for(j=0;j<columnas;j++)
		out.print("<b>&nbsp;&nbsp;&nbsp;&nbsp;"+(sOpciones[j].trim()).charAt(0)+"</b>="+sOpciones[j].trim()+" ");
		%>
	    </td>
          </tr>
		  
	  </table>
	  <form name="Encuesta" method="post" action="mail.jsp?tipo=3">
	  <table width="550" border="0">
          
	 
	 <%
	pregunta=0;
	for(i=0;i<Reg;i++)
		{
		if((sEncuesta[i].trim()).indexOf('-')>0)
		  {
		  pregunta++;
		  %>
		  <tr>
		  <td bordercolor="#006699" bgcolor="#999966" class="celda01" align="justify"><a name="#<%=pregunta%>"></a><%=sEncuesta[i].trim()%></td>
			<%for(j=0;j<columnas;j++)
				{%>
				<td  bordercolor="#006699" bgcolor="#999966" class="celda01" align="center"><%=sOpciones[j].trim().charAt(0)%></td>
				<%}%>
		   </tr>
		<%}

		if((sEncuesta[i].trim()).indexOf(')')>0)
		  {%>
		  <tr>
		  <td class="celdaInciso" align="justify"><%=sEncuesta[i].trim()%></td>
			<%for(j=0;j<columnas;j++)
				{%>
				<td class="celda02" align="center"><input type="radio" name="p<%=pregunta+""+(sEncuesta[i].trim()).charAt(0)%>" value="<%=sOpciones[j]%>" style="HEIGHT: 22px; WIDTH: 20px"></td>
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
            <td colspan="<%=columnas+1%>" class="texto">Tus comentarios, quejas o sugerencias 
              nos permitir&aacute;n mejorar nuestro servicio.</td>
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
            <td colspan="<%=columnas+1%>"align="center" class="subtitulo"><strong>Muchas Gracias</strong></td>
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


      <%} //fin encuesta if(numPre>0 && columnas>0 && numInc>0 && request.getParameter("enviada")==null)
   else{
   		%>
      <table border="0" class="subtitulo" width="80%">
        <tr> 
          <td align="center"><p><br>
              <br>
              <br>
              GRACIAS TU OPINION ES IMPORTANTE</p>
            <p>
              <input type="button" name="CERRAR" value="CERRAR" class="boton" onClick="javascript:window.close()">
            </p></td>
        </tr>
      </table>
      <%
   		}
   %>
      </td>
  </tr>
  <tr> 
    <td>&nbsp;</td>
  </tr>
</table>
</BODY>
</HTML>
