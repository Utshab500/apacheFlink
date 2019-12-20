# Apache Flink Basic Practice

This repository is the for basic practice of **Apache Flink**. 

Version used: **1.9.1**


## Environment
I have used docker environement. Where I have launched an **Ubuntu 18** container with a shared volume mounted from my Windows 10 host machine.

To run **Apache Flink 1.9.1** *JDK 1.8* or greater is needed.

Apache Flink default port: **8081**

## Usage

 1. Write the code.
 2. build a JAR out of it.
 3. Then ran bellow command

`# ./bin/flink run ../flinkworkspace/wc.jar --input ../word-count/word\ count/wc.txt --output ../word-count/wordcount_out`
