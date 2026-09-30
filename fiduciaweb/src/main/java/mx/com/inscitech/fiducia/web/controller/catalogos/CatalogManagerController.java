package mx.com.inscitech.fiducia.web.controller.catalogos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.domain.base.DomainObject;

import mx.com.inscitech.fiducia.common.beans.CatalogInfoBean;
import mx.com.inscitech.fiducia.common.beans.GenericResponseBean;
import mx.com.inscitech.fiducia.common.util.ReflectionUtils;
import mx.com.inscitech.fiducia.web.controller.JsonActionController;

import net.sf.json.JSONObject;

import org.apache.log4j.Level;

import org.springframework.web.servlet.ModelAndView;

/**
 * Controller que se encarga de las operaciones de catalogos
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class CatalogManagerController extends JsonActionController {

    /**
     * Metodo utilizado para obtener del request la instancia del objeto a trabajar, mismo que es
     * generado a partir de la cadena JavaScript (JSON) que envia el cliente, por lo que dicho elemento
     * tiene ya los valores asignados segun sea necesarios para el tipo de operacion.
     * @return Una instancia del objeto a trabajar
     * @param request El request Http del cliente que contiene la cadena JSON del objeto con la informacion
     * necesaria para crear una instancia del objeto.
     */
    private DomainObject getCatalogObject(HttpServletRequest request) {

        Object returnObject = null;

        CatalogInfoBean catalogo = null;

        JSONObject jsonCatalog = null;
        JSONObject jsonObject = null;

        ReflectionUtils reflection = new ReflectionUtils();

        jsonObject = getJSONRequestObject(request);

        catalogo = (CatalogInfoBean) JSONObject.toBean(jsonObject, CatalogInfoBean.class);

        jsonCatalog = JSONObject.fromObject(catalogo.getCatalogo());

        returnObject = JSONObject.toBean(JSONObject.fromObject(jsonCatalog), reflection.getClass(catalogo.getClaseCatalogo()));

        return (DomainObject) returnObject;
    }

    /**
     * Metodo que se encarga de obtener un elemento del catalogo basandose en el ID de la entidad
     * @throws java.lang.Exception Cuando no es posible obtener el elemento del catalogo
     * @return El objeto que contiene la informacion sobre el catalogo
     * @param response El response de http que se le envia al cliente, en este caso, una cadena de definicion de objeto JavaScript
     * @param request La peticion http del cliente con la informacion necesaria para obtener un elemento del catalogo, en este caso
     * la informacion de la llave primaria
     */
    public ModelAndView getItemCatalogo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        DomainObject catalogoInstance = getCatalogObject(request);

        try {

            catalogoInstance = (DomainObject) catalogoInstance.selectAsObject();

        } catch (Exception e) {
            logger.log(this.getClass(), Thread.currentThread(), Level.ERROR, e);
        }

        return respondObject(response, catalogoInstance);
    }

    /**
     * Metodo utilizado para dar de alta una nueva entidad dentro del catalogo solicitado, en este caso el catalogo asociado a la clase
     * definida el el objeto @see mx.com.inscitech.fiducia.common.beans.CatalogInfoBean que se debe de enviar como parte de la cadena json
     * @throws java.lang.Exception Cuando no es posible dar de alta el elemento
     * @return Un bean de error @see mx.com.inscitech.fiducia.common.beans.ErrorBean que indica el estado de la operacion dentro
     * de la cadena de dejinicion de objeto JavaScript
     * @param response El response de http que se le envia al cliente, en este caso, una cadena de definicion de objeto JavaScript
     * @param request La peticion http del cliente con la informacion necesaria para dar de alta un elemento del catalogo
     */
    public ModelAndView altaCatalogo(HttpServletRequest request, HttpServletResponse response) throws Exception {

        DomainObject catalogoInstance = getCatalogObject(request);

        GenericResponseBean responseBean = null;

        try {

            responseBean = GenericResponseBean.SUCCESS_BEAN;
            if (!catalogoInstance.doInsert()) {
                responseBean = new GenericResponseBean(GenericResponseBean.ERROR, "CAT-ADD-001", 
                                                       "Error al ejecutar el alta del registro", 
                                                       catalogoInstance.getLastMessage(), 
                                                       catalogoInstance.getStackTrace());
            }

        } catch (Exception e) {
            logger.log(this.getClass(), Thread.currentThread(), Level.ERROR, e);
            responseBean = new GenericResponseBean(GenericResponseBean.ERROR, e.toString(), "");
        }

        return respondObject(response, responseBean);
    }

    /**
     * Metodo utilizado para dar de baja una entidad dentro del catalogo solicitado, en este caso el catalogo asociado a la clase
     * definida el el objeto @see mx.com.inscitech.fiducia.common.beans.CatalogInfoBean que se debe de enviar como parte de la cadena json
     * @throws java.lang.Exception Cuando no es posible dar de baja el elemento
     * @return Un bean de error @see mx.com.inscitech.fiducia.common.beans.ErrorBean que indica el estado de la operacion dentro
     * de la cadena de dejinicion de objeto JavaScript
     * @param response El response de http que se le envia al cliente, en este caso, una cadena de definicion de objeto JavaScript
     * @param request La peticion http del cliente con la informacion necesaria para dar de baja un elemento del catalogo
     */
    public ModelAndView bajaCatalogo(HttpServletRequest request, HttpServletResponse response) throws Exception {

        DomainObject catalogoInstance = getCatalogObject(request);

        GenericResponseBean responseBean = null;

        try {

            responseBean = GenericResponseBean.SUCCESS_BEAN;
            if (!catalogoInstance.doDelete()) {
                responseBean = new GenericResponseBean(GenericResponseBean.ERROR, "CAT-DELETE-001", 
                                                       "Error al ejecutar la baja del registro", 
                                                       catalogoInstance.getLastMessage(), 
                                                       catalogoInstance.getStackTrace());

            }

        } catch (Exception e) {
            logger.log(this.getClass(), Thread.currentThread(), Level.ERROR, e);
            responseBean = new GenericResponseBean(GenericResponseBean.ERROR, e.toString(), "");

        }

        return respondObject(response, responseBean);
    }

    /**
     * Metodo utilizado para modificar una entidad dentro del catalogo solicitado, en este caso el catalogo asociado a la clase
     * definida el el objeto @see mx.com.inscitech.fiducia.common.beans.CatalogInfoBean que se debe de enviar como parte de la cadena json
     * @throws java.lang.Exception Cuando no es posible modificar el elemento
     * @return Un bean de error @see mx.com.inscitech.fiducia.common.beans.ErrorBean que indica el estado de la operacion dentro
     * de la cadena de dejinicion de objeto JavaScript
     * @param response El response de http que se le envia al cliente, en este caso, una cadena de definicion de objeto JavaScript
     * @param request La peticion http del cliente con la informacion necesaria para modificar un elemento del catalogo
     */
    public ModelAndView modificaCatalogo(HttpServletRequest request, HttpServletResponse response) throws Exception {

        DomainObject catalogoInstance = getCatalogObject(request);
        DomainObject itemCatalogo = null;

        GenericResponseBean responseBean = null;

        ReflectionUtils reflection = new ReflectionUtils();

        try {

            itemCatalogo = (DomainObject) catalogoInstance.selectAsObject();
            reflection.assignValues(catalogoInstance, itemCatalogo);

            if (!catalogoInstance.doUpdate()) {
                responseBean = new GenericResponseBean(GenericResponseBean.ERROR, "CAT-ADD-001", 
                                                       "Error al ejecutar el alta del registro", 
                                                       catalogoInstance.getLastMessage(), 
                                                       catalogoInstance.getStackTrace());
            }


        } catch (Exception e) {

            logger.log(this.getClass(), Thread.currentThread(), Level.ERROR, e);
            responseBean = new GenericResponseBean(GenericResponseBean.ERROR, e.toString(), "");

        } finally {
            reflection = null;
        }

        return respondObject(response, responseBean);
    }
}
