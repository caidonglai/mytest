package com.cdl.headfirst.stateexample.content;

import com.cdl.headfirst.stateexample.state.*;

public class GumballMachine {

    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State winnerState;

    private State state;
    private int count;

    public GumballMachine(int c) {
        this.count = c;
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState();
        this.winnerState = new WinnerState(this);
        if (c > 0) {
            this.state = this.noQuarterState;
        }
    }

    public void releaseCount() {
        System.out.println("售出一件商品，数量-1，剩余：" + this.count);
        this.count = this.count - 1;
    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    public void setState(State state) {
        this.state = state;
    }

}
