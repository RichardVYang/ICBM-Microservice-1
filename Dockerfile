FROM openjdk:8
RUN mkdir -p /opt/yang/icbmlocation
ADD target/icbm-ms-0.0.1-SNAPSHOT.jar /opt/yang/icbmlocation/
EXPOSE 8080
CMD ["java", "-jar", "/opt/yang/icbmlocation/icbm-ms-0.0.1-SNAPSHOT.jar"]
