package com.cdl.headfirst.commandexample.command;

import com.cdl.headfirst.commandexample.invoker.GarageDoor;

public class GarageDoorUpCommand implements Command{

    private GarageDoor garageDoor;

    public GarageDoorUpCommand (GarageDoor g) {
        this.garageDoor = g;
    }

    @Override
    public void execute() {
        this.garageDoor.up();
    }

    @Override
    public void undo() {
        this.garageDoor.down();
    }

}
