package com.lt.designpattern.command;

/**
 * @description: 定义一个命令，可以干一系列的事情
 * @author: ~Teng~
 * @date: 2022/9/8 17:08
 */
public class QuickCommand implements Command {
    private Command[] commands;

    public QuickCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

}
