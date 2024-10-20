FROM openjdk:17-jdk-slim
COPY target/user-service-0.0.1-SNAPSHOT.jar userService.jar
ENTRYPOINT ["java", "-jar", "/userService.jar"]