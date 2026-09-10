FROM openjdk:26-ea-slim
COPY ./target/classes/com /tmp/com
WORKDIR /tmp
ENTRYPOINT ["java", "com.naiper.sem.App"]