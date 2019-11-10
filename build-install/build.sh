#!/usr/bin/env bash
cd cadastro-proposta-api
mvn clean install
cd ../validador-credito-api
mvn clean install
cd ../analisador-credito-app
create-react-app --version
npm install && npm run build