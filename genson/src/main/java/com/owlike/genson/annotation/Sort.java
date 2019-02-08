package com.owlike.genson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The annotation value is used to sort fields during class/bean serialisation.
 * This modification is done by third party developer.
 * @author Max Petrov 02.2019 minii0878@gmail.com
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Sort {
  String value();
}
