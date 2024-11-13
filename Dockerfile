FROM eclipse-temurin:17
COPY target/automationn.jar automationn.jar 
CMD [ "java", "-jar","automationn.jar"]