package com.lt.designpattern.bridge;

/**
 * @description: 改善后的抽象化
 * @author: ~Teng~
 * @date: 2022/9/1 16:39
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl display) {
        super(display);
    }

    public void multiPrint(int times) {
        super.open();
        for (int i = 0; i < times; i++) {
            super.print();
        }
        super.close();
    }
}
