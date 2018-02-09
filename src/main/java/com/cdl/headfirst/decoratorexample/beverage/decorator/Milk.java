package com.cdl.headfirst.decoratorexample.beverage.decorator;

import com.cdl.headfirst.decoratorexample.beverage.Beverage;

/**
 * 牛奶
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage b) {
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + 牛奶";
    }

    @Override
    public int getSize() {
        return this.beverage.getSize();
    }

    @Override
    public Double cost() {
        if (getSize() == BeverageSizeEnum.LARGE.getValue()) {
            return this.beverage.cost() + 0.5 + 1;
        } else if (getSize() == BeverageSizeEnum.MEDIUM.getValue()) {
            return this.beverage.cost() + 0.5 + 0.5;
        } else {
            return this.beverage.cost() + 0.5;
        }
    }

}
