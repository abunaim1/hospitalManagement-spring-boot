# 🏥 Hospital Management System

> A RESTful backend API built with Spring Boot for managing hospital operations including patients, doctors, appointments, and medical records.

---

## 📌 Project Status

🚧 **In Progress** — This project is actively being developed. Features and documentation will be updated continuously.

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Language | Java |
| Framework | Spring Boot |
| Database | PostgreSQL |
| ORM | Spring Data JPA / Hibernate |
| Build Tool | Maven |
| API Style | REST |

---

## 🗂️ Entity Relationship Diagram (ERD)

<img width="934" height="748" alt="ERD" src="https://github.com/user-attachments/assets/df4cc126-bfb3-4631-b764-fef401a0fbee" />

---

## 📁 Project Structure

```
hospitalManagement/
├── src/
│   ├── main/
│   │   ├── java/com.hospitalManagement.hospitalManagement/hospitalManagement/
│   │   │   ├── controller/
│   │   │   ├── dto/
│   │   │   ├── entity/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   └── HospitalManagementApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── pom.xml
```

---

## 🚀 Getting Started

### Prerequisites

- Java 21
- Spring Boot 4.0.2
- Maven
- postgresql

### Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/abunaim1/hospitalManagement-spring-boot.git
   cd hospitalManagement-spring-boot
   ```

2. **Configure the database**

   Update `src/main/resources/application.properties`:
   ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/hospitalDB
    spring.datasource.username=
    spring.datasource.password=
    spring.jpa.hibernate.ddl-auto=update
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

The server will start at `http://localhost:8080`

---

## 📡 API Endpoints

> Will be updated as development progresses.

### Patient
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/patients` | Get all patients |
| GET | `/api/patients/{id}` | Get patient by ID |
| POST | `/api/patients` | Create new patient |
| PUT | `/api/patients/{id}` | Update patient |
| DELETE | `/api/patients/{id}` | Delete patient |

---

## 🤝 Contributing

This is a personal learning project. Feel free to fork and explore!

---

## 👤 Author

**Abu Naim**
- GitHub: [@abunaim1](https://github.com/abunaim1)

---
