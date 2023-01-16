package javaot.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = StartsWithValidator.class)
public @interface StartsWith {
    String prefix();
    String message() default "";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default  {};
}
