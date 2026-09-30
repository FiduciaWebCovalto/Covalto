
<!-- BalanzaDesglosada.jsp -->
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<jsp:useBean id="Periodo"  class="mx.com.inscitech.fiducia.business.nConsultas"/>
<%@ page contentType="text/html; "%>
<%
java.util.List consulta = (java.util.List)request.getAttribute("consulta");
%>
<html>
      <head>
      <meta http-equiv="Content-Type" content="text/html; ">
      <title>Balanza Desglosada</title>
      <link rel="stylesheet" href="jsp/fiduciav5/default.css" type="text/css">
      </head>
      <body onload="self.opener.hideWaitLayer();">
      <table width="85%"  style="font-family: Arial;font-size: 12px;" align="center" >   
     <%
        //Variable para obtener tupla por tupla
        java.util.Map registro = null;
    
        //Variables que contendrán los elementos de cada tupla
        BigDecimal numContrato = new BigDecimal(0);
        BigDecimal folioOper = new BigDecimal(0);
        BigDecimal sec= new BigDecimal(0); 
        String nomContrato = "";
        String nomCuenta = "";
        String DescMovto = "";
        String DescAsiento = "";
        String cveSaldoAsiento = "";
        String FechaAnt = "";
        String numCuenta = "";
        String numCuentaAnt ="";
        String sPeriodo ="";

        BigDecimal ctam = new BigDecimal(0);
        BigDecimal scta = new BigDecimal(0);
        BigDecimal sscta = new BigDecimal(0);
        BigDecimal ssscta = new BigDecimal(0);
        BigDecimal sssscta = new BigDecimal(0);
        BigDecimal ssssscta = new BigDecimal(0);
        BigDecimal aux2 = new BigDecimal(0);
        BigDecimal aux3 = new BigDecimal(0);
        BigDecimal cargo = new BigDecimal(0);
        BigDecimal abono = new BigDecimal(0);
        BigDecimal folio = new BigDecimal(0);
        String fecha = "";
        BigDecimal secAux = new BigDecimal(0);
        BigDecimal saldoInicial = new BigDecimal(0);
        BigDecimal saldoParcial = new BigDecimal(0);
        BigDecimal saldoFinal = new BigDecimal(0);
        //variables Auxiliares
        BigDecimal folioAnt = new BigDecimal(0);
        BigDecimal secEncabezado = new BigDecimal(0);
        BigDecimal totalCargos = new BigDecimal(0);
        BigDecimal totalAbonos = new BigDecimal(0);
        BigDecimal totalGeneralCargos = new BigDecimal(0);
        BigDecimal totalGeneralAbonos = new BigDecimal(0);
        BigDecimal bigDecimalCero = new BigDecimal(0);
        BigDecimal encabezado = new BigDecimal(9);
        BigDecimal totalRenglones = new BigDecimal(46);
        BigDecimal renglones = new BigDecimal(totalRenglones.intValue()-encabezado.intValue());
        BigDecimal cuentaRenglones = new BigDecimal(0);
        
        
        int pagina=1;
        if(consulta.size()>0){
          registro = (java.util.Map)consulta.get(0);
          numContrato = (BigDecimal)registro.get("frbNumAux1");
          
          
          if(registro.get("frbCtoNomContrato")!=null)
          {
            nomContrato= ((String)registro.get("frbCtoNomContrato")).split("---")[0];  
            //nomCuenta= ((String)registro.get("frbCtoNomContrato")).split("---")[1];  
          }
          FechaAnt = (String)registro.get("frbFecha"); 
          //numCuentaAnt = (String)registro.get("numCuenta"); 
          
         
          
          
          Periodo.setVtrIntDato1(Integer.valueOf(session.getAttribute("userid").toString()).intValue());
          Periodo.querySelect(54);
          if(Periodo.hasData())
            sPeriodo="RELACION DE CUENTAS DEL "+Periodo.getVtrStrDato1()+" AL "+Periodo.getVtrStrDato2();
        }        
    %>
              <tr>
                <td rowspan="7"   align="center"><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg"></td>
                <td colspan="14" align="right">&nbsp;<font style="font-family: Arial;font-size: 9px;"> Página: <%=pagina%></font></td>
              </tr>
              <tr><th colspan="15"><%=session.getAttribute("empresa_1")%></th></tr>
              <tr><th colspan="15"><%=session.getAttribute("empresa_2")%></th></tr>
              <tr><th colspan="15">Balanza Desglosada</th></tr>
              <tr ><th colspan="15"><%=sPeriodo%></th></tr>
              <tr>         
              <td colspan="9" width="70">&nbsp;</td>
              <td width="220">&nbsp;</td>
              <td colspan=4 align="right"><%=session.getAttribute("strFechaContable")%></td>
              </tr> 
 
            <tr>
                <th  colspan="15" align="center">FIDEICOMISO <%=numContrato.intValue() != 0?numContrato.toString():"&nbsp;"%></th>               
            </tr>                        
            
          <tr><td colspan="15"><hr size="1"></td></tr>
            <tr class="textohome2" style="font-size: xx-small;">
                <th>CUENTA</th>
                <th>SCTA</th>
                <th>S2CTA</th>
                <th>S3CTA</th>
                <th>S4CTA</th>
                <th>S5CTA</th>
                <th>NOMBRE</th>
                <th>AUX2</th>
                <th>AUX3</th>
                <th>FECHA</th>
                <th>FOLIO</th>
                <th align="right" style="width:120px;">SALDO ANTERIOR</th>
                <th align="right" style="width:120px;">CARGO</th>
                <th align="right" style="width:120px;">ABONO</th>
                <th align="right" style="width:120px;">SALDO FINAL</th>
            </tr>
         <tr><td colspan="15">&nbsp;</td></tr>
<%//IMPRESION DE REGISTROS
          for(int i = 0; i < consulta.size(); i++) 
              {  //Para cada registro
              registro = (java.util.Map)consulta.get(i); 
              //Obtener datos de la BD
              folioOper = (BigDecimal)registro.get("frbNumFolio");//secuencial de asiento
              //sec = (BigDecimal)registro.get("rasSecAsiento");
              
              nomCuenta= ((String)registro.get("frbDescAsiento")); 
              ctam = (BigDecimal)registro.get("frbNumCtam");
              scta = (BigDecimal)registro.get("frbNumScta");
              sscta = (BigDecimal)registro.get("frbNumSscta");
              ssscta = (BigDecimal)registro.get("frbNumSsscta");
              sssscta = (BigDecimal)registro.get("frbNumSssscta");
              ssssscta = (BigDecimal)registro.get("frbNumSssscta");
              aux2 = (BigDecimal)registro.get("frbNumAux2");
              aux3 = (BigDecimal)registro.get("frbNumAux3");
              cveSaldoAsiento = (String)registro.get("frbCveSalAsi");//saldo/asientos
              folio =(BigDecimal)registro.get("frbFolioOpera");//Fecha
              fecha =(String)registro.get("frbFecha");//Fecha
              
              DescAsiento = (String)registro.get("frbDescAsiento");//folio
              numCuenta = (String)registro.get("numCuenta");
              cargo = (BigDecimal)registro.get("frbCargos");
              abono = (BigDecimal)registro.get("frbAbonos");   
              saldoInicial = (BigDecimal)registro.get("frbSalIni");  
              
              saldoFinal = saldoInicial.add(cargo.subtract(abono));
              
              if(cveSaldoAsiento.equals("SALDO")){ %>
            
            <!-- TOTALES -->
            <%if(totalCargos.doubleValue()>0||totalAbonos.doubleValue()>0){%>
            <tr style="font-weight:bolder;font-size:11px;">
                <td align="center" colspan="12">&nbsp;</td>
                <td align="left">---------------</td>   
                <td align="left">---------------</td>   
                <td align="right"> &nbsp;</td>        
            </tr>
            <tr style="font-weight:bolder;font-size:11px;">
                <td align="center" colspan="12">&nbsp;</td>
                <td align="right"> <%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", totalCargos)%></td>   
                <td align="right"> <%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", totalAbonos)%></td>   
                <td align="right"> &nbsp;</td>        
            </tr>
            <%}%>
            <!-- ------- -->
            
            <tr>
                <td align="right" colspan="14"> &nbsp;</td>                      
            </tr>
            <tr style="font-weight:bolder;font-size:11px;">
                <td align="center"> <%=ctam%></td>
                <td align="center"> <%=scta%></td>
                <td align="center"> <%=sscta%></td>
                <td align="center"> <%=sscta%></td>
                <td align="center"> <%=ssscta%></td>
                <td align="center"> <%=sssscta%></td>
                <td align="left" nowrap> <%=DescAsiento%></td>
                <td align="center"> <%=aux2%></td>
                <td align="center"> <%=aux3%></td>
                <td align="left" nowrap>&nbsp;</td>
                <td align="left" nowrap>&nbsp;</td>
                <td align="right"> <%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", saldoInicial)%></td>     
                <td align="right"> &nbsp;</td>   
                <td align="right"> &nbsp;</td>   
                <td align="right"> &nbsp;</td>        
            </tr>
            <tr>
                <td align="right" colspan="15"> &nbsp;</td>                      
            </tr>
            
            <%
              totalCargos= new BigDecimal(0);
              totalAbonos= new BigDecimal(0);
              secEncabezado=new BigDecimal(secEncabezado.intValue() + 1);
              secAux=new BigDecimal(secAux.intValue() + 1);
              cuentaRenglones = new BigDecimal(cuentaRenglones.intValue()+1);
            
            }else if(cveSaldoAsiento.equals("ASIENTO")){
              
              saldoParcial = new BigDecimal(saldoInicial.doubleValue()+cargo.doubleValue()-abono.doubleValue());
              totalCargos= new BigDecimal(totalCargos.doubleValue() + cargo.doubleValue());
              totalAbonos= new BigDecimal(totalAbonos.doubleValue() + abono.doubleValue());
              totalGeneralCargos= new BigDecimal(totalGeneralCargos.doubleValue() + cargo.doubleValue());
              totalGeneralAbonos= new BigDecimal(totalGeneralAbonos.doubleValue() + abono.doubleValue());
            %>
            

            <tr style="font-size:10px;">
                <td align="center"> <%=ctam%></td>
                <td align="center"> <%=scta%></td>
                <td align="center"> <%=sscta%></td>
                <td align="center"> <%=sscta%></td>
                <td align="center"> <%=ssscta%></td>
                <td align="center"> <%=sssscta%></td>
                <td align="left" nowrap> <%=DescAsiento%></td>
                <td align="center"> <%=aux2%></td>
                <td align="center"> <%=aux3%></td>
                <td align="left" nowrap>&nbsp; <%=fecha%>&nbsp;</td>
                <td align="left" nowrap>&nbsp;<b> <%=folio%></b>&nbsp;</td>
                <td align="right"> <%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", saldoInicial)%></td>   
                <td align="right"> <%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", cargo)%></td>
                <td align="right"> <%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", abono)%></td>    
                <td align="right"> <%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", saldoParcial)%></td>                
            </tr>
            <%}%>
            
            <%
            
            }// fin recorroido de datos                  
          %>
          
          <!-- TOTALES GENERAL-->
            <%if(totalGeneralCargos.doubleValue()>0||totalGeneralAbonos.doubleValue()>0){%>
            
            <tr style="font-weight:bolder;font-size:11px;">
                <td align="center" colspan="12">&nbsp;</td>
                <td align="left">---------------</td>   
                <td align="left">---------------</td>   
                <td align="right"> &nbsp;</td>        
            </tr>
            <tr style="font-weight:bolder;font-size:11px;">
                <td align="center" colspan="12">&nbsp;</td>
                <td align="right"> <%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", totalCargos)%></td>   
                <td align="right"> <%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", totalAbonos)%></td>   
                <td align="right"> &nbsp;</td>        
            </tr>            
            
            <tr style="font-weight:bolder;font-size:11px;">
                <td align="center" colspan="15">&nbsp;</td>
            </tr>
            <tr style="font-weight:bolder;font-size:11px;">
                <td colspan="12" align="right">TOTALES</td>
                <td align="right"><u><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", totalGeneralCargos)%></u></td>   
                <td align="right"><u><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", totalGeneralAbonos)%></u></td>   
                <td align="right"> &nbsp;</td>        
            </tr>
            <%}%>
          <!-- ------- -->
          
          <tr>
            <td colspan="15">&nbsp;</td>
          </tr>     
          <%
            cuentaRenglones = new BigDecimal(cuentaRenglones.intValue()+2);
          
             while((cuentaRenglones.intValue()+2)<=renglones.intValue())
              {
              %>
              <tr><td colspan="14">&nbsp;</td></tr>
              <%
                cuentaRenglones = new BigDecimal(cuentaRenglones.intValue()+1);
              } 
          %>  
          </table>
           
      </body>
</html>