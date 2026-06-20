<%@ page contentType="text/html;charset=ISO-8859-1"%>
<%@ page import="java.util.*, javax.mail.*, javax.mail.internet.*, java.io.*, javax.activation.*" %>
<!--jsp:useBean id="BD"  class="mx.com.inscitech.fiducia.business.FiduciaBD"/-->
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<%
    java.util.List consulta = (java.util.List)request.getAttribute("consulta");
    //Variable para obtener tupla por tupla
    java.util.Map registro = null;
    
    String sCuerpo = "";

    //Variables que contendrán los elementos de cada tupla
    String usuario = "";
    String fecha = "";
    String status = "";
    /*String sTipoPersona="";
    String sNumPersona="";
    String sTipoOperacion="";
    String sFolios="";
    String contrato = "";
    String importe = "";  
    String sBanco = "";  
    String sTipo = "";  
    String sMoneda = "";
    String sPromotor = "";
    String sFecha = "";
    BigDecimal iContratos = new BigDecimal(0);       
    BigDecimal iBolsa = new BigDecimal(0);       
    BigDecimal fideicomiso = new BigDecimal(0);       */
    
    BigDecimal prospecto = new BigDecimal(0);
    BigDecimal numContrato = new BigDecimal(0);
    String snomProspecto = "";
    String snomFid = "";
    String scvePers = "";
    
    
    boolean falleEnCorreo = false;
    int contador = 0;
    int usu = 0;
    int iActAlerta=0;    
    
    int iBanco=0,iCasaBolsa=0;
    int iCtaChe=0,iCtoInver=0;
    
    String subject = "Aviso de Atencion de Solicitud";
    
    String emailFrom = "actinver@inscitech";
    String emailTo = "actinver@inscitech";


     try {
         registro = (java.util.Map)consulta.get(0);
         
         prospecto = (BigDecimal)registro.get("proyecto");
         snomFid= (String)registro.get("nomnegocio");
         numContrato = (BigDecimal)registro.get("numcontrato");
         snomProspecto = (String) registro.get("nomfid");
         scvePers = (String) registro.get("cvepers");
         
         
         //ya que se obtuvieron los valores se procede a armar los correos

            subject = "Dictaminacion de la Persona "+snomFid+" del Proyecto "+String.valueOf(prospecto.intValue())+" "+ snomProspecto;           
                Properties props = new Properties();
                String fromAddress = ""; //Dictaminacion
                String toAddress = ""; //Area de PLD
                String IPCorreo ="";// BD.getDatosParametros(100);
                String correo = "";//BD.getDatosParametros(101);
                props.put("mail.smtp.host", "127.0.0.1");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.port", "25");
                props.put("mail.smtp.starttls.enable", "true");
                System.out.println("Llego al envio de correo masivo 11");    
                //Session s = Session.getDefaultInstance(props,new javax.mail.Authenticator() 
              Session session3 = Session.getInstance(props,
              new javax.mail.Authenticator() {
                      protected PasswordAuthentication getPasswordAuthentication() {
                              //return new PasswordAuthentication("actinver@inscitech","actinver");
                          return new PasswordAuthentication("actinver@inscitech","actinver");
                      }
              });                

            fromAddress = emailFrom;
            toAddress = emailTo;
            System.out.println("ip correo 25 " + "localhost");
            System.out.println("from address " + emailFrom);
                        
            sCuerpo= "<div style='font-family: Arial; font-size: 12px;color: #000000;'>";
			System.out.println("Envio de correo 1");


                    sCuerpo = sCuerpo +"	Buen día	";
                    sCuerpo = sCuerpo +"	<br>";	
                    sCuerpo = sCuerpo +"	Atentamente me permito informar a usted, que en la revisión efectuada en Proyecto ";
                    sCuerpo = sCuerpo +"	<br>";	
                    sCuerpo = sCuerpo +"	número<b>"+String.valueOf(prospecto)+" "+ snomProspecto +"</b>, del Fideicomiso Numero";
                    sCuerpo = sCuerpo +"	<br>";	
                    sCuerpo = sCuerpo +"	<b>"+String.valueOf(numContrato)+"</b>, se encontró a la siguiente persona participante en dichas listas, por";
                    sCuerpo = sCuerpo +"	<br>";	                    
                    sCuerpo = sCuerpo +"	lo que agradeceremos se proceda a su dictaminación e informarnos el resultado de la misma";
                    sCuerpo = sCuerpo +"	<br>";	
                    sCuerpo = sCuerpo +"	        Nombre: "+snomFid;
                    sCuerpo = sCuerpo +"	<br>";	
                    sCuerpo = sCuerpo +"	        Carácter con que participa la persona en el Proyecto de Fideicomiso: : "+scvePers;
                    sCuerpo = sCuerpo +"	<br>";	
                    sCuerpo = sCuerpo +"	Atentamente	";
                    sCuerpo = sCuerpo +"		<br>";
                    sCuerpo = sCuerpo +"	Dictaminacion";                    

            sCuerpo = sCuerpo +"</div>";
			System.out.println("Cuerpo " + sCuerpo);
            //            Message message = new MimeMessage(s);	
            Message message = new MimeMessage(session3);
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

         if(contador==0)
            falleEnCorreo = true;
         
    }catch(Exception e){
        System.out.println("ERROR al tratar de enviar el correo "+e.getMessage().toString());
        falleEnCorreo = true;
    }
%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <title>Enviar Correo</title>
    <link rel="stylesheet" href="css/fiducia_general.css" type="text/css"/>
   <link rel="stylesheet" href="css/dhtmlXMenu.css" type="text/css"/>
   <link rel="stylesheet" href="css/dhtmlXMenu_xp.css" type="text/css"/>
    <link rel="stylesheet" href="css/nafin.css" type="text/css"/>
    <link rel="stylesheet" href="fiduciav5/nafin.css" type="text/css"/>
  </head>
  <body bgColor=#ffffff leftMargin=0 text=#000000 topMargin=0 marginwidth="0" marginheight="0" width="10" height="10" toolbar="no" resizable="yes">
  <table width="50%" height="50%"  align="center" bordercolor="#000000" bgcolor="#EAEADF" border="2">
  <tr valign="top">
  <td height="50" align="center"><br>
  <table border="0" height="110" width="440" >
  <tr>
    <td align="center" style="font-family: Arial;	font-size: 14px;color: #000000;font-weight: bold;"><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CORREO&nbsp;&nbsp;<%=session.getAttribute("empresa_9")%> </td>
  <tr>
  <td><hr size="1" noshade></td>
  </tr>
  </tr>
  <%
     if(!falleEnCorreo){
  %>
  <tr>
      <td align="center"  style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">El email ha sido enviado satisfactoriamente</td>
  </tr>
  <!--<tr>
      <td><%=sCuerpo%></td>
  </tr>-->
  <%
  }else{
  %>
    <tr>
      <td align="center"  style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">Hubo un error al tratar de enviar el correo</td>
    </tr>
  <%}%>
      <td align="center">
        
      <P><input type="button" name="Cerrar" value="CERRAR" onClick="window.close();" style="background: url('imagenes/boton_new.png'); font-family: Arial, Helvetica, sans-serif; border: 0px;font-size: 11px;width:112px;height:24px;color: #FFFFFF;font-weight: bold;cursor:hand;"/></P>
      <P>&nbsp;</P>
    </td>
  </tr>
  </table>
  </body>
</html>
