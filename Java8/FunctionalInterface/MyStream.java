package com.example.as.Java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jiayingchen
 * @created 2020/05/05
 * @project course-april-2020
 */

/*
Use functional interface to implement Java 8 stream.map() function.
Define a “MyStream” class containing a functional interface and a static method “MyMap”.
 */

public class MyStream {

    public List<Integer> myMap(List<Integer> list, FuncInterface funcInterface){
        List<Integer> result = new ArrayList<>();
        for (int num : list){
            result.add(funcInterface.apply(num));
        }
        return result;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        MyStream myStream = new MyStream();
        List<Integer> result1 = myStream.myMap(list, o -> o*o);
        System.out.println(result1);

    }
}
