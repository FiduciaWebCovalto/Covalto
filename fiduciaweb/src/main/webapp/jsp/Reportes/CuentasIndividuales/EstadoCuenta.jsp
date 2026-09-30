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
    
    //Variables que contendrán los elementos de cada tupla
    BigDecimal secuencial = new BigDecimal(0);
    BigDecimal numFideicomiso = new BigDecimal(0);
    BigDecimal sTipoEdoCuenta = new BigDecimal(0);
    String nomFideicomiso = "";
    String periodo = "";
    String fecha = null;
    String nomNivel1 = "";
    String nomNivel2 = "";
    String nomNivel3 = "";
    String nomInvers = "";
    BigDecimal numN1 = new BigDecimal(0);
    BigDecimal numN2 = new BigDecimal(0);
    BigDecimal numN3 = new BigDecimal(0);
    String nomN1 = "";
    String nomN2 = "";
    BigDecimal numInver = new BigDecimal(0);
    BigDecimal saldoAnt = new BigDecimal(0);
    BigDecimal tasa = new BigDecimal(0);
    BigDecimal depositos = new BigDecimal(0);
    BigDecimal retiros = new BigDecimal(0);
    BigDecimal intereses = new BigDecimal(0);
    BigDecimal isr = new BigDecimal(0);
    BigDecimal saldoParcial = new BigDecimal(0);
    BigDecimal participacion = new BigDecimal(0);
    BigDecimal saldoFinal = new BigDecimal(0);
    String fecFinal = "";
    String fecInicial = "";
    String fecFinal1 = "";
    String cveInv = "";
    String cveInvAux = "";
    String sFechaIngreso="";
    String sFechaBaja="";
    String sFechaDA="";
    String sDireccion="";
    BigDecimal numPart=new BigDecimal(0);
    
    String sInversionista="",sFideicomisopar="";
    int nInversionista =0,nFideicomisopar=0;
    sFideicomisopar=request.getParameter("Fideicomiso")!=null?(String)request.getParameter("Fideicomiso"):"";
    sInversionista=request.getParameter("CveNiv2")!=null?(String)request.getParameter("CveNiv2"):"";
  /*  System.out.println("Fideicomiso "+sFideicomisopar);    
    System.out.println("Inversionista "+sFideicomisopar);    
    nInversionista=Integer.valueOf((String)request.getParameter("CveNiv2"));
    nFideicomisopar=Integer.valueOf((String)request.getParameter("Fideicomiso"));*/
    
    //Variables auxiliares para la lógica e impresión
    BigDecimal totsNiv3Depositos = new BigDecimal(0);
    BigDecimal totsNiv2Depositos = new BigDecimal(0);
    BigDecimal totsNiv1Depositos = new BigDecimal(0);
    BigDecimal totsNiv3Retiros = new BigDecimal(0);
    BigDecimal totsNiv2Retiros = new BigDecimal(0);
    BigDecimal totsNiv1Retiros = new BigDecimal(0);
    
    String nomN1EnCurso = "";
    String nomN2EnCurso = "";
    boolean primerNivel_1 = true;
    boolean primerNivel_2 = true;
    
     BigDecimal ctrlTercerNivel = new BigDecimal(0);
    
    if(consulta.size() > 0) {
      registro = (java.util.Map)consulta.get(0); 
      numFideicomiso=(BigDecimal)registro.get("rciNumFideicomiso"); 
      sTipoEdoCuenta=(BigDecimal)registro.get("rciParticipacion"); 
      nomFideicomiso=(String)registro.get("rciNomFideicomiso");
      fecFinal1 = (String)registro.get("rciPeriodo");
      nomN2 = (String)registro.get("rciNomN2");
      nomN2 = (String)registro.get("rciNomN2");
      numN2 = (BigDecimal)registro.get("rciNumN2");
      //llamando el query para obtener la clave del inversionista virtual
      nConsultas.setVtrIntDato1(numFideicomiso.intValue());//fideicomiso
      nConsultas.setVtrStrDato1(String.valueOf(numN2.intValue()));//inversionista
      nConsultas2.setVtrIntDato1(numFideicomiso.intValue());//fideicomiso
      nConsultas2.setVtrStrDato1(String.valueOf(numN2.intValue()));//inversionista      
            System.out.print("Clave inversionista "+numN2.intValue());
            System.out.print("Fideicomiso "+numFideicomiso.intValue());

      nConsultas.querySelect(117);
      nConsultas2.querySelect(117);
      
      nConsultas3.setVtrIntDato1(numN2.intValue());
      nConsultas3.setVtrIntDato2(numFideicomiso.intValue());
      nConsultas3.querySelect(118);
        if(nConsultas3.getSize() > 0) {
            sFechaIngreso = nConsultas3.getVtrStrDato1(); 
            sFechaBaja = nConsultas3.getVtrStrDato4(); 
             System.out.print("Fecha Ingreso "+sFechaIngreso);
            sFechaDA = nConsultas3.getVtrStrDato2(); 
            sDireccion = nConsultas3.getVtrStrDato3(); 
        }
        
        for(int index = 0; index < nConsultas2.getSize(); index++) {
            nConsultas2.setIndex(index);    
            switch(nConsultas2.getVtrStrDato1()) {
                case "SA":
                saldoAnt = new BigDecimal(nConsultas2.getVtrDoubleDato3()); 
                break;           
            }     
        }
    }
  
  %>
  <table  class="table table-responsive table-hover">  
    <thead>
        <tr class="table-light" class="text-left">
          <th scope="col">
            <div align="left"><img src="<%=request.getContextPath()%>/imagenes/header.jpg" ></div>
          </th>
          <th scope="col"><div align="left"><font size=6>ESTADO DE CUENTA DEL CONTRATO <%=numFideicomiso%></font></div></th>
           <th></th>
        </tr>
        <tr  class="table-primary"  class="text-center">
            <th><font size=3>&nbsp;</font></th>
            <th><font size=3>DATOS GENERALES</font></th>
            <th></th>
        </tr>
        <tr>
            <th ><font size=3>Dirección:</font></th>
            <th><font size=3><%=sDireccion%></font></th>
             <th></th>
         </tr>
         <tr>
            <th ><font size=3>Inversionista:</font></th>
            <th><font size=3><%=nomN2%></font></th>
             <th></th>
         </tr>
        <tr>
            <th ><font size=3>Subcuenta:</font></th>
            <th><font size=3><%=numN2%></font></th>
             <th></th>
         </tr>        
        <tr>
            <th ><font size=3>Periodo:</font></th>
            <th><font size=3><%=fecFinal1%></font></th>
             <th></th>
         </tr>     
        <tr>
            <th ><font size=3>Moneda:</font></th>
            <th><font size=3>Nacional</font></th>
             <th></th>
         </tr>           
        <tr>
            <th  width="50%"><font size=2>F.A.Plan:</font></th>
            <th  width="50%"><font size=2><%=sFechaDA%></font></th>
             <th></th>
        </tr>
        <tr>
            <th  width="50%"><font size=2>F.Ingreso:</font></th>
            <th  width="50%"><font size=2><%=sFechaIngreso%></font></th>
             <th></th>
        </tr>
        <tr>
            <th  width="50%"><font size=2>F.Baja:</font></th>
            <th  width="50%"><font size=2><%=sFechaBaja%></font></th>
             <th></th>
        </tr>
        <tr>
            <th  width="50%"><font size=2>Años Laborados:</font></th>
            <th  width="50%"><font size=2><%nConsultas.setIndex(0);%><%=DecimalFormatUtils.getFormatedNumber("###,#00", nConsultas.getVtrDoubleDato4())%></font></th>
             <th></th>
        </tr>     
       
    </thead>
  </table>  
  <table  class="table table-responsive table-hover">  
    <thead>  
        <tr  class="table-primary"   class="text-center">
            <th></th>
            <th>&nbsp;</th>
            <th>RESUMEN</th>
             <th></th>
            <th>&nbsp;</th>             
        </tr>   
        <tr>
            <th>&nbsp;</th>
            <th>Trabajador</th>
            <th>H. Ayto.</th>
            <th>Total</th>
            <th>&nbsp;</th>            
        </tr>     
        <%
            for(int index = 0; index < nConsultas.getSize(); index++) {
                nConsultas.setIndex(index);                                
        %>        
        <tr>
            <th>
                <%
                    switch(nConsultas.getVtrStrDato1()) {
                    case "SA":
                        out.print("Saldo Anterior:");
                    break;
                    case "D":
                        out.print("Depósitos:");
                    break;
                    case "R":
                        out.print("Retiros:");
                    break;
                    case "I":
                        out.print("Intereses:");
                    break;
                    case "S":
                        out.print("Saldo Actual:");
                    break;
                    case "DA":
                        System.out.print("Derechos "+nConsultas.getVtrStrDato3());
                        out.print(nConsultas.getVtrStrDato3());
                    break;
                    }
                %>            
            </th>
            <th><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", nConsultas.getVtrDoubleDato1())%></th>
            <th><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", nConsultas.getVtrDoubleDato2())%></th>
            <th><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", nConsultas.getVtrDoubleDato3())%></th>
            <th>&nbsp;</td>
        </tr>   
        <%}%>        
    </thead>
  </table> 
  <table class="table table-responsive table-hover">
    <thead class="table-info">
      <tr  class="text-center">
          <th scope="col">&nbsp;</th>
          <th scope="col">Detalle de Operaciones</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
      </tr>      
      <tr class="text-left">
          <th scope="col"><%=sTipoEdoCuenta.intValue()==2||sTipoEdoCuenta.intValue()==7?"Fecha de Movimiento":"Periodo"%></th>
          <th scope="col">Descripci&oacute;n</th>
          <th scope="col">Dep&oacute;sitos</th>
          <th scope="col">Retiros</th>
          <th scope="col">Saldo</th>
      </tr>            
    </thead>   
    <tbody>
          <tr class="text-left">
            <td>&nbsp;</td>
            <td>Saldo Anterior</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", saldoAnt)%></td>
          </tr> 
                            <%
                                for(int i = 0; i < consulta.size(); i++) {  //Para cada registro
                                  registro = (java.util.Map)consulta.get(i);
                                  //Obtener datos de la BD
                                  fecha = (String)registro.get("rciFecha");
                                  numN1 = (BigDecimal)registro.get("rciNumN1");
                                  nomN1 = (String)registro.get("rciNomN1");
                                  numN2 = (BigDecimal)registro.get("rciNumN2");
                                  nomN2 = (String)registro.get("rciNomN2");
                                  numN3 = (BigDecimal)registro.get("rciNumN3");
                                  nomInvers = (String)registro.get("rciNomInvers");
                                  depositos = (BigDecimal)registro.get("rciDepositos");
                                  retiros = (BigDecimal)registro.get("rciRetiros");
                                  saldoParcial = (BigDecimal)registro.get("rciSaldoParcial");
                                  
                                  fecFinal = (String)registro.get("rciPeriodo");
                                  fecInicial= "01/" + fecFinal.substring(3,10);
                                  cveInv = (String)registro.get("claveInversionista");
                                  numFideicomiso=(BigDecimal)registro.get("rciNumFideicomiso");
                                  nomNivel1 = (String)registro.get("rciNomNivel1");
                                  nomNivel2 = (String)registro.get("rciNomNivel2");
                                  nomNivel3 = (String)registro.get("rciNomNivel3"); 
                                  %>
                                  <tr>
                                    <td><%=sTipoEdoCuenta.intValue()==2?DateTimeUtils.formatDateTimeFromPattern("dd/MM/yyyy", DateTimeUtils.parseDateTimeFromPattern("dd/MM/yy", fecha)):(sTipoEdoCuenta.intValue()==9?fecha:"")%></td>
                                    <td><%=nomInvers%></font></td>
                                    <td><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", depositos)%></td>
                                    <td><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", retiros)%></td>
                                    <td><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", saldoParcial)%></td>
                                  </tr>
                                <%}%>          
    </tbody>
   </table>           
  </body>
</html>