package com.di.ioc.services;

import com.di.ioc.exceptions.BeanInstantiationException;
import com.di.ioc.exceptions.PreDestroyExecutionException;
import com.di.ioc.exceptions.ServiceInstantiationException;
import com.di.ioc.models.ServiceBeanDetails;
import com.di.ioc.models.ServiceDetails;

public interface ObjectInstantiationService {

    void createInstance(ServiceDetails serviceDetails, Object[] constructorParams, Object[] autowiredFieldInstances) throws ServiceInstantiationException;

    void createBeanInstance(ServiceBeanDetails serviceBeanDetails) throws BeanInstantiationException;

    void destroyInstance(ServiceDetails serviceDetails) throws PreDestroyExecutionException;
}
