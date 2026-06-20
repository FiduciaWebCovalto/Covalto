<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.util.*, javax.mail.*,java.text.DecimalFormat, javax.mail.internet.*, java.io.*, javax.activation.*"%>
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<%@ page contentType="text/html;charset=windows-1252" import="mx.com.inscitech.fiducia.web.util.SendMail"%>
<%
    java.util.List consulta = (java.util.List)request.getAttribute("consulta");
    java.util.Map registro = null;
    String sCuerpo = "";
    DecimalFormat df = new DecimalFormat("#,###.00");
    String numeroFormateado="";
    //Variables que contendrán los elementos de cada tupla
    String emailFrom = "credifactor360@trustechcapitalmexico.com";
    String emailTo = "credifactor360@trustechcapitalmexico.com";
    String parametro1="",parametro2="",parametro3="",parametro4="",parametro5="";
    int tipo=Integer.valueOf((String)request.getParameter("tipo")).intValue();
    parametro1=(String)request.getParameter("parametro1");
    parametro2=(String)request.getParameter("parametro2");
    parametro3=(String)request.getParameter("parametro3");
    parametro4=(String)request.getParameter("parametro4");
    parametro5=(String)request.getParameter("parametro5");
    System.out.println("parametro1:"+parametro1);
    System.out.println("parametro2:"+parametro2);
    System.out.println("parametro3:"+parametro3);
    boolean falleEnCorreo = false;
    try {
    String subject = "";
    if (tipo==1)//aviso de pago de credito para autorizar
        subject="Aviso de Pago de credito del contrato "+parametro1;
    else if (tipo==2)//alertamiento creditopara el OF
        subject="Aviso de Autorizacion de Operacion en Mesa de Control para el contrato "+parametro1;
    else if (tipo==3)//alertamiento factoraje para el OF
        subject="Aviso de Alertamiento para el contrato "+parametro1;
    else if (tipo==4)//aviso de factura para autorizar
        subject="Aviso de Recuperacion de factura para Autorizacion del contrato "+parametro1;
    else if (tipo==5)//aviso de factura para eliminar
        subject="Aviso de Eliminacion de factura el contrato "+parametro1;        
    System.out.println("Salio de los encabezados");
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
        "<div class=\"card\" style=\"background-color: white;\">";
            if (tipo==1){
            sCuerpo+="<h1 style=\"color: #333;\">La informacion de la operacion se detalla a continuacion para su respectiva Ejecucion.</h1>";
            
            numeroFormateado = df.format(Double.valueOf(parametro2));    
            sCuerpo+="<p>Contrato: "+parametro1+"</p>"+
            "<p>Monto: "+numeroFormateado+"</p>"+
            "<p>Moneda: "+parametro3+"</p>"+
            "<p>Forma de Pago: "+parametro4+"</p>"+
            "<p>Cuenta CLABE: "+parametro5+"</p>";
            }
            else if (tipo==2){
            sCuerpo+="<h1 style=\"color: #333;\">La informacion de la operacion se detalla a continuacion para su respectiva Revision.</h1>";            
            sCuerpo+="<p>Contrato: "+parametro1+"</p>"+
            "<p>Forma de Pago: "+parametro3+"</p>"+
            "<p>Folio: "+parametro4+"</p>";
            }
            else if (tipo==3){
            System.out.println("Entro al tipo3");
            numeroFormateado = df.format(Double.valueOf(parametro3));    
            sCuerpo+="<p>Contrato: "+parametro1+"</p>"+
            "<p>Folio: "+parametro2+"</p>"+
            "<p>Monto Recuperado: "+numeroFormateado+"</p>";
            }  
            else if (tipo==4){
            numeroFormateado = df.format(Double.valueOf(parametro2));    
            sCuerpo+="<p>Contrato: "+parametro1+"</p>"+
            "<p>Monto: "+numeroFormateado+"</p>"+
            "<p>Factura: "+parametro3+"</p>";
            } 
            else if (tipo==5){
            numeroFormateado = df.format(Double.valueOf(parametro2));    
            sCuerpo+="<p>Contrato: "+parametro1+"</p>"+
            "<p>Monto: "+numeroFormateado+"</p>"+
            "<p>Factura: "+parametro3+"</p>";
            }             
    sCuerpo+="</div>"+
    "</div>"+
"<body>"+
"</body>"+
"</html>";
        Properties props = new Properties();
        String IPCorreo="127.0.0.1";
        String correo=emailFrom;
        props.put("mail.smtp.host", IPCorreo);
        Session s = Session.getInstance(props,null);
        Message message = new MimeMessage(s);	
        InternetAddress from = new InternetAddress(emailFrom);
        InternetAddress to = new InternetAddress(emailTo);
        message.setFrom(from);	
        
        message.setContent(sCuerpo, "text/html");			
        message.setFrom(from);	
        message.addRecipient(Message.RecipientType.TO, to);
        message.setSubject(subject);
        message.setHeader("Content-Type", "text/html");
        message.setSentDate(new Date());
        //message.setText(sCuerpo);

        Transport.send(message); 
        falleEnCorreo = false;
         
    } catch(Exception e){
        System.out.println("ERROR al tratar de enviar el correo " + e.getMessage().toString());
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

<%if(!falleEnCorreo){%>
<table class="table table-responsive table-hover">
      <thead>
        <tr>
          <th scope="col"><%=session.getAttribute("empresa")%></th>
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
            <th scope="col">Correo Enviado Correctamente!</th>
          <th scope="col">&nbsp</th>
          <th scope="col">&nbsp</th>
          <th scope="col">&nbsp</th>       
          <th scope="col">&nbsp</th>
          <th scope="col">&nbsp</th>
          <th scope="col">&nbsp</th>              
        </tr>
      </thead>
    </table>
    <%}else{%>
    <script> 
    Swal.fire('warning', "No se encontraron resultados!", 'warning');
    </script>
    <%}%>
</body>
</html>