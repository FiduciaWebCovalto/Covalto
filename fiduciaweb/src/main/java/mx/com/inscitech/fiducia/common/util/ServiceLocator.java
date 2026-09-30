package mx.com.inscitech.fiducia.common.util;

import java.util.HashMap;

import javax.naming.InitialContext;

import javax.sql.DataSource;

import mx.com.inscitech.fiducia.common.services.LoggingService;

import org.apache.log4j.Level;


/**
 * Singleton que nos ayuda eliminar llamadas innecesarias al InitialContext
 * para evitar una sobrecarga de trafico de red, al momento de redescubrir los
 * objetos, utilizado para EJB's Remotos, Locales, Datasources, Queues, Sesiones de Mail etc...
 *
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ServiceLocator {
    private static ServiceLocator _instance = null;

    private LoggingService logger = null;

    private HashMap _dsCache = null;
    private HashMap _objCache = null;

    static {
        _instance = new ServiceLocator();
    }

    /**
     * Metodo para obtener la instacia del ServiceLocator
     * @return La instancia del ServiceLocator
     */
    public static ServiceLocator getInstance() {
        return _instance;
    }

    /**
     * Inicializa los caches
     */
    public ServiceLocator() {
        logger = LoggingService.getInstance();

        _dsCache = new HashMap();
        _objCache = new HashMap();
    }

    /**
     * Metodo que sirve para obtener un DataSource. El ServiceLocator lo busca en el contexto,
     * si lo encuentra, lo almacena en un cache para no tener que hacer el llamado al contexto nuevamente.
     * @return El datasource
     * @param _jndiDatasource El nombre con el que se encuentra el datasource en el contexto (JNDI Name)
     */
    public DataSource getDatasource(String _jndiDatasource) {
        try {

            if (!_dsCache.containsKey(_jndiDatasource)) {
                logger.log(this.getClass(), Thread.currentThread(), Level.INFO, "UTIL:SERVICELOCATOR:Buscando Datasource " + _jndiDatasource + " en JNDI");

                Object _obj = getObject(_jndiDatasource);

                logger.log(this, Thread.currentThread(), Level.INFO, "UTIL:SERVICELOCATOR:Buscando Datasource en JNDI..Hecho");

                if (_obj != null && _obj instanceof javax.sql.DataSource) {
                    DataSource _ds = (DataSource) _obj;

                    _dsCache.put(_jndiDatasource, _ds);

                    logger.log(this, Thread.currentThread(), Level.INFO, "UTIL:SERVICELOCATOR:Casting en Cache...");

                    return _ds;
                } else {
                    return null;
                }
            } else {
                DataSource _ds = (DataSource) _dsCache.get(_jndiDatasource);
                return _ds;
            }
        } catch (java.lang.Exception e) {
            logger.log(this, Thread.currentThread(), Level.ERROR, e);
        }

        return null;
    }

    /**
     * Metodo para obtener un objeto. El ServiceLocator lo busca en el contexto,
     * si lo encuentra, lo almacena en un cache para no tener que hacer el llamado al contexto nuevamente.
     * @return El objeto
     * @param _ObjectName El nombre con el que se encuentra el objeto en el contexto (JNDI Name)
     */
    public Object getObject(String _ObjectName) {
        if (!_objCache.containsKey(_ObjectName)) {
            try {
                InitialContext _initCtx = new InitialContext();
                java.lang.Object _obj = _initCtx.lookup(_ObjectName);

                _initCtx.close();

                if (_obj != null) {
                    _objCache.put(_ObjectName, _obj);

                    return _obj;
                } else {
                    return null;
                }
            } catch (Exception e) {
                logger.log(this, Thread.currentThread(), Level.ERROR, e);
                return null;
            }
        } else {
            return _objCache.get(_ObjectName);
        }
    }
}
