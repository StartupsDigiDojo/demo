## BUILDER IMAGE
# builds the project into an executable JAR

FROM gradle:7.4.2-jdk17 AS builder

USER gradle

WORKDIR /usr/src/digidojo

RUN mkdir .gradle

COPY --chown=gradle:gradle . ./

RUN gradle clean build

RUN gradle shadowJar



## RUNNER IMAGE
# copies the JAR and runs it

FROM eclipse-temurin:17-jdk AS runner

WORKDIR /digidojo

ENV PORT=8080

EXPOSE ${PORT}

COPY --from=builder /usr/src/digidojo/build/libs/*-all.jar ./demo.jar

ENTRYPOINT ["java", "-jar", "/digidojo/demo.jar"]