FROM java:8

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    BEFORE_START_SLEEP=49 \
    JAVA_OPTS=""

CMD echo "The application will start in ${BEFORE_START_SLEEP}s..." && \
    sleep ${BEFORE_START_SLEEP} && \
    java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app.jar
    
ADD *.jar /app.jar