package com.cdl.headfirst.commandexample.remote;

import com.cdl.headfirst.commandexample.command.Command;
import com.cdl.headfirst.commandexample.command.NoCommand;

public class RemoteControl {

    private Command[] onCommand;
    private Command[] offCommand;
    private Command undoCommand;//记录当前命令

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        for (int i=0; i<onCommand.length; i++) {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    //给遥控器按钮赋予命令
    public void setCommand(int num, Command onCommand, Command offCommand) {
        this.onCommand[num] = onCommand;
        this.offCommand[num] = offCommand;
    }

    //执行开启命令
    public void clickOnButton(int num) {
        this.onCommand[num].execute();
        this.undoCommand = this.onCommand[num];
    }

    //执行关闭命令
    public void clickOffButton(int num) {
        this.offCommand[num].execute();
        this.undoCommand = this.offCommand[num];
    }

    //执行撤销命令
    public void clickUndo() {
        this.undoCommand.undo();
    }

}
