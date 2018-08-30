# JettyGuiceRestfulService

Minimalistic RESTful web server based on
- jetty
- jboss.resteasy
- guice

This configuration is very flexible for REST API web service. Each module is independent and flexible in terms of dependencies.

# ModuleContextListener

Main context listener, where you can add guice modules of your web service.

# SampleModule

Sample Guice module. Here you can add all necessary DI bindings.

# SampleController

Sample REST controller with examples of different request methods (`GET`, `POST`) and different request parameters, including JSON `SampleDataObject`.
