FROM openjdk:17  # Use OpenJDK 17 as the base image

EXPOSE 8080  # Expose port 8080 for the application

ADD target/demo88.jar demo88.jar  # Add the JAR file from the target directory to the container

ENTRYPOINT ["java", "-jar", "/demo88.jar"]  # Define the entry point command to run the JAR file when the container starts
