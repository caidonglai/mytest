package com.cdl.headfirst.iteratorexample.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator i) {
        this.stack.push(i);//把对象压入堆栈顶部
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {//测试堆栈是否为空
            return false;
        } else {
            Iterator iterator = (Iterator)stack.peek();//查看堆栈顶部的对象，但不从堆栈中移除它
            if (!iterator.hasNext()) {
                stack.pop();//移除堆栈顶部的对象，并作为此函数的值返回该对象
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator)stack.peek();//查看堆栈顶部的对象，但不从堆栈中移除它
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        } else {
            return null;
        }
    }

}
