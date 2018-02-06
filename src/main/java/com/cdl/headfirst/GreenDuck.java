package com.cdl.headfirst;

import com.cdl.headfirst.behaviorimpl.FlyWithWingsImpl;
import com.cdl.headfirst.behaviorimpl.QuackImpl;

public class GreenDuck extends Duck {

    public GreenDuck() {
        flyBehavior = new FlyWithWingsImpl();
        quackBehavior = new QuackImpl();
    }

    @Override
    public void display() {
        System.out.println("我是绿鸭子");
    }

}
