# Spring Boot Cohort Workspace

This repository collects coursework and experiments from the Spring Boot
cohort, with the `lovable-clone` module currently serving as the primary
Spring Boot application.

## Project Layout

- `lovable-clone/` – Spring Boot 4.x app that models Lovable-style projects,
  members, plans, and usage statistics.
- `homework/` – Reserved for course assignments (empty or WIP).

## Prerequisites

- JDK 21 (matches the `pom.xml` `java.version` property)
- Maven 3.9+
- PostgreSQL (optional locally, but required if you want to back the JPA
  entities with a real database)

## Getting Started

```bash
cd lovable-clone
mvn spring-boot:run
```

The app will start on `http://localhost:8080` with default Spring Boot dev
settings. Update `src/main/resources/application.yaml` to point to a local
PostgreSQL instance or any other datasource you prefer.

## Useful Maven Commands

- `mvn clean verify` – run the full build and tests
- `mvn spring-boot:run` – start the dev server with hot reload

## Next Steps

- Flesh out README sections for each module as they are built.
- Add database migration tooling (Flyway/Liquibase) once schema stabilizes.

