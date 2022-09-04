package com.lt.designpattern.factory.observer;

import java.util.Random;

/**
 * @description: 生成随机数---具体的观察对象
 * @author: ~Teng~
 * @date: 2022/9/4 14:17
 */
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();

    private int number;

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            // 发送通知
            notifyObservers();
        }
    }
}
