package com.di.ioc.handlers;

import com.di.ioc.models.DependencyParam;

public interface DependencyResolver {

    boolean canResolve(DependencyParam dependencyParam);

    Object resolve(DependencyParam dependencyParam);
}
