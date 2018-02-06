package com.cdl.headfirst.duckexample.behaviorimpl;

import com.cdl.headfirst.duckexample.behavior.QuackBehavior;

public class SqueakQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("短促叫...");
    }

}
