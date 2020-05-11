package com.di.ioc.services;

import java.io.File;

import com.di.ioc.models.Directory;

public interface DirectoryResolver {

    Directory resolveDirectory(Class<?> startupClass);

    Directory resolveDirectory(File directory);
}
