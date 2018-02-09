package com.cdl.headfirst.decoratorexample.beverage.decorator;

import com.cdl.headfirst.decoratorexample.beverage.Beverage;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage b){
        this.beverage = b;
    }

    @Override
    public Double cost() {
        if (getSize() == BeverageSizeEnum.LARGE.getValue()) {
            return this.beverage.cost() + 0.08 + 1;
        } else if (getSize() == BeverageSizeEnum.MEDIUM.getValue()) {
            return this.beverage.cost() + 0.08 + 0.5;
        } else {
            return this.beverage.cost() + 0.08;
        }
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " + 酱油";
    }

    @Override
    public int getSize() {
        return this.beverage.getSize();
    }

}
