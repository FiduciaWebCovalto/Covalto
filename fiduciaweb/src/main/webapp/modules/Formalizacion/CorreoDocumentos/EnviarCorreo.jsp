<%@ page contentType="text/html;charset=ISO-8859-1"%>
<%@ page import="java.util.*, javax.mail.*, javax.mail.internet.*, java.io.*, javax.activation.*" %>
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils, mx.com.inscitech.fiducia.common.services.LoggingService"%>
<%
    
    LoggingService logger = LoggingService.getInstance();
    
    List consulta = (List)request.getAttribute("consulta");
    logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Objeto consulta: " + consulta);
    
    //Variable para obtener tupla por tupla
    Map registro = null;
    
    String sCuerpo = "";

    //Variables que contendrán los elementos de cada tupla
    String usuario = "";
    String fecha = "";
    String status = "";
    
    BigDecimal proyecto = new BigDecimal(0);
    String snomNegocio = "";
    BigDecimal numContrato = new BigDecimal(0);

    int contador = 0;    
    
    boolean falleEnCorreo = true;
    
    String subject = "Aviso de Atencion de Solicitud";    
    String emailFrom = "fiduciarioweb@actinver.com.mx";
    String emailTo = "vcerda@actinver.com.mx";

    logger.log(this, Thread.currentThread(), LoggingService.DEBUG, String.format("Datos Correo: { subject: '%s', emailFrom: '%s', emailTo: '%s' }", subject, emailFrom, emailTo));
    
    try {
    
        registro = (java.util.Map)consulta.get(0);
        
         proyecto = (BigDecimal)registro.get("proyecto");
         snomNegocio = (String)registro.get("nomnegocio");
         numContrato = (BigDecimal)registro.get("numcontrato");
         
        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "proyecto: " + proyecto);
        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "NomNegocio: " + snomNegocio);
        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "NumContrato: " + numContrato);
        
        subject = "Envio Documentacion del Proyecto  "+ proyecto.toString() +" "+ snomNegocio;           
        String fromAddress = "fiduciarioweb@actinver.com.mx"; //Tecnico Legal
        String toAddress = "vcerda@actinver.com.mx"; //Dictaminacion
        String IPCorreo ="";// BD.getDatosParametros(100);
        String correo = "";//BD.getDatosParametros(101);

        Properties props = new Properties();
        props.put("mail.smtp.host", "masivos.actinver.com.mx");
        props.put("mail.smtp.auth", "false");
        props.put("mail.smtp.port", "25");
        //props.put("mail.user", "fiduciarioweb");
        //props.put("mail.password", "$J41Mpj:hj");                
        //props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Properties: " + props);

        Session session3 = Session.getInstance(props, 
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("fiduciarioweb@actinver.com.mx", "$J41Mpj:hj");
                }
            }
        );                

        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "session3: " + session3);
        
        fromAddress = emailFrom;
        toAddress = emailTo;
                        
        sCuerpo += "<div style='font-family: Arial; font-size: 12px;color: #000000;'>";
        sCuerpo = sCuerpo +"	Buen dia	";
        sCuerpo = sCuerpo +"	<br>";	
        sCuerpo = sCuerpo +"	Atentamente me permito informar a usted, que le estoy haciendo llegar los documentos ";
        sCuerpo = sCuerpo +"	<br>";	
        sCuerpo = sCuerpo +"	correspondientes al Proyecto Numero <b>"+proyecto.toString()+" "+snomNegocio+"</b>";
        sCuerpo = sCuerpo +"	<br>";	                    
        sCuerpo = sCuerpo +"	del Fideicomiso Numero <b>"+numContrato.toString()+"</b>, para que se proceda a su dictaminacion y se continue en los trámites para su constitucin."; 
        sCuerpo = sCuerpo +"	<br>";	
        sCuerpo = sCuerpo +"	Quedo a sus Ordenes para cualquier duda que pudiera surgir.";
        sCuerpo = sCuerpo +"	<br>";	
        sCuerpo = sCuerpo +"	Atentamente	";
        sCuerpo = sCuerpo +"		<br>";
        sCuerpo = sCuerpo +"	Tecnico Legal";                      
        sCuerpo += "</div>";

        Message message = new MimeMessage(session3);

        InternetAddress from = new InternetAddress(fromAddress);
        InternetAddress to = new InternetAddress(toAddress);

        DataHandler data = new DataHandler(sCuerpo, "text/html");
        
        message.setFrom(from);	
        message.addRecipient(Message.RecipientType.TO, to);
        message.setSubject(subject);
        message.setHeader("X-Mailer", "sendhtml");
        message.setSentDate(new Date());
        message.setDataHandler(data);

        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "message: " + message);
        
        Transport.send(message);

        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Email sended! Contador: " + contador);

        if(contador == 0) falleEnCorreo = false;
         
    } catch(Exception e) {
        logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Error al enviar el correo", e);
        falleEnCorreo = true;
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
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
                <td height="50" align="center">
                    <br/>
                    <table border="0" height="110" width="440" >
                        <tr>
                            <td align="center" style="font-family: Arial;font-size: 14px;color: #000000;font-weight: bold;"><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CORREO&nbsp;&nbsp;<%=session.getAttribute("empresa_9")%></td>
                        </tr>
                        <tr>
                            <td><hr size="1" noshade/></td>
                        </tr>
                        <%if(!falleEnCorreo) {%>
                        <tr>
                            <td align="center"  style="font-family: Arial;font-size: 12px;color: #000000;font-weight: bold;">El email ha sido enviado satisfactoriamente</td>
                        </tr>
                        <%} else {%>
                        <tr>
                            <td align="center"  style="font-family: Arial;font-size: 12px;color: #000000;font-weight: bold;">Hubo un error al tratar de enviar el correo</td> 
                        </tr>
                        <%}%>
                        <tr>
                            <td align="center">        
                                <p><input type="button" name="Cerrar" value="CERRAR" onClick="window.close();" style="background: url('imagenes/boton_new.png'); font-family: Arial, Helvetica, sans-serif; border: 0px;font-size: 11px;width:112px;height:24px;color: #FFFFFF;font-weight: bold;cursor:hand;"/></p>
                                <p>&nbsp;</p>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </body>
</html>
