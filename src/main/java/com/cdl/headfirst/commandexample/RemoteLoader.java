package com.cdl.headfirst.commandexample;

import com.cdl.headfirst.commandexample.command.*;
import com.cdl.headfirst.commandexample.invoker.CeilingFan;
import com.cdl.headfirst.commandexample.invoker.GarageDoor;
import com.cdl.headfirst.commandexample.invoker.Light;
import com.cdl.headfirst.commandexample.invoker.StereoCD;
import com.cdl.headfirst.commandexample.remote.RemoteControl;

public class RemoteLoader {

    public static void main(String[] args) {
        // 创建方法调用者对象
        Light light = new Light();//灯
        GarageDoor garageDoor = new GarageDoor();//车库门
        StereoCD stereoCd = new StereoCD();//立体CD
        CeilingFan ceilingFan = new CeilingFan();//吊扇

        // 创建命令对象
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereoCd);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereoCd);
        CeilingFanHightCommand ceilingFanHightCommand = new CeilingFanHightCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        Command[] arrayOnCommands = {lightOnCommand, garageDoorUpCommand, stereoOnCommand};
        Command[] arrayOffCommands = {lightOffCommand, garageDoorDownCommand, stereoOffCommand};
        MacroCommand macroOnCommand = new MacroCommand(arrayOnCommands);
        MacroCommand macroOffCommand = new MacroCommand(arrayOffCommands);


        // 设置遥控器按钮
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, garageDoorUpCommand, garageDoorDownCommand);
        remoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);
        remoteControl.setCommand(3, ceilingFanHightCommand, ceilingFanOffCommand);
        remoteControl.setCommand(4, macroOnCommand, macroOffCommand);// 设置宏命令按钮

        // 测试遥控器
        remoteControl.clickOnButton(3);
        remoteControl.clickOffButton(3);
        remoteControl.clickUndo();
        System.out.println("-------------------------------------");
        remoteControl.clickOnButton(4);
        remoteControl.clickOffButton(4);


    }

}
