/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vins.jax12.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

/**
 *
 * @author vinay.n.thakkar
 */
@Qualifier

@Target({ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultQualifier {
    Type value();
    enum Type{
        MyDefault, HisDefault
    }
    
}
