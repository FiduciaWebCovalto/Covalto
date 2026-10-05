<%@ page import="java.math.BigDecimal, java.util.Date, 
mx.com.inscitech.fiducia.common.util.DecimalFormatUtils, mx.com.inscitech.fiducia.common.util.DateTimeUtils"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.fiducia.business.FiduciaBD"/>
<jsp:useBean id="nConsultas" class="mx.com.inscitech.cuentas.individuales.negocio.nConsultas"/>
<jsp:useBean id="nConsultas2" class="mx.com.inscitech.cuentas.individuales.negocio.nConsultas"/>
<jsp:useBean id="nConsultas3" class="mx.com.inscitech.cuentas.individuales.negocio.nConsultas"/>
<%
java.util.List consulta = (java.util.List)request.getAttribute("consulta");
%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <title>REPORTE CUENTAS INDIVIDUALES</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">    
  </head>
  <body style="font-family: Arial; 10px;">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>        
  
  <%
    //Variable para obtener tupla por tupla
    java.util.Map registro = null;
    String sFiso="";
    //Variables que contendrán los elementos de cada tupla
    BigDecimal secuencial = new BigDecimal(0);
    BigDecimal numFideicomiso = new BigDecimal(0);
    String nomFideicomiso = "";
    String detalle = "";  
	
	if(consulta.size()>0){
		registro = (java.util.Map)consulta.get(0);
		numFideicomiso=(BigDecimal)registro.get("fiso");
	}
		
  %>
  <table  class="table table-responsive table-hover">  
    <thead>
        <tr class="table-light" class="text-left">
          <th scope="col">
            <div align="left"><img src="<%=request.getContextPath()%>/imagenes/header.jpg" ></div>
          </th>
          <th scope="col"><div align="left"><font size=6>FINALIDADES DEL FIDEICOMISO <%=DecimalFormatUtils.getFormatedNumber("######", numFideicomiso)%></font></div></th>
           <th></th>
        </tr>       
    </thead>
  </table>  
  <table class="table table-responsive table-hover">
    <thead class="table-info">
      <tr  class="text-center">
          <th scope="col">&nbsp;</th>
          <th scope="col">Folio</th>
          <th scope="col">Detalle</th>
          <th scope="col">&nbsp;</th>
      </tr>      
    </thead>   
    <tbody>
                            <%
                                for(int i = 0; i < consulta.size(); i++) {  //Para cada registro
                                  registro = (java.util.Map)consulta.get(i);
                                  //Obtener datos de la BD
                                  secuencial = (BigDecimal)registro.get("folio");
                                  detalle = (String)registro.get("comentario");
                                  %>
                                  <tr>
                                    <td>&nbsp;</td>
                                    <td><%=DecimalFormatUtils.getFormatedNumber("000", secuencial)%></td>
                                    <td><%=detalle%></td>
                                    <td>&nbsp;</td>
                                  </tr>
                                <%}%>          
    </tbody>
   </table>           
  </body>
</html>