package com.di.ioc.config;

import com.di.ioc.config.configurations.InstantiationConfiguration;
import com.di.ioc.config.configurations.ScanningConfiguration;

public class DependencyConfiguration {

    private final ScanningConfiguration annotations;

    private final InstantiationConfiguration instantiations;

    public DependencyConfiguration() {
        this.annotations = new ScanningConfiguration(this);
        this.instantiations = new InstantiationConfiguration(this);
    }

    public ScanningConfiguration scanning() {
        return this.annotations;
    }

    public InstantiationConfiguration instantiations() {
        return this.instantiations;
    }

    public DependencyConfiguration build() {
        return this;
    }
}
