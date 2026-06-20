<%@ page contentType="text/html;charset=windows-1252"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <title>Página de Carga de Archivo Carga Masiva</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>    
  </head>
  <link rel="stylesheet" href="<%=request.getContextPath()%>/css/fiducia_general.css" type="text/css">
  <body style="background-color: transparent;">  
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>            
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>     
  
    <form id="frmTest" name="frmTest" enctype="multipart/form-data" method="POST" action="<%=request.getContextPath()%>/upload.do">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
      <table border="0" cellpadding="1" cellspacing="3" align="center">
        <tr>
          <td class="texto">Archivo:</td>
          <td><input type="FILE" name="flArchivo" id="flArchivo"/></td>
          <td><input class="btn btn-primary" type="button" value="Aceptar" onclick="parent.frameSubmit(frmTest);"/></td>
        </tr>
        <tr>
          <td colspan="3">
            <input type="text" id="Fecha" name="Fecha" value="" style="visibility:hidden" size="5"/>
            <input type="text" id="NombreArchivo" name="NombreArchivo" value="" style="visibility:hidden" size="5"/>
            <input type="text" id="processor" name="processor" value="mx.com.inscitech.fiducia.business.upload.processors.CargaFosegProcessorImpl" style="visibility:hidden" size="5"/>
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>