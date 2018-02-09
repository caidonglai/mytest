package com.cdl.headfirst.decoratorexample.beverage;

/**
 * 饮料
 */
public abstract class Beverage {

    // 饮料描述
    protected String description;

    // 杯子型号
    public int size;

    // 饮料价格
    public abstract Double cost();

    // 获取饮料描述
    public String getDescription() {
        return this.description;
    }

    // 获取杯子型号
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
