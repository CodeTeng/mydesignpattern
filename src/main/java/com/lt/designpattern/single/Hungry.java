package com.lt.designpattern.single;

/**
 * @description: 饿汉式单例
 * @author: ~Teng~
 * @date: 2022/8/31 22:20
 */
public class Hungry {


    /**
     * 饿汉式是一上来就加载全部的资源，会造成资源浪费，占用内存空间
     */
    private byte[] byte1 = new byte[1024 * 1024];
    private byte[] byte2 = new byte[1024 * 1024];
    private byte[] byte3 = new byte[1024 * 1024];
    private byte[] byte4 = new byte[1024 * 1024];
    private static final Hungry HUNGRY = new Hungry();

    private Hungry() {
    }

    public static Hungry getInstance() {
        return HUNGRY;
    }

}
