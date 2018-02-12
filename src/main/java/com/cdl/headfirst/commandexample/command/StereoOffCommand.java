package com.cdl.headfirst.commandexample.command;

import com.cdl.headfirst.commandexample.invoker.StereoCD;

public class StereoOffCommand  implements Command{

    private StereoCD stereoCD;

    public StereoOffCommand(StereoCD s) {
        this.stereoCD = s;
    }

    @Override
    public void execute() {
        this.stereoCD.off();
    }

    @Override
    public void undo() {
        this.stereoCD.on();
        this.stereoCD.setCD();
        this.stereoCD.setVolume();
    }

}
