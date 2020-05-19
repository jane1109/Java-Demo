package com.example.as.Collection.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author jiayingchen
 * @created 2020/05/04
 * @project course-april-2020
 */

public class MapDemo {

    public static void main(String[] args){
        findDuplicateCharacters("Helo");
    }

    public static void findDuplicateCharacters(String word){
        char[] character = word.toCharArray();

        //build the Hashmap with character and number of times that appear in a string
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        for(Character c: character){
            if(charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }else{
                charMap.put(c,1);
            }
        }

        //print the duplicate char
        for(Character ch: charMap.keySet()){
            if(charMap.get(ch) > 1){
                System.out.println(ch + ": " + charMap.get(ch) + " times");
            }
        }
    }
}
