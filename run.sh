#!/bin/bash
POKER="poker-1.0.jar"
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
cd "$DIR"
if [ ! -f "./target/$POKER" ]
then
   mvn clean validate test package
fi

if [ -f "./target/$POKER" ]
then
   cd "$DIR/target"
   java -jar $POKER --enable-preview
fi
