package com.cdl.headfirst.adapterexample.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 适配器模式
 */
public class EnumerationToIterator implements Enumeration{

    private Iterator iterator;

    public EnumerationToIterator(Iterator i) {
        this.iterator = i;
    }

    @Override
    public boolean hasMoreElements() {
        return this.iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return this.iterator.next();
    }

}
