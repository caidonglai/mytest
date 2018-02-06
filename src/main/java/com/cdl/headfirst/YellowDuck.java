package com.cdl.headfirst;

import com.cdl.headfirst.behaviorimpl.FlyWithWingsImpl;
import com.cdl.headfirst.behaviorimpl.QuackImpl;

public class YellowDuck extends Duck {

    public YellowDuck() {
        flyBehavior = new FlyWithWingsImpl();
        quackBehavior = new QuackImpl();
    }

    @Override
    public void display() {
        System.out.println("我是黄鸭子");
    }

}
