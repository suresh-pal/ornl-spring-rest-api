# Getting Started

### Project Description
This project/application demonstrates on how to manage the information of ORNL employees stored in USER_ACCOUNTS table. The information received(POST), accessed(GET) and managed(PUT/DELETE) via the REST API. My enabling this as an API, the information can be shared accross the enterprise systems in a more decoupled manner. The GET, POST, PUT and DELETE are HTTP methods by which other systems can manage the USER_ACCOUNTS table information.

### Technology Demonstrated
This project in a java spring application leveraging springboot for faster development. The project dependencies are Spring Web, Spring Data JPA, embedded Apache Derby Database and embedded Tomcat server. The project skeletion was build using [Spring Initializr](https://start.spring.io/)

### User Testing
Even though this application can run on Linux or MacOS, The instructions below are currently provided for Windows environment. To test this application, the assumption are that the user has the below:

1) Windows PC
2) Java 8 or above installed. Refer attached document for new installation
3) Git Bash or Windows powershell that has Git installed. Git bash can be installed from https://gitforwindows.org/. Open command line git and clone the project from github using the command

$mkdir sureshapp
$cd sureshapp
$git clone https://github.com/suresh-pal/ornl-spring-rest-api.git
cd ornl-spring-rest-api

To run the application run the below commad. This will launch the application on Tomcat Server that listens on port 8080. The command will also bring up the embedded Derby Database and insert couple of user records into the table USER_ACCOUNTS table.

$java -jar target/rest-0.0.1-SNAPSHOT.jar



4) Postman or Chrome browser with Advanced Rest Client plugin installed to test the application. 



### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
