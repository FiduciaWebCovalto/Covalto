package mx.com.inscitech.fiducia.business.reportes.processors.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.ByteArrayOutputStream;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;
import mx.com.inscitech.fiducia.business.reportes.processors.BaseProcessor;

/**
 * Clase generica para la generacion de archivos XML.
 * @see mx.com.inscitech.fiducia.business.reportes.processors.BaseProcessor
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class GenericProcessor implements BaseProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(GenericProcessor.class);

    public GenericProcessor() {
    }

    /**
     * @see mx.com.inscitech.fiducia.business.reportes.processors.BaseProcessor#getXmlReporte
     */
    public ByteArrayOutputStream getXmlReporte(List data, Map parameters) throws BusinessException {
        ByteArrayOutputStream dataSetXML = null;

        HashMap dataRow = null;
        Iterator keys = null;
        String key = null;

        try {

            dataSetXML = new ByteArrayOutputStream();

            dataSetXML.write("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>".getBytes());
            dataSetXML.write("<ReportInfo>".getBytes());
            dataSetXML.write("<QueryInfo>".getBytes());

            if (data.size() <= 0) {
                dataSetXML.write("<RowInfo><Result>No se encontraron Resultados</Result></RowInfo>".getBytes());
            } else {
                for (int i = 0; i < data.size(); i++) {
                    dataRow = (HashMap) data.get(i);

                    dataSetXML.write("<RowInfo>".getBytes());

                    keys = dataRow.keySet().iterator();
                    while (keys.hasNext()) {
                        key = (String) keys.next();
                        dataSetXML.write(("<" + key + ">" + (dataRow.get(key) == null ? "" : dataRow.get(key).toString()) + "</" + key + ">").getBytes());
                    }
                    dataRow = null;

                    dataSetXML.write("</RowInfo>".getBytes());
                }
            }

            dataSetXML.write("<AditionalInfo>".getBytes());

            keys = parameters.keySet().iterator();
            while (keys.hasNext()) {
                key = (String) keys.next();
                if (key.toLowerCase().indexOf("repinfo") != -1)
                    dataSetXML.write(("<" + key.substring(7) + ">" + parameters.get(key).toString() + "</" + key.substring(7) + ">").getBytes());
            }


            dataSetXML.write("</AditionalInfo>".getBytes());

            dataSetXML.write("</QueryInfo>".getBytes());
            dataSetXML.write("</ReportInfo>".getBytes());

            return dataSetXML;

        } catch (Exception e) {
            LOGGER.error("Exception: ", e);
            throw new BusinessException("500", "No fue posible generar el reporte solicitado!");
        } finally {
            dataRow = null;
            keys = null;
            key = null;
        }
    }
}
