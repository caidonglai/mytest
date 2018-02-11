package com.cdl.headfirst.factoryexample.pizza;

import com.cdl.headfirst.factoryexample.ingredient.PizzaIngredient;

public class ClamsPizza extends Pizza {

    private PizzaIngredient pizzaIngredient;

    public ClamsPizza(PizzaIngredient p) {
        this.pizzaIngredient = p;
    }

    @Override
    public void prepare() {
        this.clams = pizzaIngredient.createClams();
    }

    @Override
    public void bake() {
        System.out.println("烤披萨");
    }

    @Override
    public void cut() {
        System.out.println("切披萨");
    }

    @Override
    public void box() {
        System.out.println("披萨装盒");
    }
}
