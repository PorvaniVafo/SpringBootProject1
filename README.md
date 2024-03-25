SpringBoot REST API CRUD Operations using Spring Data JPA 

Prerequisites
Java Development Kit (JDK) 8 or higher installed on your system.
Maven installed on your system (for dependency management and building).
Installation
Clone this repository to your local machine using the following command:
```
git clone https://github.com/PorvaniVafo/SpringBootProject1
```
Navigate to the project directory:
```
cd SpringBootProject1
```
Usage
Open the project in your preferred Java IDE (Eclipse, IntelliJ IDEA, etc.).

Run the project:
If using an IDE, simply run the main application class (SpringBootProjectApplication.java).
If running from the command line, you can use Maven:
mvn spring-boot:run

Configuration
The application.properties file in the src/main/resources directory contains configuration properties for the application. Modify it as per your requirements (e.g., database configuration, etc.).
Dependencies

This project uses Spring Boot, simplifying the Spring configuration and dependency management process.
Additional dependencies can be added to the pom.xml file in the root directory of the project.

User
add this somewhere alsoRest end points :

Get All students : localhost:8080/students
Get student based on rollNo : localhost:8080/student/1
Create Student : localhost : localhost:8080/student/add
Update the student details : localhost:8080/student/update/2
Delete student based on id : localhost:8080/student/delete/1

