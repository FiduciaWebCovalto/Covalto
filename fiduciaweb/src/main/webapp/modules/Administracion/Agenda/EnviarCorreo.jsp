<!-- EnviarCorreo.jsp -->
<%@ page import="java.util.*, javax.mail.*, javax.mail.internet.*, java.io.*, javax.activation.*" %>
<jsp:useBean id="nConsultas" class="mx.com.inscitech.fiducia.business.nConsultas"/>
<jsp:useBean id="nConsultas2" class="mx.com.inscitech.fiducia.business.nConsultas"/>
<jsp:useBean id="BD"  class="mx.com.inscitech.fiducia.business.FiduciaBD"/>
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<%@ page import="mx.com.inscitech.fiducia.web.util.SendMail"%>
<%@ page import="java.util.Properties,javax.mail.Authenticator,javax.mail.PasswordAuthentication,javax.mail.Session,
javax.mail.internet.InternetAddress,javax.mail.internet.MimeMessage,javax.mail.Transport,
javax.mail.Message,javax.mail.internet.*,javax.activation.*,java.net.URL,
java.net.HttpURLConnection,java.util.Scanner,javax.mail.search.SubjectTerm"%>
<%
    java.util.List consulta = (java.util.List)request.getAttribute("consulta");
    //Variable para obtener tupla por tupla
    java.util.Map registro = null;
    
    String sCuerpo = "";
    String subject="";
    //Variables que contendrán los elementos de cada tupla
    String desEvento="";
    String textEvento="";
    String accionTomada=""; 
    
    String fideicomiso = "";
    String usuario = "";
    String fecha = "";
    BigDecimal folio = new BigDecimal(0);
    String status = "";
    String sUsuario = "";
    BigDecimal dUsuario = new BigDecimal(0);
    String correos[] = new String[5];

    final String fromEmail = "ventas@trustechcapitalmexico.com"; //requires valid gmail id
    final String password = "Leonardin7$"; // correct password for gmail id
    String toEmail = "erick.omana@trustechcapitalmexico.com"; // can be any email id 
    InternetAddress from = new InternetAddress(fromEmail);
    InternetAddress to= new InternetAddress(toEmail);         

    
    boolean falleEnCorreo = false;
    int contador = 0;
    int usu = 0;

     try {

            String IPCorreo="127.0.0.1";
            String correo="ventas@trustechcapitalmexico.com";
            Properties props = new Properties();
            String fromAddress = correo;
            String toAddress = correo;
            props.put("mail.smtp.host", "smtp.hostinger.com"); //SMTP Host
            props.put("mail.smtp.port", "587"); //TLS Port
            props.put("mail.smtp.auth", "true"); //enable authentication
            props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
            System.out.println("Primer punto de control");
            //create Authenticator object to pass in Session.getInstance argument
            Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
            }
            };
            System.out.println("Segundo punto de control");
                    contador = 0;
                    usu = 0;
                     while(contador<consulta.size()) {
                        registro = (java.util.Map)consulta.get(contador);
                        BigDecimal []numUsuarios = new BigDecimal[5];
                        
                        folio = (BigDecimal)registro.get("eageIdFolio");
                        usuario = (String)registro.get("perNomUsuario");
                        fideicomiso = (String)registro.get("eageFideicomiso");
                        fecha = (String)registro.get("eageFecEvento");
                        status = (String)registro.get("eageCveStatus");

                        
                        desEvento = "F"+fideicomiso.split("-")[0]+"-"+(String)registro.get("eageDesEvento");
                        textEvento = (String)registro.get("eageTextEvento");
                        accionTomada = (String)registro.get("eageAccionTomada");

                              sCuerpo= "<html>"+
                                "<head>"+
                                "<title>AVISO DE FIDUCIAWEB</title>"+
                                "<meta charset=\"utf-8\">"+
                                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"+
                                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css rel=\"stylesheet\" integrity=\"sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB\" crossorigin=\"anonymous\">"+
                                " "+
                                        "<style>"+
                                                ".container { width: 100%; max-width: 600px; margin: 0 auto; padding: 20px; }"+
                                                ".card { border: 1px solid #ddd; padding: 20px; border-radius: 5px; }"+
                                                ".btn-primary { background-color: #007bff; color: white; padding: 10px 20px; text-decoration: none; border-radius: 5px; }"+
                                        "</style>"+
                                "</head>"+
                                "<body  style=\"font-family: Arial, sans-serif;\">"+
                                "<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\" integrity=\"sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r\" crossorigin=\"anonymous\"></script>"+
                                "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js\" integrity=\"sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y\" crossorigin=\"anonymous\"></script>";
                                String.valueOf("%%");
                                sCuerpo+=" <div class=\"container\" style=\"background-color: #1fa3d3;\">"+
                                "<div class=\"card\" style=\"background-color: white;\">"+
                                "<h1 style=\"color: #333;\">La informacion del Evento se detalla a continuacion para su respectiva consulta en el sistema.</h1>";			
                              sCuerpo = sCuerpo +"<p>Fecha Evento:  "+fecha+"</p>";
                              sCuerpo = sCuerpo +"<p>Fideicomiso:  "+fideicomiso+"</p>";
                              sCuerpo = sCuerpo +"<p>Folio Agenda: "+folio+"</p>";
                              sCuerpo = sCuerpo +"<p>Estado: "+status+"</p>";
                              sCuerpo = sCuerpo +"<p>Asunto: "+desEvento+"</p>";
                              sCuerpo = sCuerpo +"<p>Mensaje: "+textEvento+"</p>";
                              sCuerpo = sCuerpo +"<p>Acción Tomada: "+accionTomada+"</p>";
                              sCuerpo = sCuerpo +"";
                                sCuerpo+="</div>"+
                                "</div>"+
                                "<body>"+
                                "</body>"+
                                "</html>";  
                              subject="Aviso de Evento del Fideicomiso "+fideicomiso; 
                                Session s = Session.getInstance(props, auth);
                                MimeMessage message = new MimeMessage(s);	
                              
                                message.setFrom(from);	
                                message.setContent(sCuerpo, "text/html");			
                                message.setFrom(from);	
                                message.addRecipient(Message.RecipientType.TO, to);
                                message.setSubject(subject);
                                message.setHeader("Content-Type", "text/html");
                                message.setSentDate(new Date());
        
                                //Transport.send(message); 

                      contador++;
                     }
         if(contador==0)
            falleEnCorreo = true;
         
    }catch(Exception e){
        System.out.println("ERROR al tratar de enviar el correo "+e.getMessage().toString());
        falleEnCorreo = true;
    }
%>
<html lang="es-MX">
<head>
<title>ENVIO DE CORREO</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Enable IE9 Standards mode -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">

</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>        

<table class="table table-responsive table-hover">
      <thead>
        <tr>
          <th scope="col"><%=session.getAttribute("empresa_1")%></th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>       
          <th scope="col"><img height="120px" src="<%=request.getContextPath()%>/imagenes/header.jpg"></th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>              
        </tr>
      </thead>
</table>      	
<table  class="table table-responsive table-hover">

      <thead class="table-primary">
        <tr class="table-primary">
          <th scope="col">&nbsp</th>
          <th scope="col">&nbsp</th>
          <th scope="col">&nbsp</th>
          <th scope="col">&nbsp</th>
          <th scope="col">&nbsp</th>
          <th scope="col">
            <%if(!falleEnCorreo){%>
                Correo Enviado Correctamente!
            <%}else{%>    
                No existe Informacion para enviar Correo!
            <%}%>
          </th>
          <th scope="col">&nbsp</th>
          <th scope="col">&nbsp</th>
          <th scope="col">&nbsp</th>       
          <th scope="col">&nbsp</th>
          <th scope="col">&nbsp</th>
          <th scope="col">&nbsp</th>              
        </tr>
      </thead>
    </table>
</body>
</html>