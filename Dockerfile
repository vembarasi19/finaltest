FROM openjdk:21
COPY ./target/finaltest.jar finaltest.jar
CMD ["java","-jar","finaltest.jar"]