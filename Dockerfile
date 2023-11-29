FROM eclipse-temurin:17-jdk-alpine
MAINTAINER @olaolumusic
VOLUME /tmp
COPY target/*.jar paymentsdk.jar
ENTRYPOINT ["java","-jar","/paymentsdk.jar"]