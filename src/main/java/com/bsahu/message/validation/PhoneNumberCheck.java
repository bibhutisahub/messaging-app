/*
 * package com.bsahu.message.validation;
 * 
 * import java.lang.annotation.Documented; import
 * java.lang.annotation.ElementType; import java.lang.annotation.Retention;
 * import java.lang.annotation.RetentionPolicy; import
 * java.lang.annotation.Target;
 * 
 * import org.springframework.messaging.handler.annotation.Payload;
 * 
 * @Documented
 * 
 * @Constraint(validatedBy = PhoneNumberCheck.class)
 * 
 * @Target( { ElementType.METHOD, ElementType.FIELD })
 * 
 * @Retention(RetentionPolicy.RUNTIME) public @interface PhoneNumberCheck {
 * String message() default "Invalid phone number"; Class<?>[] groups() default
 * {}; Class<? extends Payload>[] payload() default {}; }
 */