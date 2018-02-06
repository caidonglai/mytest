package com.cdl.headfirst.duckexample;

import com.cdl.headfirst.duckexample.behaviorimpl.FlyWithWingsImpl;
import com.cdl.headfirst.duckexample.behaviorimpl.QuackImpl;

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
