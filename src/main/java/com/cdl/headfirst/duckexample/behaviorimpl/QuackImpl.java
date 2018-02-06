package com.cdl.headfirst.duckexample.behaviorimpl;

import com.cdl.headfirst.duckexample.behavior.QuackBehavior;

public class QuackImpl implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("鸭子呱呱叫...");
    }

}
