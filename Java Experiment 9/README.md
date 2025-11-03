# Exp_3.2_Using_Spring_and_Hibernate_for_Dependency_Injection_CRUD_and_Transaction_Management

Transaction Management
Part a: Dependency Injection in Spring Using Java-Based Configuration
Objective:
To create a simple Spring application that demonstrates Dependency Injection (DI) using Java-based configuration instead of XML.

Explanation:
This task focuses on Spring’s core feature of DI using annotations:

Create two classes:

Student class that depends on a Course class.
Use Spring annotations:

@Configuration class to define beans.
@Bean to create and inject Course into Student.
Initialize the Spring context using AnnotationConfigApplicationContext.

Retrieve the Student bean and call its methods to demonstrate successful dependency injection.

This task helps in understanding:

How Spring manages object creation and wiring through DI.
Java-based configuration using annotations rather than XML files.
Part b: Hibernate Application for Student CRUD Operations
Objective:
To develop a Hibernate application that performs CRUD operations on a Student entity stored in a MySQL database using Hibernate ORM.

Explanation:
This task introduces Object Relational Mapping using Hibernate:

Define a Student class annotated with Hibernate/JPA annotations (@Entity, @Id, @Column).

Configure Hibernate using a hibernate.cfg.xml file or Java-based config.

Create operations:

Create: Add a new student.
Read: Fetch and display student(s).
Update: Modify student details.
Delete: Remove a student by ID.
Use SessionFactory and Session from Hibernate to manage database interactions.

This helps you understand:

Hibernate mapping and configuration.
Managing entities and sessions.
Performing database operations using Hibernate.
Part c: Transaction Management Using Spring and Hibernate
Objective:
To create a banking system using Spring integrated with Hibernate that allows users to transfer money between accounts while ensuring transaction consistency.

Explanation:
This task focuses on:

Spring transaction management (@Transactional).
Integrating Hibernate to handle persistence.
Steps involved:

Create two entities: Account and Transaction.

Use Spring annotations to:

Configure services and DAOs.
Annotate service methods with @Transactional.
In the service layer, write logic to:

Deduct money from one account.
Add money to another account.
Ensure that if any step fails, the transaction rolls back, maintaining atomicity and consistency.

This task demonstrates:

Real-world transactional use cases.
Declarative transaction handling in Spring.
Integration of Spring's service layer with Hibernate's persistence layer.
