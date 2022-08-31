package com.lt.designpattern.factory.method;

/**
 * @description:
 * @author: ~Teng~
 * @date: 2022/8/31 23:51
 */
public class TeslaFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
