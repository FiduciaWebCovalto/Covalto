#!/bin/bash

# Configuration
JAVA_OPTS="-server -XX:+UseG1GC -XX:+ExitOnOutOfMemoryError -Dfile.encoding=UTF-8 -Djava.awt.headless=true -Dspring.threads.virtual.enabled=true"

JAR_ORACLE="fiduciawebmovil-1.1.0.jar"

PID_ORACLE="fiduciawebmovil.pid"

# Variables de ambiente
export PORT=8091
export LOCAL_DB_URL=jdbc:oracle:thin:@localhost:1521/XEPDB1
export LOCAL_DB_USERNAME=hsbc
export LOCAL_DB_PASSWORD=ghrDevel0918$
export JWT_SECRET=dennis123456789phegon123456789den1234321
export JWT_EXPIRATION_TIME=2592000000
export MAIL_USER=ventas@trustechcapitalmexico.com
export MAIL_PASS=Leonardin7$
export MAIL_SERVER=smtp.hostinger.com$
export MAIL_SERVER_PORT=465
export MAIL_SERVER_PROTOCOL=smtp
export MAIL_SERVER_PORT=465
export PWD_RESET_URL=http://localhost:8080/FiduciaWebMovil/reset-password?code=
export AWS_ACCESS_KEY=AKIAU6GDUZUC625LCRAU
export AWS_SECRETE_KEY=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
export AWS_BUCKET_NAME=phegon-bank-bucket
export FILE_UPLOAD_DIR=C:/Documentos/pdf/upload
export FILE_UPLOAD_DIR2=C:/Documentos/pdf/contrato

start_services() {
    echo "=========================================================="
    echo " Iniciando Servicios FiduciaWeb con Java 21 (Virtual Threads)"
    echo "=========================================================="

    if [ -f "$JAR_ORACLE" ]; then
        if [ -f "$PID_ORACLE" ] && kill -0 $(cat "$PID_ORACLE") 2>/dev/null; then
            echo "[WARN] Servicio FiduciaWeb Movil (Oracle) ya se encuentra en ejecución (PID: $(cat $PID_ORACLE))."
        else
            echo "[INFO] Iniciando Servicio FiduciaWeb Movil (Oracle)..."
            nohup java $JAVA_OPTS -jar "$JAR_ORACLE" > fiduciawebmovil.log 2>&1 &
            echo $! > "$PID_ORACLE"
            echo "[OK] FiduciaWeb Movil (Oracle) iniciado con PID: $(cat $PID_ORACLE)"
        fi
    else
        echo "[WARN] Archivo $JAR_ORACLE no encontrado en el directorio actual."
    fi

}

stop_services() {
    echo "=========================================================="
    echo " Deteniendo Servicios FiduciaWeb"
    echo "=========================================================="

    if [ -f "$PID_ORACLE" ]; then
        PID=$(cat "$PID_ORACLE")
        if kill -0 "$PID" 2>/dev/null; then
            echo "[INFO] Deteniendo FiduciaWeb Movil (Oracle) PID: $PID..."
            kill "$PID"
            rm -f "$PID_ORACLE"
            echo "[OK] FiduciaWeb Movil (Oracle) detenido."
        else
            echo "[WARN] PID $PID no está activo."
            rm -f "$PID_ORACLE"
        fi
    fi

}

status_services() {
    echo "=========================================================="
    echo " Estado de Servicios FiduciaWeb"
    echo "=========================================================="

    if [ -f "$PID_ORACLE" ] && kill -0 $(cat "$PID_ORACLE") 2>/dev/null; then
        echo "[RUNNING] FiduciaWeb Movil (Oracle) ejecutándose (PID: $(cat $PID_ORACLE))"
    else
        echo "[STOPPED] FiduciaWeb Movil (Oracle) detenido"
    fi

}

case "$1" in
    start)
        start_services
        ;;
    stop)
        stop_services
        ;;
    restart)
        stop_services
        sleep 2
        start_services
        ;;
    status)
        status_services
        ;;
    *)
        start_services
        ;;
esac
