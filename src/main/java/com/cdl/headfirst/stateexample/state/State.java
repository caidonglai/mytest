package com.cdl.headfirst.stateexample.state;

public abstract class State {

    public void insertQuarter() {
        System.out.println("已经投入过25块钱，无法再次投入.");
    }

    public void ejectQuarter() {
        System.out.println("无法退钱.");
    }

    public void turnCrank() {
        System.out.println("turnCrank无效操作.");
    }

    public void dispense() {
        System.out.println("dispense无效操作.");
    }

}
