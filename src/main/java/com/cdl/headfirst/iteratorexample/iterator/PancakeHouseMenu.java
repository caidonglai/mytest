package com.cdl.headfirst.iteratorexample.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 煎饼屋菜单
 */
public class PancakeHouseMenu implements Menu {

    private List menuItems;

    public PancakeHouseMenu(List m) {
        this.menuItems = m;
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }

}
