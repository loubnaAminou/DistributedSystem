FROM openjdk:8-jdk-alpine
EXPOSE 8082
ARG JAR_FILE=radar-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]