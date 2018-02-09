package com.cdl.headfirst.decoratorexample.beverage;

/**
 * 深度烘培咖啡
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        this.description = "深度烘培咖啡";
    }

    @Override
    public Double cost() {
        return 1.99;
    }

}
