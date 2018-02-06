package com.cdl.headfirst.behaviorimpl;

import com.cdl.headfirst.behavior.QuackBehavior;

public class QuackImpl implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("鸭子呱呱叫...");
    }

}
