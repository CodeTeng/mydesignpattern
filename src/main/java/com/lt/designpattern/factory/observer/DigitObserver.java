package com.lt.designpattern.factory.observer;

/**
 * @description: 以数字形式显示观察到的数字---具体的观察者
 * @author: ~Teng~
 * @date: 2022/9/4 14:18
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
    }
}
