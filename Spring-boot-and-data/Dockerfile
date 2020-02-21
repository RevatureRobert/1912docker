
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/Spring-boot-and-data-0.0.1-SNAPSHOT.jar target/Spring-boot-and-data-0.0.1-SNAPSHOT.jar
EXPOSE 9099
# ENTRYPOINT exec java $JAVA_OPTS -jar docker.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.

CMD [ "./mvnw.cmd", "package" ]
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar docker.jar
