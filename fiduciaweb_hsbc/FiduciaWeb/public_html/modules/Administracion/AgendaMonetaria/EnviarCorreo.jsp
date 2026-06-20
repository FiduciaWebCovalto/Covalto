<!-- EnviarCorreo.jsp -->
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.util.*, javax.mail.*, javax.mail.internet.*, java.io.*, javax.activation.*" %>
<jsp:useBean id="nConsultas" class="mx.com.inscitech.fiducia.business.nConsultas"/>
<jsp:useBean id="BD"  class="mx.com.inscitech.fiducia.business.FiduciaBD"/>
<jsp:useBean id="Alerta"  class="mx.com.inscitech.fiducia.business.nInstrucciones"/>
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<%
    java.util.List consulta = (java.util.List)request.getAttribute("consulta");
    //Variable para obtener tupla por tupla
    java.util.Map registro = null;
    
    String sCuerpo = "";

    //Variables que contendrán los elementos de cada tupla
    String fideicomiso = "";
    String usuario = "";
    String fecha = "";
    String status = "";
    String sTipoPersona="";
    String sNumPersona="";
    String sTipoOperacion="";
    String sFolios="";
    String contrato = "";
    String importe = "";    
    boolean falleEnCorreo = false;
    int contador = 0;
    int usu = 0;
    int iActAlerta=0;    
    String subject = "Aviso de Atencion de Solicitud";
    
    String emailFrom = "actinver@inscitech";
    String emailTo = "actinver@inscitech";


     try {
         while(contador<consulta.size()) {
            registro = (java.util.Map)consulta.get(contador);
            System.out.println("Envio de correo 0");
            fideicomiso = (String)registro.get("fideicomiso");
			contrato = (String)registro.get("contrato");
			importe = (String)registro.get("importe");//FALTA FORMATEAR EL IMPORTE
			System.out.println("Envio de correo 0.1");
            subject = "Aviso de Atencion de Solicitud de Liquidez del Fideicomiso "+fideicomiso;           
                Properties props = new Properties();
                String fromAddress = "";
                String toAddress = "";
                String IPCorreo = BD.getDatosParametros(100);
                String correo = BD.getDatosParametros(101);
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

			sCuerpo = sCuerpo +"Buen día estimado(a) Asesor de Inversión:";
			sCuerpo = sCuerpo +" "; 
			sCuerpo = sCuerpo +"A fin de atender el día de hoy la instrucción de nuestro Fideicomitente del Fideicomiso</b>"+ fideicomiso + "<br>";
			sCuerpo = sCuerpo +" ";  
			sCuerpo = sCuerpo +"se solicita por favor, realizar la liquidez necesaria en el contrato de Intermediación o Inversión </b>"+ contrato + "<br> por un importe de $ </b>"+  importe + "<br>";
			sCuerpo = sCuerpo +" "; 
			sCuerpo = sCuerpo +"En apego a la  Política de Manejo de Fondos de Inversión y siguiendo la prelación correspondiente:";
			sCuerpo = sCuerpo +"1.            Efectivo del contrato.";
			sCuerpo = sCuerpo +" "; 
			sCuerpo = sCuerpo +"2.            ACTIGOB (Actigober, S.A. de C.V.), De igual manera por sus características de composición, aunque limitado únicamente a Personas Morales debido a que solo en este caso cuenta con liquidez diaria. ";
			sCuerpo = sCuerpo +" "; 
			sCuerpo = sCuerpo +"3.            ACTIREN (Actirent, S.A. de C.V.).- Por sus características de composición y liquidez diaria tanto para Personas Físicas como para Personas Morales. ";
			sCuerpo = sCuerpo +" "; 
			sCuerpo = sCuerpo +"4.                   ACTIMED (Actimed, S.A. de C.V.), Por sus características de composición y liquidez a 24 horas tanto para Personas Físicas como para Personas Morales. ";
			sCuerpo = sCuerpo +" "; 
			sCuerpo = sCuerpo +"5.                   Si no se cuenta con la posición en el CIB o CI de alguno de anteriores instrumentos, se deberá de solicitar al FIDUCIARIO se le indique específicamente que otros instrumentos puede realizar la venta para la liquidez necesaria.";
			sCuerpo = sCuerpo +" "; 
			sCuerpo = sCuerpo +" "; 
			sCuerpo = sCuerpo +"Favor de confirmar el movimiento realizado, con el Administrador Fiduciario que lo atiende o comunicarse a los teléfonos al calce.";
			sCuerpo = sCuerpo +" ";  
			sCuerpo = sCuerpo +"Este es un correo de carácter automático, favor de no responder.";
			sCuerpo = sCuerpo +" ";   
			sCuerpo = sCuerpo +"De antemano muchas gracias.";
            
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

           
          contador++;
         }
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
