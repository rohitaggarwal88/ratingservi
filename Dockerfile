FROM openjdk:17
EXPOSE 4547
ADD target/jenkinspringboot.jar jenkinspringboot.jar
ENTRYPOINT ["java","-jar","jenkinsprinbootdocker.jar"]