package com.example.as.oop;

/**
 * @author jiayingchen
 * @created 2020/04/30
 * @project course-april-2020
 */

class Demo {
    public void show(int a) {
        System.out.println("show int : " + a);
    }

    public void show(String s){
        System.out.println("show String: " + s);
    }

    public void show(int a, int b){
        int rst = a + b;
        System.out.println("show sum: " + rst);
    }
}

public class staticPolymorphism {
    //overload in same class
    public static void main(String[] args){
        Demo d = new Demo();
        d.show(1);
        d.show("hi");
        d.show(5,5);
    }
}
