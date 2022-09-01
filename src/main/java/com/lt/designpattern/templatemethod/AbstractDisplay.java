package com.lt.designpattern.templatemethod;

/**
 * @description: 抽象类---实现模板方法
 * @author: ~Teng~
 * @date: 2022/9/1 12:52
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    /**
     * 模板方法---要在该类中实现模板方法---定义为final表示不允许重写
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
