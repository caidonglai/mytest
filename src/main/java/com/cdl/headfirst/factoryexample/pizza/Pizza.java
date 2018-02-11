package com.cdl.headfirst.factoryexample.pizza;

import com.cdl.headfirst.factoryexample.ingredient.Clams;
import com.cdl.headfirst.factoryexample.ingredient.Dough;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Clams clams;

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
