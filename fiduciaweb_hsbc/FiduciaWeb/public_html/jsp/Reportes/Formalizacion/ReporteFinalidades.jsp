<!-- CartaAceptacion.jsp-->
<!-- 01/Dic/2018 EAC - Creacion de archivo dummy -->
<jsp:useBean id="TipoPersona"  class="mx.com.inscitech.CtasIndiv.negocio.nConsultas"/>
<%@ page contentType="text/html;charset=windows-1252 "%>
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<%
java.util.List consulta = (java.util.List)request.getAttribute("consulta");
%>
<html>
      <head>
      <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
      <title>CARTA DE ACEPTACION PARA EL COMITE</title>
      </head>
      <body onload="self.opener.hideWaitLayer();">
      <table width="900"  style="font-family: Arial;font-size: 9px;" align="center" >   
     <%
        //Variable para obtener tupla por tupla
        java.util.Map registro = null;
    
        //Variables que contendrán los elementos de cada tupla
        BigDecimal numContrato = new BigDecimal(0);
        BigDecimal numFolio = new BigDecimal(0);

        String sTipoFinal = "";
        String sComentaFinal = "";
        String sFecha = "";
       
        int pagina=1;
    %>
<tr>
<table>
<tr>
<td><div align='left'><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg"   height="40"></div></td>
</tr>
</table>

</tr>   

    <tr>
       <td>
            <table width="900"  style="font-family: Arial;font-size: 12px;"> 
            
        

              <tr>         
                  <td width="105">&nbsp;</td>
                  <td width="110" align="right">CIUDAD DE MEXICO</td>
              </tr> 
            </table>
       </td>     
     </tr>  
      
       <tr>
       <td>
            <table width="900"  style="font-family: Arial;font-size: 12px;"> 
            <tr  bgcolor="#CCCCCC"  align="center" >
                <th>TIPO DE FINALIDAD</th>
                <th>FINALIDAD</th>            
            </tr>
            <% for(int i=0;i<=consulta.size();i++){
                    registro = (java.util.Map)consulta.get(i);
                    sTipoFinal = (String)registro.get("TIPOFINALIDAD"); 
                    sComentaFinal = (String)registro.get("COMENTARIO"); 
            %>
                    <tr>
                        <td width="450" align="left"><%=sTipoFinal%></td>
                        <td width="450" align="left"><%=sComentaFinal%></td>
                    </tr>   
            <%}%>  
            </table>
       </td>
      </tr>         

      </table>
           
      </body>
</html>