package mx.com.inscitech.fiducia.business.contabilidad;

import java.util.HashMap;
import java.util.Map;

import mx.com.inscitech.fiducia.common.export.txt.TxtDataStructure;

public class PeopleSoft {

    private static Map<String, TxtDataStructure> FIELDS_CONFIGURATION;

    static {
        FIELDS_CONFIGURATION = new HashMap<>();

        FIELDS_CONFIGURATION.put("", new TxtDataStructure());
    }

    public PeopleSoft() {
        super();
    }
}
