package com.cdl.headfirst.decoratorexample.beverage.decorator;

public enum BeverageSizeEnum {

    SMALL("小杯", 1),
    MEDIUM("中杯", 2),
    LARGE("大杯", 3);

    // 成员变量
    private String name;
    private int value;

    // 构造方法
    BeverageSizeEnum(String name, int value) {
        this.name = name;
        this.value = value;
    }
    // 普通方法
    public static String getName(int value) {
        for (BeverageSizeEnum bse : BeverageSizeEnum.values()) {
            if (bse.getValue() == value) {
                return bse.name;
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
