package com.spark.practice

import com.fasterxml.jackson.databind.ObjectMapper
import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

case class Person(name: String, lovepandas: Boolean)

object LoadJson {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("JsonLoaderInScala")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    val input = sc.textFile("/user/cloudera/json/file.json")

    val mapper = new ObjectMapper()

    val result = input.flatMap(record => {
      try {
        Some(mapper.readValue(record, classOf[Person]))
      } catch {
        case e: Exception => None
      }
    })

    result.saveAsTextFile("/user/cloudera/json/fileout.txt")
    result.collect()



  }

}
