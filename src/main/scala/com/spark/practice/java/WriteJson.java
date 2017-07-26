/*
package com.spark.practice.java;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spark.practice.Person;
import org.apache.spark.api.java.function.FlatMapFunction;

import java.util.ArrayList;
import java.util.Iterator;

*/
/**
 * Created by cloudera on 2/21/17.
 *//*

public class WriteJson implements FlatMapFunction<Iterator<Person>, String> {

    @Override
    public Iterable<String> call(Iterator<Person> stringIteratorValues) throws Exception {
        ArrayList<String> person = new ArrayList<String>();
        ObjectMapper mapper = new ObjectMapper();

        while(stringIteratorValues.hasNext()) {
            Person text = stringIteratorValues.next();
            person.add(mapper.writeValueAsString(text));
        }
        return person;
    }
}
*/
