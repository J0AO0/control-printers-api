//package com.gralha.controlprinters.validations.printers;
//
//import jakarta.validation.Constraint;
//import jakarta.validation.Payload;
//
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//@Constraint(validatedBy = PrinterInsertValidator.class)
//@Target({ ElementType.TYPE })
//@Retention(RetentionPolicy.RUNTIME)
//public @interface PrinterInsert {
//    String message() default "Erro de validação";
//
//    Class<?>[] groups() default {};
//
//    Class<? extends Payload>[] payload() default {};
//}
