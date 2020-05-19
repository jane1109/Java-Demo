package com.example.as.Java8.Joining;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author jiayingchen
 * @created 2020/05/05
 * @project course-april-2020
 */
public class Join {

    public static void main(String[] args){
        //replace a string with another word
        String s = "walabcwalexywalxzsfwalmx";
        System.out.println(Arrays.asList(s.split("(?i)wal")).stream().collect(Collectors.joining("Sams")));

    }

}
