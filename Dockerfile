FROM openjdk:18
EXPOSE 8082
ADD target/balcoprojectDoctorClient.jar balcoprojectDoctorClient.jar
ENTRYPOINT ["java","jar","/balcoprojectDoctorClient.jar"]