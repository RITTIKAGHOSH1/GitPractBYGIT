# Use Maven image to build the project
FROM maven:latest AS build

# Set working directory inside the container
WORKDIR /usr/src/app
COPY . /usr/src/app


# Command to run the application
#CMD ["mvn", "clean", "test"]
#CMD ["-jar", "GitPractByGit-1.0-SNAPSHOT.jar"]

RUN mvn clean package

# Step 5: Use an OpenJDK image to run the built app
FROM openjdk

# Step 6: Set the working directory inside the container again
WORKDIR /usr/src/app

# Step 7: Copy the compiled JAR from the build stage from my file sys into the final image
COPY --from=build /usr/src/app/target/GitPractByGit-1.0-SNAPSHOT.jar /usr/src/app/

# Step 8:  command to run the app (in this case, running the JAR file)
CMD ["java", "-jar", "/usr/src/app/GitPractByGit-1.0-SNAPSHOT.jar"]