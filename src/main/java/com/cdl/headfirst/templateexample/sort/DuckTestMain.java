package com.cdl.headfirst.templateexample.sort;

import java.util.Arrays;

public class DuckTestMain {

    // java数组的sort里面就是用了模板方法模式
    public static void main(String[] args) {
        Duck[] ducks = {new Duck("greenDuck", 10), new Duck("yellowDuck", 2), new Duck("redDuck", 8), new Duck("blueDuck", 17)};
        Arrays.sort(ducks);
        for (int i=0; i<ducks.length; i++) {
            System.out.println(ducks[i].getName()+"："+ducks[i].getAge());
        }
    }

}
