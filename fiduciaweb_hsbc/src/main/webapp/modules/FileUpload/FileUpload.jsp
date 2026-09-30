<%@ page contentType="text/html;charset=windows-1252"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <title>Página de Carga de Archivo</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/fiducia_general.css" type="text/css">     
    <script language="javascript">
        function asignarValor(valor) {
            document.frmTest.archivo.value = valor.value;
        } 
    </script> 
  </head>
  <body style="background-color:transparent;">  
    <form id="frmTest" name="frmTest" enctype="multipart/form-data" method="POST" action="<%=request.getContextPath()%>/uploadDocument.do">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
      <table border="0" cellpadding="1" cellspacing="3" align="center">
        <tr>
          <td class="texto">Archivo:</td>
          <td><input type="FILE" name="flArchivo" id="flArchivo" onchange="asignarValor(this);" /></td>
          <td><input class="btn btn-primary" type="button" value="Aceptar" onclick="parent.frameSubmit(frmTest);" /></td>
        </tr>
        <tr>
          <td colspan="2"><textarea name="archivo" id="archivo" disabled="disabled" rows="3" cols="31" style="visibility:hidden"></textarea></td>
        </tr>
        <tr>
          <td colspan="3">
            <input type="text" id="Id" name="Id" style="visibility:hidden"/>
            <input type="text" id="NombreArchivo" name="NombreArchivo" style="visibility:hidden"/>
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>