package com.di.ioc.annotations;

import java.lang.annotation.*;

import com.di.ioc.config.configurations.ScanningConfiguration;

/**
 * You can use this annotation on your own annotations if you want to make them compatible with DependencyInjector.
 * This annotation can be used to create aliases for {@link Autowired}, {@link PostConstruct}, {@link PreDestroy}.
 *
 * For services and beans you might want to use {@link ScanningConfiguration}.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE})
public @interface AliasFor {
    Class<? extends Annotation> value();
}
