package com.lt.designpattern.single;

/**
 * @description: 静态内部类实现单例
 * @author: ~Teng~
 * @date: 2022/8/31 22:34
 */
public class Holder {

    private Holder() {
    }

    public static Holder getInstance() {
        return InnerClass.HOLDER;
    }

    public static class InnerClass {
        private static final Holder HOLDER = new Holder();
    }
}
