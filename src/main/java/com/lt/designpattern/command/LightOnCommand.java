package com.lt.designpattern.command;

/**
 * @description: 电灯打开的命令
 * @author: ~Teng~
 * @date: 2022/9/8 17:05
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
