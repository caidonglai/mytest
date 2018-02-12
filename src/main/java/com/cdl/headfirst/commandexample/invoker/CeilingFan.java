package com.cdl.headfirst.commandexample.invoker;

/**
 * 吊扇
 */
public class CeilingFan {

    private int speed = 0;

    public void hightSpeed() {
        this.speed = SpeedEnum.HIGHT.getValue();
        System.out.println("吊扇高速");
    }

    public void mediumSpeed() {
        this.speed = SpeedEnum.MEDIUM.getValue();
        System.out.println("吊扇中速");
    }

    public void lowSpeed() {
        this.speed = SpeedEnum.LOW.getValue();
        System.out.println("吊扇低速");
    }

    public void offSpeed() {
        this.speed = SpeedEnum.OFF.getValue();
        System.out.println("吊扇关闭");
    }

    public int getSpeed() {
        return this.speed;
    }

}
