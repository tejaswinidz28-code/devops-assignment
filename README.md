### DevOps Engineer Assignment

This repository contains a complete DevOps implementation for deploying a Spring Boot application using Docker, Kubernetes, CI/CD pipelines, MySQL, and Apache Kafka with multi-environment (Dev & QA) setup.

### Technologies Used

Java 17 / Spring Boot
Docker & Docker Compose
Kubernetes (Docker Desktop Cluster)
GitHub Actions CI/CD
MySQL 8
Apache Kafka

### Project Structure
devops-assignment/
├── app/
│   └── sample-spring-boot-app/
├── docker/
│   └── Dockerfile
├── k8s/
│   ├── dev/
│   └── qa/
├── ci/
│   └── github-actions.yml
├── docs/
│   └── stability-cost.md
└── README.md

### CI/CD Pipeline

GitHub Actions pipeline automatically triggers on every push to main branch:

Checkout code

Build Spring Boot application using Maven

Build Docker image

Deploy application to Kubernetes Dev namespace

### Local Setup Instructions
Prerequisites
Docker Desktop
Kubernetes enabled in Docker Desktop
Java 17
Maven

### Start MySQL
docker run -d --name mysql \
 -e MYSQL_ROOT_PASSWORD=root \
 -e MYSQL_DATABASE=appdb \
 -p 3306:3306 mysql:8

### Start Kafka
docker compose up -d

### Deploy Application (Dev)
kubectl apply -f k8s/dev/

## Access Application

### Dev:

http://localhost:30007


### QA:

http://localhost:30008

### Kafka API Test
Invoke-RestMethod -Method POST http://localhost:30007/kafka/publish/hello