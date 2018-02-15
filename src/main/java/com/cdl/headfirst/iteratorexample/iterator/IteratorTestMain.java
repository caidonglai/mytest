package com.cdl.headfirst.iteratorexample.iterator;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * 迭代器模式
 */
public class IteratorTestMain {

    public static void main(String[] args) {

        List<Menu> menuList = new ArrayList<Menu>();
        Hashtable hashtable = new Hashtable();
        hashtable.put("早餐1号", new MenuItem("蔬果沙拉", "营养又美味", true, 20));
        hashtable.put("早餐2号", new MenuItem("猪肉大葱包子", "营养又美味", false, 30));
        Menu breakfastMenu = new BreakfastMenu(hashtable);
        menuList.add(breakfastMenu);

        List list = new ArrayList();
        list.add(new MenuItem("咖啡套餐1号", "营养又美味", true, 25));
        list.add(new MenuItem("咖啡套餐2号", "营养又美味", true, 35));
        Menu pancakeHouseMenu = new PancakeHouseMenu(list);
        menuList.add(pancakeHouseMenu);

        MenuItem[] menuItems = {new MenuItem("正餐1号", "营养又美味", true, 55), new MenuItem("正餐2号", "营养又美味", true, 65)};
        Menu dinerMenu = new DinerMenu(menuItems);
        menuList.add(dinerMenu);

        // 提供一种方法，顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示（createIterator()方法）
        Waitress waitress = new Waitress(menuList);
        waitress.printMenu();

    }

}
