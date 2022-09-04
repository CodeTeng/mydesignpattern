package com.lt.designpattern.factory.observer;

import java.util.ArrayList;

/**
 * @description: 生成数值的抽象类---观察对象
 * @author: ~Teng~
 * @date: 2022/9/4 14:13
 */
public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 向Observers发通知
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    /**
     * 获取数值
     */
    public abstract int getNumber();

    /**
     * 生成数值
     */
    public abstract void execute();
}
