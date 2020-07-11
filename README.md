# SpringBootTestApp
A Spring Boot test application 

How to create initial Spring Boot application

Pre-Requisites 
- JDK 1.8 or later
- Maven 3.2+

#### Starting with Spring Initializr

1. Go to https://start.spring.io/
2. Create a Maven Project with Jar Packaging.
3. Add following dependencies.
    - spring-boot-starter-data-jpa
    - lombok
    - mysql-connector-java
4. Generate the project.

###### Project Package structure

```
com.kaveesh.testApp
├── configuration 
│   └── interceptorConfig
├── constant
├── controller 
├── dao
│      ├── user
│      │    └── UserRepository
├── dto
│      ├── user
│      │    └── UserDTO
├── event
├── exception
├── filter
├── model
│      ├── user
│      │    └── UserEntity
├── service    
│      ├── impl
│      │    └── UserServiceImpl
│      ├── UserService
├── util 
└── TestApplication
```
###### Pacakge Details

1. configuration 
- All classes in this package is annotated using @Configuration.
- @Configuration annotation indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.
- The Bean is a object that form the backbone of your application and that is managed by the Spring IoC container.

2 . constant
- All the database queries,constants and enums are defined inside this package

3 . controller
- All classes in this package is annotated using @RestController and used to create Restful controllers.
- Is equivalent to @Controller + @ResponseBody.
- @Controller annotation  used to mark a class as Spring MVC Controller.
- @ResponseBody annotation converts the response to JSON or XML

4 . dao
- All Interfaces in this package is annotated using @Repository and used to create Repository Class.
- All Interfaces in this package is extends by CrudRepository<T,ID> and giving relevant Entity class and its ID as CrudRepository's input parameters.
- Used to encapsulating storage, retrieval, and search behavior which emulates a collection of objects.

5 . dto
- All classes in this package is annotated using @Data and it will automatically create getters and setters to the variables defined in this class.

6 . event

7 . exception
- This package includes custom exception definitions which created by extending RuntimeException class.
- Also, it has a class to handle exceptions which annotated by @ControllerAdvice. 
- By default, the methods in an @ControllerAdvice apply globally to all controllers. 

8 . filter
- All classes in this package is annotated using @Component.
- Classes in this package may extends HandlerInterceptor Class.
- HandlerInterceptor is used to perform actions before handling, after handling or after completion  of a request. It has three main methods:
       
        prehandle() – called before the actual handler is executed, but the view is not generated yet
        postHandle() – called after the handler is executed
        afterCompletion() – called after the complete request has finished and view was generated
        
9 . model
- All classes in this package is annotated using @Entity to that the class is an entity and is mapped to a database table and will be able to perform CRUD operations on the domain entities.
- Some classes may annotated using @Table to specifies the name of the database table to be used for mapping. No need to add this if the class name and table name is equals.
- All classes in this package is annotated using @Data and it will automatically create getters and setters to the variables defined in this class.

10 . Service
- All classes in this package is annotated using @Component or @Service.
- @Component is a generic stereotype for any Spring-managed component.
- @Service to indicate that it's holding the business logic.
- Spring only pick up and registers beans with @Component  and doesn't look for @Service. 

11 . Util
- This package includes common implementations such as logging, validators. 