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

class ParseJson implements FlatMapFunction<Iterator<String>, Person> {

    @Override
    public Iterable<Person> call(Iterator<String> stringIterator) throws Exception {
        ArrayList<Person> person = new ArrayList<Person>();
        ObjectMapper mapper = new ObjectMapper();
        while(stringIterator.hasNext()) {
            String line = stringIterator.next();


            try {
                person.add(mapper.readValue(line, Person.class));
            } catch (Exception ex) {

            }
        }

        return person;
    }
}
*/
