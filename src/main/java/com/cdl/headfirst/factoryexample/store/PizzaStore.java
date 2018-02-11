package com.cdl.headfirst.factoryexample.store;

import com.cdl.headfirst.factoryexample.pizza.Pizza;

/**
 * 披萨店
 */
public abstract class PizzaStore {

    public Pizza orderPizza(int type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 工厂方法模式
    protected abstract Pizza createPizza(int type);

}
