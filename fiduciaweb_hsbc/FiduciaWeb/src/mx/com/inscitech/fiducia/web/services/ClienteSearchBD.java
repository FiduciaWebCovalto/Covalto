package mx.com.inscitech.fiducia.web.services;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Level;

import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.procesos.ClientNotFoundException;
import mx.com.inscitech.fiducia.procesos.xml.ClientField;
import mx.com.inscitech.fiducia.services.common.ClientesSearch;
import mx.com.inscitech.fiducia.services.common.ServiceAttribute;
import mx.com.inscitech.fiducia.services.common.ServiceData;


public class ClienteSearchBD implements ClientesSearch {

    private boolean emulate = false;
    private boolean debug = false;

    private LoggingService logger = null;

    private String clientesURL = null;

    private boolean useClientFieldNames = false;

    private List<ClientField> clientFields = null;
    private HashMap<String, String> clienteData = null;
    private String prefix = null;

    public ClienteSearchBD() {
        super();
        logger = LoggingService.getNewInstance();
    }

    public String getCadenaDatosCliente(String clienteID) throws ClientNotFoundException {
        String cadenaCilente = "";

        if ("".equals(prefix))
            cadenaCilente = prefix + "|";

        cadenaCilente += "" + clienteID + "|";

        if (debug)
            logger.log(ClienteSearchBD.class, Thread.currentThread(), Level.DEBUG, "Get Datos Cliente. ClienteID: '" + clienteID + "' Emulate: " + emulate);

        if (emulate) {

            cadenaCilente += "03|" + clienteID + "|00000000000|HSBC|MEXICO|DIRECCION|CIUDAD|CP| |";
            clienteData = new HashMap<String, String>();

            clienteData.put("REQUESTED_CLIENT_ID", clienteID);
            clienteData.put("NOMBRE", "JAVIER DB PEREZ LOPEZ");
            clienteData.put("RFC", "AAAA000000BBB");
            clienteData.put("CALLE", "LOMA BONITA 22");
            clienteData.put("NOEXTERIOR", "1");
            clienteData.put("NOINTERIOR", "301");
            clienteData.put("COLONIA", "ENSUENOS");
            clienteData.put("POBLACION", "CENTRO CIUDAD SANTA FE");
            clienteData.put("ESTADO ID", "9");
            clienteData.put("ESTADO", "DISTRITO FEDERAL");
            clienteData.put("PAIS", "MEXICO");
            clienteData.put("CP", "54740");
            clienteData.put("LADA", "55");
            clienteData.put("TELEFONO", "555555555");
            clienteData.put("CLAVE CONTACTO", "3124");
            clienteData.put("EMAIL", "jessy.garcia.haz@gmail.com");
            clienteData.put("LOCALIDAD", "Alvaro Obregon");
            clienteData.put("MUNICIPIO", "Alvaro Obregon");
            clienteData.put("CONTRATO", "355");

        } else {

            ClientField clientField = null;
            String fieldValue = "";

            ClientesSearchService clientesService = new ClientesSearchService();
            clienteData = wsClientDataToMap(clientesService.getDatosCliente(Integer.parseInt(clienteID)));

            for (int i = 0; i < clientFields.size(); i++) {
                clientField = clientFields.get(i);

                fieldValue = clienteData.get(clientField.getSource());
                if (fieldValue == null) {
                    if (debug)
                        logger.log(ClienteSearchBD.class, Thread.currentThread(), Level.DEBUG,
                                   "El campo '" + clientField.getSource() + "' es nulo. Asignando valor por defecto: '" + clientField.getDefaultValue() + "'");
                    fieldValue = clientField.getDefaultValue();
                }

                clienteData.remove(clientField.getSource());

                if (debug)
                    logger.log(ClienteSearchBD.class, Thread.currentThread(), Level.DEBUG,
                               "Agregando datos del cliente! Campo Origen: '" + clientField.getSource() + "' Valor: '" + fieldValue + "' Guardar Como: '" + clientField.getValue() +
                               "'");
                clienteData.put(clientField.getValue(), fieldValue);

                cadenaCilente += (useClientFieldNames ? clientField.getSource() + ":" : "");
                cadenaCilente += (fieldValue == null ? clientField.getDefaultValue() : fieldValue) + "|";
            }

            cadenaCilente = cadenaCilente.substring(0, cadenaCilente.length() - 1);

        }

        return cadenaCilente;
    }

    private HashMap<String, String> wsClientDataToMap(ServiceData clienteData) throws ClientNotFoundException {

        HashMap<String, String> result = new HashMap<String, String>();

        if (clienteData == null || clienteData.getAtributos() == null || clienteData.getAtributos().size() <= 0) {
            throw new ClientNotFoundException("El cliente consultado no fue encontrado!");
        }

        List<ServiceAttribute> attribs = clienteData.getAtributos();

        ServiceAttribute attr = null;

        if (debug)
            logger.log(ClienteSearchBD.class, Thread.currentThread(), Level.DEBUG, "Client Data to Map. Attribs: " + attribs.size());

        for (int i = 0; i < attribs.size(); i++) {
            attr = attribs.get(i);
            result.put(attr.getName(), attr.getValue());
            if (debug)
                logger.log(ClienteSearchBD.class, Thread.currentThread(), Level.DEBUG, "Add Attribute '" + attr.getName() + " Value: " + attr.getValue());
        }

        return result;
    }

    public void setEmulate(boolean emulate) {
        this.emulate = emulate;
    }

    public boolean getEmulate() {
        return emulate;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public boolean getDebug() {
        return debug;
    }

    public void setClientesURL(String clientesURL) {
        this.clientesURL = clientesURL;
    }

    public String getClientesURL() {
        return clientesURL;
    }

    public void setUseClientFieldNames(boolean useClientFieldNames) {
        this.useClientFieldNames = useClientFieldNames;
    }

    public boolean isUseClientFieldNames() {
        return useClientFieldNames;
    }

    public void setClientFields(List<ClientField> clientFields) {
        this.clientFields = clientFields;
    }

    public List<ClientField> getClientFields() {
        return clientFields;
    }

    public void setClienteData(HashMap<String, String> clienteData) {
        this.clienteData = clienteData;
    }

    public HashMap<String, String> getClienteData() {
        return clienteData;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}
