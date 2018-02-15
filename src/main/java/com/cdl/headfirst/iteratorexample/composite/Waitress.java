package com.cdl.headfirst.iteratorexample.composite;

import com.cdl.headfirst.iteratorexample.iterator.Menu;
import com.cdl.headfirst.iteratorexample.iterator.MenuItem;

import java.util.Iterator;
import java.util.List;

public class Waitress {

    MenuComponent menuComponent;

    public Waitress(MenuComponent m) {
        this.menuComponent = m;
    }

    public void printAllMenu() {
        menuComponent.print();
    }

    //只获取素菜菜单
    public void printVegetarinMenu() {
        Iterator iterator = menuComponent.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent.isVegetarian()) {
                menuComponent.print();
            }
        }
    }

}
