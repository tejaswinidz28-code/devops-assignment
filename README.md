# devops-assignment
# DevOps Engineer Assignment

This repository contains a complete DevOps implementation for deploying a Spring Boot application using Docker, Kubernetes, CI/CD pipelines, MySQL and Kafka.

---

## Technologies Used

- Spring Boot (Java 17)
- Docker & Docker Compose
- Kubernetes (Docker Desktop)
- GitHub Actions (CI/CD)
- MySQL
- Apache Kafka

---

## Project Structure

---

## CI/CD Pipeline

On every push to the `main` branch:

1. Code is built using Maven
2. Docker image is built
3. Kubernetes Dev deployment is triggered automatically

---

## How to Run Locally

### Prerequisites

- Docker Desktop
- Kubernetes enabled
- Java 17
- Maven

### Start Database
docker run -d --name mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=appdb -p 3306:3306 mysql:8

### Start Kafka
docker-compose up -d

### Deploy Application
kubectl apply -f k8s/dev/


### Access application:

http://localhost:30007