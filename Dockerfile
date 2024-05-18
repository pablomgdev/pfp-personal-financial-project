FROM eclipse-temurin:21

# VOLUME /tmp

ARG JAR_FILE=build/libs/*.jar

COPY run.sh .
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["./run.sh"]