FROM openjdk:17
EXPOSE 8080
COPY target/springoot-githubactions.jar springoot-githubactions.jar
ENTRYPOINT ["java", "-jar", "/springoot-githubactions.jar"]
