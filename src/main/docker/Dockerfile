FROM ascdc/jdk8:latest
COPY lib appl/lib
COPY *.jar appl/app.jar
RUN echo "Asia/Shanghai" > /etc/timezone;
ENTRYPOINT ["java","-jar","appl/app.jar"]