FROM openjdk:8-jre-alpine3.9
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} test_service-1.0.0.jar
COPY application.properties /application.properties
ENTRYPOINT ["java","-jar","/test_service-1.0.0.jar"]

