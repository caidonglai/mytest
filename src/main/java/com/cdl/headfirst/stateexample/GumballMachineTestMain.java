package com.cdl.headfirst.stateexample;

import com.cdl.headfirst.stateexample.content.GumballMachine;

public class GumballMachineTestMain {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        //投入钱
        gumballMachine.insertQuarter();
        //扳动曲柄
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();



    }

}
