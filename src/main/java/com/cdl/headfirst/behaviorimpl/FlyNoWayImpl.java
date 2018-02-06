package com.cdl.headfirst.behaviorimpl;

import com.cdl.headfirst.behavior.FlyBehavior;

public class FlyNoWayImpl implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("不能飞...");
    }

}
