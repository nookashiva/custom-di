package com.di.ioc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.di.ioc.enums.ScopeType;

/**
 * Defines a scope for a given service.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Scope {

    ScopeType value() default ScopeType.SINGLETON;
}
