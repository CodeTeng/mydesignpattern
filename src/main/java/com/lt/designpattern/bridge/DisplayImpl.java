package com.lt.designpattern.bridge;

/**
 * @description: 实现者---类的实现结构的最上层
 * @author: ~Teng~
 * @date: 2022/9/1 16:35
 */
public abstract class DisplayImpl {
    public abstract void rawOpen();

    public abstract void rawPrint();

    public abstract void rawClose();
}
