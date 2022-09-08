package com.lt.designpattern.command;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/8 17:07
 */
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        ControlPanel controlPanel = new ControlPanel();
        // 为每个按钮设置功能
        controlPanel.setCommand(0, new LightOnCommand(light));
        controlPanel.setCommand(1, new LightOffCommand(light));

        // 模拟点击
        controlPanel.keyPressed(0);
        controlPanel.keyPressed(1);
    }
}
