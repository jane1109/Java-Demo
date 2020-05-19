package com.example.as.Java8.GroupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author jiayingchen
 * @created 2020/05/05
 * @project course-april-2020
 */

public class GroupingBy {
    //split list into mutiple catergories, return map and count

    public static void main(String[] args){
        String s = "Eclipse eclipse Eclipse eclipse amc clip ECLIPSE";
        List<String> list = Arrays.asList(s.toLowerCase().split(" "));
        Map<String,Integer> occurance = list.stream().collect(Collectors.groupingBy(o -> o, Collectors.summingInt(o -> 1)));
        System.out.println(occurance);
    }
}
