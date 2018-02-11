package com.cdl.headfirst.factoryexample.ingredientfactory;

import com.cdl.headfirst.factoryexample.ingredient.*;

public class ChicagoIngredient implements PizzaIngredient {
    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
