#!/bin/bash

# Configuration
JAVA_OPTS="-server -XX:+UseG1GC -XX:+ExitOnOutOfMemoryError -Dfile.encoding=UTF-8 -Djava.awt.headless=true -Dspring.threads.virtual.enabled=true"

JAR_ORACLE="fiduciawebmovil.jar"
JAR_POSTGRES="fiduciawebmovilp.jar"

PID_ORACLE="fiduciawebmovil.pid"
PID_POSTGRES="fiduciawebmovilp.pid"

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

    if [ -f "$JAR_POSTGRES" ]; then
        if [ -f "$PID_POSTGRES" ] && kill -0 $(cat "$PID_POSTGRES") 2>/dev/null; then
            echo "[WARN] Servicio FiduciaWeb Movil (PostgreSQL) ya se encuentra en ejecución (PID: $(cat $PID_POSTGRES))."
        else
            echo "[INFO] Iniciando Servicio FiduciaWeb Movil (PostgreSQL)..."
            nohup java $JAVA_OPTS -jar "$JAR_POSTGRES" > fiduciawebmovilp.log 2>&1 &
            echo $! > "$PID_POSTGRES"
            echo "[OK] FiduciaWeb Movil (PostgreSQL) iniciado con PID: $(cat $PID_POSTGRES)"
        fi
    else
        echo "[WARN] Archivo $JAR_POSTGRES no encontrado en el directorio actual."
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

    if [ -f "$PID_POSTGRES" ]; then
        PID=$(cat "$PID_POSTGRES")
        if kill -0 "$PID" 2>/dev/null; then
            echo "[INFO] Deteniendo FiduciaWeb Movil (PostgreSQL) PID: $PID..."
            kill "$PID"
            rm -f "$PID_POSTGRES"
            echo "[OK] FiduciaWeb Movil (PostgreSQL) detenido."
        else
            echo "[WARN] PID $PID no está activo."
            rm -f "$PID_POSTGRES"
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

    if [ -f "$PID_POSTGRES" ] && kill -0 $(cat "$PID_POSTGRES") 2>/dev/null; then
        echo "[RUNNING] FiduciaWeb Movil (PostgreSQL) ejecutándose (PID: $(cat $PID_POSTGRES))"
    else
        echo "[STOPPED] FiduciaWeb Movil (PostgreSQL) detenido"
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
