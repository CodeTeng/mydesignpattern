package com.lt.designpattern.command;

/**
 * @description: 关闭电灯的命令
 * @author: ~Teng~
 * @date: 2022/9/8 17:04
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
