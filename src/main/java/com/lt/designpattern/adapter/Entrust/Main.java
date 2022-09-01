package com.lt.designpattern.adapter.Entrust;

/**
 * @description: 委托模式下的请求
 * @author: ~Teng~
 * @date: 2022/7/19 23:19
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBannerAdapter("hello");
        print.printWeak();
        print.printStrong();
    }
}
