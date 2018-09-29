    # jvm-nov-18
__JVM Thing November 2018 Talk on GraalVM__
## Acknowledgements
These examples are taken from the GraalVM website and Ben Evans work on InfoQ, see [resources](## Resources) for full listing
## What is GraalVM
__High-performance polyglot VM__
## Why should I learn about it?
* Business differentiators
* Personal interest vs valid business case
## Licence
* recent changes to Oracle JDK terms
* community edition versus enterprise edition
## Background
 * C1 and C2 compilers
 * Tiered compilation: interpreted -> C1 -> C2
 * Dynamic, runtime optimizations on the actual hardware
 * JIT - Byte code to machine code
## Drop in JIT
First set of examples using CountUppercase, taken directly from the GraalVM permance examples
### Using GraalVM
* in my environment: export GRAALVM_HOME=$HOME/installs/graalvm
* ex-count-graalvm.sh vs ex-count-disable-graalvm.sh
* startup time slow, then runtime is quicker
### Using Hotspot
* __This should not be at all surprising - the whole point of Graal is that the JIT compiler will be one of the first things to be compiled, and so there will be a lot of JIT compiler warmup in the first few seconds after VM start.__
## Ahead of Time (AOT) compilation
__Once you compile a JVM application into a native executable, it can run without a JVM. In fact, what you get is a self-contained executable just like you would get with Go.__@jponge
## System Pricing Economics
* Cost per unit of work?
* Datacentre? Cloud?
* Pricing policies
* FaaS
## Resources
### Chris Wormald (presenter)
* @pcwormald
* https://github.com/pcwormald
* https://www.linkedin.com/in/pcwormald/
### GraalVM
* https://www.graalvm.org/
### Ben Evans [Author of The Well Grounded Java Developer](https://www.manning.com/books/the-well-grounded-java-developer]
* https://www.infoq.com/articles/Graal-Java-JIT-Compiler
* https://www.infoq.com/presentations/jmh
### Chris Seaton (Oracle)
* @ChrisGSeaton
* [Top 10 Things To Do With GraalVM](https://medium.com/graalvm/graalvm-ten-things-12d9111f307d)
### Maurice Naftalin (Java Author)
* [JDK IO 2017 - Maurice Naftalin - Not Your Father's Complexity](https://www.youtube.com/watch?v=7cuch100rRU)
### Chris Thalinger
* [Twitter's quest for a wholly Graal runtime by Chris Thalinger](https://www.youtube.com/watch?v=ZbccuoaLChk)
### Julien Ponge
* [The GraalVM frenzy](https://medium.com/@jponge/the-graalvm-frenzy-f54257f5932c)
### Christian Wimmer (Oracle)
* [Understanding Class Initialization in GraalVM Native Image Generation](https://medium.com/graalvm/understanding-class-initialization-in-graalvm-native-image-generation-d765b7e4d6ed)



