package com.cdl.headfirst.commandexample.command;

import com.cdl.headfirst.commandexample.invoker.StereoCD;

public class StereoOnCommand implements Command{

    private StereoCD stereoCD;

    public StereoOnCommand(StereoCD s) {
        this.stereoCD = s;
    }

    @Override
    public void execute() {
        this.stereoCD.on();
        this.stereoCD.setCD();
        this.stereoCD.setVolume();
    }

    @Override
    public void undo() {
        this.stereoCD.off();
    }

}
