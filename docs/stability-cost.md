# Stability, Cost Optimization & Operations Strategy

## How would you ensure stability across Dev / QA / Prod?

To ensure stability across environments, each environment is isolated using separate Kubernetes namespaces (dev and qa). Configuration is managed using ConfigMaps so that environment specific variables are not hardcoded inside the application. Resource limits are applied on pods to avoid overconsumption of CPU and memory. Health probes ensure that only healthy pods receive traffic.



## How would you rollback a failed deployment?

Kubernetes rollout strategy is used. If a deployment fails, the previous stable version can be restored using:

kubectl rollout undo deployment springapp -n dev (for qa same line with qa)

This ensures zero downtime and fast recovery.



## What cost optimizations have you applied?

CPU and memory limits are applied to avoid unnecessary resource usage. Dev environment runs with a single replica to minimize infrastructure cost. Container images are kept lightweight using eclipse-temurin base image. Only required services are running locally.



## How would you monitor Pod health, Kafka lag and DB performance?

Pod health is monitored using Kubernetes liveness and readiness probes. Kafka lag can be monitored using Kafka consumer group metrics and tools like Burrow. MySQL performance can be monitored using MySQL exporter with Prometheus and Grafana dashboards.



## What would you automate next?

If given more time, I would automate infrastructure provisioning using Terraform, add Helm charts for deployments, configure centralized logging using ELK stack, and implement canary deployment strategy.
