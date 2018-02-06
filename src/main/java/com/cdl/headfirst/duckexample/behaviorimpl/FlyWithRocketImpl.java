package com.cdl.headfirst.duckexample.behaviorimpl;

import com.cdl.headfirst.duckexample.behavior.FlyBehavior;

public class FlyWithRocketImpl implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("用火箭飞...");
    }

}
