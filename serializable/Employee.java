package com.example.as.Serializable;

import java.io.Serializable;

/**
 * @author jiayingchen
 * @created 2020/04/30
 * @project course-april-2020
 */

public class Employee implements Serializable {
    private static final long serialVersionUID = -3984954950L;

    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    //getter and setter method

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
