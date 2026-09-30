package mx.com.inscitech.clients.services.v1.dtos;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE})
public @interface ValidationData {
    
    enum DataTypes {
        Number,
        Text,
        Date
    };
    
    enum AlignOptions {
        Left,
        Right
    };
    
    DataTypes dataType() default DataTypes.Text;
    int minLength() default 0;
    int maxLength() default 0;
    String fillWith() default " ";
    boolean toUpperCase() default false;
    boolean toLowerCase() default false;
    boolean required() default false;
    String validationExpression() default "";
    AlignOptions align() default AlignOptions.Right;
    String dateFormat() default "YYYYMMDD";
    String description() default "";
    String reference() default "";
    String whenNull() default "";
}
