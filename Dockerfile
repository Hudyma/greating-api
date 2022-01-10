FROM openjdk:8-jre-alpine
MAINTAINER Roman Hudyma <roman_hudyma@epam.com>

COPY ["target/greeting-api.jar", "greeting-api.jar"]
EXPOSE 8081

ENTRYPOINT ["java", "-jar", "greeting-api.jar"]
