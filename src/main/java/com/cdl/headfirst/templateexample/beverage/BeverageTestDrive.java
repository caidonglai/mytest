package com.cdl.headfirst.templateexample.beverage;

public class BeverageTestDrive {

    public static void main(String[] args) {
        BeverageHook bh = new Tea();
        bh.doBeverage();

        BeverageHook bh1 = new Coffee();
        bh1.doBeverage();
    }

}
