package com.lt.designpattern.state;

/**
 * @description: 白天状态的类
 * @author: ~Teng~
 * @date: 2022/9/8 16:14
 */
public class DayState implements State {
    @Override
    public void doClock(Context context, int hour) {
        context.changeState();
        System.out.println("设置白天的时间");
    }

    @Override
    public void doUser(Context context) {
        context.recordingLog();
        System.out.println("在白天使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter();
        System.out.println("在白天按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter();
        System.out.println("在白天使用电话");
    }
}
