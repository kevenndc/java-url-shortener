#!/bin/bash
export JAVA_HOME="/c/Program Files/Java/jdk-17"
mvn clean install -DskipTests
docker_compose_file="$(pwd)/docker-compose.yml"
docker compose -f $docker_compose_file -p url-shortener restart url-shortener