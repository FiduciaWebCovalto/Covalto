

<%@ page import="java.text.*,java.util.*,java.lang.*,java.io.*,java.sql.*"%>

<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<%

DecimalFormat decFormat = new DecimalFormat("###,###,###,###,###,###,###,##0.00");
java.util.List consulta = (java.util.List)request.getAttribute("consulta");
java.util.Map registro = null;
int ndatos=consulta.size();
int ncambio=0,nrenglones=0;
String nombre = "";
String chk = "",riesgocontrato="",riesgocliente="";
BigDecimal contrato = new BigDecimal(0);
BigDecimal cliente = new BigDecimal(0);
BigDecimal persona = new BigDecimal(0);
BigDecimal orden = new BigDecimal(0);
BigDecimal ordenind = new BigDecimal(0);
BigDecimal puntuacion = new BigDecimal(0);
BigDecimal totalcliente = new BigDecimal(0);
BigDecimal totalcontrato = new BigDecimal(0);
registro = (java.util.Map)consulta.get(0); 
ncambio=0;
//se determinan los renglones para el arreglo
    for(int i = 0; i < consulta.size(); i++) 
    {  //Para cada registro
      registro = (java.util.Map)consulta.get(i); 
      persona = (BigDecimal)registro.get("persona");          
        if (ncambio!=persona.intValue()){
            ncambio=persona.intValue(); 
            nrenglones++;
        }
    }   
    System.out.println("nrenglones:"+String.valueOf(nrenglones));
String [][]datos = new String[nrenglones][18];
ncambio=0;
int indicearr=0;
//se almacena la informacion en el arreglo de datos
    for(int i = 0; i < consulta.size();i++) 
    {  //Para cada registro
        System.out.println("Valor i:"+String.valueOf(i));
        registro = (java.util.Map)consulta.get(i); 
        contrato = (BigDecimal)registro.get("contrato"); 
		persona= (BigDecimal)registro.get("persona"); 
        cliente = (BigDecimal)registro.get("cliente"); 
        nombre = (String)registro.get("nombre"); 
        if((String)registro.get("riesgocontrato")!="SINVALOR"){
            riesgocontrato = (String)registro.get("riesgocontrato"); 
            totalcontrato=(BigDecimal)registro.get("total"); 
        }    
        System.out.println("ncambio"+String.valueOf(ncambio));
        System.out.println("contrato"+String.valueOf(contrato));
		System.out.println("persona"+String.valueOf(persona));
        System.out.println("Valor indicearr:"+String.valueOf(indicearr));
        if (ncambio!=persona.intValue()){        
            int reng=i;            
            ncambio=persona.intValue();
            datos[indicearr][0]= String.valueOf(contrato);        
			datos[indicearr][16]= String.valueOf(persona);        
			datos[indicearr][17]= riesgocontrato+"-"+String.valueOf(totalcontrato);
            datos[indicearr][1]= String.valueOf(cliente);         
            datos[indicearr][2]= nombre;                     
            datos[indicearr][12]= riesgocontrato;
            datos[indicearr][14]= String.valueOf(totalcontrato) ;
            
            //se recorren las columnas
            for(int j = 3; j < 11; j++){ 
                if((String)registro.get("riesgocliente")!="SINVALOR"){    
                    riesgocliente = (String)registro.get("riesgocliente");  
                    totalcliente=(BigDecimal)registro.get("total"); 
                    datos[indicearr][13]= riesgocliente;
                    datos[indicearr][15]= String.valueOf(totalcliente);
                }                        
                registro = (java.util.Map)consulta.get(reng);
                datos[indicearr][j]= (String)registro.get("chk");
                System.out.println("nrenglones:"+datos[indicearr][j]);
                System.out.println("Valor j:"+String.valueOf(j));
                System.out.println("Valor i datos:"+String.valueOf(i));
                System.out.println("Valor indicearr:"+String.valueOf(indicearr));
                System.out.println("Valor reng:"+String.valueOf(reng));
                reng++;
            }
            reng--;
            System.out.println("Valor reng des for:"+String.valueOf(reng));
            indicearr++;
            i=reng;            
        }
    }      
%>

<!doctype html>
<html lang="es-MX">
<head>
<title>MATRIZ DE RIESGO</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Enable IE9 Standards mode -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">

</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>        


<table class="table table-responsive table-hover">
      <thead>
        <tr>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">MATRIZ RIESGO</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>       
          <th scope="col"><img height="120px" src="<%=request.getContextPath()%>/imagenes/header.jpg"></th>
          <th scope="col">&nbsp;</th>
          <th scope="col">&nbsp;</th>      
          <th scope="col">&nbsp;</th>  
        </tr>
      </thead>
</table>      	

<table  class="table table-responsive table-hover">

      <thead class="table-primary">
        <tr class="table-primary">
          <th scope="col">Fideicomiso</th>
          <th scope="col">Nombre Persona</th>
          <th scope="col">Riesgo Persona</th>
          <th scope="col">PPE</th>
          <th scope="col">Pais</th>
          <th scope="col">Origen Recursos</th>
          <th scope="col">Fecha Nac/Const</th>
          <th scope="col">Entidad Federativa</th>       
          <th scope="col">Destino Recursos</th>
          <th scope="col">Ciudad/Poblacion</th>
          <th scope="col">Actividad</th>              
        </tr>
      </thead>
      <tbody>
    
          <%
           for(int i = 0; i < nrenglones; i++) 
            {  //Para cada registro
                %>
                <tr class="table-info fs-8">  
                    <td><%=datos[i][1]%>-<%=datos[i][17]%></td>  
                    <td><%=datos[i][2]%>-<%=datos[i][16]%></td>  
                    <td><%=datos[i][13]%>-<%=datos[i][15]%></td>
                    <%for(int j=3;j<11;j++){%>
                    <td><%=datos[i][j]%></td>  
                    <%}%>
                </tr>
                <%
             }   
            %>
      </tbody>      
    </table>
         <%
      if(ndatos==1)
      {
        %>
          <script> 
          Swal.fire('warning', "No se encontraron resultados!", 'warning');
          </script>
        <%      
      }
      %>
</body>
</html>