package com.cdl.headfirst.commandexample.command;

import com.cdl.headfirst.commandexample.invoker.CeilingFan;
import com.cdl.headfirst.commandexample.invoker.SpeedEnum;

public class CeilingFanMediumCommand implements Command{

    private CeilingFan ceilingFan;
    private int localtionSpeed = 0;

    public CeilingFanMediumCommand(CeilingFan c) {
        this.ceilingFan = c;
    }

    @Override
    public void execute() {
        this.localtionSpeed = ceilingFan.getSpeed();
        this.ceilingFan.mediumSpeed();
    }

    @Override
    public void undo() {
        if (localtionSpeed == SpeedEnum.LOW.getValue()) {
            this.ceilingFan.lowSpeed();
        } else if (localtionSpeed == SpeedEnum.MEDIUM.getValue()) {
            this.ceilingFan.mediumSpeed();
        } else if (localtionSpeed == SpeedEnum.HIGHT.getValue()) {
            this.ceilingFan.hightSpeed();
        }
    }

}
