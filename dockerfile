FROM openjdk
EXPOSE 8080
WORKDIR target
COPY src/. .
