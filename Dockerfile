FROM eclipse-temurin:17
COPY target/DockerController.jar DockerController.jar
CMD  ["java","-jar","DockerController.jar"]