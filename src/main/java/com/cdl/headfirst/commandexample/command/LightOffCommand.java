package com.cdl.headfirst.commandexample.command;

import com.cdl.headfirst.commandexample.invoker.Light;

public class LightOffCommand implements Command{

    private Light light;

    public LightOffCommand(Light l) {
        this.light = l;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }

}
