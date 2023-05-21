FROM openjdk:8-alpine
EXPOSE 8081
ADD build/libs/bankApi-0.0.1-SNAPSHOT.jar bankApi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/bankApi-0.0.1-SNAPSHOT.jar"]