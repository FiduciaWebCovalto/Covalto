package mx.com.inscitech.fiducia.domain.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldInfo {

    boolean nullable() default true;

    boolean insert() default true;

    boolean update() default true;

    boolean isDate() default false;

    String[] allowedValues() default { };

    String sequence() default "";

    String validationExpression() default "";

    String dataType() default "VARCHAR2";

    String dateFormat() default "dd/MM/yyyy";

    String defaultValue() default "";

    int precision() default 0;

    int scale() default 0;

    Class javaClass() default String.class;
}
