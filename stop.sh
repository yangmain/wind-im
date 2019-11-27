#!/bin/bash

PORT=$1
IS_RESTART=$2
JAVA_JAR="windchat-server"

##set tcp port
if [ -n $PORT ]; then
	PORT=2021
fi
	
echo "[OK] WindChat is closing [PORT:"$PORT"]"

PID=$(ps -ef|grep $JAVA_JAR|grep $PORT |head -1| awk '{printf $2}')

#if [ $? -eq 0 ]; then
if [ $PID ]; then
    echo "[OK] WindChat is running on [PID:"$PID"]"
else
    echo "[ERROR] WindChat stop failure, as it's not running."
    echo ""
    exit
fi


kill -9 ${PID}

if [ $? -eq 0 ];then
    echo "[OK] WindChat is stoped [PORT:"$PORT" PID:"$PID"]"
else
    echo "[ERROR] WindChat stop failure."
fi

echo ""