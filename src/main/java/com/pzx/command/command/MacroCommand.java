package com.pzx.command.command;

import sun.plugin.com.event.COMEventHandler;

/**
 * 宏命令：可以动态组合多个命令，同时执行或者返回
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void executor() {
        for(Command command : commands)
            command.executor();
    }

    @Override
    public void undo() {
        for(Command command : commands)
            command.undo();
    }
}
