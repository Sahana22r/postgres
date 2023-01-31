FROM openjdk:13-jdk-alpine
ADD target/springpostgres-0.0.1-SNAPSHOT.jar springpostgres-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "springpostgres-0.0.1-SNAPSHOT.jar"]
