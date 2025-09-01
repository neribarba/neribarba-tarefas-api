# ---------- Build stage ----------
FROM maven:3.9.8-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -q -DskipTests package

# ---------- Run stage ----------
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar
# Render/other PaaS inject PORT env var
ENV PORT=8080
EXPOSE 8080
# Use profile 'prod' (H2) para rodar em nuvem; localmente você usa o default (MySQL) sem esse argumento
ENTRYPOINT ["java","-jar","/app/app.jar","--spring.profiles.active=prod","--server.port=${PORT}"]
