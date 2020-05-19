package com.example.as.Collection.Set;

import java.util.*;

/**
 * @author jiayingchen
 * @created 2020/04/30
 * @project course-april-2020
 */

public class TrueFriend {

    public static void main(String[] args){

        //Given two arraylists containing friend names, find the true friends that appear in both list

        List<String> friendList1 = new ArrayList<>(Arrays.asList("Charli","Tom","Amy","Jane"));
        List<String> friendList2 = new ArrayList<>(Arrays.asList("Charli","John","Elsa","Justin"));

        Set<String> trueFriend = new HashSet<>();
        for(int i = 0; i < friendList1.size(); i++){
            trueFriend.add(friendList1.get(i));
        }

        //find intersection
        trueFriend.retainAll(friendList2);
        System.out.println(trueFriend);
    }
}
