FROM openjdk:17
EXPOSE 8080
ADD target/spe_min_project.jar spe_min_project.jar
ENTRYPOINT ["java","-jar","/spe_min_project.jar"]