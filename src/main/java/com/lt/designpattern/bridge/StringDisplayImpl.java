package com.lt.designpattern.bridge;

/**
 * @description: 具体实现者
 * @author: ~Teng~
 * @date: 2022/9/1 16:36
 */
public class StringDisplayImpl extends DisplayImpl {
    @Override
    public void rawOpen() {
        System.out.println("字符串显示前");
    }

    @Override
    public void rawPrint() {
        System.out.println("字符串显示中");
    }

    @Override
    public void rawClose() {
        System.out.println("字符串显示后");
    }
}
