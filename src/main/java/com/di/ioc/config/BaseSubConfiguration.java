package com.di.ioc.config;

public abstract class BaseSubConfiguration {

    private final DependencyConfiguration parentConfig;

    protected BaseSubConfiguration(DependencyConfiguration parentConfig) {
        this.parentConfig = parentConfig;
    }

    public DependencyConfiguration and() {
        return this.parentConfig;
    }
}
