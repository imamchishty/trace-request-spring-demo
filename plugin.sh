#!/bin/sh

clear
echo --------------------------------------------------------------------
echo Starting demo-trace-rest using $SPRING_PROFILE profile
echo --------------------------------------------------------------------
cd demo-trace-rest && mvn spring-boot:run