<form name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td rowspan="7" width="10%" height="100%">
        &nbsp; 
        <input type="hidden" id="paramInterfaceID" name="paramInterfaceID" value=""/>
         
        <input type="hidden" id="paramFechaAnt" name="paramFechaAnt" value=""/>
         
        <input type="hidden" id="paramMesAbierto" name="paramMesAbierto" value="1"/>
         
        <input type="hidden" id="paramUsuario" name="paramUsuario" value="603"/>
      </td>
      <td height="100%">&nbsp;</td>
      <td rowspan="7" width="10%" height="100%">&nbsp;</td>
    </tr>
     
    <tr>
      <td align="center" height="100%" class="titulo">Carga de Archivos</td>
    </tr>
     
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
     
    <tr>
      <td height="100%">
        <table class="texto">
          <tr>
            <td>&nbsp;</td>
            <td nowrap="nowrap" colspan="5">&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
        </table>
      </td>
    </tr>
     
    <tr>
      <td width="80%">
        Fecha: &nbsp;<input type="text" id="paramFecha" name="paramFecha" tipo="Fecha" onblur="descomponeFecha(this)" required="required" style="width:100px;"/>
      </td>
    </tr>
     
    <tr>
      <td width="80%">Interface a Ejecutar:
        <select id="slcReportes" name="slcReportes" border="0" onchange="cambiaInterface(this.value)" required="required"
                style="width:100px;">
          <option value="-1">
            -- Seleccione --
          </option>
          <option value="1">
            JUICIOS
          </option>
          <option value="2">
            EMBARGOS
          </option>
          <option value="3">
            RDCL
          </option>
          <option value="4">
            PODERES
          </option>   
          <option value="5">
            KYC PERSONA MORAL NACIONAL
          </option>            
          <option value="6">
            KYC PERSONA MORAL EXTRANJERA
          </option>            
          <option value="7">
            CSEM
          </option>   
          <option value="8">
            DOCUMENTOS FALTANTES
          </option>            

        </select>
      </td>
    </tr>
     
    <tr>
      <td width="80%">Tipo de Archivo<br/>
        <input type="radio" id="tipoXLS" name="tipoArch" value="XLS" checked="true"/>Excel 
      </td>
    </tr>
     
    <tr valign="middle">
      <td colspan="4" align="center" class="subtitulo" width="30%">
        <a id="ligaArchivo" href="#" style="visibility:hidden">Archivo</a>
      </td>
     
    <tr>
      <td width="10%">&nbsp;</td>
      <td width="80%">
        <iframe id="frameUpload" name="frameUpload" align="center" style="z-index:1;visibility:visible;" src="<%=request.getContextPath()%>/modules/Honorarios/\CargaProvisiones/InformacionMasivaSATUpload.do" frameborder="0" scrolling="no" width="600" height="50" allowtransparency="AllowTransparency"></iframe><!--iframe id="frameUpload" name="frameUpload" align="center" style="z-index:1;" src="<%=request.getContextPath()%>/modules/Tesoreria/Interfaces/TasUpload.do" frameborder="0" scrolling="no" width="600" height="50" AllowTransparency></iframe-->
        <div id="dvInterface" class="texto"></div>
      </td>
    </tr>
     
    <tr align="center">
      <td width="80%" colspan="5">
        <input type="button" value="Recuperar" name="cmdCargar" class="btn btn-primary" onclick="subirArchivo();"/> <!--Subir Archivo-->         
      </td>
    </tr>
     <tr>
      <td width="80%" colspan="5">
        <input type="button" value="Procesar otro archivo" name="cmdNuevo" id="cmdNuevo" class="btn btn-primary" onclick="onButtonClickPestania("Tesoreria.Interfaces.PrincipalTAS","");" style="visibility:hidden"/> <!--Subir Archivo-->         
        </td>
    </tr>
  </table>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
  </tr>
  </table>
</form>