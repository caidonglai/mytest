package com.cdl.headfirst.iteratorexample.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private boolean vegetarian;//是否蔬菜
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Iterator createIterator() {
        return new NullIterator();//菜单项无需创建组件迭代
    }

    @Override
    public void print() {
        System.out.print("菜单项："+getName()+"，"+getPrice()+"，"+getDescription());
        if (isVegetarian()) {
            System.out.print("----->是蔬菜");
        }
        System.out.println("");
    }

}
