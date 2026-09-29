<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<HTML>
<HEAD><TITLE>Instrucciones  -  Aspectos Legales</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" type="text/JavaScript"></script>
</HEAD>

<BODY vLink=#052206 leftMargin=0  topMargin=0 marginwidth="0" marginheight="0" >

<jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
<div class="table-responsive" style="max-height: 900px; overflow-y: auto;">
    <table id="fisosDisponibles"  class="table table-responsive table-hover">
            <thead class="table-primary" align="center">
                <tr>
                    <th><h1 class="display-3">DIRECCION FIDUCIARIA</h1></th>
                </tr>
                <tr>
                    <th><h1 class="display-4">AVISOS LEGALES</h1></th>
                </tr>
            </thead>
            <tbody>
          <tr> 
            <td  align="center" valign="top">
                <table width="90%" border="0">
                <tr> 
                  <td > 
                    <hr size=6 noshade> <p class="textoNegrita">&iquest;Qu&eacute; 
                      es la Autoridad Certificadora?<br>
                    </p>
                    <p  class="texto" align="justify">Los Servicios de Certificaci&oacute;n 
                      Digital se ofrecen en base a una infraestructura jer&aacute;rquica 
                      en la que la funci&oacute;n principal es ejercida por la 
                      Autoridad Certificadora, en ella reside la facultad de habilitar 
                      a Agentes Certificadores para que act&uacute;en en su nombre 
                      en la emisi&oacute;n de un Certificado Digital. Las AC's 
                      pueden ser de car&aacute;cter privado o investidas de fe 
                      p&uacute;blica, en las de car&aacute;cter privado la responsabilidad 
                      en la identificaci&oacute;n del titular de un certificado 
                      recae en la propia entidad que lo emite. En las investidas 
                      de fe p&uacute;blica, esa responsabilidad recae en un Notario 
                      o un Corredor P&uacute;blico.</p>
                    <hr> <p  class="textoNegrita">&iquest;Qu&eacute; es una Firma 
                      Digital?</p>
                    <p class="texto" align="justify">Aplicaci&oacute;n de tecnolog&iacute;a 
                      inform&aacute;tica conocida como &#x201C;Criptograf&iacute;a 
                      de Clave P&uacute;blica&#x201D;.Las firmas digitales funcionan 
                      en los documentos electr&oacute;nicos como las firmas manuscritas 
                      lo hacen en los documentos impresos. La firma es una unidad 
                      de datos infalsificable que da fe de que una determinada 
                      persona ha escrito, o acepta, el documento en el que se 
                      ha estampado la firma. De hecho, las firmas digitales ofrecen 
                      un grado de seguridad mayor que las manuales.</p>
                    <p class="texto" align="justify">La implementaci&oacute;n 
                      de un Sistema Integral para la Certificaci&oacute;n y Registro 
                      de Firmas Digitales ofrece prueba inequ&iacute;voca de la 
                      autenticidad de un documento electr&oacute;nico firmado 
                      digitalmente y permite que:<br>
                    </p>
                    <p class="texto" align="justify">Se vincule &#x201C;Legalmente&#x201D; 
                      la identidad de un sujeto a su firma digital.<br>
                    </p>
                    <p class="texto" align="justify">Que el mensaje no ha sufrido 
                      modificaciones, ni intencionada ni accidentalmente, desde 
                      que se firm&oacute;.</p>
                    <p class="texto" align="justify">Se garantice la &#x201C;No 
                      Duplicidad&#x201D; de las Claves (P&uacute;blica y Privada). 
                      Por tanto las firmas digitales son seguras y no pueden negarse. 
                      La persona que firme un documento no podr&aacute; negarlo 
                      despu&eacute;s afirmando que se ha falsificado la firma.<br>
                    </p>
                    <p class="texto" align="justify">Se distribuya o &#x201C;Publicite&#x201D; 
                      de manera confiable la clave p&uacute;blica de los distintos 
                      sujetos.</p>
                    <p class="texto" align="justify">El usuario genera en su computadora 
                      sus claves, p&uacute;blica y privada, y lleva su Clave P&uacute;blica 
                      a CERTIFICAR con un Agente Certificador, un Notario. El 
                      Agente Certificador, el Notario, da fe de que una persona 
                      es quien dice ser y que acepta como suya una Clave P&uacute;blica, 
                      generando un pre-certificado. La Autoridad Certificadora 
                      es la entidad encargada de verificar el pre-certificado, 
                      de emitir los certificados solicitados por sus agentes certificadores 
                      y de enviarlos a registrar. La Autoridad Registradora realiza 
                      y mantiene el registro de los certificados emitidos por 
                      las Autoridades Certificadoras y publica, electr&oacute;nicamente, 
                      la lista de los certificados emitidos. La Autoridad Registradora 
                      Central mantiene el registro de los certificados emitidos 
                      por las Autoridades Certificadoras y las listas de los certificados 
                      registrados por las Autoridades Registradoras.</p>
                    <p class="texto" align="justify">Las firmas digitales posibilitan 
                      la &quot;autentificaci&oacute;n&quot; de los mensajes digitales, 
                      garantizando a los destinatarios de &eacute;stos tanto la 
                      identidad del remitente como la integridad del mensaje.<br>
                    </p>
                    <hr> <p class="textoNegrita">&iquest;Qu&eacute; es un Certificado 
                      Digital?</p>
                    <p class="texto" align="justify">El Certificado Digital es 
                      en s&iacute; un documento firmado digitalmente por una persona 
                      o entidad denominada <b>Autoridad Certificadora</b>, dicho 
                      documento establece una liga entre un sujeto y su llave 
                      p&uacute;blica. Es decir, el Certificado Digital es un documento 
                      firmado por la Autoridad Certificadora (AC), el cual contiene 
                      el nombre de un sujeto y su llave p&uacute;blica.</p>
                    <hr> <p class="textoNegrita">&iquest;Para qu&eacute; sirve 
                      y c&oacute;mo se usa el Certificado Digital?</p>
                    <p class="texto" align="justify">En un flujo de transacciones 
                      en donde las partes ya no tienen contacto &quot;f&iacute;sico&quot; 
                      &iquest;c&oacute;mo pueden asegurarse de la identidad de 
                      aquel con qui&eacute;n est&aacute;n realizando una operaci&oacute;n? 
                      e incluso &iquest;c&oacute;mo pueden tener certeza de que 
                      la informaci&oacute;n intercambiada no ha sido robada, alterada 
                      o conocida por personas ajenas?. Con la Firma Digital se 
                      dispone de un mecanismo de certificaci&oacute;n &uacute;nico 
                      que contribuye a proporcionar seguridad t&eacute;cnica y 
                      jur&iacute;dica en las transacciones de comercio electr&oacute;nico, 
                      superando las barreras del concepto tradicional de firma 
                      e incorporando el valor de la fe p&uacute;blica ejercida 
                      por los Notarios y Corredores P&uacute;blicos. Para ello 
                      ha sido creada la Red de Certificaci&oacute;n Digital, una 
                      infraestructura que se da como resultado de la alianza estrat&eacute;gica 
                      establecida entre la Asociaci&oacute;n Nacional del Notariado 
                      Mexicano, el Colegio Nacional de Corredur&iacute;a P&uacute;blica 
                      Mexicana as&iacute; como la empresa SeguriDATA y que responde 
                      a los retos y expectativas de esta nueva forma de hacer 
                      negocios. La infraestructura de la Red de Certificaci&oacute;n 
                      Digital, contempla los aspectos jur&iacute;dico, t&eacute;cnico 
                      y comercial necesarios para dar respuesta a la creciente 
                      demanda para soportar y garantizar que la realizaci&oacute;n 
                      de transacciones por medios electr&oacute;nicos cumpla con 
                      los aspectos de:</p>
                    <p class="textoNegrita" >Autenticidad<br>
                    </p>
                    <p class="texto">Para verificar y demostrar que un mensaje 
                      de datos ha sido enviado por la persona que dice haberlo 
                      enviado y que reconoce el contenido del mensaje como propio.</p>
                    <p class="textoNegrita" >Confidencialidad<br>
                    </p>
                    <p class="texto">Para garantizar que la informaci&oacute;n 
                      que es intercambiada en un mensaje de datos permanezca como 
                      inaccesible para terceros ajenos a &eacute;l.</p>
                    <p class="textoNegrita" >Integridad<br>
                    </p>
                    <p class="texto"> M&eacute;todo que permite saber si la informaci&oacute;n 
                      ha sido alterada en el transcurso entre su env&iacute;o 
                      y recepci&oacute;n, para que as&iacute; puedan tomarse las 
                      medidas correspondientes.<br>
                    </p>
                    <p class="textoNegrita" >No Repudiaci&oacute;n<br>
                    </p>
                    <p class="texto"> Para proporcionar certeza de que la transacci&oacute;n 
                      ha sido realizada de tal forma que las partes no la puedan 
                      negar.</p>
                    <hr> <p class="textoNegrita">Tipos de Certificado Digital</p>
                    <p class="texto" align="justify">La Asociaci&oacute;n Nacional 
                      del Notariado Mexicano emite 4 clases de certificados digitales:</p>
                    <ul>
                      <li> 
                        <p class="textoNegrita">Certificado de Dominio</p>
                        <p class="texto"  align="justify">La certificaci&oacute;n 
                          de un sitio web genera confianza entre sus clientes 
                          y ofrece un valor adicional, pues es un Fedatario P&uacute;blico 
                          quien realiza dicha certificaci&oacute;n. Adicionalmente, 
                          en algunos pa&iacute;ses el manejo de la informaci&oacute;n 
                          que los usuarios proporcionan en un sitio web est&aacute; 
                          regulada y debe darse conforme a ciertas reglas. En 
                          el caso de M&eacute;xico, la Ley Federal de Protecci&oacute;n 
                          al Consumidor define en su art&iacute;culo 76 bis, esas 
                          reglas.<br>
                        </p>
                        <p class="texto"  align="justify">La certificaci&oacute;n 
                          de un sitio web puede ser ampliada a la validaci&oacute;n 
                          sobre la implementaci&oacute;n y cumplimiento de pol&iacute;ticas 
                          de privacidad y a la validaci&oacute;n del nivel de 
                          calidad en la pr&aacute;cticas comerciales de la empresa 
                          que est&aacute; detr&aacute;s de dicho sitio. Sin embargo, 
                          por el momento el servicio Sitio Certificado s&oacute;lo 
                          se limita a la validaci&oacute;n del perfil legal y 
                          comercial de la empresa que est&aacute; detr&aacute;s 
                          de un sitio web y a la validaci&oacute;n de la implementaci&oacute;n 
                          de un certificado SSL de 128 bits en dicho sitio.</p>
                      <li> 
                        <p class="textoNegrita">Certificado para Persona F&iacute;sica</p>
                        <p class="texto" align="justify">Son Certificados que 
                          utilizan los usuarios cuando intercambian mensajes con 
                          otras personas o servicios en l&iacute;nea.</p>
                      <li> 
                        <p class="textoNegrita">Certificado para Persona Moral</p>
                        <p class="textoNegrita">Son certificados que se emiten 
                          al representante legal de una empresa.</p>
                      <li> 
                        <p class="texto" align="justify">Certificaci&oacute;n 
                          de C&oacute;digo</p>
                        <p class="texto" align="justify">Son Certificados usados 
                          para identificar al autor de porciones de c&oacute;digo 
                          en cualquier lenguaje de programaci&oacute;n que se 
                          deba ejecutar en red. Cuando un c&oacute;digo de este 
                          tipo pueda resultar peligroso para el sistema del usuario, 
                          el navegador lanza un aviso de alerta, en el que figurar&aacute; 
                          si existe certificado que avale al c&oacute;digo, con 
                          lo que el usuario puede elegir si conf&iacute;a en el 
                          autor, dejando que se ejecute el c&oacute;digo o si 
                          por el contrtario no conf&iacute;a en &eacute;l, con 
                          lo que el c&oacute;digo ser&aacute; rechazado.</p>
                    </ul>
                    <hr> <p class="textoNegrita">&iquest;C&oacute;mo se gestiona 
                      un Certificado Digital?</p>
                    <p class="texto" align="justify">El Usuario genera en su computadora 
                      su Requerimiento de Certificaci&oacute;n y sus Claves. Con 
                      el Requerimiento de Certificaci&oacute;n y la documentaci&oacute;n 
                      que compruebe su identidad, acude con un Fedatario P&uacute;blico. 
                      El Fedatario P&uacute;blico revisa la informaci&oacute;n 
                      presentada por el usuario, da fe de su identidad y procede 
                      a emitir un Certificado Digital. Por medio de un proceso 
                      en l&iacute;nea el Fedatario P&uacute;blico se enlaza con 
                      la Agencia Certificadora y &eacute;sta a su vez con la Agencia 
                      Registradora para solicitar la emisi&oacute;n del Certificado 
                      Digital definitivo. Verificando que no exista duplicidad 
                      de claves. El Fedatario P&uacute;blico recibe el Certificado 
                      Digital y lo entrega al usuario. A partir de ese momento 
                      el Usuario podr&aacute; realizar comercio electr&oacute;nico 
                      seguro.</p></td>
                </tr>
              </table>
            </td>
          </tr>
            
        </tbody>
    </table>
</div>
</BODY>
</HTML>
