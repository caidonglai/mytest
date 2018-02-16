package com.cdl.headfirst.stateexample.state;

import com.cdl.headfirst.stateexample.content.GumballMachine;

/**
 * 售出糖果
 */
public class SoldState extends State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine g) {
        this.gumballMachine = g;
    }

    @Override
    public void dispense() {
        System.out.println("正在出货.");
        this.gumballMachine.releaseCount();
        if (this.gumballMachine.getCount() > 0) {
            this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
        } else {
            System.out.println("货物已售罄.");
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        }
    }

}
