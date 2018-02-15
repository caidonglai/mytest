package com.cdl.headfirst.iteratorexample.composite;

import java.util.Iterator;

public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持add操作");
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持remove操作");
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException("不支持getChild操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持print操作");
    }

    public String getName() {
        throw new UnsupportedOperationException("不支持getName操作");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("不支持getDescription操作");
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException("不支持isVegetarian操作");
    }

    public Iterator createIterator() {
        throw new UnsupportedOperationException("不支持createIterator操作");
    }

}
