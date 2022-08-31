package com.lt.designpattern.factory.simple;

/**
 * @description: 车工厂
 * @author: ~Teng~
 * @date: 2022/8/31 23:39
 */
public class CarFactory {
    /**
     * 方法一 不满足开闭原则   简单工厂---静态工厂   增加一个新的产品，如果你不修改代码 做不到！
     */
    public static Car getCar(String car) {
        if ("五菱".equals(car)) {
            return new WuLing();
        } else if ("特斯拉".equals(car)) {
            return new Tesla();
        } else {
            return null;
        }
    }

    /**
     * 方法二   也是同方法一的
     */
    public static WuLing getWuLing() {
        return new WuLing();
    }
    public static Tesla getTesla() {
        return new Tesla();
    }
}
