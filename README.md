# SpringBootRestExample
Sample REST CRUD API, REST Client with Spring Boot, Mysql, JPA.Includes profiles, logging, Health checks and metrics, Spring Security   
Steps to Setup: 
1. Clone the application https: //github.com/chalamalasettichamundeswari/SpringBootRestExample.git 
2. Create Mysql database create database employee_database 
3. Change mysql url, username and password and context path as per your installation open src / main / resources / application.properties - change spring.datasource.url, spring.datasource.username and spring.datasource.password server.servlet.context-path as per your mysql installation 
4. Build and run the app using Spring Boot App using maven install outide the application(Check target, snapshot.jar is getting or not) 
   1. open terminal go to the project directory(using cd command). 
   2. use pwd to know whether you are in present directory or not.
   3. java - jar target / studentrestapi - 0.0 .1 - SNAPSHOT.jar
The app will start running at http://localhost:8080 
  
Explore Rest APIs:  The app defines following CRUD APIs. 
GET /studentapi/student/  
POST /studentapi/student/  
GET /studentapi/student/{id}  
PUT /studentapi/student/ 
DELETE /studentapi/student/{id}  
profiles: Two ways to setup: 
1.open src / main / resources / application.properties - spring.profiles.active=dev/testing 
2.right click on the application.properties 
  click "run as" go to argumnets tab in the override properties type "-Dspring.profiles.active=dev/testing" 
  
Health checks and metrics: 
1.Add this dependency:  
  spring-boot-starter-actuator 
2.To expose all endpoints: 
  open src / main / resources / application.properties - management.endpoints.web.exposure.include=*  
  
Spring Security 
1.Add this dependency: 
  spring-boot-starter-security
