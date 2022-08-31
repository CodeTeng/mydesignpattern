package com.lt.designpattern.factory.abstract1;

/**
 * @description: 小米手机实现
 * @author: ~Teng~
 * @date: 2022/9/1 0:20
 */
public class XiaoMiIPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("小米手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米手机关机");
    }

    @Override
    public void callup() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机发短信");
    }
}
