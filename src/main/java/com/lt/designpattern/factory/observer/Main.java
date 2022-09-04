package com.lt.designpattern.factory.observer;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/4 14:22
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new CharObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
