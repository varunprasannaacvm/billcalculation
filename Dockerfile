
FROM eclipse-temurin:17-jdk-focal


COPY target/electricity-billing-system-1.0-SNAPSHOT-shaded.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]