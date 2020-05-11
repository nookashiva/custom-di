package com.di.ioc.config.configurations;

import java.lang.annotation.Annotation;
import java.util.*;

import com.di.ioc.config.BaseSubConfiguration;
import com.di.ioc.config.DependencyConfiguration;
import com.di.ioc.events.ServiceDetailsCreated;

public class ScanningConfiguration extends BaseSubConfiguration {

    private final Set<Class<? extends Annotation>> customServiceAnnotations;

    private final Set<Class<? extends Annotation>> customBeanAnnotations;

    private final Map<Class<?>, Class<? extends Annotation>> additionalClasses;

    private final Set<ServiceDetailsCreated> serviceDetailsCreatedCallbacks;

    private ClassLoader classLoader;

    public ScanningConfiguration(DependencyConfiguration parentConfig) {
        super(parentConfig);
        this.customServiceAnnotations = new HashSet<>();
        this.customBeanAnnotations = new HashSet<>();
        this.additionalClasses = new HashMap<>();
        this.serviceDetailsCreatedCallbacks = new HashSet<>();
        this.classLoader = Thread.currentThread().getContextClassLoader();
    }

    public ScanningConfiguration addCustomServiceAnnotation(Class<? extends Annotation> annotation) {
        this.customServiceAnnotations.add(annotation);
        return this;
    }

    public ScanningConfiguration addCustomServiceAnnotations(Collection<Class<? extends Annotation>> annotations) {
        this.customServiceAnnotations.addAll(annotations);
        return this;
    }

    public ScanningConfiguration addCustomBeanAnnotation(Class<? extends Annotation> annotation) {
        this.customBeanAnnotations.add(annotation);
        return this;
    }

    public ScanningConfiguration addCustomBeanAnnotations(Collection<Class<? extends Annotation>> annotations) {
        this.customBeanAnnotations.addAll(annotations);
        return this;
    }

    public ScanningConfiguration addAdditionalClassesForScanning(Map<Class<?>, Class<? extends Annotation>> additionalClasses) {
        this.additionalClasses.putAll(additionalClasses);
        return this;
    }

    public ScanningConfiguration addServiceDetailsCreatedCallback(ServiceDetailsCreated serviceDetailsCreated) {
        this.serviceDetailsCreatedCallbacks.add(serviceDetailsCreated);
        return this;
    }

    public ScanningConfiguration setClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
        return this;
    }

    public Set<Class<? extends Annotation>> getCustomBeanAnnotations() {
        return this.customBeanAnnotations;
    }

    public Set<Class<? extends Annotation>> getCustomServiceAnnotations() {
        return this.customServiceAnnotations;
    }

    public Map<Class<?>, Class<? extends Annotation>> getAdditionalClasses() {
        return this.additionalClasses;
    }

    public Set<ServiceDetailsCreated> getServiceDetailsCreatedCallbacks() {
        return this.serviceDetailsCreatedCallbacks;
    }

    public ClassLoader getClassLoader() {
        return this.classLoader;
    }
}
