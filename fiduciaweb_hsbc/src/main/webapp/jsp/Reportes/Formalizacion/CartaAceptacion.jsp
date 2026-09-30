<!-- CartaAceptacion.jsp-->
<!-- 01/Dic/2018 EAC - Creacion de archivo dummy -->
<jsp:useBean id="TipoPersona"  class="mx.com.inscitech.CtasIndiv.negocio.nConsultas"/>
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
        BigDecimal folioOper = new BigDecimal(0);
        BigDecimal sec= new BigDecimal(0); 
        
        String sFecha = "";
        String sPromotor = "";
        String sOriginacion = "";
        String sTipoFideicomiso = "";
        String sFideicomisarios = "";
        String sFideicomitentes = "";
        String sCaracteristicas = "";
        String sRequerimientos = "";
        String sHonorarios = "";
        String sAdicionales = "";
        String sAntecedentes = "";
        BigDecimal iProspecto = new BigDecimal(0);       
       
        int pagina=1;
        if(consulta.size()>0){
          registro = (java.util.Map)consulta.get(0);
          iProspecto = (BigDecimal)registro.get("prospecto");
          sFecha = (String)registro.get("fecha"); 
          sPromotor  = (String)registro.get("promotor"); 
          sOriginacion   = (String)registro.get("originacion"); 
          sTipoFideicomiso  = (String)registro.get("negocio"); 
          sCaracteristicas  = (String)registro.get("caracteristicas"); 
          sRequerimientos    = (String)registro.get("requerimientos"); 
          sHonorarios     = (String)registro.get("honorarios"); 
          sAntecedentes     = (String)registro.get("antecedentes"); 
          sAdicionales      = (String)registro.get("adicionales"); 

          TipoPersona.setVtrIntDato1(iProspecto.intValue());
          TipoPersona.querySelect(101);
          if(TipoPersona.hasData())
          {
                for(int i=0;i<TipoPersona.getSize();i++)
                {
                    TipoPersona.setIndex(i);
                    if(TipoPersona.getVtrStrDato1().equalsIgnoreCase("Fideicomitente"))
                        sFideicomitentes+=" "+TipoPersona.getVtrStrDato2();
                    else
                        sFideicomisarios+=" "+TipoPersona.getVtrStrDato2(); 
                }
           }
        }        
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
                  <td width="110" align="right">CIUDAD DE MEXICO A <%=sFecha!=null?sFecha:""%></td>
              </tr> 
               <tr>         
                  <td width="105" align="right">&nbsp;</td>
                  <td width="110" align="right">Promotor <%=sPromotor!=null?sPromotor:""%></td>
              </tr> 
        
               <tr>         
              <td width="105" align="left">PROSPECTO NUEVO NEGOCIO</td>
              <td width="110" align="left"><%=sTipoFideicomiso!=null?sTipoFideicomiso:""%></td>
              </tr>            
            </table>
       </td>     
     </tr>  
      
       <tr>
       <td>
            <table width="900"  style="font-family: Arial;font-size: 12px;"> 
            <tr  bgcolor="#CCCCCC"  align="center" >
                <th>NUEVO PROSPECTO</th>
                <th>CARACTERISTICAS</th>            
            </tr>
            <tr>         
            <td width="450" align="left">ORIGINACION:</td>
            <td width="450" align="left"><%=sOriginacion!=null?sOriginacion:""%></td>
            </tr>             
            <tr>         
            <td width="450" align="left">ANTECEDENTES:</td>
            <td width="450" align="left"><%=sAntecedentes!=null?sAntecedentes:""%></td>
            </tr>             
            <tr>         
            <td width="450" align="left">TIPO DE FIDEICOMISO:</td>
            <td width="450" align="left"><%=sTipoFideicomiso!=null?sTipoFideicomiso:""%></td>
            </tr> 
            <tr>         
            <td width="450" align="left">FIDEICOMISARIO(S):</td>
            <td width="450" align="left"><%=sFideicomisarios!=null?sFideicomisarios:""%></td>
            </tr>    
            <tr>         
            <td width="450" align="left">FIDEICOMITENTE(S):</td>
            <td width="450" align="left"><%=sFideicomitentes!=null?sFideicomitentes:""%></td>
            </tr>               
            <tr>         
            <td width="450" align="left">CARACTERISTICAS:</td>
            <td width="450" align="left"><%=sCaracteristicas!=null?sCaracteristicas:""%></td>
            </tr>               
            <tr>         
            <td width="450" align="left">REQUERIMIENTOS OPERATIVOS:</td>
            <td width="450" align="left"><%=sRequerimientos!=null?sRequerimientos:""%></td>
            </tr>               
            <tr>         
            <td width="450" align="left">PROPUESTA DE HONORARIOS:</td>
            <td width="450" align="left"><%=sHonorarios!=null?sHonorarios:""%></td>
            </tr>   
            <tr>         
            <td width="450" align="left">CONSIDERACIONES ADICIONALES:</td>
            <td width="450" align="left"><%=sAdicionales!=null?sAdicionales:""%></td>
            </tr>             
            </table>
       </td>
      </tr>         

      </table>
           
      </body>
</html>