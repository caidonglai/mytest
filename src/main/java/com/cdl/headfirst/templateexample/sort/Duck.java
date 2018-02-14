package com.cdl.headfirst.templateexample.sort;

public class Duck implements Comparable{

    private String name;
    private int age;

    public Duck(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Duck d = (Duck)o;
        if (this.age > d.age) {
            return 1;
        } else if (this.age == d.age) {
            return 0;
        } else if (this.age < d.age) {
            return -1;
        } else {
            return -1;
        }
    }
}
