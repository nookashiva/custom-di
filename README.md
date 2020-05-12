# custom-di
Custom Dependency Injection , kind of IOC

-----------------------
Custom made dependency Injection replicating the functionality of Spring IOC.

Design considerations :
1. Core pattern we will use there is Dependency injection pattern
2. Loosely coupled
3. Logging
4. Modularity 
5. Integrated Unit testing
6. JDK 1.8 - target build

Limitations : 
1. Not a full plugged container 
2. No version backword compactability 


Main Features
-----------------------
* Create instance of your services
* Automatically resolve dependencies
* Create Beans
* Add your own custom mapping annotations for services and beans
* Manage instantiated services (get them by annotation, qualifier, type)
* Reload instantiated services
* Handle custom service and bean scopes by using proxies.

The Goal
-----------------------
This project is created with the purpose to help understand how DI/IoC Containers work.

How to run the app?
------------------
* Run 'clean install' / 'mvn package' and get the generated jar file.
* Import it into your project
* In your main method call 'DepedentInjector.run(YourStartupClass.class);'
* Annotate your startup class with @Service
* Create a void method and annotate it with @StartUp

You can also run the app with 'DepedentInjector.run(YourStartupClass.class, new DependencyConfiguration());'.

Supported annotations by default: 
* Bean - Specify bean producing method.
* Service - Specify service.
* Autowired - Specify which constructor will be used to create instance of a service.
also you can annotate fields with this annotation.
* PostConstruct - Specify a method that will be executed after the service has been created.
* PreDestroy - Specify a method that will be executed just before the service has been disposed.
* StartUp - Specify the startup method for the app.DependencyInjector
* AliasFor - You can use this annotation to integrate your own annotations with DependencyInjector
AliasFor works with Autowired, NamedInstance, Nullable, PostConstruct, PreDestroy, Qualifier.
* NamedInstance - Specify the name of the service / bean.
* Nullable - required dependency can be null.
* Qualifier - Specify the name of the dependency that you are requiring.
* Scope - Specify the scope of the service. SINGLETON or PROTOTYPE 

You can use the configuration to provide custom annotations that can act like @Bean and @Service.

The benefit of that is that you might have some services that you might want to filter out by something and 
custom annotations is a good approach.

Also you can access the DependencyContainer instance this way 'DependencyContainer dc = DependencyInjector.run(...)' or
by requiring it from the startup method.

Documentation
------------
Currently there is no real documentation from where you can read, but 
you can read the javadoc or you can check out the integration tests located  https://github.com/nookashiva/custom-di-tests

More info
-------------
If you are having trouble running the app, contact me at nookashiva@gmail.com
