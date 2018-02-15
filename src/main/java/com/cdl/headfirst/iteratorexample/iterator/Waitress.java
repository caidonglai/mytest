package com.cdl.headfirst.iteratorexample.iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {

    List<Menu> menuList;

    public Waitress(List<Menu> m) {
        this.menuList = m;
    }

    public void printMenu() {
        for (Menu menu : menuList) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
           MenuItem menuItem = (MenuItem) iterator.next();
           System.out.println(menuItem.getName()+"，"+menuItem.getDescription()+"，"+menuItem.getPrice());
        }
    }

}
