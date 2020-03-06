FROM openjdk:8-jdk-alpine
COPY ./target/SpringBootBatchCvsToDb-0.0.1-SNAPSHOT.jar SpringBootBatchCvsToDb-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","SpringBootBatchCvsToDb-0.0.1-SNAPSHOT.jar"]