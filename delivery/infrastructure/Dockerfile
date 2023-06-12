FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/infrastructure-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]