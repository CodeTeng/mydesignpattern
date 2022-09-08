package com.lt.designpattern.state;

/**
 * @description: 状态模式
 * @author: ~Teng~
 * @date: 2022/9/8 15:31
 */
public class Main {
    public static void main(String[] args) {
        Context context = new SafeFrame();
        DayState dayState = new DayState();
        NightState nightState = new NightState();
        dayState.doAlarm(context);
        nightState.doAlarm(context);
    }
}
