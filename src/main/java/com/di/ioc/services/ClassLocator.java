package com.di.ioc.services;

import java.util.Set;

import com.di.ioc.exceptions.ClassLocationException;

/**
 * Service for locating classes in the application context.
 */
public interface ClassLocator {

    Set<Class<?>> locateClasses(String directory) throws ClassLocationException;
}
