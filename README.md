# Enterprise Banking Platform

## Project Overview

Enterprise Banking Platform is a Spring Boot backend application developed to simulate real-world banking operations and provide a practical environment for learning enterprise API automation testing.

The project focuses on implementing business logic, security, transaction processing, and integration with external services while following clean architecture principles.

---

## Technology Stack

### Backend
- Java 17
- Spring Boot
- Spring Security
- Maven

### Security
- JWT Authentication
- Role-Based Authorization

### Testing
- RestAssured (planned)
- TestNG
- WireMock

### Version Control
- Git
- GitHub

---

## Features Implemented

- JWT Authentication
- Role-Based Authorization
- Customer Management
- Account Management
- Money Transfer
- Fraud Detection
- Idempotent Transactions
- Rollback Support
- Global Exception Handling

---

## Project Structure

```
src/main/java
│
├── client
├── controller
├── dto
├── exception
├── idempotency
├── model
├── repository
├── security
└── service
```

---

## Development History

### Version 1.0
- Initial Spring Boot Project
- JWT Authentication
- Account Management APIs

### Version 1.1
- Added Customer Module
- Added Fraud Detection
- Added Money Transfer
- Added Transaction Rollback
- Added Idempotency Support
- Improved Account APIs

---

## Future Enhancements

- Loan Management
- Credit Card Module
- Beneficiary Management
- Transaction History
- PostgreSQL Integration
- Docker Support
- Redis Cache
- Kafka Messaging
- Jenkins CI/CD Pipeline
- Swagger Documentation