package com.di.ioc.services;

import java.util.Set;

import com.di.ioc.models.ServiceDetails;

public interface ServicesScanningService {

    Set<ServiceDetails> mapServices(Set<Class<?>> locatedClasses);
}
