package com.cdl.headfirst.duckexample;

import com.cdl.headfirst.duckexample.behavior.FlyBehavior;
import com.cdl.headfirst.duckexample.behavior.QuackBehavior;
import com.cdl.headfirst.duckexample.exception.DuckException;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    /**
     * 执行飞行
     */
    public void performQuack() {
        if (quackBehavior == null) {
            throw new DuckException("请初始化飞行实现类...");
        }
        quackBehavior.quack();
    }

    /**
     * 执行鸭子叫（呱呱叫）
     */
    public void performFly() {
        if (flyBehavior == null) {
            throw new DuckException("请初始化鸭子叫实现类...");
        }
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("游泳...");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
