package com.lt.designpattern.decorator;

/**
 * @description: 装饰边框的抽象类---装饰物
 * @author: ~Teng~
 * @date: 2022/9/4 0:40
 */
public abstract class Border extends Display {
    /**
     * 被装饰物
     */
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
