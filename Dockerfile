# Java version
FROM openjdk:17-jdk-alpine

# Variable for the application directory within the Docker image
ARG APP_DIR=/usr/app/

# Create the application directory
RUN mkdir -p $APP_DIR

# Sets the application directory as the working directory
WORKDIR $APP_DIR

# Copy the jar file to the application directory
COPY ./target/todo-api.jar $APP_DIR

# Sets environment variables
ENV DATABASE_URL=jdbc:postgresql://<host>:<port>/<database>
ENV DATABASE_USER=<username>
ENV DATABASE_PASSWORD=<password>

# Command to run the application
CMD ["java", "-jar", "todo-api.jar"]