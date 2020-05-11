package com.di.ioc.events;

import com.di.ioc.models.ServiceDetails;

@FunctionalInterface
public interface ServiceDetailsCreated {
    void serviceDetailsCreated(ServiceDetails serviceDetails);
}
