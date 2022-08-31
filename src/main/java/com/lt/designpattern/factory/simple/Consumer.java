package com.lt.designpattern.factory.simple;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/8/31 23:38
 */
public class Consumer {
    public static void main(String[] args) {
        // 接口 所有的实现类 工厂
        // 传统方式
        Car car1 = new WuLing();
        Car car2 = new Tesla();
        car1.name();
        car2.name();

        System.out.println("=========================");
        // 使用工厂创建
        Car car3 = CarFactory.getCar("五菱");
        Car car4 = CarFactory.getCar("特斯拉");
        car3.name();
        car4.name();
    }
}
