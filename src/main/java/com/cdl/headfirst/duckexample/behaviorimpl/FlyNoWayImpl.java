package com.cdl.headfirst.duckexample.behaviorimpl;

import com.cdl.headfirst.duckexample.behavior.FlyBehavior;

public class FlyNoWayImpl implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不能飞...");
    }

}
