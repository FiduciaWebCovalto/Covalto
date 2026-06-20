package mx.com.inscitech.fiducia.business.reportes.processors;

import java.io.ByteArrayOutputStream;

import java.util.List;
import java.util.Map;

import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;

/**
 * Interface que implementan las clases que se encargan de generar los archivos XML a partir del
 * resultado de la ejecucion de una consulta, procedimiento o funcion para que posterior
 * mente mediante una XSLT pueda convertirse en un reporte.
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public interface BaseProcessor {

    /**
     * Metodo que deberan implementar las clases para obtener el xml del reporte.
     * @throws mx.com.inscitech.fiducia.exceptions.impl.BusinessException Cuando ocurre un error de negocio.
     * @return Un Arraglo de bytes que equivalen al archivo XML generado.
     * @param parametros Los parametros que vienen del request que pueden ser o no usados por la implementacion.
     * @param datos Una lista con los datos a partir de los cuales se generara el archivo XML.
     */
    public ByteArrayOutputStream getXmlReporte(List datos, Map parametros) throws BusinessException;
}
