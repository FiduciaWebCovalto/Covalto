<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%
 String sysFecha=BD.fecha(); %>
<HTML>
<HEAD><TITLE>FiduciaWeb Movil  -  <%=session.getAttribute("empresa_1")%></TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript">
function guia(doc)
{
   window.open( "formatos/anexo"+doc+".doc"  ,"ANEXO_"+doc,"top=20,left=20,width=750,height=420,menubar=YES,scrollbars=YES");
}
</script>
</HEAD>
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0"   >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366"><IMG 
            src="imagenes/logo.jpg" 
            alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="176"></TD>
      <TD vAlign="top" background="imagenes/msur01.png"
          > </TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
<TR > 
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=sysFecha!=null?sysFecha:""%></TD>
      <TD background="imagenes/fondoMenu.gif">&nbsp; </TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540" width="176"> 
        <TABLE width="100%">
          <tr> 
            <td align="right"  class="subMenu">&nbsp;</td>
            <td align="right"  class="subMenu">&nbsp;</td>
          </tr>
          <tr> 
            <td width="11%" align="right"  class="subMenu">&nbsp;</td>
            <td width="89%" align="right"  class="subMenu">&nbsp;</td>
          </tr>
          <tr> 
            <td  class="subMenu" align="right">&nbsp;</td>
            <td  class="subMenu" >&nbsp;</td>
          </tr>
          <tr> 
            <td  class="subMenu" align="right"><img src="imagenes/bolita.gif"  border="0"></td>
            <td  class="subMenu" ><a class="subMenu" href="#solicitudes">Formatos 
              para la Solicitud de Acreditaci&oacute;n</a></td>
          </tr>
          <tr> 
            <td  class="subMenu" align="right">&nbsp;</td>
            <td  class="subMenu" align="right">&nbsp;</td>
          </tr>
          <tr> 
            <td  class="subMenu" align="right">&nbsp;</td>
            <td  class="subMenu" align="right">&nbsp;</td>
          </tr>
          <tr> 
            <td  class="subMenu" align="right">&nbsp;</td>
            <td  class="subMenu" align="right"><a class="subMenu"  href="<%=BD.getDatosParametros(103)%>"  a> 
              Fiduciario en l&iacute;nea</a>&nbsp;<img src="imagenes/flecha.gif"   border="0"> 
            </td>
          </tr>
          <tr> 
            <td  class="subMenu" align="right">&nbsp;</td>
            <td  class="subMenu" align="right"> <a class="subMenu"  href="index.jsp"  a> 
              </a> </td>
          </tr>
        </TABLE>
        &nbsp;</TD>
      <TD valign="top" align="center"><table width="80%" border="0">
          <tr> 
            <td  class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">GUIA 
              DE ACREDITACI&Oacute;N </td>
          </tr>
          <tr> 
            <td  valign="top"> <br> <P align="justify" class="subtitulo">Introducci&oacute;n</P>
              <p align="justify" class="texto">La Direcci&oacute;n Fiduciaria 
                dise&ntilde;&oacute; la herramienta electr&oacute;nica denominada 
                �Fiduciario en L&iacute;nea� con el prop&oacute;sito de facilitar 
                a sus clientes la operaci&oacute;n de sus fideicomisos y mandatos 
                desde la comodidad de sus domicilios y permitirles obtener informaci&oacute;n 
                de los mismos de una manera oportuna y confiable, bajo estrictos 
                controles de seguridad.</p>
              <p align="justify" class="texto">Con este medio se podr&aacute; 
                consultar el estado que guardan las inversiones, las tasas de 
                rendimiento que se ofrecen diariamente en la Mesa de Dinero de 
                la Instituci&oacute;n, as&iacute; como los honorarios fiduciarios 
                pendientes de pago de su fideicomiso o mandato, adem&aacute;s 
                de obtener los Estados de Cuenta de los contratos establecidos 
                en Nacional Financiera para la inversi&oacute;n de sus recursos 
                y la informaci&oacute;n financiera, consistente en Balance General, 
                Estado de Resultados y Balanza de Comprobaci&oacute;n de hasta 
                los &uacute;ltimos 12 meses.</p>
              <p align="justify" class="texto">Tambi&eacute;n permite el env&iacute;o 
                de instrucciones para realizar operaciones de dep&oacute;sito, 
                retiro, traspaso entre contratos y pago de honorarios, con lo 
                cual se elimina el uso de fax y mensajer&iacute;a, reduciendo 
                considerablemente tiempo y el costo de env&iacute;o de documentos 
                y se elimina la necesidad de enviar a una persona para que entregue 
                la documentaci&oacute;n y recabe el acuse de recibo, pero sobre 
                todo, se mantiene un alto nivel de seguridad de la informaci&oacute;n, 
                dentro de las normas vigentes en el marco jur&iacute;dico mexicano, 
                respecto al comercio y la firma electr&oacute;nicos.</p>
              <p align="justify" class="texto">Es de suma importancia poder verificar 
                la autenticidad de la informaci&oacute;n que se transmite y su 
                fuente, lo cual se logra mediante una firma electr&oacute;nica, 
                a trav&eacute;s de la cual las personas manifiestan su voluntad 
                de reconocer el contenido de un archivo electr&oacute;nico y, 
                en su caso, de cumplir con los compromisos u obligaciones establecidos 
                para asumir como v&aacute;lida la informaci&oacute;n contenida 
                en el mismo, cuya confidencialidad y autenticidad se garantiza 
                mediante el uso de algoritmos de criptograf&iacute;a, firmas digitales 
                y acreditaciones digitales, en estricto apego a lo previsto en 
                el art&iacute;culo 52 de la Ley de Instituciones de cr&eacute;dito</p>
              <P align="justify" class="subtitulo">Acreditaci&oacute;n </P>
              <P align="justify" class="texto">Debido a la importancia de garantizar 
                altos niveles de seguridad, es indispensable que todas las personas 
                responsables del env&iacute;o de instrucciones a la Direcci&oacute;n 
                Fiduciaria para realizar operaciones de los negocios fiduciarios 
                lleven a cabo un procedimiento de acreditaci&oacute;n, pudiendo 
                autorizar a otras personas para realizar exclusivamente dep&oacute;sitos 
                o consultas de la informaci&oacute;n. <BR>
                Cumplir con este procedimiento es esencial para que la Direcci&oacute;n 
                Fiduciaria pueda acreditar a los responsables de girar instrucciones 
                operativas, as&iacute; como para tener acceso a la informaci&oacute;n 
                de los fideicomisos o mandatos, ya sea Fideicomitente, Mandante, 
                Fideicomisario o titular del fideicomiso o mandato. Lo anterior 
                es sumamente importante toda vez que con el uso de llaves electr&oacute;nicas 
                las personas se obligan, igual que con su firma aut&oacute;grafa, 
                para todos los efectos legales a que haya lugar con motivo de 
                la informaci&oacute;n que se transmite por este medio, de acuerdo 
                con lo establecido en el T&iacute;tulo II del C&oacute;digo de 
                Comercio, que regula precisamente el comercio electr&oacute;nico. 
                <BR>
                <BR>
                <BR>
                Para realizar el tr&aacute;mite de acreditaci&oacute;n, solicitamos 
                realizar las siguientes actividades:</P>
              <P align="justify" class="texto"><BR>
                <span class="textoNegrita">1. Documentaci&oacute;n legal</span></P>
              <P align="justify" class="texto"><BR>
                La acreditaci&oacute;n de usuarios del sistema Fiduciario en L&iacute;nea 
                debe solicitarse enviando a la Direcci&oacute;n Fiduciaria la 
                solicitud de acreditaci&oacute;n que corresponda al perfil de 
                usuario de la persona a la cual se desea otorgar facultades para 
                consultar la informaci&oacute;n o capturar instrucciones o instruir 
                operaciones, de acuerdo con lo siguiente:</P>
              <P align="justify" class="texto"><BR>
                <span class="textoNegrita">Usuario Operativo:- </span>Este perfil 
                de usuario permite a la persona girar instrucciones de dep&oacute;sito 
                o retiro con cargo al patrimonio del fideicomiso o mandato, adem&aacute;s 
                de poder consultar la informaci&oacute;n financiera del mismo, 
                para lo cual debe enviar a la Direcci&oacute;n Fiduciaria el formato 
                �Solicitud de Acreditaci&oacute;n� (Anexo 1) debidamente firmado 
                y con los datos de la persona facultada para realizar operaciones 
                en el fideicomiso o mandato, ya sea Fideicomitente, Mandante, 
                Fideicomisario o titular del fideicomiso o mandato, incluyendo 
                copia de una identificaci&oacute;n oficial vigente con fotograf&iacute;a 
                y firma. En el caso de que el Fideicomitente, Mandante o Fideicomisario 
                sea una persona moral, deber&aacute; enviar tambi&eacute;n una 
                copia simple del poder notarial en el que consten las facultades 
                de su representante y copia de una identificaci&oacute;n oficial 
                vigente con fotograf&iacute;a y firma del mismo. En el supuesto 
                de que el Comit&eacute; T&eacute;cnico del fideicomiso o mandato 
                haya autorizado a una persona para realizar este tipo de operaciones, 
                se deber&aacute; enviar copia simple del Acta de la sesi&oacute;n 
                en la que se tom&oacute; el Acuerdo correspondiente y copia de 
                una identificaci&oacute;n oficial vigente con fotograf&iacute;a 
                y firma de la persona designada.</P>
              <P align="justify" class="texto"><BR>
                <span class="textoNegrita">Usuario de Dep&oacute;sito.-</span> 
                Este perfil de usuario permite a la persona girar instrucciones 
                de dep&oacute;sito exclusivamente, adem&aacute;s de poder consultar 
                la informaci&oacute;n financiera del fideicomiso o mandato respectivo, 
                para lo cual deber&aacute; enviarse a la Direcci&oacute;n Fiduciaria 
                el formato �Solicitud de Acreditaci&oacute;n� (Anexo 2) debidamente 
                firmado por el titular del fideicomiso y la persona a la que se 
                est&aacute; designando como usuario de dep&oacute;sito, as&iacute; 
                como por dos testigos. </P>
              <P align="justify" class="texto"><BR>
                <span class="textoNegrita">Usuario de Consulta.-</span> Este perfil 
                permite a la persona realizar &uacute;nicamente consultas de la 
                informaci&oacute;n del fideicomiso o mandato, para lo cual, se 
                deber&aacute; enviar la Solicitud de Acreditaci&oacute;n para 
                usuario de consulta (Anexo 3) en el que el Fideicomitente, Mandante, 
                Fideicomisario o titular del fideicomiso o mandato informe el 
                nombre y los datos generales del encargado, incluyendo copia de 
                una identificaci&oacute;n oficial vigente de dicha persona, con 
                fotograf&iacute;a y firma. </P>
              <P align="justify" class="texto"><BR>
                <span class="textoNegrita">Usuario de Consulta y Dep&oacute;sito.-</span> 
                Este perfil permite a la persona realizar &uacute;nicamente consultas 
                de la informaci&oacute;n del fideicomiso o mandato e instruir 
                operaciones de dep&oacute;sito, para lo cual, se deber&aacute; 
                enviar la Solicitud de Acreditaci&oacute;n para usuario de consulta 
                (Anexo 4) firmada por el Fideicomitente, Mandante, Fideicomisario 
                o titular del fideicomiso o mandato, as&iacute; como por la persona 
                a la cual se desea otorgar este perfil, indicando su nombre y 
                los datos generales, debiendo anexar copia de una identificaci&oacute;n 
                oficial vigente de ambas personas, con fotograf&iacute;a y firma.</P>
              <P align="justify" class="texto"> <span class="textoNegrita">Usuario 
                de Captura.-</span> Este perfil de usuario permite a la persona 
                consultar la informaci&oacute;n del fideicomiso y capturar exclusivamente 
                instrucciones de dep&oacute;sito o retiro, sin que tenga posibilidad 
                de autorizarlas, ya que la autorizaci&oacute;n la tendr&aacute; 
                que otorgar la persona que tenga el perfil de usuario operativo 
                descrito en el punto anterior. Para obtener la acreditaci&oacute;n 
                como usuario de captura, se deber&aacute; enviar a la Direcci&oacute;n 
                Fiduciaria el formato �Solicitud de Acreditaci&oacute;n� (Anexo 
                5) debidamente firmado por el titular del fideicomiso y la persona 
                a la que se est&aacute; designando como usuario de captura, as&iacute; 
                como por dos testigos, incluyendo copia de su identificaci&oacute;n 
                oficial vigente con fotograf&iacute;a y firma.</P>
              <P align="justify" class="texto"><span class="textoNegrita">Usuario 
                Secretario de Actas.-</span> Este perfil de usuario permite a 
                la persona capturar la informaci&oacute;n del fideicomiso relativa 
                a los Acuerdos del Comit&eacute; T&eacute;cnico. Para obtener 
                la acreditaci&oacute;n como usuario Secretario de Actas, se deber&aacute; 
                enviar a la Direcci&oacute;n Fiduciaria el formato �Solicitud 
                de Acreditaci&oacute;n� (Anexo 6) debidamente firmado por el propio 
                Secretario de Actas, anexando copia del Acuerdo del Comit&eacute; 
                T&eacute;cnico donde conste su designaci&oacute;n, incluyendo 
                copia de su identificaci&oacute;n oficial vigente con fotograf&iacute;a 
                y firma. <BR>
                <BR>
                La documentaci&oacute;n debe ser enviada a la Gerencia Fiduciaria 
                de Control y Registro, en el siguiente domicilio: Insurgentes 
                Sur 1971, Edificio Anexo, Nivel Jard&iacute;n, Colonia Guadalupe 
                Inn, Delegaci&oacute;n &Aacute;lvaro Obreg&oacute;n, 01020 M&eacute;xico, 
                D. F. </P>
              <P align="justify" class="textoNegrita">2. Documentaci&oacute;n 
                electr&oacute;nica</P>
              <p align="justify" class="texto">Una vez cumplidos los requisitos 
                antes mencionados, se emitir&aacute; la clave de Cliente y Contrase&ntilde;a 
                para cada usuario, siendo importante mencionar que los Usuarios 
                Operativo o de Dep&oacute;sito requieren realizar un paso adicional 
                para obtener su Certificado Digital con el cual firmar&aacute;n 
                electr&oacute;nicamente las instrucciones giradas, mismo que sustituye 
                a su firma aut&oacute;grafa.</p>
              <p align="justify" class="texto">Para que la Direcci&oacute;n Fiduciaria 
                pueda expedir el certificado digital y completar as&iacute; el 
                procedimiento de acreditaci&oacute;n, es indispensable que las 
                personas designadas como Usuarios Operativo o de Dep&oacute;sito, 
                una vez que cuenten con sus claves de acceso, realicen a trav&eacute;s 
                del sistema Fiduciario en L&iacute;nea el Requerimiento de su 
                Certificado Digital, para lo cual les brindaremos la asistencia 
                que requieran. </p>
              <p align="justify"><span class="texto">En caso de cualquier duda 
                sobre el llenado de las solicitudes anexas y el tr&aacute;mite 
                de su acreditaci&oacute;n para utilizar el sistema Fiduciario 
                en L&iacute;nea, favor de comunicarse con su Ejecutivo de Cuenta.</span> 
              </P>
           
              </td>
          </tr>
        </table>
        <table width="80%" border="0" align="center">
          <tr class="textoNegrita"> 
            <td width="37%" >&nbsp;</td>
            <td width="63%">&nbsp;</td>
          </tr>
          <tr class="textoNegrita"> 
            <td>Formatos para la Solicitud de Acreditaci&oacute;n:<a name="solicitudes"></a></td>
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td align="right" class="textoNegrita">&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td align="right" class="textoNegrita"><img src="imagenes/img_word.jpg" width="28" height="30"></td>
            <td>&nbsp;&nbsp;&nbsp;<a href="javascript:guia(1)"  class="texto">30.0 
              KB ANEXO 1 ( Usuario Operativo )</a></td>
          </tr>
          <tr> 
            <td align="right" class="textoNegrita"><img src="imagenes/img_word.jpg" width="28" height="30"></td>
            <td class="textoNegrita">&nbsp;&nbsp; &nbsp;<a href="javascript:guia(2)"  class="texto">28.0 
              KB ANEXO 2 (Usuario de Dep&oacute;sito)</a></td>
          </tr>
          <tr> 
            <td align="right" class="textoNegrita"><img src="imagenes/img_word.jpg" width="28" height="30"></td>
            <td class="textoNegrita">&nbsp;&nbsp;&nbsp;<a href="javascript:guia(3)"  class="texto"> 
              29.0 KB ANEXO 3 (Usuario de Consulta</a>)</td>
          </tr>
          <tr> 
            <td align="right" class="textoNegrita"><img src="imagenes/img_word.jpg" width="28" height="30"></td>
            <td class="textoNegrita">&nbsp;&nbsp; &nbsp;<a href="javascript:guia(4)"  class="texto">28.0 
              KB ANEXO 4 (Usuario de Consulta y Dep&oacute;sito</a>)</td>
          </tr>
          <tr> 
            <td align="right" class="textoNegrita"><img src="imagenes/img_word.jpg" width="28" height="30"></td>
            <td class="textoNegrita">&nbsp;&nbsp;&nbsp; <a href="javascript:guia(5)"  class="texto"> 
              28.0 KB ANEXO 5 (Usuario de Captura)</a></td>
          </tr>
          <tr> 
            <td align="right" class="textoNegrita"><img src="imagenes/img_word.jpg" width="28" height="30"></td>
            <td class="textoNegrita">&nbsp;&nbsp;&nbsp; <a href="javascript:guia(6)"  class="texto">28.0 
              KB ANEXO 6 (Usuario Secretario de Actas</a>)</td>
          </tr>
          <tr> 
            <td align="right" class="textoNegrita">&nbsp;</td>
            <td class="textoNegrita">&nbsp;</td>
          </tr>
          <tr> 
            <td align="right" class="textoNegrita">&nbsp;</td>
            <td class="textoNegrita">&nbsp;</td>
          </tr>
          <tr> 
            <td colspan="2" align="right" class="textoNegrita"></td>
          </tr>
        </table>
        <table width="100%" border="0">
          <tr>
            <td height="43">
<table width="67%" border="0"  align="right">
                <tr>
                  <td width="66%" rowspan="2" align="right"><img src="imagenes/img_word.jpg" width="28" height="30"></td>
                  <td ><a href="formatos/acreditacion.doc"   class="textoNegrita"> 
                    73.0 KB Gu&iacute;a de Acreditaci&oacute;n</a> </td>
                </tr>
                <tr> 
                  <td width="34%" ><a href="formatos/acreditacion.doc"   class="textoNegrita">Formato 
                    Word </a><a name="guia"></a></td>
                </tr>
              </table></td>
          </tr>
        </table>
        <table  align="center">
          <tr align=middle valign=center> 
            <td height=30 align="center"> <a href="#top"><img border=0 height=11 src="imagenes/arriba.gif" width=59></a> 
            </td>
          </tr>
          <tr align=middle> 
            <td  height=7><img  height=1 src="imagenes/cnaranja01.gif" width=420></td>
          </tr>
        </table>
        <br> </TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
