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

# Important Points

Some important points I have came accross during the course of learning.

## What is Apache Flink?
**Apche Flink** is a big data processing framework like **Hadoop** & **Spark** but there are few differences between these three frameworks.

 1. **Hadoop** was a ***batch processing framework*** it was not able to do *stream processing*.
 2. **Spark** is able to process ***batch*** and ***stream*** both kind of data but by core it is a batch processing engine and simulated in a way to process stream data but not a true stream processing engine.
 3. **Flink** is the true ***stream*** processing engine by core though it is also able to process batch data and it is fastest among all.
