package com.cdl.headfirst.factoryexample.storefactory;

import com.cdl.headfirst.factoryexample.ingredient.PizzaIngredient;
import com.cdl.headfirst.factoryexample.ingredient.PizzaTypeEnum;
import com.cdl.headfirst.factoryexample.ingredientfactory.ChicagoIngredient;
import com.cdl.headfirst.factoryexample.pizza.ClamsPizza;
import com.cdl.headfirst.factoryexample.pizza.DoughPizza;
import com.cdl.headfirst.factoryexample.pizza.Pizza;
import com.cdl.headfirst.factoryexample.store.PizzaStore;

/**
 * 芝加哥披萨店
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(int type) {
        Pizza pizza = null;
        PizzaIngredient pizzaIngredient = new ChicagoIngredient();
        if (type == PizzaTypeEnum.CLAMS.getValue()) {
            pizza = new ClamsPizza(pizzaIngredient);
            pizza.setName("芝加哥蛤披萨");
            return pizza;
        } else if (type == PizzaTypeEnum.DOUGH.getValue()) {
            pizza = new DoughPizza(pizzaIngredient);
            pizza.setName("芝加哥面团披萨");
            return pizza;
        }
        return pizza;
    }

}
