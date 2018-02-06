package com.cdl.headfirst.behaviorimpl;

import com.cdl.headfirst.behavior.FlyBehavior;

public class FlyWithWingsImpl implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("用翅膀飞...");
    }

}
