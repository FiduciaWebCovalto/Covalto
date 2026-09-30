<!--
/*
  @Autor:Inscitech
  @Creado: Febrero 2019
*/
-->

<%@ page import="java.text.*,java.util.*,java.lang.*,java.io.*,java.sql.*"%>
<jsp:useBean id="balance" class="mx.com.inscitech.fiducia.business.nReporte"/>
<jsp:useBean id="cuentas" class="mx.com.inscitech.fiducia.business.BalanceFormulas"/>
<jsp:useBean id="BD"  class="mx.com.inscitech.fiducia.business.FiduciaBD"/>
<jsp:useBean id="repEdoFinan"  class="mx.com.inscitech.fiducia.business.FiduciaBD"/>
<jsp:useBean id="datEdoFinan" class="mx.com.inscitech.fiducia.business.nReporte"/>
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<%

DecimalFormat decFormat = new DecimalFormat("###,###,###,###,###,###,###,##0.00");
String[] bitacora = new String[5];
String fechaCont=BD.getFecha();
String folioBit="";
int regBitacora=0;
String tipoAdmin="";

%>
<%
 
    java.util.List consulta = (java.util.List)request.getAttribute("consulta");
    //Variable para obtener tupla por tupla
    java.util.Map registro = null;
    
    //Variables que contendr�n los elementos de cada tupla
    BigDecimal numfideico = new BigDecimal(0);

    //int numfideico=0;
    String tipo="";
    String fechaconst="";
    String fiduciario="";
    String fideicomitente="";
    String fideicomisario_pl=""; 
    String fideicomisario_sl=""; 
    String fideicomisarios=""; 
    String garante=""; 
    String admin_maestro=""; 
    String gpo=""; 
    String per_cobr="";
    String cta_gen_fideicom=""; 
    String cta_serv_gar=""; 
    String fondo_res=""; 
    String fondo_rem=""; 
    String fecha_dist="";
    String fecha_pago="";
    String clausula_dec=""; 
    String clausula_dec_prim=""; 
    String fines_fideico=""; 
    String reportes_fidu=""; 
    String patri_fideico=""; 
    String evento_incum=""; 
    String contratos=""; 
    String inver_permi="";
    String firmas_aut_fov="";
    String pers_aut_conf_fov=""; 
    String hono_fiducia="";
    String admin_fiducia="";
    String conveni_morat=""; 
    String otorga_pod="";
    String contactos=""; 
    String contac_fideicom=""; 
    String contac_garante="";
    String contratos_inver="";
    String cuentas_cheq="";
    String otrosCasos="";
    int contador=0;
    
    ArrayList<String> nomcol= new ArrayList<String>();
    ArrayList<String> nomcolF= new ArrayList<String>();
        //Anadir encabezados de columnas
    ArrayList<String> valcol= new ArrayList<String>();
    ArrayList<String> valcolF= new ArrayList<String>();

//se valida si hay informacion en la tabla
  if(consulta.size()>0)
  {
    registro = (java.util.Map)consulta.get(0);

     /*VALORES FIJOS*/
     numfideico=(BigDecimal)registro.get("frofNumFideicom");
     tipo=(String)registro.get("frofTipo");
     fechaconst=(String)registro.get("frofFechaConstitucion");
     fiduciario=(String)registro.get("frofFiduciario");
     fideicomitente=(String)registro.get("frofFideicomitente");
     fideicomisario_pl=(String)registro.get("frofFideicomisarioPl"); 
     fideicomisario_sl=(String)registro.get("frofFideicomisarioSl");
     fines_fideico=(String)registro.get("frofFinesFideico");
     patri_fideico=(String)registro.get("frofPatriFideico");
     /*COLUMNAS VARIABLES*/
     fideicomisarios=(String)registro.get("frofFideicomisarios");
     if(fideicomisarios!=null){
        nomcolF.add("Fideicomisarios");
        valcolF.add(fideicomisarios);
     }
     garante=(String)registro.get("frofGarante");
     if(garante!=null){
        nomcolF.add("Garante");
        valcolF.add(garante);
     }
     admin_maestro=(String)registro.get("frofAdminMaestro"); 
     if(admin_maestro!=null){
        nomcolF.add("Administrador Maestro");
        valcolF.add(fideicomisarios);
     }
     gpo=(String)registro.get("frofGpo");
     if(gpo!=null){
        nomcolF.add("GPO");
        valcolF.add(gpo);
     }     
     per_cobr=(String)registro.get("frofPerCobr");
     if(per_cobr!=null){
        nomcolF.add("Periodo de Cobranza");
        valcolF.add(per_cobr);
     }
     cta_gen_fideicom=(String)registro.get("frofCtagenFideicom");
     if(cta_gen_fideicom!=null){
        nomcol.add("Cuenta General del Fideicomiso");
        valcol.add(cta_gen_fideicom);
     }
     cta_serv_gar=(String)registro.get("frofCtaServGar");
     if(cta_serv_gar!=null){
        nomcol.add("Cuenta del Servicio de la Garantia de Pago Oportuno");
        valcol.add(cta_serv_gar);
     }
     fondo_res=(String)registro.get("frofFondoRes");
     if(fondo_res!=null){
        nomcol.add("Fondo de Reserva");
        valcol.add(fondo_res);
     }
     fondo_rem=(String)registro.get("frofFondoRem");
     if(fondo_rem!=null){
        nomcol.add("Fondo de Remanentes");
        valcol.add(fondo_rem);
     }
     fecha_dist=(String)registro.get("frofFechaDist");
     if(fecha_dist!=null){
        nomcol.add("Fecha de Distribucion");
        valcol.add(fecha_dist);
     }
     fecha_pago=(String)registro.get("frofFechaPago");
     if(fecha_pago!=null){
        nomcol.add("Fecha de Pago");
        valcol.add(fecha_pago);
     }
     clausula_dec=(String)registro.get("frofClausulaDec");
     if(clausula_dec!=null){
        nomcol.add("Clausula D&eacute;cima");
        valcol.add(clausula_dec);
     }
     clausula_dec_prim=(String)registro.get("frofClausulaDecPrim");
     if(clausula_dec_prim!=null){
        nomcol.add("Clausula D&eacute;cima Primera");
        valcol.add(clausula_dec_prim);
     }
     reportes_fidu=(String)registro.get("frofReportesFidu"); 
     if(reportes_fidu!=null){
        nomcol.add("Repordes de Fiduciario");
        valcol.add(reportes_fidu);
     }
     evento_incum=(String)registro.get("frofEventoIncum"); 
     if(evento_incum!=null){
        nomcol.add("Evento de incumplimiento");
        valcol.add(evento_incum);
     }
     contratos=(String)registro.get("frofContratos"); 
     if(contratos!=null){
        nomcol.add("Contratos");
        valcol.add(contratos);
     }
     inver_permi=(String)registro.get("frofInverPermi");
     if(inver_permi!=null){
        nomcol.add("Inversiones Permitidas");
        valcol.add(inver_permi);
     }
     firmas_aut_fov=(String)registro.get("frofFirmasAutFov");
     if(firmas_aut_fov!=null){
        nomcol.add("Firmas Autorizadas FOVISSTE");
        valcol.add(firmas_aut_fov);
     }
     pers_aut_conf_fov=(String)registro.get("frofPersAutConfFov");
     if(pers_aut_conf_fov!=null){
        nomcol.add("Personas Autorizadas para Confirmar Instrucciones FOVISSTE");
        valcol.add(pers_aut_conf_fov);
     }
     hono_fiducia=(String)registro.get("frofHonoFiducia");
     if(hono_fiducia!=null){
        nomcol.add("Honorarios del Fiduciario");
        valcol.add(hono_fiducia);
     }
     admin_fiducia=(String)registro.get("frofAdminFiducia");
     if(admin_fiducia!=null){
        nomcol.add("Administracion Fiduciaria");
        valcol.add(admin_fiducia);
     }
     conveni_morat=(String)registro.get("frofConveniMorat"); 
     if(conveni_morat!=null){
        nomcol.add("Convenios Moratorios");
        valcol.add(conveni_morat);
     }
     otorga_pod=(String)registro.get("frofOtorgaPod");
     if(otorga_pod!=null){
        nomcol.add("Otorgamiento de Poderes");
        valcol.add(otorga_pod);
     }
     contactos=(String)registro.get("frofContactos"); 
     if(contactos!=null){
        nomcol.add("Contactos(Fideicomitente, Fidiecomisaros, Rep. Comun)");
        valcol.add(contactos);
     }
     contac_fideicom=(String)registro.get("frofContacFideicom");
     if(contac_fideicom!=null){
        nomcol.add("Fideicomitente");
        valcol.add(contac_fideicom);
     }
     contac_garante=(String)registro.get("frofContacGarante");
     if(contac_garante!=null){
        nomcol.add("Garante");
        valcol.add(contac_garante);
     }
     contratos_inver=(String)registro.get("frofContinver");
     if(contratos_inver!=null){
        nomcol.add("Contratos de Inversion");
        valcol.add(contratos_inver);
     }
     cuentas_cheq=(String)registro.get("frofCuencheq");
     if(cuentas_cheq!=null){
        nomcol.add("Cuentas de Cheques");
        valcol.add(cuentas_cheq);
     }
     otrosCasos=(String)registro.get("frofOtros");
     if(otrosCasos!=null){
        nomcol.add("Otros");
        valcol.add(otrosCasos);
     }
     //System.out.println("REGISTRO COMPLETO="+registro);
     
     //String[] continver = contratos_inver.split(","); 
     //String[] cucheq = cuentas_cheq.split(",");
 }
%>

<html>
    <head>
        <title>FICHA TECNICA ADMINISTRATIVA</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    </head>
    <body <%=request.getParameter("bImprimir")!=null && request.getParameter("bImprimir").trim().equals("1") && balance.hasData()==true ?"onLoad=\"window.print();window.close();\"":" "%>  oncontextmenu="return false" onkeydown="return false"   onmousemove ="return false" onselectstart ="return false" onclick="return false">    
    
        <table border='0' bordercolor='#000000' bgcolor='#FFFFFF'>
        
                        <tr>
                        <td rowspan="5"   align="center"><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg"  height="40"></td>
                        <td colspan="5" align="CENTER"  style="font-family: Arial; font-size: 16px;color: #000000;font-weight: bold;">FICHA TECNICA ADMINISTRATIVA</td>
                      </tr>
                        <tr>		
                        <td>
                                <table width='860'>
                                        <tr>
                                                <td align="CENTER"  style="font-family: Arial;	font-size: 16px;color: #000000;font-weight: bold;">Contrato de Fideicomiso Irrevocable de <%=tipo%> <%=String.valueOf(numfideico)%></td>
                                        </tr>
                                        <!--<tr>
                                                <td><div align='center' style="font-family: Verdana, Arial, Helvetica;	font-size: 12px;color: #000000;font-weight: bold;">Ligado al Fideicomiso FRO_NUM_FIDEICOM como Fideicomiso Emisor</div></td>
                                        </tr>-->
                                        <tr>
                                                <td><div align='center' style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">Caracter&iacute;sticas y Definiciones</div></td>
                                        </tr>
                                        <tr><td height='23'>&nbsp;</td></tr>
                                </table>
                        </td>
                </tr>
        </table>	
        
        <table width="960"  border="0" align="left">
              <tr ><td colspan="10" align='left'  style="font-family: Arial; font-size: 14px;color: #000000;font-weight: bold;">&nbsp;</td></tr>
              <tr>
                  <td align="left" width="100" style="font-family: Arial; font-size: 12px;"><b>Fecha de Constituci&oacute;n</b></td>
                  <td align="left" width="300" style="font-family: Arial; font-size: 12px;"><%=fechaconst!=null?fechaconst:""%></td>
              </tr>
              <tr>
                  <td align="left" style="font-family: Arial; font-size: 12px;"><b>Fiduciario</b></td>
             </tr>
              <tr>
                  <td align="left" width="100" style="font-family: Arial; font-size: 12px;"><b>Fideicomitente</b></td>
                  <td align="left" width="300" style="font-family: Arial; font-size: 12px;"><%=fideicomitente!=null?fideicomitente:""%></td>
              </tr>
              <tr>
                  <td align="left" width="100" style="font-family: Arial; font-size: 12px;"><b>Fideicomisario en Primer Lugar</b></td>
                  <td align="left" width="300" style="font-family: Arial; font-size: 12px;"><%=fideicomisario_pl!=null?fideicomisario_pl:""%></td>
              </tr>
              <tr>
                  <td align="left"  width="100" style="font-family: Arial; font-size: 12px;"><b>Fideicomisario en Segundo Lugar</b></td>
                  <td align="left" width="300" style="font-family: Arial; font-size: 12px;"><%=fideicomisario_sl!=null?fideicomisario_sl:""%></td>
              </tr>
              <!--Variables dinamicas 0 a 4-->
              <% 
                for(int i=0;i<nomcolF.size();i++)
                {%>
                <tr>
                  <td align="left" width="100" style="font-family: Arial; font-size: 12px;"><b><%=nomcolF.get(i)%></b></td>
                  <td align="left" width="300" style="font-family: Arial; font-size: 12px;"><p><%=valcolF.get(i)%></p></td>
                </tr>
                <%}%>
              <!-- <tr>
                  <td align="left" width="100" style="font-family: Arial; font-size: 12px;"><b>Garante</b></td>
                  <td align="left" width="300" style="font-family: Arial; font-size: 12px;"><%=garante!=null?garante:""%></td>
              </tr>
              <tr>
                  <td align="left" width="100" style="font-family: Arial; font-size: 12px;"><b>Administrador Maestro</b></td>
                  <td align="left" width="300" style="font-family: Arial; font-size: 12px;"><%=admin_maestro!=null?admin_maestro:""%></td>
              </tr>
              
              <tr>
                  <td align="left"  style="font-family: Arial; font-size: 12px;"><b>GPO</b></td>
                  <td align="left" width="300" style="font-family: Arial; font-size: 12px;"><%=gpo!=null?gpo:""%></td>
              </tr>
              <tr>
                  <td align="left" style="font-family: Arial; font-size: 12px;"><b>Periodo de Cobranza</b></td>
                  <td align="left" width="300" style="font-family: Arial; font-size: 12px;"><p><%=per_cobr!=null?per_cobr:""%></p></td>
              </tr> -->
        
            <tr ><td colspan="10" align='left'  style="font-family: Arial; font-size: 14px;color: #000000;font-weight: bold;">&nbsp;</td></tr>
            <!--VARIABLES DINAMICAS-->
            <% 
                for(int i=0;i<nomcol.size();i++)
                {%>
                <tr>
                    <td align="left" width="100"><h5><%=nomcol.get(i)%></h5>
                    <p><%=valcol.get(i)%></p></td>
                </tr >
                <tr ><td><p>&nbsp;</p></td></tr >
                <%}%>
           
            
            <!-- <tr>
                <td align="left" width="100%"><h5>Cuenta del Servicio de la Garantia de Pago Oportuno</h5>
                <%=cta_serv_gar!=null?cta_serv_gar:""%></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Fondo de Reserva</h5>
                <p><%=fondo_res!=null?fondo_res:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Fondo de Remanentes</h5>
                <p><%=fondo_rem!=null?fondo_rem:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Fecha de Distribucion</h5>
                <p><%=fecha_dist!=null?fecha_dist:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Fecha de Pago</h5>
                <p><%=fecha_pago!=null?fecha_pago:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Clausula D&eacute;cima</h5>
                <p><%=clausula_dec!=null?clausula_dec:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Clausula D&eacute;cima Primera</h5>
                <p><%=clausula_dec_prim!=null?clausula_dec_prim:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Fines del Fideicomiso</h5>
                <p><%=fines_fideico!=null?fines_fideico:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Reportes de Fiduciario</h5>
                <p><%=reportes_fidu!=null?reportes_fidu:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Patrimonio del Fideicomiso</h5>
                <p><%=patri_fideico!=null?patri_fideico:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Evento de Incumplimiento</h5>
                <p><%=evento_incum!=null?evento_incum:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Contratos</h5>
                <p><%=contratos!=null?contratos:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Inversiones Permitidas</h5>
                <p><%=inver_permi!=null?inver_permi:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Firmas Autorizadas FOVISSTE</h5>
                <p><%=firmas_aut_fov!=null?firmas_aut_fov:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Personas Autorizadas para Confirmar Instrucciones FOVISSTE</h5>
                <p><%=pers_aut_conf_fov!=null?pers_aut_conf_fov:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Honorarios del Fiduciario</h5>
                <p><%=hono_fiducia!=null?hono_fiducia:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                
                <td colspan="2"><h5>Administracion Fiduciaria</h5></td>
                <td colspan="8"><%=admin_fiducia!=null?admin_fiducia:""%></td>
            </tr>
            <tr>
                <td colspan="2"><h5>Convenios Moratorios</h5></td>
                <td colspan="8"><%=conveni_morat!=null?conveni_morat:""%></td>
            </tr>
            <tr>
                <td colspan="2"><h5>Otorgamiento de Poderes</h5></td>
                <td colspan="8"><%=otorga_pod!=null?otorga_pod:""%></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Contactos (Fideicomitente, Fideicomisarios, Rep. Comun)</h5>
                <p><%=contactos!=null?contactos:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td colspan="2"><h5>Fideicomitente</h5></td>
                <td colspan="8"><%=contac_fideicom!=null?contac_fideicom:""%></td>
            </tr>
            <tr>
                <td colspan="2"><h5>Garante</h5></td>
                <td colspan="8"><%=contac_garante!=null?contac_garante:""%></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Contratos de Inversion</h5>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td colspan="8"><%=contratos_inver!=null?contratos_inver:""%></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Cuentas de Cheques</h5>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td colspan="8"><%=cuentas_cheq!=null?cuentas_cheq:""%></td>
            </tr>
            
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100%"><h5>Otros</h5>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td colspan="8"><%=otrosCasos!=null?otrosCasos:""%></td>
            </tr>
            
            <tr ><td><p>&nbsp;</p></td></tr > -->
            <tr ><td><p>&nbsp;</p></td></tr >
        </table>
    </body>
</html>