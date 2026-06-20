package mx.com.inscitech.fiducia.business.reportes.processors.impl.honorarios;

import java.io.ByteArrayOutputStream;

import java.math.BigDecimal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;
import mx.com.inscitech.fiducia.business.reportes.processors.BaseProcessor;

/**
 * @see mx.com.inscitech.fiducia.business.reportes.processors.BaseProcessor
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class DevengadosImpl implements BaseProcessor {
    public DevengadosImpl() {
    }

    /**
     * @see mx.com.inscitech.fiducia.business.reportes.processors.BaseProcessor#getXmlReporte
     */
    public ByteArrayOutputStream getXmlReporte(List data, Map parameters) throws BusinessException {
        ByteArrayOutputStream dataSetXML = null;

        HashMap dataRow = null;
        Iterator keys = null;
        String key = null;

        BigDecimal acumulado = new BigDecimal(0);
        BigDecimal vencido30 = new BigDecimal(0);
        BigDecimal vencido60 = new BigDecimal(0);
        BigDecimal vencido90 = new BigDecimal(0);
        BigDecimal vencidoActual = new BigDecimal(0);
        BigDecimal vencidoAnterior = new BigDecimal(0);
        BigDecimal total = new BigDecimal(0);

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

                        if (key.equals("cveAcumulado"))
                            acumulado = new BigDecimal(acumulado.doubleValue() + ((BigDecimal) dataRow.get(key)).doubleValue());
                        else if (key.equals("cveVenc30"))
                            vencido30 = new BigDecimal(vencido30.doubleValue() + ((BigDecimal) dataRow.get(key)).doubleValue());
                        else if (key.equals("cveVenc60"))
                            vencido60 = new BigDecimal(vencido60.doubleValue() + ((BigDecimal) dataRow.get(key)).doubleValue());
                        else if (key.equals("cveVenc90"))
                            vencido90 = new BigDecimal(vencido90.doubleValue() + ((BigDecimal) dataRow.get(key)).doubleValue());
                        else if (key.equals("cveVencM90Ejeact"))
                            vencidoActual = new BigDecimal(vencidoActual.doubleValue() + ((BigDecimal) dataRow.get(key)).doubleValue());
                        else if (key.equals("cveVencM90Ejeant"))
                            vencidoAnterior = new BigDecimal(vencidoAnterior.doubleValue() + ((BigDecimal) dataRow.get(key)).doubleValue());
                        else if (key.equals("total"))
                            total = new BigDecimal(total.doubleValue() + ((BigDecimal) dataRow.get(key)).doubleValue());
                    }
                    dataRow = null;

                    dataSetXML.write("</RowInfo>".getBytes());
                }
            }

            dataSetXML.write("<TotalesInfo>".getBytes());
            dataSetXML.write(("  <cveAcumulado>" + acumulado + "</cveAcumulado>").getBytes());
            dataSetXML.write(("  <cveVenc30>" + vencido30 + "</cveVenc30>").getBytes());
            dataSetXML.write(("  <cveVenc60>" + vencido60 + "</cveVenc60>").getBytes());
            dataSetXML.write(("  <cveVenc90>" + vencido90 + "</cveVenc90>").getBytes());
            dataSetXML.write(("  <cveVencM90Ejeact>" + vencidoActual + "</cveVencM90Ejeact>").getBytes());
            dataSetXML.write(("  <cveVencM90Ejeant>" + vencidoAnterior + "</cveVencM90Ejeant>").getBytes());
            dataSetXML.write(("  <total>" + total + "</total>").getBytes());
            dataSetXML.write("</TotalesInfo>".getBytes());

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
            e.printStackTrace();
            throw new BusinessException("500", "No fue posible generar el reporte solicitado!");
        } finally {
            dataRow = null;
            keys = null;
            key = null;
        }
    }
}
