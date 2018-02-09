package com.cdl.headfirst.decoratorexample.beverage.decorator;

import com.cdl.headfirst.decoratorexample.beverage.Beverage;

/**
 * 调味料装饰着
 */
public abstract class CondimentDecorator extends Beverage{

    public abstract String getDescription();

    public abstract int getSize();

}
