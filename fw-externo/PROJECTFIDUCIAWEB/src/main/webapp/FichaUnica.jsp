<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*,java.io.*"%>
<jsp:useBean id="FichaUnica"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="moneda"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="DetRetiro"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="DetDeposito"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="DetTraspaso"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="detSWIFT"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="usuAutoriza"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.RetirosDB"/>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<%
//se recupera la informacion del Arreglo de Datos del query consulta
String sData []=null;
sData=new String[5];//informacion de la cuenta seleccionada
String sFolio=(String)request.getParameter("folio")!=null?(String)request.getParameter("folio"):"";
//String sFolio=(String)request.getParameter("txtFecha")!=null?(String)request.getParameter("txtFecha"):"";
String[] sDatosFicha = new String[60];
if(sFolio.length()>0){
	FichaUnica.setVtrIntDato1(Integer.valueOf(sFolio).intValue());
	FichaUnica.querySelect(51);
//}	
//else{
//	FichaUnica.setVtrStrDato1(sFecha);
//	FichaUnica.querySelect(52);
}	

if (FichaUnica.hasData())
{
//se extran datos de los usuarios internos que autorizan la instruccion

if (FichaUnica.getVtrIntDato7()!=0)
	moneda.setVtrIntDato1(FichaUnica.getVtrIntDato7());
else if (FichaUnica.getVtrIntDato8()!=0)
	moneda.setVtrIntDato1(FichaUnica.getVtrIntDato8());
moneda.querySelect(48); 
//usuarios que autorizan
usuAutoriza.setVtrIntDato1(FichaUnica.getVtrIntDato1());
usuAutoriza.querySelect(56); 
if (usuAutoriza.hasData()){
  sDatosFicha[43]="";
  for(int i=0;i<usuAutoriza.getSize();i++){
    usuAutoriza.setIndex(i);
    sDatosFicha[43]=sDatosFicha[43]+"Usuario No."+usuAutoriza.getVtrStrDato1()+" ";  
  }  
}
//Datos Generales de la Instruccion
sDatosFicha[0]=String.valueOf(FichaUnica.getVtrIntDato1()); //folio
sDatosFicha[1]=FichaUnica.getVtrStrDato2();//fecha
sDatosFicha[2]=FichaUnica.getVtrStrDato3();//tipo de instruccion
sDatosFicha[3]=String.valueOf(FichaUnica.getVtrIntDato4());//importe
sDatosFicha[4]=moneda.getVtrStrDato1();//moneda
sDatosFicha[38]=FichaUnica.getVtrStrDato5();//nombre de fideicomiso
sDatosFicha[39]=String.valueOf(FichaUnica.getVtrIntDato9());//numero de fideicomiso
sDatosFicha[40]=FichaUnica.getVtrStrDato4();//status instruccion
sDatosFicha[41]=String.valueOf(FichaUnica.getVtrIntDato10());//CTO INVER ORIGEN TRASPASO
sDatosFicha[42]=String.valueOf(FichaUnica.getVtrIntDato11());//CTO INVER DESTINO TRASPASO
if(FichaUnica.getVtrIntDato4()==3)//traspaso
  sDatosFicha[6]=NumberFormat.getCurrencyInstance(Locale.US).format(FichaUnica.getVtrDoubleDato7());//EN CASO DE TRASPASO
if(FichaUnica.getVtrIntDato4()==1){//deposito
	DetDeposito.setVtrIntDato1(FichaUnica.getVtrIntDato1());
	DetDeposito.querySelect(54);

	if (DetDeposito.hasData()){
		sDatosFicha[5]=DetDeposito.getVtrStrDato4();//cuenta
		sDatosFicha[6]=NumberFormat.getCurrencyInstance(Locale.US).format(DetDeposito.getVtrDoubleDato5());//importe
		sDatosFicha[7]=DetDeposito.getVtrStrDato9();//moneda
		sDatosFicha[8]=DetDeposito.getVtrStrDato7();//concepto
		sDatosFicha[9]=DetDeposito.getVtrStrDato10();//persona
		sDatosFicha[10]=String.valueOf(DetDeposito.getVtrIntDato8());//contrato
		sDatosFicha[11]=DetDeposito.getVtrStrDato1();//numero de fideicomiso
	}		
}	
else if(FichaUnica.getVtrIntDato4()==2){//retiro
	DetRetiro.setVtrIntDato1(FichaUnica.getVtrIntDato1());
	DetRetiro.querySelect(53);
	
	sDatosFicha[5]=String.valueOf(DetRetiro.getVtrStrDato1());	//fcha
	sDatosFicha[6]=String.valueOf(DetRetiro.getVtrIntDato2());	//contrato
	sDatosFicha[7]=NumberFormat.getCurrencyInstance(Locale.US).format(DetRetiro.getVtrDoubleDato3());	//importe
	sDatosFicha[8]=DetRetiro.getVtrStrDato4();	//concepto
	sDatosFicha[9]=String.valueOf(DetRetiro.getVtrIntDato5());	//cveretiro
	sDatosFicha[10]=DetRetiro.getVtrStrDato6();	//forma retiro
	sDatosFicha[11]=DetRetiro.getVtrStrDato7();	//banco
	sDatosFicha[12]=DetRetiro.getVtrStrDato8().trim();	//numero de cuenta
	sDatosFicha[13]=DetRetiro.getVtrStrDato9();	//cuenta banxico
	sDatosFicha[14]=DetRetiro.getVtrStrDato10();	//beneficiario
	sDatosFicha[15]=DetRetiro.getVtrStrDato11();	//plaza
	sDatosFicha[16]=DetRetiro.getVtrStrDato12();	//rfctef
	sDatosFicha[17]=DetRetiro.getVtrStrDato13();	//fecha sesion
	sDatosFicha[18]=DetRetiro.getVtrStrDato14();	//tiposesion
	sDatosFicha[19]=DetRetiro.getVtrStrDato15();	//no acuerdo
	sDatosFicha[20]=DetRetiro.getVtrStrDato16();			//referencia
	sDatosFicha[21]=DetRetiro.getVtrStrDato17();			//convenio
	sDatosFicha[37]=DetRetiro.getVtrStrDato18();			//numero de fideicomiso
  if(sDatosFicha[10].equalsIgnoreCase("3")){
    sData=BD.getDataCuenta(3,sDatosFicha[12]+"|VACIO|VACIO");//recupera datos de la cuenta seleccionada    
  }  
	if (DetRetiro.hasData()){
		if(DetRetiro.getVtrIntDato5()==21)
		{ 
		detSWIFT.setVtrIntDato1(FichaUnica.getVtrIntDato1());
		detSWIFT.querySelect(55);//falta cambiar el query para entrar via el folio
		
			if(detSWIFT.hasData()){
				sDatosFicha[22]=detSWIFT.getVtrStrDato1();//pais domiciliario
				sDatosFicha[23]=detSWIFT.getVtrStrDato2();//ciudad domiciliario
				sDatosFicha[24]=detSWIFT.getVtrStrDato3();//banco domiciliario
				sDatosFicha[25]=detSWIFT.getVtrStrDato4();//plaza domiciliario
				sDatosFicha[26]=detSWIFT.getVtrStrDato5();//sucursal domiciliario
				sDatosFicha[27]=detSWIFT.getVtrStrDato6();//cta domiciliario
				sDatosFicha[28]=detSWIFT.getVtrStrDato7();//branch domiciliario
				sDatosFicha[29]=detSWIFT.getVtrStrDato8();//moneda domiciliario
				sDatosFicha[30]=NumberFormat.getCurrencyInstance(Locale.US).format(detSWIFT.getVtrDoubleDato9());//importe swift
				sDatosFicha[31]=detSWIFT.getVtrStrDato10();//codigo aba o iban
				sDatosFicha[32]=detSWIFT.getVtrStrDato11();//nombre beneficiario
				sDatosFicha[33]=detSWIFT.getVtrStrDato1();//2();//pais beneficiario
				sDatosFicha[34]=detSWIFT.getVtrStrDato13();//ciudad beneficiario
				sDatosFicha[35]=detSWIFT.getVtrStrDato14();//domicilio beneficiario
				sDatosFicha[36]=detSWIFT.getVtrStrDato15();//telefono beneficiario
			}
		}	
	}
		
}	
//else if(FichaUnica.getVtrIntDato4()==3){//traspaso
//	DetTraspaso.querySelect(23);
//}	
//else//pago de honorarios
}
%>
<HTML>
<script>

 ie4up=nav4up=false;
 var agt = navigator.userAgent.toLowerCase();
 var major = parseInt(navigator.appVersion);
 if ((agt.indexOf('msie') != -1) && (major >= 4))
   ie4up = true;
 if ((agt.indexOf('mozilla') != -1)  && (agt.indexOf('spoofer') == -1) && (agt.indexOf('compatible') == -1) && ( major>= 4))
   nav4up = true;
</script>
<STYLE>
 A {text-decoration:none}
 A IMG {border-style:none; border-width:0;}
 DIV {
	position:absolute;
	z-index:25;
	width: 6px;
}
.fc1-0 { COLOR:000000;FONT-SIZE:6PT;FONT-FAMILY:Times New Roman;FONT-WEIGHT:BOLD;}
.fc1-1 { COLOR:000000;FONT-SIZE:8PT;FONT-FAMILY:Times New Roman;FONT-WEIGHT:BOLD;FONT-STYLE:ITALIC;}
.fc1-2 { COLOR:000000;FONT-SIZE:5PT;FONT-FAMILY:Times New Roman;FONT-WEIGHT:BOLD;}
.fc1-3 { COLOR:000000;FONT-SIZE:5PT;FONT-FAMILY:Times New Roman;FONT-WEIGHT:NORMAL;}
.fc1-4 { COLOR:000000;FONT-SIZE:6PT;FONT-FAMILY:Times New Roman;FONT-WEIGHT:NORMAL;}
.fc1-5 { COLOR:000000;FONT-SIZE:5PT;FONT-FAMILY:Times New Roman;FONT-WEIGHT:BOLD;}
.fc1-6 { COLOR:000000;FONT-SIZE:7PT;FONT-FAMILY:Times New Roman;FONT-WEIGHT:NORMAL;}
.fc1-7 { COLOR:000000;FONT-SIZE:4PT;FONT-FAMILY:Times New Roman;FONT-WEIGHT:NORMAL;}
.fc1-8 { COLOR:000000;FONT-SIZE:8PT;FONT-FAMILY:Times New Roman;FONT-WEIGHT:NORMAL;}
.fc1-9 { COLOR:000000;FONT-SIZE:6PT;FONT-FAMILY:Times New Roman;FONT-WEIGHT:NORMAL;}
.fc1-10 { COLOR:000000;FONT-SIZE:7PT;FONT-FAMILY:Times New Roman;FONT-WEIGHT:NORMAL;}
.fc1-11 { COLOR:000000;FONT-SIZE:6PT;FONT-FAMILY:Times New Roman;FONT-WEIGHT:NORMAL;}
.ad1-0 {border-color:000000;border-style:none;border-bottom-width:0PX;border-left-width:0PX;border-top-width:0PX;border-right-width:0PX;}
.ad1-1 {border-color:000000;border-style:none;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;}
.ad1-2 {border-color:000000;border-style:none;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;}
.ad1-3 {border-color:000000;border-style:none;border-bottom-width:0PX;border-left-width:0PX;border-top-style:solid;border-top-width:1PX;border-right-width:0PX;}
.ad1-4 {border-color:000000;border-style:none;border-bottom-width:0PX;border-left-style:solid;border-left-width:3PX;border-top-width:0PX;border-right-width:0PX;}
.ad1-5 {border-color:000000;border-style:none;border-bottom-width:0PX;border-left-style:solid;border-left-width:1PX;border-top-width:0PX;border-right-width:0PX;}
.ad1-6 {border-color:000000;border-style:none;border-bottom-width:0PX;border-left-width:0PX;border-top-style:solid;border-top-width:2PX;border-right-width:0PX;}
.ad1-7 {border-color:000000;border-style:none;border-bottom-style:solid;border-bottom-width:3PX;border-left-style:solid;border-left-width:3PX;border-top-style:solid;border-top-width:3PX;border-right-style:solid;border-right-width:3PX;}
.ad1-8 {border-color:000000;border-style:none;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;}
</STYLE>

<TITLE>Crystal Report Viewer</TITLE>
<BODY BGCOLOR="FFFFFF"LEFTMARGIN=0 TOPMARGIN=0 BOTTOMMARGIN=0 RIGHTMARGIN=0>
<div style="left:587PX;top:953PX;border-color:000000;border-style:solid;border-width:0px;border-top-width:1PX;width:193PX;">
</div>
<div style="left:579PX;top:865PX;border-color:000000;border-style:solid;border-width:0px;border-top-width:1PX;width:201PX;">
</div>
<div style="left:227PX;top:793PX;border-color:000000;border-style:solid;border-width:0px;border-top-width:1PX;width:353PX;">
</div>
<div style="left:35PX;top:897PX;border-color:000000;border-style:solid;border-width:0px;border-top-width:1PX;width:193PX;">
</div>
<div style="left:227PX;top:761PX;border-color:000000;border-style:solid;border-width:0px;border-left-width:3PX;height:26PX;">
<table width="0px" height="20PX"><td>&nbsp;</td></table>
</div>
<div style="left:579PX;top:761PX;border-color:000000;border-style:solid;border-width:0px;border-left-width:3PX;height:25PX;">
<table width="0px" height="19PX"><td>&nbsp;</td></table>
</div>
<div style="left:579PX;top:785PX;border-color:000000;border-style:solid;border-width:0px;border-left-width:3PX;height:224PX;">
<table width="0px" height="218PX"><td>&nbsp;</td></table>
</div>
<div style="left:227PX;top:785PX;border-color:000000;border-style:solid;border-width:0px;border-left-width:3PX;height:220PX;">
<table width="0px" height="214PX"><td>&nbsp;</td></table>
</div>
<div style="left:555PX;top:633PX;border-color:000000;border-style:solid;border-width:0px;border-left-width:1PX;height:34PX;">
<table width="0px" height="28PX"><td>&nbsp;</td></table>
</div>
<div style="left:507px;top:546px;border-color:000000;border-style:solid;border-width:0px;border-left-width:1PX;height:25PX;">
<table width="0px" height="19PX"><td>&nbsp;</td></table>
</div>
<div style="left:232px;top:546px;border-color:000000;border-style:solid;border-width:0px;border-left-width:1PX;height:24px;">
<table width="0px" height="19PX"><td>&nbsp;</td></table>
</div>
<div style="left:227PX;top:841PX;border-color:000000;border-style:solid;border-width:0px;border-top-width:1PX;width:353px;"></div>
<div style="left:35PX;top:761PX;border-color:000000;border-style:solid;border-width:0px;border-left-width:3PX;height:33PX;">
<table width="0px" height="27PX"><td>&nbsp;</td></table>
</div>
<div style="left:255px;top:696px;border-color:000000;border-style:solid;border-width:0px;border-left-width:1PX;height:65PX;">
<table width="0px" height="20PX"><td>&nbsp;</td></table>
</div>
<div style="left:555PX;top:697PX;border-color:000000;border-style:solid;border-width:0px;border-left-width:1PX;height:66PX;">
<table width="0px" height="60PX"><td>&nbsp;</td></table>
</div>
<div style="left:11PX;top:1014PX;border-color:000000;border-style:solid;border-width:0px;border-top-width:2PX;width:769PX;">
</div>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:3PX;border-left-style:solid;border-left-width:3PX;border-top-style:solid;border-top-width:3PX;border-right-style:solid;border-right-width:3PX;left:35PX;top:793PX;width:744PX;height:215PX;">
<table border=0 cellpadding=0 cellspacing=0 width=733px height=204px><TD>&nbsp;</TD></TABLE>
</DIV>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:36px;top:639px;width:744PX;height:33PX;">
<table border=0 cellpadding=0 cellspacing=0 width=737px height=26px>
<TD width="434" class="texto"><%=sDatosFicha[43]!=null?sDatosFicha[43]:""%> </TD>
<TD width="1"></TD>
<TD width="4"></TD>
<TD width="1"></TD>
<TD width="110"></TD>
<TD width="187" class="texto"> <%=sDatosFicha[0]!=null?sDatosFicha[0]:""%></TD></TABLE>
</DIV>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:35PX;top:588PX;width:744PX;height:21PX;">
  <%=Integer.valueOf(sDatosFicha[3]).intValue()==2&&(sDatosFicha[14]!=null&&!sDatosFicha[14].equalsIgnoreCase("null")&&!sDatosFicha[9].equalsIgnoreCase("21"))?sDatosFicha[14]+"   "+sDatosFicha[12]:(Integer.valueOf(sDatosFicha[3]).intValue()==2&&sDatosFicha[9].equalsIgnoreCase("21"))?sDatosFicha[32]:""%>
  <table border=0 cellpadding=0 cellspacing=0 width=737px height=15px><TD>&nbsp;</TD>
</TABLE>
</DIV>

<DIV class="texto" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:35PX;top:545PX;width:744PX;height:24PX;" >
<table border=0 cellpadding=0 cellspacing=0 width=744 height=17px>
<TD class="texto" align="center" width="250"><%=Integer.valueOf(sDatosFicha[3]).intValue()==1&&sDatosFicha[5]!=null?sDatosFicha[5]:(Integer.valueOf(sDatosFicha[3]).intValue()==2&&sDatosFicha[12]!=null&&sDatosFicha[12].length()>0&&!sDatosFicha[9].equalsIgnoreCase("21"))?sDatosFicha[12]:(Integer.valueOf(sDatosFicha[3]).intValue()==2&&sDatosFicha[9].equalsIgnoreCase("21"))?sDatosFicha[27]:"---------"%></TD>
<TD align="left" class="texto"  width="250"><%=Integer.valueOf(sDatosFicha[3]).intValue()==2&&sData[0]!=null&&!sDatosFicha[9].equalsIgnoreCase("21")?sData[0]:(Integer.valueOf(sDatosFicha[3]).intValue()==2&&sDatosFicha[9].equalsIgnoreCase("21"))?sDatosFicha[22]:""%></TD>
<TD align="left"  class="texto"  width="244"><%=Integer.valueOf(sDatosFicha[3]).intValue()==2&&sDatosFicha[15]!=null&&!sDatosFicha[9].equalsIgnoreCase("21")?sDatosFicha[15]:(Integer.valueOf(sDatosFicha[3]).intValue()==2&&sDatosFicha[9].equalsIgnoreCase("21"))?sDatosFicha[25]:""%></TD>
</TABLE>
</DIV>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:35PX;top:429px;width:744PX;height:76px;"> <span class="text">CONCEPTO/OBSERVACIONES/ANEXOS</span>
<table border=0 cellpadding=0 cellspacing=0 width=737px height=65px>
<TR>
<TD class="texto"><%=Integer.valueOf(sDatosFicha[3]).intValue()==1&&sDatosFicha[8]!=null?sDatosFicha[8]:Integer.valueOf(sDatosFicha[3]).intValue()==3?"":sDatosFicha[8] + " / FORMA DE RETIRO: "+sDatosFicha[10]%></TD>
</TR>
<TR>
<TD class="texto"><%=Integer.valueOf(sDatosFicha[3]).intValue()==2&&sDatosFicha[9]!=null&&Integer.valueOf(sDatosFicha[9]).intValue()==21?" BANCO DOMICIALIARIO PAIS: "+sDatosFicha[22] + " CIUDAD:"+sDatosFicha[23] + " BANCO:"
+sDatosFicha[24] + " PLAZA:"+sDatosFicha[25] + " CUENTA:"+sDatosFicha[27] + " BRANCH:"
+sDatosFicha[28] + " MONEDA:"+sDatosFicha[29] + " CODIGO ABA O IBAN:"+sDatosFicha[31]:""%></TD>
</TR>
<TR>
<TD class="texto"><%=Integer.valueOf(sDatosFicha[3]).intValue()==2&&sDatosFicha[9]!=null&&Integer.valueOf(sDatosFicha[9]).intValue()==21?" BENEFICIARIO NOMBRE: "+sDatosFicha[32] + " PAIS:"+sDatosFicha[33] + " CIUDAD:"
+sDatosFicha[34] + " DOMICILIO:"+sDatosFicha[35] + " TELEFONO:"+sDatosFicha[36] :""%></TD>
</TR>
</TABLE>
</DIV>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:99PX;top:241PX;width:48PX;height:16PX;">
<table border=0 cellpadding=0 cellspacing=0 width=49 height=9px>
  <TD class="texto" align="center"><FONT SIZE=0> <%=Integer.valueOf(sDatosFicha[3]).intValue()==2?"X":""%>  </FONT></TD>
</TABLE>
</DIV>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:35PX;top:289PX;width:152PX;height:32PX;">
<table border=0 cellpadding=0 cellspacing=0 width=145px height=25px><TD class="texto" align="center"><%=Integer.valueOf(sDatosFicha[3]).intValue()==1&&sDatosFicha[10]!=null?sDatosFicha[10]:Integer.valueOf(sDatosFicha[3]).intValue()==3?sDatosFicha[41]:sDatosFicha[6]%> </TD></TABLE>
</DIV>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:291PX;top:241PX;width:52PX;height:16PX;">
<table border=0 cellpadding=0 cellspacing=0 width=51 height=9px><TD width="51" class="texto" align="center"><%=Integer.valueOf(sDatosFicha[3]).intValue()==1?"X":""%></TD>
</TABLE>
</DIV>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:203PX;top:289PX;width:160PX;height:32PX;">
<table border=0 cellpadding=0 cellspacing=0 width=153px height=25px><TD class="texto"  align="center"><%=Integer.valueOf(sDatosFicha[3]).intValue()==3&&sDatosFicha[42]!=null?sDatosFicha[42]:""%></TD>
</TABLE>
</DIV>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:619PX;top:341PX;width:160PX;height:32PX;">
<table border=0 cellpadding=0 cellspacing=0 width=153px height=25px><TD class="texto" align="center"><%=sDatosFicha[4]!=null?sDatosFicha[4]:""%> </TD></TABLE>
</DIV>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:619PX;top:289PX;width:160PX;height:32PX;">
<table border=0 cellpadding=0 cellspacing=0 width=153px height=25px><TD>&nbsp;</TD></TABLE>
</DIV>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:691PX;top:241PX;width:52PX;height:16PX;">
<table border=0 cellpadding=0 cellspacing=0 width=55 height=9px><TD width="55" class="texto" align="center"><FONT SIZE=0><%=Integer.valueOf(sDatosFicha[3]).intValue()==4?"X":""%></FONT></TD>
</TABLE>
</DIV>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:467PX;top:241PX;width:48PX;height:16PX;">
<table border=0 cellpadding=0 cellspacing=0 width=49 height=9px><TD class="texto" align="center"><FONT SIZE=0><%=Integer.valueOf(sDatosFicha[3]).intValue()==3?"X":""%></FONT></TD></TABLE>
</DIV>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:35PX;top:696PX;width:744PX;height:65PX;">
<table border=0 cellpadding=0 cellspacing=0 width=737px height=58px><TD>&nbsp;</TD></TABLE>
</DIV>

<DIV class="box" style="z-index:10; border-color:000000;border-style:solid;border-bottom-style:solid;border-bottom-width:1PX;border-left-style:solid;border-left-width:1PX;border-top-style:solid;border-top-width:1PX;border-right-style:solid;border-right-width:1PX;left:416px;top:290px;width:170px;height:23PX;">
<table border=0 cellpadding=0 cellspacing=0 width=168 height=16px><TD width="118" class="texto" align="center"><%=sDatosFicha[40]!=null?sDatosFicha[40]:""%> </TD>
</TABLE>
</DIV>

<DIV style="left:43PX;top:73PX;width:152PX;height:19PX;"><span class="fc1-0"> Dirección&nbsp;&nbsp;Fiduciaria </span></DIV>

<DIV style="left:35PX;top:113PX;width:744PX;height:21PX;background-color:C0C0C0;layer-background-color:C0C0C0;" class="ad1-1">
<table width="739PX" border=0 cellpadding=0 cellspacing=0><td ALIGN="CENTER" class="fc1-1">FICHA ÚNICA DE OPERACIÓN FIDUCIARIA</td></table>
</DIV>

<DIV style="left:35PX;top:140PX;width:744PX;height:21PX;background-color:C0C0C0;layer-background-color:C0C0C0;" class="ad1-1">
<table width="739PX" border=0 cellpadding=0 cellspacing=0><td ALIGN="CENTER" class="fc1-1">Fecha de Operación: <%=sDatosFicha[1]%></td></table>
</DIV>  

<DIV style="left:38px;top:802px;width:72PX;height:15PX;TEXT-ALIGN:CENTER;"><span class="fc1-3">REVISO</span></DIV>

<DIV style="left:247px;top:804px;width:80PX;height:15PX;TEXT-ALIGN:CENTER;"><span class="fc1-3">FOLIO DE CAJA</span></DIV>

<DIV style="left:244px;top:849px;width:104PX;height:19px;TEXT-ALIGN:CENTER;"><span class="fc1-3">SELLO&nbsp;&nbsp;DE&nbsp;&nbsp;RECIBIDO</span></DIV>

<DIV style="left:599px;top:801px;width:123PX;height:17px;TEXT-ALIGN:CENTER;"><span class="fc1-3">OPERACION CONTABLE</span></DIV>

<DIV style="left:39px;top:903px;width:72PX;height:15PX;TEXT-ALIGN:CENTER;"><span class="fc1-3">AUTORIZO</span></DIV>

<DIV style="left:549px;top:525px;width:72PX;height:15px;TEXT-ALIGN:CENTER;"> <span class="fc1-4"> PLAZA </span> </DIV>

<DIV style="left:43PX;top:513PX;width:272PX;height:15PX;"><span class="fc1-0">DATOS ADICIONALES EL RETIRO</span></DIV>

<DIV style="left:65PX;top:531PX;width:112PX;height:15PX;TEXT-ALIGN:CENTER;"><span class="fc1-4">NUM. DE CUENTA</span></DIV>

<DIV style="left:274PX;top:531PX;width:72PX;height:15PX;TEXT-ALIGN:CENTER;"><span class="fc1-4">BANCO</span></DIV>

<DIV style="left:53PX;top:573PX;width:180PX;height:15PX;TEXT-ALIGN:CENTER;"><span class="fc1-4">NOMBRE DEL BENEFICIARIO Y RFC</span></DIV>

<DIV style="left:43px;top:626px;width:384PX;height:15PX;TEXT-ALIGN:CENTER;"><span class="fc1-4">NOMBRE DE LA PERSONA QUE AUTORIZA POR EL FIDEICOMISO</span></DIV>

<DIV style="z-index:10;left:40PX;top:678PX;width:736PX;height:15PX;clip: rect(0PX,741PX,22PX,0PX);background-color:000000;layer-background-color:000000;" class="fc1-1039"></DIV>
<DIV style="left:35PX;top:673PX;width:736PX;height:15PX;background-color:C0C0C0;layer-background-color:C0C0C0;" class="ad1-2">
<table width="731PX" border=0 cellpadding=0 cellspacing=0><td ALIGN="CENTER" class="fc1-5">PARA USO EXCLUSIVO DE <%=session.getAttribute("empresa_1")%>. <%=session.getAttribute("empresa_2")%></td></table>
</DIV>

<DIV style="left:44PX;top:241PX;width:48PX;height:15PX;"><span class="fc1-6">RETIRO</span></DIV>

<DIV style="left:195PX;top:241PX;width:72PX;height:15PX;"><span class="fc1-6">DEPOSITO</span></DIV>

<DIV style="left:382PX;top:241PX;width:75PX;height:15PX;"><span class="fc1-6">TRASPASO</span></DIV>

<DIV style="left:553PX;top:241PX;width:121px;height:16PX;"><span class="fc1-4">PAGO DE HONORARIOS</span></DIV>

<DIV style="left:227PX;top:273PX;width:101PX;height:15PX;TEXT-ALIGN:CENTER;"><span class="fc1-4">AL CONTRATO</span></DIV>

<DIV style="left:65PX;top:276PX;width:101PX;height:15PX;TEXT-ALIGN:CENTER;"><span class="fc1-4">DEL CONTRATO</span></DIV>

<DIV style="left:631PX;top:326PX;width:136PX;height:15PX;TEXT-ALIGN:CENTER;"><span class="fc1-4">DIVISA</span></DIV>

<DIV style="left:635PX;top:272PX;width:120PX;height:15PX;TEXT-ALIGN:CENTER;"><span class="fc1-4">PERIODO QUE PAGA</span></DIV>

<DIV style="left:73px;top:365px;width:92PX;height:16PX;TEXT-ALIGN:CENTER;"><span class="fc1-4">IMPORTE TOTAL</span></DIV>

<DIV style="left:36px;top:389px;width:224PX;height:34px;" align="center"> <span class="texto"><%=(Integer.valueOf(sDatosFicha[3]).intValue()==1||Integer.valueOf(sDatosFicha[3]).intValue()==3)&&sDatosFicha[6]!=null?sDatosFicha[6]:sDatosFicha[7]%> </span> </DIV>

<DIV style="left:43PX;top:217PX;width:192PX;height:13PX;"><span class="fc1-0">OPERACION SOLICITADA</span></DIV>

<DIV style="left:35PX;top:177PX;width:419PX;height:13PX;"><span class="fc1-0">DATOS DEL FIDEICOMISO O MANDATO</span><span style="left:43PX;top:193PX;width:59px;height:13PX;"></span></DIV>

<DIV style="left:43PX;top:193PX;width:59px;height:13PX;"><span class="texto">NÚM. </span> <%=sDatosFicha[39]!=null?sDatosFicha[39]:""%></DIV>
  
<DIV style="left:142PX;top:193PX;width:314px;height:13PX;"><span class="texto">NOMBRE. </span> <%=sDatosFicha[38]!=null?sDatosFicha[38]:""%> </DIV>

<DIV style="left:628px;top:624px;width:92px;height:18PX;TEXT-ALIGN:CENTER;"><span class="fc1-8">Folio Internet</span></DIV>

<DIV style="left:51PX;top:769PX;width:116PX;height:15PX;"><span class="fc1-5">ADMINISTRACIÓN </span></DIV>

<DIV style="left:335PX;top:769PX;width:116PX;height:15PX;"><span class="fc1-5">TESORERIA</span></DIV>

<DIV style="left:43PX;top:697PX;width:511PX;height:23PX;"><span class="fc1-3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;OBSERVACIONES DE CONTABILIDAD&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;OBSERVACIONES DE TESORERIA&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></DIV>

<DIV style="left:572px;top:699px;width:178PX;height:15PX;"><span class="fc1-3">&nbsp;&nbsp;REGISTRO DE HONORARIOS</span></DIV>

<DIV style="left:411PX;top:273PX;width:176PX;height:15PX;TEXT-ALIGN:CENTER;"><span class="fc1-4">ESTATUS DE LA INSTRUCCIÓN</span></DIV>

<DIV style="left:747PX;top:1015PX;width:32PX;height:12PX;TEXT-ALIGN:RIGHT;"><span class="fc1-10">1</span></DIV>

<DIV style="left:703PX;top:1015PX;width:44PX;height:12PX;"><span class="texto">Página</span></DIV>
<font size=0 class="texto"></font>
</BODY></HTML>
