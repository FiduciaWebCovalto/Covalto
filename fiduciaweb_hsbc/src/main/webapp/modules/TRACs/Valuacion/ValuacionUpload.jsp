<%@ page contentType="text/html;charset=windows-1252"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <title>Pagina de carga de Archivo Precios</title>
  </head>
  
  <link rel="stylesheet" href="<%=request.getContextPath()%>/css/fiducia_general.css" type="text/css">
  
  <body style="background-color:transparent;">
   <center> 
    <form name="frmCargaValuacion" enctype="multipart/form-data" method="post" action="<%=request.getContextPath()%>/upload.do">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
      
      <input type="hidden" id="Fecha" name="Fecha" value=""/>
      <input type="hidden" id="NombreArchivo" name="NombreArchivo" value=""/>
      <input type="hidden" id="username" name="username" value="<%=session.getAttribute("username")%>" />
      <input type="hidden" id="processor" name="processor" value="mx.com.inscitech.fiducia.business.upload.processors.CargaArchivosPlanosGeneralProcessorImpl" />
      
      
      <table border="0" cellpadding="1" cellspacing="3" align="center">
        <tr>  
          <td class="texto">Archivo:</td>
          <td><input type="FILE" name="fileTest" id="fileTest"/></td>
        </tr>
      </table>      
      
      
      <input class="texto" type="hidden" value="Aceptar" onclick="parent.frameSubmit(frmCargaPrecios);" name="Aceptar"/>
    
    </form>
  </center>
  </body>
</html>
