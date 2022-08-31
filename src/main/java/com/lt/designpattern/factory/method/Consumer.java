package com.lt.designpattern.factory.method;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/8/31 23:52
 */
public class Consumer {
    public static void main(String[] args) {
        Car car1 = new WuLingFactory().getCar();
        Car car2 = new TeslaFactory().getCar();
        Car car3 = new MoBaiFactory().getCar();
        car1.name();
        car2.name();
        car3.name();
    }
}
