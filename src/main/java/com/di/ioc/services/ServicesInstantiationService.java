package com.di.ioc.services;

import java.util.Collection;
import java.util.Set;

import com.di.ioc.exceptions.ServiceInstantiationException;
import com.di.ioc.models.ServiceDetails;

public interface ServicesInstantiationService {
    Collection<ServiceDetails> instantiateServicesAndBeans(Set<ServiceDetails> mappedServices) throws ServiceInstantiationException;
}
