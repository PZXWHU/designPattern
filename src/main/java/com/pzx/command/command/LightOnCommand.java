package com.pzx.command.command;

import com.pzx.command.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void executor() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
