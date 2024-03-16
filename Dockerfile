FROM openjdk:17
EXPOSE 9090
COPY target/demo88.jar /demo88.jar
ENTRYPOINT ["java", "-jar", "/demo88.jar"]
