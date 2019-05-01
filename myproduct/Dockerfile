FROM maven:3.5.2-jdk-8-alpine AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package

FROM openjdk:8-jdk-alpine
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/myproduct-service-0.0.1-SNAPSHOT.jar myproduct-service-0.1-Release.jar
EXPOSE 9966
ENTRYPOINT ["java","-jar","/myproduct-service-0.1-Release.jar"]