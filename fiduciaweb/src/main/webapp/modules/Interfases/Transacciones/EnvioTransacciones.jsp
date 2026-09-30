<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<form name="envioTransacciones" id="envioTransacciones" action="../../../EnvioNotificacion.do" method="POST" enctype="multipart/form-data">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <input type="hidden" id="fnotSecuencialHdn" name="fnotSecuencialHdn" />
  <input type="hidden" id="fnotNombre" name="fnotNombre" />
  <input type="hidden" id="fnotDescripcion" name="fnotDescripcion" />
  <input type="file" accept="*.pdf,application/pdf" id="archivoPDF" name="archivoPDF" size="70" />
</form>
<%if(request.getSession().getAttribute("enviado") != null) {%>
<script type="text/javascript">
  var theContainer = this.parent;
  theContainer.hideWaitLayer();
  alert("Mensaje enviado con éxito!");
  theContainer.onButtonClickPestania('Interfases.Transacciones.PrincipalTransacciones','');
</script>
<%
  request.getSession().removeAttribute("enviado");
}%>