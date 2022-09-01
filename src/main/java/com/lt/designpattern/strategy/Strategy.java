package com.lt.designpattern.strategy;

/**
 * @description: 策略
 * @author: ~Teng~
 * @date: 2022/9/1 17:33
 */
public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
