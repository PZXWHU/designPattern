package com.pzx.command.command;

import com.pzx.command.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void executor() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
