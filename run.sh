#!/bin/bash

# Load common environment
. ../sqlib.sh

PK="SUPPORT:32519"
SONAR_TOKEN="sqp_bade7992c6dfab49993f0548697269dbaeb582fa"

# echo "Deleting project"
# curl -X POST -u $SONAR_TOKEN: $SONAR_HOST_URL/api/projects/delete?project=$PK

echo "Running analysis"
mvn clean verify sonar:sonar -Dsonar.host.url=$SONAR_HOST_URL -Dsonar.login=$SONAR_TOKEN -Dsonar.projectKey=$PK \
   -Dsonar.scm.disabled=true -X \
   -Dsonar.security.sources.javasecurity.S3649=s3649JavaSqlInjectionConfig.json \
   -Dsonar.security.sanitizers.javasecurity.S3649=s3649JavaSqlInjectionConfig.json \
   -Dsonar.security.sinks.javasecurity.S3649=s3649JavaSqlInjectionConfig.json \
   -Dsonar.branch.name=feature/megan2
