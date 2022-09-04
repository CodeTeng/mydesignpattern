package com.lt.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/9/4 16:43
 */
public class Memento {
    /**
     * 所持金钱
     */
    int money;

    /**
     * 获得的水果
     */
    ArrayList fruits;

    public int getMoney() {
        //获取当前所持金钱（narrow interface)
        return money;
    }

    public Memento(int money) {
        //构造函数（wide interface)
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit) {
        // 添加水果（wide interface)
        fruits.add(fruit);
    }

    List getFruits() {
        // 获取当前所持所有水果（wide interface)
        return (List) fruits.clone();
    }
}
