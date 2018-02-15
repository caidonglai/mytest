package com.cdl.headfirst.iteratorexample.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {

    private MenuItem[] menuItems;

    public DinerMenu(MenuItem[] m) {
        this.menuItems = m;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
