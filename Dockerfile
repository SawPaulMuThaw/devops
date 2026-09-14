FROM openjdk:26-ea-slim
COPY ./target/seMethods-1.0-SNAPSHOT-jar-with-dependencies.jar /tmp/seMethods-1.0-SNAPSHOT-jar-with-dependencies.jar
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "seMethods-1.0-SNAPSHOT-jar-with-dependencies.jar"]