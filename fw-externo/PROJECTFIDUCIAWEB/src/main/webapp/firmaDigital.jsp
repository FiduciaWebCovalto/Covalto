<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%
int Result1;
String detalleBit;
Result1=1;
detalleBit = " y  Numero Secuencia del Certificado:";// + dm.Sequence;								 
if(Result1!=1)
	{

	%>
	<jsp:forward page="FI_Instrucciones.jsp?error=1"/>    
	<%         
	}  
%>
