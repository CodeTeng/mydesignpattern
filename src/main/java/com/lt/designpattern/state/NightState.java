package com.lt.designpattern.state;

/**
 * @description: 晚上状态的类
 * @author: ~Teng~
 * @date: 2022/9/8 16:15
 */
public class NightState implements State {
    @Override
    public void doClock(Context context, int hour) {
        context.changeState();
        System.out.println("设置晚上的时间");
    }

    @Override
    public void doUser(Context context) {
        context.recordingLog();
        System.out.println("在晚上使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter();
        System.out.println("在晚上按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter();
        System.out.println("在晚上使用电话");
    }
}
