package com;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target( { ElementType.FIELD, ElementType.PARAMETER,  ElementType.LOCAL_VARIABLE,})
@Retention(RetentionPolicy.SOURCE)
public @interface EncryptStr {
    String value();
}
