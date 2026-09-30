#!/bin/bash

echo "Iniciando Servicio FiduciaWeb 1.0.0"
java -jar fiduciaweb.jar > fiduciaweb.log 2>&1 &

echo "Iniciando Servicio FiduciaWeb Movil 1.0.0"
java -jar fiduciawbmovilp.jar > fiduciawbmovilp.log 2>&1 &
