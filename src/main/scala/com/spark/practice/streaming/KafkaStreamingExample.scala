package com.spark.practice.streaming

import kafka.serializer.StringDecoder
import org.apache.spark.SparkConf
import org.apache.spark.streaming.kafka.KafkaUtils
import org.apache.spark.streaming.{Seconds, StreamingContext}


/*Example:
    $ bin/run-example streaming.DirectKafkaWordCount broker1-host:port,broker2-host:port \
    topic1,topic2*/

object KafkaStreamingExample {

def main(args : Array[String]): Unit = {

  if(args.length < 2) {
    System.err.print(
      s"""
         |Pass list of brokers and list of topics
       """.stripMargin)
  }

  val sparkConf = new SparkConf().setAppName("Kafka Streaming Example")
  val ssc = new StreamingContext(sparkConf, Seconds(2))

  val Array(broker, topics) = args

  //Create/setup kafka brokers and topics
  val kafkaParams = Map[String, String]("metadata.broker.list" -> broker)
  val topicsSet = topics.split(",").toSet

  /*val topics = List("testtopic").toSet*/ //Other way of writing not recommended

  //Creating DStreams through kafka broker
  val messages = KafkaUtils.createDirectStream[String, String, StringDecoder, StringDecoder](ssc, kafkaParams, topicsSet)

  //Get the lines, split the words, count the words
  val lines = messages.map(_._2)
  val words = lines.flatMap(_.split(" "))
  val counts = words.map(x => (x, 1L)).reduceByKey(_+_)
    counts.print()

  //start streaming app
  ssc.start()
  ssc.awaitTermination()

  }
}
