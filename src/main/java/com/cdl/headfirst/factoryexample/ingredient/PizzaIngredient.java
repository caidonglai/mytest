package com.cdl.headfirst.factoryexample.ingredient;

// 抽象工厂模式
public interface PizzaIngredient {

    public Dough createDough();
    public Clams createClams();

}
