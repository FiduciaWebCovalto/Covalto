package mx.com.inscitech.fiducia.common.util;

import java.lang.reflect.Method;

import mx.com.inscitech.fiducia.common.FiduciaWebBase;


/**
 * Clase que contiene metodos de utileria para refleccion
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ReflectionUtils extends FiduciaWebBase {

    public ReflectionUtils() {
        super();
    }

    /**
     * Metodo utilizado para asignar los valores de un bean a otro de la misma clase por medio de los metodos "set" y "get"
     * @param destination El objeto al que se le asignaran los nuevos atributos
     * @param source El objeto que contiene los valores a asignar al objeto destino
     */
    public void assignValues(Object source, Object destination) {
        if (destination.getClass().equals(source.getClass())) {

            try {
                Method[] methods = destination.getClass().getMethods();

                for (int i = 0; i < methods.length; i++) {
                    if (methods[i].getName().startsWith("set")) {
                        String getMethodName = "get" + methods[i].getName().substring(3);
                        Method getter = source.getClass().getMethod(getMethodName);
                        Object value = getter.invoke(source);
                        methods[i].invoke(destination, new Object[] { value });
                    }
                }
            } catch (Exception e) {
                this.logger.log(ERROR, this, e);
            }
        } else {
            //throw exception
        }
    }

    //public static void cloneDomainObjectFromHelper(DomainHelper helper, Object domainObject) { /* Cambios WebSphere */
    public void cloneDomainObjectFromHelper(Object helper, Object domainObject) {
        try {
            Method[] methods = domainObject.getClass().getMethods();

            for (int i = 0; i < methods.length; i++) {
                if (methods[i].getName().startsWith("set")) {
                    String fieldName = methods[i].getName().substring(3);
                    String getMethodName = "get" + fieldName;
                    Method getter = helper.getClass().getMethod(getMethodName);
                    Object value = getter.invoke(helper);

                    /*if(helper.isDateField(fieldName)) {
            if(value != null && !((String)value).trim().equals(""))
              methods[i].invoke(domainObject, new Object[] {  new java.sql.Date(DateTimeUtils.parseDateTimeFromPattern(helper.getDatePattern(), (String)value).getTime()) });
          } else {
            methods[i].invoke(domainObject, new Object[] { value });
          }*/ /* Cambios WebSphere */
                }
            }
        } catch (Exception e) {
            this.logger.log(ERROR, this, e);
        }
    }


    //public static void cloneHelperFromDomainObject(DomainHelper helper, Object domainObject) { /* Cambios WebSphere */
    public void cloneHelperFromDomainObject(Object helper, Object domainObject) {
        try {
            Method[] methods = helper.getClass().getMethods();

            for (int i = 0; i < methods.length; i++) {
                if (methods[i].getName().startsWith("set")) {
                    try {
                        String fieldName = methods[i].getName().substring(3);
                        String getMethodName = "get" + fieldName;
                        Method getter = domainObject.getClass().getMethod(getMethodName);
                        Object value = getter.invoke(domainObject);

                        /*if(helper.isDateField(fieldName)) {
              if(value != null)
                methods[i].invoke(helper, new Object[] { DateTimeUtils.formatDateTimeFromPattern(helper.getDatePattern(), (Date)value) });
            } else {
              methods[i].invoke(helper, new Object[] { value });
            }*/ /* Cambios WebSphere */

                    } catch (Exception e) {
                        this.logger.log(INFO, this, e);
                    }
                }
            }
        } catch (Exception e) {
            this.logger.log(ERROR, this, e);
        }
    }


    public Class getClass(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            this.logger.log(ERROR, this, e);
        }

        return null;
    }
}
