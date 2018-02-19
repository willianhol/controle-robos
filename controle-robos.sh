#!/bin/bash
mvn clean install dockerfile:build

docker container run -it -p 8080:8080 wilsoft/controle-robos