#Start with the base image containing JAVA 17
FROM openjdk:17-jdk-slim

MAINTAINER codevish.com

COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]