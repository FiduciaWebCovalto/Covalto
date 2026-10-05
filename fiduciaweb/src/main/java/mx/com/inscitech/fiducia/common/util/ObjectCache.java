package mx.com.inscitech.fiducia.common.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase (Singleton) que sirve para mantener en memoria objetos
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ObjectCache {

    private static ObjectCache _instance = null;

    private Map cache = null;

    static {
        _instance = new ObjectCache();
    }

    /**
     * Metodo para obtener la insatncia del ObjectCache
     * @return La instancia del ObjectCache
     */
    public static ObjectCache getInstance() {
        return _instance;
    }

    /**
     * Constructor
     */
    protected ObjectCache() {
        cache = Collections.synchronizedMap(new HashMap());
    }

    /**
     * Metodo para invalidar (eliminar) el contenido del cache
     */
    public void invalidate() {
        cache.clear();
    }

    /**
     * Metodo para obtener un objeto del cache
     * @return El objeto del cache
     * @param objectKey La llave que hace referencia al objeto almacendado en el cache
     */
    public Object get(Object objectKey) {
        return cache.get(objectKey);
    }

    /**
     * Metodo que permite eliminar un objeto del cache
     * @param objectKey La llave que hace referencia al objeto almacendado en el cache
     */
    public void removeFromCache(Object objectKey) {
        cache.remove(objectKey);
    }

    /**
     * Metodo que permite almacenar un objeto en el cache
     * @param value El objeto a almacenar
     * @param objectKey La llave con la cual se hara referencia al objeto almacenado. Esta llave debe de ser unica,
     * de lo contrario reemplazara a el objeto ya almacenado con la misma llave
     */
    public void put(Object objectKey, Object value) {
        cache.put(objectKey, value);
    }
}
