FROM openjdk:17
EXPOSE 8080
ADD target/demo88.jar demo88.jar
ENTRYPOINT ["java", "-jar","/demo88.jar"]