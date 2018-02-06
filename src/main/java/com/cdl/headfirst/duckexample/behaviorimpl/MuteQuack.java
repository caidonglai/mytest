package com.cdl.headfirst.duckexample.behaviorimpl;

import com.cdl.headfirst.duckexample.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("哑的不会叫...");
    }

}
