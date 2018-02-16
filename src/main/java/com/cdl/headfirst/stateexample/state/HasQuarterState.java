package com.cdl.headfirst.stateexample.state;

import com.cdl.headfirst.stateexample.content.GumballMachine;

import java.util.Random;

/**
 * 有25元钱
 */
public class HasQuarterState extends State {

    private GumballMachine gumballMachine;
    private Random random;

    public HasQuarterState(GumballMachine g) {
        this.gumballMachine = g;
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退出25元钱.");
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        random = new Random();
        // 10%的几率获得2次货物
        if (random.nextInt(100) <= 10 && this.gumballMachine.getCount() > 1) {
            System.out.println("扳动出货曲柄.");
            this.gumballMachine.setState(this.gumballMachine.getWinnerState());
        } else {
            System.out.println("扳动出货曲柄.");
            this.gumballMachine.setState(this.gumballMachine.getSoldState());
        }

    }

}
