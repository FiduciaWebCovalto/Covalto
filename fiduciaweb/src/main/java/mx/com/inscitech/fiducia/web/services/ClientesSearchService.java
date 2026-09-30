package mx.com.inscitech.fiducia.web.services;

import javax.jws.WebService;

import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import mx.com.inscitech.fiducia.dml.GenericDML;
import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.services.common.ServiceAttribute;
import mx.com.inscitech.fiducia.services.common.ServiceData;

@WebService(serviceName = "ClientesSearchService", portName = "ClientesSearchServiceSoap12HttpPort")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class ClientesSearchService {

    private GenericDML genericDML = null;
    private String strSQL = "";

    public ClientesSearchService() {
        super();
    }

    public ServiceData getDatosCliente(Integer numeroContrato) {
        ServiceData clienteData = null;
        DataRow clienteDB = null;

        strSQL =
            "SELECT CON_NUM_CONTRATO, CON_NUM_SEC_CONTAC, CON_NOM_CONTACTO, CON_RFC, CON_CALLE_NUM, CON_NOM_COLONIA, " +
            "CON_NOM_POBLACION, CON_CODIGO_POSTAL, CON_NUM_ESTADO, CON_NOM_ESTADO, CON_NUM_PAIS, CON_NOM_PAIS, " +
            "CON_NUM_LADA_CASA, CON_NUM_TELEF_CASA, CON_NUM_LADA_OFIC, CON_NUM_TELEF_OFIC, CON_NUM_EXT_OFIC, " +
            "CON_NUM_LADA_FAX, CON_NUM_TELEF_FAX, CON_NUM_EXT_FAX, CON_ANO_ALTA_REG, CON_MES_ALTA_REG, CON_DIA_ALTA_REG, " +
            "CON_ANO_ULT_MOD, CON_MES_ULT_MOD, CON_DIA_ULT_MOD, CON_CVE_ST_CONTACT, CON_CARGO, CON_DEPENDENCIA, CON_COMENTARIO " + "FROM CONTACTO WHERE CON_NUM_SEC_CONTAC = ?";

        genericDML = new GenericDML();

        clienteDB = genericDML.getDataRow(strSQL, new Object[] { numeroContrato });

        if (clienteDB != null && clienteDB.getString("CON_NOM_CONTACTO") != null) {

            clienteData = new ServiceData();

            clienteData.addAttribute(new ServiceAttribute("CON_NUM_CONTRATO", "" + clienteDB.getInteger("CON_NUM_CONTRATO")));
            clienteData.addAttribute(new ServiceAttribute("CON_NUM_SEC_CONTAC", "" + clienteDB.getInteger("CON_NUM_SEC_CONTAC")));
            clienteData.addAttribute(new ServiceAttribute("CON_NOM_CONTACTO", clienteDB.getString("CON_NOM_CONTACTO")));
            clienteData.addAttribute(new ServiceAttribute("CON_RFC", clienteDB.getString("CON_RFC")));
            clienteData.addAttribute(new ServiceAttribute("CON_CALLE_NUM", clienteDB.getString("CON_CALLE_NUM")));
            clienteData.addAttribute(new ServiceAttribute("CON_NOM_COLONIA", clienteDB.getString("CON_NOM_COLONIA")));
            clienteData.addAttribute(new ServiceAttribute("CON_NOM_POBLACION", clienteDB.getString("CON_NOM_POBLACION")));
            clienteData.addAttribute(new ServiceAttribute("CON_CODIGO_POSTAL", clienteDB.getString("CON_CODIGO_POSTAL")));
            clienteData.addAttribute(new ServiceAttribute("CON_NUM_ESTADO", "" + clienteDB.getInteger("CON_NUM_ESTADO")));
            clienteData.addAttribute(new ServiceAttribute("CON_NOM_ESTADO", clienteDB.getString("CON_NOM_ESTADO")));
            clienteData.addAttribute(new ServiceAttribute("CON_NUM_PAIS", "" + clienteDB.getInteger("CON_NUM_PAIS")));
            clienteData.addAttribute(new ServiceAttribute("CON_NOM_PAIS", clienteDB.getString("CON_NOM_PAIS")));
            clienteData.addAttribute(new ServiceAttribute("CON_NUM_LADA_CASA", clienteDB.getString("CON_NUM_LADA_CASA")));
            clienteData.addAttribute(new ServiceAttribute("CON_NUM_TELEF_CASA", clienteDB.getString("CON_NUM_TELEF_CASA")));
            clienteData.addAttribute(new ServiceAttribute("CON_NUM_LADA_OFIC", clienteDB.getString("CON_NUM_LADA_OFIC")));
            clienteData.addAttribute(new ServiceAttribute("CON_NUM_TELEF_OFIC", clienteDB.getString("CON_NUM_TELEF_OFIC")));
            clienteData.addAttribute(new ServiceAttribute("CON_NUM_EXT_OFIC", clienteDB.getString("CON_NUM_EXT_OFIC")));
            clienteData.addAttribute(new ServiceAttribute("CON_NUM_LADA_FAX", clienteDB.getString("CON_NUM_LADA_FAX")));
            clienteData.addAttribute(new ServiceAttribute("CON_NUM_TELEF_FAX", clienteDB.getString("CON_NUM_TELEF_FAX")));
            clienteData.addAttribute(new ServiceAttribute("CON_NUM_EXT_FAX", clienteDB.getString("CON_NUM_EXT_FAX")));
            clienteData.addAttribute(new ServiceAttribute("CON_ANO_ALTA_REG", "" + clienteDB.getInteger("CON_ANO_ALTA_REG")));
            clienteData.addAttribute(new ServiceAttribute("CON_MES_ALTA_REG", "" + clienteDB.getInteger("CON_MES_ALTA_REG")));
            clienteData.addAttribute(new ServiceAttribute("CON_DIA_ALTA_REG", "" + clienteDB.getInteger("CON_DIA_ALTA_REG")));
            clienteData.addAttribute(new ServiceAttribute("CON_ANO_ULT_MOD", "" + clienteDB.getInteger("CON_ANO_ULT_MOD")));
            clienteData.addAttribute(new ServiceAttribute("CON_MES_ULT_MOD", "" + clienteDB.getInteger("CON_MES_ULT_MOD")));
            clienteData.addAttribute(new ServiceAttribute("CON_DIA_ULT_MOD", "" + clienteDB.getInteger("CON_DIA_ULT_MOD")));
            clienteData.addAttribute(new ServiceAttribute("CON_CVE_ST_CONTACT", clienteDB.getString("CON_CVE_ST_CONTACT")));
            clienteData.addAttribute(new ServiceAttribute("CON_CARGO", clienteDB.getString("CON_CARGO")));
            clienteData.addAttribute(new ServiceAttribute("CON_DEPENDENCIA", clienteDB.getString("CON_DEPENDENCIA")));
            clienteData.addAttribute(new ServiceAttribute("CON_COMENTARIO", clienteDB.getString("CON_COMENTARIO")));

            clienteDB.close();
            clienteDB = null;
        }

        return clienteData;
    }
}
