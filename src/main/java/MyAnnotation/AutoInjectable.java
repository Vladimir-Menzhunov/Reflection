package MyAnnotation;

import java.lang.annotation.*;

/**
 * Аннотация применяется к полям, которые нужно инициализировать средствами метода inject
 */

@Target(value= ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface AutoInjectable {
    boolean value() default true;
}
