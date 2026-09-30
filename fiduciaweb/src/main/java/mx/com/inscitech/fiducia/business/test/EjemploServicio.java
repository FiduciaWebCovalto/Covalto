package mx.com.inscitech.fiducia.business.test;

import java.util.List;
import java.util.Map;

import mx.com.inscitech.fiducia.exceptions.impl.BusinessException;

/**
 * Interfase de ejemplo para la implementacion de servicios
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public interface EjemploServicio {
    public List ejecutaConsultaPaises() throws BusinessException;

    public List ejecutaConsultaAvanzada(Map parametros) throws BusinessException;
}
