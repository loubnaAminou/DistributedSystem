FROM openjdk:8-jdk-alpine
EXPOSE 8761
ARG JAR_FILE=eureka-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]