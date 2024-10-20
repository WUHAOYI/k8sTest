FROM openjdk:17-jdk-slim
COPY target/order-service-0.0.1-SNAPSHOT.jar orderService.jar
ENTRYPOINT ["java", "-jar", "/orderService.jar"]