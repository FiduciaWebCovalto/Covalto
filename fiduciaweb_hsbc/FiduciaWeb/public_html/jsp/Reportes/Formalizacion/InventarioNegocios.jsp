<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.math.BigDecimal, java.util.Date, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils, mx.com.inscitech.fiducia.common.util.DateTimeUtils"%>
<%
java.util.List consulta = (java.util.List)request.getAttribute("consulta");
%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
    <title>INVENTARIO DE NEGOCIOS</title>
  </head>
  <body>
  
  <%
    //Variable para obtener tupla por tupla
    java.util.Map registro = null;
    
    //Variables que contendrán los elementos de cada tupla
    String nomActividad = "";
    BigDecimal numContrato = new BigDecimal(0);
    //BigDecimal numProducto = new BigDecimal(0);
	
	String numProducto = "";
    String nomContrato = "";
    String regNalInvEx = "";
    String fechaApertura = "";
	String nivelRiesgoFiso = "";
        String puntFiso ="";
        String puntPersona="";
	String tipoPersona = "";
	String numPersona = "";
	String nombrePersona = "";
	String rfcPersona = "";
	String fechaAperturaPersona = "";	
	String nivelRiesgoPersonal = "";	
	String Bloqueo="";
	
	String sujeto="";
	String listas="";
	String medio="";
	String antecedentes="";
	String origen="";
	String status="";
    BigDecimal patrimonio = new BigDecimal(0);
	int nContActividad=0;
    
    //Variables auxiliares para llevara  cabo los cortes
    String NomActividad = "";
    
    //Variables auxiliares para la lógica e impresión
    boolean primerActividad = true;
	int iContratoAnt =0 ;
    BigDecimal subNumActividades = new BigDecimal(0);
    BigDecimal subPatrimonio = new BigDecimal(0);
    BigDecimal totNumActividades = new BigDecimal(0);
    BigDecimal totPatrimonio = new BigDecimal(0);
  %>
  
  <table border="0" cellspacing="0" cellpadding="0" style="font-family: Arial;font-size: 10px;">
              <tr>
                <td rowspan="5"   align="center"><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg"  height="100"></td>
                <td colspan="5" align="right">&nbsp;<font style="font-family: Arial;font-size: 7px;"> &nbsp;</font></td>
              </tr>
              <tr><th colspan="5"><%=session.getAttribute("empresa_1")%></th></tr>
              <tr><th colspan="5"><%=session.getAttribute("empresa_2")%></th></tr>
              <tr><th colspan="5">REPORTE GENERAL PLD</th></tr>
              <tr>         
              <td width="70">&nbsp;</td>
              <td width="220">&nbsp;</td>
              <td width="290">&nbsp;</td>
              <td width="105">&nbsp;</td>
              <td width="105">&nbsp;</td>
              <td width="110" align="right" style="font-size: 12px;">&nbsp;</td>
              </tr> 
  <tr><td colspan="5">&nbsp;</td></tr>
    <tr>
      <td width="150" style="font-weight:bolder" align="left">FIDEICOMISO</td>
      <td width="150" style="font-weight:bolder" align="left">FECHA DE CONSTITUCIÓN FISO</td>
	  <td width="150" style="font-weight:bolder" align="left">NIVEL RIESGO FISO</td>
          <td width="150" style="font-weight:bolder" align="left">PUNT. FISO</td>
	  <td width="150" style="font-weight:bolder" align="left">TIPO PERSONA</td>
	  <td width="150" style="font-weight:bolder" align="left">NOMBRE PERSONA</td>
	  <td width="150" style="font-weight:bolder" align="left">RFC PERSONA</td>
	  <td width="150" style="font-weight:bolder" align="left">FECHA DE CONST/NAC PERSONA</td>
          <td width="150" style="font-weight:bolder" align="left">NIVEL RIESGO</td> 
          <td width="150" style="font-weight:bolder" align="left">PUNT. PERSONA</td>
	  <td width="150" style="font-weight:bolder" align="left">TIPO SUJETO</td>
	  <td width="150" style="font-weight:bolder" align="left">LISTAS</td>
	  <td width="150" style="font-weight:bolder" align="left">PRODUCTO FID.</td>
	  <td width="150" style="font-weight:bolder" align="left">LISTA PERSONA BLOQUEADA</td>
	  <td width="150" style="font-weight:bolder" align="left">STATUS</td>
    </tr>
    <tr><td colspan="5"><hr/></td></tr>
  <%  
    for(int i = 0; i < consulta.size(); i++) {  //Para cada registro
      registro = (java.util.Map)consulta.get(i);
      //Obtener datos de la BD
      nomActividad = (String)registro.get("repNomActividad");
      numContrato = (BigDecimal)registro.get("ctoNumContrato");
      //numProducto = (BigDecimal)registro.get("prlNumProducto");
	  numProducto = (String)registro.get("prlNumProducto");
      nomContrato = (String)registro.get("repNomContrato");
      regNalInvEx = (String)registro.get("repRegNalInvEx");
      fechaApertura = (String)registro.get("fechaApertura");
      patrimonio = (BigDecimal)registro.get("patrimonio");
	  iContratoAnt 	=numContrato.intValue();
		nivelRiesgoFiso = (String)registro.get("repNivelRiesgoFiso");
		tipoPersona = (String)registro.get("repTipoPersona");
		numPersona= (String)registro.get("repNumPersona");
		nombrePersona = (String)registro.get("repNombrePersona");
		rfcPersona = (String)registro.get("repRfcPersona");
		fechaAperturaPersona = (String)registro.get("repFecAltaPersona");	
		nivelRiesgoPersonal = (String)registro.get("repNivelRiesgoPersona");
		status	= (String)registro.get("status");
		
                puntFiso = (String)registro.get("puntfiso");
                puntPersona = (String)registro.get("puntpersona");
                
		sujeto = (String)registro.get("repTipoSujeto");
		listas = (String)registro.get("repListas");
		medio = (String)registro.get("repMedioPago");
		antecedentes = (String)registro.get("repAntecedentes");
		
		Bloqueo= (String)registro.get("repBloqueo");

      
      if(!nomActividad.equals(NomActividad)) { //Primer corte: REP_NOM_ACTIVIDAD
        i--;
        NomActividad = nomActividad;
        
        if(!primerActividad)
        {
					  System.out.println("iContratoAnt "+String.valueOf(iContratoAnt));
			
          totNumActividades = new BigDecimal(totNumActividades.intValue()+subNumActividades.intValue());
          totPatrimonio = new BigDecimal(totPatrimonio.doubleValue()+subPatrimonio.doubleValue());
          nContActividad=0;
          subNumActividades = new BigDecimal(0);
          subPatrimonio = new BigDecimal(0);
        }
        else
          primerActividad = false;

      } //Fin de Primer Corte
      else
      {
        //Hacer la suma de los sub-totales
		  if(numContrato.intValue()!=iContratoAnt)	{
			subNumActividades = new BigDecimal(subNumActividades.intValue()+1);
			subPatrimonio = new BigDecimal(subPatrimonio.doubleValue()+patrimonio.doubleValue());
		  }
		  else{
			  iContratoAnt=numContrato.intValue();
		  }		
		  System.out.println("else iContratoAnt "+String.valueOf(iContratoAnt));
		  nContActividad+=1;
  %>
  
        <tr>
		
		  <td width="150" style="font-weight:bolder" align="left"><%=numContrato%>-<%=nomContrato%></td>
		  <td width="150" style="font-weight:bolder" align="left"><%=(fechaApertura==null)?"&nbsp;":fechaApertura.toString()%></td>
		  <td width="150" style="font-weight:bolder" align="left"><%=(nivelRiesgoFiso==null)?"&nbsp;":nivelRiesgoFiso.toString()%></td>
                  <td width="150" style="font-weight:bolder" align="left"><%=(puntFiso==null)?"&nbsp;":puntFiso.toString()%></td>
		  <td width="150" style="font-weight:bolder" align="left"><%=(tipoPersona==null)?"&nbsp;":tipoPersona.toString()%></td>
		  <td width="150" style="font-weight:bolder" align="left"><%=(nombrePersona==null)?"&nbsp;":nombrePersona.toString()%></td>
		  <td width="150" style="font-weight:bolder" align="left"><%=(rfcPersona==null)?"&nbsp;":rfcPersona.toString()%></td>
		  <td width="150" style="font-weight:bolder" align="left"><%=(fechaAperturaPersona==null)?"&nbsp;":fechaAperturaPersona.toString()%></td>
		  <td width="150" style="font-weight:bolder" align="left"><%=(nivelRiesgoPersonal==null)?"&nbsp;":nivelRiesgoPersonal.toString()%></td>
                  <td width="150" style="font-weight:bolder" align="left"><%=(puntPersona==null)?"&nbsp;":puntPersona.toString()%></td>
		  <td width="150" style="font-weight:bolder" align="left"><%=(sujeto==null)?"&nbsp;":sujeto.toString()%></td>
		  <td width="150" style="font-weight:bolder" align="left"><%=(listas==null)?"&nbsp;":listas.toString()%></td>
		  <td width="150" style="font-weight:bolder" align="left"><%=(numProducto==null)?"&nbsp;":numProducto.toString()%></td>
		  
		  <td width="150" style="font-weight:bolder" align="left"><%=(Bloqueo==null)?"&nbsp;":Bloqueo.toString()%></td>
		  <td width="150" style="font-weight:bolder" align="left"><%=(status==null)?"&nbsp;":status.toString()%></td>
		  
        </tr>
  <%
      }
      
      //Si se trata del último resgistro, presentar la información de las sumatorias de los cortes (TOTAL)
      if(i==(consulta.size()-1))
      {
        totNumActividades = new BigDecimal(totNumActividades.intValue()+subNumActividades.intValue());
        totPatrimonio = new BigDecimal(totPatrimonio.doubleValue()+subPatrimonio.doubleValue());
      }
    } //Fin de las iteraciones para los registros
  %>
  </table>
  
  </body>
</html>