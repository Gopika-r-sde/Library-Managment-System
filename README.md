# Library Management System

A RESTful API for managing a library's book collection, built with Java, Spring Boot and MySQL.

The application lets you add, view, update and delete books through simple REST endpoints. It follows a layered architecture (Controller → Service → DAO → Repository) to keep each part of the code separate and easy to maintain. Every endpoint returns a consistent response format, and a centralized exception handler returns clear error messages, for example when a book is not found.

## Tech Stack
Java 25, Spring Boot, Spring Data JPA, MySQL, Maven, Postman

## Endpoints
- `POST /saveBooks` : add a new book
- `GET /getBooks` : get all books
- `GET /book/{id}` : get a book by id
- `PUT /book/{id}` : update a book
- `DELETE /delete/{id}` : delete a book

## How to Run
1. Install Java 25, Maven and MySQL
2. Set your MySQL username and password in `application.properties`
3. Run `mvn spring-boot:run`
4. Test the endpoints with Postman at `localhost:8080`