package com.cdl.headfirst.factoryexample;


import com.cdl.headfirst.factoryexample.ingredient.PizzaTypeEnum;
import com.cdl.headfirst.factoryexample.pizza.Pizza;
import com.cdl.headfirst.factoryexample.store.PizzaStore;
import com.cdl.headfirst.factoryexample.storefactory.ChicagoPizzaStore;
import com.cdl.headfirst.factoryexample.storefactory.NYPizzaStore;

public class PizzaStoreMain {

    public static void main(String[] args) {
        // 制作纽约店蛤披萨
        PizzaStore nyStore = new NYPizzaStore();
        Pizza nyClamsPizza = nyStore.orderPizza(PizzaTypeEnum.CLAMS.getValue());
        System.out.println(nyClamsPizza.getName());

        // 制作芝加哥店面团披萨
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza chicagoStoreClamsPizza = chicagoStore.orderPizza(PizzaTypeEnum.DOUGH.getValue());
        System.out.println(chicagoStoreClamsPizza.getName());
    }

}
