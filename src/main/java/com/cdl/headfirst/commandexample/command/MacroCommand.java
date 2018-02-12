package com.cdl.headfirst.commandexample.command;

public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] cs) {
        this.commands = cs;
    }

    @Override
    public void execute() {
        for (int i=0; i<this.commands.length; i++) {
            this.commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i=0; i<this.commands.length; i++) {
            this.commands[i].undo();
        }
    }

}
