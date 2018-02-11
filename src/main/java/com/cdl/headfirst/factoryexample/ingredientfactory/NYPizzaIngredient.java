package com.cdl.headfirst.factoryexample.ingredientfactory;

import com.cdl.headfirst.factoryexample.ingredient.*;

public class NYPizzaIngredient implements PizzaIngredient {
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
