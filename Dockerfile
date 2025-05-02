FROM openjdk:17
EXPOSE 4547
ADD target/jenkinspringbootnew1q.jar jenkinspringbootnew1q.jar
ENTRYPOINT ["java","-jar","jenkinspringbootnew1q.jar"]