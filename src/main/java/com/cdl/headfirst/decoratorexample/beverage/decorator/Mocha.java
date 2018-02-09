package com.cdl.headfirst.decoratorexample.beverage.decorator;

import com.cdl.headfirst.decoratorexample.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage b) {
        this.beverage = b;
    }

    @Override
    public Double cost() {
        if (getSize() == BeverageSizeEnum.LARGE.getValue()) {
            return this.beverage.cost() + 0.13 + 1;
        } else if (getSize() == BeverageSizeEnum.MEDIUM.getValue()) {
            return this.beverage.cost() +  0.13 + 0.5;
        } else {
            return this.beverage.cost() +  0.13;
        }
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + 摩卡";
    }

    @Override
    public int getSize() {
        return this.beverage.getSize();
    }

}
