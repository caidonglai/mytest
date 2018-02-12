package com.cdl.headfirst.commandexample.command;

import com.cdl.headfirst.commandexample.invoker.GarageDoor;

public class GarageDoorDownCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorDownCommand (GarageDoor g) {
        this.garageDoor = g;
    }

    @Override
    public void execute() {
        this.garageDoor.down();
    }

    @Override
    public void undo() {
        this.garageDoor.up();
    }

}
