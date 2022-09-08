package com.lt.designpattern.state;

/**
 * @description: 实际的管理
 * @author: ~Teng~
 * @date: 2022/9/8 16:16
 */
public class SafeFrame implements Context {
    @Override
    public void setClock() {
        System.out.println("设置时间");
    }

    @Override
    public void changeState() {
        System.out.println("改变状态");
    }

    @Override
    public void callSecurityCenter() {
        System.out.println("联系警报中心");
    }

    @Override
    public void recordingLog() {
        System.out.println("在警报中心留下记录");
    }
}
