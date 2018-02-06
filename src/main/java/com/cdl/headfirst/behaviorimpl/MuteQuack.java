package com.cdl.headfirst.behaviorimpl;

import com.cdl.headfirst.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("哑的不会叫...");
    }

}
