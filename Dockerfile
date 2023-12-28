FROM openjdk:11
EXPOSE 8083
ADD target/DevOpsTestSpring-0.0.1-SNAPSHOT.jar DevOpsTestSpring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/DevOpsTestSpring-0.0.1-SNAPSHOT.jar"]
