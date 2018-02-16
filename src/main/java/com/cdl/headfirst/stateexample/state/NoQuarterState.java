package com.cdl.headfirst.stateexample.state;

import com.cdl.headfirst.stateexample.content.GumballMachine;

/**
 * 没有25元钱
 */
public class NoQuarterState extends State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine g) {
        this.gumballMachine = g;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入25块钱.");
        this.gumballMachine.setState(this.gumballMachine.getHasQuarterState());
    }

}
