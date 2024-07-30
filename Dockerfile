FROM amazoncorretto:17-alpine-jdk
COPY target/dockerPractice-1.0.0.jar /opt/dockerPractice-1.0.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/dockerPractice-1.0.0.jar"]