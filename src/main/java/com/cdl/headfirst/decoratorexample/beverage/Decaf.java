package com.cdl.headfirst.decoratorexample.beverage;

/**
 * 无咖啡因咖啡
 */
public class Decaf extends Beverage{

    public Decaf() {
        this.description = "无咖啡因咖啡";
    }

    @Override
    public Double cost() {
        return 2.13;
    }

}
