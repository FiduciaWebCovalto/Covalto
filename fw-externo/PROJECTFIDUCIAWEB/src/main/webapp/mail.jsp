<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->
<jsp:useBean id="BD" class="mx.com.inscitech.clients.negocio.FiduciaBD">en</jsp:useBean>


<%@ page import="java.util.*, javax.mail.*, javax.mail.internet.*, java.io.*, javax.activation.*" %>
<%
 //REPORTE: 89621(PERMITE REGISTRAR CON DISTINTO RFC EL MISMO No. de CUENTA)
int tipo=Integer.parseInt(request.getParameter("tipo")!=null?request.getParameter("tipo").trim():"0");
Properties props = new Properties();
String fromAddress = "";
String toAddress = "";
%>		
<%@ include file="configuraMail.jsp" %>
<%
Session s = Session.getInstance(props,null);
Message message = new MimeMessage(s);


String sCuerpo="";
String subject = "";
int numeroValidacion=0;//solo para alta de cuentas

switch(tipo)
			{
			case 1://encuesta
			case 3:
					subject ="Encuesta de FiduciaWeb Movil en Internet";
					
					int i=0,j=0,pregunta=0;
					int numPre =BD.getNumRegistros("F_ENCUESTA");
					int Reg =numPre + BD.getNumRegistros("F_OPCENC_ENCUES");
					String []  sEncuesta = new String[Reg];
					int columnas = 5;//BD.getNumRegistros("OPCENC");
					
					String []  sOpciones =new String[columnas];
					sEncuesta = BD.getEncuesta();
					  sCuerpo="";
					  sCuerpo+="<HTML><HEAD><TITLE>Encuesta - FiduciaWeb Movil: Encuesta</TITLE>"
							+ "<META content=\"text/html; charset=windows-1252\" http-equiv=Content-Type>"
							+"<META content=\"P�gina Principal\" name=0>"
							+"<link href=\"http://www.bancomext.com/fiducia/styles/bancomext.css\" rel=\"stylesheet\" type=\"text/css\">"
							+"</HEAD>"
							+"<BODY vLink=#052206 leftMargin=0 topMargin=0 marginwidth=0 marginheight=0 >"
							+"<table border=0 width=600>"
							+"<tr class=\"titulo\">"
							+"<td height=12><b>USUARIO:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ session.getAttribute("NomUser")+"<b></td><td>&nbsp;</td>"
							+"</tr>"
							 +"<tr class=\"titulo\">"
							+"<td width=800 height=12>&nbsp;</td><td>&nbsp;</td>"
							+"</tr>";
						   
					   
					
					  pregunta=0;
					
						for(i=0;i<Reg;i++)
							{
							if((sEncuesta[i].trim()).indexOf('-')>0)
							  {
								sCuerpo+="<tr >";
								sCuerpo+="<td bordercolor=\"#006699\" bgcolor=\"#999966\" class=\"celda01\" align=\"justify\" colspan=\"2\"><b>";
								pregunta++;  
								sCuerpo +=sEncuesta[i].trim()+"\n";	
								sCuerpo+="</b></td></tr>";
							  }
					
							if((sEncuesta[i].trim()).indexOf(')')>0)
							  {
							   sCuerpo +="<tr class=\"texto\">";
							   sCuerpo +="<td class=\"celda02\" align=\"justify\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
							   sCuerpo +=sEncuesta[i].trim()+"</td>";
							   sCuerpo += "<td class=\"celda02\">"+request.getParameter("p"+pregunta+""+(sEncuesta[i].trim()).charAt(0));	
							   sCuerpo+="</td></tr>";	   
							  }
							if((i<(Reg-1))&&((sEncuesta[i+1].trim()).indexOf('-')>0))
							  {
								sCuerpo+="<tr><td>&nbsp;";
								sCuerpo+="</td></tr><td>&nbsp;</td>";
							   
							  }
							
							}
								sCuerpo+="<tr><td colspan=\"2\"><br><br><br>";
								sCuerpo+="</td></tr>";
								sCuerpo+="<tr class=\"texto\">";
								sCuerpo+="<td  bordercolor=\"#006699\" bgcolor=\"#999966\" class=\"celda01\"  align=\"justify\" colspan=\"2\">";
								sCuerpo+="<b>Comentarios, quejas o sugerencias:</b>\n";
								sCuerpo+="</td></tr>";
					
					   if(request.getParameter("sugerencia")!=null)
						{
						
						
							sCuerpo+="<tr>";
							sCuerpo+="<td class=\"celda02\" align=\"justify\" colspan=\"2\">";
							sCuerpo += request.getParameter("sugerencia").equals("")?"&nbsp;":request.getParameter("sugerencia");
							sCuerpo+="</td></tr>";
							
						}
					sCuerpo+="</table></body></html>";
					
					break;
					
			}				  

        
              if (!sCuerpo.equals(""))
			  	{
			  InternetAddress from = new InternetAddress(fromAddress);
              InternetAddress to = new InternetAddress(toAddress);
			  message.setFrom(from);	
			  message.addRecipient(Message.RecipientType.TO, to);
			  message.setSubject(subject);
			  message.setHeader("X-Mailer","sendhtml");
			  message.setSentDate(new Date());
			  DataHandler data = new DataHandler(sCuerpo,"text/html");
			  message.setDataHandler(data);
			  Transport.send(message);
				}

switch(tipo)
			{
			case 1://encuesta
					%>
					<jsp:forward page="FI_Opciones.jsp?menu=3&enviada=1"/>								
					<%
					break;
			case 3://encuesta
					%>
					<jsp:forward page="Encuesta.jsp?menu=3&enviada=1"/>								
					<%
					break;					
		   }
%>		   	




