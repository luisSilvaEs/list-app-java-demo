# ListApp API

ListApp is a REST API built with **Spring Boot** intended to manage lists and tasks using a MongoDB database.

This project is being developed as a learning and experimentation environment for:

- Java + Spring Boot REST APIs
- MongoDB integration
- Dockerized development environments
- API documentation using Swagger (OpenAPI)
- Production-ready backend conventions

---

## 🚀 Current Features

### ✅ Status Endpoint

Checks if the API is running.

```
GET /status
```

Example response:

```json
{
  "status": "API is running :)"
}
```

---

### ✅ Spring Boot Actuator Endpoints

Out-of-the-box monitoring endpoints provided by Spring Boot:

| Endpoint           | Description              |
| ------------------ | ------------------------ |
| `/actuator/health` | Application health check |
| `/actuator/info`   | Application metadata     |

Examples:

```
http://localhost:8080/actuator/health
http://localhost:8080/actuator/info
```

These endpoints are commonly used by:

- Load balancers
- Docker/Kubernetes health checks
- Monitoring systems

---

## 📘 API Documentation (Swagger)

The API is documented using **Swagger / OpenAPI** via Springdoc.

After starting the application, open:

```
http://localhost:8080/swagger-ui/index.html
```

Swagger allows you to:

- Explore endpoints
- Execute requests interactively
- View request/response schemas

---

## 🛠 Tech Stack

- Java 21
- Spring Boot 3
- Spring Web
- Spring Boot Actuator
- Springdoc OpenAPI (Swagger UI)
- Maven

---

## ▶️ Running the Application

### Start the application

1. Start the Docker container (to start up MongoDB collection)

```bash
docker compose up -d
```

2. Start the app

```bash
./mvnw spring-boot:run
```

The API will start on:

```
http://localhost:8080
```

---

### Stop the application

1. Press:

```
CTRL + C
```

in the terminal where the app is running.

---

2. Stop the container

```bash
docker compose down
```

## 📂 Project Structure

```
src/main/java
 └── com.luissilvacoding.listapp
     ├── ListappApplication.java
     ├── StatusController.java
     └── StatusResponse.java
```

---

## 📈 Roadmap (Planned)

- MongoDB integration (Docker)
- CRUD endpoints for tasks
- DTO validation
- Error handling
- Dockerized API service
- Authentication & authorization

---

## 👨‍💻 Author

Luis Silva  
https://github.com/

---

## 📄 License

This project is for learning and experimentation purposes.
