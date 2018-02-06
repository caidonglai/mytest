package com.cdl.headfirst.duckexample;

import com.cdl.headfirst.duckexample.behaviorimpl.FlyWithRocketImpl;
import com.cdl.headfirst.duckexample.behaviorimpl.SqueakQuack;
import com.cdl.headfirst.duckexample.exception.DuckException;

/**
 * 迷你鸭子模拟器
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        greenDuckDo();
        rubberDuckDo();
    }

    /**
     * 绿鸭子行为
     */
    public static void greenDuckDo() {
        Duck duck = new GreenDuck();
        duck.display();
        duck.swim();
        duck.performQuack();
        duck.performFly();
    }

    /**
     * 橡皮鸭子行为
     */
    public static void rubberDuckDo() {
        try {
            Duck duck = new RubberDuck();
            duck.display();
            duck.swim();
            duck.setQuackBehavior(new SqueakQuack());
            duck.performQuack();
            duck.setFlyBehavior(new FlyWithRocketImpl());
            duck.performFly();
            throw new DuckException("抛个异常玩玩1.");
        } catch(Exception e) {
            throw new DuckException("抛个异常玩玩2.", e);
        }

    }

}
