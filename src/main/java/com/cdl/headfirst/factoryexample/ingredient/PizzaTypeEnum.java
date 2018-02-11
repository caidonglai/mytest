package com.cdl.headfirst.factoryexample.ingredient;

import com.cdl.headfirst.decoratorexample.beverage.decorator.BeverageSizeEnum;

public enum PizzaTypeEnum {

    CLAMS("蛤", 1),
    DOUGH("面团", 2);

    // 成员变量
    private String name;
    private int value;

    // 构造方法
    PizzaTypeEnum(String name, int value) {
        this.name = name;
        this.value = value;
    }
    // 普通方法
    public static String getName(int value) {
        for (PizzaTypeEnum pte : PizzaTypeEnum.values()) {
            if (pte.getValue() == value) {
                return pte.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

}
