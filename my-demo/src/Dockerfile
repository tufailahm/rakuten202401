FROM openjdk:8
COPY . /src/java
WORKDIR /src/java
ARG name="Prajwal"
ENV env_name $name
RUN ["javac","Welcome.java"]
ENTRYPOINT [ "java" , "Welcome" ]
