package mx.com.inscitech.fiducia.business.upload.processors;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.lang.reflect.Method;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mx.com.inscitech.fiducia.domain.ArchivosPlanos;
import mx.com.inscitech.fiducia.domain.Opertran;

import mx.com.inscitech.fiducia.business.upload.FieldInfo;
import mx.com.inscitech.fiducia.business.upload.UploadProcessor;
import mx.com.inscitech.fiducia.common.beans.ParametroQueryBean;

import org.apache.commons.fileupload.FileItem;


/**
 * Clase encargada de procesar los archivos recibidos para la interfaz del TAS
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class TasProcessorImpl extends UploadProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(TasProcessorImpl.class);


    /**
     * Variable que tiene la informacion del header del archivo del TAS
     */
    private static List headerInfo;

    /**
     * Variable que tiene la informacion del cuerpo del archivo del TAS
     */
    private static List bodyInfo;


    static {
        headerInfo = new ArrayList();
        bodyInfo = new ArrayList();

        headerInfo.add(new FieldInfo("Parte del Archivo", Long.valueOf(1), ""));
        headerInfo.add(new FieldInfo("Numero de Operaciones", Long.valueOf(5), ""));
        headerInfo.add(new FieldInfo("Importe de las Operaciones", Long.valueOf(21), ""));
        headerInfo.add(new FieldInfo("Intermediario", "5", ""));
        headerInfo.add(new FieldInfo("Ceros", Long.valueOf(190), ""));

        bodyInfo.add(new FieldInfo("Parte del Archivo", Long.valueOf(1), "")); // Procesar solo los que tienen 3
        bodyInfo.add(new FieldInfo("Contrato de Inversion", Long.valueOf(15), "TraContratoInter"));
        bodyInfo.add(new FieldInfo("Fecha de operacion", "", "10", "TraFecInicioPer", "dd/MM/yyyy"));

        bodyInfo.add(new FieldInfo("Fecha de liquidacion", "", "10", "TraFecCorte", "dd/MM/yyyy", true));
        bodyInfo.add(new FieldInfo("Fecha de liquidacion Dia", "Dia de la fecha de liquidacion", Integer.valueOf(2), "TraDiaMovto"));
        bodyInfo.add(new FieldInfo("Slash Fecha", "Slash de la fecha de liquidacion", Integer.valueOf(1), null));
        bodyInfo.add(new FieldInfo("Fecha de liquidacion Mes", "Mes de la fecha de liquidacion", Integer.valueOf(2), "TraMesMovto"));
        bodyInfo.add(new FieldInfo("Slash Fecha", "Slash de la fecha de liquidacion", Integer.valueOf(1), null));
        bodyInfo.add(new FieldInfo("Fecha de liquidacion Año", "Año de la fecha de liquidacion", Integer.valueOf(4), "TraAnoMovto"));

        bodyInfo.add(new FieldInfo("Tipo de Movimiento", Integer.valueOf(2), "TraTipoMovimient"));
        bodyInfo.add(new FieldInfo("Tipo de Operacion", "15", ""));

        bodyInfo.add(new FieldInfo("Tipo de Valor o Pizarra", "2", "TraTipoValor"));
        bodyInfo.add(new FieldInfo("Nombre de la Emisora", "10", "TraNomPizarra"));
        bodyInfo.add(new FieldInfo("Serie", "7", "TraNumSerie"));
        bodyInfo.add(new FieldInfo("Cupon", Integer.valueOf(5), "TraNumCupon"));
        bodyInfo.add(new FieldInfo("Numero de Titulos", Long.valueOf(12), "TraNumTitulos"));
        bodyInfo.add(new FieldInfo("Precio Unitario", Double.valueOf(27), "TraImpPrecio"));
        bodyInfo.add(new FieldInfo("Tasa", Double.valueOf(27), "TraPjeTasa"));
        bodyInfo.add(new FieldInfo("Sobre Tasa", Double.valueOf(27), "TraPjeStasa"));
        bodyInfo.add(new FieldInfo("Plazo", Integer.valueOf(6), "TraNumPlazo"));
        bodyInfo.add(new FieldInfo("Importe de la Operacion", Double.valueOf(21), "TraImpTitulos"));
        bodyInfo.add(new FieldInfo("Referencia del Movto", "8", "TraNumFactura"));
        bodyInfo.add(new FieldInfo("Moneda", Integer.valueOf(2), "TraMoneda"));
        bodyInfo.add(new FieldInfo("Forma Cobro/Pago", Long.valueOf(3), ""));
        bodyInfo.add(new FieldInfo("Vector", Double.valueOf(27), "TraVector"));
        bodyInfo.add(new FieldInfo("Precio de Mercado", Double.valueOf(27), "TraPrecioMerca"));
        bodyInfo.add(new FieldInfo("Minusvalía/Plusvalía", Double.valueOf(15), "TraMinusPlus")); // Se cambio de 27 a 15 no cuadra la longitud de la linea
    }

    public TasProcessorImpl() {
        super();
    }

    public void run() {

        // TODO: Si la fecha del archivo no coincide con la especificada por el cliente mandar error
        boolean isHeader = true;

        logSrv.log(this, Thread.currentThread(), INFO, "Procesando Archivo TAS");

        FileItem file = null;
        String fileName = null;

        BufferedReader tasFileReader = null;
        ArchivosPlanos archivosPlanos = null;

        String line = null;
        String newLine = null;

        FieldInfo field = null;
        Opertran operTran = null;
        String methodName = null;
        Method setter = null;
        String linea = null;
        String fieldValue = null;
        String sql = null;
        String secuencia = null;
        String fechaArchivo = null;

        String tipoReg = null;
        int secuencial = 1;

        try {

            file = (FileItem) this.files.get(0);
            fileName = file.getName();

            if (fileName.indexOf("\\") != -1)
                fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
            if (fileName.indexOf("/") != -1)
                fileName = fileName.substring(fileName.lastIndexOf("/") + 1);

            tasFileReader = new BufferedReader(new InputStreamReader(file.getInputStream()));

            int i = 0, indx = 0;

            while (tasFileReader.ready()) {

                linea = tasFileReader.readLine();
                if (linea.trim().equals(""))
                    continue;

                if (isHeader) {
                    //logger.log(this, Thread.currentThread(), Level.DEBUG, "Procesando Encabezado.");
                    for (i = 0; i < headerInfo.size(); i++) {
                        field = (FieldInfo) headerInfo.get(i);
                        //LOGGER.debug("field.getLength(): " + field.getLength() + " indx: " + indx);
                        //LOGGER.debug("\nCampo: " + field.getName() + "\nvalor: " + linea.substring(indx, indx+field.getLength()) + "\nlongitud: " + linea.substring(indx, indx+field.getLength()).length());
                        //logger.log(this, Thread.currentThread(), Level.DEBUG, "\nCampo: " + field.getName() + "\nvalor: " + linea.substring(indx, indx+field.getLength()) + "\nlongitud: " + linea.substring(indx, field.getLength()).length());
                        indx += field.getLength();
                    }

                    isHeader = false;

                } else {

                    tipoReg = linea.substring(0, 1);

                    if (tipoReg.equals("3")) {
                        // codigo OPERTRAN----
                        indx = 0;
                        operTran = new Opertran();

                        for (i = 0; i < bodyInfo.size(); i++) {
                            field = (FieldInfo) bodyInfo.get(i);

                            //LOGGER.debug("\nCampo: " + field.getName() + " Longitud: " + field.getLength() + " indx: " + indx);
                            fieldValue = linea.substring(indx, indx + field.getLength());
                            //LOGGER.debug("\nvalor: " + fieldValue + "\nlongitud valor: " + fieldValue.length());
                            //logger.log(this, Thread.currentThread(), Level.DEBUG, "\nCampo: " + field.getName() + "\nvalor: " + fieldValue + "\nlongitud: " + fieldValue.length());

                            if (field.getName().equals("") && !fieldValue.equals("3"))
                                continue;

                            if (!field.isOnlyInfo())
                                indx += field.getLength();

                            if (field.getMapToField() == null || field.getMapToField().equals("")) {

                            } else {
                                methodName = "set" + field.getMapToField();
                                setter = operTran.getClass().getMethod(methodName, new Class[] { field.getTypeLengthInfo().getClass() });
                                // Partiendo que todos los tipos que seran seteados tienen como constructor String
                                // TODO: Falta el soporte para Date y revisar si esto es lo mas optimo
                                Object valueObject = field.getTypeLengthInfo()
                                                          .getClass()
                                                          .getConstructor(new Class[] { String.class })
                                                          .newInstance(new Object[] { fieldValue });
                                setter.invoke(operTran, new Object[] { valueObject });
                            }
                        }

                        if (secuencia == null) {
                            sql = "select nvl(max(TRA_NUM_SEC_REG),0)+1 TRA_NUM_SEC_REG from opertran where TRA_ANO_MOVTO = ? AND TRA_MES_MOVTO = ? AND TRA_DIA_MOVTO = ?";
                            secuencia =
                                ((Map) ejecutaQuery(sql, new Object[] { operTran.getTraAnoMovto(), operTran.getTraMesMovto(), operTran.getTraDiaMovto() }).get(0))
                                .get("traNumSecReg").toString();
                        } else {
                            secuencia = "" + (Long.parseLong(secuencia) + 1L);
                        }

                        operTran.setTraNomFile(fileName);
                        operTran.setTraNumSecReg(new BigDecimal(secuencia));
                        operTran.setTraCveStTransfe("ACTIVO");

                        if (fechaArchivo == null)
                            fechaArchivo = operTran.getTraFecCorte();

                        //if(!operTran.validate())
                        if (!operTran.doInsert())
                            throw new Exception("Error al cargar la informacion de archivo a base de datos!");

                        // codigo OPERTRAN----

                    } else if (tipoReg.equals("5")) { // codigo ARCHIVOSPLANOS---

                        archivosPlanos = new ArchivosPlanos();

                        archivosPlanos.setArpSecuencial(new BigDecimal(secuencial++));
                        archivosPlanos.setArpFecha((String) this.getParameters().get("fechaTas"));
                        archivosPlanos.setArpNomArchivo("CONCILIA TAS");
                        archivosPlanos.setArpDescripcion(linea);

                        if (fechaArchivo == null)
                            fechaArchivo = (String) this.getParameters().get("fechaTas");

                        //if(!archivosPlanos.validate())
                        if (!archivosPlanos.doInsert())
                            throw new Exception("Error al cargar la informacion de archivo a base de datos!");

                    } // codigo ARCHIVOSPLANOS---

                }
            }

            sql = "{? = call INTERFASES.TRANSFERENCIA(?, ?, ?, ?)}";

            List parametrosQuery = new ArrayList();

            parametrosQuery.add(new ParametroQueryBean("result", "NUMBER", Integer.valueOf(0), true));
            parametrosQuery.add(new ParametroQueryBean("Nombre Archivo", "VARCHAR", fileName));
            parametrosQuery.add(new ParametroQueryBean("Fecha", "VARCHAR", fechaArchivo));
            parametrosQuery.add(new ParametroQueryBean("usuario", "NUMBER", Integer.valueOf(603))); // TODO: Poner el Id de usuario
            parametrosQuery.add(new ParametroQueryBean("opcionTAS", "NUMBER", Integer.valueOf(1)));

            Object resultadoFuncion = ejecutaProcedimiento(sql, parametrosQuery).get("result");
            logger.info("El resultado de la funcion Transferencia: " + resultadoFuncion + " Clase: " + resultadoFuncion.getClass());

            parametrosQuery = null;

        } catch (Exception e) {

            logger.error("Error al pricesar archivo FOSEG", e);

        } finally {

        }
    }

    public Object getStateInfo() {
        return null;
    }
}
