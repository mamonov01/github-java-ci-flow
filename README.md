# GitHub Java CI Flow 🌿

## Overview
The **GitHub Java CI Flow 🌿** project is a comprehensive guide for configuring a Continuous Integration and Continuous Deployment (CI/CD) process for a Spring Boot application. It utilizes Maven and GitHub Actions, demonstrating the integration of Docker for building and pushing images to Docker Hub, culminating with deployment to a server. It's a practical blueprint for setting up a complete CI/CD pipeline, leveraging modern DevOps tools and practices.

## Table of Contents
1. [Introduction 🌱](#introduction)
2. [Prerequisites 🌵](#prerequisites)
3. [Setup and Configuration 🛠️](#setup-and-configuration)
4. [Building with Docker 🐳](#building-with-docker)
5. [CI/CD Pipeline with GitHub Actions 🚀](#cicd-pipeline-with-github-actions)
6. [Deployment 🌍](#deployment)
7. [Contributing 🤝](#contributing)

## Introduction 🌱
**GitHub Java CI Flow 🌿** is a quick-start guide to setting up a CI/CD pipeline for Spring Boot apps using Maven, Docker, and GitHub Actions. It's designed to be easy, practical, and perfect for getting straight to the point with CI/CD.

## Prerequisites 🌵
- JDK 17
- Maven
- Docker

## Setup and Configuration 🛠️

### Creating a Spring Boot Project

To set up your project:

1. **Use IntelliJ or Spring Website**: Create a new Spring Boot project using IntelliJ's built-in project generator or by visiting the [Spring Initializr website](https://start.spring.io).

2. **Pick 'Spring Web'**: Choose the 'Spring Web' dependency for web application capabilities.

3. **Download and Open**: If using the Spring website, download the project and open it in your IDE. If you used IntelliJ, the project opens directly.


### Creating a Simple Endpoint

After setting up your Spring Boot project, you'll create a simple endpoint.

1. **Create a New Controller**: Make a new Java class named `WelcomeController`.

2. **Add a Welcome Endpoint**: In `WelcomeController`, add this method:

   ```java
   import org.springframework.web.bind.annotation.GetMapping;
   import org.springframework.web.bind.annotation.RestController;

   @RestController
   public class WelcomeController {

       @GetMapping("/welcome")
       public String welcome() {
           return "Hello, my name is Dmitriy Mamonov";
       }
   }
  
This creates an endpoint at /welcome that returns a welcome message.

Test Your Endpoint: Run your application and visit http://localhost:8080/welcome in a browser or use a tool like Postman.

  ![Endpoint Test Result](#screenshot-of-test endpoing)

🚀 Your basic Spring Boot project is now set up and has a functioning endpoint.


## Building with Docker 🐳

### Creating a Dockerfile 📦

The Dockerfile is essential for building your application's Docker image. Here's how to create one:

```Dockerfile
# Base Image 🏗️
FROM eclipse-temurin:17-jdk-alpine
# We use eclipse-temurin:17-jdk-alpine, a lightweight Java 17 JDK image.

# Working Directory 🗂️
WORKDIR /app
# This line sets /app as the working directory in the Docker container.

# Copying Application Jar 📋
COPY target/github-java-ci-flow.jar github-java-ci-flow.jar
# This command copies the built JAR file into the Docker container.

# Exposing Port 🔌
EXPOSE 8080
# Expose port 8080, the default port for Spring Boot.

# Command to Run the Application 🚀
CMD ["java","-jar","github-java-ci-flow.jar"]
# This is the command to start the Spring Boot application.
```

🐳 With your Dockerfile in place, you're all set to build a Docker image for your Spring Boot application.


## CI/CD Pipeline with GitHub Actions 🚀
[TBD]

## Deployment 🌍
[TBD]

## Contributing 🤝
[TBD]



