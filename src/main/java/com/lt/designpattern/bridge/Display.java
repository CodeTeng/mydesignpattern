package com.lt.designpattern.bridge;

/**
 * @description: 抽象化---类的功能层次结构的最上层
 * @author: ~Teng~
 * @date: 2022/9/1 16:37
 */
public class Display {

    /**
     * 利用聚合 桥接的精髓
     */
    private DisplayImpl display;

    public Display(DisplayImpl display) {
        this.display = display;
    }

    public void open() {
        display.rawOpen();
    }

    public void print() {
        display.rawPrint();
    }

    public void close() {
        display.rawClose();
    }

}
