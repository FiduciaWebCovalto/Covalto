<!-- EnviarCorreo.jsp -->

<%@ page import="java.util.*, javax.mail.*, javax.mail.internet.*, java.io.*, javax.activation.*"%>
<jsp:useBean id="nConsultas" class="mx.com.inscitech.fiducia.business.nConsultas"/>
<jsp:useBean id="nConsultas2" class="mx.com.inscitech.fiducia.business.nConsultas"/>
<jsp:useBean id="BD" class="mx.com.inscitech.fiducia.business.FiduciaBD"/>
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<%
    java.util.List consulta = (java.util.List)request.getAttribute("consulta");
    //Variable para obtener tupla por tupla
    java.util.Map registro = null;
    
    String sCuerpo = "";
    
    //Variables que contendrán los elementos de cada tupla
    String desEvento="";
    String textEvento="";
    String accionTomada=""; 
    
    BigDecimal fideicomiso = new BigDecimal(0);
    BigDecimal proyecto = new BigDecimal(0);
    String snomNegocio= "";
    String usuario = "";
    String fecha = "";
    BigDecimal folio = new BigDecimal(0);
    String status = "";
    String sUsuario = "";
    BigDecimal dUsuario = new BigDecimal(0);
    String correos[] = new String[5];
    
    boolean falleEnCorreo = false;
    int contador = 0;
    int usu = 0;

     try {

            String IPCorreo=BD.getDatosParametros(100);
            String correo=BD.getDatosParametros(101);


            nConsultas2.querySelect(100);    
            for(int j=0;j<nConsultas2.getSize();j++){  
                    nConsultas2.setIndex(j);            
                    dUsuario=new BigDecimal(nConsultas2.getVtrIntDato1());
                    System.out.println("usuario en BigDecimal que entra:"+dUsuario);
                    contador = 0;
                    usu = 0;
                     while(contador<consulta.size()) {
                        registro = (java.util.Map)consulta.get(contador);
                        BigDecimal []numUsuarios = new BigDecimal[5];
                        
                        //folio = (BigDecimal)registro.get("eageIdFolio");
                        //usuario = (String)registro.get("perNomUsuario");
                        fideicomiso = (BigDecimal)registro.get("numContrato"); //numContrato
                        proyecto = (BigDecimal)registro.get("proyecto");//proyecto
                        snomNegocio = (String)registro.get("nomNegocio");//nomNegocio
                        //fecha = (String)registro.get("eageFecEvento");
                        //status = (String)registro.get("eageCveStatus");
                        
                        numUsuarios[0] = (BigDecimal)registro.get("eageNumUsuario");
                        numUsuarios[1] = (BigDecimal)registro.get("eageNumUsuario2");
                        numUsuarios[2] = (BigDecimal)registro.get("eageNumUsuario3");
                        numUsuarios[3] = (BigDecimal)registro.get("eageNumUsuario4");
                        numUsuarios[4] = (BigDecimal)registro.get("eageNumUsuario5");
                       /* System.out.println("usuario0:"+numUsuarios[0]);
                        System.out.println("usuario1:"+numUsuarios[1]);
                        System.out.println("usuario2:"+numUsuarios[2]);
                        System.out.println("usuario3:"+numUsuarios[3]);
                        System.out.println("usuario4:"+numUsuarios[4]);*/
                        
                        //desEvento = "F"+fideicomiso.split("-")[0]+"-"+(String)registro.get("eageDesEvento");
                        //textEvento = (String)registro.get("eageTextEvento");
                        //accionTomada = (String)registro.get("eageAccionTomada");
                        //buscando correos
                        
                        for(int s = 0;s<numUsuarios.length;s++)
                        {
                          usu=Integer.parseInt(numUsuarios[s].toString());
                          nConsultas.setVtrIntDato1(usu);//
                          nConsultas.querySelect(99);
                          if(nConsultas.hasData())
                            correos[s] = nConsultas.getVtrStrDato1();
                          else
                            correos[s] = "";
                        }
                        
                        Properties props = new Properties();
                        String fromAddress = "";
                        String toAddress = "";
                        props.put("mail.smtp.host", IPCorreo);
                        props.put("mail.smtp.port", "25");
                        fromAddress = correos[0];
                  /*      System.out.println("ip correo 25 "+IPCorreo);
                        System.out.println("from address "+correos[0]);*/
            
                        for(int i=1;i<correos.length;i++){// i=0; al primer registro (usuario 0) ya no se le manda correo 
                           if(correos[i]!=null&&correos[i]!="" && numUsuarios[i].equals(dUsuario) ) {
                              toAddress = correos[i];
                              /*sCuerpo = "";
                              sCuerpo = sCuerpo +"Fecha Evento:  "+fecha+"\r\n";
                              sCuerpo = sCuerpo +"Fideicomiso:  "+fideicomiso+"\r\n";
                              sCuerpo = sCuerpo +"Usuario: "+usuario+"\r\n";
                              sCuerpo = sCuerpo +"Folio Agenda: "+folio+"\r\n";
                              sCuerpo = sCuerpo +"Estado: "+status+"\r\n";
                              sCuerpo = sCuerpo +"Asunto: "+desEvento+"\r\n";
                              sCuerpo = sCuerpo +"Mensaje: "+textEvento+"\r\n";
                              sCuerpo = sCuerpo +"Acción Tomada: "+accionTomada+"\r\n";
                              sCuerpo = sCuerpo +"";*/
                              
                              sCuerpo = sCuerpo +"	Buen día	";
                                sCuerpo = sCuerpo +"	<br>";	
                                sCuerpo = sCuerpo +"	Atentamente me permito informar a usted, que el Proyecto Numero";
                                sCuerpo = sCuerpo +"	<br>";	
                                sCuerpo = sCuerpo +"	<b>"+String.valueOf(proyecto)+" "+snomNegocio+"</b>";
                                sCuerpo = sCuerpo +"	<br>";	                    
                                sCuerpo = sCuerpo +"	del Fideicomiso <b>"+String.valueOf(fideicomiso)+"</b>"; 
                                sCuerpo = sCuerpo +"	<br>";	
                                sCuerpo = sCuerpo +"	ha sido Autorizado.";
                                sCuerpo = sCuerpo +"	<br>";	                    
                                sCuerpo = sCuerpo +"	Hacemos de su conocimiento lo anterior para que proceda a la revision Fiscal correspondiente.";
                                sCuerpo = sCuerpo +"	<br>";	
                                sCuerpo = sCuerpo +"	Atentamente	";
                                sCuerpo = sCuerpo +"		<br>";
                                sCuerpo = sCuerpo +"	Dictaminacion";    
                              
                              //System.out.println("valor i:"+String.valueOf(i));
                
                              Session s = Session.getInstance(props,null);
                              Message message = new MimeMessage(s);	
                              InternetAddress from = new InternetAddress(fromAddress);
                              InternetAddress to = new InternetAddress(toAddress);
                              message.setFrom(from);	
                              message.addRecipient(Message.RecipientType.TO, to);
                              message.setSubject(desEvento);
                              message.setHeader("X-Mailer","sendhtml");
                              message.setSentDate(new Date());
                              DataHandler data = new DataHandler(sCuerpo,"text/html");
                              message.setDataHandler(data);
                              Transport.send(message);
                            }
                        }
                      contador++;
                     }
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
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
        <title>Enviar Correo</title>
        <link rel="stylesheet" href="css/fiducia_general.css" type="text/css"/>
        <link rel="stylesheet" href="css/dhtmlXMenu.css" type="text/css"/>
        <link rel="stylesheet" href="css/dhtmlXMenu_xp.css" type="text/css"/>
        <link rel="stylesheet" href="css/nafin.css" type="text/css"/>
        <link rel="stylesheet" href="fiduciav5/nafin.css" type="text/css"/>
    </head>
    <body bgcolor="#ffffff" leftmargin="0" text="#000000" topmargin="0" marginwidth="0" marginheight="0" width="10"
          height="10" toolbar="no" resizable="yes">
        <table width="50%" height="50%" align="center" bordercolor="#000000" bgcolor="#EAEADF" border="2">
            <tr valign="top">
                <td height="50" align="center">
                    <br/>
                    <table border="0" height="110" width="440">
                        <tr>
                            <td align="center"
                                style="font-family: Arial;	font-size: 14px;color: #000000;font-weight: bold;">
                                <img src="&lt;%=request.getContextPath()%>/imagenes/logo_bn.jpg"/>
                                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CORREO&nbsp;&nbsp;<%=session.getAttribute("empresa_9")%>
                            </td>
                        </tr><tr>
                            <td>
                                <hr size="1" noshade="noshade"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
             
            <%
     if(!falleEnCorreo){
  %>
             
            <tr>
                <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">El
                                                                                                                 email
                                                                                                                 ha sido
                                                                                                                 enviado
                                                                                                                 satisfactoriamente</td>
            </tr>
             
            <!--<tr>
      <td><%=sCuerpo%></td>
  </tr>-->
             
            <%
  }else{
  %>
             
            <tr>
                <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">Hubo un
                                                                                                                 error
                                                                                                                 al
                                                                                                                 tratar
                                                                                                                 de
                                                                                                                 enviar
                                                                                                                 el
                                                                                                                 correo</td>
            </tr>
             
            <%}%>
            <td align="center">
                <p>
                    <input type="button" name="Cerrar" value="CERRAR" onclick="window.close();"
                           style="background: url('imagenes/boton_new.png'); font-family: Arial, Helvetica, sans-serif; border: 0px;font-size: 11px;width:112px;height:24px;color: #FFFFFF;font-weight: bold;cursor:hand;"/>
                </p>
                <p>&nbsp;</p>
            </td>
        </table>
    </body>
</html>