package com.cdl.headfirst.stateexample.state;

import com.cdl.headfirst.stateexample.content.GumballMachine;

public class WinnerState extends State {

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine g) {
        this.gumballMachine = g;
    }

    @Override
    public void dispense() {
        System.out.println("你赢得了获得两次货物的机会.");
        System.out.println("正在出货.");
        this.gumballMachine.releaseCount();
        if (this.gumballMachine.getCount() <= 0) {
            System.out.println("货物已售罄.");
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        } else {
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

}
