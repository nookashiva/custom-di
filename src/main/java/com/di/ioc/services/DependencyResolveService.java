package com.di.ioc.services;

import java.util.Collection;

import com.di.ioc.exceptions.ServiceInstantiationException;
import com.di.ioc.models.EnqueuedServiceDetails;
import com.di.ioc.models.ServiceDetails;

public interface DependencyResolveService {

    void init(Collection<ServiceDetails> mappedServices);

    void checkDependencies(Collection<EnqueuedServiceDetails> enqueuedServiceDetails) throws ServiceInstantiationException;

    void addDependency(EnqueuedServiceDetails enqueuedServiceDetails, ServiceDetails serviceDetails);

    boolean isServiceResolved(EnqueuedServiceDetails enqueuedServiceDetails);

    boolean isDependencyRequired(EnqueuedServiceDetails enqueuedServiceDetails, ServiceDetails serviceDetails);
}
