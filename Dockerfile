FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/github-java-ci-flow.jar github-java-ci-flow.jar
EXPOSE 8080
CMD ["java","-jar","github-java-ci-flow.jar"]