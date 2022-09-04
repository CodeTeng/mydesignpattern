package com.lt.designpattern.factory.observer;

/**
 * @description: 以字符形式显示观察到的数字---具体的观察者
 * @author: ~Teng~
 * @date: 2022/9/4 14:20
 */
public class CharObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        int integer = generator.getNumber();
        System.out.println("CharObserver:" + (char) integer);
    }
}
