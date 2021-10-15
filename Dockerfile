FROM openjdk:8-jdk-alpine

COPY target/task-0.0.1-SNAPSHOT.jar application.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/application.jar"]

