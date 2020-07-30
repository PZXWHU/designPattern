package com.pzx.command.command;

import com.pzx.command.Stereo;

public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void executor() {
        //stereo打开分为三步
        stereo.on();
        stereo.setCD();
        stereo.setVolume();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
