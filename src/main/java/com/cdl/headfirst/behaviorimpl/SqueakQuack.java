package com.cdl.headfirst.behaviorimpl;

import com.cdl.headfirst.behavior.QuackBehavior;

public class SqueakQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("短促叫...");
    }

}
