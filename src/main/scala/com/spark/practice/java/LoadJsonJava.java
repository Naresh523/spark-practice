/*
package com.spark.practice.java;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.spark.Accumulator;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

*/
/**
 * Created by cloudera on 2/20/17.
 *//*

public class LoadJsonJava {

    public static void main (String args[]) {

        SparkConf conf = new SparkConf().setAppName("Spark Java word count Application");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> input = sc.textFile("/user/cloudera/input.txt");

        final Accumulator<Integer> blankLines = sc.accumulator(0);
        JavaRDD<String> callSigns = input.flatMap(new FlatMapFunction<String, String>() {
            @Override
            public Iterable<String> call(String s) throws Exception {
                if(s.equals(" ")) {
                    blankLines.add(1);
                }
                return Arrays.asList(s.split(" "));
            }
        });

        callSigns.saveAsTextFile("/user/cloudera/accumulator/output.txt");
        System.out.println("Blank Lines:" +blankLines.value());

        */
/*Read Json*//*


        */
/*JavaRDD<Person> result = input.mapPartitions(new ParseJson());
        result.saveAsTextFile("/user/cloudera/java/parseJson.json");*//*


        */
/*Write as Json*//*


        */
/*JavaRDD<Person> formatted = input.mapPartitions(new ParseJson()).filter(new LikePandas());
        JavaRDD<String> writeResult = formatted.mapPartitions(new WriteJson());
        writeResult.saveAsTextFile("OutputFile_Path");*//*



        */
/*Split into words*//*

        */
/*JavaRDD<String> words = input.flatMap(
                new FlatMapFunction<String, String>() {
                    @Override
                    public Iterable<String> call(String s) throws Exception {
                        return Arrays.asList(s.split(" "));
                    }
                }
        );

        *//*
*/
/*Transform into pairs and counts*//*
*/
/*
        JavaPairRDD<String, Integer> counts = words.mapToPair(
                new PairFunction<String, String, Integer>() {
                    @Override
                    public Tuple2<String, Integer> call(String s) throws Exception {
                        return new Tuple2<String, Integer>(s, 1);
                    }
                }
        ).reduceByKey(new Function2<Integer, Integer, Integer>() {
            @Override
            public Integer call(Integer x, Integer y) throws Exception {
                return x + y;
            }
        });

        counts.saveAsTextFile("/user/cloudera/java/wordcount.txt");*//*




    }

}
*/
