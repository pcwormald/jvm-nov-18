#!/bin/bash

export JAVA_HOME=${GRAALVM_HOME:?}
export PATH=$JAVA_HOME/bin:$PATH

# building with jdk 10 causing incompatible class with jdk 8 (graalvm)
javac -version
echo "compiling..."
javac pcwormald/CountUpperCase.java

java -version
echo "starting..."
java \
	-Diterations=3 \
	pcwormald/CountUppercase In 2017 I would like to run ALL languages in one VM.
