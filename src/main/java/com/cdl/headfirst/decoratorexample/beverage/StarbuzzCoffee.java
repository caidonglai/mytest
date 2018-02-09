package com.cdl.headfirst.decoratorexample.beverage;

import com.cdl.headfirst.decoratorexample.beverage.decorator.*;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        // 无咖啡因咖啡
        Beverage beverage = new Decaf();
        // 无咖啡因咖啡 + 牛奶`
        beverage = new Milk(beverage);
        // 无咖啡因咖啡 + 酱油
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + "，价格：" + beverage.cost());

        // 深度烘培咖啡
        Beverage beverage1 = new DarkRoast();
        // 深度烘培咖啡 + 牛奶 + 牛奶 + 摩卡
        beverage1 = new Mocha(new Milk(new Milk(beverage1)));
        System.out.println(beverage1.getDescription() + "，价格：" + beverage1.cost());

        // 深度烘培咖啡
        Beverage beverage3 = new DarkRoast();
        // 深度烘培咖啡 + 小杯 + 牛奶 + 牛奶 + 摩卡
        beverage3 = new Mocha(new Milk(new Milk(new Size(BeverageSizeEnum.SMALL.getValue(), beverage3))));
        System.out.println(beverage3.getDescription() + "，价格：" + beverage3.cost());

        // 深度烘培咖啡
        Beverage beverage2 = new DarkRoast();
        // 深度烘培咖啡 + 大杯
        beverage2 = new Size(BeverageSizeEnum.LARGE.getValue(), beverage2);
        // 深度烘培咖啡 + 大杯 + 牛奶
        beverage2 = new Milk(beverage2);
        // 深度烘培咖啡 + 大杯 + 牛奶 + 牛奶
        beverage2 = new Milk(beverage2);
        // 深度烘培咖啡 + 大杯 + 牛奶 + 牛奶 + 摩卡
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + "，价格：" + beverage2.cost());

        // 深度烘培咖啡
        Beverage beverage4 = new DarkRoast();
        // 深度烘培咖啡 + 中杯 + 牛奶 + 牛奶 + 摩卡
        beverage4 = new Mocha(new Milk(new Milk(new Size(BeverageSizeEnum.MEDIUM.getValue(), beverage4))));
        System.out.println(beverage4.getDescription() + "，价格：" + beverage4.cost());
    }

}
