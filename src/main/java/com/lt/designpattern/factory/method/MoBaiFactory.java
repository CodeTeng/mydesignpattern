package com.lt.designpattern.factory.method;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/8/31 23:53
 */
public class MoBaiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new MoBai();
    }
}
