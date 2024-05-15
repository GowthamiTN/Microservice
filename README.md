#  Microservices Architecture

## Overview
Microservices Architecture, focusing on building microservices using Spring Boot, managing deployment with Docker, and optimizing scalability and portability.

### Building Microservices using Spring Boot

Learn how to develop microservices using Spring Boot, including:

- Setting up a Spring Boot project
- Implementing RESTful APIs
- Integrating with databases
- Implementing service-to-service communication

### Right-sizing Microservices & Identifying Boundaries

Understand strategies for determining the appropriate size and boundaries of microservices, including:

- Domain-driven design principles
- Decomposition strategies
- Communication patterns between microservices

### Deployment, Portability & Scalability with Docker

Explore Docker for managing microservices deployment, portability, and scalability, covering:

- Docker basics and terminology
- Dockerizing Spring Boot applications
- Managing Docker containers and images
- Scaling microservices with Docker Swarm

## Maven Commands

### Maven Command	Description

- `mvn clean install -Dmaven.test.skip=true`:
  To generate a JAR file inside the target folder while skipping tests.

- `mvn spring-boot:run`:
  To start a Spring Boot Maven project.

- `mvn spring-boot:build-image`:
  To generate a Docker image using Buildpacks without the need for a Dockerfile.

## Docker Commands

### Docker Command	Description

- `docker build . -t eazybytes/accounts:s4`:
  Generate a Docker image based on a Dockerfile.

- `docker run -p 8080:8080 eazybytes/accounts:s4`:
  Start a Docker container based on a given image.

- `docker images`:
  List all Docker images present in the Docker server.

- `docker image inspect image-id`:
  Display detailed image information for a given image ID.

- `docker image rm image-id`:
  Remove one or more images for a given image IDs.

- `docker image push docker.io/eazybytes/accounts:s4`:
  Push an image or a repository to a registry.

- `docker image pull docker.io/eazybytes/accounts:s4`:
  Pull an image or a repository from a registry.

- Other Docker commands as per your requirement.

## Docker Compose Commands

- `docker-compose up`:
  Create and start containers based on the given Docker Compose file.

- `docker-compose down`:
  Stop and remove containers specified in the Docker Compose file.

- `docker-compose start`:
  Start containers specified in the Docker Compose file.

- `docker-compose stop`:
  Stop the running containers specified in the Docker Compose file.

## Google Jib Integration with Maven

- `mvn compile jib:dockerBuild`:
  Generate a Docker image using Google Jib without the need for a Dockerfile.
