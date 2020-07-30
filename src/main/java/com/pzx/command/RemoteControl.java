package com.pzx.command;

import com.pzx.command.command.Command;
import com.pzx.command.command.NoCommand;

/**
 * 调用者
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand; //撤销命令并不是一个具体的命令，而是对于每个命令都有一个撤销的功能，所以需要记录上一个使用的命令，执行其的撤销方法即可。

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot){
        onCommands[slot].executor();
        undoCommand = onCommands[slot];
    }

    public void offButtonPressed(int slot){
        offCommands[slot].executor();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPressed(){
        undoCommand.undo();
    }


}
