package com.lt.designpattern.factory.abstract1;

/**
 * @description: 华为手机实现
 * @author: ~Teng~
 * @date: 2022/9/1 0:21
 */
public class HuaWeiIPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("华为手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为手机关机");
    }

    @Override
    public void callup() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为手机发短信");
    }
}
