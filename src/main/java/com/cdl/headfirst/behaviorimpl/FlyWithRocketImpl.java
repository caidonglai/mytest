package com.cdl.headfirst.behaviorimpl;

import com.cdl.headfirst.behavior.FlyBehavior;

public class FlyWithRocketImpl implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("用火箭飞...");
    }

}
