#!/bin/bash

export JAVA_HOME=${GRAALVM_HOME:?}
export PATH=$JAVA_HOME/bin:$PATH

javac -version
echo "compiling..."
javac pcwormald/CountUppercase.java

java -version
echo "starting..."
java \
	-XX:-UseJVMCICompiler \
	-Diterations=3 \
	pcwormald/CountUppercase In 2017 I would like to run ALL languages in one VM.
