<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.math.BigDecimal, java.util.Date, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils, mx.com.inscitech.fiducia.common.util.DateTimeUtils"%>
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
  </head>
  <body style="font-family: Arial; 10px;">
  
  <%
    //Variable para obtener tupla por tupla
    java.util.Map registro = null;
    
    //Variables que contendrán los elementos de cada tupla
    BigDecimal secuencial = new BigDecimal(0);
    BigDecimal numFideicomiso = new BigDecimal(0);
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
  
  <table border="0" cellspacing="0" cellpadding="0">  
    <tr>
      <td>
        <table border="0" cellspacing="0" cellpadding="0" width="100%" height="127px">
                  <tr>
                      <td width="=20%" height="100%" valign="top">
                        <div align="left"><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg" ></div>
                      </td>
                      <td width="60%">
                          <table width="100%" height="100%" border="0">
                                <tr>
                                    <td style="font-weight:bolder;" align="right" width="60%"><font size=3>&nbsp;</font></td>
                                </tr>
                                <tr>
                                    <td style="font-weight:bolder;" align="right" width="60%"><font size=3>&nbsp;</font></td>
                                </tr>
                                <tr><td style="font-weight:bolder;" align="center"><font size=3><%=nomFideicomiso%></font></td></tr>
                                <tr><td style="font-weight:bolder;" align="center"><%=sDireccion%></td></tr>
                                <tr><td style="font-weight:bolder;" align="center"><%=nomN2%></td></tr>
                                <tr><td>&nbsp;</td></tr>
                               <tr><td>&nbsp;</td></tr> 
                          </table>
                        
                      </td>
                      <td width="20%">
                          <table width="100%" height="100%" border="0">
                                <tr>
                                    <td style="font-weight:bolder;" align="center" width="40%" colspan="2" nowrap><font size=3>ESTADO DE CUENTA ACUMULADO</font></td>
                                </tr>
                                <tr>
                                    <td style="font-weight:bolder;" align="center" width="40%" colspan="2" nowrap><font size=3>&nbsp;</font></td>
                                </tr>
                                <tr>
                                    <td style="font-weight:bolder;"><font size=3>Contrato:</font></td>
                                    <td align="right"><font size=3><%=numFideicomiso%></font></td>
                                </tr>
                                <tr>
                                    <td style="font-weight:bolder;"><font size=3>Subcuenta:</font></td>
                                    <td align="right"><font size=3><%=numN2%></font></td>
                                </tr>
                                <tr>
                                    <td style="font-weight:bolder;"><font size=3>Periodo:</font></td>
                                    <td align="center"><font size=3><%=fecFinal1%></font></td>
                                </tr>
                                <tr>
                                    <td style="font-weight:bolder;"><font size=3>Moneda:</font></td>
                                    <td><font size=3>Nacional</font></td>
                                </tr>   
                          </table>
                        
                      </td>
                 </tr>
         </table>
      </td>
    </tr>
    <tr><td><hr style="height:3px;border-width:0;color:gray;background-color:gray"></td></tr>
    <tr>
        <td>
            <table border="0" cellspacing="0" cellpadding="0" width="100%" height="127px">
                  <tr>
                      <td>
                          <table width="100%" height="100%" border="0">
                                <tr>
                                    <td style="font-weight:bolder;" width="50%"><font size=3>Ejecutivo:</font></td>
                                    <td style="font-weight:bolder;" width="50%"><font size=3>&nbsp;</font></td>
                                </tr>
                                <tr>
                                    <td style="font-weight:bolder;" width="50%"><font size=3>&nbsp;</font></td>
                                    <td style="font-weight:bolder;" width="50%"><font size=3>&nbsp;</font></td>
                                </tr>
                                <tr>
                                    <td style="font-weight:bolder;" width="50%"><font size=3>F.A.Plan:</font></td>
                                    <td style="font-weight:bolder;" width="50%"><font size=3><%=sFechaDA%></font></td>
                                </tr>
                                <tr>
                                    <td style="font-weight:bolder;" width="50%"><font size=3>Depto:</font></td>
                                    <td style="font-weight:bolder;" width="50%"><font size=3>&nbsp;</font></td>
                                </tr>
                                <tr>
                                    <td style="font-weight:bolder;" width="50%"><font size=3>F.Ingreso:</font></td>
                                    <td style="font-weight:bolder;" width="50%"><font size=3><%=sFechaIngreso%></font></td>
                                </tr>
                                <tr>
                                    <td style="font-weight:bolder;" width="50%"><font size=3>F.Baja:</font></td>
                                    <td style="font-weight:bolder;" width="50%"><font size=3><%=sFechaBaja%></font></td>
                                </tr>
                                <tr>
                                    <td style="font-weight:bolder;" width="50%"><font size=3>&nbsp;</font></td>
                                    <td style="font-weight:bolder;" width="50%"><font size=3>Derechos Adquiridos:</font></td>
                                </tr>
                          </table>
                      </td>
                      <td>
                          <table width="100%" height="100%" border="0">
                                <tr>
                                    <td style="font-weight:bolder;" width="25%"><font size=3>&nbsp;</font></td>
                                    <td style="font-weight:bolder;" width="25%" align="right"><font size=3>Trabajador</font></td>
                                    <td style="font-weight:bolder;" width="25%" align="right"><font size=3>H. Ayto.</font></td>
                                    <td style="font-weight:bolder;" width="25%" align="right"><font size=3>Total</font></td>
                                </tr>
                                <%
                                    for(int index = 0; index < nConsultas.getSize(); index++) {
                                        nConsultas.setIndex(index);                                
                                %>
                                <tr>
                                    <td style="font-weight:bolder;" nowrap>
                                        <font size=3>
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
                                        </font>
                                    </td>
                                    <td align="right"><font size=3><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", nConsultas.getVtrDoubleDato1())%></font></td>
                                    <td align="right"><font size=3><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", nConsultas.getVtrDoubleDato2())%></font></td>
                                    <td align="right"><font size=3><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", nConsultas.getVtrDoubleDato3())%></font></td>
                                </tr>
                                <%
                                    }
                                %>
                          </table>
                      </td>
                 </tr>
            </table>
        </td>
    </tr>
    <tr><td><hr style="height:3px;border-width:0;color:gray;background-color:gray"></td></tr>
    <tr>
        <td>
            <table border="0" cellspacing="0" cellpadding="0" width="100%">
                  <tr>
                      <td>
                          <table width="100%" border="0">
                                <tr><td colspan="5" style="font-weight:bolder;" align="center" width="25%"><font size=3>Detalle de Operaciones</font></td></tr>
                                <tr>
                                    <td style="font-weight:bolder;" width="15%" align="center"><font size=3>Fecha de Movimiento</font></td>
                                    <td style="font-weight:bolder;" width="30%"><font size=3>Descripci&oacute;n</font></td>
                                    <td style="font-weight:bolder;" width="15%" align="right"><font size=3>Dep&oacute;sitos</font></td>
                                    <td style="font-weight:bolder;" width="15%" align="right"><font size=3>Retiros</font></td>
                                    <td style="font-weight:bolder;" width="15%" align="right"><font size=3>Saldo</font></td>
                                </tr>
                                <tr><td colspan="5"><hr style="height:3px;border-width:0;color:gray;background-color:gray"></td></tr>
                                <tr>
                                    <td><font size=3>&nbsp;</font></td>
                                    <td><font size=3>Saldo Anterior</font></td>
                                    <td><font size=3>&nbsp;</font></td>
                                    <td><font size=3>&nbsp;</font></td>
                                    <td align="right"><font size=3><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", saldoAnt)%></font></td>
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
                                    <td align="center"><font size=3><%=DateTimeUtils.formatDateTimeFromPattern("dd/MM/yyyy", DateTimeUtils.parseDateTimeFromPattern("dd/MM/yy", fecha))%></font></td>
                                    <td><font size=3><%=nomInvers%></font></td>
                                    <td align="right"><font size=3><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", depositos)%></font></td>
                                    <td align="right"><font size=3><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", retiros)%></font></td>
                                    <td align="right"><font size=3><%=DecimalFormatUtils.getFormatedNumber("###,##0.00", saldoParcial)%></font></td>
                                  </tr>
                                <%
                                }
                                %>
                          </table>
                      </td>
                 </tr>
            </table>
        </td>
    </tr>
  </table>
  
  </body>
</html>