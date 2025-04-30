FROM openjdk:17
EXPOSE 4547
ADD target/jenkinspringbootnew.jar jenkinspringbootnew.jar
ENTRYPOINT ["java","-jar","jenkinspringbootnew.jar"]