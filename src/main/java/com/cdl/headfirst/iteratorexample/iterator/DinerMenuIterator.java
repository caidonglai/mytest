package com.cdl.headfirst.iteratorexample.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] m) {
        this.menuItems = m;
    }

    @Override
    public boolean hasNext() {
        // 判断是否已经获取完数组里面的所有元素
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }

}
