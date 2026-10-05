<%@ page import="java.math.BigDecimal, java.util.Date, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils, mx.com.inscitech.fiducia.common.util.DateTimeUtils"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.cuentas.individuales.negocio.FiduciaBD"/>
<jsp:useBean id="nConsultas" class="mx.com.inscitech.fiducia.business.nConsultas"/>
<jsp:useBean id="nConsultas2" class="mx.com.inscitech.fiducia.business.nConsultas"/>
<%
java.util.List consulta = (java.util.List)request.getAttribute("consulta");
%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <title>ESTADO DE CUENTA POR CONTRATO</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">

  </head>
  <body>
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
    double dsaldoAnt=0,dsaldoAct=0;

    String valor1="",valor2="",valor3="",valor4="",valor5="",valor6="",valor7="",valor8="";
    String evalor1="",evalor2="",evalor3="",evalor4="",evalor5="",evalor6="",evalor7="",evalor8="";
    
    String sInversionista="",sFideicomisopar="";
    int nInversionista =0,nFideicomisopar=0;
    sFideicomisopar=request.getParameter("Fideicomiso")!=null?(String)request.getParameter("Fideicomiso"):"";
    sInversionista=request.getParameter("CveNiv2")!=null?(String)request.getParameter("CveNiv2"):"";
    
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
      nomFideicomiso=nomFideicomiso.substring(nomFideicomiso.indexOf("-")+1, nomFideicomiso.length());
      fecFinal1 = (String)registro.get("rciPeriodo");
      nomN2 = (String)registro.get("rciNomNivel1");
      nomN2 = (String)registro.get("rciNomNivel1");
      numN2 = (BigDecimal)registro.get("rciNumN1");
      //llamando el query para obtener la clave del inversionista virtual
      nConsultas.setVtrIntDato1(numFideicomiso.intValue());//fideicomiso
      nConsultas2.setVtrIntDato1(numFideicomiso.intValue());//fideicomiso
            System.out.print("Fideicomiso "+numFideicomiso.intValue());

      nConsultas.querySelect(117);
      if(nConsultas.getSize() > 0) {
        nConsultas.setIndex(0); 
        dsaldoAct=nConsultas.getVtrDoubleDato3();
        valor1=nConsultas.getVtrStrDato4(); 
        valor2=nConsultas.getVtrStrDato5(); 
        valor3=nConsultas.getVtrStrDato6(); 
        valor4=nConsultas.getVtrStrDato7(); 
        valor5=nConsultas.getVtrStrDato8(); 
        valor6=nConsultas.getVtrStrDato9(); 
        valor7=nConsultas.getVtrStrDato10(); 
        valor8=nConsultas.getVtrStrDato11(); 

        evalor1=valor1.substring(valor1.indexOf(":")+1, valor1.length());
        valor1=valor1.substring(0, valor1.indexOf(":"));  
        
        evalor2=valor2.substring(valor2.indexOf(":")+1, valor2.length());
        valor2=valor2.substring(0, valor2.indexOf(":"));        
        evalor3=valor3.substring(valor3.indexOf(":")+1, valor3.length());
        valor3=valor3.substring(0, valor3.indexOf(":"));        
        evalor4=valor4.substring(valor4.indexOf(":")+1, valor4.length());
        valor4=valor4.substring(0, valor4.indexOf(":"));        
        evalor5=valor5.substring(valor5.indexOf(":")+1, valor5.length());
        valor5=valor5.substring(0, valor5.indexOf(":"));        
        evalor6=valor6.substring(valor6.indexOf(":")+1, valor6.length());
        valor6=valor6.substring(0, valor6.indexOf(":"));        

        evalor7=valor7.substring(valor7.indexOf(":")+1, valor7.length());
        valor7=valor7.substring(0, valor7.indexOf(":"));

        evalor8=valor8.substring(valor8.indexOf(":")+1, valor8.length());
        valor8=valor8.substring(0, valor8.indexOf(":"));

      }
      nConsultas2.querySelect(117);
      
        for(int index = 0; index < nConsultas2.getSize(); index++) {
            nConsultas2.setIndex(index);    
                saldoAnt = new BigDecimal(nConsultas2.getVtrDoubleDato2());   
                dsaldoAnt=nConsultas2.getVtrDoubleDato2();
        }
    }
	else
		System.out.println("No existe informacion Edo Cta");
  
  %>
  
  <table  class="table table-responsive table-hover">  
    <thead>
        <tr class="table-light" class="text-left">
          <th scope="col">
            <div align="left"><img src="<%=request.getContextPath()%>/imagenes/header.jpg" ></div>
          </th>
          <th scope="col"><div align="left"><font size=6>ETADO DE CUENTA DEL CONTRATO <%=nomFideicomiso%></font></div></th>
           <th></th>
        </tr>
        <tr  class="table-primary"  class="text-center">
            <th><font size=3>&nbsp;</font></th>
            <th><font size=3>DATOS GENERALES</font></th>
            <th></th>
        </tr>
        <tr>
            <th ><font size=3>Contrato:</font></th>
            <th><font size=3><%=numFideicomiso%></font></th>
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
        <tr  class="table-primary"   class="text-center">
            <th><font size=3>&nbsp;</font></th>
            <th><font size=3>RESUMEN</font></th>
             <th></th>
        </tr>  
        <tr>
            <th  width="50%"><font size=2><%=valor2%>:</font></th>
            <th  width="50%"><font size=2><%=evalor2%></font></th>
             <th></th>
        </tr>
        <tr>
            <th  width="50%"><font size=2><%=valor3%>:</font></th>
            <th  width="50%"><font size=2><%=evalor3%></font></th>
             <th></th>
        </tr>
        <tr>
            <th  width="50%"><font size=2><%=valor4%>:</font></th>
            <th  width="50%"><font size=2><%=evalor4%></font></th>
             <th></th>
        </tr>
        <tr>
            <th  width="50%"><font size=2><%=valor5%>:</font></th>
            <th  width="50%"><font size=2><%=evalor5%></font></th>
             <th></th>
        </tr>
        <tr>
            <th  width="50%"><font size=2><%=valor6%>:</font></th>
            <th  width="50%"><font size=2><%=evalor6%></font></th>
             <th></th>
        </tr>   
        <tr>
            <th  width="50%"><font size=2><%=valor7%>:</font></th>
            <th  width="50%"><font size=2><%=evalor7%></font></th>
             <th></th>
        </tr>
        <tr>
            <th  width="50%"><font size=2><%=valor8%>:</font></th>
            <th  width="50%"><font size=2><%=evalor8%></font></th>
             <th></th>
        </tr>   

        <tr>
            <th  width="50%"><font size=3><%=valor1%>:</font></th>
            <th  width="50%"><font size=3><%=evalor1%></font></th>
             <th></th>
        </tr>         
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
          <th scope="col">Fecha de Movimiento</th>
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
            <td><font size=3><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", dsaldoAnt)%></font></td>
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
          <tr class="text-left">
            <td><font size=3><%=sTipoEdoCuenta.intValue()==2?DateTimeUtils.formatDateTimeFromPattern("dd/MM/yyyy", DateTimeUtils.parseDateTimeFromPattern("dd/MM/yy", fecha)):(sTipoEdoCuenta.intValue()==9?fecha:"")%></font></td>
            <td><font size=3><%=nomInvers%></font></td>
            <td><font size=3><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", depositos)%></font></td>
            <td><font size=3><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", retiros)%></font></td>
            <td><font size=3><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", saldoParcial)%></font></td>
          </tr>
        <%
        }
        %>    
    </tbody>
   </table> 
  </body>
</html>