package com.cdl.headfirst.commandexample.command;

import com.cdl.headfirst.commandexample.invoker.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light l) {
        this.light = l;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.off();
    }

}
