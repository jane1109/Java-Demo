package com.example.as.oop;

/**
 * @author jiayingchen
 * @created 2020/04/30
 * @project course-april-2020
 */

class Animal {
    public void sound() {
        System.out.println("Animal will make sound");
    }
}

class Cat extends Animal{
    //override method at child class

    @Override
    public void sound(){
        System.out.println("Meo Meo");
    }
}

public class DynamicPolymorphism {

    public static void main(String[] args) {
        Animal c = new Cat();
        c.sound();

    }
}

