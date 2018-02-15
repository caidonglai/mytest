package com.cdl.headfirst.iteratorexample.composite;


/**
 * 组合模式
 */
public class IteratorTestMain {

    public static void main(String[] args) {

        MenuComponent breakfastMenu = new Menu("早餐菜单", "很美味");
        MenuComponent pancakeHouseMenu = new Menu("煎饼菜单", "很美味");
        MenuComponent dinerMenu = new Menu("正餐菜单", "很美味");
        MenuComponent dessertMenu = new Menu("甜点菜单", "很美味");

        MenuComponent allMenu = new Menu("全部菜单", "很美味");
        allMenu.add(breakfastMenu);
        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinerMenu);

        //加入菜单
        breakfastMenu.add(new MenuItem("猪肉大葱包子", "美味", false, 23));
        pancakeHouseMenu.add(new MenuItem("素煎饼", "美味", true, 8));
        dinerMenu.add(new MenuItem("宫保鸡丁盖饭", "美味", false, 16));

        //加入子菜单
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("法式小面包", "美味", true, 10));

        Waitress waitress = new Waitress(allMenu);
        waitress.printAllMenu();
        System.out.println("----------------------------");
        waitress.printVegetarinMenu();

    }

}
