package com.cdl.headfirst.commandexample.invoker;

import com.cdl.headfirst.decoratorexample.beverage.decorator.BeverageSizeEnum;

public enum SpeedEnum {

    OFF("关闭", 0),
    LOW("低速", 1),
    MEDIUM("中速", 2),
    HIGHT("高速", 3);

    // 成员变量
    private String name;
    private int value;

    // 构造方法
    SpeedEnum(String name, int value) {
        this.name = name;
        this.value = value;
    }
    // 普通方法
    public static String getName(int value) {
        for (SpeedEnum se : SpeedEnum.values()) {
            if (se.getValue() == value) {
                return se.name;
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
