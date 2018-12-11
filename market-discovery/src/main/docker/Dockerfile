FROM java:8

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    BEFORE_START_SLEEP=0 \
    JAVA_OPTS="" \
    SPRING_PROFILES_ACTIVE=instance1 \
    HOST_NAME=eureka1

CMD echo "The application will start in ${BEFORE_START_SLEEP}s..." && \
    sleep ${BEFORE_START_SLEEP} && \
    echo $(head -1 /etc/hosts | cut -f1) ${HOST_NAME} >> /etc/hosts && \
    java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app.jar --spring.profiles.active=${SPRING_PROFILES_ACTIVE}
    
ADD *.jar /app.jar