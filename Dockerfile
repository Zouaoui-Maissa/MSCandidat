FROM openjdk:11
EXPOSE 8083
ADD target/MsCandidate-0.0.1-SNAPSHOT.jar MsCandidate.jar
ENTRYPOINT ["java","-jar","MsCandidate.jar"]

