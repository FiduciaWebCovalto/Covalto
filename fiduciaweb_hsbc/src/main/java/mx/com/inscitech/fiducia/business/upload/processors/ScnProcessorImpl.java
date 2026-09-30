package mx.com.inscitech.fiducia.business.upload.processors;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.lang.reflect.Method;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mx.com.inscitech.fiducia.domain.Opertran;

import mx.com.inscitech.fiducia.business.upload.FieldInfo;
import mx.com.inscitech.fiducia.business.upload.UploadProcessor;
import mx.com.inscitech.fiducia.common.beans.ParametroQueryBean;

import org.apache.commons.fileupload.FileItem;


/**
 * Clase encargada de procesar los archivos recibidos para la interfaz del SCN
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ScnProcessorImpl extends UploadProcessor {

    /**
     * Variable que tiene la informacion del header del archivo del SCN
     */
    private static List headerInfo;

    /**
     * Variable que tiene la informacion del cuerpo del archivo del SCN
     */
    private static List bodyInfo;


    static {
        headerInfo = new ArrayList();
        bodyInfo = new ArrayList();

        headerInfo.add(new FieldInfo("Parte del Archivo", new Long(1), ""));
        headerInfo.add(new FieldInfo("Numero de Operaciones", new Long(5), ""));
        headerInfo.add(new FieldInfo("Importe de las Operaciones", new Long(21), ""));
        headerInfo.add(new FieldInfo("Intermediario", "5", ""));
        headerInfo.add(new FieldInfo("Ceros", new Long(190), ""));

        bodyInfo.add(new FieldInfo("Parte del Archivo", new Long(1), "")); // Procesar solo los que tienen 3
        bodyInfo.add(new FieldInfo("Contrato de Inversion", new Long(15), "TraContratoInter"));
        bodyInfo.add(new FieldInfo("Fecha de operacion", "", "10", "TraFecInicioPer", "dd/MM/yyyy"));

        bodyInfo.add(new FieldInfo("Fecha de liquidacion", "", "10", "TraFecCorte", "dd/MM/yyyy", true));
        bodyInfo.add(new FieldInfo("Fecha de liquidacion Dia", "Dia de la fecha de liquidacion", new Integer(2), "TraDiaMovto"));
        bodyInfo.add(new FieldInfo("Slash Fecha", "Slash de la fecha de liquidacion", new Integer(1), null));
        bodyInfo.add(new FieldInfo("Fecha de liquidacion Mes", "Mes de la fecha de liquidacion", new Integer(2), "TraMesMovto"));
        bodyInfo.add(new FieldInfo("Slash Fecha", "Slash de la fecha de liquidacion", new Integer(1), null));
        bodyInfo.add(new FieldInfo("Fecha de liquidacion Año", "Año de la fecha de liquidacion", new Integer(4), "TraAnoMovto"));

        bodyInfo.add(new FieldInfo("Tipo de Movimiento", new Integer(2), "TraTipoMovimient"));
        bodyInfo.add(new FieldInfo("Tipo de Operacion", "15", ""));

        bodyInfo.add(new FieldInfo("Tipo de Valor o Pizarra", "2", "TraTipoValor"));
        bodyInfo.add(new FieldInfo("Nombre de la Emisora", "10", "TraNomPizarra"));
        bodyInfo.add(new FieldInfo("Serie", "7", "TraNumSerie"));
        bodyInfo.add(new FieldInfo("Cupon", new Integer(5), "TraNumCupon"));
        bodyInfo.add(new FieldInfo("Numero de Titulos", new Long(12), "TraNumTitulos"));
        bodyInfo.add(new FieldInfo("Precio Unitario", new Double(27), "TraImpPrecio"));
        bodyInfo.add(new FieldInfo("Tasa", new Double(27), "TraPjeTasa"));
        bodyInfo.add(new FieldInfo("Sobre Tasa", new Double(27), "TraPjeStasa"));
        bodyInfo.add(new FieldInfo("Plazo", new Integer(6), "TraNumPlazo"));
        bodyInfo.add(new FieldInfo("Importe de la Operacion", new Double(21), "TraImpTitulos"));
        bodyInfo.add(new FieldInfo("Referencia del Movto", "8", "TraNumFactura"));
        bodyInfo.add(new FieldInfo("Moneda", new Integer(2), "TraMoneda"));
        bodyInfo.add(new FieldInfo("Forma Cobro/Pago", new Long(3), ""));
        bodyInfo.add(new FieldInfo("Vector", new Double(27), "TraVector"));
        bodyInfo.add(new FieldInfo("Precio de Mercado", new Double(27), "TraPrecioMerca"));
        bodyInfo.add(new FieldInfo("Minusvalía/Plusvalía", new Double(15), "TraMinusPlus")); // Se cambio de 27 a 15 no cuadra la longitud de la linea
    }

    public ScnProcessorImpl() {
        super();
    }

    public void run() {

        // TODO: Si la fecha del archivo no coincide con la especificada por el cliente mandar error
        boolean isHeader = true;

        logSrv.log(this, Thread.currentThread(), INFO, "Procesando Archivo SCN");

        FileItem file = null;
        String fileName = null;

        BufferedReader tasFileReader = null;

        int i = 0, indx = 0;

        FieldInfo field = null;
        Opertran operTran = null;
        String methodName = null;
        Method setter = null;
        String linea = null;
        String fieldValue = null;
        String sql = null;
        String secuencia = null;
        String fechaArchivo = null;

        try {

            file = (FileItem) this.files.get(0);
            fileName = file.getName();

            if (fileName.indexOf("\\") != -1)
                fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
            if (fileName.indexOf("/") != -1)
                fileName = fileName.substring(fileName.lastIndexOf("/") + 1);

            tasFileReader = new BufferedReader(new InputStreamReader(file.getInputStream()));

            while (tasFileReader.ready()) {

                linea = tasFileReader.readLine();

                if (linea.trim().equals(""))
                    continue;

                if (isHeader) {
                    //logger.log(this, Thread.currentThread(), Level.DEBUG, "Procesando Encabezado.");
                    for (i = 0; i < headerInfo.size(); i++) {

                        field = (FieldInfo) headerInfo.get(i);
                        //System.out.println("field.getLength(): " + field.getLength() + " indx: " + indx);
                        //System.out.println("\nCampo: " + field.getName() + "\nvalor: " + linea.substring(indx, indx+field.getLength()) + "\nlongitud: " + linea.substring(indx, indx+field.getLength()).length());
                        //logger.log(this, Thread.currentThread(), Level.DEBUG, "\nCampo: " + field.getName() + "\nvalor: " + linea.substring(indx, indx+field.getLength()) + "\nlongitud: " + linea.substring(indx, field.getLength()).length());
                        indx += field.getLength();

                    }

                    isHeader = false;

                } else {

                    indx = 0;
                    operTran = new Opertran();

                    for (i = 0; i < bodyInfo.size(); i++) {
                        field = (FieldInfo) bodyInfo.get(i);

                        //System.out.println("\nCampo: " + field.getName() + " Longitud: " + field.getLength() + " indx: " + indx);
                        fieldValue = linea.substring(indx, indx + field.getLength());
                        //System.out.println("\nvalor: " + fieldValue + "\nlongitud valor: " + fieldValue.length());
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
                            ((Map) ejecutaQuery(sql, new Object[] { operTran.getTraAnoMovto(), operTran.getTraMesMovto(), operTran.getTraDiaMovto() }).get(0)).get("traNumSecReg")
                            .toString();
                    } else {
                        secuencia = "" + (Long.parseLong(secuencia) + 1L);
                    }

                    operTran.setTraNomFile(fileName);
                    operTran.setTraNumSecReg(new BigDecimal(secuencia));
                    operTran.setTraCveStTransfe("ACTIVO");

                    if (fechaArchivo == null)
                        fechaArchivo = operTran.getTraFecCorte();

                    //if(!archivosPlanos.validate())
                    if (!operTran.doInsert())
                        throw new Exception("Error al cargar la informacion de archivo a base de datos!");

                }
            }

            sql = "{? = call INTERFASES.TRANSFERENCIA(?, ?, ?, ?)}";

            List parametrosQuery = new ArrayList();

            parametrosQuery.add(new ParametroQueryBean("result", "NUMBER", new Integer(0), true));
            parametrosQuery.add(new ParametroQueryBean("Nombre Archivo", "VARCHAR", fileName));
            parametrosQuery.add(new ParametroQueryBean("Fecha", "VARCHAR", fechaArchivo));
            parametrosQuery.add(new ParametroQueryBean("usuario", "NUMBER", new Integer(300))); // TODO: Poner el Id de usuario
            parametrosQuery.add(new ParametroQueryBean("opcionTAS", "NUMBER", new Integer(3)));

            Object resultadoFuncion = ejecutaProcedimiento(sql, parametrosQuery).get("result");
            logger.info("El resultado de la funcion Transferencia: " + resultadoFuncion + " Clase: " + resultadoFuncion.getClass());

            parametrosQuery = null;

        } catch (Exception e) {

            logger.error("Error al pricesar archivo SCN", e);

        } finally {

        }
    }

    public Object getStateInfo() {
        return null;
    }
}
