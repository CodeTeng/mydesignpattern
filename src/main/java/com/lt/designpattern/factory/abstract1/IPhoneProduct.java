package com.lt.designpattern.factory.abstract1;

/**
 * @description: 手机产品接口
 * @author: ~Teng~
 * @date: 2022/9/1 0:08
 */
public interface IPhoneProduct {
    void start();

    void shutdown();

    void callup();

    void sendSMS();
}
