package com.cdl.headfirst.decoratorexample.beverage.decorator;

import com.cdl.headfirst.decoratorexample.beverage.Beverage;

/**
 * 杯子型号
 */
public class Size extends Beverage {

    private Beverage beverage;

    public Size(int size, Beverage b) {
        b.setSize(size);
        this.beverage = b;
    }

    @Override
    public Double cost() {
        return this.beverage.cost();
    }

    @Override
    public String getDescription() {
        if (getSize() == BeverageSizeEnum.LARGE.getValue()) {
            return this.beverage.getDescription() + "大杯";
        } else if (getSize() == BeverageSizeEnum.MEDIUM.getValue()) {
            return this.beverage.getDescription() + "中杯";
        } else {
            return this.beverage.getDescription() + "小杯";
        }
    }

    @Override
    public int getSize() {
        return this.beverage.getSize();
    }

}
