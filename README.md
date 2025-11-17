# BlogNest Backend

A robust RESTful API backend for the BlogNest blogging platform, built with Spring Boot and Java.

## Overview

BlogNest Backend provides a scalable and secure API for managing blog posts, user authentication, and content management. This application serves as the server-side component of the BlogNest blogging platform.

## Tech Stack

- **Java 17** - Programming language
- **Spring Boot 3.5.7** - Application framework
- **Spring Data JPA** - Data persistence and ORM
- **MySQL** - Relational database
- **Lombok** - Reduces boilerplate code
- **Maven** - Build and dependency management

## Features

- RESTful API architecture
- JPA-based data persistence
- MySQL database integration
- Clean code with Lombok annotations
- Built-in testing support with Spring Boot Test

## Prerequisites

Before running this application, ensure you have the following installed:

- Java Development Kit (JDK) 17 or higher
- Maven 3.6+ (or use the included Maven wrapper)
- MySQL 8.0+

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Raghav893/BlogNest-Backend.git
cd BlogNest-Backend
```

### 2. Configure Database

Create a MySQL database and update the application properties:

```properties
# src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/blognest
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Build the Project

Using Maven wrapper (recommended):

```bash
./mvnw clean install
```

Or using Maven:

```bash
mvn clean install
```

### 4. Run the Application

Using Maven wrapper:

```bash
./mvnw spring-boot:run
```

Or using Maven:

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080` by default.

## Project Structure

```
BlogNest-Backend/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/raghav/blognestbackend/
│   │   │       ├── controller/     # REST controllers
│   │   │       ├── model/          # Entity classes
│   │   │       ├── repository/     # JPA repositories
│   │   │       ├── service/        # Business logic
│   │   │       └── dto/            # Data transfer objects
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/                   # Unit and integration tests
├── pom.xml
└── README.md
```

## API Endpoints

Documentation for API endpoints will be added as development progresses. Consider integrating Swagger/OpenAPI for automatic API documentation.

## Development

### Running Tests

```bash
./mvnw test
```

### Building for Production

```bash
./mvnw clean package
java -jar target/BlogNest-Backend-0.0.1-SNAPSHOT.jar
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is currently unlicensed. Please contact the repository owner for licensing information.

## Author

**Raghav** - [GitHub Profile](https://github.com/Raghav893)

## Acknowledgments

- Spring Boot team for the excellent framework
- Spring Data JPA for simplified database operations
- Project Lombok for reducing boilerplate code

---

**Note:** This is an active project under development. Features and documentation will be updated regularly.
