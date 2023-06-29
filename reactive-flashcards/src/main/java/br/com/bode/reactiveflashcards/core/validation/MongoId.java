package br.com.bode.reactiveflashcards.core.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({TYPE, METHOD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {MonoIdValidator.class})
public @interface MongoId {

    String message() default "{br.com.bode.reactiveflashcards.MongoId.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
