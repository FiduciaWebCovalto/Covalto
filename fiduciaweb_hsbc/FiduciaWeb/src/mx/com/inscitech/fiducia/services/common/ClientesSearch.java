package mx.com.inscitech.fiducia.services.common;

import java.util.HashMap;
import java.util.List;

import mx.com.inscitech.fiducia.procesos.xml.ClientField;
import mx.com.inscitech.fiducia.procesos.ClientNotFoundException;

public interface ClientesSearch {

    public void setEmulate(boolean emulate);

    public boolean getEmulate();

    public void setDebug(boolean debug);

    public boolean getDebug();

    public void setClientesURL(String clientesURL);

    public String getClientesURL();

    public void setClientFields(List<ClientField> clientFields);

    public List<ClientField> getClientFields();

    public void setClienteData(HashMap<String, String> clienteData);

    public HashMap<String, String> getClienteData();

    public void setUseClientFieldNames(boolean useClientFieldNames);

    public boolean isUseClientFieldNames();

    public void setPrefix(String prefix);

    public String getPrefix();

    public String getCadenaDatosCliente(String clienteID) throws ClientNotFoundException;

    //public ServiceData getDatosCliente(Integer numeroContrato);

}
