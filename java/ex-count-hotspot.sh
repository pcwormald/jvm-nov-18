#!/bin/bash

javac -version
echo "compiling..."
javac pcwormald/CountUppercase.java

java -version
echo "starting..."
java -Diterations=3 \
	pcwormald/CountUppercase In 2017 I would like to run ALL languages in one VM.
