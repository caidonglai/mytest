package com.cdl.headfirst.factoryexample.storefactory;

import com.cdl.headfirst.factoryexample.ingredient.PizzaIngredient;
import com.cdl.headfirst.factoryexample.ingredient.PizzaTypeEnum;
import com.cdl.headfirst.factoryexample.ingredientfactory.ChicagoIngredient;
import com.cdl.headfirst.factoryexample.ingredientfactory.NYPizzaIngredient;
import com.cdl.headfirst.factoryexample.pizza.ClamsPizza;
import com.cdl.headfirst.factoryexample.pizza.DoughPizza;
import com.cdl.headfirst.factoryexample.pizza.Pizza;
import com.cdl.headfirst.factoryexample.store.PizzaStore;

/**
 * 纽约披萨店
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(int type) {
        Pizza pizza = null;
        PizzaIngredient pizzaIngredient = new NYPizzaIngredient();
        if (type == PizzaTypeEnum.CLAMS.getValue()) {
            pizza = new ClamsPizza(pizzaIngredient);
            pizza.setName("纽约蛤披萨");
            return pizza;
        } else if (type == PizzaTypeEnum.DOUGH.getValue()) {
            pizza = new DoughPizza(pizzaIngredient);
            pizza.setName("纽约面团披萨");
            return pizza;
        }
        return pizza;
    }

}
