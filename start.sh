#!/bin/bash

PORT=$1
PORT2=$2
IS_RESTART=$3


##set tcp port
if [ -n $PORT ]; then
	PORT=2021
fi
	
##set http port
if [ -n $PORT2 ]; then
	PORT2=8280 
fi

#### echo server is starting
echo "[OK] WindChat is starting  [tcp-port:"$PORT" http-port:"$PORT2"]"

JAVA_JAR="windchat-boot"
PID=$(ps -ef|grep $JAVA_JAR|grep $PORT |head -1| awk '{printf $2}')

###if server is running, exit and echo error
if [ $PID > 0 ]; then
    echo "[ERROR] WindChat is running [PID:"$PID"]"
    echo "[ERROR] WindChat start failure"
    echo ""
    exit
fi

java -Dsite.port=$PORT -Dhttp.port=$PORT2 -jar openzaly-server.jar >>stdout.log 2>&1 &

PID=$(ps -ef|grep $JAVA_JAR|grep $PORT |head -1| awk '{printf $2}')

if [ $? -eq 0 ]; then
    echo "[OK] WindChat tcp-port:"$PORT",http-port:$PORT2,PID:$PID"
    echo "[OK] WindChat is started successfully  [PID:"$PID"]"
else
    echo "[ERROR] WindChat is started failed"
    echo "exit..."
    echo ""
    exit
fi

echo ""
echo ""