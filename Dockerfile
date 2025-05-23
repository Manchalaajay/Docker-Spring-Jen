FROM openjdk:21
WORKDIR /.
COPY target/*.jar /simplejavaproject.jar
EXPOSE 8092
CMD ["java","-jar","simplejavaproject.jar"]
