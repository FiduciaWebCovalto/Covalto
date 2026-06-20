package mx.com.inscitech.fiducia.domain.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrimaryKey {

    /**
     * Nombre del constraint o indice a nivel de base de datos que forma la llave primaria.
     * @return El nombre del indice o constraint.
     */
    String constraintName() default "";

    /**
     * Lista de las columnas (nombres) que forman parte de la llave primaria.
     * @return La lista de las columnas.
     */
    String[] columns();

    /**
     * Lista de las secuencias (nombres) para obtener el valor de la llave primaria en el mismo orden que "columns".
     * Se obtienen las secuencias de manera previa a la insercion segun aplique.
     * MAX: Usa una select para sacar el maximo valor del campo. Se incluye el campo en el Insert.
     * AUTO: La base de datos la calcula de manera automatica. No se incluye el campo en el Insert.
     * MANUAL: Se asigna de forma manual al objeto. No se incluye el campo en el Insert.
     * @return La lista de secuencias o bien la configuracion a utilizar (MAX, AUTO, MANUAL)
     */
    String[] sequences(); // MAX, AUTO, MANUAL

}
