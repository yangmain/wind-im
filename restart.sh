#!/bin/bash
PORT=$1
PORT2=$2

#### echo akaxin logo and desc

##set tcp port
if [ -n $PORT ]; then
	PORT=2021
fi
	
##set http port
if [ -n $PORT2 ]; then
	PORT2=8280 
fi

sh stop.sh $PORT 1
sh start.sh $PORT $PORT2 1