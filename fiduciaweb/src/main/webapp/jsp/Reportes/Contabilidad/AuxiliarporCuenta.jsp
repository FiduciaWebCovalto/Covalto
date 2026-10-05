<!-- AuxiliarporCuenta.jsp -->
<%@ page contentType="text/html; "%>
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<%
java.util.List consulta = (java.util.List)request.getAttribute("consulta");
%>
<html>
      <head>
      <meta http-equiv="Content-Type" content="text/html; ">
      <title>Auxiliar por Cuenta</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">

      </head>
      <body onload="self.opener.hideWaitLayer();">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>        
      <div style="height: 800px; overflow-y: auto; border: 1px solid #ccc;">
      <table class="table table-responsive table-hover" align="center" >   
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
        String Fecha = "";
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
        BigDecimal folioCto = new BigDecimal(0);
        BigDecimal secAux = new BigDecimal(0);
        BigDecimal saldoInicial = new BigDecimal(0);
        BigDecimal saldoParcial = new BigDecimal(0);
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

        int pagina = 1;
        
        if(consulta.size() > 0 && consulta.get(0) instanceof java.util.Map) {
          registro = (java.util.Map)consulta.get(0);
          numContrato = (BigDecimal)registro.get("rpoNumAux1");
          nomContrato= ((String)registro.get("rpoCtoNomContrato")).split("---")[0];  
          nomCuenta= ((String)registro.get("rpoCtoNomContrato")).split("---")[1];  
          FechaAnt = (String)registro.get("rpoFecha"); 
          numCuentaAnt = (String)registro.get("numCuenta"); 
          sPeriodo="RELACION DE CUENTAS DEL "+request.getParameter("PeriodoInicial")
          +" AL "+request.getParameter("PeriodoFinal");
        }        
    %>
    <thead >
              <tr>
                <th><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg"  height="40"></th>
                <th>&nbsp;</th>
                <th>&nbsp;</th>
                <th>&nbsp;</th>
                <th>&nbsp;</th>
                <th>&nbsp;</th>
              </tr>
              <tr  align="left">
              <th>&nbsp;</th>
              <th>&nbsp;</th>
              
              <th><%=session.getAttribute("empresa_1")%></th>
              <th>&nbsp;</th>
              <th>&nbsp;</th>
              <th>&nbsp;</th>
              </tr>
              <tr  align="left">
              <th>&nbsp;</th>
              <th>&nbsp;</th>
              
              <th><%=session.getAttribute("empresa_2")%></th>
              <th>&nbsp;</th>
              <th>&nbsp;</th>
              <th>&nbsp;</th>
              </tr>
              <tr class="table-light" align="left">
              <th>&nbsp;</th>
              <th>&nbsp;</th>
              
              <th>AUXILIAR POR CUENTA</th>
              <th>&nbsp;</th>
              <th>&nbsp;</th>
              <th>&nbsp;</th>
              </tr>    
              <tr  align="left">
              <th>&nbsp;</th>
              <th>&nbsp;</th>
              
              <th><%=sPeriodo%></th>
              <th>&nbsp;</th>
              <th>&nbsp;</th>
              <th>&nbsp;</th>
              </tr>                
    </thead>  
    <tbody>
              <tr>         
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td align="right"><%=session.getAttribute("strFechaContable")%></td>
              </tr> 
 
            <tr>
                <th  align="left">Fideicomiso <%=numContrato.intValue() != 0?numContrato.toString():"&nbsp;"%> - <%=nomContrato%>
                </th> 
                <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>                        
            <tr>
                <th  align="left">Nombre de la cuenta: <%=nomCuenta%>
                </th>  
                <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            
          <tr><td ><hr size="1"></td></tr>
            <tr class="fw-bold"  >
                <td>FECHA</td>
                <td>CUENTA</td>
                <td>DESCRIPCION</td>
                <td align="right">CARGOS</td>
                <td  align="right">ABONOS</td>
                <td  align="right" >SALDO PARCIAL</td>
            </tr>
         <tr>
         <td >&nbsp;</td>
         <td >&nbsp;</td>
         <td >&nbsp;</td>
         <td >&nbsp;</td>
         <td >&nbsp;</td>
         <td >&nbsp;</td>
         </tr>
<%//IMPRESION DE REGISTROS
            //FechaAnt="";
            for(int i = 0; i < consulta.size(); i++) 
              {  //Para cada registro
              registro = (java.util.Map)consulta.get(i); 
              //Obtener datos de la BD
              Fecha =(String)registro.get("rpoFecha");//Fecha
              folioOper = (BigDecimal)registro.get("rpoNumFolio");//secuencial de asiento
              //sec = (BigDecimal)registro.get("rasSecAsiento");
              DescAsiento = (String)registro.get("rpoDescAsiento");//folio
              numCuenta = (String)registro.get("numCuenta");
              cargo = (BigDecimal)registro.get("rpoCargos");
              abono = (BigDecimal)registro.get("rpoAbonos");   
              saldoInicial = (BigDecimal)registro.get("rpoSalIni");  
              saldoParcial = new BigDecimal(saldoInicial.doubleValue()+cargo.doubleValue()-abono.doubleValue());
              if(!FechaAnt.equalsIgnoreCase(Fecha))
                      {//SUBTOTALES CARGOS/ABONOS
                      FechaAnt=Fecha;
                      secAux=new BigDecimal(0);
                      secEncabezado=new BigDecimal(0);   
                      %>
                      <tr>
                      <td >&nbsp;</td>
                      <td >&nbsp;</td>
                      <td >&nbsp;</td>
                      <td align="right" class="fw-bold"><%=totalCargos.intValue() != 0?DecimalFormatUtils.getFormatedNumber("###,###,###,###,###,###,###,###,###,###,###.00", totalCargos):"0.00"%></td>
                      <td align="right" class="fw-bold"><%=totalAbonos.intValue() != 0?DecimalFormatUtils.getFormatedNumber("###,###,###,###,###,###,###,###,###,###,###.00", totalAbonos):"0.00"%></td>
                      <td  align="right">&nbsp;</td> 
                      </tr>
                      <%
                        totalCargos=new BigDecimal(0);
                        totalAbonos=new BigDecimal(0);  
                        totalGeneralCargos=new BigDecimal(0);
                        totalGeneralAbonos=new BigDecimal(0);
                        
              }
        %>
            <tr>
                <td align="left"><%=Fecha%></td>
                <td align="left"> <%=numCuenta%></td>
                <td align="left"> <%=DescAsiento%></td>
                <td align="right"> <%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", cargo)%></td>
                <td align="right"> <%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", abono)%></td>
                <td align="right"> <%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00", saldoInicial)%></td>                
            </tr>            
            <%
              totalGeneralCargos= new BigDecimal(totalGeneralCargos.doubleValue() + cargo.doubleValue());
              totalGeneralAbonos= new BigDecimal(totalGeneralAbonos.doubleValue() + abono.doubleValue());
              totalCargos= new BigDecimal(totalCargos.doubleValue() + cargo.doubleValue());
              totalAbonos= new BigDecimal(totalAbonos.doubleValue() + abono.doubleValue());
              secEncabezado=new BigDecimal(secEncabezado.intValue() + 1);
              secAux=new BigDecimal(secAux.intValue() + 1);
            }// fin recorroido de datos                  
          %>
                <tr>
                <td >&nbsp;</td>
                <td >&nbsp;</td>
                <td >&nbsp;</td>
                <td align="right" class="fw-bold"><%=totalCargos.intValue() != 0?DecimalFormatUtils.getFormatedNumber("###,###,###,###,###,###,###,###,###,###,###.00", totalCargos):"0.00"%></td>
                <td align="right" class="fw-bold"><%=totalAbonos.intValue() != 0?DecimalFormatUtils.getFormatedNumber("###,###,###,###,###,###,###,###,###,###,###.00", totalAbonos):"0.00"%></td>
                <td  align="right">&nbsp;</td> 
                </tr>          
                <tr>
                <td >&nbsp;</td>  
                <td >&nbsp;</td>  
                <td align="right" class="fw-bold">SALDO FINAL:</td>
                <th >&nbsp;</td>  
                <td >&nbsp;</td>  
                <td align="right" class="fw-bold"><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###,###,###,###,###,###,###,###,###,###,###.00", saldoInicial)%></td>
                </tr>
          </tbody>
          </table>
         </div> 
      </body>
</html>