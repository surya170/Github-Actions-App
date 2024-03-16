FROM openjdk:17
EXPOSE 9090
COPY target/springoot-githubactions.jar springoot-githubactions.jar
ENTRYPOINT ["java", "-jar", "/springoot-githubactions.jar"]
