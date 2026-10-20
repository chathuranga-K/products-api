# Products API — Object-Oriented Programming & Design

A Java Spring Boot REST API developed as part of the **5COSC019W Object Oriented Programming** module at the University of Westminster. This project provides hands-on experience with object-oriented software design, RESTful web services, and backend application development through a series of practical tutorials.

## Overview

The project begins with a basic Spring Boot application and progressively develops into a product catalogue API. It explores how Java classes and objects can be designed, organized, and connected to build a maintainable backend application.

The practical work focuses on applying object-oriented programming concepts to a working application, separating business logic from HTTP request handling, and documenting the system using UML class diagrams.

## Technologies Used

- **Java** — Core programming language
- **Spring Boot** — Backend application framework
- **Spring Web** — REST API development
- **Maven** — Dependency management and project build
- **Swagger UI / OpenAPI** — API documentation and endpoint testing
- **Git & GitHub** — Version control and source code management
- **IntelliJ IDEA** — Development environment
- **UML** — Object-oriented design and class modelling

## Key Learning Areas

- **Object-Oriented Programming:** Classes, objects, constructors, fields, and methods.
- **Encapsulation:** Private fields, getters, setters, and JavaBean conventions.
- **REST API Development:** Creating and testing HTTP endpoints using Spring Boot.
- **JSON Serialization:** Understanding how Java objects are represented in JSON responses.
- **Collections & Generics:** Managing multiple product objects using Java collections such as `List<Product>`.
- **Service Layer Architecture:** Separating business logic into service classes and keeping controllers focused on HTTP requests.
- **Inheritance:** Extending a parent `Product` class with specialized `DigitalProduct` and `PhysicalProduct` subclasses.
- **UML Class Diagrams:** Representing class structures, relationships, dependencies, and inheritance.
- **Version Control:** Tracking development progress through Git commits and GitHub.

## Project Structure

```text
products-api/
├── src/
│   └── main/
│       └── java/
│           └── uk/ac/westminster/productsapi/
│               ├── ProductsApiApplication.java
│               ├── HelloController.java
│               ├── Person.java
│               ├── Product.java
│               ├── ProductController.java
│               ├── ProductService.java
│               ├── DigitalProduct.java
│               └── PhysicalProduct.java
├── docs/
│   └── uml/
├── pom.xml
└── README.md
```

*Note: The structure illustrates the main files developed throughout the tutorials. Your actual repository may contain additional classes or a different set of completed files.*

## Running the Application

### Prerequisites

- Java Development Kit (JDK) compatible with the project configuration
- IntelliJ IDEA or another Java IDE
- Maven, or the Maven Wrapper if included in the repository

### Steps

1. Clone the repository:

   ```bash
   git clone <your-github-repository-url>
   ```

2. Open the project in IntelliJ IDEA and load the Maven dependencies from `pom.xml`.

3. Run `ProductsApiApplication.java`.

4. Open Swagger UI in your browser:

   ```text
   http://localhost:8080/swagger-ui.html
   ```

5. Use the available endpoints to send requests and inspect the responses.

The application must be running before you can access the local API documentation.

## Academic Context

**Module:** 5COSC019W — Object Oriented Programming  
**Institution:** University of Westminster  
**Project Type:** University coursework and practical learning project

This repository serves as a record of my learning and practical implementation of object-oriented programming and backend development concepts using Java and Spring Boot. It is developed incrementally as the module progresses.

## Learning Journey

The repository evolves through the tutorial exercises, building on previous implementations to explore increasingly structured object-oriented designs. It also provides a practical reference for revisiting Java concepts, REST API development, and software design principles.

---

*Developed for academic learning as part of the Object Oriented Programming module.*
