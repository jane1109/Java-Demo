package com.example.as.Collection.Map;

import apple.laf.JRSUIUtils;
import sun.font.TextRecord;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author jiayingchen
 * @created 2020/05/04
 * @project course-april-2020
 */

public class MapDatabase {
    //Use a map to simulate database table
    //Use TreeMap since the implementation doesn't allow nulls and sorts its pairs by natural order of the keys

    TreeMap<Integer, String> dtb = new TreeMap<>();

    //create a table
    public MapDatabase() {
        this.dtb = dtb;
    }

    //insert an element
    public void insert(String n) {
        if (n != null) {
            if (dtb.size() == 0) {
                dtb.put(1, n);
            } else {
                dtb.put(dtb.lastKey() + 1, n);
            }
        }
    }

    //delete an element
    public void delete(String n) {
        if (n != null) {
            if (dtb.containsValue(n)) {

                //get all the TreeMap entries
                Set<Map.Entry<Integer, String>> entries = dtb.entrySet();
                for (Map.Entry<Integer, String> entry : entries) {
                    if (entry.getValue().equals(n)) {
                        dtb.remove(entry.getKey());
                        break;
                    }
                }
            }else{
                System.out.println("Value not exists");
            }
        }
    }

    //update the table
    public void update(String oldVal, String newVal) {
        if (newVal != null) {
            if (dtb.containsValue(oldVal)) {

                //get all the TreeMap entries
                Set<Map.Entry<Integer, String>> entries = dtb.entrySet();
                for (Map.Entry<Integer, String> entry : entries) {
                    if (entry.getValue().equals(oldVal)) {
                        entry.setValue(newVal);
                        break;
                    }
                }
            }
        }
    }

    //search an element
    public void search(String n) {
        if(n != null){
            if(dtb.containsValue(n)){
                System.out.println("Value exists");
            }else{
                System.out.println("Value not exists");
            }
        }
    }

    public static void main(String[] args) {
        MapDatabase d = new MapDatabase();
        d.insert("Sammy");
        d.insert("Jenny");

        d.delete("s");
        d.update("Sammy","Sephenie");
        d.search("Jey");
        System.out.println(d.dtb);
    }
}
