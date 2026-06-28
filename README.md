# 🏦 BankVerse

![Java](https://img.shields.io/badge/Java-11-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.18-brightgreen)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-18-blue)
![Build](https://img.shields.io/badge/Build-Maven-red)
![Status](https://img.shields.io/badge/Status-Story--001%20Completed-success)

Enterprise Digital Banking Platform built using **Spring Boot**, **PostgreSQL**, and **Java** following enterprise software architecture and banking domain best practices.

---

# 📖 Overview

BankVerse is an enterprise-style digital banking platform designed to simulate real-world banking systems.

The project focuses on building secure, scalable, and maintainable banking services while following enterprise design principles and clean architecture.

The implementation covers customer management, account management, transactions, authentication, authorization, fraud detection, notifications, API testing, UI automation, and enterprise software engineering practices.

---

# 🎯 Objectives

* Build a production-style banking backend.
* Apply enterprise architecture and design patterns.
* Learn banking business workflows.
* Implement secure REST APIs.
* Practice API, UI, and database testing.
* Develop reusable automation frameworks.
* Follow enterprise coding and documentation standards.

---

# 🛠 Technology Stack

| Category             | Technology                  |
| -------------------- | --------------------------- |
| Programming Language | Java 11                     |
| Backend Framework    | Spring Boot 2.7.18          |
| ORM Framework        | Spring Data JPA / Hibernate |
| Database             | PostgreSQL 18               |
| Build Tool           | Maven                       |
| IDE                  | Eclipse IDE 2024-09         |
| API Client           | Postman                     |
| Version Control      | Git & GitHub                |

---

# 🏗 Architecture

```text
                Client / Postman
                       │
                       ▼
                 REST Controller
                       │
                       ▼
                  Service Layer
             (Business Logic)
                       │
                       ▼
               Repository Layer
             (Spring Data JPA)
                       │
                       ▼
                PostgreSQL Database
```

---

# 📂 Project Structure

```text
src/main/java
│
├── controller
├── service
├── repository
├── model
├── dto
├── exception
├── security
├── client
└── idempotency
```

---

# 🚀 Features

### ✅ Customer Management

* Enterprise Customer Registration
* Customer Number Generation
* Customer Validation
* Duplicate Customer Detection
* Customer Status Management
* KYC Status Initialization
* Risk Score Initialization

### 🔒 Security

* Global Exception Handling
* Standard Error Response
* Enterprise Validation Framework

---

# 📋 Current Progress

| Story     | Module                           | Status      |
| --------- | -------------------------------- | ----------- |
| Story-001 | Enterprise Customer Registration | ✅ Completed |
| Story-002 | Enterprise Account Opening       | ⏳ Planned   |
| Story-003 | Cash Deposit                     | ⏳ Planned   |
| Story-004 | Cash Withdrawal                  | ⏳ Planned   |
| Story-005 | Fund Transfer                    | ⏳ Planned   |
| Story-006 | Transaction History              | ⏳ Planned   |
| Story-007 | Authentication & JWT             | ⏳ Planned   |
| Story-008 | Role-Based Authorization         | ⏳ Planned   |
| Story-009 | Fraud Detection                  | ⏳ Planned   |
| Story-010 | Notification Service             | ⏳ Planned   |

---

# 🔢 Customer Number Format

Customer numbers are generated using a **PostgreSQL Sequence**, ensuring uniqueness even when multiple customer registrations occur simultaneously.

Example:

```text
CUST000001
CUST000002
CUST000003
```

---

# 📌 Completed Stories

## Story-001 – Enterprise Customer Registration

Implemented:

* Layered Architecture
* Customer Entity
* Customer Repository
* Customer Service
* Customer Controller
* Customer Request DTO
* Customer Response DTO
* PostgreSQL Sequence
* Duplicate Validation
* Enterprise Exception Handling
* Global Exception Handler
* Customer Number Generation
* Enterprise Default Initialization

---

# 🔮 Planned Enhancements

* JWT Authentication
* Refresh Tokens
* Role-Based Authorization
* Account Management
* Transaction Management
* Loan Management
* Credit Card Module
* Fraud Detection Engine
* Notification Service
* Audit Logging
* Docker
* Kubernetes
* Redis
* Kafka
* Swagger / OpenAPI
* Jenkins CI/CD
* Selenium Automation
* RestAssured API Automation

---

# 🤝 Contributing

Contributions, suggestions, and improvements are welcome.

Please open an issue or submit a pull request after discussing significant changes.

---

# 📄 License

This repository is intended for educational purposes and enterprise software engineering practice.
## Latest Progress (29-Jun-2026)

### Customer Registration Testing Completed

✔ Positive API testing completed
✔ Duplicate PAN validation (409 Conflict)
✔ Invalid Email validation
✔ Invalid Phone Number validation
✔ Invalid PAN validation
✔ Invalid Aadhaar validation
✔ Invalid Customer Name validation
✔ Centralized exception handling verified
✔ Enterprise error responses validated

Current Status:
Story-001 Customer Registration is functionally complete and undergoing comprehensive negative and boundary testing.
