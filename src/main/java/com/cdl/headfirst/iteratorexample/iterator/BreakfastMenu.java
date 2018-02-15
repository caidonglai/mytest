package com.cdl.headfirst.iteratorexample.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class BreakfastMenu implements Menu {

    private Hashtable menus;

    public BreakfastMenu(Hashtable m) {
        this.menus = m;
    }

    @Override
    public Iterator createIterator() {
        return menus.values().iterator();
    }
}
