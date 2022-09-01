package com.lt.designpattern.strategy;

/**
 * @description: 模拟石头、剪刀、布
 * @author: ~Teng~
 * @date: 2022/9/1 17:24
 */
public class Hand {
    // 石头
    public static final int HANDVALUE_GUU = 0;

    // 剪刀
    public static final int HANDVALUE_CHO = 1;

    // 布
    public static final int HANDVALUE_PAA = 2;

    public static final Hand[] hand = {new Hand(HANDVALUE_GUU), new Hand(HANDVALUE_CHO), new Hand(HANDVALUE_PAA)};

    private static final String[] name = {"石头", "剪刀", "布"};

    /**
     * 猜拳中出的手势的值
     */
    private int handValue;

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name[handValue];
    }
}
