/*
package com.spark.practice.streaming

import com.google.gson.Gson
import org.apache.spark.SparkConf
import org.apache.spark.streaming.twitter.TwitterUtils
import org.apache.spark.streaming.{Seconds, StreamingContext}
import twitter4j.auth.OAuthAuthorization
import twitter4j.conf.ConfigurationBuilder

object StreamingExample {

  private var gson = new Gson()

  def main(args : Array[String]) {

    val conf = new SparkConf().setMaster("local[*]").setAppName("Spark Streaming")
    val ssc = new StreamingContext(conf, Seconds(1))

    val auth = Some(new OAuthAuthorization(new ConfigurationBuilder().build()))

    val tweetStream = TwitterUtils.createStream(ssc, auth).map(gson.toJson(_))

    tweetStream.foreachRDD((rdd, time) => {
      val count = rdd.count()
      if(count > 0) {
        /*val outputRDD = rdd.repartition()*/
      }
    })


  }

}
*/
