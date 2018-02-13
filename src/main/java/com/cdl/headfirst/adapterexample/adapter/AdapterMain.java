package com.cdl.headfirst.adapterexample.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class AdapterMain {

    public static void main(String[] args) {
        List<Boy> list = new ArrayList<Boy>();
        Boy b1 = new Boy();
        b1.setName("Tom");
        b1.setAge(12);
        list.add(b1);
        Boy b2 = new Boy();
        b2.setName("Marry");
        b2.setAge(15);
        list.add(b2);

        //List不支持Enumeration，通过适配器模式，可以让List支持Enumeration
        Enumeration<Boy> e = new EnumerationToIterator(list.iterator());
        while (e.hasMoreElements()) {
            Boy b = e.nextElement();
            System.out.println(b.getName()+"，"+b.getAge());
        }

    }

}
